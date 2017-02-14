#!/bin/bash

# assumes 10.208.197.75 ecomp-nexus is in /etc/hosts and 
# we have a route to it
#
# run as root

_die() {
	printf "$(date):FATAL:$1\n"
	exit 2;
}

_print() {
	printf "$(date):INFO:$1\n";
}


DOCKER_ETC_DIR="/opt/app/docker/etc"
NEXUS_CERT=${DOCKER_ETC_DIR}/nexus.crt

_print "Getting ecomp-nexus certificate ..."

keytool -printcert -rfc -sslserver ecomp-nexus:8443 > ${NEXUS_CERT}

grep "BEGIN CERTIFICATE" ${NEXUS_CERT} || 
	_die "Could not retrieve certificated"

_print "Adding certificate ..."
cp -p ${NEXUS_CERT} /usr/local/share/ca-certificates || 
	_die "Could not copy certficate into place"

_print "Updating CA certificates ..."
update-ca-certficates

#
# restart docker 
#

_print "Restarting docker ..."
service docker restart
