
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
	
package org.openecomp.dcae.controller.service.dmaap.drsub.servers.service;

import org.openecomp.ncomp.core.DeploymentStatus;

import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.JavaHttpClient;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.Subject;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.openecomp.dcae.controller.core.server.DcaeBasicServer;
import org.openecomp.dcae.controller.service.servers.vm.DcaeVirtualMachineServiceProvider;
import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance;
import org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterServiceInstance;
import org.openecomp.dcae.controller.service.dmaap.drsub.manager.ManagerFactory;
import org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubService;
import org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceInstance;

public class DcaeControllerServiceDmaapDrsubServiceProvider extends DcaeVirtualMachineServiceProvider {
	private static final Logger logger = Logger.getLogger(DcaeControllerServiceDmaapDrsubServiceProvider.class);
	ControllerServiceDmaapDrsubService o;

	public DcaeControllerServiceDmaapDrsubServiceProvider(ISiriusServer controller, ControllerServiceDmaapDrsubService o) {
		super(controller, o);
		this.o = o;
	}

	@Override
	public void deploy(String instanceName, String containerPath) {
		logger.info("entering deploy");
		executeCmd(instanceName, "pushManagerConfiguration");
	}

	@Override
	public void undeploy(String instanceName) {
		logger.info("entering undeploy");
		executeCmd(instanceName, "undeploy");
	}

	private void executeCmd(String instanceName, String cmd) {
		ControllerServiceDmaapDrsubServiceInstance i = (ControllerServiceDmaapDrsubServiceInstance) findInstance(instanceName);
		String cdapServiceName = i.getCdapServiceName();
		logger.info("cdapServiceName: " + cdapServiceName);

		if (cdapServiceName != null) {
			String path = "/services/" + cdapServiceName + "/instances/" + instanceName;
			Subject s = controller.getServer().find(path);
			if (s != null && s.o != null 
					&& ((CdapClusterServiceInstance) s.o).getStatus() == DeploymentStatus.DEPLOYED) {
				i.setCdapClusterInstance((CdapClusterServiceInstance) s.o);
				i.setLocation(i.getCdapClusterInstance().getLocation());
				switch (cmd) {
				case "pushManagerConfiguration":
					o.pushManagerConfiguration(instanceName);
					break;
				case "undeploy":
					// for 1610 undeploy is defined as "stop the DR Subscriber"
					o.suspend(instanceName);
					break;
				}
			} else {
				logger.error("Couldn't find deployed CDAP service");
				throw new RuntimeException("Couldn't find deployed CDAP service");
			}
		}
	}

	@Override
	public EObject managerConfiguration(String instanceName) {
		EObject o1 = ManagerFactory.eINSTANCE.createControllerServiceDmaapDrsubManager();
		ManagementServer.copy(findInstance(instanceName), o1);
		return o1;
	}

	@Override
	public AbstractClient getClient(VirtualMachineServiceInstance i, DcaeBasicServer s) {
		ControllerServiceDmaapDrsubServiceInstance i1 = (ControllerServiceDmaapDrsubServiceInstance) i;
		CdapClusterServiceInstance ii = i1.getCdapClusterInstance();
		JavaHttpClient c = (JavaHttpClient) super.getClient(ii, s);
		String str = c.getBaseAddress().replace(ii.getManagerPortNumber().toString(),
				i.getManagerPortNumber().toString());
		c.setBaseAddress(str);
		System.err.println("QQQQQ: other-af-dr-sub: baseaddress: " + c.getBaseAddress());
		return c;
	}
	
	@Override
	protected EList<DcaeBasicServer> getServers(VirtualMachineServiceInstance i) {
		ControllerServiceDmaapDrsubServiceInstance i1 = (ControllerServiceDmaapDrsubServiceInstance) i;
		CdapClusterServiceInstance ii = i1.getCdapClusterInstance();
		if (ii.getStatus() != DeploymentStatus.DEPLOYED) {
			logger.error("CDAP service is not deployed - NOT calling getServers()");			
			throw new RuntimeException("CDAP service is not deployed");
		}
		return ii.getServers();
	}
}
