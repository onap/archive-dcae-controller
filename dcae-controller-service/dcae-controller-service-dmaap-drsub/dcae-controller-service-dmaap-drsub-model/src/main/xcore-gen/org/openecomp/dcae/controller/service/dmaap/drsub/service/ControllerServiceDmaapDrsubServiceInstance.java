
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
package org.openecomp.dcae.controller.service.dmaap.drsub.service;

import org.openecomp.dcae.controller.service.cdap.cluster.service.CdapClusterServiceInstance;
import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Service Dmaap Drsub Service Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceInstance#getCdapClusterInstance <em>Cdap Cluster Instance</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceInstance#getCdapServiceName <em>Cdap Service Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getControllerServiceDmaapDrsubServiceInstance()
 * @model
 * @generated
 */
public interface ControllerServiceDmaapDrsubServiceInstance extends VirtualMachineServiceInstance, ControllerServiceDmaapDrsubServiceConfiguration {

	/**
	 * Returns the value of the '<em><b>Cdap Cluster Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cdap Cluster Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cdap Cluster Instance</em>' reference.
	 * @see #setCdapClusterInstance(CdapClusterServiceInstance)
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getControllerServiceDmaapDrsubServiceInstance_CdapClusterInstance()
	 * @model
	 * @generated
	 */
	CdapClusterServiceInstance getCdapClusterInstance();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceInstance#getCdapClusterInstance <em>Cdap Cluster Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cdap Cluster Instance</em>' reference.
	 * @see #getCdapClusterInstance()
	 * @generated
	 */
	void setCdapClusterInstance(CdapClusterServiceInstance value);

	/**
	 * Returns the value of the '<em><b>Cdap Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cdap Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cdap Service Name</em>' attribute.
	 * @see #setCdapServiceName(String)
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getControllerServiceDmaapDrsubServiceInstance_CdapServiceName()
	 * @model unique="false"
	 * @generated
	 */
	String getCdapServiceName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceInstance#getCdapServiceName <em>Cdap Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cdap Service Name</em>' attribute.
	 * @see #getCdapServiceName()
	 * @generated
	 */
	void setCdapServiceName(String value);
} // ControllerServiceDmaapDrsubServiceInstance
