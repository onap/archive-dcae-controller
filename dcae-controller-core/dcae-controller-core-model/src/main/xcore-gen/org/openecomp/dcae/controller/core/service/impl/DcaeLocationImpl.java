
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

import org.openecomp.dcae.controller.core.service.DcaeLocation;
import org.openecomp.dcae.controller.core.service.ServicePackage;
import org.openecomp.ncomp.openstack.location.OpenStackProject;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dcae Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.service.impl.DcaeLocationImpl#getLocationType <em>Location Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.impl.DcaeLocationImpl#getOpenstackProject <em>Openstack Project</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DcaeLocationImpl extends DcaeServiceContainerImpl implements DcaeLocation {
	/**
	 * The default value of the '{@link #getLocationType() <em>Location Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationType()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationType() <em>Location Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationType()
	 * @generated
	 * @ordered
	 */
	protected String locationType = LOCATION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOpenstackProject() <em>Openstack Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstackProject()
	 * @generated
	 * @ordered
	 */
	protected OpenStackProject openstackProject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcaeLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.DCAE_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocationType() {
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationType(String newLocationType) {
		String oldLocationType = locationType;
		locationType = newLocationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.DCAE_LOCATION__LOCATION_TYPE, oldLocationType, locationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStackProject getOpenstackProject() {
		if (openstackProject != null && openstackProject.eIsProxy()) {
			InternalEObject oldOpenstackProject = (InternalEObject)openstackProject;
			openstackProject = (OpenStackProject)eResolveProxy(oldOpenstackProject);
			if (openstackProject != oldOpenstackProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.DCAE_LOCATION__OPENSTACK_PROJECT, oldOpenstackProject, openstackProject));
			}
		}
		return openstackProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStackProject basicGetOpenstackProject() {
		return openstackProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenstackProject(OpenStackProject newOpenstackProject) {
		OpenStackProject oldOpenstackProject = openstackProject;
		openstackProject = newOpenstackProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.DCAE_LOCATION__OPENSTACK_PROJECT, oldOpenstackProject, openstackProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.DCAE_LOCATION__LOCATION_TYPE:
				return getLocationType();
			case ServicePackage.DCAE_LOCATION__OPENSTACK_PROJECT:
				if (resolve) return getOpenstackProject();
				return basicGetOpenstackProject();
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
			case ServicePackage.DCAE_LOCATION__LOCATION_TYPE:
				setLocationType((String)newValue);
				return;
			case ServicePackage.DCAE_LOCATION__OPENSTACK_PROJECT:
				setOpenstackProject((OpenStackProject)newValue);
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
			case ServicePackage.DCAE_LOCATION__LOCATION_TYPE:
				setLocationType(LOCATION_TYPE_EDEFAULT);
				return;
			case ServicePackage.DCAE_LOCATION__OPENSTACK_PROJECT:
				setOpenstackProject((OpenStackProject)null);
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
			case ServicePackage.DCAE_LOCATION__LOCATION_TYPE:
				return LOCATION_TYPE_EDEFAULT == null ? locationType != null : !LOCATION_TYPE_EDEFAULT.equals(locationType);
			case ServicePackage.DCAE_LOCATION__OPENSTACK_PROJECT:
				return openstackProject != null;
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
		result.append(" (locationType: ");
		result.append(locationType);
		result.append(')');
		return result.toString();
	}

} //DcaeLocationImpl
