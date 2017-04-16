#!/bin/bash 

case $(hostname) in
  *coll??)
	  /opt/app/dcae-controller-core-utils/bin/controller-setup-logrotation.sh dcae-controller-service-docker-host-manager
	  ;;
  *tplg??)
	  /opt/app/dcae-controller-core-utils/bin/controller-setup-logrotation.sh dcae-controller-service-common-vm-manager
	  ;;
  *pstg??)
	  /opt/app/dcae-controller-core-utils/bin/controller-setup-logrotation.sh dcae-controller-service-common-vm-manager
	  ;;
  *pgda??)
	  /opt/app/dcae-controller-core-utils/bin/controller-setup-logrotation.sh dcae-controller-service-common-vm-manager
	  ;;
  *cdap??)
	  /opt/app/dcae-controller-core-utils/bin/controller-setup-logrotation.sh dcae-controller-service-cdap-cluster-manager
      /opt/app/dcae-controller-core-utils/bin/controller-setup-logrotation.sh dcae-controller-service-dmaap-drsub-manager
	  ;;
  *cont??)
	  /opt/app/dcae-controller-core-utils/bin/controller-setup-logrotation.sh dcae-controller-platform-server
	  ;;
esac
