
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
package org.openecomp.dcae.controller.core.stream;

import org.openecomp.ncomp.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.openecomp.dcae.controller.core.stream.StreamFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-core-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.core'"
 * @generated
 */
public interface StreamPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stream";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.dcae.controller.core.stream";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "stream";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StreamPackage eINSTANCE = org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamImpl <em>Dcae Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStream()
	 * @generated
	 */
	int DCAE_STREAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The number of structural features of the '<em>Dcae Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dcae Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DmaapStreamImpl <em>Dmaap Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DmaapStreamImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDmaapStream()
	 * @generated
	 */
	int DMAAP_STREAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMAAP_STREAM__NAME = DCAE_STREAM__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMAAP_STREAM__LAST_POLLED = DCAE_STREAM__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMAAP_STREAM__LAST_CHANGED = DCAE_STREAM__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMAAP_STREAM__CREATED = DCAE_STREAM__CREATED;

	/**
	 * The feature id for the '<em><b>Dmaap Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMAAP_STREAM__DMAAP_DATA_TYPE = DCAE_STREAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dmaap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMAAP_STREAM__DMAAP_ACTION = DCAE_STREAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dmaap Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMAAP_STREAM__DMAAP_URL = DCAE_STREAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dmaap User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMAAP_STREAM__DMAAP_USER_NAME = DCAE_STREAM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dmaap Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMAAP_STREAM__DMAAP_PASSWORD = DCAE_STREAM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dmaap Auth Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMAAP_STREAM__DMAAP_AUTH_METHOD = DCAE_STREAM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dmaap Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMAAP_STREAM_FEATURE_COUNT = DCAE_STREAM_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Dmaap Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMAAP_STREAM_OPERATION_COUNT = DCAE_STREAM_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamDefinitionImpl <em>Dcae Stream Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamDefinitionImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStreamDefinition()
	 * @generated
	 */
	int DCAE_STREAM_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_DEFINITION__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_DEFINITION__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_DEFINITION__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_DEFINITION__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Stream Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_DEFINITION__STREAM_TYPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Databus Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_DEFINITION__DATABUS_TYPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Publishers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_DEFINITION__PUBLISHERS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subscribers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_DEFINITION__SUBSCRIBERS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dcae Stream Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_DEFINITION_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Dcae Stream Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_DEFINITION_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamPublisherImpl <em>Dcae Stream Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamPublisherImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStreamPublisher()
	 * @generated
	 */
	int DCAE_STREAM_PUBLISHER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The number of structural features of the '<em>Dcae Stream Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dcae Stream Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamSubscriberImpl <em>Dcae Stream Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamSubscriberImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStreamSubscriber()
	 * @generated
	 */
	int DCAE_STREAM_SUBSCRIBER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The number of structural features of the '<em>Dcae Stream Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dcae Stream Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamPublisherExternalImpl <em>Dcae Stream Publisher External</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamPublisherExternalImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStreamPublisherExternal()
	 * @generated
	 */
	int DCAE_STREAM_PUBLISHER_EXTERNAL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_EXTERNAL__NAME = DCAE_STREAM_PUBLISHER__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_EXTERNAL__LAST_POLLED = DCAE_STREAM_PUBLISHER__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_EXTERNAL__LAST_CHANGED = DCAE_STREAM_PUBLISHER__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_EXTERNAL__CREATED = DCAE_STREAM_PUBLISHER__CREATED;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_EXTERNAL__USER = DCAE_STREAM_PUBLISHER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_EXTERNAL__PASSWORD = DCAE_STREAM_PUBLISHER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_EXTERNAL__URL = DCAE_STREAM_PUBLISHER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dcae Stream Publisher External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_EXTERNAL_FEATURE_COUNT = DCAE_STREAM_PUBLISHER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dcae Stream Publisher External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_EXTERNAL_OPERATION_COUNT = DCAE_STREAM_PUBLISHER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamPublisherInternalImpl <em>Dcae Stream Publisher Internal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamPublisherInternalImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStreamPublisherInternal()
	 * @generated
	 */
	int DCAE_STREAM_PUBLISHER_INTERNAL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_INTERNAL__NAME = DCAE_STREAM_PUBLISHER__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_INTERNAL__LAST_POLLED = DCAE_STREAM_PUBLISHER__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_INTERNAL__LAST_CHANGED = DCAE_STREAM_PUBLISHER__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_INTERNAL__CREATED = DCAE_STREAM_PUBLISHER__CREATED;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_INTERNAL__LOCAL_NAME = DCAE_STREAM_PUBLISHER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_INTERNAL__SERVICE_NAME = DCAE_STREAM_PUBLISHER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dcae Stream Publisher Internal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_INTERNAL_FEATURE_COUNT = DCAE_STREAM_PUBLISHER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dcae Stream Publisher Internal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_PUBLISHER_INTERNAL_OPERATION_COUNT = DCAE_STREAM_PUBLISHER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamSubscriberExternalImpl <em>Dcae Stream Subscriber External</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamSubscriberExternalImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStreamSubscriberExternal()
	 * @generated
	 */
	int DCAE_STREAM_SUBSCRIBER_EXTERNAL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_EXTERNAL__NAME = DCAE_STREAM_SUBSCRIBER__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_EXTERNAL__LAST_POLLED = DCAE_STREAM_SUBSCRIBER__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_EXTERNAL__LAST_CHANGED = DCAE_STREAM_SUBSCRIBER__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_EXTERNAL__CREATED = DCAE_STREAM_SUBSCRIBER__CREATED;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_EXTERNAL__USER = DCAE_STREAM_SUBSCRIBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_EXTERNAL__PASSWORD = DCAE_STREAM_SUBSCRIBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_EXTERNAL__URL = DCAE_STREAM_SUBSCRIBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dcae Stream Subscriber External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_EXTERNAL_FEATURE_COUNT = DCAE_STREAM_SUBSCRIBER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dcae Stream Subscriber External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_EXTERNAL_OPERATION_COUNT = DCAE_STREAM_SUBSCRIBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamSubscriberInternalImpl <em>Dcae Stream Subscriber Internal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamSubscriberInternalImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStreamSubscriberInternal()
	 * @generated
	 */
	int DCAE_STREAM_SUBSCRIBER_INTERNAL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_INTERNAL__NAME = DCAE_STREAM_SUBSCRIBER__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_INTERNAL__LAST_POLLED = DCAE_STREAM_SUBSCRIBER__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_INTERNAL__LAST_CHANGED = DCAE_STREAM_SUBSCRIBER__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_INTERNAL__CREATED = DCAE_STREAM_SUBSCRIBER__CREATED;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_INTERNAL__LOCAL_NAME = DCAE_STREAM_SUBSCRIBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_INTERNAL__SERVICE_NAME = DCAE_STREAM_SUBSCRIBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dcae Stream Subscriber Internal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_INTERNAL_FEATURE_COUNT = DCAE_STREAM_SUBSCRIBER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dcae Stream Subscriber Internal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_SUBSCRIBER_INTERNAL_OPERATION_COUNT = DCAE_STREAM_SUBSCRIBER_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamInternalEndPointImpl <em>Dcae Stream Internal End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamInternalEndPointImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStreamInternalEndPoint()
	 * @generated
	 */
	int DCAE_STREAM_INTERNAL_END_POINT = 9;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_INTERNAL_END_POINT__LOCAL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_INTERNAL_END_POINT__SERVICE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Dcae Stream Internal End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_INTERNAL_END_POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dcae Stream Internal End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_INTERNAL_END_POINT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamExternalEndPointImpl <em>Dcae Stream External End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamExternalEndPointImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStreamExternalEndPoint()
	 * @generated
	 */
	int DCAE_STREAM_EXTERNAL_END_POINT = 10;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_EXTERNAL_END_POINT__USER = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_EXTERNAL_END_POINT__PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_EXTERNAL_END_POINT__URL = 2;

	/**
	 * The number of structural features of the '<em>Dcae Stream External End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_EXTERNAL_END_POINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dcae Stream External End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_STREAM_EXTERNAL_END_POINT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamImpl <em>Databus Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusStreamImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusStream()
	 * @generated
	 */
	int DATABUS_STREAM = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The number of structural features of the '<em>Databus Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Databus Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicImpl <em>Databus Stream Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusStreamTopic()
	 * @generated
	 */
	int DATABUS_STREAM_TOPIC = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC__NAME = DATABUS_STREAM__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC__LAST_POLLED = DATABUS_STREAM__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC__LAST_CHANGED = DATABUS_STREAM__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC__CREATED = DATABUS_STREAM__CREATED;

	/**
	 * The feature id for the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC__TOPIC_NAME = DATABUS_STREAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Topic Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC__TOPIC_DESCRIPTION = DATABUS_STREAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dcae Location Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC__DCAE_LOCATION_NAME = DATABUS_STREAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC__OWNER = DATABUS_STREAM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Txenabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC__TXENABLED = DATABUS_STREAM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fqtn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC__FQTN = DATABUS_STREAM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Last Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC__LAST_MOD = DATABUS_STREAM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC__STATUS = DATABUS_STREAM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC__CLIENTS = DATABUS_STREAM_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Publish URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC__PUBLISH_URL = DATABUS_STREAM_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Subscribe URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC__SUBSCRIBE_URL = DATABUS_STREAM_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Authentication Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC__AUTHENTICATION_METHOD = DATABUS_STREAM_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Databus Stream Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC_FEATURE_COUNT = DATABUS_STREAM_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Databus Stream Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC_OPERATION_COUNT = DATABUS_STREAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicClientImpl <em>Databus Stream Topic Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicClientImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusStreamTopicClient()
	 * @generated
	 */
	int DATABUS_STREAM_TOPIC_CLIENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC_CLIENT__NAME = DATABUS_STREAM__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC_CLIENT__LAST_POLLED = DATABUS_STREAM__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC_CLIENT__LAST_CHANGED = DATABUS_STREAM__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC_CLIENT__CREATED = DATABUS_STREAM__CREATED;

	/**
	 * The feature id for the '<em><b>Local Stream Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC_CLIENT__LOCAL_STREAM_ID = DATABUS_STREAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dcae Location Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC_CLIENT__DCAE_LOCATION_NAME = DATABUS_STREAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Client Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC_CLIENT__CLIENT_ROLE = DATABUS_STREAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC_CLIENT__ACTION = DATABUS_STREAM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC_CLIENT__USERNAME = DATABUS_STREAM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Userpwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC_CLIENT__USERPWD = DATABUS_STREAM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fqtn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC_CLIENT__FQTN = DATABUS_STREAM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mr Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC_CLIENT__MR_CLIENT_ID = DATABUS_STREAM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Topic URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC_CLIENT__TOPIC_URL = DATABUS_STREAM_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Databus Stream Topic Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC_CLIENT_FEATURE_COUNT = DATABUS_STREAM_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Databus Stream Topic Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_TOPIC_CLIENT_OPERATION_COUNT = DATABUS_STREAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedImpl <em>Databus Stream Feed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusStreamFeed()
	 * @generated
	 */
	int DATABUS_STREAM_FEED = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED__NAME = DATABUS_STREAM__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED__LAST_POLLED = DATABUS_STREAM__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED__LAST_CHANGED = DATABUS_STREAM__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED__CREATED = DATABUS_STREAM__CREATED;

	/**
	 * The feature id for the '<em><b>Feed Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED__FEED_NAME = DATABUS_STREAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feed Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED__FEED_VERSION = DATABUS_STREAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feed Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED__FEED_DESCRIPTION = DATABUS_STREAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aspr Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED__ASPR_CLASSIFICATION = DATABUS_STREAM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED__OWNER = DATABUS_STREAM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Feed Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED__FEED_ID = DATABUS_STREAM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Log URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED__LOG_URL = DATABUS_STREAM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Publish URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED__PUBLISH_URL = DATABUS_STREAM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Subscribe URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED__SUBSCRIBE_URL = DATABUS_STREAM_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED__STATUS = DATABUS_STREAM_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED__SUSPENDED = DATABUS_STREAM_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Publishers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED__PUBLISHERS = DATABUS_STREAM_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Subscribers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED__SUBSCRIBERS = DATABUS_STREAM_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Databus Stream Feed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_FEATURE_COUNT = DATABUS_STREAM_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Databus Stream Feed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_OPERATION_COUNT = DATABUS_STREAM_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedPublisherImpl <em>Databus Stream Feed Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedPublisherImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusStreamFeedPublisher()
	 * @generated
	 */
	int DATABUS_STREAM_FEED_PUBLISHER = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_PUBLISHER__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_PUBLISHER__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_PUBLISHER__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_PUBLISHER__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Local Stream Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_PUBLISHER__LOCAL_STREAM_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dcae Location Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_PUBLISHER__DCAE_LOCATION_NAME = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feed Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_PUBLISHER__FEED_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pub Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_PUBLISHER__PUB_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_PUBLISHER__STATUS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_PUBLISHER__USERNAME = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Userpwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_PUBLISHER__USERPWD = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Databus Stream Feed Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_PUBLISHER_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Databus Stream Feed Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_PUBLISHER_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedSubscriberImpl <em>Databus Stream Feed Subscriber</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedSubscriberImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusStreamFeedSubscriber()
	 * @generated
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Local Stream Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER__LOCAL_STREAM_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dcae Location Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER__DCAE_LOCATION_NAME = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Other Feed Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER__OTHER_FEED_NAME = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Feed Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER__FEED_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Log URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER__LOG_URL = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER__OWNER = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sub Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER__SUB_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER__SUSPENDED = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Use100</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER__USE100 = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER__USERNAME = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Userpwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER__USERPWD = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Delivery URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER__DELIVERY_URL = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Databus Stream Feed Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Databus Stream Feed Subscriber</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_STREAM_FEED_SUBSCRIBER_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusEntityImpl <em>Databus Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusEntityImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusEntity()
	 * @generated
	 */
	int DATABUS_ENTITY = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_ENTITY__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_ENTITY__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_ENTITY__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_ENTITY__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_ENTITY__STATUS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_ENTITY__LAST_MODIFIED = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_ENTITY__TYPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Databus Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_ENTITY_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Databus Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_ENTITY_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusLocationImpl <em>Databus Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusLocationImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusLocation()
	 * @generated
	 */
	int DATABUS_LOCATION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_LOCATION__NAME = DATABUS_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_LOCATION__LAST_POLLED = DATABUS_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_LOCATION__LAST_CHANGED = DATABUS_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_LOCATION__CREATED = DATABUS_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_LOCATION__STATUS = DATABUS_ENTITY__STATUS;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_LOCATION__LAST_MODIFIED = DATABUS_ENTITY__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_LOCATION__TYPE = DATABUS_ENTITY__TYPE;

	/**
	 * The feature id for the '<em><b>Dcae Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_LOCATION__DCAE_LAYER = DATABUS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Databus Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_LOCATION_FEATURE_COUNT = DATABUS_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Databus Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_LOCATION_OPERATION_COUNT = DATABUS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusMessageRouterClusterImpl <em>Databus Message Router Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusMessageRouterClusterImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusMessageRouterCluster()
	 * @generated
	 */
	int DATABUS_MESSAGE_ROUTER_CLUSTER = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_MESSAGE_ROUTER_CLUSTER__NAME = DATABUS_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_MESSAGE_ROUTER_CLUSTER__LAST_POLLED = DATABUS_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_MESSAGE_ROUTER_CLUSTER__LAST_CHANGED = DATABUS_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_MESSAGE_ROUTER_CLUSTER__CREATED = DATABUS_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_MESSAGE_ROUTER_CLUSTER__STATUS = DATABUS_ENTITY__STATUS;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_MESSAGE_ROUTER_CLUSTER__LAST_MODIFIED = DATABUS_ENTITY__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_MESSAGE_ROUTER_CLUSTER__TYPE = DATABUS_ENTITY__TYPE;

	/**
	 * The feature id for the '<em><b>Dcae Location Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_MESSAGE_ROUTER_CLUSTER__DCAE_LOCATION_NAME = DATABUS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Fqdn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_MESSAGE_ROUTER_CLUSTER__SERVICE_FQDN = DATABUS_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host Fqdn</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_MESSAGE_ROUTER_CLUSTER__HOST_FQDN = DATABUS_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Topic Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_MESSAGE_ROUTER_CLUSTER__TOPIC_PORT = DATABUS_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Topic Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_MESSAGE_ROUTER_CLUSTER__TOPIC_PROTOCOL = DATABUS_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Databus Message Router Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_MESSAGE_ROUTER_CLUSTER_FEATURE_COUNT = DATABUS_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Databus Message Router Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_MESSAGE_ROUTER_CLUSTER_OPERATION_COUNT = DATABUS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusDataRouterNodeImpl <em>Databus Data Router Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusDataRouterNodeImpl
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusDataRouterNode()
	 * @generated
	 */
	int DATABUS_DATA_ROUTER_NODE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_DATA_ROUTER_NODE__NAME = DATABUS_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_DATA_ROUTER_NODE__LAST_POLLED = DATABUS_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_DATA_ROUTER_NODE__LAST_CHANGED = DATABUS_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_DATA_ROUTER_NODE__CREATED = DATABUS_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_DATA_ROUTER_NODE__STATUS = DATABUS_ENTITY__STATUS;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_DATA_ROUTER_NODE__LAST_MODIFIED = DATABUS_ENTITY__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_DATA_ROUTER_NODE__TYPE = DATABUS_ENTITY__TYPE;

	/**
	 * The feature id for the '<em><b>Dcae Location Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_DATA_ROUTER_NODE__DCAE_LOCATION_NAME = DATABUS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host Fqdn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_DATA_ROUTER_NODE__HOST_FQDN = DATABUS_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_DATA_ROUTER_NODE__VERSION = DATABUS_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Databus Data Router Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_DATA_ROUTER_NODE_FEATURE_COUNT = DATABUS_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Databus Data Router Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABUS_DATA_ROUTER_NODE_OPERATION_COUNT = DATABUS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicAction <em>Databus Stream Topic Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopicAction
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusStreamTopicAction()
	 * @generated
	 */
	int DATABUS_STREAM_TOPIC_ACTION = 21;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.stream.StreamAuthentication <em>Authentication</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.stream.StreamAuthentication
	 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getStreamAuthentication()
	 * @generated
	 */
	int STREAM_AUTHENTICATION = 22;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DcaeStream <em>Dcae Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Stream</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStream
	 * @generated
	 */
	EClass getDcaeStream();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DmaapStream <em>Dmaap Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dmaap Stream</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DmaapStream
	 * @generated
	 */
	EClass getDmaapStream();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapDataType <em>Dmaap Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dmaap Data Type</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapDataType()
	 * @see #getDmaapStream()
	 * @generated
	 */
	EAttribute getDmaapStream_DmaapDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapAction <em>Dmaap Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dmaap Action</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapAction()
	 * @see #getDmaapStream()
	 * @generated
	 */
	EAttribute getDmaapStream_DmaapAction();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapUrl <em>Dmaap Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dmaap Url</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapUrl()
	 * @see #getDmaapStream()
	 * @generated
	 */
	EAttribute getDmaapStream_DmaapUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapUserName <em>Dmaap User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dmaap User Name</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapUserName()
	 * @see #getDmaapStream()
	 * @generated
	 */
	EAttribute getDmaapStream_DmaapUserName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapPassword <em>Dmaap Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dmaap Password</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapPassword()
	 * @see #getDmaapStream()
	 * @generated
	 */
	EAttribute getDmaapStream_DmaapPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapAuthMethod <em>Dmaap Auth Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dmaap Auth Method</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapAuthMethod()
	 * @see #getDmaapStream()
	 * @generated
	 */
	EAttribute getDmaapStream_DmaapAuthMethod();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition <em>Dcae Stream Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Stream Definition</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition
	 * @generated
	 */
	EClass getDcaeStreamDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition#getStreamType <em>Stream Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stream Type</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition#getStreamType()
	 * @see #getDcaeStreamDefinition()
	 * @generated
	 */
	EAttribute getDcaeStreamDefinition_StreamType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition#getDatabusType <em>Databus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Databus Type</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition#getDatabusType()
	 * @see #getDcaeStreamDefinition()
	 * @generated
	 */
	EAttribute getDcaeStreamDefinition_DatabusType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition#getPublishers <em>Publishers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publishers</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition#getPublishers()
	 * @see #getDcaeStreamDefinition()
	 * @generated
	 */
	EReference getDcaeStreamDefinition_Publishers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition#getSubscribers <em>Subscribers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscribers</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition#getSubscribers()
	 * @see #getDcaeStreamDefinition()
	 * @generated
	 */
	EReference getDcaeStreamDefinition_Subscribers();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamPublisher <em>Dcae Stream Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Stream Publisher</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamPublisher
	 * @generated
	 */
	EClass getDcaeStreamPublisher();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamSubscriber <em>Dcae Stream Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Stream Subscriber</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamSubscriber
	 * @generated
	 */
	EClass getDcaeStreamSubscriber();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamPublisherExternal <em>Dcae Stream Publisher External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Stream Publisher External</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamPublisherExternal
	 * @generated
	 */
	EClass getDcaeStreamPublisherExternal();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamPublisherInternal <em>Dcae Stream Publisher Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Stream Publisher Internal</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamPublisherInternal
	 * @generated
	 */
	EClass getDcaeStreamPublisherInternal();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamSubscriberExternal <em>Dcae Stream Subscriber External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Stream Subscriber External</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamSubscriberExternal
	 * @generated
	 */
	EClass getDcaeStreamSubscriberExternal();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamSubscriberInternal <em>Dcae Stream Subscriber Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Stream Subscriber Internal</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamSubscriberInternal
	 * @generated
	 */
	EClass getDcaeStreamSubscriberInternal();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamInternalEndPoint <em>Dcae Stream Internal End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Stream Internal End Point</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamInternalEndPoint
	 * @generated
	 */
	EClass getDcaeStreamInternalEndPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamInternalEndPoint#getLocalName <em>Local Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Name</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamInternalEndPoint#getLocalName()
	 * @see #getDcaeStreamInternalEndPoint()
	 * @generated
	 */
	EAttribute getDcaeStreamInternalEndPoint_LocalName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamInternalEndPoint#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamInternalEndPoint#getServiceName()
	 * @see #getDcaeStreamInternalEndPoint()
	 * @generated
	 */
	EAttribute getDcaeStreamInternalEndPoint_ServiceName();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamExternalEndPoint <em>Dcae Stream External End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Stream External End Point</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamExternalEndPoint
	 * @generated
	 */
	EClass getDcaeStreamExternalEndPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamExternalEndPoint#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamExternalEndPoint#getUser()
	 * @see #getDcaeStreamExternalEndPoint()
	 * @generated
	 */
	EAttribute getDcaeStreamExternalEndPoint_User();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamExternalEndPoint#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamExternalEndPoint#getPassword()
	 * @see #getDcaeStreamExternalEndPoint()
	 * @generated
	 */
	EAttribute getDcaeStreamExternalEndPoint_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamExternalEndPoint#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamExternalEndPoint#getUrl()
	 * @see #getDcaeStreamExternalEndPoint()
	 * @generated
	 */
	EAttribute getDcaeStreamExternalEndPoint_Url();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DatabusStream <em>Databus Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Databus Stream</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStream
	 * @generated
	 */
	EClass getDatabusStream();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic <em>Databus Stream Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Databus Stream Topic</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopic
	 * @generated
	 */
	EClass getDatabusStreamTopic();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getTopicName <em>Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Name</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getTopicName()
	 * @see #getDatabusStreamTopic()
	 * @generated
	 */
	EAttribute getDatabusStreamTopic_TopicName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getTopicDescription <em>Topic Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Description</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getTopicDescription()
	 * @see #getDatabusStreamTopic()
	 * @generated
	 */
	EAttribute getDatabusStreamTopic_TopicDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getDcaeLocationName <em>Dcae Location Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dcae Location Name</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getDcaeLocationName()
	 * @see #getDatabusStreamTopic()
	 * @generated
	 */
	EAttribute getDatabusStreamTopic_DcaeLocationName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getOwner()
	 * @see #getDatabusStreamTopic()
	 * @generated
	 */
	EAttribute getDatabusStreamTopic_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#isTxenabled <em>Txenabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Txenabled</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#isTxenabled()
	 * @see #getDatabusStreamTopic()
	 * @generated
	 */
	EAttribute getDatabusStreamTopic_Txenabled();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getFqtn <em>Fqtn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fqtn</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getFqtn()
	 * @see #getDatabusStreamTopic()
	 * @generated
	 */
	EAttribute getDatabusStreamTopic_Fqtn();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getLastMod <em>Last Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Mod</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getLastMod()
	 * @see #getDatabusStreamTopic()
	 * @generated
	 */
	EAttribute getDatabusStreamTopic_LastMod();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getStatus()
	 * @see #getDatabusStreamTopic()
	 * @generated
	 */
	EAttribute getDatabusStreamTopic_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clients</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getClients()
	 * @see #getDatabusStreamTopic()
	 * @generated
	 */
	EReference getDatabusStreamTopic_Clients();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getPublishURL <em>Publish URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publish URL</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getPublishURL()
	 * @see #getDatabusStreamTopic()
	 * @generated
	 */
	EAttribute getDatabusStreamTopic_PublishURL();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getSubscribeURL <em>Subscribe URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscribe URL</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getSubscribeURL()
	 * @see #getDatabusStreamTopic()
	 * @generated
	 */
	EAttribute getDatabusStreamTopic_SubscribeURL();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getAuthenticationMethod <em>Authentication Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication Method</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getAuthenticationMethod()
	 * @see #getDatabusStreamTopic()
	 * @generated
	 */
	EAttribute getDatabusStreamTopic_AuthenticationMethod();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient <em>Databus Stream Topic Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Databus Stream Topic Client</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient
	 * @generated
	 */
	EClass getDatabusStreamTopicClient();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getLocalStreamId <em>Local Stream Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Stream Id</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getLocalStreamId()
	 * @see #getDatabusStreamTopicClient()
	 * @generated
	 */
	EAttribute getDatabusStreamTopicClient_LocalStreamId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getDcaeLocationName <em>Dcae Location Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dcae Location Name</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getDcaeLocationName()
	 * @see #getDatabusStreamTopicClient()
	 * @generated
	 */
	EAttribute getDatabusStreamTopicClient_DcaeLocationName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getClientRole <em>Client Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Role</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getClientRole()
	 * @see #getDatabusStreamTopicClient()
	 * @generated
	 */
	EAttribute getDatabusStreamTopicClient_ClientRole();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Action</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getAction()
	 * @see #getDatabusStreamTopicClient()
	 * @generated
	 */
	EAttribute getDatabusStreamTopicClient_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getUsername()
	 * @see #getDatabusStreamTopicClient()
	 * @generated
	 */
	EAttribute getDatabusStreamTopicClient_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getUserpwd <em>Userpwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Userpwd</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getUserpwd()
	 * @see #getDatabusStreamTopicClient()
	 * @generated
	 */
	EAttribute getDatabusStreamTopicClient_Userpwd();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getFqtn <em>Fqtn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fqtn</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getFqtn()
	 * @see #getDatabusStreamTopicClient()
	 * @generated
	 */
	EAttribute getDatabusStreamTopicClient_Fqtn();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getMrClientId <em>Mr Client Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mr Client Id</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getMrClientId()
	 * @see #getDatabusStreamTopicClient()
	 * @generated
	 */
	EAttribute getDatabusStreamTopicClient_MrClientId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getTopicURL <em>Topic URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic URL</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getTopicURL()
	 * @see #getDatabusStreamTopicClient()
	 * @generated
	 */
	EAttribute getDatabusStreamTopicClient_TopicURL();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed <em>Databus Stream Feed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Databus Stream Feed</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeed
	 * @generated
	 */
	EClass getDatabusStreamFeed();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getFeedName <em>Feed Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feed Name</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getFeedName()
	 * @see #getDatabusStreamFeed()
	 * @generated
	 */
	EAttribute getDatabusStreamFeed_FeedName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getFeedVersion <em>Feed Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feed Version</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getFeedVersion()
	 * @see #getDatabusStreamFeed()
	 * @generated
	 */
	EAttribute getDatabusStreamFeed_FeedVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getFeedDescription <em>Feed Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feed Description</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getFeedDescription()
	 * @see #getDatabusStreamFeed()
	 * @generated
	 */
	EAttribute getDatabusStreamFeed_FeedDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getAsprClassification <em>Aspr Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aspr Classification</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getAsprClassification()
	 * @see #getDatabusStreamFeed()
	 * @generated
	 */
	EAttribute getDatabusStreamFeed_AsprClassification();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getOwner()
	 * @see #getDatabusStreamFeed()
	 * @generated
	 */
	EAttribute getDatabusStreamFeed_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getFeedId <em>Feed Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feed Id</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getFeedId()
	 * @see #getDatabusStreamFeed()
	 * @generated
	 */
	EAttribute getDatabusStreamFeed_FeedId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getLogURL <em>Log URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log URL</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getLogURL()
	 * @see #getDatabusStreamFeed()
	 * @generated
	 */
	EAttribute getDatabusStreamFeed_LogURL();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getPublishURL <em>Publish URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publish URL</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getPublishURL()
	 * @see #getDatabusStreamFeed()
	 * @generated
	 */
	EAttribute getDatabusStreamFeed_PublishURL();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getSubscribeURL <em>Subscribe URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscribe URL</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getSubscribeURL()
	 * @see #getDatabusStreamFeed()
	 * @generated
	 */
	EAttribute getDatabusStreamFeed_SubscribeURL();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getStatus()
	 * @see #getDatabusStreamFeed()
	 * @generated
	 */
	EAttribute getDatabusStreamFeed_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getSuspended <em>Suspended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspended</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getSuspended()
	 * @see #getDatabusStreamFeed()
	 * @generated
	 */
	EAttribute getDatabusStreamFeed_Suspended();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getPublishers <em>Publishers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publishers</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getPublishers()
	 * @see #getDatabusStreamFeed()
	 * @generated
	 */
	EReference getDatabusStreamFeed_Publishers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getSubscribers <em>Subscribers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscribers</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getSubscribers()
	 * @see #getDatabusStreamFeed()
	 * @generated
	 */
	EReference getDatabusStreamFeed_Subscribers();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher <em>Databus Stream Feed Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Databus Stream Feed Publisher</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher
	 * @generated
	 */
	EClass getDatabusStreamFeedPublisher();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getLocalStreamId <em>Local Stream Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Stream Id</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getLocalStreamId()
	 * @see #getDatabusStreamFeedPublisher()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedPublisher_LocalStreamId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getDcaeLocationName <em>Dcae Location Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dcae Location Name</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getDcaeLocationName()
	 * @see #getDatabusStreamFeedPublisher()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedPublisher_DcaeLocationName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getFeedId <em>Feed Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feed Id</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getFeedId()
	 * @see #getDatabusStreamFeedPublisher()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedPublisher_FeedId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getPubId <em>Pub Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pub Id</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getPubId()
	 * @see #getDatabusStreamFeedPublisher()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedPublisher_PubId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getStatus()
	 * @see #getDatabusStreamFeedPublisher()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedPublisher_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getUsername()
	 * @see #getDatabusStreamFeedPublisher()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedPublisher_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getUserpwd <em>Userpwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Userpwd</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getUserpwd()
	 * @see #getDatabusStreamFeedPublisher()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedPublisher_Userpwd();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber <em>Databus Stream Feed Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Databus Stream Feed Subscriber</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber
	 * @generated
	 */
	EClass getDatabusStreamFeedSubscriber();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getLocalStreamId <em>Local Stream Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Stream Id</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getLocalStreamId()
	 * @see #getDatabusStreamFeedSubscriber()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedSubscriber_LocalStreamId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getDcaeLocationName <em>Dcae Location Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dcae Location Name</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getDcaeLocationName()
	 * @see #getDatabusStreamFeedSubscriber()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedSubscriber_DcaeLocationName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getOtherFeedName <em>Other Feed Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Feed Name</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getOtherFeedName()
	 * @see #getDatabusStreamFeedSubscriber()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedSubscriber_OtherFeedName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getFeedId <em>Feed Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feed Id</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getFeedId()
	 * @see #getDatabusStreamFeedSubscriber()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedSubscriber_FeedId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getLogURL <em>Log URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log URL</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getLogURL()
	 * @see #getDatabusStreamFeedSubscriber()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedSubscriber_LogURL();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getOwner()
	 * @see #getDatabusStreamFeedSubscriber()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedSubscriber_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getSubId <em>Sub Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Id</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getSubId()
	 * @see #getDatabusStreamFeedSubscriber()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedSubscriber_SubId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#isSuspended <em>Suspended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspended</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#isSuspended()
	 * @see #getDatabusStreamFeedSubscriber()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedSubscriber_Suspended();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#isUse100 <em>Use100</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use100</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#isUse100()
	 * @see #getDatabusStreamFeedSubscriber()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedSubscriber_Use100();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getUsername()
	 * @see #getDatabusStreamFeedSubscriber()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedSubscriber_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getUserpwd <em>Userpwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Userpwd</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getUserpwd()
	 * @see #getDatabusStreamFeedSubscriber()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedSubscriber_Userpwd();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getDeliveryURL <em>Delivery URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery URL</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getDeliveryURL()
	 * @see #getDatabusStreamFeedSubscriber()
	 * @generated
	 */
	EAttribute getDatabusStreamFeedSubscriber_DeliveryURL();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DatabusEntity <em>Databus Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Databus Entity</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusEntity
	 * @generated
	 */
	EClass getDatabusEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusEntity#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusEntity#getStatus()
	 * @see #getDatabusEntity()
	 * @generated
	 */
	EAttribute getDatabusEntity_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusEntity#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusEntity#getLastModified()
	 * @see #getDatabusEntity()
	 * @generated
	 */
	EAttribute getDatabusEntity_LastModified();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusEntity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusEntity#getType()
	 * @see #getDatabusEntity()
	 * @generated
	 */
	EAttribute getDatabusEntity_Type();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DatabusLocation <em>Databus Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Databus Location</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusLocation
	 * @generated
	 */
	EClass getDatabusLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusLocation#getDcaeLayer <em>Dcae Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dcae Layer</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusLocation#getDcaeLayer()
	 * @see #getDatabusLocation()
	 * @generated
	 */
	EAttribute getDatabusLocation_DcaeLayer();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster <em>Databus Message Router Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Databus Message Router Cluster</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster
	 * @generated
	 */
	EClass getDatabusMessageRouterCluster();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getDcaeLocationName <em>Dcae Location Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dcae Location Name</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getDcaeLocationName()
	 * @see #getDatabusMessageRouterCluster()
	 * @generated
	 */
	EAttribute getDatabusMessageRouterCluster_DcaeLocationName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getServiceFqdn <em>Service Fqdn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Fqdn</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getServiceFqdn()
	 * @see #getDatabusMessageRouterCluster()
	 * @generated
	 */
	EAttribute getDatabusMessageRouterCluster_ServiceFqdn();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getHostFqdn <em>Host Fqdn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Host Fqdn</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getHostFqdn()
	 * @see #getDatabusMessageRouterCluster()
	 * @generated
	 */
	EAttribute getDatabusMessageRouterCluster_HostFqdn();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getTopicPort <em>Topic Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Port</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getTopicPort()
	 * @see #getDatabusMessageRouterCluster()
	 * @generated
	 */
	EAttribute getDatabusMessageRouterCluster_TopicPort();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getTopicProtocol <em>Topic Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic Protocol</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getTopicProtocol()
	 * @see #getDatabusMessageRouterCluster()
	 * @generated
	 */
	EAttribute getDatabusMessageRouterCluster_TopicProtocol();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode <em>Databus Data Router Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Databus Data Router Node</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode
	 * @generated
	 */
	EClass getDatabusDataRouterNode();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode#getDcaeLocationName <em>Dcae Location Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dcae Location Name</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode#getDcaeLocationName()
	 * @see #getDatabusDataRouterNode()
	 * @generated
	 */
	EAttribute getDatabusDataRouterNode_DcaeLocationName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode#getHostFqdn <em>Host Fqdn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Fqdn</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode#getHostFqdn()
	 * @see #getDatabusDataRouterNode()
	 * @generated
	 */
	EAttribute getDatabusDataRouterNode_HostFqdn();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode#getVersion()
	 * @see #getDatabusDataRouterNode()
	 * @generated
	 */
	EAttribute getDatabusDataRouterNode_Version();

	/**
	 * Returns the meta object for enum '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicAction <em>Databus Stream Topic Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Databus Stream Topic Action</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopicAction
	 * @generated
	 */
	EEnum getDatabusStreamTopicAction();

	/**
	 * Returns the meta object for enum '{@link org.openecomp.dcae.controller.core.stream.StreamAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Authentication</em>'.
	 * @see org.openecomp.dcae.controller.core.stream.StreamAuthentication
	 * @generated
	 */
	EEnum getStreamAuthentication();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StreamFactory getStreamFactory();

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
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamImpl <em>Dcae Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStream()
		 * @generated
		 */
		EClass DCAE_STREAM = eINSTANCE.getDcaeStream();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DmaapStreamImpl <em>Dmaap Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DmaapStreamImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDmaapStream()
		 * @generated
		 */
		EClass DMAAP_STREAM = eINSTANCE.getDmaapStream();
		/**
		 * The meta object literal for the '<em><b>Dmaap Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMAAP_STREAM__DMAAP_DATA_TYPE = eINSTANCE.getDmaapStream_DmaapDataType();
		/**
		 * The meta object literal for the '<em><b>Dmaap Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMAAP_STREAM__DMAAP_ACTION = eINSTANCE.getDmaapStream_DmaapAction();
		/**
		 * The meta object literal for the '<em><b>Dmaap Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMAAP_STREAM__DMAAP_URL = eINSTANCE.getDmaapStream_DmaapUrl();
		/**
		 * The meta object literal for the '<em><b>Dmaap User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMAAP_STREAM__DMAAP_USER_NAME = eINSTANCE.getDmaapStream_DmaapUserName();
		/**
		 * The meta object literal for the '<em><b>Dmaap Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMAAP_STREAM__DMAAP_PASSWORD = eINSTANCE.getDmaapStream_DmaapPassword();
		/**
		 * The meta object literal for the '<em><b>Dmaap Auth Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMAAP_STREAM__DMAAP_AUTH_METHOD = eINSTANCE.getDmaapStream_DmaapAuthMethod();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamDefinitionImpl <em>Dcae Stream Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamDefinitionImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStreamDefinition()
		 * @generated
		 */
		EClass DCAE_STREAM_DEFINITION = eINSTANCE.getDcaeStreamDefinition();
		/**
		 * The meta object literal for the '<em><b>Stream Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_STREAM_DEFINITION__STREAM_TYPE = eINSTANCE.getDcaeStreamDefinition_StreamType();
		/**
		 * The meta object literal for the '<em><b>Databus Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_STREAM_DEFINITION__DATABUS_TYPE = eINSTANCE.getDcaeStreamDefinition_DatabusType();
		/**
		 * The meta object literal for the '<em><b>Publishers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_STREAM_DEFINITION__PUBLISHERS = eINSTANCE.getDcaeStreamDefinition_Publishers();
		/**
		 * The meta object literal for the '<em><b>Subscribers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_STREAM_DEFINITION__SUBSCRIBERS = eINSTANCE.getDcaeStreamDefinition_Subscribers();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamPublisherImpl <em>Dcae Stream Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamPublisherImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStreamPublisher()
		 * @generated
		 */
		EClass DCAE_STREAM_PUBLISHER = eINSTANCE.getDcaeStreamPublisher();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamSubscriberImpl <em>Dcae Stream Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamSubscriberImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStreamSubscriber()
		 * @generated
		 */
		EClass DCAE_STREAM_SUBSCRIBER = eINSTANCE.getDcaeStreamSubscriber();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamPublisherExternalImpl <em>Dcae Stream Publisher External</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamPublisherExternalImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStreamPublisherExternal()
		 * @generated
		 */
		EClass DCAE_STREAM_PUBLISHER_EXTERNAL = eINSTANCE.getDcaeStreamPublisherExternal();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamPublisherInternalImpl <em>Dcae Stream Publisher Internal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamPublisherInternalImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStreamPublisherInternal()
		 * @generated
		 */
		EClass DCAE_STREAM_PUBLISHER_INTERNAL = eINSTANCE.getDcaeStreamPublisherInternal();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamSubscriberExternalImpl <em>Dcae Stream Subscriber External</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamSubscriberExternalImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStreamSubscriberExternal()
		 * @generated
		 */
		EClass DCAE_STREAM_SUBSCRIBER_EXTERNAL = eINSTANCE.getDcaeStreamSubscriberExternal();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamSubscriberInternalImpl <em>Dcae Stream Subscriber Internal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamSubscriberInternalImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStreamSubscriberInternal()
		 * @generated
		 */
		EClass DCAE_STREAM_SUBSCRIBER_INTERNAL = eINSTANCE.getDcaeStreamSubscriberInternal();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamInternalEndPointImpl <em>Dcae Stream Internal End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamInternalEndPointImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStreamInternalEndPoint()
		 * @generated
		 */
		EClass DCAE_STREAM_INTERNAL_END_POINT = eINSTANCE.getDcaeStreamInternalEndPoint();
		/**
		 * The meta object literal for the '<em><b>Local Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_STREAM_INTERNAL_END_POINT__LOCAL_NAME = eINSTANCE.getDcaeStreamInternalEndPoint_LocalName();
		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_STREAM_INTERNAL_END_POINT__SERVICE_NAME = eINSTANCE.getDcaeStreamInternalEndPoint_ServiceName();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DcaeStreamExternalEndPointImpl <em>Dcae Stream External End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DcaeStreamExternalEndPointImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDcaeStreamExternalEndPoint()
		 * @generated
		 */
		EClass DCAE_STREAM_EXTERNAL_END_POINT = eINSTANCE.getDcaeStreamExternalEndPoint();
		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_STREAM_EXTERNAL_END_POINT__USER = eINSTANCE.getDcaeStreamExternalEndPoint_User();
		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_STREAM_EXTERNAL_END_POINT__PASSWORD = eINSTANCE.getDcaeStreamExternalEndPoint_Password();
		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCAE_STREAM_EXTERNAL_END_POINT__URL = eINSTANCE.getDcaeStreamExternalEndPoint_Url();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamImpl <em>Databus Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusStreamImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusStream()
		 * @generated
		 */
		EClass DATABUS_STREAM = eINSTANCE.getDatabusStream();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicImpl <em>Databus Stream Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusStreamTopic()
		 * @generated
		 */
		EClass DATABUS_STREAM_TOPIC = eINSTANCE.getDatabusStreamTopic();
		/**
		 * The meta object literal for the '<em><b>Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC__TOPIC_NAME = eINSTANCE.getDatabusStreamTopic_TopicName();
		/**
		 * The meta object literal for the '<em><b>Topic Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC__TOPIC_DESCRIPTION = eINSTANCE.getDatabusStreamTopic_TopicDescription();
		/**
		 * The meta object literal for the '<em><b>Dcae Location Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC__DCAE_LOCATION_NAME = eINSTANCE.getDatabusStreamTopic_DcaeLocationName();
		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC__OWNER = eINSTANCE.getDatabusStreamTopic_Owner();
		/**
		 * The meta object literal for the '<em><b>Txenabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC__TXENABLED = eINSTANCE.getDatabusStreamTopic_Txenabled();
		/**
		 * The meta object literal for the '<em><b>Fqtn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC__FQTN = eINSTANCE.getDatabusStreamTopic_Fqtn();
		/**
		 * The meta object literal for the '<em><b>Last Mod</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC__LAST_MOD = eINSTANCE.getDatabusStreamTopic_LastMod();
		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC__STATUS = eINSTANCE.getDatabusStreamTopic_Status();
		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABUS_STREAM_TOPIC__CLIENTS = eINSTANCE.getDatabusStreamTopic_Clients();
		/**
		 * The meta object literal for the '<em><b>Publish URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC__PUBLISH_URL = eINSTANCE.getDatabusStreamTopic_PublishURL();
		/**
		 * The meta object literal for the '<em><b>Subscribe URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC__SUBSCRIBE_URL = eINSTANCE.getDatabusStreamTopic_SubscribeURL();
		/**
		 * The meta object literal for the '<em><b>Authentication Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC__AUTHENTICATION_METHOD = eINSTANCE.getDatabusStreamTopic_AuthenticationMethod();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicClientImpl <em>Databus Stream Topic Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusStreamTopicClientImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusStreamTopicClient()
		 * @generated
		 */
		EClass DATABUS_STREAM_TOPIC_CLIENT = eINSTANCE.getDatabusStreamTopicClient();
		/**
		 * The meta object literal for the '<em><b>Local Stream Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC_CLIENT__LOCAL_STREAM_ID = eINSTANCE.getDatabusStreamTopicClient_LocalStreamId();
		/**
		 * The meta object literal for the '<em><b>Dcae Location Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC_CLIENT__DCAE_LOCATION_NAME = eINSTANCE.getDatabusStreamTopicClient_DcaeLocationName();
		/**
		 * The meta object literal for the '<em><b>Client Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC_CLIENT__CLIENT_ROLE = eINSTANCE.getDatabusStreamTopicClient_ClientRole();
		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC_CLIENT__ACTION = eINSTANCE.getDatabusStreamTopicClient_Action();
		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC_CLIENT__USERNAME = eINSTANCE.getDatabusStreamTopicClient_Username();
		/**
		 * The meta object literal for the '<em><b>Userpwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC_CLIENT__USERPWD = eINSTANCE.getDatabusStreamTopicClient_Userpwd();
		/**
		 * The meta object literal for the '<em><b>Fqtn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC_CLIENT__FQTN = eINSTANCE.getDatabusStreamTopicClient_Fqtn();
		/**
		 * The meta object literal for the '<em><b>Mr Client Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC_CLIENT__MR_CLIENT_ID = eINSTANCE.getDatabusStreamTopicClient_MrClientId();
		/**
		 * The meta object literal for the '<em><b>Topic URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_TOPIC_CLIENT__TOPIC_URL = eINSTANCE.getDatabusStreamTopicClient_TopicURL();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedImpl <em>Databus Stream Feed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusStreamFeed()
		 * @generated
		 */
		EClass DATABUS_STREAM_FEED = eINSTANCE.getDatabusStreamFeed();
		/**
		 * The meta object literal for the '<em><b>Feed Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED__FEED_NAME = eINSTANCE.getDatabusStreamFeed_FeedName();
		/**
		 * The meta object literal for the '<em><b>Feed Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED__FEED_VERSION = eINSTANCE.getDatabusStreamFeed_FeedVersion();
		/**
		 * The meta object literal for the '<em><b>Feed Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED__FEED_DESCRIPTION = eINSTANCE.getDatabusStreamFeed_FeedDescription();
		/**
		 * The meta object literal for the '<em><b>Aspr Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED__ASPR_CLASSIFICATION = eINSTANCE.getDatabusStreamFeed_AsprClassification();
		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED__OWNER = eINSTANCE.getDatabusStreamFeed_Owner();
		/**
		 * The meta object literal for the '<em><b>Feed Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED__FEED_ID = eINSTANCE.getDatabusStreamFeed_FeedId();
		/**
		 * The meta object literal for the '<em><b>Log URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED__LOG_URL = eINSTANCE.getDatabusStreamFeed_LogURL();
		/**
		 * The meta object literal for the '<em><b>Publish URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED__PUBLISH_URL = eINSTANCE.getDatabusStreamFeed_PublishURL();
		/**
		 * The meta object literal for the '<em><b>Subscribe URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED__SUBSCRIBE_URL = eINSTANCE.getDatabusStreamFeed_SubscribeURL();
		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED__STATUS = eINSTANCE.getDatabusStreamFeed_Status();
		/**
		 * The meta object literal for the '<em><b>Suspended</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED__SUSPENDED = eINSTANCE.getDatabusStreamFeed_Suspended();
		/**
		 * The meta object literal for the '<em><b>Publishers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABUS_STREAM_FEED__PUBLISHERS = eINSTANCE.getDatabusStreamFeed_Publishers();
		/**
		 * The meta object literal for the '<em><b>Subscribers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABUS_STREAM_FEED__SUBSCRIBERS = eINSTANCE.getDatabusStreamFeed_Subscribers();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedPublisherImpl <em>Databus Stream Feed Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedPublisherImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusStreamFeedPublisher()
		 * @generated
		 */
		EClass DATABUS_STREAM_FEED_PUBLISHER = eINSTANCE.getDatabusStreamFeedPublisher();
		/**
		 * The meta object literal for the '<em><b>Local Stream Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_PUBLISHER__LOCAL_STREAM_ID = eINSTANCE.getDatabusStreamFeedPublisher_LocalStreamId();
		/**
		 * The meta object literal for the '<em><b>Dcae Location Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_PUBLISHER__DCAE_LOCATION_NAME = eINSTANCE.getDatabusStreamFeedPublisher_DcaeLocationName();
		/**
		 * The meta object literal for the '<em><b>Feed Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_PUBLISHER__FEED_ID = eINSTANCE.getDatabusStreamFeedPublisher_FeedId();
		/**
		 * The meta object literal for the '<em><b>Pub Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_PUBLISHER__PUB_ID = eINSTANCE.getDatabusStreamFeedPublisher_PubId();
		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_PUBLISHER__STATUS = eINSTANCE.getDatabusStreamFeedPublisher_Status();
		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_PUBLISHER__USERNAME = eINSTANCE.getDatabusStreamFeedPublisher_Username();
		/**
		 * The meta object literal for the '<em><b>Userpwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_PUBLISHER__USERPWD = eINSTANCE.getDatabusStreamFeedPublisher_Userpwd();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedSubscriberImpl <em>Databus Stream Feed Subscriber</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusStreamFeedSubscriberImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusStreamFeedSubscriber()
		 * @generated
		 */
		EClass DATABUS_STREAM_FEED_SUBSCRIBER = eINSTANCE.getDatabusStreamFeedSubscriber();
		/**
		 * The meta object literal for the '<em><b>Local Stream Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_SUBSCRIBER__LOCAL_STREAM_ID = eINSTANCE.getDatabusStreamFeedSubscriber_LocalStreamId();
		/**
		 * The meta object literal for the '<em><b>Dcae Location Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_SUBSCRIBER__DCAE_LOCATION_NAME = eINSTANCE.getDatabusStreamFeedSubscriber_DcaeLocationName();
		/**
		 * The meta object literal for the '<em><b>Other Feed Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_SUBSCRIBER__OTHER_FEED_NAME = eINSTANCE.getDatabusStreamFeedSubscriber_OtherFeedName();
		/**
		 * The meta object literal for the '<em><b>Feed Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_SUBSCRIBER__FEED_ID = eINSTANCE.getDatabusStreamFeedSubscriber_FeedId();
		/**
		 * The meta object literal for the '<em><b>Log URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_SUBSCRIBER__LOG_URL = eINSTANCE.getDatabusStreamFeedSubscriber_LogURL();
		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_SUBSCRIBER__OWNER = eINSTANCE.getDatabusStreamFeedSubscriber_Owner();
		/**
		 * The meta object literal for the '<em><b>Sub Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_SUBSCRIBER__SUB_ID = eINSTANCE.getDatabusStreamFeedSubscriber_SubId();
		/**
		 * The meta object literal for the '<em><b>Suspended</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_SUBSCRIBER__SUSPENDED = eINSTANCE.getDatabusStreamFeedSubscriber_Suspended();
		/**
		 * The meta object literal for the '<em><b>Use100</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_SUBSCRIBER__USE100 = eINSTANCE.getDatabusStreamFeedSubscriber_Use100();
		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_SUBSCRIBER__USERNAME = eINSTANCE.getDatabusStreamFeedSubscriber_Username();
		/**
		 * The meta object literal for the '<em><b>Userpwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_SUBSCRIBER__USERPWD = eINSTANCE.getDatabusStreamFeedSubscriber_Userpwd();
		/**
		 * The meta object literal for the '<em><b>Delivery URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_STREAM_FEED_SUBSCRIBER__DELIVERY_URL = eINSTANCE.getDatabusStreamFeedSubscriber_DeliveryURL();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusEntityImpl <em>Databus Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusEntityImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusEntity()
		 * @generated
		 */
		EClass DATABUS_ENTITY = eINSTANCE.getDatabusEntity();
		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_ENTITY__STATUS = eINSTANCE.getDatabusEntity_Status();
		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_ENTITY__LAST_MODIFIED = eINSTANCE.getDatabusEntity_LastModified();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_ENTITY__TYPE = eINSTANCE.getDatabusEntity_Type();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusLocationImpl <em>Databus Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusLocationImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusLocation()
		 * @generated
		 */
		EClass DATABUS_LOCATION = eINSTANCE.getDatabusLocation();
		/**
		 * The meta object literal for the '<em><b>Dcae Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_LOCATION__DCAE_LAYER = eINSTANCE.getDatabusLocation_DcaeLayer();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusMessageRouterClusterImpl <em>Databus Message Router Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusMessageRouterClusterImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusMessageRouterCluster()
		 * @generated
		 */
		EClass DATABUS_MESSAGE_ROUTER_CLUSTER = eINSTANCE.getDatabusMessageRouterCluster();
		/**
		 * The meta object literal for the '<em><b>Dcae Location Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_MESSAGE_ROUTER_CLUSTER__DCAE_LOCATION_NAME = eINSTANCE.getDatabusMessageRouterCluster_DcaeLocationName();
		/**
		 * The meta object literal for the '<em><b>Service Fqdn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_MESSAGE_ROUTER_CLUSTER__SERVICE_FQDN = eINSTANCE.getDatabusMessageRouterCluster_ServiceFqdn();
		/**
		 * The meta object literal for the '<em><b>Host Fqdn</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_MESSAGE_ROUTER_CLUSTER__HOST_FQDN = eINSTANCE.getDatabusMessageRouterCluster_HostFqdn();
		/**
		 * The meta object literal for the '<em><b>Topic Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_MESSAGE_ROUTER_CLUSTER__TOPIC_PORT = eINSTANCE.getDatabusMessageRouterCluster_TopicPort();
		/**
		 * The meta object literal for the '<em><b>Topic Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_MESSAGE_ROUTER_CLUSTER__TOPIC_PROTOCOL = eINSTANCE.getDatabusMessageRouterCluster_TopicProtocol();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.impl.DatabusDataRouterNodeImpl <em>Databus Data Router Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.impl.DatabusDataRouterNodeImpl
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusDataRouterNode()
		 * @generated
		 */
		EClass DATABUS_DATA_ROUTER_NODE = eINSTANCE.getDatabusDataRouterNode();
		/**
		 * The meta object literal for the '<em><b>Dcae Location Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_DATA_ROUTER_NODE__DCAE_LOCATION_NAME = eINSTANCE.getDatabusDataRouterNode_DcaeLocationName();
		/**
		 * The meta object literal for the '<em><b>Host Fqdn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_DATA_ROUTER_NODE__HOST_FQDN = eINSTANCE.getDatabusDataRouterNode_HostFqdn();
		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABUS_DATA_ROUTER_NODE__VERSION = eINSTANCE.getDatabusDataRouterNode_Version();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicAction <em>Databus Stream Topic Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopicAction
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getDatabusStreamTopicAction()
		 * @generated
		 */
		EEnum DATABUS_STREAM_TOPIC_ACTION = eINSTANCE.getDatabusStreamTopicAction();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.stream.StreamAuthentication <em>Authentication</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.stream.StreamAuthentication
		 * @see org.openecomp.dcae.controller.core.stream.impl.StreamPackageImpl#getStreamAuthentication()
		 * @generated
		 */
		EEnum STREAM_AUTHENTICATION = eINSTANCE.getStreamAuthentication();

	}

} //StreamPackage
