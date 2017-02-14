
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
package org.openecomp.dcae.controller.core.service.impl;

import org.openecomp.dcae.controller.core.service.DcaeServiceContainer;
import org.openecomp.dcae.controller.core.service.DcaeServiceInstance;
import org.openecomp.dcae.controller.core.service.HealthTestStatus;
import org.openecomp.dcae.controller.core.service.ServicePackage;
import org.openecomp.dcae.controller.core.stream.DcaeStream;
import org.openecomp.ncomp.core.DeploymentStatus;
import org.openecomp.ncomp.core.impl.NamedEntityImpl;
import org.openecomp.ncomp.core.types.metrics.DateMetricAttribute;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dcae Service Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.service.impl.DcaeServiceInstanceImpl#getServiceContainer <em>Service Container</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.impl.DcaeServiceInstanceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.impl.DcaeServiceInstanceImpl#getInputStreams <em>Input Streams</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.impl.DcaeServiceInstanceImpl#getOutputStreams <em>Output Streams</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.impl.DcaeServiceInstanceImpl#getLastHealthTest <em>Last Health Test</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.impl.DcaeServiceInstanceImpl#getHealthTestStatus <em>Health Test Status</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.impl.DcaeServiceInstanceImpl#getHealthTestMessageCode <em>Health Test Message Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DcaeServiceInstanceImpl extends NamedEntityImpl implements DcaeServiceInstance {
	/**
	 * The cached value of the '{@link #getServiceContainer() <em>Service Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceContainer()
	 * @generated
	 * @ordered
	 */
	protected DcaeServiceContainer serviceContainer;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final DeploymentStatus STATUS_EDEFAULT = DeploymentStatus.UNDEPLOYED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected DeploymentStatus status = STATUS_EDEFAULT;

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
	 * The default value of the '{@link #getLastHealthTest() <em>Last Health Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastHealthTest()
	 * @generated
	 * @ordered
	 */
	protected static final DateMetricAttribute LAST_HEALTH_TEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastHealthTest() <em>Last Health Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastHealthTest()
	 * @generated
	 * @ordered
	 */
	protected DateMetricAttribute lastHealthTest = LAST_HEALTH_TEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getHealthTestStatus() <em>Health Test Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthTestStatus()
	 * @generated
	 * @ordered
	 */
	protected static final HealthTestStatus HEALTH_TEST_STATUS_EDEFAULT = HealthTestStatus.GREEN;

	/**
	 * The cached value of the '{@link #getHealthTestStatus() <em>Health Test Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthTestStatus()
	 * @generated
	 * @ordered
	 */
	protected HealthTestStatus healthTestStatus = HEALTH_TEST_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHealthTestMessageCode() <em>Health Test Message Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthTestMessageCode()
	 * @generated
	 * @ordered
	 */
	protected static final String HEALTH_TEST_MESSAGE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHealthTestMessageCode() <em>Health Test Message Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthTestMessageCode()
	 * @generated
	 * @ordered
	 */
	protected String healthTestMessageCode = HEALTH_TEST_MESSAGE_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcaeServiceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.DCAE_SERVICE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeServiceContainer getServiceContainer() {
		if (serviceContainer != null && serviceContainer.eIsProxy()) {
			InternalEObject oldServiceContainer = (InternalEObject)serviceContainer;
			serviceContainer = (DcaeServiceContainer)eResolveProxy(oldServiceContainer);
			if (serviceContainer != oldServiceContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.DCAE_SERVICE_INSTANCE__SERVICE_CONTAINER, oldServiceContainer, serviceContainer));
			}
		}
		return serviceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeServiceContainer basicGetServiceContainer() {
		return serviceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceContainer(DcaeServiceContainer newServiceContainer, NotificationChain msgs) {
		DcaeServiceContainer oldServiceContainer = serviceContainer;
		serviceContainer = newServiceContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.DCAE_SERVICE_INSTANCE__SERVICE_CONTAINER, oldServiceContainer, newServiceContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceContainer(DcaeServiceContainer newServiceContainer) {
		if (newServiceContainer != serviceContainer) {
			NotificationChain msgs = null;
			if (serviceContainer != null)
				msgs = ((InternalEObject)serviceContainer).eInverseRemove(this, ServicePackage.DCAE_SERVICE_CONTAINER__INSTANCES, DcaeServiceContainer.class, msgs);
			if (newServiceContainer != null)
				msgs = ((InternalEObject)newServiceContainer).eInverseAdd(this, ServicePackage.DCAE_SERVICE_CONTAINER__INSTANCES, DcaeServiceContainer.class, msgs);
			msgs = basicSetServiceContainer(newServiceContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.DCAE_SERVICE_INSTANCE__SERVICE_CONTAINER, newServiceContainer, newServiceContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(DeploymentStatus newStatus) {
		DeploymentStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.DCAE_SERVICE_INSTANCE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DcaeStream> getInputStreams() {
		if (inputStreams == null) {
			inputStreams = new EObjectContainmentEList<DcaeStream>(DcaeStream.class, this, ServicePackage.DCAE_SERVICE_INSTANCE__INPUT_STREAMS);
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
			outputStreams = new EObjectContainmentEList<DcaeStream>(DcaeStream.class, this, ServicePackage.DCAE_SERVICE_INSTANCE__OUTPUT_STREAMS);
		}
		return outputStreams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateMetricAttribute getLastHealthTest() {
		return lastHealthTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastHealthTest(DateMetricAttribute newLastHealthTest) {
		DateMetricAttribute oldLastHealthTest = lastHealthTest;
		lastHealthTest = newLastHealthTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.DCAE_SERVICE_INSTANCE__LAST_HEALTH_TEST, oldLastHealthTest, lastHealthTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthTestStatus getHealthTestStatus() {
		return healthTestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthTestStatus(HealthTestStatus newHealthTestStatus) {
		HealthTestStatus oldHealthTestStatus = healthTestStatus;
		healthTestStatus = newHealthTestStatus == null ? HEALTH_TEST_STATUS_EDEFAULT : newHealthTestStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.DCAE_SERVICE_INSTANCE__HEALTH_TEST_STATUS, oldHealthTestStatus, healthTestStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHealthTestMessageCode() {
		return healthTestMessageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthTestMessageCode(String newHealthTestMessageCode) {
		String oldHealthTestMessageCode = healthTestMessageCode;
		healthTestMessageCode = newHealthTestMessageCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.DCAE_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE, oldHealthTestMessageCode, healthTestMessageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.DCAE_SERVICE_INSTANCE__SERVICE_CONTAINER:
				if (serviceContainer != null)
					msgs = ((InternalEObject)serviceContainer).eInverseRemove(this, ServicePackage.DCAE_SERVICE_CONTAINER__INSTANCES, DcaeServiceContainer.class, msgs);
				return basicSetServiceContainer((DcaeServiceContainer)otherEnd, msgs);
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
			case ServicePackage.DCAE_SERVICE_INSTANCE__SERVICE_CONTAINER:
				return basicSetServiceContainer(null, msgs);
			case ServicePackage.DCAE_SERVICE_INSTANCE__INPUT_STREAMS:
				return ((InternalEList<?>)getInputStreams()).basicRemove(otherEnd, msgs);
			case ServicePackage.DCAE_SERVICE_INSTANCE__OUTPUT_STREAMS:
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
			case ServicePackage.DCAE_SERVICE_INSTANCE__SERVICE_CONTAINER:
				if (resolve) return getServiceContainer();
				return basicGetServiceContainer();
			case ServicePackage.DCAE_SERVICE_INSTANCE__STATUS:
				return getStatus();
			case ServicePackage.DCAE_SERVICE_INSTANCE__INPUT_STREAMS:
				return getInputStreams();
			case ServicePackage.DCAE_SERVICE_INSTANCE__OUTPUT_STREAMS:
				return getOutputStreams();
			case ServicePackage.DCAE_SERVICE_INSTANCE__LAST_HEALTH_TEST:
				return getLastHealthTest();
			case ServicePackage.DCAE_SERVICE_INSTANCE__HEALTH_TEST_STATUS:
				return getHealthTestStatus();
			case ServicePackage.DCAE_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE:
				return getHealthTestMessageCode();
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
			case ServicePackage.DCAE_SERVICE_INSTANCE__SERVICE_CONTAINER:
				setServiceContainer((DcaeServiceContainer)newValue);
				return;
			case ServicePackage.DCAE_SERVICE_INSTANCE__STATUS:
				setStatus((DeploymentStatus)newValue);
				return;
			case ServicePackage.DCAE_SERVICE_INSTANCE__INPUT_STREAMS:
				getInputStreams().clear();
				getInputStreams().addAll((Collection<? extends DcaeStream>)newValue);
				return;
			case ServicePackage.DCAE_SERVICE_INSTANCE__OUTPUT_STREAMS:
				getOutputStreams().clear();
				getOutputStreams().addAll((Collection<? extends DcaeStream>)newValue);
				return;
			case ServicePackage.DCAE_SERVICE_INSTANCE__LAST_HEALTH_TEST:
				setLastHealthTest((DateMetricAttribute)newValue);
				return;
			case ServicePackage.DCAE_SERVICE_INSTANCE__HEALTH_TEST_STATUS:
				setHealthTestStatus((HealthTestStatus)newValue);
				return;
			case ServicePackage.DCAE_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE:
				setHealthTestMessageCode((String)newValue);
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
			case ServicePackage.DCAE_SERVICE_INSTANCE__SERVICE_CONTAINER:
				setServiceContainer((DcaeServiceContainer)null);
				return;
			case ServicePackage.DCAE_SERVICE_INSTANCE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ServicePackage.DCAE_SERVICE_INSTANCE__INPUT_STREAMS:
				getInputStreams().clear();
				return;
			case ServicePackage.DCAE_SERVICE_INSTANCE__OUTPUT_STREAMS:
				getOutputStreams().clear();
				return;
			case ServicePackage.DCAE_SERVICE_INSTANCE__LAST_HEALTH_TEST:
				setLastHealthTest(LAST_HEALTH_TEST_EDEFAULT);
				return;
			case ServicePackage.DCAE_SERVICE_INSTANCE__HEALTH_TEST_STATUS:
				setHealthTestStatus(HEALTH_TEST_STATUS_EDEFAULT);
				return;
			case ServicePackage.DCAE_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE:
				setHealthTestMessageCode(HEALTH_TEST_MESSAGE_CODE_EDEFAULT);
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
			case ServicePackage.DCAE_SERVICE_INSTANCE__SERVICE_CONTAINER:
				return serviceContainer != null;
			case ServicePackage.DCAE_SERVICE_INSTANCE__STATUS:
				return status != STATUS_EDEFAULT;
			case ServicePackage.DCAE_SERVICE_INSTANCE__INPUT_STREAMS:
				return inputStreams != null && !inputStreams.isEmpty();
			case ServicePackage.DCAE_SERVICE_INSTANCE__OUTPUT_STREAMS:
				return outputStreams != null && !outputStreams.isEmpty();
			case ServicePackage.DCAE_SERVICE_INSTANCE__LAST_HEALTH_TEST:
				return LAST_HEALTH_TEST_EDEFAULT == null ? lastHealthTest != null : !LAST_HEALTH_TEST_EDEFAULT.equals(lastHealthTest);
			case ServicePackage.DCAE_SERVICE_INSTANCE__HEALTH_TEST_STATUS:
				return healthTestStatus != HEALTH_TEST_STATUS_EDEFAULT;
			case ServicePackage.DCAE_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE:
				return HEALTH_TEST_MESSAGE_CODE_EDEFAULT == null ? healthTestMessageCode != null : !HEALTH_TEST_MESSAGE_CODE_EDEFAULT.equals(healthTestMessageCode);
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
		result.append(" (status: ");
		result.append(status);
		result.append(", lastHealthTest: ");
		result.append(lastHealthTest);
		result.append(", healthTestStatus: ");
		result.append(healthTestStatus);
		result.append(", healthTestMessageCode: ");
		result.append(healthTestMessageCode);
		result.append(')');
		return result.toString();
	}

} //DcaeServiceInstanceImpl
