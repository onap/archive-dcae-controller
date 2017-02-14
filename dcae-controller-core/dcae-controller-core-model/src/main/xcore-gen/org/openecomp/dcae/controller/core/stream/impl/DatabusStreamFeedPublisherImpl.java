
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

import org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher;
import org.openecomp.dcae.controller.core.stream.StreamPackage;
import org.openecomp.ncomp.core.impl.NamedEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Databus Stream Feed Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedPublisherImpl#getLocalStreamId <em>Local Stream Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedPublisherImpl#getDcaeLocationName <em>Dcae Location Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedPublisherImpl#getFeedId <em>Feed Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedPublisherImpl#getPubId <em>Pub Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedPublisherImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedPublisherImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedPublisherImpl#getUserpwd <em>Userpwd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabusStreamFeedPublisherImpl extends NamedEntityImpl implements DatabusStreamFeedPublisher {
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
	 * The default value of the '{@link #getFeedId() <em>Feed Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedId()
	 * @generated
	 * @ordered
	 */
	protected static final String FEED_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeedId() <em>Feed Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedId()
	 * @generated
	 * @ordered
	 */
	protected String feedId = FEED_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPubId() <em>Pub Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubId()
	 * @generated
	 * @ordered
	 */
	protected static final String PUB_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPubId() <em>Pub Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubId()
	 * @generated
	 * @ordered
	 */
	protected String pubId = PUB_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabusStreamFeedPublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamPackage.Literals.DATABUS_STREAM_FEED_PUBLISHER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__LOCAL_STREAM_ID, oldLocalStreamId, localStreamId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__DCAE_LOCATION_NAME, oldDcaeLocationName, dcaeLocationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeedId() {
		return feedId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedId(String newFeedId) {
		String oldFeedId = feedId;
		feedId = newFeedId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__FEED_ID, oldFeedId, feedId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPubId() {
		return pubId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPubId(String newPubId) {
		String oldPubId = pubId;
		pubId = newPubId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__PUB_ID, oldPubId, pubId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__USERNAME, oldUsername, username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__USERPWD, oldUserpwd, userpwd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__LOCAL_STREAM_ID:
				return getLocalStreamId();
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__DCAE_LOCATION_NAME:
				return getDcaeLocationName();
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__FEED_ID:
				return getFeedId();
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__PUB_ID:
				return getPubId();
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__STATUS:
				return getStatus();
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__USERNAME:
				return getUsername();
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__USERPWD:
				return getUserpwd();
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
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__LOCAL_STREAM_ID:
				setLocalStreamId((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__DCAE_LOCATION_NAME:
				setDcaeLocationName((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__FEED_ID:
				setFeedId((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__PUB_ID:
				setPubId((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__STATUS:
				setStatus((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__USERNAME:
				setUsername((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__USERPWD:
				setUserpwd((String)newValue);
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
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__LOCAL_STREAM_ID:
				setLocalStreamId(LOCAL_STREAM_ID_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__DCAE_LOCATION_NAME:
				setDcaeLocationName(DCAE_LOCATION_NAME_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__FEED_ID:
				setFeedId(FEED_ID_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__PUB_ID:
				setPubId(PUB_ID_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__USERPWD:
				setUserpwd(USERPWD_EDEFAULT);
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
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__LOCAL_STREAM_ID:
				return LOCAL_STREAM_ID_EDEFAULT == null ? localStreamId != null : !LOCAL_STREAM_ID_EDEFAULT.equals(localStreamId);
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__DCAE_LOCATION_NAME:
				return DCAE_LOCATION_NAME_EDEFAULT == null ? dcaeLocationName != null : !DCAE_LOCATION_NAME_EDEFAULT.equals(dcaeLocationName);
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__FEED_ID:
				return FEED_ID_EDEFAULT == null ? feedId != null : !FEED_ID_EDEFAULT.equals(feedId);
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__PUB_ID:
				return PUB_ID_EDEFAULT == null ? pubId != null : !PUB_ID_EDEFAULT.equals(pubId);
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER__USERPWD:
				return USERPWD_EDEFAULT == null ? userpwd != null : !USERPWD_EDEFAULT.equals(userpwd);
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
		result.append(", feedId: ");
		result.append(feedId);
		result.append(", pubId: ");
		result.append(pubId);
		result.append(", status: ");
		result.append(status);
		result.append(", username: ");
		result.append(username);
		result.append(", userpwd: ");
		result.append(userpwd);
		result.append(')');
		return result.toString();
	}

} //DatabusStreamFeedPublisherImpl
