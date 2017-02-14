
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
package org.openecomp.dcae.controller.core.service;

import org.openecomp.ncomp.core.NamedEntity;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dcae Service</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaeService()
 * @model abstract="true"
 * @generated
 */
public interface DcaeService extends NamedEntity {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model instanceNameUnique="false" containerPathUnique="false"
	 * @generated
	 */
	void deploy(String instanceName, String containerPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model instanceNameUnique="false"
	 * @generated
	 */
	void undeploy(String instanceName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" instanceNameUnique="false"
	 * @generated
	 */
	HealthTestResponse test(String instanceName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model instanceNameUnique="false"
	 * @generated
	 */
	void suspend(String instanceName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model instanceNameUnique="false"
	 * @generated
	 */
	void resume(String instanceName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model instanceNameUnique="false"
	 * @generated
	 */
	void pushManagerConfiguration(String instanceName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model instanceNameUnique="false"
	 * @generated
	 */
	void pollManagerConfiguration(String instanceName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" instanceNameUnique="false"
	 * @generated
	 */
	EObject managerConfiguration(String instanceName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.openecomp.ncomp.core.JsonObject" unique="false" instanceNameUnique="false" operationUnique="false" parametersDataType="org.openecomp.ncomp.core.JsonObject" parametersUnique="false"
	 * @generated
	 */
	JSONObject managerOperation(String instanceName, String operation, JSONObject parameters);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model instanceNameUnique="false"
	 * @generated
	 */
	void updateConfigurationFromPolicy(String instanceName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void runHealthTests();
} // DcaeService
