
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
import org.openecomp.dcae.controller.service.cdap.CdapCreateAppStep;
import org.openecomp.dcae.controller.service.cdap.CdapCreateAppWithConfigStep;
import org.openecomp.dcae.controller.service.cdap.CdapDeleteAppStep;
import org.openecomp.dcae.controller.service.cdap.CdapDeleteArtifact;
import org.openecomp.dcae.controller.service.cdap.CdapDeployAppStep;
import org.openecomp.dcae.controller.service.cdap.CdapFactory;
import org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration;
import org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep;
import org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactWithConfigStep;
import org.openecomp.dcae.controller.service.cdap.CdapPackage;
import org.openecomp.dcae.controller.service.cdap.CdapResumeScheduleStep;
import org.openecomp.dcae.controller.service.cdap.CdapService;
import org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor;
import org.openecomp.dcae.controller.service.cdap.CdapServiceInstance;
import org.openecomp.dcae.controller.service.cdap.CdapServiceInstanceConfiguration;
import org.openecomp.dcae.controller.service.cdap.CdapStartAppStep;
import org.openecomp.dcae.controller.service.cdap.CdapStartFlowStep;
import org.openecomp.dcae.controller.service.cdap.CdapStartServiceStep;
import org.openecomp.dcae.controller.service.cdap.CdapStartWorkerStep;
import org.openecomp.dcae.controller.service.cdap.CdapStep;
import org.openecomp.dcae.controller.service.cdap.CdapStopAppStep;
import org.openecomp.dcae.controller.service.cdap.CdapStopFlowStep;
import org.openecomp.dcae.controller.service.cdap.CdapStopServiceStep;
import org.openecomp.dcae.controller.service.cdap.CdapStopWorkerStep;
import org.openecomp.dcae.controller.service.cdap.CdapSuspendScheduleStep;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapLoadArtifactStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapLoadArtifactWithConfigStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapCreateAppStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapCreateAppWithConfigStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapDeployAppStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapStopFlowStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapStopWorkerStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapStopServiceStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapStopAppStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapStartFlowStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapStartWorkerStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapStartServiceStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapStartAppStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapDeleteAppStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapDeleteArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapSuspendScheduleStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapResumeScheduleStepEClass = null;

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
		return (EReference)cdapServiceInstanceEClass.getEStructuralFeatures().get(17);
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
	public EReference getCdapServiceInstance_DeploySteps() {
		return (EReference)cdapServiceInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapServiceInstance_UndeploySteps() {
		return (EReference)cdapServiceInstanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapServiceInstance_PreConfigurationSteps() {
		return (EReference)cdapServiceInstanceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapServiceInstance_PostConfigurationSteps() {
		return (EReference)cdapServiceInstanceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapServiceInstance_AppNames() {
		return (EAttribute)cdapServiceInstanceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapServiceInstance_WorkerNames() {
		return (EAttribute)cdapServiceInstanceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapServiceInstance_FlowNames() {
		return (EAttribute)cdapServiceInstanceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapServiceInstance_ServiceNames() {
		return (EAttribute)cdapServiceInstanceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapServiceInstance_Configuration() {
		return (EReference)cdapServiceInstanceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapServiceInstance_CdapConfiguration() {
		return (EReference)cdapServiceInstanceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapServiceInstance_ClusterService() {
		return (EReference)cdapServiceInstanceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapServiceInstance_Service() {
		return (EReference)cdapServiceInstanceEClass.getEStructuralFeatures().get(18);
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
	public EClass getCdapStep() {
		return cdapStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapLoadArtifactStep() {
		return cdapLoadArtifactStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapLoadArtifactStep_ArtifactName() {
		return (EAttribute)cdapLoadArtifactStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapLoadArtifactStep_Jarfile() {
		return (EAttribute)cdapLoadArtifactStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapLoadArtifactStep_Version() {
		return (EAttribute)cdapLoadArtifactStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapLoadArtifactWithConfigStep() {
		return cdapLoadArtifactWithConfigStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapLoadArtifactWithConfigStep_Config() {
		return (EAttribute)cdapLoadArtifactWithConfigStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapCreateAppStep() {
		return cdapCreateAppStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapCreateAppStep_AppId() {
		return (EAttribute)cdapCreateAppStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapCreateAppStep_ArtifactName() {
		return (EAttribute)cdapCreateAppStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapCreateAppStep_Version() {
		return (EAttribute)cdapCreateAppStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapCreateAppStep_Scope() {
		return (EAttribute)cdapCreateAppStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapCreateAppWithConfigStep() {
		return cdapCreateAppWithConfigStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapCreateAppWithConfigStep_AppConfig() {
		return (EAttribute)cdapCreateAppWithConfigStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapDeployAppStep() {
		return cdapDeployAppStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapDeployAppStep_Jarfile() {
		return (EAttribute)cdapDeployAppStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapStopFlowStep() {
		return cdapStopFlowStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapStopFlowStep_AppId() {
		return (EAttribute)cdapStopFlowStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapStopFlowStep_FlowId() {
		return (EAttribute)cdapStopFlowStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapStopWorkerStep() {
		return cdapStopWorkerStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapStopWorkerStep_AppId() {
		return (EAttribute)cdapStopWorkerStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapStopWorkerStep_WorkerId() {
		return (EAttribute)cdapStopWorkerStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapStopServiceStep() {
		return cdapStopServiceStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapStopServiceStep_AppId() {
		return (EAttribute)cdapStopServiceStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapStopServiceStep_ServiceId() {
		return (EAttribute)cdapStopServiceStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapStopAppStep() {
		return cdapStopAppStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapStopAppStep_AppId() {
		return (EAttribute)cdapStopAppStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapStartFlowStep() {
		return cdapStartFlowStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapStartFlowStep_AppId() {
		return (EAttribute)cdapStartFlowStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapStartFlowStep_FlowId() {
		return (EAttribute)cdapStartFlowStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapStartFlowStep_ExtraArgs() {
		return (EAttribute)cdapStartFlowStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapStartWorkerStep() {
		return cdapStartWorkerStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapStartWorkerStep_AppId() {
		return (EAttribute)cdapStartWorkerStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapStartWorkerStep_WorkerId() {
		return (EAttribute)cdapStartWorkerStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapStartWorkerStep_ExtraArgs() {
		return (EAttribute)cdapStartWorkerStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapStartServiceStep() {
		return cdapStartServiceStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapStartServiceStep_AppId() {
		return (EAttribute)cdapStartServiceStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapStartServiceStep_ServiceId() {
		return (EAttribute)cdapStartServiceStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapStartServiceStep_ExtraArgs() {
		return (EAttribute)cdapStartServiceStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapStartAppStep() {
		return cdapStartAppStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapStartAppStep_AppId() {
		return (EAttribute)cdapStartAppStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapDeleteAppStep() {
		return cdapDeleteAppStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapDeleteAppStep_AppId() {
		return (EAttribute)cdapDeleteAppStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapDeleteArtifact() {
		return cdapDeleteArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapDeleteArtifact_ArtifactName() {
		return (EAttribute)cdapDeleteArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapDeleteArtifact_Version() {
		return (EAttribute)cdapDeleteArtifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapSuspendScheduleStep() {
		return cdapSuspendScheduleStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapSuspendScheduleStep_AppId() {
		return (EAttribute)cdapSuspendScheduleStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapSuspendScheduleStep_ScheduleId() {
		return (EAttribute)cdapSuspendScheduleStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapResumeScheduleStep() {
		return cdapResumeScheduleStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapResumeScheduleStep_AppId() {
		return (EAttribute)cdapResumeScheduleStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapResumeScheduleStep_ScheduleId() {
		return (EAttribute)cdapResumeScheduleStepEClass.getEStructuralFeatures().get(1);
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
		createEReference(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__DEPLOY_STEPS);
		createEReference(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__UNDEPLOY_STEPS);
		createEReference(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__PRE_CONFIGURATION_STEPS);
		createEReference(cdapServiceInstanceEClass, CDAP_SERVICE_INSTANCE__POST_CONFIGURATION_STEPS);
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

		cdapStepEClass = createEClass(CDAP_STEP);

		cdapLoadArtifactStepEClass = createEClass(CDAP_LOAD_ARTIFACT_STEP);
		createEAttribute(cdapLoadArtifactStepEClass, CDAP_LOAD_ARTIFACT_STEP__ARTIFACT_NAME);
		createEAttribute(cdapLoadArtifactStepEClass, CDAP_LOAD_ARTIFACT_STEP__JARFILE);
		createEAttribute(cdapLoadArtifactStepEClass, CDAP_LOAD_ARTIFACT_STEP__VERSION);

		cdapLoadArtifactWithConfigStepEClass = createEClass(CDAP_LOAD_ARTIFACT_WITH_CONFIG_STEP);
		createEAttribute(cdapLoadArtifactWithConfigStepEClass, CDAP_LOAD_ARTIFACT_WITH_CONFIG_STEP__CONFIG);

		cdapCreateAppStepEClass = createEClass(CDAP_CREATE_APP_STEP);
		createEAttribute(cdapCreateAppStepEClass, CDAP_CREATE_APP_STEP__APP_ID);
		createEAttribute(cdapCreateAppStepEClass, CDAP_CREATE_APP_STEP__ARTIFACT_NAME);
		createEAttribute(cdapCreateAppStepEClass, CDAP_CREATE_APP_STEP__VERSION);
		createEAttribute(cdapCreateAppStepEClass, CDAP_CREATE_APP_STEP__SCOPE);

		cdapCreateAppWithConfigStepEClass = createEClass(CDAP_CREATE_APP_WITH_CONFIG_STEP);
		createEAttribute(cdapCreateAppWithConfigStepEClass, CDAP_CREATE_APP_WITH_CONFIG_STEP__APP_CONFIG);

		cdapDeployAppStepEClass = createEClass(CDAP_DEPLOY_APP_STEP);
		createEAttribute(cdapDeployAppStepEClass, CDAP_DEPLOY_APP_STEP__JARFILE);

		cdapStopFlowStepEClass = createEClass(CDAP_STOP_FLOW_STEP);
		createEAttribute(cdapStopFlowStepEClass, CDAP_STOP_FLOW_STEP__APP_ID);
		createEAttribute(cdapStopFlowStepEClass, CDAP_STOP_FLOW_STEP__FLOW_ID);

		cdapStopWorkerStepEClass = createEClass(CDAP_STOP_WORKER_STEP);
		createEAttribute(cdapStopWorkerStepEClass, CDAP_STOP_WORKER_STEP__APP_ID);
		createEAttribute(cdapStopWorkerStepEClass, CDAP_STOP_WORKER_STEP__WORKER_ID);

		cdapStopServiceStepEClass = createEClass(CDAP_STOP_SERVICE_STEP);
		createEAttribute(cdapStopServiceStepEClass, CDAP_STOP_SERVICE_STEP__APP_ID);
		createEAttribute(cdapStopServiceStepEClass, CDAP_STOP_SERVICE_STEP__SERVICE_ID);

		cdapStopAppStepEClass = createEClass(CDAP_STOP_APP_STEP);
		createEAttribute(cdapStopAppStepEClass, CDAP_STOP_APP_STEP__APP_ID);

		cdapStartFlowStepEClass = createEClass(CDAP_START_FLOW_STEP);
		createEAttribute(cdapStartFlowStepEClass, CDAP_START_FLOW_STEP__APP_ID);
		createEAttribute(cdapStartFlowStepEClass, CDAP_START_FLOW_STEP__FLOW_ID);
		createEAttribute(cdapStartFlowStepEClass, CDAP_START_FLOW_STEP__EXTRA_ARGS);

		cdapStartWorkerStepEClass = createEClass(CDAP_START_WORKER_STEP);
		createEAttribute(cdapStartWorkerStepEClass, CDAP_START_WORKER_STEP__APP_ID);
		createEAttribute(cdapStartWorkerStepEClass, CDAP_START_WORKER_STEP__WORKER_ID);
		createEAttribute(cdapStartWorkerStepEClass, CDAP_START_WORKER_STEP__EXTRA_ARGS);

		cdapStartServiceStepEClass = createEClass(CDAP_START_SERVICE_STEP);
		createEAttribute(cdapStartServiceStepEClass, CDAP_START_SERVICE_STEP__APP_ID);
		createEAttribute(cdapStartServiceStepEClass, CDAP_START_SERVICE_STEP__SERVICE_ID);
		createEAttribute(cdapStartServiceStepEClass, CDAP_START_SERVICE_STEP__EXTRA_ARGS);

		cdapStartAppStepEClass = createEClass(CDAP_START_APP_STEP);
		createEAttribute(cdapStartAppStepEClass, CDAP_START_APP_STEP__APP_ID);

		cdapDeleteAppStepEClass = createEClass(CDAP_DELETE_APP_STEP);
		createEAttribute(cdapDeleteAppStepEClass, CDAP_DELETE_APP_STEP__APP_ID);

		cdapDeleteArtifactEClass = createEClass(CDAP_DELETE_ARTIFACT);
		createEAttribute(cdapDeleteArtifactEClass, CDAP_DELETE_ARTIFACT__ARTIFACT_NAME);
		createEAttribute(cdapDeleteArtifactEClass, CDAP_DELETE_ARTIFACT__VERSION);

		cdapSuspendScheduleStepEClass = createEClass(CDAP_SUSPEND_SCHEDULE_STEP);
		createEAttribute(cdapSuspendScheduleStepEClass, CDAP_SUSPEND_SCHEDULE_STEP__APP_ID);
		createEAttribute(cdapSuspendScheduleStepEClass, CDAP_SUSPEND_SCHEDULE_STEP__SCHEDULE_ID);

		cdapResumeScheduleStepEClass = createEClass(CDAP_RESUME_SCHEDULE_STEP);
		createEAttribute(cdapResumeScheduleStepEClass, CDAP_RESUME_SCHEDULE_STEP__APP_ID);
		createEAttribute(cdapResumeScheduleStepEClass, CDAP_RESUME_SCHEDULE_STEP__SCHEDULE_ID);
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
		cdapStepEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		cdapLoadArtifactStepEClass.getESuperTypes().add(this.getCdapStep());
		cdapLoadArtifactWithConfigStepEClass.getESuperTypes().add(this.getCdapLoadArtifactStep());
		cdapCreateAppStepEClass.getESuperTypes().add(this.getCdapStep());
		cdapCreateAppWithConfigStepEClass.getESuperTypes().add(this.getCdapCreateAppStep());
		cdapDeployAppStepEClass.getESuperTypes().add(this.getCdapStep());
		cdapStopFlowStepEClass.getESuperTypes().add(this.getCdapStep());
		cdapStopWorkerStepEClass.getESuperTypes().add(this.getCdapStep());
		cdapStopServiceStepEClass.getESuperTypes().add(this.getCdapStep());
		cdapStopAppStepEClass.getESuperTypes().add(this.getCdapStep());
		cdapStartFlowStepEClass.getESuperTypes().add(this.getCdapStep());
		cdapStartWorkerStepEClass.getESuperTypes().add(this.getCdapStep());
		cdapStartServiceStepEClass.getESuperTypes().add(this.getCdapStep());
		cdapStartAppStepEClass.getESuperTypes().add(this.getCdapStep());
		cdapDeleteAppStepEClass.getESuperTypes().add(this.getCdapStep());
		cdapDeleteArtifactEClass.getESuperTypes().add(this.getCdapStep());
		cdapSuspendScheduleStepEClass.getESuperTypes().add(this.getCdapStep());
		cdapResumeScheduleStepEClass.getESuperTypes().add(this.getCdapStep());

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
		initEReference(getCdapServiceInstance_DeploySteps(), this.getCdapStep(), null, "deploySteps", null, 0, -1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCdapServiceInstance_UndeploySteps(), this.getCdapStep(), null, "undeploySteps", null, 0, -1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCdapServiceInstance_PreConfigurationSteps(), this.getCdapStep(), null, "preConfigurationSteps", null, 0, -1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCdapServiceInstance_PostConfigurationSteps(), this.getCdapStep(), null, "postConfigurationSteps", null, 0, -1, CdapServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(cdapStepEClass, CdapStep.class, "CdapStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdapLoadArtifactStepEClass, CdapLoadArtifactStep.class, "CdapLoadArtifactStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapLoadArtifactStep_ArtifactName(), theEcorePackage.getEString(), "artifactName", null, 0, 1, CdapLoadArtifactStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapLoadArtifactStep_Jarfile(), theEcorePackage.getEString(), "jarfile", null, 0, 1, CdapLoadArtifactStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapLoadArtifactStep_Version(), theEcorePackage.getEString(), "version", null, 0, 1, CdapLoadArtifactStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapLoadArtifactWithConfigStepEClass, CdapLoadArtifactWithConfigStep.class, "CdapLoadArtifactWithConfigStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapLoadArtifactWithConfigStep_Config(), theEcorePackage.getEString(), "config", null, 0, 1, CdapLoadArtifactWithConfigStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapCreateAppStepEClass, CdapCreateAppStep.class, "CdapCreateAppStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapCreateAppStep_AppId(), theEcorePackage.getEString(), "appId", null, 0, 1, CdapCreateAppStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapCreateAppStep_ArtifactName(), theEcorePackage.getEString(), "artifactName", null, 0, 1, CdapCreateAppStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapCreateAppStep_Version(), theEcorePackage.getEString(), "version", null, 0, 1, CdapCreateAppStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapCreateAppStep_Scope(), theEcorePackage.getEString(), "scope", null, 0, 1, CdapCreateAppStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapCreateAppWithConfigStepEClass, CdapCreateAppWithConfigStep.class, "CdapCreateAppWithConfigStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapCreateAppWithConfigStep_AppConfig(), theEcorePackage.getEString(), "appConfig", null, 0, 1, CdapCreateAppWithConfigStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapDeployAppStepEClass, CdapDeployAppStep.class, "CdapDeployAppStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapDeployAppStep_Jarfile(), theEcorePackage.getEString(), "jarfile", null, 0, 1, CdapDeployAppStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapStopFlowStepEClass, CdapStopFlowStep.class, "CdapStopFlowStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapStopFlowStep_AppId(), theEcorePackage.getEString(), "appId", null, 0, 1, CdapStopFlowStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapStopFlowStep_FlowId(), theEcorePackage.getEString(), "flowId", null, 0, 1, CdapStopFlowStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapStopWorkerStepEClass, CdapStopWorkerStep.class, "CdapStopWorkerStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapStopWorkerStep_AppId(), theEcorePackage.getEString(), "appId", null, 0, 1, CdapStopWorkerStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapStopWorkerStep_WorkerId(), theEcorePackage.getEString(), "workerId", null, 0, 1, CdapStopWorkerStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapStopServiceStepEClass, CdapStopServiceStep.class, "CdapStopServiceStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapStopServiceStep_AppId(), theEcorePackage.getEString(), "appId", null, 0, 1, CdapStopServiceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapStopServiceStep_ServiceId(), theEcorePackage.getEString(), "serviceId", null, 0, 1, CdapStopServiceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapStopAppStepEClass, CdapStopAppStep.class, "CdapStopAppStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapStopAppStep_AppId(), theEcorePackage.getEString(), "appId", null, 0, 1, CdapStopAppStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapStartFlowStepEClass, CdapStartFlowStep.class, "CdapStartFlowStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapStartFlowStep_AppId(), theEcorePackage.getEString(), "appId", null, 0, 1, CdapStartFlowStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapStartFlowStep_FlowId(), theEcorePackage.getEString(), "flowId", null, 0, 1, CdapStartFlowStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapStartFlowStep_ExtraArgs(), theEcorePackage.getEString(), "extraArgs", null, 0, 1, CdapStartFlowStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapStartWorkerStepEClass, CdapStartWorkerStep.class, "CdapStartWorkerStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapStartWorkerStep_AppId(), theEcorePackage.getEString(), "appId", null, 0, 1, CdapStartWorkerStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapStartWorkerStep_WorkerId(), theEcorePackage.getEString(), "workerId", null, 0, 1, CdapStartWorkerStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapStartWorkerStep_ExtraArgs(), theEcorePackage.getEString(), "extraArgs", null, 0, 1, CdapStartWorkerStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapStartServiceStepEClass, CdapStartServiceStep.class, "CdapStartServiceStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapStartServiceStep_AppId(), theEcorePackage.getEString(), "appId", null, 0, 1, CdapStartServiceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapStartServiceStep_ServiceId(), theEcorePackage.getEString(), "serviceId", null, 0, 1, CdapStartServiceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapStartServiceStep_ExtraArgs(), theEcorePackage.getEString(), "extraArgs", null, 0, 1, CdapStartServiceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapStartAppStepEClass, CdapStartAppStep.class, "CdapStartAppStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapStartAppStep_AppId(), theEcorePackage.getEString(), "appId", null, 0, 1, CdapStartAppStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapDeleteAppStepEClass, CdapDeleteAppStep.class, "CdapDeleteAppStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapDeleteAppStep_AppId(), theEcorePackage.getEString(), "appId", null, 0, 1, CdapDeleteAppStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapDeleteArtifactEClass, CdapDeleteArtifact.class, "CdapDeleteArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapDeleteArtifact_ArtifactName(), theEcorePackage.getEString(), "artifactName", null, 0, 1, CdapDeleteArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapDeleteArtifact_Version(), theEcorePackage.getEString(), "version", null, 0, 1, CdapDeleteArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapSuspendScheduleStepEClass, CdapSuspendScheduleStep.class, "CdapSuspendScheduleStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapSuspendScheduleStep_AppId(), theEcorePackage.getEString(), "appId", null, 0, 1, CdapSuspendScheduleStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapSuspendScheduleStep_ScheduleId(), theEcorePackage.getEString(), "scheduleId", null, 0, 1, CdapSuspendScheduleStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapResumeScheduleStepEClass, CdapResumeScheduleStep.class, "CdapResumeScheduleStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapResumeScheduleStep_AppId(), theEcorePackage.getEString(), "appId", null, 0, 1, CdapResumeScheduleStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapResumeScheduleStep_ScheduleId(), theEcorePackage.getEString(), "scheduleId", null, 0, 1, CdapResumeScheduleStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
	protected void createOpenecompAnnotations() {
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
