
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

import java.io.ByteArrayOutputStream;
import java.util.Date;
import java.util.Iterator;

import org.openecomp.ncomp.core.function.Function;
import org.openecomp.ncomp.docker.DockerContainer;
import org.openecomp.ncomp.docker.DockerPort;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.JavaHttpClient;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.webservice.utils.FileUtils;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONObject;

import org.openecomp.dcae.controller.core.service.HealthTestResponse;
import org.openecomp.dcae.controller.core.service.HealthTestStatus;
import org.openecomp.dcae.controller.core.service.ServiceFactory;
import org.openecomp.dcae.controller.core.stream.DcaeStream;
import org.openecomp.dcae.controller.service.servers.vmmanager.DcaeVirtualMachineManagerProvider;
import org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager;

public class DcaeDockerHostManagerProvider extends DcaeVirtualMachineManagerProvider {
	private static final Logger logger = Logger.getLogger(DcaeDockerHostManagerProvider.class);
	DockerHostManager o;

	public DcaeDockerHostManagerProvider(ISiriusServer controller, DockerHostManager o) {
		super(controller, o);
		this.o = o;
	}

	public void updateContainerConfiguration(String name, EObject o2, EList<DcaeStream> inputStreams,
			EList<DcaeStream> outputStreams) {
		DcaeDockerHostManagerConsole c = console(name,true);
		c.update("/", ManagementServer.ensureHardUpdate(o2,1));
		c.updateStreams(inputStreams, outputStreams);
		c.configurationChanged();
	}

	public void resumeContainer(String name) {
		console(name,true).resume();
	}

	public void suspendContainer(String name) {
		console(name,true).suspend();
	}

	public HealthTestResponse testContainer(String name) {
		return console(name,true).test();

	}

	private DcaeDockerHostManagerConsole console(String name, boolean pollIfNeeded) {
		// TODO this setup assumes a few too many things.
		JavaHttpClient c = new JavaHttpClient("console.properties", "localhost");
		for ( DockerContainer container : o.getDockerHost().getContainers()) {
			if (! name.equals(container.getName())) continue;
			for (DockerPort p : container.getPorts()) {
				if (p.getPrivatePort() == 9999) {
					c.setBaseAddress(c.getBaseAddress().replace("9999", Integer.toString(p.getPublicPort())));
					return new DcaeDockerHostManagerConsole(c);
				}
			}
			throw new RuntimeException("Unable to find manager port: " + name);
		}
		if (pollIfNeeded ) {
			o.getDockerHost().poll();
			return console(name, false);
		}
		throw new RuntimeException("Unable to find container: " + name);
	}

	public void setupConfiguration(String service, String instance) {
		Runtime runtime = Runtime.getRuntime();
		Process proc;
		try {
			Date now = new Date();
			String cmd = "bin/setup-container-config.sh " + service + " " + instance;
			proc = runtime.exec(cmd);
			ByteArrayOutputStream o = new ByteArrayOutputStream();
			ByteArrayOutputStream e = new ByteArrayOutputStream();
			FileUtils.copyStream(proc.getInputStream(), o);
			FileUtils.copyStream(proc.getErrorStream(), e);
			int i = proc.waitFor();
			if (i != 0) 
				logger.warn("crontab return error: " + cmd + " " + i);
			long duration = new Date().getTime()-now.getTime();
			if (duration  > 10000) 
				logger.warn("command took too long: " + cmd + " " + duration);
		} catch (Exception e) {
			e.printStackTrace();
			logger.warn("ERROR: " + e);
		}

	}
	
	@Override
	public HealthTestResponse test() {
		HealthTestResponse res = ServiceFactory.eINSTANCE.createHealthTestResponse();
		res.setStatus(HealthTestStatus.GREEN);
		if (o.getDockerHost() == null || o.getDockerHost().getNetworks().size() == 0) {
			res.setMessageCode("Docker Engine not working");
			res.setStatus(HealthTestStatus.RED);
		}
		return res;
	}

}
