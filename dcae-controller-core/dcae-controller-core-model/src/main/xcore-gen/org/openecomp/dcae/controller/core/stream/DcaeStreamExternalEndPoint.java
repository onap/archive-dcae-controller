
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
 * A representation of the model object '<em><b>Dcae Stream External End Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DcaeStreamExternalEndPoint#getUser <em>User</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DcaeStreamExternalEndPoint#getPassword <em>Password</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DcaeStreamExternalEndPoint#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDcaeStreamExternalEndPoint()
 * @model
 * @generated
 */
public interface DcaeStreamExternalEndPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDcaeStreamExternalEndPoint_User()
	 * @model unique="false"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamExternalEndPoint#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDcaeStreamExternalEndPoint_Password()
	 * @model unique="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamExternalEndPoint#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDcaeStreamExternalEndPoint_Url()
	 * @model unique="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DcaeStreamExternalEndPoint#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // DcaeStreamExternalEndPoint
