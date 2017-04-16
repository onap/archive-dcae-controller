
package org.openecomp.dcae.controller.service.servers.cdapmanager.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum CdapManagerOperationEnum implements EcompOperationEnum {

  CdapManager_test("CdapManager@test"),
  CdapManager_suspend("CdapManager@suspend"),
  CdapManager_resume("CdapManager@resume"),
  CdapManager_publicKey("CdapManager@publicKey"),
  CdapManager_configurationChanged("CdapManager@configurationChanged"),
  CdapManager_updateStreams("CdapManager@updateStreams") ; 


	private String n;
	
	private CdapManagerOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
