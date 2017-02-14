
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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage
 * @generated
 */
public interface ServiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServiceFactory eINSTANCE = org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ServiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Controller Service Dmaap Drsub Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller Service Dmaap Drsub Service</em>'.
	 * @generated
	 */
	ControllerServiceDmaapDrsubService createControllerServiceDmaapDrsubService();

	/**
	 * Returns a new object of class '<em>Controller Service Dmaap Drsub Service Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller Service Dmaap Drsub Service Instance</em>'.
	 * @generated
	 */
	ControllerServiceDmaapDrsubServiceInstance createControllerServiceDmaapDrsubServiceInstance();

	/**
	 * Returns a new object of class '<em>Controller Service Dmaap Drsub Service Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller Service Dmaap Drsub Service Configuration</em>'.
	 * @generated
	 */
	ControllerServiceDmaapDrsubServiceConfiguration createControllerServiceDmaapDrsubServiceConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ServicePackage getServicePackage();

} //ServiceFactory
