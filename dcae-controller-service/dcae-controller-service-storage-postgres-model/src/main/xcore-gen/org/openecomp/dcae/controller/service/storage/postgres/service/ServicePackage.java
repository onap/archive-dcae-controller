
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
package org.openecomp.dcae.controller.service.storage.postgres.service;

import org.openecomp.ncomp.core.CorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.service.storage.postgres.service.ServiceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-service-storage-postgres-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.service.storage.postgres'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore ecomp='http://openecomp.org'"
 * @generated
 */
public interface ServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "service";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.dcae.controller.service.storage.postgres.service";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "service";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicePackage eINSTANCE = org.openecomp.dcae.controller.service.storage.postgres.service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.impl.PostgresServiceConfigurationImpl <em>Postgres Service Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.impl.PostgresServiceConfigurationImpl
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.impl.ServicePackageImpl#getPostgresServiceConfiguration()
	 * @generated
	 */
	int POSTGRES_SERVICE_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRES_SERVICE_CONFIGURATION__STATE = org.openecomp.dcae.controller.service.common.vm.service.ServicePackage.COMMON_VM_SERVICE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Databases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRES_SERVICE_CONFIGURATION__DATABASES = org.openecomp.dcae.controller.service.common.vm.service.ServicePackage.COMMON_VM_SERVICE_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postgres Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRES_SERVICE_CONFIGURATION_FEATURE_COUNT = org.openecomp.dcae.controller.service.common.vm.service.ServicePackage.COMMON_VM_SERVICE_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Postgres Service Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTGRES_SERVICE_CONFIGURATION_OPERATION_COUNT = org.openecomp.dcae.controller.service.common.vm.service.ServicePackage.COMMON_VM_SERVICE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.impl.DatabaseImpl
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.impl.ServicePackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__DESCRIPTION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__CONTACTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__OWNER_ROLE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__ROLES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.impl.ContactImpl
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.impl.ServicePackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__FULL_NAME = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.impl.RoleImpl
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.impl.ServicePackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PASSWORD = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_COMMENTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__FULL_NAME = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.storage.postgres.service.PostgresServiceConfiguration <em>Postgres Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postgres Service Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.PostgresServiceConfiguration
	 * @generated
	 */
	EClass getPostgresServiceConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.storage.postgres.service.PostgresServiceConfiguration#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.PostgresServiceConfiguration#getState()
	 * @see #getPostgresServiceConfiguration()
	 * @generated
	 */
	EAttribute getPostgresServiceConfiguration_State();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.storage.postgres.service.PostgresServiceConfiguration#getDatabases <em>Databases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Databases</em>'.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.PostgresServiceConfiguration#getDatabases()
	 * @see #getPostgresServiceConfiguration()
	 * @generated
	 */
	EReference getPostgresServiceConfiguration_Databases();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.storage.postgres.service.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.storage.postgres.service.Database#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.Database#getDescription()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.storage.postgres.service.Database#getContacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contacts</em>'.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.Database#getContacts()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Contacts();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.storage.postgres.service.Database#getOwnerRole <em>Owner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner Role</em>'.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.Database#getOwnerRole()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_OwnerRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.storage.postgres.service.Database#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.Database#getRoles()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Roles();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.storage.postgres.service.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.storage.postgres.service.Contact#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.Contact#getFullName()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_FullName();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.storage.postgres.service.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.storage.postgres.service.Role#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.Role#getPassword()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.storage.postgres.service.Role#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.Role#getRole()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Role();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.service.storage.postgres.service.Role#getRoleComments <em>Role Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role Comments</em>'.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.Role#getRoleComments()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_RoleComments();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.storage.postgres.service.Role#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see org.openecomp.dcae.controller.service.storage.postgres.service.Role#getFullName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_FullName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceFactory getServiceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.impl.PostgresServiceConfigurationImpl <em>Postgres Service Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.storage.postgres.service.impl.PostgresServiceConfigurationImpl
		 * @see org.openecomp.dcae.controller.service.storage.postgres.service.impl.ServicePackageImpl#getPostgresServiceConfiguration()
		 * @generated
		 */
		EClass POSTGRES_SERVICE_CONFIGURATION = eINSTANCE.getPostgresServiceConfiguration();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTGRES_SERVICE_CONFIGURATION__STATE = eINSTANCE.getPostgresServiceConfiguration_State();

		/**
		 * The meta object literal for the '<em><b>Databases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTGRES_SERVICE_CONFIGURATION__DATABASES = eINSTANCE.getPostgresServiceConfiguration_Databases();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.storage.postgres.service.impl.DatabaseImpl
		 * @see org.openecomp.dcae.controller.service.storage.postgres.service.impl.ServicePackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__DESCRIPTION = eINSTANCE.getDatabase_Description();

		/**
		 * The meta object literal for the '<em><b>Contacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__CONTACTS = eINSTANCE.getDatabase_Contacts();

		/**
		 * The meta object literal for the '<em><b>Owner Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__OWNER_ROLE = eINSTANCE.getDatabase_OwnerRole();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__ROLES = eINSTANCE.getDatabase_Roles();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.storage.postgres.service.impl.ContactImpl
		 * @see org.openecomp.dcae.controller.service.storage.postgres.service.impl.ServicePackageImpl#getContact()
		 * @generated
		 */
		EClass CONTACT = eINSTANCE.getContact();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__FULL_NAME = eINSTANCE.getContact_FullName();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.storage.postgres.service.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.storage.postgres.service.impl.RoleImpl
		 * @see org.openecomp.dcae.controller.service.storage.postgres.service.impl.ServicePackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__PASSWORD = eINSTANCE.getRole_Password();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__ROLE = eINSTANCE.getRole_Role();

		/**
		 * The meta object literal for the '<em><b>Role Comments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__ROLE_COMMENTS = eINSTANCE.getRole_RoleComments();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__FULL_NAME = eINSTANCE.getRole_FullName();

	}

} //ServicePackage
