#!/bin/bash

export JAVA_HOME=/opt/app/java/jdk/jdk170
export GROOVY_HOME=/opt/app/groovy/246

PATH=$JAVA_HOME/bin:$GROOVY_HOME/bin:$PATH

cd $(dirname $(dirname $(readlink -e $0)))

ROOT=$(pwd)
CMD=$ROOT/bin/controller-service-docker-host-manager-controller


mkdir -p logs/
echo $(date) bin/manager.sh "$@" >> logs/manager.sh.log

CMD1=$1
VMTYPE=vm-docker-host

case $CMD1 in 
  start) 
	mkdir -p data/resources/configuration
    if [ ! -e data/resources/dockerHost.json ]; then
    	echo '{}' > data/resources/dockerHost.json
    fi
	if [ -e config/version.json ]; then
		rm -rf data/resources/configuration/version*
        echo '{}' >  data/resources/configuration.json
		cp config/version.json data/resources/configuration/
	fi
    sed -i s/FQDN/$(hostname -f)/ config/docker.properties
    find /opt/app/dcae-controller-service-*/lib -name \*.jar | grep -v docker-host-manager | xargs -I X cp X lib/
    JVMARGS=$(cat config/manager.properties | grep JVMARGS | sed 's/[^=]*=//')
    if [ "$JVMARGS" == "" ]; then JVMARGS=-Djavax.net.ssl.trustStore=config/docker-mra-certs.jks; fi
    $CMD $CMD1 $JVMARGS
    ;;
  stop|console) 
    $CMD $CMD1  
    ;;
  config) 
    CONFIGDIR=/var/config/DCAE/chef
    if [ ! -e $CONFIGDIR/$VMTYPE-manager.properties ]; then CONFIGDIR=/tmp; fi
    mkdir -p config
    for FILE in $CONFIGDIR/$VMTYPE-*; do
      FILE2=$(echo $FILE | sed s/.*$VMTYPE-//)
      cp $FILE config/$FILE2
    done
    /opt/app/dcae-controller-core-utils/bin/setup_https.sh config/manager.properties
    ;;
  restore|clean) 
    ;;
  restart) 
    $0 stop
    $0 start 
    ;;
  restart2) 
    $CMD stop
    JVMARGS=$(cat config/manager.properties | grep JVMARGS | sed 's/[^=]*=//')
    if [ "$JVMARGS" == "" ]; then JVMARGS=-Djavax.net.ssl.trustStore=config/docker-mra-certs.jks; fi
    $CMD start $JVMARGS
    ;;
   *) 
    echo unknown command: $CMD1 
    ;;  
esac


