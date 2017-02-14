
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
package org.openecomp.dcae.controller.service.dmaap.drsub.service;

import org.openecomp.ncomp.core.NamedEntity;

import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contrail Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ContrailController#getContrailIp <em>Contrail Ip</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ContrailController#getNumberOfRecords <em>Number Of Records</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ContrailController#getNumberOfErrors <em>Number Of Errors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getContrailController()
 * @model
 * @generated
 */
public interface ContrailController extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Contrail Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrail Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrail Ip</em>' attribute.
	 * @see #setContrailIp(String)
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getContrailController_ContrailIp()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getContrailIp();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ContrailController#getContrailIp <em>Contrail Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrail Ip</em>' attribute.
	 * @see #getContrailIp()
	 * @generated
	 */
	void setContrailIp(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Records</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Records</em>' attribute.
	 * @see #setNumberOfRecords(IncreasingULongMetricAttribute)
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getContrailController_NumberOfRecords()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 *        annotation="http://openecomp.org type='operational'"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumberOfRecords();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ContrailController#getNumberOfRecords <em>Number Of Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Records</em>' attribute.
	 * @see #getNumberOfRecords()
	 * @generated
	 */
	void setNumberOfRecords(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Number Of Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Errors</em>' attribute.
	 * @see #setNumberOfErrors(IncreasingULongMetricAttribute)
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getContrailController_NumberOfErrors()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 *        annotation="http://openecomp.org type='operational'"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumberOfErrors();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ContrailController#getNumberOfErrors <em>Number Of Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Errors</em>' attribute.
	 * @see #getNumberOfErrors()
	 * @generated
	 */
	void setNumberOfErrors(IncreasingULongMetricAttribute value);

} // ContrailController
