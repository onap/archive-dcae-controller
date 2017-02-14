
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
package org.openecomp.dcae.controller.service.common.vm.service;

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
 * @see org.openecomp.dcae.controller.service.common.vm.service.ServiceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-service-common-vm-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.service.common.vm'"
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
	String eNS_URI = "org.openecomp.dcae.controller.service.common.vm.service";

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
	ServicePackage eINSTANCE = org.openecomp.dcae.controller.service.common.vm.service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.common.vm.service.impl.CommonVmServiceImpl <em>Common Vm Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.common.vm.service.impl.CommonVmServiceImpl
	 * @see org.openecomp.dcae.controller.service.common.vm.service.impl.ServicePackageImpl#getCommonVmService()
	 * @generated
	 */
	int COMMON_VM_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE__NAME = VmPackage.VIRTUAL_MACHINE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE__LAST_POLLED = VmPackage.VIRTUAL_MACHINE_SERVICE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE__LAST_CHANGED = VmPackage.VIRTUAL_MACHINE_SERVICE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE__CREATED = VmPackage.VIRTUAL_MACHINE_SERVICE__CREATED;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE__INSTANCES = VmPackage.VIRTUAL_MACHINE_SERVICE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Manager Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE__MANAGER_PORT_NUMBER = VmPackage.VIRTUAL_MACHINE_SERVICE__MANAGER_PORT_NUMBER;

	/**
	 * The number of structural features of the '<em>Common Vm Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_FEATURE_COUNT = VmPackage.VIRTUAL_MACHINE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE___DEPLOY__STRING_STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___DEPLOY__STRING_STRING;

	/**
	 * The operation id for the '<em>Undeploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE___UNDEPLOY__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___UNDEPLOY__STRING;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE___TEST__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___TEST__STRING;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE___SUSPEND__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___SUSPEND__STRING;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE___RESUME__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___RESUME__STRING;

	/**
	 * The operation id for the '<em>Push Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Poll Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE___POLL_MANAGER_CONFIGURATION__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___POLL_MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE___MANAGER_CONFIGURATION__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Manager Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT = VmPackage.VIRTUAL_MACHINE_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT;

	/**
	 * The operation id for the '<em>Update Configuration From Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING;

	/**
	 * The operation id for the '<em>Run Health Tests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE___RUN_HEALTH_TESTS = VmPackage.VIRTUAL_MACHINE_SERVICE___RUN_HEALTH_TESTS;

	/**
	 * The operation id for the '<em>Update Deployment Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE___UPDATE_DEPLOYMENT_STATUS = VmPackage.VIRTUAL_MACHINE_SERVICE___UPDATE_DEPLOYMENT_STATUS;

	/**
	 * The number of operations of the '<em>Common Vm Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_OPERATION_COUNT = VmPackage.VIRTUAL_MACHINE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.common.vm.service.impl.CommonVmServiceInstanceImpl <em>Common Vm Service Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.common.vm.service.impl.CommonVmServiceInstanceImpl
	 * @see org.openecomp.dcae.controller.service.common.vm.service.impl.ServicePackageImpl#getCommonVmServiceInstance()
	 * @generated
	 */
	int COMMON_VM_SERVICE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__NAME = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__LAST_POLLED = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__LAST_CHANGED = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__CREATED = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CREATED;

	/**
	 * The feature id for the '<em><b>Service Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__SERVICE_CONTAINER = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__STATUS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__STATUS;

	/**
	 * The feature id for the '<em><b>Input Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__INPUT_STREAMS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__INPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Output Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__OUTPUT_STREAMS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__OUTPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Last Health Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__LAST_HEALTH_TEST = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LAST_HEALTH_TEST;

	/**
	 * The feature id for the '<em><b>Health Test Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__HEALTH_TEST_STATUS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__HEALTH_TEST_STATUS;

	/**
	 * The feature id for the '<em><b>Health Test Message Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__CONFIGURATION = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__LOCATION = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Vm Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__VM_TYPE = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__VM_TYPE;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__USERS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__USERS;

	/**
	 * The feature id for the '<em><b>Admin Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__ADMIN_USERS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_USERS;

	/**
	 * The feature id for the '<em><b>Application Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__APPLICATION_IDS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__APPLICATION_IDS;

	/**
	 * The feature id for the '<em><b>Admin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__ADMIN_ID = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_ID;

	/**
	 * The feature id for the '<em><b>Number Of Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__NUMBER_OF_SERVERS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__NUMBER_OF_SERVERS;

	/**
	 * The feature id for the '<em><b>Availability Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__AVAILABILITY_ZONE = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__AVAILABILITY_ZONE;

	/**
	 * The feature id for the '<em><b>Manager Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__MANAGER_PORT_NUMBER = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__MANAGER_PORT_NUMBER;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__SERVERS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVERS;

	/**
	 * The feature id for the '<em><b>Leader Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__LEADER_SERVER = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LEADER_SERVER;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__SERVICE = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE;

	/**
	 * The feature id for the '<em><b>Ieds Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__IEDS_ADMIN = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__IEDS_ADMIN;

	/**
	 * The feature id for the '<em><b>Chef User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__CHEF_USER = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_USER;

	/**
	 * The feature id for the '<em><b>Chef Org</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__CHEF_ORG = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_ORG;

	/**
	 * The feature id for the '<em><b>Chef Topology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__CHEF_TOPOLOGY = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_TOPOLOGY;

	/**
	 * The feature id for the '<em><b>Openstack Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__OPENSTACK_FLAVOR = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__OPENSTACK_FLAVOR;

	/**
	 * The feature id for the '<em><b>Service Fqdn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__SERVICE_FQDN = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE_FQDN;

	/**
	 * The feature id for the '<em><b>Deployment Timeout Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__DEPLOYMENT_TIMEOUT_MINUTES = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__DEPLOYMENT_TIMEOUT_MINUTES;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__STEPS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__STEPS;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__SCRIPT = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configure Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__CONFIGURE_TIMEOUT = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__TEST_TIMEOUT = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Suspend Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__SUSPEND_TIMEOUT = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resume Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__RESUME_TIMEOUT = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vm Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE__VM_CONFIGURATION = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Common Vm Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE_FEATURE_COUNT = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Common Vm Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_INSTANCE_OPERATION_COUNT = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.common.vm.service.impl.CommonVmServiceConfigurationImpl <em>Common Vm Service Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.common.vm.service.impl.CommonVmServiceConfigurationImpl
	 * @see org.openecomp.dcae.controller.service.common.vm.service.impl.ServicePackageImpl#getCommonVmServiceConfiguration()
	 * @generated
	 */
	int COMMON_VM_SERVICE_CONFIGURATION = 2;

	/**
	 * The number of structural features of the '<em>Common Vm Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Common Vm Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_SERVICE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.common.vm.service.impl.TommyVmServiceConfigurationImpl <em>Tommy Vm Service Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.common.vm.service.impl.TommyVmServiceConfigurationImpl
	 * @see org.openecomp.dcae.controller.service.common.vm.service.impl.ServicePackageImpl#getTommyVmServiceConfiguration()
	 * @generated
	 */
	int TOMMY_VM_SERVICE_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Postgres User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMMY_VM_SERVICE_CONFIGURATION__POSTGRES_USER_NAME = COMMON_VM_SERVICE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postgres Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMMY_VM_SERVICE_CONFIGURATION__POSTGRES_PASSWORD = COMMON_VM_SERVICE_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Portgres Jdbc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMMY_VM_SERVICE_CONFIGURATION__PORTGRES_JDBC = COMMON_VM_SERVICE_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tommy Vm Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMMY_VM_SERVICE_CONFIGURATION_FEATURE_COUNT = COMMON_VM_SERVICE_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tommy Vm Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMMY_VM_SERVICE_CONFIGURATION_OPERATION_COUNT = COMMON_VM_SERVICE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmService <em>Common Vm Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Vm Service</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.service.CommonVmService
	 * @generated
	 */
	EClass getCommonVmService();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance <em>Common Vm Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Vm Service Instance</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance
	 * @generated
	 */
	EClass getCommonVmServiceInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getScript()
	 * @see #getCommonVmServiceInstance()
	 * @generated
	 */
	EAttribute getCommonVmServiceInstance_Script();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getConfigureTimeout <em>Configure Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configure Timeout</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getConfigureTimeout()
	 * @see #getCommonVmServiceInstance()
	 * @generated
	 */
	EAttribute getCommonVmServiceInstance_ConfigureTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getTestTimeout <em>Test Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Timeout</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getTestTimeout()
	 * @see #getCommonVmServiceInstance()
	 * @generated
	 */
	EAttribute getCommonVmServiceInstance_TestTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getSuspendTimeout <em>Suspend Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspend Timeout</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getSuspendTimeout()
	 * @see #getCommonVmServiceInstance()
	 * @generated
	 */
	EAttribute getCommonVmServiceInstance_SuspendTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getResumeTimeout <em>Resume Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resume Timeout</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getResumeTimeout()
	 * @see #getCommonVmServiceInstance()
	 * @generated
	 */
	EAttribute getCommonVmServiceInstance_ResumeTimeout();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getVmConfiguration <em>Vm Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vm Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getVmConfiguration()
	 * @see #getCommonVmServiceInstance()
	 * @generated
	 */
	EReference getCommonVmServiceInstance_VmConfiguration();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceConfiguration <em>Common Vm Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Vm Service Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceConfiguration
	 * @generated
	 */
	EClass getCommonVmServiceConfiguration();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.common.vm.service.TommyVmServiceConfiguration <em>Tommy Vm Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tommy Vm Service Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.service.TommyVmServiceConfiguration
	 * @generated
	 */
	EClass getTommyVmServiceConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.vm.service.TommyVmServiceConfiguration#getPostgresUserName <em>Postgres User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postgres User Name</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.service.TommyVmServiceConfiguration#getPostgresUserName()
	 * @see #getTommyVmServiceConfiguration()
	 * @generated
	 */
	EAttribute getTommyVmServiceConfiguration_PostgresUserName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.vm.service.TommyVmServiceConfiguration#getPostgresPassword <em>Postgres Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postgres Password</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.service.TommyVmServiceConfiguration#getPostgresPassword()
	 * @see #getTommyVmServiceConfiguration()
	 * @generated
	 */
	EAttribute getTommyVmServiceConfiguration_PostgresPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.vm.service.TommyVmServiceConfiguration#getPortgresJdbc <em>Portgres Jdbc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portgres Jdbc</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.service.TommyVmServiceConfiguration#getPortgresJdbc()
	 * @see #getTommyVmServiceConfiguration()
	 * @generated
	 */
	EAttribute getTommyVmServiceConfiguration_PortgresJdbc();

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
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.common.vm.service.impl.CommonVmServiceImpl <em>Common Vm Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.common.vm.service.impl.CommonVmServiceImpl
		 * @see org.openecomp.dcae.controller.service.common.vm.service.impl.ServicePackageImpl#getCommonVmService()
		 * @generated
		 */
		EClass COMMON_VM_SERVICE = eINSTANCE.getCommonVmService();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.common.vm.service.impl.CommonVmServiceInstanceImpl <em>Common Vm Service Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.common.vm.service.impl.CommonVmServiceInstanceImpl
		 * @see org.openecomp.dcae.controller.service.common.vm.service.impl.ServicePackageImpl#getCommonVmServiceInstance()
		 * @generated
		 */
		EClass COMMON_VM_SERVICE_INSTANCE = eINSTANCE.getCommonVmServiceInstance();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_VM_SERVICE_INSTANCE__SCRIPT = eINSTANCE.getCommonVmServiceInstance_Script();

		/**
		 * The meta object literal for the '<em><b>Configure Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_VM_SERVICE_INSTANCE__CONFIGURE_TIMEOUT = eINSTANCE.getCommonVmServiceInstance_ConfigureTimeout();

		/**
		 * The meta object literal for the '<em><b>Test Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_VM_SERVICE_INSTANCE__TEST_TIMEOUT = eINSTANCE.getCommonVmServiceInstance_TestTimeout();

		/**
		 * The meta object literal for the '<em><b>Suspend Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_VM_SERVICE_INSTANCE__SUSPEND_TIMEOUT = eINSTANCE.getCommonVmServiceInstance_SuspendTimeout();

		/**
		 * The meta object literal for the '<em><b>Resume Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_VM_SERVICE_INSTANCE__RESUME_TIMEOUT = eINSTANCE.getCommonVmServiceInstance_ResumeTimeout();

		/**
		 * The meta object literal for the '<em><b>Vm Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_VM_SERVICE_INSTANCE__VM_CONFIGURATION = eINSTANCE.getCommonVmServiceInstance_VmConfiguration();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.common.vm.service.impl.CommonVmServiceConfigurationImpl <em>Common Vm Service Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.common.vm.service.impl.CommonVmServiceConfigurationImpl
		 * @see org.openecomp.dcae.controller.service.common.vm.service.impl.ServicePackageImpl#getCommonVmServiceConfiguration()
		 * @generated
		 */
		EClass COMMON_VM_SERVICE_CONFIGURATION = eINSTANCE.getCommonVmServiceConfiguration();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.common.vm.service.impl.TommyVmServiceConfigurationImpl <em>Tommy Vm Service Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.common.vm.service.impl.TommyVmServiceConfigurationImpl
		 * @see org.openecomp.dcae.controller.service.common.vm.service.impl.ServicePackageImpl#getTommyVmServiceConfiguration()
		 * @generated
		 */
		EClass TOMMY_VM_SERVICE_CONFIGURATION = eINSTANCE.getTommyVmServiceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Postgres User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOMMY_VM_SERVICE_CONFIGURATION__POSTGRES_USER_NAME = eINSTANCE.getTommyVmServiceConfiguration_PostgresUserName();

		/**
		 * The meta object literal for the '<em><b>Postgres Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOMMY_VM_SERVICE_CONFIGURATION__POSTGRES_PASSWORD = eINSTANCE.getTommyVmServiceConfiguration_PostgresPassword();

		/**
		 * The meta object literal for the '<em><b>Portgres Jdbc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOMMY_VM_SERVICE_CONFIGURATION__PORTGRES_JDBC = eINSTANCE.getTommyVmServiceConfiguration_PortgresJdbc();

	}

} //ServicePackage
