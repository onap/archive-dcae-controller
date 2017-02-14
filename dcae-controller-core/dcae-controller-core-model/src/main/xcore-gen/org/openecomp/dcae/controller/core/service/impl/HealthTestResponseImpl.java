
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
package org.openecomp.dcae.controller.core.service.impl;

import org.openecomp.dcae.controller.core.service.HealthTestResponse;
import org.openecomp.dcae.controller.core.service.HealthTestStatus;
import org.openecomp.dcae.controller.core.service.ServicePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Healt Test Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.service.impl.HealthTestResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.impl.HealthTestResponseImpl#getMessageCode <em>Message Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HealthTestResponseImpl extends MinimalEObjectImpl.Container implements HealthTestResponse {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final HealthTestStatus STATUS_EDEFAULT = HealthTestStatus.GREEN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected HealthTestStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageCode() <em>Message Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageCode()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageCode() <em>Message Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageCode()
	 * @generated
	 * @ordered
	 */
	protected String messageCode = MESSAGE_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthTestResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.HEALTH_TEST_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthTestStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(HealthTestStatus newStatus) {
		HealthTestStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.HEALTH_TEST_RESPONSE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageCode() {
		return messageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageCode(String newMessageCode) {
		String oldMessageCode = messageCode;
		messageCode = newMessageCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.HEALTH_TEST_RESPONSE__MESSAGE_CODE, oldMessageCode, messageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.HEALTH_TEST_RESPONSE__STATUS:
				return getStatus();
			case ServicePackage.HEALTH_TEST_RESPONSE__MESSAGE_CODE:
				return getMessageCode();
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
			case ServicePackage.HEALTH_TEST_RESPONSE__STATUS:
				setStatus((HealthTestStatus)newValue);
				return;
			case ServicePackage.HEALTH_TEST_RESPONSE__MESSAGE_CODE:
				setMessageCode((String)newValue);
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
			case ServicePackage.HEALTH_TEST_RESPONSE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ServicePackage.HEALTH_TEST_RESPONSE__MESSAGE_CODE:
				setMessageCode(MESSAGE_CODE_EDEFAULT);
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
			case ServicePackage.HEALTH_TEST_RESPONSE__STATUS:
				return status != STATUS_EDEFAULT;
			case ServicePackage.HEALTH_TEST_RESPONSE__MESSAGE_CODE:
				return MESSAGE_CODE_EDEFAULT == null ? messageCode != null : !MESSAGE_CODE_EDEFAULT.equals(messageCode);
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
		result.append(" (status: ");
		result.append(status);
		result.append(", messageCode: ");
		result.append(messageCode);
		result.append(')');
		return result.toString();
	}

} //HealtTestResponseImpl
