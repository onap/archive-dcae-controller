
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Databus Data Router Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode#getDcaeLocationName <em>Dcae Location Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode#getHostFqdn <em>Host Fqdn</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusDataRouterNode()
 * @model
 * @generated
 */
public interface DatabusDataRouterNode extends DatabusEntity {

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
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusDataRouterNode_DcaeLocationName()
	 * @model unique="false"
	 * @generated
	 */
	String getDcaeLocationName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode#getDcaeLocationName <em>Dcae Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcae Location Name</em>' attribute.
	 * @see #getDcaeLocationName()
	 * @generated
	 */
	void setDcaeLocationName(String value);

	/**
	 * Returns the value of the '<em><b>Host Fqdn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Fqdn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Fqdn</em>' attribute.
	 * @see #setHostFqdn(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusDataRouterNode_HostFqdn()
	 * @model unique="false"
	 * @generated
	 */
	String getHostFqdn();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode#getHostFqdn <em>Host Fqdn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Fqdn</em>' attribute.
	 * @see #getHostFqdn()
	 * @generated
	 */
	void setHostFqdn(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusDataRouterNode_Version()
	 * @model unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);
} // DatabusDataRouterNode
