
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

import org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode;
import org.openecomp.dcae.controller.core.stream.StreamPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Databus Data Router Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusDataRouterNodeImpl#getDcaeLocationName <em>Dcae Location Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusDataRouterNodeImpl#getHostFqdn <em>Host Fqdn</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusDataRouterNodeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabusDataRouterNodeImpl extends DatabusEntityImpl implements DatabusDataRouterNode {
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
	 * The default value of the '{@link #getHostFqdn() <em>Host Fqdn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostFqdn()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_FQDN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getHostFqdn() <em>Host Fqdn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostFqdn()
	 * @generated
	 * @ordered
	 */
	protected String hostFqdn = HOST_FQDN_EDEFAULT;
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabusDataRouterNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamPackage.Literals.DATABUS_DATA_ROUTER_NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_DATA_ROUTER_NODE__DCAE_LOCATION_NAME, oldDcaeLocationName, dcaeLocationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostFqdn() {
		return hostFqdn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostFqdn(String newHostFqdn) {
		String oldHostFqdn = hostFqdn;
		hostFqdn = newHostFqdn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_DATA_ROUTER_NODE__HOST_FQDN, oldHostFqdn, hostFqdn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_DATA_ROUTER_NODE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StreamPackage.DATABUS_DATA_ROUTER_NODE__DCAE_LOCATION_NAME:
				return getDcaeLocationName();
			case StreamPackage.DATABUS_DATA_ROUTER_NODE__HOST_FQDN:
				return getHostFqdn();
			case StreamPackage.DATABUS_DATA_ROUTER_NODE__VERSION:
				return getVersion();
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
			case StreamPackage.DATABUS_DATA_ROUTER_NODE__DCAE_LOCATION_NAME:
				setDcaeLocationName((String)newValue);
				return;
			case StreamPackage.DATABUS_DATA_ROUTER_NODE__HOST_FQDN:
				setHostFqdn((String)newValue);
				return;
			case StreamPackage.DATABUS_DATA_ROUTER_NODE__VERSION:
				setVersion((String)newValue);
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
			case StreamPackage.DATABUS_DATA_ROUTER_NODE__DCAE_LOCATION_NAME:
				setDcaeLocationName(DCAE_LOCATION_NAME_EDEFAULT);
				return;
			case StreamPackage.DATABUS_DATA_ROUTER_NODE__HOST_FQDN:
				setHostFqdn(HOST_FQDN_EDEFAULT);
				return;
			case StreamPackage.DATABUS_DATA_ROUTER_NODE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case StreamPackage.DATABUS_DATA_ROUTER_NODE__DCAE_LOCATION_NAME:
				return DCAE_LOCATION_NAME_EDEFAULT == null ? dcaeLocationName != null : !DCAE_LOCATION_NAME_EDEFAULT.equals(dcaeLocationName);
			case StreamPackage.DATABUS_DATA_ROUTER_NODE__HOST_FQDN:
				return HOST_FQDN_EDEFAULT == null ? hostFqdn != null : !HOST_FQDN_EDEFAULT.equals(hostFqdn);
			case StreamPackage.DATABUS_DATA_ROUTER_NODE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (dcaeLocationName: ");
		result.append(dcaeLocationName);
		result.append(", hostFqdn: ");
		result.append(hostFqdn);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //DatabusDataRouterNodeImpl
