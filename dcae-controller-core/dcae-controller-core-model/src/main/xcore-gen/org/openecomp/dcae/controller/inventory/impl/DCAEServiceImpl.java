/**
 */
package org.openecomp.dcae.controller.inventory.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openecomp.dcae.controller.inventory.DCAEService;
import org.openecomp.dcae.controller.inventory.DCAEServiceComponent;
import org.openecomp.dcae.controller.inventory.InventoryPackage;
import org.openecomp.dcae.controller.inventory.Link;
import org.openecomp.ncomp.core.impl.NamedEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DCAE Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceImpl#getServiceId <em>Service Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceImpl#getSelfLink <em>Self Link</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceImpl#getCreated1 <em>Created1</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceImpl#getTypeLink <em>Type Link</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceImpl#getVnfId <em>Vnf Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceImpl#getVnfLink <em>Vnf Link</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceImpl#getVnfType <em>Vnf Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceImpl#getVnfLocation <em>Vnf Location</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceImpl#getDeploymentRef <em>Deployment Ref</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCAEServiceImpl extends NamedEntityImpl implements DCAEService {
	/**
	 * The default value of the '{@link #getServiceId() <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceId() <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceId()
	 * @generated
	 * @ordered
	 */
	protected String serviceId = SERVICE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelfLink() <em>Self Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfLink()
	 * @generated
	 * @ordered
	 */
	protected Link selfLink;

	/**
	 * The default value of the '{@link #getCreated1() <em>Created1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated1()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated1() <em>Created1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated1()
	 * @generated
	 * @ordered
	 */
	protected Date created1 = CREATED1_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected Date modified = MODIFIED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeLink() <em>Type Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLink()
	 * @generated
	 * @ordered
	 */
	protected Link typeLink;

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
	 * The cached value of the '{@link #getVnfLink() <em>Vnf Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVnfLink()
	 * @generated
	 * @ordered
	 */
	protected Link vnfLink;

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
	protected EList<DCAEServiceComponent> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DCAEServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.DCAE_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceId() {
		return serviceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceId(String newServiceId) {
		String oldServiceId = serviceId;
		serviceId = newServiceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE__SERVICE_ID, oldServiceId, serviceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getSelfLink() {
		return selfLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelfLink(Link newSelfLink, NotificationChain msgs) {
		Link oldSelfLink = selfLink;
		selfLink = newSelfLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE__SELF_LINK, oldSelfLink, newSelfLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfLink(Link newSelfLink) {
		if (newSelfLink != selfLink) {
			NotificationChain msgs = null;
			if (selfLink != null)
				msgs = ((InternalEObject)selfLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.DCAE_SERVICE__SELF_LINK, null, msgs);
			if (newSelfLink != null)
				msgs = ((InternalEObject)newSelfLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.DCAE_SERVICE__SELF_LINK, null, msgs);
			msgs = basicSetSelfLink(newSelfLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE__SELF_LINK, newSelfLink, newSelfLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreated1() {
		return created1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated1(Date newCreated1) {
		Date oldCreated1 = created1;
		created1 = newCreated1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE__CREATED1, oldCreated1, created1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(Date newModified) {
		Date oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getTypeLink() {
		return typeLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeLink(Link newTypeLink, NotificationChain msgs) {
		Link oldTypeLink = typeLink;
		typeLink = newTypeLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE__TYPE_LINK, oldTypeLink, newTypeLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeLink(Link newTypeLink) {
		if (newTypeLink != typeLink) {
			NotificationChain msgs = null;
			if (typeLink != null)
				msgs = ((InternalEObject)typeLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.DCAE_SERVICE__TYPE_LINK, null, msgs);
			if (newTypeLink != null)
				msgs = ((InternalEObject)newTypeLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.DCAE_SERVICE__TYPE_LINK, null, msgs);
			msgs = basicSetTypeLink(newTypeLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE__TYPE_LINK, newTypeLink, newTypeLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE__VNF_ID, oldVnfId, vnfId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getVnfLink() {
		return vnfLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVnfLink(Link newVnfLink, NotificationChain msgs) {
		Link oldVnfLink = vnfLink;
		vnfLink = newVnfLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE__VNF_LINK, oldVnfLink, newVnfLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVnfLink(Link newVnfLink) {
		if (newVnfLink != vnfLink) {
			NotificationChain msgs = null;
			if (vnfLink != null)
				msgs = ((InternalEObject)vnfLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.DCAE_SERVICE__VNF_LINK, null, msgs);
			if (newVnfLink != null)
				msgs = ((InternalEObject)newVnfLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.DCAE_SERVICE__VNF_LINK, null, msgs);
			msgs = basicSetVnfLink(newVnfLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE__VNF_LINK, newVnfLink, newVnfLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE__VNF_TYPE, oldVnfType, vnfType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE__VNF_LOCATION, oldVnfLocation, vnfLocation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE__DEPLOYMENT_REF, oldDeploymentRef, deploymentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DCAEServiceComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<DCAEServiceComponent>(DCAEServiceComponent.class, this, InventoryPackage.DCAE_SERVICE__COMPONENTS);
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
			case InventoryPackage.DCAE_SERVICE__SELF_LINK:
				return basicSetSelfLink(null, msgs);
			case InventoryPackage.DCAE_SERVICE__TYPE_LINK:
				return basicSetTypeLink(null, msgs);
			case InventoryPackage.DCAE_SERVICE__VNF_LINK:
				return basicSetVnfLink(null, msgs);
			case InventoryPackage.DCAE_SERVICE__COMPONENTS:
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
			case InventoryPackage.DCAE_SERVICE__SERVICE_ID:
				return getServiceId();
			case InventoryPackage.DCAE_SERVICE__SELF_LINK:
				return getSelfLink();
			case InventoryPackage.DCAE_SERVICE__CREATED1:
				return getCreated1();
			case InventoryPackage.DCAE_SERVICE__MODIFIED:
				return getModified();
			case InventoryPackage.DCAE_SERVICE__TYPE_LINK:
				return getTypeLink();
			case InventoryPackage.DCAE_SERVICE__VNF_ID:
				return getVnfId();
			case InventoryPackage.DCAE_SERVICE__VNF_LINK:
				return getVnfLink();
			case InventoryPackage.DCAE_SERVICE__VNF_TYPE:
				return getVnfType();
			case InventoryPackage.DCAE_SERVICE__VNF_LOCATION:
				return getVnfLocation();
			case InventoryPackage.DCAE_SERVICE__DEPLOYMENT_REF:
				return getDeploymentRef();
			case InventoryPackage.DCAE_SERVICE__COMPONENTS:
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
			case InventoryPackage.DCAE_SERVICE__SERVICE_ID:
				setServiceId((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE__SELF_LINK:
				setSelfLink((Link)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE__CREATED1:
				setCreated1((Date)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE__MODIFIED:
				setModified((Date)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE__TYPE_LINK:
				setTypeLink((Link)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE__VNF_ID:
				setVnfId((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE__VNF_LINK:
				setVnfLink((Link)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE__VNF_TYPE:
				setVnfType((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE__VNF_LOCATION:
				setVnfLocation((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE__DEPLOYMENT_REF:
				setDeploymentRef((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends DCAEServiceComponent>)newValue);
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
			case InventoryPackage.DCAE_SERVICE__SERVICE_ID:
				setServiceId(SERVICE_ID_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE__SELF_LINK:
				setSelfLink((Link)null);
				return;
			case InventoryPackage.DCAE_SERVICE__CREATED1:
				setCreated1(CREATED1_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE__TYPE_LINK:
				setTypeLink((Link)null);
				return;
			case InventoryPackage.DCAE_SERVICE__VNF_ID:
				setVnfId(VNF_ID_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE__VNF_LINK:
				setVnfLink((Link)null);
				return;
			case InventoryPackage.DCAE_SERVICE__VNF_TYPE:
				setVnfType(VNF_TYPE_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE__VNF_LOCATION:
				setVnfLocation(VNF_LOCATION_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE__DEPLOYMENT_REF:
				setDeploymentRef(DEPLOYMENT_REF_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE__COMPONENTS:
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
			case InventoryPackage.DCAE_SERVICE__SERVICE_ID:
				return SERVICE_ID_EDEFAULT == null ? serviceId != null : !SERVICE_ID_EDEFAULT.equals(serviceId);
			case InventoryPackage.DCAE_SERVICE__SELF_LINK:
				return selfLink != null;
			case InventoryPackage.DCAE_SERVICE__CREATED1:
				return CREATED1_EDEFAULT == null ? created1 != null : !CREATED1_EDEFAULT.equals(created1);
			case InventoryPackage.DCAE_SERVICE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case InventoryPackage.DCAE_SERVICE__TYPE_LINK:
				return typeLink != null;
			case InventoryPackage.DCAE_SERVICE__VNF_ID:
				return VNF_ID_EDEFAULT == null ? vnfId != null : !VNF_ID_EDEFAULT.equals(vnfId);
			case InventoryPackage.DCAE_SERVICE__VNF_LINK:
				return vnfLink != null;
			case InventoryPackage.DCAE_SERVICE__VNF_TYPE:
				return VNF_TYPE_EDEFAULT == null ? vnfType != null : !VNF_TYPE_EDEFAULT.equals(vnfType);
			case InventoryPackage.DCAE_SERVICE__VNF_LOCATION:
				return VNF_LOCATION_EDEFAULT == null ? vnfLocation != null : !VNF_LOCATION_EDEFAULT.equals(vnfLocation);
			case InventoryPackage.DCAE_SERVICE__DEPLOYMENT_REF:
				return DEPLOYMENT_REF_EDEFAULT == null ? deploymentRef != null : !DEPLOYMENT_REF_EDEFAULT.equals(deploymentRef);
			case InventoryPackage.DCAE_SERVICE__COMPONENTS:
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
		result.append(" (serviceId: ");
		result.append(serviceId);
		result.append(", created1: ");
		result.append(created1);
		result.append(", modified: ");
		result.append(modified);
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

} //DCAEServiceImpl
