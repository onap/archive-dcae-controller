
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
package org.openecomp.dcae.controller.service.cdap;

import org.openecomp.ncomp.core.NamedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapApplication#getJarFile <em>Jar File</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapApplication#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapApplication#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapApplication#getAppConfigFileContent <em>App Config File Content</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapApplication()
 * @model
 * @generated
 */
public interface CdapApplication extends NamedEntity {

	/**
	 * Returns the value of the '<em><b>Jar File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jar File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jar File</em>' attribute.
	 * @see #setJarFile(String)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapApplication_JarFile()
	 * @model unique="false"
	 * @generated
	 */
	String getJarFile();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapApplication#getJarFile <em>Jar File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jar File</em>' attribute.
	 * @see #getJarFile()
	 * @generated
	 */
	void setJarFile(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Name</em>' attribute.
	 * @see #setArtifactName(String)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapApplication_ArtifactName()
	 * @model unique="false"
	 * @generated
	 */
	String getArtifactName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapApplication#getArtifactName <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Name</em>' attribute.
	 * @see #getArtifactName()
	 * @generated
	 */
	void setArtifactName(String value);

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
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapApplication_Version()
	 * @model unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapApplication#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>App Config File Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Config File Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Config File Content</em>' attribute.
	 * @see #setAppConfigFileContent(String)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapApplication_AppConfigFileContent()
	 * @model unique="false"
	 * @generated
	 */
	String getAppConfigFileContent();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapApplication#getAppConfigFileContent <em>App Config File Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Config File Content</em>' attribute.
	 * @see #getAppConfigFileContent()
	 * @generated
	 */
	void setAppConfigFileContent(String value);
} // CdapApplication
