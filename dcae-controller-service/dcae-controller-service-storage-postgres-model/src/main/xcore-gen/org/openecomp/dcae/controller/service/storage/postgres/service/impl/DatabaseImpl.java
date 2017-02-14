
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
package org.openecomp.dcae.controller.service.storage.postgres.service.impl;

import org.openecomp.dcae.controller.service.storage.postgres.service.Contact;
import org.openecomp.dcae.controller.service.storage.postgres.service.Database;
import org.openecomp.dcae.controller.service.storage.postgres.service.Role;
import org.openecomp.dcae.controller.service.storage.postgres.service.ServicePackage;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

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
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.impl.DatabaseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.impl.DatabaseImpl#getContacts <em>Contacts</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.impl.DatabaseImpl#getOwnerRole <em>Owner Role</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.storage.postgres.service.impl.DatabaseImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseImpl extends NamedEntityImpl implements Database {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Contact> contacts;

	/**
	 * The default value of the '{@link #getOwnerRole() <em>Owner Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerRole()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwnerRole() <em>Owner Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerRole()
	 * @generated
	 * @ordered
	 */
	protected String ownerRole = OWNER_ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.DATABASE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contact> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<Contact>(Contact.class, this, ServicePackage.DATABASE__CONTACTS);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwnerRole() {
		return ownerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerRole(String newOwnerRole) {
		String oldOwnerRole = ownerRole;
		ownerRole = newOwnerRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.DATABASE__OWNER_ROLE, oldOwnerRole, ownerRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, ServicePackage.DATABASE__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.DATABASE__CONTACTS:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ServicePackage.DATABASE__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case ServicePackage.DATABASE__DESCRIPTION:
				return getDescription();
			case ServicePackage.DATABASE__CONTACTS:
				return getContacts();
			case ServicePackage.DATABASE__OWNER_ROLE:
				return getOwnerRole();
			case ServicePackage.DATABASE__ROLES:
				return getRoles();
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
			case ServicePackage.DATABASE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ServicePackage.DATABASE__CONTACTS:
				getContacts().clear();
				getContacts().addAll((Collection<? extends Contact>)newValue);
				return;
			case ServicePackage.DATABASE__OWNER_ROLE:
				setOwnerRole((String)newValue);
				return;
			case ServicePackage.DATABASE__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
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
			case ServicePackage.DATABASE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ServicePackage.DATABASE__CONTACTS:
				getContacts().clear();
				return;
			case ServicePackage.DATABASE__OWNER_ROLE:
				setOwnerRole(OWNER_ROLE_EDEFAULT);
				return;
			case ServicePackage.DATABASE__ROLES:
				getRoles().clear();
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
			case ServicePackage.DATABASE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ServicePackage.DATABASE__CONTACTS:
				return contacts != null && !contacts.isEmpty();
			case ServicePackage.DATABASE__OWNER_ROLE:
				return OWNER_ROLE_EDEFAULT == null ? ownerRole != null : !OWNER_ROLE_EDEFAULT.equals(ownerRole);
			case ServicePackage.DATABASE__ROLES:
				return roles != null && !roles.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", ownerRole: ");
		result.append(ownerRole);
		result.append(')');
		return result.toString();
	}

} //DatabaseImpl
