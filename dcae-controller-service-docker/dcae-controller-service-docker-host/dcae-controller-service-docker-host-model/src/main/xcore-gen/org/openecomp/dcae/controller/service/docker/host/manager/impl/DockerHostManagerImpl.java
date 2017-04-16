
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
package org.openecomp.dcae.controller.service.docker.host.manager.impl;

import org.openecomp.dcae.controller.core.service.HealthTestResponse;
import org.openecomp.dcae.controller.core.stream.DcaeStream;
import org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager;
import org.openecomp.dcae.controller.service.docker.host.manager.ManagerPackage;
import org.openecomp.dcae.controller.service.docker.host.service.DockerConfiguration;
import org.openecomp.dcae.controller.service.docker.host.service.ServicePackage;
import org.openecomp.dcae.controller.service.vmmanager.impl.VirtualMachineManagerImpl;
import org.openecomp.ncomp.docker.DockerHost;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docker Host Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.host.manager.impl.DockerHostManagerImpl#getDockerHost <em>Docker Host</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerHostManagerImpl extends VirtualMachineManagerImpl implements DockerHostManager {
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
	protected DockerHostManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManagerPackage.Literals.DOCKER_HOST_MANAGER;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManagerPackage.DOCKER_HOST_MANAGER__DOCKER_HOST, oldDockerHost, newDockerHost);
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
				msgs = ((InternalEObject)dockerHost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManagerPackage.DOCKER_HOST_MANAGER__DOCKER_HOST, null, msgs);
			if (newDockerHost != null)
				msgs = ((InternalEObject)newDockerHost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManagerPackage.DOCKER_HOST_MANAGER__DOCKER_HOST, null, msgs);
			msgs = basicSetDockerHost(newDockerHost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.DOCKER_HOST_MANAGER__DOCKER_HOST, newDockerHost, newDockerHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateContainerConfiguration(String name, EObject o, EList<DcaeStream> inputStreams, EList<DcaeStream> outputStreams) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void suspendContainer(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resumeContainer(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthTestResponse testContainer(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setupConfiguration(String service, String instance) {
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
			case ManagerPackage.DOCKER_HOST_MANAGER__DOCKER_HOST:
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
			case ManagerPackage.DOCKER_HOST_MANAGER__DOCKER_HOST:
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
			case ManagerPackage.DOCKER_HOST_MANAGER__DOCKER_HOST:
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
			case ManagerPackage.DOCKER_HOST_MANAGER__DOCKER_HOST:
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
			case ManagerPackage.DOCKER_HOST_MANAGER__DOCKER_HOST:
				return dockerHost != null;
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
		if (baseClass == DockerConfiguration.class) {
			switch (derivedFeatureID) {
				case ManagerPackage.DOCKER_HOST_MANAGER__DOCKER_HOST: return ServicePackage.DOCKER_CONFIGURATION__DOCKER_HOST;
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
		if (baseClass == DockerConfiguration.class) {
			switch (baseFeatureID) {
				case ServicePackage.DOCKER_CONFIGURATION__DOCKER_HOST: return ManagerPackage.DOCKER_HOST_MANAGER__DOCKER_HOST;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ManagerPackage.DOCKER_HOST_MANAGER___UPDATE_CONTAINER_CONFIGURATION__STRING_EOBJECT_ELIST_ELIST:
				updateContainerConfiguration((String)arguments.get(0), (EObject)arguments.get(1), (EList<DcaeStream>)arguments.get(2), (EList<DcaeStream>)arguments.get(3));
				return null;
			case ManagerPackage.DOCKER_HOST_MANAGER___SUSPEND_CONTAINER__STRING:
				suspendContainer((String)arguments.get(0));
				return null;
			case ManagerPackage.DOCKER_HOST_MANAGER___RESUME_CONTAINER__STRING:
				resumeContainer((String)arguments.get(0));
				return null;
			case ManagerPackage.DOCKER_HOST_MANAGER___TEST_CONTAINER__STRING:
				return testContainer((String)arguments.get(0));
			case ManagerPackage.DOCKER_HOST_MANAGER___SETUP_CONFIGURATION__STRING_STRING:
				setupConfiguration((String)arguments.get(0), (String)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DockerHostManagerImpl
