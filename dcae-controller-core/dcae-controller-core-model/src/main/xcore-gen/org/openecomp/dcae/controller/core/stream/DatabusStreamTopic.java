
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

import java.util.Date;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Databus Stream Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getTopicName <em>Topic Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getTopicDescription <em>Topic Description</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getDcaeLocationName <em>Dcae Location Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#isTxenabled <em>Txenabled</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getFqtn <em>Fqtn</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getLastMod <em>Last Mod</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getClients <em>Clients</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getPublishURL <em>Publish URL</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getSubscribeURL <em>Subscribe URL</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getAuthenticationMethod <em>Authentication Method</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getReplicationCase <em>Replication Case</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getGlobalMrURL <em>Global Mr URL</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopic()
 * @model
 * @generated
 */
public interface DatabusStreamTopic extends DatabusStream {

	/**
	 * Returns the value of the '<em><b>Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Name</em>' attribute.
	 * @see #setTopicName(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopic_TopicName()
	 * @model unique="false"
	 * @generated
	 */
	String getTopicName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getTopicName <em>Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Name</em>' attribute.
	 * @see #getTopicName()
	 * @generated
	 */
	void setTopicName(String value);

	/**
	 * Returns the value of the '<em><b>Topic Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Description</em>' attribute.
	 * @see #setTopicDescription(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopic_TopicDescription()
	 * @model unique="false"
	 * @generated
	 */
	String getTopicDescription();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getTopicDescription <em>Topic Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Description</em>' attribute.
	 * @see #getTopicDescription()
	 * @generated
	 */
	void setTopicDescription(String value);

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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopic_DcaeLocationName()
	 * @model unique="false"
	 * @generated
	 */
	String getDcaeLocationName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getDcaeLocationName <em>Dcae Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcae Location Name</em>' attribute.
	 * @see #getDcaeLocationName()
	 * @generated
	 */
	void setDcaeLocationName(String value);

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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopic_Owner()
	 * @model unique="false"
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Txenabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Txenabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txenabled</em>' attribute.
	 * @see #setTxenabled(boolean)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopic_Txenabled()
	 * @model unique="false"
	 * @generated
	 */
	boolean isTxenabled();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#isTxenabled <em>Txenabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txenabled</em>' attribute.
	 * @see #isTxenabled()
	 * @generated
	 */
	void setTxenabled(boolean value);

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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopic_Fqtn()
	 * @model unique="false"
	 * @generated
	 */
	String getFqtn();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getFqtn <em>Fqtn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fqtn</em>' attribute.
	 * @see #getFqtn()
	 * @generated
	 */
	void setFqtn(String value);

	/**
	 * Returns the value of the '<em><b>Last Mod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Mod</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Mod</em>' attribute.
	 * @see #setLastMod(Date)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopic_LastMod()
	 * @model unique="false"
	 * @generated
	 */
	Date getLastMod();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getLastMod <em>Last Mod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Mod</em>' attribute.
	 * @see #getLastMod()
	 * @generated
	 */
	void setLastMod(Date value);

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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopic_Status()
	 * @model unique="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Clients</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopic_Clients()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatabusStreamTopicClient> getClients();

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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopic_PublishURL()
	 * @model unique="false"
	 * @generated
	 */
	String getPublishURL();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getPublishURL <em>Publish URL</em>}' attribute.
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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopic_SubscribeURL()
	 * @model unique="false"
	 * @generated
	 */
	String getSubscribeURL();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getSubscribeURL <em>Subscribe URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe URL</em>' attribute.
	 * @see #getSubscribeURL()
	 * @generated
	 */
	void setSubscribeURL(String value);

	/**
	 * Returns the value of the '<em><b>Authentication Method</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.dcae.controller.core.stream.StreamAuthentication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Method</em>' attribute.
	 * @see org.openecomp.dcae.controller.core.stream.StreamAuthentication
	 * @see #setAuthenticationMethod(StreamAuthentication)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopic_AuthenticationMethod()
	 * @model unique="false"
	 * @generated
	 */
	StreamAuthentication getAuthenticationMethod();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getAuthenticationMethod <em>Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Method</em>' attribute.
	 * @see org.openecomp.dcae.controller.core.stream.StreamAuthentication
	 * @see #getAuthenticationMethod()
	 * @generated
	 */
	void setAuthenticationMethod(StreamAuthentication value);

	/**
	 * Returns the value of the '<em><b>Replication Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replication Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replication Case</em>' attribute.
	 * @see #setReplicationCase(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopic_ReplicationCase()
	 * @model unique="false"
	 * @generated
	 */
	String getReplicationCase();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getReplicationCase <em>Replication Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication Case</em>' attribute.
	 * @see #getReplicationCase()
	 * @generated
	 */
	void setReplicationCase(String value);

	/**
	 * Returns the value of the '<em><b>Global Mr URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Mr URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Mr URL</em>' attribute.
	 * @see #setGlobalMrURL(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusStreamTopic_GlobalMrURL()
	 * @model unique="false"
	 * @generated
	 */
	String getGlobalMrURL();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusStreamTopic#getGlobalMrURL <em>Global Mr URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Mr URL</em>' attribute.
	 * @see #getGlobalMrURL()
	 * @generated
	 */
	void setGlobalMrURL(String value);
} // DatabusStreamTopic
