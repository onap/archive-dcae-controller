
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
package org.openecomp.dcae.controller.service.cdap.impl;

import org.openecomp.dcae.controller.core.service.impl.DcaeServiceInstanceImpl;

import org.openecomp.dcae.controller.service.cdap.CdapApplication;
import org.openecomp.dcae.controller.service.cdap.CdapArtifact;
import org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration;
import org.openecomp.dcae.controller.service.cdap.CdapPackage;
import org.openecomp.dcae.controller.service.cdap.CdapService;
import org.openecomp.dcae.controller.service.cdap.CdapServiceInstance;

import org.openecomp.dcae.controller.service.cdap.CdapServiceInstanceConfiguration;
import org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterServiceInstance;
import org.openecomp.ncomp.cdap.CdapNamespace;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl#getCdapName <em>Cdap Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl#getAppJar <em>App Jar</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl#getAppConfigFile <em>App Config File</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl#getApps <em>Apps</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl#getAppNames <em>App Names</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl#getWorkerNames <em>Worker Names</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl#getFlowNames <em>Flow Names</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl#getServiceNames <em>Service Names</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl#getCdapConfiguration <em>Cdap Configuration</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl#getClusterService <em>Cluster Service</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl#getCdapNamespace <em>Cdap Namespace</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CdapServiceInstanceImpl extends DcaeServiceInstanceImpl implements CdapServiceInstance {
	/**
	 * The default value of the '{@link #getCdapName() <em>Cdap Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdapName()
	 * @generated
	 * @ordered
	 */
	protected static final String CDAP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCdapName() <em>Cdap Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdapName()
	 * @generated
	 * @ordered
	 */
	protected String cdapName = CDAP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAppJar() <em>App Jar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppJar()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_JAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppJar() <em>App Jar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppJar()
	 * @generated
	 * @ordered
	 */
	protected String appJar = APP_JAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAppConfigFile() <em>App Config File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppConfigFile()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_CONFIG_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppConfigFile() <em>App Config File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppConfigFile()
	 * @generated
	 * @ordered
	 */
	protected String appConfigFile = APP_CONFIG_FILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<CdapArtifact> artifacts;

	/**
	 * The cached value of the '{@link #getApps() <em>Apps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApps()
	 * @generated
	 * @ordered
	 */
	protected EList<CdapApplication> apps;

	/**
	 * The cached value of the '{@link #getAppNames() <em>App Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> appNames;

	/**
	 * The cached value of the '{@link #getWorkerNames() <em>Worker Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> workerNames;

	/**
	 * The cached value of the '{@link #getFlowNames() <em>Flow Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> flowNames;

	/**
	 * The cached value of the '{@link #getServiceNames() <em>Service Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serviceNames;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected CdapServiceInstanceConfiguration configuration;

	/**
	 * The cached value of the '{@link #getCdapConfiguration() <em>Cdap Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdapConfiguration()
	 * @generated
	 * @ordered
	 */
	protected CdapInternalApplicationConfiguration cdapConfiguration;

	/**
	 * The cached value of the '{@link #getClusterService() <em>Cluster Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterService()
	 * @generated
	 * @ordered
	 */
	protected CdapClusterServiceInstance clusterService;

	/**
	 * The cached value of the '{@link #getCdapNamespace() <em>Cdap Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdapNamespace()
	 * @generated
	 * @ordered
	 */
	protected CdapNamespace cdapNamespace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdapServiceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdapPackage.Literals.CDAP_SERVICE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCdapName() {
		return cdapName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCdapName(String newCdapName) {
		String oldCdapName = cdapName;
		cdapName = newCdapName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_NAME, oldCdapName, cdapName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapNamespace getCdapNamespace() {
		if (cdapNamespace != null && cdapNamespace.eIsProxy()) {
			InternalEObject oldCdapNamespace = (InternalEObject)cdapNamespace;
			cdapNamespace = (CdapNamespace)eResolveProxy(oldCdapNamespace);
			if (cdapNamespace != oldCdapNamespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_NAMESPACE, oldCdapNamespace, cdapNamespace));
			}
		}
		return cdapNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapNamespace basicGetCdapNamespace() {
		return cdapNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCdapNamespace(CdapNamespace newCdapNamespace) {
		CdapNamespace oldCdapNamespace = cdapNamespace;
		cdapNamespace = newCdapNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_NAMESPACE, oldCdapNamespace, cdapNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_SERVICE_INSTANCE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppJar() {
		return appJar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppJar(String newAppJar) {
		String oldAppJar = appJar;
		appJar = newAppJar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_SERVICE_INSTANCE__APP_JAR, oldAppJar, appJar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppConfigFile() {
		return appConfigFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppConfigFile(String newAppConfigFile) {
		String oldAppConfigFile = appConfigFile;
		appConfigFile = newAppConfigFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_SERVICE_INSTANCE__APP_CONFIG_FILE, oldAppConfigFile, appConfigFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CdapArtifact> getArtifacts() {
		if (artifacts == null) {
			artifacts = new EObjectContainmentEList<CdapArtifact>(CdapArtifact.class, this, CdapPackage.CDAP_SERVICE_INSTANCE__ARTIFACTS);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CdapApplication> getApps() {
		if (apps == null) {
			apps = new EObjectContainmentEList<CdapApplication>(CdapApplication.class, this, CdapPackage.CDAP_SERVICE_INSTANCE__APPS);
		}
		return apps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAppNames() {
		if (appNames == null) {
			appNames = new EDataTypeEList<String>(String.class, this, CdapPackage.CDAP_SERVICE_INSTANCE__APP_NAMES);
		}
		return appNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getWorkerNames() {
		if (workerNames == null) {
			workerNames = new EDataTypeEList<String>(String.class, this, CdapPackage.CDAP_SERVICE_INSTANCE__WORKER_NAMES);
		}
		return workerNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFlowNames() {
		if (flowNames == null) {
			flowNames = new EDataTypeEList<String>(String.class, this, CdapPackage.CDAP_SERVICE_INSTANCE__FLOW_NAMES);
		}
		return flowNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getServiceNames() {
		if (serviceNames == null) {
			serviceNames = new EDataTypeEList<String>(String.class, this, CdapPackage.CDAP_SERVICE_INSTANCE__SERVICE_NAMES);
		}
		return serviceNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapServiceInstanceConfiguration getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(CdapServiceInstanceConfiguration newConfiguration, NotificationChain msgs) {
		CdapServiceInstanceConfiguration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_SERVICE_INSTANCE__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(CdapServiceInstanceConfiguration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CdapPackage.CDAP_SERVICE_INSTANCE__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CdapPackage.CDAP_SERVICE_INSTANCE__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_SERVICE_INSTANCE__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapInternalApplicationConfiguration getCdapConfiguration() {
		return cdapConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCdapConfiguration(CdapInternalApplicationConfiguration newCdapConfiguration, NotificationChain msgs) {
		CdapInternalApplicationConfiguration oldCdapConfiguration = cdapConfiguration;
		cdapConfiguration = newCdapConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_CONFIGURATION, oldCdapConfiguration, newCdapConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCdapConfiguration(CdapInternalApplicationConfiguration newCdapConfiguration) {
		if (newCdapConfiguration != cdapConfiguration) {
			NotificationChain msgs = null;
			if (cdapConfiguration != null)
				msgs = ((InternalEObject)cdapConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_CONFIGURATION, null, msgs);
			if (newCdapConfiguration != null)
				msgs = ((InternalEObject)newCdapConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_CONFIGURATION, null, msgs);
			msgs = basicSetCdapConfiguration(newCdapConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_CONFIGURATION, newCdapConfiguration, newCdapConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapClusterServiceInstance getClusterService() {
		if (clusterService != null && clusterService.eIsProxy()) {
			InternalEObject oldClusterService = (InternalEObject)clusterService;
			clusterService = (CdapClusterServiceInstance)eResolveProxy(oldClusterService);
			if (clusterService != oldClusterService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CdapPackage.CDAP_SERVICE_INSTANCE__CLUSTER_SERVICE, oldClusterService, clusterService));
			}
		}
		return clusterService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapClusterServiceInstance basicGetClusterService() {
		return clusterService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClusterService(CdapClusterServiceInstance newClusterService) {
		CdapClusterServiceInstance oldClusterService = clusterService;
		clusterService = newClusterService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_SERVICE_INSTANCE__CLUSTER_SERVICE, oldClusterService, clusterService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapService getService() {
		if (eContainerFeatureID() != CdapPackage.CDAP_SERVICE_INSTANCE__SERVICE) return null;
		return (CdapService)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapService basicGetService() {
		if (eContainerFeatureID() != CdapPackage.CDAP_SERVICE_INSTANCE__SERVICE) return null;
		return (CdapService)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(CdapService newService, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newService, CdapPackage.CDAP_SERVICE_INSTANCE__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(CdapService newService) {
		if (newService != eInternalContainer() || (eContainerFeatureID() != CdapPackage.CDAP_SERVICE_INSTANCE__SERVICE && newService != null)) {
			if (EcoreUtil.isAncestor(this, newService))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, CdapPackage.CDAP_SERVICE__INSTANCES, CdapService.class, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_SERVICE_INSTANCE__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CdapPackage.CDAP_SERVICE_INSTANCE__SERVICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetService((CdapService)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CdapPackage.CDAP_SERVICE_INSTANCE__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
			case CdapPackage.CDAP_SERVICE_INSTANCE__APPS:
				return ((InternalEList<?>)getApps()).basicRemove(otherEnd, msgs);
			case CdapPackage.CDAP_SERVICE_INSTANCE__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
			case CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_CONFIGURATION:
				return basicSetCdapConfiguration(null, msgs);
			case CdapPackage.CDAP_SERVICE_INSTANCE__SERVICE:
				return basicSetService(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CdapPackage.CDAP_SERVICE_INSTANCE__SERVICE:
				return eInternalContainer().eInverseRemove(this, CdapPackage.CDAP_SERVICE__INSTANCES, CdapService.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_NAME:
				return getCdapName();
			case CdapPackage.CDAP_SERVICE_INSTANCE__NAMESPACE:
				return getNamespace();
			case CdapPackage.CDAP_SERVICE_INSTANCE__APP_JAR:
				return getAppJar();
			case CdapPackage.CDAP_SERVICE_INSTANCE__APP_CONFIG_FILE:
				return getAppConfigFile();
			case CdapPackage.CDAP_SERVICE_INSTANCE__ARTIFACTS:
				return getArtifacts();
			case CdapPackage.CDAP_SERVICE_INSTANCE__APPS:
				return getApps();
			case CdapPackage.CDAP_SERVICE_INSTANCE__APP_NAMES:
				return getAppNames();
			case CdapPackage.CDAP_SERVICE_INSTANCE__WORKER_NAMES:
				return getWorkerNames();
			case CdapPackage.CDAP_SERVICE_INSTANCE__FLOW_NAMES:
				return getFlowNames();
			case CdapPackage.CDAP_SERVICE_INSTANCE__SERVICE_NAMES:
				return getServiceNames();
			case CdapPackage.CDAP_SERVICE_INSTANCE__CONFIGURATION:
				return getConfiguration();
			case CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_CONFIGURATION:
				return getCdapConfiguration();
			case CdapPackage.CDAP_SERVICE_INSTANCE__CLUSTER_SERVICE:
				if (resolve) return getClusterService();
				return basicGetClusterService();
			case CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_NAMESPACE:
				if (resolve) return getCdapNamespace();
				return basicGetCdapNamespace();
			case CdapPackage.CDAP_SERVICE_INSTANCE__SERVICE:
				if (resolve) return getService();
				return basicGetService();
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
			case CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_NAME:
				setCdapName((String)newValue);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__APP_JAR:
				setAppJar((String)newValue);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__APP_CONFIG_FILE:
				setAppConfigFile((String)newValue);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends CdapArtifact>)newValue);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__APPS:
				getApps().clear();
				getApps().addAll((Collection<? extends CdapApplication>)newValue);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__APP_NAMES:
				getAppNames().clear();
				getAppNames().addAll((Collection<? extends String>)newValue);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__WORKER_NAMES:
				getWorkerNames().clear();
				getWorkerNames().addAll((Collection<? extends String>)newValue);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__FLOW_NAMES:
				getFlowNames().clear();
				getFlowNames().addAll((Collection<? extends String>)newValue);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__SERVICE_NAMES:
				getServiceNames().clear();
				getServiceNames().addAll((Collection<? extends String>)newValue);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__CONFIGURATION:
				setConfiguration((CdapServiceInstanceConfiguration)newValue);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_CONFIGURATION:
				setCdapConfiguration((CdapInternalApplicationConfiguration)newValue);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__CLUSTER_SERVICE:
				setClusterService((CdapClusterServiceInstance)newValue);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_NAMESPACE:
				setCdapNamespace((CdapNamespace)newValue);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__SERVICE:
				setService((CdapService)newValue);
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
			case CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_NAME:
				setCdapName(CDAP_NAME_EDEFAULT);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__APP_JAR:
				setAppJar(APP_JAR_EDEFAULT);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__APP_CONFIG_FILE:
				setAppConfigFile(APP_CONFIG_FILE_EDEFAULT);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__ARTIFACTS:
				getArtifacts().clear();
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__APPS:
				getApps().clear();
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__APP_NAMES:
				getAppNames().clear();
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__WORKER_NAMES:
				getWorkerNames().clear();
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__FLOW_NAMES:
				getFlowNames().clear();
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__SERVICE_NAMES:
				getServiceNames().clear();
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__CONFIGURATION:
				setConfiguration((CdapServiceInstanceConfiguration)null);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_CONFIGURATION:
				setCdapConfiguration((CdapInternalApplicationConfiguration)null);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__CLUSTER_SERVICE:
				setClusterService((CdapClusterServiceInstance)null);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_NAMESPACE:
				setCdapNamespace((CdapNamespace)null);
				return;
			case CdapPackage.CDAP_SERVICE_INSTANCE__SERVICE:
				setService((CdapService)null);
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
			case CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_NAME:
				return CDAP_NAME_EDEFAULT == null ? cdapName != null : !CDAP_NAME_EDEFAULT.equals(cdapName);
			case CdapPackage.CDAP_SERVICE_INSTANCE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case CdapPackage.CDAP_SERVICE_INSTANCE__APP_JAR:
				return APP_JAR_EDEFAULT == null ? appJar != null : !APP_JAR_EDEFAULT.equals(appJar);
			case CdapPackage.CDAP_SERVICE_INSTANCE__APP_CONFIG_FILE:
				return APP_CONFIG_FILE_EDEFAULT == null ? appConfigFile != null : !APP_CONFIG_FILE_EDEFAULT.equals(appConfigFile);
			case CdapPackage.CDAP_SERVICE_INSTANCE__ARTIFACTS:
				return artifacts != null && !artifacts.isEmpty();
			case CdapPackage.CDAP_SERVICE_INSTANCE__APPS:
				return apps != null && !apps.isEmpty();
			case CdapPackage.CDAP_SERVICE_INSTANCE__APP_NAMES:
				return appNames != null && !appNames.isEmpty();
			case CdapPackage.CDAP_SERVICE_INSTANCE__WORKER_NAMES:
				return workerNames != null && !workerNames.isEmpty();
			case CdapPackage.CDAP_SERVICE_INSTANCE__FLOW_NAMES:
				return flowNames != null && !flowNames.isEmpty();
			case CdapPackage.CDAP_SERVICE_INSTANCE__SERVICE_NAMES:
				return serviceNames != null && !serviceNames.isEmpty();
			case CdapPackage.CDAP_SERVICE_INSTANCE__CONFIGURATION:
				return configuration != null;
			case CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_CONFIGURATION:
				return cdapConfiguration != null;
			case CdapPackage.CDAP_SERVICE_INSTANCE__CLUSTER_SERVICE:
				return clusterService != null;
			case CdapPackage.CDAP_SERVICE_INSTANCE__CDAP_NAMESPACE:
				return cdapNamespace != null;
			case CdapPackage.CDAP_SERVICE_INSTANCE__SERVICE:
				return basicGetService() != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (cdapName: ");
		result.append(cdapName);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", appJar: ");
		result.append(appJar);
		result.append(", appConfigFile: ");
		result.append(appConfigFile);
		result.append(", appNames: ");
		result.append(appNames);
		result.append(", workerNames: ");
		result.append(workerNames);
		result.append(", flowNames: ");
		result.append(flowNames);
		result.append(", serviceNames: ");
		result.append(serviceNames);
		result.append(')');
		return result.toString();
	}

} //CdapServiceInstanceImpl
