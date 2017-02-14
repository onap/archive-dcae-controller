
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
package org.openecomp.dcae.controller.service.cdap.cluster.service;

import org.openecomp.dcae.controller.service.vm.VmPackage;

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
 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.ServiceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-service-cdap-cluster-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.service.cdap.cluster'"
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
	String eNS_URI = "org.openecomp.dcae.controller.service.cdap.cluster.service";

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
	ServicePackage eINSTANCE = org.openecomp.dcae.controller.service.cdap.cluster.service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.cluster.service.impl.CdapClusterServiceImpl <em>Cdap Cluster Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.impl.CdapClusterServiceImpl
	 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.impl.ServicePackageImpl#getCdapClusterService()
	 * @generated
	 */
	int CDAP_CLUSTER_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE__NAME = VmPackage.VIRTUAL_MACHINE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE__LAST_POLLED = VmPackage.VIRTUAL_MACHINE_SERVICE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE__LAST_CHANGED = VmPackage.VIRTUAL_MACHINE_SERVICE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE__CREATED = VmPackage.VIRTUAL_MACHINE_SERVICE__CREATED;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE__INSTANCES = VmPackage.VIRTUAL_MACHINE_SERVICE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Manager Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE__MANAGER_PORT_NUMBER = VmPackage.VIRTUAL_MACHINE_SERVICE__MANAGER_PORT_NUMBER;

	/**
	 * The number of structural features of the '<em>Cdap Cluster Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_FEATURE_COUNT = VmPackage.VIRTUAL_MACHINE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE___DEPLOY__STRING_STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___DEPLOY__STRING_STRING;

	/**
	 * The operation id for the '<em>Undeploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE___UNDEPLOY__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___UNDEPLOY__STRING;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE___TEST__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___TEST__STRING;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE___SUSPEND__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___SUSPEND__STRING;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE___RESUME__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___RESUME__STRING;

	/**
	 * The operation id for the '<em>Push Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Poll Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE___POLL_MANAGER_CONFIGURATION__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___POLL_MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE___MANAGER_CONFIGURATION__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Manager Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT = VmPackage.VIRTUAL_MACHINE_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT;

	/**
	 * The operation id for the '<em>Update Configuration From Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING;

	/**
	 * The operation id for the '<em>Run Health Tests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE___RUN_HEALTH_TESTS = VmPackage.VIRTUAL_MACHINE_SERVICE___RUN_HEALTH_TESTS;

	/**
	 * The operation id for the '<em>Update Deployment Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE___UPDATE_DEPLOYMENT_STATUS = VmPackage.VIRTUAL_MACHINE_SERVICE___UPDATE_DEPLOYMENT_STATUS;

	/**
	 * The number of operations of the '<em>Cdap Cluster Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_OPERATION_COUNT = VmPackage.VIRTUAL_MACHINE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.cluster.service.impl.CdapClusterServiceInstanceImpl <em>Cdap Cluster Service Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.impl.CdapClusterServiceInstanceImpl
	 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.impl.ServicePackageImpl#getCdapClusterServiceInstance()
	 * @generated
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__NAME = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__LAST_POLLED = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__LAST_CHANGED = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__CREATED = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CREATED;

	/**
	 * The feature id for the '<em><b>Service Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__SERVICE_CONTAINER = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__STATUS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__STATUS;

	/**
	 * The feature id for the '<em><b>Input Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__INPUT_STREAMS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__INPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Output Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__OUTPUT_STREAMS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__OUTPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Last Health Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__LAST_HEALTH_TEST = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LAST_HEALTH_TEST;

	/**
	 * The feature id for the '<em><b>Health Test Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__HEALTH_TEST_STATUS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__HEALTH_TEST_STATUS;

	/**
	 * The feature id for the '<em><b>Health Test Message Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__CONFIGURATION = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__LOCATION = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Vm Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__VM_TYPE = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__VM_TYPE;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__USERS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__USERS;

	/**
	 * The feature id for the '<em><b>Admin Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__ADMIN_USERS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_USERS;

	/**
	 * The feature id for the '<em><b>Application Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__APPLICATION_IDS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__APPLICATION_IDS;

	/**
	 * The feature id for the '<em><b>Admin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__ADMIN_ID = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_ID;

	/**
	 * The feature id for the '<em><b>Number Of Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__NUMBER_OF_SERVERS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__NUMBER_OF_SERVERS;

	/**
	 * The feature id for the '<em><b>Availability Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__AVAILABILITY_ZONE = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__AVAILABILITY_ZONE;

	/**
	 * The feature id for the '<em><b>Manager Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__MANAGER_PORT_NUMBER = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__MANAGER_PORT_NUMBER;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__SERVERS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVERS;

	/**
	 * The feature id for the '<em><b>Leader Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__LEADER_SERVER = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LEADER_SERVER;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__SERVICE = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE;

	/**
	 * The feature id for the '<em><b>Ieds Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__IEDS_ADMIN = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__IEDS_ADMIN;

	/**
	 * The feature id for the '<em><b>Chef User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__CHEF_USER = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_USER;

	/**
	 * The feature id for the '<em><b>Chef Org</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__CHEF_ORG = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_ORG;

	/**
	 * The feature id for the '<em><b>Chef Topology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__CHEF_TOPOLOGY = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_TOPOLOGY;

	/**
	 * The feature id for the '<em><b>Openstack Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__OPENSTACK_FLAVOR = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__OPENSTACK_FLAVOR;

	/**
	 * The feature id for the '<em><b>Service Fqdn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__SERVICE_FQDN = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE_FQDN;

	/**
	 * The feature id for the '<em><b>Deployment Timeout Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__DEPLOYMENT_TIMEOUT_MINUTES = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__DEPLOYMENT_TIMEOUT_MINUTES;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__STEPS = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__STEPS;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE__CLUSTER = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cdap Cluster Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE_FEATURE_COUNT = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cdap Cluster Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_SERVICE_INSTANCE_OPERATION_COUNT = VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.cluster.service.impl.CdapClusterConfigurationImpl <em>Cdap Cluster Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.impl.CdapClusterConfigurationImpl
	 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.impl.ServicePackageImpl#getCdapClusterConfiguration()
	 * @generated
	 */
	int CDAP_CLUSTER_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_CONFIGURATION__CLUSTER = 0;

	/**
	 * The number of structural features of the '<em>Cdap Cluster Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cdap Cluster Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_CONFIGURATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterService <em>Cdap Cluster Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cdap Cluster Service</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterService
	 * @generated
	 */
	EClass getCdapClusterService();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterServiceInstance <em>Cdap Cluster Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cdap Cluster Service Instance</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterServiceInstance
	 * @generated
	 */
	EClass getCdapClusterServiceInstance();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterConfiguration <em>Cdap Cluster Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cdap Cluster Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterConfiguration
	 * @generated
	 */
	EClass getCdapClusterConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterConfiguration#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cluster</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterConfiguration#getCluster()
	 * @see #getCdapClusterConfiguration()
	 * @generated
	 */
	EReference getCdapClusterConfiguration_Cluster();

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
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.cluster.service.impl.CdapClusterServiceImpl <em>Cdap Cluster Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.impl.CdapClusterServiceImpl
		 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.impl.ServicePackageImpl#getCdapClusterService()
		 * @generated
		 */
		EClass CDAP_CLUSTER_SERVICE = eINSTANCE.getCdapClusterService();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.cluster.service.impl.CdapClusterServiceInstanceImpl <em>Cdap Cluster Service Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.impl.CdapClusterServiceInstanceImpl
		 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.impl.ServicePackageImpl#getCdapClusterServiceInstance()
		 * @generated
		 */
		EClass CDAP_CLUSTER_SERVICE_INSTANCE = eINSTANCE.getCdapClusterServiceInstance();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.cluster.service.impl.CdapClusterConfigurationImpl <em>Cdap Cluster Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.impl.CdapClusterConfigurationImpl
		 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.impl.ServicePackageImpl#getCdapClusterConfiguration()
		 * @generated
		 */
		EClass CDAP_CLUSTER_CONFIGURATION = eINSTANCE.getCdapClusterConfiguration();

		/**
		 * The meta object literal for the '<em><b>Cluster</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_CLUSTER_CONFIGURATION__CLUSTER = eINSTANCE.getCdapClusterConfiguration_Cluster();

	}

} //ServicePackage
