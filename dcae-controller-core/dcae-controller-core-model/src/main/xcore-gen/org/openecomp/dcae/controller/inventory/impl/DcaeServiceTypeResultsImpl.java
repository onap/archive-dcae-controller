/**
 */
package org.openecomp.dcae.controller.inventory.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openecomp.dcae.controller.inventory.DCAEServiceType;
import org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults;
import org.openecomp.dcae.controller.inventory.InventoryPackage;
import org.openecomp.dcae.controller.inventory.Link;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inline Response200</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DcaeServiceTypeResultsImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DcaeServiceTypeResultsImpl#getTotalCount <em>Total Count</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DcaeServiceTypeResultsImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DcaeServiceTypeResultsImpl extends MinimalEObjectImpl.Container implements DcaeServiceTypeResults {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The default value of the '{@link #getTotalCount() <em>Total Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TOTAL_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalCount() <em>Total Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCount()
	 * @generated
	 * @ordered
	 */
	protected Integer totalCount = TOTAL_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<DCAEServiceType> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcaeServiceTypeResultsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.DCAE_SERVICE_TYPE_RESULTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, InventoryPackage.DCAE_SERVICE_TYPE_RESULTS__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTotalCount() {
		return totalCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCount(Integer newTotalCount) {
		Integer oldTotalCount = totalCount;
		totalCount = newTotalCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_TYPE_RESULTS__TOTAL_COUNT, oldTotalCount, totalCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DCAEServiceType> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<DCAEServiceType>(DCAEServiceType.class, this, InventoryPackage.DCAE_SERVICE_TYPE_RESULTS__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InventoryPackage.DCAE_SERVICE_TYPE_RESULTS__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case InventoryPackage.DCAE_SERVICE_TYPE_RESULTS__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case InventoryPackage.DCAE_SERVICE_TYPE_RESULTS__LINKS:
				return getLinks();
			case InventoryPackage.DCAE_SERVICE_TYPE_RESULTS__TOTAL_COUNT:
				return getTotalCount();
			case InventoryPackage.DCAE_SERVICE_TYPE_RESULTS__ITEMS:
				return getItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InventoryPackage.DCAE_SERVICE_TYPE_RESULTS__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE_RESULTS__TOTAL_COUNT:
				setTotalCount((Integer)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE_RESULTS__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends DCAEServiceType>)newValue);
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
			case InventoryPackage.DCAE_SERVICE_TYPE_RESULTS__LINKS:
				getLinks().clear();
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE_RESULTS__TOTAL_COUNT:
				setTotalCount(TOTAL_COUNT_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE_RESULTS__ITEMS:
				getItems().clear();
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
			case InventoryPackage.DCAE_SERVICE_TYPE_RESULTS__LINKS:
				return links != null && !links.isEmpty();
			case InventoryPackage.DCAE_SERVICE_TYPE_RESULTS__TOTAL_COUNT:
				return TOTAL_COUNT_EDEFAULT == null ? totalCount != null : !TOTAL_COUNT_EDEFAULT.equals(totalCount);
			case InventoryPackage.DCAE_SERVICE_TYPE_RESULTS__ITEMS:
				return items != null && !items.isEmpty();
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
		result.append(" (totalCount: ");
		result.append(totalCount);
		result.append(')');
		return result.toString();
	}

} //InlineResponse200Impl
