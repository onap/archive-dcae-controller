
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

import org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster;
import org.openecomp.dcae.controller.core.stream.StreamPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Databus Message Router Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusMessageRouterClusterImpl#getDcaeLocationName <em>Dcae Location Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusMessageRouterClusterImpl#getServiceFqdn <em>Service Fqdn</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusMessageRouterClusterImpl#getHostFqdn <em>Host Fqdn</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusMessageRouterClusterImpl#getTopicPort <em>Topic Port</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.impl.DatabusMessageRouterClusterImpl#getTopicProtocol <em>Topic Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabusMessageRouterClusterImpl extends DatabusEntityImpl implements DatabusMessageRouterCluster {
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
	 * The default value of the '{@link #getServiceFqdn() <em>Service Fqdn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceFqdn()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_FQDN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getServiceFqdn() <em>Service Fqdn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceFqdn()
	 * @generated
	 * @ordered
	 */
	protected String serviceFqdn = SERVICE_FQDN_EDEFAULT;
	/**
	 * The cached value of the '{@link #getHostFqdn() <em>Host Fqdn</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostFqdn()
	 * @generated
	 * @ordered
	 */
	protected EList<String> hostFqdn;

	/**
	 * The default value of the '{@link #getTopicPort() <em>Topic Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicPort()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_PORT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTopicPort() <em>Topic Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicPort()
	 * @generated
	 * @ordered
	 */
	protected String topicPort = TOPIC_PORT_EDEFAULT;
	/**
	 * The default value of the '{@link #getTopicProtocol() <em>Topic Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_PROTOCOL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTopicProtocol() <em>Topic Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicProtocol()
	 * @generated
	 * @ordered
	 */
	protected String topicProtocol = TOPIC_PROTOCOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabusMessageRouterClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamPackage.Literals.DATABUS_MESSAGE_ROUTER_CLUSTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__DCAE_LOCATION_NAME, oldDcaeLocationName, dcaeLocationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceFqdn() {
		return serviceFqdn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceFqdn(String newServiceFqdn) {
		String oldServiceFqdn = serviceFqdn;
		serviceFqdn = newServiceFqdn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__SERVICE_FQDN, oldServiceFqdn, serviceFqdn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getHostFqdn() {
		if (hostFqdn == null) {
			hostFqdn = new EDataTypeEList<String>(String.class, this, StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__HOST_FQDN);
		}
		return hostFqdn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopicPort() {
		return topicPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicPort(String newTopicPort) {
		String oldTopicPort = topicPort;
		topicPort = newTopicPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__TOPIC_PORT, oldTopicPort, topicPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopicProtocol() {
		return topicProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicProtocol(String newTopicProtocol) {
		String oldTopicProtocol = topicProtocol;
		topicProtocol = newTopicProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__TOPIC_PROTOCOL, oldTopicProtocol, topicProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__DCAE_LOCATION_NAME:
				return getDcaeLocationName();
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__SERVICE_FQDN:
				return getServiceFqdn();
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__HOST_FQDN:
				return getHostFqdn();
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__TOPIC_PORT:
				return getTopicPort();
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__TOPIC_PROTOCOL:
				return getTopicProtocol();
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
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__DCAE_LOCATION_NAME:
				setDcaeLocationName((String)newValue);
				return;
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__SERVICE_FQDN:
				setServiceFqdn((String)newValue);
				return;
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__HOST_FQDN:
				getHostFqdn().clear();
				getHostFqdn().addAll((Collection<? extends String>)newValue);
				return;
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__TOPIC_PORT:
				setTopicPort((String)newValue);
				return;
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__TOPIC_PROTOCOL:
				setTopicProtocol((String)newValue);
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
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__DCAE_LOCATION_NAME:
				setDcaeLocationName(DCAE_LOCATION_NAME_EDEFAULT);
				return;
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__SERVICE_FQDN:
				setServiceFqdn(SERVICE_FQDN_EDEFAULT);
				return;
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__HOST_FQDN:
				getHostFqdn().clear();
				return;
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__TOPIC_PORT:
				setTopicPort(TOPIC_PORT_EDEFAULT);
				return;
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__TOPIC_PROTOCOL:
				setTopicProtocol(TOPIC_PROTOCOL_EDEFAULT);
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
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__DCAE_LOCATION_NAME:
				return DCAE_LOCATION_NAME_EDEFAULT == null ? dcaeLocationName != null : !DCAE_LOCATION_NAME_EDEFAULT.equals(dcaeLocationName);
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__SERVICE_FQDN:
				return SERVICE_FQDN_EDEFAULT == null ? serviceFqdn != null : !SERVICE_FQDN_EDEFAULT.equals(serviceFqdn);
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__HOST_FQDN:
				return hostFqdn != null && !hostFqdn.isEmpty();
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__TOPIC_PORT:
				return TOPIC_PORT_EDEFAULT == null ? topicPort != null : !TOPIC_PORT_EDEFAULT.equals(topicPort);
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER__TOPIC_PROTOCOL:
				return TOPIC_PROTOCOL_EDEFAULT == null ? topicProtocol != null : !TOPIC_PROTOCOL_EDEFAULT.equals(topicProtocol);
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
		result.append(", serviceFqdn: ");
		result.append(serviceFqdn);
		result.append(", hostFqdn: ");
		result.append(hostFqdn);
		result.append(", topicPort: ");
		result.append(topicPort);
		result.append(", topicProtocol: ");
		result.append(topicProtocol);
		result.append(')');
		return result.toString();
	}

} //DatabusMessageRouterClusterImpl
