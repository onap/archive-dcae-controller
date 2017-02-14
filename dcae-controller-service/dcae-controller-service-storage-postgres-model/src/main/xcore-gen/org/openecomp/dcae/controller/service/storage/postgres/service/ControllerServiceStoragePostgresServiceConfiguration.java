
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

import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Service Storage Postgres Service Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.ControllerServiceStoragePostgresServiceConfiguration#getJdbcUrl <em>Jdbc Url</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.ControllerServiceStoragePostgresServiceConfiguration#getNumberOfJdbcCommands <em>Number Of Jdbc Commands</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.ControllerServiceStoragePostgresServiceConfiguration#getNumberOfJdbcErrors <em>Number Of Jdbc Errors</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.ControllerServiceStoragePostgresServiceConfiguration#getEncryptedAdminPassword <em>Encrypted Admin Password</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.ControllerServiceStoragePostgresServiceConfiguration#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getControllerServiceStoragePostgresServiceConfiguration()
 * @model
 * @generated
 */
public interface ControllerServiceStoragePostgresServiceConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Jdbc Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc Url</em>' attribute.
	 * @see #setJdbcUrl(String)
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getControllerServiceStoragePostgresServiceConfiguration_JdbcUrl()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getJdbcUrl();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.ControllerServiceStoragePostgresServiceConfiguration#getJdbcUrl <em>Jdbc Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc Url</em>' attribute.
	 * @see #getJdbcUrl()
	 * @generated
	 */
	void setJdbcUrl(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Jdbc Commands</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Jdbc Commands</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Jdbc Commands</em>' attribute.
	 * @see #setNumberOfJdbcCommands(IncreasingULongMetricAttribute)
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getControllerServiceStoragePostgresServiceConfiguration_NumberOfJdbcCommands()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 *        annotation="http://openecomp.org type='operational'"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumberOfJdbcCommands();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.ControllerServiceStoragePostgresServiceConfiguration#getNumberOfJdbcCommands <em>Number Of Jdbc Commands</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Jdbc Commands</em>' attribute.
	 * @see #getNumberOfJdbcCommands()
	 * @generated
	 */
	void setNumberOfJdbcCommands(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Number Of Jdbc Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Jdbc Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Jdbc Errors</em>' attribute.
	 * @see #setNumberOfJdbcErrors(IncreasingULongMetricAttribute)
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getControllerServiceStoragePostgresServiceConfiguration_NumberOfJdbcErrors()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 *        annotation="http://openecomp.org type='operational'"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumberOfJdbcErrors();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.ControllerServiceStoragePostgresServiceConfiguration#getNumberOfJdbcErrors <em>Number Of Jdbc Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Jdbc Errors</em>' attribute.
	 * @see #getNumberOfJdbcErrors()
	 * @generated
	 */
	void setNumberOfJdbcErrors(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Encrypted Admin Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encrypted Admin Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted Admin Password</em>' attribute.
	 * @see #setEncryptedAdminPassword(String)
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getControllerServiceStoragePostgresServiceConfiguration_EncryptedAdminPassword()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getEncryptedAdminPassword();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.ControllerServiceStoragePostgresServiceConfiguration#getEncryptedAdminPassword <em>Encrypted Admin Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted Admin Password</em>' attribute.
	 * @see #getEncryptedAdminPassword()
	 * @generated
	 */
	void setEncryptedAdminPassword(String value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' attribute.
	 * @see #setConfig(String)
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage#getControllerServiceStoragePostgresServiceConfiguration_Config()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getConfig();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.ControllerServiceStoragePostgresServiceConfiguration#getConfig <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' attribute.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(String value);

} // ControllerServiceStoragePostgresServiceConfiguration
