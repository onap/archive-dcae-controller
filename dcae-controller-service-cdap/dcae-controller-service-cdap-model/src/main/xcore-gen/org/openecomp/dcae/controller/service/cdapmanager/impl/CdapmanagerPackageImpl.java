
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
package org.openecomp.dcae.controller.service.cdapmanager.impl;

import org.openecomp.dcae.controller.core.manager.ManagerPackage;
import org.openecomp.dcae.controller.service.cdapmanager.CdapManager;
import org.openecomp.dcae.controller.service.cdapmanager.CdapmanagerFactory;
import org.openecomp.dcae.controller.service.cdapmanager.CdapmanagerPackage;
import org.openecomp.ncomp.cdap.CdapPackage;
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
public class CdapmanagerPackageImpl extends EPackageImpl implements CdapmanagerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapManagerEClass = null;
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
	 * @see org.openecomp.dcae.controller.service.cdapmanager.CdapmanagerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CdapmanagerPackageImpl() {
		super(eNS_URI, CdapmanagerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CdapmanagerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CdapmanagerPackage init() {
		if (isInited) return (CdapmanagerPackage)EPackage.Registry.INSTANCE.getEPackage(CdapmanagerPackage.eNS_URI);

		// Obtain or create and register package
		CdapmanagerPackageImpl theCdapmanagerPackage = (CdapmanagerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CdapmanagerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CdapmanagerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ManagerPackage.eINSTANCE.eClass();
		CdapPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCdapmanagerPackage.createPackageContents();

		// Initialize created meta-data
		theCdapmanagerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCdapmanagerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CdapmanagerPackage.eNS_URI, theCdapmanagerPackage);
		return theCdapmanagerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapManager() {
		return cdapManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapManager_Configuration() {
		return (EReference)cdapManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapmanagerFactory getCdapmanagerFactory() {
		return (CdapmanagerFactory)getEFactoryInstance();
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
		cdapManagerEClass = createEClass(CDAP_MANAGER);
		createEReference(cdapManagerEClass, CDAP_MANAGER__CONFIGURATION);
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
		CdapPackage theCdapPackage = (CdapPackage)EPackage.Registry.INSTANCE.getEPackage(CdapPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cdapManagerEClass.getESuperTypes().add(theManagerPackage.getDcaeManager());

		// Initialize classes, features, and operations; add parameters
		initEClass(cdapManagerEClass, CdapManager.class, "CdapManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCdapManager_Configuration(), theCdapPackage.getCdapConfiguration(), null, "configuration", null, 0, 1, CdapManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CdapmanagerPackageImpl
