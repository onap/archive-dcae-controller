/**
 */
package org.openecomp.dcae.controller.service.cdap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openecomp.dcae.controller.service.cdap.CdapCreateAppWithConfigStep;
import org.openecomp.dcae.controller.service.cdap.CdapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create App With Config Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapCreateAppWithConfigStepImpl#getAppConfig <em>App Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CdapCreateAppWithConfigStepImpl extends CdapCreateAppStepImpl implements CdapCreateAppWithConfigStep {
	/**
	 * The default value of the '{@link #getAppConfig() <em>App Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppConfig()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_CONFIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppConfig() <em>App Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppConfig()
	 * @generated
	 * @ordered
	 */
	protected String appConfig = APP_CONFIG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdapCreateAppWithConfigStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdapPackage.Literals.CDAP_CREATE_APP_WITH_CONFIG_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppConfig() {
		return appConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppConfig(String newAppConfig) {
		String oldAppConfig = appConfig;
		appConfig = newAppConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_CREATE_APP_WITH_CONFIG_STEP__APP_CONFIG, oldAppConfig, appConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CdapPackage.CDAP_CREATE_APP_WITH_CONFIG_STEP__APP_CONFIG:
				return getAppConfig();
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
			case CdapPackage.CDAP_CREATE_APP_WITH_CONFIG_STEP__APP_CONFIG:
				setAppConfig((String)newValue);
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
			case CdapPackage.CDAP_CREATE_APP_WITH_CONFIG_STEP__APP_CONFIG:
				setAppConfig(APP_CONFIG_EDEFAULT);
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
			case CdapPackage.CDAP_CREATE_APP_WITH_CONFIG_STEP__APP_CONFIG:
				return APP_CONFIG_EDEFAULT == null ? appConfig != null : !APP_CONFIG_EDEFAULT.equals(appConfig);
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
		result.append(" (appConfig: ");
		result.append(appConfig);
		result.append(')');
		return result.toString();
	}

} //CdapCreateAppWithConfigStepImpl
