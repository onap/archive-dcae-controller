
package org.openecomp.dcae.controller.service.servers.docker.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum DockerServiceOperationEnum implements EcompOperationEnum {

  DockerService_deploy("DockerService@deploy"),
  DockerService_undeploy("DockerService@undeploy"),
  DockerService_test("DockerService@test"),
  DockerService_suspend("DockerService@suspend"),
  DockerService_resume("DockerService@resume"),
  DockerService_pushManagerConfiguration("DockerService@pushManagerConfiguration"),
  DockerService_pollManagerConfiguration("DockerService@pollManagerConfiguration"),
  DockerService_managerConfiguration("DockerService@managerConfiguration"),
  DockerService_managerOperation("DockerService@managerOperation"),
  DockerService_updateConfigurationFromPolicy("DockerService@updateConfigurationFromPolicy"),
  DockerService_runHealthTests("DockerService@runHealthTests") ; 


	private String n;
	
	private DockerServiceOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
