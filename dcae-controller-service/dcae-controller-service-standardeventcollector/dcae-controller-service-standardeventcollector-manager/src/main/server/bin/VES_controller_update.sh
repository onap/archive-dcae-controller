#!/bin/bash
paramName=$1
paramValue=$2

localpropertyfile="/opt/app/VESCollector/etc/collector.properties"
localadminscript="/opt/app/VESCollector/bin/VESrestfulCollector.sh"
tmpfile="/opt/app/VESCollector/etc/collector.properties.tmp"
keystore="/opt/app/dcae-certificate/keystore.jks"
keypwdfile="/opt/app/dcae-certificate/.password"

echo "paramName:" $paramName "paramValue:" $paramValue


case $1 in
        "ADMIN")
                echo $localadminscript $2
                $localadminscript $2
                ;;
        *)
                #rm $tmpfile
                if [ $1 = "collector.keystore.alias" ]; then
                        tmpalias=`/usr/bin/keytool -list -keystore $keystore < $keypwdfile | grep "col" | cut -d"," -f1`
                        echo "tmpalias:" $tmpalias
                        alias=`echo $tmpalias | cut -d":" -f2`
                        echo "alias:" $alias
                        sed "s~$paramName=.*~$paramName=$alias~g" $localpropertyfile > $tmpfile
                        echo `cat $tmpfile > $localpropertyfile`
                        rm $tmpfile
                else
                       sed "s~$paramName=.*~$paramName=$paramValue~g" $localpropertyfile > $tmpfile
                       echo `cat $tmpfile > $localpropertyfile`
                       rm $tmpfile
                fi
                ;;
esac
