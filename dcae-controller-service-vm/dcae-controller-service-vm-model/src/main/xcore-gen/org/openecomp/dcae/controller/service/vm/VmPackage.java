
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

import org.openecomp.dcae.controller.core.server.ServerPackage;
import org.openecomp.dcae.controller.core.service.ServicePackage;
import org.openecomp.ncomp.core.CorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.openecomp.dcae.controller.service.vm.VmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-service-vm-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.service'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore ecomp='http://openecomp.org'"
 * @generated
 */
public interface VmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.dcae.controller.service.vm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmPackage eINSTANCE = org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceImpl <em>Virtual Machine Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceImpl
	 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getVirtualMachineService()
	 * @generated
	 */
	int VIRTUAL_MACHINE_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE__NAME = ServicePackage.DCAE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE__LAST_POLLED = ServicePackage.DCAE_SERVICE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE__LAST_CHANGED = ServicePackage.DCAE_SERVICE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE__CREATED = ServicePackage.DCAE_SERVICE__CREATED;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE__INSTANCES = ServicePackage.DCAE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Manager Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE__MANAGER_PORT_NUMBER = ServicePackage.DCAE_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Virtual Machine Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_FEATURE_COUNT = ServicePackage.DCAE_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE___DEPLOY__STRING_STRING = ServicePackage.DCAE_SERVICE___DEPLOY__STRING_STRING;

	/**
	 * The operation id for the '<em>Undeploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE___UNDEPLOY__STRING = ServicePackage.DCAE_SERVICE___UNDEPLOY__STRING;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE___TEST__STRING = ServicePackage.DCAE_SERVICE___TEST__STRING;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE___SUSPEND__STRING = ServicePackage.DCAE_SERVICE___SUSPEND__STRING;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE___RESUME__STRING = ServicePackage.DCAE_SERVICE___RESUME__STRING;

	/**
	 * The operation id for the '<em>Push Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING = ServicePackage.DCAE_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Poll Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE___POLL_MANAGER_CONFIGURATION__STRING = ServicePackage.DCAE_SERVICE___POLL_MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE___MANAGER_CONFIGURATION__STRING = ServicePackage.DCAE_SERVICE___MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Manager Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT = ServicePackage.DCAE_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT;

	/**
	 * The operation id for the '<em>Update Configuration From Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING = ServicePackage.DCAE_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING;

	/**
	 * The operation id for the '<em>Run Health Tests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE___RUN_HEALTH_TESTS = ServicePackage.DCAE_SERVICE___RUN_HEALTH_TESTS;

	/**
	 * The operation id for the '<em>Update Deployment Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE___UPDATE_DEPLOYMENT_STATUS = ServicePackage.DCAE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Virtual Machine Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_OPERATION_COUNT = ServicePackage.DCAE_SERVICE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl <em>Virtual Machine Service Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl
	 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getVirtualMachineServiceInstance()
	 * @generated
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__NAME = ServicePackage.DCAE_SERVICE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__LAST_POLLED = ServicePackage.DCAE_SERVICE_INSTANCE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__LAST_CHANGED = ServicePackage.DCAE_SERVICE_INSTANCE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__CREATED = ServicePackage.DCAE_SERVICE_INSTANCE__CREATED;

	/**
	 * The feature id for the '<em><b>Service Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE_CONTAINER = ServicePackage.DCAE_SERVICE_INSTANCE__SERVICE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__STATUS = ServicePackage.DCAE_SERVICE_INSTANCE__STATUS;

	/**
	 * The feature id for the '<em><b>Input Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__INPUT_STREAMS = ServicePackage.DCAE_SERVICE_INSTANCE__INPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Output Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__OUTPUT_STREAMS = ServicePackage.DCAE_SERVICE_INSTANCE__OUTPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Last Health Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__LAST_HEALTH_TEST = ServicePackage.DCAE_SERVICE_INSTANCE__LAST_HEALTH_TEST;

	/**
	 * The feature id for the '<em><b>Health Test Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__HEALTH_TEST_STATUS = ServicePackage.DCAE_SERVICE_INSTANCE__HEALTH_TEST_STATUS;

	/**
	 * The feature id for the '<em><b>Health Test Message Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE = ServicePackage.DCAE_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__CONFIGURATION = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__LOCATION = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vm Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__VM_TYPE = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__USERS = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Admin Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_USERS = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Application Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__APPLICATION_IDS = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Admin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_ID = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Number Of Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__NUMBER_OF_SERVERS = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Availability Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__AVAILABILITY_ZONE = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Manager Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__MANAGER_PORT_NUMBER = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVERS = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Leader Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__LEADER_SERVER = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Ieds Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__IEDS_ADMIN = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Chef User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_USER = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Chef Org</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_ORG = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Chef Topology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_TOPOLOGY = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Openstack Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__OPENSTACK_FLAVOR = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Service Fqdn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE_FQDN = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Deployment Timeout Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__DEPLOYMENT_TIMEOUT_MINUTES = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE__STEPS = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Virtual Machine Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>Virtual Machine Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_INSTANCE_OPERATION_COUNT = ServicePackage.DCAE_SERVICE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceConfigurationImpl <em>Virtual Machine Service Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceConfigurationImpl
	 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getVirtualMachineServiceConfiguration()
	 * @generated
	 */
	int VIRTUAL_MACHINE_SERVICE_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_CONFIGURATION__CONFIGURATION = 0;

	/**
	 * The number of structural features of the '<em>Virtual Machine Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Virtual Machine Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceDescriptorImpl <em>Virtual Machine Service Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceDescriptorImpl
	 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getVirtualMachineServiceDescriptor()
	 * @generated
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__NAME = ServicePackage.DCAE_SERVICE_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__LAST_POLLED = ServicePackage.DCAE_SERVICE_DESCRIPTOR__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__LAST_CHANGED = ServicePackage.DCAE_SERVICE_DESCRIPTOR__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__CREATED = ServicePackage.DCAE_SERVICE_DESCRIPTOR__CREATED;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__GROUP_ID = ServicePackage.DCAE_SERVICE_DESCRIPTOR__GROUP_ID;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__ARTIFACT = ServicePackage.DCAE_SERVICE_DESCRIPTOR__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__VERSION = ServicePackage.DCAE_SERVICE_DESCRIPTOR__VERSION;

	/**
	 * The feature id for the '<em><b>Service Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_PACKAGE = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_CLASS = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__VM_TYPE = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Manager Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__MANAGER_PORT_NUMBER = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Manager User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__MANAGER_USER = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Encrypted Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__ENCRYPTED_PASSWORD = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Users</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__USERS = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Admin Users</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__ADMIN_USERS = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Virtual Machine Service Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR_FEATURE_COUNT = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Virtual Machine Service Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SERVICE_DESCRIPTOR_OPERATION_COUNT = ServicePackage.DCAE_SERVICE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.vm.impl.PhysicalMachineImpl <em>Physical Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.vm.impl.PhysicalMachineImpl
	 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getPhysicalMachine()
	 * @generated
	 */
	int PHYSICAL_MACHINE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__NAME = ServerPackage.DCAE_BASIC_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__LAST_POLLED = ServerPackage.DCAE_BASIC_SERVER__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__LAST_CHANGED = ServerPackage.DCAE_BASIC_SERVER__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__CREATED = ServerPackage.DCAE_BASIC_SERVER__CREATED;

	/**
	 * The feature id for the '<em><b>Operational State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__OPERATIONAL_STATE = ServerPackage.DCAE_BASIC_SERVER__OPERATIONAL_STATE;

	/**
	 * The feature id for the '<em><b>Log Message Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__LOG_MESSAGE_CONFIGURATION = ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Log Message Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__LOG_MESSAGE_CATEGORIES = ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Log Message Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__LOG_MESSAGE_STATS = ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_STATS;

	/**
	 * The feature id for the '<em><b>Private Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__PRIVATE_IP = ServerPackage.DCAE_BASIC_SERVER__PRIVATE_IP;

	/**
	 * The feature id for the '<em><b>Public Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__PUBLIC_IP = ServerPackage.DCAE_BASIC_SERVER__PUBLIC_IP;

	/**
	 * The feature id for the '<em><b>Collectd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__COLLECTD = ServerPackage.DCAE_BASIC_SERVER__COLLECTD;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__MODULES = ServerPackage.DCAE_BASIC_SERVER__MODULES;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__NETWORKS = ServerPackage.DCAE_BASIC_SERVER__NETWORKS;

	/**
	 * The feature id for the '<em><b>Last Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__LAST_UPDATE = ServerPackage.DCAE_BASIC_SERVER__LAST_UPDATE;

	/**
	 * The feature id for the '<em><b>Using Monitoring Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__USING_MONITORING_AGENT = ServerPackage.DCAE_BASIC_SERVER__USING_MONITORING_AGENT;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__SERVER = ServerPackage.DCAE_BASIC_SERVER__SERVER;

	/**
	 * The feature id for the '<em><b>Hypervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__HYPERVISOR = ServerPackage.DCAE_BASIC_SERVER__HYPERVISOR;

	/**
	 * The feature id for the '<em><b>Vm Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__VM_TYPE = ServerPackage.DCAE_BASIC_SERVER__VM_TYPE;

	/**
	 * The feature id for the '<em><b>Certificate Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__CERTIFICATE_PASSWORD = ServerPackage.DCAE_BASIC_SERVER__CERTIFICATE_PASSWORD;

	/**
	 * The feature id for the '<em><b>Manager Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE__MANAGER_PORT_NUMBER = ServerPackage.DCAE_BASIC_SERVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Physical Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE_FEATURE_COUNT = ServerPackage.DCAE_BASIC_SERVER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Physical Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_MACHINE_OPERATION_COUNT = ServerPackage.DCAE_BASIC_SERVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.vm.impl.VirtualMachineImpl
	 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getVirtualMachine()
	 * @generated
	 */
	int VIRTUAL_MACHINE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__NAME = ServerPackage.DCAE_BASIC_SERVER__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__LAST_POLLED = ServerPackage.DCAE_BASIC_SERVER__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__LAST_CHANGED = ServerPackage.DCAE_BASIC_SERVER__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__CREATED = ServerPackage.DCAE_BASIC_SERVER__CREATED;

	/**
	 * The feature id for the '<em><b>Operational State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__OPERATIONAL_STATE = ServerPackage.DCAE_BASIC_SERVER__OPERATIONAL_STATE;

	/**
	 * The feature id for the '<em><b>Log Message Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__LOG_MESSAGE_CONFIGURATION = ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Log Message Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__LOG_MESSAGE_CATEGORIES = ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CATEGORIES;

	/**
	 * The feature id for the '<em><b>Log Message Stats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__LOG_MESSAGE_STATS = ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_STATS;

	/**
	 * The feature id for the '<em><b>Private Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__PRIVATE_IP = ServerPackage.DCAE_BASIC_SERVER__PRIVATE_IP;

	/**
	 * The feature id for the '<em><b>Public Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__PUBLIC_IP = ServerPackage.DCAE_BASIC_SERVER__PUBLIC_IP;

	/**
	 * The feature id for the '<em><b>Collectd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__COLLECTD = ServerPackage.DCAE_BASIC_SERVER__COLLECTD;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__MODULES = ServerPackage.DCAE_BASIC_SERVER__MODULES;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__NETWORKS = ServerPackage.DCAE_BASIC_SERVER__NETWORKS;

	/**
	 * The feature id for the '<em><b>Last Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__LAST_UPDATE = ServerPackage.DCAE_BASIC_SERVER__LAST_UPDATE;

	/**
	 * The feature id for the '<em><b>Using Monitoring Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__USING_MONITORING_AGENT = ServerPackage.DCAE_BASIC_SERVER__USING_MONITORING_AGENT;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__SERVER = ServerPackage.DCAE_BASIC_SERVER__SERVER;

	/**
	 * The feature id for the '<em><b>Hypervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__HYPERVISOR = ServerPackage.DCAE_BASIC_SERVER__HYPERVISOR;

	/**
	 * The feature id for the '<em><b>Vm Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__VM_TYPE = ServerPackage.DCAE_BASIC_SERVER__VM_TYPE;

	/**
	 * The feature id for the '<em><b>Certificate Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__CERTIFICATE_PASSWORD = ServerPackage.DCAE_BASIC_SERVER__CERTIFICATE_PASSWORD;

	/**
	 * The feature id for the '<em><b>Function Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__FUNCTION_INDEX = ServerPackage.DCAE_BASIC_SERVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kvm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__KVM_NAME = ServerPackage.DCAE_BASIC_SERVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vnc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__VNC = ServerPackage.DCAE_BASIC_SERVER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__GATEWAY = ServerPackage.DCAE_BASIC_SERVER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_FEATURE_COUNT = ServerPackage.DCAE_BASIC_SERVER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_OPERATION_COUNT = ServerPackage.DCAE_BASIC_SERVER_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.vm.impl.InstallationStepImpl <em>Installation Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.vm.impl.InstallationStepImpl
	 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getInstallationStep()
	 * @generated
	 */
	int INSTALLATION_STEP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_STEP__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_STEP__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_STEP__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_STEP__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_STEP__APPLICATION_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Installation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_STEP_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Installation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_STEP_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.vm.impl.ShellInstallationStepImpl <em>Shell Installation Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.vm.impl.ShellInstallationStepImpl
	 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getShellInstallationStep()
	 * @generated
	 */
	int SHELL_INSTALLATION_STEP = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INSTALLATION_STEP__NAME = INSTALLATION_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INSTALLATION_STEP__LAST_POLLED = INSTALLATION_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INSTALLATION_STEP__LAST_CHANGED = INSTALLATION_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INSTALLATION_STEP__CREATED = INSTALLATION_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INSTALLATION_STEP__APPLICATION_ID = INSTALLATION_STEP__APPLICATION_ID;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INSTALLATION_STEP__COMMAND = INSTALLATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shell Installation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INSTALLATION_STEP_FEATURE_COUNT = INSTALLATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shell Installation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INSTALLATION_STEP_OPERATION_COUNT = INSTALLATION_STEP_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.vm.impl.MavenArtifactInstallationStepImpl <em>Maven Artifact Installation Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.vm.impl.MavenArtifactInstallationStepImpl
	 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getMavenArtifactInstallationStep()
	 * @generated
	 */
	int MAVEN_ARTIFACT_INSTALLATION_STEP = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_ARTIFACT_INSTALLATION_STEP__NAME = INSTALLATION_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_ARTIFACT_INSTALLATION_STEP__LAST_POLLED = INSTALLATION_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_ARTIFACT_INSTALLATION_STEP__LAST_CHANGED = INSTALLATION_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_ARTIFACT_INSTALLATION_STEP__CREATED = INSTALLATION_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_ARTIFACT_INSTALLATION_STEP__APPLICATION_ID = INSTALLATION_STEP__APPLICATION_ID;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_ARTIFACT_INSTALLATION_STEP__GROUP_ID = INSTALLATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_ARTIFACT_INSTALLATION_STEP__ARTIFACT_ID = INSTALLATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_ARTIFACT_INSTALLATION_STEP__VERSION = INSTALLATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_ARTIFACT_INSTALLATION_STEP__TYPE = INSTALLATION_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assembly Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_ARTIFACT_INSTALLATION_STEP__ASSEMBLY_ID = INSTALLATION_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Maven Artifact Installation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_ARTIFACT_INSTALLATION_STEP_FEATURE_COUNT = INSTALLATION_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Maven Artifact Installation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAVEN_ARTIFACT_INSTALLATION_STEP_OPERATION_COUNT = INSTALLATION_STEP_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.vm.impl.HttpInstallationStepImpl <em>Http Installation Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.vm.impl.HttpInstallationStepImpl
	 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getHttpInstallationStep()
	 * @generated
	 */
	int HTTP_INSTALLATION_STEP = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_INSTALLATION_STEP__NAME = INSTALLATION_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_INSTALLATION_STEP__LAST_POLLED = INSTALLATION_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_INSTALLATION_STEP__LAST_CHANGED = INSTALLATION_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_INSTALLATION_STEP__CREATED = INSTALLATION_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_INSTALLATION_STEP__APPLICATION_ID = INSTALLATION_STEP__APPLICATION_ID;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_INSTALLATION_STEP__URL = INSTALLATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_INSTALLATION_STEP__USER_NAME = INSTALLATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_INSTALLATION_STEP__PASSWORD = INSTALLATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_INSTALLATION_STEP__TYPE = INSTALLATION_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_INSTALLATION_STEP__ARTIFACT_ID = INSTALLATION_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Http Installation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_INSTALLATION_STEP_FEATURE_COUNT = INSTALLATION_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Http Installation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_INSTALLATION_STEP_OPERATION_COUNT = INSTALLATION_STEP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineService <em>Virtual Machine Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine Service</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineService
	 * @generated
	 */
	EClass getVirtualMachineService();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineService#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineService#getInstances()
	 * @see #getVirtualMachineService()
	 * @generated
	 */
	EReference getVirtualMachineService_Instances();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineService#getManagerPortNumber <em>Manager Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager Port Number</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineService#getManagerPortNumber()
	 * @see #getVirtualMachineService()
	 * @generated
	 */
	EAttribute getVirtualMachineService_ManagerPortNumber();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineService#updateDeploymentStatus() <em>Update Deployment Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Deployment Status</em>' operation.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineService#updateDeploymentStatus()
	 * @generated
	 */
	EOperation getVirtualMachineService__UpdateDeploymentStatus();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance <em>Virtual Machine Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine Service Instance</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance
	 * @generated
	 */
	EClass getVirtualMachineServiceInstance();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getLocation()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EReference getVirtualMachineServiceInstance_Location();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getVmType <em>Vm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vm Type</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getVmType()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EReference getVirtualMachineServiceInstance_VmType();

	/**
	 * Returns the meta object for the reference list '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Users</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getUsers()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EReference getVirtualMachineServiceInstance_Users();

	/**
	 * Returns the meta object for the reference list '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getAdminUsers <em>Admin Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Admin Users</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getAdminUsers()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EReference getVirtualMachineServiceInstance_AdminUsers();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getApplicationIds <em>Application Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Application Ids</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getApplicationIds()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceInstance_ApplicationIds();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getAdminId <em>Admin Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin Id</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getAdminId()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceInstance_AdminId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getNumberOfServers <em>Number Of Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Servers</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getNumberOfServers()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceInstance_NumberOfServers();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getAvailabilityZone <em>Availability Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getAvailabilityZone()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceInstance_AvailabilityZone();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getManagerPortNumber <em>Manager Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager Port Number</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getManagerPortNumber()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceInstance_ManagerPortNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servers</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getServers()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EReference getVirtualMachineServiceInstance_Servers();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getLeaderServer <em>Leader Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leader Server</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getLeaderServer()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EReference getVirtualMachineServiceInstance_LeaderServer();

	/**
	 * Returns the meta object for the container reference '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getService()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EReference getVirtualMachineServiceInstance_Service();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getIedsAdmin <em>Ieds Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ieds Admin</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getIedsAdmin()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceInstance_IedsAdmin();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getChefUser <em>Chef User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chef User</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getChefUser()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceInstance_ChefUser();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getChefOrg <em>Chef Org</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chef Org</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getChefOrg()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceInstance_ChefOrg();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getChefTopology <em>Chef Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chef Topology</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getChefTopology()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceInstance_ChefTopology();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getOpenstackFlavor <em>Openstack Flavor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openstack Flavor</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getOpenstackFlavor()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceInstance_OpenstackFlavor();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getServiceFqdn <em>Service Fqdn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Fqdn</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getServiceFqdn()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceInstance_ServiceFqdn();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getDeploymentTimeoutMinutes <em>Deployment Timeout Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment Timeout Minutes</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getDeploymentTimeoutMinutes()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceInstance_DeploymentTimeoutMinutes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getSteps()
	 * @see #getVirtualMachineServiceInstance()
	 * @generated
	 */
	EReference getVirtualMachineServiceInstance_Steps();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceConfiguration <em>Virtual Machine Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine Service Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceConfiguration
	 * @generated
	 */
	EClass getVirtualMachineServiceConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceConfiguration#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceConfiguration#getConfiguration()
	 * @see #getVirtualMachineServiceConfiguration()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceConfiguration_Configuration();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor <em>Virtual Machine Service Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine Service Descriptor</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor
	 * @generated
	 */
	EClass getVirtualMachineServiceDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getServicePackage <em>Service Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Package</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getServicePackage()
	 * @see #getVirtualMachineServiceDescriptor()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceDescriptor_ServicePackage();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getServiceClass <em>Service Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Class</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getServiceClass()
	 * @see #getVirtualMachineServiceDescriptor()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceDescriptor_ServiceClass();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getServiceInstanceClass <em>Service Instance Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Instance Class</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getServiceInstanceClass()
	 * @see #getVirtualMachineServiceDescriptor()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceDescriptor_ServiceInstanceClass();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getVmType <em>Vm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Type</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getVmType()
	 * @see #getVirtualMachineServiceDescriptor()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceDescriptor_VmType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getManagerPortNumber <em>Manager Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager Port Number</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getManagerPortNumber()
	 * @see #getVirtualMachineServiceDescriptor()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceDescriptor_ManagerPortNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getManagerUser <em>Manager User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager User</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getManagerUser()
	 * @see #getVirtualMachineServiceDescriptor()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceDescriptor_ManagerUser();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getEncryptedPassword <em>Encrypted Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypted Password</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getEncryptedPassword()
	 * @see #getVirtualMachineServiceDescriptor()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceDescriptor_EncryptedPassword();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Users</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getUsers()
	 * @see #getVirtualMachineServiceDescriptor()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceDescriptor_Users();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getAdminUsers <em>Admin Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Admin Users</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getAdminUsers()
	 * @see #getVirtualMachineServiceDescriptor()
	 * @generated
	 */
	EAttribute getVirtualMachineServiceDescriptor_AdminUsers();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.vm.PhysicalMachine <em>Physical Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Machine</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.PhysicalMachine
	 * @generated
	 */
	EClass getPhysicalMachine();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.PhysicalMachine#getManagerPortNumber <em>Manager Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager Port Number</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.PhysicalMachine#getManagerPortNumber()
	 * @see #getPhysicalMachine()
	 * @generated
	 */
	EAttribute getPhysicalMachine_ManagerPortNumber();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.vm.VirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachine
	 * @generated
	 */
	EClass getVirtualMachine();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachine#getFunctionIndex <em>Function Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Index</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachine#getFunctionIndex()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_FunctionIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachine#getKvmName <em>Kvm Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kvm Name</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachine#getKvmName()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_KvmName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachine#getVnc <em>Vnc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vnc</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachine#getVnc()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_Vnc();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.VirtualMachine#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachine#getGateway()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_Gateway();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.vm.InstallationStep <em>Installation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Installation Step</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.InstallationStep
	 * @generated
	 */
	EClass getInstallationStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.InstallationStep#getApplicationId <em>Application Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Id</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.InstallationStep#getApplicationId()
	 * @see #getInstallationStep()
	 * @generated
	 */
	EAttribute getInstallationStep_ApplicationId();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.vm.ShellInstallationStep <em>Shell Installation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shell Installation Step</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.ShellInstallationStep
	 * @generated
	 */
	EClass getShellInstallationStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.ShellInstallationStep#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.ShellInstallationStep#getCommand()
	 * @see #getShellInstallationStep()
	 * @generated
	 */
	EAttribute getShellInstallationStep_Command();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep <em>Maven Artifact Installation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maven Artifact Installation Step</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep
	 * @generated
	 */
	EClass getMavenArtifactInstallationStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getGroupId()
	 * @see #getMavenArtifactInstallationStep()
	 * @generated
	 */
	EAttribute getMavenArtifactInstallationStep_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getArtifactId()
	 * @see #getMavenArtifactInstallationStep()
	 * @generated
	 */
	EAttribute getMavenArtifactInstallationStep_ArtifactId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getVersion()
	 * @see #getMavenArtifactInstallationStep()
	 * @generated
	 */
	EAttribute getMavenArtifactInstallationStep_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getType()
	 * @see #getMavenArtifactInstallationStep()
	 * @generated
	 */
	EAttribute getMavenArtifactInstallationStep_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getAssemblyId <em>Assembly Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assembly Id</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getAssemblyId()
	 * @see #getMavenArtifactInstallationStep()
	 * @generated
	 */
	EAttribute getMavenArtifactInstallationStep_AssemblyId();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.vm.HttpInstallationStep <em>Http Installation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Installation Step</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.HttpInstallationStep
	 * @generated
	 */
	EClass getHttpInstallationStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getUrl()
	 * @see #getHttpInstallationStep()
	 * @generated
	 */
	EAttribute getHttpInstallationStep_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getUserName()
	 * @see #getHttpInstallationStep()
	 * @generated
	 */
	EAttribute getHttpInstallationStep_UserName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getPassword()
	 * @see #getHttpInstallationStep()
	 * @generated
	 */
	EAttribute getHttpInstallationStep_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getType()
	 * @see #getHttpInstallationStep()
	 * @generated
	 */
	EAttribute getHttpInstallationStep_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getArtifactId()
	 * @see #getHttpInstallationStep()
	 * @generated
	 */
	EAttribute getHttpInstallationStep_ArtifactId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VmFactory getVmFactory();

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
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceImpl <em>Virtual Machine Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceImpl
		 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getVirtualMachineService()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE_SERVICE = eINSTANCE.getVirtualMachineService();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE_SERVICE__INSTANCES = eINSTANCE.getVirtualMachineService_Instances();

		/**
		 * The meta object literal for the '<em><b>Manager Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE__MANAGER_PORT_NUMBER = eINSTANCE.getVirtualMachineService_ManagerPortNumber();

		/**
		 * The meta object literal for the '<em><b>Update Deployment Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIRTUAL_MACHINE_SERVICE___UPDATE_DEPLOYMENT_STATUS = eINSTANCE.getVirtualMachineService__UpdateDeploymentStatus();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl <em>Virtual Machine Service Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl
		 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getVirtualMachineServiceInstance()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE_SERVICE_INSTANCE = eINSTANCE.getVirtualMachineServiceInstance();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE_SERVICE_INSTANCE__LOCATION = eINSTANCE.getVirtualMachineServiceInstance_Location();

		/**
		 * The meta object literal for the '<em><b>Vm Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE_SERVICE_INSTANCE__VM_TYPE = eINSTANCE.getVirtualMachineServiceInstance_VmType();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE_SERVICE_INSTANCE__USERS = eINSTANCE.getVirtualMachineServiceInstance_Users();

		/**
		 * The meta object literal for the '<em><b>Admin Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_USERS = eINSTANCE.getVirtualMachineServiceInstance_AdminUsers();

		/**
		 * The meta object literal for the '<em><b>Application Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_INSTANCE__APPLICATION_IDS = eINSTANCE.getVirtualMachineServiceInstance_ApplicationIds();

		/**
		 * The meta object literal for the '<em><b>Admin Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_ID = eINSTANCE.getVirtualMachineServiceInstance_AdminId();

		/**
		 * The meta object literal for the '<em><b>Number Of Servers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_INSTANCE__NUMBER_OF_SERVERS = eINSTANCE.getVirtualMachineServiceInstance_NumberOfServers();

		/**
		 * The meta object literal for the '<em><b>Availability Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_INSTANCE__AVAILABILITY_ZONE = eINSTANCE.getVirtualMachineServiceInstance_AvailabilityZone();

		/**
		 * The meta object literal for the '<em><b>Manager Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_INSTANCE__MANAGER_PORT_NUMBER = eINSTANCE.getVirtualMachineServiceInstance_ManagerPortNumber();

		/**
		 * The meta object literal for the '<em><b>Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVERS = eINSTANCE.getVirtualMachineServiceInstance_Servers();

		/**
		 * The meta object literal for the '<em><b>Leader Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE_SERVICE_INSTANCE__LEADER_SERVER = eINSTANCE.getVirtualMachineServiceInstance_LeaderServer();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE = eINSTANCE.getVirtualMachineServiceInstance_Service();

		/**
		 * The meta object literal for the '<em><b>Ieds Admin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_INSTANCE__IEDS_ADMIN = eINSTANCE.getVirtualMachineServiceInstance_IedsAdmin();

		/**
		 * The meta object literal for the '<em><b>Chef User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_USER = eINSTANCE.getVirtualMachineServiceInstance_ChefUser();

		/**
		 * The meta object literal for the '<em><b>Chef Org</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_ORG = eINSTANCE.getVirtualMachineServiceInstance_ChefOrg();

		/**
		 * The meta object literal for the '<em><b>Chef Topology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_TOPOLOGY = eINSTANCE.getVirtualMachineServiceInstance_ChefTopology();

		/**
		 * The meta object literal for the '<em><b>Openstack Flavor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_INSTANCE__OPENSTACK_FLAVOR = eINSTANCE.getVirtualMachineServiceInstance_OpenstackFlavor();

		/**
		 * The meta object literal for the '<em><b>Service Fqdn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE_FQDN = eINSTANCE.getVirtualMachineServiceInstance_ServiceFqdn();

		/**
		 * The meta object literal for the '<em><b>Deployment Timeout Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_INSTANCE__DEPLOYMENT_TIMEOUT_MINUTES = eINSTANCE.getVirtualMachineServiceInstance_DeploymentTimeoutMinutes();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE_SERVICE_INSTANCE__STEPS = eINSTANCE.getVirtualMachineServiceInstance_Steps();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceConfigurationImpl <em>Virtual Machine Service Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceConfigurationImpl
		 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getVirtualMachineServiceConfiguration()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE_SERVICE_CONFIGURATION = eINSTANCE.getVirtualMachineServiceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_CONFIGURATION__CONFIGURATION = eINSTANCE.getVirtualMachineServiceConfiguration_Configuration();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceDescriptorImpl <em>Virtual Machine Service Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceDescriptorImpl
		 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getVirtualMachineServiceDescriptor()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE_SERVICE_DESCRIPTOR = eINSTANCE.getVirtualMachineServiceDescriptor();

		/**
		 * The meta object literal for the '<em><b>Service Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_PACKAGE = eINSTANCE.getVirtualMachineServiceDescriptor_ServicePackage();

		/**
		 * The meta object literal for the '<em><b>Service Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_CLASS = eINSTANCE.getVirtualMachineServiceDescriptor_ServiceClass();

		/**
		 * The meta object literal for the '<em><b>Service Instance Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS = eINSTANCE.getVirtualMachineServiceDescriptor_ServiceInstanceClass();

		/**
		 * The meta object literal for the '<em><b>Vm Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__VM_TYPE = eINSTANCE.getVirtualMachineServiceDescriptor_VmType();

		/**
		 * The meta object literal for the '<em><b>Manager Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__MANAGER_PORT_NUMBER = eINSTANCE.getVirtualMachineServiceDescriptor_ManagerPortNumber();

		/**
		 * The meta object literal for the '<em><b>Manager User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__MANAGER_USER = eINSTANCE.getVirtualMachineServiceDescriptor_ManagerUser();

		/**
		 * The meta object literal for the '<em><b>Encrypted Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__ENCRYPTED_PASSWORD = eINSTANCE.getVirtualMachineServiceDescriptor_EncryptedPassword();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__USERS = eINSTANCE.getVirtualMachineServiceDescriptor_Users();

		/**
		 * The meta object literal for the '<em><b>Admin Users</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__ADMIN_USERS = eINSTANCE.getVirtualMachineServiceDescriptor_AdminUsers();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.vm.impl.PhysicalMachineImpl <em>Physical Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.vm.impl.PhysicalMachineImpl
		 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getPhysicalMachine()
		 * @generated
		 */
		EClass PHYSICAL_MACHINE = eINSTANCE.getPhysicalMachine();

		/**
		 * The meta object literal for the '<em><b>Manager Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_MACHINE__MANAGER_PORT_NUMBER = eINSTANCE.getPhysicalMachine_ManagerPortNumber();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.vm.impl.VirtualMachineImpl
		 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getVirtualMachine()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE = eINSTANCE.getVirtualMachine();

		/**
		 * The meta object literal for the '<em><b>Function Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__FUNCTION_INDEX = eINSTANCE.getVirtualMachine_FunctionIndex();

		/**
		 * The meta object literal for the '<em><b>Kvm Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__KVM_NAME = eINSTANCE.getVirtualMachine_KvmName();

		/**
		 * The meta object literal for the '<em><b>Vnc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__VNC = eINSTANCE.getVirtualMachine_Vnc();

		/**
		 * The meta object literal for the '<em><b>Gateway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__GATEWAY = eINSTANCE.getVirtualMachine_Gateway();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.vm.impl.InstallationStepImpl <em>Installation Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.vm.impl.InstallationStepImpl
		 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getInstallationStep()
		 * @generated
		 */
		EClass INSTALLATION_STEP = eINSTANCE.getInstallationStep();

		/**
		 * The meta object literal for the '<em><b>Application Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLATION_STEP__APPLICATION_ID = eINSTANCE.getInstallationStep_ApplicationId();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.vm.impl.ShellInstallationStepImpl <em>Shell Installation Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.vm.impl.ShellInstallationStepImpl
		 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getShellInstallationStep()
		 * @generated
		 */
		EClass SHELL_INSTALLATION_STEP = eINSTANCE.getShellInstallationStep();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHELL_INSTALLATION_STEP__COMMAND = eINSTANCE.getShellInstallationStep_Command();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.vm.impl.MavenArtifactInstallationStepImpl <em>Maven Artifact Installation Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.vm.impl.MavenArtifactInstallationStepImpl
		 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getMavenArtifactInstallationStep()
		 * @generated
		 */
		EClass MAVEN_ARTIFACT_INSTALLATION_STEP = eINSTANCE.getMavenArtifactInstallationStep();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAVEN_ARTIFACT_INSTALLATION_STEP__GROUP_ID = eINSTANCE.getMavenArtifactInstallationStep_GroupId();

		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAVEN_ARTIFACT_INSTALLATION_STEP__ARTIFACT_ID = eINSTANCE.getMavenArtifactInstallationStep_ArtifactId();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAVEN_ARTIFACT_INSTALLATION_STEP__VERSION = eINSTANCE.getMavenArtifactInstallationStep_Version();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAVEN_ARTIFACT_INSTALLATION_STEP__TYPE = eINSTANCE.getMavenArtifactInstallationStep_Type();

		/**
		 * The meta object literal for the '<em><b>Assembly Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAVEN_ARTIFACT_INSTALLATION_STEP__ASSEMBLY_ID = eINSTANCE.getMavenArtifactInstallationStep_AssemblyId();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.vm.impl.HttpInstallationStepImpl <em>Http Installation Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.vm.impl.HttpInstallationStepImpl
		 * @see org.openecomp.dcae.controller.service.vm.impl.VmPackageImpl#getHttpInstallationStep()
		 * @generated
		 */
		EClass HTTP_INSTALLATION_STEP = eINSTANCE.getHttpInstallationStep();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_INSTALLATION_STEP__URL = eINSTANCE.getHttpInstallationStep_Url();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_INSTALLATION_STEP__USER_NAME = eINSTANCE.getHttpInstallationStep_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_INSTALLATION_STEP__PASSWORD = eINSTANCE.getHttpInstallationStep_Password();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_INSTALLATION_STEP__TYPE = eINSTANCE.getHttpInstallationStep_Type();

		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_INSTALLATION_STEP__ARTIFACT_ID = eINSTANCE.getHttpInstallationStep_ArtifactId();

	}

} //VmPackage
