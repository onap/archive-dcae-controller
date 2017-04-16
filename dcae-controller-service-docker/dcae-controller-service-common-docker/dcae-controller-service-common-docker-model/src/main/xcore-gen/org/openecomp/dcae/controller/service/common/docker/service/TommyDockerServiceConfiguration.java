
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
package org.openecomp.dcae.controller.service.common.docker.service;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tommy Docker Service Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.common.docker.service.TommyDockerServiceConfiguration#getPostgresUserName <em>Postgres User Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.docker.service.TommyDockerServiceConfiguration#getPostgresPassword <em>Postgres Password</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.docker.service.TommyDockerServiceConfiguration#getPortgresJdbc <em>Portgres Jdbc</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.service.common.docker.service.ServicePackage#getTommyDockerServiceConfiguration()
 * @model
 * @generated
 */
public interface TommyDockerServiceConfiguration extends CommonDockerServiceConfiguration {
	/**
	 * Returns the value of the '<em><b>Postgres User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postgres User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postgres User Name</em>' attribute.
	 * @see #setPostgresUserName(String)
	 * @see org.openecomp.dcae.controller.service.common.docker.service.ServicePackage#getTommyDockerServiceConfiguration_PostgresUserName()
	 * @model unique="false"
	 * @generated
	 */
	String getPostgresUserName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.common.docker.service.TommyDockerServiceConfiguration#getPostgresUserName <em>Postgres User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postgres User Name</em>' attribute.
	 * @see #getPostgresUserName()
	 * @generated
	 */
	void setPostgresUserName(String value);

	/**
	 * Returns the value of the '<em><b>Postgres Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postgres Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postgres Password</em>' attribute.
	 * @see #setPostgresPassword(String)
	 * @see org.openecomp.dcae.controller.service.common.docker.service.ServicePackage#getTommyDockerServiceConfiguration_PostgresPassword()
	 * @model unique="false"
	 * @generated
	 */
	String getPostgresPassword();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.common.docker.service.TommyDockerServiceConfiguration#getPostgresPassword <em>Postgres Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postgres Password</em>' attribute.
	 * @see #getPostgresPassword()
	 * @generated
	 */
	void setPostgresPassword(String value);

	/**
	 * Returns the value of the '<em><b>Portgres Jdbc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portgres Jdbc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portgres Jdbc</em>' attribute.
	 * @see #setPortgresJdbc(String)
	 * @see org.openecomp.dcae.controller.service.common.docker.service.ServicePackage#getTommyDockerServiceConfiguration_PortgresJdbc()
	 * @model unique="false"
	 * @generated
	 */
	String getPortgresJdbc();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.common.docker.service.TommyDockerServiceConfiguration#getPortgresJdbc <em>Portgres Jdbc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portgres Jdbc</em>' attribute.
	 * @see #getPortgresJdbc()
	 * @generated
	 */
	void setPortgresJdbc(String value);

} // TommyDockerServiceConfiguration
