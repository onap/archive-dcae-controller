
package org.openecomp.dcae.controller.platform.servers.controller.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum DcaePlatformControllerOperationEnum implements EcompOperationEnum {

  DcaePlatformController_logs("DcaePlatformController@logs"),
  DcaePlatformController_metrics("DcaePlatformController@metrics"),
  DcaePlatformController_properties("DcaePlatformController@properties"),
  DcaePlatformController_uploadInfo("DcaePlatformController@uploadInfo"),
  DcaePlatformController_getValues("DcaePlatformController@getValues"),
  DcaePlatformController_getValuesAll("DcaePlatformController@getValuesAll"),
  DcaePlatformController_getMessages("DcaePlatformController@getMessages"),
  DcaePlatformController_getRequestLogger("DcaePlatformController@getRequestLogger"),
  DcaePlatformController_evaluate("DcaePlatformController@evaluate"),
  DcaePlatformController_update("DcaePlatformController@update"),
  DcaePlatformController_deployDescriptor("DcaePlatformController@deployDescriptor"),
  DcaePlatformController_refreshDataBus("DcaePlatformController@refreshDataBus") ; 


	private String n;
	
	private DcaePlatformControllerOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
