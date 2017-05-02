
package org.openecomp.dcae.controller.platform.servers.controller.inventory.logging;

import com.att.eelf.i18n.EELFResourceManager;
import org.openecomp.logger.EcompMessageEnum;

public enum DcaeInventoryMessageEnum implements EcompMessageEnum {

  dummy,
  REQUEST_FAILED_getDcaeServiceTypes,
  REQUEST_FAILED_deleteDcaeServiceTypesType,
  REQUEST_FAILED_getDcaeServiceTypesType,
  REQUEST_FAILED_createDcaeServiceTypesTypeName,
  REQUEST_FAILED_getDcaeServices,
  REQUEST_FAILED_getDcaeServicesGroupbyPropertyName,
  REQUEST_FAILED_deleteDcaeServicesService,
  REQUEST_FAILED_getDcaeServicesService,
  REQUEST_FAILED_createDcaeServicesService,
  REQUEST_FAILED_poll,
  REMOTE_CALL_FAILED_getDcaeServiceTypes,
  REMOTE_CALL_FAILED_deleteDcaeServiceTypesType,
  REMOTE_CALL_FAILED_getDcaeServiceTypesType,
  REMOTE_CALL_FAILED_createDcaeServiceTypesTypeName,
  REMOTE_CALL_FAILED_getDcaeServices,
  REMOTE_CALL_FAILED_getDcaeServicesGroupbyPropertyName,
  REMOTE_CALL_FAILED_deleteDcaeServicesService,
  REMOTE_CALL_FAILED_getDcaeServicesService,
  REMOTE_CALL_FAILED_createDcaeServicesService,
  REMOTE_CALL_FAILED_poll;

	static {
		EELFResourceManager.loadMessageBundle("org/openecomp/dcae/controller/platform/servers/controller/inventory/logging/DcaeInventory");
	}
}
