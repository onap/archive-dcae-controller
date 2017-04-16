
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage
 * @generated
 */
public class CdapSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CdapPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapSwitch() {
		if (modelPackage == null) {
			modelPackage = CdapPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CdapPackage.CDAP_SERVICE: {
				CdapService cdapService = (CdapService)theEObject;
				T result = caseCdapService(cdapService);
				if (result == null) result = caseDcaeService(cdapService);
				if (result == null) result = caseNamedEntity(cdapService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_SERVICE_INSTANCE: {
				CdapServiceInstance cdapServiceInstance = (CdapServiceInstance)theEObject;
				T result = caseCdapServiceInstance(cdapServiceInstance);
				if (result == null) result = caseDcaeServiceInstance(cdapServiceInstance);
				if (result == null) result = caseNamedEntity(cdapServiceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_APPLICATION: {
				CdapApplication cdapApplication = (CdapApplication)theEObject;
				T result = caseCdapApplication(cdapApplication);
				if (result == null) result = caseNamedEntity(cdapApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_ARTIFACT: {
				CdapArtifact cdapArtifact = (CdapArtifact)theEObject;
				T result = caseCdapArtifact(cdapArtifact);
				if (result == null) result = caseNamedEntity(cdapArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION: {
				CdapServiceInstanceConfiguration cdapServiceInstanceConfiguration = (CdapServiceInstanceConfiguration)theEObject;
				T result = caseCdapServiceInstanceConfiguration(cdapServiceInstanceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION: {
				CdapInternalApplicationConfiguration cdapInternalApplicationConfiguration = (CdapInternalApplicationConfiguration)theEObject;
				T result = caseCdapInternalApplicationConfiguration(cdapInternalApplicationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR: {
				CdapServiceDescriptor cdapServiceDescriptor = (CdapServiceDescriptor)theEObject;
				T result = caseCdapServiceDescriptor(cdapServiceDescriptor);
				if (result == null) result = caseDcaeServiceDescriptor(cdapServiceDescriptor);
				if (result == null) result = caseNamedEntity(cdapServiceDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_STEP: {
				CdapStep cdapStep = (CdapStep)theEObject;
				T result = caseCdapStep(cdapStep);
				if (result == null) result = caseNamedEntity(cdapStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_LOAD_ARTIFACT_STEP: {
				CdapLoadArtifactStep cdapLoadArtifactStep = (CdapLoadArtifactStep)theEObject;
				T result = caseCdapLoadArtifactStep(cdapLoadArtifactStep);
				if (result == null) result = caseCdapStep(cdapLoadArtifactStep);
				if (result == null) result = caseNamedEntity(cdapLoadArtifactStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_LOAD_ARTIFACT_WITH_CONFIG_STEP: {
				CdapLoadArtifactWithConfigStep cdapLoadArtifactWithConfigStep = (CdapLoadArtifactWithConfigStep)theEObject;
				T result = caseCdapLoadArtifactWithConfigStep(cdapLoadArtifactWithConfigStep);
				if (result == null) result = caseCdapLoadArtifactStep(cdapLoadArtifactWithConfigStep);
				if (result == null) result = caseCdapStep(cdapLoadArtifactWithConfigStep);
				if (result == null) result = caseNamedEntity(cdapLoadArtifactWithConfigStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_CREATE_APP_STEP: {
				CdapCreateAppStep cdapCreateAppStep = (CdapCreateAppStep)theEObject;
				T result = caseCdapCreateAppStep(cdapCreateAppStep);
				if (result == null) result = caseCdapStep(cdapCreateAppStep);
				if (result == null) result = caseNamedEntity(cdapCreateAppStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_CREATE_APP_WITH_CONFIG_STEP: {
				CdapCreateAppWithConfigStep cdapCreateAppWithConfigStep = (CdapCreateAppWithConfigStep)theEObject;
				T result = caseCdapCreateAppWithConfigStep(cdapCreateAppWithConfigStep);
				if (result == null) result = caseCdapCreateAppStep(cdapCreateAppWithConfigStep);
				if (result == null) result = caseCdapStep(cdapCreateAppWithConfigStep);
				if (result == null) result = caseNamedEntity(cdapCreateAppWithConfigStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_DEPLOY_APP_STEP: {
				CdapDeployAppStep cdapDeployAppStep = (CdapDeployAppStep)theEObject;
				T result = caseCdapDeployAppStep(cdapDeployAppStep);
				if (result == null) result = caseCdapStep(cdapDeployAppStep);
				if (result == null) result = caseNamedEntity(cdapDeployAppStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_STOP_FLOW_STEP: {
				CdapStopFlowStep cdapStopFlowStep = (CdapStopFlowStep)theEObject;
				T result = caseCdapStopFlowStep(cdapStopFlowStep);
				if (result == null) result = caseCdapStep(cdapStopFlowStep);
				if (result == null) result = caseNamedEntity(cdapStopFlowStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_STOP_WORKER_STEP: {
				CdapStopWorkerStep cdapStopWorkerStep = (CdapStopWorkerStep)theEObject;
				T result = caseCdapStopWorkerStep(cdapStopWorkerStep);
				if (result == null) result = caseCdapStep(cdapStopWorkerStep);
				if (result == null) result = caseNamedEntity(cdapStopWorkerStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_STOP_SERVICE_STEP: {
				CdapStopServiceStep cdapStopServiceStep = (CdapStopServiceStep)theEObject;
				T result = caseCdapStopServiceStep(cdapStopServiceStep);
				if (result == null) result = caseCdapStep(cdapStopServiceStep);
				if (result == null) result = caseNamedEntity(cdapStopServiceStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_STOP_APP_STEP: {
				CdapStopAppStep cdapStopAppStep = (CdapStopAppStep)theEObject;
				T result = caseCdapStopAppStep(cdapStopAppStep);
				if (result == null) result = caseCdapStep(cdapStopAppStep);
				if (result == null) result = caseNamedEntity(cdapStopAppStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_START_FLOW_STEP: {
				CdapStartFlowStep cdapStartFlowStep = (CdapStartFlowStep)theEObject;
				T result = caseCdapStartFlowStep(cdapStartFlowStep);
				if (result == null) result = caseCdapStep(cdapStartFlowStep);
				if (result == null) result = caseNamedEntity(cdapStartFlowStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_START_WORKER_STEP: {
				CdapStartWorkerStep cdapStartWorkerStep = (CdapStartWorkerStep)theEObject;
				T result = caseCdapStartWorkerStep(cdapStartWorkerStep);
				if (result == null) result = caseCdapStep(cdapStartWorkerStep);
				if (result == null) result = caseNamedEntity(cdapStartWorkerStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_START_SERVICE_STEP: {
				CdapStartServiceStep cdapStartServiceStep = (CdapStartServiceStep)theEObject;
				T result = caseCdapStartServiceStep(cdapStartServiceStep);
				if (result == null) result = caseCdapStep(cdapStartServiceStep);
				if (result == null) result = caseNamedEntity(cdapStartServiceStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_START_APP_STEP: {
				CdapStartAppStep cdapStartAppStep = (CdapStartAppStep)theEObject;
				T result = caseCdapStartAppStep(cdapStartAppStep);
				if (result == null) result = caseCdapStep(cdapStartAppStep);
				if (result == null) result = caseNamedEntity(cdapStartAppStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_DELETE_APP_STEP: {
				CdapDeleteAppStep cdapDeleteAppStep = (CdapDeleteAppStep)theEObject;
				T result = caseCdapDeleteAppStep(cdapDeleteAppStep);
				if (result == null) result = caseCdapStep(cdapDeleteAppStep);
				if (result == null) result = caseNamedEntity(cdapDeleteAppStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_DELETE_ARTIFACT: {
				CdapDeleteArtifact cdapDeleteArtifact = (CdapDeleteArtifact)theEObject;
				T result = caseCdapDeleteArtifact(cdapDeleteArtifact);
				if (result == null) result = caseCdapStep(cdapDeleteArtifact);
				if (result == null) result = caseNamedEntity(cdapDeleteArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_SUSPEND_SCHEDULE_STEP: {
				CdapSuspendScheduleStep cdapSuspendScheduleStep = (CdapSuspendScheduleStep)theEObject;
				T result = caseCdapSuspendScheduleStep(cdapSuspendScheduleStep);
				if (result == null) result = caseCdapStep(cdapSuspendScheduleStep);
				if (result == null) result = caseNamedEntity(cdapSuspendScheduleStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_RESUME_SCHEDULE_STEP: {
				CdapResumeScheduleStep cdapResumeScheduleStep = (CdapResumeScheduleStep)theEObject;
				T result = caseCdapResumeScheduleStep(cdapResumeScheduleStep);
				if (result == null) result = caseCdapStep(cdapResumeScheduleStep);
				if (result == null) result = caseNamedEntity(cdapResumeScheduleStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapService(CdapService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapServiceInstance(CdapServiceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapApplication(CdapApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapArtifact(CdapArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Instance Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Instance Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapServiceInstanceConfiguration(CdapServiceInstanceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Application Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Application Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapInternalApplicationConfiguration(CdapInternalApplicationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapServiceDescriptor(CdapServiceDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapStep(CdapStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Artifact Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Artifact Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapLoadArtifactStep(CdapLoadArtifactStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Artifact With Config Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Artifact With Config Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapLoadArtifactWithConfigStep(CdapLoadArtifactWithConfigStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create App Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create App Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapCreateAppStep(CdapCreateAppStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create App With Config Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create App With Config Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapCreateAppWithConfigStep(CdapCreateAppWithConfigStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deploy App Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deploy App Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapDeployAppStep(CdapDeployAppStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Flow Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Flow Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapStopFlowStep(CdapStopFlowStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Worker Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Worker Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapStopWorkerStep(CdapStopWorkerStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Service Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Service Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapStopServiceStep(CdapStopServiceStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop App Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop App Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapStopAppStep(CdapStopAppStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Flow Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Flow Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapStartFlowStep(CdapStartFlowStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Worker Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Worker Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapStartWorkerStep(CdapStartWorkerStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Service Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Service Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapStartServiceStep(CdapStartServiceStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start App Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start App Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapStartAppStep(CdapStartAppStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete App Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete App Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapDeleteAppStep(CdapDeleteAppStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapDeleteArtifact(CdapDeleteArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspend Schedule Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspend Schedule Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapSuspendScheduleStep(CdapSuspendScheduleStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resume Schedule Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resume Schedule Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapResumeScheduleStep(CdapResumeScheduleStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeService(DcaeService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Service Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeServiceInstance(DcaeServiceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Service Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Service Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeServiceDescriptor(DcaeServiceDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CdapSwitch
