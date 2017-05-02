
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
package org.openecomp.dcae.controller.core.stream.impl;

import org.openecomp.dcae.controller.core.stream.DmaapStream;
import org.openecomp.dcae.controller.core.stream.StreamPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dmaap Stream</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DmaapStreamImpl#getDmaapDataType <em>Dmaap Data Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DmaapStreamImpl#getDmaapAction <em>Dmaap Action</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DmaapStreamImpl#getDmaapUrl <em>Dmaap Url</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DmaapStreamImpl#getDmaapUserName <em>Dmaap User Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DmaapStreamImpl#getDmaapPassword <em>Dmaap Password</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DmaapStreamImpl#getDmaapAuthMethod <em>Dmaap Auth Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DmaapStreamImpl extends DcaeStreamImpl implements DmaapStream {
	/**
	 * The default value of the '{@link #getDmaapDataType() <em>Dmaap Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String DMAAP_DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDmaapDataType() <em>Dmaap Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapDataType()
	 * @generated
	 * @ordered
	 */
	protected String dmaapDataType = DMAAP_DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDmaapAction() <em>Dmaap Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapAction()
	 * @generated
	 * @ordered
	 */
	protected static final String DMAAP_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDmaapAction() <em>Dmaap Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapAction()
	 * @generated
	 * @ordered
	 */
	protected String dmaapAction = DMAAP_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDmaapUrl() <em>Dmaap Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String DMAAP_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDmaapUrl() <em>Dmaap Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapUrl()
	 * @generated
	 * @ordered
	 */
	protected String dmaapUrl = DMAAP_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDmaapUserName() <em>Dmaap User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String DMAAP_USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDmaapUserName() <em>Dmaap User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapUserName()
	 * @generated
	 * @ordered
	 */
	protected String dmaapUserName = DMAAP_USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDmaapPassword() <em>Dmaap Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String DMAAP_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDmaapPassword() <em>Dmaap Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapPassword()
	 * @generated
	 * @ordered
	 */
	protected String dmaapPassword = DMAAP_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDmaapAuthMethod() <em>Dmaap Auth Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapAuthMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String DMAAP_AUTH_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDmaapAuthMethod() <em>Dmaap Auth Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapAuthMethod()
	 * @generated
	 * @ordered
	 */
	protected String dmaapAuthMethod = DMAAP_AUTH_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmaapStreamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamPackage.Literals.DMAAP_STREAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDmaapDataType() {
		return dmaapDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmaapDataType(String newDmaapDataType) {
		String oldDmaapDataType = dmaapDataType;
		dmaapDataType = newDmaapDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DMAAP_STREAM__DMAAP_DATA_TYPE, oldDmaapDataType, dmaapDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDmaapAction() {
		return dmaapAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmaapAction(String newDmaapAction) {
		String oldDmaapAction = dmaapAction;
		dmaapAction = newDmaapAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DMAAP_STREAM__DMAAP_ACTION, oldDmaapAction, dmaapAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDmaapUrl() {
		return dmaapUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmaapUrl(String newDmaapUrl) {
		String oldDmaapUrl = dmaapUrl;
		dmaapUrl = newDmaapUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DMAAP_STREAM__DMAAP_URL, oldDmaapUrl, dmaapUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDmaapUserName() {
		return dmaapUserName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmaapUserName(String newDmaapUserName) {
		String oldDmaapUserName = dmaapUserName;
		dmaapUserName = newDmaapUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DMAAP_STREAM__DMAAP_USER_NAME, oldDmaapUserName, dmaapUserName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDmaapPassword() {
		return dmaapPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmaapPassword(String newDmaapPassword) {
		String oldDmaapPassword = dmaapPassword;
		dmaapPassword = newDmaapPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DMAAP_STREAM__DMAAP_PASSWORD, oldDmaapPassword, dmaapPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDmaapAuthMethod() {
		return dmaapAuthMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmaapAuthMethod(String newDmaapAuthMethod) {
		String oldDmaapAuthMethod = dmaapAuthMethod;
		dmaapAuthMethod = newDmaapAuthMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DMAAP_STREAM__DMAAP_AUTH_METHOD, oldDmaapAuthMethod, dmaapAuthMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StreamPackage.DMAAP_STREAM__DMAAP_DATA_TYPE:
				return getDmaapDataType();
			case StreamPackage.DMAAP_STREAM__DMAAP_ACTION:
				return getDmaapAction();
			case StreamPackage.DMAAP_STREAM__DMAAP_URL:
				return getDmaapUrl();
			case StreamPackage.DMAAP_STREAM__DMAAP_USER_NAME:
				return getDmaapUserName();
			case StreamPackage.DMAAP_STREAM__DMAAP_PASSWORD:
				return getDmaapPassword();
			case StreamPackage.DMAAP_STREAM__DMAAP_AUTH_METHOD:
				return getDmaapAuthMethod();
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
			case StreamPackage.DMAAP_STREAM__DMAAP_DATA_TYPE:
				setDmaapDataType((String)newValue);
				return;
			case StreamPackage.DMAAP_STREAM__DMAAP_ACTION:
				setDmaapAction((String)newValue);
				return;
			case StreamPackage.DMAAP_STREAM__DMAAP_URL:
				setDmaapUrl((String)newValue);
				return;
			case StreamPackage.DMAAP_STREAM__DMAAP_USER_NAME:
				setDmaapUserName((String)newValue);
				return;
			case StreamPackage.DMAAP_STREAM__DMAAP_PASSWORD:
				setDmaapPassword((String)newValue);
				return;
			case StreamPackage.DMAAP_STREAM__DMAAP_AUTH_METHOD:
				setDmaapAuthMethod((String)newValue);
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
			case StreamPackage.DMAAP_STREAM__DMAAP_DATA_TYPE:
				setDmaapDataType(DMAAP_DATA_TYPE_EDEFAULT);
				return;
			case StreamPackage.DMAAP_STREAM__DMAAP_ACTION:
				setDmaapAction(DMAAP_ACTION_EDEFAULT);
				return;
			case StreamPackage.DMAAP_STREAM__DMAAP_URL:
				setDmaapUrl(DMAAP_URL_EDEFAULT);
				return;
			case StreamPackage.DMAAP_STREAM__DMAAP_USER_NAME:
				setDmaapUserName(DMAAP_USER_NAME_EDEFAULT);
				return;
			case StreamPackage.DMAAP_STREAM__DMAAP_PASSWORD:
				setDmaapPassword(DMAAP_PASSWORD_EDEFAULT);
				return;
			case StreamPackage.DMAAP_STREAM__DMAAP_AUTH_METHOD:
				setDmaapAuthMethod(DMAAP_AUTH_METHOD_EDEFAULT);
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
			case StreamPackage.DMAAP_STREAM__DMAAP_DATA_TYPE:
				return DMAAP_DATA_TYPE_EDEFAULT == null ? dmaapDataType != null : !DMAAP_DATA_TYPE_EDEFAULT.equals(dmaapDataType);
			case StreamPackage.DMAAP_STREAM__DMAAP_ACTION:
				return DMAAP_ACTION_EDEFAULT == null ? dmaapAction != null : !DMAAP_ACTION_EDEFAULT.equals(dmaapAction);
			case StreamPackage.DMAAP_STREAM__DMAAP_URL:
				return DMAAP_URL_EDEFAULT == null ? dmaapUrl != null : !DMAAP_URL_EDEFAULT.equals(dmaapUrl);
			case StreamPackage.DMAAP_STREAM__DMAAP_USER_NAME:
				return DMAAP_USER_NAME_EDEFAULT == null ? dmaapUserName != null : !DMAAP_USER_NAME_EDEFAULT.equals(dmaapUserName);
			case StreamPackage.DMAAP_STREAM__DMAAP_PASSWORD:
				return DMAAP_PASSWORD_EDEFAULT == null ? dmaapPassword != null : !DMAAP_PASSWORD_EDEFAULT.equals(dmaapPassword);
			case StreamPackage.DMAAP_STREAM__DMAAP_AUTH_METHOD:
				return DMAAP_AUTH_METHOD_EDEFAULT == null ? dmaapAuthMethod != null : !DMAAP_AUTH_METHOD_EDEFAULT.equals(dmaapAuthMethod);
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
		result.append(" (dmaapDataType: ");
		result.append(dmaapDataType);
		result.append(", dmaapAction: ");
		result.append(dmaapAction);
		result.append(", dmaapUrl: ");
		result.append(dmaapUrl);
		result.append(", dmaapUserName: ");
		result.append(dmaapUserName);
		result.append(", dmaapPassword: ");
		result.append(dmaapPassword);
		result.append(", dmaapAuthMethod: ");
		result.append(dmaapAuthMethod);
		result.append(')');
		return result.toString();
	}

} //DmaapStreamImpl
