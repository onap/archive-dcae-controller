
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
package org.openecomp.dcae.controller.service.cdap.cluster.manager.tools;

import java.io.IOException;

import org.openecomp.dcae.controller.service.cdap.cluster.manager.CdapClusterManager;
import org.openecomp.dcae.controller.service.cdap.cluster.manager.ManagerFactory;
import org.openecomp.dcae.controller.service.cdap.cluster.servers.manager.DcaeCdapClusterManagerConsole;
import org.openecomp.dcae.controller.service.cdap.cluster.servers.manager.DcaeManagerFactory;
import org.openecomp.ncomp.cdap.CdapCluster;
import org.openecomp.ncomp.servers.cdap.CdapCdapCluster;
import org.openecomp.ncomp.servers.cdap.CdapCdapFactory;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;


public class TestRemoteManager implements ISiriusServer {

	public static void main(String[] args) throws IOException {
		TestRemoteManager t = new TestRemoteManager();
		t.test();
	}
	private ManagementServer server;
	public void test() throws IOException {
		DcaeCdapClusterManagerConsole console = 
				new DcaeCdapClusterManagerConsole("console.properties", "remote");
		console.createNamespace("foobar");
	}
	@Override
	public ManagementServer getServer() {
		return server;
	}

}
