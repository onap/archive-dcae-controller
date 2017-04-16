
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
package org.openecomp.dcae.controller.service.standardeventcollector.service;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Service Standardeventcollector Service Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getCport <em>Cport</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getCsecport <em>Csecport</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getKeystoreloc <em>Keystoreloc</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getKeystorealias <em>Keystorealias</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getKeystorepwdloc <em>Keystorepwdloc</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getMaxinputqueue <em>Maxinputqueue</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getAuthflag <em>Authflag</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getAuthlist <em>Authlist</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getCheckschemaflag <em>Checkschemaflag</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getSchemafile <em>Schemafile</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getStreamid <em>Streamid</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ServicePackage#getControllerServiceStandardeventcollectorServiceConfiguration()
 * @model
 * @generated
 */
public interface ControllerServiceStandardeventcollectorServiceConfiguration extends EObject {

	/**
	 * Returns the value of the '<em><b>Cport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cport</em>' attribute.
	 * @see #setCport(String)
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ServicePackage#getControllerServiceStandardeventcollectorServiceConfiguration_Cport()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getCport();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getCport <em>Cport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cport</em>' attribute.
	 * @see #getCport()
	 * @generated
	 */
	void setCport(String value);

	/**
	 * Returns the value of the '<em><b>Csecport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csecport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csecport</em>' attribute.
	 * @see #setCsecport(String)
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ServicePackage#getControllerServiceStandardeventcollectorServiceConfiguration_Csecport()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getCsecport();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getCsecport <em>Csecport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csecport</em>' attribute.
	 * @see #getCsecport()
	 * @generated
	 */
	void setCsecport(String value);

	/**
	 * Returns the value of the '<em><b>Keystoreloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keystoreloc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keystoreloc</em>' attribute.
	 * @see #setKeystoreloc(String)
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ServicePackage#getControllerServiceStandardeventcollectorServiceConfiguration_Keystoreloc()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getKeystoreloc();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getKeystoreloc <em>Keystoreloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keystoreloc</em>' attribute.
	 * @see #getKeystoreloc()
	 * @generated
	 */
	void setKeystoreloc(String value);

	/**
	 * Returns the value of the '<em><b>Keystorealias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keystorealias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keystorealias</em>' attribute.
	 * @see #setKeystorealias(String)
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ServicePackage#getControllerServiceStandardeventcollectorServiceConfiguration_Keystorealias()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getKeystorealias();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getKeystorealias <em>Keystorealias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keystorealias</em>' attribute.
	 * @see #getKeystorealias()
	 * @generated
	 */
	void setKeystorealias(String value);

	/**
	 * Returns the value of the '<em><b>Keystorepwdloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keystorepwdloc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keystorepwdloc</em>' attribute.
	 * @see #setKeystorepwdloc(String)
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ServicePackage#getControllerServiceStandardeventcollectorServiceConfiguration_Keystorepwdloc()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getKeystorepwdloc();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getKeystorepwdloc <em>Keystorepwdloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keystorepwdloc</em>' attribute.
	 * @see #getKeystorepwdloc()
	 * @generated
	 */
	void setKeystorepwdloc(String value);

	/**
	 * Returns the value of the '<em><b>Maxinputqueue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxinputqueue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxinputqueue</em>' attribute.
	 * @see #setMaxinputqueue(String)
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ServicePackage#getControllerServiceStandardeventcollectorServiceConfiguration_Maxinputqueue()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getMaxinputqueue();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getMaxinputqueue <em>Maxinputqueue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxinputqueue</em>' attribute.
	 * @see #getMaxinputqueue()
	 * @generated
	 */
	void setMaxinputqueue(String value);

	/**
	 * Returns the value of the '<em><b>Authflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authflag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authflag</em>' attribute.
	 * @see #setAuthflag(String)
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ServicePackage#getControllerServiceStandardeventcollectorServiceConfiguration_Authflag()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getAuthflag();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getAuthflag <em>Authflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authflag</em>' attribute.
	 * @see #getAuthflag()
	 * @generated
	 */
	void setAuthflag(String value);

	/**
	 * Returns the value of the '<em><b>Checkschemaflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checkschemaflag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkschemaflag</em>' attribute.
	 * @see #setCheckschemaflag(String)
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ServicePackage#getControllerServiceStandardeventcollectorServiceConfiguration_Checkschemaflag()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getCheckschemaflag();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getCheckschemaflag <em>Checkschemaflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkschemaflag</em>' attribute.
	 * @see #getCheckschemaflag()
	 * @generated
	 */
	void setCheckschemaflag(String value);

	/**
	 * Returns the value of the '<em><b>Schemafile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemafile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemafile</em>' attribute.
	 * @see #setSchemafile(String)
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ServicePackage#getControllerServiceStandardeventcollectorServiceConfiguration_Schemafile()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getSchemafile();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getSchemafile <em>Schemafile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schemafile</em>' attribute.
	 * @see #getSchemafile()
	 * @generated
	 */
	void setSchemafile(String value);

	/**
	 * Returns the value of the '<em><b>Authlist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authlist</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authlist</em>' attribute.
	 * @see #setAuthlist(String)
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ServicePackage#getControllerServiceStandardeventcollectorServiceConfiguration_Authlist()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getAuthlist();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getAuthlist <em>Authlist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authlist</em>' attribute.
	 * @see #getAuthlist()
	 * @generated
	 */
	void setAuthlist(String value);

	/**
	 * Returns the value of the '<em><b>Streamid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Streamid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Streamid</em>' attribute.
	 * @see #setStreamid(String)
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.service.ServicePackage#getControllerServiceStandardeventcollectorServiceConfiguration_Streamid()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getStreamid();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration#getStreamid <em>Streamid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Streamid</em>' attribute.
	 * @see #getStreamid()
	 * @generated
	 */
	void setStreamid(String value);
} // ControllerServiceStandardeventcollectorServiceConfiguration
