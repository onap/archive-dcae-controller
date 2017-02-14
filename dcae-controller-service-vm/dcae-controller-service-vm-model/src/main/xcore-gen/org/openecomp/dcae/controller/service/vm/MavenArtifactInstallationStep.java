
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
 * A representation of the model object '<em><b>Maven Artifact Installation Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getType <em>Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getAssemblyId <em>Assembly Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getMavenArtifactInstallationStep()
 * @model
 * @generated
 */
public interface MavenArtifactInstallationStep extends InstallationStep {
	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getMavenArtifactInstallationStep_GroupId()
	 * @model unique="false"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

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
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getMavenArtifactInstallationStep_ArtifactId()
	 * @model unique="false"
	 * @generated
	 */
	String getArtifactId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getArtifactId <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Id</em>' attribute.
	 * @see #getArtifactId()
	 * @generated
	 */
	void setArtifactId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getMavenArtifactInstallationStep_Version()
	 * @model unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

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
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getMavenArtifactInstallationStep_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Assembly Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Id</em>' attribute.
	 * @see #setAssemblyId(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getMavenArtifactInstallationStep_AssemblyId()
	 * @model unique="false"
	 * @generated
	 */
	String getAssemblyId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep#getAssemblyId <em>Assembly Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Id</em>' attribute.
	 * @see #getAssemblyId()
	 * @generated
	 */
	void setAssemblyId(String value);

} // MavenArtifactInstallationStep
