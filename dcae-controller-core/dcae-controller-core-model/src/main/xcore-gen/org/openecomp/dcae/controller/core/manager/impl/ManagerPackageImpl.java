
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
package org.openecomp.dcae.controller.core.manager.impl;

import org.openecomp.dcae.controller.core.manager.DcaeManager;
import org.openecomp.dcae.controller.core.manager.ManagerFactory;
import org.openecomp.dcae.controller.core.manager.ManagerPackage;

import org.openecomp.dcae.controller.core.service.ServicePackage;
import org.openecomp.dcae.controller.core.stream.StreamPackage;

import org.eclipse.emf.ecore.EClass;
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
public class ManagerPackageImpl extends EPackageImpl implements ManagerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeManagerEClass = null;

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
	 * @see org.openecomp.dcae.controller.core.manager.ManagerPackage#eNS_URI
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
	public EClass getDcaeManager() {
		return dcaeManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeManager_InputStreams() {
		return (EReference)dcaeManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeManager_OutputStreams() {
		return (EReference)dcaeManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeManager__Test() {
		return dcaeManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeManager__Suspend() {
		return dcaeManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeManager__Resume() {
		return dcaeManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeManager__PublicKey() {
		return dcaeManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeManager__ConfigurationChanged() {
		return dcaeManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeManager__UpdateStreams__EList_EList() {
		return dcaeManagerEClass.getEOperations().get(5);
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
		dcaeManagerEClass = createEClass(DCAE_MANAGER);
		createEReference(dcaeManagerEClass, DCAE_MANAGER__INPUT_STREAMS);
		createEReference(dcaeManagerEClass, DCAE_MANAGER__OUTPUT_STREAMS);
		createEOperation(dcaeManagerEClass, DCAE_MANAGER___TEST);
		createEOperation(dcaeManagerEClass, DCAE_MANAGER___SUSPEND);
		createEOperation(dcaeManagerEClass, DCAE_MANAGER___RESUME);
		createEOperation(dcaeManagerEClass, DCAE_MANAGER___PUBLIC_KEY);
		createEOperation(dcaeManagerEClass, DCAE_MANAGER___CONFIGURATION_CHANGED);
		createEOperation(dcaeManagerEClass, DCAE_MANAGER___UPDATE_STREAMS__ELIST_ELIST);
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
		StreamPackage theStreamPackage = (StreamPackage)EPackage.Registry.INSTANCE.getEPackage(StreamPackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(dcaeManagerEClass, DcaeManager.class, "DcaeManager", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDcaeManager_InputStreams(), theStreamPackage.getDcaeStream(), null, "inputStreams", null, 0, -1, DcaeManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcaeManager_OutputStreams(), theStreamPackage.getDcaeStream(), null, "outputStreams", null, 0, -1, DcaeManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDcaeManager__Test(), theServicePackage.getHealthTestResponse(), "test", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDcaeManager__Suspend(), null, "suspend", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDcaeManager__Resume(), null, "resume", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDcaeManager__PublicKey(), theEcorePackage.getEString(), "publicKey", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDcaeManager__ConfigurationChanged(), null, "configurationChanged", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getDcaeManager__UpdateStreams__EList_EList(), null, "updateStreams", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStreamPackage.getDcaeStream(), "inputStreams", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStreamPackage.getDcaeStream(), "outputStreams", 0, -1, !IS_UNIQUE, IS_ORDERED);

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

} //ManagerPackageImpl
