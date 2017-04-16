
package org.openecomp.dcae.controller.platform.servers.controller.logging;

import com.att.eelf.i18n.EELFResourceManager;
import org.openecomp.logger.EcompMessageEnum;

public enum DcaePlatformControllerMessageEnum implements EcompMessageEnum {

  dummy,
  REQUEST_FAILED_logs,
  REQUEST_FAILED_metrics,
  REQUEST_FAILED_properties,
  REQUEST_FAILED_uploadInfo,
  REQUEST_FAILED_getValues,
  REQUEST_FAILED_getValuesAll,
  REQUEST_FAILED_getMessages,
  REQUEST_FAILED_getRequestLogger,
  REQUEST_FAILED_evaluate,
  REQUEST_FAILED_update,
  REQUEST_FAILED_deployDescriptor,
  REQUEST_FAILED_refreshDataBus,
  REMOTE_CALL_FAILED_logs,
  REMOTE_CALL_FAILED_metrics,
  REMOTE_CALL_FAILED_properties,
  REMOTE_CALL_FAILED_uploadInfo,
  REMOTE_CALL_FAILED_getValues,
  REMOTE_CALL_FAILED_getValuesAll,
  REMOTE_CALL_FAILED_getMessages,
  REMOTE_CALL_FAILED_getRequestLogger,
  REMOTE_CALL_FAILED_evaluate,
  REMOTE_CALL_FAILED_update,
  REMOTE_CALL_FAILED_deployDescriptor,
  REMOTE_CALL_FAILED_refreshDataBus;

	static {
		EELFResourceManager.loadMessageBundle("org/openecomp/dcae/controller/platform/servers/controller/logging/DcaePlatformController");
	}
}
