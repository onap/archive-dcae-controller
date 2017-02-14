#!/bin/bash

export JAVA_HOME=/opt/app/java/jdk/jdk170
export GROOVY_HOME=/opt/app/groovy/246

PATH=$JAVA_HOME/bin:$GROOVY_HOME/bin:$PATH

cd $(dirname $(dirname $0))

ROOT=$(pwd)
CMD=$ROOT/bin/$(echo $(basename $(pwd)) | sed s/dcae-//)-controller


mkdir -p logs/
echo $(date) bin/manager.sh "$@" >> logs/manager.sh.log

CMD1=$1
shift

case $CMD1 in 
  start|stop|restart|console)
    if [ -e makefile ]; then
      make $CMD1
      exit
    fi
    case $CMD1 in
      start|stop|console) 
        $CMD $CMD1  
        ;;
      *) 
        $CMD stop
        $CMD start -Djavax.net.ssl.trustStore=config/docker-mra-certs.jks
        ;;
    esac
    exit
    ;;
esac
