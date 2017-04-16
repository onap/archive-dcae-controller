
package org.openecomp.dcae.controller.platform.servers.controller.logging;

import com.att.eelf.i18n.EELFResourceManager;
import org.openecomp.logger.EcompMessageEnum;

public enum DcaeControllerMessageEnum implements EcompMessageEnum {

  HEALTHCHECK_SERVICE_FAILED,
  POLICY_POLLING_FAILED,
  DATABUS_POLLING_FAILED,
  DATABUS_UNABLE_TO_ADD_STREAM,
  CLUSTER_DATA_REPLICATION_FAILED;

	static {
		EELFResourceManager.loadMessageBundle("org/openecomp/dcae/controller/platform/servers/controller/logging/DcaeController");
	}
}
