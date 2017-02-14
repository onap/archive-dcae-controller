
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
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.Database#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.Database#getContacts <em>Contacts</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.Database#getOwnerRole <em>Owner Role</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.Database#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getDatabase_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.Database#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Contacts</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.service.storage.postgres.service.Contact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contacts</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getDatabase_Contacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contact> getContacts();

	/**
	 * Returns the value of the '<em><b>Owner Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Role</em>' attribute.
	 * @see #setOwnerRole(String)
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getDatabase_OwnerRole()
	 * @model unique="false"
	 * @generated
	 */
	String getOwnerRole();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.Database#getOwnerRole <em>Owner Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Role</em>' attribute.
	 * @see #getOwnerRole()
	 * @generated
	 */
	void setOwnerRole(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.service.storage.postgres.service.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getDatabase_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // Database
