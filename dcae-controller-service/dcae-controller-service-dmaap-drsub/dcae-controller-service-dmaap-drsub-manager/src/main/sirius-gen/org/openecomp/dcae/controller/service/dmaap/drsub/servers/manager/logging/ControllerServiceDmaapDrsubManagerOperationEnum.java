
package org.openecomp.dcae.controller.service.dmaap.drsub.servers.manager.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum ControllerServiceDmaapDrsubManagerOperationEnum implements EcompOperationEnum {

  ControllerServiceDmaapDrsubManager_test("ControllerServiceDmaapDrsubManager@test"),
  ControllerServiceDmaapDrsubManager_suspend("ControllerServiceDmaapDrsubManager@suspend"),
  ControllerServiceDmaapDrsubManager_resume("ControllerServiceDmaapDrsubManager@resume"),
  ControllerServiceDmaapDrsubManager_publicKey("ControllerServiceDmaapDrsubManager@publicKey"),
  ControllerServiceDmaapDrsubManager_configurationChanged("ControllerServiceDmaapDrsubManager@configurationChanged"),
  ControllerServiceDmaapDrsubManager_updateStreams("ControllerServiceDmaapDrsubManager@updateStreams"),
  ControllerServiceDmaapDrsubManager_logs("ControllerServiceDmaapDrsubManager@logs"),
  ControllerServiceDmaapDrsubManager_metrics("ControllerServiceDmaapDrsubManager@metrics"),
  ControllerServiceDmaapDrsubManager_properties("ControllerServiceDmaapDrsubManager@properties"),
  ControllerServiceDmaapDrsubManager_uploadInfo("ControllerServiceDmaapDrsubManager@uploadInfo"),
  ControllerServiceDmaapDrsubManager_getValues("ControllerServiceDmaapDrsubManager@getValues"),
  ControllerServiceDmaapDrsubManager_getValuesAll("ControllerServiceDmaapDrsubManager@getValuesAll"),
  ControllerServiceDmaapDrsubManager_getMessages("ControllerServiceDmaapDrsubManager@getMessages"),
  ControllerServiceDmaapDrsubManager_getRequestLogger("ControllerServiceDmaapDrsubManager@getRequestLogger"),
  ControllerServiceDmaapDrsubManager_evaluate("ControllerServiceDmaapDrsubManager@evaluate"),
  ControllerServiceDmaapDrsubManager_update("ControllerServiceDmaapDrsubManager@update") ; 


	private String n;
	
	private ControllerServiceDmaapDrsubManagerOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
