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
import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.openecomp.dcae.controller.inventory.DCAEServiceType;
import org.openecomp.dcae.controller.inventory.InventoryPackage;
import org.openecomp.dcae.controller.inventory.Link;
import org.openecomp.ncomp.core.impl.NamedEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DCAE Service Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeImpl#getTypeVersion <em>Type Version</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeImpl#getBlueprintTemplate <em>Blueprint Template</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeImpl#getServiceIds <em>Service Ids</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeImpl#getVnfTypes <em>Vnf Types</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeImpl#getServiceLocations <em>Service Locations</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeImpl#getAsdcServiceId <em>Asdc Service Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeImpl#getAsdcResourceId <em>Asdc Resource Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeImpl#getAsdcServiceURL <em>Asdc Service URL</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeImpl#getSelfLink <em>Self Link</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeImpl#getCreated1 <em>Created1</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.DCAEServiceTypeImpl#getDeactivated <em>Deactivated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCAEServiceTypeImpl extends NamedEntityImpl implements DCAEServiceType {
	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected String owner = OWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeVersion() <em>Type Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYPE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeVersion() <em>Type Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer typeVersion = TYPE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlueprintTemplate() <em>Blueprint Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlueprintTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String BLUEPRINT_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlueprintTemplate() <em>Blueprint Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlueprintTemplate()
	 * @generated
	 * @ordered
	 */
	protected String blueprintTemplate = BLUEPRINT_TEMPLATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceIds() <em>Service Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serviceIds;

	/**
	 * The cached value of the '{@link #getVnfTypes() <em>Vnf Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVnfTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vnfTypes;

	/**
	 * The cached value of the '{@link #getServiceLocations() <em>Service Locations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serviceLocations;

	/**
	 * The default value of the '{@link #getAsdcServiceId() <em>Asdc Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsdcServiceId()
	 * @generated
	 * @ordered
	 */
	protected static final String ASDC_SERVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAsdcServiceId() <em>Asdc Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsdcServiceId()
	 * @generated
	 * @ordered
	 */
	protected String asdcServiceId = ASDC_SERVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAsdcResourceId() <em>Asdc Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsdcResourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String ASDC_RESOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAsdcResourceId() <em>Asdc Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsdcResourceId()
	 * @generated
	 * @ordered
	 */
	protected String asdcResourceId = ASDC_RESOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAsdcServiceURL() <em>Asdc Service URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsdcServiceURL()
	 * @generated
	 * @ordered
	 */
	protected static final String ASDC_SERVICE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAsdcServiceURL() <em>Asdc Service URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsdcServiceURL()
	 * @generated
	 * @ordered
	 */
	protected String asdcServiceURL = ASDC_SERVICE_URL_EDEFAULT;

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
	 * The default value of the '{@link #getDeactivated() <em>Deactivated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeactivated()
	 * @generated
	 * @ordered
	 */
	protected static final Date DEACTIVATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeactivated() <em>Deactivated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeactivated()
	 * @generated
	 * @ordered
	 */
	protected Date deactivated = DEACTIVATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DCAEServiceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.DCAE_SERVICE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(String newOwner) {
		String oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_TYPE__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_TYPE__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTypeVersion() {
		return typeVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeVersion(Integer newTypeVersion) {
		Integer oldTypeVersion = typeVersion;
		typeVersion = newTypeVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_TYPE__TYPE_VERSION, oldTypeVersion, typeVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlueprintTemplate() {
		return blueprintTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlueprintTemplate(String newBlueprintTemplate) {
		String oldBlueprintTemplate = blueprintTemplate;
		blueprintTemplate = newBlueprintTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_TYPE__BLUEPRINT_TEMPLATE, oldBlueprintTemplate, blueprintTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getServiceIds() {
		if (serviceIds == null) {
			serviceIds = new EDataTypeEList<String>(String.class, this, InventoryPackage.DCAE_SERVICE_TYPE__SERVICE_IDS);
		}
		return serviceIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVnfTypes() {
		if (vnfTypes == null) {
			vnfTypes = new EDataTypeEList<String>(String.class, this, InventoryPackage.DCAE_SERVICE_TYPE__VNF_TYPES);
		}
		return vnfTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getServiceLocations() {
		if (serviceLocations == null) {
			serviceLocations = new EDataTypeEList<String>(String.class, this, InventoryPackage.DCAE_SERVICE_TYPE__SERVICE_LOCATIONS);
		}
		return serviceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAsdcServiceId() {
		return asdcServiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsdcServiceId(String newAsdcServiceId) {
		String oldAsdcServiceId = asdcServiceId;
		asdcServiceId = newAsdcServiceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_TYPE__ASDC_SERVICE_ID, oldAsdcServiceId, asdcServiceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAsdcResourceId() {
		return asdcResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsdcResourceId(String newAsdcResourceId) {
		String oldAsdcResourceId = asdcResourceId;
		asdcResourceId = newAsdcResourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_TYPE__ASDC_RESOURCE_ID, oldAsdcResourceId, asdcResourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAsdcServiceURL() {
		return asdcServiceURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsdcServiceURL(String newAsdcServiceURL) {
		String oldAsdcServiceURL = asdcServiceURL;
		asdcServiceURL = newAsdcServiceURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_TYPE__ASDC_SERVICE_URL, oldAsdcServiceURL, asdcServiceURL));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_TYPE__TYPE_ID, oldTypeId, typeId));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_TYPE__SELF_LINK, oldSelfLink, newSelfLink);
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
				msgs = ((InternalEObject)selfLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.DCAE_SERVICE_TYPE__SELF_LINK, null, msgs);
			if (newSelfLink != null)
				msgs = ((InternalEObject)newSelfLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.DCAE_SERVICE_TYPE__SELF_LINK, null, msgs);
			msgs = basicSetSelfLink(newSelfLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_TYPE__SELF_LINK, newSelfLink, newSelfLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_TYPE__CREATED1, oldCreated1, created1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDeactivated() {
		return deactivated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeactivated(Date newDeactivated) {
		Date oldDeactivated = deactivated;
		deactivated = newDeactivated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.DCAE_SERVICE_TYPE__DEACTIVATED, oldDeactivated, deactivated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InventoryPackage.DCAE_SERVICE_TYPE__SELF_LINK:
				return basicSetSelfLink(null, msgs);
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
			case InventoryPackage.DCAE_SERVICE_TYPE__OWNER:
				return getOwner();
			case InventoryPackage.DCAE_SERVICE_TYPE__TYPE_NAME:
				return getTypeName();
			case InventoryPackage.DCAE_SERVICE_TYPE__TYPE_VERSION:
				return getTypeVersion();
			case InventoryPackage.DCAE_SERVICE_TYPE__BLUEPRINT_TEMPLATE:
				return getBlueprintTemplate();
			case InventoryPackage.DCAE_SERVICE_TYPE__SERVICE_IDS:
				return getServiceIds();
			case InventoryPackage.DCAE_SERVICE_TYPE__VNF_TYPES:
				return getVnfTypes();
			case InventoryPackage.DCAE_SERVICE_TYPE__SERVICE_LOCATIONS:
				return getServiceLocations();
			case InventoryPackage.DCAE_SERVICE_TYPE__ASDC_SERVICE_ID:
				return getAsdcServiceId();
			case InventoryPackage.DCAE_SERVICE_TYPE__ASDC_RESOURCE_ID:
				return getAsdcResourceId();
			case InventoryPackage.DCAE_SERVICE_TYPE__ASDC_SERVICE_URL:
				return getAsdcServiceURL();
			case InventoryPackage.DCAE_SERVICE_TYPE__TYPE_ID:
				return getTypeId();
			case InventoryPackage.DCAE_SERVICE_TYPE__SELF_LINK:
				return getSelfLink();
			case InventoryPackage.DCAE_SERVICE_TYPE__CREATED1:
				return getCreated1();
			case InventoryPackage.DCAE_SERVICE_TYPE__DEACTIVATED:
				return getDeactivated();
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
			case InventoryPackage.DCAE_SERVICE_TYPE__OWNER:
				setOwner((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__TYPE_VERSION:
				setTypeVersion((Integer)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__BLUEPRINT_TEMPLATE:
				setBlueprintTemplate((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__SERVICE_IDS:
				getServiceIds().clear();
				getServiceIds().addAll((Collection<? extends String>)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__VNF_TYPES:
				getVnfTypes().clear();
				getVnfTypes().addAll((Collection<? extends String>)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__SERVICE_LOCATIONS:
				getServiceLocations().clear();
				getServiceLocations().addAll((Collection<? extends String>)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__ASDC_SERVICE_ID:
				setAsdcServiceId((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__ASDC_RESOURCE_ID:
				setAsdcResourceId((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__ASDC_SERVICE_URL:
				setAsdcServiceURL((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__TYPE_ID:
				setTypeId((String)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__SELF_LINK:
				setSelfLink((Link)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__CREATED1:
				setCreated1((Date)newValue);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__DEACTIVATED:
				setDeactivated((Date)newValue);
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
			case InventoryPackage.DCAE_SERVICE_TYPE__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__TYPE_VERSION:
				setTypeVersion(TYPE_VERSION_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__BLUEPRINT_TEMPLATE:
				setBlueprintTemplate(BLUEPRINT_TEMPLATE_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__SERVICE_IDS:
				getServiceIds().clear();
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__VNF_TYPES:
				getVnfTypes().clear();
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__SERVICE_LOCATIONS:
				getServiceLocations().clear();
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__ASDC_SERVICE_ID:
				setAsdcServiceId(ASDC_SERVICE_ID_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__ASDC_RESOURCE_ID:
				setAsdcResourceId(ASDC_RESOURCE_ID_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__ASDC_SERVICE_URL:
				setAsdcServiceURL(ASDC_SERVICE_URL_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__TYPE_ID:
				setTypeId(TYPE_ID_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__SELF_LINK:
				setSelfLink((Link)null);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__CREATED1:
				setCreated1(CREATED1_EDEFAULT);
				return;
			case InventoryPackage.DCAE_SERVICE_TYPE__DEACTIVATED:
				setDeactivated(DEACTIVATED_EDEFAULT);
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
			case InventoryPackage.DCAE_SERVICE_TYPE__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case InventoryPackage.DCAE_SERVICE_TYPE__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case InventoryPackage.DCAE_SERVICE_TYPE__TYPE_VERSION:
				return TYPE_VERSION_EDEFAULT == null ? typeVersion != null : !TYPE_VERSION_EDEFAULT.equals(typeVersion);
			case InventoryPackage.DCAE_SERVICE_TYPE__BLUEPRINT_TEMPLATE:
				return BLUEPRINT_TEMPLATE_EDEFAULT == null ? blueprintTemplate != null : !BLUEPRINT_TEMPLATE_EDEFAULT.equals(blueprintTemplate);
			case InventoryPackage.DCAE_SERVICE_TYPE__SERVICE_IDS:
				return serviceIds != null && !serviceIds.isEmpty();
			case InventoryPackage.DCAE_SERVICE_TYPE__VNF_TYPES:
				return vnfTypes != null && !vnfTypes.isEmpty();
			case InventoryPackage.DCAE_SERVICE_TYPE__SERVICE_LOCATIONS:
				return serviceLocations != null && !serviceLocations.isEmpty();
			case InventoryPackage.DCAE_SERVICE_TYPE__ASDC_SERVICE_ID:
				return ASDC_SERVICE_ID_EDEFAULT == null ? asdcServiceId != null : !ASDC_SERVICE_ID_EDEFAULT.equals(asdcServiceId);
			case InventoryPackage.DCAE_SERVICE_TYPE__ASDC_RESOURCE_ID:
				return ASDC_RESOURCE_ID_EDEFAULT == null ? asdcResourceId != null : !ASDC_RESOURCE_ID_EDEFAULT.equals(asdcResourceId);
			case InventoryPackage.DCAE_SERVICE_TYPE__ASDC_SERVICE_URL:
				return ASDC_SERVICE_URL_EDEFAULT == null ? asdcServiceURL != null : !ASDC_SERVICE_URL_EDEFAULT.equals(asdcServiceURL);
			case InventoryPackage.DCAE_SERVICE_TYPE__TYPE_ID:
				return TYPE_ID_EDEFAULT == null ? typeId != null : !TYPE_ID_EDEFAULT.equals(typeId);
			case InventoryPackage.DCAE_SERVICE_TYPE__SELF_LINK:
				return selfLink != null;
			case InventoryPackage.DCAE_SERVICE_TYPE__CREATED1:
				return CREATED1_EDEFAULT == null ? created1 != null : !CREATED1_EDEFAULT.equals(created1);
			case InventoryPackage.DCAE_SERVICE_TYPE__DEACTIVATED:
				return DEACTIVATED_EDEFAULT == null ? deactivated != null : !DEACTIVATED_EDEFAULT.equals(deactivated);
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
		result.append(" (owner: ");
		result.append(owner);
		result.append(", typeName: ");
		result.append(typeName);
		result.append(", typeVersion: ");
		result.append(typeVersion);
		result.append(", blueprintTemplate: ");
		result.append(blueprintTemplate);
		result.append(", serviceIds: ");
		result.append(serviceIds);
		result.append(", vnfTypes: ");
		result.append(vnfTypes);
		result.append(", serviceLocations: ");
		result.append(serviceLocations);
		result.append(", asdcServiceId: ");
		result.append(asdcServiceId);
		result.append(", asdcResourceId: ");
		result.append(asdcResourceId);
		result.append(", asdcServiceURL: ");
		result.append(asdcServiceURL);
		result.append(", typeId: ");
		result.append(typeId);
		result.append(", created1: ");
		result.append(created1);
		result.append(", deactivated: ");
		result.append(deactivated);
		result.append(')');
		return result.toString();
	}

} //DCAEServiceTypeImpl
