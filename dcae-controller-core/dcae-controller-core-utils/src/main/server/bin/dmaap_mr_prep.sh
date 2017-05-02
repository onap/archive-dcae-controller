#!/bin/bash

GITREPO=$1

cd /opt/app

git -c http.sslVerify=false clone $GITREPO message-router
cd message-router/
./deploy.sh


