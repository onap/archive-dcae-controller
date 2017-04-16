
package org.openecomp.dcae.controller.service.servers.vmmanager.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum VirtualMachineManagerOperationEnum implements EcompOperationEnum {

  VirtualMachineManager_test("VirtualMachineManager@test"),
  VirtualMachineManager_suspend("VirtualMachineManager@suspend"),
  VirtualMachineManager_resume("VirtualMachineManager@resume"),
  VirtualMachineManager_publicKey("VirtualMachineManager@publicKey"),
  VirtualMachineManager_configurationChanged("VirtualMachineManager@configurationChanged"),
  VirtualMachineManager_updateStreams("VirtualMachineManager@updateStreams"),
  VirtualMachineManager_logs("VirtualMachineManager@logs"),
  VirtualMachineManager_metrics("VirtualMachineManager@metrics"),
  VirtualMachineManager_properties("VirtualMachineManager@properties"),
  VirtualMachineManager_uploadInfo("VirtualMachineManager@uploadInfo"),
  VirtualMachineManager_getValues("VirtualMachineManager@getValues"),
  VirtualMachineManager_getValuesAll("VirtualMachineManager@getValuesAll"),
  VirtualMachineManager_getMessages("VirtualMachineManager@getMessages"),
  VirtualMachineManager_getRequestLogger("VirtualMachineManager@getRequestLogger"),
  VirtualMachineManager_evaluate("VirtualMachineManager@evaluate"),
  VirtualMachineManager_update("VirtualMachineManager@update") ; 


	private String n;
	
	private VirtualMachineManagerOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
