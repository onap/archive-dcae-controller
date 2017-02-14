
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

import org.openecomp.dcae.controller.core.server.DcaeBasicServer;
import org.openecomp.dcae.controller.core.service.DcaeLocation;
import org.openecomp.dcae.controller.core.service.DcaeServiceInstance;
import org.openecomp.ncomp.core.User;
import org.openecomp.ncomp.openstack.core.VirtualMachineType;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Machine Service Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getLocation <em>Location</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getVmType <em>Vm Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getUsers <em>Users</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getAdminUsers <em>Admin Users</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getApplicationIds <em>Application Ids</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getAdminId <em>Admin Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getNumberOfServers <em>Number Of Servers</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getAvailabilityZone <em>Availability Zone</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getManagerPortNumber <em>Manager Port Number</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getServers <em>Servers</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getLeaderServer <em>Leader Server</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getService <em>Service</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getIedsAdmin <em>Ieds Admin</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getChefUser <em>Chef User</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getChefOrg <em>Chef Org</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getChefTopology <em>Chef Topology</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getOpenstackFlavor <em>Openstack Flavor</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getServiceFqdn <em>Service Fqdn</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getDeploymentTimeoutMinutes <em>Deployment Timeout Minutes</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance()
 * @model
 * @generated
 */
public interface VirtualMachineServiceInstance extends DcaeServiceInstance, VirtualMachineServiceConfiguration {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(DcaeLocation)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_Location()
	 * @model
	 * @generated
	 */
	DcaeLocation getLocation();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(DcaeLocation value);

	/**
	 * Returns the value of the '<em><b>Vm Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Type</em>' reference.
	 * @see #setVmType(VirtualMachineType)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_VmType()
	 * @model annotation="http://openecomp.org type='service'"
	 * @generated
	 */
	VirtualMachineType getVmType();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getVmType <em>Vm Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Type</em>' reference.
	 * @see #getVmType()
	 * @generated
	 */
	void setVmType(VirtualMachineType value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.core.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' reference list.
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_Users()
	 * @model annotation="http://openecomp.org type='service'"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Admin Users</b></em>' reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.core.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin Users</em>' reference list.
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_AdminUsers()
	 * @model annotation="http://openecomp.org type='service'"
	 * @generated
	 */
	EList<User> getAdminUsers();

	/**
	 * Returns the value of the '<em><b>Application Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Ids</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Ids</em>' attribute list.
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_ApplicationIds()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getApplicationIds();

	/**
	 * Returns the value of the '<em><b>Admin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin Id</em>' attribute.
	 * @see #setAdminId(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_AdminId()
	 * @model unique="false"
	 * @generated
	 */
	String getAdminId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getAdminId <em>Admin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin Id</em>' attribute.
	 * @see #getAdminId()
	 * @generated
	 */
	void setAdminId(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Servers</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Servers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Servers</em>' attribute.
	 * @see #setNumberOfServers(int)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_NumberOfServers()
	 * @model default="1" unique="false"
	 *        annotation="http://openecomp.org type='service'"
	 * @generated
	 */
	int getNumberOfServers();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getNumberOfServers <em>Number Of Servers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Servers</em>' attribute.
	 * @see #getNumberOfServers()
	 * @generated
	 */
	void setNumberOfServers(int value);

	/**
	 * Returns the value of the '<em><b>Availability Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability Zone</em>' attribute.
	 * @see #setAvailabilityZone(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_AvailabilityZone()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='service'"
	 * @generated
	 */
	String getAvailabilityZone();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getAvailabilityZone <em>Availability Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Zone</em>' attribute.
	 * @see #getAvailabilityZone()
	 * @generated
	 */
	void setAvailabilityZone(String value);

	/**
	 * Returns the value of the '<em><b>Manager Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager Port Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager Port Number</em>' attribute.
	 * @see #setManagerPortNumber(Integer)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_ManagerPortNumber()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	Integer getManagerPortNumber();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getManagerPortNumber <em>Manager Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager Port Number</em>' attribute.
	 * @see #getManagerPortNumber()
	 * @generated
	 */
	void setManagerPortNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.server.DcaeBasicServer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servers</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_Servers()
	 * @model containment="true"
	 *        annotation="http://openecomp.org type='operational'"
	 * @generated
	 */
	EList<DcaeBasicServer> getServers();

	/**
	 * Returns the value of the '<em><b>Leader Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader Server</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Server</em>' reference.
	 * @see #setLeaderServer(DcaeBasicServer)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_LeaderServer()
	 * @model
	 * @generated
	 */
	DcaeBasicServer getLeaderServer();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getLeaderServer <em>Leader Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Server</em>' reference.
	 * @see #getLeaderServer()
	 * @generated
	 */
	void setLeaderServer(DcaeBasicServer value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineService#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' container reference.
	 * @see #setService(VirtualMachineService)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_Service()
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineService#getInstances
	 * @model opposite="instances" transient="false"
	 *        annotation="http://openecomp.org type='operational'"
	 * @generated
	 */
	VirtualMachineService getService();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getService <em>Service</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' container reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(VirtualMachineService value);

	/**
	 * Returns the value of the '<em><b>Ieds Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ieds Admin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ieds Admin</em>' attribute.
	 * @see #setIedsAdmin(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_IedsAdmin()
	 * @model unique="false"
	 * @generated
	 */
	String getIedsAdmin();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getIedsAdmin <em>Ieds Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ieds Admin</em>' attribute.
	 * @see #getIedsAdmin()
	 * @generated
	 */
	void setIedsAdmin(String value);

	/**
	 * Returns the value of the '<em><b>Chef User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chef User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chef User</em>' attribute.
	 * @see #setChefUser(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_ChefUser()
	 * @model unique="false"
	 * @generated
	 */
	String getChefUser();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getChefUser <em>Chef User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chef User</em>' attribute.
	 * @see #getChefUser()
	 * @generated
	 */
	void setChefUser(String value);

	/**
	 * Returns the value of the '<em><b>Chef Org</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chef Org</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chef Org</em>' attribute.
	 * @see #setChefOrg(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_ChefOrg()
	 * @model unique="false"
	 * @generated
	 */
	String getChefOrg();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getChefOrg <em>Chef Org</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chef Org</em>' attribute.
	 * @see #getChefOrg()
	 * @generated
	 */
	void setChefOrg(String value);

	/**
	 * Returns the value of the '<em><b>Chef Topology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chef Topology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chef Topology</em>' attribute.
	 * @see #setChefTopology(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_ChefTopology()
	 * @model unique="false"
	 * @generated
	 */
	String getChefTopology();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getChefTopology <em>Chef Topology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chef Topology</em>' attribute.
	 * @see #getChefTopology()
	 * @generated
	 */
	void setChefTopology(String value);

	/**
	 * Returns the value of the '<em><b>Openstack Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Openstack Flavor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Openstack Flavor</em>' attribute.
	 * @see #setOpenstackFlavor(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_OpenstackFlavor()
	 * @model unique="false"
	 * @generated
	 */
	String getOpenstackFlavor();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getOpenstackFlavor <em>Openstack Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openstack Flavor</em>' attribute.
	 * @see #getOpenstackFlavor()
	 * @generated
	 */
	void setOpenstackFlavor(String value);

	/**
	 * Returns the value of the '<em><b>Service Fqdn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Fqdn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Fqdn</em>' attribute.
	 * @see #setServiceFqdn(String)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_ServiceFqdn()
	 * @model unique="false"
	 * @generated
	 */
	String getServiceFqdn();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getServiceFqdn <em>Service Fqdn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Fqdn</em>' attribute.
	 * @see #getServiceFqdn()
	 * @generated
	 */
	void setServiceFqdn(String value);

	/**
	 * Returns the value of the '<em><b>Deployment Timeout Minutes</b></em>' attribute.
	 * The default value is <code>"90"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Timeout Minutes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Timeout Minutes</em>' attribute.
	 * @see #setDeploymentTimeoutMinutes(int)
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_DeploymentTimeoutMinutes()
	 * @model default="90" unique="false"
	 * @generated
	 */
	int getDeploymentTimeoutMinutes();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance#getDeploymentTimeoutMinutes <em>Deployment Timeout Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Timeout Minutes</em>' attribute.
	 * @see #getDeploymentTimeoutMinutes()
	 * @generated
	 */
	void setDeploymentTimeoutMinutes(int value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.service.vm.InstallationStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#getVirtualMachineServiceInstance_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstallationStep> getSteps();

} // VirtualMachineServiceInstance
