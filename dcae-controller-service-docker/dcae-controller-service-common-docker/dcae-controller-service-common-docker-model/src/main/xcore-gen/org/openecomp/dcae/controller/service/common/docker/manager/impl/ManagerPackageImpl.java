
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
package org.openecomp.dcae.controller.service.common.docker.manager.impl;

import org.openecomp.dcae.controller.service.common.docker.manager.CommonDockerManager;
import org.openecomp.dcae.controller.service.common.docker.manager.ManagerFactory;
import org.openecomp.dcae.controller.service.common.docker.manager.ManagerPackage;

import org.openecomp.dcae.controller.service.common.docker.service.ServicePackage;

import org.openecomp.dcae.controller.service.dockermanager.DockermanagerPackage;

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
public class ManagerPackageImpl extends EPackageImpl implements ManagerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonDockerManagerEClass = null;

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
	 * @see org.openecomp.dcae.controller.service.common.docker.manager.ManagerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ManagerPackageImpl() {
		super(eNS_URI, ManagerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ManagerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ManagerPackage init() {
		if (isInited) return (ManagerPackage)EPackage.Registry.INSTANCE.getEPackage(ManagerPackage.eNS_URI);

		// Obtain or create and register package
		ManagerPackageImpl theManagerPackage = (ManagerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ManagerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ManagerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ServicePackage.eINSTANCE.eClass();
		DockermanagerPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theManagerPackage.createPackageContents();

		// Initialize created meta-data
		theManagerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theManagerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ManagerPackage.eNS_URI, theManagerPackage);
		return theManagerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonDockerManager() {
		return commonDockerManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonDockerManager_Script() {
		return (EAttribute)commonDockerManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonDockerManager_ConfigureTimeout() {
		return (EAttribute)commonDockerManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonDockerManager_TestTimeout() {
		return (EAttribute)commonDockerManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonDockerManager_SuspendTimeout() {
		return (EAttribute)commonDockerManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonDockerManager_ResumeTimeout() {
		return (EAttribute)commonDockerManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonDockerManager_DockerConfiguration() {
		return (EReference)commonDockerManagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagerFactory getManagerFactory() {
		return (ManagerFactory)getEFactoryInstance();
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
		commonDockerManagerEClass = createEClass(COMMON_DOCKER_MANAGER);
		createEAttribute(commonDockerManagerEClass, COMMON_DOCKER_MANAGER__SCRIPT);
		createEAttribute(commonDockerManagerEClass, COMMON_DOCKER_MANAGER__CONFIGURE_TIMEOUT);
		createEAttribute(commonDockerManagerEClass, COMMON_DOCKER_MANAGER__TEST_TIMEOUT);
		createEAttribute(commonDockerManagerEClass, COMMON_DOCKER_MANAGER__SUSPEND_TIMEOUT);
		createEAttribute(commonDockerManagerEClass, COMMON_DOCKER_MANAGER__RESUME_TIMEOUT);
		createEReference(commonDockerManagerEClass, COMMON_DOCKER_MANAGER__DOCKER_CONFIGURATION);
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
		DockermanagerPackage theDockermanagerPackage = (DockermanagerPackage)EPackage.Registry.INSTANCE.getEPackage(DockermanagerPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		commonDockerManagerEClass.getESuperTypes().add(theDockermanagerPackage.getDockerManager());

		// Initialize classes, features, and operations; add parameters
		initEClass(commonDockerManagerEClass, CommonDockerManager.class, "CommonDockerManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommonDockerManager_Script(), theEcorePackage.getEString(), "script", null, 0, 1, CommonDockerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonDockerManager_ConfigureTimeout(), theEcorePackage.getEInt(), "configureTimeout", "60000", 0, 1, CommonDockerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonDockerManager_TestTimeout(), theEcorePackage.getEInt(), "testTimeout", "60000", 0, 1, CommonDockerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonDockerManager_SuspendTimeout(), theEcorePackage.getEInt(), "suspendTimeout", "60000", 0, 1, CommonDockerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonDockerManager_ResumeTimeout(), theEcorePackage.getEInt(), "resumeTimeout", "60000", 0, 1, CommonDockerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommonDockerManager_DockerConfiguration(), theServicePackage.getCommonDockerServiceConfiguration(), null, "dockerConfiguration", null, 0, 1, CommonDockerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ManagerPackageImpl
