
Contains the Code related to the DCAE Controller.

This project hosts the build the Open eCOMP DCAE Controller.

# Code repositories

The DCAE controller code is a little more complex than most Maven setups, since the code is located in multiple GIT repositories. This is the list of repositories that need to be cloned into the same local directory (e.g., GITROOT):

	dcae-org.openecomp.dcae.analytics
	dcae-org.openecomp.dcae.configuration
	dcae-org.openecomp.dcae.controller
	dcae-org.openecomp.dcae.controller.operation
	dcae-org.openecomp.ncomp.cdap
	dcae-org.openecomp.ncomp.core
	dcae-org.openecomp.ncomp.docker
	dcae-org.openecomp.ncomp.maven
	dcae-org.openecomp.ncomp.openstack
	dcae-org.openecomp.ncomp.sirius.manager
	dcae-org.openecomp.ncomp.utils
	dcae-org.openecomp.operation.utils

# Build Environmental setup

The file `dcae-org.openecomp.dcae.controller/dcae-controller-opensource/src/main/resources/settings.xml` contains the Maven Setting that is required.

# Build Complete Controller

	cd GITROOT
	cp dcae-org.openecomp.dcae.controller/pom-complete-build.xml pom.xml
	mvn clean install


# Build Environment Setup

TBD

Maven repositories: TDB

Maven property values:

1. openecomp.nexus.user. Nexus user id.
2. openecomp.nexus.password. Nexus password.
3. maven.wagon.http.ssl.insecure. Allow insecure HTTPS connection. E.g., true 
4. maven.wagon.http.ssl.allowall. Allow insecure HTTPS connection. E.g., true 
5. site.urlroot. Location to store Maven site:deploy files. E.g., file:$HOME/site 
6. openecomp.nexus.snapshots. Repository to upload SNAPSHOT builds to.
7. openecomp.nexus.releases. Repository to upload release builds to.


# Complete DCAE Controller Build instructions


# Build instructions

1. Clone the repository
2. Build using Maven: mvn clean install

# Build and Deploy DCAE Controller Docker Image to Nexus/Maven Repository

	cd GITROOT/dcae-org.openecomp.dcae.controller/dcae-controller-opensource/src/main/docker-build
	bash build.sh 
	bash push.sh DOCKERREGISTRY USER PASSWORD

# Development Environment Instructions

DCAE controller developement need a very specific development environment.

1. Eclipse Luna with Eclipse Modeling Tools. Download http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/lunasr2
2. Xtext 2.7.3 Plugin
3. Groovy-Eclipse Feature 2.9.2
4. XCore 1.2.2 Plugin


# Overview of DCAE Controller components

## Core DCAE Controller Platform
### dcae-controller
### dcae-controller-core-model
### dcae-controller-core-utils
### dcae-controller-opensource
### dcae-controller-platform-model
### dcae-controller-platform-server
### dcae-controller-service-vm-adaptor
### dcae-controller-service-vm-model

## DCAE Controller VM Common Manager

### dcae-controller-service-common-vm
### dcae-controller-service-common-vm-manager
### dcae-controller-service-common-vm-model

## DCAE Controller CDAP Sub System

### dcae-controller-service-cdap
### dcae-controller-service-cdap-adaptor
### dcae-controller-service-cdap-cluster
### dcae-controller-service-cdap-cluster-manager
### dcae-controller-service-cdap-cluster-model
### dcae-controller-service-cdap-model

## DCAE Controller Docker Sub System

### dcae-controller-service-docker
### dcae-controller-service-docker-adaptor
### dcae-controller-service-docker-model
### dcae-controller-service-docker-host
### dcae-controller-service-docker-host-manager
### dcae-controller-service-docker-host-model

## DCAE Controller Docker Common Manager

### dcae-controller-service-common-docker
### dcae-controller-service-common-docker-manager
### dcae-controller-service-common-docker-model

## VES collector Manager

### dcae-controller-service-standardeventcollector
### dcae-controller-service-standardeventcollector-manager
### dcae-controller-service-standardeventcollector-model

## POSTGRES service Model

### dcae-controller-service-storage-postgres-model

## DMAAP Data Router Manager

### dcae-controller-service-dmaap-drsub
### dcae-controller-service-dmaap-drsub-manager
### dcae-controller-service-dmaap-drsub-model

