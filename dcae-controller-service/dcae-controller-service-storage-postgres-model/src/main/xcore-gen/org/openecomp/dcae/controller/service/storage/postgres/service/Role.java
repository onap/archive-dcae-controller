
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
package org.openecomp.dcae.controller.service.storage.postgres.service;

import org.openecomp.ncomp.core.NamedEntity;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.Role#getPassword <em>Password</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.Role#getRole <em>Role</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.Role#getRoleComments <em>Role Comments</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.Role#getFullName <em>Full Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getRole()
 * @model
 * @generated
 */
public interface Role extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getRole_Password()
	 * @model unique="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.Role#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getRole_Role()
	 * @model unique="false"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.Role#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Role Comments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Comments</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Comments</em>' attribute list.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getRole_RoleComments()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getRoleComments();

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getRole_FullName()
	 * @model unique="false"
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.Role#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

} // Role
