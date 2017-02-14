#!/bin/bash

. common.funcs

TRUSTY_REPO="deb https://apt.dockerproject.org/repo ubuntu-trusty main"

#
# install docker-engine on ubuntu 14.04 
#
REL=$(uname -r)

sudo apt-get update 

#
# Add GPG key
#
sudo apt-key adv --keyserver hkp://p80.pool.sks-keyservers.net:80 --recv-keys 58118E89F3A912897C070ADBF76221572C52609D

echo "${TRUSTY_REPO}" | sudo tee /etc/apt/sources.list.d/docker.list

# update apt package index
sudo apt-get update 


#
# install apparmor
#
sudo app-get install -q -y apparmor || 
	_fail "apparmor installation failed"

#
# get certificates
#
sudo apt-get install -q -y apt-transport-http ca-certificates ||
	_fail "apt-transport-http ca-certificates installation failed"

#
# makes the aufs storage driver available 
#
sudo apt-get install -q -y linux-image-extra-${REL} linux-image-extra-virtual ||
	_fail "linux-image-extra-${REL} or linux-image-extra-virtual installation failed"

sudo apt-get install -q -y docker-engine ||
	_fail "docker-engine installation failed"

#
# Generate certifcates for TLS 
#
sudo -uroot generate-certs.sh 

sudo service docker start 
sudo usermod -aG docker ubuntu
sudo usermod -aG docker dcae

#
# END
#
