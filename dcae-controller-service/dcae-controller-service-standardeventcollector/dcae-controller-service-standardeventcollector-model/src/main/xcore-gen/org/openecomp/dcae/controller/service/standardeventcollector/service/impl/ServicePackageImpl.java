
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
package org.openecomp.dcae.controller.service.standardeventcollector.service.impl;

import org.openecomp.dcae.controller.service.docker.DockerPackage;

import org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorService;
import org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration;
import org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceInstance;
import org.openecomp.dcae.controller.service.standardeventcollector.service.ServiceFactory;
import org.openecomp.dcae.controller.service.standardeventcollector.service.ServicePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
	private EClass controllerServiceStandardeventcollectorServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerServiceStandardeventcollectorServiceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerServiceStandardeventcollectorServiceConfigurationEClass = null;

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
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ServicePackage#eNS_URI
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
	public EClass getControllerServiceStandardeventcollectorService() {
		return controllerServiceStandardeventcollectorServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerServiceStandardeventcollectorServiceInstance() {
		return controllerServiceStandardeventcollectorServiceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerServiceStandardeventcollectorServiceConfiguration() {
		return controllerServiceStandardeventcollectorServiceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Cport() {
		return (EAttribute)controllerServiceStandardeventcollectorServiceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Csecport() {
		return (EAttribute)controllerServiceStandardeventcollectorServiceConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Keystoreloc() {
		return (EAttribute)controllerServiceStandardeventcollectorServiceConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Keystorealias() {
		return (EAttribute)controllerServiceStandardeventcollectorServiceConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Keystorepwdloc() {
		return (EAttribute)controllerServiceStandardeventcollectorServiceConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Maxinputqueue() {
		return (EAttribute)controllerServiceStandardeventcollectorServiceConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Authflag() {
		return (EAttribute)controllerServiceStandardeventcollectorServiceConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Authlist() {
		return (EAttribute)controllerServiceStandardeventcollectorServiceConfigurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Checkschemaflag() {
		return (EAttribute)controllerServiceStandardeventcollectorServiceConfigurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Schemafile() {
		return (EAttribute)controllerServiceStandardeventcollectorServiceConfigurationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Streamid() {
		return (EAttribute)controllerServiceStandardeventcollectorServiceConfigurationEClass.getEStructuralFeatures().get(10);
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
		controllerServiceStandardeventcollectorServiceEClass = createEClass(CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE);

		controllerServiceStandardeventcollectorServiceInstanceEClass = createEClass(CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE);

		controllerServiceStandardeventcollectorServiceConfigurationEClass = createEClass(CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION);
		createEAttribute(controllerServiceStandardeventcollectorServiceConfigurationEClass, CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CPORT);
		createEAttribute(controllerServiceStandardeventcollectorServiceConfigurationEClass, CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CSECPORT);
		createEAttribute(controllerServiceStandardeventcollectorServiceConfigurationEClass, CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTORELOC);
		createEAttribute(controllerServiceStandardeventcollectorServiceConfigurationEClass, CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREALIAS);
		createEAttribute(controllerServiceStandardeventcollectorServiceConfigurationEClass, CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREPWDLOC);
		createEAttribute(controllerServiceStandardeventcollectorServiceConfigurationEClass, CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__MAXINPUTQUEUE);
		createEAttribute(controllerServiceStandardeventcollectorServiceConfigurationEClass, CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHFLAG);
		createEAttribute(controllerServiceStandardeventcollectorServiceConfigurationEClass, CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHLIST);
		createEAttribute(controllerServiceStandardeventcollectorServiceConfigurationEClass, CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CHECKSCHEMAFLAG);
		createEAttribute(controllerServiceStandardeventcollectorServiceConfigurationEClass, CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__SCHEMAFILE);
		createEAttribute(controllerServiceStandardeventcollectorServiceConfigurationEClass, CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__STREAMID);
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
		controllerServiceStandardeventcollectorServiceEClass.getESuperTypes().add(theDockerPackage.getDockerService());
		controllerServiceStandardeventcollectorServiceInstanceEClass.getESuperTypes().add(theDockerPackage.getDockerServiceInstance());
		controllerServiceStandardeventcollectorServiceInstanceEClass.getESuperTypes().add(this.getControllerServiceStandardeventcollectorServiceConfiguration());

		// Initialize classes, features, and operations; add parameters
		initEClass(controllerServiceStandardeventcollectorServiceEClass, ControllerServiceStandardeventcollectorService.class, "ControllerServiceStandardeventcollectorService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controllerServiceStandardeventcollectorServiceInstanceEClass, ControllerServiceStandardeventcollectorServiceInstance.class, "ControllerServiceStandardeventcollectorServiceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controllerServiceStandardeventcollectorServiceConfigurationEClass, ControllerServiceStandardeventcollectorServiceConfiguration.class, "ControllerServiceStandardeventcollectorServiceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControllerServiceStandardeventcollectorServiceConfiguration_Cport(), theEcorePackage.getEString(), "cport", null, 0, 1, ControllerServiceStandardeventcollectorServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceStandardeventcollectorServiceConfiguration_Csecport(), theEcorePackage.getEString(), "csecport", null, 0, 1, ControllerServiceStandardeventcollectorServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceStandardeventcollectorServiceConfiguration_Keystoreloc(), theEcorePackage.getEString(), "keystoreloc", null, 0, 1, ControllerServiceStandardeventcollectorServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceStandardeventcollectorServiceConfiguration_Keystorealias(), theEcorePackage.getEString(), "keystorealias", null, 0, 1, ControllerServiceStandardeventcollectorServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceStandardeventcollectorServiceConfiguration_Keystorepwdloc(), theEcorePackage.getEString(), "keystorepwdloc", null, 0, 1, ControllerServiceStandardeventcollectorServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceStandardeventcollectorServiceConfiguration_Maxinputqueue(), theEcorePackage.getEString(), "maxinputqueue", null, 0, 1, ControllerServiceStandardeventcollectorServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceStandardeventcollectorServiceConfiguration_Authflag(), theEcorePackage.getEString(), "authflag", null, 0, 1, ControllerServiceStandardeventcollectorServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceStandardeventcollectorServiceConfiguration_Authlist(), theEcorePackage.getEString(), "authlist", null, 0, 1, ControllerServiceStandardeventcollectorServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceStandardeventcollectorServiceConfiguration_Checkschemaflag(), theEcorePackage.getEString(), "checkschemaflag", null, 0, 1, ControllerServiceStandardeventcollectorServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceStandardeventcollectorServiceConfiguration_Schemafile(), theEcorePackage.getEString(), "schemafile", null, 0, 1, ControllerServiceStandardeventcollectorServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceStandardeventcollectorServiceConfiguration_Streamid(), theEcorePackage.getEString(), "streamid", null, 0, 1, ControllerServiceStandardeventcollectorServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getControllerServiceStandardeventcollectorServiceConfiguration_Cport(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getControllerServiceStandardeventcollectorServiceConfiguration_Csecport(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getControllerServiceStandardeventcollectorServiceConfiguration_Keystoreloc(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getControllerServiceStandardeventcollectorServiceConfiguration_Keystorealias(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getControllerServiceStandardeventcollectorServiceConfiguration_Keystorepwdloc(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getControllerServiceStandardeventcollectorServiceConfiguration_Maxinputqueue(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getControllerServiceStandardeventcollectorServiceConfiguration_Authflag(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getControllerServiceStandardeventcollectorServiceConfiguration_Authlist(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getControllerServiceStandardeventcollectorServiceConfiguration_Checkschemaflag(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getControllerServiceStandardeventcollectorServiceConfiguration_Schemafile(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getControllerServiceStandardeventcollectorServiceConfiguration_Streamid(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });
	}

} //ServicePackageImpl
