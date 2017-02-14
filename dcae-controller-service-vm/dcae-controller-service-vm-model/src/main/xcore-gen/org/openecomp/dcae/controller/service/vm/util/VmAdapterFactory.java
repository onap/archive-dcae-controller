
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.service.vm.VmPackage
 * @generated
 */
public class VmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VmPackage.eINSTANCE;
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
	protected VmSwitch<Adapter> modelSwitch =
		new VmSwitch<Adapter>() {
			@Override
			public Adapter caseVirtualMachineService(VirtualMachineService object) {
				return createVirtualMachineServiceAdapter();
			}
			@Override
			public Adapter caseVirtualMachineServiceInstance(VirtualMachineServiceInstance object) {
				return createVirtualMachineServiceInstanceAdapter();
			}
			@Override
			public Adapter caseVirtualMachineServiceConfiguration(VirtualMachineServiceConfiguration object) {
				return createVirtualMachineServiceConfigurationAdapter();
			}
			@Override
			public Adapter caseVirtualMachineServiceDescriptor(VirtualMachineServiceDescriptor object) {
				return createVirtualMachineServiceDescriptorAdapter();
			}
			@Override
			public Adapter casePhysicalMachine(PhysicalMachine object) {
				return createPhysicalMachineAdapter();
			}
			@Override
			public Adapter caseVirtualMachine(VirtualMachine object) {
				return createVirtualMachineAdapter();
			}
			@Override
			public Adapter caseInstallationStep(InstallationStep object) {
				return createInstallationStepAdapter();
			}
			@Override
			public Adapter caseShellInstallationStep(ShellInstallationStep object) {
				return createShellInstallationStepAdapter();
			}
			@Override
			public Adapter caseMavenArtifactInstallationStep(MavenArtifactInstallationStep object) {
				return createMavenArtifactInstallationStepAdapter();
			}
			@Override
			public Adapter caseHttpInstallationStep(HttpInstallationStep object) {
				return createHttpInstallationStepAdapter();
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
			public Adapter caseHasOperationalState(HasOperationalState object) {
				return createHasOperationalStateAdapter();
			}
			@Override
			public Adapter caseLogMessageContainer(LogMessageContainer object) {
				return createLogMessageContainerAdapter();
			}
			@Override
			public Adapter caseDcaeBasicServer(DcaeBasicServer object) {
				return createDcaeBasicServerAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineService <em>Virtual Machine Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineService
	 * @generated
	 */
	public Adapter createVirtualMachineServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance <em>Virtual Machine Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance
	 * @generated
	 */
	public Adapter createVirtualMachineServiceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceConfiguration <em>Virtual Machine Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceConfiguration
	 * @generated
	 */
	public Adapter createVirtualMachineServiceConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor <em>Virtual Machine Service Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor
	 * @generated
	 */
	public Adapter createVirtualMachineServiceDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.vm.PhysicalMachine <em>Physical Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.vm.PhysicalMachine
	 * @generated
	 */
	public Adapter createPhysicalMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.vm.VirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachine
	 * @generated
	 */
	public Adapter createVirtualMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.vm.InstallationStep <em>Installation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.vm.InstallationStep
	 * @generated
	 */
	public Adapter createInstallationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.vm.ShellInstallationStep <em>Shell Installation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.vm.ShellInstallationStep
	 * @generated
	 */
	public Adapter createShellInstallationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep <em>Maven Artifact Installation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep
	 * @generated
	 */
	public Adapter createMavenArtifactInstallationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.vm.HttpInstallationStep <em>Http Installation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.vm.HttpInstallationStep
	 * @generated
	 */
	public Adapter createHttpInstallationStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.core.HasOperationalState <em>Has Operational State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.core.HasOperationalState
	 * @generated
	 */
	public Adapter createHasOperationalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.core.logs.LogMessageContainer <em>Log Message Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.core.logs.LogMessageContainer
	 * @generated
	 */
	public Adapter createLogMessageContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServer <em>Dcae Basic Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.server.DcaeBasicServer
	 * @generated
	 */
	public Adapter createDcaeBasicServerAdapter() {
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

} //VmAdapterFactory
