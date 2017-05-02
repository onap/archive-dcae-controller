
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
package org.openecomp.dcae.controller.platform.controller.impl;

import org.openecomp.dcae.controller.core.service.DcaeLocation;
import org.openecomp.dcae.controller.core.service.DcaeService;
import org.openecomp.dcae.controller.core.service.DcaeServiceDescriptor;
import org.openecomp.dcae.controller.inventory.DcaeInventory;
import org.openecomp.dcae.controller.platform.controller.ControllerCluster;
import org.openecomp.dcae.controller.platform.controller.ControllerPackage;
import org.openecomp.dcae.controller.platform.controller.DcaeDataBus;
import org.openecomp.dcae.controller.platform.controller.DcaePlatformController;
import org.openecomp.ncomp.component.Component;
import org.openecomp.ncomp.core.User;
import org.openecomp.ncomp.core.function.Function;
import org.openecomp.ncomp.core.function.ValuePair;
import org.openecomp.ncomp.core.logs.LogMessage;
import org.openecomp.ncomp.core.metrics.DoubleMetric;
import org.openecomp.ncomp.core.metrics.MetricValueOption;
import org.openecomp.ncomp.openstack.OpenStackController;
import org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer;
import org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration;
import org.openecomp.ncomp.sirius.manager.server.LoggerInfo;
import org.openecomp.ncomp.sirius.manager.server.ServerPackage;
import org.openecomp.ncomp.sirius.manager.server.impl.SouthBoundApiWithProxyImpl;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.json.JSONObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dcae Platform Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.DcaePlatformControllerImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.DcaePlatformControllerImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.DcaePlatformControllerImpl#getCluster <em>Cluster</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.DcaePlatformControllerImpl#getOpenstack <em>Openstack</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.DcaePlatformControllerImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.DcaePlatformControllerImpl#getDatabus <em>Databus</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.DcaePlatformControllerImpl#getInventory <em>Inventory</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.DcaePlatformControllerImpl#getDescriptors <em>Descriptors</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.DcaePlatformControllerImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.DcaePlatformControllerImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.DcaePlatformControllerImpl#getAdminUsers <em>Admin Users</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DcaePlatformControllerImpl extends SouthBoundApiWithProxyImpl implements DcaePlatformController {
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
	 * The cached value of the '{@link #getCluster() <em>Cluster</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCluster()
	 * @generated
	 * @ordered
	 */
	protected ControllerCluster cluster;

	/**
	 * The cached value of the '{@link #getOpenstack() <em>Openstack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstack()
	 * @generated
	 * @ordered
	 */
	protected OpenStackController openstack;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<DcaeLocation> locations;

	/**
	 * The cached value of the '{@link #getDatabus() <em>Databus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabus()
	 * @generated
	 * @ordered
	 */
	protected DcaeDataBus databus;

	/**
	 * The cached value of the '{@link #getInventory() <em>Inventory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventory()
	 * @generated
	 * @ordered
	 */
	protected DcaeInventory inventory;

	/**
	 * The cached value of the '{@link #getDescriptors() <em>Descriptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<DcaeServiceDescriptor> descriptors;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<DcaeService> services;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The cached value of the '{@link #getAdminUsers() <em>Admin Users</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> adminUsers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcaePlatformControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControllerPackage.Literals.DCAE_PLATFORM_CONTROLLER;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControllerPackage.DCAE_PLATFORM_CONTROLLER__CONFIGURATION, oldConfiguration, newConfiguration);
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
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControllerPackage.DCAE_PLATFORM_CONTROLLER__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControllerPackage.DCAE_PLATFORM_CONTROLLER__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.DCAE_PLATFORM_CONTROLLER__CONFIGURATION, newConfiguration, newConfiguration));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControllerPackage.DCAE_PLATFORM_CONTROLLER__COMPONENT, oldComponent, newComponent);
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
				msgs = ((InternalEObject)component).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControllerPackage.DCAE_PLATFORM_CONTROLLER__COMPONENT, null, msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControllerPackage.DCAE_PLATFORM_CONTROLLER__COMPONENT, null, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.DCAE_PLATFORM_CONTROLLER__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerCluster getCluster() {
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCluster(ControllerCluster newCluster, NotificationChain msgs) {
		ControllerCluster oldCluster = cluster;
		cluster = newCluster;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControllerPackage.DCAE_PLATFORM_CONTROLLER__CLUSTER, oldCluster, newCluster);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCluster(ControllerCluster newCluster) {
		if (newCluster != cluster) {
			NotificationChain msgs = null;
			if (cluster != null)
				msgs = ((InternalEObject)cluster).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControllerPackage.DCAE_PLATFORM_CONTROLLER__CLUSTER, null, msgs);
			if (newCluster != null)
				msgs = ((InternalEObject)newCluster).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControllerPackage.DCAE_PLATFORM_CONTROLLER__CLUSTER, null, msgs);
			msgs = basicSetCluster(newCluster, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.DCAE_PLATFORM_CONTROLLER__CLUSTER, newCluster, newCluster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStackController getOpenstack() {
		return openstack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpenstack(OpenStackController newOpenstack, NotificationChain msgs) {
		OpenStackController oldOpenstack = openstack;
		openstack = newOpenstack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControllerPackage.DCAE_PLATFORM_CONTROLLER__OPENSTACK, oldOpenstack, newOpenstack);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenstack(OpenStackController newOpenstack) {
		if (newOpenstack != openstack) {
			NotificationChain msgs = null;
			if (openstack != null)
				msgs = ((InternalEObject)openstack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControllerPackage.DCAE_PLATFORM_CONTROLLER__OPENSTACK, null, msgs);
			if (newOpenstack != null)
				msgs = ((InternalEObject)newOpenstack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControllerPackage.DCAE_PLATFORM_CONTROLLER__OPENSTACK, null, msgs);
			msgs = basicSetOpenstack(newOpenstack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.DCAE_PLATFORM_CONTROLLER__OPENSTACK, newOpenstack, newOpenstack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DcaeLocation> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<DcaeLocation>(DcaeLocation.class, this, ControllerPackage.DCAE_PLATFORM_CONTROLLER__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeDataBus getDatabus() {
		return databus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabus(DcaeDataBus newDatabus, NotificationChain msgs) {
		DcaeDataBus oldDatabus = databus;
		databus = newDatabus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControllerPackage.DCAE_PLATFORM_CONTROLLER__DATABUS, oldDatabus, newDatabus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabus(DcaeDataBus newDatabus) {
		if (newDatabus != databus) {
			NotificationChain msgs = null;
			if (databus != null)
				msgs = ((InternalEObject)databus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControllerPackage.DCAE_PLATFORM_CONTROLLER__DATABUS, null, msgs);
			if (newDatabus != null)
				msgs = ((InternalEObject)newDatabus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControllerPackage.DCAE_PLATFORM_CONTROLLER__DATABUS, null, msgs);
			msgs = basicSetDatabus(newDatabus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.DCAE_PLATFORM_CONTROLLER__DATABUS, newDatabus, newDatabus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeInventory getInventory() {
		return inventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInventory(DcaeInventory newInventory, NotificationChain msgs) {
		DcaeInventory oldInventory = inventory;
		inventory = newInventory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControllerPackage.DCAE_PLATFORM_CONTROLLER__INVENTORY, oldInventory, newInventory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInventory(DcaeInventory newInventory) {
		if (newInventory != inventory) {
			NotificationChain msgs = null;
			if (inventory != null)
				msgs = ((InternalEObject)inventory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControllerPackage.DCAE_PLATFORM_CONTROLLER__INVENTORY, null, msgs);
			if (newInventory != null)
				msgs = ((InternalEObject)newInventory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControllerPackage.DCAE_PLATFORM_CONTROLLER__INVENTORY, null, msgs);
			msgs = basicSetInventory(newInventory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControllerPackage.DCAE_PLATFORM_CONTROLLER__INVENTORY, newInventory, newInventory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DcaeService> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<DcaeService>(DcaeService.class, this, ControllerPackage.DCAE_PLATFORM_CONTROLLER__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, ControllerPackage.DCAE_PLATFORM_CONTROLLER__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DcaeServiceDescriptor> getDescriptors() {
		if (descriptors == null) {
			descriptors = new EObjectContainmentEList<DcaeServiceDescriptor>(DcaeServiceDescriptor.class, this, ControllerPackage.DCAE_PLATFORM_CONTROLLER__DESCRIPTORS);
		}
		return descriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getAdminUsers() {
		if (adminUsers == null) {
			adminUsers = new EObjectResolvingEList<User>(User.class, this, ControllerPackage.DCAE_PLATFORM_CONTROLLER__ADMIN_USERS);
		}
		return adminUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deployDescriptor(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refreshDataBus(String nameMatch) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__COMPONENT:
				return basicSetComponent(null, msgs);
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__CLUSTER:
				return basicSetCluster(null, msgs);
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__OPENSTACK:
				return basicSetOpenstack(null, msgs);
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__DATABUS:
				return basicSetDatabus(null, msgs);
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__INVENTORY:
				return basicSetInventory(null, msgs);
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__DESCRIPTORS:
				return ((InternalEList<?>)getDescriptors()).basicRemove(otherEnd, msgs);
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
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
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__CONFIGURATION:
				return getConfiguration();
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__COMPONENT:
				return getComponent();
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__CLUSTER:
				return getCluster();
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__OPENSTACK:
				return getOpenstack();
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__LOCATIONS:
				return getLocations();
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__DATABUS:
				return getDatabus();
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__INVENTORY:
				return getInventory();
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__DESCRIPTORS:
				return getDescriptors();
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__SERVICES:
				return getServices();
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__USERS:
				return getUsers();
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__ADMIN_USERS:
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
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__CONFIGURATION:
				setConfiguration((AbstractManagementServerConfiguration)newValue);
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__COMPONENT:
				setComponent((Component)newValue);
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__CLUSTER:
				setCluster((ControllerCluster)newValue);
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__OPENSTACK:
				setOpenstack((OpenStackController)newValue);
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends DcaeLocation>)newValue);
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__DATABUS:
				setDatabus((DcaeDataBus)newValue);
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__INVENTORY:
				setInventory((DcaeInventory)newValue);
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__DESCRIPTORS:
				getDescriptors().clear();
				getDescriptors().addAll((Collection<? extends DcaeServiceDescriptor>)newValue);
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends DcaeService>)newValue);
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__ADMIN_USERS:
				getAdminUsers().clear();
				getAdminUsers().addAll((Collection<? extends User>)newValue);
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
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__CONFIGURATION:
				setConfiguration((AbstractManagementServerConfiguration)null);
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__COMPONENT:
				setComponent((Component)null);
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__CLUSTER:
				setCluster((ControllerCluster)null);
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__OPENSTACK:
				setOpenstack((OpenStackController)null);
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__LOCATIONS:
				getLocations().clear();
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__DATABUS:
				setDatabus((DcaeDataBus)null);
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__INVENTORY:
				setInventory((DcaeInventory)null);
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__DESCRIPTORS:
				getDescriptors().clear();
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__SERVICES:
				getServices().clear();
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__USERS:
				getUsers().clear();
				return;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__ADMIN_USERS:
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
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__CONFIGURATION:
				return configuration != null;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__COMPONENT:
				return component != null;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__CLUSTER:
				return cluster != null;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__OPENSTACK:
				return openstack != null;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__DATABUS:
				return databus != null;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__INVENTORY:
				return inventory != null;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__DESCRIPTORS:
				return descriptors != null && !descriptors.isEmpty();
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__SERVICES:
				return services != null && !services.isEmpty();
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__USERS:
				return users != null && !users.isEmpty();
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER__ADMIN_USERS:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractManagementServer.class) {
			switch (derivedFeatureID) {
				case ControllerPackage.DCAE_PLATFORM_CONTROLLER__CONFIGURATION: return ServerPackage.ABSTRACT_MANAGEMENT_SERVER__CONFIGURATION;
				case ControllerPackage.DCAE_PLATFORM_CONTROLLER__COMPONENT: return ServerPackage.ABSTRACT_MANAGEMENT_SERVER__COMPONENT;
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
		if (baseClass == AbstractManagementServer.class) {
			switch (baseFeatureID) {
				case ServerPackage.ABSTRACT_MANAGEMENT_SERVER__CONFIGURATION: return ControllerPackage.DCAE_PLATFORM_CONTROLLER__CONFIGURATION;
				case ServerPackage.ABSTRACT_MANAGEMENT_SERVER__COMPONENT: return ControllerPackage.DCAE_PLATFORM_CONTROLLER__COMPONENT;
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
		if (baseClass == AbstractManagementServer.class) {
			switch (baseOperationID) {
				case ServerPackage.ABSTRACT_MANAGEMENT_SERVER___GET_VALUES__JSONOBJECT_STRING_LONG_LONG_METRICVALUEOPTION_BOOLEAN: return ControllerPackage.DCAE_PLATFORM_CONTROLLER___GET_VALUES__JSONOBJECT_STRING_LONG_LONG_METRICVALUEOPTION_BOOLEAN;
				case ServerPackage.ABSTRACT_MANAGEMENT_SERVER___GET_VALUES_ALL__JSONOBJECT_STRING_ELIST_LONG_LONG_METRICVALUEOPTION_BOOLEAN: return ControllerPackage.DCAE_PLATFORM_CONTROLLER___GET_VALUES_ALL__JSONOBJECT_STRING_ELIST_LONG_LONG_METRICVALUEOPTION_BOOLEAN;
				case ServerPackage.ABSTRACT_MANAGEMENT_SERVER___GET_MESSAGES__JSONOBJECT_STRING_LONG_LONG: return ControllerPackage.DCAE_PLATFORM_CONTROLLER___GET_MESSAGES__JSONOBJECT_STRING_LONG_LONG;
				case ServerPackage.ABSTRACT_MANAGEMENT_SERVER___GET_REQUEST_LOGGER__STRING_STRING_STRING_JSONOBJECT: return ControllerPackage.DCAE_PLATFORM_CONTROLLER___GET_REQUEST_LOGGER__STRING_STRING_STRING_JSONOBJECT;
				case ServerPackage.ABSTRACT_MANAGEMENT_SERVER___EVALUATE__STRING_FUNCTION: return ControllerPackage.DCAE_PLATFORM_CONTROLLER___EVALUATE__STRING_FUNCTION;
				case ServerPackage.ABSTRACT_MANAGEMENT_SERVER___UPDATE__STRING_FUNCTION: return ControllerPackage.DCAE_PLATFORM_CONTROLLER___UPDATE__STRING_FUNCTION;
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
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER___DEPLOY_DESCRIPTOR__STRING:
				deployDescriptor((String)arguments.get(0));
				return null;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER___REFRESH_DATA_BUS__STRING:
				refreshDataBus((String)arguments.get(0));
				return null;
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER___GET_VALUES__JSONOBJECT_STRING_LONG_LONG_METRICVALUEOPTION_BOOLEAN:
				return getValues((JSONObject)arguments.get(0), (String)arguments.get(1), (Long)arguments.get(2), (Long)arguments.get(3), (MetricValueOption)arguments.get(4), (Boolean)arguments.get(5));
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER___GET_VALUES_ALL__JSONOBJECT_STRING_ELIST_LONG_LONG_METRICVALUEOPTION_BOOLEAN:
				return getValuesAll((JSONObject)arguments.get(0), (String)arguments.get(1), (EList<String>)arguments.get(2), (Long)arguments.get(3), (Long)arguments.get(4), (MetricValueOption)arguments.get(5), (Boolean)arguments.get(6));
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER___GET_MESSAGES__JSONOBJECT_STRING_LONG_LONG:
				return getMessages((JSONObject)arguments.get(0), (String)arguments.get(1), (Long)arguments.get(2), (Long)arguments.get(3));
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER___GET_REQUEST_LOGGER__STRING_STRING_STRING_JSONOBJECT:
				return getRequestLogger((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (JSONObject)arguments.get(3));
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER___EVALUATE__STRING_FUNCTION:
				return evaluate((String)arguments.get(0), (Function)arguments.get(1));
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER___UPDATE__STRING_FUNCTION:
				update((String)arguments.get(0), (Function)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DcaePlatformControllerImpl
