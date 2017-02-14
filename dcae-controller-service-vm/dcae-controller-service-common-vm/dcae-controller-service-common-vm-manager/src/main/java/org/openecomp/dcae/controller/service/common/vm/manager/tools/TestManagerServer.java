
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
	
package org.openecomp.dcae.controller.service.common.vm.manager.tools;

import java.io.File;
import java.io.IOException;
import java.util.TimeZone;

import org.json.JSONObject;

import org.openecomp.dcae.controller.service.common.vm.servers.manager.DcaeCommonVmManagerConsole;
import org.openecomp.dcae.controller.service.common.vm.servers.manager.DcaeCommonVmManagerServer;
import org.openecomp.dcae.controller.service.common.vm.servers.service.DcaeServiceFactory;
import org.openecomp.dcae.controller.service.common.vm.service.ServiceFactory;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.webservice.utils.FileUtils;

// Testing manager from inside standard Java Process
// Manager process and Test Process in the same Java JVM in the different threads
// Manager thread is starting HTTP server end point.
// Testing thread (or other external clients) can use the manager.
public class TestManagerServer implements ISiriusServer {

	public static void main(String[] args) throws IOException {
		TestManagerServer t = new TestManagerServer();
		t.test();
	}

	private ManagementServer server;

	public void test() throws IOException {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
		File dir = new File("data");
		if (dir.exists())
			FileUtils.deleteDirectory(dir);
		final DcaeCommonVmManagerServer s = new DcaeCommonVmManagerServer("manager.properties");
		Thread t = new Thread("CommonVm host server") {
			@Override
			public void run() {
				try {
					s.runWebserver();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t.start();
		DcaeCommonVmManagerConsole c = 
				new DcaeCommonVmManagerConsole("console.properties", "localhost");
		// ManagerFactory f1 = new DcaeManagerFactory(this);
		ServiceFactory f2 = new DcaeServiceFactory(this);
//		ContrailController x = f2.createContrailController();
//		x.setContrailIp("1.2.3.4");
//		c.create("/localControllers/local1", x);
//		JSONObject j = (JSONObject) c.list("/", 100);
//		System.err.println(j.toString(2));
//		x.setContrailIp("1.2.3.5");
//		c.update("/localControllers/local1", x);
//		j = (JSONObject) c.list("/", 100);
//		System.err.println(j.toString(2));
//		c.restart();
//		c.hello_manager("hi");
	}

	public ManagementServer getServer() {
		return server;
	}

}
