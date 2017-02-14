
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
package org.openecomp.dcae.controller.service.vmmanager.impl;

import org.openecomp.dcae.controller.core.manager.impl.DcaeManagerImpl;

import org.openecomp.dcae.controller.service.vmmanager.VirtualMachineManager;
import org.openecomp.dcae.controller.service.vmmanager.VmmanagerPackage;

import org.openecomp.ncomp.component.Component;
import org.openecomp.ncomp.core.function.Function;
import org.openecomp.ncomp.core.function.ValuePair;
import org.openecomp.ncomp.core.logs.LogMessage;
import org.openecomp.ncomp.core.metrics.DoubleMetric;
import org.openecomp.ncomp.core.metrics.Metric;
import org.openecomp.ncomp.core.metrics.MetricValueOption;
import org.openecomp.ncomp.sirius.manager.properties.AbstractProperty;
import org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer;
import org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration;
import org.openecomp.ncomp.sirius.manager.server.LoggerInfo;
import org.openecomp.ncomp.sirius.manager.server.ManagementInfo;
import org.openecomp.ncomp.sirius.manager.server.ServerPackage;
import org.openecomp.ncomp.sirius.manager.server.SouthBoundApi;
import org.openecomp.ncomp.sirius.manager.server.SouthBoundApiWithProxy;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.json.JSONObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.vmmanager.impl.VirtualMachineManagerImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vmmanager.impl.VirtualMachineManagerImpl#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualMachineManagerImpl extends DcaeManagerImpl implements VirtualMachineManager {
	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected AbstractManagementServerConfiguration configuration;
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualMachineManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmmanagerPackage.Literals.VIRTUAL_MACHINE_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractManagementServerConfiguration getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(AbstractManagementServerConfiguration newConfiguration, NotificationChain msgs) {
		AbstractManagementServerConfiguration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(AbstractManagementServerConfiguration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__COMPONENT, oldComponent, newComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		if (newComponent != component) {
			NotificationChain msgs = null;
			if (component != null)
				msgs = ((InternalEObject)component).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__COMPONENT, null, msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__COMPONENT, null, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DoubleMetric> getValues(JSONObject cx, String path, Long start, Long end, MetricValueOption option, boolean relativeInterval) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DoubleMetric> getValuesAll(JSONObject cx, String path, EList<String> metrics, Long start, Long end, MetricValueOption option, boolean relativeInterval) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogMessage> getMessages(JSONObject cx, String path, Long start, Long end) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggerInfo getRequestLogger(String userName, String action, String resourcePath, JSONObject context) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValuePair> evaluate(String path, Function function) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void update(String path, Function function) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void uploadInfo(JSONObject cx, EList<ManagementInfo> info) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void logs(JSONObject cx, EList<LogMessage> logs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void metrics(JSONObject cx, EList<Metric> metrics) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void properties(JSONObject cx, EList<AbstractProperty> l) {
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
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__COMPONENT:
				return basicSetComponent(null, msgs);
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
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__CONFIGURATION:
				return getConfiguration();
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__COMPONENT:
				return getComponent();
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
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__CONFIGURATION:
				setConfiguration((AbstractManagementServerConfiguration)newValue);
				return;
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__COMPONENT:
				setComponent((Component)newValue);
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
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__CONFIGURATION:
				setConfiguration((AbstractManagementServerConfiguration)null);
				return;
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__COMPONENT:
				setComponent((Component)null);
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
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__CONFIGURATION:
				return configuration != null;
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__COMPONENT:
				return component != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SouthBoundApi.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SouthBoundApiWithProxy.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractManagementServer.class) {
			switch (derivedFeatureID) {
				case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__CONFIGURATION: return ServerPackage.ABSTRACT_MANAGEMENT_SERVER__CONFIGURATION;
				case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__COMPONENT: return ServerPackage.ABSTRACT_MANAGEMENT_SERVER__COMPONENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SouthBoundApi.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SouthBoundApiWithProxy.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractManagementServer.class) {
			switch (baseFeatureID) {
				case ServerPackage.ABSTRACT_MANAGEMENT_SERVER__CONFIGURATION: return VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__CONFIGURATION;
				case ServerPackage.ABSTRACT_MANAGEMENT_SERVER__COMPONENT: return VmmanagerPackage.VIRTUAL_MACHINE_MANAGER__COMPONENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == SouthBoundApi.class) {
			switch (baseOperationID) {
				case ServerPackage.SOUTH_BOUND_API___LOGS__JSONOBJECT_ELIST: return VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___LOGS__JSONOBJECT_ELIST;
				case ServerPackage.SOUTH_BOUND_API___METRICS__JSONOBJECT_ELIST: return VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___METRICS__JSONOBJECT_ELIST;
				case ServerPackage.SOUTH_BOUND_API___PROPERTIES__JSONOBJECT_ELIST: return VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___PROPERTIES__JSONOBJECT_ELIST;
				default: return -1;
			}
		}
		if (baseClass == SouthBoundApiWithProxy.class) {
			switch (baseOperationID) {
				case ServerPackage.SOUTH_BOUND_API_WITH_PROXY___UPLOAD_INFO__JSONOBJECT_ELIST: return VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___UPLOAD_INFO__JSONOBJECT_ELIST;
				default: return -1;
			}
		}
		if (baseClass == AbstractManagementServer.class) {
			switch (baseOperationID) {
				case ServerPackage.ABSTRACT_MANAGEMENT_SERVER___GET_VALUES__JSONOBJECT_STRING_LONG_LONG_METRICVALUEOPTION_BOOLEAN: return VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_VALUES__JSONOBJECT_STRING_LONG_LONG_METRICVALUEOPTION_BOOLEAN;
				case ServerPackage.ABSTRACT_MANAGEMENT_SERVER___GET_VALUES_ALL__JSONOBJECT_STRING_ELIST_LONG_LONG_METRICVALUEOPTION_BOOLEAN: return VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_VALUES_ALL__JSONOBJECT_STRING_ELIST_LONG_LONG_METRICVALUEOPTION_BOOLEAN;
				case ServerPackage.ABSTRACT_MANAGEMENT_SERVER___GET_MESSAGES__JSONOBJECT_STRING_LONG_LONG: return VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_MESSAGES__JSONOBJECT_STRING_LONG_LONG;
				case ServerPackage.ABSTRACT_MANAGEMENT_SERVER___GET_REQUEST_LOGGER__STRING_STRING_STRING_JSONOBJECT: return VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_REQUEST_LOGGER__STRING_STRING_STRING_JSONOBJECT;
				case ServerPackage.ABSTRACT_MANAGEMENT_SERVER___EVALUATE__STRING_FUNCTION: return VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___EVALUATE__STRING_FUNCTION;
				case ServerPackage.ABSTRACT_MANAGEMENT_SERVER___UPDATE__STRING_FUNCTION: return VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___UPDATE__STRING_FUNCTION;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_VALUES__JSONOBJECT_STRING_LONG_LONG_METRICVALUEOPTION_BOOLEAN:
				return getValues((JSONObject)arguments.get(0), (String)arguments.get(1), (Long)arguments.get(2), (Long)arguments.get(3), (MetricValueOption)arguments.get(4), (Boolean)arguments.get(5));
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_VALUES_ALL__JSONOBJECT_STRING_ELIST_LONG_LONG_METRICVALUEOPTION_BOOLEAN:
				return getValuesAll((JSONObject)arguments.get(0), (String)arguments.get(1), (EList<String>)arguments.get(2), (Long)arguments.get(3), (Long)arguments.get(4), (MetricValueOption)arguments.get(5), (Boolean)arguments.get(6));
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_MESSAGES__JSONOBJECT_STRING_LONG_LONG:
				return getMessages((JSONObject)arguments.get(0), (String)arguments.get(1), (Long)arguments.get(2), (Long)arguments.get(3));
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___GET_REQUEST_LOGGER__STRING_STRING_STRING_JSONOBJECT:
				return getRequestLogger((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (JSONObject)arguments.get(3));
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___EVALUATE__STRING_FUNCTION:
				return evaluate((String)arguments.get(0), (Function)arguments.get(1));
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___UPDATE__STRING_FUNCTION:
				update((String)arguments.get(0), (Function)arguments.get(1));
				return null;
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___UPLOAD_INFO__JSONOBJECT_ELIST:
				uploadInfo((JSONObject)arguments.get(0), (EList<ManagementInfo>)arguments.get(1));
				return null;
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___LOGS__JSONOBJECT_ELIST:
				logs((JSONObject)arguments.get(0), (EList<LogMessage>)arguments.get(1));
				return null;
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___METRICS__JSONOBJECT_ELIST:
				metrics((JSONObject)arguments.get(0), (EList<Metric>)arguments.get(1));
				return null;
			case VmmanagerPackage.VIRTUAL_MACHINE_MANAGER___PROPERTIES__JSONOBJECT_ELIST:
				properties((JSONObject)arguments.get(0), (EList<AbstractProperty>)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //VirtualMachineManagerImpl
