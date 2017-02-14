
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

import org.openecomp.dcae.controller.platform.controller.ControllerCluster;
import org.openecomp.dcae.controller.platform.controller.ControllerClusterServer;
import org.openecomp.dcae.controller.platform.controller.ControllerPackage;

import org.openecomp.dcae.controller.platform.controller.ServerRole;
import org.openecomp.ncomp.core.types.metrics.DateMetricAttribute;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterImpl#getMyServerName <em>My Server Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterImpl#getStateTime <em>State Time</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterImpl#getServers <em>Servers</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterImpl#getRemoteServers <em>Remote Servers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerClusterImpl extends MinimalEObjectImpl.Container implements ControllerCluster {
	/**
	 * The default value of the '{@link #getMyServerName() <em>My Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyServerName()
	 * @generated
	 * @ordered
	 */
	protected static final String MY_SERVER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMyServerName() <em>My Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyServerName()
	 * @generated
	 * @ordered
	 */
	protected String myServerName = MY_SERVER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final ServerRole ROLE_EDEFAULT = ServerRole.UNKNOWN;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected ServerRole role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateTime() <em>State Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateTime()
	 * @generated
	 * @ordered
	 */
	protected static final DateMetricAttribute STATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateTime() <em>State Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateTime()
	 * @generated
	 * @ordered
	 */
	protected DateMetricAttribute stateTime = STATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServers() <em>Servers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServers()
	 * @generated
	 * @ordered
	 */
	protected EList<ControllerClusterServer> servers;

	/**
	 * The cached value of the '{@link #getRemoteServers() <em>Remote Servers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteServers()
	 * @generated
	 * @ordered
	 */
	protected EList<ControllerClusterServer> remoteServers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControllerPackage.Literals.CONTROLLER_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMyServerName() {
		return myServerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyServerName(String newMyServerName) {
		String oldMyServerName = myServerName;
		myServerName = newMyServerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.CONTROLLER_CLUSTER__MY_SERVER_NAME, oldMyServerName, myServerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerRole getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(ServerRole newRole) {
		ServerRole oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.CONTROLLER_CLUSTER__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateMetricAttribute getStateTime() {
		return stateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateTime(DateMetricAttribute newStateTime) {
		DateMetricAttribute oldStateTime = stateTime;
		stateTime = newStateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.CONTROLLER_CLUSTER__STATE_TIME, oldStateTime, stateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControllerClusterServer> getServers() {
		if (servers == null) {
			servers = new EObjectContainmentEList<ControllerClusterServer>(ControllerClusterServer.class, this, ControllerPackage.CONTROLLER_CLUSTER__SERVERS);
		}
		return servers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControllerClusterServer> getRemoteServers() {
		if (remoteServers == null) {
			remoteServers = new EObjectContainmentEList<ControllerClusterServer>(ControllerClusterServer.class, this, ControllerPackage.CONTROLLER_CLUSTER__REMOTE_SERVERS);
		}
		return remoteServers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pushData(String serverName, String dataName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void receiveData(String serverName, String dataName, Date time, String content) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControllerPackage.CONTROLLER_CLUSTER__SERVERS:
				return ((InternalEList<?>)getServers()).basicRemove(otherEnd, msgs);
			case ControllerPackage.CONTROLLER_CLUSTER__REMOTE_SERVERS:
				return ((InternalEList<?>)getRemoteServers()).basicRemove(otherEnd, msgs);
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
			case ControllerPackage.CONTROLLER_CLUSTER__MY_SERVER_NAME:
				return getMyServerName();
			case ControllerPackage.CONTROLLER_CLUSTER__ROLE:
				return getRole();
			case ControllerPackage.CONTROLLER_CLUSTER__STATE_TIME:
				return getStateTime();
			case ControllerPackage.CONTROLLER_CLUSTER__SERVERS:
				return getServers();
			case ControllerPackage.CONTROLLER_CLUSTER__REMOTE_SERVERS:
				return getRemoteServers();
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
			case ControllerPackage.CONTROLLER_CLUSTER__MY_SERVER_NAME:
				setMyServerName((String)newValue);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER__ROLE:
				setRole((ServerRole)newValue);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER__STATE_TIME:
				setStateTime((DateMetricAttribute)newValue);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER__SERVERS:
				getServers().clear();
				getServers().addAll((Collection<? extends ControllerClusterServer>)newValue);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER__REMOTE_SERVERS:
				getRemoteServers().clear();
				getRemoteServers().addAll((Collection<? extends ControllerClusterServer>)newValue);
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
			case ControllerPackage.CONTROLLER_CLUSTER__MY_SERVER_NAME:
				setMyServerName(MY_SERVER_NAME_EDEFAULT);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER__STATE_TIME:
				setStateTime(STATE_TIME_EDEFAULT);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER__SERVERS:
				getServers().clear();
				return;
			case ControllerPackage.CONTROLLER_CLUSTER__REMOTE_SERVERS:
				getRemoteServers().clear();
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
			case ControllerPackage.CONTROLLER_CLUSTER__MY_SERVER_NAME:
				return MY_SERVER_NAME_EDEFAULT == null ? myServerName != null : !MY_SERVER_NAME_EDEFAULT.equals(myServerName);
			case ControllerPackage.CONTROLLER_CLUSTER__ROLE:
				return role != ROLE_EDEFAULT;
			case ControllerPackage.CONTROLLER_CLUSTER__STATE_TIME:
				return STATE_TIME_EDEFAULT == null ? stateTime != null : !STATE_TIME_EDEFAULT.equals(stateTime);
			case ControllerPackage.CONTROLLER_CLUSTER__SERVERS:
				return servers != null && !servers.isEmpty();
			case ControllerPackage.CONTROLLER_CLUSTER__REMOTE_SERVERS:
				return remoteServers != null && !remoteServers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ControllerPackage.CONTROLLER_CLUSTER___PUSH_DATA__STRING_STRING:
				pushData((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ControllerPackage.CONTROLLER_CLUSTER___RECEIVE_DATA__STRING_STRING_DATE_STRING:
				receiveData((String)arguments.get(0), (String)arguments.get(1), (Date)arguments.get(2), (String)arguments.get(3));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (myServerName: ");
		result.append(myServerName);
		result.append(", role: ");
		result.append(role);
		result.append(", stateTime: ");
		result.append(stateTime);
		result.append(')');
		return result.toString();
	}

} //ControllerClusterImpl
