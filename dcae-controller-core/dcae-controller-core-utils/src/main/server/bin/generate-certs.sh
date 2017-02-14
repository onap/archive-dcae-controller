#!/bin/bash

. common.funcs

#
# this was cribbed from the io.docker:docker install_postproc script
#
DOCKER_DIR=/opt/app/docker
DOCKER_ETC_DIR=${DOCKER_DIR}/etc
DOCKER_BIN_DIR=${DOCKER_DIR}/bin
DOCKER_DATA_DIR=${DOCKER_DIR}/data
DOCKER_LOG_DIR=${DOCKER_DIR}/logs

DOCKER_SSL="/etc/ssl/certs"

DOCKER_CA_CERT=${DOCKER_ETC_DIR}/docker_ca_cert.pem
DOCKER_CA_KEY=${DOCKER_ETC_DIR}/docker_ca_key.pem

CLIENT_P12_PWD=f22723cffdbd2fff1cb3c558677a7684

HOSTNAME=$(hostname -f)

_isRoot

mkdir -p ${DOCKER_DIR}
mkdir -p ${DOCKER_ETC_DIR}
mkdir -p ${DOCKER_BIN_DIR}
mkdir -p ${DOCKER_DATA_DIR}
mkdir -p ${DOCKER_LOG_DIR}

cp -p docker_ca_cert.pem ${DOCKER_ETC_DIR}
cp -p docker_ca_key.pem ${DOCKER_ETC_DIR}

# Generate certificates for SSL encryption
# Generate a private key for the docker engine

openssl genrsa -out ${DOCKER_ETC_DIR}/server_key.pem 2048 ||
        fail 1 "Server private key generation failed"
_print "Generated the server's private key ..."

# Generate a certificate signing request for the server using the private key.
openssl req -new -key ${DOCKER_ETC_DIR}/server_key.pem -out ${DOCKER_ETC_DIR}/server.csr -batch -subj "/countryName=US/stateOrProvinceName=Michigan/localityName=Southfield/organizationName=AT&T Services, Inc./commonName=${HOSTNAME}" ||
        fail 2 "Server certificate signing request generation failed."
_print "Generated a certificate signing request using the private key ..."

# Generate a certificate for the server and sign it with the CA certificate.
openssl x509 -req -days 3650 -in ${DOCKER_ETC_DIR}/server.csr -CA ${DOCKER_CA_CERT} -CAkey ${DOCKER_CA_KEY} -CAcreateserial -out ${DOCKER_ETC_DIR}/server_cert.pem ||
        fail 3 "Server certificate signing failed."
_print "Generated a certificate for the server and sign it with the CA certificate ..."

# Generate a private key for client authentication
openssl genrsa -out ${DOCKER_ETC_DIR}/client_key.pem 2048 ||
        fail 4 "Client private key generation failed."
_print "Generated a private key for client authentication ..."

# Generate a certificate signing request for the client using the private key.
openssl req -new -key ${DOCKER_ETC_DIR}/client_key.pem -out ${DOCKER_ETC_DIR}/client.csr -batch -subj "/countryName=US/stateOrProvinceName=Michigan/localityName=Southfield/organizationName=AT&T Services, Inc./commonName=Client" ||
        fail 5 "Clienterver certificate signing request generation failed."
_print "Generated a certificate signing request for the client using the private key ..."

# To make the key suitable for client authentication,
# create an extensions config file
echo extendedKeyUsage = clientAuth > ${DOCKER_ETC_DIR}/client_cert_extfile.cnf
_print "Generated client certificate extensions config ..."

# Generate a certificate for the client and sign it with the CA certificate
openssl x509 -req -days 3650 -in ${DOCKER_ETC_DIR}/client.csr -CA ${DOCKER_CA_CERT} -CAkey ${DOCKER_CA_KEY} -CAcreateserial -out ${DOCKER_ETC_DIR}/client_cert.pem -extfile ${DOCKER_ETC_DIR}/client_cert_extfile.cnf ||
        fail 6 "Client certificate signing failed."
_print "Client certificate signing successfully ..."

# Protect the keys
chmod 0600 ${DOCKER_ETC_DIR}/server_key.pem ${DOCKER_ETC_DIR}/client_key.pem ${DOCKER_CA_KEY}

# Make the client key readable by the docker group so people who can access the docker cli can also
# access docker engine via the rest api
chgrp docker ${DOCKER_ETC_DIR}/client_key.pem
# But make the public keys readable
chmod 0644 ${DOCKER_ETC_DIR}/server_cert.pem ${DOCKER_ETC_DIR}/client_cert.pem ${DOCKER_CA_CERT}

# Remove the password from the client key
openssl rsa -in ${DOCKER_ETC_DIR}/client_key.pem -out ${DOCKER_ETC_DIR}/client_key.pem
_print "Removed password from client key ..."


# Convert the client key from pem to pksc12 format so we can add it to the keystore
openssl pkcs12 -export -inkey ${DOCKER_ETC_DIR}/client_key.pem -in ${DOCKER_ETC_DIR}/client_cert.pem -out ${DOCKER_ETC_DIR}/client_cert.p12 -name client_p12 -CAfile ${DOCKER_CA_CERT} -caname root -chain -passout pass:${CLIENT_P12_PWD} ||
        fail 7 "CA key not converted to pksc12 format"
_print "Converted CA key to pksc12 format ..."

# update the docker opts in /etc/default/docker
DOCKER_OPTS="--debug --graph /opt/app/docker/data --host tcp://0.0.0.0:4243 --host unix:///var/run/docker.sock --tls=true --tlscert=/opt/app/docker/etc/server_cert.pem --tlskey=/opt/app/docker/etc/server_key.pem --tlscacert=/opt/app/docker/etc/docker_ca_cert.pem"

echo "DOCKER_OPTS=\"${DOCKER_OPTS}\"" >> /etc/default/docker
_print "Updated Docker DOCKER_OPTS ..."

