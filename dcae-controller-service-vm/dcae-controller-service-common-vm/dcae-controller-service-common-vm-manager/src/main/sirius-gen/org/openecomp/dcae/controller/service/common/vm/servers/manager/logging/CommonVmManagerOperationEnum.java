
package org.openecomp.dcae.controller.service.common.vm.servers.manager.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum CommonVmManagerOperationEnum implements EcompOperationEnum {

  CommonVmManager_test("CommonVmManager@test"),
  CommonVmManager_suspend("CommonVmManager@suspend"),
  CommonVmManager_resume("CommonVmManager@resume"),
  CommonVmManager_publicKey("CommonVmManager@publicKey"),
  CommonVmManager_configurationChanged("CommonVmManager@configurationChanged"),
  CommonVmManager_updateStreams("CommonVmManager@updateStreams"),
  CommonVmManager_logs("CommonVmManager@logs"),
  CommonVmManager_metrics("CommonVmManager@metrics"),
  CommonVmManager_properties("CommonVmManager@properties"),
  CommonVmManager_uploadInfo("CommonVmManager@uploadInfo"),
  CommonVmManager_getValues("CommonVmManager@getValues"),
  CommonVmManager_getValuesAll("CommonVmManager@getValuesAll"),
  CommonVmManager_getMessages("CommonVmManager@getMessages"),
  CommonVmManager_getRequestLogger("CommonVmManager@getRequestLogger"),
  CommonVmManager_evaluate("CommonVmManager@evaluate"),
  CommonVmManager_update("CommonVmManager@update") ; 


	private String n;
	
	private CommonVmManagerOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
