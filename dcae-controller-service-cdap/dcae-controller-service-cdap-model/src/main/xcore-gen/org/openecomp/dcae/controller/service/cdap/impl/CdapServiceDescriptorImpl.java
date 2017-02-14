
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
package org.openecomp.dcae.controller.service.cdap.impl;

import org.openecomp.dcae.controller.core.service.impl.DcaeServiceDescriptorImpl;

import org.openecomp.dcae.controller.service.cdap.CdapPackage;
import org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceDescriptorImpl#getServicePackage <em>Service Package</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceDescriptorImpl#getServiceClass <em>Service Class</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceDescriptorImpl#getServiceInstanceClass <em>Service Instance Class</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceDescriptorImpl#getJarFile <em>Jar File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CdapServiceDescriptorImpl extends DcaeServiceDescriptorImpl implements CdapServiceDescriptor {
	/**
	 * The default value of the '{@link #getServicePackage() <em>Service Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServicePackage() <em>Service Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePackage()
	 * @generated
	 * @ordered
	 */
	protected String servicePackage = SERVICE_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceClass() <em>Service Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClass()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceClass() <em>Service Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClass()
	 * @generated
	 * @ordered
	 */
	protected String serviceClass = SERVICE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceInstanceClass() <em>Service Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInstanceClass()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_INSTANCE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceInstanceClass() <em>Service Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInstanceClass()
	 * @generated
	 * @ordered
	 */
	protected String serviceInstanceClass = SERVICE_INSTANCE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getJarFile() <em>Jar File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJarFile()
	 * @generated
	 * @ordered
	 */
	protected static final String JAR_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJarFile() <em>Jar File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJarFile()
	 * @generated
	 * @ordered
	 */
	protected String jarFile = JAR_FILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdapServiceDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdapPackage.Literals.CDAP_SERVICE_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServicePackage() {
		return servicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServicePackage(String newServicePackage) {
		String oldServicePackage = servicePackage;
		servicePackage = newServicePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_SERVICE_DESCRIPTOR__SERVICE_PACKAGE, oldServicePackage, servicePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceClass() {
		return serviceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceClass(String newServiceClass) {
		String oldServiceClass = serviceClass;
		serviceClass = newServiceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_SERVICE_DESCRIPTOR__SERVICE_CLASS, oldServiceClass, serviceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceInstanceClass() {
		return serviceInstanceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceInstanceClass(String newServiceInstanceClass) {
		String oldServiceInstanceClass = serviceInstanceClass;
		serviceInstanceClass = newServiceInstanceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS, oldServiceInstanceClass, serviceInstanceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJarFile() {
		return jarFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJarFile(String newJarFile) {
		String oldJarFile = jarFile;
		jarFile = newJarFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_SERVICE_DESCRIPTOR__JAR_FILE, oldJarFile, jarFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR__SERVICE_PACKAGE:
				return getServicePackage();
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR__SERVICE_CLASS:
				return getServiceClass();
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS:
				return getServiceInstanceClass();
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR__JAR_FILE:
				return getJarFile();
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
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR__SERVICE_PACKAGE:
				setServicePackage((String)newValue);
				return;
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR__SERVICE_CLASS:
				setServiceClass((String)newValue);
				return;
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS:
				setServiceInstanceClass((String)newValue);
				return;
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR__JAR_FILE:
				setJarFile((String)newValue);
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
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR__SERVICE_PACKAGE:
				setServicePackage(SERVICE_PACKAGE_EDEFAULT);
				return;
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR__SERVICE_CLASS:
				setServiceClass(SERVICE_CLASS_EDEFAULT);
				return;
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS:
				setServiceInstanceClass(SERVICE_INSTANCE_CLASS_EDEFAULT);
				return;
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR__JAR_FILE:
				setJarFile(JAR_FILE_EDEFAULT);
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
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR__SERVICE_PACKAGE:
				return SERVICE_PACKAGE_EDEFAULT == null ? servicePackage != null : !SERVICE_PACKAGE_EDEFAULT.equals(servicePackage);
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR__SERVICE_CLASS:
				return SERVICE_CLASS_EDEFAULT == null ? serviceClass != null : !SERVICE_CLASS_EDEFAULT.equals(serviceClass);
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS:
				return SERVICE_INSTANCE_CLASS_EDEFAULT == null ? serviceInstanceClass != null : !SERVICE_INSTANCE_CLASS_EDEFAULT.equals(serviceInstanceClass);
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR__JAR_FILE:
				return JAR_FILE_EDEFAULT == null ? jarFile != null : !JAR_FILE_EDEFAULT.equals(jarFile);
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
		result.append(" (servicePackage: ");
		result.append(servicePackage);
		result.append(", serviceClass: ");
		result.append(serviceClass);
		result.append(", serviceInstanceClass: ");
		result.append(serviceInstanceClass);
		result.append(", jarFile: ");
		result.append(jarFile);
		result.append(')');
		return result.toString();
	}

} //CdapServiceDescriptorImpl
