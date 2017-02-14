
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
package org.openecomp.dcae.controller.service.cdap.impl;

import org.openecomp.dcae.controller.core.service.ServicePackage;
import org.openecomp.dcae.controller.service.cdap.CdapApplication;
import org.openecomp.dcae.controller.service.cdap.CdapArtifact;
import org.openecomp.dcae.controller.service.cdap.CdapFactory;
import org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration;
import org.openecomp.dcae.controller.service.cdap.CdapPackage;
import org.openecomp.dcae.controller.service.cdap.CdapService;
import org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor;
import org.openecomp.dcae.controller.service.cdap.CdapServiceInstance;
import org.openecomp.dcae.controller.service.cdap.CdapServiceInstanceConfiguration;
import org.openecomp.ncomp.core.CorePackage;
import org.eclipse.emf.ecore.EAttribute;
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
public class CdapPackageImpl extends EPackageImpl implements CdapPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapServiceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapServiceInstanceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapInternalApplicationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapServiceDescriptorEClass = null;

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
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CdapPackageImpl() {
		super(eNS_URI, CdapFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CdapPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CdapPackage init() {
		if (isInited) return (CdapPackage)EPackage.Registry.INSTANCE.getEPackage(CdapPackage.eNS_URI);

		// Obtain or create and register package
		CdapPackageImpl theCdapPackage = (CdapPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CdapPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CdapPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		org.openecomp.dcae.controller.service.cdap.cluster.service.ServicePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCdapPackage.createPackageContents();

		// Initialize created meta-data
		theCdapPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCdapPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CdapPackage.eNS_URI, theCdapPackage);
		return theCdapPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapService() {
		return cdapServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapService_Instances() {
		return (EReference)cdapServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapService__UpdateInstanceConfiguration__String() {
		return cdapServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapServiceInstance() {
		return cdapServiceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapServiceInstance_CdapName() {
		return (EAttribute)cdapServiceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapServiceInstance_CdapNamespace() {
		return (EReference)cdapServiceInstanceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapServiceInstance_Namespace() {
		return (EAttribute)cdapServiceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapServiceInstance_AppJar() {
		return (EAttribute)cdapServiceInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapServiceInstance_AppConfigFile() {
		return (EAttribute)cdapServiceInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapServiceInstance_Artifacts() {
		return (EReference)cdapServiceInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapServiceInstance_Apps() {
		return (EReference)cdapServiceInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapServiceInstance_AppNames() {
		return (EAttribute)cdapServiceInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapServiceInstance_WorkerNames() {
		return (EAttribute)cdapServiceInstanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapServiceInstance_FlowNames() {
		return (EAttribute)cdapServiceInstanceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapServiceInstance_ServiceNames() {
		return (EAttribute)cdapServiceInstanceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapServiceInstance_Configuration() {
		return (EReference)cdapServiceInstanceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapServiceInstance_CdapConfiguration() {
		return (EReference)cdapServiceInstanceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapServiceInstance_ClusterService() {
		return (EReference)cdapServiceInstanceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapServiceInstance_Service() {
		return (EReference)cdapServiceInstanceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapApplication() {
		return cdapApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapApplication_JarFile() {
		return (EAttribute)cdapApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapApplication_ArtifactName() {
		return (EAttribute)cdapApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapApplication_Version() {
		return (EAttribute)cdapApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapApplication_AppConfigFileContent() {
		return (EAttribute)cdapApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapArtifact() {
		return cdapArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapArtifact_JarFile() {
		return (EAttribute)cdapArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapArtifact_Version() {
		return (EAttribute)cdapArtifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapServiceInstanceConfiguration() {
		return cdapServiceInstanceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapInternalApplicationConfiguration() {
		return cdapInternalApplicationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapInternalApplicationConfiguration_Config() {
		return (EReference)cdapInternalApplicationConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapInternalApplicationConfiguration_Preferences() {
		return (EReference)cdapInternalApplicationConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapInternalApplicationConfiguration_Apps() {
		return (EReference)cdapInternalApplicationConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapInternalApplicationConfiguration_Workers() {
		return (EReference)cdapInternalApplicationConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapInternalApplicationConfiguration_Flows() {
		return (EReference)cdapInternalApplicationConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapInternalApplicationConfiguration_Services() {
		return (EReference)cdapInternalApplicationConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapServiceDescriptor() {
		return cdapServiceDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapServiceDescriptor_ServicePackage() {
		return (EAttribute)cdapServiceDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapServiceDescriptor_ServiceClass() {
		return (EAttribute)cdapServiceDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapServiceDescriptor_ServiceInstanceClass() {
		return (EAttribute)cdapServiceDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapServiceDescriptor_JarFile() {
		return (EAttribute)cdapServiceDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapFactory getCdapFactory() {
		return (CdapFactory)getEFactoryInstance();
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
		cdapServiceEClass = createEClass(CDAP_SERVICE);
		createEReference(cdapServiceEClass, CDAP_SERVICE__INSTANCES);
		createEOperation(cdapServiceEClass, CDAP_SERVICE___UPDATE_INSTANCE_CONFIGURATION__STRING);

		cdapServiceInstanceEClass = createEClass(CDAP_SERVICE_INSTANCE);
		createEAttribute(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__CDAP_NAME);
		createEAttribute(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__NAMESPACE);
		createEAttribute(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__APP_JAR);
		createEAttribute(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__APP_CONFIG_FILE);
		createEReference(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__ARTIFACTS);
		createEReference(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__APPS);
		createEAttribute(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__APP_NAMES);
		createEAttribute(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__WORKER_NAMES);
		createEAttribute(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__FLOW_NAMES);
		createEAttribute(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__SERVICE_NAMES);
		createEReference(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__CONFIGURATION);
		createEReference(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__CDAP_CONFIGURATION);
		createEReference(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__CLUSTER_SERVICE);
		createEReference(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__CDAP_NAMESPACE);
		createEReference(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__SERVICE);

		cdapApplicationEClass = createEClass(CDAP_APPLICATION);
		createEAttribute(cdapApplicationEClass, CDAP_APPLICATION__JAR_FILE);
		createEAttribute(cdapApplicationEClass, CDAP_APPLICATION__ARTIFACT_NAME);
		createEAttribute(cdapApplicationEClass, CDAP_APPLICATION__VERSION);
		createEAttribute(cdapApplicationEClass, CDAP_APPLICATION__APP_CONFIG_FILE_CONTENT);

		cdapArtifactEClass = createEClass(CDAP_ARTIFACT);
		createEAttribute(cdapArtifactEClass, CDAP_ARTIFACT__JAR_FILE);
		createEAttribute(cdapArtifactEClass, CDAP_ARTIFACT__VERSION);

		cdapServiceInstanceConfigurationEClass = createEClass(CDAP_SERVICE_INSTANCE_CONFIGURATION);

		cdapInternalApplicationConfigurationEClass = createEClass(CDAP_INTERNAL_APPLICATION_CONFIGURATION);
		createEReference(cdapInternalApplicationConfigurationEClass, CDAP_INTERNAL_APPLICATION_CONFIGURATION__CONFIG);
		createEReference(cdapInternalApplicationConfigurationEClass, CDAP_INTERNAL_APPLICATION_CONFIGURATION__PREFERENCES);
		createEReference(cdapInternalApplicationConfigurationEClass, CDAP_INTERNAL_APPLICATION_CONFIGURATION__APPS);
		createEReference(cdapInternalApplicationConfigurationEClass, CDAP_INTERNAL_APPLICATION_CONFIGURATION__WORKERS);
		createEReference(cdapInternalApplicationConfigurationEClass, CDAP_INTERNAL_APPLICATION_CONFIGURATION__FLOWS);
		createEReference(cdapInternalApplicationConfigurationEClass, CDAP_INTERNAL_APPLICATION_CONFIGURATION__SERVICES);

		cdapServiceDescriptorEClass = createEClass(CDAP_SERVICE_DESCRIPTOR);
		createEAttribute(cdapServiceDescriptorEClass, CDAP_SERVICE_DESCRIPTOR__SERVICE_PACKAGE);
		createEAttribute(cdapServiceDescriptorEClass, CDAP_SERVICE_DESCRIPTOR__SERVICE_CLASS);
		createEAttribute(cdapServiceDescriptorEClass, CDAP_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS);
		createEAttribute(cdapServiceDescriptorEClass, CDAP_SERVICE_DESCRIPTOR__JAR_FILE);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		org.openecomp.dcae.controller.service.cdap.cluster.service.ServicePackage theServicePackage = (org.openecomp.dcae.controller.service.cdap.cluster.service.ServicePackage)EPackage.Registry.INSTANCE.getEPackage(org.openecomp.dcae.controller.service.cdap.cluster.service.ServicePackage.eNS_URI);
		org.openecomp.ncomp.cdap.CdapPackage theCdapPackage_1 = (org.openecomp.ncomp.cdap.CdapPackage)EPackage.Registry.INSTANCE.getEPackage(org.openecomp.ncomp.cdap.CdapPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cdapServiceEClass.getESuperTypes().add(theServicePackage_1.getDcaeService());
		cdapServiceInstanceEClass.getESuperTypes().add(theServicePackage_1.getDcaeServiceInstance());
		cdapApplicationEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		cdapArtifactEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		cdapServiceDescriptorEClass.getESuperTypes().add(theServicePackage_1.getDcaeServiceDescriptor());

		// Initialize classes, features, and operations; add parameters
		initEClass(cdapServiceEClass, CdapService.class, "CdapService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCdapService_Instances(), this.getCdapServiceInstance(), this.getCdapServiceInstance_Service(), "instances", null, 0, -1, CdapService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCdapService__UpdateInstanceConfiguration__String(), null, "updateInstanceConfiguration", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "instanceName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(cdapServiceInstanceEClass, CdapServiceInstance.class, "CdapServiceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapServiceInstance_CdapName(), theEcorePackage.getEString(), "cdapName", null, 0, 1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapServiceInstance_Namespace(), theEcorePackage.getEString(), "namespace", null, 0, 1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapServiceInstance_AppJar(), theEcorePackage.getEString(), "appJar", null, 0, 1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapServiceInstance_AppConfigFile(), theEcorePackage.getEString(), "appConfigFile", null, 0, 1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCdapServiceInstance_Artifacts(), this.getCdapArtifact(), null, "artifacts", null, 0, -1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCdapServiceInstance_Apps(), this.getCdapApplication(), null, "apps", null, 0, -1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapServiceInstance_AppNames(), theEcorePackage.getEString(), "appNames", null, 0, -1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapServiceInstance_WorkerNames(), theEcorePackage.getEString(), "workerNames", null, 0, -1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapServiceInstance_FlowNames(), theEcorePackage.getEString(), "flowNames", null, 0, -1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapServiceInstance_ServiceNames(), theEcorePackage.getEString(), "serviceNames", null, 0, -1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCdapServiceInstance_Configuration(), this.getCdapServiceInstanceConfiguration(), null, "configuration", null, 0, 1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCdapServiceInstance_CdapConfiguration(), this.getCdapInternalApplicationConfiguration(), null, "cdapConfiguration", null, 0, 1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCdapServiceInstance_ClusterService(), theServicePackage.getCdapClusterServiceInstance(), null, "clusterService", null, 0, 1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCdapServiceInstance_CdapNamespace(), theCdapPackage_1.getCdapNamespace(), null, "cdapNamespace", null, 0, 1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCdapServiceInstance_Service(), this.getCdapService(), this.getCdapService_Instances(), "service", null, 0, 1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapApplicationEClass, CdapApplication.class, "CdapApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapApplication_JarFile(), theEcorePackage.getEString(), "jarFile", null, 0, 1, CdapApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapApplication_ArtifactName(), theEcorePackage.getEString(), "artifactName", null, 0, 1, CdapApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapApplication_Version(), theEcorePackage.getEString(), "version", null, 0, 1, CdapApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapApplication_AppConfigFileContent(), theEcorePackage.getEString(), "appConfigFileContent", null, 0, 1, CdapApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapArtifactEClass, CdapArtifact.class, "CdapArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapArtifact_JarFile(), theEcorePackage.getEString(), "jarFile", null, 0, 1, CdapArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapArtifact_Version(), theEcorePackage.getEString(), "version", null, 0, 1, CdapArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapServiceInstanceConfigurationEClass, CdapServiceInstanceConfiguration.class, "CdapServiceInstanceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdapInternalApplicationConfigurationEClass, CdapInternalApplicationConfiguration.class, "CdapInternalApplicationConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCdapInternalApplicationConfiguration_Config(), theCdapPackage_1.getCdapKeyPair(), null, "config", null, 0, -1, CdapInternalApplicationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCdapInternalApplicationConfiguration_Preferences(), theCdapPackage_1.getCdapKeyPair(), null, "preferences", null, 0, -1, CdapInternalApplicationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCdapInternalApplicationConfiguration_Apps(), theCdapPackage_1.getCdapEntityWithPreferences(), null, "apps", null, 0, -1, CdapInternalApplicationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCdapInternalApplicationConfiguration_Workers(), theCdapPackage_1.getCdapEntityWithPreferences(), null, "workers", null, 0, -1, CdapInternalApplicationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCdapInternalApplicationConfiguration_Flows(), theCdapPackage_1.getCdapEntityWithPreferences(), null, "flows", null, 0, -1, CdapInternalApplicationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCdapInternalApplicationConfiguration_Services(), theCdapPackage_1.getCdapEntityWithPreferences(), null, "services", null, 0, -1, CdapInternalApplicationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cdapServiceDescriptorEClass, CdapServiceDescriptor.class, "CdapServiceDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapServiceDescriptor_ServicePackage(), theEcorePackage.getEString(), "servicePackage", null, 0, 1, CdapServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapServiceDescriptor_ServiceClass(), theEcorePackage.getEString(), "serviceClass", null, 0, 1, CdapServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapServiceDescriptor_ServiceInstanceClass(), theEcorePackage.getEString(), "serviceInstanceClass", null, 0, 1, CdapServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapServiceDescriptor_JarFile(), theEcorePackage.getEString(), "jarFile", null, 0, 1, CdapServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "ecomp", "http://openecomp.org",
			 "cdap", "http://openecomp.org/cdap"
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
		  (getCdapServiceInstance_Configuration(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getCdapServiceInstance_CdapConfiguration(), 
		   source, 
		   new String[] {
			 "type", "operational"
		   });	
		addAnnotation
		  (getCdapServiceInstance_ClusterService(), 
		   source, 
		   new String[] {
			 "type", "operational"
		   });	
		addAnnotation
		  (getCdapServiceInstance_CdapNamespace(), 
		   source, 
		   new String[] {
			 "type", "operational"
		   });	
		addAnnotation
		  (getCdapServiceInstance_Service(), 
		   source, 
		   new String[] {
			 "type", "operational"
		   });
	}

} //CdapPackageImpl
