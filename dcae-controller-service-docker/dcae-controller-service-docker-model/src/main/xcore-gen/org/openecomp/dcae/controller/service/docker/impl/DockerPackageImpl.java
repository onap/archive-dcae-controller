
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
package org.openecomp.dcae.controller.service.docker.impl;

import org.openecomp.dcae.controller.core.service.ServicePackage;
import org.openecomp.dcae.controller.service.docker.DockerConfiguration;
import org.openecomp.dcae.controller.service.docker.DockerFactory;
import org.openecomp.dcae.controller.service.docker.DockerPackage;
import org.openecomp.dcae.controller.service.docker.DockerService;
import org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor;
import org.openecomp.dcae.controller.service.docker.DockerServiceInstance;
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
public class DockerPackageImpl extends EPackageImpl implements DockerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerServiceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerServiceDescriptorEClass = null;

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
	 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DockerPackageImpl() {
		super(eNS_URI, DockerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DockerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DockerPackage init() {
		if (isInited) return (DockerPackage)EPackage.Registry.INSTANCE.getEPackage(DockerPackage.eNS_URI);

		// Obtain or create and register package
		DockerPackageImpl theDockerPackage = (DockerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DockerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DockerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		org.openecomp.dcae.controller.service.docker.host.service.ServicePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDockerPackage.createPackageContents();

		// Initialize created meta-data
		theDockerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDockerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DockerPackage.eNS_URI, theDockerPackage);
		return theDockerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerService() {
		return dockerServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerService_Instances() {
		return (EReference)dockerServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerServiceInstance() {
		return dockerServiceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerServiceInstance_DockerHost() {
		return (EReference)dockerServiceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerServiceInstance_HostService() {
		return (EReference)dockerServiceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerServiceInstance_DockerName() {
		return (EAttribute)dockerServiceInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerServiceInstance_Image() {
		return (EAttribute)dockerServiceInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerServiceInstance_Configuration() {
		return (EReference)dockerServiceInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerServiceInstance_Volumes() {
		return (EAttribute)dockerServiceInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerServiceInstance_Links() {
		return (EAttribute)dockerServiceInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerServiceInstance_Envs() {
		return (EAttribute)dockerServiceInstanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerServiceInstance_PortBindings() {
		return (EReference)dockerServiceInstanceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerServiceInstance_ManagerPortNumber() {
		return (EAttribute)dockerServiceInstanceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerConfiguration() {
		return dockerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerConfiguration_Configuration() {
		return (EAttribute)dockerConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerServiceDescriptor() {
		return dockerServiceDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerServiceDescriptor_ServicePackage() {
		return (EAttribute)dockerServiceDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerServiceDescriptor_ServiceClass() {
		return (EAttribute)dockerServiceDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerServiceDescriptor_ServiceInstanceClass() {
		return (EAttribute)dockerServiceDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerServiceDescriptor_DockerImage() {
		return (EAttribute)dockerServiceDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerServiceDescriptor_ManagerPortNumber() {
		return (EAttribute)dockerServiceDescriptorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerServiceDescriptor_ManagerUser() {
		return (EAttribute)dockerServiceDescriptorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerServiceDescriptor_EncryptedPassword() {
		return (EAttribute)dockerServiceDescriptorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerFactory getDockerFactory() {
		return (DockerFactory)getEFactoryInstance();
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
		dockerServiceEClass = createEClass(DOCKER_SERVICE);
		createEReference(dockerServiceEClass, DOCKER_SERVICE__INSTANCES);

		dockerServiceInstanceEClass = createEClass(DOCKER_SERVICE_INSTANCE);
		createEReference(dockerServiceInstanceEClass, DOCKER_SERVICE_INSTANCE__DOCKER_HOST);
		createEReference(dockerServiceInstanceEClass, DOCKER_SERVICE_INSTANCE__HOST_SERVICE);
		createEAttribute(dockerServiceInstanceEClass, DOCKER_SERVICE_INSTANCE__DOCKER_NAME);
		createEAttribute(dockerServiceInstanceEClass, DOCKER_SERVICE_INSTANCE__IMAGE);
		createEReference(dockerServiceInstanceEClass, DOCKER_SERVICE_INSTANCE__CONFIGURATION);
		createEAttribute(dockerServiceInstanceEClass, DOCKER_SERVICE_INSTANCE__VOLUMES);
		createEAttribute(dockerServiceInstanceEClass, DOCKER_SERVICE_INSTANCE__LINKS);
		createEAttribute(dockerServiceInstanceEClass, DOCKER_SERVICE_INSTANCE__ENVS);
		createEReference(dockerServiceInstanceEClass, DOCKER_SERVICE_INSTANCE__PORT_BINDINGS);
		createEAttribute(dockerServiceInstanceEClass, DOCKER_SERVICE_INSTANCE__MANAGER_PORT_NUMBER);

		dockerConfigurationEClass = createEClass(DOCKER_CONFIGURATION);
		createEAttribute(dockerConfigurationEClass, DOCKER_CONFIGURATION__CONFIGURATION);

		dockerServiceDescriptorEClass = createEClass(DOCKER_SERVICE_DESCRIPTOR);
		createEAttribute(dockerServiceDescriptorEClass, DOCKER_SERVICE_DESCRIPTOR__SERVICE_PACKAGE);
		createEAttribute(dockerServiceDescriptorEClass, DOCKER_SERVICE_DESCRIPTOR__SERVICE_CLASS);
		createEAttribute(dockerServiceDescriptorEClass, DOCKER_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS);
		createEAttribute(dockerServiceDescriptorEClass, DOCKER_SERVICE_DESCRIPTOR__DOCKER_IMAGE);
		createEAttribute(dockerServiceDescriptorEClass, DOCKER_SERVICE_DESCRIPTOR__MANAGER_PORT_NUMBER);
		createEAttribute(dockerServiceDescriptorEClass, DOCKER_SERVICE_DESCRIPTOR__MANAGER_USER);
		createEAttribute(dockerServiceDescriptorEClass, DOCKER_SERVICE_DESCRIPTOR__ENCRYPTED_PASSWORD);
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
		ServicePackage theServicePackage_1 = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		org.openecomp.ncomp.docker.DockerPackage theDockerPackage_1 = (org.openecomp.ncomp.docker.DockerPackage)EPackage.Registry.INSTANCE.getEPackage(org.openecomp.ncomp.docker.DockerPackage.eNS_URI);
		org.openecomp.dcae.controller.service.docker.host.service.ServicePackage theServicePackage = (org.openecomp.dcae.controller.service.docker.host.service.ServicePackage)EPackage.Registry.INSTANCE.getEPackage(org.openecomp.dcae.controller.service.docker.host.service.ServicePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dockerServiceEClass.getESuperTypes().add(theServicePackage_1.getDcaeService());
		dockerServiceInstanceEClass.getESuperTypes().add(theServicePackage_1.getDcaeServiceInstance());
		dockerServiceDescriptorEClass.getESuperTypes().add(theServicePackage_1.getDcaeServiceDescriptor());

		// Initialize classes, features, and operations; add parameters
		initEClass(dockerServiceEClass, DockerService.class, "DockerService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDockerService_Instances(), this.getDockerServiceInstance(), null, "instances", null, 0, -1, DockerService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerServiceInstanceEClass, DockerServiceInstance.class, "DockerServiceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDockerServiceInstance_DockerHost(), theDockerPackage_1.getDockerHost(), null, "dockerHost", null, 0, 1, DockerServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerServiceInstance_HostService(), theServicePackage.getDockerHostServiceInstance(), null, "hostService", null, 0, 1, DockerServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerServiceInstance_DockerName(), theEcorePackage.getEString(), "dockerName", null, 0, 1, DockerServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerServiceInstance_Image(), theEcorePackage.getEString(), "image", null, 0, 1, DockerServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerServiceInstance_Configuration(), this.getDockerConfiguration(), null, "configuration", null, 0, 1, DockerServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerServiceInstance_Volumes(), theEcorePackage.getEString(), "volumes", null, 0, -1, DockerServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerServiceInstance_Links(), theEcorePackage.getEString(), "links", null, 0, -1, DockerServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerServiceInstance_Envs(), theEcorePackage.getEString(), "envs", null, 0, -1, DockerServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerServiceInstance_PortBindings(), theDockerPackage_1.getContainerPortBindings(), null, "portBindings", null, 0, -1, DockerServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerServiceInstance_ManagerPortNumber(), theEcorePackage.getEInt(), "managerPortNumber", "9999", 0, 1, DockerServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerConfigurationEClass, DockerConfiguration.class, "DockerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerConfiguration_Configuration(), theEcorePackage.getEString(), "configuration", null, 0, 1, DockerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerServiceDescriptorEClass, DockerServiceDescriptor.class, "DockerServiceDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerServiceDescriptor_ServicePackage(), theEcorePackage.getEString(), "servicePackage", null, 0, 1, DockerServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerServiceDescriptor_ServiceClass(), theEcorePackage.getEString(), "serviceClass", null, 0, 1, DockerServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerServiceDescriptor_ServiceInstanceClass(), theEcorePackage.getEString(), "serviceInstanceClass", null, 0, 1, DockerServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerServiceDescriptor_DockerImage(), theEcorePackage.getEString(), "dockerImage", null, 0, 1, DockerServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerServiceDescriptor_ManagerPortNumber(), theEcorePackage.getEString(), "managerPortNumber", null, 0, 1, DockerServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerServiceDescriptor_ManagerUser(), theEcorePackage.getEString(), "managerUser", null, 0, 1, DockerServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerServiceDescriptor_EncryptedPassword(), theEcorePackage.getEString(), "encryptedPassword", null, 0, 1, DockerServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// http://openecomp.org
		createOpenecompAnnotations();
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

	/**
	 * Initializes the annotations for <b>http://openecomp.org</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOpenecompAnnotations() {
		String source = "http://openecomp.org";	
		addAnnotation
		  (getDockerServiceInstance_DockerHost(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getDockerConfiguration_Configuration(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });
	}

} //DockerPackageImpl
