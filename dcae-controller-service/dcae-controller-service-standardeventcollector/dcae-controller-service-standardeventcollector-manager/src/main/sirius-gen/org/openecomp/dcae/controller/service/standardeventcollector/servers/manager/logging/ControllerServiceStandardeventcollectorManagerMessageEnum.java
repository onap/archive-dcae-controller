
package org.openecomp.dcae.controller.service.standardeventcollector.servers.manager.logging;

import com.att.eelf.i18n.EELFResourceManager;
import org.openecomp.logger.EcompMessageEnum;

public enum ControllerServiceStandardeventcollectorManagerMessageEnum implements EcompMessageEnum {

  dummy,
  REQUEST_FAILED_test,
  REQUEST_FAILED_suspend,
  REQUEST_FAILED_resume,
  REQUEST_FAILED_publicKey,
  REQUEST_FAILED_configurationChanged,
  REQUEST_FAILED_updateStreams,
  REMOTE_CALL_FAILED_test,
  REMOTE_CALL_FAILED_suspend,
  REMOTE_CALL_FAILED_resume,
  REMOTE_CALL_FAILED_publicKey,
  REMOTE_CALL_FAILED_configurationChanged,
  REMOTE_CALL_FAILED_updateStreams;

	static {
		EELFResourceManager.loadMessageBundle("org/openecomp/dcae/controller/service/standardeventcollector/servers/manager/logging/ControllerServiceStandardeventcollectorManager");
	}
}
