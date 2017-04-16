
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
package org.openecomp.dcae.controller.service.docker;

import org.openecomp.dcae.controller.core.service.DcaeServiceDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getServicePackage <em>Service Package</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getServiceInstanceClass <em>Service Instance Class</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getDockerImage <em>Docker Image</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getManagerPortNumber <em>Manager Port Number</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getManagerUser <em>Manager User</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getEncryptedPassword <em>Encrypted Password</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceDescriptor()
 * @model
 * @generated
 */
public interface DockerServiceDescriptor extends DcaeServiceDescriptor {
	/**
	 * Returns the value of the '<em><b>Service Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Package</em>' attribute.
	 * @see #setServicePackage(String)
	 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceDescriptor_ServicePackage()
	 * @model unique="false"
	 * @generated
	 */
	String getServicePackage();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getServicePackage <em>Service Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Package</em>' attribute.
	 * @see #getServicePackage()
	 * @generated
	 */
	void setServicePackage(String value);

	/**
	 * Returns the value of the '<em><b>Service Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Class</em>' attribute.
	 * @see #setServiceClass(String)
	 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceDescriptor_ServiceClass()
	 * @model unique="false"
	 * @generated
	 */
	String getServiceClass();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getServiceClass <em>Service Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Class</em>' attribute.
	 * @see #getServiceClass()
	 * @generated
	 */
	void setServiceClass(String value);

	/**
	 * Returns the value of the '<em><b>Service Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Instance Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Instance Class</em>' attribute.
	 * @see #setServiceInstanceClass(String)
	 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceDescriptor_ServiceInstanceClass()
	 * @model unique="false"
	 * @generated
	 */
	String getServiceInstanceClass();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getServiceInstanceClass <em>Service Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Instance Class</em>' attribute.
	 * @see #getServiceInstanceClass()
	 * @generated
	 */
	void setServiceInstanceClass(String value);

	/**
	 * Returns the value of the '<em><b>Docker Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docker Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker Image</em>' attribute.
	 * @see #setDockerImage(String)
	 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceDescriptor_DockerImage()
	 * @model unique="false"
	 * @generated
	 */
	String getDockerImage();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getDockerImage <em>Docker Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Image</em>' attribute.
	 * @see #getDockerImage()
	 * @generated
	 */
	void setDockerImage(String value);

	/**
	 * Returns the value of the '<em><b>Manager Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager Port Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager Port Number</em>' attribute.
	 * @see #setManagerPortNumber(String)
	 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceDescriptor_ManagerPortNumber()
	 * @model unique="false"
	 * @generated
	 */
	String getManagerPortNumber();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getManagerPortNumber <em>Manager Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager Port Number</em>' attribute.
	 * @see #getManagerPortNumber()
	 * @generated
	 */
	void setManagerPortNumber(String value);

	/**
	 * Returns the value of the '<em><b>Manager User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager User</em>' attribute.
	 * @see #setManagerUser(String)
	 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceDescriptor_ManagerUser()
	 * @model unique="false"
	 * @generated
	 */
	String getManagerUser();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getManagerUser <em>Manager User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager User</em>' attribute.
	 * @see #getManagerUser()
	 * @generated
	 */
	void setManagerUser(String value);

	/**
	 * Returns the value of the '<em><b>Encrypted Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encrypted Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted Password</em>' attribute.
	 * @see #setEncryptedPassword(String)
	 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceDescriptor_EncryptedPassword()
	 * @model unique="false"
	 * @generated
	 */
	String getEncryptedPassword();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.docker.DockerServiceDescriptor#getEncryptedPassword <em>Encrypted Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted Password</em>' attribute.
	 * @see #getEncryptedPassword()
	 * @generated
	 */
	void setEncryptedPassword(String value);

} // DockerServiceDescriptor
