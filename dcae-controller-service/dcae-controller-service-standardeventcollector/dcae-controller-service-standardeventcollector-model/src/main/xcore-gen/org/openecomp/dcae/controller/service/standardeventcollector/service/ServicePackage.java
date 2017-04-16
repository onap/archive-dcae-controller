
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
package org.openecomp.dcae.controller.service.standardeventcollector.service;

import org.openecomp.dcae.controller.service.docker.DockerPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ServiceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-service-standardeventcollector-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.service.standardeventcollector'"
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
	String eNS_URI = "org.openecomp.dcae.controller.service.standardeventcollector.service";

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
	ServicePackage eINSTANCE = org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceImpl <em>Controller Service Standardeventcollector Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceImpl
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ServicePackageImpl#getControllerServiceStandardeventcollectorService()
	 * @generated
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE__NAME = DockerPackage.DOCKER_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE__LAST_POLLED = DockerPackage.DOCKER_SERVICE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE__LAST_CHANGED = DockerPackage.DOCKER_SERVICE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE__CREATED = DockerPackage.DOCKER_SERVICE__CREATED;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE__INSTANCES = DockerPackage.DOCKER_SERVICE__INSTANCES;

	/**
	 * The number of structural features of the '<em>Controller Service Standardeventcollector Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_FEATURE_COUNT = DockerPackage.DOCKER_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE___DEPLOY__STRING_STRING = DockerPackage.DOCKER_SERVICE___DEPLOY__STRING_STRING;

	/**
	 * The operation id for the '<em>Undeploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE___UNDEPLOY__STRING = DockerPackage.DOCKER_SERVICE___UNDEPLOY__STRING;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE___TEST__STRING = DockerPackage.DOCKER_SERVICE___TEST__STRING;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE___SUSPEND__STRING = DockerPackage.DOCKER_SERVICE___SUSPEND__STRING;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE___RESUME__STRING = DockerPackage.DOCKER_SERVICE___RESUME__STRING;

	/**
	 * The operation id for the '<em>Push Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING = DockerPackage.DOCKER_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Poll Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE___POLL_MANAGER_CONFIGURATION__STRING = DockerPackage.DOCKER_SERVICE___POLL_MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE___MANAGER_CONFIGURATION__STRING = DockerPackage.DOCKER_SERVICE___MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Manager Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT = DockerPackage.DOCKER_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT;

	/**
	 * The operation id for the '<em>Update Configuration From Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING = DockerPackage.DOCKER_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING;

	/**
	 * The operation id for the '<em>Run Health Tests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE___RUN_HEALTH_TESTS = DockerPackage.DOCKER_SERVICE___RUN_HEALTH_TESTS;

	/**
	 * The number of operations of the '<em>Controller Service Standardeventcollector Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_OPERATION_COUNT = DockerPackage.DOCKER_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceInstanceImpl <em>Controller Service Standardeventcollector Service Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceInstanceImpl
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ServicePackageImpl#getControllerServiceStandardeventcollectorServiceInstance()
	 * @generated
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__NAME = DockerPackage.DOCKER_SERVICE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__LAST_POLLED = DockerPackage.DOCKER_SERVICE_INSTANCE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__LAST_CHANGED = DockerPackage.DOCKER_SERVICE_INSTANCE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CREATED = DockerPackage.DOCKER_SERVICE_INSTANCE__CREATED;

	/**
	 * The feature id for the '<em><b>Service Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__SERVICE_CONTAINER = DockerPackage.DOCKER_SERVICE_INSTANCE__SERVICE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__STATUS = DockerPackage.DOCKER_SERVICE_INSTANCE__STATUS;

	/**
	 * The feature id for the '<em><b>Input Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__INPUT_STREAMS = DockerPackage.DOCKER_SERVICE_INSTANCE__INPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Output Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__OUTPUT_STREAMS = DockerPackage.DOCKER_SERVICE_INSTANCE__OUTPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Last Health Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__LAST_HEALTH_TEST = DockerPackage.DOCKER_SERVICE_INSTANCE__LAST_HEALTH_TEST;

	/**
	 * The feature id for the '<em><b>Health Test Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__HEALTH_TEST_STATUS = DockerPackage.DOCKER_SERVICE_INSTANCE__HEALTH_TEST_STATUS;

	/**
	 * The feature id for the '<em><b>Health Test Message Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE = DockerPackage.DOCKER_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE;

	/**
	 * The feature id for the '<em><b>Docker Host</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__DOCKER_HOST = DockerPackage.DOCKER_SERVICE_INSTANCE__DOCKER_HOST;

	/**
	 * The feature id for the '<em><b>Host Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__HOST_SERVICE = DockerPackage.DOCKER_SERVICE_INSTANCE__HOST_SERVICE;

	/**
	 * The feature id for the '<em><b>Docker Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__DOCKER_NAME = DockerPackage.DOCKER_SERVICE_INSTANCE__DOCKER_NAME;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__IMAGE = DockerPackage.DOCKER_SERVICE_INSTANCE__IMAGE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CONFIGURATION = DockerPackage.DOCKER_SERVICE_INSTANCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__VOLUMES = DockerPackage.DOCKER_SERVICE_INSTANCE__VOLUMES;

	/**
	 * The feature id for the '<em><b>Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__LINKS = DockerPackage.DOCKER_SERVICE_INSTANCE__LINKS;

	/**
	 * The feature id for the '<em><b>Envs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__ENVS = DockerPackage.DOCKER_SERVICE_INSTANCE__ENVS;

	/**
	 * The feature id for the '<em><b>Port Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__PORT_BINDINGS = DockerPackage.DOCKER_SERVICE_INSTANCE__PORT_BINDINGS;

	/**
	 * The feature id for the '<em><b>Manager Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__MANAGER_PORT_NUMBER = DockerPackage.DOCKER_SERVICE_INSTANCE__MANAGER_PORT_NUMBER;

	/**
	 * The feature id for the '<em><b>Cport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CPORT = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Csecport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CSECPORT = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Keystoreloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__KEYSTORELOC = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Keystorealias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__KEYSTOREALIAS = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Keystorepwdloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__KEYSTOREPWDLOC = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Maxinputqueue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__MAXINPUTQUEUE = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Authflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHFLAG = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Authlist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHLIST = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Checkschemaflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CHECKSCHEMAFLAG = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Schemafile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__SCHEMAFILE = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Streamid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__STREAMID = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Controller Service Standardeventcollector Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE_FEATURE_COUNT = DockerPackage.DOCKER_SERVICE_INSTANCE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Controller Service Standardeventcollector Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE_OPERATION_COUNT = DockerPackage.DOCKER_SERVICE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceConfigurationImpl <em>Controller Service Standardeventcollector Service Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceConfigurationImpl
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ServicePackageImpl#getControllerServiceStandardeventcollectorServiceConfiguration()
	 * @generated
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Cport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CPORT = 0;

	/**
	 * The feature id for the '<em><b>Csecport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CSECPORT = 1;

	/**
	 * The feature id for the '<em><b>Keystoreloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTORELOC = 2;

	/**
	 * The feature id for the '<em><b>Keystorealias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREALIAS = 3;

	/**
	 * The feature id for the '<em><b>Keystorepwdloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREPWDLOC = 4;

	/**
	 * The feature id for the '<em><b>Maxinputqueue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__MAXINPUTQUEUE = 5;

	/**
	 * The feature id for the '<em><b>Authflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHFLAG = 6;

	/**
	 * The feature id for the '<em><b>Authlist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHLIST = 7;

	/**
	 * The feature id for the '<em><b>Checkschemaflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CHECKSCHEMAFLAG = 8;

	/**
	 * The feature id for the '<em><b>Schemafile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__SCHEMAFILE = 9;

	/**
	 * The feature id for the '<em><b>Streamid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__STREAMID = 10;

	/**
	 * The number of structural features of the '<em>Controller Service Standardeventcollector Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Controller Service Standardeventcollector Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorService <em>Controller Service Standardeventcollector Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Service Standardeventcollector Service</em>'.
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorService
	 * @generated
	 */
	EClass getControllerServiceStandardeventcollectorService();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceInstance <em>Controller Service Standardeventcollector Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Service Standardeventcollector Service Instance</em>'.
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceInstance
	 * @generated
	 */
	EClass getControllerServiceStandardeventcollectorServiceInstance();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration <em>Controller Service Standardeventcollector Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Service Standardeventcollector Service Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration
	 * @generated
	 */
	EClass getControllerServiceStandardeventcollectorServiceConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getCport <em>Cport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cport</em>'.
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getCport()
	 * @see #getControllerServiceStandardeventcollectorServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Cport();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getCsecport <em>Csecport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Csecport</em>'.
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getCsecport()
	 * @see #getControllerServiceStandardeventcollectorServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Csecport();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getKeystoreloc <em>Keystoreloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keystoreloc</em>'.
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getKeystoreloc()
	 * @see #getControllerServiceStandardeventcollectorServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Keystoreloc();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getKeystorealias <em>Keystorealias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keystorealias</em>'.
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getKeystorealias()
	 * @see #getControllerServiceStandardeventcollectorServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Keystorealias();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getKeystorepwdloc <em>Keystorepwdloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keystorepwdloc</em>'.
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getKeystorepwdloc()
	 * @see #getControllerServiceStandardeventcollectorServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Keystorepwdloc();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getMaxinputqueue <em>Maxinputqueue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxinputqueue</em>'.
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getMaxinputqueue()
	 * @see #getControllerServiceStandardeventcollectorServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Maxinputqueue();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getAuthflag <em>Authflag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authflag</em>'.
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getAuthflag()
	 * @see #getControllerServiceStandardeventcollectorServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Authflag();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getCheckschemaflag <em>Checkschemaflag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checkschemaflag</em>'.
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getCheckschemaflag()
	 * @see #getControllerServiceStandardeventcollectorServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Checkschemaflag();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getSchemafile <em>Schemafile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schemafile</em>'.
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getSchemafile()
	 * @see #getControllerServiceStandardeventcollectorServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Schemafile();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getAuthlist <em>Authlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authlist</em>'.
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getAuthlist()
	 * @see #getControllerServiceStandardeventcollectorServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Authlist();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getStreamid <em>Streamid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Streamid</em>'.
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getStreamid()
	 * @see #getControllerServiceStandardeventcollectorServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceStandardeventcollectorServiceConfiguration_Streamid();

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
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceImpl <em>Controller Service Standardeventcollector Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceImpl
		 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ServicePackageImpl#getControllerServiceStandardeventcollectorService()
		 * @generated
		 */
		EClass CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE = eINSTANCE.getControllerServiceStandardeventcollectorService();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceInstanceImpl <em>Controller Service Standardeventcollector Service Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceInstanceImpl
		 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ServicePackageImpl#getControllerServiceStandardeventcollectorServiceInstance()
		 * @generated
		 */
		EClass CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE = eINSTANCE.getControllerServiceStandardeventcollectorServiceInstance();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceConfigurationImpl <em>Controller Service Standardeventcollector Service Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceConfigurationImpl
		 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ServicePackageImpl#getControllerServiceStandardeventcollectorServiceConfiguration()
		 * @generated
		 */
		EClass CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION = eINSTANCE.getControllerServiceStandardeventcollectorServiceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Cport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CPORT = eINSTANCE.getControllerServiceStandardeventcollectorServiceConfiguration_Cport();

		/**
		 * The meta object literal for the '<em><b>Csecport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CSECPORT = eINSTANCE.getControllerServiceStandardeventcollectorServiceConfiguration_Csecport();

		/**
		 * The meta object literal for the '<em><b>Keystoreloc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTORELOC = eINSTANCE.getControllerServiceStandardeventcollectorServiceConfiguration_Keystoreloc();

		/**
		 * The meta object literal for the '<em><b>Keystorealias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREALIAS = eINSTANCE.getControllerServiceStandardeventcollectorServiceConfiguration_Keystorealias();

		/**
		 * The meta object literal for the '<em><b>Keystorepwdloc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREPWDLOC = eINSTANCE.getControllerServiceStandardeventcollectorServiceConfiguration_Keystorepwdloc();

		/**
		 * The meta object literal for the '<em><b>Maxinputqueue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__MAXINPUTQUEUE = eINSTANCE.getControllerServiceStandardeventcollectorServiceConfiguration_Maxinputqueue();

		/**
		 * The meta object literal for the '<em><b>Authflag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHFLAG = eINSTANCE.getControllerServiceStandardeventcollectorServiceConfiguration_Authflag();

		/**
		 * The meta object literal for the '<em><b>Checkschemaflag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CHECKSCHEMAFLAG = eINSTANCE.getControllerServiceStandardeventcollectorServiceConfiguration_Checkschemaflag();

		/**
		 * The meta object literal for the '<em><b>Schemafile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__SCHEMAFILE = eINSTANCE.getControllerServiceStandardeventcollectorServiceConfiguration_Schemafile();

		/**
		 * The meta object literal for the '<em><b>Authlist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHLIST = eINSTANCE.getControllerServiceStandardeventcollectorServiceConfiguration_Authlist();

		/**
		 * The meta object literal for the '<em><b>Streamid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__STREAMID = eINSTANCE.getControllerServiceStandardeventcollectorServiceConfiguration_Streamid();

	}

} //ServicePackage
