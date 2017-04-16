/**
 */
package org.openecomp.dcae.controller.service.cdap.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep;
import org.openecomp.dcae.controller.service.cdap.CdapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Artifact Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapLoadArtifactStepImpl#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapLoadArtifactStepImpl#getJarfile <em>Jarfile</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapLoadArtifactStepImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CdapLoadArtifactStepImpl extends CdapStepImpl implements CdapLoadArtifactStep {
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
	 * The default value of the '{@link #getJarfile() <em>Jarfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJarfile()
	 * @generated
	 * @ordered
	 */
	protected static final String JARFILE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getJarfile() <em>Jarfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJarfile()
	 * @generated
	 * @ordered
	 */
	protected String jarfile = JARFILE_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdapLoadArtifactStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdapPackage.Literals.CDAP_LOAD_ARTIFACT_STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_LOAD_ARTIFACT_STEP__ARTIFACT_NAME, oldArtifactName, artifactName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJarfile() {
		return jarfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJarfile(String newJarfile) {
		String oldJarfile = jarfile;
		jarfile = newJarfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_LOAD_ARTIFACT_STEP__JARFILE, oldJarfile, jarfile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_LOAD_ARTIFACT_STEP__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CdapPackage.CDAP_LOAD_ARTIFACT_STEP__ARTIFACT_NAME:
				return getArtifactName();
			case CdapPackage.CDAP_LOAD_ARTIFACT_STEP__JARFILE:
				return getJarfile();
			case CdapPackage.CDAP_LOAD_ARTIFACT_STEP__VERSION:
				return getVersion();
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
			case CdapPackage.CDAP_LOAD_ARTIFACT_STEP__ARTIFACT_NAME:
				setArtifactName((String)newValue);
				return;
			case CdapPackage.CDAP_LOAD_ARTIFACT_STEP__JARFILE:
				setJarfile((String)newValue);
				return;
			case CdapPackage.CDAP_LOAD_ARTIFACT_STEP__VERSION:
				setVersion((String)newValue);
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
			case CdapPackage.CDAP_LOAD_ARTIFACT_STEP__ARTIFACT_NAME:
				setArtifactName(ARTIFACT_NAME_EDEFAULT);
				return;
			case CdapPackage.CDAP_LOAD_ARTIFACT_STEP__JARFILE:
				setJarfile(JARFILE_EDEFAULT);
				return;
			case CdapPackage.CDAP_LOAD_ARTIFACT_STEP__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case CdapPackage.CDAP_LOAD_ARTIFACT_STEP__ARTIFACT_NAME:
				return ARTIFACT_NAME_EDEFAULT == null ? artifactName != null : !ARTIFACT_NAME_EDEFAULT.equals(artifactName);
			case CdapPackage.CDAP_LOAD_ARTIFACT_STEP__JARFILE:
				return JARFILE_EDEFAULT == null ? jarfile != null : !JARFILE_EDEFAULT.equals(jarfile);
			case CdapPackage.CDAP_LOAD_ARTIFACT_STEP__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (artifactName: ");
		result.append(artifactName);
		result.append(", jarfile: ");
		result.append(jarfile);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //CdapLoadArtifactStepImpl
