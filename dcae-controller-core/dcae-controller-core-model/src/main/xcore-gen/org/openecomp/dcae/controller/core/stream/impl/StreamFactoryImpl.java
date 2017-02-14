
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
package org.openecomp.dcae.controller.core.stream.impl;

import org.openecomp.dcae.controller.core.stream.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StreamFactoryImpl extends EFactoryImpl implements StreamFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StreamFactory init() {
		try {
			StreamFactory theStreamFactory = (StreamFactory)EPackage.Registry.INSTANCE.getEFactory(StreamPackage.eNS_URI);
			if (theStreamFactory != null) {
				return theStreamFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StreamFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StreamPackage.DCAE_STREAM: return createDcaeStream();
			case StreamPackage.DMAAP_STREAM: return createDmaapStream();
			case StreamPackage.DCAE_STREAM_DEFINITION: return createDcaeStreamDefinition();
			case StreamPackage.DCAE_STREAM_PUBLISHER_EXTERNAL: return createDcaeStreamPublisherExternal();
			case StreamPackage.DCAE_STREAM_PUBLISHER_INTERNAL: return createDcaeStreamPublisherInternal();
			case StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL: return createDcaeStreamSubscriberExternal();
			case StreamPackage.DCAE_STREAM_SUBSCRIBER_INTERNAL: return createDcaeStreamSubscriberInternal();
			case StreamPackage.DCAE_STREAM_INTERNAL_END_POINT: return createDcaeStreamInternalEndPoint();
			case StreamPackage.DCAE_STREAM_EXTERNAL_END_POINT: return createDcaeStreamExternalEndPoint();
			case StreamPackage.DATABUS_STREAM_TOPIC: return createDatabusStreamTopic();
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT: return createDatabusStreamTopicClient();
			case StreamPackage.DATABUS_STREAM_FEED: return createDatabusStreamFeed();
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER: return createDatabusStreamFeedPublisher();
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER: return createDatabusStreamFeedSubscriber();
			case StreamPackage.DATABUS_ENTITY: return createDatabusEntity();
			case StreamPackage.DATABUS_LOCATION: return createDatabusLocation();
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER: return createDatabusMessageRouterCluster();
			case StreamPackage.DATABUS_DATA_ROUTER_NODE: return createDatabusDataRouterNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StreamPackage.DATABUS_STREAM_TOPIC_ACTION:
				return createDatabusStreamTopicActionFromString(eDataType, initialValue);
			case StreamPackage.STREAM_AUTHENTICATION:
				return createStreamAuthenticationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StreamPackage.DATABUS_STREAM_TOPIC_ACTION:
				return convertDatabusStreamTopicActionToString(eDataType, instanceValue);
			case StreamPackage.STREAM_AUTHENTICATION:
				return convertStreamAuthenticationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeStream createDcaeStream() {
		DcaeStreamImpl dcaeStream = new DcaeStreamImpl();
		return dcaeStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmaapStream createDmaapStream() {
		DmaapStreamImpl dmaapStream = new DmaapStreamImpl();
		return dmaapStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeStreamDefinition createDcaeStreamDefinition() {
		DcaeStreamDefinitionImpl dcaeStreamDefinition = new DcaeStreamDefinitionImpl();
		return dcaeStreamDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeStreamPublisherExternal createDcaeStreamPublisherExternal() {
		DcaeStreamPublisherExternalImpl dcaeStreamPublisherExternal = new DcaeStreamPublisherExternalImpl();
		return dcaeStreamPublisherExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeStreamPublisherInternal createDcaeStreamPublisherInternal() {
		DcaeStreamPublisherInternalImpl dcaeStreamPublisherInternal = new DcaeStreamPublisherInternalImpl();
		return dcaeStreamPublisherInternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeStreamSubscriberExternal createDcaeStreamSubscriberExternal() {
		DcaeStreamSubscriberExternalImpl dcaeStreamSubscriberExternal = new DcaeStreamSubscriberExternalImpl();
		return dcaeStreamSubscriberExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeStreamSubscriberInternal createDcaeStreamSubscriberInternal() {
		DcaeStreamSubscriberInternalImpl dcaeStreamSubscriberInternal = new DcaeStreamSubscriberInternalImpl();
		return dcaeStreamSubscriberInternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeStreamInternalEndPoint createDcaeStreamInternalEndPoint() {
		DcaeStreamInternalEndPointImpl dcaeStreamInternalEndPoint = new DcaeStreamInternalEndPointImpl();
		return dcaeStreamInternalEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeStreamExternalEndPoint createDcaeStreamExternalEndPoint() {
		DcaeStreamExternalEndPointImpl dcaeStreamExternalEndPoint = new DcaeStreamExternalEndPointImpl();
		return dcaeStreamExternalEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabusStreamTopic createDatabusStreamTopic() {
		DatabusStreamTopicImpl databusStreamTopic = new DatabusStreamTopicImpl();
		return databusStreamTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabusStreamTopicClient createDatabusStreamTopicClient() {
		DatabusStreamTopicClientImpl databusStreamTopicClient = new DatabusStreamTopicClientImpl();
		return databusStreamTopicClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabusStreamFeed createDatabusStreamFeed() {
		DatabusStreamFeedImpl databusStreamFeed = new DatabusStreamFeedImpl();
		return databusStreamFeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabusStreamFeedPublisher createDatabusStreamFeedPublisher() {
		DatabusStreamFeedPublisherImpl databusStreamFeedPublisher = new DatabusStreamFeedPublisherImpl();
		return databusStreamFeedPublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabusStreamFeedSubscriber createDatabusStreamFeedSubscriber() {
		DatabusStreamFeedSubscriberImpl databusStreamFeedSubscriber = new DatabusStreamFeedSubscriberImpl();
		return databusStreamFeedSubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabusEntity createDatabusEntity() {
		DatabusEntityImpl databusEntity = new DatabusEntityImpl();
		return databusEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabusLocation createDatabusLocation() {
		DatabusLocationImpl databusLocation = new DatabusLocationImpl();
		return databusLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabusMessageRouterCluster createDatabusMessageRouterCluster() {
		DatabusMessageRouterClusterImpl databusMessageRouterCluster = new DatabusMessageRouterClusterImpl();
		return databusMessageRouterCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabusDataRouterNode createDatabusDataRouterNode() {
		DatabusDataRouterNodeImpl databusDataRouterNode = new DatabusDataRouterNodeImpl();
		return databusDataRouterNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabusStreamTopicAction createDatabusStreamTopicActionFromString(EDataType eDataType, String initialValue) {
		DatabusStreamTopicAction result = DatabusStreamTopicAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatabusStreamTopicActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamAuthentication createStreamAuthenticationFromString(EDataType eDataType, String initialValue) {
		StreamAuthentication result = StreamAuthentication.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStreamAuthenticationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamPackage getStreamPackage() {
		return (StreamPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StreamPackage getPackage() {
		return StreamPackage.eINSTANCE;
	}

} //StreamFactoryImpl
