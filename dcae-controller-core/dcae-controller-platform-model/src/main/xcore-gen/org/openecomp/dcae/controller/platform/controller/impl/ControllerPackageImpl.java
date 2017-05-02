
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

import org.openecomp.dcae.controller.core.service.ServicePackage;
import org.openecomp.dcae.controller.core.stream.StreamPackage;
import org.openecomp.dcae.controller.inventory.InventoryPackage;
import org.openecomp.dcae.controller.platform.controller.ControllerCluster;
import org.openecomp.dcae.controller.platform.controller.ControllerClusterServer;
import org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData;
import org.openecomp.dcae.controller.platform.controller.ControllerFactory;
import org.openecomp.dcae.controller.platform.controller.ControllerPackage;
import org.openecomp.dcae.controller.platform.controller.ControllerVirtualMachineService;
import org.openecomp.dcae.controller.platform.controller.DcaeDataBus;
import org.openecomp.dcae.controller.platform.controller.DcaePlatformController;
import org.openecomp.dcae.controller.platform.controller.ServerRole;
import org.openecomp.dcae.controller.service.vm.VmPackage;
import org.openecomp.ncomp.core.CorePackage;
import org.openecomp.ncomp.openstack.OpenstackPackage;
import org.openecomp.ncomp.sirius.manager.server.ServerPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
public class ControllerPackageImpl extends EPackageImpl implements ControllerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaePlatformControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeDataBusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerClusterServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerClusterServerDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerVirtualMachineServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serverRoleEEnum = null;

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
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ControllerPackageImpl() {
		super(eNS_URI, ControllerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ControllerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ControllerPackage init() {
		if (isInited) return (ControllerPackage)EPackage.Registry.INSTANCE.getEPackage(ControllerPackage.eNS_URI);

		// Obtain or create and register package
		ControllerPackageImpl theControllerPackage = (ControllerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ControllerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ControllerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ServerPackage.eINSTANCE.eClass();
		OpenstackPackage.eINSTANCE.eClass();
		InventoryPackage.eINSTANCE.eClass();
		VmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theControllerPackage.createPackageContents();

		// Initialize created meta-data
		theControllerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theControllerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ControllerPackage.eNS_URI, theControllerPackage);
		return theControllerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaePlatformController() {
		return dcaePlatformControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaePlatformController_Cluster() {
		return (EReference)dcaePlatformControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaePlatformController_Openstack() {
		return (EReference)dcaePlatformControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaePlatformController_Locations() {
		return (EReference)dcaePlatformControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaePlatformController_Databus() {
		return (EReference)dcaePlatformControllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaePlatformController_Inventory() {
		return (EReference)dcaePlatformControllerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaePlatformController_Services() {
		return (EReference)dcaePlatformControllerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaePlatformController_Users() {
		return (EReference)dcaePlatformControllerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaePlatformController_Descriptors() {
		return (EReference)dcaePlatformControllerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaePlatformController_AdminUsers() {
		return (EReference)dcaePlatformControllerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaePlatformController__DeployDescriptor__String() {
		return dcaePlatformControllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaePlatformController__RefreshDataBus__String() {
		return dcaePlatformControllerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeDataBus() {
		return dcaeDataBusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeDataBus_Streams() {
		return (EReference)dcaeDataBusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeDataBus_Locations() {
		return (EReference)dcaeDataBusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeDataBus_MrClusters() {
		return (EReference)dcaeDataBusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeDataBus_DrNodes() {
		return (EReference)dcaeDataBusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerCluster() {
		return controllerClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerCluster_MyServerName() {
		return (EAttribute)controllerClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerCluster_Role() {
		return (EAttribute)controllerClusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerCluster_StateTime() {
		return (EAttribute)controllerClusterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerCluster_Servers() {
		return (EReference)controllerClusterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerCluster_RemoteServers() {
		return (EReference)controllerClusterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControllerCluster__PushData__String_String() {
		return controllerClusterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControllerCluster__ReceiveData__String_String_Date_String() {
		return controllerClusterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerClusterServer() {
		return controllerClusterServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerClusterServer_Role() {
		return (EAttribute)controllerClusterServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerClusterServer_Data() {
		return (EReference)controllerClusterServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerClusterServer_Server() {
		return (EReference)controllerClusterServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerClusterServerData() {
		return controllerClusterServerDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerClusterServerData_PushInterval() {
		return (EAttribute)controllerClusterServerDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerClusterServerData_LastPush() {
		return (EAttribute)controllerClusterServerDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerClusterServerData_NumberDataPushes() {
		return (EAttribute)controllerClusterServerDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerClusterServerData_NumberDataPushErrors() {
		return (EAttribute)controllerClusterServerDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerClusterServerData_LastDataReceived() {
		return (EAttribute)controllerClusterServerDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerClusterServerData_NumberDataReceived() {
		return (EAttribute)controllerClusterServerDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerClusterServerData_NumberDataReceivedErrors() {
		return (EAttribute)controllerClusterServerDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerVirtualMachineService() {
		return controllerVirtualMachineServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServerRole() {
		return serverRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerFactory getControllerFactory() {
		return (ControllerFactory)getEFactoryInstance();
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
		dcaePlatformControllerEClass = createEClass(DCAE_PLATFORM_CONTROLLER);
		createEReference(dcaePlatformControllerEClass, DCAE_PLATFORM_CONTROLLER__CLUSTER);
		createEReference(dcaePlatformControllerEClass, DCAE_PLATFORM_CONTROLLER__OPENSTACK);
		createEReference(dcaePlatformControllerEClass, DCAE_PLATFORM_CONTROLLER__LOCATIONS);
		createEReference(dcaePlatformControllerEClass, DCAE_PLATFORM_CONTROLLER__DATABUS);
		createEReference(dcaePlatformControllerEClass, DCAE_PLATFORM_CONTROLLER__INVENTORY);
		createEReference(dcaePlatformControllerEClass, DCAE_PLATFORM_CONTROLLER__DESCRIPTORS);
		createEReference(dcaePlatformControllerEClass, DCAE_PLATFORM_CONTROLLER__SERVICES);
		createEReference(dcaePlatformControllerEClass, DCAE_PLATFORM_CONTROLLER__USERS);
		createEReference(dcaePlatformControllerEClass, DCAE_PLATFORM_CONTROLLER__ADMIN_USERS);
		createEOperation(dcaePlatformControllerEClass, DCAE_PLATFORM_CONTROLLER___DEPLOY_DESCRIPTOR__STRING);
		createEOperation(dcaePlatformControllerEClass, DCAE_PLATFORM_CONTROLLER___REFRESH_DATA_BUS__STRING);

		dcaeDataBusEClass = createEClass(DCAE_DATA_BUS);
		createEReference(dcaeDataBusEClass, DCAE_DATA_BUS__STREAMS);
		createEReference(dcaeDataBusEClass, DCAE_DATA_BUS__LOCATIONS);
		createEReference(dcaeDataBusEClass, DCAE_DATA_BUS__MR_CLUSTERS);
		createEReference(dcaeDataBusEClass, DCAE_DATA_BUS__DR_NODES);

		controllerClusterEClass = createEClass(CONTROLLER_CLUSTER);
		createEAttribute(controllerClusterEClass, CONTROLLER_CLUSTER__MY_SERVER_NAME);
		createEAttribute(controllerClusterEClass, CONTROLLER_CLUSTER__ROLE);
		createEAttribute(controllerClusterEClass, CONTROLLER_CLUSTER__STATE_TIME);
		createEReference(controllerClusterEClass, CONTROLLER_CLUSTER__SERVERS);
		createEReference(controllerClusterEClass, CONTROLLER_CLUSTER__REMOTE_SERVERS);
		createEOperation(controllerClusterEClass, CONTROLLER_CLUSTER___PUSH_DATA__STRING_STRING);
		createEOperation(controllerClusterEClass, CONTROLLER_CLUSTER___RECEIVE_DATA__STRING_STRING_DATE_STRING);

		controllerClusterServerEClass = createEClass(CONTROLLER_CLUSTER_SERVER);
		createEAttribute(controllerClusterServerEClass, CONTROLLER_CLUSTER_SERVER__ROLE);
		createEReference(controllerClusterServerEClass, CONTROLLER_CLUSTER_SERVER__DATA);
		createEReference(controllerClusterServerEClass, CONTROLLER_CLUSTER_SERVER__SERVER);

		controllerClusterServerDataEClass = createEClass(CONTROLLER_CLUSTER_SERVER_DATA);
		createEAttribute(controllerClusterServerDataEClass, CONTROLLER_CLUSTER_SERVER_DATA__PUSH_INTERVAL);
		createEAttribute(controllerClusterServerDataEClass, CONTROLLER_CLUSTER_SERVER_DATA__LAST_PUSH);
		createEAttribute(controllerClusterServerDataEClass, CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_PUSHES);
		createEAttribute(controllerClusterServerDataEClass, CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_PUSH_ERRORS);
		createEAttribute(controllerClusterServerDataEClass, CONTROLLER_CLUSTER_SERVER_DATA__LAST_DATA_RECEIVED);
		createEAttribute(controllerClusterServerDataEClass, CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_RECEIVED);
		createEAttribute(controllerClusterServerDataEClass, CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_RECEIVED_ERRORS);

		controllerVirtualMachineServiceEClass = createEClass(CONTROLLER_VIRTUAL_MACHINE_SERVICE);

		// Create enums
		serverRoleEEnum = createEEnum(SERVER_ROLE);
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
		ServerPackage theServerPackage = (ServerPackage)EPackage.Registry.INSTANCE.getEPackage(ServerPackage.eNS_URI);
		OpenstackPackage theOpenstackPackage = (OpenstackPackage)EPackage.Registry.INSTANCE.getEPackage(OpenstackPackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		InventoryPackage theInventoryPackage = (InventoryPackage)EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		StreamPackage theStreamPackage = (StreamPackage)EPackage.Registry.INSTANCE.getEPackage(StreamPackage.eNS_URI);
		org.openecomp.dcae.controller.core.server.ServerPackage theServerPackage_1 = (org.openecomp.dcae.controller.core.server.ServerPackage)EPackage.Registry.INSTANCE.getEPackage(org.openecomp.dcae.controller.core.server.ServerPackage.eNS_URI);
		VmPackage theVmPackage = (VmPackage)EPackage.Registry.INSTANCE.getEPackage(VmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dcaePlatformControllerEClass.getESuperTypes().add(theServerPackage.getSouthBoundApiWithProxy());
		dcaePlatformControllerEClass.getESuperTypes().add(theServerPackage.getAbstractManagementServer());
		controllerClusterServerEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		controllerClusterServerDataEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		controllerVirtualMachineServiceEClass.getESuperTypes().add(theVmPackage.getVirtualMachineService());

		// Initialize classes, features, and operations; add parameters
		initEClass(dcaePlatformControllerEClass, DcaePlatformController.class, "DcaePlatformController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDcaePlatformController_Cluster(), this.getControllerCluster(), null, "cluster", null, 0, 1, DcaePlatformController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcaePlatformController_Openstack(), theOpenstackPackage.getOpenStackController(), null, "openstack", null, 0, 1, DcaePlatformController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcaePlatformController_Locations(), theServicePackage.getDcaeLocation(), null, "locations", null, 0, -1, DcaePlatformController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDcaePlatformController_Databus(), this.getDcaeDataBus(), null, "databus", null, 0, 1, DcaePlatformController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcaePlatformController_Inventory(), theInventoryPackage.getDcaeInventory(), null, "inventory", null, 0, 1, DcaePlatformController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcaePlatformController_Descriptors(), theServicePackage.getDcaeServiceDescriptor(), null, "descriptors", null, 0, -1, DcaePlatformController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDcaePlatformController_Services(), theServicePackage.getDcaeService(), null, "services", null, 0, -1, DcaePlatformController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDcaePlatformController_Users(), theCorePackage.getUser(), null, "users", null, 0, -1, DcaePlatformController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDcaePlatformController_AdminUsers(), theCorePackage.getUser(), null, "adminUsers", null, 0, -1, DcaePlatformController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDcaePlatformController__DeployDescriptor__String(), null, "deployDescriptor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDcaePlatformController__RefreshDataBus__String(), null, "refreshDataBus", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "nameMatch", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(dcaeDataBusEClass, DcaeDataBus.class, "DcaeDataBus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDcaeDataBus_Streams(), theStreamPackage.getDatabusStream(), null, "streams", null, 0, -1, DcaeDataBus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDcaeDataBus_Locations(), theStreamPackage.getDatabusLocation(), null, "locations", null, 0, -1, DcaeDataBus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDcaeDataBus_MrClusters(), theStreamPackage.getDatabusMessageRouterCluster(), null, "mrClusters", null, 0, -1, DcaeDataBus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDcaeDataBus_DrNodes(), theStreamPackage.getDatabusDataRouterNode(), null, "drNodes", null, 0, -1, DcaeDataBus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(controllerClusterEClass, ControllerCluster.class, "ControllerCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControllerCluster_MyServerName(), theEcorePackage.getEString(), "myServerName", null, 0, 1, ControllerCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerCluster_Role(), this.getServerRole(), "role", null, 0, 1, ControllerCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerCluster_StateTime(), theCorePackage.getDateMetricAttribute(), "stateTime", null, 0, 1, ControllerCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllerCluster_Servers(), this.getControllerClusterServer(), null, "servers", null, 0, -1, ControllerCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllerCluster_RemoteServers(), this.getControllerClusterServer(), null, "remoteServers", null, 0, -1, ControllerCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getControllerCluster__PushData__String_String(), null, "pushData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "serverName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "dataName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControllerCluster__ReceiveData__String_String_Date_String(), null, "receiveData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "serverName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "dataName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "time", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "content", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(controllerClusterServerEClass, ControllerClusterServer.class, "ControllerClusterServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControllerClusterServer_Role(), this.getServerRole(), "role", null, 0, 1, ControllerClusterServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllerClusterServer_Data(), this.getControllerClusterServerData(), null, "data", null, 0, -1, ControllerClusterServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllerClusterServer_Server(), theServerPackage_1.getDcaeBasicServer(), null, "server", null, 0, 1, ControllerClusterServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerClusterServerDataEClass, ControllerClusterServerData.class, "ControllerClusterServerData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControllerClusterServerData_PushInterval(), theEcorePackage.getEString(), "pushInterval", "5min", 0, 1, ControllerClusterServerData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerClusterServerData_LastPush(), theCorePackage.getDateMetricAttribute(), "lastPush", null, 0, 1, ControllerClusterServerData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerClusterServerData_NumberDataPushes(), theCorePackage.getIncreasingULongMetricAttribute(), "numberDataPushes", null, 0, 1, ControllerClusterServerData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerClusterServerData_NumberDataPushErrors(), theCorePackage.getIncreasingULongMetricAttribute(), "numberDataPushErrors", null, 0, 1, ControllerClusterServerData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerClusterServerData_LastDataReceived(), theCorePackage.getDateMetricAttribute(), "lastDataReceived", null, 0, 1, ControllerClusterServerData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerClusterServerData_NumberDataReceived(), theCorePackage.getIncreasingULongMetricAttribute(), "numberDataReceived", null, 0, 1, ControllerClusterServerData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerClusterServerData_NumberDataReceivedErrors(), theCorePackage.getIncreasingULongMetricAttribute(), "numberDataReceivedErrors", null, 0, 1, ControllerClusterServerData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerVirtualMachineServiceEClass, ControllerVirtualMachineService.class, "ControllerVirtualMachineService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(serverRoleEEnum, ServerRole.class, "ServerRole");
		addEEnumLiteral(serverRoleEEnum, ServerRole.UNKNOWN);
		addEEnumLiteral(serverRoleEEnum, ServerRole.STANDALONE);
		addEEnumLiteral(serverRoleEEnum, ServerRole.MASTER);
		addEEnumLiteral(serverRoleEEnum, ServerRole.SLAVE);

		// Create resource
		createResource(eNS_URI);
	}

} //ControllerPackageImpl
