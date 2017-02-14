
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

import org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceConfiguration;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postgres Service Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.PostgresServiceConfiguration#getState <em>State</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.PostgresServiceConfiguration#getDatabases <em>Databases</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getPostgresServiceConfiguration()
 * @model
 * @generated
 */
public interface PostgresServiceConfiguration extends CommonVmServiceConfiguration {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getPostgresServiceConfiguration_State()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.PostgresServiceConfiguration#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Databases</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.service.storage.postgres.service.Database}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databases</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getPostgresServiceConfiguration_Databases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Database> getDatabases();

} // PostgresServiceConfiguration
