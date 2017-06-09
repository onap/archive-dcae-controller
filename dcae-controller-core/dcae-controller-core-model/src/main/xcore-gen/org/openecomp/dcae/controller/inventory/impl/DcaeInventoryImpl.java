/**
 */
package org.openecomp.dcae.controller.inventory.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openecomp.dcae.controller.inventory.ApiResponseMessage;
import org.openecomp.dcae.controller.inventory.DCAEService;
import org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults;
import org.openecomp.dcae.controller.inventory.DCAEServiceRequest;
import org.openecomp.dcae.controller.inventory.DCAEServiceType;
import org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest;
import org.openecomp.dcae.controller.inventory.DcaeInventory;
import org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults;
import org.openecomp.dcae.controller.inventory.InventoryConfigurationRule;
import org.openecomp.dcae.controller.inventory.DcaeServiceResults;
import org.openecomp.dcae.controller.inventory.InventoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dcae Inventory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DcaeInventoryImpl#getServiceTypes <em>Service Types</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DcaeInventoryImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DcaeInventoryImpl#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DcaeInventoryImpl extends MinimalEObjectImpl.Container implements DcaeInventory {
	/**
	 * The cached value of the '{@link #getServiceTypes() <em>Service Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DCAEServiceType> serviceTypes;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<DCAEService> services;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<InventoryConfigurationRule> rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcaeInventoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.DCAE_INVENTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DCAEServiceType> getServiceTypes() {
		if (serviceTypes == null) {
			serviceTypes = new EObjectContainmentEList<DCAEServiceType>(DCAEServiceType.class, this, InventoryPackage.DCAE_INVENTORY__SERVICE_TYPES);
		}
		return serviceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DCAEService> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<DCAEService>(DCAEService.class, this, InventoryPackage.DCAE_INVENTORY__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InventoryConfigurationRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<InventoryConfigurationRule>(InventoryConfigurationRule.class, this, InventoryPackage.DCAE_INVENTORY__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeServiceTypeResults getDcaeServiceTypes(String typeName, Boolean onlyLatest, Boolean onlyActive, String vnfType, String serviceId, String serviceLocation, String asdcServiceId, String asdcResourceId, Integer offset) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiResponseMessage deleteDcaeServiceTypesType(String typeId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCAEServiceType getDcaeServiceTypesType(String typeId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCAEServiceType createDcaeServiceTypesTypeName(DCAEServiceTypeRequest body) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeServiceResults getDcaeServices(String typeId, String vnfId, String vnfType, String vnfLocation, String componentType, Boolean shareable, String created, Integer offset) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCAEServiceGroupByResults getDcaeServicesGroupbyPropertyName(String propertyName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteDcaeServicesService(String serviceId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCAEService getDcaeServicesService(String serviceId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCAEService createDcaeServicesService(String serviceId, DCAEServiceRequest body) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void poll() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateConfiguration() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InventoryPackage.DCAE_INVENTORY__SERVICE_TYPES:
				return ((InternalEList<?>)getServiceTypes()).basicRemove(otherEnd, msgs);
			case InventoryPackage.DCAE_INVENTORY__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case InventoryPackage.DCAE_INVENTORY__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
			case InventoryPackage.DCAE_INVENTORY__SERVICE_TYPES:
				return getServiceTypes();
			case InventoryPackage.DCAE_INVENTORY__SERVICES:
				return getServices();
			case InventoryPackage.DCAE_INVENTORY__RULES:
				return getRules();
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
			case InventoryPackage.DCAE_INVENTORY__SERVICE_TYPES:
				getServiceTypes().clear();
				getServiceTypes().addAll((Collection<? extends DCAEServiceType>)newValue);
				return;
			case InventoryPackage.DCAE_INVENTORY__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends DCAEService>)newValue);
				return;
			case InventoryPackage.DCAE_INVENTORY__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends InventoryConfigurationRule>)newValue);
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
			case InventoryPackage.DCAE_INVENTORY__SERVICE_TYPES:
				getServiceTypes().clear();
				return;
			case InventoryPackage.DCAE_INVENTORY__SERVICES:
				getServices().clear();
				return;
			case InventoryPackage.DCAE_INVENTORY__RULES:
				getRules().clear();
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
			case InventoryPackage.DCAE_INVENTORY__SERVICE_TYPES:
				return serviceTypes != null && !serviceTypes.isEmpty();
			case InventoryPackage.DCAE_INVENTORY__SERVICES:
				return services != null && !services.isEmpty();
			case InventoryPackage.DCAE_INVENTORY__RULES:
				return rules != null && !rules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InventoryPackage.DCAE_INVENTORY___GET_DCAE_SERVICE_TYPES__STRING_BOOLEAN_BOOLEAN_STRING_STRING_STRING_STRING_STRING_INTEGER:
				return getDcaeServiceTypes((String)arguments.get(0), (Boolean)arguments.get(1), (Boolean)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6), (String)arguments.get(7), (Integer)arguments.get(8));
			case InventoryPackage.DCAE_INVENTORY___DELETE_DCAE_SERVICE_TYPES_TYPE__STRING:
				return deleteDcaeServiceTypesType((String)arguments.get(0));
			case InventoryPackage.DCAE_INVENTORY___GET_DCAE_SERVICE_TYPES_TYPE__STRING:
				return getDcaeServiceTypesType((String)arguments.get(0));
			case InventoryPackage.DCAE_INVENTORY___CREATE_DCAE_SERVICE_TYPES_TYPE_NAME__DCAESERVICETYPEREQUEST:
				return createDcaeServiceTypesTypeName((DCAEServiceTypeRequest)arguments.get(0));
			case InventoryPackage.DCAE_INVENTORY___GET_DCAE_SERVICES__STRING_STRING_STRING_STRING_STRING_BOOLEAN_STRING_INTEGER:
				return getDcaeServices((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Boolean)arguments.get(5), (String)arguments.get(6), (Integer)arguments.get(7));
			case InventoryPackage.DCAE_INVENTORY___GET_DCAE_SERVICES_GROUPBY_PROPERTY_NAME__STRING:
				return getDcaeServicesGroupbyPropertyName((String)arguments.get(0));
			case InventoryPackage.DCAE_INVENTORY___DELETE_DCAE_SERVICES_SERVICE__STRING:
				deleteDcaeServicesService((String)arguments.get(0));
				return null;
			case InventoryPackage.DCAE_INVENTORY___GET_DCAE_SERVICES_SERVICE__STRING:
				return getDcaeServicesService((String)arguments.get(0));
			case InventoryPackage.DCAE_INVENTORY___CREATE_DCAE_SERVICES_SERVICE__STRING_DCAESERVICEREQUEST:
				return createDcaeServicesService((String)arguments.get(0), (DCAEServiceRequest)arguments.get(1));
			case InventoryPackage.DCAE_INVENTORY___POLL:
				poll();
				return null;
			case InventoryPackage.DCAE_INVENTORY___UPDATE_CONFIGURATION:
				updateConfiguration();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DcaeInventoryImpl
