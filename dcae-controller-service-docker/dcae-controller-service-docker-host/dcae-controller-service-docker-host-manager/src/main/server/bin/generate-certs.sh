#!/bin/bash -x

#
# this was (mostly) shamelessly cribbed from the io.docker:docker 
# install_postproc script. run as root
#
DOCKER_DIR=/opt/app/docker
DOCKER_ETC_DIR=${DOCKER_DIR}/etc
DOCKER_BIN_DIR=${DOCKER_DIR}/bin
DOCKER_DATA_DIR=${DOCKER_DIR}/data
DOCKER_LOG_DIR=${DOCKER_DIR}/logs

DOCKER_CA_CERT=${DOCKER_ETC_DIR}/docker_ca_cert.pem
DOCKER_CA_KEY=${DOCKER_ETC_DIR}/docker_ca_key.pem
CLIENT_P12_PWD=f22723cffdbd2fff1cb3c558677a7684

HOSTNAME=$(hostname -f)

# Generate certificates for SSL encryption
# Generate a private key for the docker engine

openssl genrsa -out ${DOCKER_ETC_DIR}/server_key.pem 2048 || 
	_fail_with_rc 20 "Server private key generation failed"

# Generate a certificate signing request for the server using the private key.
openssl req -new -key ${DOCKER_ETC_DIR}/server_key.pem -out ${DOCKER_ETC_DIR}/server.csr -batch -subj "/countryName=US/stateOrProvinceName=Michigan/localityName=Southfield/organizationName=AT&T Services, Inc./commonName=${HOSTNAME}" || 
	_fail_with_rc 21 "Server certificate signing request generation failed."

# Generate a certificate for the server and sign it with the CA certificate.
openssl x509 -req -days 3650 -in ${DOCKER_ETC_DIR}/server.csr -CA ${DOCKER_CA_CERT} -CAkey ${DOCKER_CA_KEY} -CAcreateserial -out ${DOCKER_ETC_DIR}/server_cert.pem || 
	_fail_with_rc 22 "Server certificate signing failed."

# Generate a private key for client authentication
openssl genrsa -out ${DOCKER_ETC_DIR}/client_key.pem 2048 || 
	_fail_with_rc 20 "Client private key generation failed."

# Generate a certificate signing request for the client using the private key.
openssl req -new -key ${DOCKER_ETC_DIR}/client_key.pem -out ${DOCKER_ETC_DIR}/client.csr -batch -subj "/countryName=US/stateOrProvinceName=Michigan/localityName=Southfield/organizationName=AT&T Services, Inc./commonName=Client" || 
	_fail_with_rc 21 "Clienterver certificate signing request generation failed."

# To make the key suitable for client authentication, 
# create an extensions config file
echo extendedKeyUsage = clientAuth > ${DOCKER_ETC_DIR}/client_cert_extfile.cnf

# Generate a certificate for the client and sign it with the CA certificate
openssl x509 -req -days 3650 -in ${DOCKER_ETC_DIR}/client.csr -CA ${DOCKER_CA_CERT} -CAkey ${DOCKER_CA_KEY} -CAcreateserial -out ${DOCKER_ETC_DIR}/client_cert.pem -extfile ${DOCKER_ETC_DIR}/client_cert_extfile.cnf || 
	_fail_with_rc 22 "Client certificate signing failed."

# Protect the keys
chmod 0600 ${DOCKER_ETC_DIR}/server_key.pem ${DOCKER_ETC_DIR}/client_key.pem ${DOCKER_CA_KEY}

# Make the client key readable by the docker group so people who can access the docker cli can also
# access docker engine via the rest api
chgrp docker ${DOCKER_ETC_DIR}/client_key.pem
# But make the public keys readable
chmod 0644 ${DOCKER_ETC_DIR}/server_cert.pem ${DOCKER_ETC_DIR}/client_cert.pem ${DOCKER_CA_CERT}

# Remove the password from the client key
openssl rsa -in ${DOCKER_ETC_DIR}/client_key.pem -out ${DOCKER_ETC_DIR}/client_key.pem

# Convert the client key from pem to pksc12 format so we can add it to the keystore

openssl pkcs12 -export -inkey ${DOCKER_ETC_DIR}/client_key.pem -in ${DOCKER_ETC_DIR}/client_cert.pem -out ${DOCKER_ETC_DIR}/client_cert.p12 -name client_p12 -CAfile ${DOCKER_CA_CERT} -caname root -chain -passout pass:${CLIENT_P12_PWD} || 
	_fail_with_rc 6 "CA key not converted to pksc12 format"

# update the docker opts in /etc/default/docker
DOCKER_OPTS="--debug --graph /opt/app/docker/data --host tcp://0.0.0.0:4243 --host unix:///var/run/docker.sock --tls=true --tlscert=/opt/app/docker/etc/server_cert.pem --tlskey=/opt/app/docker/etc/server_key.pem --tlscacert=/opt/app/docker/etc/docker_ca_cert.pem"

echo "DOCKER_OPTS=${DOCKER_OPTS}" >> /etc/default/docker

