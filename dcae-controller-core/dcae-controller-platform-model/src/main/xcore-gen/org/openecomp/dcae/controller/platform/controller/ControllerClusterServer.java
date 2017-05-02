
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
package org.openecomp.dcae.controller.platform.controller;

import org.openecomp.dcae.controller.core.server.DcaeBasicServer;
import org.openecomp.ncomp.core.NamedEntity;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServer#getRole <em>Role</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServer#getData <em>Data</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServer#getServer <em>Server</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getControllerClusterServer()
 * @model
 * @generated
 */
public interface ControllerClusterServer extends NamedEntity {

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.dcae.controller.platform.controller.ServerRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see org.openecomp.dcae.controller.platform.controller.ServerRole
	 * @see #setRole(ServerRole)
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getControllerClusterServer_Role()
	 * @model unique="false"
	 * @generated
	 */
	ServerRole getRole();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServer#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see org.openecomp.dcae.controller.platform.controller.ServerRole
	 * @see #getRole()
	 * @generated
	 */
	void setRole(ServerRole value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getControllerClusterServer_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControllerClusterServerData> getData();

	/**
	 * Returns the value of the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference.
	 * @see #setServer(DcaeBasicServer)
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getControllerClusterServer_Server()
	 * @model
	 * @generated
	 */
	DcaeBasicServer getServer();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServer#getServer <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(DcaeBasicServer value);
} // ControllerClusterServer
