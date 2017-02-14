
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
package org.openecomp.dcae.controller.service.vm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.service.vm.VmPackage
 * @generated
 */
public interface VmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmFactory eINSTANCE = org.openecomp.dcae.controller.service.vm.impl.VmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Virtual Machine Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Machine Service</em>'.
	 * @generated
	 */
	VirtualMachineService createVirtualMachineService();

	/**
	 * Returns a new object of class '<em>Virtual Machine Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Machine Service Instance</em>'.
	 * @generated
	 */
	VirtualMachineServiceInstance createVirtualMachineServiceInstance();

	/**
	 * Returns a new object of class '<em>Virtual Machine Service Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Machine Service Configuration</em>'.
	 * @generated
	 */
	VirtualMachineServiceConfiguration createVirtualMachineServiceConfiguration();

	/**
	 * Returns a new object of class '<em>Virtual Machine Service Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Machine Service Descriptor</em>'.
	 * @generated
	 */
	VirtualMachineServiceDescriptor createVirtualMachineServiceDescriptor();

	/**
	 * Returns a new object of class '<em>Physical Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Machine</em>'.
	 * @generated
	 */
	PhysicalMachine createPhysicalMachine();

	/**
	 * Returns a new object of class '<em>Virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Machine</em>'.
	 * @generated
	 */
	VirtualMachine createVirtualMachine();

	/**
	 * Returns a new object of class '<em>Shell Installation Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shell Installation Step</em>'.
	 * @generated
	 */
	ShellInstallationStep createShellInstallationStep();

	/**
	 * Returns a new object of class '<em>Maven Artifact Installation Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maven Artifact Installation Step</em>'.
	 * @generated
	 */
	MavenArtifactInstallationStep createMavenArtifactInstallationStep();

	/**
	 * Returns a new object of class '<em>Http Installation Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Http Installation Step</em>'.
	 * @generated
	 */
	HttpInstallationStep createHttpInstallationStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VmPackage getVmPackage();

} //VmFactory
