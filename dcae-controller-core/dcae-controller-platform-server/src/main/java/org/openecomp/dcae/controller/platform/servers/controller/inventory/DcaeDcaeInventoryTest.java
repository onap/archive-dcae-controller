package org.openecomp.dcae.controller.platform.servers.controller.inventory;

import org.openecomp.dcae.controller.inventory.DcaeInventory;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;

public class DcaeDcaeInventoryTest implements ISiriusServer {
    private ManagementServer server = new ManagementServer();

    public static void main(String[] args) {
        DcaeDcaeInventoryTest server = new DcaeDcaeInventoryTest();
        DcaeInventoryFactory f = new DcaeInventoryFactory(server);
        DcaeInventory inv = f.createDcaeInventory();
        inv.poll();
    }

    @Override
    public ManagementServer getServer() {
        return server;
    }
}
