
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
package org.openecomp.dcae.controller.service.cdap.cluster.manager;

import org.openecomp.dcae.controller.service.vmmanager.VmmanagerPackage;
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
 * @see org.openecomp.dcae.controller.service.cdap.cluster.manager.ManagerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-service-cdap-cluster-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.service.cdap.cluster'"
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
	String eNS_URI = "org.openecomp.dcae.controller.service.cdap.cluster.manager";

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
	ManagerPackage eINSTANCE = org.openecomp.dcae.controller.service.cdap.cluster.manager.impl.ManagerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.cluster.manager.impl.CdapClusterManagerImpl <em>Cdap Cluster Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.cluster.manager.impl.CdapClusterManagerImpl
	 * @see org.openecomp.dcae.controller.service.cdap.cluster.manager.impl.ManagerPackageImpl#getCdapClusterManager()
	 * @generated
	 */
	int CDAP_CLUSTER_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Input Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER__INPUT_STREAMS = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__INPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Output Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER__OUTPUT_STREAMS = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__OUTPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER__CONFIGURATION = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER__COMPONENT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__COMPONENT;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER__CLUSTER = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cdap Service Servers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER__CDAP_SERVICE_SERVERS = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Health Check Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER__HEALTH_CHECK_SCRIPT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER__TEST_TIMEOUT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cdap Cluster Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER_FEATURE_COUNT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___TEST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___TEST;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___SUSPEND = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___SUSPEND;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___RESUME = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___RESUME;

	/**
	 * The operation id for the '<em>Public Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___PUBLIC_KEY = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___PUBLIC_KEY;

	/**
	 * The operation id for the '<em>Configuration Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___CONFIGURATION_CHANGED = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___CONFIGURATION_CHANGED;

	/**
	 * The operation id for the '<em>Update Streams</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___UPDATE_STREAMS__ELIST_ELIST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___UPDATE_STREAMS__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Logs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___LOGS__JSONOBJECT_ELIST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___LOGS__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Metrics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___METRICS__JSONOBJECT_ELIST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___METRICS__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___PROPERTIES__JSONOBJECT_ELIST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___PROPERTIES__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Upload Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___UPLOAD_INFO__JSONOBJECT_ELIST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___UPLOAD_INFO__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Get Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___GET_VALUES__JSONOBJECT_STRING_LONG_LONG_METRICVALUEOPTION_BOOLEAN = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_VALUES__JSONOBJECT_STRING_LONG_LONG_METRICVALUEOPTION_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Values All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___GET_VALUES_ALL__JSONOBJECT_STRING_ELIST_LONG_LONG_METRICVALUEOPTION_BOOLEAN = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_VALUES_ALL__JSONOBJECT_STRING_ELIST_LONG_LONG_METRICVALUEOPTION_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Messages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___GET_MESSAGES__JSONOBJECT_STRING_LONG_LONG = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_MESSAGES__JSONOBJECT_STRING_LONG_LONG;

	/**
	 * The operation id for the '<em>Get Request Logger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___GET_REQUEST_LOGGER__STRING_STRING_STRING_JSONOBJECT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_REQUEST_LOGGER__STRING_STRING_STRING_JSONOBJECT;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___EVALUATE__STRING_FUNCTION = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___EVALUATE__STRING_FUNCTION;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___UPDATE__STRING_FUNCTION = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___UPDATE__STRING_FUNCTION;

	/**
	 * The operation id for the '<em>Create Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___CREATE_NAMESPACE__STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Delete Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___DELETE_NAMESPACE__STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Deploy App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___DEPLOY_APP__STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Load Artifact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___LOAD_ARTIFACT__STRING_STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Load Artifact With Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___LOAD_ARTIFACT_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Delete Artifact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___DELETE_ARTIFACT__STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Start Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___START_FLOW__STRING_STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Start Worker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___START_WORKER__STRING_STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Start Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___START_SERVICE__STRING_STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Start App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___START_APP__STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Stop App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___STOP_APP__STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Delete App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___DELETE_APP__STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Load Preferences App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___LOAD_PREFERENCES_APP__STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Load Preferences Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___LOAD_PREFERENCES_FLOW__STRING_STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Load Preferences Name Space</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___LOAD_PREFERENCES_NAME_SPACE__STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Set Preferences App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___SET_PREFERENCES_APP__STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Set Preferences Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___SET_PREFERENCES_FLOW__STRING_STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Set Preferences Worker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___SET_PREFERENCES_WORKER__STRING_STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Set Preferences Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___SET_PREFERENCES_SERVICE__STRING_STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Set Preferences Name Space</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___SET_PREFERENCES_NAME_SPACE__STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Set Flow Run Time Args</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___SET_FLOW_RUN_TIME_ARGS__STRING_STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Set Flowlet Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___SET_FLOWLET_INSTANCES__STRING_STRING_STRING_STRING_INT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Stop Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___STOP_FLOW__STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Stop Worker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___STOP_WORKER__STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Stop Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___STOP_SERVICE__STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Truncate Data Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___TRUNCATE_DATA_SET__STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Delete Dataset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___DELETE_DATASET__STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Create Stream</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___CREATE_STREAM__STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Delete Stream</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___DELETE_STREAM__STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get Stream Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___GET_STREAM_EVENTS__STRING_STRING_STRING_STRING_INT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Get Stream Stats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___GET_STREAM_STATS__STRING_STRING_STRING_STRING_INT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Send Event To Stream</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___SEND_EVENT_TO_STREAM__STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Trucate Stream</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___TRUCATE_STREAM__STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Set Stream Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___SET_STREAM_PROPERTIES__STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Restart App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___RESTART_APP__STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Create App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___CREATE_APP__STRING_STRING_STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Create App With Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___CREATE_APP_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Set Dataset Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___SET_DATASET_PROPERTIES__STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Set Stream TTL</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___SET_STREAM_TTL__STRING_STRING_INT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Suspend Schedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___SUSPEND_SCHEDULE__STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Resume Schedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER___RESUME_SCHEDULE__STRING_STRING_STRING = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 40;

	/**
	 * The number of operations of the '<em>Cdap Cluster Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_MANAGER_OPERATION_COUNT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 41;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.cluster.manager.CdapClusterManager <em>Cdap Cluster Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cdap Cluster Manager</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.cluster.manager.CdapClusterManager
	 * @generated
	 */
	EClass getCdapClusterManager();

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
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.cluster.manager.impl.CdapClusterManagerImpl <em>Cdap Cluster Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.cluster.manager.impl.CdapClusterManagerImpl
		 * @see org.openecomp.dcae.controller.service.cdap.cluster.manager.impl.ManagerPackageImpl#getCdapClusterManager()
		 * @generated
		 */
		EClass CDAP_CLUSTER_MANAGER = eINSTANCE.getCdapClusterManager();

	}

} //ManagerPackage
