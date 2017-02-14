
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
package org.openecomp.dcae.controller.service.docker.host.manager.impl;

import org.openecomp.dcae.controller.core.stream.StreamPackage;
import org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager;
import org.openecomp.dcae.controller.service.docker.host.manager.ManagerFactory;
import org.openecomp.dcae.controller.service.docker.host.manager.ManagerPackage;
import org.openecomp.dcae.controller.service.docker.host.service.ServicePackage;
import org.openecomp.dcae.controller.service.vmmanager.VmmanagerPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
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
	private EClass dockerHostManagerEClass = null;
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
	 * @see org.openecomp.dcae.controller.service.docker.host.manager.ManagerPackage#eNS_URI
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
		VmmanagerPackage.eINSTANCE.eClass();
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
	public EClass getDockerHostManager() {
		return dockerHostManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHostManager__UpdateContainerConfiguration__String_EObject_EList_EList() {
		return dockerHostManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHostManager__SuspendContainer__String() {
		return dockerHostManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHostManager__ResumeContainer__String() {
		return dockerHostManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHostManager__TestContainer__String() {
		return dockerHostManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHostManager__SetupConfiguration__String_String() {
		return dockerHostManagerEClass.getEOperations().get(4);
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
		dockerHostManagerEClass = createEClass(DOCKER_HOST_MANAGER);
		createEOperation(dockerHostManagerEClass, DOCKER_HOST_MANAGER___UPDATE_CONTAINER_CONFIGURATION__STRING_EOBJECT_ELIST_ELIST);
		createEOperation(dockerHostManagerEClass, DOCKER_HOST_MANAGER___SUSPEND_CONTAINER__STRING);
		createEOperation(dockerHostManagerEClass, DOCKER_HOST_MANAGER___RESUME_CONTAINER__STRING);
		createEOperation(dockerHostManagerEClass, DOCKER_HOST_MANAGER___TEST_CONTAINER__STRING);
		createEOperation(dockerHostManagerEClass, DOCKER_HOST_MANAGER___SETUP_CONFIGURATION__STRING_STRING);
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
		VmmanagerPackage theVmmanagerPackage = (VmmanagerPackage)EPackage.Registry.INSTANCE.getEPackage(VmmanagerPackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		StreamPackage theStreamPackage = (StreamPackage)EPackage.Registry.INSTANCE.getEPackage(StreamPackage.eNS_URI);
		org.openecomp.dcae.controller.core.service.ServicePackage theServicePackage_1 = (org.openecomp.dcae.controller.core.service.ServicePackage)EPackage.Registry.INSTANCE.getEPackage(org.openecomp.dcae.controller.core.service.ServicePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dockerHostManagerEClass.getESuperTypes().add(theVmmanagerPackage.getVirtualMachineManager());
		dockerHostManagerEClass.getESuperTypes().add(theServicePackage.getDockerConfiguration());

		// Initialize classes, features, and operations; add parameters
		initEClass(dockerHostManagerEClass, DockerHostManager.class, "DockerHostManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getDockerHostManager__UpdateContainerConfiguration__String_EObject_EList_EList(), null, "updateContainerConfiguration", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "o", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStreamPackage.getDcaeStream(), "inputStreams", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStreamPackage.getDcaeStream(), "outputStreams", 0, -1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDockerHostManager__SuspendContainer__String(), null, "suspendContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDockerHostManager__ResumeContainer__String(), null, "resumeContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDockerHostManager__TestContainer__String(), theServicePackage_1.getHealthTestResponse(), "testContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDockerHostManager__SetupConfiguration__String_String(), null, "setupConfiguration", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "service", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "instance", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ManagerPackageImpl
