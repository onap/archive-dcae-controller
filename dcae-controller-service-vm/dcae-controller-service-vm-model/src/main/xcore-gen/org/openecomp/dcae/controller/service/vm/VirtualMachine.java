
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
package org.openecomp.dcae.controller.service.vm;

import org.openecomp.dcae.controller.core.server.DcaeBasicServer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachine#getFunctionIndex <em>Function Index</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachine#getKvmName <em>Kvm Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachine#getVnc <em>Vnc</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachine#getGateway <em>Gateway</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachine()
 * @model
 * @generated
 */
public interface VirtualMachine extends DcaeBasicServer {
	/**
	 * Returns the value of the '<em><b>Function Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Index</em>' attribute.
	 * @see #setFunctionIndex(int)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachine_FunctionIndex()
	 * @model unique="false"
	 * @generated
	 */
	int getFunctionIndex();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachine#getFunctionIndex <em>Function Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Index</em>' attribute.
	 * @see #getFunctionIndex()
	 * @generated
	 */
	void setFunctionIndex(int value);

	/**
	 * Returns the value of the '<em><b>Kvm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kvm Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kvm Name</em>' attribute.
	 * @see #setKvmName(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachine_KvmName()
	 * @model unique="false"
	 * @generated
	 */
	String getKvmName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachine#getKvmName <em>Kvm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kvm Name</em>' attribute.
	 * @see #getKvmName()
	 * @generated
	 */
	void setKvmName(String value);

	/**
	 * Returns the value of the '<em><b>Vnc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vnc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vnc</em>' attribute.
	 * @see #setVnc(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachine_Vnc()
	 * @model unique="false"
	 * @generated
	 */
	String getVnc();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachine#getVnc <em>Vnc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vnc</em>' attribute.
	 * @see #getVnc()
	 * @generated
	 */
	void setVnc(String value);

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' attribute.
	 * @see #setGateway(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachine_Gateway()
	 * @model unique="false"
	 * @generated
	 */
	String getGateway();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachine#getGateway <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' attribute.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(String value);

} // VirtualMachine
