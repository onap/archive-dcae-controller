
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
package org.openecomp.dcae.controller.service.vm.impl;

import org.openecomp.dcae.controller.core.service.impl.DcaeServiceDescriptorImpl;

import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor;
import org.openecomp.dcae.controller.service.vm.VmPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine Service Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceDescriptorImpl#getServicePackage <em>Service Package</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceDescriptorImpl#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceDescriptorImpl#getServiceInstanceClass <em>Service Instance Class</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceDescriptorImpl#getVmType <em>Vm Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceDescriptorImpl#getManagerPortNumber <em>Manager Port Number</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceDescriptorImpl#getManagerUser <em>Manager User</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceDescriptorImpl#getEncryptedPassword <em>Encrypted Password</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceDescriptorImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceDescriptorImpl#getAdminUsers <em>Admin Users</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualMachineServiceDescriptorImpl extends DcaeServiceDescriptorImpl implements VirtualMachineServiceDescriptor {
	/**
	 * The default value of the '{@link #getServicePackage() <em>Service Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServicePackage() <em>Service Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePackage()
	 * @generated
	 * @ordered
	 */
	protected String servicePackage = SERVICE_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceClass() <em>Service Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClass()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceClass() <em>Service Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClass()
	 * @generated
	 * @ordered
	 */
	protected String serviceClass = SERVICE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceInstanceClass() <em>Service Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInstanceClass()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_INSTANCE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceInstanceClass() <em>Service Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInstanceClass()
	 * @generated
	 * @ordered
	 */
	protected String serviceInstanceClass = SERVICE_INSTANCE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmType() <em>Vm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmType()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmType() <em>Vm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmType()
	 * @generated
	 * @ordered
	 */
	protected String vmType = VM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getManagerPortNumber() <em>Manager Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerPortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGER_PORT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManagerPortNumber() <em>Manager Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerPortNumber()
	 * @generated
	 * @ordered
	 */
	protected String managerPortNumber = MANAGER_PORT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getManagerUser() <em>Manager User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerUser()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGER_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManagerUser() <em>Manager User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerUser()
	 * @generated
	 * @ordered
	 */
	protected String managerUser = MANAGER_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncryptedPassword() <em>Encrypted Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptedPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCRYPTED_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncryptedPassword() <em>Encrypted Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptedPassword()
	 * @generated
	 * @ordered
	 */
	protected String encryptedPassword = ENCRYPTED_PASSWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> users;

	/**
	 * The cached value of the '{@link #getAdminUsers() <em>Admin Users</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> adminUsers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualMachineServiceDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPackage.Literals.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServicePackage() {
		return servicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicePackage(String newServicePackage) {
		String oldServicePackage = servicePackage;
		servicePackage = newServicePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_PACKAGE, oldServicePackage, servicePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceClass() {
		return serviceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceClass(String newServiceClass) {
		String oldServiceClass = serviceClass;
		serviceClass = newServiceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_CLASS, oldServiceClass, serviceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceInstanceClass() {
		return serviceInstanceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInstanceClass(String newServiceInstanceClass) {
		String oldServiceInstanceClass = serviceInstanceClass;
		serviceInstanceClass = newServiceInstanceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS, oldServiceInstanceClass, serviceInstanceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmType() {
		return vmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmType(String newVmType) {
		String oldVmType = vmType;
		vmType = newVmType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__VM_TYPE, oldVmType, vmType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManagerPortNumber() {
		return managerPortNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagerPortNumber(String newManagerPortNumber) {
		String oldManagerPortNumber = managerPortNumber;
		managerPortNumber = newManagerPortNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__MANAGER_PORT_NUMBER, oldManagerPortNumber, managerPortNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManagerUser() {
		return managerUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagerUser(String newManagerUser) {
		String oldManagerUser = managerUser;
		managerUser = newManagerUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__MANAGER_USER, oldManagerUser, managerUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncryptedPassword(String newEncryptedPassword) {
		String oldEncryptedPassword = encryptedPassword;
		encryptedPassword = newEncryptedPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__ENCRYPTED_PASSWORD, oldEncryptedPassword, encryptedPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUsers() {
		if (users == null) {
			users = new EDataTypeEList<String>(String.class, this, VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAdminUsers() {
		if (adminUsers == null) {
			adminUsers = new EDataTypeEList<String>(String.class, this, VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__ADMIN_USERS);
		}
		return adminUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_PACKAGE:
				return getServicePackage();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_CLASS:
				return getServiceClass();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS:
				return getServiceInstanceClass();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__VM_TYPE:
				return getVmType();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__MANAGER_PORT_NUMBER:
				return getManagerPortNumber();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__MANAGER_USER:
				return getManagerUser();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__ENCRYPTED_PASSWORD:
				return getEncryptedPassword();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__USERS:
				return getUsers();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__ADMIN_USERS:
				return getAdminUsers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_PACKAGE:
				setServicePackage((String)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_CLASS:
				setServiceClass((String)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS:
				setServiceInstanceClass((String)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__VM_TYPE:
				setVmType((String)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__MANAGER_PORT_NUMBER:
				setManagerPortNumber((String)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__MANAGER_USER:
				setManagerUser((String)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__ENCRYPTED_PASSWORD:
				setEncryptedPassword((String)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends String>)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__ADMIN_USERS:
				getAdminUsers().clear();
				getAdminUsers().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_PACKAGE:
				setServicePackage(SERVICE_PACKAGE_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_CLASS:
				setServiceClass(SERVICE_CLASS_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS:
				setServiceInstanceClass(SERVICE_INSTANCE_CLASS_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__VM_TYPE:
				setVmType(VM_TYPE_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__MANAGER_PORT_NUMBER:
				setManagerPortNumber(MANAGER_PORT_NUMBER_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__MANAGER_USER:
				setManagerUser(MANAGER_USER_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__ENCRYPTED_PASSWORD:
				setEncryptedPassword(ENCRYPTED_PASSWORD_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__USERS:
				getUsers().clear();
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__ADMIN_USERS:
				getAdminUsers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_PACKAGE:
				return SERVICE_PACKAGE_EDEFAULT == null ? servicePackage != null : !SERVICE_PACKAGE_EDEFAULT.equals(servicePackage);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_CLASS:
				return SERVICE_CLASS_EDEFAULT == null ? serviceClass != null : !SERVICE_CLASS_EDEFAULT.equals(serviceClass);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS:
				return SERVICE_INSTANCE_CLASS_EDEFAULT == null ? serviceInstanceClass != null : !SERVICE_INSTANCE_CLASS_EDEFAULT.equals(serviceInstanceClass);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__VM_TYPE:
				return VM_TYPE_EDEFAULT == null ? vmType != null : !VM_TYPE_EDEFAULT.equals(vmType);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__MANAGER_PORT_NUMBER:
				return MANAGER_PORT_NUMBER_EDEFAULT == null ? managerPortNumber != null : !MANAGER_PORT_NUMBER_EDEFAULT.equals(managerPortNumber);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__MANAGER_USER:
				return MANAGER_USER_EDEFAULT == null ? managerUser != null : !MANAGER_USER_EDEFAULT.equals(managerUser);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__ENCRYPTED_PASSWORD:
				return ENCRYPTED_PASSWORD_EDEFAULT == null ? encryptedPassword != null : !ENCRYPTED_PASSWORD_EDEFAULT.equals(encryptedPassword);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__USERS:
				return users != null && !users.isEmpty();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__ADMIN_USERS:
				return adminUsers != null && !adminUsers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (servicePackage: ");
		result.append(servicePackage);
		result.append(", serviceClass: ");
		result.append(serviceClass);
		result.append(", serviceInstanceClass: ");
		result.append(serviceInstanceClass);
		result.append(", vmType: ");
		result.append(vmType);
		result.append(", managerPortNumber: ");
		result.append(managerPortNumber);
		result.append(", managerUser: ");
		result.append(managerUser);
		result.append(", encryptedPassword: ");
		result.append(encryptedPassword);
		result.append(", users: ");
		result.append(users);
		result.append(", adminUsers: ");
		result.append(adminUsers);
		result.append(')');
		return result.toString();
	}

} //VirtualMachineServiceDescriptorImpl
