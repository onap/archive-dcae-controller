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
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openecomp.dcae.controller.inventory.InventoryPackage;
import org.openecomp.dcae.controller.inventory.Link;
import org.openecomp.dcae.controller.inventory.Parameter;
import org.openecomp.dcae.controller.inventory.UriBuilder;
import org.openecomp.ncomp.core.impl.NamedEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.LinkImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.LinkImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.LinkImpl#getRel <em>Rel</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.LinkImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.LinkImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.LinkImpl#getUriBuilder <em>Uri Builder</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.LinkImpl#getRels <em>Rels</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.LinkImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends NamedEntityImpl implements Link {
	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> params;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRel() <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRel()
	 * @generated
	 * @ordered
	 */
	protected static final String REL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRel() <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRel()
	 * @generated
	 * @ordered
	 */
	protected String rel = REL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUriBuilder() <em>Uri Builder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriBuilder()
	 * @generated
	 * @ordered
	 */
	protected UriBuilder uriBuilder;

	/**
	 * The cached value of the '{@link #getRels() <em>Rels</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRels()
	 * @generated
	 * @ordered
	 */
	protected EList<String> rels;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<Parameter>(Parameter.class, this, InventoryPackage.LINK__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.LINK__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRel() {
		return rel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRel(String newRel) {
		String oldRel = rel;
		rel = newRel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.LINK__REL, oldRel, rel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.LINK__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.LINK__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UriBuilder getUriBuilder() {
		return uriBuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUriBuilder(UriBuilder newUriBuilder, NotificationChain msgs) {
		UriBuilder oldUriBuilder = uriBuilder;
		uriBuilder = newUriBuilder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InventoryPackage.LINK__URI_BUILDER, oldUriBuilder, newUriBuilder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUriBuilder(UriBuilder newUriBuilder) {
		if (newUriBuilder != uriBuilder) {
			NotificationChain msgs = null;
			if (uriBuilder != null)
				msgs = ((InternalEObject)uriBuilder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.LINK__URI_BUILDER, null, msgs);
			if (newUriBuilder != null)
				msgs = ((InternalEObject)newUriBuilder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.LINK__URI_BUILDER, null, msgs);
			msgs = basicSetUriBuilder(newUriBuilder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.LINK__URI_BUILDER, newUriBuilder, newUriBuilder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRels() {
		if (rels == null) {
			rels = new EDataTypeEList<String>(String.class, this, InventoryPackage.LINK__RELS);
		}
		return rels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.LINK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InventoryPackage.LINK__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
			case InventoryPackage.LINK__URI_BUILDER:
				return basicSetUriBuilder(null, msgs);
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
			case InventoryPackage.LINK__PARAMS:
				return getParams();
			case InventoryPackage.LINK__TITLE:
				return getTitle();
			case InventoryPackage.LINK__REL:
				return getRel();
			case InventoryPackage.LINK__HREF:
				return getHref();
			case InventoryPackage.LINK__URI:
				return getUri();
			case InventoryPackage.LINK__URI_BUILDER:
				return getUriBuilder();
			case InventoryPackage.LINK__RELS:
				return getRels();
			case InventoryPackage.LINK__TYPE:
				return getType();
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
			case InventoryPackage.LINK__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends Parameter>)newValue);
				return;
			case InventoryPackage.LINK__TITLE:
				setTitle((String)newValue);
				return;
			case InventoryPackage.LINK__REL:
				setRel((String)newValue);
				return;
			case InventoryPackage.LINK__HREF:
				setHref((String)newValue);
				return;
			case InventoryPackage.LINK__URI:
				setUri((String)newValue);
				return;
			case InventoryPackage.LINK__URI_BUILDER:
				setUriBuilder((UriBuilder)newValue);
				return;
			case InventoryPackage.LINK__RELS:
				getRels().clear();
				getRels().addAll((Collection<? extends String>)newValue);
				return;
			case InventoryPackage.LINK__TYPE:
				setType((String)newValue);
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
			case InventoryPackage.LINK__PARAMS:
				getParams().clear();
				return;
			case InventoryPackage.LINK__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case InventoryPackage.LINK__REL:
				setRel(REL_EDEFAULT);
				return;
			case InventoryPackage.LINK__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case InventoryPackage.LINK__URI:
				setUri(URI_EDEFAULT);
				return;
			case InventoryPackage.LINK__URI_BUILDER:
				setUriBuilder((UriBuilder)null);
				return;
			case InventoryPackage.LINK__RELS:
				getRels().clear();
				return;
			case InventoryPackage.LINK__TYPE:
				setType(TYPE_EDEFAULT);
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
			case InventoryPackage.LINK__PARAMS:
				return params != null && !params.isEmpty();
			case InventoryPackage.LINK__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case InventoryPackage.LINK__REL:
				return REL_EDEFAULT == null ? rel != null : !REL_EDEFAULT.equals(rel);
			case InventoryPackage.LINK__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case InventoryPackage.LINK__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case InventoryPackage.LINK__URI_BUILDER:
				return uriBuilder != null;
			case InventoryPackage.LINK__RELS:
				return rels != null && !rels.isEmpty();
			case InventoryPackage.LINK__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", rel: ");
		result.append(rel);
		result.append(", href: ");
		result.append(href);
		result.append(", uri: ");
		result.append(uri);
		result.append(", rels: ");
		result.append(rels);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
