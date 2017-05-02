
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
package org.openecomp.dcae.controller.platform.controller;

import org.openecomp.ncomp.core.types.metrics.DateMetricAttribute;
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.ControllerCluster#getMyServerName <em>My Server Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.ControllerCluster#getRole <em>Role</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.ControllerCluster#getStateTime <em>State Time</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.ControllerCluster#getServers <em>Servers</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.ControllerCluster#getRemoteServers <em>Remote Servers</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getControllerCluster()
 * @model
 * @generated
 */
public interface ControllerCluster extends EObject {
	/**
	 * Returns the value of the '<em><b>My Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Server Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Server Name</em>' attribute.
	 * @see #setMyServerName(String)
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getControllerCluster_MyServerName()
	 * @model unique="false"
	 * @generated
	 */
	String getMyServerName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.platform.controller.ControllerCluster#getMyServerName <em>My Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Server Name</em>' attribute.
	 * @see #getMyServerName()
	 * @generated
	 */
	void setMyServerName(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.dcae.controller.platform.controller.ServerRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see org.openecomp.dcae.controller.platform.controller.ServerRole
	 * @see #setRole(ServerRole)
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getControllerCluster_Role()
	 * @model unique="false"
	 * @generated
	 */
	ServerRole getRole();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.platform.controller.ControllerCluster#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see org.openecomp.dcae.controller.platform.controller.ServerRole
	 * @see #getRole()
	 * @generated
	 */
	void setRole(ServerRole value);

	/**
	 * Returns the value of the '<em><b>State Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Time</em>' attribute.
	 * @see #setStateTime(DateMetricAttribute)
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getControllerCluster_StateTime()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DateMetricAttribute"
	 * @generated
	 */
	DateMetricAttribute getStateTime();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.platform.controller.ControllerCluster#getStateTime <em>State Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Time</em>' attribute.
	 * @see #getStateTime()
	 * @generated
	 */
	void setStateTime(DateMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getControllerCluster_Servers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControllerClusterServer> getServers();

	/**
	 * Returns the value of the '<em><b>Remote Servers</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Servers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Servers</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getControllerCluster_RemoteServers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControllerClusterServer> getRemoteServers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serverNameUnique="false" dataNameUnique="false"
	 * @generated
	 */
	void pushData(String serverName, String dataName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serverNameUnique="false" dataNameUnique="false" timeUnique="false" contentUnique="false"
	 * @generated
	 */
	void receiveData(String serverName, String dataName, Date time, String content);

} // ControllerCluster
