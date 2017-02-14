#!/bin/bash

service=$1
instance=$2

DIR=/var/config/DCAE/$service/$instance/manager

mkdir -p $DIR
for f in manager.properties console.properties gui.properties log4j.properties; do
  cp config/$f $DIR
done

for d in /tmp /var/config/DCAE/chef; do
  for f in $(ls $d/$service*); do 
    f1=$(basename $f | sed s/$service.//)
    cp $f $DIR/$f1
    chmod og-rwx $DIR/$f1
  done
done

sed -i /^server.key/d $DIR/manager.properties

