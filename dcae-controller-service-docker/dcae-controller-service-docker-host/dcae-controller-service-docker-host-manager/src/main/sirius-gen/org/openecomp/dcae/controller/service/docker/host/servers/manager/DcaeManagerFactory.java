
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
	
// Autogenerated
// Do not edit. No need to extend this class.
package org.openecomp.dcae.controller.service.docker.host.servers.manager;

import org.eclipse.emf.ecore.EPackage;
import org.apache.log4j.Logger;

import org.openecomp.ncomp.sirius.manager.ISiriusServer;

import org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager;
import org.openecomp.dcae.controller.service.docker.host.manager.ManagerPackage;
import org.openecomp.dcae.controller.service.docker.host.manager.impl.ManagerFactoryImpl;





public class DcaeManagerFactory extends ManagerFactoryImpl {
	public static final Logger logger = Logger.getLogger(DcaeManagerFactory.class);
	ISiriusServer server = null;
	@Override
	public EPackage getEPackage() { return ManagerPackage.eINSTANCE; }
	public DcaeManagerFactory(ISiriusServer server) {
		this.server = server;
	}
	@Override
	public DockerHostManager createDockerHostManager() {
		return new DcaeDockerHostManager(server);
	}
	
	

}
