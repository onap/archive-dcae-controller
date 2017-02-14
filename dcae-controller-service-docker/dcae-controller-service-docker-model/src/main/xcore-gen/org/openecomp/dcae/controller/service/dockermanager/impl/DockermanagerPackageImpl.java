
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
package org.openecomp.dcae.controller.service.dockermanager.impl;

import org.openecomp.dcae.controller.core.manager.ManagerPackage;
import org.openecomp.dcae.controller.service.docker.DockerPackage;
import org.openecomp.dcae.controller.service.dockermanager.DockerManager;
import org.openecomp.dcae.controller.service.dockermanager.DockermanagerFactory;
import org.openecomp.dcae.controller.service.dockermanager.DockermanagerPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockermanagerPackageImpl extends EPackageImpl implements DockermanagerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerManagerEClass = null;

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
	 * @see org.openecomp.dcae.controller.service.dockermanager.DockermanagerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DockermanagerPackageImpl() {
		super(eNS_URI, DockermanagerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DockermanagerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DockermanagerPackage init() {
		if (isInited) return (DockermanagerPackage)EPackage.Registry.INSTANCE.getEPackage(DockermanagerPackage.eNS_URI);

		// Obtain or create and register package
		DockermanagerPackageImpl theDockermanagerPackage = (DockermanagerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DockermanagerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DockermanagerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DockerPackage.eINSTANCE.eClass();
		ManagerPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDockermanagerPackage.createPackageContents();

		// Initialize created meta-data
		theDockermanagerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDockermanagerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DockermanagerPackage.eNS_URI, theDockermanagerPackage);
		return theDockermanagerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerManager() {
		return dockerManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerManager_Configuration() {
		return (EReference)dockerManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockermanagerFactory getDockermanagerFactory() {
		return (DockermanagerFactory)getEFactoryInstance();
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
		dockerManagerEClass = createEClass(DOCKER_MANAGER);
		createEReference(dockerManagerEClass, DOCKER_MANAGER__CONFIGURATION);
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
		ManagerPackage theManagerPackage = (ManagerPackage)EPackage.Registry.INSTANCE.getEPackage(ManagerPackage.eNS_URI);
		DockerPackage theDockerPackage = (DockerPackage)EPackage.Registry.INSTANCE.getEPackage(DockerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dockerManagerEClass.getESuperTypes().add(theManagerPackage.getDcaeManager());

		// Initialize classes, features, and operations; add parameters
		initEClass(dockerManagerEClass, DockerManager.class, "DockerManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDockerManager_Configuration(), theDockerPackage.getDockerConfiguration(), null, "configuration", null, 0, 1, DockerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DockermanagerPackageImpl
