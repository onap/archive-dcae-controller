#!/bin/bash

ROOT=$(dirname $0)

for a in \
  OPENECOMP-DEMO \
  OPENECOMP-DEMO-RACKSPACE \
  dcae-controller-opensource \
  dcae-controller-platform-* \
  dcae-controller-service \
  dcae-controller-service-common-* \
  dcae-controller-service-cdap* \
  dcae-controller-service-docker* \
  dcae-controller-service-standardeventcollector* \
  dcae-controller-service-vm* \
  dcae-controller-service-dmaap-drsub* \
  dcae-controller-service-storage-postgres-model \
  dcae-controller-core-model \
  dcae-controller \
  dcae-controller-feature \
  dcae-controller-core \
  dcae-controller-core-utils \
  dcae-controller-operation-utils \
  dcae-analytics-cdap-common-model \
  ncomp-openstack* \
  ncomp-docker* \
  ncomp-cdap* \
  ncomp-maven* \
  ncomp-core \
  ncomp-core-model \
  ncomp-core-types \
  ncomp-core-tools \
  ncomp-sirius-manager \
  ncomp-sirius-manager-agent* \
  ncomp-sirius-manager-base \
  ncomp-sirius-manager-console \
  ncomp-sirius-manager-generator \
  ncomp-sirius-manager-model \
  ncomp-sirius-manager-drools \
  ncomp-sirius-manager-server \
  ncomp-utils-java \
  ncomp-utils-java-extra \
  ncomp-utils-journaling \
  ncomp-utils \
  operation-utils
do
  for A in $(ls -d1 /home/ncomp/git/*/$a| grep -v git/dcae-); do
    echo +++++++++ $A +++++++++
    bash $ROOT/convert-to-open-ecomp.sh $A
  done
done  
