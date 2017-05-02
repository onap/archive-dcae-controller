
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

import org.openecomp.dcae.controller.core.server.DcaeBasicServer;
import org.openecomp.dcae.controller.core.server.DcaeBasicServerNetwork;
import org.openecomp.dcae.controller.core.server.ServerFactory;
import org.openecomp.dcae.controller.core.server.ServerPackage;
import org.openecomp.dcae.controller.core.service.ServicePackage;
import org.openecomp.ncomp.core.CorePackage;
import org.openecomp.ncomp.core.logs.LogsPackage;
import org.openecomp.ncomp.openstack.compute.ComputePackage;
import org.openecomp.ncomp.openstack.location.LocationPackage;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage;
import org.openecomp.ncomp.sirius.manager.properties.PropertiesPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerPackageImpl extends EPackageImpl implements ServerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeBasicServerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeBasicServerNetworkEClass = null;
	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openecomp.dcae.controller.core.server.ServerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServerPackageImpl() {
		super(eNS_URI, ServerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ServerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServerPackage init() {
		if (isInited) return (ServerPackage)EPackage.Registry.INSTANCE.getEPackage(ServerPackage.eNS_URI);

		// Obtain or create and register package
		ServerPackageImpl theServerPackage = (ServerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CollectdPackage.eINSTANCE.eClass();
		PropertiesPackage.eINSTANCE.eClass();
		ServicePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theServerPackage.createPackageContents();

		// Initialize created meta-data
		theServerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServerPackage.eNS_URI, theServerPackage);
		return theServerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeBasicServer() {
		return dcaeBasicServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeBasicServer_PrivateIp() {
		return (EAttribute)dcaeBasicServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeBasicServer_PublicIp() {
		return (EAttribute)dcaeBasicServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeBasicServer_Collectd() {
		return (EReference)dcaeBasicServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeBasicServer_Modules() {
		return (EReference)dcaeBasicServerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeBasicServer_Networks() {
		return (EReference)dcaeBasicServerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeBasicServer_LastUpdate() {
		return (EAttribute)dcaeBasicServerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeBasicServer_UsingMonitoringAgent() {
		return (EAttribute)dcaeBasicServerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeBasicServer_Server() {
		return (EReference)dcaeBasicServerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeBasicServer_Hypervisor() {
		return (EReference)dcaeBasicServerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeBasicServer_VmType() {
		return (EReference)dcaeBasicServerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeBasicServer_CertificatePassword() {
		return (EAttribute)dcaeBasicServerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeBasicServer_LastHealthTest() {
		return (EAttribute)dcaeBasicServerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeBasicServer_HealthTestStatus() {
		return (EAttribute)dcaeBasicServerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeBasicServer_HealthTestMessageCode() {
		return (EAttribute)dcaeBasicServerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeBasicServerNetwork() {
		return dcaeBasicServerNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeBasicServerNetwork_Ip() {
		return (EAttribute)dcaeBasicServerNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeBasicServerNetwork_DnsName() {
		return (EAttribute)dcaeBasicServerNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerFactory getServerFactory() {
		return (ServerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dcaeBasicServerEClass = createEClass(DCAE_BASIC_SERVER);
		createEAttribute(dcaeBasicServerEClass, DCAE_BASIC_SERVER__PRIVATE_IP);
		createEAttribute(dcaeBasicServerEClass, DCAE_BASIC_SERVER__PUBLIC_IP);
		createEReference(dcaeBasicServerEClass, DCAE_BASIC_SERVER__COLLECTD);
		createEReference(dcaeBasicServerEClass, DCAE_BASIC_SERVER__MODULES);
		createEReference(dcaeBasicServerEClass, DCAE_BASIC_SERVER__NETWORKS);
		createEAttribute(dcaeBasicServerEClass, DCAE_BASIC_SERVER__LAST_UPDATE);
		createEAttribute(dcaeBasicServerEClass, DCAE_BASIC_SERVER__USING_MONITORING_AGENT);
		createEReference(dcaeBasicServerEClass, DCAE_BASIC_SERVER__SERVER);
		createEReference(dcaeBasicServerEClass, DCAE_BASIC_SERVER__HYPERVISOR);
		createEReference(dcaeBasicServerEClass, DCAE_BASIC_SERVER__VM_TYPE);
		createEAttribute(dcaeBasicServerEClass, DCAE_BASIC_SERVER__CERTIFICATE_PASSWORD);
		createEAttribute(dcaeBasicServerEClass, DCAE_BASIC_SERVER__LAST_HEALTH_TEST);
		createEAttribute(dcaeBasicServerEClass, DCAE_BASIC_SERVER__HEALTH_TEST_STATUS);
		createEAttribute(dcaeBasicServerEClass, DCAE_BASIC_SERVER__HEALTH_TEST_MESSAGE_CODE);

		dcaeBasicServerNetworkEClass = createEClass(DCAE_BASIC_SERVER_NETWORK);
		createEAttribute(dcaeBasicServerNetworkEClass, DCAE_BASIC_SERVER_NETWORK__IP);
		createEAttribute(dcaeBasicServerNetworkEClass, DCAE_BASIC_SERVER_NETWORK__DNS_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		LogsPackage theLogsPackage = (LogsPackage)EPackage.Registry.INSTANCE.getEPackage(LogsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CollectdPackage theCollectdPackage = (CollectdPackage)EPackage.Registry.INSTANCE.getEPackage(CollectdPackage.eNS_URI);
		PropertiesPackage thePropertiesPackage = (PropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI);
		ComputePackage theComputePackage = (ComputePackage)EPackage.Registry.INSTANCE.getEPackage(ComputePackage.eNS_URI);
		LocationPackage theLocationPackage = (LocationPackage)EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI);
		org.openecomp.ncomp.openstack.core.CorePackage theCorePackage_1 = (org.openecomp.ncomp.openstack.core.CorePackage)EPackage.Registry.INSTANCE.getEPackage(org.openecomp.ncomp.openstack.core.CorePackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dcaeBasicServerEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		dcaeBasicServerEClass.getESuperTypes().add(theCorePackage.getHasOperationalState());
		dcaeBasicServerEClass.getESuperTypes().add(theLogsPackage.getLogMessageContainer());
		dcaeBasicServerNetworkEClass.getESuperTypes().add(theCorePackage.getNamedEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(dcaeBasicServerEClass, DcaeBasicServer.class, "DcaeBasicServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDcaeBasicServer_PrivateIp(), theEcorePackage.getEString(), "privateIp", null, 0, 1, DcaeBasicServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeBasicServer_PublicIp(), theEcorePackage.getEString(), "publicIp", null, 0, 1, DcaeBasicServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcaeBasicServer_Collectd(), theCollectdPackage.getCollectdServer(), null, "collectd", null, 0, 1, DcaeBasicServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcaeBasicServer_Modules(), thePropertiesPackage.getModule(), null, "modules", null, 0, -1, DcaeBasicServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDcaeBasicServer_Networks(), this.getDcaeBasicServerNetwork(), null, "networks", null, 0, -1, DcaeBasicServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDcaeBasicServer_LastUpdate(), theCorePackage.getDateMetricAttribute(), "lastUpdate", null, 0, 1, DcaeBasicServer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeBasicServer_UsingMonitoringAgent(), theEcorePackage.getEBoolean(), "usingMonitoringAgent", "true", 0, 1, DcaeBasicServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcaeBasicServer_Server(), theComputePackage.getServer(), null, "server", null, 0, 1, DcaeBasicServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcaeBasicServer_Hypervisor(), theLocationPackage.getHypervisor(), null, "hypervisor", null, 0, 1, DcaeBasicServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcaeBasicServer_VmType(), theCorePackage_1.getVirtualMachineType(), null, "vmType", null, 0, 1, DcaeBasicServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeBasicServer_CertificatePassword(), theEcorePackage.getEString(), "certificatePassword", null, 0, 1, DcaeBasicServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeBasicServer_LastHealthTest(), theCorePackage.getDateMetricAttribute(), "lastHealthTest", null, 0, 1, DcaeBasicServer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeBasicServer_HealthTestStatus(), theServicePackage.getHealthTestStatus(), "healthTestStatus", null, 0, 1, DcaeBasicServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeBasicServer_HealthTestMessageCode(), theEcorePackage.getEString(), "healthTestMessageCode", null, 0, 1, DcaeBasicServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcaeBasicServerNetworkEClass, DcaeBasicServerNetwork.class, "DcaeBasicServerNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDcaeBasicServerNetwork_Ip(), theEcorePackage.getEString(), "ip", null, 0, 1, DcaeBasicServerNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeBasicServerNetwork_DnsName(), theEcorePackage.getEString(), "dnsName", null, 0, 1, DcaeBasicServerNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ServerPackageImpl
