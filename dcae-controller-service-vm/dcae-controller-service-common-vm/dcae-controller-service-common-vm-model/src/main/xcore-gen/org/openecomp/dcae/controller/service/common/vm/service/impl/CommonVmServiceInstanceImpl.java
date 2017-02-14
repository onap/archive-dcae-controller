
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
package org.openecomp.dcae.controller.service.common.vm.service.impl;

import org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceConfiguration;
import org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance;
import org.openecomp.dcae.controller.service.common.vm.service.ServicePackage;

import org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Common Vm Service Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.common.vm.service.impl.CommonVmServiceInstanceImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.vm.service.impl.CommonVmServiceInstanceImpl#getConfigureTimeout <em>Configure Timeout</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.vm.service.impl.CommonVmServiceInstanceImpl#getTestTimeout <em>Test Timeout</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.vm.service.impl.CommonVmServiceInstanceImpl#getSuspendTimeout <em>Suspend Timeout</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.vm.service.impl.CommonVmServiceInstanceImpl#getResumeTimeout <em>Resume Timeout</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.vm.service.impl.CommonVmServiceInstanceImpl#getVmConfiguration <em>Vm Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommonVmServiceInstanceImpl extends VirtualMachineServiceInstanceImpl implements CommonVmServiceInstance {
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
	 * The cached value of the '{@link #getVmConfiguration() <em>Vm Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmConfiguration()
	 * @generated
	 * @ordered
	 */
	protected CommonVmServiceConfiguration vmConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonVmServiceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.COMMON_VM_SERVICE_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.COMMON_VM_SERVICE_INSTANCE__SCRIPT, oldScript, script));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.COMMON_VM_SERVICE_INSTANCE__CONFIGURE_TIMEOUT, oldConfigureTimeout, configureTimeout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.COMMON_VM_SERVICE_INSTANCE__TEST_TIMEOUT, oldTestTimeout, testTimeout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.COMMON_VM_SERVICE_INSTANCE__SUSPEND_TIMEOUT, oldSuspendTimeout, suspendTimeout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.COMMON_VM_SERVICE_INSTANCE__RESUME_TIMEOUT, oldResumeTimeout, resumeTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonVmServiceConfiguration getVmConfiguration() {
		return vmConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVmConfiguration(CommonVmServiceConfiguration newVmConfiguration, NotificationChain msgs) {
		CommonVmServiceConfiguration oldVmConfiguration = vmConfiguration;
		vmConfiguration = newVmConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.COMMON_VM_SERVICE_INSTANCE__VM_CONFIGURATION, oldVmConfiguration, newVmConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmConfiguration(CommonVmServiceConfiguration newVmConfiguration) {
		if (newVmConfiguration != vmConfiguration) {
			NotificationChain msgs = null;
			if (vmConfiguration != null)
				msgs = ((InternalEObject)vmConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.COMMON_VM_SERVICE_INSTANCE__VM_CONFIGURATION, null, msgs);
			if (newVmConfiguration != null)
				msgs = ((InternalEObject)newVmConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.COMMON_VM_SERVICE_INSTANCE__VM_CONFIGURATION, null, msgs);
			msgs = basicSetVmConfiguration(newVmConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.COMMON_VM_SERVICE_INSTANCE__VM_CONFIGURATION, newVmConfiguration, newVmConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__VM_CONFIGURATION:
				return basicSetVmConfiguration(null, msgs);
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
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__SCRIPT:
				return getScript();
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__CONFIGURE_TIMEOUT:
				return getConfigureTimeout();
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__TEST_TIMEOUT:
				return getTestTimeout();
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__SUSPEND_TIMEOUT:
				return getSuspendTimeout();
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__RESUME_TIMEOUT:
				return getResumeTimeout();
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__VM_CONFIGURATION:
				return getVmConfiguration();
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
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__SCRIPT:
				setScript((String)newValue);
				return;
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__CONFIGURE_TIMEOUT:
				setConfigureTimeout((Integer)newValue);
				return;
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__TEST_TIMEOUT:
				setTestTimeout((Integer)newValue);
				return;
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__SUSPEND_TIMEOUT:
				setSuspendTimeout((Integer)newValue);
				return;
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__RESUME_TIMEOUT:
				setResumeTimeout((Integer)newValue);
				return;
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__VM_CONFIGURATION:
				setVmConfiguration((CommonVmServiceConfiguration)newValue);
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
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__SCRIPT:
				setScript(SCRIPT_EDEFAULT);
				return;
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__CONFIGURE_TIMEOUT:
				setConfigureTimeout(CONFIGURE_TIMEOUT_EDEFAULT);
				return;
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__TEST_TIMEOUT:
				setTestTimeout(TEST_TIMEOUT_EDEFAULT);
				return;
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__SUSPEND_TIMEOUT:
				setSuspendTimeout(SUSPEND_TIMEOUT_EDEFAULT);
				return;
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__RESUME_TIMEOUT:
				setResumeTimeout(RESUME_TIMEOUT_EDEFAULT);
				return;
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__VM_CONFIGURATION:
				setVmConfiguration((CommonVmServiceConfiguration)null);
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
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__SCRIPT:
				return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__CONFIGURE_TIMEOUT:
				return configureTimeout != CONFIGURE_TIMEOUT_EDEFAULT;
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__TEST_TIMEOUT:
				return testTimeout != TEST_TIMEOUT_EDEFAULT;
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__SUSPEND_TIMEOUT:
				return suspendTimeout != SUSPEND_TIMEOUT_EDEFAULT;
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__RESUME_TIMEOUT:
				return resumeTimeout != RESUME_TIMEOUT_EDEFAULT;
			case ServicePackage.COMMON_VM_SERVICE_INSTANCE__VM_CONFIGURATION:
				return vmConfiguration != null;
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

} //CommonVmServiceInstanceImpl
