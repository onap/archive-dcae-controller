
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
	
/**
 */
package org.openecomp.dcae.controller.service.cdap.cluster.manager.impl;

import org.openecomp.dcae.controller.service.cdap.cluster.manager.CdapClusterManager;
import org.openecomp.dcae.controller.service.cdap.cluster.manager.ManagerPackage;
import org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterConfiguration;
import org.openecomp.dcae.controller.service.cdap.cluster.service.ServicePackage;
import org.openecomp.dcae.controller.service.vmmanager.impl.VirtualMachineManagerImpl;
import org.openecomp.ncomp.cdap.CdapApi;
import org.openecomp.ncomp.cdap.CdapCluster;
import org.openecomp.ncomp.cdap.CdapPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cdap Cluster Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.cluster.manager.impl.CdapClusterManagerImpl#getCluster <em>Cluster</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.cluster.manager.impl.CdapClusterManagerImpl#getCdapServiceServers <em>Cdap Service Servers</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.cluster.manager.impl.CdapClusterManagerImpl#getHealthCheckScript <em>Health Check Script</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.cluster.manager.impl.CdapClusterManagerImpl#getTestTimeout <em>Test Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CdapClusterManagerImpl extends VirtualMachineManagerImpl implements CdapClusterManager {
	/**
	 * The cached value of the '{@link #getCluster() <em>Cluster</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCluster()
	 * @generated
	 * @ordered
	 */
	protected CdapCluster cluster;

	/**
	 * The cached value of the '{@link #getCdapServiceServers() <em>Cdap Service Servers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdapServiceServers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> cdapServiceServers;

	/**
	 * The default value of the '{@link #getHealthCheckScript() <em>Health Check Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthCheckScript()
	 * @generated
	 * @ordered
	 */
	protected static final String HEALTH_CHECK_SCRIPT_EDEFAULT = "bin/healthCheck.sh";

	/**
	 * The cached value of the '{@link #getHealthCheckScript() <em>Health Check Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthCheckScript()
	 * @generated
	 * @ordered
	 */
	protected String healthCheckScript = HEALTH_CHECK_SCRIPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestTimeout() <em>Test Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int TEST_TIMEOUT_EDEFAULT = 60000;

	/**
	 * The cached value of the '{@link #getTestTimeout() <em>Test Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestTimeout()
	 * @generated
	 * @ordered
	 */
	protected int testTimeout = TEST_TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdapClusterManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManagerPackage.Literals.CDAP_CLUSTER_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapCluster getCluster() {
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCluster(CdapCluster newCluster, NotificationChain msgs) {
		CdapCluster oldCluster = cluster;
		cluster = newCluster;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManagerPackage.CDAP_CLUSTER_MANAGER__CLUSTER, oldCluster, newCluster);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCluster(CdapCluster newCluster) {
		if (newCluster != cluster) {
			NotificationChain msgs = null;
			if (cluster != null)
				msgs = ((InternalEObject)cluster).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManagerPackage.CDAP_CLUSTER_MANAGER__CLUSTER, null, msgs);
			if (newCluster != null)
				msgs = ((InternalEObject)newCluster).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManagerPackage.CDAP_CLUSTER_MANAGER__CLUSTER, null, msgs);
			msgs = basicSetCluster(newCluster, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.CDAP_CLUSTER_MANAGER__CLUSTER, newCluster, newCluster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCdapServiceServers() {
		if (cdapServiceServers == null) {
			cdapServiceServers = new EDataTypeEList<String>(String.class, this, ManagerPackage.CDAP_CLUSTER_MANAGER__CDAP_SERVICE_SERVERS);
		}
		return cdapServiceServers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHealthCheckScript() {
		return healthCheckScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthCheckScript(String newHealthCheckScript) {
		String oldHealthCheckScript = healthCheckScript;
		healthCheckScript = newHealthCheckScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.CDAP_CLUSTER_MANAGER__HEALTH_CHECK_SCRIPT, oldHealthCheckScript, healthCheckScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTestTimeout() {
		return testTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestTimeout(int newTestTimeout) {
		int oldTestTimeout = testTimeout;
		testTimeout = newTestTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.CDAP_CLUSTER_MANAGER__TEST_TIMEOUT, oldTestTimeout, testTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNamespace(String namespace) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String deleteNamespace(String namespace) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String deployApp(String namespace, String jarfile) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String loadArtifact(String namespace, String artifactName, String jarfile, String version) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String loadArtifactWithConfig(String namespace, String artifactName, String jarfile, String version, String config) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String deleteArtifact(String namespace, String artifactName, String artifactVersion) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String startFlow(String namespace, String appName, String flowId, String extraArgs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String startWorker(String namespace, String appName, String workerId, String extraArgs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String startService(String namespace, String appName, String serviceId, String extraArgs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String startApp(String namespace, String appName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String stopApp(String namespace, String appName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String deleteApp(String namespace, String appName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String loadPreferencesApp(String namespace, String prefsFile, String appId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String loadPreferencesFlow(String namespace, String prefsFile, String appId, String flowId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String loadPreferencesNameSpace(String namespace, String prefsFile) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setPreferencesApp(String namespace, String prefsString, String appId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setPreferencesFlow(String namespace, String prefsString, String appId, String flowId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setPreferencesWorker(String namespace, String prefsString, String appId, String workerId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setPreferencesService(String namespace, String prefsString, String appId, String serviceId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setPreferencesNameSpace(String namespace, String prefsString) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setFlowRunTimeArgs(String namespace, String appId, String flowId, String args) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setFlowletInstances(String namespace, String appId, String flowId, String flowletId, int nInstances) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String stopFlow(String namespace, String appId, String flowId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String stopWorker(String namespace, String appId, String workerId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String stopService(String namespace, String appId, String serviceId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String truncateDataSet(String namespace, String datasetName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String deleteDataset(String namespace, String datasetName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStream(String namespace, String newStreamId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String deleteStream(String namespace, String streamId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStreamEvents(String namespace, String streamId, String startTime, String endTime, int limit) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStreamStats(String namespace, String streamId, String startTime, String endTime, int limit) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String sendEventToStream(String namespace, String streamId, String event) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String trucateStream(String namespace, String streamId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setStreamProperties(String namespace, String streamId, String propsFile) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String restartApp(String namespace, String appId, String progTypes) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createApp(String namespace, String appId, String artifactName, String artifactVersion, String scope) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAppWithConfig(String namespace, String appId, String artifactName, String artifactVersion, String scope, String appConfig) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setDatasetProperties(String namespace, String datasetName, String datasetProperties) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setStreamTTL(String namespace, String streamName, int ttlSeconds) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String suspendSchedule(String namespace, String appId, String scheduleId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String resumeSchedule(String namespace, String appId, String scheduleId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManagerPackage.CDAP_CLUSTER_MANAGER__CLUSTER:
				return basicSetCluster(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManagerPackage.CDAP_CLUSTER_MANAGER__CLUSTER:
				return getCluster();
			case ManagerPackage.CDAP_CLUSTER_MANAGER__CDAP_SERVICE_SERVERS:
				return getCdapServiceServers();
			case ManagerPackage.CDAP_CLUSTER_MANAGER__HEALTH_CHECK_SCRIPT:
				return getHealthCheckScript();
			case ManagerPackage.CDAP_CLUSTER_MANAGER__TEST_TIMEOUT:
				return getTestTimeout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ManagerPackage.CDAP_CLUSTER_MANAGER__CLUSTER:
				setCluster((CdapCluster)newValue);
				return;
			case ManagerPackage.CDAP_CLUSTER_MANAGER__CDAP_SERVICE_SERVERS:
				getCdapServiceServers().clear();
				getCdapServiceServers().addAll((Collection<? extends String>)newValue);
				return;
			case ManagerPackage.CDAP_CLUSTER_MANAGER__HEALTH_CHECK_SCRIPT:
				setHealthCheckScript((String)newValue);
				return;
			case ManagerPackage.CDAP_CLUSTER_MANAGER__TEST_TIMEOUT:
				setTestTimeout((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ManagerPackage.CDAP_CLUSTER_MANAGER__CLUSTER:
				setCluster((CdapCluster)null);
				return;
			case ManagerPackage.CDAP_CLUSTER_MANAGER__CDAP_SERVICE_SERVERS:
				getCdapServiceServers().clear();
				return;
			case ManagerPackage.CDAP_CLUSTER_MANAGER__HEALTH_CHECK_SCRIPT:
				setHealthCheckScript(HEALTH_CHECK_SCRIPT_EDEFAULT);
				return;
			case ManagerPackage.CDAP_CLUSTER_MANAGER__TEST_TIMEOUT:
				setTestTimeout(TEST_TIMEOUT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ManagerPackage.CDAP_CLUSTER_MANAGER__CLUSTER:
				return cluster != null;
			case ManagerPackage.CDAP_CLUSTER_MANAGER__CDAP_SERVICE_SERVERS:
				return cdapServiceServers != null && !cdapServiceServers.isEmpty();
			case ManagerPackage.CDAP_CLUSTER_MANAGER__HEALTH_CHECK_SCRIPT:
				return HEALTH_CHECK_SCRIPT_EDEFAULT == null ? healthCheckScript != null : !HEALTH_CHECK_SCRIPT_EDEFAULT.equals(healthCheckScript);
			case ManagerPackage.CDAP_CLUSTER_MANAGER__TEST_TIMEOUT:
				return testTimeout != TEST_TIMEOUT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CdapClusterConfiguration.class) {
			switch (derivedFeatureID) {
				case ManagerPackage.CDAP_CLUSTER_MANAGER__CLUSTER: return ServicePackage.CDAP_CLUSTER_CONFIGURATION__CLUSTER;
				case ManagerPackage.CDAP_CLUSTER_MANAGER__CDAP_SERVICE_SERVERS: return ServicePackage.CDAP_CLUSTER_CONFIGURATION__CDAP_SERVICE_SERVERS;
				case ManagerPackage.CDAP_CLUSTER_MANAGER__HEALTH_CHECK_SCRIPT: return ServicePackage.CDAP_CLUSTER_CONFIGURATION__HEALTH_CHECK_SCRIPT;
				case ManagerPackage.CDAP_CLUSTER_MANAGER__TEST_TIMEOUT: return ServicePackage.CDAP_CLUSTER_CONFIGURATION__TEST_TIMEOUT;
				default: return -1;
			}
		}
		if (baseClass == CdapApi.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CdapClusterConfiguration.class) {
			switch (baseFeatureID) {
				case ServicePackage.CDAP_CLUSTER_CONFIGURATION__CLUSTER: return ManagerPackage.CDAP_CLUSTER_MANAGER__CLUSTER;
				case ServicePackage.CDAP_CLUSTER_CONFIGURATION__CDAP_SERVICE_SERVERS: return ManagerPackage.CDAP_CLUSTER_MANAGER__CDAP_SERVICE_SERVERS;
				case ServicePackage.CDAP_CLUSTER_CONFIGURATION__HEALTH_CHECK_SCRIPT: return ManagerPackage.CDAP_CLUSTER_MANAGER__HEALTH_CHECK_SCRIPT;
				case ServicePackage.CDAP_CLUSTER_CONFIGURATION__TEST_TIMEOUT: return ManagerPackage.CDAP_CLUSTER_MANAGER__TEST_TIMEOUT;
				default: return -1;
			}
		}
		if (baseClass == CdapApi.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == CdapClusterConfiguration.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == CdapApi.class) {
			switch (baseOperationID) {
				case CdapPackage.CDAP_API___CREATE_NAMESPACE__STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___CREATE_NAMESPACE__STRING;
				case CdapPackage.CDAP_API___DELETE_NAMESPACE__STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___DELETE_NAMESPACE__STRING;
				case CdapPackage.CDAP_API___DEPLOY_APP__STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___DEPLOY_APP__STRING_STRING;
				case CdapPackage.CDAP_API___LOAD_ARTIFACT__STRING_STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___LOAD_ARTIFACT__STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___LOAD_ARTIFACT_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___LOAD_ARTIFACT_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___DELETE_ARTIFACT__STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___DELETE_ARTIFACT__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___START_FLOW__STRING_STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___START_FLOW__STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___START_WORKER__STRING_STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___START_WORKER__STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___START_SERVICE__STRING_STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___START_SERVICE__STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___START_APP__STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___START_APP__STRING_STRING;
				case CdapPackage.CDAP_API___STOP_APP__STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___STOP_APP__STRING_STRING;
				case CdapPackage.CDAP_API___DELETE_APP__STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___DELETE_APP__STRING_STRING;
				case CdapPackage.CDAP_API___LOAD_PREFERENCES_APP__STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___LOAD_PREFERENCES_APP__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___LOAD_PREFERENCES_FLOW__STRING_STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___LOAD_PREFERENCES_FLOW__STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___LOAD_PREFERENCES_NAME_SPACE__STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___LOAD_PREFERENCES_NAME_SPACE__STRING_STRING;
				case CdapPackage.CDAP_API___SET_PREFERENCES_APP__STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___SET_PREFERENCES_APP__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___SET_PREFERENCES_FLOW__STRING_STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___SET_PREFERENCES_FLOW__STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___SET_PREFERENCES_WORKER__STRING_STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___SET_PREFERENCES_WORKER__STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___SET_PREFERENCES_SERVICE__STRING_STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___SET_PREFERENCES_SERVICE__STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___SET_PREFERENCES_NAME_SPACE__STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___SET_PREFERENCES_NAME_SPACE__STRING_STRING;
				case CdapPackage.CDAP_API___SET_FLOW_RUN_TIME_ARGS__STRING_STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___SET_FLOW_RUN_TIME_ARGS__STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___SET_FLOWLET_INSTANCES__STRING_STRING_STRING_STRING_INT: return ManagerPackage.CDAP_CLUSTER_MANAGER___SET_FLOWLET_INSTANCES__STRING_STRING_STRING_STRING_INT;
				case CdapPackage.CDAP_API___STOP_FLOW__STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___STOP_FLOW__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___STOP_WORKER__STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___STOP_WORKER__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___STOP_SERVICE__STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___STOP_SERVICE__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___TRUNCATE_DATA_SET__STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___TRUNCATE_DATA_SET__STRING_STRING;
				case CdapPackage.CDAP_API___DELETE_DATASET__STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___DELETE_DATASET__STRING_STRING;
				case CdapPackage.CDAP_API___CREATE_STREAM__STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___CREATE_STREAM__STRING_STRING;
				case CdapPackage.CDAP_API___DELETE_STREAM__STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___DELETE_STREAM__STRING_STRING;
				case CdapPackage.CDAP_API___GET_STREAM_EVENTS__STRING_STRING_STRING_STRING_INT: return ManagerPackage.CDAP_CLUSTER_MANAGER___GET_STREAM_EVENTS__STRING_STRING_STRING_STRING_INT;
				case CdapPackage.CDAP_API___GET_STREAM_STATS__STRING_STRING_STRING_STRING_INT: return ManagerPackage.CDAP_CLUSTER_MANAGER___GET_STREAM_STATS__STRING_STRING_STRING_STRING_INT;
				case CdapPackage.CDAP_API___SEND_EVENT_TO_STREAM__STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___SEND_EVENT_TO_STREAM__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___TRUCATE_STREAM__STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___TRUCATE_STREAM__STRING_STRING;
				case CdapPackage.CDAP_API___SET_STREAM_PROPERTIES__STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___SET_STREAM_PROPERTIES__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___RESTART_APP__STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___RESTART_APP__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___CREATE_APP__STRING_STRING_STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___CREATE_APP__STRING_STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___CREATE_APP_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___CREATE_APP_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___SET_DATASET_PROPERTIES__STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___SET_DATASET_PROPERTIES__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___SET_STREAM_TTL__STRING_STRING_INT: return ManagerPackage.CDAP_CLUSTER_MANAGER___SET_STREAM_TTL__STRING_STRING_INT;
				case CdapPackage.CDAP_API___SUSPEND_SCHEDULE__STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___SUSPEND_SCHEDULE__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___RESUME_SCHEDULE__STRING_STRING_STRING: return ManagerPackage.CDAP_CLUSTER_MANAGER___RESUME_SCHEDULE__STRING_STRING_STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ManagerPackage.CDAP_CLUSTER_MANAGER___CREATE_NAMESPACE__STRING:
				return createNamespace((String)arguments.get(0));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___DELETE_NAMESPACE__STRING:
				return deleteNamespace((String)arguments.get(0));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___DEPLOY_APP__STRING_STRING:
				return deployApp((String)arguments.get(0), (String)arguments.get(1));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___LOAD_ARTIFACT__STRING_STRING_STRING_STRING:
				return loadArtifact((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___LOAD_ARTIFACT_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING:
				return loadArtifactWithConfig((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___DELETE_ARTIFACT__STRING_STRING_STRING:
				return deleteArtifact((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___START_FLOW__STRING_STRING_STRING_STRING:
				return startFlow((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___START_WORKER__STRING_STRING_STRING_STRING:
				return startWorker((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___START_SERVICE__STRING_STRING_STRING_STRING:
				return startService((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___START_APP__STRING_STRING:
				return startApp((String)arguments.get(0), (String)arguments.get(1));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___STOP_APP__STRING_STRING:
				return stopApp((String)arguments.get(0), (String)arguments.get(1));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___DELETE_APP__STRING_STRING:
				return deleteApp((String)arguments.get(0), (String)arguments.get(1));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___LOAD_PREFERENCES_APP__STRING_STRING_STRING:
				return loadPreferencesApp((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___LOAD_PREFERENCES_FLOW__STRING_STRING_STRING_STRING:
				return loadPreferencesFlow((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___LOAD_PREFERENCES_NAME_SPACE__STRING_STRING:
				return loadPreferencesNameSpace((String)arguments.get(0), (String)arguments.get(1));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___SET_PREFERENCES_APP__STRING_STRING_STRING:
				return setPreferencesApp((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___SET_PREFERENCES_FLOW__STRING_STRING_STRING_STRING:
				return setPreferencesFlow((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___SET_PREFERENCES_WORKER__STRING_STRING_STRING_STRING:
				return setPreferencesWorker((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___SET_PREFERENCES_SERVICE__STRING_STRING_STRING_STRING:
				return setPreferencesService((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___SET_PREFERENCES_NAME_SPACE__STRING_STRING:
				return setPreferencesNameSpace((String)arguments.get(0), (String)arguments.get(1));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___SET_FLOW_RUN_TIME_ARGS__STRING_STRING_STRING_STRING:
				return setFlowRunTimeArgs((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___SET_FLOWLET_INSTANCES__STRING_STRING_STRING_STRING_INT:
				return setFlowletInstances((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Integer)arguments.get(4));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___STOP_FLOW__STRING_STRING_STRING:
				return stopFlow((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___STOP_WORKER__STRING_STRING_STRING:
				return stopWorker((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___STOP_SERVICE__STRING_STRING_STRING:
				return stopService((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___TRUNCATE_DATA_SET__STRING_STRING:
				return truncateDataSet((String)arguments.get(0), (String)arguments.get(1));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___DELETE_DATASET__STRING_STRING:
				return deleteDataset((String)arguments.get(0), (String)arguments.get(1));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___CREATE_STREAM__STRING_STRING:
				return createStream((String)arguments.get(0), (String)arguments.get(1));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___DELETE_STREAM__STRING_STRING:
				return deleteStream((String)arguments.get(0), (String)arguments.get(1));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___GET_STREAM_EVENTS__STRING_STRING_STRING_STRING_INT:
				return getStreamEvents((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Integer)arguments.get(4));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___GET_STREAM_STATS__STRING_STRING_STRING_STRING_INT:
				return getStreamStats((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Integer)arguments.get(4));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___SEND_EVENT_TO_STREAM__STRING_STRING_STRING:
				return sendEventToStream((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___TRUCATE_STREAM__STRING_STRING:
				return trucateStream((String)arguments.get(0), (String)arguments.get(1));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___SET_STREAM_PROPERTIES__STRING_STRING_STRING:
				return setStreamProperties((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___RESTART_APP__STRING_STRING_STRING:
				return restartApp((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___CREATE_APP__STRING_STRING_STRING_STRING_STRING:
				return createApp((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___CREATE_APP_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING_STRING:
				return createAppWithConfig((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___SET_DATASET_PROPERTIES__STRING_STRING_STRING:
				return setDatasetProperties((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___SET_STREAM_TTL__STRING_STRING_INT:
				return setStreamTTL((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___SUSPEND_SCHEDULE__STRING_STRING_STRING:
				return suspendSchedule((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case ManagerPackage.CDAP_CLUSTER_MANAGER___RESUME_SCHEDULE__STRING_STRING_STRING:
				return resumeSchedule((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cdapServiceServers: ");
		result.append(cdapServiceServers);
		result.append(", healthCheckScript: ");
		result.append(healthCheckScript);
		result.append(", testTimeout: ");
		result.append(testTimeout);
		result.append(')');
		return result.toString();
	}

} //CdapClusterManagerImpl
