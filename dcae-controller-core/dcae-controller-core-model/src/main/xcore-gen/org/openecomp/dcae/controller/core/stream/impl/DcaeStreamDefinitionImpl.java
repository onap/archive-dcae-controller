
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

import org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition;
import org.openecomp.dcae.controller.core.stream.DcaeStreamPublisher;
import org.openecomp.dcae.controller.core.stream.DcaeStreamSubscriber;
import org.openecomp.dcae.controller.core.stream.StreamPackage;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;
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
 * An implementation of the model object '<em><b>Dcae Stream Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamDefinitionImpl#getStreamType <em>Stream Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamDefinitionImpl#getDatabusType <em>Databus Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamDefinitionImpl#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamDefinitionImpl#getSubscribers <em>Subscribers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DcaeStreamDefinitionImpl extends NamedEntityImpl implements DcaeStreamDefinition {
	/**
	 * The default value of the '{@link #getStreamType() <em>Stream Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamType()
	 * @generated
	 * @ordered
	 */
	protected static final String STREAM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreamType() <em>Stream Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamType()
	 * @generated
	 * @ordered
	 */
	protected String streamType = STREAM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabusType() <em>Databus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabusType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABUS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabusType() <em>Databus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabusType()
	 * @generated
	 * @ordered
	 */
	protected String databusType = DATABUS_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublishers() <em>Publishers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishers()
	 * @generated
	 * @ordered
	 */
	protected EList<DcaeStreamPublisher> publishers;

	/**
	 * The cached value of the '{@link #getSubscribers() <em>Subscribers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribers()
	 * @generated
	 * @ordered
	 */
	protected EList<DcaeStreamSubscriber> subscribers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcaeStreamDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamPackage.Literals.DCAE_STREAM_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreamType() {
		return streamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreamType(String newStreamType) {
		String oldStreamType = streamType;
		streamType = newStreamType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DCAE_STREAM_DEFINITION__STREAM_TYPE, oldStreamType, streamType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabusType() {
		return databusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabusType(String newDatabusType) {
		String oldDatabusType = databusType;
		databusType = newDatabusType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DCAE_STREAM_DEFINITION__DATABUS_TYPE, oldDatabusType, databusType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DcaeStreamPublisher> getPublishers() {
		if (publishers == null) {
			publishers = new EObjectContainmentEList<DcaeStreamPublisher>(DcaeStreamPublisher.class, this, StreamPackage.DCAE_STREAM_DEFINITION__PUBLISHERS);
		}
		return publishers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DcaeStreamSubscriber> getSubscribers() {
		if (subscribers == null) {
			subscribers = new EObjectContainmentEList<DcaeStreamSubscriber>(DcaeStreamSubscriber.class, this, StreamPackage.DCAE_STREAM_DEFINITION__SUBSCRIBERS);
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
			case StreamPackage.DCAE_STREAM_DEFINITION__PUBLISHERS:
				return ((InternalEList<?>)getPublishers()).basicRemove(otherEnd, msgs);
			case StreamPackage.DCAE_STREAM_DEFINITION__SUBSCRIBERS:
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
			case StreamPackage.DCAE_STREAM_DEFINITION__STREAM_TYPE:
				return getStreamType();
			case StreamPackage.DCAE_STREAM_DEFINITION__DATABUS_TYPE:
				return getDatabusType();
			case StreamPackage.DCAE_STREAM_DEFINITION__PUBLISHERS:
				return getPublishers();
			case StreamPackage.DCAE_STREAM_DEFINITION__SUBSCRIBERS:
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
			case StreamPackage.DCAE_STREAM_DEFINITION__STREAM_TYPE:
				setStreamType((String)newValue);
				return;
			case StreamPackage.DCAE_STREAM_DEFINITION__DATABUS_TYPE:
				setDatabusType((String)newValue);
				return;
			case StreamPackage.DCAE_STREAM_DEFINITION__PUBLISHERS:
				getPublishers().clear();
				getPublishers().addAll((Collection<? extends DcaeStreamPublisher>)newValue);
				return;
			case StreamPackage.DCAE_STREAM_DEFINITION__SUBSCRIBERS:
				getSubscribers().clear();
				getSubscribers().addAll((Collection<? extends DcaeStreamSubscriber>)newValue);
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
			case StreamPackage.DCAE_STREAM_DEFINITION__STREAM_TYPE:
				setStreamType(STREAM_TYPE_EDEFAULT);
				return;
			case StreamPackage.DCAE_STREAM_DEFINITION__DATABUS_TYPE:
				setDatabusType(DATABUS_TYPE_EDEFAULT);
				return;
			case StreamPackage.DCAE_STREAM_DEFINITION__PUBLISHERS:
				getPublishers().clear();
				return;
			case StreamPackage.DCAE_STREAM_DEFINITION__SUBSCRIBERS:
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
			case StreamPackage.DCAE_STREAM_DEFINITION__STREAM_TYPE:
				return STREAM_TYPE_EDEFAULT == null ? streamType != null : !STREAM_TYPE_EDEFAULT.equals(streamType);
			case StreamPackage.DCAE_STREAM_DEFINITION__DATABUS_TYPE:
				return DATABUS_TYPE_EDEFAULT == null ? databusType != null : !DATABUS_TYPE_EDEFAULT.equals(databusType);
			case StreamPackage.DCAE_STREAM_DEFINITION__PUBLISHERS:
				return publishers != null && !publishers.isEmpty();
			case StreamPackage.DCAE_STREAM_DEFINITION__SUBSCRIBERS:
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
		result.append(" (streamType: ");
		result.append(streamType);
		result.append(", databusType: ");
		result.append(databusType);
		result.append(')');
		return result.toString();
	}

} //DcaeStreamDefinitionImpl
