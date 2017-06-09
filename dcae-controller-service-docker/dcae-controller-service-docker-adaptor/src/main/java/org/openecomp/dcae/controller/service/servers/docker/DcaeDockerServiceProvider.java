
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
	
package org.openecomp.dcae.controller.service.servers.docker;

import java.util.Date;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.json.JSONObject;

import org.openecomp.dcae.controller.core.service.DcaeServiceContainer;
import org.openecomp.dcae.controller.core.service.HealthTestResponse;
import org.openecomp.dcae.controller.core.service.HealthTestStatus;
import org.openecomp.dcae.controller.core.service.ServiceFactory;
import org.openecomp.dcae.controller.core.stream.DcaeStream;
import org.openecomp.dcae.controller.core.stream.DmaapStream;
import org.openecomp.dcae.controller.service.docker.DockerService;
import org.openecomp.dcae.controller.service.docker.DockerServiceInstance;
import org.openecomp.dcae.controller.service.docker.host.servers.manager.DcaeDockerHostManager;
import org.openecomp.dcae.controller.service.docker.host.servers.manager.DcaeDockerHostManagerConsole;
import org.openecomp.dcae.controller.service.docker.host.servers.service.DcaeDockerHostService;
import org.openecomp.dcae.controller.service.docker.host.servers.service.DcaeDockerHostServiceProvider;
import org.openecomp.dcae.controller.service.docker.host.service.DockerHostServiceInstance;
import org.openecomp.dcae.controller.service.servers.dockermanager.DcaeDockerManagerConsole;
import org.openecomp.dcae.controller.service.servers.vmmanager.DcaeVirtualMachineManagerConsole;
import org.openecomp.dcae.controller.service.vm.VirtualMachineService;
import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance;
import org.openecomp.ncomp.core.DeploymentStatus;
import org.openecomp.ncomp.docker.ContainerOptions;
import org.openecomp.ncomp.docker.ContainerPortBindings;
import org.openecomp.ncomp.docker.DockerContainer;
import org.openecomp.ncomp.docker.DockerFactory;
import org.openecomp.ncomp.servers.docker.DockerDockerHostConsole;
import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.BasicAdaptorProvider;
import org.openecomp.ncomp.sirius.manager.ISiriusProvider;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.JavaHttpClient;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.ManagementServerUtils;
import org.openecomp.ncomp.sirius.manager.Subject;
import org.openecomp.ncomp.sirius.manager.metrics.MetricStore;
import org.openecomp.ncomp.utils.CryptoUtils;

public class DcaeDockerServiceProvider extends BasicAdaptorProvider {
	private static final Logger logger = Logger.getLogger(DcaeDockerServiceProvider.class);
	DockerService o;

	public DcaeDockerServiceProvider(ISiriusServer controller, DockerService o) {
		super(controller, o);
		this.o = o;
	}

	public void deploy(String instanceName, String containerPath) {
		DockerServiceInstance i = findInstance(instanceName);
		if (!(containerPath == null || containerPath.equals(""))) {
			Subject s = controller.getServer().find(containerPath);
			if (s == null || s.o == null) {
				throw new RuntimeException("Unable to find container object: " + containerPath);
			}
			if (!(s.o instanceof DockerHostServiceInstance))
				throw new RuntimeException("Unable to deploy to this non docker host container: " + containerPath);
			i.setHostService((DockerHostServiceInstance) s.o);
		}
		if (i.getHostService() == null) {
			throw new RuntimeException("Null Container: unable to deploy: " + o.getName() + " " + i.getName());
		}
		i.setDockerName(dockerName(i));
		ContainerOptions opts = DockerFactory.eINSTANCE.createContainerOptions();
		opts.setName(i.getDockerName());
		opts.getVolumes().addAll(i.getVolumes());
		opts.getLinks().addAll(i.getLinks());
		opts.getEnv().addAll(i.getEnvs());
		for (ContainerPortBindings p : i.getPortBindings()) { 
			opts.getPortBindings().add(EcoreUtil.copy(p));
		}
		console(instanceName).setupConfiguration(o.getName(), instanceName);
		consoleHost(i).dockerRunWithOptions("/resources/dockerHost", image(i), opts);
		long toolate = System.currentTimeMillis() + 15 * 60 * 1000; 
		// wait 15 minutes for container manager
		while (i.getManagerPortNumber() > 0 && System.currentTimeMillis() < toolate) {
			try {
				o.pushManagerConfiguration(instanceName);
				break;
			} catch (Exception e) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					throw new RuntimeException("Deployment timeout: Deployment interrupted");
				}
			}
			if (System.currentTimeMillis() >= toolate)
				throw new RuntimeException("Unable to configure Docker");
		}
	}

	private String image(DockerServiceInstance i) {
		if (i.getImage().contains("/")) 
			return i.getImage();
		String dns = i.getHostService().getServers().get(0).getNetworks().get(0).getDnsName();
		return dns + ":7113/" + i.getImage();
	}

	public void undeploy(String instanceName) {
		DockerServiceInstance i = findInstance(instanceName);
		DockerDockerHostConsole c = consoleHost(i);
//		c.stopContainer("/resources/dockerHost", i.getDockerName(), 10);
//		c.killContainer("/resources/dockerHost", i.getDockerName(), "KILL");
		c.removeContainer("/resources/dockerHost", i.getDockerName(), true, true);
	}

	private DcaeDockerHostManagerConsole console(String instanceName) {
		DockerServiceInstance i = findInstance(instanceName);
		return new DcaeDockerHostManagerConsole(getClient(i));
	}

	public AbstractClient getClient(DockerServiceInstance i) {
		DockerHostServiceInstance instance = i.getHostService();
		VirtualMachineService service = instance.getService();
		DcaeDockerHostServiceProvider provider = (DcaeDockerHostServiceProvider) ((ISiriusProvider) service).getSiriusProvider();
		return provider.getClient(instance);
	}

	private DockerDockerHostConsole consoleHost(DockerServiceInstance i) {
		DockerHostServiceInstance instance = i.getHostService();
		VirtualMachineService service = instance.getService();
		DcaeDockerHostServiceProvider provider = (DcaeDockerHostServiceProvider) ((ISiriusProvider) service).getSiriusProvider();
		AbstractClient c = provider.getClient(instance);
		return new DockerDockerHostConsole(c);
	}

	private String dockerName(DockerServiceInstance i) {
		return "dcae_" + o.getName() + "_" + i.getName();
		// return "dcae"+ new Date().getTime();
	}

	protected DockerServiceInstance findInstance(String instanceName) {
		for (DockerServiceInstance ii : o.getInstances()) {
			if (ii.getName().equals(instanceName)) {
				ii.setDockerName(dockerName(ii));
				return ii;
			}
		}
		throw new RuntimeException("Unable to find instance: " + instanceName);

	}

	public HealthTestResponse test(String instanceName) {
		DockerServiceInstance i = findInstance(instanceName);
		DockerContainer c = findContainer(i);
		HealthTestResponse h = ServiceFactory.eINSTANCE.createHealthTestResponse();
		if (c == null) {
			h.setStatus(HealthTestStatus.YELLOW);
			h.setMessageCode("Container not Deployed");
			return h;
		}
		System.out.println("DOCKER: test" + i.getDockerName() + " " + c.getStatus());
		if (c.getStatus().startsWith("Exited")) {
			h.setStatus(HealthTestStatus.RED);
			h.setMessageCode("Container not running");
			return h;
		}
		if (c.getStatus().startsWith("Created")) {
			h.setStatus(HealthTestStatus.RED);
			h.setMessageCode("Container never started");
			return h;
		}
		if (c.getStatus().startsWith("Restarting")) {
			h.setStatus(HealthTestStatus.RED);
			h.setMessageCode("Container restarting");
			return h;
		}
		if (i.getManagerPortNumber() > 0) {
			System.out.println("DOCKER: test" + i.getDockerName() + "HERE");
			return console(instanceName).testContainer(i.getDockerName());
		}
		h.setStatus(HealthTestStatus.GREEN);
		return h;
	}

	public void suspend(String instanceName) {
		DockerServiceInstance i = findInstance(instanceName);
		console(instanceName).suspendContainer(i.getDockerName());
	}

	public void resume(String instanceName) {
		DockerServiceInstance i = findInstance(instanceName);
		console(instanceName).resumeContainer(i.getDockerName());
	}

	public void pushManagerConfiguration(String instanceName) {
		DockerServiceInstance i = findInstance(instanceName);
		DcaeDockerHostManagerConsole console = console(instanceName);
		EObject config = o.managerConfiguration(instanceName);
		System.out.println("DDDDD " + ManagementServer.ecore2json(config, 1000, null, true).toString(2));
		EList<DcaeStream> l1 = new BasicEList<DcaeStream>();
		l1.addAll(EcoreUtil.copyAll(i.getInputStreams()));
		EList<DcaeStream> l2 = new BasicEList<DcaeStream>();
		l2.addAll(EcoreUtil.copyAll(i.getOutputStreams()));
		console.updateContainerConfiguration(i.getDockerName(), config, decrypt(l1), decrypt(l2));
	}

	private EList<DcaeStream> decrypt(EList<DcaeStream> l) {
		for (DcaeStream s : l) {
			if (s instanceof DmaapStream) {
				DmaapStream s1 = (DmaapStream) s;
				String pw = s1.getDmaapPassword();
				if (pw != null && pw.startsWith("rsa:")) {
					try {
						s1.setDmaapPassword(JavaHttpClient.decryptPassword(pw));
					} catch (Exception e) {
						System.err.println("ZZZZZ: bad pw: " + ManagementServer.object2ref(s));
						s1.setDmaapPassword("decryption error");
					}
				}
				else
					System.err.println("ZZZZZ: unencrypted pw: " + ManagementServer.object2ref(s));
				continue;
			}
			System.err.println("ZZZZZ: unknown type: " + s.getClass().getName());
		}
		return l;
	}

	public void pollManagerConfiguration(String instanceName) {

		// TODO IMPLEMENT
		throw new UnsupportedOperationException();
	}

	public org.eclipse.emf.ecore.EObject managerConfiguration(String instanceName) {
		// TODO IMPLEMENT
		throw new UnsupportedOperationException();
	}

	public JSONObject managerOperation(String instanceName, String operation, JSONObject parameters) {
		// TODO IMPLEMENT
		throw new UnsupportedOperationException();
	}

	public void updateConfigurationFromPolicy(String instanceName) {

		// TODO IMPLEMENT
		throw new UnsupportedOperationException();
	}

	public void runHealthTests() {
//		System.out.println("DOCKER: runHealthTests" + o.getName());
		for (DockerServiceInstance i : o.getInstances()) {
			HealthTestResponse s = null;
			try {
				if (i.getStatus() == DeploymentStatus.DEPLOYED) {
					s = test(i.getName());
				} else {
					s = ServiceFactory.eINSTANCE.createHealthTestResponse();
					s.setMessageCode("Not deployed");
					s.setStatus(HealthTestStatus.YELLOW);
				}
			} catch (Exception e) {
				s = ServiceFactory.eINSTANCE.createHealthTestResponse();
				s.setMessageCode("Unable to determine health: " + e);
				s.setStatus(HealthTestStatus.RED);
			}
			i.setHealthTestStatus(s.getStatus());
			i.setHealthTestMessageCode(s.getMessageCode());
			MetricStore store = controller.getServer().metrics.getStore(i);
			Date now = new Date();
			String path = "/lastHealthTest";
			store.addLongValue(path, now, now.getTime(), "DateMetricAttribute", false);
		}
	}

	public void start() {

		Thread t = new Thread("docker service: " + o.getName()) {
			@Override
			public void run() {
				while (true) {
					try {
						if (! controller.getServer().isSlave) 
							updateDeploymentStatus();
						Thread.sleep(60000); // sleep 60 seconds
					} catch (Exception e) {
						ManagementServerUtils.printStackTrace(e);
						logger.fatal("vm service: " + o.getName() + " : " + e);
						try {
							Thread.sleep(30000);
						} catch (InterruptedException e1) {
						}
					}
				}
			}

		};
		t.start();
	}

	public void updateDeploymentStatus() {
		for (DockerServiceInstance instance : o.getInstances()) {
			instance.setDockerName(dockerName(instance));
			DockerContainer c = findContainer(instance);
			if (c != null) {
				if (c.getStatus() != null && c.getStatus().startsWith("Up"))
					instance.setStatus(DeploymentStatus.DEPLOYED);
				else
					instance.setStatus(DeploymentStatus.DEPLOYED_PARTIALLY);
			}
			else
				instance.setStatus(DeploymentStatus.UNDEPLOYED);
		}
	}

	private DockerContainer findContainer(DockerServiceInstance instance) {
		if (instance.getHostService() == null)
			return null;
		for (DockerContainer c : instance.getHostService().getDockerHost().getContainers()) {
			if (instance.getDockerName() != null && instance.getDockerName().equals(c.getName())) {
				return c;
			}
		}
		return null;
	}

	protected EObject convertToManagerConfiguration(DockerServiceInstance i) {
		// TODO Auto-generated method stub
		return null;
	}
}
