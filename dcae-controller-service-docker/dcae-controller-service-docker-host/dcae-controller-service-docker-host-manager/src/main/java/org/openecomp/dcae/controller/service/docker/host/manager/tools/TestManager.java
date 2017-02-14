
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
	
package org.openecomp.dcae.controller.service.docker.host.manager.tools;

import java.io.IOException;

import org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager;
import org.openecomp.dcae.controller.service.docker.host.manager.DockerManager;
import org.openecomp.dcae.controller.service.docker.host.manager.ManagerFactory;
import org.openecomp.dcae.controller.service.docker.host.servers.manager.DcaeManagerFactory;
import org.openecomp.ncomp.docker.DockerFactory;
import org.openecomp.ncomp.docker.DockerHost;
import org.openecomp.ncomp.servers.docker.DockerDockerFactory;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;


public class TestManager implements ISiriusServer {

	public static void main(String[] args) throws IOException {
		TestManager t = new TestManager();
		t.test();
	}
	private ManagementServer server;
	public void test() throws IOException {
		server = new ManagementServer(null, null, null, "manager.properties");
		ManagerFactory f = new DcaeManagerFactory(this);
		server.addFactory(f);
		DockerHostManager m = f.createDockerHostManager();
		server.setObject(m);
		DockerFactory f2 = new DockerDockerFactory(this);
		DockerHost h = f2.createDockerHost();
		m.setDockerHost(h);
//		h.setUrl("http://10.0.2.2:6902");
		h.setUrl("https://cdf-2.novalocal:4243");
//		server.start();
//		h.poll();
		String dockerRegistry = "cdf-2.novalocal:8453";
		String dockerImage = "dockerdemo_test5";
		String dockerImageTag = "1.0.2";
		String image = dockerRegistry + "/" + dockerImage + ":" + dockerImageTag;	
		h.dockerRunWithName(image, "hithere33");
	}
	@Override
	public ManagementServer getServer() {
		return server;
	}

}
