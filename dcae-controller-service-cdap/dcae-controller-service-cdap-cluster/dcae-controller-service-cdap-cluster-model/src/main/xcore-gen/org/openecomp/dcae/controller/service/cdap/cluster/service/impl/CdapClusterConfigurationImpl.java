
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
import org.openecomp.dcae.controller.service.cdap.cluster.service.ServicePackage;

import org.openecomp.ncomp.cdap.CdapCluster;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cdap Cluster Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.cluster.service.impl.CdapClusterConfigurationImpl#getCluster <em>Cluster</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CdapClusterConfigurationImpl extends MinimalEObjectImpl.Container implements CdapClusterConfiguration {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdapClusterConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.CDAP_CLUSTER_CONFIGURATION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.CDAP_CLUSTER_CONFIGURATION__CLUSTER, oldCluster, newCluster);
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
				msgs = ((InternalEObject)cluster).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.CDAP_CLUSTER_CONFIGURATION__CLUSTER, null, msgs);
			if (newCluster != null)
				msgs = ((InternalEObject)newCluster).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.CDAP_CLUSTER_CONFIGURATION__CLUSTER, null, msgs);
			msgs = basicSetCluster(newCluster, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CDAP_CLUSTER_CONFIGURATION__CLUSTER, newCluster, newCluster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.CDAP_CLUSTER_CONFIGURATION__CLUSTER:
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
			case ServicePackage.CDAP_CLUSTER_CONFIGURATION__CLUSTER:
				return getCluster();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicePackage.CDAP_CLUSTER_CONFIGURATION__CLUSTER:
				setCluster((CdapCluster)newValue);
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
			case ServicePackage.CDAP_CLUSTER_CONFIGURATION__CLUSTER:
				setCluster((CdapCluster)null);
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
			case ServicePackage.CDAP_CLUSTER_CONFIGURATION__CLUSTER:
				return cluster != null;
		}
		return super.eIsSet(featureID);
	}

} //CdapClusterConfigurationImpl
