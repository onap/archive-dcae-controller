#!/bin/bash

GITREPO=$1

cd /opt/app

git -c http.sslVerify=false clone $GITREPO
cd dcae-startup-vm-message-router/
./deploy.sh


