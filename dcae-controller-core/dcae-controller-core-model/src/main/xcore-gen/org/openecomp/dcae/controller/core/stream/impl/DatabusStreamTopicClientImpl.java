
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

import org.openecomp.dcae.controller.core.stream.DatabusStreamTopicAction;
import org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient;
import org.openecomp.dcae.controller.core.stream.StreamPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Databus Stream Topic Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicClientImpl#getLocalStreamId <em>Local Stream Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicClientImpl#getDcaeLocationName <em>Dcae Location Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicClientImpl#getClientRole <em>Client Role</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicClientImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicClientImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicClientImpl#getUserpwd <em>Userpwd</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicClientImpl#getFqtn <em>Fqtn</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicClientImpl#getMrClientId <em>Mr Client Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicClientImpl#getTopicURL <em>Topic URL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabusStreamTopicClientImpl extends DatabusStreamImpl implements DatabusStreamTopicClient {
	/**
	 * The default value of the '{@link #getLocalStreamId() <em>Local Stream Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalStreamId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_STREAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalStreamId() <em>Local Stream Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalStreamId()
	 * @generated
	 * @ordered
	 */
	protected String localStreamId = LOCAL_STREAM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDcaeLocationName() <em>Dcae Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcaeLocationName()
	 * @generated
	 * @ordered
	 */
	protected static final String DCAE_LOCATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDcaeLocationName() <em>Dcae Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcaeLocationName()
	 * @generated
	 * @ordered
	 */
	protected String dcaeLocationName = DCAE_LOCATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientRole() <em>Client Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientRole()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientRole() <em>Client Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientRole()
	 * @generated
	 * @ordered
	 */
	protected String clientRole = CLIENT_ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabusStreamTopicAction> action;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserpwd() <em>Userpwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserpwd()
	 * @generated
	 * @ordered
	 */
	protected static final String USERPWD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserpwd() <em>Userpwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserpwd()
	 * @generated
	 * @ordered
	 */
	protected String userpwd = USERPWD_EDEFAULT;

	/**
	 * The default value of the '{@link #getFqtn() <em>Fqtn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFqtn()
	 * @generated
	 * @ordered
	 */
	protected static final String FQTN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFqtn() <em>Fqtn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFqtn()
	 * @generated
	 * @ordered
	 */
	protected String fqtn = FQTN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMrClientId() <em>Mr Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMrClientId()
	 * @generated
	 * @ordered
	 */
	protected static final String MR_CLIENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMrClientId() <em>Mr Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMrClientId()
	 * @generated
	 * @ordered
	 */
	protected String mrClientId = MR_CLIENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopicURL() <em>Topic URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicURL()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopicURL() <em>Topic URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicURL()
	 * @generated
	 * @ordered
	 */
	protected String topicURL = TOPIC_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabusStreamTopicClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamPackage.Literals.DATABUS_STREAM_TOPIC_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalStreamId() {
		return localStreamId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalStreamId(String newLocalStreamId) {
		String oldLocalStreamId = localStreamId;
		localStreamId = newLocalStreamId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__LOCAL_STREAM_ID, oldLocalStreamId, localStreamId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDcaeLocationName() {
		return dcaeLocationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDcaeLocationName(String newDcaeLocationName) {
		String oldDcaeLocationName = dcaeLocationName;
		dcaeLocationName = newDcaeLocationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__DCAE_LOCATION_NAME, oldDcaeLocationName, dcaeLocationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientRole() {
		return clientRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientRole(String newClientRole) {
		String oldClientRole = clientRole;
		clientRole = newClientRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__CLIENT_ROLE, oldClientRole, clientRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabusStreamTopicAction> getAction() {
		if (action == null) {
			action = new EDataTypeEList<DatabusStreamTopicAction>(DatabusStreamTopicAction.class, this, StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserpwd() {
		return userpwd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserpwd(String newUserpwd) {
		String oldUserpwd = userpwd;
		userpwd = newUserpwd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__USERPWD, oldUserpwd, userpwd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFqtn() {
		return fqtn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFqtn(String newFqtn) {
		String oldFqtn = fqtn;
		fqtn = newFqtn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__FQTN, oldFqtn, fqtn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMrClientId() {
		return mrClientId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMrClientId(String newMrClientId) {
		String oldMrClientId = mrClientId;
		mrClientId = newMrClientId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__MR_CLIENT_ID, oldMrClientId, mrClientId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopicURL() {
		return topicURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicURL(String newTopicURL) {
		String oldTopicURL = topicURL;
		topicURL = newTopicURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__TOPIC_URL, oldTopicURL, topicURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__LOCAL_STREAM_ID:
				return getLocalStreamId();
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__DCAE_LOCATION_NAME:
				return getDcaeLocationName();
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__CLIENT_ROLE:
				return getClientRole();
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__ACTION:
				return getAction();
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__USERNAME:
				return getUsername();
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__USERPWD:
				return getUserpwd();
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__FQTN:
				return getFqtn();
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__MR_CLIENT_ID:
				return getMrClientId();
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__TOPIC_URL:
				return getTopicURL();
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
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__LOCAL_STREAM_ID:
				setLocalStreamId((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__DCAE_LOCATION_NAME:
				setDcaeLocationName((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__CLIENT_ROLE:
				setClientRole((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends DatabusStreamTopicAction>)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__USERNAME:
				setUsername((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__USERPWD:
				setUserpwd((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__FQTN:
				setFqtn((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__MR_CLIENT_ID:
				setMrClientId((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__TOPIC_URL:
				setTopicURL((String)newValue);
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
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__LOCAL_STREAM_ID:
				setLocalStreamId(LOCAL_STREAM_ID_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__DCAE_LOCATION_NAME:
				setDcaeLocationName(DCAE_LOCATION_NAME_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__CLIENT_ROLE:
				setClientRole(CLIENT_ROLE_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__ACTION:
				getAction().clear();
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__USERPWD:
				setUserpwd(USERPWD_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__FQTN:
				setFqtn(FQTN_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__MR_CLIENT_ID:
				setMrClientId(MR_CLIENT_ID_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__TOPIC_URL:
				setTopicURL(TOPIC_URL_EDEFAULT);
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
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__LOCAL_STREAM_ID:
				return LOCAL_STREAM_ID_EDEFAULT == null ? localStreamId != null : !LOCAL_STREAM_ID_EDEFAULT.equals(localStreamId);
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__DCAE_LOCATION_NAME:
				return DCAE_LOCATION_NAME_EDEFAULT == null ? dcaeLocationName != null : !DCAE_LOCATION_NAME_EDEFAULT.equals(dcaeLocationName);
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__CLIENT_ROLE:
				return CLIENT_ROLE_EDEFAULT == null ? clientRole != null : !CLIENT_ROLE_EDEFAULT.equals(clientRole);
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__ACTION:
				return action != null && !action.isEmpty();
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__USERPWD:
				return USERPWD_EDEFAULT == null ? userpwd != null : !USERPWD_EDEFAULT.equals(userpwd);
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__FQTN:
				return FQTN_EDEFAULT == null ? fqtn != null : !FQTN_EDEFAULT.equals(fqtn);
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__MR_CLIENT_ID:
				return MR_CLIENT_ID_EDEFAULT == null ? mrClientId != null : !MR_CLIENT_ID_EDEFAULT.equals(mrClientId);
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT__TOPIC_URL:
				return TOPIC_URL_EDEFAULT == null ? topicURL != null : !TOPIC_URL_EDEFAULT.equals(topicURL);
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
		result.append(" (localStreamId: ");
		result.append(localStreamId);
		result.append(", dcaeLocationName: ");
		result.append(dcaeLocationName);
		result.append(", clientRole: ");
		result.append(clientRole);
		result.append(", action: ");
		result.append(action);
		result.append(", username: ");
		result.append(username);
		result.append(", userpwd: ");
		result.append(userpwd);
		result.append(", fqtn: ");
		result.append(fqtn);
		result.append(", mrClientId: ");
		result.append(mrClientId);
		result.append(", topicURL: ");
		result.append(topicURL);
		result.append(')');
		return result.toString();
	}

} //DatabusStreamTopicClientImpl
