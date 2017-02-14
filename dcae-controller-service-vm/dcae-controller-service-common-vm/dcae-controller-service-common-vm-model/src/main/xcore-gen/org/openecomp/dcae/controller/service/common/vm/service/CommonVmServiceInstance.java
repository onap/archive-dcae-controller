
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
package org.openecomp.dcae.controller.service.common.vm.service;

import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Vm Service Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getScript <em>Script</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getConfigureTimeout <em>Configure Timeout</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getTestTimeout <em>Test Timeout</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getSuspendTimeout <em>Suspend Timeout</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getResumeTimeout <em>Resume Timeout</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getVmConfiguration <em>Vm Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.service.common.vm.service.ServicePackage#getCommonVmServiceInstance()
 * @model
 * @generated
 */
public interface CommonVmServiceInstance extends VirtualMachineServiceInstance {
	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' attribute.
	 * @see #setScript(String)
	 * @see org.openecomp.dcae.controller.service.common.vm.service.ServicePackage#getCommonVmServiceInstance_Script()
	 * @model unique="false"
	 * @generated
	 */
	String getScript();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(String value);

	/**
	 * Returns the value of the '<em><b>Configure Timeout</b></em>' attribute.
	 * The default value is <code>"60000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configure Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configure Timeout</em>' attribute.
	 * @see #setConfigureTimeout(int)
	 * @see org.openecomp.dcae.controller.service.common.vm.service.ServicePackage#getCommonVmServiceInstance_ConfigureTimeout()
	 * @model default="60000" unique="false"
	 * @generated
	 */
	int getConfigureTimeout();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getConfigureTimeout <em>Configure Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configure Timeout</em>' attribute.
	 * @see #getConfigureTimeout()
	 * @generated
	 */
	void setConfigureTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Test Timeout</b></em>' attribute.
	 * The default value is <code>"60000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Timeout</em>' attribute.
	 * @see #setTestTimeout(int)
	 * @see org.openecomp.dcae.controller.service.common.vm.service.ServicePackage#getCommonVmServiceInstance_TestTimeout()
	 * @model default="60000" unique="false"
	 * @generated
	 */
	int getTestTimeout();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getTestTimeout <em>Test Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Timeout</em>' attribute.
	 * @see #getTestTimeout()
	 * @generated
	 */
	void setTestTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Suspend Timeout</b></em>' attribute.
	 * The default value is <code>"60000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspend Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspend Timeout</em>' attribute.
	 * @see #setSuspendTimeout(int)
	 * @see org.openecomp.dcae.controller.service.common.vm.service.ServicePackage#getCommonVmServiceInstance_SuspendTimeout()
	 * @model default="60000" unique="false"
	 * @generated
	 */
	int getSuspendTimeout();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getSuspendTimeout <em>Suspend Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspend Timeout</em>' attribute.
	 * @see #getSuspendTimeout()
	 * @generated
	 */
	void setSuspendTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Resume Timeout</b></em>' attribute.
	 * The default value is <code>"60000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resume Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resume Timeout</em>' attribute.
	 * @see #setResumeTimeout(int)
	 * @see org.openecomp.dcae.controller.service.common.vm.service.ServicePackage#getCommonVmServiceInstance_ResumeTimeout()
	 * @model default="60000" unique="false"
	 * @generated
	 */
	int getResumeTimeout();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getResumeTimeout <em>Resume Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resume Timeout</em>' attribute.
	 * @see #getResumeTimeout()
	 * @generated
	 */
	void setResumeTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Vm Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Configuration</em>' containment reference.
	 * @see #setVmConfiguration(CommonVmServiceConfiguration)
	 * @see org.openecomp.dcae.controller.service.common.vm.service.ServicePackage#getCommonVmServiceInstance_VmConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	CommonVmServiceConfiguration getVmConfiguration();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.common.vm.service.CommonVmServiceInstance#getVmConfiguration <em>Vm Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Configuration</em>' containment reference.
	 * @see #getVmConfiguration()
	 * @generated
	 */
	void setVmConfiguration(CommonVmServiceConfiguration value);

} // CommonVmServiceInstance
