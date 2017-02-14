
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
package org.openecomp.dcae.controller.platform.controller.impl;

import org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData;
import org.openecomp.dcae.controller.platform.controller.ControllerPackage;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

import org.openecomp.ncomp.core.types.metrics.DateMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster Server Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterServerDataImpl#getPushInterval <em>Push Interval</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterServerDataImpl#getLastPush <em>Last Push</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterServerDataImpl#getNumberDataPushes <em>Number Data Pushes</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterServerDataImpl#getNumberDataPushErrors <em>Number Data Push Errors</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterServerDataImpl#getLastDataReceived <em>Last Data Received</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterServerDataImpl#getNumberDataReceived <em>Number Data Received</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterServerDataImpl#getNumberDataReceivedErrors <em>Number Data Received Errors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerClusterServerDataImpl extends NamedEntityImpl implements ControllerClusterServerData {
	/**
	 * The default value of the '{@link #getPushInterval() <em>Push Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPushInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String PUSH_INTERVAL_EDEFAULT = "5min";

	/**
	 * The cached value of the '{@link #getPushInterval() <em>Push Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPushInterval()
	 * @generated
	 * @ordered
	 */
	protected String pushInterval = PUSH_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastPush() <em>Last Push</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPush()
	 * @generated
	 * @ordered
	 */
	protected static final DateMetricAttribute LAST_PUSH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastPush() <em>Last Push</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPush()
	 * @generated
	 * @ordered
	 */
	protected DateMetricAttribute lastPush = LAST_PUSH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberDataPushes() <em>Number Data Pushes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberDataPushes()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute NUMBER_DATA_PUSHES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberDataPushes() <em>Number Data Pushes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberDataPushes()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute numberDataPushes = NUMBER_DATA_PUSHES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberDataPushErrors() <em>Number Data Push Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberDataPushErrors()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute NUMBER_DATA_PUSH_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberDataPushErrors() <em>Number Data Push Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberDataPushErrors()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute numberDataPushErrors = NUMBER_DATA_PUSH_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastDataReceived() <em>Last Data Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastDataReceived()
	 * @generated
	 * @ordered
	 */
	protected static final DateMetricAttribute LAST_DATA_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastDataReceived() <em>Last Data Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastDataReceived()
	 * @generated
	 * @ordered
	 */
	protected DateMetricAttribute lastDataReceived = LAST_DATA_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberDataReceived() <em>Number Data Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberDataReceived()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute NUMBER_DATA_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberDataReceived() <em>Number Data Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberDataReceived()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute numberDataReceived = NUMBER_DATA_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberDataReceivedErrors() <em>Number Data Received Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberDataReceivedErrors()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute NUMBER_DATA_RECEIVED_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberDataReceivedErrors() <em>Number Data Received Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberDataReceivedErrors()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute numberDataReceivedErrors = NUMBER_DATA_RECEIVED_ERRORS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerClusterServerDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControllerPackage.Literals.CONTROLLER_CLUSTER_SERVER_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPushInterval() {
		return pushInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPushInterval(String newPushInterval) {
		String oldPushInterval = pushInterval;
		pushInterval = newPushInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__PUSH_INTERVAL, oldPushInterval, pushInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateMetricAttribute getLastPush() {
		return lastPush;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastPush(DateMetricAttribute newLastPush) {
		DateMetricAttribute oldLastPush = lastPush;
		lastPush = newLastPush;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__LAST_PUSH, oldLastPush, lastPush));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getNumberDataPushes() {
		return numberDataPushes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberDataPushes(IncreasingULongMetricAttribute newNumberDataPushes) {
		IncreasingULongMetricAttribute oldNumberDataPushes = numberDataPushes;
		numberDataPushes = newNumberDataPushes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_PUSHES, oldNumberDataPushes, numberDataPushes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getNumberDataPushErrors() {
		return numberDataPushErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberDataPushErrors(IncreasingULongMetricAttribute newNumberDataPushErrors) {
		IncreasingULongMetricAttribute oldNumberDataPushErrors = numberDataPushErrors;
		numberDataPushErrors = newNumberDataPushErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_PUSH_ERRORS, oldNumberDataPushErrors, numberDataPushErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateMetricAttribute getLastDataReceived() {
		return lastDataReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastDataReceived(DateMetricAttribute newLastDataReceived) {
		DateMetricAttribute oldLastDataReceived = lastDataReceived;
		lastDataReceived = newLastDataReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__LAST_DATA_RECEIVED, oldLastDataReceived, lastDataReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getNumberDataReceived() {
		return numberDataReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberDataReceived(IncreasingULongMetricAttribute newNumberDataReceived) {
		IncreasingULongMetricAttribute oldNumberDataReceived = numberDataReceived;
		numberDataReceived = newNumberDataReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_RECEIVED, oldNumberDataReceived, numberDataReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getNumberDataReceivedErrors() {
		return numberDataReceivedErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberDataReceivedErrors(IncreasingULongMetricAttribute newNumberDataReceivedErrors) {
		IncreasingULongMetricAttribute oldNumberDataReceivedErrors = numberDataReceivedErrors;
		numberDataReceivedErrors = newNumberDataReceivedErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_RECEIVED_ERRORS, oldNumberDataReceivedErrors, numberDataReceivedErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__PUSH_INTERVAL:
				return getPushInterval();
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__LAST_PUSH:
				return getLastPush();
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_PUSHES:
				return getNumberDataPushes();
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_PUSH_ERRORS:
				return getNumberDataPushErrors();
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__LAST_DATA_RECEIVED:
				return getLastDataReceived();
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_RECEIVED:
				return getNumberDataReceived();
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_RECEIVED_ERRORS:
				return getNumberDataReceivedErrors();
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
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__PUSH_INTERVAL:
				setPushInterval((String)newValue);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__LAST_PUSH:
				setLastPush((DateMetricAttribute)newValue);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_PUSHES:
				setNumberDataPushes((IncreasingULongMetricAttribute)newValue);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_PUSH_ERRORS:
				setNumberDataPushErrors((IncreasingULongMetricAttribute)newValue);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__LAST_DATA_RECEIVED:
				setLastDataReceived((DateMetricAttribute)newValue);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_RECEIVED:
				setNumberDataReceived((IncreasingULongMetricAttribute)newValue);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_RECEIVED_ERRORS:
				setNumberDataReceivedErrors((IncreasingULongMetricAttribute)newValue);
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
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__PUSH_INTERVAL:
				setPushInterval(PUSH_INTERVAL_EDEFAULT);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__LAST_PUSH:
				setLastPush(LAST_PUSH_EDEFAULT);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_PUSHES:
				setNumberDataPushes(NUMBER_DATA_PUSHES_EDEFAULT);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_PUSH_ERRORS:
				setNumberDataPushErrors(NUMBER_DATA_PUSH_ERRORS_EDEFAULT);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__LAST_DATA_RECEIVED:
				setLastDataReceived(LAST_DATA_RECEIVED_EDEFAULT);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_RECEIVED:
				setNumberDataReceived(NUMBER_DATA_RECEIVED_EDEFAULT);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_RECEIVED_ERRORS:
				setNumberDataReceivedErrors(NUMBER_DATA_RECEIVED_ERRORS_EDEFAULT);
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
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__PUSH_INTERVAL:
				return PUSH_INTERVAL_EDEFAULT == null ? pushInterval != null : !PUSH_INTERVAL_EDEFAULT.equals(pushInterval);
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__LAST_PUSH:
				return LAST_PUSH_EDEFAULT == null ? lastPush != null : !LAST_PUSH_EDEFAULT.equals(lastPush);
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_PUSHES:
				return NUMBER_DATA_PUSHES_EDEFAULT == null ? numberDataPushes != null : !NUMBER_DATA_PUSHES_EDEFAULT.equals(numberDataPushes);
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_PUSH_ERRORS:
				return NUMBER_DATA_PUSH_ERRORS_EDEFAULT == null ? numberDataPushErrors != null : !NUMBER_DATA_PUSH_ERRORS_EDEFAULT.equals(numberDataPushErrors);
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__LAST_DATA_RECEIVED:
				return LAST_DATA_RECEIVED_EDEFAULT == null ? lastDataReceived != null : !LAST_DATA_RECEIVED_EDEFAULT.equals(lastDataReceived);
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_RECEIVED:
				return NUMBER_DATA_RECEIVED_EDEFAULT == null ? numberDataReceived != null : !NUMBER_DATA_RECEIVED_EDEFAULT.equals(numberDataReceived);
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_RECEIVED_ERRORS:
				return NUMBER_DATA_RECEIVED_ERRORS_EDEFAULT == null ? numberDataReceivedErrors != null : !NUMBER_DATA_RECEIVED_ERRORS_EDEFAULT.equals(numberDataReceivedErrors);
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
		result.append(" (pushInterval: ");
		result.append(pushInterval);
		result.append(", lastPush: ");
		result.append(lastPush);
		result.append(", numberDataPushes: ");
		result.append(numberDataPushes);
		result.append(", numberDataPushErrors: ");
		result.append(numberDataPushErrors);
		result.append(", lastDataReceived: ");
		result.append(lastDataReceived);
		result.append(", numberDataReceived: ");
		result.append(numberDataReceived);
		result.append(", numberDataReceivedErrors: ");
		result.append(numberDataReceivedErrors);
		result.append(')');
		return result.toString();
	}

} //ControllerClusterServerDataImpl
