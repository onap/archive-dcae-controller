
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
package org.openecomp.dcae.controller.core.stream;

import org.openecomp.ncomp.core.NamedEntity;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dcae Stream Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition#getStreamType <em>Stream Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition#getDatabusType <em>Databus Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition#getPublishers <em>Publishers</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition#getSubscribers <em>Subscribers</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDcaeStreamDefinition()
 * @model
 * @generated
 */
public interface DcaeStreamDefinition extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Stream Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stream Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream Type</em>' attribute.
	 * @see #setStreamType(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDcaeStreamDefinition_StreamType()
	 * @model unique="false"
	 * @generated
	 */
	String getStreamType();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition#getStreamType <em>Stream Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Type</em>' attribute.
	 * @see #getStreamType()
	 * @generated
	 */
	void setStreamType(String value);

	/**
	 * Returns the value of the '<em><b>Databus Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databus Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databus Type</em>' attribute.
	 * @see #setDatabusType(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDcaeStreamDefinition_DatabusType()
	 * @model unique="false"
	 * @generated
	 */
	String getDatabusType();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamDefinition#getDatabusType <em>Databus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databus Type</em>' attribute.
	 * @see #getDatabusType()
	 * @generated
	 */
	void setDatabusType(String value);

	/**
	 * Returns the value of the '<em><b>Publishers</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.stream.DcaeStreamPublisher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publishers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishers</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDcaeStreamDefinition_Publishers()
	 * @model containment="true"
	 * @generated
	 */
	EList<DcaeStreamPublisher> getPublishers();

	/**
	 * Returns the value of the '<em><b>Subscribers</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.stream.DcaeStreamSubscriber}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribers</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDcaeStreamDefinition_Subscribers()
	 * @model containment="true"
	 * @generated
	 */
	EList<DcaeStreamSubscriber> getSubscribers();

} // DcaeStreamDefinition
