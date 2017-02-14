
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
package org.openecomp.dcae.controller.platform.controller;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage
 * @generated
 */
public interface ControllerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControllerFactory eINSTANCE = org.openecomp.dcae.controller.platform.controller.impl.ControllerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dcae Platform Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dcae Platform Controller</em>'.
	 * @generated
	 */
	DcaePlatformController createDcaePlatformController();

	/**
	 * Returns a new object of class '<em>Dcae Data Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dcae Data Bus</em>'.
	 * @generated
	 */
	DcaeDataBus createDcaeDataBus();

	/**
	 * Returns a new object of class '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster</em>'.
	 * @generated
	 */
	ControllerCluster createControllerCluster();

	/**
	 * Returns a new object of class '<em>Cluster Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster Server</em>'.
	 * @generated
	 */
	ControllerClusterServer createControllerClusterServer();

	/**
	 * Returns a new object of class '<em>Cluster Server Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster Server Data</em>'.
	 * @generated
	 */
	ControllerClusterServerData createControllerClusterServerData();

	/**
	 * Returns a new object of class '<em>Virtual Machine Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Machine Service</em>'.
	 * @generated
	 */
	ControllerVirtualMachineService createControllerVirtualMachineService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ControllerPackage getControllerPackage();

} //ControllerFactory
