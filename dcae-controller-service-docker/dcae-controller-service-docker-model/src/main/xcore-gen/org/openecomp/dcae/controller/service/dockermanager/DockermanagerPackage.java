
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
package org.openecomp.dcae.controller.service.dockermanager;

import org.openecomp.dcae.controller.core.manager.ManagerPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.service.dockermanager.DockermanagerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-service-docker-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.service'"
 * @generated
 */
public interface DockermanagerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dockermanager";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.dcae.controller.service.dockermanager";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dockermanager";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DockermanagerPackage eINSTANCE = org.openecomp.dcae.controller.service.dockermanager.impl.DockermanagerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.dockermanager.impl.DockerManagerImpl <em>Docker Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.dockermanager.impl.DockerManagerImpl
	 * @see org.openecomp.dcae.controller.service.dockermanager.impl.DockermanagerPackageImpl#getDockerManager()
	 * @generated
	 */
	int DOCKER_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Input Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_MANAGER__INPUT_STREAMS = ManagerPackage.DCAE_MANAGER__INPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Output Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_MANAGER__OUTPUT_STREAMS = ManagerPackage.DCAE_MANAGER__OUTPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_MANAGER__CONFIGURATION = ManagerPackage.DCAE_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Docker Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_MANAGER_FEATURE_COUNT = ManagerPackage.DCAE_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_MANAGER___TEST = ManagerPackage.DCAE_MANAGER___TEST;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_MANAGER___SUSPEND = ManagerPackage.DCAE_MANAGER___SUSPEND;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_MANAGER___RESUME = ManagerPackage.DCAE_MANAGER___RESUME;

	/**
	 * The operation id for the '<em>Public Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_MANAGER___PUBLIC_KEY = ManagerPackage.DCAE_MANAGER___PUBLIC_KEY;

	/**
	 * The operation id for the '<em>Configuration Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_MANAGER___CONFIGURATION_CHANGED = ManagerPackage.DCAE_MANAGER___CONFIGURATION_CHANGED;

	/**
	 * The operation id for the '<em>Update Streams</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_MANAGER___UPDATE_STREAMS__ELIST_ELIST = ManagerPackage.DCAE_MANAGER___UPDATE_STREAMS__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Docker Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_MANAGER_OPERATION_COUNT = ManagerPackage.DCAE_MANAGER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.dockermanager.DockerManager <em>Docker Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Manager</em>'.
	 * @see org.openecomp.dcae.controller.service.dockermanager.DockerManager
	 * @generated
	 */
	EClass getDockerManager();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.service.dockermanager.DockerManager#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.dockermanager.DockerManager#getConfiguration()
	 * @see #getDockerManager()
	 * @generated
	 */
	EReference getDockerManager_Configuration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DockermanagerFactory getDockermanagerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.dockermanager.impl.DockerManagerImpl <em>Docker Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.dockermanager.impl.DockerManagerImpl
		 * @see org.openecomp.dcae.controller.service.dockermanager.impl.DockermanagerPackageImpl#getDockerManager()
		 * @generated
		 */
		EClass DOCKER_MANAGER = eINSTANCE.getDockerManager();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_MANAGER__CONFIGURATION = eINSTANCE.getDockerManager_Configuration();

	}

} //DockermanagerPackage
