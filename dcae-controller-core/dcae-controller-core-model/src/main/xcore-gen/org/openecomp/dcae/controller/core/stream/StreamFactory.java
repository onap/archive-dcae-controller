
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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.core.stream.StreamPackage
 * @generated
 */
public interface StreamFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StreamFactory eINSTANCE = org.openecomp.dcae.controller.core.stream.impl.StreamFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dcae Stream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dcae Stream</em>'.
	 * @generated
	 */
	DcaeStream createDcaeStream();

	/**
	 * Returns a new object of class '<em>Dmaap Stream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dmaap Stream</em>'.
	 * @generated
	 */
	DmaapStream createDmaapStream();

	/**
	 * Returns a new object of class '<em>Dcae Stream Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dcae Stream Definition</em>'.
	 * @generated
	 */
	DcaeStreamDefinition createDcaeStreamDefinition();

	/**
	 * Returns a new object of class '<em>Dcae Stream Publisher External</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dcae Stream Publisher External</em>'.
	 * @generated
	 */
	DcaeStreamPublisherExternal createDcaeStreamPublisherExternal();

	/**
	 * Returns a new object of class '<em>Dcae Stream Publisher Internal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dcae Stream Publisher Internal</em>'.
	 * @generated
	 */
	DcaeStreamPublisherInternal createDcaeStreamPublisherInternal();

	/**
	 * Returns a new object of class '<em>Dcae Stream Subscriber External</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dcae Stream Subscriber External</em>'.
	 * @generated
	 */
	DcaeStreamSubscriberExternal createDcaeStreamSubscriberExternal();

	/**
	 * Returns a new object of class '<em>Dcae Stream Subscriber Internal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dcae Stream Subscriber Internal</em>'.
	 * @generated
	 */
	DcaeStreamSubscriberInternal createDcaeStreamSubscriberInternal();

	/**
	 * Returns a new object of class '<em>Dcae Stream Internal End Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dcae Stream Internal End Point</em>'.
	 * @generated
	 */
	DcaeStreamInternalEndPoint createDcaeStreamInternalEndPoint();

	/**
	 * Returns a new object of class '<em>Dcae Stream External End Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dcae Stream External End Point</em>'.
	 * @generated
	 */
	DcaeStreamExternalEndPoint createDcaeStreamExternalEndPoint();

	/**
	 * Returns a new object of class '<em>Databus Stream Topic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Databus Stream Topic</em>'.
	 * @generated
	 */
	DatabusStreamTopic createDatabusStreamTopic();

	/**
	 * Returns a new object of class '<em>Databus Stream Topic Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Databus Stream Topic Client</em>'.
	 * @generated
	 */
	DatabusStreamTopicClient createDatabusStreamTopicClient();

	/**
	 * Returns a new object of class '<em>Databus Stream Feed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Databus Stream Feed</em>'.
	 * @generated
	 */
	DatabusStreamFeed createDatabusStreamFeed();

	/**
	 * Returns a new object of class '<em>Databus Stream Feed Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Databus Stream Feed Publisher</em>'.
	 * @generated
	 */
	DatabusStreamFeedPublisher createDatabusStreamFeedPublisher();

	/**
	 * Returns a new object of class '<em>Databus Stream Feed Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Databus Stream Feed Subscriber</em>'.
	 * @generated
	 */
	DatabusStreamFeedSubscriber createDatabusStreamFeedSubscriber();

	/**
	 * Returns a new object of class '<em>Databus Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Databus Entity</em>'.
	 * @generated
	 */
	DatabusEntity createDatabusEntity();

	/**
	 * Returns a new object of class '<em>Databus Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Databus Location</em>'.
	 * @generated
	 */
	DatabusLocation createDatabusLocation();

	/**
	 * Returns a new object of class '<em>Databus Message Router Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Databus Message Router Cluster</em>'.
	 * @generated
	 */
	DatabusMessageRouterCluster createDatabusMessageRouterCluster();

	/**
	 * Returns a new object of class '<em>Databus Data Router Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Databus Data Router Node</em>'.
	 * @generated
	 */
	DatabusDataRouterNode createDatabusDataRouterNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StreamPackage getStreamPackage();

} //StreamFactory
