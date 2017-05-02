/**
 */
package org.openecomp.dcae.controller.inventory.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest;
import org.openecomp.dcae.controller.inventory.InventoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DCAE Service Component Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentRequestImpl#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentRequestImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentRequestImpl#getComponentSource <em>Component Source</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentRequestImpl#getShareable <em>Shareable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCAEServiceComponentRequestImpl extends MinimalEObjectImpl.Container implements DCAEServiceComponentRequest {
	/**
	 * The default value of the '{@link #getComponentId() <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentId() <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentId()
	 * @generated
	 * @ordered
	 */
	protected String componentId = COMPONENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected String componentType = COMPONENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentSource() <em>Component Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentSource()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentSource() <em>Component Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentSource()
	 * @generated
	 * @ordered
	 */
	protected String componentSource = COMPONENT_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShareable() <em>Shareable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareable()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SHAREABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShareable() <em>Shareable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareable()
	 * @generated
	 * @ordered
	 */
	protected Integer shareable = SHAREABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DCAEServiceComponentRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.DCAE_SERVICE_COMPONENT_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentId() {
		return componentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentId(String newComponentId) {
		String oldComponentId = componentId;
		componentId = newComponentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_ID, oldComponentId, componentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentType() {
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(String newComponentType) {
		String oldComponentType = componentType;
		componentType = newComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_TYPE, oldComponentType, componentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentSource() {
		return componentSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentSource(String newComponentSource) {
		String oldComponentSource = componentSource;
		componentSource = newComponentSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_SOURCE, oldComponentSource, componentSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getShareable() {
		return shareable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShareable(Integer newShareable) {
		Integer oldShareable = shareable;
		shareable = newShareable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__SHAREABLE, oldShareable, shareable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_ID:
				return getComponentId();
			case InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_TYPE:
				return getComponentType();
			case InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_SOURCE:
				return getComponentSource();
			case InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__SHAREABLE:
				return getShareable();
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
			case InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_ID:
				setComponentId((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_TYPE:
				setComponentType((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_SOURCE:
				setComponentSource((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__SHAREABLE:
				setShareable((Integer)newValue);
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
			case InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_ID:
				setComponentId(COMPONENT_ID_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_TYPE:
				setComponentType(COMPONENT_TYPE_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_SOURCE:
				setComponentSource(COMPONENT_SOURCE_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__SHAREABLE:
				setShareable(SHAREABLE_EDEFAULT);
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
			case InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_ID:
				return COMPONENT_ID_EDEFAULT == null ? componentId != null : !COMPONENT_ID_EDEFAULT.equals(componentId);
			case InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_TYPE:
				return COMPONENT_TYPE_EDEFAULT == null ? componentType != null : !COMPONENT_TYPE_EDEFAULT.equals(componentType);
			case InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_SOURCE:
				return COMPONENT_SOURCE_EDEFAULT == null ? componentSource != null : !COMPONENT_SOURCE_EDEFAULT.equals(componentSource);
			case InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST__SHAREABLE:
				return SHAREABLE_EDEFAULT == null ? shareable != null : !SHAREABLE_EDEFAULT.equals(shareable);
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
		result.append(" (componentId: ");
		result.append(componentId);
		result.append(", componentType: ");
		result.append(componentType);
		result.append(", componentSource: ");
		result.append(componentSource);
		result.append(", shareable: ");
		result.append(shareable);
		result.append(')');
		return result.toString();
	}

} //DCAEServiceComponentRequestImpl
