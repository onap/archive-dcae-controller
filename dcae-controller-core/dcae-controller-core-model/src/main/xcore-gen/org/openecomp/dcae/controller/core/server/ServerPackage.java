
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

import org.openecomp.ncomp.core.CorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.core.server.ServerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-core-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.core'"
 * @generated
 */
public interface ServerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "server";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.dcae.controller.core.server";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "server";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServerPackage eINSTANCE = org.openecomp.dcae.controller.core.server.impl.ServerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl <em>Dcae Basic Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl
	 * @see org.openecomp.dcae.controller.core.server.impl.ServerPackageImpl#getDcaeBasicServer()
	 * @generated
	 */
	int DCAE_BASIC_SERVER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Operational State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__OPERATIONAL_STATE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Log Message Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__LOG_MESSAGE_CONFIGURATION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Log Message Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__LOG_MESSAGE_CATEGORIES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Log Message Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__LOG_MESSAGE_STATS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Private Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__PRIVATE_IP = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Public Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__PUBLIC_IP = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Collectd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__COLLECTD = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__MODULES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__NETWORKS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Last Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__LAST_UPDATE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Using Monitoring Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__USING_MONITORING_AGENT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__SERVER = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Hypervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__HYPERVISOR = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Vm Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__VM_TYPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Certificate Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER__CERTIFICATE_PASSWORD = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Dcae Basic Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Dcae Basic Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerNetworkImpl <em>Dcae Basic Server Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerNetworkImpl
	 * @see org.openecomp.dcae.controller.core.server.impl.ServerPackageImpl#getDcaeBasicServerNetwork()
	 * @generated
	 */
	int DCAE_BASIC_SERVER_NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER_NETWORK__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER_NETWORK__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER_NETWORK__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER_NETWORK__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER_NETWORK__IP = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dns Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER_NETWORK__DNS_NAME = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dcae Basic Server Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER_NETWORK_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dcae Basic Server Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_BASIC_SERVER_NETWORK_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer <em>Dcae Basic Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Basic Server</em>'.
	 * @see org.openecomp.dcae.controller.core.server.DcaeBasicServer
	 * @generated
	 */
	EClass getDcaeBasicServer();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getPrivateIp <em>Private Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Ip</em>'.
	 * @see org.openecomp.dcae.controller.core.server.DcaeBasicServer#getPrivateIp()
	 * @see #getDcaeBasicServer()
	 * @generated
	 */
	EAttribute getDcaeBasicServer_PrivateIp();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getPublicIp <em>Public Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Ip</em>'.
	 * @see org.openecomp.dcae.controller.core.server.DcaeBasicServer#getPublicIp()
	 * @see #getDcaeBasicServer()
	 * @generated
	 */
	EAttribute getDcaeBasicServer_PublicIp();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getCollectd <em>Collectd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collectd</em>'.
	 * @see org.openecomp.dcae.controller.core.server.DcaeBasicServer#getCollectd()
	 * @see #getDcaeBasicServer()
	 * @generated
	 */
	EReference getDcaeBasicServer_Collectd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see org.openecomp.dcae.controller.core.server.DcaeBasicServer#getModules()
	 * @see #getDcaeBasicServer()
	 * @generated
	 */
	EReference getDcaeBasicServer_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networks</em>'.
	 * @see org.openecomp.dcae.controller.core.server.DcaeBasicServer#getNetworks()
	 * @see #getDcaeBasicServer()
	 * @generated
	 */
	EReference getDcaeBasicServer_Networks();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getLastUpdate <em>Last Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Update</em>'.
	 * @see org.openecomp.dcae.controller.core.server.DcaeBasicServer#getLastUpdate()
	 * @see #getDcaeBasicServer()
	 * @generated
	 */
	EAttribute getDcaeBasicServer_LastUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#isUsingMonitoringAgent <em>Using Monitoring Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Using Monitoring Agent</em>'.
	 * @see org.openecomp.dcae.controller.core.server.DcaeBasicServer#isUsingMonitoringAgent()
	 * @see #getDcaeBasicServer()
	 * @generated
	 */
	EAttribute getDcaeBasicServer_UsingMonitoringAgent();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see org.openecomp.dcae.controller.core.server.DcaeBasicServer#getServer()
	 * @see #getDcaeBasicServer()
	 * @generated
	 */
	EReference getDcaeBasicServer_Server();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getHypervisor <em>Hypervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hypervisor</em>'.
	 * @see org.openecomp.dcae.controller.core.server.DcaeBasicServer#getHypervisor()
	 * @see #getDcaeBasicServer()
	 * @generated
	 */
	EReference getDcaeBasicServer_Hypervisor();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getVmType <em>Vm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vm Type</em>'.
	 * @see org.openecomp.dcae.controller.core.server.DcaeBasicServer#getVmType()
	 * @see #getDcaeBasicServer()
	 * @generated
	 */
	EReference getDcaeBasicServer_VmType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer#getCertificatePassword <em>Certificate Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate Password</em>'.
	 * @see org.openecomp.dcae.controller.core.server.DcaeBasicServer#getCertificatePassword()
	 * @see #getDcaeBasicServer()
	 * @generated
	 */
	EAttribute getDcaeBasicServer_CertificatePassword();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServerNetwork <em>Dcae Basic Server Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Basic Server Network</em>'.
	 * @see org.openecomp.dcae.controller.core.server.DcaeBasicServerNetwork
	 * @generated
	 */
	EClass getDcaeBasicServerNetwork();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServerNetwork#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see org.openecomp.dcae.controller.core.server.DcaeBasicServerNetwork#getIp()
	 * @see #getDcaeBasicServerNetwork()
	 * @generated
	 */
	EAttribute getDcaeBasicServerNetwork_Ip();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServerNetwork#getDnsName <em>Dns Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dns Name</em>'.
	 * @see org.openecomp.dcae.controller.core.server.DcaeBasicServerNetwork#getDnsName()
	 * @see #getDcaeBasicServerNetwork()
	 * @generated
	 */
	EAttribute getDcaeBasicServerNetwork_DnsName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServerFactory getServerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl <em>Dcae Basic Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl
		 * @see org.openecomp.dcae.controller.core.server.impl.ServerPackageImpl#getDcaeBasicServer()
		 * @generated
		 */
		EClass DCAE_BASIC_SERVER = eINSTANCE.getDcaeBasicServer();
		/**
		 * The meta object literal for the '<em><b>Private Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_BASIC_SERVER__PRIVATE_IP = eINSTANCE.getDcaeBasicServer_PrivateIp();
		/**
		 * The meta object literal for the '<em><b>Public Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_BASIC_SERVER__PUBLIC_IP = eINSTANCE.getDcaeBasicServer_PublicIp();
		/**
		 * The meta object literal for the '<em><b>Collectd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_BASIC_SERVER__COLLECTD = eINSTANCE.getDcaeBasicServer_Collectd();
		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_BASIC_SERVER__MODULES = eINSTANCE.getDcaeBasicServer_Modules();
		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_BASIC_SERVER__NETWORKS = eINSTANCE.getDcaeBasicServer_Networks();
		/**
		 * The meta object literal for the '<em><b>Last Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_BASIC_SERVER__LAST_UPDATE = eINSTANCE.getDcaeBasicServer_LastUpdate();
		/**
		 * The meta object literal for the '<em><b>Using Monitoring Agent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_BASIC_SERVER__USING_MONITORING_AGENT = eINSTANCE.getDcaeBasicServer_UsingMonitoringAgent();
		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_BASIC_SERVER__SERVER = eINSTANCE.getDcaeBasicServer_Server();
		/**
		 * The meta object literal for the '<em><b>Hypervisor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_BASIC_SERVER__HYPERVISOR = eINSTANCE.getDcaeBasicServer_Hypervisor();
		/**
		 * The meta object literal for the '<em><b>Vm Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_BASIC_SERVER__VM_TYPE = eINSTANCE.getDcaeBasicServer_VmType();
		/**
		 * The meta object literal for the '<em><b>Certificate Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_BASIC_SERVER__CERTIFICATE_PASSWORD = eINSTANCE.getDcaeBasicServer_CertificatePassword();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerNetworkImpl <em>Dcae Basic Server Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerNetworkImpl
		 * @see org.openecomp.dcae.controller.core.server.impl.ServerPackageImpl#getDcaeBasicServerNetwork()
		 * @generated
		 */
		EClass DCAE_BASIC_SERVER_NETWORK = eINSTANCE.getDcaeBasicServerNetwork();
		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_BASIC_SERVER_NETWORK__IP = eINSTANCE.getDcaeBasicServerNetwork_Ip();
		/**
		 * The meta object literal for the '<em><b>Dns Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_BASIC_SERVER_NETWORK__DNS_NAME = eINSTANCE.getDcaeBasicServerNetwork_DnsName();

	}

} //ServerPackage
