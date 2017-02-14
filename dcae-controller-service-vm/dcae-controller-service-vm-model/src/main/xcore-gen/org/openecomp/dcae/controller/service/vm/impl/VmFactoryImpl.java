
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
package org.openecomp.dcae.controller.service.vm.impl;

import org.openecomp.dcae.controller.service.vm.*;

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
public class VmFactoryImpl extends EFactoryImpl implements VmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VmFactory init() {
		try {
			VmFactory theVmFactory = (VmFactory)EPackage.Registry.INSTANCE.getEFactory(VmPackage.eNS_URI);
			if (theVmFactory != null) {
				return theVmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmFactoryImpl() {
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
			case VmPackage.VIRTUAL_MACHINE_SERVICE: return createVirtualMachineService();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE: return createVirtualMachineServiceInstance();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_CONFIGURATION: return createVirtualMachineServiceConfiguration();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR: return createVirtualMachineServiceDescriptor();
			case VmPackage.PHYSICAL_MACHINE: return createPhysicalMachine();
			case VmPackage.VIRTUAL_MACHINE: return createVirtualMachine();
			case VmPackage.SHELL_INSTALLATION_STEP: return createShellInstallationStep();
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP: return createMavenArtifactInstallationStep();
			case VmPackage.HTTP_INSTALLATION_STEP: return createHttpInstallationStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachineService createVirtualMachineService() {
		VirtualMachineServiceImpl virtualMachineService = new VirtualMachineServiceImpl();
		return virtualMachineService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachineServiceInstance createVirtualMachineServiceInstance() {
		VirtualMachineServiceInstanceImpl virtualMachineServiceInstance = new VirtualMachineServiceInstanceImpl();
		return virtualMachineServiceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachineServiceConfiguration createVirtualMachineServiceConfiguration() {
		VirtualMachineServiceConfigurationImpl virtualMachineServiceConfiguration = new VirtualMachineServiceConfigurationImpl();
		return virtualMachineServiceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachineServiceDescriptor createVirtualMachineServiceDescriptor() {
		VirtualMachineServiceDescriptorImpl virtualMachineServiceDescriptor = new VirtualMachineServiceDescriptorImpl();
		return virtualMachineServiceDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalMachine createPhysicalMachine() {
		PhysicalMachineImpl physicalMachine = new PhysicalMachineImpl();
		return physicalMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine createVirtualMachine() {
		VirtualMachineImpl virtualMachine = new VirtualMachineImpl();
		return virtualMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShellInstallationStep createShellInstallationStep() {
		ShellInstallationStepImpl shellInstallationStep = new ShellInstallationStepImpl();
		return shellInstallationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MavenArtifactInstallationStep createMavenArtifactInstallationStep() {
		MavenArtifactInstallationStepImpl mavenArtifactInstallationStep = new MavenArtifactInstallationStepImpl();
		return mavenArtifactInstallationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpInstallationStep createHttpInstallationStep() {
		HttpInstallationStepImpl httpInstallationStep = new HttpInstallationStepImpl();
		return httpInstallationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmPackage getVmPackage() {
		return (VmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VmPackage getPackage() {
		return VmPackage.eINSTANCE;
	}

} //VmFactoryImpl
