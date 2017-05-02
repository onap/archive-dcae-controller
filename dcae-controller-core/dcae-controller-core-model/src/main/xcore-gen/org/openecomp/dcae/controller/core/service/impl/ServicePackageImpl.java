
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
package org.openecomp.dcae.controller.core.service.impl;

import org.openecomp.dcae.controller.core.service.DcaeLocation;
import org.openecomp.dcae.controller.core.service.DcaePolicyEntity;
import org.openecomp.dcae.controller.core.service.DcaeService;
import org.openecomp.dcae.controller.core.service.DcaeServiceContainer;
import org.openecomp.dcae.controller.core.service.DcaeServiceDescriptor;
import org.openecomp.dcae.controller.core.service.DcaeServiceInstance;
import org.openecomp.dcae.controller.core.service.HealthTestResponse;
import org.openecomp.dcae.controller.core.service.HealthTestStatus;
import org.openecomp.dcae.controller.core.service.ServiceFactory;
import org.openecomp.dcae.controller.core.service.ServicePackage;
import org.openecomp.dcae.controller.core.stream.StreamPackage;
import org.openecomp.ncomp.core.CorePackage;
import org.openecomp.ncomp.openstack.location.LocationPackage;
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
public class ServicePackageImpl extends EPackageImpl implements ServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeServiceContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeServiceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeServiceDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthTestResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaePolicyEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum healthTestStatusEEnum = null;

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
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServicePackageImpl() {
		super(eNS_URI, ServiceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServicePackage init() {
		if (isInited) return (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);

		// Obtain or create and register package
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServicePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServicePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StreamPackage.eINSTANCE.eClass();
		LocationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theServicePackage.createPackageContents();

		// Initialize created meta-data
		theServicePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServicePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServicePackage.eNS_URI, theServicePackage);
		return theServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeService() {
		return dcaeServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeService__Deploy__String_String() {
		return dcaeServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeService__Undeploy__String() {
		return dcaeServiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeService__Test__String() {
		return dcaeServiceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeService__Suspend__String() {
		return dcaeServiceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeService__Resume__String() {
		return dcaeServiceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeService__PushManagerConfiguration__String() {
		return dcaeServiceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeService__PollManagerConfiguration__String() {
		return dcaeServiceEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeService__ManagerConfiguration__String() {
		return dcaeServiceEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeService__ManagerOperation__String_String_JSONObject() {
		return dcaeServiceEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeService__UpdateConfigurationFromPolicy__String() {
		return dcaeServiceEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeService__RunHealthTests() {
		return dcaeServiceEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeServiceContainer() {
		return dcaeServiceContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeServiceContainer_Instances() {
		return (EReference)dcaeServiceContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeServiceInstance() {
		return dcaeServiceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeServiceInstance_ServiceContainer() {
		return (EReference)dcaeServiceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeServiceInstance_Status() {
		return (EAttribute)dcaeServiceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeServiceInstance_InputStreams() {
		return (EReference)dcaeServiceInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeServiceInstance_OutputStreams() {
		return (EReference)dcaeServiceInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeServiceInstance_LastHealthTest() {
		return (EAttribute)dcaeServiceInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeServiceInstance_HealthTestStatus() {
		return (EAttribute)dcaeServiceInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeServiceInstance_HealthTestMessageCode() {
		return (EAttribute)dcaeServiceInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeLocation() {
		return dcaeLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeLocation_LocationType() {
		return (EAttribute)dcaeLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeLocation_OpenstackProject() {
		return (EReference)dcaeLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeServiceDescriptor() {
		return dcaeServiceDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeServiceDescriptor_GroupId() {
		return (EAttribute)dcaeServiceDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeServiceDescriptor_Artifact() {
		return (EAttribute)dcaeServiceDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeServiceDescriptor_Version() {
		return (EAttribute)dcaeServiceDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthTestResponse() {
		return healthTestResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthTestResponse_Status() {
		return (EAttribute)healthTestResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthTestResponse_MessageCode() {
		return (EAttribute)healthTestResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaePolicyEntity() {
		return dcaePolicyEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaePolicyEntity_PolicyName() {
		return (EAttribute)dcaePolicyEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaePolicyEntity_PolicyDescription() {
		return (EAttribute)dcaePolicyEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaePolicyEntity_PolicyConfigName() {
		return (EAttribute)dcaePolicyEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaePolicyEntity_PolicyTemplateVersion() {
		return (EAttribute)dcaePolicyEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaePolicyEntity_PolicyVersion() {
		return (EAttribute)dcaePolicyEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaePolicyEntity_PolicyPriority() {
		return (EAttribute)dcaePolicyEntityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaePolicyEntity_PolicyScope() {
		return (EAttribute)dcaePolicyEntityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHealthTestStatus() {
		return healthTestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFactory getServiceFactory() {
		return (ServiceFactory)getEFactoryInstance();
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
		dcaeServiceContainerEClass = createEClass(DCAE_SERVICE_CONTAINER);
		createEReference(dcaeServiceContainerEClass, DCAE_SERVICE_CONTAINER__INSTANCES);

		dcaeServiceEClass = createEClass(DCAE_SERVICE);
		createEOperation(dcaeServiceEClass, DCAE_SERVICE___DEPLOY__STRING_STRING);
		createEOperation(dcaeServiceEClass, DCAE_SERVICE___UNDEPLOY__STRING);
		createEOperation(dcaeServiceEClass, DCAE_SERVICE___TEST__STRING);
		createEOperation(dcaeServiceEClass, DCAE_SERVICE___SUSPEND__STRING);
		createEOperation(dcaeServiceEClass, DCAE_SERVICE___RESUME__STRING);
		createEOperation(dcaeServiceEClass, DCAE_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING);
		createEOperation(dcaeServiceEClass, DCAE_SERVICE___POLL_MANAGER_CONFIGURATION__STRING);
		createEOperation(dcaeServiceEClass, DCAE_SERVICE___MANAGER_CONFIGURATION__STRING);
		createEOperation(dcaeServiceEClass, DCAE_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT);
		createEOperation(dcaeServiceEClass, DCAE_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING);
		createEOperation(dcaeServiceEClass, DCAE_SERVICE___RUN_HEALTH_TESTS);

		dcaeServiceInstanceEClass = createEClass(DCAE_SERVICE_INSTANCE);
		createEReference(dcaeServiceInstanceEClass, DCAE_SERVICE_INSTANCE__SERVICE_CONTAINER);
		createEAttribute(dcaeServiceInstanceEClass, DCAE_SERVICE_INSTANCE__STATUS);
		createEReference(dcaeServiceInstanceEClass, DCAE_SERVICE_INSTANCE__INPUT_STREAMS);
		createEReference(dcaeServiceInstanceEClass, DCAE_SERVICE_INSTANCE__OUTPUT_STREAMS);
		createEAttribute(dcaeServiceInstanceEClass, DCAE_SERVICE_INSTANCE__LAST_HEALTH_TEST);
		createEAttribute(dcaeServiceInstanceEClass, DCAE_SERVICE_INSTANCE__HEALTH_TEST_STATUS);
		createEAttribute(dcaeServiceInstanceEClass, DCAE_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE);

		dcaeLocationEClass = createEClass(DCAE_LOCATION);
		createEAttribute(dcaeLocationEClass, DCAE_LOCATION__LOCATION_TYPE);
		createEReference(dcaeLocationEClass, DCAE_LOCATION__OPENSTACK_PROJECT);

		dcaeServiceDescriptorEClass = createEClass(DCAE_SERVICE_DESCRIPTOR);
		createEAttribute(dcaeServiceDescriptorEClass, DCAE_SERVICE_DESCRIPTOR__GROUP_ID);
		createEAttribute(dcaeServiceDescriptorEClass, DCAE_SERVICE_DESCRIPTOR__ARTIFACT);
		createEAttribute(dcaeServiceDescriptorEClass, DCAE_SERVICE_DESCRIPTOR__VERSION);

		healthTestResponseEClass = createEClass(HEALTH_TEST_RESPONSE);
		createEAttribute(healthTestResponseEClass, HEALTH_TEST_RESPONSE__STATUS);
		createEAttribute(healthTestResponseEClass, HEALTH_TEST_RESPONSE__MESSAGE_CODE);

		dcaePolicyEntityEClass = createEClass(DCAE_POLICY_ENTITY);
		createEAttribute(dcaePolicyEntityEClass, DCAE_POLICY_ENTITY__POLICY_NAME);
		createEAttribute(dcaePolicyEntityEClass, DCAE_POLICY_ENTITY__POLICY_DESCRIPTION);
		createEAttribute(dcaePolicyEntityEClass, DCAE_POLICY_ENTITY__POLICY_CONFIG_NAME);
		createEAttribute(dcaePolicyEntityEClass, DCAE_POLICY_ENTITY__POLICY_TEMPLATE_VERSION);
		createEAttribute(dcaePolicyEntityEClass, DCAE_POLICY_ENTITY__POLICY_VERSION);
		createEAttribute(dcaePolicyEntityEClass, DCAE_POLICY_ENTITY__POLICY_PRIORITY);
		createEAttribute(dcaePolicyEntityEClass, DCAE_POLICY_ENTITY__POLICY_SCOPE);

		// Create enums
		healthTestStatusEEnum = createEEnum(HEALTH_TEST_STATUS);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		StreamPackage theStreamPackage = (StreamPackage)EPackage.Registry.INSTANCE.getEPackage(StreamPackage.eNS_URI);
		LocationPackage theLocationPackage = (LocationPackage)EPackage.Registry.INSTANCE.getEPackage(LocationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dcaeServiceContainerEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		dcaeServiceEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		dcaeServiceInstanceEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		dcaeLocationEClass.getESuperTypes().add(this.getDcaeServiceContainer());
		dcaeServiceDescriptorEClass.getESuperTypes().add(theCorePackage.getNamedEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(dcaeServiceContainerEClass, DcaeServiceContainer.class, "DcaeServiceContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDcaeServiceContainer_Instances(), this.getDcaeServiceInstance(), this.getDcaeServiceInstance_ServiceContainer(), "instances", null, 0, -1, DcaeServiceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcaeServiceEClass, DcaeService.class, "DcaeService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getDcaeService__Deploy__String_String(), null, "deploy", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "instanceName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "containerPath", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDcaeService__Undeploy__String(), null, "undeploy", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "instanceName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDcaeService__Test__String(), this.getHealthTestResponse(), "test", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "instanceName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDcaeService__Suspend__String(), null, "suspend", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "instanceName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDcaeService__Resume__String(), null, "resume", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "instanceName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDcaeService__PushManagerConfiguration__String(), null, "pushManagerConfiguration", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "instanceName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDcaeService__PollManagerConfiguration__String(), null, "pollManagerConfiguration", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "instanceName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDcaeService__ManagerConfiguration__String(), theEcorePackage.getEObject(), "managerConfiguration", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "instanceName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDcaeService__ManagerOperation__String_String_JSONObject(), theCorePackage.getJsonObject(), "managerOperation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "instanceName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "operation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getJsonObject(), "parameters", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDcaeService__UpdateConfigurationFromPolicy__String(), null, "updateConfigurationFromPolicy", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "instanceName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDcaeService__RunHealthTests(), null, "runHealthTests", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(dcaeServiceInstanceEClass, DcaeServiceInstance.class, "DcaeServiceInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDcaeServiceInstance_ServiceContainer(), this.getDcaeServiceContainer(), this.getDcaeServiceContainer_Instances(), "serviceContainer", null, 0, 1, DcaeServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeServiceInstance_Status(), theCorePackage.getDeploymentStatus(), "status", null, 0, 1, DcaeServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcaeServiceInstance_InputStreams(), theStreamPackage.getDcaeStream(), null, "inputStreams", null, 0, -1, DcaeServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcaeServiceInstance_OutputStreams(), theStreamPackage.getDcaeStream(), null, "outputStreams", null, 0, -1, DcaeServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeServiceInstance_LastHealthTest(), theCorePackage.getDateMetricAttribute(), "lastHealthTest", null, 0, 1, DcaeServiceInstance.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeServiceInstance_HealthTestStatus(), this.getHealthTestStatus(), "healthTestStatus", null, 0, 1, DcaeServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeServiceInstance_HealthTestMessageCode(), theEcorePackage.getEString(), "healthTestMessageCode", null, 0, 1, DcaeServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcaeLocationEClass, DcaeLocation.class, "DcaeLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDcaeLocation_LocationType(), theEcorePackage.getEString(), "locationType", null, 0, 1, DcaeLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcaeLocation_OpenstackProject(), theLocationPackage.getOpenStackProject(), null, "openstackProject", null, 0, 1, DcaeLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcaeServiceDescriptorEClass, DcaeServiceDescriptor.class, "DcaeServiceDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDcaeServiceDescriptor_GroupId(), theEcorePackage.getEString(), "groupId", null, 0, 1, DcaeServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeServiceDescriptor_Artifact(), theEcorePackage.getEString(), "artifact", null, 0, 1, DcaeServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeServiceDescriptor_Version(), theEcorePackage.getEString(), "version", null, 0, 1, DcaeServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(healthTestResponseEClass, HealthTestResponse.class, "HealthTestResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHealthTestResponse_Status(), this.getHealthTestStatus(), "status", null, 0, 1, HealthTestResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthTestResponse_MessageCode(), theEcorePackage.getEString(), "messageCode", null, 0, 1, HealthTestResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcaePolicyEntityEClass, DcaePolicyEntity.class, "DcaePolicyEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDcaePolicyEntity_PolicyName(), theEcorePackage.getEString(), "policyName", null, 0, 1, DcaePolicyEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaePolicyEntity_PolicyDescription(), theEcorePackage.getEString(), "policyDescription", null, 0, 1, DcaePolicyEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaePolicyEntity_PolicyConfigName(), theEcorePackage.getEString(), "policyConfigName", null, 0, 1, DcaePolicyEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaePolicyEntity_PolicyTemplateVersion(), theEcorePackage.getEString(), "policyTemplateVersion", null, 0, 1, DcaePolicyEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaePolicyEntity_PolicyVersion(), theEcorePackage.getEString(), "policyVersion", null, 0, 1, DcaePolicyEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaePolicyEntity_PolicyPriority(), theEcorePackage.getEString(), "policyPriority", null, 0, 1, DcaePolicyEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaePolicyEntity_PolicyScope(), theEcorePackage.getEString(), "policyScope", null, 0, 1, DcaePolicyEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(healthTestStatusEEnum, HealthTestStatus.class, "HealthTestStatus");
		addEEnumLiteral(healthTestStatusEEnum, HealthTestStatus.GREEN);
		addEEnumLiteral(healthTestStatusEEnum, HealthTestStatus.YELLOW);
		addEEnumLiteral(healthTestStatusEEnum, HealthTestStatus.RED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// http://openecomp.org
		createOpenecompAnnotations();
		// http://openecomp.org/cdap
		createCdapAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecomp", "http://openecomp.org",
			 "cdap", "http://openecomp.org/cdap"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://openecomp.org</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOpenecompAnnotations() {
		String source = "http://openecomp.org";	
		addAnnotation
		  (getDcaeServiceInstance_ServiceContainer(), 
		   source, 
		   new String[] {
			 "type", "operational"
		   });	
		addAnnotation
		  (getDcaeServiceInstance_Status(), 
		   source, 
		   new String[] {
			 "type", "operational"
		   });	
		addAnnotation
		  (getDcaeServiceInstance_InputStreams(), 
		   source, 
		   new String[] {
			 "type", "service"
		   });	
		addAnnotation
		  (getDcaeServiceInstance_OutputStreams(), 
		   source, 
		   new String[] {
			 "type", "service"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://openecomp.org/cdap</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCdapAnnotations() {
		String source = "http://openecomp.org/cdap";	
		addAnnotation
		  (getDcaePolicyEntity_PolicyName(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs::${path}.policyName"
		   });	
		addAnnotation
		  (getDcaePolicyEntity_PolicyDescription(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs::${path}.policyDescription"
		   });	
		addAnnotation
		  (getDcaePolicyEntity_PolicyConfigName(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs::${path}.policyConfigName"
		   });	
		addAnnotation
		  (getDcaePolicyEntity_PolicyTemplateVersion(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs::${path}.policyTemplateVersion"
		   });	
		addAnnotation
		  (getDcaePolicyEntity_PolicyVersion(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs::${path}.policyVersion"
		   });	
		addAnnotation
		  (getDcaePolicyEntity_PolicyPriority(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs::${path}.policyPriority"
		   });	
		addAnnotation
		  (getDcaePolicyEntity_PolicyScope(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs::${path}.policyScope"
		   });
	}

} //ServicePackageImpl
