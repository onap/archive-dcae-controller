
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
package org.openecomp.dcae.controller.service.cdapmanager;

import org.openecomp.dcae.controller.core.manager.DcaeManager;

import org.openecomp.ncomp.cdap.CdapConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdapmanager.DockerManager#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.service.cdapmanager.CdapmanagerPackage#getDockerManager()
 * @model
 * @generated
 */
public interface DockerManager extends DcaeManager {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(CdapConfiguration)
	 * @see org.openecomp.dcae.controller.service.cdapmanager.CdapmanagerPackage#getDockerManager_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	CdapConfiguration getConfiguration();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdapmanager.DockerManager#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(CdapConfiguration value);

} // DockerManager
