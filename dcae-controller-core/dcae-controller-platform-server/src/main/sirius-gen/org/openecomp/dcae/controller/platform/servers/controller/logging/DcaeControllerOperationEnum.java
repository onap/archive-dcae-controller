
package org.openecomp.dcae.controller.platform.servers.controller.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum DcaeControllerOperationEnum implements EcompOperationEnum {

  HEALTHCHECK("HEALTHCHECK"),
  POLICY_POLLING("POLICY_POLLING"),
  DATABUS_POLLING("DATABUS_POLLING"),
  INVENTORY_POLLING("INVENTORY_POLLING"),
  CLUSTER_DATA_REPLICATION("CLUSTER_DATA_REPLICATION") ; 


	private String n;
	
	private DcaeControllerOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
