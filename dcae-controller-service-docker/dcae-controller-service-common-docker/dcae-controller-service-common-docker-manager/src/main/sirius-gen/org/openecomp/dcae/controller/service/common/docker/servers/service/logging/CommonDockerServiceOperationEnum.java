
package org.openecomp.dcae.controller.service.common.docker.servers.service.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum CommonDockerServiceOperationEnum implements EcompOperationEnum {

  CommonDockerService_deploy("CommonDockerService@deploy"),
  CommonDockerService_undeploy("CommonDockerService@undeploy"),
  CommonDockerService_test("CommonDockerService@test"),
  CommonDockerService_suspend("CommonDockerService@suspend"),
  CommonDockerService_resume("CommonDockerService@resume"),
  CommonDockerService_pushManagerConfiguration("CommonDockerService@pushManagerConfiguration"),
  CommonDockerService_pollManagerConfiguration("CommonDockerService@pollManagerConfiguration"),
  CommonDockerService_managerConfiguration("CommonDockerService@managerConfiguration"),
  CommonDockerService_managerOperation("CommonDockerService@managerOperation"),
  CommonDockerService_updateConfigurationFromPolicy("CommonDockerService@updateConfigurationFromPolicy"),
  CommonDockerService_runHealthTests("CommonDockerService@runHealthTests") ; 


	private String n;
	
	private CommonDockerServiceOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
