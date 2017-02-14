
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
	
package org.openecomp.dcae.controller.service.cdap.cluster.servers.service;

import org.openecomp.ncomp.cdap.CdapCluster;
import org.openecomp.ncomp.cdap.CdapPackage;
import org.openecomp.ncomp.core.DeploymentStatus;
import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.ManagementServerUtils;
import org.openecomp.ncomp.sirius.manager.console.Utils;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.json.JSONObject;

import org.openecomp.dcae.controller.service.servers.vm.DcaeVirtualMachineServiceProvider;
import org.openecomp.dcae.controller.service.servers.vmmanager.DcaeVirtualMachineManagerConsole;
import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance;
import org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterService;
import org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterServiceInstance;
import org.openecomp.dcae.controller.service.cdap.cluster.manager.CdapClusterManager;
import org.openecomp.dcae.controller.service.cdap.cluster.manager.ManagerFactory;

public class DcaeCdapClusterServiceProvider extends DcaeVirtualMachineServiceProvider {
	private static final Logger logger = Logger.getLogger(DcaeCdapClusterServiceProvider.class);
	CdapClusterService o;

	public DcaeCdapClusterServiceProvider(ISiriusServer controller,
			CdapClusterService o) {
		super(controller, o);
		this.o = o;
	}
	
	@Override
	public EObject managerConfiguration(String instanceName) {
		CdapClusterServiceInstance i = (CdapClusterServiceInstance) findInstance(instanceName);
		CdapClusterManager c = ManagerFactory.eINSTANCE.createCdapClusterManager();
		if (i.getCluster() != null) {
			c.setCluster(EcoreUtil.copy(i.getCluster()));
			c.getCluster().setRemote(false);
		}
		return c;
	}
	
	@Override
	public void start() {
		super.start();
		Thread t = new Thread("cdap cluster poller: " + o.getName()) {
			@Override
			public void run() {
				while (true) {
					try {
						if (!controller.getServer().isSlave) {
							for (VirtualMachineServiceInstance i : o.getInstances()) {
								if (i.getStatus() == DeploymentStatus.DEPLOYED) {
									CdapClusterServiceInstance i1 = (CdapClusterServiceInstance) i;
									AbstractClient c = getClient(i);
									DcaeVirtualMachineManagerConsole console = new DcaeVirtualMachineManagerConsole(c);
									JSONObject json = (JSONObject) Utils.object2json(console.list("/cluster", 1000));
									CdapCluster h = (CdapCluster) controller.getServer().json2ecore(
											CdapPackage.eINSTANCE.getCdapCluster(), json);
									controller.getServer();
									h.setRemote(true);
									ManagementServer.merge(i1.getCluster(), h, json, true, null);
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
