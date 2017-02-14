
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
 * A representation of the model object '<em><b>Databus Stream Topic Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getLocalStreamId <em>Local Stream Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getDcaeLocationName <em>Dcae Location Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getClientRole <em>Client Role</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getAction <em>Action</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getUsername <em>Username</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getUserpwd <em>Userpwd</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getFqtn <em>Fqtn</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getMrClientId <em>Mr Client Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getTopicURL <em>Topic URL</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopicClient()
 * @model
 * @generated
 */
public interface DatabusStreamTopicClient extends DatabusStream {
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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopicClient_LocalStreamId()
	 * @model unique="false"
	 * @generated
	 */
	String getLocalStreamId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getLocalStreamId <em>Local Stream Id</em>}' attribute.
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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopicClient_DcaeLocationName()
	 * @model unique="false"
	 * @generated
	 */
	String getDcaeLocationName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getDcaeLocationName <em>Dcae Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcae Location Name</em>' attribute.
	 * @see #getDcaeLocationName()
	 * @generated
	 */
	void setDcaeLocationName(String value);

	/**
	 * Returns the value of the '<em><b>Client Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Role</em>' attribute.
	 * @see #setClientRole(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopicClient_ClientRole()
	 * @model unique="false"
	 * @generated
	 */
	String getClientRole();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getClientRole <em>Client Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Role</em>' attribute.
	 * @see #getClientRole()
	 * @generated
	 */
	void setClientRole(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicAction}.
	 * The literals are from the enumeration {@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute list.
	 * @see org.openecomp.dcae.controller.core.stream.DatabusStreamTopicAction
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopicClient_Action()
	 * @model unique="false"
	 * @generated
	 */
	EList<DatabusStreamTopicAction> getAction();

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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopicClient_Username()
	 * @model unique="false"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getUsername <em>Username</em>}' attribute.
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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopicClient_Userpwd()
	 * @model unique="false"
	 * @generated
	 */
	String getUserpwd();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getUserpwd <em>Userpwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userpwd</em>' attribute.
	 * @see #getUserpwd()
	 * @generated
	 */
	void setUserpwd(String value);

	/**
	 * Returns the value of the '<em><b>Fqtn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fqtn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fqtn</em>' attribute.
	 * @see #setFqtn(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopicClient_Fqtn()
	 * @model unique="false"
	 * @generated
	 */
	String getFqtn();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getFqtn <em>Fqtn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fqtn</em>' attribute.
	 * @see #getFqtn()
	 * @generated
	 */
	void setFqtn(String value);

	/**
	 * Returns the value of the '<em><b>Mr Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mr Client Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mr Client Id</em>' attribute.
	 * @see #setMrClientId(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopicClient_MrClientId()
	 * @model unique="false"
	 * @generated
	 */
	String getMrClientId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getMrClientId <em>Mr Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mr Client Id</em>' attribute.
	 * @see #getMrClientId()
	 * @generated
	 */
	void setMrClientId(String value);

	/**
	 * Returns the value of the '<em><b>Topic URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic URL</em>' attribute.
	 * @see #setTopicURL(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopicClient_TopicURL()
	 * @model unique="false"
	 * @generated
	 */
	String getTopicURL();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient#getTopicURL <em>Topic URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic URL</em>' attribute.
	 * @see #getTopicURL()
	 * @generated
	 */
	void setTopicURL(String value);

} // DatabusStreamTopicClient
