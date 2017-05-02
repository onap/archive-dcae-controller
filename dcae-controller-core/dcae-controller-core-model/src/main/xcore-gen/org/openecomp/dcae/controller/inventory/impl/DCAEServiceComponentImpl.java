/**
 */
package org.openecomp.dcae.controller.inventory.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openecomp.dcae.controller.inventory.DCAEServiceComponent;
import org.openecomp.dcae.controller.inventory.InventoryPackage;
import org.openecomp.dcae.controller.inventory.Link;
import org.openecomp.ncomp.core.impl.NamedEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DCAE Service Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentImpl#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentImpl#getComponentLink <em>Component Link</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentImpl#getCreated1 <em>Created1</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentImpl#getComponentSource <em>Component Source</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceComponentImpl#getShareable <em>Shareable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCAEServiceComponentImpl extends NamedEntityImpl implements DCAEServiceComponent {
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
	 * The cached value of the '{@link #getComponentLink() <em>Component Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentLink()
	 * @generated
	 * @ordered
	 */
	protected Link componentLink;

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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

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
	protected DCAEServiceComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.DCAE_SERVICE_COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_ID, oldComponentId, componentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getComponentLink() {
		return componentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentLink(Link newComponentLink, NotificationChain msgs) {
		Link oldComponentLink = componentLink;
		componentLink = newComponentLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_LINK, oldComponentLink, newComponentLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentLink(Link newComponentLink) {
		if (newComponentLink != componentLink) {
			NotificationChain msgs = null;
			if (componentLink != null)
				msgs = ((InternalEObject)componentLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_LINK, null, msgs);
			if (newComponentLink != null)
				msgs = ((InternalEObject)newComponentLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_LINK, null, msgs);
			msgs = basicSetComponentLink(newComponentLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_LINK, newComponentLink, newComponentLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_COMPONENT__CREATED1, oldCreated1, created1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_COMPONENT__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_TYPE, oldComponentType, componentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_SOURCE, oldComponentSource, componentSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_COMPONENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_COMPONENT__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_COMPONENT__SHAREABLE, oldShareable, shareable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_LINK:
				return basicSetComponentLink(null, msgs);
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
			case InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_ID:
				return getComponentId();
			case InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_LINK:
				return getComponentLink();
			case InventoryPackage.DCAE_SERVICE_COMPONENT__CREATED1:
				return getCreated1();
			case InventoryPackage.DCAE_SERVICE_COMPONENT__MODIFIED:
				return getModified();
			case InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_TYPE:
				return getComponentType();
			case InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_SOURCE:
				return getComponentSource();
			case InventoryPackage.DCAE_SERVICE_COMPONENT__STATUS:
				return getStatus();
			case InventoryPackage.DCAE_SERVICE_COMPONENT__LOCATION:
				return getLocation();
			case InventoryPackage.DCAE_SERVICE_COMPONENT__SHAREABLE:
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
			case InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_ID:
				setComponentId((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_LINK:
				setComponentLink((Link)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT__CREATED1:
				setCreated1((Date)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT__MODIFIED:
				setModified((Date)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_TYPE:
				setComponentType((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_SOURCE:
				setComponentSource((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT__STATUS:
				setStatus((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT__LOCATION:
				setLocation((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT__SHAREABLE:
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
			case InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_ID:
				setComponentId(COMPONENT_ID_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_LINK:
				setComponentLink((Link)null);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT__CREATED1:
				setCreated1(CREATED1_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_TYPE:
				setComponentType(COMPONENT_TYPE_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_SOURCE:
				setComponentSource(COMPONENT_SOURCE_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_COMPONENT__SHAREABLE:
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
			case InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_ID:
				return COMPONENT_ID_EDEFAULT == null ? componentId != null : !COMPONENT_ID_EDEFAULT.equals(componentId);
			case InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_LINK:
				return componentLink != null;
			case InventoryPackage.DCAE_SERVICE_COMPONENT__CREATED1:
				return CREATED1_EDEFAULT == null ? created1 != null : !CREATED1_EDEFAULT.equals(created1);
			case InventoryPackage.DCAE_SERVICE_COMPONENT__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_TYPE:
				return COMPONENT_TYPE_EDEFAULT == null ? componentType != null : !COMPONENT_TYPE_EDEFAULT.equals(componentType);
			case InventoryPackage.DCAE_SERVICE_COMPONENT__COMPONENT_SOURCE:
				return COMPONENT_SOURCE_EDEFAULT == null ? componentSource != null : !COMPONENT_SOURCE_EDEFAULT.equals(componentSource);
			case InventoryPackage.DCAE_SERVICE_COMPONENT__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case InventoryPackage.DCAE_SERVICE_COMPONENT__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case InventoryPackage.DCAE_SERVICE_COMPONENT__SHAREABLE:
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
		result.append(", created1: ");
		result.append(created1);
		result.append(", modified: ");
		result.append(modified);
		result.append(", componentType: ");
		result.append(componentType);
		result.append(", componentSource: ");
		result.append(componentSource);
		result.append(", status: ");
		result.append(status);
		result.append(", location: ");
		result.append(location);
		result.append(", shareable: ");
		result.append(shareable);
		result.append(')');
		return result.toString();
	}

} //DCAEServiceComponentImpl
