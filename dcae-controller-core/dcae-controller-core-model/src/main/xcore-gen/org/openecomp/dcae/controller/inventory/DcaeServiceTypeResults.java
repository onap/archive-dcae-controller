/**
 */
package org.openecomp.dcae.controller.inventory;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Response200</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults#getLinks <em>Links</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults#getTotalCount <em>Total Count</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDcaeServiceTypeResults()
 * @model
 * @generated
 */
public interface DcaeServiceTypeResults extends EObject {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.inventory.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDcaeServiceTypeResults_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Total Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Count</em>' attribute.
	 * @see #setTotalCount(Integer)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDcaeServiceTypeResults_TotalCount()
	 * @model unique="false"
	 * @generated
	 */
	Integer getTotalCount();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults#getTotalCount <em>Total Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Count</em>' attribute.
	 * @see #getTotalCount()
	 * @generated
	 */
	void setTotalCount(Integer value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.inventory.DCAEServiceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDcaeServiceTypeResults_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<DCAEServiceType> getItems();

} // InlineResponse200
