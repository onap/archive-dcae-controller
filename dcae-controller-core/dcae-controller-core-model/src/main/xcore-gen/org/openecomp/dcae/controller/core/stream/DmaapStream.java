
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
 * A representation of the model object '<em><b>Dmaap Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapDataType <em>Dmaap Data Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapAction <em>Dmaap Action</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapUrl <em>Dmaap Url</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapUserName <em>Dmaap User Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapPassword <em>Dmaap Password</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapAuthMethod <em>Dmaap Auth Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDmaapStream()
 * @model
 * @generated
 */
public interface DmaapStream extends DcaeStream {
	/**
	 * Returns the value of the '<em><b>Dmaap Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmaap Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmaap Data Type</em>' attribute.
	 * @see #setDmaapDataType(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDmaapStream_DmaapDataType()
	 * @model unique="false"
	 * @generated
	 */
	String getDmaapDataType();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapDataType <em>Dmaap Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmaap Data Type</em>' attribute.
	 * @see #getDmaapDataType()
	 * @generated
	 */
	void setDmaapDataType(String value);

	/**
	 * Returns the value of the '<em><b>Dmaap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmaap Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmaap Action</em>' attribute.
	 * @see #setDmaapAction(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDmaapStream_DmaapAction()
	 * @model unique="false"
	 * @generated
	 */
	String getDmaapAction();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapAction <em>Dmaap Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmaap Action</em>' attribute.
	 * @see #getDmaapAction()
	 * @generated
	 */
	void setDmaapAction(String value);

	/**
	 * Returns the value of the '<em><b>Dmaap Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmaap Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmaap Url</em>' attribute.
	 * @see #setDmaapUrl(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDmaapStream_DmaapUrl()
	 * @model unique="false"
	 * @generated
	 */
	String getDmaapUrl();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapUrl <em>Dmaap Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmaap Url</em>' attribute.
	 * @see #getDmaapUrl()
	 * @generated
	 */
	void setDmaapUrl(String value);

	/**
	 * Returns the value of the '<em><b>Dmaap User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmaap User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmaap User Name</em>' attribute.
	 * @see #setDmaapUserName(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDmaapStream_DmaapUserName()
	 * @model unique="false"
	 * @generated
	 */
	String getDmaapUserName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapUserName <em>Dmaap User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmaap User Name</em>' attribute.
	 * @see #getDmaapUserName()
	 * @generated
	 */
	void setDmaapUserName(String value);

	/**
	 * Returns the value of the '<em><b>Dmaap Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmaap Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmaap Password</em>' attribute.
	 * @see #setDmaapPassword(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDmaapStream_DmaapPassword()
	 * @model unique="false"
	 * @generated
	 */
	String getDmaapPassword();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapPassword <em>Dmaap Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmaap Password</em>' attribute.
	 * @see #getDmaapPassword()
	 * @generated
	 */
	void setDmaapPassword(String value);

	/**
	 * Returns the value of the '<em><b>Dmaap Auth Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmaap Auth Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmaap Auth Method</em>' attribute.
	 * @see #setDmaapAuthMethod(String)
	 * @see org.openecomp.dcae.controller.core.stream.StreamPackage#getDmaapStream_DmaapAuthMethod()
	 * @model unique="false"
	 * @generated
	 */
	String getDmaapAuthMethod();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.stream.DmaapStream#getDmaapAuthMethod <em>Dmaap Auth Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmaap Auth Method</em>' attribute.
	 * @see #getDmaapAuthMethod()
	 * @generated
	 */
	void setDmaapAuthMethod(String value);

} // DmaapStream
