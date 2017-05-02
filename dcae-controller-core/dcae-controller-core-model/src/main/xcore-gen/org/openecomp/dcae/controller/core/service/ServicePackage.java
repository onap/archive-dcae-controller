
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
package org.openecomp.dcae.controller.core.service;

import org.openecomp.ncomp.core.CorePackage;

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
 * @see org.openecomp.dcae.controller.core.service.ServiceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-core-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.core'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore ecomp='http://openecomp.org' cdap='http://openecomp.org/cdap'"
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
	String eNS_URI = "org.openecomp.dcae.controller.core.service";

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
	ServicePackage eINSTANCE = org.openecomp.dcae.controller.core.service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.service.impl.DcaeServiceImpl <em>Dcae Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.service.impl.DcaeServiceImpl
	 * @see org.openecomp.dcae.controller.core.service.impl.ServicePackageImpl#getDcaeService()
	 * @generated
	 */
	int DCAE_SERVICE = 1;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.service.impl.DcaeServiceContainerImpl <em>Dcae Service Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.service.impl.DcaeServiceContainerImpl
	 * @see org.openecomp.dcae.controller.core.service.impl.ServicePackageImpl#getDcaeServiceContainer()
	 * @generated
	 */
	int DCAE_SERVICE_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_CONTAINER__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_CONTAINER__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_CONTAINER__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_CONTAINER__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_CONTAINER__INSTANCES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dcae Service Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_CONTAINER_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dcae Service Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_CONTAINER_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The number of structural features of the '<em>Dcae Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE___DEPLOY__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Undeploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE___UNDEPLOY__STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE___TEST__STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE___SUSPEND__STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE___RESUME__STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Push Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Poll Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE___POLL_MANAGER_CONFIGURATION__STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE___MANAGER_CONFIGURATION__STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Manager Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Update Configuration From Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Run Health Tests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE___RUN_HEALTH_TESTS = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 10;

	/**
	 * The number of operations of the '<em>Dcae Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.service.impl.DcaeServiceInstanceImpl <em>Dcae Service Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.service.impl.DcaeServiceInstanceImpl
	 * @see org.openecomp.dcae.controller.core.service.impl.ServicePackageImpl#getDcaeServiceInstance()
	 * @generated
	 */
	int DCAE_SERVICE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_INSTANCE__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_INSTANCE__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_INSTANCE__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_INSTANCE__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Service Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_INSTANCE__SERVICE_CONTAINER = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_INSTANCE__STATUS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_INSTANCE__INPUT_STREAMS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_INSTANCE__OUTPUT_STREAMS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last Health Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_INSTANCE__LAST_HEALTH_TEST = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Health Test Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_INSTANCE__HEALTH_TEST_STATUS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Health Test Message Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Dcae Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_INSTANCE_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Dcae Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_INSTANCE_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.service.impl.DcaeLocationImpl <em>Dcae Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.service.impl.DcaeLocationImpl
	 * @see org.openecomp.dcae.controller.core.service.impl.ServicePackageImpl#getDcaeLocation()
	 * @generated
	 */
	int DCAE_LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_LOCATION__NAME = DCAE_SERVICE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_LOCATION__LAST_POLLED = DCAE_SERVICE_CONTAINER__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_LOCATION__LAST_CHANGED = DCAE_SERVICE_CONTAINER__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_LOCATION__CREATED = DCAE_SERVICE_CONTAINER__CREATED;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_LOCATION__INSTANCES = DCAE_SERVICE_CONTAINER__INSTANCES;

	/**
	 * The feature id for the '<em><b>Location Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_LOCATION__LOCATION_TYPE = DCAE_SERVICE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Openstack Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_LOCATION__OPENSTACK_PROJECT = DCAE_SERVICE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dcae Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_LOCATION_FEATURE_COUNT = DCAE_SERVICE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dcae Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_LOCATION_OPERATION_COUNT = DCAE_SERVICE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.service.impl.DcaeServiceDescriptorImpl <em>Dcae Service Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.service.impl.DcaeServiceDescriptorImpl
	 * @see org.openecomp.dcae.controller.core.service.impl.ServicePackageImpl#getDcaeServiceDescriptor()
	 * @generated
	 */
	int DCAE_SERVICE_DESCRIPTOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_DESCRIPTOR__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_DESCRIPTOR__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_DESCRIPTOR__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_DESCRIPTOR__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_DESCRIPTOR__GROUP_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_DESCRIPTOR__ARTIFACT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_DESCRIPTOR__VERSION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dcae Service Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dcae Service Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_DESCRIPTOR_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.service.impl.HealthTestResponseImpl <em>Health Test Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.service.impl.HealthTestResponseImpl
	 * @see org.openecomp.dcae.controller.core.service.impl.ServicePackageImpl#getHealthTestResponse()
	 * @generated
	 */
	int HEALTH_TEST_RESPONSE = 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_TEST_RESPONSE__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Message Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_TEST_RESPONSE__MESSAGE_CODE = 1;

	/**
	 * The number of structural features of the '<em>Health Test Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_TEST_RESPONSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Health Test Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_TEST_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.service.impl.DcaePolicyEntityImpl <em>Dcae Policy Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.service.impl.DcaePolicyEntityImpl
	 * @see org.openecomp.dcae.controller.core.service.impl.ServicePackageImpl#getDcaePolicyEntity()
	 * @generated
	 */
	int DCAE_POLICY_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Policy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_POLICY_ENTITY__POLICY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Policy Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_POLICY_ENTITY__POLICY_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Policy Config Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_POLICY_ENTITY__POLICY_CONFIG_NAME = 2;

	/**
	 * The feature id for the '<em><b>Policy Template Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_POLICY_ENTITY__POLICY_TEMPLATE_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Policy Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_POLICY_ENTITY__POLICY_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Policy Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_POLICY_ENTITY__POLICY_PRIORITY = 5;

	/**
	 * The feature id for the '<em><b>Policy Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_POLICY_ENTITY__POLICY_SCOPE = 6;

	/**
	 * The number of structural features of the '<em>Dcae Policy Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_POLICY_ENTITY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Dcae Policy Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_POLICY_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.service.HealthTestStatus <em>Health Test Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.service.HealthTestStatus
	 * @see org.openecomp.dcae.controller.core.service.impl.ServicePackageImpl#getHealthTestStatus()
	 * @generated
	 */
	int HEALTH_TEST_STATUS = 7;

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.service.DcaeService <em>Dcae Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Service</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaeService
	 * @generated
	 */
	EClass getDcaeService();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.core.service.DcaeService#deploy(java.lang.String, java.lang.String) <em>Deploy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deploy</em>' operation.
	 * @see org.openecomp.dcae.controller.core.service.DcaeService#deploy(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDcaeService__Deploy__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.core.service.DcaeService#undeploy(java.lang.String) <em>Undeploy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Undeploy</em>' operation.
	 * @see org.openecomp.dcae.controller.core.service.DcaeService#undeploy(java.lang.String)
	 * @generated
	 */
	EOperation getDcaeService__Undeploy__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.core.service.DcaeService#test(java.lang.String) <em>Test</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test</em>' operation.
	 * @see org.openecomp.dcae.controller.core.service.DcaeService#test(java.lang.String)
	 * @generated
	 */
	EOperation getDcaeService__Test__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.core.service.DcaeService#suspend(java.lang.String) <em>Suspend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Suspend</em>' operation.
	 * @see org.openecomp.dcae.controller.core.service.DcaeService#suspend(java.lang.String)
	 * @generated
	 */
	EOperation getDcaeService__Suspend__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.core.service.DcaeService#resume(java.lang.String) <em>Resume</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resume</em>' operation.
	 * @see org.openecomp.dcae.controller.core.service.DcaeService#resume(java.lang.String)
	 * @generated
	 */
	EOperation getDcaeService__Resume__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.core.service.DcaeService#pushManagerConfiguration(java.lang.String) <em>Push Manager Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Push Manager Configuration</em>' operation.
	 * @see org.openecomp.dcae.controller.core.service.DcaeService#pushManagerConfiguration(java.lang.String)
	 * @generated
	 */
	EOperation getDcaeService__PushManagerConfiguration__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.core.service.DcaeService#pollManagerConfiguration(java.lang.String) <em>Poll Manager Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Poll Manager Configuration</em>' operation.
	 * @see org.openecomp.dcae.controller.core.service.DcaeService#pollManagerConfiguration(java.lang.String)
	 * @generated
	 */
	EOperation getDcaeService__PollManagerConfiguration__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.core.service.DcaeService#managerConfiguration(java.lang.String) <em>Manager Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Manager Configuration</em>' operation.
	 * @see org.openecomp.dcae.controller.core.service.DcaeService#managerConfiguration(java.lang.String)
	 * @generated
	 */
	EOperation getDcaeService__ManagerConfiguration__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.core.service.DcaeService#managerOperation(java.lang.String, java.lang.String, org.json.JSONObject) <em>Manager Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Manager Operation</em>' operation.
	 * @see org.openecomp.dcae.controller.core.service.DcaeService#managerOperation(java.lang.String, java.lang.String, org.json.JSONObject)
	 * @generated
	 */
	EOperation getDcaeService__ManagerOperation__String_String_JSONObject();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.core.service.DcaeService#updateConfigurationFromPolicy(java.lang.String) <em>Update Configuration From Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Configuration From Policy</em>' operation.
	 * @see org.openecomp.dcae.controller.core.service.DcaeService#updateConfigurationFromPolicy(java.lang.String)
	 * @generated
	 */
	EOperation getDcaeService__UpdateConfigurationFromPolicy__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.core.service.DcaeService#runHealthTests() <em>Run Health Tests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run Health Tests</em>' operation.
	 * @see org.openecomp.dcae.controller.core.service.DcaeService#runHealthTests()
	 * @generated
	 */
	EOperation getDcaeService__RunHealthTests();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.service.DcaeServiceContainer <em>Dcae Service Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Service Container</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceContainer
	 * @generated
	 */
	EClass getDcaeServiceContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.openecomp.dcae.controller.core.service.DcaeServiceContainer#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceContainer#getInstances()
	 * @see #getDcaeServiceContainer()
	 * @generated
	 */
	EReference getDcaeServiceContainer_Instances();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance <em>Dcae Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Service Instance</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceInstance
	 * @generated
	 */
	EClass getDcaeServiceInstance();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getServiceContainer <em>Service Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Container</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getServiceContainer()
	 * @see #getDcaeServiceInstance()
	 * @generated
	 */
	EReference getDcaeServiceInstance_ServiceContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getStatus()
	 * @see #getDcaeServiceInstance()
	 * @generated
	 */
	EAttribute getDcaeServiceInstance_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getInputStreams <em>Input Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Streams</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getInputStreams()
	 * @see #getDcaeServiceInstance()
	 * @generated
	 */
	EReference getDcaeServiceInstance_InputStreams();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getOutputStreams <em>Output Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Streams</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getOutputStreams()
	 * @see #getDcaeServiceInstance()
	 * @generated
	 */
	EReference getDcaeServiceInstance_OutputStreams();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getLastHealthTest <em>Last Health Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Health Test</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getLastHealthTest()
	 * @see #getDcaeServiceInstance()
	 * @generated
	 */
	EAttribute getDcaeServiceInstance_LastHealthTest();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getHealthTestStatus <em>Health Test Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Health Test Status</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getHealthTestStatus()
	 * @see #getDcaeServiceInstance()
	 * @generated
	 */
	EAttribute getDcaeServiceInstance_HealthTestStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getHealthTestMessageCode <em>Health Test Message Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Health Test Message Code</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getHealthTestMessageCode()
	 * @see #getDcaeServiceInstance()
	 * @generated
	 */
	EAttribute getDcaeServiceInstance_HealthTestMessageCode();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.service.DcaeLocation <em>Dcae Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Location</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaeLocation
	 * @generated
	 */
	EClass getDcaeLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.service.DcaeLocation#getLocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Type</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaeLocation#getLocationType()
	 * @see #getDcaeLocation()
	 * @generated
	 */
	EAttribute getDcaeLocation_LocationType();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.dcae.controller.core.service.DcaeLocation#getOpenstackProject <em>Openstack Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Openstack Project</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaeLocation#getOpenstackProject()
	 * @see #getDcaeLocation()
	 * @generated
	 */
	EReference getDcaeLocation_OpenstackProject();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.service.DcaeServiceDescriptor <em>Dcae Service Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Service Descriptor</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceDescriptor
	 * @generated
	 */
	EClass getDcaeServiceDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.service.DcaeServiceDescriptor#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceDescriptor#getGroupId()
	 * @see #getDcaeServiceDescriptor()
	 * @generated
	 */
	EAttribute getDcaeServiceDescriptor_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.service.DcaeServiceDescriptor#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceDescriptor#getArtifact()
	 * @see #getDcaeServiceDescriptor()
	 * @generated
	 */
	EAttribute getDcaeServiceDescriptor_Artifact();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.service.DcaeServiceDescriptor#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceDescriptor#getVersion()
	 * @see #getDcaeServiceDescriptor()
	 * @generated
	 */
	EAttribute getDcaeServiceDescriptor_Version();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.service.HealthTestResponse <em>Health Test Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Test Response</em>'.
	 * @see org.openecomp.dcae.controller.core.service.HealthTestResponse
	 * @generated
	 */
	EClass getHealthTestResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.service.HealthTestResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.dcae.controller.core.service.HealthTestResponse#getStatus()
	 * @see #getHealthTestResponse()
	 * @generated
	 */
	EAttribute getHealthTestResponse_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.service.HealthTestResponse#getMessageCode <em>Message Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Code</em>'.
	 * @see org.openecomp.dcae.controller.core.service.HealthTestResponse#getMessageCode()
	 * @see #getHealthTestResponse()
	 * @generated
	 */
	EAttribute getHealthTestResponse_MessageCode();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity <em>Dcae Policy Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Policy Entity</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaePolicyEntity
	 * @generated
	 */
	EClass getDcaePolicyEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyName <em>Policy Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Name</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyName()
	 * @see #getDcaePolicyEntity()
	 * @generated
	 */
	EAttribute getDcaePolicyEntity_PolicyName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyDescription <em>Policy Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Description</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyDescription()
	 * @see #getDcaePolicyEntity()
	 * @generated
	 */
	EAttribute getDcaePolicyEntity_PolicyDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyConfigName <em>Policy Config Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Config Name</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyConfigName()
	 * @see #getDcaePolicyEntity()
	 * @generated
	 */
	EAttribute getDcaePolicyEntity_PolicyConfigName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyTemplateVersion <em>Policy Template Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Template Version</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyTemplateVersion()
	 * @see #getDcaePolicyEntity()
	 * @generated
	 */
	EAttribute getDcaePolicyEntity_PolicyTemplateVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyVersion <em>Policy Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Version</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyVersion()
	 * @see #getDcaePolicyEntity()
	 * @generated
	 */
	EAttribute getDcaePolicyEntity_PolicyVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyPriority <em>Policy Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Priority</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyPriority()
	 * @see #getDcaePolicyEntity()
	 * @generated
	 */
	EAttribute getDcaePolicyEntity_PolicyPriority();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyScope <em>Policy Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Scope</em>'.
	 * @see org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyScope()
	 * @see #getDcaePolicyEntity()
	 * @generated
	 */
	EAttribute getDcaePolicyEntity_PolicyScope();

	/**
	 * Returns the meta object for enum '{@link org.openecomp.dcae.controller.core.service.HealthTestStatus <em>Health Test Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Health Test Status</em>'.
	 * @see org.openecomp.dcae.controller.core.service.HealthTestStatus
	 * @generated
	 */
	EEnum getHealthTestStatus();

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
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.service.impl.DcaeServiceImpl <em>Dcae Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.service.impl.DcaeServiceImpl
		 * @see org.openecomp.dcae.controller.core.service.impl.ServicePackageImpl#getDcaeService()
		 * @generated
		 */
		EClass DCAE_SERVICE = eINSTANCE.getDcaeService();

		/**
		 * The meta object literal for the '<em><b>Deploy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_SERVICE___DEPLOY__STRING_STRING = eINSTANCE.getDcaeService__Deploy__String_String();

		/**
		 * The meta object literal for the '<em><b>Undeploy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_SERVICE___UNDEPLOY__STRING = eINSTANCE.getDcaeService__Undeploy__String();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_SERVICE___TEST__STRING = eINSTANCE.getDcaeService__Test__String();

		/**
		 * The meta object literal for the '<em><b>Suspend</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_SERVICE___SUSPEND__STRING = eINSTANCE.getDcaeService__Suspend__String();

		/**
		 * The meta object literal for the '<em><b>Resume</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_SERVICE___RESUME__STRING = eINSTANCE.getDcaeService__Resume__String();

		/**
		 * The meta object literal for the '<em><b>Push Manager Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING = eINSTANCE.getDcaeService__PushManagerConfiguration__String();

		/**
		 * The meta object literal for the '<em><b>Poll Manager Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_SERVICE___POLL_MANAGER_CONFIGURATION__STRING = eINSTANCE.getDcaeService__PollManagerConfiguration__String();

		/**
		 * The meta object literal for the '<em><b>Manager Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_SERVICE___MANAGER_CONFIGURATION__STRING = eINSTANCE.getDcaeService__ManagerConfiguration__String();

		/**
		 * The meta object literal for the '<em><b>Manager Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT = eINSTANCE.getDcaeService__ManagerOperation__String_String_JSONObject();

		/**
		 * The meta object literal for the '<em><b>Update Configuration From Policy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING = eINSTANCE.getDcaeService__UpdateConfigurationFromPolicy__String();

		/**
		 * The meta object literal for the '<em><b>Run Health Tests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_SERVICE___RUN_HEALTH_TESTS = eINSTANCE.getDcaeService__RunHealthTests();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.service.impl.DcaeServiceContainerImpl <em>Dcae Service Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.service.impl.DcaeServiceContainerImpl
		 * @see org.openecomp.dcae.controller.core.service.impl.ServicePackageImpl#getDcaeServiceContainer()
		 * @generated
		 */
		EClass DCAE_SERVICE_CONTAINER = eINSTANCE.getDcaeServiceContainer();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_SERVICE_CONTAINER__INSTANCES = eINSTANCE.getDcaeServiceContainer_Instances();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.service.impl.DcaeServiceInstanceImpl <em>Dcae Service Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.service.impl.DcaeServiceInstanceImpl
		 * @see org.openecomp.dcae.controller.core.service.impl.ServicePackageImpl#getDcaeServiceInstance()
		 * @generated
		 */
		EClass DCAE_SERVICE_INSTANCE = eINSTANCE.getDcaeServiceInstance();

		/**
		 * The meta object literal for the '<em><b>Service Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_SERVICE_INSTANCE__SERVICE_CONTAINER = eINSTANCE.getDcaeServiceInstance_ServiceContainer();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_INSTANCE__STATUS = eINSTANCE.getDcaeServiceInstance_Status();

		/**
		 * The meta object literal for the '<em><b>Input Streams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_SERVICE_INSTANCE__INPUT_STREAMS = eINSTANCE.getDcaeServiceInstance_InputStreams();

		/**
		 * The meta object literal for the '<em><b>Output Streams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_SERVICE_INSTANCE__OUTPUT_STREAMS = eINSTANCE.getDcaeServiceInstance_OutputStreams();

		/**
		 * The meta object literal for the '<em><b>Last Health Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_INSTANCE__LAST_HEALTH_TEST = eINSTANCE.getDcaeServiceInstance_LastHealthTest();

		/**
		 * The meta object literal for the '<em><b>Health Test Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_INSTANCE__HEALTH_TEST_STATUS = eINSTANCE.getDcaeServiceInstance_HealthTestStatus();

		/**
		 * The meta object literal for the '<em><b>Health Test Message Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE = eINSTANCE.getDcaeServiceInstance_HealthTestMessageCode();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.service.impl.DcaeLocationImpl <em>Dcae Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.service.impl.DcaeLocationImpl
		 * @see org.openecomp.dcae.controller.core.service.impl.ServicePackageImpl#getDcaeLocation()
		 * @generated
		 */
		EClass DCAE_LOCATION = eINSTANCE.getDcaeLocation();

		/**
		 * The meta object literal for the '<em><b>Location Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_LOCATION__LOCATION_TYPE = eINSTANCE.getDcaeLocation_LocationType();

		/**
		 * The meta object literal for the '<em><b>Openstack Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_LOCATION__OPENSTACK_PROJECT = eINSTANCE.getDcaeLocation_OpenstackProject();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.service.impl.DcaeServiceDescriptorImpl <em>Dcae Service Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.service.impl.DcaeServiceDescriptorImpl
		 * @see org.openecomp.dcae.controller.core.service.impl.ServicePackageImpl#getDcaeServiceDescriptor()
		 * @generated
		 */
		EClass DCAE_SERVICE_DESCRIPTOR = eINSTANCE.getDcaeServiceDescriptor();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_DESCRIPTOR__GROUP_ID = eINSTANCE.getDcaeServiceDescriptor_GroupId();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_DESCRIPTOR__ARTIFACT = eINSTANCE.getDcaeServiceDescriptor_Artifact();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_DESCRIPTOR__VERSION = eINSTANCE.getDcaeServiceDescriptor_Version();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.service.impl.HealthTestResponseImpl <em>Health Test Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.service.impl.HealthTestResponseImpl
		 * @see org.openecomp.dcae.controller.core.service.impl.ServicePackageImpl#getHealthTestResponse()
		 * @generated
		 */
		EClass HEALTH_TEST_RESPONSE = eINSTANCE.getHealthTestResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_TEST_RESPONSE__STATUS = eINSTANCE.getHealthTestResponse_Status();

		/**
		 * The meta object literal for the '<em><b>Message Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_TEST_RESPONSE__MESSAGE_CODE = eINSTANCE.getHealthTestResponse_MessageCode();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.service.impl.DcaePolicyEntityImpl <em>Dcae Policy Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.service.impl.DcaePolicyEntityImpl
		 * @see org.openecomp.dcae.controller.core.service.impl.ServicePackageImpl#getDcaePolicyEntity()
		 * @generated
		 */
		EClass DCAE_POLICY_ENTITY = eINSTANCE.getDcaePolicyEntity();

		/**
		 * The meta object literal for the '<em><b>Policy Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_POLICY_ENTITY__POLICY_NAME = eINSTANCE.getDcaePolicyEntity_PolicyName();

		/**
		 * The meta object literal for the '<em><b>Policy Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_POLICY_ENTITY__POLICY_DESCRIPTION = eINSTANCE.getDcaePolicyEntity_PolicyDescription();

		/**
		 * The meta object literal for the '<em><b>Policy Config Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_POLICY_ENTITY__POLICY_CONFIG_NAME = eINSTANCE.getDcaePolicyEntity_PolicyConfigName();

		/**
		 * The meta object literal for the '<em><b>Policy Template Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_POLICY_ENTITY__POLICY_TEMPLATE_VERSION = eINSTANCE.getDcaePolicyEntity_PolicyTemplateVersion();

		/**
		 * The meta object literal for the '<em><b>Policy Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_POLICY_ENTITY__POLICY_VERSION = eINSTANCE.getDcaePolicyEntity_PolicyVersion();

		/**
		 * The meta object literal for the '<em><b>Policy Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_POLICY_ENTITY__POLICY_PRIORITY = eINSTANCE.getDcaePolicyEntity_PolicyPriority();

		/**
		 * The meta object literal for the '<em><b>Policy Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_POLICY_ENTITY__POLICY_SCOPE = eINSTANCE.getDcaePolicyEntity_PolicyScope();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.service.HealthTestStatus <em>Health Test Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.service.HealthTestStatus
		 * @see org.openecomp.dcae.controller.core.service.impl.ServicePackageImpl#getHealthTestStatus()
		 * @generated
		 */
		EEnum HEALTH_TEST_STATUS = eINSTANCE.getHealthTestStatus();

	}

} //ServicePackage
