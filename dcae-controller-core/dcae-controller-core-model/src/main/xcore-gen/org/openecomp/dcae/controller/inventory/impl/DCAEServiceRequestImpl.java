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

import org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest;
import org.openecomp.dcae.controller.inventory.DCAEServiceRequest;
import org.openecomp.dcae.controller.inventory.InventoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DCAE Service Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceRequestImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceRequestImpl#getVnfId <em>Vnf Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceRequestImpl#getVnfType <em>Vnf Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceRequestImpl#getVnfLocation <em>Vnf Location</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceRequestImpl#getDeploymentRef <em>Deployment Ref</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceRequestImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCAEServiceRequestImpl extends MinimalEObjectImpl.Container implements DCAEServiceRequest {
	/**
	 * The default value of the '{@link #getTypeId() <em>Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeId() <em>Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeId()
	 * @generated
	 * @ordered
	 */
	protected String typeId = TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVnfId() <em>Vnf Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVnfId()
	 * @generated
	 * @ordered
	 */
	protected static final String VNF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVnfId() <em>Vnf Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVnfId()
	 * @generated
	 * @ordered
	 */
	protected String vnfId = VNF_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVnfType() <em>Vnf Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVnfType()
	 * @generated
	 * @ordered
	 */
	protected static final String VNF_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVnfType() <em>Vnf Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVnfType()
	 * @generated
	 * @ordered
	 */
	protected String vnfType = VNF_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVnfLocation() <em>Vnf Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVnfLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String VNF_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVnfLocation() <em>Vnf Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVnfLocation()
	 * @generated
	 * @ordered
	 */
	protected String vnfLocation = VNF_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeploymentRef() <em>Deployment Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentRef()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYMENT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeploymentRef() <em>Deployment Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentRef()
	 * @generated
	 * @ordered
	 */
	protected String deploymentRef = DEPLOYMENT_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<DCAEServiceComponentRequest> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DCAEServiceRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.DCAE_SERVICE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeId() {
		return typeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeId(String newTypeId) {
		String oldTypeId = typeId;
		typeId = newTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_REQUEST__TYPE_ID, oldTypeId, typeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVnfId() {
		return vnfId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVnfId(String newVnfId) {
		String oldVnfId = vnfId;
		vnfId = newVnfId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_REQUEST__VNF_ID, oldVnfId, vnfId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVnfType() {
		return vnfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVnfType(String newVnfType) {
		String oldVnfType = vnfType;
		vnfType = newVnfType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_REQUEST__VNF_TYPE, oldVnfType, vnfType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVnfLocation() {
		return vnfLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVnfLocation(String newVnfLocation) {
		String oldVnfLocation = vnfLocation;
		vnfLocation = newVnfLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_REQUEST__VNF_LOCATION, oldVnfLocation, vnfLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeploymentRef() {
		return deploymentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentRef(String newDeploymentRef) {
		String oldDeploymentRef = deploymentRef;
		deploymentRef = newDeploymentRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_REQUEST__DEPLOYMENT_REF, oldDeploymentRef, deploymentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DCAEServiceComponentRequest> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<DCAEServiceComponentRequest>(DCAEServiceComponentRequest.class, this, InventoryPackage.DCAE_SERVICE_REQUEST__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InventoryPackage.DCAE_SERVICE_REQUEST__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
			case InventoryPackage.DCAE_SERVICE_REQUEST__TYPE_ID:
				return getTypeId();
			case InventoryPackage.DCAE_SERVICE_REQUEST__VNF_ID:
				return getVnfId();
			case InventoryPackage.DCAE_SERVICE_REQUEST__VNF_TYPE:
				return getVnfType();
			case InventoryPackage.DCAE_SERVICE_REQUEST__VNF_LOCATION:
				return getVnfLocation();
			case InventoryPackage.DCAE_SERVICE_REQUEST__DEPLOYMENT_REF:
				return getDeploymentRef();
			case InventoryPackage.DCAE_SERVICE_REQUEST__COMPONENTS:
				return getComponents();
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
			case InventoryPackage.DCAE_SERVICE_REQUEST__TYPE_ID:
				setTypeId((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_REQUEST__VNF_ID:
				setVnfId((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_REQUEST__VNF_TYPE:
				setVnfType((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_REQUEST__VNF_LOCATION:
				setVnfLocation((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_REQUEST__DEPLOYMENT_REF:
				setDeploymentRef((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_REQUEST__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends DCAEServiceComponentRequest>)newValue);
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
			case InventoryPackage.DCAE_SERVICE_REQUEST__TYPE_ID:
				setTypeId(TYPE_ID_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_REQUEST__VNF_ID:
				setVnfId(VNF_ID_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_REQUEST__VNF_TYPE:
				setVnfType(VNF_TYPE_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_REQUEST__VNF_LOCATION:
				setVnfLocation(VNF_LOCATION_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_REQUEST__DEPLOYMENT_REF:
				setDeploymentRef(DEPLOYMENT_REF_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_REQUEST__COMPONENTS:
				getComponents().clear();
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
			case InventoryPackage.DCAE_SERVICE_REQUEST__TYPE_ID:
				return TYPE_ID_EDEFAULT == null ? typeId != null : !TYPE_ID_EDEFAULT.equals(typeId);
			case InventoryPackage.DCAE_SERVICE_REQUEST__VNF_ID:
				return VNF_ID_EDEFAULT == null ? vnfId != null : !VNF_ID_EDEFAULT.equals(vnfId);
			case InventoryPackage.DCAE_SERVICE_REQUEST__VNF_TYPE:
				return VNF_TYPE_EDEFAULT == null ? vnfType != null : !VNF_TYPE_EDEFAULT.equals(vnfType);
			case InventoryPackage.DCAE_SERVICE_REQUEST__VNF_LOCATION:
				return VNF_LOCATION_EDEFAULT == null ? vnfLocation != null : !VNF_LOCATION_EDEFAULT.equals(vnfLocation);
			case InventoryPackage.DCAE_SERVICE_REQUEST__DEPLOYMENT_REF:
				return DEPLOYMENT_REF_EDEFAULT == null ? deploymentRef != null : !DEPLOYMENT_REF_EDEFAULT.equals(deploymentRef);
			case InventoryPackage.DCAE_SERVICE_REQUEST__COMPONENTS:
				return components != null && !components.isEmpty();
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
		result.append(" (typeId: ");
		result.append(typeId);
		result.append(", vnfId: ");
		result.append(vnfId);
		result.append(", vnfType: ");
		result.append(vnfType);
		result.append(", vnfLocation: ");
		result.append(vnfLocation);
		result.append(", deploymentRef: ");
		result.append(deploymentRef);
		result.append(')');
		return result.toString();
	}

} //DCAEServiceRequestImpl
