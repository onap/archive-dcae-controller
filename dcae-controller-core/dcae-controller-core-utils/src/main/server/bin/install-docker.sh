#!/bin/bash

cd $(dirname $(readlink -e $0))
export PATH=$PATH:$(pwd)

PATH=$PATH:.
TRUSTY_REPO="deb https://apt.dockerproject.org/repo ubuntu-trusty main"

. common.funcs

#
# install docker-engine on ubuntu 14.04
#

_isRoot

REL=$(uname -r)

apt-get update

#
# get certificates
#
apt-get install -q -y apt-transport-https ca-certificates curl software-properties-common ||
        _fail "apt-transport-http ca-certificates curl software-properties-common installation failed"
_print "apt-transport-htps ca-certificates curl software-properties-common installed ..."

# makes the aufs storage driver available
#
apt-get install -q -y linux-image-extra-${REL} ||
        _fail "linux-image-extra-${REL} failed"
_print "linux-image-extra-${REL} installed ..."

aptitude install -q -y linux-image-extra-virtual ||
        _fail "linux-image-extra-virtual installation failed"
_print "linux-image-extra-virtual installed ..."

#
# Add GPG key
#
curl -fsSL https://yum.dockerproject.org/gpg | sudo apt-key add -

apt-key fingerprint 58118E89F3A912897C070ADBF76221572C52609D

echo "${TRUSTY_REPO}" | sudo tee /etc/apt/sources.list.d/docker.list

# update apt package index
apt-get update

#
# set up the repository
#
apt-get install software-properties-common
add-apt-repository \
	"deb https://apt.dockerproject.org/repo/ \
	ubuntu-$(lsb_release -cs) \
	main" || _fail "setup of repositry failed"
_print "repository set up" 

#
# install apparmor
#
apt-get install -q -y apparmor ||
        _fail "apparmor installation failed"
_print "apparmor installed ..."

apt-get update 

apt-get install -q -y docker-engine ||
        _fail "docker-engine installation failed"
_print "docker-engine installed ..."

#
# Generate certifcates for TLS
#
_print "Generating certificates ..."
generate-certs.sh

usermod -aG docker ubuntu
usermod -aG docker dcae

#
# mv ecomp-nexus docker auth 
#
if [ ! -d /home/ubuntu/.docker ]; then
	mkdir -p /home/ubuntu/.docker || _fatal "Could not create /home/ubuntu/.docker dir"
fi

#
# Start Docker
#
_print "Starting docker ..."
service docker restart

#
# END
#
