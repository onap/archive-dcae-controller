
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

import org.openecomp.dcae.controller.core.stream.DcaeStreamExternalEndPoint;
import org.openecomp.dcae.controller.core.stream.DcaeStreamSubscriberExternal;
import org.openecomp.dcae.controller.core.stream.StreamPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dcae Stream Subscriber External</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamSubscriberExternalImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamSubscriberExternalImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamSubscriberExternalImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DcaeStreamSubscriberExternalImpl extends DcaeStreamSubscriberImpl implements DcaeStreamSubscriberExternal {
	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;
	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcaeStreamSubscriberExternalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamPackage.Literals.DCAE_STREAM_SUBSCRIBER_EXTERNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__USER:
				return getUser();
			case StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__PASSWORD:
				return getPassword();
			case StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__URL:
				return getUrl();
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
			case StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__USER:
				setUser((String)newValue);
				return;
			case StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__PASSWORD:
				setPassword((String)newValue);
				return;
			case StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__URL:
				setUrl((String)newValue);
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
			case StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__USER:
				setUser(USER_EDEFAULT);
				return;
			case StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__URL:
				setUrl(URL_EDEFAULT);
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
			case StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
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
		if (baseClass == DcaeStreamExternalEndPoint.class) {
			switch (derivedFeatureID) {
				case StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__USER: return StreamPackage.DCAE_STREAM_EXTERNAL_END_POINT__USER;
				case StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__PASSWORD: return StreamPackage.DCAE_STREAM_EXTERNAL_END_POINT__PASSWORD;
				case StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__URL: return StreamPackage.DCAE_STREAM_EXTERNAL_END_POINT__URL;
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
		if (baseClass == DcaeStreamExternalEndPoint.class) {
			switch (baseFeatureID) {
				case StreamPackage.DCAE_STREAM_EXTERNAL_END_POINT__USER: return StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__USER;
				case StreamPackage.DCAE_STREAM_EXTERNAL_END_POINT__PASSWORD: return StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__PASSWORD;
				case StreamPackage.DCAE_STREAM_EXTERNAL_END_POINT__URL: return StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL__URL;
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
		result.append(" (user: ");
		result.append(user);
		result.append(", password: ");
		result.append(password);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //DcaeStreamSubscriberExternalImpl
