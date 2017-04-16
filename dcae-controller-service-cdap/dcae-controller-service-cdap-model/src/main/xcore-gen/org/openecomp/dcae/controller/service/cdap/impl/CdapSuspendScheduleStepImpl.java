/**
 */
package org.openecomp.dcae.controller.service.cdap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openecomp.dcae.controller.service.cdap.CdapPackage;
import org.openecomp.dcae.controller.service.cdap.CdapSuspendScheduleStep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Suspend Schedule Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapSuspendScheduleStepImpl#getAppId <em>App Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapSuspendScheduleStepImpl#getScheduleId <em>Schedule Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CdapSuspendScheduleStepImpl extends CdapStepImpl implements CdapSuspendScheduleStep {
	/**
	 * The default value of the '{@link #getAppId() <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppId()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppId() <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppId()
	 * @generated
	 * @ordered
	 */
	protected String appId = APP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduleId() <em>Schedule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleId()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduleId() <em>Schedule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleId()
	 * @generated
	 * @ordered
	 */
	protected String scheduleId = SCHEDULE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdapSuspendScheduleStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdapPackage.Literals.CDAP_SUSPEND_SCHEDULE_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppId(String newAppId) {
		String oldAppId = appId;
		appId = newAppId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_SUSPEND_SCHEDULE_STEP__APP_ID, oldAppId, appId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheduleId() {
		return scheduleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleId(String newScheduleId) {
		String oldScheduleId = scheduleId;
		scheduleId = newScheduleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_SUSPEND_SCHEDULE_STEP__SCHEDULE_ID, oldScheduleId, scheduleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CdapPackage.CDAP_SUSPEND_SCHEDULE_STEP__APP_ID:
				return getAppId();
			case CdapPackage.CDAP_SUSPEND_SCHEDULE_STEP__SCHEDULE_ID:
				return getScheduleId();
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
			case CdapPackage.CDAP_SUSPEND_SCHEDULE_STEP__APP_ID:
				setAppId((String)newValue);
				return;
			case CdapPackage.CDAP_SUSPEND_SCHEDULE_STEP__SCHEDULE_ID:
				setScheduleId((String)newValue);
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
			case CdapPackage.CDAP_SUSPEND_SCHEDULE_STEP__APP_ID:
				setAppId(APP_ID_EDEFAULT);
				return;
			case CdapPackage.CDAP_SUSPEND_SCHEDULE_STEP__SCHEDULE_ID:
				setScheduleId(SCHEDULE_ID_EDEFAULT);
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
			case CdapPackage.CDAP_SUSPEND_SCHEDULE_STEP__APP_ID:
				return APP_ID_EDEFAULT == null ? appId != null : !APP_ID_EDEFAULT.equals(appId);
			case CdapPackage.CDAP_SUSPEND_SCHEDULE_STEP__SCHEDULE_ID:
				return SCHEDULE_ID_EDEFAULT == null ? scheduleId != null : !SCHEDULE_ID_EDEFAULT.equals(scheduleId);
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
		result.append(" (appId: ");
		result.append(appId);
		result.append(", scheduleId: ");
		result.append(scheduleId);
		result.append(')');
		return result.toString();
	}

} //CdapSuspendScheduleStepImpl
