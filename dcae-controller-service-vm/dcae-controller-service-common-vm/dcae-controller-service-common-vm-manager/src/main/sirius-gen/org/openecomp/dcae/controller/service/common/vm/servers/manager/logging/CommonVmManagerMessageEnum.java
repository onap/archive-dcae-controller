
package org.openecomp.dcae.controller.service.common.vm.servers.manager.logging;

import com.att.eelf.i18n.EELFResourceManager;
import org.openecomp.logger.EcompMessageEnum;

public enum CommonVmManagerMessageEnum implements EcompMessageEnum {

  dummy,
  REQUEST_FAILED_test,
  REQUEST_FAILED_suspend,
  REQUEST_FAILED_resume,
  REQUEST_FAILED_publicKey,
  REQUEST_FAILED_configurationChanged,
  REQUEST_FAILED_updateStreams,
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
  REMOTE_CALL_FAILED_test,
  REMOTE_CALL_FAILED_suspend,
  REMOTE_CALL_FAILED_resume,
  REMOTE_CALL_FAILED_publicKey,
  REMOTE_CALL_FAILED_configurationChanged,
  REMOTE_CALL_FAILED_updateStreams,
  REMOTE_CALL_FAILED_logs,
  REMOTE_CALL_FAILED_metrics,
  REMOTE_CALL_FAILED_properties,
  REMOTE_CALL_FAILED_uploadInfo,
  REMOTE_CALL_FAILED_getValues,
  REMOTE_CALL_FAILED_getValuesAll,
  REMOTE_CALL_FAILED_getMessages,
  REMOTE_CALL_FAILED_getRequestLogger,
  REMOTE_CALL_FAILED_evaluate,
  REMOTE_CALL_FAILED_update;

	static {
		EELFResourceManager.loadMessageBundle("org/openecomp/dcae/controller/service/common/vm/servers/manager/logging/CommonVmManager");
	}
}
