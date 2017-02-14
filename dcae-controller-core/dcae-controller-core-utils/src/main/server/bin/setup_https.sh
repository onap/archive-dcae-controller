#!/bin/bash

FILE=$1

JKS=/opt/app/dcae-certificate/keystore.jks
PW=/opt/app/dcae-certificate/.password

sed -i /server.keyStore/d $FILE
sed -i /server.keyManagerPassword/d $FILE

if [ ! -e $JKS ]; then exit; fi
if [ ! -e $PW ]; then exit; fi

echo server.keyStore=$JKS >> $FILE
echo server.keyStorePassword=$(cat $PW)  >> $FILE
echo server.keyManagerPassword=$(cat $PW)  >> $FILE

