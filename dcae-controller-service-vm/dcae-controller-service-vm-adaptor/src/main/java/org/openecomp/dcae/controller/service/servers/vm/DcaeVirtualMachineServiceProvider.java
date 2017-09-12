
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */


package org.openecomp.dcae.controller.service.servers.vm;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jetty.util.B64Code;
import org.json.JSONObject;
import org.openecomp.dcae.controller.core.server.DcaeBasicServer;
import org.openecomp.dcae.controller.core.server.DcaeBasicServerNetwork;
import org.openecomp.dcae.controller.core.service.DcaeLocation;
import org.openecomp.dcae.controller.core.service.HealthTestResponse;
import org.openecomp.dcae.controller.core.service.HealthTestStatus;
import org.openecomp.dcae.controller.core.service.ServiceFactory;
import org.openecomp.dcae.controller.core.stream.DcaeStream;
import org.openecomp.dcae.controller.core.stream.DmaapStream;
import org.openecomp.dcae.controller.service.servers.vmmanager.DcaeVirtualMachineManagerConsole;
import org.openecomp.dcae.controller.service.vm.InstallationStep;
import org.openecomp.dcae.controller.service.vm.PhysicalMachine;
import org.openecomp.dcae.controller.service.vm.VirtualMachineService;
import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceConfiguration;
import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance;
import org.openecomp.dcae.controller.service.vm.VmFactory;
import org.openecomp.ncomp.core.DeploymentStatus;
import org.openecomp.ncomp.core.User;
import org.openecomp.ncomp.openstack.compute.Address;
import org.openecomp.ncomp.openstack.compute.Addresses;
import org.openecomp.ncomp.openstack.compute.ComputeFactory;
import org.openecomp.ncomp.openstack.compute.OpenstackRequestNewServer;
import org.openecomp.ncomp.openstack.compute.Server;
import org.openecomp.ncomp.openstack.location.OpenStackLocation;
import org.openecomp.ncomp.openstack.location.OpenStackProject;
import org.openecomp.ncomp.openstack.neutron.CreatePortRequest;
import org.openecomp.ncomp.openstack.neutron.FixedIp;
import org.openecomp.ncomp.openstack.neutron.Network;
import org.openecomp.ncomp.openstack.neutron.NeutronFactory;
import org.openecomp.ncomp.openstack.neutron.NeutronFloatingIp;
import org.openecomp.ncomp.openstack.neutron.Port;
import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.BasicAdaptorProvider;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.JavaHttpClient;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.ManagementServerUtils;
import org.openecomp.ncomp.sirius.manager.Subject;
import org.openecomp.ncomp.sirius.manager.console.Utils;
import org.openecomp.ncomp.sirius.manager.metrics.MetricStore;
import org.openecomp.ncomp.sirius.manager.server.Response;
import org.openecomp.ncomp.sirius.manager.server.ResponseStatus;
import org.openecomp.ncomp.sirius.manager.server.ServerFactory;
import org.openecomp.ncomp.utils.CryptoUtils;
import org.openecomp.ncomp.utils.StringUtil;
import org.yaml.snakeyaml.Yaml;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DcaeVirtualMachineServiceProvider extends BasicAdaptorProvider {
    private static final Logger logger = Logger.getLogger(DcaeVirtualMachineServiceProvider.class);
    VirtualMachineService o;
    private String privateKey = CryptoUtils.getKey("config/server.private");

    public DcaeVirtualMachineServiceProvider(ISiriusServer controller, VirtualMachineService o) {
        super(controller, o);
        this.o = o;
    }

    public void deploy(String instanceName, String containerPath) {
        System.err.println("XXX deploy server: " + instanceName + " " + containerPath);
        Response res = ServerFactory.eINSTANCE.createResponse();
        VirtualMachineServiceInstance i = findInstance(instanceName);
        if (containerPath != null && !containerPath.equals("")) {
            Subject s = controller.getServer().find(containerPath);
            if (i == null) {
                throw new RuntimeException("Unable to find instance: " + instanceName);
            }
            if (s == null || s.o == null) {
                throw new RuntimeException("Unable to find container object: " + containerPath);
            }
            if (!(s.o instanceof DcaeLocation)) {
                throw new RuntimeException("Unable to deploy to this non location container: " + containerPath);
            }
            i.setLocation((DcaeLocation) s.o);
        }
        DcaeLocation location = i.getLocation();
        if (location == null) {
            throw new RuntimeException("Unable to deploy no location specified: " + ManagementServer.object2ref(i));
        }
        String networkId = null;
        String networkName = location.getOpenstackProject().getPrivateNetwork();
        String subnetId = null;
        for (Network network : location.getOpenstackProject().getNetworks()) {
            if (network.getName().equals(networkName)) {
                networkId = network.getId();
                subnetId = network.getSubnets().get(0);
            }
        }
        if (networkId == null) {
            throw new RuntimeException("Unable to find network: " + networkName);
        }
        HashMap<DcaeBasicServer, Port> portMap = new LinkedHashMap<DcaeBasicServer, Port>();
        OpenStackLocation loc = (OpenStackLocation) location.getOpenstackProject().eContainer();
        for (int j = 0; j < i.getNumberOfServers(); j++) {
            DcaeBasicServer server = i.getServers().get(j);
            if (i.getVmType().isNeedPublicIp() && server.getNetworks().get(0).getIp() == null) {
                throw new RuntimeException("Deployment issue: server not assigned IP: " + server.getName());
            }
            for (Port port : location.getOpenstackProject().getPorts()) {
                if (port.getName().equals(server.getName())) {
                    portMap.put(server, port);
                }
            }
            if (portMap.get(server) == null) {
                CreatePortRequest portReq = NeutronFactory.eINSTANCE.createCreatePortRequest();
                portReq.setName(server.getName());
                portReq.setProjectName(location.getOpenstackProject().getName());
                portReq.setNetwork_id(networkId);
                // if assigned ip but no public network, assume IP is on private and available
                String ip2 = server.getNetworks().get(0).getIp();
                if (ip2 != null && !loc.isSupportsFloatingIps()) {
                    FixedIp fip = NeutronFactory.eINSTANCE.createFixedIp();
                    fip.setIp_address(ip2);
                    fip.setSubnet_id(subnetId);
                    portReq.getFixed_ips().add(fip);
                }
                // create port in Openstack
                Port port = loc.createPort(portReq);
                portMap.put(server, port);
            }
        }
        for (int j = 0; j < i.getNumberOfServers(); j++) {
            OpenstackRequestNewServer r = ComputeFactory.eINSTANCE.createOpenstackRequestNewServer();
            r.setVmType(EcoreUtil.copy(i.getVmType()));
            r.setName(vmName(i, j));
            r.setProjectName(location.getOpenstackProject().getName());
            if (i.getAvailabilityZone() != null) {
                r.setHypervisor(i.getAvailabilityZone());
            }
            if (i.getUsers().size() > 0) {
                r.setUser(i.getUsers().get(0).getName());
            }
            r.setUser_data(B64Code.encode(userdata(i, j, portMap)));
            DcaeBasicServer server = i.getServers().get(j);
            if (o.getName().equals("vm-controller")) {
                if (server.getServer() != null) {
                    // Existing Controller VM. ignore it
                    continue;
                }
            }
            createServerHook(o, i, server);
            boolean floatingIpDone = false;
            String ip2 = server.getNetworks().get(0).getIp();
            for (NeutronFloatingIp fip : location.getOpenstackProject().getFloatingips()) {
                if (ip2 != null && ip2.equals(fip.getFloating_ip_address())) {
                    if (fip.getFixed_ip_address() != null) {
                        floatingIpDone = true;
                    }
                }
            }
            if (!floatingIpDone && loc.isSupportsFloatingIps()) {
                r.setFloatingIp(ip2);
            } else {
                r.getVmType().setNeedPublicIp(false);
            }
            r.getPorts().add(portMap.get(server).getId());
            if (!loc.isSupportsFloatingIps() && location.getOpenstackProject().getPublicNetwork() != null) {
                // find external network.
                String networkId2 = null;
                String networkName2 = location.getOpenstackProject().getPublicNetwork();
                if (networkName2.matches("........-....-....-....-............")) {
                    networkId2 = networkName2;
                } else {
                    for (Network network : location.getOpenstackProject().getNetworks()) {
                        if (network.getName().equals(networkName)) {
                            networkId2 = network.getId();
                        }
                    }
                }
                if (networkId2 == null) {
                    throw new RuntimeException("Unable to find public network: " + networkName2);
                }
                r.getNetworks().add(networkId2);
            }
            if (i.getOpenstackFlavor() != null) {
                r.getVmType().setFlavorName(i.getOpenstackFlavor());
            }
            System.out.println("loc.isSupportsFloatingIps(): " + loc.isSupportsFloatingIps());
            System.out.println("location.getOpenstackProject().getPublicNetwork(): " + location.getOpenstackProject().getPublicNetwork());
            System.out.println(ManagementServer.ecore2json(r, 100, null, true).toString(2));
            loc.createServer(r);
            logger.info("created server: " + r.getName());
        }
        controller.getServer().save();
        long toolate = System.currentTimeMillis() + i.getDeploymentTimeoutMinutes() * 60 * 1000;
        while (i.getStatus() != DeploymentStatus.DEPLOYED) {
            if (System.currentTimeMillis() > toolate) {
                throw new RuntimeException("Deployment timeout: VM did not show up");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
            }
        }
        if (i.getManagerPortNumber() > 0) {
            while (System.currentTimeMillis() < toolate) {
                try {
                    o.pushManagerConfiguration(instanceName);
                    break;
                } catch (Exception e) {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e1) {
                        throw new RuntimeException("Deployment timeout: Deployment interrupted");
                    }
                }
                if (System.currentTimeMillis() >= toolate) {
                    throw new RuntimeException("Unable to configure VM");
                }
            }
        }
        res.setStatus(ResponseStatus.OK);
        // return res;
    }

    protected void createServerHook(VirtualMachineService o, VirtualMachineServiceInstance i, DcaeBasicServer server) {

    }

    // used for testing only
    static String userdataStatic(VirtualMachineServiceInstance i, int j, HashMap<DcaeBasicServer, Port> portMap) {
        DcaeVirtualMachineServiceProvider pp = new DcaeVirtualMachineServiceProvider(null, null);
        return pp.userdata(i, j, portMap);
    }

    @SuppressWarnings("unchecked")
    protected String userdata(VirtualMachineServiceInstance i, int j, HashMap<DcaeBasicServer, Port> portMap) {
        StringBuffer buf = new StringBuffer();
        HashMap<String, Object> configMap = new HashMap<String, Object>();
        buf.append(userdataInitial());
        String resourceName = "instances/" + i.getService().getName() + "/" + i.getName() + ".yaml";
        String x = null;
        try {
            x = getTemplate(resourceName);
        } catch (Exception e1) {
            buf.append("#### No special configuration resource: " + resourceName);
            buf.append("\n");
        }
        if (x != null) {
            Yaml yaml = new Yaml();
            configMap = (HashMap<String, Object>) yaml.load(x);
            buf.append("#### Using special configuration resource: " + resourceName);
            buf.append("\n");
        }
        DcaeBasicServer s = i.getServers().get(j);
        if (configMap.containsKey("configuration-files")) {
            buf.append(userdataConfig(configMap.get("configuration-files"), s));
        }
        if (configMap.containsKey("init-script")) {
            buf.append(configMap.get("init-script")).append("\n");
        }
        buf.append(userdataHosts(s, portMap));
        buf.append(userdataCertificate(s));
        buf.append(userdataFromFile("CLOUDINIT", i, s)).append("\n");
        for (User u : i.getAdminUsers()) {
            buf.append(userdataSshKey(i.getAdminId(), u.getPublicKey()));
        }
        buf.append(userdataSteps(i, s, portMap)).append("\n");
        for (String id : i.getApplicationIds()) {
            buf.append(userdataSshSetup(id));
            for (User u : i.getUsers()) {
                buf.append(userdataSshKey(id, u.getPublicKey()));
            }
        }
        try {
            buf.append(getTemplate(i.getService().getName() + ".userdata"));
        } catch (Exception e) {
            buf.append("#no final script: " + i.getService().getName() + ".userdata").append("\n");
        }
        if (configMap.containsKey("final-script")) {
            buf.append(configMap.get("final-script")).append("\n");
        }
        buf.append(userdataFinal(i, s));
        System.err.println("USER DATA: " + ManagementServer.object2ref(i) + "\n" + buf);
        return buf.toString();
    }

    private String userdataSteps(VirtualMachineServiceInstance i, DcaeBasicServer s,
                                 HashMap<DcaeBasicServer, Port> portMap) {
        StringBuffer buf = new StringBuffer();
        for (InstallationStep step : i.getSteps()) {
            buf.append("######### ").append(step.getName()).append("\n");
            String str = null, str1 = null;
            try {
                str = getTemplate(step.eClass().getName() + ".userdata");
                JSONObject json = ManagementServer.ecore2json(step, 100, null, true);
                str1 = StringUtil.expandUsingJson(str, json, "%");
                buf.append(str1).append("\n");
            } catch (Exception e) {
                System.err.println("userdataSteps error: str=" + str + " str1=" + str1 + " e=" + e);
                e.printStackTrace();
            }
        }
        return buf.toString();
    }

    protected String userdataConfig(Object o, DcaeBasicServer s) {
        StringBuffer buf = new StringBuffer();
        @SuppressWarnings("unchecked")
        HashMap<String, HashMap<String, String>> m1 = (HashMap<String, HashMap<String, String>>) o;
        for (String k : m1.keySet()) {
            HashMap<String, String> m2 = m1.get(k);
            buf.append("## Adding configuration file: ").append(k).append("\n");
            String decode = "cat";
            if (m2.containsKey("encoding") && "base64".equals(m2.get("encoding"))) {
                decode = "base64 --decode";
            }
            buf.append("cat | ").append(decode).append(" > ").append(m2.get("destination")).append(" << EOF_CONFIG\n");
            String content = m2.get("content");
            if (m2.containsKey("encrypted-password")) {
                String pw = CryptoUtils.decryptPrivate(privateKey, m2.get("encrypted-password"));
                content = CryptoUtils.decrypt(pw, content);
            }
            JSONObject json = new JSONObject();
            String pw = JavaHttpClient.decryptPassword(s.getCertificatePassword());
            json.put("certPassword", pw == null ? "No Certificate" : pw);
            if (content.contains("%{")) {
                System.err.print("CONTENT" + content + " " + json);
            }
            content = StringUtil.expandUsingJson(content, json, "%");
            if (content.contains("%{")) {
                System.err.print("CONTENT 2" + content);
            }
            content = decryptString(content);
            buf.append(content).append("\n");
            buf.append("EOF_CONFIG").append("\n");
            if (m2.containsKey("owner")) {
                buf.append("chown ").append(m2.get("owner")).append(" ").append(m2.get("destination")).append("\n");
            }
        }
        return buf.toString();
    }

    private String decryptString(String content) {
        Pattern p = Pattern.compile("(rsa:[A-Za-z0-9+/]+ *[A-Za-z0-9+/]+ *[A-Za-z0-9+/]+=*)");
        Matcher m = p.matcher(content);
        StringBuffer s = new StringBuffer();
        while (m.find()) {
            String k = m.group(1);
            m.appendReplacement(s, JavaHttpClient.decryptPassword(k));
        }
        m.appendTail(s);
        return s.toString();
    }

    protected String userdataSshSetup(String id) {
        StringBuffer buf = new StringBuffer();
        if (id == null) {
            buf.append("### userdataSshSetup null ID: ").append("\n");
            return buf.toString();
        }
        buf.append("mkdir /home/ID/.ssh\n".replace("ID", id));
        buf.append("chmod og-rwx /home/ID/.ssh\n".replace("ID", id));
        buf.append("chown -R ID:ID /home/ID/.ssh\n".replace("ID", id));
        buf.append("touch /home/ID/.ssh/authorized_keys\n".replace("ID", id));
        buf.append("chmod og-rwx /home/ID/.ssh/authorized_keys\n".replace("ID", id));
        buf.append("chown -R ID:ID /home/ID/.ssh/authorized_keys\n".replace("ID", id));
        return buf.toString();
    }

    protected String userdataSshKey(String id, String publicKey) {
        StringBuffer buf = new StringBuffer();
        if (id == null) {
            return "";
        }
        if (publicKey == null) {
            buf.append("### null key: ").append(id).append("\n");
            return buf.toString();
        }
        buf.append("echo ").append(publicKey.trim()).append(" >> /home/").append(id).append("/.ssh/authorized_keys\n");
        return buf.toString();
    }

    protected Object userdataCertificate(DcaeBasicServer s) {
        StringBuffer buf = new StringBuffer();
        byte[] cert;
        try {
            cert = getTemplateBinary(s.getName() + ".pkcs12");
            // buf.append("### check sum: " +
            // MD5Checksum.createChecksum(cert)).append("\n");
            buf.append("cat > /tmp/certificate.pkcs12.b64code << EOF_CERT").append("\n");
            buf.append(B64Code.encode(cert)).append("\n");
            buf.append("EOF_CERT").append("\n");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            buf.append("## UNABLE TO FIND CERTIFICATE FOR: " + s.getName()).append("\n");
        }
        return buf.toString();
    }

    protected Object userdataCertificatePassword(DcaeBasicServer s) {
        StringBuffer buf = new StringBuffer();
        buf.append("echo ").append(JavaHttpClient.decryptPassword(s.getCertificatePassword()))
                .append(" > /tmp/.password\n");
        return buf.toString();
    }

    protected String userdataHosts(DcaeBasicServer s, HashMap<DcaeBasicServer, Port> portMap) {
        StringBuffer buf = new StringBuffer();
        buf.append("cat >> /etc/hosts << HOSTS_EOF").append("\n");
        for (DcaeBasicServer s1 : portMap.keySet()) {
            for (FixedIp x : portMap.get(s1).getFixed_ips()) {
                buf.append(x.getIp_address() + " " + dnsName(s1) + " " + s1.getName()).append("\n");
            }
        }
        buf.append("HOSTS_EOF").append("\n");
        buf.append("echo ").append(s.getName()).append(" > /etc/hostname\n");
        int index = 0;
        for (DcaeBasicServer s1 : portMap.keySet()) {
            for (FixedIp x : portMap.get(s1).getFixed_ips()) {
                buf.append("IP" + index + "=").append(x.getIp_address()).append("\n");
            }
            index++;
        }
        return buf.toString();
    }

    protected static String getTemplate(String resource) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] data = new byte[65536];
        InputStream is = DcaeVirtualMachineServiceProvider.class.getClassLoader().getResourceAsStream(resource);
        if (is == null) {
            throw new RuntimeException("Unable to find resource: " + resource);
        }
        int i;
        try {
            while ((i = is.read(data)) > 0) {
                baos.write(data, 0, i);
            }
        } catch (Exception e) {
            ManagementServerUtils.printStackTrace(e);
        } finally {
            if (is != null) {
                is.close();
            }
        }
        return (new String(baos.toByteArray()));
    }

    static byte[] getTemplateBinary(String rnm) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] data = new byte[65536];
        InputStream is = DcaeVirtualMachineServiceProvider.class.getClassLoader().getResourceAsStream(rnm);
        int i;
        try {
            while ((i = is.read(data)) > 0) {
                baos.write(data, 0, i);
            }
        } catch (Exception e) {
            ManagementServerUtils.printStackTrace(e);
        } finally {
            if (is != null) {
                is.close();
            }
        }
        return baos.toByteArray();
    }

    protected Object userdataFromFile(String name, VirtualMachineServiceInstance i, DcaeBasicServer s2) {
        try {
            String s = getTemplate(name + ".userdata");
            JSONObject json = new JSONObject();
            DcaeBasicServerNetwork n = s2.getNetworks().get(0);
            String dns = n.getDnsName();
            json.put("dnsDomain", dns.substring(dns.indexOf(".") + 1));
            json.put("admin", i.getIedsAdmin());
            return StringUtil.expandUsingJson(s, json, "%");
        } catch (Exception e) {
            return "#error " + name + ".userdata: " + e;
        }
    }


    protected String userdataInitial() {
        StringBuffer buf = new StringBuffer();
        buf.append("#!/bin/bash").append("\n");
        buf.append("cat > /tmp/dcae_install.sh << EOF_DCAE_INSTALL").append("\n");
        buf.append("#!/bin/bash").append("\n");
        buf.append("set -x").append("\n");
        buf.append("cd /tmp").append("\n");
        return buf.toString();
    }

    protected String userdataFinal(VirtualMachineServiceInstance i, DcaeBasicServer s) {
        StringBuffer buf = new StringBuffer();
        buf.append("EOF_DCAE_INSTALL").append("\n");
        buf.append(userdataCertificatePassword(s));
        buf.append("bash /tmp/dcae_install.sh 2>&1 | tee /tmp/dcae_install.log").append("\n");
        return buf.toString();
    }

    public void undeploy(java.lang.String instanceName) {
        if (o.getName().equals("vm-controller")) {
            throw new RuntimeException("Cannot undeploy vm-controller, please use Horizon");
        }
        VirtualMachineServiceInstance i = findInstance(instanceName);
        for (int j = 0; j < i.getNumberOfServers(); j++) {
            // System.out.println("HHHH: " + i.getServers().get(j).getName());
            if (i.getLocation() == null) {
                continue;
            }
            OpenStackLocation loc = (OpenStackLocation) i.getLocation().getOpenstackProject().eContainer();
            String tname = i.getLocation().getOpenstackProject().getName();
            loc.deleteServer(tname, vmName(i, j));
            // System.out.println("HHHH deleted: " + vmName(i, j));
        }
    }

    protected static String dnsName(DcaeBasicServer s) {
        return s.getNetworks().get(0).getDnsName();
    }

    public void updateDeploymentStatus() {
//		System.out.println("XXXX updateDeploymentStatus: " + o.getName());
        for (VirtualMachineServiceInstance instance : o.getInstances()) {
//			System.out.println("XXXX updateDeploymentStatus: " + o.getName() + " " + instance.getName() + " "
//					+ instance.getServers().size());
            if (instance.getServers().size() == 0) {
                setStatus(instance, DeploymentStatus.UNDEPLOYED, "no servers");
                continue;
            }
            if (instance.getServers().size() != instance.getNumberOfServers()) {
                setStatus(instance, DeploymentStatus.DEPLOYED_ERRORS, "not the right number of servers");
                continue;
            }
            if (instance.getVmType() == null) {
                logger.warn("virtual machine instance without vmType: " + ManagementServer.object2ref(instance));
                setStatus(instance, DeploymentStatus.DEPLOYED_ERRORS, "vm type is null");
                continue;
            }
            boolean allPhysical = true;
            for (int j = 0; j < instance.getNumberOfServers(); j++) {
                DcaeBasicServer s1 = instance.getServers().get(j);
                // check if server is non Openstack managed VM.
                if (s1 instanceof PhysicalMachine) {
                    continue;
                }
                allPhysical = false;
            }
            if (allPhysical) {
                setStatus(instance, DeploymentStatus.DEPLOYED, "all physical");
                continue;
            }
            if (instance.getLocation() == null) {
                setStatus(instance, DeploymentStatus.UNDEPLOYED, "no location");
                continue;
            }
            boolean needPubIp = instance.getVmType().isNeedPublicIp();
            boolean errors = false;
            String incomplete = null;
            int numDeployed = 0;
            for (int j = 0; j < instance.getNumberOfServers(); j++) {
                DcaeBasicServer s1 = instance.getServers().get(j);
                // check if server is non Openstack managed VM.
                if (s1 instanceof PhysicalMachine) {
                    numDeployed++;
                    continue;
                }
                // VirtualMachine vm = (VirtualMachine) s1;
                String n = vmName(instance, j);
                if (!s1.getName().equals(n)) {
                    errors = true;
                }
                Server svr = null;
                String privateip = null;
                String publicip = null;
                s1.setServer(null);
                s1.setPrivateIp(null);
                s1.setPublicIp(null);
                OpenStackProject project = instance.getLocation().getOpenstackProject();
                for (Server s : project.getServers()) {
                    if (n.equals(s.getName())) {
                        svr = s;
                        for (Addresses a : s.getAddresses()) {
//							System.out.println("RRRR: " + o.getName() + " " + instance.getName() + " " + s.getName()
//									+ " " + a.getName());
                            for (Address ip : a.getIps()) {
                                if (ip.getOS_EXT_IPS_type() == null || ip.getOS_EXT_IPS_type().equals("fixed")) {
                                    if (a.getName().equals(project.getPrivateNetwork())) {
                                        privateip = ip.getAddr();
                                    }
                                    if (a.getName().equals("public") && ip.getVersion() == 4) {
                                        publicip = ip.getAddr();
                                    }
                                }
                                if (ip.getOS_EXT_IPS_type() != null && ip.getOS_EXT_IPS_type().equals("floating")) {
                                    publicip = ip.getAddr();
                                }
                            }
                        }
                    }
                }
                s1.setPrivateIp(privateip);
                s1.setPublicIp(publicip);
                s1.setServer(svr);
                if (svr != null && svr.getOS_EXT_STS_vm_state().equals("active")) {
                    numDeployed++;
                }
                if (publicip == null && needPubIp && project.getPublicNetwork() != null) {
                    incomplete = s1.getName() + " has not public IP";
                }
                if (privateip == null) {
                    incomplete = s1.getName() + " has not private IP";
                }
                if (svr == null) {
                    incomplete = s1.getName() + " has null openstack server";
                }
            }
//			System.out.println("XXXX updateDeploymentStatus: " + o.getName() + " " + instance.getName() + " " + errors
//					+ " " + numDeployed + " " + incomplete);
            if (errors) {
                setStatus(instance, DeploymentStatus.DEPLOYED_ERRORS, "errors");
            } else if (numDeployed == 0) {
                setStatus(instance, DeploymentStatus.UNDEPLOYED, "numDeployed == 0");
            } else if (incomplete != null) {
                setStatus(instance, DeploymentStatus.DEPLOYED_PARTIALLY, incomplete);
            } else {
                setStatus(instance, DeploymentStatus.DEPLOYED, "all okay");
            }
        }

    }

    ;

    protected void setStatus(VirtualMachineServiceInstance instance, DeploymentStatus newStatus, String reason) {
        if (instance.getStatus() != newStatus) {
            String msg = "deployment status changed: " + ManagementServer.object2ref(instance) +
                    " " + instance.getStatus() + " -> " + newStatus + " " + reason;
            System.err.println("VMDEPLOYMENTSTATUS: " + new Date() + " " + msg);
            logger.info(msg);
        }
        instance.setStatus(newStatus);
    }

    public HealthTestResponse test(String instance) {
        VirtualMachineServiceInstance i = findInstance(instance);
        HealthTestResponse res = ServiceFactory.eINSTANCE.createHealthTestResponse();
        res.setStatus(HealthTestStatus.GREEN);
        for (DcaeBasicServer s : i.getServers()) {
            try {
                AbstractClient c = getClient(i, s);
                DcaeVirtualMachineManagerConsole console = new DcaeVirtualMachineManagerConsole(c);
                HealthTestResponse h = console.test();
                s.setHealthTestStatus(h.getStatus());
                s.setHealthTestMessageCode(h.getMessageCode());
                updateHealthResponse(res, h);
            } catch (Exception e) {
                res.setStatus(HealthTestStatus.RED);
                res.setMessageCode("Health check failed to server: " + s.getName() + " " + e);
            }
        }
        return res;
    }

    protected void updateHealthResponse(HealthTestResponse h, HealthTestResponse h1) {
        if (h.getStatus() == HealthTestStatus.RED) {
            return;
        }
        if (h.getStatus() == HealthTestStatus.YELLOW && h1.getStatus() != HealthTestStatus.RED) {
            return;
        }
        if (h.getStatus() == HealthTestStatus.GREEN && h1.getStatus() == HealthTestStatus.GREEN) {
            return;
        }
        // h1 should be used
        h.setStatus(h1.getStatus());
        h.setMessageCode(h1.getMessageCode());
    }

    public void suspend(String instance) {
        VirtualMachineServiceInstance i = findInstance(instance);
        for (DcaeBasicServer s : getServers(i)) {
            AbstractClient c = getClient(i, s);
            DcaeVirtualMachineManagerConsole console = new DcaeVirtualMachineManagerConsole(c);
            console.suspend();
        }
    }

    public void resume(String instance) {
        VirtualMachineServiceInstance i = findInstance(instance);
        for (DcaeBasicServer s : getServers(i)) {
            AbstractClient c = getClient(i, s);
            DcaeVirtualMachineManagerConsole console = new DcaeVirtualMachineManagerConsole(c);
            console.resume();
        }
    }

    public void pushManagerConfiguration(String instance) {
        VirtualMachineServiceInstance i = findInstance(instance);
        for (DcaeBasicServer s : getServers(i)) {
            AbstractClient c = getClient(i, s);
            DcaeVirtualMachineManagerConsole console = new DcaeVirtualMachineManagerConsole(c);
            EObject config = o.managerConfiguration(instance);
            console.update("/", ManagementServer.ensureHardUpdate(config, 1));
            EList<DcaeStream> l1 = new BasicEList<DcaeStream>();
            l1.addAll(EcoreUtil.copyAll(i.getInputStreams()));
            EList<DcaeStream> l2 = new BasicEList<DcaeStream>();
            l2.addAll(EcoreUtil.copyAll(i.getOutputStreams()));
            console.updateStreams(decrypt(l1), decrypt(l2));
            console.configurationChanged();
        }
    }

    protected EList<DcaeStream> decrypt(EList<DcaeStream> l) {
        for (DcaeStream s : l) {
            if (s instanceof DmaapStream) {
                DmaapStream s1 = (DmaapStream) s;
                s1.setDmaapPassword(JavaHttpClient.decryptPassword(s1.getDmaapPassword()));
            }
        }
        return l;
    }

    protected EList<DcaeBasicServer> getServers(VirtualMachineServiceInstance i) {
        return i.getServers();
    }

    protected EObject convertToManagerConfiguration(VirtualMachineServiceInstance i) {
        VirtualMachineServiceConfiguration c = VmFactory.eINSTANCE.createVirtualMachineServiceConfiguration();
        c.setConfiguration(i.getConfiguration());
        return c;
    }

    public void pollManagerConfiguration(String instance) {
        // TODO Auto-generated method stub

    }

    public void start() {
        Thread t = new Thread("vm service: " + o.getName()) {
            @Override
            public void run() {
                while (true) {
                    try {
                        if (!controller.getServer().isSlave) {
                            updateDeploymentStatus();
                        }
                        Thread.sleep(10000); // sleep 10 seconds
                    } catch (Exception e) {
                        ManagementServerUtils.printStackTrace(e);
                        logger.fatal("vm service: " + o.getName() + " : " + e);
                        try {
                            Thread.sleep(30000);
                        } catch (InterruptedException e1) {
                        }
                    }
                }
            }

        };
        t.start();
    }

    public AbstractClient getClient(VirtualMachineServiceInstance i, DcaeBasicServer s) {
        JavaHttpClient c = new JavaHttpClient("managers.properties", i.eClass().getInstanceClassName());
        if (c.getBaseAddress() == null) {
            throw new RuntimeException("unable to determine baseaddress in managers.properties for: "
                                               + i.eClass().getInstanceClassName());
        }
        if (i.getServers().size() == 0) {
            throw new RuntimeException("service instances is not deployed (has no servers): "
                                               + ManagementServer.object2ref(i));
        }
        int port = i.getService().getManagerPortNumber();
        if (i.getManagerPortNumber() != null) {
            port = i.getManagerPortNumber();
        }
        if (s instanceof PhysicalMachine) {
            PhysicalMachine p = (PhysicalMachine) s;
            if (p.getManagerPortNumber() != null) {
                port = p.getManagerPortNumber();
            }
        }
        String b = c.getBaseAddress();
        b = b.replaceFirst("PORT", Integer.toString(port));
        b = b.replaceFirst("IP", dnsName(s));
        if (s.getCertificatePassword() != null) {
            b = b.replaceFirst("http", "https");
        }
        c.setBaseAddress(b);
        logger.info("using baseAdress: " + c.getBaseAddress() + " for " + ManagementServer.object2ref(i));
        return c;
    }

    public AbstractClient getClient(VirtualMachineServiceInstance i) {
        if (i.getLeaderServer() == null) {
            EList<DcaeBasicServer> l = getServers(i);
            if (l.size() == 0) {
                throw new RuntimeException("No servers for vm instance: " + ManagementServer.object2ref(i));
            }
            i.setLeaderServer(l.get(0));
        }
        return getClient(i, i.getLeaderServer());
    }

    protected String vmName(VirtualMachineServiceInstance i, int index) {
        return i.getServers().get(index).getName();
        // return "dcae:" + o.getName() + ":" + i.getName() + ":" + index;
    }

    protected VirtualMachineServiceInstance findInstance(String instanceName) {
        for (VirtualMachineServiceInstance ii : o.getInstances()) {
            if (ii.getName().equals(instanceName)) {
                return ii;
            }
        }
        throw new RuntimeException("Unable to find instance: " + instanceName);
    }

    public static void ecoreSetup() {
        // TODO Auto-generated method stub

    }

    public EObject managerConfiguration(String instanceName) {
        VirtualMachineServiceInstance i = findInstance(instanceName);
        AbstractClient c = getClient(i);
        DcaeVirtualMachineManagerConsole console = new DcaeVirtualMachineManagerConsole(c);
        Object oo = console.list("/", 100);
        JSONObject json = (JSONObject) Utils.object2json(oo);
        // System.err.println("XXXXX" + json.toString(2));
        return controller.getServer().json2ecore(EcorePackage.eINSTANCE.getEObject(), json);
    }

    public JSONObject managerOperation(String instanceName, String operation, JSONObject parameters) {
        VirtualMachineServiceInstance i = findInstance(instanceName);
        AbstractClient c = getClient(i);
        DcaeVirtualMachineManagerConsole console = new DcaeVirtualMachineManagerConsole(c);
        if (operation == null) {
            throw new RuntimeException("no operation: " + instanceName);
        }
        if (parameters == null) {
            throw new RuntimeException("no parameters: " + instanceName + "@" + operation);
        }
        Object oo = console.operation("/", operation, parameters);
        if (oo == null) {
            return null;
        }
        JSONObject json = (JSONObject) Utils.object2json(oo);
        // System.err.println("XXXXX" + json.toString(2));
        return json;
    }

    public void runHealthTests() {
        // TODO is this every called??
        System.err.println("TTTTTTTTT vm runHealthTests");
        for (VirtualMachineServiceInstance i : o.getInstances()) {
            HealthTestResponse s = null;
            try {
                if (i.getStatus() == DeploymentStatus.DEPLOYED) {
                    if (i.getManagerPortNumber() < 0) {
                        s = ServiceFactory.eINSTANCE.createHealthTestResponse();
                        s.setMessageCode("Health Check undefined");
                        s.setStatus(HealthTestStatus.YELLOW);
                    } else {
                        AbstractClient c = getClient(i);
                        DcaeVirtualMachineManagerConsole console = new DcaeVirtualMachineManagerConsole(c);
                        s = console.test();
                    }
                } else {
                    s = ServiceFactory.eINSTANCE.createHealthTestResponse();
                    s.setMessageCode("Not deployed");
                    s.setStatus(HealthTestStatus.YELLOW);
                }
            } catch (Exception e) {
                s = ServiceFactory.eINSTANCE.createHealthTestResponse();
                s.setMessageCode(e.toString());
                s.setStatus(HealthTestStatus.RED);
                logger.error("exception occured ", e);
            }
            i.setHealthTestStatus(s.getStatus());
            i.setHealthTestMessageCode(s.getMessageCode());
            MetricStore store = controller.getServer().metrics.getStore(i);
            Date now = new Date();
            String path = "/lastHealthTest";
            store.addLongValue(path, now, now.getTime(), "DateMetricAttribute", false);
        }
    }

    public void updateConfigurationFromPolicy(String instanceName) {
        throw new UnsupportedOperationException("should not get called");
    }
}
