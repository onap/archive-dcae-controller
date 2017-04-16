
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
package org.openecomp.dcae.controller.service.common.docker.manager;

import org.openecomp.dcae.controller.service.dockermanager.DockermanagerPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * <!-- begin-model-doc -->
 * -
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 * <!-- end-model-doc -->
 * @see org.openecomp.dcae.controller.service.common.docker.manager.ManagerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-service-common-docker-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.service.common.docker'"
 * @generated
 */
public interface ManagerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "manager";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.dcae.controller.service.common.docker.manager";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "manager";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ManagerPackage eINSTANCE = org.openecomp.dcae.controller.service.common.docker.manager.impl.ManagerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.common.docker.manager.impl.CommonDockerManagerImpl <em>Common Docker Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.common.docker.manager.impl.CommonDockerManagerImpl
	 * @see org.openecomp.dcae.controller.service.common.docker.manager.impl.ManagerPackageImpl#getCommonDockerManager()
	 * @generated
	 */
	int COMMON_DOCKER_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Input Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_MANAGER__INPUT_STREAMS = DockermanagerPackage.DOCKER_MANAGER__INPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Output Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_MANAGER__OUTPUT_STREAMS = DockermanagerPackage.DOCKER_MANAGER__OUTPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_MANAGER__CONFIGURATION = DockermanagerPackage.DOCKER_MANAGER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_MANAGER__SCRIPT = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configure Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_MANAGER__CONFIGURE_TIMEOUT = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_MANAGER__TEST_TIMEOUT = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Suspend Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_MANAGER__SUSPEND_TIMEOUT = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resume Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_MANAGER__RESUME_TIMEOUT = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Docker Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_MANAGER__DOCKER_CONFIGURATION = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Common Docker Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_MANAGER_FEATURE_COUNT = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_MANAGER___TEST = DockermanagerPackage.DOCKER_MANAGER___TEST;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_MANAGER___SUSPEND = DockermanagerPackage.DOCKER_MANAGER___SUSPEND;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_MANAGER___RESUME = DockermanagerPackage.DOCKER_MANAGER___RESUME;

	/**
	 * The operation id for the '<em>Public Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_MANAGER___PUBLIC_KEY = DockermanagerPackage.DOCKER_MANAGER___PUBLIC_KEY;

	/**
	 * The operation id for the '<em>Configuration Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_MANAGER___CONFIGURATION_CHANGED = DockermanagerPackage.DOCKER_MANAGER___CONFIGURATION_CHANGED;

	/**
	 * The operation id for the '<em>Update Streams</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_MANAGER___UPDATE_STREAMS__ELIST_ELIST = DockermanagerPackage.DOCKER_MANAGER___UPDATE_STREAMS__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Common Docker Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_MANAGER_OPERATION_COUNT = DockermanagerPackage.DOCKER_MANAGER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.common.docker.manager.CommonDockerManager <em>Common Docker Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Docker Manager</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.manager.CommonDockerManager
	 * @generated
	 */
	EClass getCommonDockerManager();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.docker.manager.CommonDockerManager#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.manager.CommonDockerManager#getScript()
	 * @see #getCommonDockerManager()
	 * @generated
	 */
	EAttribute getCommonDockerManager_Script();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.docker.manager.CommonDockerManager#getConfigureTimeout <em>Configure Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configure Timeout</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.manager.CommonDockerManager#getConfigureTimeout()
	 * @see #getCommonDockerManager()
	 * @generated
	 */
	EAttribute getCommonDockerManager_ConfigureTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.docker.manager.CommonDockerManager#getTestTimeout <em>Test Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Timeout</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.manager.CommonDockerManager#getTestTimeout()
	 * @see #getCommonDockerManager()
	 * @generated
	 */
	EAttribute getCommonDockerManager_TestTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.docker.manager.CommonDockerManager#getSuspendTimeout <em>Suspend Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspend Timeout</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.manager.CommonDockerManager#getSuspendTimeout()
	 * @see #getCommonDockerManager()
	 * @generated
	 */
	EAttribute getCommonDockerManager_SuspendTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.docker.manager.CommonDockerManager#getResumeTimeout <em>Resume Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resume Timeout</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.manager.CommonDockerManager#getResumeTimeout()
	 * @see #getCommonDockerManager()
	 * @generated
	 */
	EAttribute getCommonDockerManager_ResumeTimeout();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.service.common.docker.manager.CommonDockerManager#getDockerConfiguration <em>Docker Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Docker Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.manager.CommonDockerManager#getDockerConfiguration()
	 * @see #getCommonDockerManager()
	 * @generated
	 */
	EReference getCommonDockerManager_DockerConfiguration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ManagerFactory getManagerFactory();

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
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.common.docker.manager.impl.CommonDockerManagerImpl <em>Common Docker Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.common.docker.manager.impl.CommonDockerManagerImpl
		 * @see org.openecomp.dcae.controller.service.common.docker.manager.impl.ManagerPackageImpl#getCommonDockerManager()
		 * @generated
		 */
		EClass COMMON_DOCKER_MANAGER = eINSTANCE.getCommonDockerManager();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_DOCKER_MANAGER__SCRIPT = eINSTANCE.getCommonDockerManager_Script();

		/**
		 * The meta object literal for the '<em><b>Configure Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_DOCKER_MANAGER__CONFIGURE_TIMEOUT = eINSTANCE.getCommonDockerManager_ConfigureTimeout();

		/**
		 * The meta object literal for the '<em><b>Test Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_DOCKER_MANAGER__TEST_TIMEOUT = eINSTANCE.getCommonDockerManager_TestTimeout();

		/**
		 * The meta object literal for the '<em><b>Suspend Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_DOCKER_MANAGER__SUSPEND_TIMEOUT = eINSTANCE.getCommonDockerManager_SuspendTimeout();

		/**
		 * The meta object literal for the '<em><b>Resume Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_DOCKER_MANAGER__RESUME_TIMEOUT = eINSTANCE.getCommonDockerManager_ResumeTimeout();

		/**
		 * The meta object literal for the '<em><b>Docker Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_DOCKER_MANAGER__DOCKER_CONFIGURATION = eINSTANCE.getCommonDockerManager_DockerConfiguration();

	}

} //ManagerPackage
