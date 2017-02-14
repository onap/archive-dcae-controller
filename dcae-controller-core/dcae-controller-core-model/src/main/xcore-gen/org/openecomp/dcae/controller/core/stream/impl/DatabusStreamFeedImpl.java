
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

import org.openecomp.dcae.controller.core.stream.DatabusStreamFeed;
import org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher;
import org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber;
import org.openecomp.dcae.controller.core.stream.StreamPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Databus Stream Feed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedImpl#getFeedName <em>Feed Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedImpl#getFeedVersion <em>Feed Version</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedImpl#getFeedDescription <em>Feed Description</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedImpl#getAsprClassification <em>Aspr Classification</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedImpl#getFeedId <em>Feed Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedImpl#getLogURL <em>Log URL</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedImpl#getPublishURL <em>Publish URL</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedImpl#getSubscribeURL <em>Subscribe URL</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedImpl#getSuspended <em>Suspended</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedImpl#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedImpl#getSubscribers <em>Subscribers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabusStreamFeedImpl extends DatabusStreamImpl implements DatabusStreamFeed {
	/**
	 * The default value of the '{@link #getFeedName() <em>Feed Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEED_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFeedName() <em>Feed Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedName()
	 * @generated
	 * @ordered
	 */
	protected String feedName = FEED_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getFeedVersion() <em>Feed Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String FEED_VERSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFeedVersion() <em>Feed Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedVersion()
	 * @generated
	 * @ordered
	 */
	protected String feedVersion = FEED_VERSION_EDEFAULT;
	/**
	 * The default value of the '{@link #getFeedDescription() <em>Feed Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String FEED_DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFeedDescription() <em>Feed Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedDescription()
	 * @generated
	 * @ordered
	 */
	protected String feedDescription = FEED_DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getAsprClassification() <em>Aspr Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsprClassification()
	 * @generated
	 * @ordered
	 */
	protected static final String ASPR_CLASSIFICATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAsprClassification() <em>Aspr Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsprClassification()
	 * @generated
	 * @ordered
	 */
	protected String asprClassification = ASPR_CLASSIFICATION_EDEFAULT;
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
	 * The default value of the '{@link #getPublishURL() <em>Publish URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishURL()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISH_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPublishURL() <em>Publish URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishURL()
	 * @generated
	 * @ordered
	 */
	protected String publishURL = PUBLISH_URL_EDEFAULT;
	/**
	 * The default value of the '{@link #getSubscribeURL() <em>Subscribe URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribeURL()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBE_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSubscribeURL() <em>Subscribe URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribeURL()
	 * @generated
	 * @ordered
	 */
	protected String subscribeURL = SUBSCRIBE_URL_EDEFAULT;
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
	 * The default value of the '{@link #getSuspended() <em>Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspended()
	 * @generated
	 * @ordered
	 */
	protected static final String SUSPENDED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSuspended() <em>Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspended()
	 * @generated
	 * @ordered
	 */
	protected String suspended = SUSPENDED_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPublishers() <em>Publishers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishers()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabusStreamFeedPublisher> publishers;
	/**
	 * The cached value of the '{@link #getSubscribers() <em>Subscribers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribers()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabusStreamFeedSubscriber> subscribers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabusStreamFeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamPackage.Literals.DATABUS_STREAM_FEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeedName() {
		return feedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedName(String newFeedName) {
		String oldFeedName = feedName;
		feedName = newFeedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED__FEED_NAME, oldFeedName, feedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeedVersion() {
		return feedVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedVersion(String newFeedVersion) {
		String oldFeedVersion = feedVersion;
		feedVersion = newFeedVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED__FEED_VERSION, oldFeedVersion, feedVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeedDescription() {
		return feedDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedDescription(String newFeedDescription) {
		String oldFeedDescription = feedDescription;
		feedDescription = newFeedDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED__FEED_DESCRIPTION, oldFeedDescription, feedDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAsprClassification() {
		return asprClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsprClassification(String newAsprClassification) {
		String oldAsprClassification = asprClassification;
		asprClassification = newAsprClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED__ASPR_CLASSIFICATION, oldAsprClassification, asprClassification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED__FEED_ID, oldFeedId, feedId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED__LOG_URL, oldLogURL, logURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublishURL() {
		return publishURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishURL(String newPublishURL) {
		String oldPublishURL = publishURL;
		publishURL = newPublishURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED__PUBLISH_URL, oldPublishURL, publishURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscribeURL() {
		return subscribeURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscribeURL(String newSubscribeURL) {
		String oldSubscribeURL = subscribeURL;
		subscribeURL = newSubscribeURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED__SUBSCRIBE_URL, oldSubscribeURL, subscribeURL));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuspended() {
		return suspended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuspended(String newSuspended) {
		String oldSuspended = suspended;
		suspended = newSuspended;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_FEED__SUSPENDED, oldSuspended, suspended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabusStreamFeedPublisher> getPublishers() {
		if (publishers == null) {
			publishers = new EObjectContainmentEList<DatabusStreamFeedPublisher>(DatabusStreamFeedPublisher.class, this, StreamPackage.DATABUS_STREAM_FEED__PUBLISHERS);
		}
		return publishers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabusStreamFeedSubscriber> getSubscribers() {
		if (subscribers == null) {
			subscribers = new EObjectContainmentEList<DatabusStreamFeedSubscriber>(DatabusStreamFeedSubscriber.class, this, StreamPackage.DATABUS_STREAM_FEED__SUBSCRIBERS);
		}
		return subscribers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StreamPackage.DATABUS_STREAM_FEED__PUBLISHERS:
				return ((InternalEList<?>)getPublishers()).basicRemove(otherEnd, msgs);
			case StreamPackage.DATABUS_STREAM_FEED__SUBSCRIBERS:
				return ((InternalEList<?>)getSubscribers()).basicRemove(otherEnd, msgs);
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
			case StreamPackage.DATABUS_STREAM_FEED__FEED_NAME:
				return getFeedName();
			case StreamPackage.DATABUS_STREAM_FEED__FEED_VERSION:
				return getFeedVersion();
			case StreamPackage.DATABUS_STREAM_FEED__FEED_DESCRIPTION:
				return getFeedDescription();
			case StreamPackage.DATABUS_STREAM_FEED__ASPR_CLASSIFICATION:
				return getAsprClassification();
			case StreamPackage.DATABUS_STREAM_FEED__OWNER:
				return getOwner();
			case StreamPackage.DATABUS_STREAM_FEED__FEED_ID:
				return getFeedId();
			case StreamPackage.DATABUS_STREAM_FEED__LOG_URL:
				return getLogURL();
			case StreamPackage.DATABUS_STREAM_FEED__PUBLISH_URL:
				return getPublishURL();
			case StreamPackage.DATABUS_STREAM_FEED__SUBSCRIBE_URL:
				return getSubscribeURL();
			case StreamPackage.DATABUS_STREAM_FEED__STATUS:
				return getStatus();
			case StreamPackage.DATABUS_STREAM_FEED__SUSPENDED:
				return getSuspended();
			case StreamPackage.DATABUS_STREAM_FEED__PUBLISHERS:
				return getPublishers();
			case StreamPackage.DATABUS_STREAM_FEED__SUBSCRIBERS:
				return getSubscribers();
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
			case StreamPackage.DATABUS_STREAM_FEED__FEED_NAME:
				setFeedName((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__FEED_VERSION:
				setFeedVersion((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__FEED_DESCRIPTION:
				setFeedDescription((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__ASPR_CLASSIFICATION:
				setAsprClassification((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__OWNER:
				setOwner((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__FEED_ID:
				setFeedId((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__LOG_URL:
				setLogURL((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__PUBLISH_URL:
				setPublishURL((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__SUBSCRIBE_URL:
				setSubscribeURL((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__STATUS:
				setStatus((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__SUSPENDED:
				setSuspended((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__PUBLISHERS:
				getPublishers().clear();
				getPublishers().addAll((Collection<? extends DatabusStreamFeedPublisher>)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__SUBSCRIBERS:
				getSubscribers().clear();
				getSubscribers().addAll((Collection<? extends DatabusStreamFeedSubscriber>)newValue);
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
			case StreamPackage.DATABUS_STREAM_FEED__FEED_NAME:
				setFeedName(FEED_NAME_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__FEED_VERSION:
				setFeedVersion(FEED_VERSION_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__FEED_DESCRIPTION:
				setFeedDescription(FEED_DESCRIPTION_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__ASPR_CLASSIFICATION:
				setAsprClassification(ASPR_CLASSIFICATION_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__FEED_ID:
				setFeedId(FEED_ID_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__LOG_URL:
				setLogURL(LOG_URL_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__PUBLISH_URL:
				setPublishURL(PUBLISH_URL_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__SUBSCRIBE_URL:
				setSubscribeURL(SUBSCRIBE_URL_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__SUSPENDED:
				setSuspended(SUSPENDED_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_FEED__PUBLISHERS:
				getPublishers().clear();
				return;
			case StreamPackage.DATABUS_STREAM_FEED__SUBSCRIBERS:
				getSubscribers().clear();
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
			case StreamPackage.DATABUS_STREAM_FEED__FEED_NAME:
				return FEED_NAME_EDEFAULT == null ? feedName != null : !FEED_NAME_EDEFAULT.equals(feedName);
			case StreamPackage.DATABUS_STREAM_FEED__FEED_VERSION:
				return FEED_VERSION_EDEFAULT == null ? feedVersion != null : !FEED_VERSION_EDEFAULT.equals(feedVersion);
			case StreamPackage.DATABUS_STREAM_FEED__FEED_DESCRIPTION:
				return FEED_DESCRIPTION_EDEFAULT == null ? feedDescription != null : !FEED_DESCRIPTION_EDEFAULT.equals(feedDescription);
			case StreamPackage.DATABUS_STREAM_FEED__ASPR_CLASSIFICATION:
				return ASPR_CLASSIFICATION_EDEFAULT == null ? asprClassification != null : !ASPR_CLASSIFICATION_EDEFAULT.equals(asprClassification);
			case StreamPackage.DATABUS_STREAM_FEED__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case StreamPackage.DATABUS_STREAM_FEED__FEED_ID:
				return FEED_ID_EDEFAULT == null ? feedId != null : !FEED_ID_EDEFAULT.equals(feedId);
			case StreamPackage.DATABUS_STREAM_FEED__LOG_URL:
				return LOG_URL_EDEFAULT == null ? logURL != null : !LOG_URL_EDEFAULT.equals(logURL);
			case StreamPackage.DATABUS_STREAM_FEED__PUBLISH_URL:
				return PUBLISH_URL_EDEFAULT == null ? publishURL != null : !PUBLISH_URL_EDEFAULT.equals(publishURL);
			case StreamPackage.DATABUS_STREAM_FEED__SUBSCRIBE_URL:
				return SUBSCRIBE_URL_EDEFAULT == null ? subscribeURL != null : !SUBSCRIBE_URL_EDEFAULT.equals(subscribeURL);
			case StreamPackage.DATABUS_STREAM_FEED__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case StreamPackage.DATABUS_STREAM_FEED__SUSPENDED:
				return SUSPENDED_EDEFAULT == null ? suspended != null : !SUSPENDED_EDEFAULT.equals(suspended);
			case StreamPackage.DATABUS_STREAM_FEED__PUBLISHERS:
				return publishers != null && !publishers.isEmpty();
			case StreamPackage.DATABUS_STREAM_FEED__SUBSCRIBERS:
				return subscribers != null && !subscribers.isEmpty();
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
		result.append(" (feedName: ");
		result.append(feedName);
		result.append(", feedVersion: ");
		result.append(feedVersion);
		result.append(", feedDescription: ");
		result.append(feedDescription);
		result.append(", asprClassification: ");
		result.append(asprClassification);
		result.append(", owner: ");
		result.append(owner);
		result.append(", feedId: ");
		result.append(feedId);
		result.append(", logURL: ");
		result.append(logURL);
		result.append(", publishURL: ");
		result.append(publishURL);
		result.append(", subscribeURL: ");
		result.append(subscribeURL);
		result.append(", status: ");
		result.append(status);
		result.append(", suspended: ");
		result.append(suspended);
		result.append(')');
		return result.toString();
	}

} //DatabusStreamFeedImpl
