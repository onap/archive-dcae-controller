
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

import org.openecomp.dcae.controller.core.service.DcaeServiceInstance;

import org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterServiceInstance;
import org.openecomp.ncomp.cdap.CdapNamespace;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getCdapName <em>Cdap Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getAppJar <em>App Jar</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getAppConfigFile <em>App Config File</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getApps <em>Apps</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getDeploySteps <em>Deploy Steps</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getUndeploySteps <em>Undeploy Steps</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getPreConfigurationSteps <em>Pre Configuration Steps</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getPostConfigurationSteps <em>Post Configuration Steps</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getAppNames <em>App Names</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getWorkerNames <em>Worker Names</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getFlowNames <em>Flow Names</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getServiceNames <em>Service Names</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getCdapConfiguration <em>Cdap Configuration</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getClusterService <em>Cluster Service</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getCdapNamespace <em>Cdap Namespace</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance()
 * @model
 * @generated
 */
public interface CdapServiceInstance extends DcaeServiceInstance {
	/**
	 * Returns the value of the '<em><b>Cdap Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cdap Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cdap Name</em>' attribute.
	 * @see #setCdapName(String)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_CdapName()
	 * @model unique="false"
	 * @generated
	 */
	String getCdapName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getCdapName <em>Cdap Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cdap Name</em>' attribute.
	 * @see #getCdapName()
	 * @generated
	 */
	void setCdapName(String value);

	/**
	 * Returns the value of the '<em><b>Cdap Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cdap Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cdap Namespace</em>' reference.
	 * @see #setCdapNamespace(CdapNamespace)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_CdapNamespace()
	 * @model annotation="http://openecomp.org type='operational'"
	 * @generated
	 */
	CdapNamespace getCdapNamespace();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getCdapNamespace <em>Cdap Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cdap Namespace</em>' reference.
	 * @see #getCdapNamespace()
	 * @generated
	 */
	void setCdapNamespace(CdapNamespace value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_Namespace()
	 * @model unique="false"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>App Jar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Jar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Jar</em>' attribute.
	 * @see #setAppJar(String)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_AppJar()
	 * @model unique="false"
	 * @generated
	 */
	String getAppJar();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getAppJar <em>App Jar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Jar</em>' attribute.
	 * @see #getAppJar()
	 * @generated
	 */
	void setAppJar(String value);

	/**
	 * Returns the value of the '<em><b>App Config File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Config File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Config File</em>' attribute.
	 * @see #setAppConfigFile(String)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_AppConfigFile()
	 * @model unique="false"
	 * @generated
	 */
	String getAppConfigFile();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getAppConfigFile <em>App Config File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Config File</em>' attribute.
	 * @see #getAppConfigFile()
	 * @generated
	 */
	void setAppConfigFile(String value);

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.service.cdap.CdapArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_Artifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<CdapArtifact> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Apps</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.service.cdap.CdapApplication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apps</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_Apps()
	 * @model containment="true"
	 * @generated
	 */
	EList<CdapApplication> getApps();

	/**
	 * Returns the value of the '<em><b>Deploy Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.service.cdap.CdapStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deploy Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy Steps</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_DeploySteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<CdapStep> getDeploySteps();

	/**
	 * Returns the value of the '<em><b>Undeploy Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.service.cdap.CdapStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Undeploy Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Undeploy Steps</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_UndeploySteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<CdapStep> getUndeploySteps();

	/**
	 * Returns the value of the '<em><b>Pre Configuration Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.service.cdap.CdapStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Configuration Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Configuration Steps</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_PreConfigurationSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<CdapStep> getPreConfigurationSteps();

	/**
	 * Returns the value of the '<em><b>Post Configuration Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.service.cdap.CdapStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Configuration Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Configuration Steps</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_PostConfigurationSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<CdapStep> getPostConfigurationSteps();

	/**
	 * Returns the value of the '<em><b>App Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Names</em>' attribute list.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_AppNames()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getAppNames();

	/**
	 * Returns the value of the '<em><b>Worker Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worker Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worker Names</em>' attribute list.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_WorkerNames()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getWorkerNames();

	/**
	 * Returns the value of the '<em><b>Flow Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Names</em>' attribute list.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_FlowNames()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getFlowNames();

	/**
	 * Returns the value of the '<em><b>Service Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Names</em>' attribute list.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_ServiceNames()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getServiceNames();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(CdapServiceInstanceConfiguration)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_Configuration()
	 * @model containment="true"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	CdapServiceInstanceConfiguration getConfiguration();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(CdapServiceInstanceConfiguration value);

	/**
	 * Returns the value of the '<em><b>Cdap Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cdap Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cdap Configuration</em>' containment reference.
	 * @see #setCdapConfiguration(CdapInternalApplicationConfiguration)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_CdapConfiguration()
	 * @model containment="true"
	 *        annotation="http://openecomp.org type='operational'"
	 * @generated
	 */
	CdapInternalApplicationConfiguration getCdapConfiguration();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getCdapConfiguration <em>Cdap Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cdap Configuration</em>' containment reference.
	 * @see #getCdapConfiguration()
	 * @generated
	 */
	void setCdapConfiguration(CdapInternalApplicationConfiguration value);

	/**
	 * Returns the value of the '<em><b>Cluster Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cluster Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster Service</em>' reference.
	 * @see #setClusterService(CdapClusterServiceInstance)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_ClusterService()
	 * @model annotation="http://openecomp.org type='operational'"
	 * @generated
	 */
	CdapClusterServiceInstance getClusterService();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getClusterService <em>Cluster Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster Service</em>' reference.
	 * @see #getClusterService()
	 * @generated
	 */
	void setClusterService(CdapClusterServiceInstance value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openecomp.dcae.controller.service.cdap.CdapService#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' container reference.
	 * @see #setService(CdapService)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceInstance_Service()
	 * @see org.openecomp.dcae.controller.service.cdap.CdapService#getInstances
	 * @model opposite="instances" transient="false"
	 *        annotation="http://openecomp.org type='operational'"
	 * @generated
	 */
	CdapService getService();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getService <em>Service</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' container reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(CdapService value);

} // CdapServiceInstance
