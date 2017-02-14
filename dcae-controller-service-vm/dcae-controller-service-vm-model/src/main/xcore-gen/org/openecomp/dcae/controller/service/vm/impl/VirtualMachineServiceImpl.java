
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

import org.openecomp.dcae.controller.core.service.impl.DcaeServiceImpl;

import org.openecomp.dcae.controller.service.vm.VirtualMachineService;
import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance;
import org.openecomp.dcae.controller.service.vm.VmPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceImpl#getManagerPortNumber <em>Manager Port Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualMachineServiceImpl extends DcaeServiceImpl implements VirtualMachineService {
	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualMachineServiceInstance> instances;

	/**
	 * The default value of the '{@link #getManagerPortNumber() <em>Manager Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerPortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int MANAGER_PORT_NUMBER_EDEFAULT = 9999;
	/**
	 * The cached value of the '{@link #getManagerPortNumber() <em>Manager Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerPortNumber()
	 * @generated
	 * @ordered
	 */
	protected int managerPortNumber = MANAGER_PORT_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualMachineServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPackage.Literals.VIRTUAL_MACHINE_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualMachineServiceInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentWithInverseEList<VirtualMachineServiceInstance>(VirtualMachineServiceInstance.class, this, VmPackage.VIRTUAL_MACHINE_SERVICE__INSTANCES, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getManagerPortNumber() {
		return managerPortNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagerPortNumber(int newManagerPortNumber) {
		int oldManagerPortNumber = managerPortNumber;
		managerPortNumber = newManagerPortNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE__MANAGER_PORT_NUMBER, oldManagerPortNumber, managerPortNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateDeploymentStatus() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VmPackage.VIRTUAL_MACHINE_SERVICE__INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VmPackage.VIRTUAL_MACHINE_SERVICE__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmPackage.VIRTUAL_MACHINE_SERVICE__INSTANCES:
				return getInstances();
			case VmPackage.VIRTUAL_MACHINE_SERVICE__MANAGER_PORT_NUMBER:
				return getManagerPortNumber();
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
			case VmPackage.VIRTUAL_MACHINE_SERVICE__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends VirtualMachineServiceInstance>)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE__MANAGER_PORT_NUMBER:
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
			case VmPackage.VIRTUAL_MACHINE_SERVICE__INSTANCES:
				getInstances().clear();
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE__MANAGER_PORT_NUMBER:
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
			case VmPackage.VIRTUAL_MACHINE_SERVICE__INSTANCES:
				return instances != null && !instances.isEmpty();
			case VmPackage.VIRTUAL_MACHINE_SERVICE__MANAGER_PORT_NUMBER:
				return managerPortNumber != MANAGER_PORT_NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VmPackage.VIRTUAL_MACHINE_SERVICE___UPDATE_DEPLOYMENT_STATUS:
				updateDeploymentStatus();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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

} //VirtualMachineServiceImpl
