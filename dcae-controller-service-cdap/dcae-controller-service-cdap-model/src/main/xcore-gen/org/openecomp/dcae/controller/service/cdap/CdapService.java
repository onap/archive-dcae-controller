
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

import org.openecomp.dcae.controller.core.service.DcaeService;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapService#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapService()
 * @model
 * @generated
 */
public interface CdapService extends DcaeService {

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance}.
	 * It is bidirectional and its opposite is '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapService_Instances()
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getService
	 * @model opposite="service" containment="true"
	 * @generated
	 */
	EList<CdapServiceInstance> getInstances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model instanceNameUnique="false"
	 * @generated
	 */
	void updateInstanceConfiguration(String instanceName);
} // CdapService
