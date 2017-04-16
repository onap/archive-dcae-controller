
package org.openecomp.dcae.controller.service.docker.host.servers.service.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum DockerHostServiceOperationEnum implements EcompOperationEnum {

  DockerHostService_deploy("DockerHostService@deploy"),
  DockerHostService_undeploy("DockerHostService@undeploy"),
  DockerHostService_test("DockerHostService@test"),
  DockerHostService_suspend("DockerHostService@suspend"),
  DockerHostService_resume("DockerHostService@resume"),
  DockerHostService_pushManagerConfiguration("DockerHostService@pushManagerConfiguration"),
  DockerHostService_pollManagerConfiguration("DockerHostService@pollManagerConfiguration"),
  DockerHostService_managerConfiguration("DockerHostService@managerConfiguration"),
  DockerHostService_managerOperation("DockerHostService@managerOperation"),
  DockerHostService_updateConfigurationFromPolicy("DockerHostService@updateConfigurationFromPolicy"),
  DockerHostService_runHealthTests("DockerHostService@runHealthTests"),
  DockerHostService_updateDeploymentStatus("DockerHostService@updateDeploymentStatus") ; 


	private String n;
	
	private DockerHostServiceOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
