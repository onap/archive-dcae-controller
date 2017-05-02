/**
 */
package org.openecomp.dcae.controller.service.cdap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openecomp.dcae.controller.service.cdap.CdapDeployAppStep;
import org.openecomp.dcae.controller.service.cdap.CdapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deploy App Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapDeployAppStepImpl#getJarFile <em>Jar File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CdapDeployAppStepImpl extends CdapStepImpl implements CdapDeployAppStep {
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
	protected CdapDeployAppStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdapPackage.Literals.CDAP_DEPLOY_APP_STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_DEPLOY_APP_STEP__JAR_FILE, oldJarFile, jarFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CdapPackage.CDAP_DEPLOY_APP_STEP__JAR_FILE:
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
			case CdapPackage.CDAP_DEPLOY_APP_STEP__JAR_FILE:
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
			case CdapPackage.CDAP_DEPLOY_APP_STEP__JAR_FILE:
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
			case CdapPackage.CDAP_DEPLOY_APP_STEP__JAR_FILE:
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
		result.append(" (jarFile: ");
		result.append(jarFile);
		result.append(')');
		return result.toString();
	}

} //CdapDeployAppStepImpl
