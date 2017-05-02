/**
 */
package org.openecomp.dcae.controller.inventory;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.openecomp.ncomp.core.CorePackage;

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
 * @see org.openecomp.dcae.controller.inventory.InventoryFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-core-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller'"
 * @generated
 */
public interface InventoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "inventory";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.dcae.controller.inventory";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "inventory";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InventoryPackage eINSTANCE = org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.inventory.impl.DcaeInventoryImpl <em>Dcae Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.inventory.impl.DcaeInventoryImpl
	 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDcaeInventory()
	 * @generated
	 */
	int DCAE_INVENTORY = 0;

	/**
	 * The feature id for the '<em><b>Service Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_INVENTORY__SERVICE_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_INVENTORY__SERVICES = 1;

	/**
	 * The number of structural features of the '<em>Dcae Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_INVENTORY_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Dcae Service Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_INVENTORY___GET_DCAE_SERVICE_TYPES__STRING_BOOLEAN_BOOLEAN_STRING_STRING_STRING_STRING_STRING_INTEGER = 0;

	/**
	 * The operation id for the '<em>Delete Dcae Service Types Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_INVENTORY___DELETE_DCAE_SERVICE_TYPES_TYPE__STRING = 1;

	/**
	 * The operation id for the '<em>Get Dcae Service Types Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_INVENTORY___GET_DCAE_SERVICE_TYPES_TYPE__STRING = 2;

	/**
	 * The operation id for the '<em>Create Dcae Service Types Type Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_INVENTORY___CREATE_DCAE_SERVICE_TYPES_TYPE_NAME__DCAESERVICETYPEREQUEST = 3;

	/**
	 * The operation id for the '<em>Get Dcae Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_INVENTORY___GET_DCAE_SERVICES__STRING_STRING_STRING_STRING_STRING_BOOLEAN_STRING_INTEGER = 4;

	/**
	 * The operation id for the '<em>Get Dcae Services Groupby Property Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_INVENTORY___GET_DCAE_SERVICES_GROUPBY_PROPERTY_NAME__STRING = 5;

	/**
	 * The operation id for the '<em>Delete Dcae Services Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_INVENTORY___DELETE_DCAE_SERVICES_SERVICE__STRING = 6;

	/**
	 * The operation id for the '<em>Get Dcae Services Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_INVENTORY___GET_DCAE_SERVICES_SERVICE__STRING = 7;

	/**
	 * The operation id for the '<em>Create Dcae Services Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_INVENTORY___CREATE_DCAE_SERVICES_SERVICE__STRING_DCAESERVICEREQUEST = 8;

	/**
	 * The operation id for the '<em>Poll</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_INVENTORY___POLL = 9;

	/**
	 * The number of operations of the '<em>Dcae Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_INVENTORY_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.inventory.impl.ApiResponseMessageImpl <em>Api Response Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.inventory.impl.ApiResponseMessageImpl
	 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getApiResponseMessage()
	 * @generated
	 */
	int API_RESPONSE_MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESPONSE_MESSAGE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESPONSE_MESSAGE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESPONSE_MESSAGE__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Api Response Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESPONSE_MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Api Response Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESPONSE_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentImpl <em>DCAE Service Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentImpl
	 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDCAEServiceComponent()
	 * @generated
	 */
	int DCAE_SERVICE_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT__COMPONENT_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT__COMPONENT_LINK = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Created1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT__CREATED1 = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT__MODIFIED = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT__COMPONENT_TYPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Component Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT__COMPONENT_SOURCE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT__STATUS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT__LOCATION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Shareable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT__SHAREABLE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>DCAE Service Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>DCAE Service Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentRequestImpl <em>DCAE Service Component Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentRequestImpl
	 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDCAEServiceComponentRequest()
	 * @generated
	 */
	int DCAE_SERVICE_COMPONENT_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Component Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Shareable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT_REQUEST__SHAREABLE = 3;

	/**
	 * The number of structural features of the '<em>DCAE Service Component Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT_REQUEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>DCAE Service Component Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_COMPONENT_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceImpl <em>DCAE Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.inventory.impl.DCAEServiceImpl
	 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDCAEService()
	 * @generated
	 */
	int DCAE_SERVICE = 4;

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
	 * The feature id for the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE__SERVICE_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Self Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE__SELF_LINK = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Created1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE__CREATED1 = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE__MODIFIED = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE__TYPE_LINK = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vnf Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE__VNF_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vnf Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE__VNF_LINK = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Vnf Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE__VNF_TYPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Vnf Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE__VNF_LOCATION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Deployment Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE__DEPLOYMENT_REF = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE__COMPONENTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>DCAE Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>DCAE Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceGroupByResultsImpl <em>DCAE Service Group By Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.inventory.impl.DCAEServiceGroupByResultsImpl
	 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDCAEServiceGroupByResults()
	 * @generated
	 */
	int DCAE_SERVICE_GROUP_BY_RESULTS = 5;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_GROUP_BY_RESULTS__PROPERTY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_GROUP_BY_RESULTS__PROPERTY_VALUES = 1;

	/**
	 * The number of structural features of the '<em>DCAE Service Group By Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_GROUP_BY_RESULTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DCAE Service Group By Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_GROUP_BY_RESULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceGroupByResultsPropertyValuesImpl <em>DCAE Service Group By Results Property Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.inventory.impl.DCAEServiceGroupByResultsPropertyValuesImpl
	 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDCAEServiceGroupByResultsPropertyValues()
	 * @generated
	 */
	int DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES = 6;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__COUNT = 0;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__PROPERTY_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Dcae Service Query Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__DCAE_SERVICE_QUERY_LINK = 2;

	/**
	 * The number of structural features of the '<em>DCAE Service Group By Results Property Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>DCAE Service Group By Results Property Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceRequestImpl <em>DCAE Service Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.inventory.impl.DCAEServiceRequestImpl
	 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDCAEServiceRequest()
	 * @generated
	 */
	int DCAE_SERVICE_REQUEST = 7;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_REQUEST__TYPE_ID = 0;

	/**
	 * The feature id for the '<em><b>Vnf Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_REQUEST__VNF_ID = 1;

	/**
	 * The feature id for the '<em><b>Vnf Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_REQUEST__VNF_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Vnf Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_REQUEST__VNF_LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Deployment Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_REQUEST__DEPLOYMENT_REF = 4;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_REQUEST__COMPONENTS = 5;

	/**
	 * The number of structural features of the '<em>DCAE Service Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_REQUEST_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>DCAE Service Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeImpl <em>DCAE Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeImpl
	 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDCAEServiceType()
	 * @generated
	 */
	int DCAE_SERVICE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE__OWNER = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE__TYPE_NAME = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE__TYPE_VERSION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Blueprint Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE__BLUEPRINT_TEMPLATE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE__SERVICE_IDS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vnf Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE__VNF_TYPES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Service Locations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE__SERVICE_LOCATIONS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Asdc Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE__ASDC_SERVICE_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Asdc Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE__ASDC_RESOURCE_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Asdc Service URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE__ASDC_SERVICE_URL = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE__TYPE_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Self Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE__SELF_LINK = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Created1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE__CREATED1 = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE__DEACTIVATED = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>DCAE Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>DCAE Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeRequestImpl <em>DCAE Service Type Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeRequestImpl
	 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDCAEServiceTypeRequest()
	 * @generated
	 */
	int DCAE_SERVICE_TYPE_REQUEST = 9;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_REQUEST__OWNER = 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_REQUEST__TYPE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Type Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_REQUEST__TYPE_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Blueprint Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_REQUEST__BLUEPRINT_TEMPLATE = 3;

	/**
	 * The feature id for the '<em><b>Service Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_REQUEST__SERVICE_IDS = 4;

	/**
	 * The feature id for the '<em><b>Vnf Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_REQUEST__VNF_TYPES = 5;

	/**
	 * The feature id for the '<em><b>Service Locations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_REQUEST__SERVICE_LOCATIONS = 6;

	/**
	 * The feature id for the '<em><b>Asdc Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_REQUEST__ASDC_SERVICE_ID = 7;

	/**
	 * The feature id for the '<em><b>Asdc Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_REQUEST__ASDC_RESOURCE_ID = 8;

	/**
	 * The feature id for the '<em><b>Asdc Service URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_REQUEST__ASDC_SERVICE_URL = 9;

	/**
	 * The number of structural features of the '<em>DCAE Service Type Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_REQUEST_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>DCAE Service Type Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.inventory.impl.DcaeServiceResultsImpl <em>Dcae Service Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.inventory.impl.DcaeServiceResultsImpl
	 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDcaeServiceResults()
	 * @generated
	 */
	int DCAE_SERVICE_RESULTS = 10;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_RESULTS__LINKS = 0;

	/**
	 * The feature id for the '<em><b>Total Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_RESULTS__TOTAL_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_RESULTS__ITEMS = 2;

	/**
	 * The number of structural features of the '<em>Dcae Service Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_RESULTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dcae Service Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_RESULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.inventory.impl.DcaeServiceTypeResultsImpl <em>Dcae Service Type Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.inventory.impl.DcaeServiceTypeResultsImpl
	 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDcaeServiceTypeResults()
	 * @generated
	 */
	int DCAE_SERVICE_TYPE_RESULTS = 11;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_RESULTS__LINKS = 0;

	/**
	 * The feature id for the '<em><b>Total Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_RESULTS__TOTAL_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_RESULTS__ITEMS = 2;

	/**
	 * The number of structural features of the '<em>Dcae Service Type Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_RESULTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dcae Service Type Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_SERVICE_TYPE_RESULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.inventory.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.inventory.impl.LinkImpl
	 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__PARAMS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TITLE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REL = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HREF = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__URI = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uri Builder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__URI_BUILDER = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__RELS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TYPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.inventory.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.inventory.impl.ParameterImpl
	 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.inventory.impl.UriBuilderImpl <em>Uri Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.inventory.impl.UriBuilderImpl
	 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getUriBuilder()
	 * @generated
	 */
	int URI_BUILDER = 14;

	/**
	 * The number of structural features of the '<em>Uri Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_BUILDER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Uri Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_BUILDER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.inventory.DcaeInventory <em>Dcae Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Inventory</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DcaeInventory
	 * @generated
	 */
	EClass getDcaeInventory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.inventory.DcaeInventory#getServiceTypes <em>Service Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Types</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DcaeInventory#getServiceTypes()
	 * @see #getDcaeInventory()
	 * @generated
	 */
	EReference getDcaeInventory_ServiceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.inventory.DcaeInventory#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DcaeInventory#getServices()
	 * @see #getDcaeInventory()
	 * @generated
	 */
	EReference getDcaeInventory_Services();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.inventory.DcaeInventory#getDcaeServiceTypes(java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer) <em>Get Dcae Service Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dcae Service Types</em>' operation.
	 * @see org.openecomp.dcae.controller.inventory.DcaeInventory#getDcaeServiceTypes(java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer)
	 * @generated
	 */
	EOperation getDcaeInventory__GetDcaeServiceTypes__String_Boolean_Boolean_String_String_String_String_String_Integer();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.inventory.DcaeInventory#deleteDcaeServiceTypesType(java.lang.String) <em>Delete Dcae Service Types Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Dcae Service Types Type</em>' operation.
	 * @see org.openecomp.dcae.controller.inventory.DcaeInventory#deleteDcaeServiceTypesType(java.lang.String)
	 * @generated
	 */
	EOperation getDcaeInventory__DeleteDcaeServiceTypesType__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.inventory.DcaeInventory#getDcaeServiceTypesType(java.lang.String) <em>Get Dcae Service Types Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dcae Service Types Type</em>' operation.
	 * @see org.openecomp.dcae.controller.inventory.DcaeInventory#getDcaeServiceTypesType(java.lang.String)
	 * @generated
	 */
	EOperation getDcaeInventory__GetDcaeServiceTypesType__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.inventory.DcaeInventory#createDcaeServiceTypesTypeName(org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest) <em>Create Dcae Service Types Type Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Dcae Service Types Type Name</em>' operation.
	 * @see org.openecomp.dcae.controller.inventory.DcaeInventory#createDcaeServiceTypesTypeName(org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest)
	 * @generated
	 */
	EOperation getDcaeInventory__CreateDcaeServiceTypesTypeName__DCAEServiceTypeRequest();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.inventory.DcaeInventory#getDcaeServices(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Integer) <em>Get Dcae Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dcae Services</em>' operation.
	 * @see org.openecomp.dcae.controller.inventory.DcaeInventory#getDcaeServices(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Integer)
	 * @generated
	 */
	EOperation getDcaeInventory__GetDcaeServices__String_String_String_String_String_Boolean_String_Integer();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.inventory.DcaeInventory#getDcaeServicesGroupbyPropertyName(java.lang.String) <em>Get Dcae Services Groupby Property Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dcae Services Groupby Property Name</em>' operation.
	 * @see org.openecomp.dcae.controller.inventory.DcaeInventory#getDcaeServicesGroupbyPropertyName(java.lang.String)
	 * @generated
	 */
	EOperation getDcaeInventory__GetDcaeServicesGroupbyPropertyName__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.inventory.DcaeInventory#deleteDcaeServicesService(java.lang.String) <em>Delete Dcae Services Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Dcae Services Service</em>' operation.
	 * @see org.openecomp.dcae.controller.inventory.DcaeInventory#deleteDcaeServicesService(java.lang.String)
	 * @generated
	 */
	EOperation getDcaeInventory__DeleteDcaeServicesService__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.inventory.DcaeInventory#getDcaeServicesService(java.lang.String) <em>Get Dcae Services Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dcae Services Service</em>' operation.
	 * @see org.openecomp.dcae.controller.inventory.DcaeInventory#getDcaeServicesService(java.lang.String)
	 * @generated
	 */
	EOperation getDcaeInventory__GetDcaeServicesService__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.inventory.DcaeInventory#createDcaeServicesService(java.lang.String, org.openecomp.dcae.controller.inventory.DCAEServiceRequest) <em>Create Dcae Services Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Dcae Services Service</em>' operation.
	 * @see org.openecomp.dcae.controller.inventory.DcaeInventory#createDcaeServicesService(java.lang.String, org.openecomp.dcae.controller.inventory.DCAEServiceRequest)
	 * @generated
	 */
	EOperation getDcaeInventory__CreateDcaeServicesService__String_DCAEServiceRequest();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.inventory.DcaeInventory#poll() <em>Poll</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Poll</em>' operation.
	 * @see org.openecomp.dcae.controller.inventory.DcaeInventory#poll()
	 * @generated
	 */
	EOperation getDcaeInventory__Poll();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.inventory.ApiResponseMessage <em>Api Response Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Api Response Message</em>'.
	 * @see org.openecomp.dcae.controller.inventory.ApiResponseMessage
	 * @generated
	 */
	EClass getApiResponseMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.ApiResponseMessage#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.openecomp.dcae.controller.inventory.ApiResponseMessage#getCode()
	 * @see #getApiResponseMessage()
	 * @generated
	 */
	EAttribute getApiResponseMessage_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.ApiResponseMessage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openecomp.dcae.controller.inventory.ApiResponseMessage#getType()
	 * @see #getApiResponseMessage()
	 * @generated
	 */
	EAttribute getApiResponseMessage_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.ApiResponseMessage#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.openecomp.dcae.controller.inventory.ApiResponseMessage#getMessage()
	 * @see #getApiResponseMessage()
	 * @generated
	 */
	EAttribute getApiResponseMessage_Message();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent <em>DCAE Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCAE Service Component</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceComponent
	 * @generated
	 */
	EClass getDCAEServiceComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getComponentId()
	 * @see #getDCAEServiceComponent()
	 * @generated
	 */
	EAttribute getDCAEServiceComponent_ComponentId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getComponentLink <em>Component Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Link</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getComponentLink()
	 * @see #getDCAEServiceComponent()
	 * @generated
	 */
	EReference getDCAEServiceComponent_ComponentLink();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getCreated1 <em>Created1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created1</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getCreated1()
	 * @see #getDCAEServiceComponent()
	 * @generated
	 */
	EAttribute getDCAEServiceComponent_Created1();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getModified()
	 * @see #getDCAEServiceComponent()
	 * @generated
	 */
	EAttribute getDCAEServiceComponent_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Type</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getComponentType()
	 * @see #getDCAEServiceComponent()
	 * @generated
	 */
	EAttribute getDCAEServiceComponent_ComponentType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getComponentSource <em>Component Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Source</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getComponentSource()
	 * @see #getDCAEServiceComponent()
	 * @generated
	 */
	EAttribute getDCAEServiceComponent_ComponentSource();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getStatus()
	 * @see #getDCAEServiceComponent()
	 * @generated
	 */
	EAttribute getDCAEServiceComponent_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getLocation()
	 * @see #getDCAEServiceComponent()
	 * @generated
	 */
	EAttribute getDCAEServiceComponent_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getShareable <em>Shareable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shareable</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getShareable()
	 * @see #getDCAEServiceComponent()
	 * @generated
	 */
	EAttribute getDCAEServiceComponent_Shareable();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest <em>DCAE Service Component Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCAE Service Component Request</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest
	 * @generated
	 */
	EClass getDCAEServiceComponentRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest#getComponentId <em>Component Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Id</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest#getComponentId()
	 * @see #getDCAEServiceComponentRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceComponentRequest_ComponentId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Type</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest#getComponentType()
	 * @see #getDCAEServiceComponentRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceComponentRequest_ComponentType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest#getComponentSource <em>Component Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Source</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest#getComponentSource()
	 * @see #getDCAEServiceComponentRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceComponentRequest_ComponentSource();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest#getShareable <em>Shareable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shareable</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest#getShareable()
	 * @see #getDCAEServiceComponentRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceComponentRequest_Shareable();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.inventory.DCAEService <em>DCAE Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCAE Service</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEService
	 * @generated
	 */
	EClass getDCAEService();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEService#getServiceId <em>Service Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Id</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEService#getServiceId()
	 * @see #getDCAEService()
	 * @generated
	 */
	EAttribute getDCAEService_ServiceId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.inventory.DCAEService#getSelfLink <em>Self Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Self Link</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEService#getSelfLink()
	 * @see #getDCAEService()
	 * @generated
	 */
	EReference getDCAEService_SelfLink();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEService#getCreated1 <em>Created1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created1</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEService#getCreated1()
	 * @see #getDCAEService()
	 * @generated
	 */
	EAttribute getDCAEService_Created1();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEService#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEService#getModified()
	 * @see #getDCAEService()
	 * @generated
	 */
	EAttribute getDCAEService_Modified();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.inventory.DCAEService#getTypeLink <em>Type Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Link</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEService#getTypeLink()
	 * @see #getDCAEService()
	 * @generated
	 */
	EReference getDCAEService_TypeLink();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEService#getVnfId <em>Vnf Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vnf Id</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEService#getVnfId()
	 * @see #getDCAEService()
	 * @generated
	 */
	EAttribute getDCAEService_VnfId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.inventory.DCAEService#getVnfLink <em>Vnf Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vnf Link</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEService#getVnfLink()
	 * @see #getDCAEService()
	 * @generated
	 */
	EReference getDCAEService_VnfLink();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEService#getVnfType <em>Vnf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vnf Type</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEService#getVnfType()
	 * @see #getDCAEService()
	 * @generated
	 */
	EAttribute getDCAEService_VnfType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEService#getVnfLocation <em>Vnf Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vnf Location</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEService#getVnfLocation()
	 * @see #getDCAEService()
	 * @generated
	 */
	EAttribute getDCAEService_VnfLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEService#getDeploymentRef <em>Deployment Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment Ref</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEService#getDeploymentRef()
	 * @see #getDCAEService()
	 * @generated
	 */
	EAttribute getDCAEService_DeploymentRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.inventory.DCAEService#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEService#getComponents()
	 * @see #getDCAEService()
	 * @generated
	 */
	EReference getDCAEService_Components();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults <em>DCAE Service Group By Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCAE Service Group By Results</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults
	 * @generated
	 */
	EClass getDCAEServiceGroupByResults();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults#getPropertyName()
	 * @see #getDCAEServiceGroupByResults()
	 * @generated
	 */
	EAttribute getDCAEServiceGroupByResults_PropertyName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults#getPropertyValues <em>Property Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Values</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults#getPropertyValues()
	 * @see #getDCAEServiceGroupByResults()
	 * @generated
	 */
	EReference getDCAEServiceGroupByResults_PropertyValues();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues <em>DCAE Service Group By Results Property Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCAE Service Group By Results Property Values</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues
	 * @generated
	 */
	EClass getDCAEServiceGroupByResultsPropertyValues();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues#getCount()
	 * @see #getDCAEServiceGroupByResultsPropertyValues()
	 * @generated
	 */
	EAttribute getDCAEServiceGroupByResultsPropertyValues_Count();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues#getPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Value</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues#getPropertyValue()
	 * @see #getDCAEServiceGroupByResultsPropertyValues()
	 * @generated
	 */
	EAttribute getDCAEServiceGroupByResultsPropertyValues_PropertyValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues#getDcaeServiceQueryLink <em>Dcae Service Query Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dcae Service Query Link</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues#getDcaeServiceQueryLink()
	 * @see #getDCAEServiceGroupByResultsPropertyValues()
	 * @generated
	 */
	EReference getDCAEServiceGroupByResultsPropertyValues_DcaeServiceQueryLink();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest <em>DCAE Service Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCAE Service Request</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceRequest
	 * @generated
	 */
	EClass getDCAEServiceRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Id</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getTypeId()
	 * @see #getDCAEServiceRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceRequest_TypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getVnfId <em>Vnf Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vnf Id</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getVnfId()
	 * @see #getDCAEServiceRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceRequest_VnfId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getVnfType <em>Vnf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vnf Type</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getVnfType()
	 * @see #getDCAEServiceRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceRequest_VnfType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getVnfLocation <em>Vnf Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vnf Location</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getVnfLocation()
	 * @see #getDCAEServiceRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceRequest_VnfLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getDeploymentRef <em>Deployment Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment Ref</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getDeploymentRef()
	 * @see #getDCAEServiceRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceRequest_DeploymentRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getComponents()
	 * @see #getDCAEServiceRequest()
	 * @generated
	 */
	EReference getDCAEServiceRequest_Components();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.inventory.DCAEServiceType <em>DCAE Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCAE Service Type</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceType
	 * @generated
	 */
	EClass getDCAEServiceType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceType#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceType#getOwner()
	 * @see #getDCAEServiceType()
	 * @generated
	 */
	EAttribute getDCAEServiceType_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceType#getTypeName()
	 * @see #getDCAEServiceType()
	 * @generated
	 */
	EAttribute getDCAEServiceType_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceType#getTypeVersion <em>Type Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Version</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceType#getTypeVersion()
	 * @see #getDCAEServiceType()
	 * @generated
	 */
	EAttribute getDCAEServiceType_TypeVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceType#getBlueprintTemplate <em>Blueprint Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blueprint Template</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceType#getBlueprintTemplate()
	 * @see #getDCAEServiceType()
	 * @generated
	 */
	EAttribute getDCAEServiceType_BlueprintTemplate();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.inventory.DCAEServiceType#getServiceIds <em>Service Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Service Ids</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceType#getServiceIds()
	 * @see #getDCAEServiceType()
	 * @generated
	 */
	EAttribute getDCAEServiceType_ServiceIds();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.inventory.DCAEServiceType#getVnfTypes <em>Vnf Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Vnf Types</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceType#getVnfTypes()
	 * @see #getDCAEServiceType()
	 * @generated
	 */
	EAttribute getDCAEServiceType_VnfTypes();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.inventory.DCAEServiceType#getServiceLocations <em>Service Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Service Locations</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceType#getServiceLocations()
	 * @see #getDCAEServiceType()
	 * @generated
	 */
	EAttribute getDCAEServiceType_ServiceLocations();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceType#getAsdcServiceId <em>Asdc Service Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asdc Service Id</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceType#getAsdcServiceId()
	 * @see #getDCAEServiceType()
	 * @generated
	 */
	EAttribute getDCAEServiceType_AsdcServiceId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceType#getAsdcResourceId <em>Asdc Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asdc Resource Id</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceType#getAsdcResourceId()
	 * @see #getDCAEServiceType()
	 * @generated
	 */
	EAttribute getDCAEServiceType_AsdcResourceId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceType#getAsdcServiceURL <em>Asdc Service URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asdc Service URL</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceType#getAsdcServiceURL()
	 * @see #getDCAEServiceType()
	 * @generated
	 */
	EAttribute getDCAEServiceType_AsdcServiceURL();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceType#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Id</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceType#getTypeId()
	 * @see #getDCAEServiceType()
	 * @generated
	 */
	EAttribute getDCAEServiceType_TypeId();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.inventory.DCAEServiceType#getSelfLink <em>Self Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Self Link</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceType#getSelfLink()
	 * @see #getDCAEServiceType()
	 * @generated
	 */
	EReference getDCAEServiceType_SelfLink();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceType#getCreated1 <em>Created1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created1</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceType#getCreated1()
	 * @see #getDCAEServiceType()
	 * @generated
	 */
	EAttribute getDCAEServiceType_Created1();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceType#getDeactivated <em>Deactivated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deactivated</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceType#getDeactivated()
	 * @see #getDCAEServiceType()
	 * @generated
	 */
	EAttribute getDCAEServiceType_Deactivated();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest <em>DCAE Service Type Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCAE Service Type Request</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest
	 * @generated
	 */
	EClass getDCAEServiceTypeRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getOwner()
	 * @see #getDCAEServiceTypeRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceTypeRequest_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getTypeName()
	 * @see #getDCAEServiceTypeRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceTypeRequest_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getTypeVersion <em>Type Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Version</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getTypeVersion()
	 * @see #getDCAEServiceTypeRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceTypeRequest_TypeVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getBlueprintTemplate <em>Blueprint Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blueprint Template</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getBlueprintTemplate()
	 * @see #getDCAEServiceTypeRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceTypeRequest_BlueprintTemplate();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getServiceIds <em>Service Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Service Ids</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getServiceIds()
	 * @see #getDCAEServiceTypeRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceTypeRequest_ServiceIds();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getVnfTypes <em>Vnf Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Vnf Types</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getVnfTypes()
	 * @see #getDCAEServiceTypeRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceTypeRequest_VnfTypes();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getServiceLocations <em>Service Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Service Locations</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getServiceLocations()
	 * @see #getDCAEServiceTypeRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceTypeRequest_ServiceLocations();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getAsdcServiceId <em>Asdc Service Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asdc Service Id</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getAsdcServiceId()
	 * @see #getDCAEServiceTypeRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceTypeRequest_AsdcServiceId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getAsdcResourceId <em>Asdc Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asdc Resource Id</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getAsdcResourceId()
	 * @see #getDCAEServiceTypeRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceTypeRequest_AsdcResourceId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getAsdcServiceURL <em>Asdc Service URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asdc Service URL</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getAsdcServiceURL()
	 * @see #getDCAEServiceTypeRequest()
	 * @generated
	 */
	EAttribute getDCAEServiceTypeRequest_AsdcServiceURL();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.inventory.DcaeServiceResults <em>Dcae Service Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Service Results</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DcaeServiceResults
	 * @generated
	 */
	EClass getDcaeServiceResults();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.inventory.DcaeServiceResults#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DcaeServiceResults#getLinks()
	 * @see #getDcaeServiceResults()
	 * @generated
	 */
	EReference getDcaeServiceResults_Links();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DcaeServiceResults#getTotalCount <em>Total Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Count</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DcaeServiceResults#getTotalCount()
	 * @see #getDcaeServiceResults()
	 * @generated
	 */
	EAttribute getDcaeServiceResults_TotalCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.inventory.DcaeServiceResults#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DcaeServiceResults#getItems()
	 * @see #getDcaeServiceResults()
	 * @generated
	 */
	EReference getDcaeServiceResults_Items();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults <em>Dcae Service Type Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Service Type Results</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults
	 * @generated
	 */
	EClass getDcaeServiceTypeResults();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults#getLinks()
	 * @see #getDcaeServiceTypeResults()
	 * @generated
	 */
	EReference getDcaeServiceTypeResults_Links();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults#getTotalCount <em>Total Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Count</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults#getTotalCount()
	 * @see #getDcaeServiceTypeResults()
	 * @generated
	 */
	EAttribute getDcaeServiceTypeResults_TotalCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults#getItems()
	 * @see #getDcaeServiceTypeResults()
	 * @generated
	 */
	EReference getDcaeServiceTypeResults_Items();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.inventory.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.openecomp.dcae.controller.inventory.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.inventory.Link#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see org.openecomp.dcae.controller.inventory.Link#getParams()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Params();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.Link#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.openecomp.dcae.controller.inventory.Link#getTitle()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.Link#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see org.openecomp.dcae.controller.inventory.Link#getRel()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Rel();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.Link#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.openecomp.dcae.controller.inventory.Link#getHref()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.Link#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.openecomp.dcae.controller.inventory.Link#getUri()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Uri();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.inventory.Link#getUriBuilder <em>Uri Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uri Builder</em>'.
	 * @see org.openecomp.dcae.controller.inventory.Link#getUriBuilder()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_UriBuilder();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.inventory.Link#getRels <em>Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rels</em>'.
	 * @see org.openecomp.dcae.controller.inventory.Link#getRels()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Rels();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.Link#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openecomp.dcae.controller.inventory.Link#getType()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Type();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.inventory.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.openecomp.dcae.controller.inventory.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.inventory.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.dcae.controller.inventory.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.inventory.UriBuilder <em>Uri Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uri Builder</em>'.
	 * @see org.openecomp.dcae.controller.inventory.UriBuilder
	 * @generated
	 */
	EClass getUriBuilder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InventoryFactory getInventoryFactory();

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
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.inventory.impl.DcaeInventoryImpl <em>Dcae Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.inventory.impl.DcaeInventoryImpl
		 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDcaeInventory()
		 * @generated
		 */
		EClass DCAE_INVENTORY = eINSTANCE.getDcaeInventory();

		/**
		 * The meta object literal for the '<em><b>Service Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_INVENTORY__SERVICE_TYPES = eINSTANCE.getDcaeInventory_ServiceTypes();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_INVENTORY__SERVICES = eINSTANCE.getDcaeInventory_Services();

		/**
		 * The meta object literal for the '<em><b>Get Dcae Service Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_INVENTORY___GET_DCAE_SERVICE_TYPES__STRING_BOOLEAN_BOOLEAN_STRING_STRING_STRING_STRING_STRING_INTEGER = eINSTANCE.getDcaeInventory__GetDcaeServiceTypes__String_Boolean_Boolean_String_String_String_String_String_Integer();

		/**
		 * The meta object literal for the '<em><b>Delete Dcae Service Types Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_INVENTORY___DELETE_DCAE_SERVICE_TYPES_TYPE__STRING = eINSTANCE.getDcaeInventory__DeleteDcaeServiceTypesType__String();

		/**
		 * The meta object literal for the '<em><b>Get Dcae Service Types Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_INVENTORY___GET_DCAE_SERVICE_TYPES_TYPE__STRING = eINSTANCE.getDcaeInventory__GetDcaeServiceTypesType__String();

		/**
		 * The meta object literal for the '<em><b>Create Dcae Service Types Type Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_INVENTORY___CREATE_DCAE_SERVICE_TYPES_TYPE_NAME__DCAESERVICETYPEREQUEST = eINSTANCE.getDcaeInventory__CreateDcaeServiceTypesTypeName__DCAEServiceTypeRequest();

		/**
		 * The meta object literal for the '<em><b>Get Dcae Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_INVENTORY___GET_DCAE_SERVICES__STRING_STRING_STRING_STRING_STRING_BOOLEAN_STRING_INTEGER = eINSTANCE.getDcaeInventory__GetDcaeServices__String_String_String_String_String_Boolean_String_Integer();

		/**
		 * The meta object literal for the '<em><b>Get Dcae Services Groupby Property Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_INVENTORY___GET_DCAE_SERVICES_GROUPBY_PROPERTY_NAME__STRING = eINSTANCE.getDcaeInventory__GetDcaeServicesGroupbyPropertyName__String();

		/**
		 * The meta object literal for the '<em><b>Delete Dcae Services Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_INVENTORY___DELETE_DCAE_SERVICES_SERVICE__STRING = eINSTANCE.getDcaeInventory__DeleteDcaeServicesService__String();

		/**
		 * The meta object literal for the '<em><b>Get Dcae Services Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_INVENTORY___GET_DCAE_SERVICES_SERVICE__STRING = eINSTANCE.getDcaeInventory__GetDcaeServicesService__String();

		/**
		 * The meta object literal for the '<em><b>Create Dcae Services Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_INVENTORY___CREATE_DCAE_SERVICES_SERVICE__STRING_DCAESERVICEREQUEST = eINSTANCE.getDcaeInventory__CreateDcaeServicesService__String_DCAEServiceRequest();

		/**
		 * The meta object literal for the '<em><b>Poll</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_INVENTORY___POLL = eINSTANCE.getDcaeInventory__Poll();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.inventory.impl.ApiResponseMessageImpl <em>Api Response Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.inventory.impl.ApiResponseMessageImpl
		 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getApiResponseMessage()
		 * @generated
		 */
		EClass API_RESPONSE_MESSAGE = eINSTANCE.getApiResponseMessage();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_RESPONSE_MESSAGE__CODE = eINSTANCE.getApiResponseMessage_Code();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_RESPONSE_MESSAGE__TYPE = eINSTANCE.getApiResponseMessage_Type();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_RESPONSE_MESSAGE__MESSAGE = eINSTANCE.getApiResponseMessage_Message();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentImpl <em>DCAE Service Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentImpl
		 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDCAEServiceComponent()
		 * @generated
		 */
		EClass DCAE_SERVICE_COMPONENT = eINSTANCE.getDCAEServiceComponent();

		/**
		 * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_COMPONENT__COMPONENT_ID = eINSTANCE.getDCAEServiceComponent_ComponentId();

		/**
		 * The meta object literal for the '<em><b>Component Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_SERVICE_COMPONENT__COMPONENT_LINK = eINSTANCE.getDCAEServiceComponent_ComponentLink();

		/**
		 * The meta object literal for the '<em><b>Created1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_COMPONENT__CREATED1 = eINSTANCE.getDCAEServiceComponent_Created1();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_COMPONENT__MODIFIED = eINSTANCE.getDCAEServiceComponent_Modified();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_COMPONENT__COMPONENT_TYPE = eINSTANCE.getDCAEServiceComponent_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Component Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_COMPONENT__COMPONENT_SOURCE = eINSTANCE.getDCAEServiceComponent_ComponentSource();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_COMPONENT__STATUS = eINSTANCE.getDCAEServiceComponent_Status();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_COMPONENT__LOCATION = eINSTANCE.getDCAEServiceComponent_Location();

		/**
		 * The meta object literal for the '<em><b>Shareable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_COMPONENT__SHAREABLE = eINSTANCE.getDCAEServiceComponent_Shareable();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentRequestImpl <em>DCAE Service Component Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentRequestImpl
		 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDCAEServiceComponentRequest()
		 * @generated
		 */
		EClass DCAE_SERVICE_COMPONENT_REQUEST = eINSTANCE.getDCAEServiceComponentRequest();

		/**
		 * The meta object literal for the '<em><b>Component Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_ID = eINSTANCE.getDCAEServiceComponentRequest_ComponentId();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_TYPE = eINSTANCE.getDCAEServiceComponentRequest_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Component Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_SOURCE = eINSTANCE.getDCAEServiceComponentRequest_ComponentSource();

		/**
		 * The meta object literal for the '<em><b>Shareable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_COMPONENT_REQUEST__SHAREABLE = eINSTANCE.getDCAEServiceComponentRequest_Shareable();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceImpl <em>DCAE Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.inventory.impl.DCAEServiceImpl
		 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDCAEService()
		 * @generated
		 */
		EClass DCAE_SERVICE = eINSTANCE.getDCAEService();

		/**
		 * The meta object literal for the '<em><b>Service Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE__SERVICE_ID = eINSTANCE.getDCAEService_ServiceId();

		/**
		 * The meta object literal for the '<em><b>Self Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_SERVICE__SELF_LINK = eINSTANCE.getDCAEService_SelfLink();

		/**
		 * The meta object literal for the '<em><b>Created1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE__CREATED1 = eINSTANCE.getDCAEService_Created1();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE__MODIFIED = eINSTANCE.getDCAEService_Modified();

		/**
		 * The meta object literal for the '<em><b>Type Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_SERVICE__TYPE_LINK = eINSTANCE.getDCAEService_TypeLink();

		/**
		 * The meta object literal for the '<em><b>Vnf Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE__VNF_ID = eINSTANCE.getDCAEService_VnfId();

		/**
		 * The meta object literal for the '<em><b>Vnf Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_SERVICE__VNF_LINK = eINSTANCE.getDCAEService_VnfLink();

		/**
		 * The meta object literal for the '<em><b>Vnf Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE__VNF_TYPE = eINSTANCE.getDCAEService_VnfType();

		/**
		 * The meta object literal for the '<em><b>Vnf Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE__VNF_LOCATION = eINSTANCE.getDCAEService_VnfLocation();

		/**
		 * The meta object literal for the '<em><b>Deployment Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE__DEPLOYMENT_REF = eINSTANCE.getDCAEService_DeploymentRef();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_SERVICE__COMPONENTS = eINSTANCE.getDCAEService_Components();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceGroupByResultsImpl <em>DCAE Service Group By Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.inventory.impl.DCAEServiceGroupByResultsImpl
		 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDCAEServiceGroupByResults()
		 * @generated
		 */
		EClass DCAE_SERVICE_GROUP_BY_RESULTS = eINSTANCE.getDCAEServiceGroupByResults();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_GROUP_BY_RESULTS__PROPERTY_NAME = eINSTANCE.getDCAEServiceGroupByResults_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Property Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_SERVICE_GROUP_BY_RESULTS__PROPERTY_VALUES = eINSTANCE.getDCAEServiceGroupByResults_PropertyValues();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceGroupByResultsPropertyValuesImpl <em>DCAE Service Group By Results Property Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.inventory.impl.DCAEServiceGroupByResultsPropertyValuesImpl
		 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDCAEServiceGroupByResultsPropertyValues()
		 * @generated
		 */
		EClass DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES = eINSTANCE.getDCAEServiceGroupByResultsPropertyValues();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__COUNT = eINSTANCE.getDCAEServiceGroupByResultsPropertyValues_Count();

		/**
		 * The meta object literal for the '<em><b>Property Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__PROPERTY_VALUE = eINSTANCE.getDCAEServiceGroupByResultsPropertyValues_PropertyValue();

		/**
		 * The meta object literal for the '<em><b>Dcae Service Query Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__DCAE_SERVICE_QUERY_LINK = eINSTANCE.getDCAEServiceGroupByResultsPropertyValues_DcaeServiceQueryLink();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceRequestImpl <em>DCAE Service Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.inventory.impl.DCAEServiceRequestImpl
		 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDCAEServiceRequest()
		 * @generated
		 */
		EClass DCAE_SERVICE_REQUEST = eINSTANCE.getDCAEServiceRequest();

		/**
		 * The meta object literal for the '<em><b>Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_REQUEST__TYPE_ID = eINSTANCE.getDCAEServiceRequest_TypeId();

		/**
		 * The meta object literal for the '<em><b>Vnf Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_REQUEST__VNF_ID = eINSTANCE.getDCAEServiceRequest_VnfId();

		/**
		 * The meta object literal for the '<em><b>Vnf Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_REQUEST__VNF_TYPE = eINSTANCE.getDCAEServiceRequest_VnfType();

		/**
		 * The meta object literal for the '<em><b>Vnf Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_REQUEST__VNF_LOCATION = eINSTANCE.getDCAEServiceRequest_VnfLocation();

		/**
		 * The meta object literal for the '<em><b>Deployment Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_REQUEST__DEPLOYMENT_REF = eINSTANCE.getDCAEServiceRequest_DeploymentRef();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_SERVICE_REQUEST__COMPONENTS = eINSTANCE.getDCAEServiceRequest_Components();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeImpl <em>DCAE Service Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeImpl
		 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDCAEServiceType()
		 * @generated
		 */
		EClass DCAE_SERVICE_TYPE = eINSTANCE.getDCAEServiceType();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE__OWNER = eINSTANCE.getDCAEServiceType_Owner();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE__TYPE_NAME = eINSTANCE.getDCAEServiceType_TypeName();

		/**
		 * The meta object literal for the '<em><b>Type Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE__TYPE_VERSION = eINSTANCE.getDCAEServiceType_TypeVersion();

		/**
		 * The meta object literal for the '<em><b>Blueprint Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE__BLUEPRINT_TEMPLATE = eINSTANCE.getDCAEServiceType_BlueprintTemplate();

		/**
		 * The meta object literal for the '<em><b>Service Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE__SERVICE_IDS = eINSTANCE.getDCAEServiceType_ServiceIds();

		/**
		 * The meta object literal for the '<em><b>Vnf Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE__VNF_TYPES = eINSTANCE.getDCAEServiceType_VnfTypes();

		/**
		 * The meta object literal for the '<em><b>Service Locations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE__SERVICE_LOCATIONS = eINSTANCE.getDCAEServiceType_ServiceLocations();

		/**
		 * The meta object literal for the '<em><b>Asdc Service Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE__ASDC_SERVICE_ID = eINSTANCE.getDCAEServiceType_AsdcServiceId();

		/**
		 * The meta object literal for the '<em><b>Asdc Resource Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE__ASDC_RESOURCE_ID = eINSTANCE.getDCAEServiceType_AsdcResourceId();

		/**
		 * The meta object literal for the '<em><b>Asdc Service URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE__ASDC_SERVICE_URL = eINSTANCE.getDCAEServiceType_AsdcServiceURL();

		/**
		 * The meta object literal for the '<em><b>Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE__TYPE_ID = eINSTANCE.getDCAEServiceType_TypeId();

		/**
		 * The meta object literal for the '<em><b>Self Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_SERVICE_TYPE__SELF_LINK = eINSTANCE.getDCAEServiceType_SelfLink();

		/**
		 * The meta object literal for the '<em><b>Created1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE__CREATED1 = eINSTANCE.getDCAEServiceType_Created1();

		/**
		 * The meta object literal for the '<em><b>Deactivated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE__DEACTIVATED = eINSTANCE.getDCAEServiceType_Deactivated();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeRequestImpl <em>DCAE Service Type Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeRequestImpl
		 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDCAEServiceTypeRequest()
		 * @generated
		 */
		EClass DCAE_SERVICE_TYPE_REQUEST = eINSTANCE.getDCAEServiceTypeRequest();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE_REQUEST__OWNER = eINSTANCE.getDCAEServiceTypeRequest_Owner();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE_REQUEST__TYPE_NAME = eINSTANCE.getDCAEServiceTypeRequest_TypeName();

		/**
		 * The meta object literal for the '<em><b>Type Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE_REQUEST__TYPE_VERSION = eINSTANCE.getDCAEServiceTypeRequest_TypeVersion();

		/**
		 * The meta object literal for the '<em><b>Blueprint Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE_REQUEST__BLUEPRINT_TEMPLATE = eINSTANCE.getDCAEServiceTypeRequest_BlueprintTemplate();

		/**
		 * The meta object literal for the '<em><b>Service Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE_REQUEST__SERVICE_IDS = eINSTANCE.getDCAEServiceTypeRequest_ServiceIds();

		/**
		 * The meta object literal for the '<em><b>Vnf Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE_REQUEST__VNF_TYPES = eINSTANCE.getDCAEServiceTypeRequest_VnfTypes();

		/**
		 * The meta object literal for the '<em><b>Service Locations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE_REQUEST__SERVICE_LOCATIONS = eINSTANCE.getDCAEServiceTypeRequest_ServiceLocations();

		/**
		 * The meta object literal for the '<em><b>Asdc Service Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE_REQUEST__ASDC_SERVICE_ID = eINSTANCE.getDCAEServiceTypeRequest_AsdcServiceId();

		/**
		 * The meta object literal for the '<em><b>Asdc Resource Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE_REQUEST__ASDC_RESOURCE_ID = eINSTANCE.getDCAEServiceTypeRequest_AsdcResourceId();

		/**
		 * The meta object literal for the '<em><b>Asdc Service URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE_REQUEST__ASDC_SERVICE_URL = eINSTANCE.getDCAEServiceTypeRequest_AsdcServiceURL();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.inventory.impl.DcaeServiceResultsImpl <em>Dcae Service Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.inventory.impl.DcaeServiceResultsImpl
		 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDcaeServiceResults()
		 * @generated
		 */
		EClass DCAE_SERVICE_RESULTS = eINSTANCE.getDcaeServiceResults();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_SERVICE_RESULTS__LINKS = eINSTANCE.getDcaeServiceResults_Links();

		/**
		 * The meta object literal for the '<em><b>Total Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_RESULTS__TOTAL_COUNT = eINSTANCE.getDcaeServiceResults_TotalCount();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_SERVICE_RESULTS__ITEMS = eINSTANCE.getDcaeServiceResults_Items();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.inventory.impl.DcaeServiceTypeResultsImpl <em>Dcae Service Type Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.inventory.impl.DcaeServiceTypeResultsImpl
		 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getDcaeServiceTypeResults()
		 * @generated
		 */
		EClass DCAE_SERVICE_TYPE_RESULTS = eINSTANCE.getDcaeServiceTypeResults();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_SERVICE_TYPE_RESULTS__LINKS = eINSTANCE.getDcaeServiceTypeResults_Links();

		/**
		 * The meta object literal for the '<em><b>Total Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_SERVICE_TYPE_RESULTS__TOTAL_COUNT = eINSTANCE.getDcaeServiceTypeResults_TotalCount();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_SERVICE_TYPE_RESULTS__ITEMS = eINSTANCE.getDcaeServiceTypeResults_Items();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.inventory.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.inventory.impl.LinkImpl
		 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__PARAMS = eINSTANCE.getLink_Params();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TITLE = eINSTANCE.getLink_Title();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__REL = eINSTANCE.getLink_Rel();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__HREF = eINSTANCE.getLink_Href();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__URI = eINSTANCE.getLink_Uri();

		/**
		 * The meta object literal for the '<em><b>Uri Builder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__URI_BUILDER = eINSTANCE.getLink_UriBuilder();

		/**
		 * The meta object literal for the '<em><b>Rels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__RELS = eINSTANCE.getLink_Rels();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TYPE = eINSTANCE.getLink_Type();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.inventory.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.inventory.impl.ParameterImpl
		 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.inventory.impl.UriBuilderImpl <em>Uri Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.inventory.impl.UriBuilderImpl
		 * @see org.openecomp.dcae.controller.inventory.impl.InventoryPackageImpl#getUriBuilder()
		 * @generated
		 */
		EClass URI_BUILDER = eINSTANCE.getUriBuilder();

	}

} //InventoryPackage
