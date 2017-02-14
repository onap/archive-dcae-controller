
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

import org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl;
import org.openecomp.dcae.controller.service.vm.VirtualMachine;
import org.openecomp.dcae.controller.service.vm.VmPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineImpl#getFunctionIndex <em>Function Index</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineImpl#getKvmName <em>Kvm Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineImpl#getVnc <em>Vnc</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineImpl#getGateway <em>Gateway</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualMachineImpl extends DcaeBasicServerImpl implements VirtualMachine {
	/**
	 * The default value of the '{@link #getFunctionIndex() <em>Function Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int FUNCTION_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFunctionIndex() <em>Function Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionIndex()
	 * @generated
	 * @ordered
	 */
	protected int functionIndex = FUNCTION_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getKvmName() <em>Kvm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKvmName()
	 * @generated
	 * @ordered
	 */
	protected static final String KVM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKvmName() <em>Kvm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKvmName()
	 * @generated
	 * @ordered
	 */
	protected String kvmName = KVM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVnc() <em>Vnc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVnc()
	 * @generated
	 * @ordered
	 */
	protected static final String VNC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVnc() <em>Vnc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVnc()
	 * @generated
	 * @ordered
	 */
	protected String vnc = VNC_EDEFAULT;

	/**
	 * The default value of the '{@link #getGateway() <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected String gateway = GATEWAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPackage.Literals.VIRTUAL_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFunctionIndex() {
		return functionIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionIndex(int newFunctionIndex) {
		int oldFunctionIndex = functionIndex;
		functionIndex = newFunctionIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE__FUNCTION_INDEX, oldFunctionIndex, functionIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKvmName() {
		return kvmName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKvmName(String newKvmName) {
		String oldKvmName = kvmName;
		kvmName = newKvmName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE__KVM_NAME, oldKvmName, kvmName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVnc() {
		return vnc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVnc(String newVnc) {
		String oldVnc = vnc;
		vnc = newVnc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE__VNC, oldVnc, vnc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGateway() {
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGateway(String newGateway) {
		String oldGateway = gateway;
		gateway = newGateway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE__GATEWAY, oldGateway, gateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmPackage.VIRTUAL_MACHINE__FUNCTION_INDEX:
				return getFunctionIndex();
			case VmPackage.VIRTUAL_MACHINE__KVM_NAME:
				return getKvmName();
			case VmPackage.VIRTUAL_MACHINE__VNC:
				return getVnc();
			case VmPackage.VIRTUAL_MACHINE__GATEWAY:
				return getGateway();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VmPackage.VIRTUAL_MACHINE__FUNCTION_INDEX:
				setFunctionIndex((Integer)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE__KVM_NAME:
				setKvmName((String)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE__VNC:
				setVnc((String)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE__GATEWAY:
				setGateway((String)newValue);
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
			case VmPackage.VIRTUAL_MACHINE__FUNCTION_INDEX:
				setFunctionIndex(FUNCTION_INDEX_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE__KVM_NAME:
				setKvmName(KVM_NAME_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE__VNC:
				setVnc(VNC_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE__GATEWAY:
				setGateway(GATEWAY_EDEFAULT);
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
			case VmPackage.VIRTUAL_MACHINE__FUNCTION_INDEX:
				return functionIndex != FUNCTION_INDEX_EDEFAULT;
			case VmPackage.VIRTUAL_MACHINE__KVM_NAME:
				return KVM_NAME_EDEFAULT == null ? kvmName != null : !KVM_NAME_EDEFAULT.equals(kvmName);
			case VmPackage.VIRTUAL_MACHINE__VNC:
				return VNC_EDEFAULT == null ? vnc != null : !VNC_EDEFAULT.equals(vnc);
			case VmPackage.VIRTUAL_MACHINE__GATEWAY:
				return GATEWAY_EDEFAULT == null ? gateway != null : !GATEWAY_EDEFAULT.equals(gateway);
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
		result.append(" (functionIndex: ");
		result.append(functionIndex);
		result.append(", kvmName: ");
		result.append(kvmName);
		result.append(", vnc: ");
		result.append(vnc);
		result.append(", gateway: ");
		result.append(gateway);
		result.append(')');
		return result.toString();
	}

} //VirtualMachineImpl
