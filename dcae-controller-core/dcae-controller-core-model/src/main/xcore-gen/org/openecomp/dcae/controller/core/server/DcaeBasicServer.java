
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
package org.openecomp.dcae.controller.core.server;

import org.openecomp.ncomp.core.HasOperationalState;
import org.openecomp.ncomp.core.NamedEntity;
import org.openecomp.ncomp.core.logs.LogMessageContainer;
import org.openecomp.ncomp.core.types.metrics.DateMetricAttribute;
import org.openecomp.ncomp.openstack.compute.Server;
import org.openecomp.ncomp.openstack.core.VirtualMachineType;
import org.openecomp.ncomp.openstack.location.Hypervisor;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer;
import org.openecomp.ncomp.sirius.manager.properties.Module;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dcae Basic Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getPrivateIp <em>Private Ip</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getPublicIp <em>Public Ip</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getCollectd <em>Collectd</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getModules <em>Modules</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getNetworks <em>Networks</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#isUsingMonitoringAgent <em>Using Monitoring Agent</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getServer <em>Server</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getHypervisor <em>Hypervisor</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getVmType <em>Vm Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getCertificatePassword <em>Certificate Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.core.server.ServerPackage#getDcaeBasicServer()
 * @model
 * @generated
 */
public interface DcaeBasicServer extends NamedEntity, HasOperationalState, LogMessageContainer {
	/**
	 * Returns the value of the '<em><b>Private Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Ip</em>' attribute.
	 * @see #setPrivateIp(String)
	 * @see org.openecomp.dcae.controller.core.server.ServerPackage#getDcaeBasicServer_PrivateIp()
	 * @model unique="false"
	 * @generated
	 */
	String getPrivateIp();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getPrivateIp <em>Private Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Ip</em>' attribute.
	 * @see #getPrivateIp()
	 * @generated
	 */
	void setPrivateIp(String value);

	/**
	 * Returns the value of the '<em><b>Public Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Ip</em>' attribute.
	 * @see #setPublicIp(String)
	 * @see org.openecomp.dcae.controller.core.server.ServerPackage#getDcaeBasicServer_PublicIp()
	 * @model unique="false"
	 * @generated
	 */
	String getPublicIp();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getPublicIp <em>Public Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Ip</em>' attribute.
	 * @see #getPublicIp()
	 * @generated
	 */
	void setPublicIp(String value);

	/**
	 * Returns the value of the '<em><b>Collectd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collectd</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collectd</em>' containment reference.
	 * @see #setCollectd(CollectdServer)
	 * @see org.openecomp.dcae.controller.core.server.ServerPackage#getDcaeBasicServer_Collectd()
	 * @model containment="true"
	 * @generated
	 */
	CollectdServer getCollectd();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getCollectd <em>Collectd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collectd</em>' containment reference.
	 * @see #getCollectd()
	 * @generated
	 */
	void setCollectd(CollectdServer value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.properties.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.core.server.ServerPackage#getDcaeBasicServer_Modules()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Module> getModules();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.server.DcaeBasicServerNetwork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.core.server.ServerPackage#getDcaeBasicServer_Networks()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DcaeBasicServerNetwork> getNetworks();

	/**
	 * Returns the value of the '<em><b>Last Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Update</em>' attribute.
	 * @see #setLastUpdate(DateMetricAttribute)
	 * @see org.openecomp.dcae.controller.core.server.ServerPackage#getDcaeBasicServer_LastUpdate()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DateMetricAttribute" transient="true"
	 * @generated
	 */
	DateMetricAttribute getLastUpdate();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getLastUpdate <em>Last Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Update</em>' attribute.
	 * @see #getLastUpdate()
	 * @generated
	 */
	void setLastUpdate(DateMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Using Monitoring Agent</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using Monitoring Agent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using Monitoring Agent</em>' attribute.
	 * @see #setUsingMonitoringAgent(boolean)
	 * @see org.openecomp.dcae.controller.core.server.ServerPackage#getDcaeBasicServer_UsingMonitoringAgent()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isUsingMonitoringAgent();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#isUsingMonitoringAgent <em>Using Monitoring Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Using Monitoring Agent</em>' attribute.
	 * @see #isUsingMonitoringAgent()
	 * @generated
	 */
	void setUsingMonitoringAgent(boolean value);

	/**
	 * Returns the value of the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference.
	 * @see #setServer(Server)
	 * @see org.openecomp.dcae.controller.core.server.ServerPackage#getDcaeBasicServer_Server()
	 * @model
	 * @generated
	 */
	Server getServer();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getServer <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(Server value);

	/**
	 * Returns the value of the '<em><b>Hypervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hypervisor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypervisor</em>' reference.
	 * @see #setHypervisor(Hypervisor)
	 * @see org.openecomp.dcae.controller.core.server.ServerPackage#getDcaeBasicServer_Hypervisor()
	 * @model
	 * @generated
	 */
	Hypervisor getHypervisor();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getHypervisor <em>Hypervisor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hypervisor</em>' reference.
	 * @see #getHypervisor()
	 * @generated
	 */
	void setHypervisor(Hypervisor value);

	/**
	 * Returns the value of the '<em><b>Vm Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Type</em>' reference.
	 * @see #setVmType(VirtualMachineType)
	 * @see org.openecomp.dcae.controller.core.server.ServerPackage#getDcaeBasicServer_VmType()
	 * @model
	 * @generated
	 */
	VirtualMachineType getVmType();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getVmType <em>Vm Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Type</em>' reference.
	 * @see #getVmType()
	 * @generated
	 */
	void setVmType(VirtualMachineType value);

	/**
	 * Returns the value of the '<em><b>Certificate Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate Password</em>' attribute.
	 * @see #setCertificatePassword(String)
	 * @see org.openecomp.dcae.controller.core.server.ServerPackage#getDcaeBasicServer_CertificatePassword()
	 * @model unique="false"
	 * @generated
	 */
	String getCertificatePassword();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getCertificatePassword <em>Certificate Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Password</em>' attribute.
	 * @see #getCertificatePassword()
	 * @generated
	 */
	void setCertificatePassword(String value);

} // DcaeBasicServer
