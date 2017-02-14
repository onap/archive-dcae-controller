
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
package org.openecomp.dcae.controller.service.docker.host.service.impl;

import org.openecomp.dcae.controller.service.docker.host.service.DockerConfiguration;
import org.openecomp.dcae.controller.service.docker.host.service.ServicePackage;

import org.openecomp.ncomp.docker.DockerHost;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docker Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.host.service.impl.DockerConfigurationImpl#getDockerHost <em>Docker Host</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DockerConfigurationImpl extends MinimalEObjectImpl.Container implements DockerConfiguration {
	/**
	 * The cached value of the '{@link #getDockerHost() <em>Docker Host</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerHost()
	 * @generated
	 * @ordered
	 */
	protected DockerHost dockerHost;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.DOCKER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerHost getDockerHost() {
		return dockerHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDockerHost(DockerHost newDockerHost, NotificationChain msgs) {
		DockerHost oldDockerHost = dockerHost;
		dockerHost = newDockerHost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.DOCKER_CONFIGURATION__DOCKER_HOST, oldDockerHost, newDockerHost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDockerHost(DockerHost newDockerHost) {
		if (newDockerHost != dockerHost) {
			NotificationChain msgs = null;
			if (dockerHost != null)
				msgs = ((InternalEObject)dockerHost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.DOCKER_CONFIGURATION__DOCKER_HOST, null, msgs);
			if (newDockerHost != null)
				msgs = ((InternalEObject)newDockerHost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.DOCKER_CONFIGURATION__DOCKER_HOST, null, msgs);
			msgs = basicSetDockerHost(newDockerHost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.DOCKER_CONFIGURATION__DOCKER_HOST, newDockerHost, newDockerHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.DOCKER_CONFIGURATION__DOCKER_HOST:
				return basicSetDockerHost(null, msgs);
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
			case ServicePackage.DOCKER_CONFIGURATION__DOCKER_HOST:
				return getDockerHost();
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
			case ServicePackage.DOCKER_CONFIGURATION__DOCKER_HOST:
				setDockerHost((DockerHost)newValue);
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
			case ServicePackage.DOCKER_CONFIGURATION__DOCKER_HOST:
				setDockerHost((DockerHost)null);
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
			case ServicePackage.DOCKER_CONFIGURATION__DOCKER_HOST:
				return dockerHost != null;
		}
		return super.eIsSet(featureID);
	}

} //DockerConfigurationImpl
