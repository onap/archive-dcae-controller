
package org.openecomp.dcae.controller.service.servers.dockermanager.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum DockerManagerOperationEnum implements EcompOperationEnum {

  DockerManager_test("DockerManager@test"),
  DockerManager_suspend("DockerManager@suspend"),
  DockerManager_resume("DockerManager@resume"),
  DockerManager_publicKey("DockerManager@publicKey"),
  DockerManager_configurationChanged("DockerManager@configurationChanged"),
  DockerManager_updateStreams("DockerManager@updateStreams") ; 


	private String n;
	
	private DockerManagerOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
