
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
	

package org.openecomp.dcae.controller.service.servers.vm;





import java.io.InputStream;

import org.openecomp.ncomp.sirius.manager.IRequestHandler;
import org.openecomp.ncomp.sirius.manager.ISiriusPlugin;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.function.FunctionUtils;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;



import org.openecomp.ncomp.sirius.manager.BasicAdaptorProvider;


import org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceImpl;
import org.openecomp.dcae.controller.service.vm.VirtualMachineService;


public class DcaeVirtualMachineServiceProviderTemplate extends BasicAdaptorProvider {
	private static final Logger logger = Logger.getLogger(DcaeVirtualMachineServiceProviderTemplate.class);
	VirtualMachineService o;

	public DcaeVirtualMachineServiceProviderTemplate(ISiriusServer controller, VirtualMachineService o) {
		super(controller, o);
		this.o = o;
	}

	public void updateDeploymentStatus() {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void deploy(java.lang.String instanceName, java.lang.String containerPath) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void undeploy(java.lang.String instanceName) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public org.openecomp.dcae.controller.core.service.HealthTestResponse test(java.lang.String instanceName) {
		org.openecomp.dcae.controller.core.service.HealthTestResponse res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void suspend(java.lang.String instanceName) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void resume(java.lang.String instanceName) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void pushManagerConfiguration(java.lang.String instanceName) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void pollManagerConfiguration(java.lang.String instanceName) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public org.eclipse.emf.ecore.EObject managerConfiguration(java.lang.String instanceName) {
		org.eclipse.emf.ecore.EObject res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public org.json.JSONObject managerOperation(java.lang.String instanceName, java.lang.String operation, org.json.JSONObject parameters) {
		org.json.JSONObject res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void updateConfigurationFromPolicy(java.lang.String instanceName) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void runHealthTests() {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}







	
}
