
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
package org.openecomp.dcae.controller.platform.controller;

import org.openecomp.dcae.controller.service.vm.VmPackage;
import org.openecomp.ncomp.core.CorePackage;
import org.openecomp.ncomp.sirius.manager.server.ServerPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.openecomp.dcae.controller.platform.controller.ControllerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-platform-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.platform'"
 * @generated
 */
public interface ControllerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "controller";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.dcae.controller.platform.controller";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "controller";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControllerPackage eINSTANCE = org.openecomp.dcae.controller.platform.controller.impl.ControllerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.platform.controller.impl.DcaePlatformControllerImpl <em>Dcae Platform Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.platform.controller.impl.DcaePlatformControllerImpl
	 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerPackageImpl#getDcaePlatformController()
	 * @generated
	 */
	int DCAE_PLATFORM_CONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER__CONFIGURATION = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER__COMPONENT = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER__CLUSTER = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Openstack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER__OPENSTACK = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER__LOCATIONS = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Databus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER__DATABUS = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER__DESCRIPTORS = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER__SERVICES = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER__USERS = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Admin Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER__ADMIN_USERS = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Dcae Platform Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER_FEATURE_COUNT = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Logs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER___LOGS__JSONOBJECT_ELIST = ServerPackage.SOUTH_BOUND_API_WITH_PROXY___LOGS__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Metrics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER___METRICS__JSONOBJECT_ELIST = ServerPackage.SOUTH_BOUND_API_WITH_PROXY___METRICS__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER___PROPERTIES__JSONOBJECT_ELIST = ServerPackage.SOUTH_BOUND_API_WITH_PROXY___PROPERTIES__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Upload Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER___UPLOAD_INFO__JSONOBJECT_ELIST = ServerPackage.SOUTH_BOUND_API_WITH_PROXY___UPLOAD_INFO__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Get Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER___GET_VALUES__JSONOBJECT_STRING_LONG_LONG_METRICVALUEOPTION_BOOLEAN = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Values All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER___GET_VALUES_ALL__JSONOBJECT_STRING_ELIST_LONG_LONG_METRICVALUEOPTION_BOOLEAN = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Messages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER___GET_MESSAGES__JSONOBJECT_STRING_LONG_LONG = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Request Logger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER___GET_REQUEST_LOGGER__STRING_STRING_STRING_JSONOBJECT = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER___EVALUATE__STRING_FUNCTION = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER___UPDATE__STRING_FUNCTION = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Deploy Descriptor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER___DEPLOY_DESCRIPTOR__STRING = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Refresh Data Bus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER___REFRESH_DATA_BUS__STRING = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Dcae Platform Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_PLATFORM_CONTROLLER_OPERATION_COUNT = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 8;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.platform.controller.impl.DcaeDataBusImpl <em>Dcae Data Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.platform.controller.impl.DcaeDataBusImpl
	 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerPackageImpl#getDcaeDataBus()
	 * @generated
	 */
	int DCAE_DATA_BUS = 1;

	/**
	 * The feature id for the '<em><b>Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_DATA_BUS__STREAMS = 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_DATA_BUS__LOCATIONS = 1;

	/**
	 * The feature id for the '<em><b>Mr Clusters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_DATA_BUS__MR_CLUSTERS = 2;

	/**
	 * The feature id for the '<em><b>Dr Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_DATA_BUS__DR_NODES = 3;

	/**
	 * The number of structural features of the '<em>Dcae Data Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_DATA_BUS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dcae Data Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_DATA_BUS_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterImpl
	 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerPackageImpl#getControllerCluster()
	 * @generated
	 */
	int CONTROLLER_CLUSTER = 2;

	/**
	 * The feature id for the '<em><b>My Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER__MY_SERVER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER__ROLE = 1;

	/**
	 * The feature id for the '<em><b>State Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER__STATE_TIME = 2;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER__SERVERS = 3;

	/**
	 * The feature id for the '<em><b>Remote Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER__REMOTE_SERVERS = 4;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Push Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER___PUSH_DATA__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Receive Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER___RECEIVE_DATA__STRING_STRING_DATE_STRING = 1;

	/**
	 * The number of operations of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterServerImpl <em>Cluster Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterServerImpl
	 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerPackageImpl#getControllerClusterServer()
	 * @generated
	 */
	int CONTROLLER_CLUSTER_SERVER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER__ROLE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER__DATA = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER__SERVER = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cluster Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cluster Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterServerDataImpl <em>Cluster Server Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterServerDataImpl
	 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerPackageImpl#getControllerClusterServerData()
	 * @generated
	 */
	int CONTROLLER_CLUSTER_SERVER_DATA = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER_DATA__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER_DATA__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER_DATA__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER_DATA__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Push Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER_DATA__PUSH_INTERVAL = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Push</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER_DATA__LAST_PUSH = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Data Pushes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_PUSHES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Number Data Push Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_PUSH_ERRORS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last Data Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER_DATA__LAST_DATA_RECEIVED = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Number Data Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_RECEIVED = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Number Data Received Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_RECEIVED_ERRORS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Cluster Server Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER_DATA_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Cluster Server Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CLUSTER_SERVER_DATA_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerVirtualMachineServiceImpl <em>Virtual Machine Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerVirtualMachineServiceImpl
	 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerPackageImpl#getControllerVirtualMachineService()
	 * @generated
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE__NAME = VmPackage.VIRTUAL_MACHINE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE__LAST_POLLED = VmPackage.VIRTUAL_MACHINE_SERVICE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE__LAST_CHANGED = VmPackage.VIRTUAL_MACHINE_SERVICE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE__CREATED = VmPackage.VIRTUAL_MACHINE_SERVICE__CREATED;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE__INSTANCES = VmPackage.VIRTUAL_MACHINE_SERVICE__INSTANCES;

	/**
	 * The feature id for the '<em><b>Manager Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE__MANAGER_PORT_NUMBER = VmPackage.VIRTUAL_MACHINE_SERVICE__MANAGER_PORT_NUMBER;

	/**
	 * The number of structural features of the '<em>Virtual Machine Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE_FEATURE_COUNT = VmPackage.VIRTUAL_MACHINE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE___DEPLOY__STRING_STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___DEPLOY__STRING_STRING;

	/**
	 * The operation id for the '<em>Undeploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE___UNDEPLOY__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___UNDEPLOY__STRING;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE___TEST__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___TEST__STRING;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE___SUSPEND__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___SUSPEND__STRING;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE___RESUME__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___RESUME__STRING;

	/**
	 * The operation id for the '<em>Push Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Poll Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE___POLL_MANAGER_CONFIGURATION__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___POLL_MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE___MANAGER_CONFIGURATION__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Manager Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT = VmPackage.VIRTUAL_MACHINE_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT;

	/**
	 * The operation id for the '<em>Update Configuration From Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING = VmPackage.VIRTUAL_MACHINE_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING;

	/**
	 * The operation id for the '<em>Run Health Tests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE___RUN_HEALTH_TESTS = VmPackage.VIRTUAL_MACHINE_SERVICE___RUN_HEALTH_TESTS;

	/**
	 * The operation id for the '<em>Update Deployment Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE___UPDATE_DEPLOYMENT_STATUS = VmPackage.VIRTUAL_MACHINE_SERVICE___UPDATE_DEPLOYMENT_STATUS;

	/**
	 * The number of operations of the '<em>Virtual Machine Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_VIRTUAL_MACHINE_SERVICE_OPERATION_COUNT = VmPackage.VIRTUAL_MACHINE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.platform.controller.ServerRole <em>Server Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.platform.controller.ServerRole
	 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerPackageImpl#getServerRole()
	 * @generated
	 */
	int SERVER_ROLE = 6;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController <em>Dcae Platform Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Platform Controller</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.DcaePlatformController
	 * @generated
	 */
	EClass getDcaePlatformController();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cluster</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getCluster()
	 * @see #getDcaePlatformController()
	 * @generated
	 */
	EReference getDcaePlatformController_Cluster();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getOpenstack <em>Openstack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Openstack</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getOpenstack()
	 * @see #getDcaePlatformController()
	 * @generated
	 */
	EReference getDcaePlatformController_Openstack();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getLocations()
	 * @see #getDcaePlatformController()
	 * @generated
	 */
	EReference getDcaePlatformController_Locations();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getDatabus <em>Databus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Databus</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getDatabus()
	 * @see #getDcaePlatformController()
	 * @generated
	 */
	EReference getDcaePlatformController_Databus();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getServices()
	 * @see #getDcaePlatformController()
	 * @generated
	 */
	EReference getDcaePlatformController_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getUsers()
	 * @see #getDcaePlatformController()
	 * @generated
	 */
	EReference getDcaePlatformController_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getDescriptors <em>Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptors</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getDescriptors()
	 * @see #getDcaePlatformController()
	 * @generated
	 */
	EReference getDcaePlatformController_Descriptors();

	/**
	 * Returns the meta object for the reference list '{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getAdminUsers <em>Admin Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Admin Users</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getAdminUsers()
	 * @see #getDcaePlatformController()
	 * @generated
	 */
	EReference getDcaePlatformController_AdminUsers();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#deployDescriptor(java.lang.String) <em>Deploy Descriptor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deploy Descriptor</em>' operation.
	 * @see org.openecomp.dcae.controller.platform.controller.DcaePlatformController#deployDescriptor(java.lang.String)
	 * @generated
	 */
	EOperation getDcaePlatformController__DeployDescriptor__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#refreshDataBus(java.lang.String) <em>Refresh Data Bus</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Data Bus</em>' operation.
	 * @see org.openecomp.dcae.controller.platform.controller.DcaePlatformController#refreshDataBus(java.lang.String)
	 * @generated
	 */
	EOperation getDcaePlatformController__RefreshDataBus__String();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.platform.controller.DcaeDataBus <em>Dcae Data Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Data Bus</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.DcaeDataBus
	 * @generated
	 */
	EClass getDcaeDataBus();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.platform.controller.DcaeDataBus#getStreams <em>Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Streams</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.DcaeDataBus#getStreams()
	 * @see #getDcaeDataBus()
	 * @generated
	 */
	EReference getDcaeDataBus_Streams();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.platform.controller.DcaeDataBus#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.DcaeDataBus#getLocations()
	 * @see #getDcaeDataBus()
	 * @generated
	 */
	EReference getDcaeDataBus_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.platform.controller.DcaeDataBus#getMrClusters <em>Mr Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mr Clusters</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.DcaeDataBus#getMrClusters()
	 * @see #getDcaeDataBus()
	 * @generated
	 */
	EReference getDcaeDataBus_MrClusters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.platform.controller.DcaeDataBus#getDrNodes <em>Dr Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dr Nodes</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.DcaeDataBus#getDrNodes()
	 * @see #getDcaeDataBus()
	 * @generated
	 */
	EReference getDcaeDataBus_DrNodes();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.platform.controller.ControllerCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerCluster
	 * @generated
	 */
	EClass getControllerCluster();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.platform.controller.ControllerCluster#getMyServerName <em>My Server Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>My Server Name</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerCluster#getMyServerName()
	 * @see #getControllerCluster()
	 * @generated
	 */
	EAttribute getControllerCluster_MyServerName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.platform.controller.ControllerCluster#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerCluster#getRole()
	 * @see #getControllerCluster()
	 * @generated
	 */
	EAttribute getControllerCluster_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.platform.controller.ControllerCluster#getStateTime <em>State Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Time</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerCluster#getStateTime()
	 * @see #getControllerCluster()
	 * @generated
	 */
	EAttribute getControllerCluster_StateTime();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.platform.controller.ControllerCluster#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servers</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerCluster#getServers()
	 * @see #getControllerCluster()
	 * @generated
	 */
	EReference getControllerCluster_Servers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.platform.controller.ControllerCluster#getRemoteServers <em>Remote Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Remote Servers</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerCluster#getRemoteServers()
	 * @see #getControllerCluster()
	 * @generated
	 */
	EReference getControllerCluster_RemoteServers();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.platform.controller.ControllerCluster#pushData(java.lang.String, java.lang.String) <em>Push Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Push Data</em>' operation.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerCluster#pushData(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getControllerCluster__PushData__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.platform.controller.ControllerCluster#receiveData(java.lang.String, java.lang.String, java.util.Date, java.lang.String) <em>Receive Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Receive Data</em>' operation.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerCluster#receiveData(java.lang.String, java.lang.String, java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getControllerCluster__ReceiveData__String_String_Date_String();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServer <em>Cluster Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster Server</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerClusterServer
	 * @generated
	 */
	EClass getControllerClusterServer();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServer#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerClusterServer#getRole()
	 * @see #getControllerClusterServer()
	 * @generated
	 */
	EAttribute getControllerClusterServer_Role();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServer#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerClusterServer#getData()
	 * @see #getControllerClusterServer()
	 * @generated
	 */
	EReference getControllerClusterServer_Data();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServer#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerClusterServer#getServer()
	 * @see #getControllerClusterServer()
	 * @generated
	 */
	EReference getControllerClusterServer_Server();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData <em>Cluster Server Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster Server Data</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData
	 * @generated
	 */
	EClass getControllerClusterServerData();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getPushInterval <em>Push Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Push Interval</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getPushInterval()
	 * @see #getControllerClusterServerData()
	 * @generated
	 */
	EAttribute getControllerClusterServerData_PushInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getLastPush <em>Last Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Push</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getLastPush()
	 * @see #getControllerClusterServerData()
	 * @generated
	 */
	EAttribute getControllerClusterServerData_LastPush();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getNumberDataPushes <em>Number Data Pushes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Data Pushes</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getNumberDataPushes()
	 * @see #getControllerClusterServerData()
	 * @generated
	 */
	EAttribute getControllerClusterServerData_NumberDataPushes();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getNumberDataPushErrors <em>Number Data Push Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Data Push Errors</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getNumberDataPushErrors()
	 * @see #getControllerClusterServerData()
	 * @generated
	 */
	EAttribute getControllerClusterServerData_NumberDataPushErrors();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getLastDataReceived <em>Last Data Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Data Received</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getLastDataReceived()
	 * @see #getControllerClusterServerData()
	 * @generated
	 */
	EAttribute getControllerClusterServerData_LastDataReceived();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getNumberDataReceived <em>Number Data Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Data Received</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getNumberDataReceived()
	 * @see #getControllerClusterServerData()
	 * @generated
	 */
	EAttribute getControllerClusterServerData_NumberDataReceived();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getNumberDataReceivedErrors <em>Number Data Received Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Data Received Errors</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getNumberDataReceivedErrors()
	 * @see #getControllerClusterServerData()
	 * @generated
	 */
	EAttribute getControllerClusterServerData_NumberDataReceivedErrors();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.platform.controller.ControllerVirtualMachineService <em>Virtual Machine Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine Service</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerVirtualMachineService
	 * @generated
	 */
	EClass getControllerVirtualMachineService();

	/**
	 * Returns the meta object for enum '{@link org.openecomp.dcae.controller.platform.controller.ServerRole <em>Server Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Server Role</em>'.
	 * @see org.openecomp.dcae.controller.platform.controller.ServerRole
	 * @generated
	 */
	EEnum getServerRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ControllerFactory getControllerFactory();

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
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.platform.controller.impl.DcaePlatformControllerImpl <em>Dcae Platform Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.platform.controller.impl.DcaePlatformControllerImpl
		 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerPackageImpl#getDcaePlatformController()
		 * @generated
		 */
		EClass DCAE_PLATFORM_CONTROLLER = eINSTANCE.getDcaePlatformController();

		/**
		 * The meta object literal for the '<em><b>Cluster</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_PLATFORM_CONTROLLER__CLUSTER = eINSTANCE.getDcaePlatformController_Cluster();

		/**
		 * The meta object literal for the '<em><b>Openstack</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_PLATFORM_CONTROLLER__OPENSTACK = eINSTANCE.getDcaePlatformController_Openstack();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_PLATFORM_CONTROLLER__LOCATIONS = eINSTANCE.getDcaePlatformController_Locations();

		/**
		 * The meta object literal for the '<em><b>Databus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_PLATFORM_CONTROLLER__DATABUS = eINSTANCE.getDcaePlatformController_Databus();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_PLATFORM_CONTROLLER__SERVICES = eINSTANCE.getDcaePlatformController_Services();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_PLATFORM_CONTROLLER__USERS = eINSTANCE.getDcaePlatformController_Users();

		/**
		 * The meta object literal for the '<em><b>Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_PLATFORM_CONTROLLER__DESCRIPTORS = eINSTANCE.getDcaePlatformController_Descriptors();

		/**
		 * The meta object literal for the '<em><b>Admin Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_PLATFORM_CONTROLLER__ADMIN_USERS = eINSTANCE.getDcaePlatformController_AdminUsers();

		/**
		 * The meta object literal for the '<em><b>Deploy Descriptor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_PLATFORM_CONTROLLER___DEPLOY_DESCRIPTOR__STRING = eINSTANCE.getDcaePlatformController__DeployDescriptor__String();

		/**
		 * The meta object literal for the '<em><b>Refresh Data Bus</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_PLATFORM_CONTROLLER___REFRESH_DATA_BUS__STRING = eINSTANCE.getDcaePlatformController__RefreshDataBus__String();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.platform.controller.impl.DcaeDataBusImpl <em>Dcae Data Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.platform.controller.impl.DcaeDataBusImpl
		 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerPackageImpl#getDcaeDataBus()
		 * @generated
		 */
		EClass DCAE_DATA_BUS = eINSTANCE.getDcaeDataBus();

		/**
		 * The meta object literal for the '<em><b>Streams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_DATA_BUS__STREAMS = eINSTANCE.getDcaeDataBus_Streams();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_DATA_BUS__LOCATIONS = eINSTANCE.getDcaeDataBus_Locations();

		/**
		 * The meta object literal for the '<em><b>Mr Clusters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_DATA_BUS__MR_CLUSTERS = eINSTANCE.getDcaeDataBus_MrClusters();

		/**
		 * The meta object literal for the '<em><b>Dr Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_DATA_BUS__DR_NODES = eINSTANCE.getDcaeDataBus_DrNodes();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterImpl
		 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerPackageImpl#getControllerCluster()
		 * @generated
		 */
		EClass CONTROLLER_CLUSTER = eINSTANCE.getControllerCluster();

		/**
		 * The meta object literal for the '<em><b>My Server Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_CLUSTER__MY_SERVER_NAME = eINSTANCE.getControllerCluster_MyServerName();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_CLUSTER__ROLE = eINSTANCE.getControllerCluster_Role();

		/**
		 * The meta object literal for the '<em><b>State Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_CLUSTER__STATE_TIME = eINSTANCE.getControllerCluster_StateTime();

		/**
		 * The meta object literal for the '<em><b>Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_CLUSTER__SERVERS = eINSTANCE.getControllerCluster_Servers();

		/**
		 * The meta object literal for the '<em><b>Remote Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_CLUSTER__REMOTE_SERVERS = eINSTANCE.getControllerCluster_RemoteServers();

		/**
		 * The meta object literal for the '<em><b>Push Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER_CLUSTER___PUSH_DATA__STRING_STRING = eINSTANCE.getControllerCluster__PushData__String_String();

		/**
		 * The meta object literal for the '<em><b>Receive Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER_CLUSTER___RECEIVE_DATA__STRING_STRING_DATE_STRING = eINSTANCE.getControllerCluster__ReceiveData__String_String_Date_String();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterServerImpl <em>Cluster Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterServerImpl
		 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerPackageImpl#getControllerClusterServer()
		 * @generated
		 */
		EClass CONTROLLER_CLUSTER_SERVER = eINSTANCE.getControllerClusterServer();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_CLUSTER_SERVER__ROLE = eINSTANCE.getControllerClusterServer_Role();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_CLUSTER_SERVER__DATA = eINSTANCE.getControllerClusterServer_Data();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_CLUSTER_SERVER__SERVER = eINSTANCE.getControllerClusterServer_Server();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterServerDataImpl <em>Cluster Server Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterServerDataImpl
		 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerPackageImpl#getControllerClusterServerData()
		 * @generated
		 */
		EClass CONTROLLER_CLUSTER_SERVER_DATA = eINSTANCE.getControllerClusterServerData();

		/**
		 * The meta object literal for the '<em><b>Push Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_CLUSTER_SERVER_DATA__PUSH_INTERVAL = eINSTANCE.getControllerClusterServerData_PushInterval();

		/**
		 * The meta object literal for the '<em><b>Last Push</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_CLUSTER_SERVER_DATA__LAST_PUSH = eINSTANCE.getControllerClusterServerData_LastPush();

		/**
		 * The meta object literal for the '<em><b>Number Data Pushes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_PUSHES = eINSTANCE.getControllerClusterServerData_NumberDataPushes();

		/**
		 * The meta object literal for the '<em><b>Number Data Push Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_PUSH_ERRORS = eINSTANCE.getControllerClusterServerData_NumberDataPushErrors();

		/**
		 * The meta object literal for the '<em><b>Last Data Received</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_CLUSTER_SERVER_DATA__LAST_DATA_RECEIVED = eINSTANCE.getControllerClusterServerData_LastDataReceived();

		/**
		 * The meta object literal for the '<em><b>Number Data Received</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_RECEIVED = eINSTANCE.getControllerClusterServerData_NumberDataReceived();

		/**
		 * The meta object literal for the '<em><b>Number Data Received Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_CLUSTER_SERVER_DATA__NUMBER_DATA_RECEIVED_ERRORS = eINSTANCE.getControllerClusterServerData_NumberDataReceivedErrors();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.platform.controller.impl.ControllerVirtualMachineServiceImpl <em>Virtual Machine Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerVirtualMachineServiceImpl
		 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerPackageImpl#getControllerVirtualMachineService()
		 * @generated
		 */
		EClass CONTROLLER_VIRTUAL_MACHINE_SERVICE = eINSTANCE.getControllerVirtualMachineService();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.platform.controller.ServerRole <em>Server Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.platform.controller.ServerRole
		 * @see org.openecomp.dcae.controller.platform.controller.impl.ControllerPackageImpl#getServerRole()
		 * @generated
		 */
		EEnum SERVER_ROLE = eINSTANCE.getServerRole();

	}

} //ControllerPackage
