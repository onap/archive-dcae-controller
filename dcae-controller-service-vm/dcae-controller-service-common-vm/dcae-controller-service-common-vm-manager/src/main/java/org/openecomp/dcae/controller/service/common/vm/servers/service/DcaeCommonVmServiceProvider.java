
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
	

package org.openecomp.dcae.controller.service.common.vm.servers.service;





import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.openecomp.dcae.controller.service.servers.vm.DcaeVirtualMachineServiceProvider;
import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance;
import org.openecomp.dcae.controller.service.common.vm.manager.CommonVmManager;
import org.openecomp.dcae.controller.service.common.vm.manager.ManagerFactory;
import org.openecomp.dcae.controller.service.common.vm.service.CommonVmService;
import org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceConfiguration;
import org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance;
import org.openecomp.dcae.controller.service.common.vm.service.ServiceFactory;


public class DcaeCommonVmServiceProvider extends DcaeVirtualMachineServiceProvider {
	private static final Logger logger = Logger.getLogger(DcaeCommonVmServiceProvider.class);
	CommonVmService o;

	public DcaeCommonVmServiceProvider(ISiriusServer controller, CommonVmService o) {
		super(controller, o);
		this.o = o; 
	}

	@Override
	public EObject convertToManagerConfiguration(VirtualMachineServiceInstance i) {
		CommonVmServiceInstance i1 = (CommonVmServiceInstance) i;
		CommonVmServiceInstance c = ServiceFactory.eINSTANCE.createCommonVmServiceInstance();
		c.setScript(i1.getScript());
		c.setVmConfiguration(EcoreUtil.copy(i1.getVmConfiguration()));
		return c;
	}

	@Override
	public EObject managerConfiguration(String instanceName) {
		CommonVmServiceInstance i1 = (CommonVmServiceInstance) findInstance(instanceName);
		CommonVmManager c = ManagerFactory.eINSTANCE.createCommonVmManager();
		c.setScript(i1.getScript());
		c.setConfigureTimeout(i1.getConfigureTimeout());
		c.setTestTimeout(i1.getTestTimeout());
		c.setSuspendTimeout(i1.getSuspendTimeout());
		c.setResumeTimeout(i1.getResumeTimeout());
		c.setVmConfiguration(EcoreUtil.copy(i1.getVmConfiguration()));
		ManagementServer.decryptPasswords(c.getVmConfiguration());
		return c;
	}
	
}
