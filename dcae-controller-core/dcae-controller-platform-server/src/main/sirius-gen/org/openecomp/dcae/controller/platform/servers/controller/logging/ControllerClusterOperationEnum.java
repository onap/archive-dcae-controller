
package org.openecomp.dcae.controller.platform.servers.controller.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum ControllerClusterOperationEnum implements EcompOperationEnum {

  ControllerCluster_pushData("ControllerCluster@pushData"),
  ControllerCluster_receiveData("ControllerCluster@receiveData") ; 


	private String n;
	
	private ControllerClusterOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
