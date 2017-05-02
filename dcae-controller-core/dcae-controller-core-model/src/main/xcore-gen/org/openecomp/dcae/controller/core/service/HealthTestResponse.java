
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Healt Test Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.service.HealthTestResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.HealthTestResponse#getMessageCode <em>Message Code</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getHealthTestResponse()
 * @model
 * @generated
 */
public interface HealthTestResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.dcae.controller.core.service.HealthTestStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.openecomp.dcae.controller.core.service.HealthTestStatus
	 * @see #setStatus(HealthTestStatus)
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getHealthTestResponse_Status()
	 * @model unique="false"
	 * @generated
	 */
	HealthTestStatus getStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.service.HealthTestResponse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.openecomp.dcae.controller.core.service.HealthTestStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(HealthTestStatus value);

	/**
	 * Returns the value of the '<em><b>Message Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Code</em>' attribute.
	 * @see #setMessageCode(String)
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getHealthTestResponse_MessageCode()
	 * @model unique="false"
	 * @generated
	 */
	String getMessageCode();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.service.HealthTestResponse#getMessageCode <em>Message Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Code</em>' attribute.
	 * @see #getMessageCode()
	 * @generated
	 */
	void setMessageCode(String value);

} // HealtTestResponse
