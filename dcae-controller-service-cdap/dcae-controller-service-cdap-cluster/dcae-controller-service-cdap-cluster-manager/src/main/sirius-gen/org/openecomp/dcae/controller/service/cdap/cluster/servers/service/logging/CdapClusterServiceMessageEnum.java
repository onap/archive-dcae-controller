
package org.openecomp.dcae.controller.service.cdap.cluster.servers.service.logging;

import com.att.eelf.i18n.EELFResourceManager;
import org.openecomp.logger.EcompMessageEnum;

public enum CdapClusterServiceMessageEnum implements EcompMessageEnum {

  dummy,
  REQUEST_FAILED_deploy,
  REQUEST_FAILED_undeploy,
  REQUEST_FAILED_test,
  REQUEST_FAILED_suspend,
  REQUEST_FAILED_resume,
  REQUEST_FAILED_pushManagerConfiguration,
  REQUEST_FAILED_pollManagerConfiguration,
  REQUEST_FAILED_managerConfiguration,
  REQUEST_FAILED_managerOperation,
  REQUEST_FAILED_updateConfigurationFromPolicy,
  REQUEST_FAILED_runHealthTests,
  REQUEST_FAILED_updateDeploymentStatus,
  REMOTE_CALL_FAILED_deploy,
  REMOTE_CALL_FAILED_undeploy,
  REMOTE_CALL_FAILED_test,
  REMOTE_CALL_FAILED_suspend,
  REMOTE_CALL_FAILED_resume,
  REMOTE_CALL_FAILED_pushManagerConfiguration,
  REMOTE_CALL_FAILED_pollManagerConfiguration,
  REMOTE_CALL_FAILED_managerConfiguration,
  REMOTE_CALL_FAILED_managerOperation,
  REMOTE_CALL_FAILED_updateConfigurationFromPolicy,
  REMOTE_CALL_FAILED_runHealthTests,
  REMOTE_CALL_FAILED_updateDeploymentStatus;

	static {
		EELFResourceManager.loadMessageBundle("org/openecomp/dcae/controller/service/cdap/cluster/servers/service/logging/CdapClusterService");
	}
}
