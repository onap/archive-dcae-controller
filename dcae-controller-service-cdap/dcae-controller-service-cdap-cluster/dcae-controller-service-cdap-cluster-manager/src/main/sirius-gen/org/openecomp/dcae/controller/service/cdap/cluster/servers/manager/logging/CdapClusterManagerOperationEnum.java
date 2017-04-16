
package org.openecomp.dcae.controller.service.cdap.cluster.servers.manager.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum CdapClusterManagerOperationEnum implements EcompOperationEnum {

  CdapClusterManager_test("CdapClusterManager@test"),
  CdapClusterManager_suspend("CdapClusterManager@suspend"),
  CdapClusterManager_resume("CdapClusterManager@resume"),
  CdapClusterManager_publicKey("CdapClusterManager@publicKey"),
  CdapClusterManager_configurationChanged("CdapClusterManager@configurationChanged"),
  CdapClusterManager_updateStreams("CdapClusterManager@updateStreams"),
  CdapClusterManager_logs("CdapClusterManager@logs"),
  CdapClusterManager_metrics("CdapClusterManager@metrics"),
  CdapClusterManager_properties("CdapClusterManager@properties"),
  CdapClusterManager_uploadInfo("CdapClusterManager@uploadInfo"),
  CdapClusterManager_getValues("CdapClusterManager@getValues"),
  CdapClusterManager_getValuesAll("CdapClusterManager@getValuesAll"),
  CdapClusterManager_getMessages("CdapClusterManager@getMessages"),
  CdapClusterManager_getRequestLogger("CdapClusterManager@getRequestLogger"),
  CdapClusterManager_evaluate("CdapClusterManager@evaluate"),
  CdapClusterManager_update("CdapClusterManager@update"),
  CdapClusterManager_createNamespace("CdapClusterManager@createNamespace"),
  CdapClusterManager_deleteNamespace("CdapClusterManager@deleteNamespace"),
  CdapClusterManager_deployApp("CdapClusterManager@deployApp"),
  CdapClusterManager_loadArtifact("CdapClusterManager@loadArtifact"),
  CdapClusterManager_loadArtifactWithConfig("CdapClusterManager@loadArtifactWithConfig"),
  CdapClusterManager_deleteArtifact("CdapClusterManager@deleteArtifact"),
  CdapClusterManager_startFlow("CdapClusterManager@startFlow"),
  CdapClusterManager_startWorker("CdapClusterManager@startWorker"),
  CdapClusterManager_startService("CdapClusterManager@startService"),
  CdapClusterManager_startApp("CdapClusterManager@startApp"),
  CdapClusterManager_stopApp("CdapClusterManager@stopApp"),
  CdapClusterManager_deleteApp("CdapClusterManager@deleteApp"),
  CdapClusterManager_loadPreferencesApp("CdapClusterManager@loadPreferencesApp"),
  CdapClusterManager_loadPreferencesFlow("CdapClusterManager@loadPreferencesFlow"),
  CdapClusterManager_loadPreferencesNameSpace("CdapClusterManager@loadPreferencesNameSpace"),
  CdapClusterManager_setPreferencesApp("CdapClusterManager@setPreferencesApp"),
  CdapClusterManager_setPreferencesFlow("CdapClusterManager@setPreferencesFlow"),
  CdapClusterManager_setPreferencesWorker("CdapClusterManager@setPreferencesWorker"),
  CdapClusterManager_setPreferencesService("CdapClusterManager@setPreferencesService"),
  CdapClusterManager_setPreferencesNameSpace("CdapClusterManager@setPreferencesNameSpace"),
  CdapClusterManager_setFlowRunTimeArgs("CdapClusterManager@setFlowRunTimeArgs"),
  CdapClusterManager_setFlowletInstances("CdapClusterManager@setFlowletInstances"),
  CdapClusterManager_stopFlow("CdapClusterManager@stopFlow"),
  CdapClusterManager_stopWorker("CdapClusterManager@stopWorker"),
  CdapClusterManager_stopService("CdapClusterManager@stopService"),
  CdapClusterManager_truncateDataSet("CdapClusterManager@truncateDataSet"),
  CdapClusterManager_deleteDataset("CdapClusterManager@deleteDataset"),
  CdapClusterManager_createStream("CdapClusterManager@createStream"),
  CdapClusterManager_deleteStream("CdapClusterManager@deleteStream"),
  CdapClusterManager_getStreamEvents("CdapClusterManager@getStreamEvents"),
  CdapClusterManager_getStreamStats("CdapClusterManager@getStreamStats"),
  CdapClusterManager_sendEventToStream("CdapClusterManager@sendEventToStream"),
  CdapClusterManager_trucateStream("CdapClusterManager@trucateStream"),
  CdapClusterManager_setStreamProperties("CdapClusterManager@setStreamProperties"),
  CdapClusterManager_restartApp("CdapClusterManager@restartApp"),
  CdapClusterManager_createApp("CdapClusterManager@createApp"),
  CdapClusterManager_createAppWithConfig("CdapClusterManager@createAppWithConfig"),
  CdapClusterManager_setDatasetProperties("CdapClusterManager@setDatasetProperties"),
  CdapClusterManager_setStreamTTL("CdapClusterManager@setStreamTTL"),
  CdapClusterManager_suspendSchedule("CdapClusterManager@suspendSchedule"),
  CdapClusterManager_resumeSchedule("CdapClusterManager@resumeSchedule") ; 


	private String n;
	
	private CdapClusterManagerOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
