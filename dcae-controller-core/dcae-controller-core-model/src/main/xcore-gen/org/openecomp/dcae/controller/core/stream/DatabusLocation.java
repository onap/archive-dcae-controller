
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Databus Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DatabusLocation#getDcaeLayer <em>Dcae Layer</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusLocation()
 * @model
 * @generated
 */
public interface DatabusLocation extends DatabusEntity {

	/**
	 * Returns the value of the '<em><b>Dcae Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dcae Layer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dcae Layer</em>' attribute.
	 * @see #setDcaeLayer(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDatabusLocation_DcaeLayer()
	 * @model unique="false"
	 * @generated
	 */
	String getDcaeLayer();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DatabusLocation#getDcaeLayer <em>Dcae Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcae Layer</em>' attribute.
	 * @see #getDcaeLayer()
	 * @generated
	 */
	void setDcaeLayer(String value);
} // DatabusLocation
