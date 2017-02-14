
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
package org.openecomp.dcae.controller.core.manager;

import org.openecomp.dcae.controller.core.service.HealthTestResponse;
import org.openecomp.dcae.controller.core.stream.DcaeStream;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dcae Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.manager.DcaeManager#getInputStreams <em>Input Streams</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.manager.DcaeManager#getOutputStreams <em>Output Streams</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.core.manager.ManagerPackage#getDcaeManager()
 * @model abstract="true"
 * @generated
 */
public interface DcaeManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Streams</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.stream.DcaeStream}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Streams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Streams</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.core.manager.ManagerPackage#getDcaeManager_InputStreams()
	 * @model containment="true"
	 * @generated
	 */
	EList<DcaeStream> getInputStreams();

	/**
	 * Returns the value of the '<em><b>Output Streams</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.stream.DcaeStream}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Streams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Streams</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.core.manager.ManagerPackage#getDcaeManager_OutputStreams()
	 * @model containment="true"
	 * @generated
	 */
	EList<DcaeStream> getOutputStreams();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	HealthTestResponse test();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void suspend();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resume();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String publicKey();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void configurationChanged();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model inputStreamsUnique="false" inputStreamsMany="true" outputStreamsUnique="false" outputStreamsMany="true"
	 * @generated
	 */
	void updateStreams(EList<DcaeStream> inputStreams, EList<DcaeStream> outputStreams);

} // DcaeManager
