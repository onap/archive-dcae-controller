/**
 */
package org.openecomp.dcae.controller.inventory;

import org.eclipse.emf.common.util.EList;
import org.openecomp.ncomp.core.NamedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.Link#getParams <em>Params</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.Link#getTitle <em>Title</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.Link#getRel <em>Rel</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.Link#getHref <em>Href</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.Link#getUri <em>Uri</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.Link#getUriBuilder <em>Uri Builder</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.Link#getRels <em>Rels</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.Link#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.inventory.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getLink_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParams();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getLink_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.Link#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel</em>' attribute.
	 * @see #setRel(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getLink_Rel()
	 * @model unique="false"
	 * @generated
	 */
	String getRel();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.Link#getRel <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel</em>' attribute.
	 * @see #getRel()
	 * @generated
	 */
	void setRel(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getLink_Href()
	 * @model unique="false"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.Link#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getLink_Uri()
	 * @model unique="false"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.Link#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Uri Builder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Builder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Builder</em>' containment reference.
	 * @see #setUriBuilder(UriBuilder)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getLink_UriBuilder()
	 * @model containment="true"
	 * @generated
	 */
	UriBuilder getUriBuilder();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.Link#getUriBuilder <em>Uri Builder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Builder</em>' containment reference.
	 * @see #getUriBuilder()
	 * @generated
	 */
	void setUriBuilder(UriBuilder value);

	/**
	 * Returns the value of the '<em><b>Rels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rels</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rels</em>' attribute list.
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getLink_Rels()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getRels();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getLink_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.Link#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Link
