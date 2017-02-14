
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
	
package org.openecomp.dcae.controller.service.docker.host.servers.service;

import org.openecomp.ncomp.core.DeploymentStatus;
import org.openecomp.ncomp.docker.DockerHost;
import org.openecomp.ncomp.docker.DockerPackage;
import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.ManagementServerUtils;
import org.openecomp.ncomp.sirius.manager.console.Utils;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.json.JSONObject;

import org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager;
import org.openecomp.dcae.controller.service.docker.host.manager.ManagerFactory;
import org.openecomp.dcae.controller.service.docker.host.service.DockerHostService;
import org.openecomp.dcae.controller.service.docker.host.service.DockerHostServiceInstance;
import org.openecomp.dcae.controller.service.servers.vm.DcaeVirtualMachineServiceProvider;
import org.openecomp.dcae.controller.service.servers.vmmanager.DcaeVirtualMachineManagerConsole;
import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance;

public class DcaeDockerHostServiceProvider extends DcaeVirtualMachineServiceProvider {
	private static final Logger logger = Logger.getLogger(DcaeDockerHostServiceProvider.class);
	DockerHostService o;

	public DcaeDockerHostServiceProvider(ISiriusServer controller, DockerHostService o) {
		super(controller, o);
		this.o = o;
	}

	@Override
	public EObject managerConfiguration(String instanceName) {
		DockerHostServiceInstance i = (DockerHostServiceInstance) findInstance(instanceName);
		DockerHostManager c = ManagerFactory.eINSTANCE.createDockerHostManager();
		if (i.getDockerHost() != null) {
			c.setDockerHost(EcoreUtil.copy(i.getDockerHost()));
			c.getDockerHost().setRemote(false);
		}
		return c;
	}

	@Override
	public void start() {
		for (VirtualMachineServiceInstance i : o.getInstances()) {
			DockerHostServiceInstance i1 = (DockerHostServiceInstance) i;
			if (i1.getDockerHost() != null)
				i1.getDockerHost().setRemote(true);
		}
		super.start();
		Thread t = new Thread("docker host poller: " + o.getName()) {
			@Override
			public void run() {
				while (true) {
					try {
						if (!controller.getServer().isSlave) {
							for (VirtualMachineServiceInstance i : o.getInstances()) {
								DockerHostServiceInstance i1 = (DockerHostServiceInstance) i;
								if (i1.getDockerHost() == null)
									continue;
								if (i.getStatus() == DeploymentStatus.DEPLOYED) {
									AbstractClient c = getClient(i);
									DcaeVirtualMachineManagerConsole console = new DcaeVirtualMachineManagerConsole(c);
									JSONObject json = (JSONObject) Utils.object2json(console.list("/dockerHost", 1000));
									DockerHost h = (DockerHost) controller.getServer().json2ecore(
											DockerPackage.eINSTANCE.getDockerHost(), json);
									controller.getServer();
									h.setRemote(true);
									ManagementServer.merge(i1.getDockerHost(), h, json, true, null);
								}
							}
						}
						Thread.sleep(30000); // sleep 30 seconds
					} catch (Exception e) {
						ManagementServerUtils.printStackTrace(e);
						logger.fatal("docker host poller: " + e);
						try {
							Thread.sleep(30000);
						} catch (InterruptedException e1) {
						}
					}
				}
			};
		};
		t.start();
	}

}
