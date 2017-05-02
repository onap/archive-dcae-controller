
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dcae Stream Internal End Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DcaeStreamInternalEndPoint#getLocalName <em>Local Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DcaeStreamInternalEndPoint#getServiceName <em>Service Name</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDcaeStreamInternalEndPoint()
 * @model
 * @generated
 */
public interface DcaeStreamInternalEndPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Local Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Name</em>' attribute.
	 * @see #setLocalName(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDcaeStreamInternalEndPoint_LocalName()
	 * @model unique="false"
	 * @generated
	 */
	String getLocalName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamInternalEndPoint#getLocalName <em>Local Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Name</em>' attribute.
	 * @see #getLocalName()
	 * @generated
	 */
	void setLocalName(String value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDcaeStreamInternalEndPoint_ServiceName()
	 * @model unique="false"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamInternalEndPoint#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

} // DcaeStreamInternalEndPoint
