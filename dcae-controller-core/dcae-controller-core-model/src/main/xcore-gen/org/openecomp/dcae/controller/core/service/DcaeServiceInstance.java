
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

import org.openecomp.dcae.controller.core.stream.DcaeStream;
import org.openecomp.ncomp.core.DeploymentStatus;
import org.openecomp.ncomp.core.NamedEntity;
import org.openecomp.ncomp.core.types.metrics.DateMetricAttribute;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dcae Service Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getServiceContainer <em>Service Container</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getInputStreams <em>Input Streams</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getOutputStreams <em>Output Streams</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getLastHealthTest <em>Last Health Test</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getHealthTestStatus <em>Health Test Status</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getHealthTestMessageCode <em>Health Test Message Code</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaeServiceInstance()
 * @model abstract="true"
 * @generated
 */
public interface DcaeServiceInstance extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Service Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.openecomp.dcae.controller.core.service.DcaeServiceContainer#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Container</em>' reference.
	 * @see #setServiceContainer(DcaeServiceContainer)
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaeServiceInstance_ServiceContainer()
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceContainer#getInstances
	 * @model opposite="instances"
	 *        annotation="http://openecomp.org type='operational'"
	 * @generated
	 */
	DcaeServiceContainer getServiceContainer();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getServiceContainer <em>Service Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Container</em>' reference.
	 * @see #getServiceContainer()
	 * @generated
	 */
	void setServiceContainer(DcaeServiceContainer value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.ncomp.core.DeploymentStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.openecomp.ncomp.core.DeploymentStatus
	 * @see #setStatus(DeploymentStatus)
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaeServiceInstance_Status()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='operational'"
	 * @generated
	 */
	DeploymentStatus getStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.openecomp.ncomp.core.DeploymentStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DeploymentStatus value);

	/**
	 * Returns the value of the '<em><b>Input Streams</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.stream.DcaeStream}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Streams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Streams</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaeServiceInstance_InputStreams()
	 * @model containment="true"
	 *        annotation="http://openecomp.org type='service'"
	 * @generated
	 */
	EList<DcaeStream> getInputStreams();

	/**
	 * Returns the value of the '<em><b>Output Streams</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.stream.DcaeStream}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Streams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Streams</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaeServiceInstance_OutputStreams()
	 * @model containment="true"
	 *        annotation="http://openecomp.org type='service'"
	 * @generated
	 */
	EList<DcaeStream> getOutputStreams();

	/**
	 * Returns the value of the '<em><b>Last Health Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Health Test</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Health Test</em>' attribute.
	 * @see #setLastHealthTest(DateMetricAttribute)
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaeServiceInstance_LastHealthTest()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DateMetricAttribute" transient="true"
	 * @generated
	 */
	DateMetricAttribute getLastHealthTest();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getLastHealthTest <em>Last Health Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Health Test</em>' attribute.
	 * @see #getLastHealthTest()
	 * @generated
	 */
	void setLastHealthTest(DateMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Health Test Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.dcae.controller.core.service.HealthTestStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Health Test Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Test Status</em>' attribute.
	 * @see org.openecomp.dcae.controller.core.service.HealthTestStatus
	 * @see #setHealthTestStatus(HealthTestStatus)
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaeServiceInstance_HealthTestStatus()
	 * @model unique="false"
	 * @generated
	 */
	HealthTestStatus getHealthTestStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getHealthTestStatus <em>Health Test Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Test Status</em>' attribute.
	 * @see org.openecomp.dcae.controller.core.service.HealthTestStatus
	 * @see #getHealthTestStatus()
	 * @generated
	 */
	void setHealthTestStatus(HealthTestStatus value);

	/**
	 * Returns the value of the '<em><b>Health Test Message Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Health Test Message Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Test Message Code</em>' attribute.
	 * @see #setHealthTestMessageCode(String)
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaeServiceInstance_HealthTestMessageCode()
	 * @model unique="false"
	 * @generated
	 */
	String getHealthTestMessageCode();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance#getHealthTestMessageCode <em>Health Test Message Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Test Message Code</em>' attribute.
	 * @see #getHealthTestMessageCode()
	 * @generated
	 */
	void setHealthTestMessageCode(String value);

} // DcaeServiceInstance
