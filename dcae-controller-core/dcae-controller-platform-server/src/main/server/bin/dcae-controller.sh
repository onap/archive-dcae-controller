#!/bin/bash

cd $(dirname $(dirname $(readlink -e $0)))

ROOT=$(pwd)
CMD=$ROOT/bin/controller-platform-server-controller

mkdir -p logs/
echo $(date) bin/dcae-controller.sh "$@" >> logs/dcae-controller.sh.log

if [ -e /opt/app/dcae-controller-platform-server ]; then
  ### IST/ETE/PROD deployment
  ### verify/fix JAVA and GROOVY setup
  FOO=todo
fi

CMD1=$1
shift

case $CMD1 in 
  start|stop|restart|console)
    if [ -e makefile ]; then
      make $CMD1
      exit
    fi
    case $CMD1 in
      start) 
        JVMARGS=$(cat config/controller.properties | grep JVMARGS | sed 's/[^=]*=//')
        $CMD $CMD1 $JVMARGS
        ;;
      stop|console)
        $CMD $CMD1
        ;;
      *) 
        $CMD stop
        JVMARGS=$(cat config/controller.properties | grep JVMARGS | sed 's/[^=]*=//')
        $CMD start $JVMARGS
        ;;
    esac
    exit
    ;;
  backup|restore)
    exit
    ;;
  config)
    /opt/app/dcae-controller-core-utils/bin/setup_https.sh config/controller.properties
    exit
    ;;
  sync-install)
    ENV=$1
    DIR=$2
    if [ ! -e config/server.private ]; then
      echo "No private key: $(pwd)/config/server.private"
      exit 1
    fi
    for f in $DIR/config/*; do 
      echo "Updating config/$(basename $f)"
      rm -rf config/$(basename $f)
      cp -rp $f config/$(basename $f)
    done 
    for jar in /opt/app/dcae-*-{jars,model,manager,adaptor}/lib/*.jar /opt/app/ncomp-*-{jars,model,manager,adaptor}/lib/*.jar; do
      echo "Updating $jar"
      cp $jar lib/
    done
    exit
    ;;
  add-service-artifact)
    G=$1
    A=$2
    V=$3
    F=$HOME/.m2/repository/$(echo $G | sed 'sx\.x/xg')/$A/$V/$A-$V.jar
    #echo Local artifact $F
    #if [ ! -e $F ]; then 
      #mvn org.apache.maven.plugins:maven-dependency-plugin:2.9:copy -Dartifact=$G:$A:$V:jar -DoutputDirectory=/tmp
      #F=/tmp/$A-$V.jar
    #fi
    if [ ! -e $F ]; then F=/home/ubuntu/$A-$V.jar; fi
    if [ ! -e $F ]; then echo "unable to find service artifact"; exit 1; fi
    if [ -e lib/$A-*.jar ]; then 
      #echo removing old version
      rm -f lib/$A-*.jar
    fi
    cp $F lib/
    touch config/runtime.properties
    sed -i /factory.$A/d config/runtime.properties
    jar tf $F | grep Factory.java | grep -v /gui/ | sed 's/.java$//' | sed sx/x.xg | awk -vA=$A '{ print "factory." A "." NR "=" $1}' >> config/runtime.properties
    echo bin/dcae-controller.sh add-service-artifact "$@" >> config/init.sh
    sort -u config/init.sh > config/init.sh.tmp
    mv  config/init.sh.tmp config/init.sh
    exit
    ;;
  add-manager)
    C2=$1
    U=$2
    P=$(echo $3 | sed 's/%/ /g')
    MFILE=config/managers.properties
    sed -i /$C2/d $MFILE
    echo $C2.endpoint=http://IP:PORT >> $MFILE
    echo $C2.user=$U >> $MFILE
    echo $C2.password=$P >> $MFILE 
    exit
    ;;
  "")
    echo "  start"
    for f in scripts/*groovy; do 
      cmd=$(basename $f | sed 's/.groovy$//') 
      echo "  $cmd"
    done
    exit
    ;;
  usage)
    echo ================ start =============================
    echo dcae-controller.sh start 
    for f in scripts/*groovy; do 
      cmd=$(basename $f | sed 's/.groovy$//') 
      echo ================ $cmd =============================
      bin/controller-platform-server-controller groovy scripts/$cmd 
    done
    exit
    ;;
esac

if [ ! -e scripts/$CMD1.groovy ]; then
  echo $0 $CMD1 does not exists.
  exit 1
fi

bin/controller-platform-server-controller groovy scripts/$CMD1.groovy "$@"


