
package org.openecomp.dcae.controller.service.servers.vm.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum VirtualMachineServiceOperationEnum implements EcompOperationEnum {

  VirtualMachineService_deploy("VirtualMachineService@deploy"),
  VirtualMachineService_undeploy("VirtualMachineService@undeploy"),
  VirtualMachineService_test("VirtualMachineService@test"),
  VirtualMachineService_suspend("VirtualMachineService@suspend"),
  VirtualMachineService_resume("VirtualMachineService@resume"),
  VirtualMachineService_pushManagerConfiguration("VirtualMachineService@pushManagerConfiguration"),
  VirtualMachineService_pollManagerConfiguration("VirtualMachineService@pollManagerConfiguration"),
  VirtualMachineService_managerConfiguration("VirtualMachineService@managerConfiguration"),
  VirtualMachineService_managerOperation("VirtualMachineService@managerOperation"),
  VirtualMachineService_updateConfigurationFromPolicy("VirtualMachineService@updateConfigurationFromPolicy"),
  VirtualMachineService_runHealthTests("VirtualMachineService@runHealthTests"),
  VirtualMachineService_updateDeploymentStatus("VirtualMachineService@updateDeploymentStatus") ; 


	private String n;
	
	private VirtualMachineServiceOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
