
package org.openecomp.dcae.controller.platform.servers.controller.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum ControllerVirtualMachineServiceOperationEnum implements EcompOperationEnum {

  ControllerVirtualMachineService_deploy("ControllerVirtualMachineService@deploy"),
  ControllerVirtualMachineService_undeploy("ControllerVirtualMachineService@undeploy"),
  ControllerVirtualMachineService_test("ControllerVirtualMachineService@test"),
  ControllerVirtualMachineService_suspend("ControllerVirtualMachineService@suspend"),
  ControllerVirtualMachineService_resume("ControllerVirtualMachineService@resume"),
  ControllerVirtualMachineService_pushManagerConfiguration("ControllerVirtualMachineService@pushManagerConfiguration"),
  ControllerVirtualMachineService_pollManagerConfiguration("ControllerVirtualMachineService@pollManagerConfiguration"),
  ControllerVirtualMachineService_managerConfiguration("ControllerVirtualMachineService@managerConfiguration"),
  ControllerVirtualMachineService_managerOperation("ControllerVirtualMachineService@managerOperation"),
  ControllerVirtualMachineService_updateConfigurationFromPolicy("ControllerVirtualMachineService@updateConfigurationFromPolicy"),
  ControllerVirtualMachineService_runHealthTests("ControllerVirtualMachineService@runHealthTests"),
  ControllerVirtualMachineService_updateDeploymentStatus("ControllerVirtualMachineService@updateDeploymentStatus") ; 


	private String n;
	
	private ControllerVirtualMachineServiceOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
