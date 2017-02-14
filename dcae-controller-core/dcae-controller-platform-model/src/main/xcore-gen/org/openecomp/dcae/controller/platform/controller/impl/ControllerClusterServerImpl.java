
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

import org.openecomp.dcae.controller.core.server.DcaeBasicServer;
import org.openecomp.dcae.controller.platform.controller.ControllerClusterServer;
import org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData;
import org.openecomp.dcae.controller.platform.controller.ControllerPackage;
import org.openecomp.dcae.controller.platform.controller.ServerRole;
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
 * An implementation of the model object '<em><b>Cluster Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterServerImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterServerImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterServerImpl#getServer <em>Server</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerClusterServerImpl extends NamedEntityImpl implements ControllerClusterServer {
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
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<ControllerClusterServerData> data;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected DcaeBasicServer server;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerClusterServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControllerPackage.Literals.CONTROLLER_CLUSTER_SERVER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.CONTROLLER_CLUSTER_SERVER__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControllerClusterServerData> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<ControllerClusterServerData>(ControllerClusterServerData.class, this, ControllerPackage.CONTROLLER_CLUSTER_SERVER__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeBasicServer getServer() {
		if (server != null && server.eIsProxy()) {
			InternalEObject oldServer = (InternalEObject)server;
			server = (DcaeBasicServer)eResolveProxy(oldServer);
			if (server != oldServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControllerPackage.CONTROLLER_CLUSTER_SERVER__SERVER, oldServer, server));
			}
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeBasicServer basicGetServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(DcaeBasicServer newServer) {
		DcaeBasicServer oldServer = server;
		server = newServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.CONTROLLER_CLUSTER_SERVER__SERVER, oldServer, server));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
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
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER__ROLE:
				return getRole();
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER__DATA:
				return getData();
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER__SERVER:
				if (resolve) return getServer();
				return basicGetServer();
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
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER__ROLE:
				setRole((ServerRole)newValue);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER__DATA:
				getData().clear();
				getData().addAll((Collection<? extends ControllerClusterServerData>)newValue);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER__SERVER:
				setServer((DcaeBasicServer)newValue);
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
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER__DATA:
				getData().clear();
				return;
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER__SERVER:
				setServer((DcaeBasicServer)null);
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
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER__ROLE:
				return role != ROLE_EDEFAULT;
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER__DATA:
				return data != null && !data.isEmpty();
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER__SERVER:
				return server != null;
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
		result.append(" (role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //ControllerClusterServerImpl
