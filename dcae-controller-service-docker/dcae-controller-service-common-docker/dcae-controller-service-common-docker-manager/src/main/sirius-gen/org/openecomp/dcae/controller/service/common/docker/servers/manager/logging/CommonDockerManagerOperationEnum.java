
package org.openecomp.dcae.controller.service.common.docker.servers.manager.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum CommonDockerManagerOperationEnum implements EcompOperationEnum {

  CommonDockerManager_test("CommonDockerManager@test"),
  CommonDockerManager_suspend("CommonDockerManager@suspend"),
  CommonDockerManager_resume("CommonDockerManager@resume"),
  CommonDockerManager_publicKey("CommonDockerManager@publicKey"),
  CommonDockerManager_configurationChanged("CommonDockerManager@configurationChanged"),
  CommonDockerManager_updateStreams("CommonDockerManager@updateStreams") ; 


	private String n;
	
	private CommonDockerManagerOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
