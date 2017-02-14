
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
package org.openecomp.dcae.controller.service.docker;

import org.openecomp.dcae.controller.core.service.ServicePackage;
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
 * @see org.openecomp.dcae.controller.service.docker.DockerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-service-docker-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.service'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore ecomp='http://openecomp.org'"
 * @generated
 */
public interface DockerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "docker";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.dcae.controller.service.docker";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "docker";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DockerPackage eINSTANCE = org.openecomp.dcae.controller.service.docker.impl.DockerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.docker.impl.DockerServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.docker.impl.DockerServiceImpl
	 * @see org.openecomp.dcae.controller.service.docker.impl.DockerPackageImpl#getDockerService()
	 * @generated
	 */
	int DOCKER_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE__NAME = ServicePackage.DCAE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE__LAST_POLLED = ServicePackage.DCAE_SERVICE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE__LAST_CHANGED = ServicePackage.DCAE_SERVICE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE__CREATED = ServicePackage.DCAE_SERVICE__CREATED;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE__INSTANCES = ServicePackage.DCAE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_FEATURE_COUNT = ServicePackage.DCAE_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE___DEPLOY__STRING_STRING = ServicePackage.DCAE_SERVICE___DEPLOY__STRING_STRING;

	/**
	 * The operation id for the '<em>Undeploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE___UNDEPLOY__STRING = ServicePackage.DCAE_SERVICE___UNDEPLOY__STRING;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE___TEST__STRING = ServicePackage.DCAE_SERVICE___TEST__STRING;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE___SUSPEND__STRING = ServicePackage.DCAE_SERVICE___SUSPEND__STRING;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE___RESUME__STRING = ServicePackage.DCAE_SERVICE___RESUME__STRING;

	/**
	 * The operation id for the '<em>Push Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING = ServicePackage.DCAE_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Poll Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE___POLL_MANAGER_CONFIGURATION__STRING = ServicePackage.DCAE_SERVICE___POLL_MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE___MANAGER_CONFIGURATION__STRING = ServicePackage.DCAE_SERVICE___MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Manager Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT = ServicePackage.DCAE_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT;

	/**
	 * The operation id for the '<em>Update Configuration From Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING = ServicePackage.DCAE_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING;

	/**
	 * The operation id for the '<em>Run Health Tests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE___RUN_HEALTH_TESTS = ServicePackage.DCAE_SERVICE___RUN_HEALTH_TESTS;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_OPERATION_COUNT = ServicePackage.DCAE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.docker.impl.DockerServiceInstanceImpl <em>Service Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.docker.impl.DockerServiceInstanceImpl
	 * @see org.openecomp.dcae.controller.service.docker.impl.DockerPackageImpl#getDockerServiceInstance()
	 * @generated
	 */
	int DOCKER_SERVICE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__NAME = ServicePackage.DCAE_SERVICE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__LAST_POLLED = ServicePackage.DCAE_SERVICE_INSTANCE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__LAST_CHANGED = ServicePackage.DCAE_SERVICE_INSTANCE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__CREATED = ServicePackage.DCAE_SERVICE_INSTANCE__CREATED;

	/**
	 * The feature id for the '<em><b>Service Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__SERVICE_CONTAINER = ServicePackage.DCAE_SERVICE_INSTANCE__SERVICE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__STATUS = ServicePackage.DCAE_SERVICE_INSTANCE__STATUS;

	/**
	 * The feature id for the '<em><b>Input Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__INPUT_STREAMS = ServicePackage.DCAE_SERVICE_INSTANCE__INPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Output Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__OUTPUT_STREAMS = ServicePackage.DCAE_SERVICE_INSTANCE__OUTPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Last Health Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__LAST_HEALTH_TEST = ServicePackage.DCAE_SERVICE_INSTANCE__LAST_HEALTH_TEST;

	/**
	 * The feature id for the '<em><b>Health Test Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__HEALTH_TEST_STATUS = ServicePackage.DCAE_SERVICE_INSTANCE__HEALTH_TEST_STATUS;

	/**
	 * The feature id for the '<em><b>Health Test Message Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE = ServicePackage.DCAE_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE;

	/**
	 * The feature id for the '<em><b>Docker Host</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__DOCKER_HOST = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__HOST_SERVICE = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Docker Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__DOCKER_NAME = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__IMAGE = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__CONFIGURATION = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__VOLUMES = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__LINKS = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Envs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__ENVS = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Port Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__PORT_BINDINGS = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Manager Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE__MANAGER_PORT_NUMBER = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE_FEATURE_COUNT = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_INSTANCE_OPERATION_COUNT = ServicePackage.DCAE_SERVICE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.docker.impl.DockerConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.docker.impl.DockerConfigurationImpl
	 * @see org.openecomp.dcae.controller.service.docker.impl.DockerPackageImpl#getDockerConfiguration()
	 * @generated
	 */
	int DOCKER_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONFIGURATION__CONFIGURATION = 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONFIGURATION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.docker.impl.DockerServiceDescriptorImpl <em>Service Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.docker.impl.DockerServiceDescriptorImpl
	 * @see org.openecomp.dcae.controller.service.docker.impl.DockerPackageImpl#getDockerServiceDescriptor()
	 * @generated
	 */
	int DOCKER_SERVICE_DESCRIPTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_DESCRIPTOR__NAME = ServicePackage.DCAE_SERVICE_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_DESCRIPTOR__LAST_POLLED = ServicePackage.DCAE_SERVICE_DESCRIPTOR__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_DESCRIPTOR__LAST_CHANGED = ServicePackage.DCAE_SERVICE_DESCRIPTOR__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_DESCRIPTOR__CREATED = ServicePackage.DCAE_SERVICE_DESCRIPTOR__CREATED;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_DESCRIPTOR__GROUP_ID = ServicePackage.DCAE_SERVICE_DESCRIPTOR__GROUP_ID;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_DESCRIPTOR__ARTIFACT = ServicePackage.DCAE_SERVICE_DESCRIPTOR__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_DESCRIPTOR__VERSION = ServicePackage.DCAE_SERVICE_DESCRIPTOR__VERSION;

	/**
	 * The feature id for the '<em><b>Service Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_DESCRIPTOR__SERVICE_PACKAGE = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_DESCRIPTOR__SERVICE_CLASS = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Docker Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_DESCRIPTOR__DOCKER_IMAGE = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Manager Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_DESCRIPTOR__MANAGER_PORT_NUMBER = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Manager User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_DESCRIPTOR__MANAGER_USER = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Encrypted Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_DESCRIPTOR__ENCRYPTED_PASSWORD = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Service Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_DESCRIPTOR_FEATURE_COUNT = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Service Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_SERVICE_DESCRIPTOR_OPERATION_COUNT = ServicePackage.DCAE_SERVICE_DESCRIPTOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.docker.DockerService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerService
	 * @generated
	 */
	EClass getDockerService();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.docker.DockerService#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerService#getInstances()
	 * @see #getDockerService()
	 * @generated
	 */
	EReference getDockerService_Instances();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance <em>Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Instance</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceInstance
	 * @generated
	 */
	EClass getDockerServiceInstance();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getDockerHost <em>Docker Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Docker Host</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getDockerHost()
	 * @see #getDockerServiceInstance()
	 * @generated
	 */
	EReference getDockerServiceInstance_DockerHost();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getHostService <em>Host Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host Service</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getHostService()
	 * @see #getDockerServiceInstance()
	 * @generated
	 */
	EReference getDockerServiceInstance_HostService();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getDockerName <em>Docker Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker Name</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getDockerName()
	 * @see #getDockerServiceInstance()
	 * @generated
	 */
	EAttribute getDockerServiceInstance_DockerName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getImage()
	 * @see #getDockerServiceInstance()
	 * @generated
	 */
	EAttribute getDockerServiceInstance_Image();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getConfiguration()
	 * @see #getDockerServiceInstance()
	 * @generated
	 */
	EReference getDockerServiceInstance_Configuration();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Volumes</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getVolumes()
	 * @see #getDockerServiceInstance()
	 * @generated
	 */
	EAttribute getDockerServiceInstance_Volumes();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Links</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getLinks()
	 * @see #getDockerServiceInstance()
	 * @generated
	 */
	EAttribute getDockerServiceInstance_Links();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getEnvs <em>Envs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Envs</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getEnvs()
	 * @see #getDockerServiceInstance()
	 * @generated
	 */
	EAttribute getDockerServiceInstance_Envs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getPortBindings <em>Port Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Bindings</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getPortBindings()
	 * @see #getDockerServiceInstance()
	 * @generated
	 */
	EReference getDockerServiceInstance_PortBindings();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getManagerPortNumber <em>Manager Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager Port Number</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getManagerPortNumber()
	 * @see #getDockerServiceInstance()
	 * @generated
	 */
	EAttribute getDockerServiceInstance_ManagerPortNumber();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.docker.DockerConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerConfiguration
	 * @generated
	 */
	EClass getDockerConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.docker.DockerConfiguration#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerConfiguration#getConfiguration()
	 * @see #getDockerConfiguration()
	 * @generated
	 */
	EAttribute getDockerConfiguration_Configuration();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor <em>Service Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Descriptor</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor
	 * @generated
	 */
	EClass getDockerServiceDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getServicePackage <em>Service Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Package</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getServicePackage()
	 * @see #getDockerServiceDescriptor()
	 * @generated
	 */
	EAttribute getDockerServiceDescriptor_ServicePackage();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getServiceClass <em>Service Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Class</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getServiceClass()
	 * @see #getDockerServiceDescriptor()
	 * @generated
	 */
	EAttribute getDockerServiceDescriptor_ServiceClass();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getServiceInstanceClass <em>Service Instance Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Instance Class</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getServiceInstanceClass()
	 * @see #getDockerServiceDescriptor()
	 * @generated
	 */
	EAttribute getDockerServiceDescriptor_ServiceInstanceClass();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getDockerImage <em>Docker Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker Image</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getDockerImage()
	 * @see #getDockerServiceDescriptor()
	 * @generated
	 */
	EAttribute getDockerServiceDescriptor_DockerImage();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getManagerPortNumber <em>Manager Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager Port Number</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getManagerPortNumber()
	 * @see #getDockerServiceDescriptor()
	 * @generated
	 */
	EAttribute getDockerServiceDescriptor_ManagerPortNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getManagerUser <em>Manager User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager User</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getManagerUser()
	 * @see #getDockerServiceDescriptor()
	 * @generated
	 */
	EAttribute getDockerServiceDescriptor_ManagerUser();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getEncryptedPassword <em>Encrypted Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypted Password</em>'.
	 * @see org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getEncryptedPassword()
	 * @see #getDockerServiceDescriptor()
	 * @generated
	 */
	EAttribute getDockerServiceDescriptor_EncryptedPassword();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DockerFactory getDockerFactory();

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
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.docker.impl.DockerServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.docker.impl.DockerServiceImpl
		 * @see org.openecomp.dcae.controller.service.docker.impl.DockerPackageImpl#getDockerService()
		 * @generated
		 */
		EClass DOCKER_SERVICE = eINSTANCE.getDockerService();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_SERVICE__INSTANCES = eINSTANCE.getDockerService_Instances();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.docker.impl.DockerServiceInstanceImpl <em>Service Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.docker.impl.DockerServiceInstanceImpl
		 * @see org.openecomp.dcae.controller.service.docker.impl.DockerPackageImpl#getDockerServiceInstance()
		 * @generated
		 */
		EClass DOCKER_SERVICE_INSTANCE = eINSTANCE.getDockerServiceInstance();

		/**
		 * The meta object literal for the '<em><b>Docker Host</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_SERVICE_INSTANCE__DOCKER_HOST = eINSTANCE.getDockerServiceInstance_DockerHost();

		/**
		 * The meta object literal for the '<em><b>Host Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_SERVICE_INSTANCE__HOST_SERVICE = eINSTANCE.getDockerServiceInstance_HostService();

		/**
		 * The meta object literal for the '<em><b>Docker Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_SERVICE_INSTANCE__DOCKER_NAME = eINSTANCE.getDockerServiceInstance_DockerName();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_SERVICE_INSTANCE__IMAGE = eINSTANCE.getDockerServiceInstance_Image();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_SERVICE_INSTANCE__CONFIGURATION = eINSTANCE.getDockerServiceInstance_Configuration();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_SERVICE_INSTANCE__VOLUMES = eINSTANCE.getDockerServiceInstance_Volumes();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_SERVICE_INSTANCE__LINKS = eINSTANCE.getDockerServiceInstance_Links();

		/**
		 * The meta object literal for the '<em><b>Envs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_SERVICE_INSTANCE__ENVS = eINSTANCE.getDockerServiceInstance_Envs();

		/**
		 * The meta object literal for the '<em><b>Port Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_SERVICE_INSTANCE__PORT_BINDINGS = eINSTANCE.getDockerServiceInstance_PortBindings();

		/**
		 * The meta object literal for the '<em><b>Manager Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_SERVICE_INSTANCE__MANAGER_PORT_NUMBER = eINSTANCE.getDockerServiceInstance_ManagerPortNumber();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.docker.impl.DockerConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.docker.impl.DockerConfigurationImpl
		 * @see org.openecomp.dcae.controller.service.docker.impl.DockerPackageImpl#getDockerConfiguration()
		 * @generated
		 */
		EClass DOCKER_CONFIGURATION = eINSTANCE.getDockerConfiguration();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONFIGURATION__CONFIGURATION = eINSTANCE.getDockerConfiguration_Configuration();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.docker.impl.DockerServiceDescriptorImpl <em>Service Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.docker.impl.DockerServiceDescriptorImpl
		 * @see org.openecomp.dcae.controller.service.docker.impl.DockerPackageImpl#getDockerServiceDescriptor()
		 * @generated
		 */
		EClass DOCKER_SERVICE_DESCRIPTOR = eINSTANCE.getDockerServiceDescriptor();

		/**
		 * The meta object literal for the '<em><b>Service Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_SERVICE_DESCRIPTOR__SERVICE_PACKAGE = eINSTANCE.getDockerServiceDescriptor_ServicePackage();

		/**
		 * The meta object literal for the '<em><b>Service Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_SERVICE_DESCRIPTOR__SERVICE_CLASS = eINSTANCE.getDockerServiceDescriptor_ServiceClass();

		/**
		 * The meta object literal for the '<em><b>Service Instance Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS = eINSTANCE.getDockerServiceDescriptor_ServiceInstanceClass();

		/**
		 * The meta object literal for the '<em><b>Docker Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_SERVICE_DESCRIPTOR__DOCKER_IMAGE = eINSTANCE.getDockerServiceDescriptor_DockerImage();

		/**
		 * The meta object literal for the '<em><b>Manager Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_SERVICE_DESCRIPTOR__MANAGER_PORT_NUMBER = eINSTANCE.getDockerServiceDescriptor_ManagerPortNumber();

		/**
		 * The meta object literal for the '<em><b>Manager User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_SERVICE_DESCRIPTOR__MANAGER_USER = eINSTANCE.getDockerServiceDescriptor_ManagerUser();

		/**
		 * The meta object literal for the '<em><b>Encrypted Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_SERVICE_DESCRIPTOR__ENCRYPTED_PASSWORD = eINSTANCE.getDockerServiceDescriptor_EncryptedPassword();

	}

} //DockerPackage
