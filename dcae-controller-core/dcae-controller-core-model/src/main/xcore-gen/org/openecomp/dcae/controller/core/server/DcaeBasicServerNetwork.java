
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
package org.openecomp.dcae.controller.core.server;

import org.openecomp.ncomp.core.NamedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dcae Basic Server Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.server.DcaeBasicServerNetwork#getIp <em>Ip</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.DcaeBasicServerNetwork#getDnsName <em>Dns Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.core.server.ServerPackage#getDcaeBasicServerNetwork()
 * @model
 * @generated
 */
public interface DcaeBasicServerNetwork extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see org.openecomp.dcae.controller.core.server.ServerPackage#getDcaeBasicServerNetwork_Ip()
	 * @model unique="false"
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServerNetwork#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

	/**
	 * Returns the value of the '<em><b>Dns Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dns Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dns Name</em>' attribute.
	 * @see #setDnsName(String)
	 * @see org.openecomp.dcae.controller.core.server.ServerPackage#getDcaeBasicServerNetwork_DnsName()
	 * @model unique="false"
	 * @generated
	 */
	String getDnsName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.server.DcaeBasicServerNetwork#getDnsName <em>Dns Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dns Name</em>' attribute.
	 * @see #getDnsName()
	 * @generated
	 */
	void setDnsName(String value);

} // DcaeBasicServerNetwork
