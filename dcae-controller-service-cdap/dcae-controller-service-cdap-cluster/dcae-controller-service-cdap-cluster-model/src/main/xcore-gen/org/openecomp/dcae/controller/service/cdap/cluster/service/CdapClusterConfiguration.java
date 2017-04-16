
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
package org.openecomp.dcae.controller.service.cdap.cluster.service;

import org.openecomp.ncomp.cdap.CdapCluster;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cdap Cluster Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterConfiguration#getCluster <em>Cluster</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterConfiguration#getCdapServiceServers <em>Cdap Service Servers</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterConfiguration#getHealthCheckScript <em>Health Check Script</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterConfiguration#getTestTimeout <em>Test Timeout</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.ServicePackage#getCdapClusterConfiguration()
 * @model
 * @generated
 */
public interface CdapClusterConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Cluster</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cluster</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster</em>' containment reference.
	 * @see #setCluster(CdapCluster)
	 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.ServicePackage#getCdapClusterConfiguration_Cluster()
	 * @model containment="true"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	CdapCluster getCluster();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterConfiguration#getCluster <em>Cluster</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster</em>' containment reference.
	 * @see #getCluster()
	 * @generated
	 */
	void setCluster(CdapCluster value);

	/**
	 * Returns the value of the '<em><b>Cdap Service Servers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cdap Service Servers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cdap Service Servers</em>' attribute list.
	 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.ServicePackage#getCdapClusterConfiguration_CdapServiceServers()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getCdapServiceServers();

	/**
	 * Returns the value of the '<em><b>Health Check Script</b></em>' attribute.
	 * The default value is <code>"bin/healthCheck.sh"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Health Check Script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Check Script</em>' attribute.
	 * @see #setHealthCheckScript(String)
	 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.ServicePackage#getCdapClusterConfiguration_HealthCheckScript()
	 * @model default="bin/healthCheck.sh" unique="false"
	 * @generated
	 */
	String getHealthCheckScript();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterConfiguration#getHealthCheckScript <em>Health Check Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Check Script</em>' attribute.
	 * @see #getHealthCheckScript()
	 * @generated
	 */
	void setHealthCheckScript(String value);

	/**
	 * Returns the value of the '<em><b>Test Timeout</b></em>' attribute.
	 * The default value is <code>"60000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Timeout</em>' attribute.
	 * @see #setTestTimeout(int)
	 * @see org.openecomp.dcae.controller.service.cdap.cluster.service.ServicePackage#getCdapClusterConfiguration_TestTimeout()
	 * @model default="60000" unique="false"
	 * @generated
	 */
	int getTestTimeout();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterConfiguration#getTestTimeout <em>Test Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Timeout</em>' attribute.
	 * @see #getTestTimeout()
	 * @generated
	 */
	void setTestTimeout(int value);

} // CdapClusterConfiguration
