
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
package org.openecomp.dcae.controller.service.common.vm.service.impl;

import org.openecomp.dcae.controller.service.common.vm.service.CommonVmService;
import org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceConfiguration;
import org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance;
import org.openecomp.dcae.controller.service.common.vm.service.ServiceFactory;
import org.openecomp.dcae.controller.service.common.vm.service.ServicePackage;
import org.openecomp.dcae.controller.service.common.vm.service.TommyVmServiceConfiguration;
import org.openecomp.dcae.controller.service.vm.VmPackage;
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
public class ServicePackageImpl extends EPackageImpl implements ServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonVmServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonVmServiceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonVmServiceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tommyVmServiceConfigurationEClass = null;

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
	 * @see org.openecomp.dcae.controller.service.common.vm.service.ServicePackage#eNS_URI
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
		VmPackage.eINSTANCE.eClass();

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
	public EClass getCommonVmService() {
		return commonVmServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonVmServiceInstance() {
		return commonVmServiceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonVmServiceInstance_Script() {
		return (EAttribute)commonVmServiceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonVmServiceInstance_ConfigureTimeout() {
		return (EAttribute)commonVmServiceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonVmServiceInstance_TestTimeout() {
		return (EAttribute)commonVmServiceInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonVmServiceInstance_SuspendTimeout() {
		return (EAttribute)commonVmServiceInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonVmServiceInstance_ResumeTimeout() {
		return (EAttribute)commonVmServiceInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonVmServiceInstance_VmConfiguration() {
		return (EReference)commonVmServiceInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonVmServiceConfiguration() {
		return commonVmServiceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTommyVmServiceConfiguration() {
		return tommyVmServiceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTommyVmServiceConfiguration_PostgresUserName() {
		return (EAttribute)tommyVmServiceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTommyVmServiceConfiguration_PostgresPassword() {
		return (EAttribute)tommyVmServiceConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTommyVmServiceConfiguration_PortgresJdbc() {
		return (EAttribute)tommyVmServiceConfigurationEClass.getEStructuralFeatures().get(2);
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
		commonVmServiceEClass = createEClass(COMMON_VM_SERVICE);

		commonVmServiceInstanceEClass = createEClass(COMMON_VM_SERVICE_INSTANCE);
		createEAttribute(commonVmServiceInstanceEClass, COMMON_VM_SERVICE_INSTANCE__SCRIPT);
		createEAttribute(commonVmServiceInstanceEClass, COMMON_VM_SERVICE_INSTANCE__CONFIGURE_TIMEOUT);
		createEAttribute(commonVmServiceInstanceEClass, COMMON_VM_SERVICE_INSTANCE__TEST_TIMEOUT);
		createEAttribute(commonVmServiceInstanceEClass, COMMON_VM_SERVICE_INSTANCE__SUSPEND_TIMEOUT);
		createEAttribute(commonVmServiceInstanceEClass, COMMON_VM_SERVICE_INSTANCE__RESUME_TIMEOUT);
		createEReference(commonVmServiceInstanceEClass, COMMON_VM_SERVICE_INSTANCE__VM_CONFIGURATION);

		commonVmServiceConfigurationEClass = createEClass(COMMON_VM_SERVICE_CONFIGURATION);

		tommyVmServiceConfigurationEClass = createEClass(TOMMY_VM_SERVICE_CONFIGURATION);
		createEAttribute(tommyVmServiceConfigurationEClass, TOMMY_VM_SERVICE_CONFIGURATION__POSTGRES_USER_NAME);
		createEAttribute(tommyVmServiceConfigurationEClass, TOMMY_VM_SERVICE_CONFIGURATION__POSTGRES_PASSWORD);
		createEAttribute(tommyVmServiceConfigurationEClass, TOMMY_VM_SERVICE_CONFIGURATION__PORTGRES_JDBC);
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
		VmPackage theVmPackage = (VmPackage)EPackage.Registry.INSTANCE.getEPackage(VmPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		commonVmServiceEClass.getESuperTypes().add(theVmPackage.getVirtualMachineService());
		commonVmServiceInstanceEClass.getESuperTypes().add(theVmPackage.getVirtualMachineServiceInstance());
		tommyVmServiceConfigurationEClass.getESuperTypes().add(this.getCommonVmServiceConfiguration());

		// Initialize classes, features, and operations; add parameters
		initEClass(commonVmServiceEClass, CommonVmService.class, "CommonVmService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commonVmServiceInstanceEClass, CommonVmServiceInstance.class, "CommonVmServiceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommonVmServiceInstance_Script(), theEcorePackage.getEString(), "script", null, 0, 1, CommonVmServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonVmServiceInstance_ConfigureTimeout(), theEcorePackage.getEInt(), "configureTimeout", "60000", 0, 1, CommonVmServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonVmServiceInstance_TestTimeout(), theEcorePackage.getEInt(), "testTimeout", "60000", 0, 1, CommonVmServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonVmServiceInstance_SuspendTimeout(), theEcorePackage.getEInt(), "suspendTimeout", "60000", 0, 1, CommonVmServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonVmServiceInstance_ResumeTimeout(), theEcorePackage.getEInt(), "resumeTimeout", "60000", 0, 1, CommonVmServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommonVmServiceInstance_VmConfiguration(), this.getCommonVmServiceConfiguration(), null, "vmConfiguration", null, 0, 1, CommonVmServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commonVmServiceConfigurationEClass, CommonVmServiceConfiguration.class, "CommonVmServiceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tommyVmServiceConfigurationEClass, TommyVmServiceConfiguration.class, "TommyVmServiceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTommyVmServiceConfiguration_PostgresUserName(), theEcorePackage.getEString(), "postgresUserName", null, 0, 1, TommyVmServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTommyVmServiceConfiguration_PostgresPassword(), theEcorePackage.getEString(), "postgresPassword", null, 0, 1, TommyVmServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTommyVmServiceConfiguration_PortgresJdbc(), theEcorePackage.getEString(), "portgresJdbc", null, 0, 1, TommyVmServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
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
			 "ecomp", "http://openecomp.org"
		   });
	}

} //ServicePackageImpl
