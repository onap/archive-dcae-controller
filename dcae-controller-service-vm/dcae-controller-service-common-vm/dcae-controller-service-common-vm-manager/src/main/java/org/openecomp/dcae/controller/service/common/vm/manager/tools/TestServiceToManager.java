
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

import org.openecomp.dcae.controller.service.common.vm.servers.service.DcaeServiceFactory;
import org.openecomp.dcae.controller.service.common.vm.service.CommonVmService;
import org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceConfiguration;
import org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance;
import org.openecomp.dcae.controller.service.common.vm.service.ServiceFactory;
import org.openecomp.dcae.controller.service.common.vm.service.TommyVmService;
import org.openecomp.dcae.controller.service.common.vm.service.TommyVmServiceConfiguration;
import org.openecomp.dcae.controller.service.vm.PhysicalMachine;
import org.openecomp.dcae.controller.service.vm.VmFactory;

// Testing service from inside standard Java Process
// This connects to a manager server 
public class TestServiceToManager {

	public static void main(String[] args) {
		ServiceFactory f = new DcaeServiceFactory(null);
		CommonVmService s = f.createCommonVmService();
		CommonVmServiceInstance i = f.createCommonVmServiceInstance();
		s.getInstances().add(i);
		i.setName("myInstance");
		PhysicalMachine p = VmFactory.eINSTANCE.createPhysicalMachine();
		i.getServers().add(p);
		// Setup connection parameters.
		p.setPublicIp("localhost");
		p.setManagerPortNumber(9802);
		s.pollManagerConfiguration(i.getName());
		TommyVmServiceConfiguration c = ServiceFactory.eINSTANCE.createTommyVmServiceConfiguration();
		c.setPortgresJdbc("dafdf");
		// TODO more examples
		i.setVmConfiguration(c);
		i.setScript("/home/vagrant/log.sh");
		s.pushManagerConfiguration(i.getName());
	}

}
