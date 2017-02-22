#!/bin/bash

GITREPO=$1

cd /opt/app

git -c http.sslVerify=false clone $GITREPO
cd message-router/
./deploy.sh


