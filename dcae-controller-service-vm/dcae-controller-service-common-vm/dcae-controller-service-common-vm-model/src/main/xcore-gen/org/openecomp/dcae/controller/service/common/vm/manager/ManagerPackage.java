
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
package org.openecomp.dcae.controller.service.common.vm.manager;

import org.openecomp.dcae.controller.service.vmmanager.VmmanagerPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.openecomp.dcae.controller.service.common.vm.manager.ManagerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-service-common-vm-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.service.common.vm'"
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
	String eNS_URI = "org.openecomp.dcae.controller.service.common.vm.manager";

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
	ManagerPackage eINSTANCE = org.openecomp.dcae.controller.service.common.vm.manager.impl.ManagerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.common.vm.manager.impl.CommonVmManagerImpl <em>Common Vm Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.common.vm.manager.impl.CommonVmManagerImpl
	 * @see org.openecomp.dcae.controller.service.common.vm.manager.impl.ManagerPackageImpl#getCommonVmManager()
	 * @generated
	 */
	int COMMON_VM_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Input Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER__INPUT_STREAMS = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__INPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Output Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER__OUTPUT_STREAMS = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__OUTPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER__CONFIGURATION = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER__COMPONENT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__COMPONENT;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER__SCRIPT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configure Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER__CONFIGURE_TIMEOUT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER__TEST_TIMEOUT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Suspend Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER__SUSPEND_TIMEOUT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resume Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER__RESUME_TIMEOUT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vm Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER__VM_CONFIGURATION = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Common Vm Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER_FEATURE_COUNT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER___TEST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___TEST;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER___SUSPEND = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___SUSPEND;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER___RESUME = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___RESUME;

	/**
	 * The operation id for the '<em>Public Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER___PUBLIC_KEY = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___PUBLIC_KEY;

	/**
	 * The operation id for the '<em>Configuration Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER___CONFIGURATION_CHANGED = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___CONFIGURATION_CHANGED;

	/**
	 * The operation id for the '<em>Update Streams</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER___UPDATE_STREAMS__ELIST_ELIST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___UPDATE_STREAMS__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Logs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER___LOGS__JSONOBJECT_ELIST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___LOGS__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Metrics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER___METRICS__JSONOBJECT_ELIST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___METRICS__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER___PROPERTIES__JSONOBJECT_ELIST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___PROPERTIES__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Upload Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER___UPLOAD_INFO__JSONOBJECT_ELIST = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___UPLOAD_INFO__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Get Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER___GET_VALUES__JSONOBJECT_STRING_LONG_LONG_METRICVALUEOPTION_BOOLEAN = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_VALUES__JSONOBJECT_STRING_LONG_LONG_METRICVALUEOPTION_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Values All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER___GET_VALUES_ALL__JSONOBJECT_STRING_ELIST_LONG_LONG_METRICVALUEOPTION_BOOLEAN = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_VALUES_ALL__JSONOBJECT_STRING_ELIST_LONG_LONG_METRICVALUEOPTION_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Messages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER___GET_MESSAGES__JSONOBJECT_STRING_LONG_LONG = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_MESSAGES__JSONOBJECT_STRING_LONG_LONG;

	/**
	 * The operation id for the '<em>Get Request Logger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER___GET_REQUEST_LOGGER__STRING_STRING_STRING_JSONOBJECT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_REQUEST_LOGGER__STRING_STRING_STRING_JSONOBJECT;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER___EVALUATE__STRING_FUNCTION = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___EVALUATE__STRING_FUNCTION;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER___UPDATE__STRING_FUNCTION = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___UPDATE__STRING_FUNCTION;

	/**
	 * The number of operations of the '<em>Common Vm Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VM_MANAGER_OPERATION_COUNT = VmmanagerPackage.VIRTUAL_MACHINE_MANAGER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.common.vm.manager.CommonVmManager <em>Common Vm Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Vm Manager</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.manager.CommonVmManager
	 * @generated
	 */
	EClass getCommonVmManager();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.vm.manager.CommonVmManager#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.manager.CommonVmManager#getScript()
	 * @see #getCommonVmManager()
	 * @generated
	 */
	EAttribute getCommonVmManager_Script();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.vm.manager.CommonVmManager#getConfigureTimeout <em>Configure Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configure Timeout</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.manager.CommonVmManager#getConfigureTimeout()
	 * @see #getCommonVmManager()
	 * @generated
	 */
	EAttribute getCommonVmManager_ConfigureTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.vm.manager.CommonVmManager#getTestTimeout <em>Test Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Timeout</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.manager.CommonVmManager#getTestTimeout()
	 * @see #getCommonVmManager()
	 * @generated
	 */
	EAttribute getCommonVmManager_TestTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.vm.manager.CommonVmManager#getSuspendTimeout <em>Suspend Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspend Timeout</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.manager.CommonVmManager#getSuspendTimeout()
	 * @see #getCommonVmManager()
	 * @generated
	 */
	EAttribute getCommonVmManager_SuspendTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.common.vm.manager.CommonVmManager#getResumeTimeout <em>Resume Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resume Timeout</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.manager.CommonVmManager#getResumeTimeout()
	 * @see #getCommonVmManager()
	 * @generated
	 */
	EAttribute getCommonVmManager_ResumeTimeout();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.service.common.vm.manager.CommonVmManager#getVmConfiguration <em>Vm Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vm Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.common.vm.manager.CommonVmManager#getVmConfiguration()
	 * @see #getCommonVmManager()
	 * @generated
	 */
	EReference getCommonVmManager_VmConfiguration();

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
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.common.vm.manager.impl.CommonVmManagerImpl <em>Common Vm Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.common.vm.manager.impl.CommonVmManagerImpl
		 * @see org.openecomp.dcae.controller.service.common.vm.manager.impl.ManagerPackageImpl#getCommonVmManager()
		 * @generated
		 */
		EClass COMMON_VM_MANAGER = eINSTANCE.getCommonVmManager();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_VM_MANAGER__SCRIPT = eINSTANCE.getCommonVmManager_Script();

		/**
		 * The meta object literal for the '<em><b>Configure Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_VM_MANAGER__CONFIGURE_TIMEOUT = eINSTANCE.getCommonVmManager_ConfigureTimeout();

		/**
		 * The meta object literal for the '<em><b>Test Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_VM_MANAGER__TEST_TIMEOUT = eINSTANCE.getCommonVmManager_TestTimeout();

		/**
		 * The meta object literal for the '<em><b>Suspend Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_VM_MANAGER__SUSPEND_TIMEOUT = eINSTANCE.getCommonVmManager_SuspendTimeout();

		/**
		 * The meta object literal for the '<em><b>Resume Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_VM_MANAGER__RESUME_TIMEOUT = eINSTANCE.getCommonVmManager_ResumeTimeout();

		/**
		 * The meta object literal for the '<em><b>Vm Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_VM_MANAGER__VM_CONFIGURATION = eINSTANCE.getCommonVmManager_VmConfiguration();

	}

} //ManagerPackage
