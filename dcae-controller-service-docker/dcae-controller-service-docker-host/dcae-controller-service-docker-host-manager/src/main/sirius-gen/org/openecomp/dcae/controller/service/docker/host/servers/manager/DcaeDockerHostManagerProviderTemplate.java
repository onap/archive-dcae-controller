
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
	

package org.openecomp.dcae.controller.service.docker.host.servers.manager;





import java.io.InputStream;

import org.openecomp.ncomp.sirius.manager.IRequestHandler;
import org.openecomp.ncomp.sirius.manager.ISiriusPlugin;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.function.FunctionUtils;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;



import java.util.Date;


import org.openecomp.ncomp.sirius.manager.server.LoggerInfo;


import org.openecomp.ncomp.sirius.manager.server.ServerFactory;


import org.openecomp.dcae.controller.service.servers.vmmanager.DcaeVirtualMachineManagerProvider;


import org.openecomp.dcae.controller.service.docker.host.manager.impl.DockerHostManagerImpl;
import org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager;


public class DcaeDockerHostManagerProviderTemplate extends DcaeVirtualMachineManagerProvider {
	private static final Logger logger = Logger.getLogger(DcaeDockerHostManagerProviderTemplate.class);
	DockerHostManager o;

	public DcaeDockerHostManagerProviderTemplate(ISiriusServer controller, DockerHostManager o) {
		super(controller, o);
		this.o = o;
	}

	public void updateContainerConfiguration(java.lang.String name, org.eclipse.emf.ecore.EObject o, EList<org.openecomp.dcae.controller.core.stream.DcaeStream> inputStreams, EList<org.openecomp.dcae.controller.core.stream.DcaeStream> outputStreams) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void suspendContainer(java.lang.String name) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void resumeContainer(java.lang.String name) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public org.openecomp.dcae.controller.core.service.HealthTestResponse testContainer(java.lang.String name) {
		org.openecomp.dcae.controller.core.service.HealthTestResponse res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void setupConfiguration(java.lang.String service, java.lang.String instance) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}





	
}
