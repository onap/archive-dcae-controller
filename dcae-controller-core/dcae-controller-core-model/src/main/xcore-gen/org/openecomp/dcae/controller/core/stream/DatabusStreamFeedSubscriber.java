
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

import org.openecomp.ncomp.core.NamedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Databus Stream Feed Subscriber</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getLocalStreamId <em>Local Stream Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getDcaeLocationName <em>Dcae Location Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getOtherFeedName <em>Other Feed Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getFeedId <em>Feed Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getLogURL <em>Log URL</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getSubId <em>Sub Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#isSuspended <em>Suspended</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#isUse100 <em>Use100</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getUsername <em>Username</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getUserpwd <em>Userpwd</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getDeliveryURL <em>Delivery URL</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedSubscriber()
 * @model
 * @generated
 */
public interface DatabusStreamFeedSubscriber extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Local Stream Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Stream Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Stream Id</em>' attribute.
	 * @see #setLocalStreamId(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedSubscriber_LocalStreamId()
	 * @model unique="false"
	 * @generated
	 */
	String getLocalStreamId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getLocalStreamId <em>Local Stream Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Stream Id</em>' attribute.
	 * @see #getLocalStreamId()
	 * @generated
	 */
	void setLocalStreamId(String value);

	/**
	 * Returns the value of the '<em><b>Dcae Location Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dcae Location Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dcae Location Name</em>' attribute.
	 * @see #setDcaeLocationName(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedSubscriber_DcaeLocationName()
	 * @model unique="false"
	 * @generated
	 */
	String getDcaeLocationName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getDcaeLocationName <em>Dcae Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcae Location Name</em>' attribute.
	 * @see #getDcaeLocationName()
	 * @generated
	 */
	void setDcaeLocationName(String value);

	/**
	 * Returns the value of the '<em><b>Other Feed Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Feed Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Feed Name</em>' attribute.
	 * @see #setOtherFeedName(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedSubscriber_OtherFeedName()
	 * @model unique="false"
	 * @generated
	 */
	String getOtherFeedName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getOtherFeedName <em>Other Feed Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Feed Name</em>' attribute.
	 * @see #getOtherFeedName()
	 * @generated
	 */
	void setOtherFeedName(String value);

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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedSubscriber_FeedId()
	 * @model unique="false"
	 * @generated
	 */
	String getFeedId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getFeedId <em>Feed Id</em>}' attribute.
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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedSubscriber_LogURL()
	 * @model unique="false"
	 * @generated
	 */
	String getLogURL();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getLogURL <em>Log URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log URL</em>' attribute.
	 * @see #getLogURL()
	 * @generated
	 */
	void setLogURL(String value);

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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedSubscriber_Owner()
	 * @model unique="false"
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Sub Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Id</em>' attribute.
	 * @see #setSubId(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedSubscriber_SubId()
	 * @model unique="false"
	 * @generated
	 */
	String getSubId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getSubId <em>Sub Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Id</em>' attribute.
	 * @see #getSubId()
	 * @generated
	 */
	void setSubId(String value);

	/**
	 * Returns the value of the '<em><b>Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspended</em>' attribute.
	 * @see #setSuspended(boolean)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedSubscriber_Suspended()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSuspended();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#isSuspended <em>Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspended</em>' attribute.
	 * @see #isSuspended()
	 * @generated
	 */
	void setSuspended(boolean value);

	/**
	 * Returns the value of the '<em><b>Use100</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use100</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use100</em>' attribute.
	 * @see #setUse100(boolean)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedSubscriber_Use100()
	 * @model unique="false"
	 * @generated
	 */
	boolean isUse100();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#isUse100 <em>Use100</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use100</em>' attribute.
	 * @see #isUse100()
	 * @generated
	 */
	void setUse100(boolean value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedSubscriber_Username()
	 * @model unique="false"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Userpwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Userpwd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userpwd</em>' attribute.
	 * @see #setUserpwd(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedSubscriber_Userpwd()
	 * @model unique="false"
	 * @generated
	 */
	String getUserpwd();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getUserpwd <em>Userpwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userpwd</em>' attribute.
	 * @see #getUserpwd()
	 * @generated
	 */
	void setUserpwd(String value);

	/**
	 * Returns the value of the '<em><b>Delivery URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivery URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery URL</em>' attribute.
	 * @see #setDeliveryURL(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedSubscriber_DeliveryURL()
	 * @model unique="false"
	 * @generated
	 */
	String getDeliveryURL();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber#getDeliveryURL <em>Delivery URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery URL</em>' attribute.
	 * @see #getDeliveryURL()
	 * @generated
	 */
	void setDeliveryURL(String value);

} // DatabusStreamFeedSubscriber
