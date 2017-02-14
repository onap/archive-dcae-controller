
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
	
package org.openecomp.dcae.controller.service.docker.manager.tools;

import org.openecomp.dcae.controller.core.server.ServerFactory;
import org.openecomp.dcae.controller.service.docker.DockerFactory;
import org.openecomp.dcae.controller.service.docker.DockerService;
import org.openecomp.dcae.controller.service.docker.DockerServiceInstance;
import org.openecomp.dcae.controller.service.docker.host.servers.manager.DcaeManagerFactory;
import org.openecomp.dcae.controller.service.docker.host.servers.service.DcaeServiceFactory;
import org.openecomp.dcae.controller.service.docker.host.service.DockerHostService;
import org.openecomp.dcae.controller.service.docker.host.service.DockerHostServiceInstance;
import org.openecomp.dcae.controller.service.docker.host.service.ServiceFactory;
import org.openecomp.dcae.controller.service.servers.docker.DcaeDockerFactory;
import org.openecomp.dcae.controller.service.vm.PhysicalMachine;
import org.openecomp.dcae.controller.service.vm.VmFactory;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;

// Testing service from inside standard Java Process
// This connects to a manager server 
public class TestServiceToManager implements ISiriusServer {

	public static void main(String[] args) {
		TestServiceToManager t = new TestServiceToManager();
		t.test();
	}
	private ManagementServer server;
	public void test() {
		// setup docker host
		server = new ManagementServer();
		
		DcaeServiceFactory f1 = new DcaeServiceFactory(this);
		DockerHostService s1 = f1.createDockerHostService();
		DockerHostServiceInstance i1 = f1.createDockerHostServiceInstance();
		PhysicalMachine p = VmFactory.eINSTANCE.createPhysicalMachine();
		i1.getServers().add(p);
		s1.getInstances().add(i1);
		i1.setName("dh-i1");
		s1.setName("dh-s1");
		// Setup connection parameters.
		p.setPublicIp("localhost");
		p.setManagerPortNumber(9911);
		// setup docker service instance
		DockerFactory f = new DcaeDockerFactory(this);
		DockerService s = f.createDockerService();
		DockerServiceInstance i = f.createDockerServiceInstance();
		s.getInstances().add(i);
		i.setName("d-i");
		s.setName("d-s");
		String dockerRegistry = "cdf-2.novalocal:8453";
		String dockerImage = "dockerdemo_test5";
		String dockerImageTag = "1.0.2";
		String image = dockerRegistry + "/" + dockerImage + ":" + dockerImageTag;	
		i.setImage(image);
//		s.pollManagerConfiguration("docker");
		server.setObject(s1);
		s.deploy(i.getName(), "/instances/" + i1.getName());
		// TODO more examples
	}
	@Override
	public ManagementServer getServer() {
		// TODO Auto-generated method stub
		return server;
	}

}
