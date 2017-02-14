
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

import org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration;
import org.openecomp.dcae.controller.service.cdap.CdapPackage;

import org.openecomp.ncomp.cdap.CdapEntityWithPreferences;
import org.openecomp.ncomp.cdap.CdapKeyPair;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Application Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapInternalApplicationConfigurationImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapInternalApplicationConfigurationImpl#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapInternalApplicationConfigurationImpl#getApps <em>Apps</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapInternalApplicationConfigurationImpl#getWorkers <em>Workers</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapInternalApplicationConfigurationImpl#getFlows <em>Flows</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapInternalApplicationConfigurationImpl#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CdapInternalApplicationConfigurationImpl extends MinimalEObjectImpl.Container implements CdapInternalApplicationConfiguration {
	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected EList<CdapKeyPair> config;

	/**
	 * The cached value of the '{@link #getPreferences() <em>Preferences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferences()
	 * @generated
	 * @ordered
	 */
	protected EList<CdapKeyPair> preferences;

	/**
	 * The cached value of the '{@link #getApps() <em>Apps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApps()
	 * @generated
	 * @ordered
	 */
	protected EList<CdapEntityWithPreferences> apps;

	/**
	 * The cached value of the '{@link #getWorkers() <em>Workers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkers()
	 * @generated
	 * @ordered
	 */
	protected EList<CdapEntityWithPreferences> workers;

	/**
	 * The cached value of the '{@link #getFlows() <em>Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<CdapEntityWithPreferences> flows;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<CdapEntityWithPreferences> services;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdapInternalApplicationConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdapPackage.Literals.CDAP_INTERNAL_APPLICATION_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CdapKeyPair> getConfig() {
		if (config == null) {
			config = new EObjectContainmentEList<CdapKeyPair>(CdapKeyPair.class, this, CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__CONFIG);
		}
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CdapKeyPair> getPreferences() {
		if (preferences == null) {
			preferences = new EObjectContainmentEList<CdapKeyPair>(CdapKeyPair.class, this, CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__PREFERENCES);
		}
		return preferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CdapEntityWithPreferences> getApps() {
		if (apps == null) {
			apps = new EObjectContainmentEList<CdapEntityWithPreferences>(CdapEntityWithPreferences.class, this, CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__APPS);
		}
		return apps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CdapEntityWithPreferences> getWorkers() {
		if (workers == null) {
			workers = new EObjectContainmentEList<CdapEntityWithPreferences>(CdapEntityWithPreferences.class, this, CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__WORKERS);
		}
		return workers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CdapEntityWithPreferences> getFlows() {
		if (flows == null) {
			flows = new EObjectContainmentEList<CdapEntityWithPreferences>(CdapEntityWithPreferences.class, this, CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__FLOWS);
		}
		return flows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CdapEntityWithPreferences> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<CdapEntityWithPreferences>(CdapEntityWithPreferences.class, this, CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__CONFIG:
				return ((InternalEList<?>)getConfig()).basicRemove(otherEnd, msgs);
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__PREFERENCES:
				return ((InternalEList<?>)getPreferences()).basicRemove(otherEnd, msgs);
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__APPS:
				return ((InternalEList<?>)getApps()).basicRemove(otherEnd, msgs);
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__WORKERS:
				return ((InternalEList<?>)getWorkers()).basicRemove(otherEnd, msgs);
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__FLOWS:
				return ((InternalEList<?>)getFlows()).basicRemove(otherEnd, msgs);
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
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
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__CONFIG:
				return getConfig();
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__PREFERENCES:
				return getPreferences();
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__APPS:
				return getApps();
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__WORKERS:
				return getWorkers();
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__FLOWS:
				return getFlows();
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__SERVICES:
				return getServices();
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
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__CONFIG:
				getConfig().clear();
				getConfig().addAll((Collection<? extends CdapKeyPair>)newValue);
				return;
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__PREFERENCES:
				getPreferences().clear();
				getPreferences().addAll((Collection<? extends CdapKeyPair>)newValue);
				return;
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__APPS:
				getApps().clear();
				getApps().addAll((Collection<? extends CdapEntityWithPreferences>)newValue);
				return;
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__WORKERS:
				getWorkers().clear();
				getWorkers().addAll((Collection<? extends CdapEntityWithPreferences>)newValue);
				return;
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__FLOWS:
				getFlows().clear();
				getFlows().addAll((Collection<? extends CdapEntityWithPreferences>)newValue);
				return;
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends CdapEntityWithPreferences>)newValue);
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
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__CONFIG:
				getConfig().clear();
				return;
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__PREFERENCES:
				getPreferences().clear();
				return;
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__APPS:
				getApps().clear();
				return;
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__WORKERS:
				getWorkers().clear();
				return;
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__FLOWS:
				getFlows().clear();
				return;
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__SERVICES:
				getServices().clear();
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
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__CONFIG:
				return config != null && !config.isEmpty();
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__PREFERENCES:
				return preferences != null && !preferences.isEmpty();
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__APPS:
				return apps != null && !apps.isEmpty();
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__WORKERS:
				return workers != null && !workers.isEmpty();
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__FLOWS:
				return flows != null && !flows.isEmpty();
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION__SERVICES:
				return services != null && !services.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CdapInternalApplicationConfigurationImpl
