
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
package org.openecomp.dcae.controller.service.docker.host.manager;

import org.openecomp.dcae.controller.service.vmmanager.VmmanagerPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.openecomp.dcae.controller.service.docker.host.manager.ManagerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-service-docker-host-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.service.docker.host'"
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
	String eNS_URI = "org.openecomp.dcae.controller.service.docker.host.manager";

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
	ManagerPackage eINSTANCE = org.openecomp.dcae.controller.service.docker.host.manager.impl.ManagerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.docker.host.manager.impl.DockerHostManagerImpl <em>Docker Host Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.docker.host.manager.impl.DockerHostManagerImpl
	 * @see org.openecomp.dcae.controller.service.docker.host.manager.impl.ManagerPackageImpl#getDockerHostManager()
	 * @generated
	 */
	int DOCKER_HOST_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Input Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER__INPUT_STREAMS = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__INPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Output Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER__OUTPUT_STREAMS = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__OUTPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER__CONFIGURATION = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER__COMPONENT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__COMPONENT;

	/**
	 * The feature id for the '<em><b>Docker Host</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER__DOCKER_HOST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Docker Host Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER_FEATURE_COUNT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___TEST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___TEST;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___SUSPEND = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___SUSPEND;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___RESUME = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___RESUME;

	/**
	 * The operation id for the '<em>Public Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___PUBLIC_KEY = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___PUBLIC_KEY;

	/**
	 * The operation id for the '<em>Configuration Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___CONFIGURATION_CHANGED = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___CONFIGURATION_CHANGED;

	/**
	 * The operation id for the '<em>Update Streams</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___UPDATE_STREAMS__ELIST_ELIST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___UPDATE_STREAMS__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Logs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___LOGS__JSONOBJECT_ELIST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___LOGS__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Metrics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___METRICS__JSONOBJECT_ELIST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___METRICS__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___PROPERTIES__JSONOBJECT_ELIST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___PROPERTIES__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Upload Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___UPLOAD_INFO__JSONOBJECT_ELIST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___UPLOAD_INFO__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Get Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___GET_VALUES__JSONOBJECT_STRING_LONG_LONG_METRICVALUEOPTION_BOOLEAN = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_VALUES__JSONOBJECT_STRING_LONG_LONG_METRICVALUEOPTION_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Values All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___GET_VALUES_ALL__JSONOBJECT_STRING_ELIST_LONG_LONG_METRICVALUEOPTION_BOOLEAN = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_VALUES_ALL__JSONOBJECT_STRING_ELIST_LONG_LONG_METRICVALUEOPTION_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Messages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___GET_MESSAGES__JSONOBJECT_STRING_LONG_LONG = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_MESSAGES__JSONOBJECT_STRING_LONG_LONG;

	/**
	 * The operation id for the '<em>Get Request Logger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___GET_REQUEST_LOGGER__STRING_STRING_STRING_JSONOBJECT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_REQUEST_LOGGER__STRING_STRING_STRING_JSONOBJECT;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___EVALUATE__STRING_FUNCTION = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___EVALUATE__STRING_FUNCTION;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___UPDATE__STRING_FUNCTION = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___UPDATE__STRING_FUNCTION;

	/**
	 * The operation id for the '<em>Update Container Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___UPDATE_CONTAINER_CONFIGURATION__STRING_EOBJECT_ELIST_ELIST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Suspend Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___SUSPEND_CONTAINER__STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Resume Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___RESUME_CONTAINER__STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Test Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___TEST_CONTAINER__STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Setup Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER___SETUP_CONFIGURATION__STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Docker Host Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_MANAGER_OPERATION_COUNT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager <em>Docker Host Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Host Manager</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager
	 * @generated
	 */
	EClass getDockerHostManager();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager#updateContainerConfiguration(java.lang.String, org.eclipse.emf.ecore.EObject, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Update Container Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Container Configuration</em>' operation.
	 * @see org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager#updateContainerConfiguration(java.lang.String, org.eclipse.emf.ecore.EObject, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDockerHostManager__UpdateContainerConfiguration__String_EObject_EList_EList();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager#suspendContainer(java.lang.String) <em>Suspend Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Suspend Container</em>' operation.
	 * @see org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager#suspendContainer(java.lang.String)
	 * @generated
	 */
	EOperation getDockerHostManager__SuspendContainer__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager#resumeContainer(java.lang.String) <em>Resume Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resume Container</em>' operation.
	 * @see org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager#resumeContainer(java.lang.String)
	 * @generated
	 */
	EOperation getDockerHostManager__ResumeContainer__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager#testContainer(java.lang.String) <em>Test Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Container</em>' operation.
	 * @see org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager#testContainer(java.lang.String)
	 * @generated
	 */
	EOperation getDockerHostManager__TestContainer__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager#setupConfiguration(java.lang.String, java.lang.String) <em>Setup Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Setup Configuration</em>' operation.
	 * @see org.openecomp.dcae.controller.service.docker.host.manager.DockerHostManager#setupConfiguration(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDockerHostManager__SetupConfiguration__String_String();

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
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.docker.host.manager.impl.DockerHostManagerImpl <em>Docker Host Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.docker.host.manager.impl.DockerHostManagerImpl
		 * @see org.openecomp.dcae.controller.service.docker.host.manager.impl.ManagerPackageImpl#getDockerHostManager()
		 * @generated
		 */
		EClass DOCKER_HOST_MANAGER = eINSTANCE.getDockerHostManager();
		/**
		 * The meta object literal for the '<em><b>Update Container Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST_MANAGER___UPDATE_CONTAINER_CONFIGURATION__STRING_EOBJECT_ELIST_ELIST = eINSTANCE.getDockerHostManager__UpdateContainerConfiguration__String_EObject_EList_EList();
		/**
		 * The meta object literal for the '<em><b>Suspend Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST_MANAGER___SUSPEND_CONTAINER__STRING = eINSTANCE.getDockerHostManager__SuspendContainer__String();
		/**
		 * The meta object literal for the '<em><b>Resume Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST_MANAGER___RESUME_CONTAINER__STRING = eINSTANCE.getDockerHostManager__ResumeContainer__String();
		/**
		 * The meta object literal for the '<em><b>Test Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST_MANAGER___TEST_CONTAINER__STRING = eINSTANCE.getDockerHostManager__TestContainer__String();
		/**
		 * The meta object literal for the '<em><b>Setup Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST_MANAGER___SETUP_CONFIGURATION__STRING_STRING = eINSTANCE.getDockerHostManager__SetupConfiguration__String_String();

	}

} //ManagerPackage
