
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

import org.openecomp.dcae.controller.service.cdap.cluster.servers.service.DcaeServiceFactory;
import org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterService;
import org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterServiceInstance;
import org.openecomp.dcae.controller.service.cdap.cluster.service.ServiceFactory;
import org.openecomp.dcae.controller.service.vm.PhysicalMachine;
import org.openecomp.dcae.controller.service.vm.VmFactory;

public class TestServiceToManager {

	public static void main(String[] args) {
		ServiceFactory f = new DcaeServiceFactory(null);
		CdapClusterService s = f.createCdapClusterService();
		CdapClusterServiceInstance i = f.createCdapClusterServiceInstance();
		s.getInstances().add(i);
		i.setName("foo");
		PhysicalMachine p = VmFactory.eINSTANCE.createPhysicalMachine();
		p.setPublicIp("localhost");
		i.getServers().add(p);
		i.setManagerPortNumber(9922);
		s.pollManagerConfiguration("foo");
	}

}
