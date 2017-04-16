
package org.openecomp.dcae.controller.service.dmaap.drsub.servers.service.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum ControllerServiceDmaapDrsubServiceOperationEnum implements EcompOperationEnum {

  ControllerServiceDmaapDrsubService_deploy("ControllerServiceDmaapDrsubService@deploy"),
  ControllerServiceDmaapDrsubService_undeploy("ControllerServiceDmaapDrsubService@undeploy"),
  ControllerServiceDmaapDrsubService_test("ControllerServiceDmaapDrsubService@test"),
  ControllerServiceDmaapDrsubService_suspend("ControllerServiceDmaapDrsubService@suspend"),
  ControllerServiceDmaapDrsubService_resume("ControllerServiceDmaapDrsubService@resume"),
  ControllerServiceDmaapDrsubService_pushManagerConfiguration("ControllerServiceDmaapDrsubService@pushManagerConfiguration"),
  ControllerServiceDmaapDrsubService_pollManagerConfiguration("ControllerServiceDmaapDrsubService@pollManagerConfiguration"),
  ControllerServiceDmaapDrsubService_managerConfiguration("ControllerServiceDmaapDrsubService@managerConfiguration"),
  ControllerServiceDmaapDrsubService_managerOperation("ControllerServiceDmaapDrsubService@managerOperation"),
  ControllerServiceDmaapDrsubService_updateConfigurationFromPolicy("ControllerServiceDmaapDrsubService@updateConfigurationFromPolicy"),
  ControllerServiceDmaapDrsubService_runHealthTests("ControllerServiceDmaapDrsubService@runHealthTests"),
  ControllerServiceDmaapDrsubService_updateDeploymentStatus("ControllerServiceDmaapDrsubService@updateDeploymentStatus") ; 


	private String n;
	
	private ControllerServiceDmaapDrsubServiceOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
