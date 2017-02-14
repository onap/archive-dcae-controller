
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
package org.openecomp.dcae.controller.service.dmaap.drsub.service.impl;

import org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubService;
import org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration;
import org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceInstance;
import org.openecomp.dcae.controller.service.dmaap.drsub.service.ServiceFactory;
import org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage;
import org.openecomp.dcae.controller.service.vm.VmPackage;
import org.openecomp.ncomp.core.CorePackage;
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
	private EClass controllerServiceDmaapDrsubServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerServiceDmaapDrsubServiceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerServiceDmaapDrsubServiceConfigurationEClass = null;

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
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#eNS_URI
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
		org.openecomp.dcae.controller.service.cdap.cluster.service.ServicePackage.eINSTANCE.eClass();

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
	public EClass getControllerServiceDmaapDrsubService() {
		return controllerServiceDmaapDrsubServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerServiceDmaapDrsubServiceInstance() {
		return controllerServiceDmaapDrsubServiceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerServiceDmaapDrsubServiceInstance_CdapClusterInstance() {
		return (EReference)controllerServiceDmaapDrsubServiceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceDmaapDrsubServiceInstance_CdapServiceName() {
		return (EAttribute)controllerServiceDmaapDrsubServiceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerServiceDmaapDrsubServiceConfiguration() {
		return controllerServiceDmaapDrsubServiceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceDmaapDrsubServiceConfiguration_CdapUrl() {
		return (EAttribute)controllerServiceDmaapDrsubServiceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceDmaapDrsubServiceConfiguration_NumberOfCdapRecords() {
		return (EAttribute)controllerServiceDmaapDrsubServiceConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceDmaapDrsubServiceConfiguration_NumberOfCdapErrors() {
		return (EAttribute)controllerServiceDmaapDrsubServiceConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceDmaapDrsubServiceConfiguration_HdfsUri() {
		return (EAttribute)controllerServiceDmaapDrsubServiceConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceDmaapDrsubServiceConfiguration_HdfsUriDescr() {
		return (EAttribute)controllerServiceDmaapDrsubServiceConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceDmaapDrsubServiceConfiguration_HdfsPersistLoc() {
		return (EAttribute)controllerServiceDmaapDrsubServiceConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceDmaapDrsubServiceConfiguration_HdfsPersistLocDescr() {
		return (EAttribute)controllerServiceDmaapDrsubServiceConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceDmaapDrsubServiceConfiguration_DmaapConfFile() {
		return (EAttribute)controllerServiceDmaapDrsubServiceConfigurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceDmaapDrsubServiceConfiguration_DmaapConfFileDescr() {
		return (EAttribute)controllerServiceDmaapDrsubServiceConfigurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceDmaapDrsubServiceConfiguration_DmaapStreamid() {
		return (EAttribute)controllerServiceDmaapDrsubServiceConfigurationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerServiceDmaapDrsubServiceConfiguration_DmaapStreamidDescr() {
		return (EAttribute)controllerServiceDmaapDrsubServiceConfigurationEClass.getEStructuralFeatures().get(10);
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
		controllerServiceDmaapDrsubServiceEClass = createEClass(CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE);

		controllerServiceDmaapDrsubServiceInstanceEClass = createEClass(CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE);
		createEReference(controllerServiceDmaapDrsubServiceInstanceEClass, CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__CDAP_CLUSTER_INSTANCE);
		createEAttribute(controllerServiceDmaapDrsubServiceInstanceEClass, CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__CDAP_SERVICE_NAME);

		controllerServiceDmaapDrsubServiceConfigurationEClass = createEClass(CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION);
		createEAttribute(controllerServiceDmaapDrsubServiceConfigurationEClass, CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__CDAP_URL);
		createEAttribute(controllerServiceDmaapDrsubServiceConfigurationEClass, CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__NUMBER_OF_CDAP_RECORDS);
		createEAttribute(controllerServiceDmaapDrsubServiceConfigurationEClass, CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__NUMBER_OF_CDAP_ERRORS);
		createEAttribute(controllerServiceDmaapDrsubServiceConfigurationEClass, CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_URI);
		createEAttribute(controllerServiceDmaapDrsubServiceConfigurationEClass, CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_URI_DESCR);
		createEAttribute(controllerServiceDmaapDrsubServiceConfigurationEClass, CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_PERSIST_LOC);
		createEAttribute(controllerServiceDmaapDrsubServiceConfigurationEClass, CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_PERSIST_LOC_DESCR);
		createEAttribute(controllerServiceDmaapDrsubServiceConfigurationEClass, CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_CONF_FILE);
		createEAttribute(controllerServiceDmaapDrsubServiceConfigurationEClass, CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_CONF_FILE_DESCR);
		createEAttribute(controllerServiceDmaapDrsubServiceConfigurationEClass, CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_STREAMID);
		createEAttribute(controllerServiceDmaapDrsubServiceConfigurationEClass, CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_STREAMID_DESCR);
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
		org.openecomp.dcae.controller.service.cdap.cluster.service.ServicePackage theServicePackage_1 = (org.openecomp.dcae.controller.service.cdap.cluster.service.ServicePackage)EPackage.Registry.INSTANCE.getEPackage(org.openecomp.dcae.controller.service.cdap.cluster.service.ServicePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		controllerServiceDmaapDrsubServiceEClass.getESuperTypes().add(theVmPackage.getVirtualMachineService());
		controllerServiceDmaapDrsubServiceInstanceEClass.getESuperTypes().add(theVmPackage.getVirtualMachineServiceInstance());
		controllerServiceDmaapDrsubServiceInstanceEClass.getESuperTypes().add(this.getControllerServiceDmaapDrsubServiceConfiguration());

		// Initialize classes, features, and operations; add parameters
		initEClass(controllerServiceDmaapDrsubServiceEClass, ControllerServiceDmaapDrsubService.class, "ControllerServiceDmaapDrsubService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controllerServiceDmaapDrsubServiceInstanceEClass, ControllerServiceDmaapDrsubServiceInstance.class, "ControllerServiceDmaapDrsubServiceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerServiceDmaapDrsubServiceInstance_CdapClusterInstance(), theServicePackage_1.getCdapClusterServiceInstance(), null, "cdapClusterInstance", null, 0, 1, ControllerServiceDmaapDrsubServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceDmaapDrsubServiceInstance_CdapServiceName(), theEcorePackage.getEString(), "cdapServiceName", null, 0, 1, ControllerServiceDmaapDrsubServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerServiceDmaapDrsubServiceConfigurationEClass, ControllerServiceDmaapDrsubServiceConfiguration.class, "ControllerServiceDmaapDrsubServiceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControllerServiceDmaapDrsubServiceConfiguration_CdapUrl(), theEcorePackage.getEString(), "cdapUrl", null, 0, 1, ControllerServiceDmaapDrsubServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceDmaapDrsubServiceConfiguration_NumberOfCdapRecords(), theCorePackage.getIncreasingULongMetricAttribute(), "numberOfCdapRecords", null, 0, 1, ControllerServiceDmaapDrsubServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceDmaapDrsubServiceConfiguration_NumberOfCdapErrors(), theCorePackage.getIncreasingULongMetricAttribute(), "numberOfCdapErrors", null, 0, 1, ControllerServiceDmaapDrsubServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceDmaapDrsubServiceConfiguration_HdfsUri(), theEcorePackage.getEString(), "hdfsUri", null, 0, 1, ControllerServiceDmaapDrsubServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceDmaapDrsubServiceConfiguration_HdfsUriDescr(), theEcorePackage.getEString(), "hdfsUriDescr", null, 0, 1, ControllerServiceDmaapDrsubServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceDmaapDrsubServiceConfiguration_HdfsPersistLoc(), theEcorePackage.getEString(), "hdfsPersistLoc", null, 0, 1, ControllerServiceDmaapDrsubServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceDmaapDrsubServiceConfiguration_HdfsPersistLocDescr(), theEcorePackage.getEString(), "hdfsPersistLocDescr", null, 0, 1, ControllerServiceDmaapDrsubServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceDmaapDrsubServiceConfiguration_DmaapConfFile(), theEcorePackage.getEString(), "dmaapConfFile", null, 0, 1, ControllerServiceDmaapDrsubServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceDmaapDrsubServiceConfiguration_DmaapConfFileDescr(), theEcorePackage.getEString(), "dmaapConfFileDescr", null, 0, 1, ControllerServiceDmaapDrsubServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceDmaapDrsubServiceConfiguration_DmaapStreamid(), theEcorePackage.getEString(), "dmaapStreamid", null, 0, 1, ControllerServiceDmaapDrsubServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerServiceDmaapDrsubServiceConfiguration_DmaapStreamidDescr(), theEcorePackage.getEString(), "dmaapStreamidDescr", null, 0, 1, ControllerServiceDmaapDrsubServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// http://openecomp.org
		createEcompAnnotations();
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
	protected void createEcompAnnotations() {
		String source = "http://openecomp.org";	
		addAnnotation
		  (getControllerServiceDmaapDrsubServiceConfiguration_CdapUrl(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getControllerServiceDmaapDrsubServiceConfiguration_NumberOfCdapRecords(), 
		   source, 
		   new String[] {
			 "type", "operational"
		   });	
		addAnnotation
		  (getControllerServiceDmaapDrsubServiceConfiguration_NumberOfCdapErrors(), 
		   source, 
		   new String[] {
			 "type", "operational"
		   });	
		addAnnotation
		  (getControllerServiceDmaapDrsubServiceConfiguration_HdfsUri(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getControllerServiceDmaapDrsubServiceConfiguration_HdfsUriDescr(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getControllerServiceDmaapDrsubServiceConfiguration_HdfsPersistLoc(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getControllerServiceDmaapDrsubServiceConfiguration_HdfsPersistLocDescr(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getControllerServiceDmaapDrsubServiceConfiguration_DmaapConfFile(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getControllerServiceDmaapDrsubServiceConfiguration_DmaapConfFileDescr(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getControllerServiceDmaapDrsubServiceConfiguration_DmaapStreamid(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getControllerServiceDmaapDrsubServiceConfiguration_DmaapStreamidDescr(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });
	}

} //ServicePackageImpl
