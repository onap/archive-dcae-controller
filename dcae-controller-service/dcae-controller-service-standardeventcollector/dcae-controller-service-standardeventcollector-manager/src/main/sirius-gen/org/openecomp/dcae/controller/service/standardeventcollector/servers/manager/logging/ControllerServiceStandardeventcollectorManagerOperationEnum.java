
package org.openecomp.dcae.controller.service.standardeventcollector.servers.manager.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum ControllerServiceStandardeventcollectorManagerOperationEnum implements EcompOperationEnum {

  ControllerServiceStandardeventcollectorManager_test("ControllerServiceStandardeventcollectorManager@test"),
  ControllerServiceStandardeventcollectorManager_suspend("ControllerServiceStandardeventcollectorManager@suspend"),
  ControllerServiceStandardeventcollectorManager_resume("ControllerServiceStandardeventcollectorManager@resume"),
  ControllerServiceStandardeventcollectorManager_publicKey("ControllerServiceStandardeventcollectorManager@publicKey"),
  ControllerServiceStandardeventcollectorManager_configurationChanged("ControllerServiceStandardeventcollectorManager@configurationChanged"),
  ControllerServiceStandardeventcollectorManager_updateStreams("ControllerServiceStandardeventcollectorManager@updateStreams") ; 


	private String n;
	
	private ControllerServiceStandardeventcollectorManagerOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
