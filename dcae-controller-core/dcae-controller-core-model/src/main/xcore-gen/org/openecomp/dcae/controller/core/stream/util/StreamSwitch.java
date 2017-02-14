
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.core.stream.StreamPackage
 * @generated
 */
public class StreamSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StreamPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamSwitch() {
		if (modelPackage == null) {
			modelPackage = StreamPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StreamPackage.DCAE_STREAM: {
				DcaeStream dcaeStream = (DcaeStream)theEObject;
				T result = caseDcaeStream(dcaeStream);
				if (result == null) result = caseNamedEntity(dcaeStream);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DMAAP_STREAM: {
				DmaapStream dmaapStream = (DmaapStream)theEObject;
				T result = caseDmaapStream(dmaapStream);
				if (result == null) result = caseDcaeStream(dmaapStream);
				if (result == null) result = caseNamedEntity(dmaapStream);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DCAE_STREAM_DEFINITION: {
				DcaeStreamDefinition dcaeStreamDefinition = (DcaeStreamDefinition)theEObject;
				T result = caseDcaeStreamDefinition(dcaeStreamDefinition);
				if (result == null) result = caseNamedEntity(dcaeStreamDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DCAE_STREAM_PUBLISHER: {
				DcaeStreamPublisher dcaeStreamPublisher = (DcaeStreamPublisher)theEObject;
				T result = caseDcaeStreamPublisher(dcaeStreamPublisher);
				if (result == null) result = caseNamedEntity(dcaeStreamPublisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DCAE_STREAM_SUBSCRIBER: {
				DcaeStreamSubscriber dcaeStreamSubscriber = (DcaeStreamSubscriber)theEObject;
				T result = caseDcaeStreamSubscriber(dcaeStreamSubscriber);
				if (result == null) result = caseNamedEntity(dcaeStreamSubscriber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DCAE_STREAM_PUBLISHER_EXTERNAL: {
				DcaeStreamPublisherExternal dcaeStreamPublisherExternal = (DcaeStreamPublisherExternal)theEObject;
				T result = caseDcaeStreamPublisherExternal(dcaeStreamPublisherExternal);
				if (result == null) result = caseDcaeStreamPublisher(dcaeStreamPublisherExternal);
				if (result == null) result = caseDcaeStreamExternalEndPoint(dcaeStreamPublisherExternal);
				if (result == null) result = caseNamedEntity(dcaeStreamPublisherExternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DCAE_STREAM_PUBLISHER_INTERNAL: {
				DcaeStreamPublisherInternal dcaeStreamPublisherInternal = (DcaeStreamPublisherInternal)theEObject;
				T result = caseDcaeStreamPublisherInternal(dcaeStreamPublisherInternal);
				if (result == null) result = caseDcaeStreamPublisher(dcaeStreamPublisherInternal);
				if (result == null) result = caseDcaeStreamInternalEndPoint(dcaeStreamPublisherInternal);
				if (result == null) result = caseNamedEntity(dcaeStreamPublisherInternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DCAE_STREAM_SUBSCRIBER_EXTERNAL: {
				DcaeStreamSubscriberExternal dcaeStreamSubscriberExternal = (DcaeStreamSubscriberExternal)theEObject;
				T result = caseDcaeStreamSubscriberExternal(dcaeStreamSubscriberExternal);
				if (result == null) result = caseDcaeStreamSubscriber(dcaeStreamSubscriberExternal);
				if (result == null) result = caseDcaeStreamExternalEndPoint(dcaeStreamSubscriberExternal);
				if (result == null) result = caseNamedEntity(dcaeStreamSubscriberExternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DCAE_STREAM_SUBSCRIBER_INTERNAL: {
				DcaeStreamSubscriberInternal dcaeStreamSubscriberInternal = (DcaeStreamSubscriberInternal)theEObject;
				T result = caseDcaeStreamSubscriberInternal(dcaeStreamSubscriberInternal);
				if (result == null) result = caseDcaeStreamSubscriber(dcaeStreamSubscriberInternal);
				if (result == null) result = caseDcaeStreamInternalEndPoint(dcaeStreamSubscriberInternal);
				if (result == null) result = caseNamedEntity(dcaeStreamSubscriberInternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DCAE_STREAM_INTERNAL_END_POINT: {
				DcaeStreamInternalEndPoint dcaeStreamInternalEndPoint = (DcaeStreamInternalEndPoint)theEObject;
				T result = caseDcaeStreamInternalEndPoint(dcaeStreamInternalEndPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DCAE_STREAM_EXTERNAL_END_POINT: {
				DcaeStreamExternalEndPoint dcaeStreamExternalEndPoint = (DcaeStreamExternalEndPoint)theEObject;
				T result = caseDcaeStreamExternalEndPoint(dcaeStreamExternalEndPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DATABUS_STREAM: {
				DatabusStream databusStream = (DatabusStream)theEObject;
				T result = caseDatabusStream(databusStream);
				if (result == null) result = caseNamedEntity(databusStream);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DATABUS_STREAM_TOPIC: {
				DatabusStreamTopic databusStreamTopic = (DatabusStreamTopic)theEObject;
				T result = caseDatabusStreamTopic(databusStreamTopic);
				if (result == null) result = caseDatabusStream(databusStreamTopic);
				if (result == null) result = caseNamedEntity(databusStreamTopic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DATABUS_STREAM_TOPIC_CLIENT: {
				DatabusStreamTopicClient databusStreamTopicClient = (DatabusStreamTopicClient)theEObject;
				T result = caseDatabusStreamTopicClient(databusStreamTopicClient);
				if (result == null) result = caseDatabusStream(databusStreamTopicClient);
				if (result == null) result = caseNamedEntity(databusStreamTopicClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DATABUS_STREAM_FEED: {
				DatabusStreamFeed databusStreamFeed = (DatabusStreamFeed)theEObject;
				T result = caseDatabusStreamFeed(databusStreamFeed);
				if (result == null) result = caseDatabusStream(databusStreamFeed);
				if (result == null) result = caseNamedEntity(databusStreamFeed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DATABUS_STREAM_FEED_PUBLISHER: {
				DatabusStreamFeedPublisher databusStreamFeedPublisher = (DatabusStreamFeedPublisher)theEObject;
				T result = caseDatabusStreamFeedPublisher(databusStreamFeedPublisher);
				if (result == null) result = caseNamedEntity(databusStreamFeedPublisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DATABUS_STREAM_FEED_SUBSCRIBER: {
				DatabusStreamFeedSubscriber databusStreamFeedSubscriber = (DatabusStreamFeedSubscriber)theEObject;
				T result = caseDatabusStreamFeedSubscriber(databusStreamFeedSubscriber);
				if (result == null) result = caseNamedEntity(databusStreamFeedSubscriber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DATABUS_ENTITY: {
				DatabusEntity databusEntity = (DatabusEntity)theEObject;
				T result = caseDatabusEntity(databusEntity);
				if (result == null) result = caseNamedEntity(databusEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DATABUS_LOCATION: {
				DatabusLocation databusLocation = (DatabusLocation)theEObject;
				T result = caseDatabusLocation(databusLocation);
				if (result == null) result = caseDatabusEntity(databusLocation);
				if (result == null) result = caseNamedEntity(databusLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DATABUS_MESSAGE_ROUTER_CLUSTER: {
				DatabusMessageRouterCluster databusMessageRouterCluster = (DatabusMessageRouterCluster)theEObject;
				T result = caseDatabusMessageRouterCluster(databusMessageRouterCluster);
				if (result == null) result = caseDatabusEntity(databusMessageRouterCluster);
				if (result == null) result = caseNamedEntity(databusMessageRouterCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamPackage.DATABUS_DATA_ROUTER_NODE: {
				DatabusDataRouterNode databusDataRouterNode = (DatabusDataRouterNode)theEObject;
				T result = caseDatabusDataRouterNode(databusDataRouterNode);
				if (result == null) result = caseDatabusEntity(databusDataRouterNode);
				if (result == null) result = caseNamedEntity(databusDataRouterNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Stream</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Stream</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeStream(DcaeStream object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dmaap Stream</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dmaap Stream</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmaapStream(DmaapStream object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Stream Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Stream Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeStreamDefinition(DcaeStreamDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Stream Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Stream Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeStreamPublisher(DcaeStreamPublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Stream Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Stream Subscriber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeStreamSubscriber(DcaeStreamSubscriber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Stream Publisher External</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Stream Publisher External</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeStreamPublisherExternal(DcaeStreamPublisherExternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Stream Publisher Internal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Stream Publisher Internal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeStreamPublisherInternal(DcaeStreamPublisherInternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Stream Subscriber External</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Stream Subscriber External</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeStreamSubscriberExternal(DcaeStreamSubscriberExternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Stream Subscriber Internal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Stream Subscriber Internal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeStreamSubscriberInternal(DcaeStreamSubscriberInternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Stream Internal End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Stream Internal End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeStreamInternalEndPoint(DcaeStreamInternalEndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Stream External End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Stream External End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeStreamExternalEndPoint(DcaeStreamExternalEndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Databus Stream</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Databus Stream</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabusStream(DatabusStream object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Databus Stream Topic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Databus Stream Topic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabusStreamTopic(DatabusStreamTopic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Databus Stream Topic Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Databus Stream Topic Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabusStreamTopicClient(DatabusStreamTopicClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Databus Stream Feed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Databus Stream Feed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabusStreamFeed(DatabusStreamFeed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Databus Stream Feed Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Databus Stream Feed Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabusStreamFeedPublisher(DatabusStreamFeedPublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Databus Stream Feed Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Databus Stream Feed Subscriber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabusStreamFeedSubscriber(DatabusStreamFeedSubscriber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Databus Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Databus Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabusEntity(DatabusEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Databus Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Databus Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabusLocation(DatabusLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Databus Message Router Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Databus Message Router Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabusMessageRouterCluster(DatabusMessageRouterCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Databus Data Router Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Databus Data Router Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabusDataRouterNode(DatabusDataRouterNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StreamSwitch
