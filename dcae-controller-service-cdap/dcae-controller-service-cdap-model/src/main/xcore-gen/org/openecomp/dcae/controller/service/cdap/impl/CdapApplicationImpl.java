
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

import org.openecomp.dcae.controller.service.cdap.CdapApplication;
import org.openecomp.dcae.controller.service.cdap.CdapPackage;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapApplicationImpl#getJarFile <em>Jar File</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapApplicationImpl#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapApplicationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapApplicationImpl#getAppConfigFileContent <em>App Config File Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CdapApplicationImpl extends NamedEntityImpl implements CdapApplication {
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
	 * The default value of the '{@link #getArtifactName() <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactName()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getArtifactName() <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactName()
	 * @generated
	 * @ordered
	 */
	protected String artifactName = ARTIFACT_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;
	/**
	 * The default value of the '{@link #getAppConfigFileContent() <em>App Config File Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppConfigFileContent()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_CONFIG_FILE_CONTENT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAppConfigFileContent() <em>App Config File Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppConfigFileContent()
	 * @generated
	 * @ordered
	 */
	protected String appConfigFileContent = APP_CONFIG_FILE_CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdapApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdapPackage.Literals.CDAP_APPLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_APPLICATION__JAR_FILE, oldJarFile, jarFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArtifactName() {
		return artifactName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactName(String newArtifactName) {
		String oldArtifactName = artifactName;
		artifactName = newArtifactName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_APPLICATION__ARTIFACT_NAME, oldArtifactName, artifactName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_APPLICATION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppConfigFileContent() {
		return appConfigFileContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppConfigFileContent(String newAppConfigFileContent) {
		String oldAppConfigFileContent = appConfigFileContent;
		appConfigFileContent = newAppConfigFileContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_APPLICATION__APP_CONFIG_FILE_CONTENT, oldAppConfigFileContent, appConfigFileContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CdapPackage.CDAP_APPLICATION__JAR_FILE:
				return getJarFile();
			case CdapPackage.CDAP_APPLICATION__ARTIFACT_NAME:
				return getArtifactName();
			case CdapPackage.CDAP_APPLICATION__VERSION:
				return getVersion();
			case CdapPackage.CDAP_APPLICATION__APP_CONFIG_FILE_CONTENT:
				return getAppConfigFileContent();
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
			case CdapPackage.CDAP_APPLICATION__JAR_FILE:
				setJarFile((String)newValue);
				return;
			case CdapPackage.CDAP_APPLICATION__ARTIFACT_NAME:
				setArtifactName((String)newValue);
				return;
			case CdapPackage.CDAP_APPLICATION__VERSION:
				setVersion((String)newValue);
				return;
			case CdapPackage.CDAP_APPLICATION__APP_CONFIG_FILE_CONTENT:
				setAppConfigFileContent((String)newValue);
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
			case CdapPackage.CDAP_APPLICATION__JAR_FILE:
				setJarFile(JAR_FILE_EDEFAULT);
				return;
			case CdapPackage.CDAP_APPLICATION__ARTIFACT_NAME:
				setArtifactName(ARTIFACT_NAME_EDEFAULT);
				return;
			case CdapPackage.CDAP_APPLICATION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CdapPackage.CDAP_APPLICATION__APP_CONFIG_FILE_CONTENT:
				setAppConfigFileContent(APP_CONFIG_FILE_CONTENT_EDEFAULT);
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
			case CdapPackage.CDAP_APPLICATION__JAR_FILE:
				return JAR_FILE_EDEFAULT == null ? jarFile != null : !JAR_FILE_EDEFAULT.equals(jarFile);
			case CdapPackage.CDAP_APPLICATION__ARTIFACT_NAME:
				return ARTIFACT_NAME_EDEFAULT == null ? artifactName != null : !ARTIFACT_NAME_EDEFAULT.equals(artifactName);
			case CdapPackage.CDAP_APPLICATION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CdapPackage.CDAP_APPLICATION__APP_CONFIG_FILE_CONTENT:
				return APP_CONFIG_FILE_CONTENT_EDEFAULT == null ? appConfigFileContent != null : !APP_CONFIG_FILE_CONTENT_EDEFAULT.equals(appConfigFileContent);
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
		result.append(" (jarFile: ");
		result.append(jarFile);
		result.append(", artifactName: ");
		result.append(artifactName);
		result.append(", version: ");
		result.append(version);
		result.append(", appConfigFileContent: ");
		result.append(appConfigFileContent);
		result.append(')');
		return result.toString();
	}

} //CdapApplicationImpl
