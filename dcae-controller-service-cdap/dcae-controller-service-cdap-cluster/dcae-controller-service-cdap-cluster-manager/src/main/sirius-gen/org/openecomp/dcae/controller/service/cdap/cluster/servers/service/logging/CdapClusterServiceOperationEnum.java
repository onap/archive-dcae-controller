
package org.openecomp.dcae.controller.service.cdap.cluster.servers.service.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum CdapClusterServiceOperationEnum implements EcompOperationEnum {

  CdapClusterService_deploy("CdapClusterService@deploy"),
  CdapClusterService_undeploy("CdapClusterService@undeploy"),
  CdapClusterService_test("CdapClusterService@test"),
  CdapClusterService_suspend("CdapClusterService@suspend"),
  CdapClusterService_resume("CdapClusterService@resume"),
  CdapClusterService_pushManagerConfiguration("CdapClusterService@pushManagerConfiguration"),
  CdapClusterService_pollManagerConfiguration("CdapClusterService@pollManagerConfiguration"),
  CdapClusterService_managerConfiguration("CdapClusterService@managerConfiguration"),
  CdapClusterService_managerOperation("CdapClusterService@managerOperation"),
  CdapClusterService_updateConfigurationFromPolicy("CdapClusterService@updateConfigurationFromPolicy"),
  CdapClusterService_runHealthTests("CdapClusterService@runHealthTests"),
  CdapClusterService_updateDeploymentStatus("CdapClusterService@updateDeploymentStatus") ; 


	private String n;
	
	private CdapClusterServiceOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
