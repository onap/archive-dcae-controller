
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
	

package org.openecomp.dcae.controller.service.common.docker.servers.service;





import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.openecomp.dcae.controller.service.servers.docker.DcaeDockerServiceProvider;
import org.openecomp.dcae.controller.service.docker.DockerServiceInstance;
import org.openecomp.dcae.controller.service.common.docker.manager.CommonDockerManager;
import org.openecomp.dcae.controller.service.common.docker.manager.ManagerFactory;
import org.openecomp.dcae.controller.service.common.docker.service.CommonDockerService;
import org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceInstance;
import org.openecomp.dcae.controller.service.common.docker.service.ServiceFactory;


public class DcaeCommonDockerServiceProvider extends DcaeDockerServiceProvider {
	private static final Logger logger = Logger.getLogger(DcaeCommonDockerServiceProvider.class);
	CommonDockerService o;

	public DcaeCommonDockerServiceProvider(ISiriusServer controller, CommonDockerService o) {
		super(controller, o);
		this.o = o;
	}

	@Override
	protected EObject convertToManagerConfiguration(DockerServiceInstance i) {
		CommonDockerServiceInstance i1 = (CommonDockerServiceInstance) i;
		CommonDockerServiceInstance c = ServiceFactory.eINSTANCE.createCommonDockerServiceInstance();
		c.setScript(i1.getScript());
		c.setConfigureTimeout(i1.getConfigureTimeout());
		c.setTestTimeout(i1.getTestTimeout());
		c.setSuspendTimeout(i1.getSuspendTimeout());
		c.setResumeTimeout(i1.getResumeTimeout());
		c.setDockerConfiguration(EcoreUtil.copy(i1.getDockerConfiguration()));
		ManagementServer.decryptPasswords(c.getDockerConfiguration());
		return c;
	}
	
	@Override
	public EObject managerConfiguration(String instanceName) {
		CommonDockerServiceInstance i1 = (CommonDockerServiceInstance) findInstance(instanceName);
		CommonDockerManager c = ManagerFactory.eINSTANCE.createCommonDockerManager();
		c.setScript(i1.getScript());
		c.setConfigureTimeout(i1.getConfigureTimeout());
		c.setTestTimeout(i1.getTestTimeout());
		c.setSuspendTimeout(i1.getSuspendTimeout());
		c.setResumeTimeout(i1.getResumeTimeout());
		c.setDockerConfiguration(EcoreUtil.copy(i1.getDockerConfiguration()));
		return c;
	}




	
}
