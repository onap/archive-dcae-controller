
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
package org.openecomp.dcae.controller.service.dmaap.drsub.servers.service;

import org.eclipse.emf.ecore.EPackage;
import org.apache.log4j.Logger;

import org.openecomp.ncomp.sirius.manager.ISiriusServer;

import org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubService;
import org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage;
import org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ServiceFactoryImpl;





public class DcaeServiceFactory extends ServiceFactoryImpl {
	public static final Logger logger = Logger.getLogger(DcaeServiceFactory.class);
	ISiriusServer server = null;
	@Override
	public EPackage getEPackage() { return ServicePackage.eINSTANCE; }
	public DcaeServiceFactory(ISiriusServer server) {
		this.server = server;
	}
	@Override
	public ControllerServiceDmaapDrsubService createControllerServiceDmaapDrsubService() {
		return new DcaeControllerServiceDmaapDrsubService(server);
	}
	
	

}
