
package org.openecomp.dcae.controller.service.servers.cdap.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum CdapServiceOperationEnum implements EcompOperationEnum {

  CdapService_deploy("CdapService@deploy"),
  CdapService_undeploy("CdapService@undeploy"),
  CdapService_test("CdapService@test"),
  CdapService_suspend("CdapService@suspend"),
  CdapService_resume("CdapService@resume"),
  CdapService_pushManagerConfiguration("CdapService@pushManagerConfiguration"),
  CdapService_pollManagerConfiguration("CdapService@pollManagerConfiguration"),
  CdapService_managerConfiguration("CdapService@managerConfiguration"),
  CdapService_managerOperation("CdapService@managerOperation"),
  CdapService_updateConfigurationFromPolicy("CdapService@updateConfigurationFromPolicy"),
  CdapService_runHealthTests("CdapService@runHealthTests"),
  CdapService_updateInstanceConfiguration("CdapService@updateInstanceConfiguration") ; 


	private String n;
	
	private CdapServiceOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
