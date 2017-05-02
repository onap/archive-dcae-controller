
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

import org.openecomp.ncomp.core.NamedEntity;

import org.openecomp.ncomp.core.types.metrics.DateMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster Server Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getPushInterval <em>Push Interval</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getLastPush <em>Last Push</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getNumberDataPushes <em>Number Data Pushes</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getNumberDataPushErrors <em>Number Data Push Errors</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getLastDataReceived <em>Last Data Received</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getNumberDataReceived <em>Number Data Received</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getNumberDataReceivedErrors <em>Number Data Received Errors</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getControllerClusterServerData()
 * @model
 * @generated
 */
public interface ControllerClusterServerData extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Push Interval</b></em>' attribute.
	 * The default value is <code>"5min"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Push Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Push Interval</em>' attribute.
	 * @see #setPushInterval(String)
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getControllerClusterServerData_PushInterval()
	 * @model default="5min" unique="false"
	 * @generated
	 */
	String getPushInterval();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getPushInterval <em>Push Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Push Interval</em>' attribute.
	 * @see #getPushInterval()
	 * @generated
	 */
	void setPushInterval(String value);

	/**
	 * Returns the value of the '<em><b>Last Push</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Push</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Push</em>' attribute.
	 * @see #setLastPush(DateMetricAttribute)
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getControllerClusterServerData_LastPush()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DateMetricAttribute"
	 * @generated
	 */
	DateMetricAttribute getLastPush();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getLastPush <em>Last Push</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Push</em>' attribute.
	 * @see #getLastPush()
	 * @generated
	 */
	void setLastPush(DateMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Number Data Pushes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Data Pushes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Data Pushes</em>' attribute.
	 * @see #setNumberDataPushes(IncreasingULongMetricAttribute)
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getControllerClusterServerData_NumberDataPushes()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumberDataPushes();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getNumberDataPushes <em>Number Data Pushes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Data Pushes</em>' attribute.
	 * @see #getNumberDataPushes()
	 * @generated
	 */
	void setNumberDataPushes(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Number Data Push Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Data Push Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Data Push Errors</em>' attribute.
	 * @see #setNumberDataPushErrors(IncreasingULongMetricAttribute)
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getControllerClusterServerData_NumberDataPushErrors()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumberDataPushErrors();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getNumberDataPushErrors <em>Number Data Push Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Data Push Errors</em>' attribute.
	 * @see #getNumberDataPushErrors()
	 * @generated
	 */
	void setNumberDataPushErrors(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Last Data Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Data Received</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Data Received</em>' attribute.
	 * @see #setLastDataReceived(DateMetricAttribute)
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getControllerClusterServerData_LastDataReceived()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DateMetricAttribute"
	 * @generated
	 */
	DateMetricAttribute getLastDataReceived();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getLastDataReceived <em>Last Data Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Data Received</em>' attribute.
	 * @see #getLastDataReceived()
	 * @generated
	 */
	void setLastDataReceived(DateMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Number Data Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Data Received</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Data Received</em>' attribute.
	 * @see #setNumberDataReceived(IncreasingULongMetricAttribute)
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getControllerClusterServerData_NumberDataReceived()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumberDataReceived();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getNumberDataReceived <em>Number Data Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Data Received</em>' attribute.
	 * @see #getNumberDataReceived()
	 * @generated
	 */
	void setNumberDataReceived(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Number Data Received Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Data Received Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Data Received Errors</em>' attribute.
	 * @see #setNumberDataReceivedErrors(IncreasingULongMetricAttribute)
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getControllerClusterServerData_NumberDataReceivedErrors()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumberDataReceivedErrors();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData#getNumberDataReceivedErrors <em>Number Data Received Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Data Received Errors</em>' attribute.
	 * @see #getNumberDataReceivedErrors()
	 * @generated
	 */
	void setNumberDataReceivedErrors(IncreasingULongMetricAttribute value);

} // ControllerClusterServerData
