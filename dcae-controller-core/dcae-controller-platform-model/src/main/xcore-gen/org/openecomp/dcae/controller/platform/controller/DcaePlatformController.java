
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
package org.openecomp.dcae.controller.platform.controller;

import org.openecomp.dcae.controller.core.service.DcaeLocation;
import org.openecomp.dcae.controller.core.service.DcaeService;
import org.openecomp.dcae.controller.core.service.DcaeServiceDescriptor;
import org.openecomp.dcae.controller.inventory.DcaeInventory;
import org.openecomp.ncomp.core.User;
import org.openecomp.ncomp.openstack.OpenStackController;
import org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer;
import org.openecomp.ncomp.sirius.manager.server.SouthBoundApiWithProxy;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dcae Platform Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getCluster <em>Cluster</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getOpenstack <em>Openstack</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getLocations <em>Locations</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getDatabus <em>Databus</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getInventory <em>Inventory</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getDescriptors <em>Descriptors</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getServices <em>Services</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getUsers <em>Users</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getAdminUsers <em>Admin Users</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getDcaePlatformController()
 * @model
 * @generated
 */
public interface DcaePlatformController extends SouthBoundApiWithProxy, AbstractManagementServer {
	/**
	 * Returns the value of the '<em><b>Cluster</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cluster</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster</em>' containment reference.
	 * @see #setCluster(ControllerCluster)
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getDcaePlatformController_Cluster()
	 * @model containment="true"
	 * @generated
	 */
	ControllerCluster getCluster();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getCluster <em>Cluster</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster</em>' containment reference.
	 * @see #getCluster()
	 * @generated
	 */
	void setCluster(ControllerCluster value);

	/**
	 * Returns the value of the '<em><b>Openstack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Openstack</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Openstack</em>' containment reference.
	 * @see #setOpenstack(OpenStackController)
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getDcaePlatformController_Openstack()
	 * @model containment="true"
	 * @generated
	 */
	OpenStackController getOpenstack();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getOpenstack <em>Openstack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Openstack</em>' containment reference.
	 * @see #getOpenstack()
	 * @generated
	 */
	void setOpenstack(OpenStackController value);

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.service.DcaeLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getDcaePlatformController_Locations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DcaeLocation> getLocations();

	/**
	 * Returns the value of the '<em><b>Databus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databus</em>' containment reference.
	 * @see #setDatabus(DcaeDataBus)
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getDcaePlatformController_Databus()
	 * @model containment="true"
	 * @generated
	 */
	DcaeDataBus getDatabus();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getDatabus <em>Databus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databus</em>' containment reference.
	 * @see #getDatabus()
	 * @generated
	 */
	void setDatabus(DcaeDataBus value);

	/**
	 * Returns the value of the '<em><b>Inventory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory</em>' containment reference.
	 * @see #setInventory(DcaeInventory)
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getDcaePlatformController_Inventory()
	 * @model containment="true"
	 * @generated
	 */
	DcaeInventory getInventory();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController#getInventory <em>Inventory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory</em>' containment reference.
	 * @see #getInventory()
	 * @generated
	 */
	void setInventory(DcaeInventory value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.service.DcaeService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getDcaePlatformController_Services()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DcaeService> getServices();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.core.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getDcaePlatformController_Users()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Descriptors</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.service.DcaeServiceDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptors</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getDcaePlatformController_Descriptors()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DcaeServiceDescriptor> getDescriptors();

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
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getDcaePlatformController_AdminUsers()
	 * @model
	 * @generated
	 */
	EList<User> getAdminUsers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameUnique="false"
	 * @generated
	 */
	void deployDescriptor(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameMatchUnique="false"
	 * @generated
	 */
	void refreshDataBus(String nameMatch);

} // DcaePlatformController
