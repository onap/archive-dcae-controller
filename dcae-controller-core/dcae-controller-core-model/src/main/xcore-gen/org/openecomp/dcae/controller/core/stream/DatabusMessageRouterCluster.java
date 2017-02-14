
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
 * A representation of the model object '<em><b>Databus Message Router Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getDcaeLocationName <em>Dcae Location Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getServiceFqdn <em>Service Fqdn</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getHostFqdn <em>Host Fqdn</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getTopicPort <em>Topic Port</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getTopicProtocol <em>Topic Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusMessageRouterCluster()
 * @model
 * @generated
 */
public interface DatabusMessageRouterCluster extends DatabusEntity {

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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusMessageRouterCluster_DcaeLocationName()
	 * @model unique="false"
	 * @generated
	 */
	String getDcaeLocationName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getDcaeLocationName <em>Dcae Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcae Location Name</em>' attribute.
	 * @see #getDcaeLocationName()
	 * @generated
	 */
	void setDcaeLocationName(String value);

	/**
	 * Returns the value of the '<em><b>Service Fqdn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Fqdn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Fqdn</em>' attribute.
	 * @see #setServiceFqdn(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusMessageRouterCluster_ServiceFqdn()
	 * @model unique="false"
	 * @generated
	 */
	String getServiceFqdn();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getServiceFqdn <em>Service Fqdn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Fqdn</em>' attribute.
	 * @see #getServiceFqdn()
	 * @generated
	 */
	void setServiceFqdn(String value);

	/**
	 * Returns the value of the '<em><b>Host Fqdn</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Fqdn</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Fqdn</em>' attribute list.
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusMessageRouterCluster_HostFqdn()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getHostFqdn();

	/**
	 * Returns the value of the '<em><b>Topic Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Port</em>' attribute.
	 * @see #setTopicPort(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusMessageRouterCluster_TopicPort()
	 * @model unique="false"
	 * @generated
	 */
	String getTopicPort();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getTopicPort <em>Topic Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Port</em>' attribute.
	 * @see #getTopicPort()
	 * @generated
	 */
	void setTopicPort(String value);

	/**
	 * Returns the value of the '<em><b>Topic Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Protocol</em>' attribute.
	 * @see #setTopicProtocol(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusMessageRouterCluster_TopicProtocol()
	 * @model unique="false"
	 * @generated
	 */
	String getTopicProtocol();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster#getTopicProtocol <em>Topic Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic Protocol</em>' attribute.
	 * @see #getTopicProtocol()
	 * @generated
	 */
	void setTopicProtocol(String value);
} // DatabusMessageRouterCluster
