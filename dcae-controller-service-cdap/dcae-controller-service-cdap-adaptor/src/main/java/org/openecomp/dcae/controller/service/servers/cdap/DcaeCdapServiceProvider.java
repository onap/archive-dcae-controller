
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

package org.openecomp.dcae.controller.service.servers.cdap;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.json.JSONObject;

import org.openecomp.dcae.controller.core.server.DcaeBasicServer;
import org.openecomp.dcae.controller.core.service.HealthTestResponse;
import org.openecomp.dcae.controller.core.service.HealthTestStatus;
import org.openecomp.dcae.controller.core.service.ServiceFactory;
import org.openecomp.dcae.controller.core.stream.DcaeStream;
import org.openecomp.dcae.controller.core.stream.DmaapStream;
import org.openecomp.dcae.controller.service.cdap.CdapApplication;
import org.openecomp.dcae.controller.service.cdap.CdapArtifact;
import org.openecomp.dcae.controller.service.cdap.CdapCreateAppStep;
import org.openecomp.dcae.controller.service.cdap.CdapCreateAppWithConfigStep;
import org.openecomp.dcae.controller.service.cdap.CdapDeleteAppStep;
import org.openecomp.dcae.controller.service.cdap.CdapDeleteArtifact;
import org.openecomp.dcae.controller.service.cdap.CdapDeployAppStep;
import org.openecomp.dcae.controller.service.cdap.CdapFactory;
import org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration;
import org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep;
import org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactWithConfigStep;
import org.openecomp.dcae.controller.service.cdap.CdapResumeScheduleStep;
import org.openecomp.dcae.controller.service.cdap.CdapService;
import org.openecomp.dcae.controller.service.cdap.CdapServiceInstance;
import org.openecomp.dcae.controller.service.cdap.CdapStartAppStep;
import org.openecomp.dcae.controller.service.cdap.CdapStartFlowStep;
import org.openecomp.dcae.controller.service.cdap.CdapStartServiceStep;
import org.openecomp.dcae.controller.service.cdap.CdapStartWorkerStep;
import org.openecomp.dcae.controller.service.cdap.CdapStep;
import org.openecomp.dcae.controller.service.cdap.CdapStopAppStep;
import org.openecomp.dcae.controller.service.cdap.CdapStopFlowStep;
import org.openecomp.dcae.controller.service.cdap.CdapStopServiceStep;
import org.openecomp.dcae.controller.service.cdap.CdapStopWorkerStep;
import org.openecomp.dcae.controller.service.cdap.CdapSuspendScheduleStep;
import org.openecomp.dcae.controller.service.cdap.cluster.servers.manager.DcaeCdapClusterManagerConsole;
import org.openecomp.dcae.controller.service.cdap.cluster.servers.service.DcaeCdapClusterService;
import org.openecomp.dcae.controller.service.cdap.cluster.servers.service.DcaeCdapClusterServiceProvider;
import org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterServiceInstance;
import org.openecomp.dcae.controller.service.vm.VirtualMachineService;
import org.openecomp.ncomp.cdap.CdapEntityWithPreferences;
import org.openecomp.ncomp.cdap.CdapKeyPair;
import org.openecomp.ncomp.cdap.CdapNamespace;
import org.openecomp.ncomp.core.DeploymentStatus;
import org.openecomp.ncomp.core.NamedEntity;
import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.BasicAdaptorProvider;
import org.openecomp.ncomp.sirius.manager.ISiriusProvider;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.JavaHttpClient;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.ManagementServerUtils;
import org.openecomp.ncomp.sirius.manager.Subject;
import org.openecomp.ncomp.sirius.manager.metrics.MetricStore;
import org.openecomp.ncomp.utils.StringUtil;

public class DcaeCdapServiceProvider extends BasicAdaptorProvider {
	private static final Logger logger = Logger.getLogger(DcaeCdapServiceProvider.class);
	CdapService o;

	public DcaeCdapServiceProvider(ISiriusServer controller, CdapService o) {
		super(controller, o);
		this.o = o;
	}

	public void deploy(String instanceName, String containerPath) {
		CdapServiceInstance i = findInstance(instanceName);
		if (containerPath != null) {
			Subject s = controller.getServer().find(containerPath);
			if (s == null || s.o == null) {
				throw new RuntimeException("Unable to find container object: " + containerPath);
			}
			if (!(s.o instanceof CdapClusterServiceInstance))
				throw new RuntimeException("Unable to deploy to this non cdap cluster container: " + containerPath);
			i.setClusterService((CdapClusterServiceInstance) s.o);
		}
		i.setCdapName(cdapName(i));
		DcaeCdapClusterManagerConsole console = consoleCluster(i);
		// console.loadArtifact(i.getCdapNamespace().getName(), i.getName(),
		// i.getJarFile());
		synchronized (i) {
			try {
				console.createNamespace(i.getCdapName());
			} catch (Exception e1) {
				logger.warn("reusing existing namespace");
			}
			try {
				for (CdapArtifact a : i.getArtifacts()) {
					if (a.getVersion() != null)
						console.loadArtifact(i.getCdapName(), a.getName(), a.getJarFile(), a.getVersion());
					console.deployApp(i.getCdapName(), a.getJarFile());
				}
				for (CdapApplication a : i.getApps()) {
					// System.err.println("CDAP: start app 1");
					console.loadArtifact(i.getCdapName(), a.getArtifactName(), a.getJarFile(), a.getVersion());
					// System.err.println("CDAP: start app 2");
					if (a.getAppConfigFileContent() == null)
						console.createApp(i.getCdapName(), a.getName(), a.getArtifactName(), a.getVersion(), "user");
					else
						console.createAppWithConfig(i.getCdapName(), a.getName(), a.getArtifactName(), a.getVersion(),
								"user", a.getAppConfigFileContent());
					// System.err.println("CDAP: start app 3");
				}
				doSteps(console, i, i.getDeploySteps());
			} catch (Exception e) {
				logger.warn("unable to start CDAP app: " + ManagementServer.object2ref(i));
				e.printStackTrace();
				throw new RuntimeException("Unable to start CDAP app: " + ManagementServer.object2ref(i) + " " + e);
			}

		}
		o.pushManagerConfiguration(instanceName);
	}

	private void doSteps(DcaeCdapClusterManagerConsole console, CdapServiceInstance i, EList<CdapStep> steps) {
		for (CdapStep s : steps) {
			if (s instanceof CdapLoadArtifactWithConfigStep) {
				CdapLoadArtifactWithConfigStep s1 = (CdapLoadArtifactWithConfigStep) s;
				console.loadArtifactWithConfig(i.getCdapName(), s1.getArtifactName(), s1.getJarFile(), s1.getVersion(),
						s1.getConfig());
				continue;
			}
			if (s instanceof CdapLoadArtifactStep) {
				CdapLoadArtifactStep s1 = (CdapLoadArtifactStep) s;
				console.loadArtifact(i.getCdapName(), s1.getArtifactName(), s1.getJarFile(), s1.getVersion());
				continue;
			}
			if (s instanceof CdapDeployAppStep) {
				CdapDeployAppStep s1 = (CdapDeployAppStep) s;
				console.deployApp(i.getCdapName(), s1.getJarFile());
				continue;
			}
			if (s instanceof CdapCreateAppWithConfigStep) {
				CdapCreateAppWithConfigStep s1 = (CdapCreateAppWithConfigStep) s;
				console.createAppWithConfig(i.getCdapName(), s1.getAppId(), s1.getArtifactName(), s1.getVersion(),
						s1.getScope(), s1.getAppConfig());
				continue;
			}
			if (s instanceof CdapCreateAppStep) {
				CdapCreateAppStep s1 = (CdapCreateAppStep) s;
				console.createApp(i.getCdapName(), s1.getAppId(), s1.getArtifactName(), s1.getVersion(), s1.getScope());
				continue;
			}
			if (s instanceof CdapStartAppStep) {
				CdapStartAppStep s1 = (CdapStartAppStep) s;
				console.startApp(i.getCdapName(), s1.getAppId());
				continue;
			}
			if (s instanceof CdapStartFlowStep) {
				CdapStartFlowStep s1 = (CdapStartFlowStep) s;
				console.startFlow(i.getCdapName(), s1.getAppId(), s1.getFlowId(), s1.getExtraArgs());
				continue;
			}
			if (s instanceof CdapStartWorkerStep) {
				CdapStartWorkerStep s1 = (CdapStartWorkerStep) s;
				console.startWorker(i.getCdapName(), s1.getAppId(), s1.getWorkerId(), s1.getExtraArgs());
				continue;
			}
			if (s instanceof CdapStartServiceStep) {
				CdapStartServiceStep s1 = (CdapStartServiceStep) s;
				console.startService(i.getCdapName(), s1.getAppId(), s1.getServiceId(), s1.getExtraArgs());
				continue;
			}
			if (s instanceof CdapStopAppStep) {
				CdapStopAppStep s1 = (CdapStopAppStep) s;
				console.stopApp(i.getCdapName(), s1.getAppId(),s1.getProgramTypes());
				continue;
			}
			if (s instanceof CdapStopFlowStep) {
				CdapStopFlowStep s1 = (CdapStopFlowStep) s;
				console.stopFlow(i.getCdapName(), s1.getAppId(), s1.getFlowId());
				continue;
			}
			if (s instanceof CdapStopWorkerStep) {
				CdapStopWorkerStep s1 = (CdapStopWorkerStep) s;
				console.stopWorker(i.getCdapName(), s1.getAppId(), s1.getWorkerId());
				continue;
			}
			if (s instanceof CdapStopServiceStep) {
				CdapStopServiceStep s1 = (CdapStopServiceStep) s;
				console.stopService(i.getCdapName(), s1.getAppId(), s1.getServiceId());
				continue;
			}
			if (s instanceof CdapResumeScheduleStep) {
				CdapResumeScheduleStep s1 = (CdapResumeScheduleStep) s;
				console.resumeSchedule(i.getCdapName(), s1.getAppId(), s1.getScheduleId());
				continue;
			}
			if (s instanceof CdapDeleteAppStep) {
				CdapDeleteAppStep s1 = (CdapDeleteAppStep) s;
				console.deleteApp(i.getCdapName(), s1.getAppId());
				continue;
			}
			if (s instanceof CdapDeleteArtifact) {
				CdapDeleteArtifact s1 = (CdapDeleteArtifact) s;
				console.deleteArtifact(i.getCdapName(), s1.getArtifactName(),s1.getVersion());
				continue;
			}			
			if (s instanceof CdapSuspendScheduleStep) {
				CdapSuspendScheduleStep s1 = (CdapSuspendScheduleStep) s;
				console.suspendSchedule(i.getCdapName(), s1.getAppId(),s1.getScheduleId());
				continue;
			}				
			throw new RuntimeException("Unable to support: " + s.eClass().getName());
		}
	}

	public void undeploy(String instanceName) {
		CdapServiceInstance i = findInstance(instanceName);
		DcaeCdapClusterManagerConsole console = consoleCluster(i);
		if (i.getCdapName() == null) {
			i.setCdapName(cdapName(i));
		}
		doSteps(console, i, i.getUndeploySteps());
		for (String f : i.getFlowNames()) {
			String[] a = f.split("\\.");
			if (a.length != 2)
				throw new RuntimeException("Bad flow name: " + f);
			try {
				console.stopFlow(i.getCdapName(), a[0], a[1]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (String a : i.getAppNames()) {
			try {
				console.stopApp(i.getCdapName(), a, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (CdapArtifact a : i.getArtifacts()) {
			try {
				// console.stopApp(i.getCdapName(), a.getName());
				console.deleteApp(i.getCdapName(), a.getName());
				if (a.getVersion() != null) {
					console.deleteArtifact(i.getCdapName(), a.getName(), a.getVersion());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (CdapApplication a : i.getApps()) {
			try {
				console.stopApp(i.getCdapName(), a.getName(), null);
				console.deleteApp(i.getCdapName(), a.getName());
				console.deleteArtifact(i.getCdapName(), a.getArtifactName(), a.getVersion());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// console.deleteNamespace(i.getCdapName());
	}

	public void pushManagerConfiguration(String instanceName) {
		CdapServiceInstance i = findInstance(instanceName);
		o.updateInstanceConfiguration(instanceName);
		DcaeCdapClusterManagerConsole console = consoleCluster(i);
		synchronized (i) {
			for (CdapArtifact a : i.getArtifacts()) {
				try {
					console.stopApp(i.getCdapName(), a.getName(), null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			for (CdapApplication a : i.getApps()) {
				try {
					console.stopApp(i.getCdapName(), a.getName(),null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			for (String f : i.getFlowNames()) {
				String[] a = f.split("\\.");
				if (a.length != 2)
					throw new RuntimeException("Bad flow name: " + f);
				try {
					console.stopFlow(i.getCdapName(), a[0], a[1]);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			for (String w : i.getWorkerNames()) {
				String[] a = w.split("\\.");
				if (a.length != 2)
					throw new RuntimeException("Bad worker name: " + w);
				try {
					console.stopWorker(i.getCdapName(), a[0], a[1]);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for (String s : i.getServiceNames()) {
				String[] a = s.split("\\.");
				if (a.length != 2)
					throw new RuntimeException("Bad service name: " + s);
				try {
					console.stopService(i.getCdapName(), a[0], a[1]);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			doSteps(console, i, i.getPreConfigurationSteps());

			console.setPreferencesNameSpace(i.getCdapName(), list2string(i.getCdapConfiguration().getPreferences()));
			for (CdapEntityWithPreferences w : i.getCdapConfiguration().getWorkers()) {
				if (w.getPreferences().size() == 0)
					continue;
				String[] a = w.getName().split("\\.");
				if (a.length != 2)
					throw new RuntimeException("Bad worker name: " + w.getName());
				console.setPreferencesWorker(i.getCdapName(), list2string(w.getPreferences()), a[0], a[1]);
			}
			for (CdapEntityWithPreferences s : i.getCdapConfiguration().getServices()) {
				if (s.getPreferences().size() == 0)
					continue;
				String[] a = s.getName().split("\\.");
				if (a.length != 2)
					throw new RuntimeException("Bad service name: " + s.getName());
				console.setPreferencesService(i.getCdapName(), list2string(s.getPreferences()), a[0], a[1]);
			}
			for (CdapEntityWithPreferences f : i.getCdapConfiguration().getFlows()) {
				if (f.getPreferences().size() == 0)
					continue;
				String[] a = f.getName().split("\\.");
				if (a.length != 2)
					throw new RuntimeException("Bad flow name: " + f.getName());
				console.setPreferencesFlow(i.getCdapName(), list2string(f.getPreferences()), a[0], a[1]);
			}
			for (CdapEntityWithPreferences a : i.getCdapConfiguration().getApps()) {
				if (a.getPreferences().size() == 0)
					continue;
				console.setPreferencesApp(i.getCdapName(), list2string(a.getPreferences()), a.getName());
			}
			doSteps(console, i, i.getPostConfigurationSteps());
			// TODO what should we do. ??
			for (String f : i.getFlowNames()) {
				String[] a = f.split("\\.");
				if (a.length != 2)
					throw new RuntimeException("Bad flow name: " + f);
				console.startFlow(i.getCdapName(), a[0], a[1], null);
			}
			for (String w : i.getWorkerNames()) {
				String[] a = w.split("\\.");
				if (a.length != 2)
					throw new RuntimeException("Bad worker name: " + w);
				console.startWorker(i.getCdapName(), a[0], a[1], null);
			}
			for (String s : i.getServiceNames()) {
				String[] a = s.split("\\.");
				if (a.length != 2)
					throw new RuntimeException("Bad service name: " + s);
				console.startService(i.getCdapName(), a[0], a[1], null);
			}
			for (CdapArtifact a : i.getArtifacts()) {
				try {
					console.startApp(i.getCdapName(), a.getName());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			for (CdapApplication a : i.getApps()) {
				try {
					console.startApp(i.getCdapName(), a.getName());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void pollManagerConfiguration(String instanceName) {
		// TODO IMPLEMENT
		throw new UnsupportedOperationException();
	}

	public EObject managerConfiguration(String instanceName) {
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

	public HealthTestResponse test(String instanceName) {
		CdapServiceInstance i = findInstance(instanceName);
		HealthTestResponse res = ServiceFactory.eINSTANCE.createHealthTestResponse();

		// simple check. Verify that namespace exists in cluster.

		CdapClusterServiceInstance s = i.getClusterService();
		if (s.getStatus() != DeploymentStatus.DEPLOYED) {
			res.setStatus(HealthTestStatus.YELLOW);
			res.setMessageCode("Cluster not deployed");
			return res;
		}
		if (s.getCluster() == null) {
			res.setStatus(HealthTestStatus.RED);
			res.setMessageCode("No Cluster");
			return res;
		}
		if (i.getNamespace() == null) {
			res.setStatus(HealthTestStatus.RED);
			res.setMessageCode("No Namepace for instance");
			return res;
		}
		for (CdapNamespace n : s.getCluster().getNamespaces()) {
			if (i.getNamespace().equals(n.getName())) {
				res.setStatus(HealthTestStatus.GREEN);
				return res;
			}
		}
		res.setStatus(HealthTestStatus.YELLOW);
		res.setMessageCode("Not deployed");
		return res;
	}

	public void resume(String instanceName) {
		// TODO IMPLEMENT
		throw new UnsupportedOperationException();
	}

	public void suspend(String instanceName) {
		// TODO IMPLEMENT
		throw new UnsupportedOperationException();
	}

	public void runHealthTests() {
		for (CdapServiceInstance i : o.getInstances()) {
			HealthTestResponse h = null;
			try {
				h = o.test(i.getName());
			} catch (Exception e) {
				h = ServiceFactory.eINSTANCE.createHealthTestResponse();
				h.setMessageCode("Unable to determine health: " + e);
				h.setStatus(HealthTestStatus.RED);
			}
			i.setHealthTestStatus(h.getStatus());
			i.setHealthTestMessageCode(h.getMessageCode());
			MetricStore store = controller.getServer().metrics.getStore(i);
			Date now = new Date();
			String path = "/lastHealthTest";
			store.addLongValue(path, now, now.getTime(), "DateMetricAttribute", false);
		}

	}

	public void updateInstanceConfiguration(String instanceName) {
		CdapServiceInstance i = findInstance(instanceName);
		CdapInternalApplicationConfiguration a = CdapFactory.eINSTANCE.createCdapInternalApplicationConfiguration();
		for (DcaeStream in : i.getInputStreams()) {
			if (in instanceof DmaapStream) {
				updateConfigSimple(i, in, "namespace-prefs::dmaap.in." + in.getName() + ".${attrName}", a);
			}
		}
		for (DcaeStream in : i.getOutputStreams()) {
			if (in instanceof DmaapStream) {
				updateConfigSimple(i, in, "namespace-prefs::dmaap.out." + in.getName() + ".${attrName}", a);
			}
		}
		updateConfig(i, i, a);
		i.setCdapConfiguration(a);
	}

	private String cdapName(CdapServiceInstance i) {
		// String n = "dcae:" + o.getName() + ":" + i.getName();
		// return n.replace("-", "X").replace(":", "Y");
		return i.getNamespace();
		// return "dcae"+ new Date().getTime();
	}

	private DcaeCdapClusterManagerConsole consoleCluster(CdapServiceInstance i) {
		CdapClusterServiceInstance instance = i.getClusterService();
		// need to assign the leader
		EList<DcaeBasicServer> l = instance.getServers();
		instance.setLeaderServer(l.get(l.size() - 1));
		if (instance.getCdapServiceServers().size() == 0) {
			// no configuration use last server per default
			instance.getCdapServiceServers().add(instance.getLeaderServer().getName());
		}
		for (DcaeBasicServer s : l) {
			if (!instance.getCdapServiceServers().contains(s.getName()))
				continue;
			if (s.getHealthTestStatus() != HealthTestStatus.GREEN)
				continue;
			instance.setLeaderServer(s);
		}
		VirtualMachineService service = instance.getService();
		DcaeCdapClusterServiceProvider provider = (DcaeCdapClusterServiceProvider) ((ISiriusProvider) service)
				.getSiriusProvider();
		AbstractClient c = provider.getClient(instance);
		return new DcaeCdapClusterManagerConsole(c);
	}

	private String list2string(EList<CdapKeyPair> l) {
		StringBuffer buf = new StringBuffer();
		boolean first = true;
		for (CdapKeyPair p : l) {
			if (p.getValue() == null)
				continue;
			if (!first)
				buf.append(" ");
			first = false;
			// dmaap.XX.dmaapPassword
			if (p.getName().startsWith("dmaap") && p.getName().endsWith("dmaapPassword")) {
				String pw = p.getValue();
				if (!pw.startsWith("rsa:")) {
					// System.err.println("ZZZZZ: unencrypted pw: " +
					// ManagementServer.object2ref(p));
				}
				try {
					pw = JavaHttpClient.decryptPassword(pw);
				} catch (Exception e) {
					// System.err.println("ZZZZZ: badly encrypted password: " +
					// ManagementServer.object2ref(p));
					pw = "badly encrypted password";
				}
				buf.append(p.getName()).append("=").append(pw);
			} else {
				String v = p.getValue();
				if (v.startsWith("rsa:")) {
					try {
						v = JavaHttpClient.decryptPassword(v);
					} catch (Exception e) {
						v = "badly encrypted password";
					}
				}
				buf.append(p.getName()).append("=").append(v);
			}
		}
		return buf.toString();
	}

	protected CdapServiceInstance findInstance(String instanceName) {
		for (CdapServiceInstance ii : o.getInstances()) {
			if (ii.getName().equals(instanceName)) {
				return ii;
			}
		}
		throw new RuntimeException("Unable to find instance: " + instanceName);
	}

	private void updateConfigSimple(EObject root, EObject i, String destination,
			CdapInternalApplicationConfiguration a) {
		if (i == null)
			return;
		for (EAttribute attr : i.eClass().getEAllAttributes()) {
			add(root, i, attr, destination, a);
		}
	}

	private void updateConfig(EObject root, EObject i, CdapInternalApplicationConfiguration appConfig) {
		if (i == null)
			return;
		for (EAttribute attr : i.eClass().getEAllAttributes()) {
			EAnnotation anno = attr.getEAnnotation("http://openecomp.org/cdap");
			if (anno == null)
				continue;
			String destination = anno.getDetails().get("destination");
			// System.err.println("AAAAA" + attr.getName() + " " + destination);
			add(root, i, attr, destination, appConfig);
		}
		for (EReference ref : i.eClass().getEAllContainments()) {
			if (ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) i.eGet(ref);
				for (EObject o : l) {
					updateConfig(root, o, appConfig);
				}
			} else {
				updateConfig(root, (EObject) i.eGet(ref), appConfig);
			}
		}
		// System.err.println(ManagementServer.ecore2json(appConfig, 1000, null,
		// true).toString(2));
	}

	private void add(EObject root, EObject i, EAttribute attr, String destination,
			CdapInternalApplicationConfiguration appConfig) {
		// Make this more complex later
		if (i instanceof NamedEntity) {
			NamedEntity n = (NamedEntity) i;
			if (n.getName() != null)
				destination = destination.replace("${name}", n.getName());
		}
		destination = destination.replace("${attrName}", attr.getName());
		String path1 = ManagementServer.object2ref(root);
		String path2 = ManagementServer.object2ref(i);
		String path = path2.replace("/", ".").substring(path1.length() + 1);
		destination = destination.replace("${path}", path);
		String[] a = destination.split(":");
		if (a.length != 3) {
			throw new RuntimeException("Bad CDAP destination annotation: " + destination);
		}
		if ("worker-prefs".equals(a[0])) {
			add(root, appConfig.getWorkers(), a[1], a[2], i, attr);
		}
		if ("service-prefs".equals(a[0])) {
			add(root, appConfig.getServices(), a[1], a[2], i, attr);
		}
		if ("flow-prefs".equals(a[0])) {
			add(root, appConfig.getFlows(), a[1], a[2], i, attr);
		}
		if ("app-prefs".equals(a[0])) {
			add(root, appConfig.getApps(), a[1], a[2], i, attr);
		}
		if ("namespace-prefs".equals(a[0])) {
			add(root, appConfig.getPreferences(), a[2], i, attr);
		}
	}

	private org.openecomp.ncomp.cdap.CdapFactory f = org.openecomp.ncomp.cdap.CdapFactory.eINSTANCE;

	private void add(EObject root, EList<CdapEntityWithPreferences> l, String name, String cdapKey, EObject i,
			EAttribute attr) {
		CdapEntityWithPreferences p = null;
		for (CdapEntityWithPreferences p1 : l) {
			if (p1.getName().equals(name)) {
				p = p1;
				break;
			}
		}
		if (p == null) {
			p = f.createCdapEntityWithPreferences();
			l.add(p);
			p.setName(name);
		}
		add(root, p.getPreferences(), cdapKey, i, attr);
	}

	private void add(EObject root, EList<CdapKeyPair> prefs, String cdapKey, EObject i, EAttribute attr) {
		String value;
		if (attr.isMany()) {
			@SuppressWarnings("unchecked")
			EList<Object> l = (EList<Object>) i.eGet(attr);
			List<String> l2 = new ArrayList<String>();
			for (Object o : l) {
				l2.add((String) ManagementServer.attr2jsonValue(0, o, attr.getEType()));
			}
			value = StringUtil.join(l2, ":");
		} else
			value = (String) ManagementServer.attr2jsonValue(0, i.eGet(attr), attr.getEType());
		CdapKeyPair pair = f.createCdapKeyPair();
		pair.setName(cdapKey);
		pair.setValue(value);
		prefs.add(pair);
	}

	public void start() {

		Thread t = new Thread("cdap service: " + o.getName()) {
			@Override
			public void run() {
				while (true) {
					try {
						if (!controller.getServer().isSlave) {
							updateDeploymentStatus();
						}
						Thread.sleep(60000); // sleep 60 seconds
					} catch (Exception e) {
						ManagementServerUtils.printStackTrace(e);
						logger.fatal("cdap service: " + o.getName() + " : " + e);
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
		System.out.println("CDAP updateDeploymentStatus 1: ");
		for (CdapServiceInstance instance : o.getInstances()) {
			// TODO Docker deployment status
			instance.setStatus(DeploymentStatus.UNDEPLOYED);
			System.out.println("CDAP updateDeploymentStatus 2: " + instance.getName() + " " + instance.getNamespace());
			if (instance.getClusterService() == null)
				continue;
			for (CdapNamespace c : instance.getClusterService().getCluster().getNamespaces()) {
				System.out.println("CDAP updateDeploymentStatus 4: " + c.getName());
				if (instance.getNamespace() != null && instance.getNamespace().equals(c.getName())) {
					instance.setStatus(DeploymentStatus.DEPLOYED);
				}
			}
		}
	}

}
