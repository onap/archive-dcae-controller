
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
package org.openecomp.dcae.controller.service.cdap.cluster.service.impl;

import org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterConfiguration;
import org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterServiceInstance;
import org.openecomp.dcae.controller.service.cdap.cluster.service.ServicePackage;

import org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl;

import org.openecomp.ncomp.cdap.CdapCluster;

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
 * An implementation of the model object '<em><b>Cdap Cluster Service Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.cluster.service.impl.CdapClusterServiceInstanceImpl#getCluster <em>Cluster</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.cluster.service.impl.CdapClusterServiceInstanceImpl#getCdapServiceServers <em>Cdap Service Servers</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.cluster.service.impl.CdapClusterServiceInstanceImpl#getHealthCheckScript <em>Health Check Script</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.cluster.service.impl.CdapClusterServiceInstanceImpl#getTestTimeout <em>Test Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CdapClusterServiceInstanceImpl extends VirtualMachineServiceInstanceImpl implements CdapClusterServiceInstance {
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
	protected CdapClusterServiceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.CDAP_CLUSTER_SERVICE_INSTANCE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__CLUSTER, oldCluster, newCluster);
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
				msgs = ((InternalEObject)cluster).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__CLUSTER, null, msgs);
			if (newCluster != null)
				msgs = ((InternalEObject)newCluster).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__CLUSTER, null, msgs);
			msgs = basicSetCluster(newCluster, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__CLUSTER, newCluster, newCluster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCdapServiceServers() {
		if (cdapServiceServers == null) {
			cdapServiceServers = new EDataTypeEList<String>(String.class, this, ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__CDAP_SERVICE_SERVERS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__HEALTH_CHECK_SCRIPT, oldHealthCheckScript, healthCheckScript));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__TEST_TIMEOUT, oldTestTimeout, testTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__CLUSTER:
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
			case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__CLUSTER:
				return getCluster();
			case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__CDAP_SERVICE_SERVERS:
				return getCdapServiceServers();
			case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__HEALTH_CHECK_SCRIPT:
				return getHealthCheckScript();
			case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__TEST_TIMEOUT:
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
			case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__CLUSTER:
				setCluster((CdapCluster)newValue);
				return;
			case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__CDAP_SERVICE_SERVERS:
				getCdapServiceServers().clear();
				getCdapServiceServers().addAll((Collection<? extends String>)newValue);
				return;
			case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__HEALTH_CHECK_SCRIPT:
				setHealthCheckScript((String)newValue);
				return;
			case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__TEST_TIMEOUT:
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
			case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__CLUSTER:
				setCluster((CdapCluster)null);
				return;
			case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__CDAP_SERVICE_SERVERS:
				getCdapServiceServers().clear();
				return;
			case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__HEALTH_CHECK_SCRIPT:
				setHealthCheckScript(HEALTH_CHECK_SCRIPT_EDEFAULT);
				return;
			case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__TEST_TIMEOUT:
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
			case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__CLUSTER:
				return cluster != null;
			case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__CDAP_SERVICE_SERVERS:
				return cdapServiceServers != null && !cdapServiceServers.isEmpty();
			case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__HEALTH_CHECK_SCRIPT:
				return HEALTH_CHECK_SCRIPT_EDEFAULT == null ? healthCheckScript != null : !HEALTH_CHECK_SCRIPT_EDEFAULT.equals(healthCheckScript);
			case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__TEST_TIMEOUT:
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
				case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__CLUSTER: return ServicePackage.CDAP_CLUSTER_CONFIGURATION__CLUSTER;
				case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__CDAP_SERVICE_SERVERS: return ServicePackage.CDAP_CLUSTER_CONFIGURATION__CDAP_SERVICE_SERVERS;
				case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__HEALTH_CHECK_SCRIPT: return ServicePackage.CDAP_CLUSTER_CONFIGURATION__HEALTH_CHECK_SCRIPT;
				case ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__TEST_TIMEOUT: return ServicePackage.CDAP_CLUSTER_CONFIGURATION__TEST_TIMEOUT;
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
				case ServicePackage.CDAP_CLUSTER_CONFIGURATION__CLUSTER: return ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__CLUSTER;
				case ServicePackage.CDAP_CLUSTER_CONFIGURATION__CDAP_SERVICE_SERVERS: return ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__CDAP_SERVICE_SERVERS;
				case ServicePackage.CDAP_CLUSTER_CONFIGURATION__HEALTH_CHECK_SCRIPT: return ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__HEALTH_CHECK_SCRIPT;
				case ServicePackage.CDAP_CLUSTER_CONFIGURATION__TEST_TIMEOUT: return ServicePackage.CDAP_CLUSTER_SERVICE_INSTANCE__TEST_TIMEOUT;
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

} //CdapClusterServiceInstanceImpl
