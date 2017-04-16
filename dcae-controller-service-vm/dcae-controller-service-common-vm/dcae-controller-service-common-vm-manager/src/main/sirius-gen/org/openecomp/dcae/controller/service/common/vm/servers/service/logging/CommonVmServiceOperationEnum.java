
package org.openecomp.dcae.controller.service.common.vm.servers.service.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum CommonVmServiceOperationEnum implements EcompOperationEnum {

  CommonVmService_deploy("CommonVmService@deploy"),
  CommonVmService_undeploy("CommonVmService@undeploy"),
  CommonVmService_test("CommonVmService@test"),
  CommonVmService_suspend("CommonVmService@suspend"),
  CommonVmService_resume("CommonVmService@resume"),
  CommonVmService_pushManagerConfiguration("CommonVmService@pushManagerConfiguration"),
  CommonVmService_pollManagerConfiguration("CommonVmService@pollManagerConfiguration"),
  CommonVmService_managerConfiguration("CommonVmService@managerConfiguration"),
  CommonVmService_managerOperation("CommonVmService@managerOperation"),
  CommonVmService_updateConfigurationFromPolicy("CommonVmService@updateConfigurationFromPolicy"),
  CommonVmService_runHealthTests("CommonVmService@runHealthTests"),
  CommonVmService_updateDeploymentStatus("CommonVmService@updateDeploymentStatus") ; 


	private String n;
	
	private CommonVmServiceOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
