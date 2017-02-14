
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
package org.openecomp.dcae.controller.service.vm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Installation Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getUrl <em>Url</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getPassword <em>Password</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getType <em>Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getArtifactId <em>Artifact Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getHttpInstallationStep()
 * @model
 * @generated
 */
public interface HttpInstallationStep extends InstallationStep {
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
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getHttpInstallationStep_Url()
	 * @model unique="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getHttpInstallationStep_UserName()
	 * @model unique="false"
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

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
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getHttpInstallationStep_Password()
	 * @model unique="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getHttpInstallationStep_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Id</em>' attribute.
	 * @see #setArtifactId(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getHttpInstallationStep_ArtifactId()
	 * @model unique="false"
	 * @generated
	 */
	String getArtifactId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.HttpInstallationStep#getArtifactId <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Id</em>' attribute.
	 * @see #getArtifactId()
	 * @generated
	 */
	void setArtifactId(String value);

} // HttpInstallationStep
