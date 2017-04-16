
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

import org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode;
import org.openecomp.dcae.controller.core.stream.DatabusEntity;
import org.openecomp.dcae.controller.core.stream.DatabusLocation;
import org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster;
import org.openecomp.dcae.controller.core.stream.DatabusStream;
import org.openecomp.dcae.controller.core.stream.DatabusStreamFeed;
import org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher;
import org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber;
import org.openecomp.dcae.controller.core.stream.DatabusStreamTopic;
import org.openecomp.dcae.controller.core.stream.DatabusStreamTopicAction;
import org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient;
import org.openecomp.dcae.controller.core.stream.DcaeStream;
import org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition;
import org.openecomp.dcae.controller.core.stream.DcaeStreamExternalEndPoint;
import org.openecomp.dcae.controller.core.stream.DcaeStreamInternalEndPoint;
import org.openecomp.dcae.controller.core.stream.DcaeStreamPublisher;
import org.openecomp.dcae.controller.core.stream.DcaeStreamPublisherExternal;
import org.openecomp.dcae.controller.core.stream.DcaeStreamPublisherInternal;
import org.openecomp.dcae.controller.core.stream.DcaeStreamSubscriber;
import org.openecomp.dcae.controller.core.stream.DcaeStreamSubscriberExternal;
import org.openecomp.dcae.controller.core.stream.DcaeStreamSubscriberInternal;
import org.openecomp.dcae.controller.core.stream.DmaapStream;
import org.openecomp.dcae.controller.core.stream.StreamAuthentication;
import org.openecomp.dcae.controller.core.stream.StreamFactory;
import org.openecomp.dcae.controller.core.stream.StreamPackage;

import org.openecomp.ncomp.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StreamPackageImpl extends EPackageImpl implements StreamPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeStreamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmaapStreamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeStreamDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeStreamPublisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeStreamSubscriberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeStreamPublisherExternalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeStreamPublisherInternalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeStreamSubscriberExternalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeStreamSubscriberInternalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeStreamInternalEndPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeStreamExternalEndPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databusStreamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databusStreamTopicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databusStreamTopicClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databusStreamFeedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databusStreamFeedPublisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databusStreamFeedSubscriberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databusEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databusLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databusMessageRouterClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databusDataRouterNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databusStreamTopicActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum streamAuthenticationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StreamPackageImpl() {
		super(eNS_URI, StreamFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StreamPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StreamPackage init() {
		if (isInited) return (StreamPackage)EPackage.Registry.INSTANCE.getEPackage(StreamPackage.eNS_URI);

		// Obtain or create and register package
		StreamPackageImpl theStreamPackage = (StreamPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StreamPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StreamPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theStreamPackage.createPackageContents();

		// Initialize created meta-data
		theStreamPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStreamPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StreamPackage.eNS_URI, theStreamPackage);
		return theStreamPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeStream() {
		return dcaeStreamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmaapStream() {
		return dmaapStreamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmaapStream_DmaapDataType() {
		return (EAttribute)dmaapStreamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmaapStream_DmaapAction() {
		return (EAttribute)dmaapStreamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmaapStream_DmaapUrl() {
		return (EAttribute)dmaapStreamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmaapStream_DmaapUserName() {
		return (EAttribute)dmaapStreamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmaapStream_DmaapPassword() {
		return (EAttribute)dmaapStreamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmaapStream_DmaapAuthMethod() {
		return (EAttribute)dmaapStreamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeStreamDefinition() {
		return dcaeStreamDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeStreamDefinition_StreamType() {
		return (EAttribute)dcaeStreamDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeStreamDefinition_DatabusType() {
		return (EAttribute)dcaeStreamDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeStreamDefinition_Publishers() {
		return (EReference)dcaeStreamDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeStreamDefinition_Subscribers() {
		return (EReference)dcaeStreamDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeStreamPublisher() {
		return dcaeStreamPublisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeStreamSubscriber() {
		return dcaeStreamSubscriberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeStreamPublisherExternal() {
		return dcaeStreamPublisherExternalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeStreamPublisherInternal() {
		return dcaeStreamPublisherInternalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeStreamSubscriberExternal() {
		return dcaeStreamSubscriberExternalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeStreamSubscriberInternal() {
		return dcaeStreamSubscriberInternalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeStreamInternalEndPoint() {
		return dcaeStreamInternalEndPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeStreamInternalEndPoint_LocalName() {
		return (EAttribute)dcaeStreamInternalEndPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeStreamInternalEndPoint_ServiceName() {
		return (EAttribute)dcaeStreamInternalEndPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeStreamExternalEndPoint() {
		return dcaeStreamExternalEndPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeStreamExternalEndPoint_User() {
		return (EAttribute)dcaeStreamExternalEndPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeStreamExternalEndPoint_Password() {
		return (EAttribute)dcaeStreamExternalEndPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeStreamExternalEndPoint_Url() {
		return (EAttribute)dcaeStreamExternalEndPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabusStream() {
		return databusStreamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabusStreamTopic() {
		return databusStreamTopicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopic_TopicName() {
		return (EAttribute)databusStreamTopicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopic_TopicDescription() {
		return (EAttribute)databusStreamTopicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopic_DcaeLocationName() {
		return (EAttribute)databusStreamTopicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopic_Owner() {
		return (EAttribute)databusStreamTopicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopic_Txenabled() {
		return (EAttribute)databusStreamTopicEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopic_Fqtn() {
		return (EAttribute)databusStreamTopicEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopic_LastMod() {
		return (EAttribute)databusStreamTopicEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopic_Status() {
		return (EAttribute)databusStreamTopicEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabusStreamTopic_Clients() {
		return (EReference)databusStreamTopicEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopic_PublishURL() {
		return (EAttribute)databusStreamTopicEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopic_SubscribeURL() {
		return (EAttribute)databusStreamTopicEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopic_AuthenticationMethod() {
		return (EAttribute)databusStreamTopicEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabusStreamTopicClient() {
		return databusStreamTopicClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopicClient_LocalStreamId() {
		return (EAttribute)databusStreamTopicClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopicClient_DcaeLocationName() {
		return (EAttribute)databusStreamTopicClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopicClient_ClientRole() {
		return (EAttribute)databusStreamTopicClientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopicClient_Action() {
		return (EAttribute)databusStreamTopicClientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopicClient_Username() {
		return (EAttribute)databusStreamTopicClientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopicClient_Userpwd() {
		return (EAttribute)databusStreamTopicClientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopicClient_Fqtn() {
		return (EAttribute)databusStreamTopicClientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopicClient_MrClientId() {
		return (EAttribute)databusStreamTopicClientEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamTopicClient_TopicURL() {
		return (EAttribute)databusStreamTopicClientEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabusStreamFeed() {
		return databusStreamFeedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeed_FeedName() {
		return (EAttribute)databusStreamFeedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeed_FeedVersion() {
		return (EAttribute)databusStreamFeedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeed_FeedDescription() {
		return (EAttribute)databusStreamFeedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeed_AsprClassification() {
		return (EAttribute)databusStreamFeedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeed_Owner() {
		return (EAttribute)databusStreamFeedEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeed_FeedId() {
		return (EAttribute)databusStreamFeedEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeed_LogURL() {
		return (EAttribute)databusStreamFeedEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeed_PublishURL() {
		return (EAttribute)databusStreamFeedEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeed_SubscribeURL() {
		return (EAttribute)databusStreamFeedEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeed_Status() {
		return (EAttribute)databusStreamFeedEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeed_Suspended() {
		return (EAttribute)databusStreamFeedEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabusStreamFeed_Publishers() {
		return (EReference)databusStreamFeedEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabusStreamFeed_Subscribers() {
		return (EReference)databusStreamFeedEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabusStreamFeedPublisher() {
		return databusStreamFeedPublisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedPublisher_LocalStreamId() {
		return (EAttribute)databusStreamFeedPublisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedPublisher_DcaeLocationName() {
		return (EAttribute)databusStreamFeedPublisherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedPublisher_FeedId() {
		return (EAttribute)databusStreamFeedPublisherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedPublisher_PubId() {
		return (EAttribute)databusStreamFeedPublisherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedPublisher_Status() {
		return (EAttribute)databusStreamFeedPublisherEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedPublisher_Username() {
		return (EAttribute)databusStreamFeedPublisherEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedPublisher_Userpwd() {
		return (EAttribute)databusStreamFeedPublisherEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabusStreamFeedSubscriber() {
		return databusStreamFeedSubscriberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedSubscriber_LocalStreamId() {
		return (EAttribute)databusStreamFeedSubscriberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedSubscriber_DcaeLocationName() {
		return (EAttribute)databusStreamFeedSubscriberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedSubscriber_OtherFeedName() {
		return (EAttribute)databusStreamFeedSubscriberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedSubscriber_FeedId() {
		return (EAttribute)databusStreamFeedSubscriberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedSubscriber_LogURL() {
		return (EAttribute)databusStreamFeedSubscriberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedSubscriber_Owner() {
		return (EAttribute)databusStreamFeedSubscriberEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedSubscriber_SubId() {
		return (EAttribute)databusStreamFeedSubscriberEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedSubscriber_Suspended() {
		return (EAttribute)databusStreamFeedSubscriberEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedSubscriber_Use100() {
		return (EAttribute)databusStreamFeedSubscriberEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedSubscriber_Username() {
		return (EAttribute)databusStreamFeedSubscriberEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedSubscriber_Userpwd() {
		return (EAttribute)databusStreamFeedSubscriberEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusStreamFeedSubscriber_DeliveryURL() {
		return (EAttribute)databusStreamFeedSubscriberEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabusEntity() {
		return databusEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusEntity_Status() {
		return (EAttribute)databusEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusEntity_LastModified() {
		return (EAttribute)databusEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusEntity_Type() {
		return (EAttribute)databusEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabusLocation() {
		return databusLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusLocation_DcaeLayer() {
		return (EAttribute)databusLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabusMessageRouterCluster() {
		return databusMessageRouterClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusMessageRouterCluster_DcaeLocationName() {
		return (EAttribute)databusMessageRouterClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusMessageRouterCluster_ServiceFqdn() {
		return (EAttribute)databusMessageRouterClusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusMessageRouterCluster_HostFqdn() {
		return (EAttribute)databusMessageRouterClusterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusMessageRouterCluster_TopicPort() {
		return (EAttribute)databusMessageRouterClusterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusMessageRouterCluster_TopicProtocol() {
		return (EAttribute)databusMessageRouterClusterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabusDataRouterNode() {
		return databusDataRouterNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusDataRouterNode_DcaeLocationName() {
		return (EAttribute)databusDataRouterNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusDataRouterNode_HostFqdn() {
		return (EAttribute)databusDataRouterNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabusDataRouterNode_Version() {
		return (EAttribute)databusDataRouterNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatabusStreamTopicAction() {
		return databusStreamTopicActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStreamAuthentication() {
		return streamAuthenticationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamFactory getStreamFactory() {
		return (StreamFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dcaeStreamEClass = createEClass(DCAE_STREAM);

		dmaapStreamEClass = createEClass(DMAAP_STREAM);
		createEAttribute(dmaapStreamEClass, DMAAP_STREAM__DMAAP_DATA_TYPE);
		createEAttribute(dmaapStreamEClass, DMAAP_STREAM__DMAAP_ACTION);
		createEAttribute(dmaapStreamEClass, DMAAP_STREAM__DMAAP_URL);
		createEAttribute(dmaapStreamEClass, DMAAP_STREAM__DMAAP_USER_NAME);
		createEAttribute(dmaapStreamEClass, DMAAP_STREAM__DMAAP_PASSWORD);
		createEAttribute(dmaapStreamEClass, DMAAP_STREAM__DMAAP_AUTH_METHOD);

		dcaeStreamDefinitionEClass = createEClass(DCAE_STREAM_DEFINITION);
		createEAttribute(dcaeStreamDefinitionEClass, DCAE_STREAM_DEFINITION__STREAM_TYPE);
		createEAttribute(dcaeStreamDefinitionEClass, DCAE_STREAM_DEFINITION__DATABUS_TYPE);
		createEReference(dcaeStreamDefinitionEClass, DCAE_STREAM_DEFINITION__PUBLISHERS);
		createEReference(dcaeStreamDefinitionEClass, DCAE_STREAM_DEFINITION__SUBSCRIBERS);

		dcaeStreamPublisherEClass = createEClass(DCAE_STREAM_PUBLISHER);

		dcaeStreamSubscriberEClass = createEClass(DCAE_STREAM_SUBSCRIBER);

		dcaeStreamPublisherExternalEClass = createEClass(DCAE_STREAM_PUBLISHER_EXTERNAL);

		dcaeStreamPublisherInternalEClass = createEClass(DCAE_STREAM_PUBLISHER_INTERNAL);

		dcaeStreamSubscriberExternalEClass = createEClass(DCAE_STREAM_SUBSCRIBER_EXTERNAL);

		dcaeStreamSubscriberInternalEClass = createEClass(DCAE_STREAM_SUBSCRIBER_INTERNAL);

		dcaeStreamInternalEndPointEClass = createEClass(DCAE_STREAM_INTERNAL_END_POINT);
		createEAttribute(dcaeStreamInternalEndPointEClass, DCAE_STREAM_INTERNAL_END_POINT__LOCAL_NAME);
		createEAttribute(dcaeStreamInternalEndPointEClass, DCAE_STREAM_INTERNAL_END_POINT__SERVICE_NAME);

		dcaeStreamExternalEndPointEClass = createEClass(DCAE_STREAM_EXTERNAL_END_POINT);
		createEAttribute(dcaeStreamExternalEndPointEClass, DCAE_STREAM_EXTERNAL_END_POINT__USER);
		createEAttribute(dcaeStreamExternalEndPointEClass, DCAE_STREAM_EXTERNAL_END_POINT__PASSWORD);
		createEAttribute(dcaeStreamExternalEndPointEClass, DCAE_STREAM_EXTERNAL_END_POINT__URL);

		databusStreamEClass = createEClass(DATABUS_STREAM);

		databusStreamTopicEClass = createEClass(DATABUS_STREAM_TOPIC);
		createEAttribute(databusStreamTopicEClass, DATABUS_STREAM_TOPIC__TOPIC_NAME);
		createEAttribute(databusStreamTopicEClass, DATABUS_STREAM_TOPIC__TOPIC_DESCRIPTION);
		createEAttribute(databusStreamTopicEClass, DATABUS_STREAM_TOPIC__DCAE_LOCATION_NAME);
		createEAttribute(databusStreamTopicEClass, DATABUS_STREAM_TOPIC__OWNER);
		createEAttribute(databusStreamTopicEClass, DATABUS_STREAM_TOPIC__TXENABLED);
		createEAttribute(databusStreamTopicEClass, DATABUS_STREAM_TOPIC__FQTN);
		createEAttribute(databusStreamTopicEClass, DATABUS_STREAM_TOPIC__LAST_MOD);
		createEAttribute(databusStreamTopicEClass, DATABUS_STREAM_TOPIC__STATUS);
		createEReference(databusStreamTopicEClass, DATABUS_STREAM_TOPIC__CLIENTS);
		createEAttribute(databusStreamTopicEClass, DATABUS_STREAM_TOPIC__PUBLISH_URL);
		createEAttribute(databusStreamTopicEClass, DATABUS_STREAM_TOPIC__SUBSCRIBE_URL);
		createEAttribute(databusStreamTopicEClass, DATABUS_STREAM_TOPIC__AUTHENTICATION_METHOD);

		databusStreamTopicClientEClass = createEClass(DATABUS_STREAM_TOPIC_CLIENT);
		createEAttribute(databusStreamTopicClientEClass, DATABUS_STREAM_TOPIC_CLIENT__LOCAL_STREAM_ID);
		createEAttribute(databusStreamTopicClientEClass, DATABUS_STREAM_TOPIC_CLIENT__DCAE_LOCATION_NAME);
		createEAttribute(databusStreamTopicClientEClass, DATABUS_STREAM_TOPIC_CLIENT__CLIENT_ROLE);
		createEAttribute(databusStreamTopicClientEClass, DATABUS_STREAM_TOPIC_CLIENT__ACTION);
		createEAttribute(databusStreamTopicClientEClass, DATABUS_STREAM_TOPIC_CLIENT__USERNAME);
		createEAttribute(databusStreamTopicClientEClass, DATABUS_STREAM_TOPIC_CLIENT__USERPWD);
		createEAttribute(databusStreamTopicClientEClass, DATABUS_STREAM_TOPIC_CLIENT__FQTN);
		createEAttribute(databusStreamTopicClientEClass, DATABUS_STREAM_TOPIC_CLIENT__MR_CLIENT_ID);
		createEAttribute(databusStreamTopicClientEClass, DATABUS_STREAM_TOPIC_CLIENT__TOPIC_URL);

		databusStreamFeedEClass = createEClass(DATABUS_STREAM_FEED);
		createEAttribute(databusStreamFeedEClass, DATABUS_STREAM_FEED__FEED_NAME);
		createEAttribute(databusStreamFeedEClass, DATABUS_STREAM_FEED__FEED_VERSION);
		createEAttribute(databusStreamFeedEClass, DATABUS_STREAM_FEED__FEED_DESCRIPTION);
		createEAttribute(databusStreamFeedEClass, DATABUS_STREAM_FEED__ASPR_CLASSIFICATION);
		createEAttribute(databusStreamFeedEClass, DATABUS_STREAM_FEED__OWNER);
		createEAttribute(databusStreamFeedEClass, DATABUS_STREAM_FEED__FEED_ID);
		createEAttribute(databusStreamFeedEClass, DATABUS_STREAM_FEED__LOG_URL);
		createEAttribute(databusStreamFeedEClass, DATABUS_STREAM_FEED__PUBLISH_URL);
		createEAttribute(databusStreamFeedEClass, DATABUS_STREAM_FEED__SUBSCRIBE_URL);
		createEAttribute(databusStreamFeedEClass, DATABUS_STREAM_FEED__STATUS);
		createEAttribute(databusStreamFeedEClass, DATABUS_STREAM_FEED__SUSPENDED);
		createEReference(databusStreamFeedEClass, DATABUS_STREAM_FEED__PUBLISHERS);
		createEReference(databusStreamFeedEClass, DATABUS_STREAM_FEED__SUBSCRIBERS);

		databusStreamFeedPublisherEClass = createEClass(DATABUS_STREAM_FEED_PUBLISHER);
		createEAttribute(databusStreamFeedPublisherEClass, DATABUS_STREAM_FEED_PUBLISHER__LOCAL_STREAM_ID);
		createEAttribute(databusStreamFeedPublisherEClass, DATABUS_STREAM_FEED_PUBLISHER__DCAE_LOCATION_NAME);
		createEAttribute(databusStreamFeedPublisherEClass, DATABUS_STREAM_FEED_PUBLISHER__FEED_ID);
		createEAttribute(databusStreamFeedPublisherEClass, DATABUS_STREAM_FEED_PUBLISHER__PUB_ID);
		createEAttribute(databusStreamFeedPublisherEClass, DATABUS_STREAM_FEED_PUBLISHER__STATUS);
		createEAttribute(databusStreamFeedPublisherEClass, DATABUS_STREAM_FEED_PUBLISHER__USERNAME);
		createEAttribute(databusStreamFeedPublisherEClass, DATABUS_STREAM_FEED_PUBLISHER__USERPWD);

		databusStreamFeedSubscriberEClass = createEClass(DATABUS_STREAM_FEED_SUBSCRIBER);
		createEAttribute(databusStreamFeedSubscriberEClass, DATABUS_STREAM_FEED_SUBSCRIBER__LOCAL_STREAM_ID);
		createEAttribute(databusStreamFeedSubscriberEClass, DATABUS_STREAM_FEED_SUBSCRIBER__DCAE_LOCATION_NAME);
		createEAttribute(databusStreamFeedSubscriberEClass, DATABUS_STREAM_FEED_SUBSCRIBER__OTHER_FEED_NAME);
		createEAttribute(databusStreamFeedSubscriberEClass, DATABUS_STREAM_FEED_SUBSCRIBER__FEED_ID);
		createEAttribute(databusStreamFeedSubscriberEClass, DATABUS_STREAM_FEED_SUBSCRIBER__LOG_URL);
		createEAttribute(databusStreamFeedSubscriberEClass, DATABUS_STREAM_FEED_SUBSCRIBER__OWNER);
		createEAttribute(databusStreamFeedSubscriberEClass, DATABUS_STREAM_FEED_SUBSCRIBER__SUB_ID);
		createEAttribute(databusStreamFeedSubscriberEClass, DATABUS_STREAM_FEED_SUBSCRIBER__SUSPENDED);
		createEAttribute(databusStreamFeedSubscriberEClass, DATABUS_STREAM_FEED_SUBSCRIBER__USE100);
		createEAttribute(databusStreamFeedSubscriberEClass, DATABUS_STREAM_FEED_SUBSCRIBER__USERNAME);
		createEAttribute(databusStreamFeedSubscriberEClass, DATABUS_STREAM_FEED_SUBSCRIBER__USERPWD);
		createEAttribute(databusStreamFeedSubscriberEClass, DATABUS_STREAM_FEED_SUBSCRIBER__DELIVERY_URL);

		databusEntityEClass = createEClass(DATABUS_ENTITY);
		createEAttribute(databusEntityEClass, DATABUS_ENTITY__STATUS);
		createEAttribute(databusEntityEClass, DATABUS_ENTITY__LAST_MODIFIED);
		createEAttribute(databusEntityEClass, DATABUS_ENTITY__TYPE);

		databusLocationEClass = createEClass(DATABUS_LOCATION);
		createEAttribute(databusLocationEClass, DATABUS_LOCATION__DCAE_LAYER);

		databusMessageRouterClusterEClass = createEClass(DATABUS_MESSAGE_ROUTER_CLUSTER);
		createEAttribute(databusMessageRouterClusterEClass, DATABUS_MESSAGE_ROUTER_CLUSTER__DCAE_LOCATION_NAME);
		createEAttribute(databusMessageRouterClusterEClass, DATABUS_MESSAGE_ROUTER_CLUSTER__SERVICE_FQDN);
		createEAttribute(databusMessageRouterClusterEClass, DATABUS_MESSAGE_ROUTER_CLUSTER__HOST_FQDN);
		createEAttribute(databusMessageRouterClusterEClass, DATABUS_MESSAGE_ROUTER_CLUSTER__TOPIC_PORT);
		createEAttribute(databusMessageRouterClusterEClass, DATABUS_MESSAGE_ROUTER_CLUSTER__TOPIC_PROTOCOL);

		databusDataRouterNodeEClass = createEClass(DATABUS_DATA_ROUTER_NODE);
		createEAttribute(databusDataRouterNodeEClass, DATABUS_DATA_ROUTER_NODE__DCAE_LOCATION_NAME);
		createEAttribute(databusDataRouterNodeEClass, DATABUS_DATA_ROUTER_NODE__HOST_FQDN);
		createEAttribute(databusDataRouterNodeEClass, DATABUS_DATA_ROUTER_NODE__VERSION);

		// Create enums
		databusStreamTopicActionEEnum = createEEnum(DATABUS_STREAM_TOPIC_ACTION);
		streamAuthenticationEEnum = createEEnum(STREAM_AUTHENTICATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dcaeStreamEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		dmaapStreamEClass.getESuperTypes().add(this.getDcaeStream());
		dcaeStreamDefinitionEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		dcaeStreamPublisherEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		dcaeStreamSubscriberEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		dcaeStreamPublisherExternalEClass.getESuperTypes().add(this.getDcaeStreamPublisher());
		dcaeStreamPublisherExternalEClass.getESuperTypes().add(this.getDcaeStreamExternalEndPoint());
		dcaeStreamPublisherInternalEClass.getESuperTypes().add(this.getDcaeStreamPublisher());
		dcaeStreamPublisherInternalEClass.getESuperTypes().add(this.getDcaeStreamInternalEndPoint());
		dcaeStreamSubscriberExternalEClass.getESuperTypes().add(this.getDcaeStreamSubscriber());
		dcaeStreamSubscriberExternalEClass.getESuperTypes().add(this.getDcaeStreamExternalEndPoint());
		dcaeStreamSubscriberInternalEClass.getESuperTypes().add(this.getDcaeStreamSubscriber());
		dcaeStreamSubscriberInternalEClass.getESuperTypes().add(this.getDcaeStreamInternalEndPoint());
		databusStreamEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		databusStreamTopicEClass.getESuperTypes().add(this.getDatabusStream());
		databusStreamTopicClientEClass.getESuperTypes().add(this.getDatabusStream());
		databusStreamFeedEClass.getESuperTypes().add(this.getDatabusStream());
		databusStreamFeedPublisherEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		databusStreamFeedSubscriberEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		databusEntityEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		databusLocationEClass.getESuperTypes().add(this.getDatabusEntity());
		databusMessageRouterClusterEClass.getESuperTypes().add(this.getDatabusEntity());
		databusDataRouterNodeEClass.getESuperTypes().add(this.getDatabusEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(dcaeStreamEClass, DcaeStream.class, "DcaeStream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dmaapStreamEClass, DmaapStream.class, "DmaapStream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDmaapStream_DmaapDataType(), theEcorePackage.getEString(), "dmaapDataType", null, 0, 1, DmaapStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmaapStream_DmaapAction(), theEcorePackage.getEString(), "dmaapAction", null, 0, 1, DmaapStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmaapStream_DmaapUrl(), theEcorePackage.getEString(), "dmaapUrl", null, 0, 1, DmaapStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmaapStream_DmaapUserName(), theEcorePackage.getEString(), "dmaapUserName", null, 0, 1, DmaapStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmaapStream_DmaapPassword(), theEcorePackage.getEString(), "dmaapPassword", null, 0, 1, DmaapStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmaapStream_DmaapAuthMethod(), theEcorePackage.getEString(), "dmaapAuthMethod", null, 0, 1, DmaapStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcaeStreamDefinitionEClass, DcaeStreamDefinition.class, "DcaeStreamDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDcaeStreamDefinition_StreamType(), theEcorePackage.getEString(), "streamType", null, 0, 1, DcaeStreamDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeStreamDefinition_DatabusType(), theEcorePackage.getEString(), "databusType", null, 0, 1, DcaeStreamDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcaeStreamDefinition_Publishers(), this.getDcaeStreamPublisher(), null, "publishers", null, 0, -1, DcaeStreamDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcaeStreamDefinition_Subscribers(), this.getDcaeStreamSubscriber(), null, "subscribers", null, 0, -1, DcaeStreamDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcaeStreamPublisherEClass, DcaeStreamPublisher.class, "DcaeStreamPublisher", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dcaeStreamSubscriberEClass, DcaeStreamSubscriber.class, "DcaeStreamSubscriber", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dcaeStreamPublisherExternalEClass, DcaeStreamPublisherExternal.class, "DcaeStreamPublisherExternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dcaeStreamPublisherInternalEClass, DcaeStreamPublisherInternal.class, "DcaeStreamPublisherInternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dcaeStreamSubscriberExternalEClass, DcaeStreamSubscriberExternal.class, "DcaeStreamSubscriberExternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dcaeStreamSubscriberInternalEClass, DcaeStreamSubscriberInternal.class, "DcaeStreamSubscriberInternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dcaeStreamInternalEndPointEClass, DcaeStreamInternalEndPoint.class, "DcaeStreamInternalEndPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDcaeStreamInternalEndPoint_LocalName(), theEcorePackage.getEString(), "localName", null, 0, 1, DcaeStreamInternalEndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeStreamInternalEndPoint_ServiceName(), theEcorePackage.getEString(), "serviceName", null, 0, 1, DcaeStreamInternalEndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcaeStreamExternalEndPointEClass, DcaeStreamExternalEndPoint.class, "DcaeStreamExternalEndPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDcaeStreamExternalEndPoint_User(), theEcorePackage.getEString(), "user", null, 0, 1, DcaeStreamExternalEndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeStreamExternalEndPoint_Password(), theEcorePackage.getEString(), "password", null, 0, 1, DcaeStreamExternalEndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeStreamExternalEndPoint_Url(), theEcorePackage.getEString(), "url", null, 0, 1, DcaeStreamExternalEndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databusStreamEClass, DatabusStream.class, "DatabusStream", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databusStreamTopicEClass, DatabusStreamTopic.class, "DatabusStreamTopic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabusStreamTopic_TopicName(), theEcorePackage.getEString(), "topicName", null, 0, 1, DatabusStreamTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamTopic_TopicDescription(), theEcorePackage.getEString(), "topicDescription", null, 0, 1, DatabusStreamTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamTopic_DcaeLocationName(), theEcorePackage.getEString(), "dcaeLocationName", null, 0, 1, DatabusStreamTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamTopic_Owner(), theEcorePackage.getEString(), "owner", null, 0, 1, DatabusStreamTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamTopic_Txenabled(), theEcorePackage.getEBoolean(), "txenabled", null, 0, 1, DatabusStreamTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamTopic_Fqtn(), theEcorePackage.getEString(), "fqtn", null, 0, 1, DatabusStreamTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamTopic_LastMod(), theEcorePackage.getEDate(), "lastMod", null, 0, 1, DatabusStreamTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamTopic_Status(), theEcorePackage.getEString(), "status", null, 0, 1, DatabusStreamTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabusStreamTopic_Clients(), this.getDatabusStreamTopicClient(), null, "clients", null, 0, -1, DatabusStreamTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamTopic_PublishURL(), theEcorePackage.getEString(), "publishURL", null, 0, 1, DatabusStreamTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamTopic_SubscribeURL(), theEcorePackage.getEString(), "subscribeURL", null, 0, 1, DatabusStreamTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamTopic_AuthenticationMethod(), this.getStreamAuthentication(), "authenticationMethod", null, 0, 1, DatabusStreamTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databusStreamTopicClientEClass, DatabusStreamTopicClient.class, "DatabusStreamTopicClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabusStreamTopicClient_LocalStreamId(), theEcorePackage.getEString(), "localStreamId", null, 0, 1, DatabusStreamTopicClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamTopicClient_DcaeLocationName(), theEcorePackage.getEString(), "dcaeLocationName", null, 0, 1, DatabusStreamTopicClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamTopicClient_ClientRole(), theEcorePackage.getEString(), "clientRole", null, 0, 1, DatabusStreamTopicClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamTopicClient_Action(), this.getDatabusStreamTopicAction(), "action", null, 0, -1, DatabusStreamTopicClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamTopicClient_Username(), theEcorePackage.getEString(), "username", null, 0, 1, DatabusStreamTopicClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamTopicClient_Userpwd(), theEcorePackage.getEString(), "userpwd", null, 0, 1, DatabusStreamTopicClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamTopicClient_Fqtn(), theEcorePackage.getEString(), "fqtn", null, 0, 1, DatabusStreamTopicClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamTopicClient_MrClientId(), theEcorePackage.getEString(), "mrClientId", null, 0, 1, DatabusStreamTopicClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamTopicClient_TopicURL(), theEcorePackage.getEString(), "topicURL", null, 0, 1, DatabusStreamTopicClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databusStreamFeedEClass, DatabusStreamFeed.class, "DatabusStreamFeed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabusStreamFeed_FeedName(), theEcorePackage.getEString(), "feedName", null, 0, 1, DatabusStreamFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeed_FeedVersion(), theEcorePackage.getEString(), "feedVersion", null, 0, 1, DatabusStreamFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeed_FeedDescription(), theEcorePackage.getEString(), "feedDescription", null, 0, 1, DatabusStreamFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeed_AsprClassification(), theEcorePackage.getEString(), "asprClassification", null, 0, 1, DatabusStreamFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeed_Owner(), theEcorePackage.getEString(), "owner", null, 0, 1, DatabusStreamFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeed_FeedId(), theEcorePackage.getEString(), "feedId", null, 0, 1, DatabusStreamFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeed_LogURL(), theEcorePackage.getEString(), "logURL", null, 0, 1, DatabusStreamFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeed_PublishURL(), theEcorePackage.getEString(), "publishURL", null, 0, 1, DatabusStreamFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeed_SubscribeURL(), theEcorePackage.getEString(), "subscribeURL", null, 0, 1, DatabusStreamFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeed_Status(), theEcorePackage.getEString(), "status", null, 0, 1, DatabusStreamFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeed_Suspended(), theEcorePackage.getEString(), "suspended", null, 0, 1, DatabusStreamFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabusStreamFeed_Publishers(), this.getDatabusStreamFeedPublisher(), null, "publishers", null, 0, -1, DatabusStreamFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabusStreamFeed_Subscribers(), this.getDatabusStreamFeedSubscriber(), null, "subscribers", null, 0, -1, DatabusStreamFeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databusStreamFeedPublisherEClass, DatabusStreamFeedPublisher.class, "DatabusStreamFeedPublisher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabusStreamFeedPublisher_LocalStreamId(), theEcorePackage.getEString(), "localStreamId", null, 0, 1, DatabusStreamFeedPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeedPublisher_DcaeLocationName(), theEcorePackage.getEString(), "dcaeLocationName", null, 0, 1, DatabusStreamFeedPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeedPublisher_FeedId(), theEcorePackage.getEString(), "feedId", null, 0, 1, DatabusStreamFeedPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeedPublisher_PubId(), theEcorePackage.getEString(), "pubId", null, 0, 1, DatabusStreamFeedPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeedPublisher_Status(), theEcorePackage.getEString(), "status", null, 0, 1, DatabusStreamFeedPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeedPublisher_Username(), theEcorePackage.getEString(), "username", null, 0, 1, DatabusStreamFeedPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeedPublisher_Userpwd(), theEcorePackage.getEString(), "userpwd", null, 0, 1, DatabusStreamFeedPublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databusStreamFeedSubscriberEClass, DatabusStreamFeedSubscriber.class, "DatabusStreamFeedSubscriber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabusStreamFeedSubscriber_LocalStreamId(), theEcorePackage.getEString(), "localStreamId", null, 0, 1, DatabusStreamFeedSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeedSubscriber_DcaeLocationName(), theEcorePackage.getEString(), "dcaeLocationName", null, 0, 1, DatabusStreamFeedSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeedSubscriber_OtherFeedName(), theEcorePackage.getEString(), "otherFeedName", null, 0, 1, DatabusStreamFeedSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeedSubscriber_FeedId(), theEcorePackage.getEString(), "feedId", null, 0, 1, DatabusStreamFeedSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeedSubscriber_LogURL(), theEcorePackage.getEString(), "logURL", null, 0, 1, DatabusStreamFeedSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeedSubscriber_Owner(), theEcorePackage.getEString(), "owner", null, 0, 1, DatabusStreamFeedSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeedSubscriber_SubId(), theEcorePackage.getEString(), "subId", null, 0, 1, DatabusStreamFeedSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeedSubscriber_Suspended(), theEcorePackage.getEBoolean(), "suspended", null, 0, 1, DatabusStreamFeedSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeedSubscriber_Use100(), theEcorePackage.getEBoolean(), "use100", null, 0, 1, DatabusStreamFeedSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeedSubscriber_Username(), theEcorePackage.getEString(), "username", null, 0, 1, DatabusStreamFeedSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeedSubscriber_Userpwd(), theEcorePackage.getEString(), "userpwd", null, 0, 1, DatabusStreamFeedSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusStreamFeedSubscriber_DeliveryURL(), theEcorePackage.getEString(), "deliveryURL", null, 0, 1, DatabusStreamFeedSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databusEntityEClass, DatabusEntity.class, "DatabusEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabusEntity_Status(), theEcorePackage.getEString(), "status", null, 0, 1, DatabusEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusEntity_LastModified(), theEcorePackage.getEDate(), "lastModified", null, 0, 1, DatabusEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusEntity_Type(), theEcorePackage.getEString(), "type", null, 0, 1, DatabusEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databusLocationEClass, DatabusLocation.class, "DatabusLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabusLocation_DcaeLayer(), theEcorePackage.getEString(), "dcaeLayer", null, 0, 1, DatabusLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databusMessageRouterClusterEClass, DatabusMessageRouterCluster.class, "DatabusMessageRouterCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabusMessageRouterCluster_DcaeLocationName(), theEcorePackage.getEString(), "dcaeLocationName", null, 0, 1, DatabusMessageRouterCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusMessageRouterCluster_ServiceFqdn(), theEcorePackage.getEString(), "serviceFqdn", null, 0, 1, DatabusMessageRouterCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusMessageRouterCluster_HostFqdn(), theEcorePackage.getEString(), "hostFqdn", null, 0, -1, DatabusMessageRouterCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusMessageRouterCluster_TopicPort(), theEcorePackage.getEString(), "topicPort", null, 0, 1, DatabusMessageRouterCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusMessageRouterCluster_TopicProtocol(), theEcorePackage.getEString(), "topicProtocol", null, 0, 1, DatabusMessageRouterCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databusDataRouterNodeEClass, DatabusDataRouterNode.class, "DatabusDataRouterNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabusDataRouterNode_DcaeLocationName(), theEcorePackage.getEString(), "dcaeLocationName", null, 0, 1, DatabusDataRouterNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusDataRouterNode_HostFqdn(), theEcorePackage.getEString(), "hostFqdn", null, 0, 1, DatabusDataRouterNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabusDataRouterNode_Version(), theEcorePackage.getEString(), "version", null, 0, 1, DatabusDataRouterNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(databusStreamTopicActionEEnum, DatabusStreamTopicAction.class, "DatabusStreamTopicAction");
		addEEnumLiteral(databusStreamTopicActionEEnum, DatabusStreamTopicAction.PUB);
		addEEnumLiteral(databusStreamTopicActionEEnum, DatabusStreamTopicAction.SUB);
		addEEnumLiteral(databusStreamTopicActionEEnum, DatabusStreamTopicAction.VIEW);

		initEEnum(streamAuthenticationEEnum, StreamAuthentication.class, "StreamAuthentication");
		addEEnumLiteral(streamAuthenticationEEnum, StreamAuthentication.AAF);
		addEEnumLiteral(streamAuthenticationEEnum, StreamAuthentication.NONE);
		addEEnumLiteral(streamAuthenticationEEnum, StreamAuthentication.PASSWORD);

		// Create resource
		createResource(eNS_URI);
	}

} //StreamPackageImpl
