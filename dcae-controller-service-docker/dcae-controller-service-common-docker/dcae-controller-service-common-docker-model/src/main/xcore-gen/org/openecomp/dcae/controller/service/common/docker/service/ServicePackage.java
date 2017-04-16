
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
package org.openecomp.dcae.controller.service.common.docker.service;

import org.openecomp.dcae.controller.service.docker.DockerPackage;

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
 * @see org.openecomp.dcae.controller.service.common.docker.service.ServiceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-service-common-docker-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.service.common.docker'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore ecomp='http://openecomp.org'"
 * @generated
 */
public interface ServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "service";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.dcae.controller.service.common.docker.service";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "service";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicePackage eINSTANCE = org.openecomp.dcae.controller.service.common.docker.service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.common.docker.service.impl.CommonDockerServiceImpl <em>Common Docker Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.common.docker.service.impl.CommonDockerServiceImpl
	 * @see org.openecomp.dcae.controller.service.common.docker.service.impl.ServicePackageImpl#getCommonDockerService()
	 * @generated
	 */
	int COMMON_DOCKER_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE__NAME = DockerPackage.DOCKER_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE__LAST_POLLED = DockerPackage.DOCKER_SERVICE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE__LAST_CHANGED = DockerPackage.DOCKER_SERVICE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE__CREATED = DockerPackage.DOCKER_SERVICE__CREATED;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE__INSTANCES = DockerPackage.DOCKER_SERVICE__INSTANCES;

	/**
	 * The number of structural features of the '<em>Common Docker Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_FEATURE_COUNT = DockerPackage.DOCKER_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE___DEPLOY__STRING_STRING = DockerPackage.DOCKER_SERVICE___DEPLOY__STRING_STRING;

	/**
	 * The operation id for the '<em>Undeploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE___UNDEPLOY__STRING = DockerPackage.DOCKER_SERVICE___UNDEPLOY__STRING;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE___TEST__STRING = DockerPackage.DOCKER_SERVICE___TEST__STRING;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE___SUSPEND__STRING = DockerPackage.DOCKER_SERVICE___SUSPEND__STRING;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE___RESUME__STRING = DockerPackage.DOCKER_SERVICE___RESUME__STRING;

	/**
	 * The operation id for the '<em>Push Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING = DockerPackage.DOCKER_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Poll Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE___POLL_MANAGER_CONFIGURATION__STRING = DockerPackage.DOCKER_SERVICE___POLL_MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE___MANAGER_CONFIGURATION__STRING = DockerPackage.DOCKER_SERVICE___MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Manager Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT = DockerPackage.DOCKER_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT;

	/**
	 * The operation id for the '<em>Update Configuration From Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING = DockerPackage.DOCKER_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING;

	/**
	 * The operation id for the '<em>Run Health Tests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE___RUN_HEALTH_TESTS = DockerPackage.DOCKER_SERVICE___RUN_HEALTH_TESTS;

	/**
	 * The number of operations of the '<em>Common Docker Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_OPERATION_COUNT = DockerPackage.DOCKER_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.common.docker.service.impl.CommonDockerServiceInstanceImpl <em>Common Docker Service Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.common.docker.service.impl.CommonDockerServiceInstanceImpl
	 * @see org.openecomp.dcae.controller.service.common.docker.service.impl.ServicePackageImpl#getCommonDockerServiceInstance()
	 * @generated
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__NAME = DockerPackage.DOCKER_SERVICE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__LAST_POLLED = DockerPackage.DOCKER_SERVICE_INSTANCE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__LAST_CHANGED = DockerPackage.DOCKER_SERVICE_INSTANCE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__CREATED = DockerPackage.DOCKER_SERVICE_INSTANCE__CREATED;

	/**
	 * The feature id for the '<em><b>Service Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__SERVICE_CONTAINER = DockerPackage.DOCKER_SERVICE_INSTANCE__SERVICE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__STATUS = DockerPackage.DOCKER_SERVICE_INSTANCE__STATUS;

	/**
	 * The feature id for the '<em><b>Input Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__INPUT_STREAMS = DockerPackage.DOCKER_SERVICE_INSTANCE__INPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Output Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__OUTPUT_STREAMS = DockerPackage.DOCKER_SERVICE_INSTANCE__OUTPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Last Health Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__LAST_HEALTH_TEST = DockerPackage.DOCKER_SERVICE_INSTANCE__LAST_HEALTH_TEST;

	/**
	 * The feature id for the '<em><b>Health Test Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__HEALTH_TEST_STATUS = DockerPackage.DOCKER_SERVICE_INSTANCE__HEALTH_TEST_STATUS;

	/**
	 * The feature id for the '<em><b>Health Test Message Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE = DockerPackage.DOCKER_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE;

	/**
	 * The feature id for the '<em><b>Docker Host</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__DOCKER_HOST = DockerPackage.DOCKER_SERVICE_INSTANCE__DOCKER_HOST;

	/**
	 * The feature id for the '<em><b>Host Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__HOST_SERVICE = DockerPackage.DOCKER_SERVICE_INSTANCE__HOST_SERVICE;

	/**
	 * The feature id for the '<em><b>Docker Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__DOCKER_NAME = DockerPackage.DOCKER_SERVICE_INSTANCE__DOCKER_NAME;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__IMAGE = DockerPackage.DOCKER_SERVICE_INSTANCE__IMAGE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__CONFIGURATION = DockerPackage.DOCKER_SERVICE_INSTANCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__VOLUMES = DockerPackage.DOCKER_SERVICE_INSTANCE__VOLUMES;

	/**
	 * The feature id for the '<em><b>Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__LINKS = DockerPackage.DOCKER_SERVICE_INSTANCE__LINKS;

	/**
	 * The feature id for the '<em><b>Envs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__ENVS = DockerPackage.DOCKER_SERVICE_INSTANCE__ENVS;

	/**
	 * The feature id for the '<em><b>Port Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__PORT_BINDINGS = DockerPackage.DOCKER_SERVICE_INSTANCE__PORT_BINDINGS;

	/**
	 * The feature id for the '<em><b>Manager Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__MANAGER_PORT_NUMBER = DockerPackage.DOCKER_SERVICE_INSTANCE__MANAGER_PORT_NUMBER;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__SCRIPT = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configure Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__CONFIGURE_TIMEOUT = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__TEST_TIMEOUT = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Suspend Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__SUSPEND_TIMEOUT = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resume Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__RESUME_TIMEOUT = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Docker Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE__DOCKER_CONFIGURATION = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Common Docker Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE_FEATURE_COUNT = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Common Docker Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_INSTANCE_OPERATION_COUNT = DockerPackage.DOCKER_SERVICE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.common.docker.service.impl.CommonDockerServiceConfigurationImpl <em>Common Docker Service Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.common.docker.service.impl.CommonDockerServiceConfigurationImpl
	 * @see org.openecomp.dcae.controller.service.common.docker.service.impl.ServicePackageImpl#getCommonDockerServiceConfiguration()
	 * @generated
	 */
	int COMMON_DOCKER_SERVICE_CONFIGURATION = 2;

	/**
	 * The number of structural features of the '<em>Common Docker Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Common Docker Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_DOCKER_SERVICE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.common.docker.service.impl.TommyDockerServiceConfigurationImpl <em>Tommy Docker Service Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.common.docker.service.impl.TommyDockerServiceConfigurationImpl
	 * @see org.openecomp.dcae.controller.service.common.docker.service.impl.ServicePackageImpl#getTommyDockerServiceConfiguration()
	 * @generated
	 */
	int TOMMY_DOCKER_SERVICE_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Postgres User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMMY_DOCKER_SERVICE_CONFIGURATION__POSTGRES_USER_NAME = COMMON_DOCKER_SERVICE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postgres Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMMY_DOCKER_SERVICE_CONFIGURATION__POSTGRES_PASSWORD = COMMON_DOCKER_SERVICE_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Portgres Jdbc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMMY_DOCKER_SERVICE_CONFIGURATION__PORTGRES_JDBC = COMMON_DOCKER_SERVICE_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tommy Docker Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMMY_DOCKER_SERVICE_CONFIGURATION_FEATURE_COUNT = COMMON_DOCKER_SERVICE_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tommy Docker Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMMY_DOCKER_SERVICE_CONFIGURATION_OPERATION_COUNT = COMMON_DOCKER_SERVICE_CONFIGURATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.common.docker.service.CommonDockerService <em>Common Docker Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Docker Service</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.service.CommonDockerService
	 * @generated
	 */
	EClass getCommonDockerService();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceInstance <em>Common Docker Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Docker Service Instance</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceInstance
	 * @generated
	 */
	EClass getCommonDockerServiceInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceInstance#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceInstance#getScript()
	 * @see #getCommonDockerServiceInstance()
	 * @generated
	 */
	EAttribute getCommonDockerServiceInstance_Script();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceInstance#getConfigureTimeout <em>Configure Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configure Timeout</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceInstance#getConfigureTimeout()
	 * @see #getCommonDockerServiceInstance()
	 * @generated
	 */
	EAttribute getCommonDockerServiceInstance_ConfigureTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceInstance#getTestTimeout <em>Test Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Timeout</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceInstance#getTestTimeout()
	 * @see #getCommonDockerServiceInstance()
	 * @generated
	 */
	EAttribute getCommonDockerServiceInstance_TestTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceInstance#getSuspendTimeout <em>Suspend Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspend Timeout</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceInstance#getSuspendTimeout()
	 * @see #getCommonDockerServiceInstance()
	 * @generated
	 */
	EAttribute getCommonDockerServiceInstance_SuspendTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceInstance#getResumeTimeout <em>Resume Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resume Timeout</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceInstance#getResumeTimeout()
	 * @see #getCommonDockerServiceInstance()
	 * @generated
	 */
	EAttribute getCommonDockerServiceInstance_ResumeTimeout();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceInstance#getDockerConfiguration <em>Docker Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Docker Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceInstance#getDockerConfiguration()
	 * @see #getCommonDockerServiceInstance()
	 * @generated
	 */
	EReference getCommonDockerServiceInstance_DockerConfiguration();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceConfiguration <em>Common Docker Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Docker Service Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.service.CommonDockerServiceConfiguration
	 * @generated
	 */
	EClass getCommonDockerServiceConfiguration();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.common.docker.service.TommyDockerServiceConfiguration <em>Tommy Docker Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tommy Docker Service Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.service.TommyDockerServiceConfiguration
	 * @generated
	 */
	EClass getTommyDockerServiceConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.docker.service.TommyDockerServiceConfiguration#getPostgresUserName <em>Postgres User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postgres User Name</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.service.TommyDockerServiceConfiguration#getPostgresUserName()
	 * @see #getTommyDockerServiceConfiguration()
	 * @generated
	 */
	EAttribute getTommyDockerServiceConfiguration_PostgresUserName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.docker.service.TommyDockerServiceConfiguration#getPostgresPassword <em>Postgres Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postgres Password</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.service.TommyDockerServiceConfiguration#getPostgresPassword()
	 * @see #getTommyDockerServiceConfiguration()
	 * @generated
	 */
	EAttribute getTommyDockerServiceConfiguration_PostgresPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.docker.service.TommyDockerServiceConfiguration#getPortgresJdbc <em>Portgres Jdbc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portgres Jdbc</em>'.
	 * @see org.openecomp.dcae.controller.service.common.docker.service.TommyDockerServiceConfiguration#getPortgresJdbc()
	 * @see #getTommyDockerServiceConfiguration()
	 * @generated
	 */
	EAttribute getTommyDockerServiceConfiguration_PortgresJdbc();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceFactory getServiceFactory();

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
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.common.docker.service.impl.CommonDockerServiceImpl <em>Common Docker Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.common.docker.service.impl.CommonDockerServiceImpl
		 * @see org.openecomp.dcae.controller.service.common.docker.service.impl.ServicePackageImpl#getCommonDockerService()
		 * @generated
		 */
		EClass COMMON_DOCKER_SERVICE = eINSTANCE.getCommonDockerService();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.common.docker.service.impl.CommonDockerServiceInstanceImpl <em>Common Docker Service Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.common.docker.service.impl.CommonDockerServiceInstanceImpl
		 * @see org.openecomp.dcae.controller.service.common.docker.service.impl.ServicePackageImpl#getCommonDockerServiceInstance()
		 * @generated
		 */
		EClass COMMON_DOCKER_SERVICE_INSTANCE = eINSTANCE.getCommonDockerServiceInstance();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_DOCKER_SERVICE_INSTANCE__SCRIPT = eINSTANCE.getCommonDockerServiceInstance_Script();

		/**
		 * The meta object literal for the '<em><b>Configure Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_DOCKER_SERVICE_INSTANCE__CONFIGURE_TIMEOUT = eINSTANCE.getCommonDockerServiceInstance_ConfigureTimeout();

		/**
		 * The meta object literal for the '<em><b>Test Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_DOCKER_SERVICE_INSTANCE__TEST_TIMEOUT = eINSTANCE.getCommonDockerServiceInstance_TestTimeout();

		/**
		 * The meta object literal for the '<em><b>Suspend Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_DOCKER_SERVICE_INSTANCE__SUSPEND_TIMEOUT = eINSTANCE.getCommonDockerServiceInstance_SuspendTimeout();

		/**
		 * The meta object literal for the '<em><b>Resume Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_DOCKER_SERVICE_INSTANCE__RESUME_TIMEOUT = eINSTANCE.getCommonDockerServiceInstance_ResumeTimeout();

		/**
		 * The meta object literal for the '<em><b>Docker Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_DOCKER_SERVICE_INSTANCE__DOCKER_CONFIGURATION = eINSTANCE.getCommonDockerServiceInstance_DockerConfiguration();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.common.docker.service.impl.CommonDockerServiceConfigurationImpl <em>Common Docker Service Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.common.docker.service.impl.CommonDockerServiceConfigurationImpl
		 * @see org.openecomp.dcae.controller.service.common.docker.service.impl.ServicePackageImpl#getCommonDockerServiceConfiguration()
		 * @generated
		 */
		EClass COMMON_DOCKER_SERVICE_CONFIGURATION = eINSTANCE.getCommonDockerServiceConfiguration();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.common.docker.service.impl.TommyDockerServiceConfigurationImpl <em>Tommy Docker Service Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.common.docker.service.impl.TommyDockerServiceConfigurationImpl
		 * @see org.openecomp.dcae.controller.service.common.docker.service.impl.ServicePackageImpl#getTommyDockerServiceConfiguration()
		 * @generated
		 */
		EClass TOMMY_DOCKER_SERVICE_CONFIGURATION = eINSTANCE.getTommyDockerServiceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Postgres User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOMMY_DOCKER_SERVICE_CONFIGURATION__POSTGRES_USER_NAME = eINSTANCE.getTommyDockerServiceConfiguration_PostgresUserName();

		/**
		 * The meta object literal for the '<em><b>Postgres Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOMMY_DOCKER_SERVICE_CONFIGURATION__POSTGRES_PASSWORD = eINSTANCE.getTommyDockerServiceConfiguration_PostgresPassword();

		/**
		 * The meta object literal for the '<em><b>Portgres Jdbc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOMMY_DOCKER_SERVICE_CONFIGURATION__PORTGRES_JDBC = eINSTANCE.getTommyDockerServiceConfiguration_PortgresJdbc();

	}

} //ServicePackage
