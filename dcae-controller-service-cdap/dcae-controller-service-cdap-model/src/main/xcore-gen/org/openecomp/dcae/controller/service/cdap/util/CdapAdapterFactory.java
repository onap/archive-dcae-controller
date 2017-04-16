
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
package org.openecomp.dcae.controller.service.cdap.util;

import org.openecomp.dcae.controller.core.service.DcaeService;
import org.openecomp.dcae.controller.core.service.DcaeServiceDescriptor;
import org.openecomp.dcae.controller.core.service.DcaeServiceInstance;
import org.openecomp.dcae.controller.service.cdap.*;

import org.openecomp.ncomp.core.NamedEntity;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage
 * @generated
 */
public class CdapAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CdapPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CdapPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdapSwitch<Adapter> modelSwitch =
		new CdapSwitch<Adapter>() {
			@Override
			public Adapter caseCdapService(CdapService object) {
				return createCdapServiceAdapter();
			}
			@Override
			public Adapter caseCdapServiceInstance(CdapServiceInstance object) {
				return createCdapServiceInstanceAdapter();
			}
			@Override
			public Adapter caseCdapApplication(CdapApplication object) {
				return createCdapApplicationAdapter();
			}
			@Override
			public Adapter caseCdapArtifact(CdapArtifact object) {
				return createCdapArtifactAdapter();
			}
			@Override
			public Adapter caseCdapServiceInstanceConfiguration(CdapServiceInstanceConfiguration object) {
				return createCdapServiceInstanceConfigurationAdapter();
			}
			@Override
			public Adapter caseCdapInternalApplicationConfiguration(CdapInternalApplicationConfiguration object) {
				return createCdapInternalApplicationConfigurationAdapter();
			}
			@Override
			public Adapter caseCdapServiceDescriptor(CdapServiceDescriptor object) {
				return createCdapServiceDescriptorAdapter();
			}
			@Override
			public Adapter caseCdapStep(CdapStep object) {
				return createCdapStepAdapter();
			}
			@Override
			public Adapter caseCdapLoadArtifactStep(CdapLoadArtifactStep object) {
				return createCdapLoadArtifactStepAdapter();
			}
			@Override
			public Adapter caseCdapLoadArtifactWithConfigStep(CdapLoadArtifactWithConfigStep object) {
				return createCdapLoadArtifactWithConfigStepAdapter();
			}
			@Override
			public Adapter caseCdapCreateAppStep(CdapCreateAppStep object) {
				return createCdapCreateAppStepAdapter();
			}
			@Override
			public Adapter caseCdapCreateAppWithConfigStep(CdapCreateAppWithConfigStep object) {
				return createCdapCreateAppWithConfigStepAdapter();
			}
			@Override
			public Adapter caseCdapDeployAppStep(CdapDeployAppStep object) {
				return createCdapDeployAppStepAdapter();
			}
			@Override
			public Adapter caseCdapStopFlowStep(CdapStopFlowStep object) {
				return createCdapStopFlowStepAdapter();
			}
			@Override
			public Adapter caseCdapStopWorkerStep(CdapStopWorkerStep object) {
				return createCdapStopWorkerStepAdapter();
			}
			@Override
			public Adapter caseCdapStopServiceStep(CdapStopServiceStep object) {
				return createCdapStopServiceStepAdapter();
			}
			@Override
			public Adapter caseCdapStopAppStep(CdapStopAppStep object) {
				return createCdapStopAppStepAdapter();
			}
			@Override
			public Adapter caseCdapStartFlowStep(CdapStartFlowStep object) {
				return createCdapStartFlowStepAdapter();
			}
			@Override
			public Adapter caseCdapStartWorkerStep(CdapStartWorkerStep object) {
				return createCdapStartWorkerStepAdapter();
			}
			@Override
			public Adapter caseCdapStartServiceStep(CdapStartServiceStep object) {
				return createCdapStartServiceStepAdapter();
			}
			@Override
			public Adapter caseCdapStartAppStep(CdapStartAppStep object) {
				return createCdapStartAppStepAdapter();
			}
			@Override
			public Adapter caseCdapDeleteAppStep(CdapDeleteAppStep object) {
				return createCdapDeleteAppStepAdapter();
			}
			@Override
			public Adapter caseCdapDeleteArtifact(CdapDeleteArtifact object) {
				return createCdapDeleteArtifactAdapter();
			}
			@Override
			public Adapter caseCdapSuspendScheduleStep(CdapSuspendScheduleStep object) {
				return createCdapSuspendScheduleStepAdapter();
			}
			@Override
			public Adapter caseCdapResumeScheduleStep(CdapResumeScheduleStep object) {
				return createCdapResumeScheduleStepAdapter();
			}
			@Override
			public Adapter caseNamedEntity(NamedEntity object) {
				return createNamedEntityAdapter();
			}
			@Override
			public Adapter caseDcaeService(DcaeService object) {
				return createDcaeServiceAdapter();
			}
			@Override
			public Adapter caseDcaeServiceInstance(DcaeServiceInstance object) {
				return createDcaeServiceInstanceAdapter();
			}
			@Override
			public Adapter caseDcaeServiceDescriptor(DcaeServiceDescriptor object) {
				return createDcaeServiceDescriptorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapService
	 * @generated
	 */
	public Adapter createCdapServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance <em>Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance
	 * @generated
	 */
	public Adapter createCdapServiceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapApplication
	 * @generated
	 */
	public Adapter createCdapApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapArtifact
	 * @generated
	 */
	public Adapter createCdapArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstanceConfiguration <em>Service Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstanceConfiguration
	 * @generated
	 */
	public Adapter createCdapServiceInstanceConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration <em>Internal Application Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration
	 * @generated
	 */
	public Adapter createCdapInternalApplicationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor <em>Service Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor
	 * @generated
	 */
	public Adapter createCdapServiceDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStep
	 * @generated
	 */
	public Adapter createCdapStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep <em>Load Artifact Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep
	 * @generated
	 */
	public Adapter createCdapLoadArtifactStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactWithConfigStep <em>Load Artifact With Config Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactWithConfigStep
	 * @generated
	 */
	public Adapter createCdapLoadArtifactWithConfigStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapCreateAppStep <em>Create App Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapCreateAppStep
	 * @generated
	 */
	public Adapter createCdapCreateAppStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapCreateAppWithConfigStep <em>Create App With Config Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapCreateAppWithConfigStep
	 * @generated
	 */
	public Adapter createCdapCreateAppWithConfigStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapDeployAppStep <em>Deploy App Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapDeployAppStep
	 * @generated
	 */
	public Adapter createCdapDeployAppStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapStopFlowStep <em>Stop Flow Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStopFlowStep
	 * @generated
	 */
	public Adapter createCdapStopFlowStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapStopWorkerStep <em>Stop Worker Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStopWorkerStep
	 * @generated
	 */
	public Adapter createCdapStopWorkerStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapStopServiceStep <em>Stop Service Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStopServiceStep
	 * @generated
	 */
	public Adapter createCdapStopServiceStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapStopAppStep <em>Stop App Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStopAppStep
	 * @generated
	 */
	public Adapter createCdapStopAppStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapStartFlowStep <em>Start Flow Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStartFlowStep
	 * @generated
	 */
	public Adapter createCdapStartFlowStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapStartWorkerStep <em>Start Worker Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStartWorkerStep
	 * @generated
	 */
	public Adapter createCdapStartWorkerStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapStartServiceStep <em>Start Service Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStartServiceStep
	 * @generated
	 */
	public Adapter createCdapStartServiceStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapStartAppStep <em>Start App Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStartAppStep
	 * @generated
	 */
	public Adapter createCdapStartAppStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapDeleteAppStep <em>Delete App Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapDeleteAppStep
	 * @generated
	 */
	public Adapter createCdapDeleteAppStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapDeleteArtifact <em>Delete Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapDeleteArtifact
	 * @generated
	 */
	public Adapter createCdapDeleteArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapSuspendScheduleStep <em>Suspend Schedule Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapSuspendScheduleStep
	 * @generated
	 */
	public Adapter createCdapSuspendScheduleStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.cdap.CdapResumeScheduleStep <em>Resume Schedule Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapResumeScheduleStep
	 * @generated
	 */
	public Adapter createCdapResumeScheduleStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.core.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.core.NamedEntity
	 * @generated
	 */
	public Adapter createNamedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.service.DcaeService <em>Dcae Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.service.DcaeService
	 * @generated
	 */
	public Adapter createDcaeServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance <em>Dcae Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceInstance
	 * @generated
	 */
	public Adapter createDcaeServiceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.service.DcaeServiceDescriptor <em>Dcae Service Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceDescriptor
	 * @generated
	 */
	public Adapter createDcaeServiceDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CdapAdapterFactory
