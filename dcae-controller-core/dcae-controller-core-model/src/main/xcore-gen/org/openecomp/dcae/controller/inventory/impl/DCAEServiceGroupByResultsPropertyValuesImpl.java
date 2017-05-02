/**
 */
package org.openecomp.dcae.controller.inventory.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues;
import org.openecomp.dcae.controller.inventory.InventoryPackage;
import org.openecomp.dcae.controller.inventory.Link;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DCAE Service Group By Results Property Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceGroupByResultsPropertyValuesImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceGroupByResultsPropertyValuesImpl#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceGroupByResultsPropertyValuesImpl#getDcaeServiceQueryLink <em>Dcae Service Query Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCAEServiceGroupByResultsPropertyValuesImpl extends MinimalEObjectImpl.Container implements DCAEServiceGroupByResultsPropertyValues {
	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected Integer count = COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyValue() <em>Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyValue()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyValue() <em>Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyValue()
	 * @generated
	 * @ordered
	 */
	protected String propertyValue = PROPERTY_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDcaeServiceQueryLink() <em>Dcae Service Query Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcaeServiceQueryLink()
	 * @generated
	 * @ordered
	 */
	protected Link dcaeServiceQueryLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DCAEServiceGroupByResultsPropertyValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(Integer newCount) {
		Integer oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyValue() {
		return propertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyValue(String newPropertyValue) {
		String oldPropertyValue = propertyValue;
		propertyValue = newPropertyValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__PROPERTY_VALUE, oldPropertyValue, propertyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getDcaeServiceQueryLink() {
		return dcaeServiceQueryLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcaeServiceQueryLink(Link newDcaeServiceQueryLink, NotificationChain msgs) {
		Link oldDcaeServiceQueryLink = dcaeServiceQueryLink;
		dcaeServiceQueryLink = newDcaeServiceQueryLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__DCAE_SERVICE_QUERY_LINK, oldDcaeServiceQueryLink, newDcaeServiceQueryLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDcaeServiceQueryLink(Link newDcaeServiceQueryLink) {
		if (newDcaeServiceQueryLink != dcaeServiceQueryLink) {
			NotificationChain msgs = null;
			if (dcaeServiceQueryLink != null)
				msgs = ((InternalEObject)dcaeServiceQueryLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__DCAE_SERVICE_QUERY_LINK, null, msgs);
			if (newDcaeServiceQueryLink != null)
				msgs = ((InternalEObject)newDcaeServiceQueryLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__DCAE_SERVICE_QUERY_LINK, null, msgs);
			msgs = basicSetDcaeServiceQueryLink(newDcaeServiceQueryLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__DCAE_SERVICE_QUERY_LINK, newDcaeServiceQueryLink, newDcaeServiceQueryLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__DCAE_SERVICE_QUERY_LINK:
				return basicSetDcaeServiceQueryLink(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__COUNT:
				return getCount();
			case InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__PROPERTY_VALUE:
				return getPropertyValue();
			case InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__DCAE_SERVICE_QUERY_LINK:
				return getDcaeServiceQueryLink();
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
			case InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__COUNT:
				setCount((Integer)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__PROPERTY_VALUE:
				setPropertyValue((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__DCAE_SERVICE_QUERY_LINK:
				setDcaeServiceQueryLink((Link)newValue);
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
			case InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__PROPERTY_VALUE:
				setPropertyValue(PROPERTY_VALUE_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__DCAE_SERVICE_QUERY_LINK:
				setDcaeServiceQueryLink((Link)null);
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
			case InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__COUNT:
				return COUNT_EDEFAULT == null ? count != null : !COUNT_EDEFAULT.equals(count);
			case InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__PROPERTY_VALUE:
				return PROPERTY_VALUE_EDEFAULT == null ? propertyValue != null : !PROPERTY_VALUE_EDEFAULT.equals(propertyValue);
			case InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__DCAE_SERVICE_QUERY_LINK:
				return dcaeServiceQueryLink != null;
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
		result.append(" (count: ");
		result.append(count);
		result.append(", propertyValue: ");
		result.append(propertyValue);
		result.append(')');
		return result.toString();
	}

} //DCAEServiceGroupByResultsPropertyValuesImpl
