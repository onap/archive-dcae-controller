
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

import org.openecomp.dcae.controller.service.vm.PhysicalMachine;
import org.openecomp.dcae.controller.service.vm.VmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.PhysicalMachineImpl#getManagerPortNumber <em>Manager Port Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalMachineImpl extends DcaeBasicServerImpl implements PhysicalMachine {
	/**
	 * The default value of the '{@link #getManagerPortNumber() <em>Manager Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerPortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MANAGER_PORT_NUMBER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getManagerPortNumber() <em>Manager Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerPortNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer managerPortNumber = MANAGER_PORT_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPackage.Literals.PHYSICAL_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getManagerPortNumber() {
		return managerPortNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagerPortNumber(Integer newManagerPortNumber) {
		Integer oldManagerPortNumber = managerPortNumber;
		managerPortNumber = newManagerPortNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.PHYSICAL_MACHINE__MANAGER_PORT_NUMBER, oldManagerPortNumber, managerPortNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmPackage.PHYSICAL_MACHINE__MANAGER_PORT_NUMBER:
				return getManagerPortNumber();
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
			case VmPackage.PHYSICAL_MACHINE__MANAGER_PORT_NUMBER:
				setManagerPortNumber((Integer)newValue);
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
			case VmPackage.PHYSICAL_MACHINE__MANAGER_PORT_NUMBER:
				setManagerPortNumber(MANAGER_PORT_NUMBER_EDEFAULT);
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
			case VmPackage.PHYSICAL_MACHINE__MANAGER_PORT_NUMBER:
				return MANAGER_PORT_NUMBER_EDEFAULT == null ? managerPortNumber != null : !MANAGER_PORT_NUMBER_EDEFAULT.equals(managerPortNumber);
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
		result.append(" (managerPortNumber: ");
		result.append(managerPortNumber);
		result.append(')');
		return result.toString();
	}

} //PhysicalMachineImpl
