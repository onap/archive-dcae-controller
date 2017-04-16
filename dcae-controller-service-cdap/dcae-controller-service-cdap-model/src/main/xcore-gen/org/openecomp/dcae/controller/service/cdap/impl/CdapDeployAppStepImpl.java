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
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapDeployAppStepImpl#getJarfile <em>Jarfile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CdapDeployAppStepImpl extends CdapStepImpl implements CdapDeployAppStep {
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_DEPLOY_APP_STEP__JARFILE, oldJarfile, jarfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CdapPackage.CDAP_DEPLOY_APP_STEP__JARFILE:
				return getJarfile();
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
			case CdapPackage.CDAP_DEPLOY_APP_STEP__JARFILE:
				setJarfile((String)newValue);
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
			case CdapPackage.CDAP_DEPLOY_APP_STEP__JARFILE:
				setJarfile(JARFILE_EDEFAULT);
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
			case CdapPackage.CDAP_DEPLOY_APP_STEP__JARFILE:
				return JARFILE_EDEFAULT == null ? jarfile != null : !JARFILE_EDEFAULT.equals(jarfile);
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
		result.append(" (jarfile: ");
		result.append(jarfile);
		result.append(')');
		return result.toString();
	}

} //CdapDeployAppStepImpl
