
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
package org.openecomp.dcae.controller.service.common.docker.service.impl;

import org.openecomp.dcae.controller.service.common.docker.service.ServicePackage;
import org.openecomp.dcae.controller.service.common.docker.service.TommyDockerServiceConfiguration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tommy Docker Service Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.common.docker.service.impl.TommyDockerServiceConfigurationImpl#getPostgresUserName <em>Postgres User Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.docker.service.impl.TommyDockerServiceConfigurationImpl#getPostgresPassword <em>Postgres Password</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.common.docker.service.impl.TommyDockerServiceConfigurationImpl#getPortgresJdbc <em>Portgres Jdbc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TommyDockerServiceConfigurationImpl extends CommonDockerServiceConfigurationImpl implements TommyDockerServiceConfiguration {
	/**
	 * The default value of the '{@link #getPostgresUserName() <em>Postgres User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostgresUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTGRES_USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostgresUserName() <em>Postgres User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostgresUserName()
	 * @generated
	 * @ordered
	 */
	protected String postgresUserName = POSTGRES_USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostgresPassword() <em>Postgres Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostgresPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTGRES_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostgresPassword() <em>Postgres Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostgresPassword()
	 * @generated
	 * @ordered
	 */
	protected String postgresPassword = POSTGRES_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortgresJdbc() <em>Portgres Jdbc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortgresJdbc()
	 * @generated
	 * @ordered
	 */
	protected static final String PORTGRES_JDBC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortgresJdbc() <em>Portgres Jdbc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortgresJdbc()
	 * @generated
	 * @ordered
	 */
	protected String portgresJdbc = PORTGRES_JDBC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TommyDockerServiceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.TOMMY_DOCKER_SERVICE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostgresUserName() {
		return postgresUserName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostgresUserName(String newPostgresUserName) {
		String oldPostgresUserName = postgresUserName;
		postgresUserName = newPostgresUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.TOMMY_DOCKER_SERVICE_CONFIGURATION__POSTGRES_USER_NAME, oldPostgresUserName, postgresUserName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostgresPassword() {
		return postgresPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostgresPassword(String newPostgresPassword) {
		String oldPostgresPassword = postgresPassword;
		postgresPassword = newPostgresPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.TOMMY_DOCKER_SERVICE_CONFIGURATION__POSTGRES_PASSWORD, oldPostgresPassword, postgresPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortgresJdbc() {
		return portgresJdbc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortgresJdbc(String newPortgresJdbc) {
		String oldPortgresJdbc = portgresJdbc;
		portgresJdbc = newPortgresJdbc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.TOMMY_DOCKER_SERVICE_CONFIGURATION__PORTGRES_JDBC, oldPortgresJdbc, portgresJdbc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.TOMMY_DOCKER_SERVICE_CONFIGURATION__POSTGRES_USER_NAME:
				return getPostgresUserName();
			case ServicePackage.TOMMY_DOCKER_SERVICE_CONFIGURATION__POSTGRES_PASSWORD:
				return getPostgresPassword();
			case ServicePackage.TOMMY_DOCKER_SERVICE_CONFIGURATION__PORTGRES_JDBC:
				return getPortgresJdbc();
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
			case ServicePackage.TOMMY_DOCKER_SERVICE_CONFIGURATION__POSTGRES_USER_NAME:
				setPostgresUserName((String)newValue);
				return;
			case ServicePackage.TOMMY_DOCKER_SERVICE_CONFIGURATION__POSTGRES_PASSWORD:
				setPostgresPassword((String)newValue);
				return;
			case ServicePackage.TOMMY_DOCKER_SERVICE_CONFIGURATION__PORTGRES_JDBC:
				setPortgresJdbc((String)newValue);
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
			case ServicePackage.TOMMY_DOCKER_SERVICE_CONFIGURATION__POSTGRES_USER_NAME:
				setPostgresUserName(POSTGRES_USER_NAME_EDEFAULT);
				return;
			case ServicePackage.TOMMY_DOCKER_SERVICE_CONFIGURATION__POSTGRES_PASSWORD:
				setPostgresPassword(POSTGRES_PASSWORD_EDEFAULT);
				return;
			case ServicePackage.TOMMY_DOCKER_SERVICE_CONFIGURATION__PORTGRES_JDBC:
				setPortgresJdbc(PORTGRES_JDBC_EDEFAULT);
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
			case ServicePackage.TOMMY_DOCKER_SERVICE_CONFIGURATION__POSTGRES_USER_NAME:
				return POSTGRES_USER_NAME_EDEFAULT == null ? postgresUserName != null : !POSTGRES_USER_NAME_EDEFAULT.equals(postgresUserName);
			case ServicePackage.TOMMY_DOCKER_SERVICE_CONFIGURATION__POSTGRES_PASSWORD:
				return POSTGRES_PASSWORD_EDEFAULT == null ? postgresPassword != null : !POSTGRES_PASSWORD_EDEFAULT.equals(postgresPassword);
			case ServicePackage.TOMMY_DOCKER_SERVICE_CONFIGURATION__PORTGRES_JDBC:
				return PORTGRES_JDBC_EDEFAULT == null ? portgresJdbc != null : !PORTGRES_JDBC_EDEFAULT.equals(portgresJdbc);
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
		result.append(" (postgresUserName: ");
		result.append(postgresUserName);
		result.append(", postgresPassword: ");
		result.append(postgresPassword);
		result.append(", portgresJdbc: ");
		result.append(portgresJdbc);
		result.append(')');
		return result.toString();
	}

} //TommyDockerServiceConfigurationImpl
