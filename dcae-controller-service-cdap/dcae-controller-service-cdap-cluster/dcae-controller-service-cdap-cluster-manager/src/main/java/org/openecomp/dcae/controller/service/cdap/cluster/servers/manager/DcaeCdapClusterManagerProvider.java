
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
	
package org.openecomp.dcae.controller.service.cdap.cluster.servers.manager;

import org.openecomp.ncomp.cdap.CdapCluster;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.openecomp.ncomp.utils.ShellCmd;
import org.openecomp.dcae.controller.core.service.HealthTestResponse;
import org.openecomp.dcae.controller.core.service.HealthTestStatus;
import org.openecomp.dcae.controller.core.service.ServiceFactory;
import org.openecomp.dcae.controller.service.cdap.cluster.manager.CdapClusterManager;
import org.openecomp.dcae.controller.service.servers.vmmanager.DcaeVirtualMachineManagerProvider;

public class DcaeCdapClusterManagerProvider extends DcaeVirtualMachineManagerProvider {
	private static final Logger logger = Logger.getLogger(DcaeCdapClusterManagerProvider.class);
	CdapClusterManager o;

	public DcaeCdapClusterManagerProvider(ISiriusServer controller, CdapClusterManager o) {
		super(controller, o);
		this.o = o;
	}

	private CdapCluster getCluster() {
		if (o.getCluster() == null) {
			logger.warn("Unable to find cluster");
			throw new RuntimeException("Unable to find cluster");
		}
		return o.getCluster();
	}
	
	@Override
	public HealthTestResponse test() {
		String s = run(o.getHealthCheckScript(), o.getTestTimeout());
		String a[] = s.split(":");
		int index = s.indexOf(":");
		String msg = index < 0 ? null : s.substring(index);
		HealthTestResponse res = ServiceFactory.eINSTANCE.createHealthTestResponse();
		if ("GREEN".equalsIgnoreCase(a[0])) {
			res.setStatus(HealthTestStatus.GREEN);
			res.setMessageCode(msg);
		} else if ("YELLOW".equalsIgnoreCase(a[0])) {
			res.setStatus(HealthTestStatus.YELLOW);
			res.setMessageCode(msg);
		} else if ("RED".equalsIgnoreCase(a[0])) {
			res.setStatus(HealthTestStatus.RED);
			res.setMessageCode(msg);
		} else {
			res.setStatus(HealthTestStatus.RED);
			res.setMessageCode("Bad return string: " + s);
		}
		return res;
	}
	
	private String run(String cmd, long wait) {
		try {
			ShellCmd worker = new ShellCmd(cmd);
			return worker.result(wait);
		} catch (Exception e) {
			logger.warn("Unable to run cmd: " + cmd + " " + e);
			return "RED:Unable to run cmd: " + cmd + " " + e;
		}
	}

	public String loadArtifact(String namespace, String artifactName, String jarfile, String version) {
		return getCluster().loadArtifact(namespace, artifactName, jarfile, version);
	}

	public String startFlow(String namespace, String appName, String flowId, String extraArgs) {
		return getCluster().startFlow(namespace, appName, flowId, extraArgs);
	}

	public String startService(String namespace, String appName, String serviceId, String extraArgs) {
		return getCluster().startService(namespace, appName, serviceId, extraArgs);
	}

	public String startApp(String namespace, String appName) {
		return getCluster().startApp(namespace, appName);
	}

	public String deleteApp(String namespace, String appName) {
		return getCluster().deleteApp(namespace, appName);
	}

	public String loadPreferencesApp(String namespace, String prefsFile, String appId) {
		return getCluster().loadPreferencesApp(namespace, prefsFile, appId);
	}

	public String loadPreferencesFlow(String namespace, String prefsFile, String appId, String flowId) {
		return getCluster().loadPreferencesFlow(namespace, prefsFile, appId, flowId);
	}

	public String loadPreferencesNameSpace(String namespace, String prefsFile) {
		return getCluster().loadPreferencesNameSpace(namespace, prefsFile);
	}

	public String setPreferencesApp(String namespace, String prefsString, String appId) {
		return getCluster().setPreferencesApp(namespace, prefsString, appId);
	}

	public String setPreferencesFlow(String namespace, String prefsString, String appId, String flowId) {
		return getCluster().setPreferencesFlow(namespace, prefsString, appId, flowId);
	}

	public String setPreferencesWorker(String namespace, String prefsString, String appId, String workerId) {
		return getCluster().setPreferencesWorker(namespace, prefsString, appId, workerId);
	}

	public String setPreferencesNameSpace(String namespace, String prefsString) {
		return getCluster().setPreferencesNameSpace(namespace, prefsString);
	}

	public String setFlowRunTimeArgs(String namespace, String appId, String flowId, String args) {
		return getCluster().setFlowRunTimeArgs(namespace, appId, flowId, args);
	}

	public String setFlowletInstances(String namespace, String appId, String flowId, String flowletId, int nInstances) {
		return getCluster().setFlowletInstances(namespace, appId, flowId, flowletId, nInstances);
	}

	public String stopFlow(String namespace, String appId, String flowId) {
		return getCluster().stopFlow(namespace, appId, flowId);
	}

	public String stopService(String namespace, String appId, String serviceId) {
		return getCluster().stopService(namespace, appId, serviceId);
	}

	public String truncateDataSet(String namespace, String datasetName) {
		return getCluster().truncateDataSet(namespace, datasetName);
	}

	public String createStream(String namespace, String newStreamId) {
		return getCluster().createStream(namespace, newStreamId);
	}

	public String deleteStream(String namespace, String streamId) {
		return getCluster().deleteStream(namespace, streamId);
	}

	public EList<String> getStreamEvents(String namespace, String streamId, String startTime, String endTime, int limit) {
		return getCluster().getStreamEvents(namespace, streamId, startTime, endTime, limit);
	}

	public EList<String> getStreamStats(String namespace, String streamId, String startTime, String endTime, int limit) {
		return getCluster().getStreamStats(namespace, streamId, startTime, endTime, limit);
	}

	public String sendEventToStream(String namespace, String streamId, String event) {
		return getCluster().sendEventToStream(namespace, streamId, event);
	}

	public String trucateStream(String namespace, String streamId) {
		return getCluster().trucateStream(namespace, streamId);
	}

	public String setStreamProperties(String namespace, String streamId, String propsFile) {
		return getCluster().setStreamProperties(namespace, streamId, propsFile);
	}

	public String createNamespace(String namespace) {
		return getCluster().createNamespace(namespace);
	}
	public String deleteNamespace(String namespace) {
		return getCluster().deleteNamespace(namespace);
	}

	public String deployApp(String namespace, String jarfile) {
		return getCluster().deployApp(namespace, jarfile);
	}

	public String deleteArtifact(String namespace, String artifactName, String artifactVersion) {
		return getCluster().deleteArtifact(namespace, artifactName, artifactVersion);
	}

	public String deleteDataset(String namespace, String datasetName) {
		return getCluster().deleteDataset(namespace, datasetName);
	}

	public String createApp(String namespace, String appId, String artifactName, String artifactVersion, String scope) {
		return getCluster().createApp(namespace, appId, artifactName, artifactVersion, scope);
	}

	public String createAppWithConfig(String namespace, String appId, String artifactName, String artifactVersion, String scope,
			String appConfig) {
		return getCluster().createAppWithConfig(namespace, appId, artifactName, artifactVersion, scope, appConfig);
	}

	public String restartApp(String namespace, String appId, String progTypes) {
		return getCluster().restartApp(namespace, appId, progTypes);
	}

	public String setDatasetProperties(String namespace, String datasetName, String datasetProperties) {
        return getCluster().setDatasetProperties(namespace, datasetName, datasetProperties); 
    }	
	
	public String setStreamTTL(String namespace, String streamName, int ttlSeconds) {
        return getCluster().setStreamTTL(namespace, streamName, ttlSeconds);
	}
	@Override
	public void configurationChanged() {
//		JSONObject json = ManagementServer.ecore2json(o, 1000, null, true);
//		System.err.println(json.toString(2));
	}

	public String stopApp(String namespace, String appName) {
		return getCluster().stopApp(namespace, appName);
	}

	public String startWorker(String namespace, String appName,
			String workerId, String extraArgs) {
		return getCluster().startWorker(namespace, appName, workerId, extraArgs);
	}

	public String stopWorker(String namespace, String appId, String workerId) {
		return getCluster().stopWorker(namespace, appId, workerId);
	}

	public String setPreferencesService(String namespace, String prefsString, String appId, String serviceId) {
		return getCluster().setPreferencesService(namespace, prefsString, appId, serviceId);
	}

	public String resumeSchedule(String namespace, String appId, String scheduleId) {
		return getCluster().resumeSchedule(namespace, appId, scheduleId);
	}

	public String suspendSchedule(String namespace, String appId, String scheduleId) {
		return getCluster().suspendSchedule(namespace, appId, scheduleId);
	}

	public String loadArtifactWithConfig(String namespace, String artifactName, String jarfile, String version,
			String config) {
		return getCluster().loadArtifactWithConfig(namespace, artifactName, jarfile, version, config);
	}

}
