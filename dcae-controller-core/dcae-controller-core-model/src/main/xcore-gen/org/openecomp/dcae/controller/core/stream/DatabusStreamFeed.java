
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

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Databus Stream Feed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getFeedName <em>Feed Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getFeedVersion <em>Feed Version</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getFeedDescription <em>Feed Description</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getAsprClassification <em>Aspr Classification</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getFeedId <em>Feed Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getLogURL <em>Log URL</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getPublishURL <em>Publish URL</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getSubscribeURL <em>Subscribe URL</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getSuspended <em>Suspended</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getSubscribers <em>Subscribers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeed()
 * @model
 * @generated
 */
public interface DatabusStreamFeed extends DatabusStream {

	/**
	 * Returns the value of the '<em><b>Feed Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feed Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feed Name</em>' attribute.
	 * @see #setFeedName(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeed_FeedName()
	 * @model unique="false"
	 * @generated
	 */
	String getFeedName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getFeedName <em>Feed Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed Name</em>' attribute.
	 * @see #getFeedName()
	 * @generated
	 */
	void setFeedName(String value);

	/**
	 * Returns the value of the '<em><b>Feed Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feed Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feed Version</em>' attribute.
	 * @see #setFeedVersion(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeed_FeedVersion()
	 * @model unique="false"
	 * @generated
	 */
	String getFeedVersion();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getFeedVersion <em>Feed Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed Version</em>' attribute.
	 * @see #getFeedVersion()
	 * @generated
	 */
	void setFeedVersion(String value);

	/**
	 * Returns the value of the '<em><b>Feed Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feed Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feed Description</em>' attribute.
	 * @see #setFeedDescription(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeed_FeedDescription()
	 * @model unique="false"
	 * @generated
	 */
	String getFeedDescription();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getFeedDescription <em>Feed Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed Description</em>' attribute.
	 * @see #getFeedDescription()
	 * @generated
	 */
	void setFeedDescription(String value);

	/**
	 * Returns the value of the '<em><b>Aspr Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspr Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspr Classification</em>' attribute.
	 * @see #setAsprClassification(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeed_AsprClassification()
	 * @model unique="false"
	 * @generated
	 */
	String getAsprClassification();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getAsprClassification <em>Aspr Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspr Classification</em>' attribute.
	 * @see #getAsprClassification()
	 * @generated
	 */
	void setAsprClassification(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeed_Owner()
	 * @model unique="false"
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Feed Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feed Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feed Id</em>' attribute.
	 * @see #setFeedId(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeed_FeedId()
	 * @model unique="false"
	 * @generated
	 */
	String getFeedId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getFeedId <em>Feed Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed Id</em>' attribute.
	 * @see #getFeedId()
	 * @generated
	 */
	void setFeedId(String value);

	/**
	 * Returns the value of the '<em><b>Log URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log URL</em>' attribute.
	 * @see #setLogURL(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeed_LogURL()
	 * @model unique="false"
	 * @generated
	 */
	String getLogURL();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getLogURL <em>Log URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log URL</em>' attribute.
	 * @see #getLogURL()
	 * @generated
	 */
	void setLogURL(String value);

	/**
	 * Returns the value of the '<em><b>Publish URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publish URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish URL</em>' attribute.
	 * @see #setPublishURL(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeed_PublishURL()
	 * @model unique="false"
	 * @generated
	 */
	String getPublishURL();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getPublishURL <em>Publish URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish URL</em>' attribute.
	 * @see #getPublishURL()
	 * @generated
	 */
	void setPublishURL(String value);

	/**
	 * Returns the value of the '<em><b>Subscribe URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribe URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe URL</em>' attribute.
	 * @see #setSubscribeURL(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeed_SubscribeURL()
	 * @model unique="false"
	 * @generated
	 */
	String getSubscribeURL();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getSubscribeURL <em>Subscribe URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe URL</em>' attribute.
	 * @see #getSubscribeURL()
	 * @generated
	 */
	void setSubscribeURL(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeed_Status()
	 * @model unique="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspended</em>' attribute.
	 * @see #setSuspended(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeed_Suspended()
	 * @model unique="false"
	 * @generated
	 */
	String getSuspended();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeed#getSuspended <em>Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspended</em>' attribute.
	 * @see #getSuspended()
	 * @generated
	 */
	void setSuspended(String value);

	/**
	 * Returns the value of the '<em><b>Publishers</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publishers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishers</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeed_Publishers()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatabusStreamFeedPublisher> getPublishers();

	/**
	 * Returns the value of the '<em><b>Subscribers</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribers</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeed_Subscribers()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatabusStreamFeedSubscriber> getSubscribers();
} // DatabusStreamFeed
