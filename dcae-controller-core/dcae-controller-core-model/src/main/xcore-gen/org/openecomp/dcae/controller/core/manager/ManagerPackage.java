
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
package org.openecomp.dcae.controller.core.manager;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.openecomp.dcae.controller.core.manager.ManagerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-core-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.core'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore ecomp='http://openecomp.org'"
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
	String eNS_URI = "org.openecomp.dcae.controller.core.manager";

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
	ManagerPackage eINSTANCE = org.openecomp.dcae.controller.core.manager.impl.ManagerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.core.manager.impl.DcaeManagerImpl <em>Dcae Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.core.manager.impl.DcaeManagerImpl
	 * @see org.openecomp.dcae.controller.core.manager.impl.ManagerPackageImpl#getDcaeManager()
	 * @generated
	 */
	int DCAE_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Input Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_MANAGER__INPUT_STREAMS = 0;

	/**
	 * The feature id for the '<em><b>Output Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_MANAGER__OUTPUT_STREAMS = 1;

	/**
	 * The number of structural features of the '<em>Dcae Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_MANAGER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_MANAGER___TEST = 0;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_MANAGER___SUSPEND = 1;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_MANAGER___RESUME = 2;

	/**
	 * The operation id for the '<em>Public Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_MANAGER___PUBLIC_KEY = 3;

	/**
	 * The operation id for the '<em>Configuration Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_MANAGER___CONFIGURATION_CHANGED = 4;

	/**
	 * The operation id for the '<em>Update Streams</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_MANAGER___UPDATE_STREAMS__ELIST_ELIST = 5;

	/**
	 * The number of operations of the '<em>Dcae Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAE_MANAGER_OPERATION_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.core.manager.DcaeManager <em>Dcae Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dcae Manager</em>'.
	 * @see org.openecomp.dcae.controller.core.manager.DcaeManager
	 * @generated
	 */
	EClass getDcaeManager();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.core.manager.DcaeManager#getInputStreams <em>Input Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Streams</em>'.
	 * @see org.openecomp.dcae.controller.core.manager.DcaeManager#getInputStreams()
	 * @see #getDcaeManager()
	 * @generated
	 */
	EReference getDcaeManager_InputStreams();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.core.manager.DcaeManager#getOutputStreams <em>Output Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Streams</em>'.
	 * @see org.openecomp.dcae.controller.core.manager.DcaeManager#getOutputStreams()
	 * @see #getDcaeManager()
	 * @generated
	 */
	EReference getDcaeManager_OutputStreams();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.core.manager.DcaeManager#test() <em>Test</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test</em>' operation.
	 * @see org.openecomp.dcae.controller.core.manager.DcaeManager#test()
	 * @generated
	 */
	EOperation getDcaeManager__Test();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.core.manager.DcaeManager#suspend() <em>Suspend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Suspend</em>' operation.
	 * @see org.openecomp.dcae.controller.core.manager.DcaeManager#suspend()
	 * @generated
	 */
	EOperation getDcaeManager__Suspend();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.core.manager.DcaeManager#resume() <em>Resume</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resume</em>' operation.
	 * @see org.openecomp.dcae.controller.core.manager.DcaeManager#resume()
	 * @generated
	 */
	EOperation getDcaeManager__Resume();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.core.manager.DcaeManager#publicKey() <em>Public Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Public Key</em>' operation.
	 * @see org.openecomp.dcae.controller.core.manager.DcaeManager#publicKey()
	 * @generated
	 */
	EOperation getDcaeManager__PublicKey();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.core.manager.DcaeManager#configurationChanged() <em>Configuration Changed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Configuration Changed</em>' operation.
	 * @see org.openecomp.dcae.controller.core.manager.DcaeManager#configurationChanged()
	 * @generated
	 */
	EOperation getDcaeManager__ConfigurationChanged();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.core.manager.DcaeManager#updateStreams(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Update Streams</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Streams</em>' operation.
	 * @see org.openecomp.dcae.controller.core.manager.DcaeManager#updateStreams(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDcaeManager__UpdateStreams__EList_EList();

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
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.core.manager.impl.DcaeManagerImpl <em>Dcae Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.core.manager.impl.DcaeManagerImpl
		 * @see org.openecomp.dcae.controller.core.manager.impl.ManagerPackageImpl#getDcaeManager()
		 * @generated
		 */
		EClass DCAE_MANAGER = eINSTANCE.getDcaeManager();

		/**
		 * The meta object literal for the '<em><b>Input Streams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_MANAGER__INPUT_STREAMS = eINSTANCE.getDcaeManager_InputStreams();

		/**
		 * The meta object literal for the '<em><b>Output Streams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAE_MANAGER__OUTPUT_STREAMS = eINSTANCE.getDcaeManager_OutputStreams();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_MANAGER___TEST = eINSTANCE.getDcaeManager__Test();

		/**
		 * The meta object literal for the '<em><b>Suspend</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_MANAGER___SUSPEND = eINSTANCE.getDcaeManager__Suspend();

		/**
		 * The meta object literal for the '<em><b>Resume</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_MANAGER___RESUME = eINSTANCE.getDcaeManager__Resume();

		/**
		 * The meta object literal for the '<em><b>Public Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_MANAGER___PUBLIC_KEY = eINSTANCE.getDcaeManager__PublicKey();

		/**
		 * The meta object literal for the '<em><b>Configuration Changed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_MANAGER___CONFIGURATION_CHANGED = eINSTANCE.getDcaeManager__ConfigurationChanged();

		/**
		 * The meta object literal for the '<em><b>Update Streams</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DCAE_MANAGER___UPDATE_STREAMS__ELIST_ELIST = eINSTANCE.getDcaeManager__UpdateStreams__EList_EList();

	}

} //ManagerPackage
