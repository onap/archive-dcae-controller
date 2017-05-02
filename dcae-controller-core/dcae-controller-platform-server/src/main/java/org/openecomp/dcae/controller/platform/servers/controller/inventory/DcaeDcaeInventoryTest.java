package org.openecomp.dcae.controller.platform.servers.controller.inventory;

import org.openecomp.dcae.controller.inventory.DcaeInventory;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;

public class DcaeDcaeInventoryTest implements ISiriusServer {

	public static void main(String[] args) {
		DcaeDcaeInventoryTest server = new DcaeDcaeInventoryTest();
		DcaeInventoryFactory f = new DcaeInventoryFactory(server);
		DcaeInventory inv = f.createDcaeInventory();
		inv.poll();
	}

	private ManagementServer server = new ManagementServer();

	@Override
	public ManagementServer getServer() {
		return server;
	}

}
