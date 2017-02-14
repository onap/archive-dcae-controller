#!/bin/bash

set -x
set -e

### HACK
case $(hostname) in
  *drps??)
    FILE=/etc/my.cnf
    if [ -e $FILE ]; then rm $FILE; fi
    ;;
esac

mkdir -p /etc/dcae
sudo chown dcae:dcae /etc/dcae



export JAVA_HOME=/opt/app/java/jdk/jdk170
export PATH=$JAVA_HOME/bin:$PATH

DIR=/opt/app/dcae-certificate
sudo mkdir -p $DIR
sudo chown attcloud:attcloud $DIR
cd  $DIR

cat /tmp/certificate.pkcs12.b64code | base64 --decode > certificate.pkcs12

cp /tmp/.password .password
chmod go-rwx /tmp/.password 
chmod go+r /tmp/.password 
chmod o-rwx .password 

PW=$(cat .password)

ALIAS=$(hostname)


rm -f keystore.jks

keytool -genkey -alias $ALIAS -keystore keystore.jks << EOF > /dev/null
$PW
$PW






yes

EOF

echo $PW | keytool -delete -keystore keystore.jks -alias $ALIAS

( echo $PW ; echo $PW ) | keytool -v -importkeystore -srckeystore certificate.pkcs12 -srcstoretype PKCS12 -destkeystore keystore.jks -deststoretype JKS

echo $PW | keytool -v -list -keystore keystore.jks | tee keystore.list

sudo chown -R dcae:dcae $DIR

##for u in $*; do
  ##setfacl -m u:$u:rx /opt/app/dcae-certificate
  ##setfacl -m u:$u:r /opt/app/dcae-certificate/*
  ##setfacl -m u:$u:r /opt/app/dcae-certificate/.password
##done



