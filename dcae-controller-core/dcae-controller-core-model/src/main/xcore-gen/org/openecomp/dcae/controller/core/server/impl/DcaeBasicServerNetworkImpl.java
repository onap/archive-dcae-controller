
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
package org.openecomp.dcae.controller.core.server.impl;

import org.openecomp.dcae.controller.core.server.DcaeBasicServerNetwork;
import org.openecomp.dcae.controller.core.server.ServerPackage;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dcae Basic Server Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerNetworkImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerNetworkImpl#getDnsName <em>Dns Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DcaeBasicServerNetworkImpl extends NamedEntityImpl implements DcaeBasicServerNetwork {
	/**
	 * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDnsName() <em>Dns Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsName()
	 * @generated
	 * @ordered
	 */
	protected static final String DNS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDnsName() <em>Dns Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsName()
	 * @generated
	 * @ordered
	 */
	protected String dnsName = DNS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcaeBasicServerNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServerPackage.Literals.DCAE_BASIC_SERVER_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp(String newIp) {
		String oldIp = ip;
		ip = newIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.DCAE_BASIC_SERVER_NETWORK__IP, oldIp, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDnsName() {
		return dnsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDnsName(String newDnsName) {
		String oldDnsName = dnsName;
		dnsName = newDnsName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.DCAE_BASIC_SERVER_NETWORK__DNS_NAME, oldDnsName, dnsName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServerPackage.DCAE_BASIC_SERVER_NETWORK__IP:
				return getIp();
			case ServerPackage.DCAE_BASIC_SERVER_NETWORK__DNS_NAME:
				return getDnsName();
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
			case ServerPackage.DCAE_BASIC_SERVER_NETWORK__IP:
				setIp((String)newValue);
				return;
			case ServerPackage.DCAE_BASIC_SERVER_NETWORK__DNS_NAME:
				setDnsName((String)newValue);
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
			case ServerPackage.DCAE_BASIC_SERVER_NETWORK__IP:
				setIp(IP_EDEFAULT);
				return;
			case ServerPackage.DCAE_BASIC_SERVER_NETWORK__DNS_NAME:
				setDnsName(DNS_NAME_EDEFAULT);
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
			case ServerPackage.DCAE_BASIC_SERVER_NETWORK__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case ServerPackage.DCAE_BASIC_SERVER_NETWORK__DNS_NAME:
				return DNS_NAME_EDEFAULT == null ? dnsName != null : !DNS_NAME_EDEFAULT.equals(dnsName);
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
		result.append(" (ip: ");
		result.append(ip);
		result.append(", dnsName: ");
		result.append(dnsName);
		result.append(')');
		return result.toString();
	}

} //DcaeBasicServerNetworkImpl
