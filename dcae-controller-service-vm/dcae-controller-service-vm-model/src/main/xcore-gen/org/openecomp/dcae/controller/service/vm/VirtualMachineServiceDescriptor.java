
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

import org.openecomp.dcae.controller.core.service.DcaeServiceDescriptor;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Machine Service Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getServicePackage <em>Service Package</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getServiceInstanceClass <em>Service Instance Class</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getVmType <em>Vm Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getManagerPortNumber <em>Manager Port Number</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getManagerUser <em>Manager User</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getEncryptedPassword <em>Encrypted Password</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getUsers <em>Users</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getAdminUsers <em>Admin Users</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceDescriptor()
 * @model
 * @generated
 */
public interface VirtualMachineServiceDescriptor extends DcaeServiceDescriptor {
	/**
	 * Returns the value of the '<em><b>Service Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Package</em>' attribute.
	 * @see #setServicePackage(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceDescriptor_ServicePackage()
	 * @model unique="false"
	 * @generated
	 */
	String getServicePackage();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getServicePackage <em>Service Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Package</em>' attribute.
	 * @see #getServicePackage()
	 * @generated
	 */
	void setServicePackage(String value);

	/**
	 * Returns the value of the '<em><b>Service Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Class</em>' attribute.
	 * @see #setServiceClass(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceDescriptor_ServiceClass()
	 * @model unique="false"
	 * @generated
	 */
	String getServiceClass();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getServiceClass <em>Service Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Class</em>' attribute.
	 * @see #getServiceClass()
	 * @generated
	 */
	void setServiceClass(String value);

	/**
	 * Returns the value of the '<em><b>Service Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Instance Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Instance Class</em>' attribute.
	 * @see #setServiceInstanceClass(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceDescriptor_ServiceInstanceClass()
	 * @model unique="false"
	 * @generated
	 */
	String getServiceInstanceClass();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getServiceInstanceClass <em>Service Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Instance Class</em>' attribute.
	 * @see #getServiceInstanceClass()
	 * @generated
	 */
	void setServiceInstanceClass(String value);

	/**
	 * Returns the value of the '<em><b>Vm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Type</em>' attribute.
	 * @see #setVmType(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceDescriptor_VmType()
	 * @model unique="false"
	 * @generated
	 */
	String getVmType();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getVmType <em>Vm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Type</em>' attribute.
	 * @see #getVmType()
	 * @generated
	 */
	void setVmType(String value);

	/**
	 * Returns the value of the '<em><b>Manager Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager Port Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager Port Number</em>' attribute.
	 * @see #setManagerPortNumber(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceDescriptor_ManagerPortNumber()
	 * @model unique="false"
	 * @generated
	 */
	String getManagerPortNumber();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getManagerPortNumber <em>Manager Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager Port Number</em>' attribute.
	 * @see #getManagerPortNumber()
	 * @generated
	 */
	void setManagerPortNumber(String value);

	/**
	 * Returns the value of the '<em><b>Manager User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager User</em>' attribute.
	 * @see #setManagerUser(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceDescriptor_ManagerUser()
	 * @model unique="false"
	 * @generated
	 */
	String getManagerUser();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getManagerUser <em>Manager User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager User</em>' attribute.
	 * @see #getManagerUser()
	 * @generated
	 */
	void setManagerUser(String value);

	/**
	 * Returns the value of the '<em><b>Encrypted Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encrypted Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted Password</em>' attribute.
	 * @see #setEncryptedPassword(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceDescriptor_EncryptedPassword()
	 * @model unique="false"
	 * @generated
	 */
	String getEncryptedPassword();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor#getEncryptedPassword <em>Encrypted Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted Password</em>' attribute.
	 * @see #getEncryptedPassword()
	 * @generated
	 */
	void setEncryptedPassword(String value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' attribute list.
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceDescriptor_Users()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getUsers();

	/**
	 * Returns the value of the '<em><b>Admin Users</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin Users</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin Users</em>' attribute list.
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceDescriptor_AdminUsers()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getAdminUsers();

} // VirtualMachineServiceDescriptor
