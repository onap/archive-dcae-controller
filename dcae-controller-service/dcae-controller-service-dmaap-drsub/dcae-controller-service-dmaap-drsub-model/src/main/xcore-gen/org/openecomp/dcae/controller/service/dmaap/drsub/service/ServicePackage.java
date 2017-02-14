
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
package org.openecomp.dcae.controller.service.dmaap.drsub.service;

import org.openecomp.dcae.controller.service.vm.VmPackage;
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
 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServiceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-service-dmaap-drsub-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.service.dmaap.drsub'"
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
	String eNS_URI = "org.openecomp.dcae.controller.service.dmaap.drsub.service";

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
	ServicePackage eINSTANCE = org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceImpl <em>Controller Service Dmaap Drsub Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceImpl
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ServicePackageImpl#getControllerServiceDmaapDrsubService()
	 * @generated
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE__NAME = VmPackage.VIRTUAL_MACHINE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE__LAST_POLLED = VmPackage.VIRTUAL_MACHINE_SERVICE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE__LAST_CHANGED = VmPackage.VIRTUAL_MACHINE_SERVICE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE__CREATED = VmPackage.VIRTUAL_MACHINE_SERVICE__CREATED;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE__INSTANCES = VmPackage.VIRTUAL_MACHINE_SERVICE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Manager Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE__MANAGER_PORT_NUMBER = VmPackage.VIRTUAL_MACHINE_SERVICE__MANAGER_PORT_NUMBER;

	/**
	 * The number of structural features of the '<em>Controller Service Dmaap Drsub Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_FEATURE_COUNT = VmPackage.VIRTUAL_MACHINE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE___DEPLOY__STRING_STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___DEPLOY__STRING_STRING;

	/**
	 * The operation id for the '<em>Undeploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE___UNDEPLOY__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___UNDEPLOY__STRING;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE___TEST__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___TEST__STRING;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE___SUSPEND__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___SUSPEND__STRING;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE___RESUME__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___RESUME__STRING;

	/**
	 * The operation id for the '<em>Push Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Poll Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE___POLL_MANAGER_CONFIGURATION__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___POLL_MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE___MANAGER_CONFIGURATION__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Manager Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT = VmPackage.VIRTUAL_MACHINE_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT;

	/**
	 * The operation id for the '<em>Update Configuration From Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING;

	/**
	 * The operation id for the '<em>Run Health Tests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE___RUN_HEALTH_TESTS = VmPackage.VIRTUAL_MACHINE_SERVICE___RUN_HEALTH_TESTS;

	/**
	 * The operation id for the '<em>Update Deployment Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE___UPDATE_DEPLOYMENT_STATUS = VmPackage.VIRTUAL_MACHINE_SERVICE___UPDATE_DEPLOYMENT_STATUS;

	/**
	 * The number of operations of the '<em>Controller Service Dmaap Drsub Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_OPERATION_COUNT = VmPackage.VIRTUAL_MACHINE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceInstanceImpl <em>Controller Service Dmaap Drsub Service Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceInstanceImpl
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ServicePackageImpl#getControllerServiceDmaapDrsubServiceInstance()
	 * @generated
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__NAME = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__LAST_POLLED = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__LAST_CHANGED = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__CREATED = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CREATED;

	/**
	 * The feature id for the '<em><b>Service Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__SERVICE_CONTAINER = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__STATUS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__STATUS;

	/**
	 * The feature id for the '<em><b>Input Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__INPUT_STREAMS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__INPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Output Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__OUTPUT_STREAMS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__OUTPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Last Health Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__LAST_HEALTH_TEST = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LAST_HEALTH_TEST;

	/**
	 * The feature id for the '<em><b>Health Test Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__HEALTH_TEST_STATUS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__HEALTH_TEST_STATUS;

	/**
	 * The feature id for the '<em><b>Health Test Message Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__CONFIGURATION = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__LOCATION = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Vm Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__VM_TYPE = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__VM_TYPE;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__USERS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__USERS;

	/**
	 * The feature id for the '<em><b>Admin Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__ADMIN_USERS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_USERS;

	/**
	 * The feature id for the '<em><b>Application Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__APPLICATION_IDS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__APPLICATION_IDS;

	/**
	 * The feature id for the '<em><b>Admin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__ADMIN_ID = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_ID;

	/**
	 * The feature id for the '<em><b>Number Of Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__NUMBER_OF_SERVERS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__NUMBER_OF_SERVERS;

	/**
	 * The feature id for the '<em><b>Availability Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__AVAILABILITY_ZONE = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__AVAILABILITY_ZONE;

	/**
	 * The feature id for the '<em><b>Manager Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__MANAGER_PORT_NUMBER = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__MANAGER_PORT_NUMBER;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__SERVERS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVERS;

	/**
	 * The feature id for the '<em><b>Leader Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__LEADER_SERVER = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LEADER_SERVER;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__SERVICE = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE;

	/**
	 * The feature id for the '<em><b>Ieds Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__IEDS_ADMIN = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__IEDS_ADMIN;

	/**
	 * The feature id for the '<em><b>Chef User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__CHEF_USER = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_USER;

	/**
	 * The feature id for the '<em><b>Chef Org</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__CHEF_ORG = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_ORG;

	/**
	 * The feature id for the '<em><b>Chef Topology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__CHEF_TOPOLOGY = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_TOPOLOGY;

	/**
	 * The feature id for the '<em><b>Openstack Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__OPENSTACK_FLAVOR = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__OPENSTACK_FLAVOR;

	/**
	 * The feature id for the '<em><b>Service Fqdn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__SERVICE_FQDN = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE_FQDN;

	/**
	 * The feature id for the '<em><b>Deployment Timeout Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__DEPLOYMENT_TIMEOUT_MINUTES = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__DEPLOYMENT_TIMEOUT_MINUTES;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__STEPS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__STEPS;

	/**
	 * The feature id for the '<em><b>Cdap Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__CDAP_URL = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Cdap Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__NUMBER_OF_CDAP_RECORDS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Cdap Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__NUMBER_OF_CDAP_ERRORS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hdfs Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__HDFS_URI = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hdfs Uri Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__HDFS_URI_DESCR = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hdfs Persist Loc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__HDFS_PERSIST_LOC = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Hdfs Persist Loc Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__HDFS_PERSIST_LOC_DESCR = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dmaap Conf File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__DMAAP_CONF_FILE = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dmaap Conf File Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__DMAAP_CONF_FILE_DESCR = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Dmaap Streamid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__DMAAP_STREAMID = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Dmaap Streamid Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__DMAAP_STREAMID_DESCR = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Cdap Cluster Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__CDAP_CLUSTER_INSTANCE = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Cdap Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__CDAP_SERVICE_NAME = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Controller Service Dmaap Drsub Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE_FEATURE_COUNT = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Controller Service Dmaap Drsub Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE_OPERATION_COUNT = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceConfigurationImpl <em>Controller Service Dmaap Drsub Service Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceConfigurationImpl
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ServicePackageImpl#getControllerServiceDmaapDrsubServiceConfiguration()
	 * @generated
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Cdap Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__CDAP_URL = 0;

	/**
	 * The feature id for the '<em><b>Number Of Cdap Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__NUMBER_OF_CDAP_RECORDS = 1;

	/**
	 * The feature id for the '<em><b>Number Of Cdap Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__NUMBER_OF_CDAP_ERRORS = 2;

	/**
	 * The feature id for the '<em><b>Hdfs Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_URI = 3;

	/**
	 * The feature id for the '<em><b>Hdfs Uri Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_URI_DESCR = 4;

	/**
	 * The feature id for the '<em><b>Hdfs Persist Loc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_PERSIST_LOC = 5;

	/**
	 * The feature id for the '<em><b>Hdfs Persist Loc Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_PERSIST_LOC_DESCR = 6;

	/**
	 * The feature id for the '<em><b>Dmaap Conf File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_CONF_FILE = 7;

	/**
	 * The feature id for the '<em><b>Dmaap Conf File Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_CONF_FILE_DESCR = 8;

	/**
	 * The feature id for the '<em><b>Dmaap Streamid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_STREAMID = 9;

	/**
	 * The feature id for the '<em><b>Dmaap Streamid Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_STREAMID_DESCR = 10;

	/**
	 * The number of structural features of the '<em>Controller Service Dmaap Drsub Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Controller Service Dmaap Drsub Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubService <em>Controller Service Dmaap Drsub Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Service Dmaap Drsub Service</em>'.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubService
	 * @generated
	 */
	EClass getControllerServiceDmaapDrsubService();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceInstance <em>Controller Service Dmaap Drsub Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Service Dmaap Drsub Service Instance</em>'.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceInstance
	 * @generated
	 */
	EClass getControllerServiceDmaapDrsubServiceInstance();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceInstance#getCdapClusterInstance <em>Cdap Cluster Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cdap Cluster Instance</em>'.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceInstance#getCdapClusterInstance()
	 * @see #getControllerServiceDmaapDrsubServiceInstance()
	 * @generated
	 */
	EReference getControllerServiceDmaapDrsubServiceInstance_CdapClusterInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceInstance#getCdapServiceName <em>Cdap Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cdap Service Name</em>'.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceInstance#getCdapServiceName()
	 * @see #getControllerServiceDmaapDrsubServiceInstance()
	 * @generated
	 */
	EAttribute getControllerServiceDmaapDrsubServiceInstance_CdapServiceName();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration <em>Controller Service Dmaap Drsub Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Service Dmaap Drsub Service Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration
	 * @generated
	 */
	EClass getControllerServiceDmaapDrsubServiceConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getCdapUrl <em>Cdap Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cdap Url</em>'.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getCdapUrl()
	 * @see #getControllerServiceDmaapDrsubServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceDmaapDrsubServiceConfiguration_CdapUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getNumberOfCdapRecords <em>Number Of Cdap Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Cdap Records</em>'.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getNumberOfCdapRecords()
	 * @see #getControllerServiceDmaapDrsubServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceDmaapDrsubServiceConfiguration_NumberOfCdapRecords();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getNumberOfCdapErrors <em>Number Of Cdap Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Cdap Errors</em>'.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getNumberOfCdapErrors()
	 * @see #getControllerServiceDmaapDrsubServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceDmaapDrsubServiceConfiguration_NumberOfCdapErrors();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getHdfsUri <em>Hdfs Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hdfs Uri</em>'.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getHdfsUri()
	 * @see #getControllerServiceDmaapDrsubServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceDmaapDrsubServiceConfiguration_HdfsUri();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getHdfsUriDescr <em>Hdfs Uri Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hdfs Uri Descr</em>'.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getHdfsUriDescr()
	 * @see #getControllerServiceDmaapDrsubServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceDmaapDrsubServiceConfiguration_HdfsUriDescr();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getHdfsPersistLoc <em>Hdfs Persist Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hdfs Persist Loc</em>'.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getHdfsPersistLoc()
	 * @see #getControllerServiceDmaapDrsubServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceDmaapDrsubServiceConfiguration_HdfsPersistLoc();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getHdfsPersistLocDescr <em>Hdfs Persist Loc Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hdfs Persist Loc Descr</em>'.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getHdfsPersistLocDescr()
	 * @see #getControllerServiceDmaapDrsubServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceDmaapDrsubServiceConfiguration_HdfsPersistLocDescr();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getDmaapConfFile <em>Dmaap Conf File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dmaap Conf File</em>'.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getDmaapConfFile()
	 * @see #getControllerServiceDmaapDrsubServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceDmaapDrsubServiceConfiguration_DmaapConfFile();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getDmaapConfFileDescr <em>Dmaap Conf File Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dmaap Conf File Descr</em>'.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getDmaapConfFileDescr()
	 * @see #getControllerServiceDmaapDrsubServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceDmaapDrsubServiceConfiguration_DmaapConfFileDescr();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getDmaapStreamid <em>Dmaap Streamid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dmaap Streamid</em>'.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getDmaapStreamid()
	 * @see #getControllerServiceDmaapDrsubServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceDmaapDrsubServiceConfiguration_DmaapStreamid();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getDmaapStreamidDescr <em>Dmaap Streamid Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dmaap Streamid Descr</em>'.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getDmaapStreamidDescr()
	 * @see #getControllerServiceDmaapDrsubServiceConfiguration()
	 * @generated
	 */
	EAttribute getControllerServiceDmaapDrsubServiceConfiguration_DmaapStreamidDescr();

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
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceImpl <em>Controller Service Dmaap Drsub Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceImpl
		 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ServicePackageImpl#getControllerServiceDmaapDrsubService()
		 * @generated
		 */
		EClass CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE = eINSTANCE.getControllerServiceDmaapDrsubService();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceInstanceImpl <em>Controller Service Dmaap Drsub Service Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceInstanceImpl
		 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ServicePackageImpl#getControllerServiceDmaapDrsubServiceInstance()
		 * @generated
		 */
		EClass CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE = eINSTANCE.getControllerServiceDmaapDrsubServiceInstance();

		/**
		 * The meta object literal for the '<em><b>Cdap Cluster Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__CDAP_CLUSTER_INSTANCE = eINSTANCE.getControllerServiceDmaapDrsubServiceInstance_CdapClusterInstance();

		/**
		 * The meta object literal for the '<em><b>Cdap Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_INSTANCE__CDAP_SERVICE_NAME = eINSTANCE.getControllerServiceDmaapDrsubServiceInstance_CdapServiceName();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceConfigurationImpl <em>Controller Service Dmaap Drsub Service Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceConfigurationImpl
		 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ServicePackageImpl#getControllerServiceDmaapDrsubServiceConfiguration()
		 * @generated
		 */
		EClass CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION = eINSTANCE.getControllerServiceDmaapDrsubServiceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Cdap Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__CDAP_URL = eINSTANCE.getControllerServiceDmaapDrsubServiceConfiguration_CdapUrl();

		/**
		 * The meta object literal for the '<em><b>Number Of Cdap Records</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__NUMBER_OF_CDAP_RECORDS = eINSTANCE.getControllerServiceDmaapDrsubServiceConfiguration_NumberOfCdapRecords();

		/**
		 * The meta object literal for the '<em><b>Number Of Cdap Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__NUMBER_OF_CDAP_ERRORS = eINSTANCE.getControllerServiceDmaapDrsubServiceConfiguration_NumberOfCdapErrors();

		/**
		 * The meta object literal for the '<em><b>Hdfs Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_URI = eINSTANCE.getControllerServiceDmaapDrsubServiceConfiguration_HdfsUri();

		/**
		 * The meta object literal for the '<em><b>Hdfs Uri Descr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_URI_DESCR = eINSTANCE.getControllerServiceDmaapDrsubServiceConfiguration_HdfsUriDescr();

		/**
		 * The meta object literal for the '<em><b>Hdfs Persist Loc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_PERSIST_LOC = eINSTANCE.getControllerServiceDmaapDrsubServiceConfiguration_HdfsPersistLoc();

		/**
		 * The meta object literal for the '<em><b>Hdfs Persist Loc Descr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_PERSIST_LOC_DESCR = eINSTANCE.getControllerServiceDmaapDrsubServiceConfiguration_HdfsPersistLocDescr();

		/**
		 * The meta object literal for the '<em><b>Dmaap Conf File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_CONF_FILE = eINSTANCE.getControllerServiceDmaapDrsubServiceConfiguration_DmaapConfFile();

		/**
		 * The meta object literal for the '<em><b>Dmaap Conf File Descr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_CONF_FILE_DESCR = eINSTANCE.getControllerServiceDmaapDrsubServiceConfiguration_DmaapConfFileDescr();

		/**
		 * The meta object literal for the '<em><b>Dmaap Streamid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_STREAMID = eINSTANCE.getControllerServiceDmaapDrsubServiceConfiguration_DmaapStreamid();

		/**
		 * The meta object literal for the '<em><b>Dmaap Streamid Descr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_STREAMID_DESCR = eINSTANCE.getControllerServiceDmaapDrsubServiceConfiguration_DmaapStreamidDescr();

	}

} //ServicePackage
