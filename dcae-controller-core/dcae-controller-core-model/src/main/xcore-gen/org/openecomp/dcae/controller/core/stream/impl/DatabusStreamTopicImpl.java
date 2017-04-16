
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

import org.openecomp.dcae.controller.core.stream.DatabusStreamTopic;
import org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient;
import org.openecomp.dcae.controller.core.stream.StreamAuthentication;
import org.openecomp.dcae.controller.core.stream.StreamPackage;

import java.util.Collection;
import java.util.Date;
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
 * An implementation of the model object '<em><b>Databus Stream Topic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicImpl#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicImpl#getTopicDescription <em>Topic Description</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicImpl#getDcaeLocationName <em>Dcae Location Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicImpl#isTxenabled <em>Txenabled</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicImpl#getFqtn <em>Fqtn</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicImpl#getLastMod <em>Last Mod</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicImpl#getClients <em>Clients</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicImpl#getPublishURL <em>Publish URL</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicImpl#getSubscribeURL <em>Subscribe URL</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicImpl#getAuthenticationMethod <em>Authentication Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabusStreamTopicImpl extends DatabusStreamImpl implements DatabusStreamTopic {
	/**
	 * The default value of the '{@link #getTopicName() <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicName()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTopicName() <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicName()
	 * @generated
	 * @ordered
	 */
	protected String topicName = TOPIC_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getTopicDescription() <em>Topic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTopicDescription() <em>Topic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicDescription()
	 * @generated
	 * @ordered
	 */
	protected String topicDescription = TOPIC_DESCRIPTION_EDEFAULT;
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
	 * The default value of the '{@link #isTxenabled() <em>Txenabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTxenabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TXENABLED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isTxenabled() <em>Txenabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTxenabled()
	 * @generated
	 * @ordered
	 */
	protected boolean txenabled = TXENABLED_EDEFAULT;

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
	 * The default value of the '{@link #getLastMod() <em>Last Mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMod()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MOD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastMod() <em>Last Mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastMod()
	 * @generated
	 * @ordered
	 */
	protected Date lastMod = LAST_MOD_EDEFAULT;
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
	 * The cached value of the '{@link #getClients() <em>Clients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabusStreamTopicClient> clients;

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
	 * The default value of the '{@link #getAuthenticationMethod() <em>Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final StreamAuthentication AUTHENTICATION_METHOD_EDEFAULT = StreamAuthentication.AAF;
	/**
	 * The cached value of the '{@link #getAuthenticationMethod() <em>Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMethod()
	 * @generated
	 * @ordered
	 */
	protected StreamAuthentication authenticationMethod = AUTHENTICATION_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabusStreamTopicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamPackage.Literals.DATABUS_STREAM_TOPIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopicName() {
		return topicName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicName(String newTopicName) {
		String oldTopicName = topicName;
		topicName = newTopicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC__TOPIC_NAME, oldTopicName, topicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopicDescription() {
		return topicDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicDescription(String newTopicDescription) {
		String oldTopicDescription = topicDescription;
		topicDescription = newTopicDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC__TOPIC_DESCRIPTION, oldTopicDescription, topicDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC__DCAE_LOCATION_NAME, oldDcaeLocationName, dcaeLocationName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTxenabled() {
		return txenabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxenabled(boolean newTxenabled) {
		boolean oldTxenabled = txenabled;
		txenabled = newTxenabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC__TXENABLED, oldTxenabled, txenabled));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC__FQTN, oldFqtn, fqtn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastMod() {
		return lastMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastMod(Date newLastMod) {
		Date oldLastMod = lastMod;
		lastMod = newLastMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC__LAST_MOD, oldLastMod, lastMod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabusStreamTopicClient> getClients() {
		if (clients == null) {
			clients = new EObjectContainmentEList<DatabusStreamTopicClient>(DatabusStreamTopicClient.class, this, StreamPackage.DATABUS_STREAM_TOPIC__CLIENTS);
		}
		return clients;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC__PUBLISH_URL, oldPublishURL, publishURL));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC__SUBSCRIBE_URL, oldSubscribeURL, subscribeURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamAuthentication getAuthenticationMethod() {
		return authenticationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticationMethod(StreamAuthentication newAuthenticationMethod) {
		StreamAuthentication oldAuthenticationMethod = authenticationMethod;
		authenticationMethod = newAuthenticationMethod == null ? AUTHENTICATION_METHOD_EDEFAULT : newAuthenticationMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_STREAM_TOPIC__AUTHENTICATION_METHOD, oldAuthenticationMethod, authenticationMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StreamPackage.DATABUS_STREAM_TOPIC__CLIENTS:
				return ((InternalEList<?>)getClients()).basicRemove(otherEnd, msgs);
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
			case StreamPackage.DATABUS_STREAM_TOPIC__TOPIC_NAME:
				return getTopicName();
			case StreamPackage.DATABUS_STREAM_TOPIC__TOPIC_DESCRIPTION:
				return getTopicDescription();
			case StreamPackage.DATABUS_STREAM_TOPIC__DCAE_LOCATION_NAME:
				return getDcaeLocationName();
			case StreamPackage.DATABUS_STREAM_TOPIC__OWNER:
				return getOwner();
			case StreamPackage.DATABUS_STREAM_TOPIC__TXENABLED:
				return isTxenabled();
			case StreamPackage.DATABUS_STREAM_TOPIC__FQTN:
				return getFqtn();
			case StreamPackage.DATABUS_STREAM_TOPIC__LAST_MOD:
				return getLastMod();
			case StreamPackage.DATABUS_STREAM_TOPIC__STATUS:
				return getStatus();
			case StreamPackage.DATABUS_STREAM_TOPIC__CLIENTS:
				return getClients();
			case StreamPackage.DATABUS_STREAM_TOPIC__PUBLISH_URL:
				return getPublishURL();
			case StreamPackage.DATABUS_STREAM_TOPIC__SUBSCRIBE_URL:
				return getSubscribeURL();
			case StreamPackage.DATABUS_STREAM_TOPIC__AUTHENTICATION_METHOD:
				return getAuthenticationMethod();
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
			case StreamPackage.DATABUS_STREAM_TOPIC__TOPIC_NAME:
				setTopicName((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__TOPIC_DESCRIPTION:
				setTopicDescription((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__DCAE_LOCATION_NAME:
				setDcaeLocationName((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__OWNER:
				setOwner((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__TXENABLED:
				setTxenabled((Boolean)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__FQTN:
				setFqtn((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__LAST_MOD:
				setLastMod((Date)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__STATUS:
				setStatus((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__CLIENTS:
				getClients().clear();
				getClients().addAll((Collection<? extends DatabusStreamTopicClient>)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__PUBLISH_URL:
				setPublishURL((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__SUBSCRIBE_URL:
				setSubscribeURL((String)newValue);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__AUTHENTICATION_METHOD:
				setAuthenticationMethod((StreamAuthentication)newValue);
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
			case StreamPackage.DATABUS_STREAM_TOPIC__TOPIC_NAME:
				setTopicName(TOPIC_NAME_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__TOPIC_DESCRIPTION:
				setTopicDescription(TOPIC_DESCRIPTION_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__DCAE_LOCATION_NAME:
				setDcaeLocationName(DCAE_LOCATION_NAME_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__TXENABLED:
				setTxenabled(TXENABLED_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__FQTN:
				setFqtn(FQTN_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__LAST_MOD:
				setLastMod(LAST_MOD_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__CLIENTS:
				getClients().clear();
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__PUBLISH_URL:
				setPublishURL(PUBLISH_URL_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__SUBSCRIBE_URL:
				setSubscribeURL(SUBSCRIBE_URL_EDEFAULT);
				return;
			case StreamPackage.DATABUS_STREAM_TOPIC__AUTHENTICATION_METHOD:
				setAuthenticationMethod(AUTHENTICATION_METHOD_EDEFAULT);
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
			case StreamPackage.DATABUS_STREAM_TOPIC__TOPIC_NAME:
				return TOPIC_NAME_EDEFAULT == null ? topicName != null : !TOPIC_NAME_EDEFAULT.equals(topicName);
			case StreamPackage.DATABUS_STREAM_TOPIC__TOPIC_DESCRIPTION:
				return TOPIC_DESCRIPTION_EDEFAULT == null ? topicDescription != null : !TOPIC_DESCRIPTION_EDEFAULT.equals(topicDescription);
			case StreamPackage.DATABUS_STREAM_TOPIC__DCAE_LOCATION_NAME:
				return DCAE_LOCATION_NAME_EDEFAULT == null ? dcaeLocationName != null : !DCAE_LOCATION_NAME_EDEFAULT.equals(dcaeLocationName);
			case StreamPackage.DATABUS_STREAM_TOPIC__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case StreamPackage.DATABUS_STREAM_TOPIC__TXENABLED:
				return txenabled != TXENABLED_EDEFAULT;
			case StreamPackage.DATABUS_STREAM_TOPIC__FQTN:
				return FQTN_EDEFAULT == null ? fqtn != null : !FQTN_EDEFAULT.equals(fqtn);
			case StreamPackage.DATABUS_STREAM_TOPIC__LAST_MOD:
				return LAST_MOD_EDEFAULT == null ? lastMod != null : !LAST_MOD_EDEFAULT.equals(lastMod);
			case StreamPackage.DATABUS_STREAM_TOPIC__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case StreamPackage.DATABUS_STREAM_TOPIC__CLIENTS:
				return clients != null && !clients.isEmpty();
			case StreamPackage.DATABUS_STREAM_TOPIC__PUBLISH_URL:
				return PUBLISH_URL_EDEFAULT == null ? publishURL != null : !PUBLISH_URL_EDEFAULT.equals(publishURL);
			case StreamPackage.DATABUS_STREAM_TOPIC__SUBSCRIBE_URL:
				return SUBSCRIBE_URL_EDEFAULT == null ? subscribeURL != null : !SUBSCRIBE_URL_EDEFAULT.equals(subscribeURL);
			case StreamPackage.DATABUS_STREAM_TOPIC__AUTHENTICATION_METHOD:
				return authenticationMethod != AUTHENTICATION_METHOD_EDEFAULT;
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
		result.append(" (topicName: ");
		result.append(topicName);
		result.append(", topicDescription: ");
		result.append(topicDescription);
		result.append(", dcaeLocationName: ");
		result.append(dcaeLocationName);
		result.append(", owner: ");
		result.append(owner);
		result.append(", txenabled: ");
		result.append(txenabled);
		result.append(", fqtn: ");
		result.append(fqtn);
		result.append(", lastMod: ");
		result.append(lastMod);
		result.append(", status: ");
		result.append(status);
		result.append(", publishURL: ");
		result.append(publishURL);
		result.append(", subscribeURL: ");
		result.append(subscribeURL);
		result.append(", authenticationMethod: ");
		result.append(authenticationMethod);
		result.append(')');
		return result.toString();
	}

} //DatabusStreamTopicImpl
