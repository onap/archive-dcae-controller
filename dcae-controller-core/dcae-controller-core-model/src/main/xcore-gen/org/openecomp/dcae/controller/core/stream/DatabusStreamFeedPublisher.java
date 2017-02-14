
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
 * A representation of the model object '<em><b>Databus Stream Feed Publisher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getLocalStreamId <em>Local Stream Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getDcaeLocationName <em>Dcae Location Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getFeedId <em>Feed Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getPubId <em>Pub Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getUsername <em>Username</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getUserpwd <em>Userpwd</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedPublisher()
 * @model
 * @generated
 */
public interface DatabusStreamFeedPublisher extends NamedEntity {
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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedPublisher_LocalStreamId()
	 * @model unique="false"
	 * @generated
	 */
	String getLocalStreamId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getLocalStreamId <em>Local Stream Id</em>}' attribute.
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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedPublisher_DcaeLocationName()
	 * @model unique="false"
	 * @generated
	 */
	String getDcaeLocationName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getDcaeLocationName <em>Dcae Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcae Location Name</em>' attribute.
	 * @see #getDcaeLocationName()
	 * @generated
	 */
	void setDcaeLocationName(String value);

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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedPublisher_FeedId()
	 * @model unique="false"
	 * @generated
	 */
	String getFeedId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getFeedId <em>Feed Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed Id</em>' attribute.
	 * @see #getFeedId()
	 * @generated
	 */
	void setFeedId(String value);

	/**
	 * Returns the value of the '<em><b>Pub Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pub Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pub Id</em>' attribute.
	 * @see #setPubId(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedPublisher_PubId()
	 * @model unique="false"
	 * @generated
	 */
	String getPubId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getPubId <em>Pub Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pub Id</em>' attribute.
	 * @see #getPubId()
	 * @generated
	 */
	void setPubId(String value);

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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedPublisher_Status()
	 * @model unique="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedPublisher_Username()
	 * @model unique="false"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getUsername <em>Username</em>}' attribute.
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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamFeedPublisher_Userpwd()
	 * @model unique="false"
	 * @generated
	 */
	String getUserpwd();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher#getUserpwd <em>Userpwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userpwd</em>' attribute.
	 * @see #getUserpwd()
	 * @generated
	 */
	void setUserpwd(String value);

} // DatabusStreamFeedPublisher
