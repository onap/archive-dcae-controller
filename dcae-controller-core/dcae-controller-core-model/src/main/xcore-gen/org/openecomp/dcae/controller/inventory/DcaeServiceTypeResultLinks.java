/**
 */
package org.openecomp.dcae.controller.inventory;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Response200 Links</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DcaeServiceTypeResultLinks#getPreviousLink <em>Previous Link</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DcaeServiceTypeResultLinks#getNextLink <em>Next Link</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDcaeServiceTypeResultLinks()
 * @model
 * @generated
 */
public interface DcaeServiceTypeResultLinks extends EObject {
	/**
	 * Returns the value of the '<em><b>Previous Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Link</em>' containment reference.
	 * @see #setPreviousLink(Link)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDcaeServiceTypeResultLinks_PreviousLink()
	 * @model containment="true"
	 * @generated
	 */
	Link getPreviousLink();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DcaeServiceTypeResultLinks#getPreviousLink <em>Previous Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Link</em>' containment reference.
	 * @see #getPreviousLink()
	 * @generated
	 */
	void setPreviousLink(Link value);

	/**
	 * Returns the value of the '<em><b>Next Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Link</em>' containment reference.
	 * @see #setNextLink(Link)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDcaeServiceTypeResultLinks_NextLink()
	 * @model containment="true"
	 * @generated
	 */
	Link getNextLink();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DcaeServiceTypeResultLinks#getNextLink <em>Next Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Link</em>' containment reference.
	 * @see #getNextLink()
	 * @generated
	 */
	void setNextLink(Link value);

} // InlineResponse200Links
