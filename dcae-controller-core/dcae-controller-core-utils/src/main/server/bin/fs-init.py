#!/usr/bin/env python

# fs-init.py - initialize ephemeral/cinder volumes and filesystems in new VM

import datetime
import yaml
import subprocess
import os
import sys
import math
import re
import time
from stat import *

Debug = True
DryRun = False
MatchCinderUuid = False
YamlFile = "dcae-mount.conf"
CloudInitLog = "/var/log/cloud-init.log"

def update_fstab(bdev, mount, opts="defaults", fstype="auto"):
    ff = open("/etc/fstab", 'r')
    off = open("/tmp/fstab.tmp", 'w+')

    for line in ff:
        if(len(line)<=1):
            off.write(line)
            continue
        F = line.split();    
        if( F[0] != bdev ):
            off.write(line)
    entry="\t"
    off.write(entry.join([bdev,mount,fstype,opts,"0","2"])+"\n")
    ff.close()
    off.close()
    subprocess.call(["cp","/tmp/fstab.tmp","/etc/fstab"]);
        
print "Start at:", datetime.datetime.now()

if( os.geteuid() != 0 ):
    sys.exit("Error: Must run as root.");

if( not os.path.isfile( YamlFile ) ):
    sys.exit("Error: config not found: %s" % YamlFile)

with open(YamlFile, 'r') as stream:
    try:
	pinfo = yaml.load(stream)
    except yaml.YAMLError as exc:
        print(exc)

        # This was for parsing from the VM YAML file
    #print "Parsing volume info for %s (%s)" % (doc["short-name"], doc["description"])
    
    # Prune to only partition info fragment
    #pinfo = doc["openstack-vm-type"]["disk-partitions"]
    
    # Check OS
    oss = pinfo["osType"].lower()
    if( os.path.isfile('/etc/lsb-release') ):
        osrel = subprocess.check_output(['grep', 'DISTRIB_ID', '/etc/lsb-release']).lower().rstrip()
    if( os.path.isfile('/etc/redhat-release') ): 
        osrel = subprocess.check_output(['grep', 'release', '/etc/redhat-release']).lower().rstrip()
    v = osrel.find(oss)
    if( v >= 0 ):
        print "osType is ok (%s)" % (oss)
    else:
        print "osType unmatched or unrecognized: %s != %s" % (oss, osrel)
        sys.exit("Error: OS not supported")
        
    # Enumerate work
    vol = pinfo["volumes"]
    for name in vol.keys():
        eph = 'ephemeral' if vol[name]["uuid"] == "ephemeral" else 'cinder'
        print "\tVolume %s size %s type %s" % (name, vol[name]["size"], eph)
        if( eph == "ephemeral" ):
            ephvol = name

    # Parse ephemeral from cloud-init log
    if( not os.access(CloudInitLog, os.R_OK) ):
        sys.exit("Error: Cannot open cloud-init.log")

    ephem_found = False
    with open(CloudInitLog, 'r') as fh:
        for line in iter(fh):
            if( re.search('apped ephemeral.*device',line) != None ):
                dev_ephem=line.split(' ')[-1].strip('\n')
                ephem_found = True
    fh.close()

    if( not ephem_found ):
        sys.exit("Error: ephemeral device not found in cloud-init.log");
        
    # Read block device info
    dev_config=dev_root=cinder_dev=""
    out, err = subprocess.Popen(["lsblk","--pairs","--bytes","--output","name,type,size,label,uuid"], stdout=subprocess.PIPE).communicate()
    for line in out.splitlines(): 
        dev_name=dev_size=dev_lab=dev_uuid=""
        for pair in line.split(' '):
            if( pair.split('=')[0].startswith('NAME') ):
                dev_name="/dev/"+pair.split('=')[1].translate(None, '"')
            elif( pair.split('=')[0].startswith('TYPE') ):
                dev_type=pair.split('=')[1].translate(None, '"')
            elif( pair.split('=')[0].startswith('SIZE') ):
                dev_size=pair.split('=')[1].translate(None, '"')
            elif( pair.split('=')[0].startswith('LABEL') ):
                dev_lab=pair.split('=')[1].translate(None, '"')
            elif( pair.split('=')[0].startswith('UUID') ):
                dev_uuid=pair.split('=')[1].translate(None, '"')
        if( Debug ):
            print "%s: name %s size %s label %s uuid %s" % (dev_type,dev_name,dev_size,dev_lab,dev_uuid)
        if( dev_lab.startswith('config') ):
            dev_config = dev_name
        elif( dev_lab.find('root') >= 0 ):
            dev_root = dev_name.translate(None, '0123456789')
        else:
            if( not dev_name.startswith(dev_ephem) ):
                if( dev_type == "disk" ):
                    cinder_dev=dev_name
                    cinder_size=dev_size

    print "\tRoot: %s" % ( dev_root )
    print "\tConfig: %s" % ( dev_config )
    print "\tEphemeral: %s" % ( dev_ephem )
    print "\tCinder: %s" % ( cinder_dev )

    # Handle ephemeral already mounted
    if( not os.access("/etc/fstab", os.R_OK) ):
        sys.exit("Error: Cannot open fstab")

    with open("/etc/fstab", 'r') as fh:
        for line in iter(fh):
            if( line.startswith(dev_ephem) ):
                print "Mount point for ephem found:"
                print line
                # Use specific partition created, which may differ from base device
                dev_ephem=line.split()[0]
                ephem_mounted = True
                mp_ephem=line.split()[1]
                print "Using ephem mount: \"%s\"" % ( dev_ephem )
    fh.close()
    
    # Handle ephemeral
    if 'ephvol' in locals() and not DryRun:
        print "Processing ephemeral volume \"%s\"" % ephvol
        if( ephem_mounted == True ):
            if( os.path.ismount(mp_ephem) ):
                print "\tAlready mounted, recreating..."
                if( subprocess.call(["umount",dev_ephem]) != 0 ):
                    sys.exit("Error unmounting ephemeral on "+dev_ephem)
        # Create and mount fs
        mode = os.stat(dev_ephem).st_mode
        if( not S_ISBLK(mode) ):
            sys.exit("Error: not a block device: %s" % ephem_device)
        for k in vol[ephvol]['filesystems'].keys():
            # Wipe existing partition
            if( oss == "ubuntu" ):
                rv = subprocess.call(["sgdisk","--zap-all",dev_ephem])
                if( rv != 0 ):
                    print "Error: sgdisk for %s returned %d" % (dev_ephem,rv)
            # Recreate fs
            ftype=vol[ephvol]['filesystems'][k]['type']
            print "mkfs -t "+ftype+" "+dev_ephem
            rv = subprocess.call(["mkfs","-t",ftype,dev_ephem])
            if( rv != 0 ):
                print "Error: mkfs for %s returned %d" % (dev_ephem,rv)
            print "Mount %s on %s" % (k, dev_ephem)
            if( not os.path.isdir(k) ): 
                os.makedirs(k,0755)
            if( subprocess.call(["mount",dev_ephem,k]) != 0 ):
                sys.exit("Error mounting ephemeral on "+k)
            update_fstab(dev_ephem,k)
    else:
        if( not DryRun ):
            print "No ephemeral disk defined."

    # Handle cinder volume(s)
    if( not 'cinder_dev' in locals() ):
        sys.exit("Error: cinder volume not found")

    for name in vol.keys():
        uuid=vol[name]["uuid"]
        if( uuid != "ephemeral" ):
            uuid=uuid[:20] # virtio_blk only passes 20 bytes of uuid
            sz=vol[name]["size"]
            print "Volume %s specified size %s device %s" % (name,sz,cinder_dev)
            fs=vol[name]['filesystems']
            if( Debug ): print fs
            fssize=0
            for f in fs.keys():
                fssize+=int(fs[f]["size"])

            # Check volume label
            sp = subprocess.Popen(["parted","--machine",cinder_dev,"unit","s","p"], stderr=subprocess.PIPE, stdout=subprocess.PIPE)
            out, err = sp.communicate()
            if( sp.returncode >= 0 ):
                # No disk label, must label first
                if not DryRun:
                    rv=subprocess.call(["parted","--script",cinder_dev,"mklabel","gpt"]);
                    if( rv != 0 ):
                        print "Warning: attempt to GPT label %s failed." % (cinder_dev)
                    else:
                        print "Added GPT label on %s." % (cinder_dev)
                else:
                    print "Would add GPT label on %s" % (cinder_dev)
                    sys.exit("Dryrun complete.")

            # Get device info
            cinder_sectorsize=cinder_startsector=cinder_endsector=cinder_totalsector=-1
            out, err = subprocess.Popen(["parted","--machine",cinder_dev,"unit","s","p","free"], stdout=subprocess.PIPE).communicate()
            for line in out.splitlines(): 
                if( line.find(cinder_dev) >= 0 ):
                    cinder_sectorsize=int(line.split(':')[3])
                elif( line.find('free;') >= 0 ):
                    cinder_startsector=int(line.split(':')[1].strip('s'))
                    cinder_endsector=int(line.split(':')[2].strip('s'))
                    cinder_totalsector=int(line.split(':')[3].strip('s'))
            if( Debug ):
                print "Sector size: %d, start: %d, end: %d" % (cinder_sectorsize,cinder_startsector,cinder_endsector)

            # Size checks
            asz=int(cinder_size)/1024**3
            if( asz != sz ):
                print "Warning: actual size of volume (%d) does not match requested volume size (%s)" % (asz,sz)
            if( fssize > asz ):
                print "Warning: total filesystem size (%d) exceeds actual total size (%d)" % (fssize,asz)
                print "Using proportional allocation:"
                for f in fs.keys():
                    fs[f]["size"] = str( int(math.floor(float(asz)*(float(fs[f]["size"])/float(fssize)))))
                    # fs[f]["size"] = max (fs[f]["size"],1)
                    fs[f]["size"] = str(max(int(fs[f]["size"]), 1))
                    
                    print "\t%s gets %sGB of %sGB" % (f,fs[f]["size"],asz)

            # Ensure not partitioned already
            redeploy=False
            cinder_partitioned = False
            with open("/proc/partitions", 'r') as pf:
                for line in pf:
                    if( len(line) > 1 ):
                        rpg=re.compile(cinder_dev.lstrip("/dev/")+'[0-9]')
                        if( rpg.search(line) != None ):
                        #if( "/dev/"+line.split()[-1] == cinder_dev+"1" ):
                            print "Warning: cinder dev %s already partitioned" % (cinder_dev)
                            cinder_partitioned = True
                        else:
                            print "String \"%s\" not found in \"%s\"" % (rpg.pattern, line)

            if( not cinder_partitioned ):

                # Generate partition info for parted (using sectors)
                pfile = open("parted.cmd", "w+")
                pfile.write("parted --script "+cinder_dev+" \\\n")
                pfile.write("\tunit s \\\n");
                start=int(cinder_startsector)
                for f in fs.keys():
                    end=start+(int(fs[f]["size"])*(1024**3/cinder_sectorsize))
                    if( end > cinder_endsector ):
                        end=cinder_endsector
                    pfile.write("\tmkpart primary "+fs[f]["type"]+" "+str(start)+"s "+str(end)+"s \\\n")
                    start=end+1
                pfile.write("\talign-check min 1 \\\n")
                pfile.write("\tprint\n")
                pfile.close()
                os.chmod("parted.cmd", 0755)            

                # Run partition
                print "Running partitioning script..."
                rv = subprocess.call(["./parted.cmd"],shell=True)
                if( rv != 0 ):
                    print "Error: parted for %s failed" % cinder_dev
                    
            else:
                redeploy=True
                print "Warning: cinder device %s already partitioned, skipping partitioning." % cinder_dev

            # Force kernel to re-read partition info on older Ubuntu
            rv = subprocess.call(["parted","--machine",cinder_dev,"unit","s","p"])
            time.sleep(1)

            # Create/Mount filesystems
            offset=1
            for f in fs.keys():
                if( not redeploy ): # preserve fs if a redeploy
                    print "mkfs -t "+fs[f]["type"]+" "+cinder_dev+str(offset)
                    rv = subprocess.call(["mkfs","-F","-t",fs[f]["type"],cinder_dev+str(offset)])
                    if( rv != 0 ):
                        print "Error: mkfs for %s returned %d" % (cinder_dev+str(offset),rv)
                if( not os.path.isdir(f) ): 
                    os.makedirs(f,0755)
                print "mount -t "+fs[f]["type"]+" "+cinder_dev+str(offset)+" "+f
                rvm = subprocess.call(["mount","-t",fs[f]["type"],cinder_dev+str(offset),f])
                if( rvm != 0):
                    print "Error: mount for %s on %s failed" % (f,cinder_dev+str(offset))
                update_fstab(cinder_dev+str(offset),f)
                print "Added mount \"%s\" to fstab." % f
                offset=offset+1


    if( Debug): print "\nWhole subtree is:\n%s" % pinfo
