
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
package org.openecomp.dcae.controller.service.docker.host.service;

import org.openecomp.ncomp.docker.DockerHost;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.host.service.DockerConfiguration#getDockerHost <em>Docker Host</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.service.docker.host.service.ServicePackage#getDockerConfiguration()
 * @model
 * @generated
 */
public interface DockerConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Docker Host</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docker Host</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker Host</em>' containment reference.
	 * @see #setDockerHost(DockerHost)
	 * @see org.openecomp.dcae.controller.service.docker.host.service.ServicePackage#getDockerConfiguration_DockerHost()
	 * @model containment="true"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	DockerHost getDockerHost();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.docker.host.service.DockerConfiguration#getDockerHost <em>Docker Host</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Host</em>' containment reference.
	 * @see #getDockerHost()
	 * @generated
	 */
	void setDockerHost(DockerHost value);

} // DockerConfiguration
