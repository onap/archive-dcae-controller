
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

import org.openecomp.dcae.controller.core.service.DcaeServiceInstance;
import org.openecomp.dcae.controller.service.docker.host.service.DockerHostServiceInstance;
import org.openecomp.ncomp.docker.ContainerPortBindings;
import org.openecomp.ncomp.docker.DockerHost;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getDockerHost <em>Docker Host</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getHostService <em>Host Service</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getDockerName <em>Docker Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getImage <em>Image</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getLinks <em>Links</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getEnvs <em>Envs</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getPortBindings <em>Port Bindings</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getManagerPortNumber <em>Manager Port Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceInstance()
 * @model
 * @generated
 */
public interface DockerServiceInstance extends DcaeServiceInstance {
	/**
	 * Returns the value of the '<em><b>Docker Host</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docker Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker Host</em>' containment reference.
	 * @see #setDockerHost(DockerHost)
	 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceInstance_DockerHost()
	 * @model containment="true"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	DockerHost getDockerHost();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getDockerHost <em>Docker Host</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Host</em>' containment reference.
	 * @see #getDockerHost()
	 * @generated
	 */
	void setDockerHost(DockerHost value);

	/**
	 * Returns the value of the '<em><b>Host Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Service</em>' reference.
	 * @see #setHostService(DockerHostServiceInstance)
	 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceInstance_HostService()
	 * @model
	 * @generated
	 */
	DockerHostServiceInstance getHostService();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getHostService <em>Host Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Service</em>' reference.
	 * @see #getHostService()
	 * @generated
	 */
	void setHostService(DockerHostServiceInstance value);

	/**
	 * Returns the value of the '<em><b>Docker Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docker Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker Name</em>' attribute.
	 * @see #setDockerName(String)
	 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceInstance_DockerName()
	 * @model unique="false"
	 * @generated
	 */
	String getDockerName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getDockerName <em>Docker Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Name</em>' attribute.
	 * @see #getDockerName()
	 * @generated
	 */
	void setDockerName(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceInstance_Image()
	 * @model unique="false"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(DockerConfiguration)
	 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceInstance_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	DockerConfiguration getConfiguration();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(DockerConfiguration value);

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volumes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' attribute list.
	 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceInstance_Volumes()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getVolumes();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' attribute list.
	 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceInstance_Links()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getLinks();

	/**
	 * Returns the value of the '<em><b>Envs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Envs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envs</em>' attribute list.
	 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceInstance_Envs()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getEnvs();

	/**
	 * Returns the value of the '<em><b>Port Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.docker.ContainerPortBindings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Bindings</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceInstance_PortBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerPortBindings> getPortBindings();

	/**
	 * Returns the value of the '<em><b>Manager Port Number</b></em>' attribute.
	 * The default value is <code>"9999"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager Port Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager Port Number</em>' attribute.
	 * @see #setManagerPortNumber(int)
	 * @see org.openecomp.dcae.controller.service.docker.DockerPackage#getDockerServiceInstance_ManagerPortNumber()
	 * @model default="9999" unique="false"
	 * @generated
	 */
	int getManagerPortNumber();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.docker.DockerServiceInstance#getManagerPortNumber <em>Manager Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager Port Number</em>' attribute.
	 * @see #getManagerPortNumber()
	 * @generated
	 */
	void setManagerPortNumber(int value);

} // DockerServiceInstance
