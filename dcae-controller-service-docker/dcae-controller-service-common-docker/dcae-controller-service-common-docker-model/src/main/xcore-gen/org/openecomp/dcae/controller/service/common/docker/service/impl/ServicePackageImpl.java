
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
package org.openecomp.dcae.controller.service.common.docker.service.impl;

import org.openecomp.dcae.controller.service.common.docker.service.CommonDockerService;
import org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceConfiguration;
import org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceInstance;
import org.openecomp.dcae.controller.service.common.docker.service.ServiceFactory;
import org.openecomp.dcae.controller.service.common.docker.service.ServicePackage;
import org.openecomp.dcae.controller.service.common.docker.service.TommyDockerServiceConfiguration;

import org.openecomp.dcae.controller.service.docker.DockerPackage;

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
	private EClass commonDockerServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonDockerServiceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonDockerServiceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tommyDockerServiceConfigurationEClass = null;

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
	 * @see org.openecomp.dcae.controller.service.common.docker.service.ServicePackage#eNS_URI
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
		DockerPackage.eINSTANCE.eClass();

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
	public EClass getCommonDockerService() {
		return commonDockerServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonDockerServiceInstance() {
		return commonDockerServiceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonDockerServiceInstance_Script() {
		return (EAttribute)commonDockerServiceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonDockerServiceInstance_ConfigureTimeout() {
		return (EAttribute)commonDockerServiceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonDockerServiceInstance_TestTimeout() {
		return (EAttribute)commonDockerServiceInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonDockerServiceInstance_SuspendTimeout() {
		return (EAttribute)commonDockerServiceInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonDockerServiceInstance_ResumeTimeout() {
		return (EAttribute)commonDockerServiceInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonDockerServiceInstance_DockerConfiguration() {
		return (EReference)commonDockerServiceInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonDockerServiceConfiguration() {
		return commonDockerServiceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTommyDockerServiceConfiguration() {
		return tommyDockerServiceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTommyDockerServiceConfiguration_PostgresUserName() {
		return (EAttribute)tommyDockerServiceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTommyDockerServiceConfiguration_PostgresPassword() {
		return (EAttribute)tommyDockerServiceConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTommyDockerServiceConfiguration_PortgresJdbc() {
		return (EAttribute)tommyDockerServiceConfigurationEClass.getEStructuralFeatures().get(2);
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
		commonDockerServiceEClass = createEClass(COMMON_DOCKER_SERVICE);

		commonDockerServiceInstanceEClass = createEClass(COMMON_DOCKER_SERVICE_INSTANCE);
		createEAttribute(commonDockerServiceInstanceEClass, COMMON_DOCKER_SERVICE_INSTANCE__SCRIPT);
		createEAttribute(commonDockerServiceInstanceEClass, COMMON_DOCKER_SERVICE_INSTANCE__CONFIGURE_TIMEOUT);
		createEAttribute(commonDockerServiceInstanceEClass, COMMON_DOCKER_SERVICE_INSTANCE__TEST_TIMEOUT);
		createEAttribute(commonDockerServiceInstanceEClass, COMMON_DOCKER_SERVICE_INSTANCE__SUSPEND_TIMEOUT);
		createEAttribute(commonDockerServiceInstanceEClass, COMMON_DOCKER_SERVICE_INSTANCE__RESUME_TIMEOUT);
		createEReference(commonDockerServiceInstanceEClass, COMMON_DOCKER_SERVICE_INSTANCE__DOCKER_CONFIGURATION);

		commonDockerServiceConfigurationEClass = createEClass(COMMON_DOCKER_SERVICE_CONFIGURATION);

		tommyDockerServiceConfigurationEClass = createEClass(TOMMY_DOCKER_SERVICE_CONFIGURATION);
		createEAttribute(tommyDockerServiceConfigurationEClass, TOMMY_DOCKER_SERVICE_CONFIGURATION__POSTGRES_USER_NAME);
		createEAttribute(tommyDockerServiceConfigurationEClass, TOMMY_DOCKER_SERVICE_CONFIGURATION__POSTGRES_PASSWORD);
		createEAttribute(tommyDockerServiceConfigurationEClass, TOMMY_DOCKER_SERVICE_CONFIGURATION__PORTGRES_JDBC);
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
		DockerPackage theDockerPackage = (DockerPackage)EPackage.Registry.INSTANCE.getEPackage(DockerPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		commonDockerServiceEClass.getESuperTypes().add(theDockerPackage.getDockerService());
		commonDockerServiceInstanceEClass.getESuperTypes().add(theDockerPackage.getDockerServiceInstance());
		tommyDockerServiceConfigurationEClass.getESuperTypes().add(this.getCommonDockerServiceConfiguration());

		// Initialize classes, features, and operations; add parameters
		initEClass(commonDockerServiceEClass, CommonDockerService.class, "CommonDockerService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commonDockerServiceInstanceEClass, CommonDockerServiceInstance.class, "CommonDockerServiceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommonDockerServiceInstance_Script(), theEcorePackage.getEString(), "script", null, 0, 1, CommonDockerServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonDockerServiceInstance_ConfigureTimeout(), theEcorePackage.getEInt(), "configureTimeout", "60000", 0, 1, CommonDockerServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonDockerServiceInstance_TestTimeout(), theEcorePackage.getEInt(), "testTimeout", "60000", 0, 1, CommonDockerServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonDockerServiceInstance_SuspendTimeout(), theEcorePackage.getEInt(), "suspendTimeout", "60000", 0, 1, CommonDockerServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonDockerServiceInstance_ResumeTimeout(), theEcorePackage.getEInt(), "resumeTimeout", "60000", 0, 1, CommonDockerServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommonDockerServiceInstance_DockerConfiguration(), this.getCommonDockerServiceConfiguration(), null, "dockerConfiguration", null, 0, 1, CommonDockerServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commonDockerServiceConfigurationEClass, CommonDockerServiceConfiguration.class, "CommonDockerServiceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tommyDockerServiceConfigurationEClass, TommyDockerServiceConfiguration.class, "TommyDockerServiceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTommyDockerServiceConfiguration_PostgresUserName(), theEcorePackage.getEString(), "postgresUserName", null, 0, 1, TommyDockerServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTommyDockerServiceConfiguration_PostgresPassword(), theEcorePackage.getEString(), "postgresPassword", null, 0, 1, TommyDockerServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTommyDockerServiceConfiguration_PortgresJdbc(), theEcorePackage.getEString(), "portgresJdbc", null, 0, 1, TommyDockerServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
