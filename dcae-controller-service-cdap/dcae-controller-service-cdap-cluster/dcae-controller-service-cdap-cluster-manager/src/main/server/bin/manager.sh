#!/bin/bash

export JAVA_HOME=/opt/app/java/jdk/jdk170
export GROOVY_HOME=/opt/app/groovy/246

PATH=$JAVA_HOME/bin:$GROOVY_HOME/bin:$PATH

cd $(dirname $(dirname $0))

ROOT=$(pwd)
CMD=$ROOT/bin/controller-service-cdap-cluster-manager-controller


mkdir -p logs/
echo $(date) bin/manager.sh "$@" >> logs/manager.sh.log

CMD1=$1
shift
VMTYPE=$(ls /tmp/vm-*manager.properties | sed s/-manager.properties// | sed sx/tmp/xx)


case $CMD1 in
  start) 
    CLUSTER_FILE=data/resources/cluster.json
    if [ ! -e $CLUSTER_FILE ]; then
       mkdir -p $(dirname $CLUSTER_FILE)
       echo '{ "baseUrl": "http://localhost:10000/v3", "pollingFrequency": "30000" }' > $CLUSTER_FILE
    fi
    JVMARGS=$(cat config/manager.properties | grep JVMARGS | sed 's/[^=]*=//')
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
    $CMD start $JVMARGS
    ;;
   *) 
    echo unknown command: $CMD1 
    ;;  
esac

