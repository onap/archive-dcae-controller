/**
 */
package org.openecomp.dcae.controller.inventory;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DCAE Service Group By Results</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults#getPropertyValues <em>Property Values</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceGroupByResults()
 * @model
 * @generated
 */
public interface DCAEServiceGroupByResults extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Property name of DCAE service that the group by operation was performed on
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceGroupByResults_PropertyName()
	 * @model unique="false"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Property Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Values</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceGroupByResults_PropertyValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<DCAEServiceGroupByResultsPropertyValues> getPropertyValues();

} // DCAEServiceGroupByResults
