
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

import org.openecomp.dcae.controller.core.server.DcaeBasicServer;
import org.openecomp.dcae.controller.core.service.DcaeLocation;
import org.openecomp.dcae.controller.core.service.impl.DcaeServiceInstanceImpl;
import org.openecomp.dcae.controller.service.vm.InstallationStep;
import org.openecomp.dcae.controller.service.vm.VirtualMachineService;
import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceConfiguration;
import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance;
import org.openecomp.dcae.controller.service.vm.VmPackage;
import org.openecomp.ncomp.core.User;
import org.openecomp.ncomp.openstack.core.VirtualMachineType;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine Service Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getVmType <em>Vm Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getAdminUsers <em>Admin Users</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getApplicationIds <em>Application Ids</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getAdminId <em>Admin Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getNumberOfServers <em>Number Of Servers</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getAvailabilityZone <em>Availability Zone</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getManagerPortNumber <em>Manager Port Number</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getServers <em>Servers</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getLeaderServer <em>Leader Server</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getIedsAdmin <em>Ieds Admin</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getChefUser <em>Chef User</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getChefOrg <em>Chef Org</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getChefTopology <em>Chef Topology</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getOpenstackFlavor <em>Openstack Flavor</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getServiceFqdn <em>Service Fqdn</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getDeploymentTimeoutMinutes <em>Deployment Timeout Minutes</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.VirtualMachineServiceInstanceImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualMachineServiceInstanceImpl extends DcaeServiceInstanceImpl implements VirtualMachineServiceInstance {
	/**
	 * The default value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected String configuration = CONFIGURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected DcaeLocation location;

	/**
	 * The cached value of the '{@link #getVmType() <em>Vm Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmType()
	 * @generated
	 * @ordered
	 */
	protected VirtualMachineType vmType;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' reference list.
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
	 * The cached value of the '{@link #getApplicationIds() <em>Application Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> applicationIds;

	/**
	 * The default value of the '{@link #getAdminId() <em>Admin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminId()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdminId() <em>Admin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminId()
	 * @generated
	 * @ordered
	 */
	protected String adminId = ADMIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfServers() <em>Number Of Servers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfServers()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SERVERS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNumberOfServers() <em>Number Of Servers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfServers()
	 * @generated
	 * @ordered
	 */
	protected int numberOfServers = NUMBER_OF_SERVERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailabilityZone() <em>Availability Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityZone()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABILITY_ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailabilityZone() <em>Availability Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityZone()
	 * @generated
	 * @ordered
	 */
	protected String availabilityZone = AVAILABILITY_ZONE_EDEFAULT;

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
	 * The cached value of the '{@link #getServers() <em>Servers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServers()
	 * @generated
	 * @ordered
	 */
	protected EList<DcaeBasicServer> servers;

	/**
	 * The cached value of the '{@link #getLeaderServer() <em>Leader Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderServer()
	 * @generated
	 * @ordered
	 */
	protected DcaeBasicServer leaderServer;

	/**
	 * The default value of the '{@link #getIedsAdmin() <em>Ieds Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIedsAdmin()
	 * @generated
	 * @ordered
	 */
	protected static final String IEDS_ADMIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIedsAdmin() <em>Ieds Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIedsAdmin()
	 * @generated
	 * @ordered
	 */
	protected String iedsAdmin = IEDS_ADMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getChefUser() <em>Chef User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChefUser()
	 * @generated
	 * @ordered
	 */
	protected static final String CHEF_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChefUser() <em>Chef User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChefUser()
	 * @generated
	 * @ordered
	 */
	protected String chefUser = CHEF_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getChefOrg() <em>Chef Org</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChefOrg()
	 * @generated
	 * @ordered
	 */
	protected static final String CHEF_ORG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChefOrg() <em>Chef Org</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChefOrg()
	 * @generated
	 * @ordered
	 */
	protected String chefOrg = CHEF_ORG_EDEFAULT;

	/**
	 * The default value of the '{@link #getChefTopology() <em>Chef Topology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChefTopology()
	 * @generated
	 * @ordered
	 */
	protected static final String CHEF_TOPOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChefTopology() <em>Chef Topology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChefTopology()
	 * @generated
	 * @ordered
	 */
	protected String chefTopology = CHEF_TOPOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpenstackFlavor() <em>Openstack Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstackFlavor()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENSTACK_FLAVOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenstackFlavor() <em>Openstack Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstackFlavor()
	 * @generated
	 * @ordered
	 */
	protected String openstackFlavor = OPENSTACK_FLAVOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceFqdn() <em>Service Fqdn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceFqdn()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_FQDN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceFqdn() <em>Service Fqdn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceFqdn()
	 * @generated
	 * @ordered
	 */
	protected String serviceFqdn = SERVICE_FQDN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeploymentTimeoutMinutes() <em>Deployment Timeout Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentTimeoutMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final int DEPLOYMENT_TIMEOUT_MINUTES_EDEFAULT = 90;

	/**
	 * The cached value of the '{@link #getDeploymentTimeoutMinutes() <em>Deployment Timeout Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentTimeoutMinutes()
	 * @generated
	 * @ordered
	 */
	protected int deploymentTimeoutMinutes = DEPLOYMENT_TIMEOUT_MINUTES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<InstallationStep> steps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualMachineServiceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPackage.Literals.VIRTUAL_MACHINE_SERVICE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeLocation getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (DcaeLocation)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeLocation basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(DcaeLocation newLocation) {
		DcaeLocation oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachineType getVmType() {
		if (vmType != null && vmType.eIsProxy()) {
			InternalEObject oldVmType = (InternalEObject)vmType;
			vmType = (VirtualMachineType)eResolveProxy(oldVmType);
			if (vmType != oldVmType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__VM_TYPE, oldVmType, vmType));
			}
		}
		return vmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachineType basicGetVmType() {
		return vmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmType(VirtualMachineType newVmType) {
		VirtualMachineType oldVmType = vmType;
		vmType = newVmType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__VM_TYPE, oldVmType, vmType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectResolvingEList<User>(User.class, this, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getAdminUsers() {
		if (adminUsers == null) {
			adminUsers = new EObjectResolvingEList<User>(User.class, this, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_USERS);
		}
		return adminUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getApplicationIds() {
		if (applicationIds == null) {
			applicationIds = new EDataTypeEList<String>(String.class, this, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__APPLICATION_IDS);
		}
		return applicationIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdminId() {
		return adminId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdminId(String newAdminId) {
		String oldAdminId = adminId;
		adminId = newAdminId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_ID, oldAdminId, adminId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(String newConfiguration) {
		String oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfServers() {
		return numberOfServers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfServers(int newNumberOfServers) {
		int oldNumberOfServers = numberOfServers;
		numberOfServers = newNumberOfServers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__NUMBER_OF_SERVERS, oldNumberOfServers, numberOfServers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvailabilityZone() {
		return availabilityZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailabilityZone(String newAvailabilityZone) {
		String oldAvailabilityZone = availabilityZone;
		availabilityZone = newAvailabilityZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__AVAILABILITY_ZONE, oldAvailabilityZone, availabilityZone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__MANAGER_PORT_NUMBER, oldManagerPortNumber, managerPortNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DcaeBasicServer> getServers() {
		if (servers == null) {
			servers = new EObjectContainmentEList<DcaeBasicServer>(DcaeBasicServer.class, this, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVERS);
		}
		return servers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeBasicServer getLeaderServer() {
		if (leaderServer != null && leaderServer.eIsProxy()) {
			InternalEObject oldLeaderServer = (InternalEObject)leaderServer;
			leaderServer = (DcaeBasicServer)eResolveProxy(oldLeaderServer);
			if (leaderServer != oldLeaderServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LEADER_SERVER, oldLeaderServer, leaderServer));
			}
		}
		return leaderServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeBasicServer basicGetLeaderServer() {
		return leaderServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeaderServer(DcaeBasicServer newLeaderServer) {
		DcaeBasicServer oldLeaderServer = leaderServer;
		leaderServer = newLeaderServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LEADER_SERVER, oldLeaderServer, leaderServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachineService getService() {
		if (eContainerFeatureID() != VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE) return null;
		return (VirtualMachineService)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachineService basicGetService() {
		if (eContainerFeatureID() != VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE) return null;
		return (VirtualMachineService)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(VirtualMachineService newService, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newService, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(VirtualMachineService newService) {
		if (newService != eInternalContainer() || (eContainerFeatureID() != VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE && newService != null)) {
			if (EcoreUtil.isAncestor(this, newService))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, VmPackage.VIRTUAL_MACHINE_SERVICE__INSTANCES, VirtualMachineService.class, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIedsAdmin() {
		return iedsAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIedsAdmin(String newIedsAdmin) {
		String oldIedsAdmin = iedsAdmin;
		iedsAdmin = newIedsAdmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__IEDS_ADMIN, oldIedsAdmin, iedsAdmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChefUser() {
		return chefUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChefUser(String newChefUser) {
		String oldChefUser = chefUser;
		chefUser = newChefUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_USER, oldChefUser, chefUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChefOrg() {
		return chefOrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChefOrg(String newChefOrg) {
		String oldChefOrg = chefOrg;
		chefOrg = newChefOrg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_ORG, oldChefOrg, chefOrg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChefTopology() {
		return chefTopology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChefTopology(String newChefTopology) {
		String oldChefTopology = chefTopology;
		chefTopology = newChefTopology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_TOPOLOGY, oldChefTopology, chefTopology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpenstackFlavor() {
		return openstackFlavor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenstackFlavor(String newOpenstackFlavor) {
		String oldOpenstackFlavor = openstackFlavor;
		openstackFlavor = newOpenstackFlavor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__OPENSTACK_FLAVOR, oldOpenstackFlavor, openstackFlavor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceFqdn() {
		return serviceFqdn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceFqdn(String newServiceFqdn) {
		String oldServiceFqdn = serviceFqdn;
		serviceFqdn = newServiceFqdn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE_FQDN, oldServiceFqdn, serviceFqdn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeploymentTimeoutMinutes() {
		return deploymentTimeoutMinutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentTimeoutMinutes(int newDeploymentTimeoutMinutes) {
		int oldDeploymentTimeoutMinutes = deploymentTimeoutMinutes;
		deploymentTimeoutMinutes = newDeploymentTimeoutMinutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__DEPLOYMENT_TIMEOUT_MINUTES, oldDeploymentTimeoutMinutes, deploymentTimeoutMinutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstallationStep> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<InstallationStep>(InstallationStep.class, this, VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__STEPS);
		}
		return steps;
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
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetService((VirtualMachineService)otherEnd, msgs);
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
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVERS:
				return ((InternalEList<?>)getServers()).basicRemove(otherEnd, msgs);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE:
				return basicSetService(null, msgs);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE:
				return eInternalContainer().eInverseRemove(this, VmPackage.VIRTUAL_MACHINE_SERVICE__INSTANCES, VirtualMachineService.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CONFIGURATION:
				return getConfiguration();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__VM_TYPE:
				if (resolve) return getVmType();
				return basicGetVmType();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__USERS:
				return getUsers();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_USERS:
				return getAdminUsers();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__APPLICATION_IDS:
				return getApplicationIds();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_ID:
				return getAdminId();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__NUMBER_OF_SERVERS:
				return getNumberOfServers();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__AVAILABILITY_ZONE:
				return getAvailabilityZone();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__MANAGER_PORT_NUMBER:
				return getManagerPortNumber();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVERS:
				return getServers();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LEADER_SERVER:
				if (resolve) return getLeaderServer();
				return basicGetLeaderServer();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__IEDS_ADMIN:
				return getIedsAdmin();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_USER:
				return getChefUser();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_ORG:
				return getChefOrg();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_TOPOLOGY:
				return getChefTopology();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__OPENSTACK_FLAVOR:
				return getOpenstackFlavor();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE_FQDN:
				return getServiceFqdn();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__DEPLOYMENT_TIMEOUT_MINUTES:
				return getDeploymentTimeoutMinutes();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__STEPS:
				return getSteps();
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
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CONFIGURATION:
				setConfiguration((String)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LOCATION:
				setLocation((DcaeLocation)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__VM_TYPE:
				setVmType((VirtualMachineType)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_USERS:
				getAdminUsers().clear();
				getAdminUsers().addAll((Collection<? extends User>)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__APPLICATION_IDS:
				getApplicationIds().clear();
				getApplicationIds().addAll((Collection<? extends String>)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_ID:
				setAdminId((String)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__NUMBER_OF_SERVERS:
				setNumberOfServers((Integer)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__AVAILABILITY_ZONE:
				setAvailabilityZone((String)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__MANAGER_PORT_NUMBER:
				setManagerPortNumber((Integer)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVERS:
				getServers().clear();
				getServers().addAll((Collection<? extends DcaeBasicServer>)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LEADER_SERVER:
				setLeaderServer((DcaeBasicServer)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE:
				setService((VirtualMachineService)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__IEDS_ADMIN:
				setIedsAdmin((String)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_USER:
				setChefUser((String)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_ORG:
				setChefOrg((String)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_TOPOLOGY:
				setChefTopology((String)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__OPENSTACK_FLAVOR:
				setOpenstackFlavor((String)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE_FQDN:
				setServiceFqdn((String)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__DEPLOYMENT_TIMEOUT_MINUTES:
				setDeploymentTimeoutMinutes((Integer)newValue);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends InstallationStep>)newValue);
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
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LOCATION:
				setLocation((DcaeLocation)null);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__VM_TYPE:
				setVmType((VirtualMachineType)null);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__USERS:
				getUsers().clear();
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_USERS:
				getAdminUsers().clear();
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__APPLICATION_IDS:
				getApplicationIds().clear();
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_ID:
				setAdminId(ADMIN_ID_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__NUMBER_OF_SERVERS:
				setNumberOfServers(NUMBER_OF_SERVERS_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__AVAILABILITY_ZONE:
				setAvailabilityZone(AVAILABILITY_ZONE_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__MANAGER_PORT_NUMBER:
				setManagerPortNumber(MANAGER_PORT_NUMBER_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVERS:
				getServers().clear();
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LEADER_SERVER:
				setLeaderServer((DcaeBasicServer)null);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE:
				setService((VirtualMachineService)null);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__IEDS_ADMIN:
				setIedsAdmin(IEDS_ADMIN_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_USER:
				setChefUser(CHEF_USER_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_ORG:
				setChefOrg(CHEF_ORG_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_TOPOLOGY:
				setChefTopology(CHEF_TOPOLOGY_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__OPENSTACK_FLAVOR:
				setOpenstackFlavor(OPENSTACK_FLAVOR_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE_FQDN:
				setServiceFqdn(SERVICE_FQDN_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__DEPLOYMENT_TIMEOUT_MINUTES:
				setDeploymentTimeoutMinutes(DEPLOYMENT_TIMEOUT_MINUTES_EDEFAULT);
				return;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__STEPS:
				getSteps().clear();
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
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? configuration != null : !CONFIGURATION_EDEFAULT.equals(configuration);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LOCATION:
				return location != null;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__VM_TYPE:
				return vmType != null;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__USERS:
				return users != null && !users.isEmpty();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_USERS:
				return adminUsers != null && !adminUsers.isEmpty();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__APPLICATION_IDS:
				return applicationIds != null && !applicationIds.isEmpty();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_ID:
				return ADMIN_ID_EDEFAULT == null ? adminId != null : !ADMIN_ID_EDEFAULT.equals(adminId);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__NUMBER_OF_SERVERS:
				return numberOfServers != NUMBER_OF_SERVERS_EDEFAULT;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__AVAILABILITY_ZONE:
				return AVAILABILITY_ZONE_EDEFAULT == null ? availabilityZone != null : !AVAILABILITY_ZONE_EDEFAULT.equals(availabilityZone);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__MANAGER_PORT_NUMBER:
				return MANAGER_PORT_NUMBER_EDEFAULT == null ? managerPortNumber != null : !MANAGER_PORT_NUMBER_EDEFAULT.equals(managerPortNumber);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVERS:
				return servers != null && !servers.isEmpty();
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__LEADER_SERVER:
				return leaderServer != null;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE:
				return basicGetService() != null;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__IEDS_ADMIN:
				return IEDS_ADMIN_EDEFAULT == null ? iedsAdmin != null : !IEDS_ADMIN_EDEFAULT.equals(iedsAdmin);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_USER:
				return CHEF_USER_EDEFAULT == null ? chefUser != null : !CHEF_USER_EDEFAULT.equals(chefUser);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_ORG:
				return CHEF_ORG_EDEFAULT == null ? chefOrg != null : !CHEF_ORG_EDEFAULT.equals(chefOrg);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_TOPOLOGY:
				return CHEF_TOPOLOGY_EDEFAULT == null ? chefTopology != null : !CHEF_TOPOLOGY_EDEFAULT.equals(chefTopology);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__OPENSTACK_FLAVOR:
				return OPENSTACK_FLAVOR_EDEFAULT == null ? openstackFlavor != null : !OPENSTACK_FLAVOR_EDEFAULT.equals(openstackFlavor);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE_FQDN:
				return SERVICE_FQDN_EDEFAULT == null ? serviceFqdn != null : !SERVICE_FQDN_EDEFAULT.equals(serviceFqdn);
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__DEPLOYMENT_TIMEOUT_MINUTES:
				return deploymentTimeoutMinutes != DEPLOYMENT_TIMEOUT_MINUTES_EDEFAULT;
			case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__STEPS:
				return steps != null && !steps.isEmpty();
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
		if (baseClass == VirtualMachineServiceConfiguration.class) {
			switch (derivedFeatureID) {
				case VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CONFIGURATION: return VmPackage.VIRTUAL_MACHINE_SERVICE_CONFIGURATION__CONFIGURATION;
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
		if (baseClass == VirtualMachineServiceConfiguration.class) {
			switch (baseFeatureID) {
				case VmPackage.VIRTUAL_MACHINE_SERVICE_CONFIGURATION__CONFIGURATION: return VmPackage.VIRTUAL_MACHINE_SERVICE_INSTANCE__CONFIGURATION;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (configuration: ");
		result.append(configuration);
		result.append(", applicationIds: ");
		result.append(applicationIds);
		result.append(", adminId: ");
		result.append(adminId);
		result.append(", numberOfServers: ");
		result.append(numberOfServers);
		result.append(", availabilityZone: ");
		result.append(availabilityZone);
		result.append(", managerPortNumber: ");
		result.append(managerPortNumber);
		result.append(", iedsAdmin: ");
		result.append(iedsAdmin);
		result.append(", chefUser: ");
		result.append(chefUser);
		result.append(", chefOrg: ");
		result.append(chefOrg);
		result.append(", chefTopology: ");
		result.append(chefTopology);
		result.append(", openstackFlavor: ");
		result.append(openstackFlavor);
		result.append(", serviceFqdn: ");
		result.append(serviceFqdn);
		result.append(", deploymentTimeoutMinutes: ");
		result.append(deploymentTimeoutMinutes);
		result.append(')');
		return result.toString();
	}

} //VirtualMachineServiceInstanceImpl
