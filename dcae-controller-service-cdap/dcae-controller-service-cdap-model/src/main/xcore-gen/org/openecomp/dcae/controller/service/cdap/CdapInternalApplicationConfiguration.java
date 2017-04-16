
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

import org.openecomp.ncomp.cdap.CdapEntityWithPreferences;
import org.openecomp.ncomp.cdap.CdapKeyPair;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Application Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration#getConfig <em>Config</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration#getApps <em>Apps</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration#getWorkers <em>Workers</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration#getFlows <em>Flows</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapInternalApplicationConfiguration()
 * @model
 * @generated
 */
public interface CdapInternalApplicationConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.cdap.CdapKeyPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapInternalApplicationConfiguration_Config()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CdapKeyPair> getConfig();

	/**
	 * Returns the value of the '<em><b>Preferences</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.cdap.CdapKeyPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferences</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapInternalApplicationConfiguration_Preferences()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CdapKeyPair> getPreferences();

	/**
	 * Returns the value of the '<em><b>Apps</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.cdap.CdapEntityWithPreferences}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apps</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapInternalApplicationConfiguration_Apps()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CdapEntityWithPreferences> getApps();

	/**
	 * Returns the value of the '<em><b>Workers</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.cdap.CdapEntityWithPreferences}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workers</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapInternalApplicationConfiguration_Workers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CdapEntityWithPreferences> getWorkers();

	/**
	 * Returns the value of the '<em><b>Flows</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.cdap.CdapEntityWithPreferences}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flows</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapInternalApplicationConfiguration_Flows()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CdapEntityWithPreferences> getFlows();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.cdap.CdapEntityWithPreferences}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapInternalApplicationConfiguration_Services()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CdapEntityWithPreferences> getServices();

} // CdapInternalApplicationConfiguration
