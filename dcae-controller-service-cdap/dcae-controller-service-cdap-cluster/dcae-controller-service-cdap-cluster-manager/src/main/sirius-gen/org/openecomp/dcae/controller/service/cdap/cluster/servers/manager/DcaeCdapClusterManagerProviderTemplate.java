
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





import java.io.InputStream;

import org.openecomp.ncomp.sirius.manager.IRequestHandler;
import org.openecomp.ncomp.sirius.manager.ISiriusPlugin;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.function.FunctionUtils;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;



import java.util.Date;


import org.openecomp.ncomp.sirius.manager.server.LoggerInfo;


import org.openecomp.ncomp.sirius.manager.server.ServerFactory;


import org.openecomp.dcae.controller.service.servers.vmmanager.DcaeVirtualMachineManagerProvider;


import org.openecomp.dcae.controller.service.cdap.cluster.manager.impl.CdapClusterManagerImpl;
import org.openecomp.dcae.controller.service.cdap.cluster.manager.CdapClusterManager;


public class DcaeCdapClusterManagerProviderTemplate extends DcaeVirtualMachineManagerProvider {
	private static final Logger logger = Logger.getLogger(DcaeCdapClusterManagerProviderTemplate.class);
	CdapClusterManager o;

	public DcaeCdapClusterManagerProviderTemplate(ISiriusServer controller, CdapClusterManager o) {
		super(controller, o);
		this.o = o;
	}

	public java.lang.String createNamespace(java.lang.String namespace) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String deleteNamespace(java.lang.String namespace) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String deployApp(java.lang.String namespace, java.lang.String jarfile) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String loadArtifact(java.lang.String namespace, java.lang.String artifactName, java.lang.String jarfile, java.lang.String version) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String loadArtifactWithConfig(java.lang.String namespace, java.lang.String artifactName, java.lang.String jarfile, java.lang.String version, java.lang.String config) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String deleteArtifact(java.lang.String namespace, java.lang.String artifactName, java.lang.String artifactVersion) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String startFlow(java.lang.String namespace, java.lang.String appName, java.lang.String flowId, java.lang.String extraArgs) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String startWorker(java.lang.String namespace, java.lang.String appName, java.lang.String workerId, java.lang.String extraArgs) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String startService(java.lang.String namespace, java.lang.String appName, java.lang.String serviceId, java.lang.String extraArgs) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String startApp(java.lang.String namespace, java.lang.String appName) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String stopApp(java.lang.String namespace, java.lang.String appName) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String deleteApp(java.lang.String namespace, java.lang.String appName) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String loadPreferencesApp(java.lang.String namespace, java.lang.String prefsFile, java.lang.String appId) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String loadPreferencesFlow(java.lang.String namespace, java.lang.String prefsFile, java.lang.String appId, java.lang.String flowId) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String loadPreferencesNameSpace(java.lang.String namespace, java.lang.String prefsFile) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String setPreferencesApp(java.lang.String namespace, java.lang.String prefsString, java.lang.String appId) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String setPreferencesFlow(java.lang.String namespace, java.lang.String prefsString, java.lang.String appId, java.lang.String flowId) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String setPreferencesWorker(java.lang.String namespace, java.lang.String prefsString, java.lang.String appId, java.lang.String workerId) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String setPreferencesService(java.lang.String namespace, java.lang.String prefsString, java.lang.String appId, java.lang.String serviceId) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String setPreferencesNameSpace(java.lang.String namespace, java.lang.String prefsString) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String setFlowRunTimeArgs(java.lang.String namespace, java.lang.String appId, java.lang.String flowId, java.lang.String args) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String setFlowletInstances(java.lang.String namespace, java.lang.String appId, java.lang.String flowId, java.lang.String flowletId, int nInstances) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String stopFlow(java.lang.String namespace, java.lang.String appId, java.lang.String flowId) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String stopWorker(java.lang.String namespace, java.lang.String appId, java.lang.String workerId) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String stopService(java.lang.String namespace, java.lang.String appId, java.lang.String serviceId) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String truncateDataSet(java.lang.String namespace, java.lang.String datasetName) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String deleteDataset(java.lang.String namespace, java.lang.String datasetName) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String createStream(java.lang.String namespace, java.lang.String newStreamId) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String deleteStream(java.lang.String namespace, java.lang.String streamId) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public EList<java.lang.String> getStreamEvents(java.lang.String namespace, java.lang.String streamId, java.lang.String startTime, java.lang.String endTime, int limit) {
		EList<java.lang.String> res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public EList<java.lang.String> getStreamStats(java.lang.String namespace, java.lang.String streamId, java.lang.String startTime, java.lang.String endTime, int limit) {
		EList<java.lang.String> res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String sendEventToStream(java.lang.String namespace, java.lang.String streamId, java.lang.String event) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String trucateStream(java.lang.String namespace, java.lang.String streamId) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String setStreamProperties(java.lang.String namespace, java.lang.String streamId, java.lang.String propsFile) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String restartApp(java.lang.String namespace, java.lang.String appId, java.lang.String progTypes) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String createApp(java.lang.String namespace, java.lang.String appId, java.lang.String artifactName, java.lang.String artifactVersion, java.lang.String scope) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String createAppWithConfig(java.lang.String namespace, java.lang.String appId, java.lang.String artifactName, java.lang.String artifactVersion, java.lang.String scope, java.lang.String appConfig) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String setDatasetProperties(java.lang.String namespace, java.lang.String datasetName, java.lang.String datasetProperties) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String setStreamTTL(java.lang.String namespace, java.lang.String streamName, int ttlSeconds) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String suspendSchedule(java.lang.String namespace, java.lang.String appId, java.lang.String scheduleId) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public java.lang.String resumeSchedule(java.lang.String namespace, java.lang.String appId, java.lang.String scheduleId) {
		java.lang.String res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}





	
}
