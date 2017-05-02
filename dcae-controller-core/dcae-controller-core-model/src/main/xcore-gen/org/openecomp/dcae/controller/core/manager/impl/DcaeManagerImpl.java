
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
package org.openecomp.dcae.controller.core.manager.impl;

import org.openecomp.dcae.controller.core.manager.DcaeManager;
import org.openecomp.dcae.controller.core.manager.ManagerPackage;

import org.openecomp.dcae.controller.core.service.HealthTestResponse;
import org.openecomp.dcae.controller.core.stream.DcaeStream;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dcae Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.manager.impl.DcaeManagerImpl#getInputStreams <em>Input Streams</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.manager.impl.DcaeManagerImpl#getOutputStreams <em>Output Streams</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DcaeManagerImpl extends MinimalEObjectImpl.Container implements DcaeManager {
	/**
	 * The cached value of the '{@link #getInputStreams() <em>Input Streams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputStreams()
	 * @generated
	 * @ordered
	 */
	protected EList<DcaeStream> inputStreams;

	/**
	 * The cached value of the '{@link #getOutputStreams() <em>Output Streams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputStreams()
	 * @generated
	 * @ordered
	 */
	protected EList<DcaeStream> outputStreams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcaeManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManagerPackage.Literals.DCAE_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DcaeStream> getInputStreams() {
		if (inputStreams == null) {
			inputStreams = new EObjectContainmentEList<DcaeStream>(DcaeStream.class, this, ManagerPackage.DCAE_MANAGER__INPUT_STREAMS);
		}
		return inputStreams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DcaeStream> getOutputStreams() {
		if (outputStreams == null) {
			outputStreams = new EObjectContainmentEList<DcaeStream>(DcaeStream.class, this, ManagerPackage.DCAE_MANAGER__OUTPUT_STREAMS);
		}
		return outputStreams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthTestResponse test() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void suspend() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resume() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String publicKey() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void configurationChanged() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateStreams(EList<DcaeStream> inputStreams, EList<DcaeStream> outputStreams) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManagerPackage.DCAE_MANAGER__INPUT_STREAMS:
				return ((InternalEList<?>)getInputStreams()).basicRemove(otherEnd, msgs);
			case ManagerPackage.DCAE_MANAGER__OUTPUT_STREAMS:
				return ((InternalEList<?>)getOutputStreams()).basicRemove(otherEnd, msgs);
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
			case ManagerPackage.DCAE_MANAGER__INPUT_STREAMS:
				return getInputStreams();
			case ManagerPackage.DCAE_MANAGER__OUTPUT_STREAMS:
				return getOutputStreams();
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
			case ManagerPackage.DCAE_MANAGER__INPUT_STREAMS:
				getInputStreams().clear();
				getInputStreams().addAll((Collection<? extends DcaeStream>)newValue);
				return;
			case ManagerPackage.DCAE_MANAGER__OUTPUT_STREAMS:
				getOutputStreams().clear();
				getOutputStreams().addAll((Collection<? extends DcaeStream>)newValue);
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
			case ManagerPackage.DCAE_MANAGER__INPUT_STREAMS:
				getInputStreams().clear();
				return;
			case ManagerPackage.DCAE_MANAGER__OUTPUT_STREAMS:
				getOutputStreams().clear();
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
			case ManagerPackage.DCAE_MANAGER__INPUT_STREAMS:
				return inputStreams != null && !inputStreams.isEmpty();
			case ManagerPackage.DCAE_MANAGER__OUTPUT_STREAMS:
				return outputStreams != null && !outputStreams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ManagerPackage.DCAE_MANAGER___TEST:
				return test();
			case ManagerPackage.DCAE_MANAGER___SUSPEND:
				suspend();
				return null;
			case ManagerPackage.DCAE_MANAGER___RESUME:
				resume();
				return null;
			case ManagerPackage.DCAE_MANAGER___PUBLIC_KEY:
				return publicKey();
			case ManagerPackage.DCAE_MANAGER___CONFIGURATION_CHANGED:
				configurationChanged();
				return null;
			case ManagerPackage.DCAE_MANAGER___UPDATE_STREAMS__ELIST_ELIST:
				updateStreams((EList<DcaeStream>)arguments.get(0), (EList<DcaeStream>)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DcaeManagerImpl
