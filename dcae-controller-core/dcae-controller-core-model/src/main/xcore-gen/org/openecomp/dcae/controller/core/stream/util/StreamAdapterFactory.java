
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
package org.openecomp.dcae.controller.core.stream.util;

import org.openecomp.dcae.controller.core.stream.*;

import org.openecomp.ncomp.core.NamedEntity;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.core.stream.StreamPackage
 * @generated
 */
public class StreamAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StreamPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StreamPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamSwitch<Adapter> modelSwitch =
		new StreamSwitch<Adapter>() {
			@Override
			public Adapter caseDcaeStream(DcaeStream object) {
				return createDcaeStreamAdapter();
			}
			@Override
			public Adapter caseDmaapStream(DmaapStream object) {
				return createDmaapStreamAdapter();
			}
			@Override
			public Adapter caseDcaeStreamDefinition(DcaeStreamDefinition object) {
				return createDcaeStreamDefinitionAdapter();
			}
			@Override
			public Adapter caseDcaeStreamPublisher(DcaeStreamPublisher object) {
				return createDcaeStreamPublisherAdapter();
			}
			@Override
			public Adapter caseDcaeStreamSubscriber(DcaeStreamSubscriber object) {
				return createDcaeStreamSubscriberAdapter();
			}
			@Override
			public Adapter caseDcaeStreamPublisherExternal(DcaeStreamPublisherExternal object) {
				return createDcaeStreamPublisherExternalAdapter();
			}
			@Override
			public Adapter caseDcaeStreamPublisherInternal(DcaeStreamPublisherInternal object) {
				return createDcaeStreamPublisherInternalAdapter();
			}
			@Override
			public Adapter caseDcaeStreamSubscriberExternal(DcaeStreamSubscriberExternal object) {
				return createDcaeStreamSubscriberExternalAdapter();
			}
			@Override
			public Adapter caseDcaeStreamSubscriberInternal(DcaeStreamSubscriberInternal object) {
				return createDcaeStreamSubscriberInternalAdapter();
			}
			@Override
			public Adapter caseDcaeStreamInternalEndPoint(DcaeStreamInternalEndPoint object) {
				return createDcaeStreamInternalEndPointAdapter();
			}
			@Override
			public Adapter caseDcaeStreamExternalEndPoint(DcaeStreamExternalEndPoint object) {
				return createDcaeStreamExternalEndPointAdapter();
			}
			@Override
			public Adapter caseDatabusStream(DatabusStream object) {
				return createDatabusStreamAdapter();
			}
			@Override
			public Adapter caseDatabusStreamTopic(DatabusStreamTopic object) {
				return createDatabusStreamTopicAdapter();
			}
			@Override
			public Adapter caseDatabusStreamTopicClient(DatabusStreamTopicClient object) {
				return createDatabusStreamTopicClientAdapter();
			}
			@Override
			public Adapter caseDatabusStreamFeed(DatabusStreamFeed object) {
				return createDatabusStreamFeedAdapter();
			}
			@Override
			public Adapter caseDatabusStreamFeedPublisher(DatabusStreamFeedPublisher object) {
				return createDatabusStreamFeedPublisherAdapter();
			}
			@Override
			public Adapter caseDatabusStreamFeedSubscriber(DatabusStreamFeedSubscriber object) {
				return createDatabusStreamFeedSubscriberAdapter();
			}
			@Override
			public Adapter caseDatabusEntity(DatabusEntity object) {
				return createDatabusEntityAdapter();
			}
			@Override
			public Adapter caseDatabusLocation(DatabusLocation object) {
				return createDatabusLocationAdapter();
			}
			@Override
			public Adapter caseDatabusMessageRouterCluster(DatabusMessageRouterCluster object) {
				return createDatabusMessageRouterClusterAdapter();
			}
			@Override
			public Adapter caseDatabusDataRouterNode(DatabusDataRouterNode object) {
				return createDatabusDataRouterNodeAdapter();
			}
			@Override
			public Adapter caseNamedEntity(NamedEntity object) {
				return createNamedEntityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DcaeStream <em>Dcae Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStream
	 * @generated
	 */
	public Adapter createDcaeStreamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DmaapStream <em>Dmaap Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DmaapStream
	 * @generated
	 */
	public Adapter createDmaapStreamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition <em>Dcae Stream Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition
	 * @generated
	 */
	public Adapter createDcaeStreamDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamPublisher <em>Dcae Stream Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamPublisher
	 * @generated
	 */
	public Adapter createDcaeStreamPublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamSubscriber <em>Dcae Stream Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamSubscriber
	 * @generated
	 */
	public Adapter createDcaeStreamSubscriberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamPublisherExternal <em>Dcae Stream Publisher External</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamPublisherExternal
	 * @generated
	 */
	public Adapter createDcaeStreamPublisherExternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamPublisherInternal <em>Dcae Stream Publisher Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamPublisherInternal
	 * @generated
	 */
	public Adapter createDcaeStreamPublisherInternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamSubscriberExternal <em>Dcae Stream Subscriber External</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamSubscriberExternal
	 * @generated
	 */
	public Adapter createDcaeStreamSubscriberExternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamSubscriberInternal <em>Dcae Stream Subscriber Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamSubscriberInternal
	 * @generated
	 */
	public Adapter createDcaeStreamSubscriberInternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamInternalEndPoint <em>Dcae Stream Internal End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamInternalEndPoint
	 * @generated
	 */
	public Adapter createDcaeStreamInternalEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamExternalEndPoint <em>Dcae Stream External End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DcaeStreamExternalEndPoint
	 * @generated
	 */
	public Adapter createDcaeStreamExternalEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DatabusStream <em>Databus Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStream
	 * @generated
	 */
	public Adapter createDatabusStreamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic <em>Databus Stream Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopic
	 * @generated
	 */
	public Adapter createDatabusStreamTopicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient <em>Databus Stream Topic Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient
	 * @generated
	 */
	public Adapter createDatabusStreamTopicClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed <em>Databus Stream Feed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeed
	 * @generated
	 */
	public Adapter createDatabusStreamFeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher <em>Databus Stream Feed Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher
	 * @generated
	 */
	public Adapter createDatabusStreamFeedPublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber <em>Databus Stream Feed Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber
	 * @generated
	 */
	public Adapter createDatabusStreamFeedSubscriberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DatabusEntity <em>Databus Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusEntity
	 * @generated
	 */
	public Adapter createDatabusEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DatabusLocation <em>Databus Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusLocation
	 * @generated
	 */
	public Adapter createDatabusLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster <em>Databus Message Router Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster
	 * @generated
	 */
	public Adapter createDatabusMessageRouterClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode <em>Databus Data Router Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode
	 * @generated
	 */
	public Adapter createDatabusDataRouterNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.core.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.core.NamedEntity
	 * @generated
	 */
	public Adapter createNamedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StreamAdapterFactory
