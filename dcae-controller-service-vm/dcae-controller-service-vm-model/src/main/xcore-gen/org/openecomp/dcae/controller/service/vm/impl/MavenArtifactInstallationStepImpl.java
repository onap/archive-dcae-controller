
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

import org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep;
import org.openecomp.dcae.controller.service.vm.VmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maven Artifact Installation Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.MavenArtifactInstallationStepImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.MavenArtifactInstallationStepImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.MavenArtifactInstallationStepImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.MavenArtifactInstallationStepImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.vm.impl.MavenArtifactInstallationStepImpl#getAssemblyId <em>Assembly Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MavenArtifactInstallationStepImpl extends InstallationStepImpl implements MavenArtifactInstallationStep {
	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactId()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactId()
	 * @generated
	 * @ordered
	 */
	protected String artifactId = ARTIFACT_ID_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssemblyId() <em>Assembly Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyId()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSEMBLY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssemblyId() <em>Assembly Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyId()
	 * @generated
	 * @ordered
	 */
	protected String assemblyId = ASSEMBLY_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MavenArtifactInstallationStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPackage.Literals.MAVEN_ARTIFACT_INSTALLATION_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArtifactId() {
		return artifactId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactId(String newArtifactId) {
		String oldArtifactId = artifactId;
		artifactId = newArtifactId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__ARTIFACT_ID, oldArtifactId, artifactId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssemblyId() {
		return assemblyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyId(String newAssemblyId) {
		String oldAssemblyId = assemblyId;
		assemblyId = newAssemblyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__ASSEMBLY_ID, oldAssemblyId, assemblyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__GROUP_ID:
				return getGroupId();
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__ARTIFACT_ID:
				return getArtifactId();
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__VERSION:
				return getVersion();
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__TYPE:
				return getType();
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__ASSEMBLY_ID:
				return getAssemblyId();
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
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__ARTIFACT_ID:
				setArtifactId((String)newValue);
				return;
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__VERSION:
				setVersion((String)newValue);
				return;
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__TYPE:
				setType((String)newValue);
				return;
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__ASSEMBLY_ID:
				setAssemblyId((String)newValue);
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
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__ARTIFACT_ID:
				setArtifactId(ARTIFACT_ID_EDEFAULT);
				return;
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__ASSEMBLY_ID:
				setAssemblyId(ASSEMBLY_ID_EDEFAULT);
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
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__ARTIFACT_ID:
				return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case VmPackage.MAVEN_ARTIFACT_INSTALLATION_STEP__ASSEMBLY_ID:
				return ASSEMBLY_ID_EDEFAULT == null ? assemblyId != null : !ASSEMBLY_ID_EDEFAULT.equals(assemblyId);
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
		result.append(" (groupId: ");
		result.append(groupId);
		result.append(", artifactId: ");
		result.append(artifactId);
		result.append(", version: ");
		result.append(version);
		result.append(", type: ");
		result.append(type);
		result.append(", assemblyId: ");
		result.append(assemblyId);
		result.append(')');
		return result.toString();
	}

} //MavenArtifactInstallationStepImpl
