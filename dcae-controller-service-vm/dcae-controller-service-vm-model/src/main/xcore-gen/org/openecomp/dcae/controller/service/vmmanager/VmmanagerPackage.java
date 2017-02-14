
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
package org.openecomp.dcae.controller.service.vmmanager;

import org.openecomp.dcae.controller.core.manager.ManagerPackage;

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
 * @see org.openecomp.dcae.controller.service.vmmanager.VmmanagerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-service-vm-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.service'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore ecomp='http://openecomp.org'"
 * @generated
 */
public interface VmmanagerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vmmanager";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.dcae.controller.service.vmmanager";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vmmanager";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmmanagerPackage eINSTANCE = org.openecomp.dcae.controller.service.vmmanager.impl.VmmanagerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.vmmanager.impl.VirtualMachineManagerImpl <em>Virtual Machine Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.vmmanager.impl.VirtualMachineManagerImpl
	 * @see org.openecomp.dcae.controller.service.vmmanager.impl.VmmanagerPackageImpl#getVirtualMachineManager()
	 * @generated
	 */
	int VIRTUAL_MACHINE_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Input Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER__INPUT_STREAMS = ManagerPackage.DCAE_MANAGER__INPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Output Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER__OUTPUT_STREAMS = ManagerPackage.DCAE_MANAGER__OUTPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER__CONFIGURATION = ManagerPackage.DCAE_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER__COMPONENT = ManagerPackage.DCAE_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Virtual Machine Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER_FEATURE_COUNT = ManagerPackage.DCAE_MANAGER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER___TEST = ManagerPackage.DCAE_MANAGER___TEST;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER___SUSPEND = ManagerPackage.DCAE_MANAGER___SUSPEND;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER___RESUME = ManagerPackage.DCAE_MANAGER___RESUME;

	/**
	 * The operation id for the '<em>Public Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER___PUBLIC_KEY = ManagerPackage.DCAE_MANAGER___PUBLIC_KEY;

	/**
	 * The operation id for the '<em>Configuration Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER___CONFIGURATION_CHANGED = ManagerPackage.DCAE_MANAGER___CONFIGURATION_CHANGED;

	/**
	 * The operation id for the '<em>Update Streams</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER___UPDATE_STREAMS__ELIST_ELIST = ManagerPackage.DCAE_MANAGER___UPDATE_STREAMS__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Logs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER___LOGS__JSONOBJECT_ELIST = ManagerPackage.DCAE_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Metrics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER___METRICS__JSONOBJECT_ELIST = ManagerPackage.DCAE_MANAGER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER___PROPERTIES__JSONOBJECT_ELIST = ManagerPackage.DCAE_MANAGER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Upload Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER___UPLOAD_INFO__JSONOBJECT_ELIST = ManagerPackage.DCAE_MANAGER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER___GET_VALUES__JSONOBJECT_STRING_LONG_LONG_METRICVALUEOPTION_BOOLEAN = ManagerPackage.DCAE_MANAGER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Values All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER___GET_VALUES_ALL__JSONOBJECT_STRING_ELIST_LONG_LONG_METRICVALUEOPTION_BOOLEAN = ManagerPackage.DCAE_MANAGER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Messages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER___GET_MESSAGES__JSONOBJECT_STRING_LONG_LONG = ManagerPackage.DCAE_MANAGER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Request Logger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER___GET_REQUEST_LOGGER__STRING_STRING_STRING_JSONOBJECT = ManagerPackage.DCAE_MANAGER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER___EVALUATE__STRING_FUNCTION = ManagerPackage.DCAE_MANAGER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER___UPDATE__STRING_FUNCTION = ManagerPackage.DCAE_MANAGER_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Virtual Machine Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT = ManagerPackage.DCAE_MANAGER_OPERATION_COUNT + 10;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.vmmanager.VirtualMachineManager <em>Virtual Machine Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine Manager</em>'.
	 * @see org.openecomp.dcae.controller.service.vmmanager.VirtualMachineManager
	 * @generated
	 */
	EClass getVirtualMachineManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VmmanagerFactory getVmmanagerFactory();

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
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.vmmanager.impl.VirtualMachineManagerImpl <em>Virtual Machine Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.vmmanager.impl.VirtualMachineManagerImpl
		 * @see org.openecomp.dcae.controller.service.vmmanager.impl.VmmanagerPackageImpl#getVirtualMachineManager()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE_MANAGER = eINSTANCE.getVirtualMachineManager();

	}

} //VmmanagerPackage
