
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
package org.openecomp.dcae.controller.service.standardeventcollector.manager;

import org.openecomp.dcae.controller.service.dockermanager.DockermanagerPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * -
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 * <!-- end-model-doc -->
 * @see org.openecomp.dcae.controller.service.standardeventcollector.manager.ManagerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-service-standardeventcollector-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.service.standardeventcollector'"
 * @generated
 */
public interface ManagerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "manager";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.dcae.controller.service.standardeventcollector.manager";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "manager";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ManagerPackage eINSTANCE = org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ManagerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ControllerServiceStandardeventcollectorManagerImpl <em>Controller Service Standardeventcollector Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ControllerServiceStandardeventcollectorManagerImpl
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ManagerPackageImpl#getControllerServiceStandardeventcollectorManager()
	 * @generated
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Input Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__INPUT_STREAMS = DockermanagerPackage.DOCKER_MANAGER__INPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Output Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__OUTPUT_STREAMS = DockermanagerPackage.DOCKER_MANAGER__OUTPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CONFIGURATION = DockermanagerPackage.DOCKER_MANAGER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Cport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CPORT = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Csecport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CSECPORT = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Keystoreloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__KEYSTORELOC = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Keystorealias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__KEYSTOREALIAS = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Keystorepwdloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__KEYSTOREPWDLOC = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Maxinputqueue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__MAXINPUTQUEUE = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Authflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHFLAG = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Authlist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHLIST = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Checkschemaflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CHECKSCHEMAFLAG = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Schemafile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__SCHEMAFILE = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Streamid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__STREAMID = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Controller Service Standardeventcollector Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER_FEATURE_COUNT = DockermanagerPackage.DOCKER_MANAGER_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER___TEST = DockermanagerPackage.DOCKER_MANAGER___TEST;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER___SUSPEND = DockermanagerPackage.DOCKER_MANAGER___SUSPEND;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER___RESUME = DockermanagerPackage.DOCKER_MANAGER___RESUME;

	/**
	 * The operation id for the '<em>Public Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER___PUBLIC_KEY = DockermanagerPackage.DOCKER_MANAGER___PUBLIC_KEY;

	/**
	 * The operation id for the '<em>Configuration Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER___CONFIGURATION_CHANGED = DockermanagerPackage.DOCKER_MANAGER___CONFIGURATION_CHANGED;

	/**
	 * The operation id for the '<em>Update Streams</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER___UPDATE_STREAMS__ELIST_ELIST = DockermanagerPackage.DOCKER_MANAGER___UPDATE_STREAMS__ELIST_ELIST;

	/**
	 * The number of operations of the '<em>Controller Service Standardeventcollector Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER_OPERATION_COUNT = DockermanagerPackage.DOCKER_MANAGER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.standardeventcollector.manager.ControllerServiceStandardeventcollectorManager <em>Controller Service Standardeventcollector Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Service Standardeventcollector Manager</em>'.
	 * @see org.openecomp.dcae.controller.service.standardeventcollector.manager.ControllerServiceStandardeventcollectorManager
	 * @generated
	 */
	EClass getControllerServiceStandardeventcollectorManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ManagerFactory getManagerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ControllerServiceStandardeventcollectorManagerImpl <em>Controller Service Standardeventcollector Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ControllerServiceStandardeventcollectorManagerImpl
		 * @see org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ManagerPackageImpl#getControllerServiceStandardeventcollectorManager()
		 * @generated
		 */
		EClass CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER = eINSTANCE.getControllerServiceStandardeventcollectorManager();

	}

} //ManagerPackage
