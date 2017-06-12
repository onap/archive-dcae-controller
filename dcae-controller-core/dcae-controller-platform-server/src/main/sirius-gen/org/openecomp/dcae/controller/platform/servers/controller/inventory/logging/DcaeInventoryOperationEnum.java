
package org.openecomp.dcae.controller.platform.servers.controller.inventory.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum DcaeInventoryOperationEnum implements EcompOperationEnum {

  DcaeInventory_getDcaeServiceTypes("DcaeInventory@getDcaeServiceTypes"),
  DcaeInventory_deleteDcaeServiceTypesType("DcaeInventory@deleteDcaeServiceTypesType"),
  DcaeInventory_getDcaeServiceTypesType("DcaeInventory@getDcaeServiceTypesType"),
  DcaeInventory_createDcaeServiceTypesTypeName("DcaeInventory@createDcaeServiceTypesTypeName"),
  DcaeInventory_getDcaeServices("DcaeInventory@getDcaeServices"),
  DcaeInventory_getDcaeServicesGroupbyPropertyName("DcaeInventory@getDcaeServicesGroupbyPropertyName"),
  DcaeInventory_deleteDcaeServicesService("DcaeInventory@deleteDcaeServicesService"),
  DcaeInventory_getDcaeServicesService("DcaeInventory@getDcaeServicesService"),
  DcaeInventory_createDcaeServicesService("DcaeInventory@createDcaeServicesService"),
  DcaeInventory_poll("DcaeInventory@poll"),
  DcaeInventory_updateConfiguration("DcaeInventory@updateConfiguration") ; 


	private String n;
	
	private DcaeInventoryOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
