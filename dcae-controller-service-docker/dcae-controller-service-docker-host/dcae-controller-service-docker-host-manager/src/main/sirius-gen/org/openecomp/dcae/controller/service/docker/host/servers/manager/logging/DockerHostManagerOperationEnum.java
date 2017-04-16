
package org.openecomp.dcae.controller.service.docker.host.servers.manager.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum DockerHostManagerOperationEnum implements EcompOperationEnum {

  DockerHostManager_test("DockerHostManager@test"),
  DockerHostManager_suspend("DockerHostManager@suspend"),
  DockerHostManager_resume("DockerHostManager@resume"),
  DockerHostManager_publicKey("DockerHostManager@publicKey"),
  DockerHostManager_configurationChanged("DockerHostManager@configurationChanged"),
  DockerHostManager_updateStreams("DockerHostManager@updateStreams"),
  DockerHostManager_logs("DockerHostManager@logs"),
  DockerHostManager_metrics("DockerHostManager@metrics"),
  DockerHostManager_properties("DockerHostManager@properties"),
  DockerHostManager_uploadInfo("DockerHostManager@uploadInfo"),
  DockerHostManager_getValues("DockerHostManager@getValues"),
  DockerHostManager_getValuesAll("DockerHostManager@getValuesAll"),
  DockerHostManager_getMessages("DockerHostManager@getMessages"),
  DockerHostManager_getRequestLogger("DockerHostManager@getRequestLogger"),
  DockerHostManager_evaluate("DockerHostManager@evaluate"),
  DockerHostManager_update("DockerHostManager@update"),
  DockerHostManager_updateContainerConfiguration("DockerHostManager@updateContainerConfiguration"),
  DockerHostManager_suspendContainer("DockerHostManager@suspendContainer"),
  DockerHostManager_resumeContainer("DockerHostManager@resumeContainer"),
  DockerHostManager_testContainer("DockerHostManager@testContainer"),
  DockerHostManager_setupConfiguration("DockerHostManager@setupConfiguration") ; 


	private String n;
	
	private DockerHostManagerOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
