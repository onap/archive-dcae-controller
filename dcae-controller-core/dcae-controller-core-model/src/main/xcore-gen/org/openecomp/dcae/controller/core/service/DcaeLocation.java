
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
package org.openecomp.dcae.controller.core.service;

import org.openecomp.ncomp.openstack.location.OpenStackProject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dcae Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.service.DcaeLocation#getLocationType <em>Location Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.DcaeLocation#getOpenstackProject <em>Openstack Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaeLocation()
 * @model
 * @generated
 */
public interface DcaeLocation extends DcaeServiceContainer {

	/**
	 * Returns the value of the '<em><b>Location Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Type</em>' attribute.
	 * @see #setLocationType(String)
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaeLocation_LocationType()
	 * @model unique="false"
	 * @generated
	 */
	String getLocationType();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.service.DcaeLocation#getLocationType <em>Location Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Type</em>' attribute.
	 * @see #getLocationType()
	 * @generated
	 */
	void setLocationType(String value);

	/**
	 * Returns the value of the '<em><b>Openstack Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Openstack Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Openstack Project</em>' reference.
	 * @see #setOpenstackProject(OpenStackProject)
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaeLocation_OpenstackProject()
	 * @model
	 * @generated
	 */
	OpenStackProject getOpenstackProject();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.service.DcaeLocation#getOpenstackProject <em>Openstack Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openstack Project</em>' reference.
	 * @see #getOpenstackProject()
	 * @generated
	 */
	void setOpenstackProject(OpenStackProject value);
} // DcaeLocation
