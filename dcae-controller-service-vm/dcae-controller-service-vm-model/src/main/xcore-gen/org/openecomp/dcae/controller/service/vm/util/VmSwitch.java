
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
package org.openecomp.dcae.controller.service.vm.util;

import org.openecomp.dcae.controller.core.server.DcaeBasicServer;

import org.openecomp.dcae.controller.core.service.DcaeService;

import org.openecomp.dcae.controller.core.service.DcaeServiceDescriptor;
import org.openecomp.dcae.controller.core.service.DcaeServiceInstance;
import org.openecomp.dcae.controller.service.vm.*;

import org.openecomp.ncomp.core.HasOperationalState;
import org.openecomp.ncomp.core.NamedEntity;

import org.openecomp.ncomp.core.logs.LogMessageContainer;

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
 * @see org.openecomp.dcae.controller.service.vm.VmPackage
 * @generated
 */
public class VmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmSwitch() {
		if (modelPackage == null) {
			modelPackage = VmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
			case VmPackage.VIRTUAL_MACHINE_SERVICE: {
				VirtualMachineService virtualMachineService = (VirtualMachineService)theEObject;
				T result = caseVirtualMachineService(virtualMachineService);
				if (result == null) result = caseDcaeService(virtualMachineService);
				if (result == null) result = caseNamedEntity(virtualMachineService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE: {
				VirtualMachineServiceInstance virtualMachineServiceInstance = (VirtualMachineServiceInstance)theEObject;
				T result = caseVirtualMachineServiceInstance(virtualMachineServiceInstance);
				if (result == null) result = caseDcaeServiceInstance(virtualMachineServiceInstance);
				if (result == null) result = caseVirtualMachineServiceConfiguration(virtualMachineServiceInstance);
				if (result == null) result = caseNamedEntity(virtualMachineServiceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmPackage.VIRTUAL_MACHINE_SERVICE_CONFIGURATION: {
				VirtualMachineServiceConfiguration virtualMachineServiceConfiguration = (VirtualMachineServiceConfiguration)theEObject;
				T result = caseVirtualMachineServiceConfiguration(virtualMachineServiceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR: {
				VirtualMachineServiceDescriptor virtualMachineServiceDescriptor = (VirtualMachineServiceDescriptor)theEObject;
				T result = caseVirtualMachineServiceDescriptor(virtualMachineServiceDescriptor);
				if (result == null) result = caseDcaeServiceDescriptor(virtualMachineServiceDescriptor);
				if (result == null) result = caseNamedEntity(virtualMachineServiceDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmPackage.PHYSICAL_MACHINE: {
				PhysicalMachine physicalMachine = (PhysicalMachine)theEObject;
				T result = casePhysicalMachine(physicalMachine);
				if (result == null) result = caseDcaeBasicServer(physicalMachine);
				if (result == null) result = caseNamedEntity(physicalMachine);
				if (result == null) result = caseHasOperationalState(physicalMachine);
				if (result == null) result = caseLogMessageContainer(physicalMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmPackage.VIRTUAL_MACHINE: {
				VirtualMachine virtualMachine = (VirtualMachine)theEObject;
				T result = caseVirtualMachine(virtualMachine);
				if (result == null) result = caseDcaeBasicServer(virtualMachine);
				if (result == null) result = caseNamedEntity(virtualMachine);
				if (result == null) result = caseHasOperationalState(virtualMachine);
				if (result == null) result = caseLogMessageContainer(virtualMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmPackage.INSTALLATION_STEP: {
				InstallationStep installationStep = (InstallationStep)theEObject;
				T result = caseInstallationStep(installationStep);
				if (result == null) result = caseNamedEntity(installationStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmPackage.SHELL_INSTALLATION_STEP: {
				ShellInstallationStep shellInstallationStep = (ShellInstallationStep)theEObject;
				T result = caseShellInstallationStep(shellInstallationStep);
				if (result == null) result = caseInstallationStep(shellInstallationStep);
				if (result == null) result = caseNamedEntity(shellInstallationStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP: {
				MavenArtifactInstallationStep mavenArtifactInstallationStep = (MavenArtifactInstallationStep)theEObject;
				T result = caseMavenArtifactInstallationStep(mavenArtifactInstallationStep);
				if (result == null) result = caseInstallationStep(mavenArtifactInstallationStep);
				if (result == null) result = caseNamedEntity(mavenArtifactInstallationStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmPackage.HTTP_INSTALLATION_STEP: {
				HttpInstallationStep httpInstallationStep = (HttpInstallationStep)theEObject;
				T result = caseHttpInstallationStep(httpInstallationStep);
				if (result == null) result = caseInstallationStep(httpInstallationStep);
				if (result == null) result = caseNamedEntity(httpInstallationStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Machine Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Machine Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualMachineService(VirtualMachineService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Machine Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Machine Service Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualMachineServiceInstance(VirtualMachineServiceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Machine Service Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Machine Service Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualMachineServiceConfiguration(VirtualMachineServiceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Machine Service Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Machine Service Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualMachineServiceDescriptor(VirtualMachineServiceDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalMachine(PhysicalMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualMachine(VirtualMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Installation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Installation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstallationStep(InstallationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shell Installation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shell Installation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShellInstallationStep(ShellInstallationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maven Artifact Installation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maven Artifact Installation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMavenArtifactInstallationStep(MavenArtifactInstallationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Installation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Installation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpInstallationStep(HttpInstallationStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Has Operational State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Operational State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasOperationalState(HasOperationalState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Message Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Message Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogMessageContainer(LogMessageContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Basic Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Basic Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeBasicServer(DcaeBasicServer object) {
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

} //VmSwitch
