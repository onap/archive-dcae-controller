
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

import org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber;
import org.openecomp.dcae.controller.core.stream.StreamPackage;
import org.openecomp.ncomp.core.impl.NamedEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Databus Stream Feed Subscriber</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedSubscriberImpl#getLocalStreamId <em>Local Stream Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedSubscriberImpl#getDcaeLocationName <em>Dcae Location Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedSubscriberImpl#getOtherFeedName <em>Other Feed Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedSubscriberImpl#getFeedId <em>Feed Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedSubscriberImpl#getLogURL <em>Log URL</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedSubscriberImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedSubscriberImpl#getSubId <em>Sub Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedSubscriberImpl#isSuspended <em>Suspended</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedSubscriberImpl#isUse100 <em>Use100</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedSubscriberImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedSubscriberImpl#getUserpwd <em>Userpwd</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedSubscriberImpl#getDeliveryURL <em>Delivery URL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabusStreamFeedSubscriberImpl extends NamedEntityImpl implements DatabusStreamFeedSubscriber {
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
	 * The default value of the '{@link #getOtherFeedName() <em>Other Feed Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherFeedName()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_FEED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherFeedName() <em>Other Feed Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherFeedName()
	 * @generated
	 * @ordered
	 */
	protected String otherFeedName = OTHER_FEED_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getLogURL() <em>Log URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogURL()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogURL() <em>Log URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogURL()
	 * @generated
	 * @ordered
	 */
	protected String logURL = LOG_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected String owner = OWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubId() <em>Sub Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubId() <em>Sub Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubId()
	 * @generated
	 * @ordered
	 */
	protected String subId = SUB_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isSuspended() <em>Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuspended()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUSPENDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSuspended() <em>Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuspended()
	 * @generated
	 * @ordered
	 */
	protected boolean suspended = SUSPENDED_EDEFAULT;

	/**
	 * The default value of the '{@link #isUse100() <em>Use100</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUse100()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE100_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUse100() <em>Use100</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUse100()
	 * @generated
	 * @ordered
	 */
	protected boolean use100 = USE100_EDEFAULT;

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
	 * The default value of the '{@link #getDeliveryURL() <em>Delivery URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryURL()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERY_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryURL() <em>Delivery URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryURL()
	 * @generated
	 * @ordered
	 */
	protected String deliveryURL = DELIVERY_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabusStreamFeedSubscriberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamPackage.Literals.DATABUS_STREAM_FEED_SUBSCRIBER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__LOCAL_STREAM_ID, oldLocalStreamId, localStreamId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__DCAE_LOCATION_NAME, oldDcaeLocationName, dcaeLocationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherFeedName() {
		return otherFeedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherFeedName(String newOtherFeedName) {
		String oldOtherFeedName = otherFeedName;
		otherFeedName = newOtherFeedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__OTHER_FEED_NAME, oldOtherFeedName, otherFeedName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__FEED_ID, oldFeedId, feedId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogURL() {
		return logURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogURL(String newLogURL) {
		String oldLogURL = logURL;
		logURL = newLogURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__LOG_URL, oldLogURL, logURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(String newOwner) {
		String oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubId() {
		return subId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubId(String newSubId) {
		String oldSubId = subId;
		subId = newSubId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__SUB_ID, oldSubId, subId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSuspended() {
		return suspended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuspended(boolean newSuspended) {
		boolean oldSuspended = suspended;
		suspended = newSuspended;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__SUSPENDED, oldSuspended, suspended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUse100() {
		return use100;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse100(boolean newUse100) {
		boolean oldUse100 = use100;
		use100 = newUse100;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__USE100, oldUse100, use100));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__USERNAME, oldUsername, username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__USERPWD, oldUserpwd, userpwd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeliveryURL() {
		return deliveryURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryURL(String newDeliveryURL) {
		String oldDeliveryURL = deliveryURL;
		deliveryURL = newDeliveryURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__DELIVERY_URL, oldDeliveryURL, deliveryURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__LOCAL_STREAM_ID:
				return getLocalStreamId();
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__DCAE_LOCATION_NAME:
				return getDcaeLocationName();
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__OTHER_FEED_NAME:
				return getOtherFeedName();
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__FEED_ID:
				return getFeedId();
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__LOG_URL:
				return getLogURL();
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__OWNER:
				return getOwner();
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__SUB_ID:
				return getSubId();
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__SUSPENDED:
				return isSuspended();
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__USE100:
				return isUse100();
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__USERNAME:
				return getUsername();
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__USERPWD:
				return getUserpwd();
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__DELIVERY_URL:
				return getDeliveryURL();
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
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__LOCAL_STREAM_ID:
				setLocalStreamId((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__DCAE_LOCATION_NAME:
				setDcaeLocationName((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__OTHER_FEED_NAME:
				setOtherFeedName((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__FEED_ID:
				setFeedId((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__LOG_URL:
				setLogURL((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__OWNER:
				setOwner((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__SUB_ID:
				setSubId((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__SUSPENDED:
				setSuspended((Boolean)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__USE100:
				setUse100((Boolean)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__USERNAME:
				setUsername((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__USERPWD:
				setUserpwd((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__DELIVERY_URL:
				setDeliveryURL((String)newValue);
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
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__LOCAL_STREAM_ID:
				setLocalStreamId(LOCAL_STREAM_ID_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__DCAE_LOCATION_NAME:
				setDcaeLocationName(DCAE_LOCATION_NAME_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__OTHER_FEED_NAME:
				setOtherFeedName(OTHER_FEED_NAME_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__FEED_ID:
				setFeedId(FEED_ID_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__LOG_URL:
				setLogURL(LOG_URL_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__SUB_ID:
				setSubId(SUB_ID_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__SUSPENDED:
				setSuspended(SUSPENDED_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__USE100:
				setUse100(USE100_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__USERPWD:
				setUserpwd(USERPWD_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__DELIVERY_URL:
				setDeliveryURL(DELIVERY_URL_EDEFAULT);
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
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__LOCAL_STREAM_ID:
				return LOCAL_STREAM_ID_EDEFAULT == null ? localStreamId != null : !LOCAL_STREAM_ID_EDEFAULT.equals(localStreamId);
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__DCAE_LOCATION_NAME:
				return DCAE_LOCATION_NAME_EDEFAULT == null ? dcaeLocationName != null : !DCAE_LOCATION_NAME_EDEFAULT.equals(dcaeLocationName);
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__OTHER_FEED_NAME:
				return OTHER_FEED_NAME_EDEFAULT == null ? otherFeedName != null : !OTHER_FEED_NAME_EDEFAULT.equals(otherFeedName);
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__FEED_ID:
				return FEED_ID_EDEFAULT == null ? feedId != null : !FEED_ID_EDEFAULT.equals(feedId);
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__LOG_URL:
				return LOG_URL_EDEFAULT == null ? logURL != null : !LOG_URL_EDEFAULT.equals(logURL);
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__SUB_ID:
				return SUB_ID_EDEFAULT == null ? subId != null : !SUB_ID_EDEFAULT.equals(subId);
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__SUSPENDED:
				return suspended != SUSPENDED_EDEFAULT;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__USE100:
				return use100 != USE100_EDEFAULT;
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__USERPWD:
				return USERPWD_EDEFAULT == null ? userpwd != null : !USERPWD_EDEFAULT.equals(userpwd);
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER__DELIVERY_URL:
				return DELIVERY_URL_EDEFAULT == null ? deliveryURL != null : !DELIVERY_URL_EDEFAULT.equals(deliveryURL);
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
		result.append(", otherFeedName: ");
		result.append(otherFeedName);
		result.append(", feedId: ");
		result.append(feedId);
		result.append(", logURL: ");
		result.append(logURL);
		result.append(", owner: ");
		result.append(owner);
		result.append(", subId: ");
		result.append(subId);
		result.append(", suspended: ");
		result.append(suspended);
		result.append(", use100: ");
		result.append(use100);
		result.append(", username: ");
		result.append(username);
		result.append(", userpwd: ");
		result.append(userpwd);
		result.append(", deliveryURL: ");
		result.append(deliveryURL);
		result.append(')');
		return result.toString();
	}

} //DatabusStreamFeedSubscriberImpl
