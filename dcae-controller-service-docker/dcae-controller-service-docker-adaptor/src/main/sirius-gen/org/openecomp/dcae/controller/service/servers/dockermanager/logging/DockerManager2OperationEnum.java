
package org.openecomp.dcae.controller.service.servers.dockermanager.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum DockerManager2OperationEnum implements EcompOperationEnum {

  DOCKER_MANAGER_START_NEW_CRON("DOCKER-MANAGER-START-NEW-CRON"),
  DOCKER_MANAGER_START_CRON_RUN("DOCKER-MANAGER-START-CRON-RUN") ; 


	private String n;
	
	private DockerManager2OperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
