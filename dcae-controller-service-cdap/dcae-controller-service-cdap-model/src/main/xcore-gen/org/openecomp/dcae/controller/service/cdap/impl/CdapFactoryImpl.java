
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

import org.openecomp.dcae.controller.service.cdap.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CdapFactoryImpl extends EFactoryImpl implements CdapFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CdapFactory init() {
		try {
			CdapFactory theCdapFactory = (CdapFactory)EPackage.Registry.INSTANCE.getEFactory(CdapPackage.eNS_URI);
			if (theCdapFactory != null) {
				return theCdapFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CdapFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CdapPackage.CDAP_SERVICE: return createCdapService();
			case CdapPackage.CDAP_SERVICE_INSTANCE: return createCdapServiceInstance();
			case CdapPackage.CDAP_APPLICATION: return createCdapApplication();
			case CdapPackage.CDAP_ARTIFACT: return createCdapArtifact();
			case CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION: return createCdapServiceInstanceConfiguration();
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION: return createCdapInternalApplicationConfiguration();
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR: return createCdapServiceDescriptor();
			case CdapPackage.CDAP_LOAD_ARTIFACT_STEP: return createCdapLoadArtifactStep();
			case CdapPackage.CDAP_LOAD_ARTIFACT_WITH_CONFIG_STEP: return createCdapLoadArtifactWithConfigStep();
			case CdapPackage.CDAP_CREATE_APP_STEP: return createCdapCreateAppStep();
			case CdapPackage.CDAP_CREATE_APP_WITH_CONFIG_STEP: return createCdapCreateAppWithConfigStep();
			case CdapPackage.CDAP_DEPLOY_APP_STEP: return createCdapDeployAppStep();
			case CdapPackage.CDAP_STOP_FLOW_STEP: return createCdapStopFlowStep();
			case CdapPackage.CDAP_STOP_WORKER_STEP: return createCdapStopWorkerStep();
			case CdapPackage.CDAP_STOP_SERVICE_STEP: return createCdapStopServiceStep();
			case CdapPackage.CDAP_STOP_APP_STEP: return createCdapStopAppStep();
			case CdapPackage.CDAP_START_FLOW_STEP: return createCdapStartFlowStep();
			case CdapPackage.CDAP_START_WORKER_STEP: return createCdapStartWorkerStep();
			case CdapPackage.CDAP_START_SERVICE_STEP: return createCdapStartServiceStep();
			case CdapPackage.CDAP_START_APP_STEP: return createCdapStartAppStep();
			case CdapPackage.CDAP_DELETE_APP_STEP: return createCdapDeleteAppStep();
			case CdapPackage.CDAP_DELETE_ARTIFACT: return createCdapDeleteArtifact();
			case CdapPackage.CDAP_SUSPEND_SCHEDULE_STEP: return createCdapSuspendScheduleStep();
			case CdapPackage.CDAP_RESUME_SCHEDULE_STEP: return createCdapResumeScheduleStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapService createCdapService() {
		CdapServiceImpl cdapService = new CdapServiceImpl();
		return cdapService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapServiceInstance createCdapServiceInstance() {
		CdapServiceInstanceImpl cdapServiceInstance = new CdapServiceInstanceImpl();
		return cdapServiceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapApplication createCdapApplication() {
		CdapApplicationImpl cdapApplication = new CdapApplicationImpl();
		return cdapApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapArtifact createCdapArtifact() {
		CdapArtifactImpl cdapArtifact = new CdapArtifactImpl();
		return cdapArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapServiceInstanceConfiguration createCdapServiceInstanceConfiguration() {
		CdapServiceInstanceConfigurationImpl cdapServiceInstanceConfiguration = new CdapServiceInstanceConfigurationImpl();
		return cdapServiceInstanceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapInternalApplicationConfiguration createCdapInternalApplicationConfiguration() {
		CdapInternalApplicationConfigurationImpl cdapInternalApplicationConfiguration = new CdapInternalApplicationConfigurationImpl();
		return cdapInternalApplicationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapServiceDescriptor createCdapServiceDescriptor() {
		CdapServiceDescriptorImpl cdapServiceDescriptor = new CdapServiceDescriptorImpl();
		return cdapServiceDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapLoadArtifactStep createCdapLoadArtifactStep() {
		CdapLoadArtifactStepImpl cdapLoadArtifactStep = new CdapLoadArtifactStepImpl();
		return cdapLoadArtifactStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapLoadArtifactWithConfigStep createCdapLoadArtifactWithConfigStep() {
		CdapLoadArtifactWithConfigStepImpl cdapLoadArtifactWithConfigStep = new CdapLoadArtifactWithConfigStepImpl();
		return cdapLoadArtifactWithConfigStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapCreateAppStep createCdapCreateAppStep() {
		CdapCreateAppStepImpl cdapCreateAppStep = new CdapCreateAppStepImpl();
		return cdapCreateAppStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapCreateAppWithConfigStep createCdapCreateAppWithConfigStep() {
		CdapCreateAppWithConfigStepImpl cdapCreateAppWithConfigStep = new CdapCreateAppWithConfigStepImpl();
		return cdapCreateAppWithConfigStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapDeployAppStep createCdapDeployAppStep() {
		CdapDeployAppStepImpl cdapDeployAppStep = new CdapDeployAppStepImpl();
		return cdapDeployAppStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapStopFlowStep createCdapStopFlowStep() {
		CdapStopFlowStepImpl cdapStopFlowStep = new CdapStopFlowStepImpl();
		return cdapStopFlowStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapStopWorkerStep createCdapStopWorkerStep() {
		CdapStopWorkerStepImpl cdapStopWorkerStep = new CdapStopWorkerStepImpl();
		return cdapStopWorkerStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapStopServiceStep createCdapStopServiceStep() {
		CdapStopServiceStepImpl cdapStopServiceStep = new CdapStopServiceStepImpl();
		return cdapStopServiceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapStopAppStep createCdapStopAppStep() {
		CdapStopAppStepImpl cdapStopAppStep = new CdapStopAppStepImpl();
		return cdapStopAppStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapStartFlowStep createCdapStartFlowStep() {
		CdapStartFlowStepImpl cdapStartFlowStep = new CdapStartFlowStepImpl();
		return cdapStartFlowStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapStartWorkerStep createCdapStartWorkerStep() {
		CdapStartWorkerStepImpl cdapStartWorkerStep = new CdapStartWorkerStepImpl();
		return cdapStartWorkerStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapStartServiceStep createCdapStartServiceStep() {
		CdapStartServiceStepImpl cdapStartServiceStep = new CdapStartServiceStepImpl();
		return cdapStartServiceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapStartAppStep createCdapStartAppStep() {
		CdapStartAppStepImpl cdapStartAppStep = new CdapStartAppStepImpl();
		return cdapStartAppStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapDeleteAppStep createCdapDeleteAppStep() {
		CdapDeleteAppStepImpl cdapDeleteAppStep = new CdapDeleteAppStepImpl();
		return cdapDeleteAppStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapDeleteArtifact createCdapDeleteArtifact() {
		CdapDeleteArtifactImpl cdapDeleteArtifact = new CdapDeleteArtifactImpl();
		return cdapDeleteArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapSuspendScheduleStep createCdapSuspendScheduleStep() {
		CdapSuspendScheduleStepImpl cdapSuspendScheduleStep = new CdapSuspendScheduleStepImpl();
		return cdapSuspendScheduleStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapResumeScheduleStep createCdapResumeScheduleStep() {
		CdapResumeScheduleStepImpl cdapResumeScheduleStep = new CdapResumeScheduleStepImpl();
		return cdapResumeScheduleStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapPackage getCdapPackage() {
		return (CdapPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CdapPackage getPackage() {
		return CdapPackage.eINSTANCE;
	}

} //CdapFactoryImpl
