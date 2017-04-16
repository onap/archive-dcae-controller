
package org.openecomp.dcae.controller.platform.servers.controller.logging;

import com.att.eelf.i18n.EELFResourceManager;
import org.openecomp.logger.EcompMessageEnum;

public enum ControllerClusterMessageEnum implements EcompMessageEnum {

  dummy,
  REQUEST_FAILED_pushData,
  REQUEST_FAILED_receiveData,
  REMOTE_CALL_FAILED_pushData,
  REMOTE_CALL_FAILED_receiveData;

	static {
		EELFResourceManager.loadMessageBundle("org/openecomp/dcae/controller/platform/servers/controller/logging/ControllerCluster");
	}
}
