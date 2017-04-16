/**
 */
package org.openecomp.dcae.controller.service.cdap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openecomp.dcae.controller.service.cdap.CdapPackage;
import org.openecomp.dcae.controller.service.cdap.CdapStartFlowStep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Flow Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStartFlowStepImpl#getAppId <em>App Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStartFlowStepImpl#getFlowId <em>Flow Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStartFlowStepImpl#getExtraArgs <em>Extra Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CdapStartFlowStepImpl extends CdapStepImpl implements CdapStartFlowStep {
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
	 * The default value of the '{@link #getFlowId() <em>Flow Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowId()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOW_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlowId() <em>Flow Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowId()
	 * @generated
	 * @ordered
	 */
	protected String flowId = FLOW_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtraArgs() <em>Extra Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRA_ARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtraArgs() <em>Extra Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraArgs()
	 * @generated
	 * @ordered
	 */
	protected String extraArgs = EXTRA_ARGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdapStartFlowStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdapPackage.Literals.CDAP_START_FLOW_STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_START_FLOW_STEP__APP_ID, oldAppId, appId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlowId() {
		return flowId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowId(String newFlowId) {
		String oldFlowId = flowId;
		flowId = newFlowId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_START_FLOW_STEP__FLOW_ID, oldFlowId, flowId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtraArgs() {
		return extraArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraArgs(String newExtraArgs) {
		String oldExtraArgs = extraArgs;
		extraArgs = newExtraArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_START_FLOW_STEP__EXTRA_ARGS, oldExtraArgs, extraArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CdapPackage.CDAP_START_FLOW_STEP__APP_ID:
				return getAppId();
			case CdapPackage.CDAP_START_FLOW_STEP__FLOW_ID:
				return getFlowId();
			case CdapPackage.CDAP_START_FLOW_STEP__EXTRA_ARGS:
				return getExtraArgs();
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
			case CdapPackage.CDAP_START_FLOW_STEP__APP_ID:
				setAppId((String)newValue);
				return;
			case CdapPackage.CDAP_START_FLOW_STEP__FLOW_ID:
				setFlowId((String)newValue);
				return;
			case CdapPackage.CDAP_START_FLOW_STEP__EXTRA_ARGS:
				setExtraArgs((String)newValue);
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
			case CdapPackage.CDAP_START_FLOW_STEP__APP_ID:
				setAppId(APP_ID_EDEFAULT);
				return;
			case CdapPackage.CDAP_START_FLOW_STEP__FLOW_ID:
				setFlowId(FLOW_ID_EDEFAULT);
				return;
			case CdapPackage.CDAP_START_FLOW_STEP__EXTRA_ARGS:
				setExtraArgs(EXTRA_ARGS_EDEFAULT);
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
			case CdapPackage.CDAP_START_FLOW_STEP__APP_ID:
				return APP_ID_EDEFAULT == null ? appId != null : !APP_ID_EDEFAULT.equals(appId);
			case CdapPackage.CDAP_START_FLOW_STEP__FLOW_ID:
				return FLOW_ID_EDEFAULT == null ? flowId != null : !FLOW_ID_EDEFAULT.equals(flowId);
			case CdapPackage.CDAP_START_FLOW_STEP__EXTRA_ARGS:
				return EXTRA_ARGS_EDEFAULT == null ? extraArgs != null : !EXTRA_ARGS_EDEFAULT.equals(extraArgs);
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
		result.append(", flowId: ");
		result.append(flowId);
		result.append(", extraArgs: ");
		result.append(extraArgs);
		result.append(')');
		return result.toString();
	}

} //CdapStartFlowStepImpl
