
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
package org.openecomp.dcae.controller.service.common.docker.manager.impl;

import org.openecomp.dcae.controller.service.common.docker.manager.CommonDockerManager;
import org.openecomp.dcae.controller.service.common.docker.manager.ManagerPackage;

import org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceConfiguration;

import org.openecomp.dcae.controller.service.dockermanager.impl.DockerManagerImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Common Docker Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.common.docker.manager.impl.CommonDockerManagerImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.docker.manager.impl.CommonDockerManagerImpl#getConfigureTimeout <em>Configure Timeout</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.docker.manager.impl.CommonDockerManagerImpl#getTestTimeout <em>Test Timeout</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.docker.manager.impl.CommonDockerManagerImpl#getSuspendTimeout <em>Suspend Timeout</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.docker.manager.impl.CommonDockerManagerImpl#getResumeTimeout <em>Resume Timeout</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.docker.manager.impl.CommonDockerManagerImpl#getDockerConfiguration <em>Docker Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommonDockerManagerImpl extends DockerManagerImpl implements CommonDockerManager {
	/**
	 * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected String script = SCRIPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigureTimeout() <em>Configure Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigureTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int CONFIGURE_TIMEOUT_EDEFAULT = 60000;

	/**
	 * The cached value of the '{@link #getConfigureTimeout() <em>Configure Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigureTimeout()
	 * @generated
	 * @ordered
	 */
	protected int configureTimeout = CONFIGURE_TIMEOUT_EDEFAULT;

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
	 * The default value of the '{@link #getSuspendTimeout() <em>Suspend Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspendTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int SUSPEND_TIMEOUT_EDEFAULT = 60000;

	/**
	 * The cached value of the '{@link #getSuspendTimeout() <em>Suspend Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspendTimeout()
	 * @generated
	 * @ordered
	 */
	protected int suspendTimeout = SUSPEND_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResumeTimeout() <em>Resume Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResumeTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int RESUME_TIMEOUT_EDEFAULT = 60000;

	/**
	 * The cached value of the '{@link #getResumeTimeout() <em>Resume Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResumeTimeout()
	 * @generated
	 * @ordered
	 */
	protected int resumeTimeout = RESUME_TIMEOUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDockerConfiguration() <em>Docker Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerConfiguration()
	 * @generated
	 * @ordered
	 */
	protected CommonDockerServiceConfiguration dockerConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonDockerManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManagerPackage.Literals.COMMON_DOCKER_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(String newScript) {
		String oldScript = script;
		script = newScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.COMMON_DOCKER_MANAGER__SCRIPT, oldScript, script));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConfigureTimeout() {
		return configureTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigureTimeout(int newConfigureTimeout) {
		int oldConfigureTimeout = configureTimeout;
		configureTimeout = newConfigureTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.COMMON_DOCKER_MANAGER__CONFIGURE_TIMEOUT, oldConfigureTimeout, configureTimeout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.COMMON_DOCKER_MANAGER__TEST_TIMEOUT, oldTestTimeout, testTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSuspendTimeout() {
		return suspendTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuspendTimeout(int newSuspendTimeout) {
		int oldSuspendTimeout = suspendTimeout;
		suspendTimeout = newSuspendTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.COMMON_DOCKER_MANAGER__SUSPEND_TIMEOUT, oldSuspendTimeout, suspendTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResumeTimeout() {
		return resumeTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResumeTimeout(int newResumeTimeout) {
		int oldResumeTimeout = resumeTimeout;
		resumeTimeout = newResumeTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.COMMON_DOCKER_MANAGER__RESUME_TIMEOUT, oldResumeTimeout, resumeTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonDockerServiceConfiguration getDockerConfiguration() {
		return dockerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDockerConfiguration(CommonDockerServiceConfiguration newDockerConfiguration, NotificationChain msgs) {
		CommonDockerServiceConfiguration oldDockerConfiguration = dockerConfiguration;
		dockerConfiguration = newDockerConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManagerPackage.COMMON_DOCKER_MANAGER__DOCKER_CONFIGURATION, oldDockerConfiguration, newDockerConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDockerConfiguration(CommonDockerServiceConfiguration newDockerConfiguration) {
		if (newDockerConfiguration != dockerConfiguration) {
			NotificationChain msgs = null;
			if (dockerConfiguration != null)
				msgs = ((InternalEObject)dockerConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManagerPackage.COMMON_DOCKER_MANAGER__DOCKER_CONFIGURATION, null, msgs);
			if (newDockerConfiguration != null)
				msgs = ((InternalEObject)newDockerConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManagerPackage.COMMON_DOCKER_MANAGER__DOCKER_CONFIGURATION, null, msgs);
			msgs = basicSetDockerConfiguration(newDockerConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.COMMON_DOCKER_MANAGER__DOCKER_CONFIGURATION, newDockerConfiguration, newDockerConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManagerPackage.COMMON_DOCKER_MANAGER__DOCKER_CONFIGURATION:
				return basicSetDockerConfiguration(null, msgs);
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
			case ManagerPackage.COMMON_DOCKER_MANAGER__SCRIPT:
				return getScript();
			case ManagerPackage.COMMON_DOCKER_MANAGER__CONFIGURE_TIMEOUT:
				return getConfigureTimeout();
			case ManagerPackage.COMMON_DOCKER_MANAGER__TEST_TIMEOUT:
				return getTestTimeout();
			case ManagerPackage.COMMON_DOCKER_MANAGER__SUSPEND_TIMEOUT:
				return getSuspendTimeout();
			case ManagerPackage.COMMON_DOCKER_MANAGER__RESUME_TIMEOUT:
				return getResumeTimeout();
			case ManagerPackage.COMMON_DOCKER_MANAGER__DOCKER_CONFIGURATION:
				return getDockerConfiguration();
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
			case ManagerPackage.COMMON_DOCKER_MANAGER__SCRIPT:
				setScript((String)newValue);
				return;
			case ManagerPackage.COMMON_DOCKER_MANAGER__CONFIGURE_TIMEOUT:
				setConfigureTimeout((Integer)newValue);
				return;
			case ManagerPackage.COMMON_DOCKER_MANAGER__TEST_TIMEOUT:
				setTestTimeout((Integer)newValue);
				return;
			case ManagerPackage.COMMON_DOCKER_MANAGER__SUSPEND_TIMEOUT:
				setSuspendTimeout((Integer)newValue);
				return;
			case ManagerPackage.COMMON_DOCKER_MANAGER__RESUME_TIMEOUT:
				setResumeTimeout((Integer)newValue);
				return;
			case ManagerPackage.COMMON_DOCKER_MANAGER__DOCKER_CONFIGURATION:
				setDockerConfiguration((CommonDockerServiceConfiguration)newValue);
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
			case ManagerPackage.COMMON_DOCKER_MANAGER__SCRIPT:
				setScript(SCRIPT_EDEFAULT);
				return;
			case ManagerPackage.COMMON_DOCKER_MANAGER__CONFIGURE_TIMEOUT:
				setConfigureTimeout(CONFIGURE_TIMEOUT_EDEFAULT);
				return;
			case ManagerPackage.COMMON_DOCKER_MANAGER__TEST_TIMEOUT:
				setTestTimeout(TEST_TIMEOUT_EDEFAULT);
				return;
			case ManagerPackage.COMMON_DOCKER_MANAGER__SUSPEND_TIMEOUT:
				setSuspendTimeout(SUSPEND_TIMEOUT_EDEFAULT);
				return;
			case ManagerPackage.COMMON_DOCKER_MANAGER__RESUME_TIMEOUT:
				setResumeTimeout(RESUME_TIMEOUT_EDEFAULT);
				return;
			case ManagerPackage.COMMON_DOCKER_MANAGER__DOCKER_CONFIGURATION:
				setDockerConfiguration((CommonDockerServiceConfiguration)null);
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
			case ManagerPackage.COMMON_DOCKER_MANAGER__SCRIPT:
				return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
			case ManagerPackage.COMMON_DOCKER_MANAGER__CONFIGURE_TIMEOUT:
				return configureTimeout != CONFIGURE_TIMEOUT_EDEFAULT;
			case ManagerPackage.COMMON_DOCKER_MANAGER__TEST_TIMEOUT:
				return testTimeout != TEST_TIMEOUT_EDEFAULT;
			case ManagerPackage.COMMON_DOCKER_MANAGER__SUSPEND_TIMEOUT:
				return suspendTimeout != SUSPEND_TIMEOUT_EDEFAULT;
			case ManagerPackage.COMMON_DOCKER_MANAGER__RESUME_TIMEOUT:
				return resumeTimeout != RESUME_TIMEOUT_EDEFAULT;
			case ManagerPackage.COMMON_DOCKER_MANAGER__DOCKER_CONFIGURATION:
				return dockerConfiguration != null;
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
		result.append(" (script: ");
		result.append(script);
		result.append(", configureTimeout: ");
		result.append(configureTimeout);
		result.append(", testTimeout: ");
		result.append(testTimeout);
		result.append(", suspendTimeout: ");
		result.append(suspendTimeout);
		result.append(", resumeTimeout: ");
		result.append(resumeTimeout);
		result.append(')');
		return result.toString();
	}

} //CommonDockerManagerImpl
