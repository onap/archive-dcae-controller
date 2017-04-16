
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
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor#getServicePackage <em>Service Package</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor#getServiceInstanceClass <em>Service Instance Class</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor#getJarFile <em>Jar File</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceDescriptor()
 * @model
 * @generated
 */
public interface CdapServiceDescriptor extends DcaeServiceDescriptor {
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
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceDescriptor_ServicePackage()
	 * @model unique="false"
	 * @generated
	 */
	String getServicePackage();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor#getServicePackage <em>Service Package</em>}' attribute.
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
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceDescriptor_ServiceClass()
	 * @model unique="false"
	 * @generated
	 */
	String getServiceClass();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor#getServiceClass <em>Service Class</em>}' attribute.
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
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceDescriptor_ServiceInstanceClass()
	 * @model unique="false"
	 * @generated
	 */
	String getServiceInstanceClass();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor#getServiceInstanceClass <em>Service Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Instance Class</em>' attribute.
	 * @see #getServiceInstanceClass()
	 * @generated
	 */
	void setServiceInstanceClass(String value);

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
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapServiceDescriptor_JarFile()
	 * @model unique="false"
	 * @generated
	 */
	String getJarFile();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor#getJarFile <em>Jar File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jar File</em>' attribute.
	 * @see #getJarFile()
	 * @generated
	 */
	void setJarFile(String value);

} // CdapServiceDescriptor
