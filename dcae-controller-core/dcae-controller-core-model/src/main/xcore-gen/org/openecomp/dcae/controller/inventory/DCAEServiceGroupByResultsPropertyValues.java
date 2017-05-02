/**
 */
package org.openecomp.dcae.controller.inventory;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DCAE Service Group By Results Property Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues#getCount <em>Count</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues#getDcaeServiceQueryLink <em>Dcae Service Query Link</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceGroupByResultsPropertyValues()
 * @model
 * @generated
 */
public interface DCAEServiceGroupByResultsPropertyValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(Integer)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceGroupByResultsPropertyValues_Count()
	 * @model unique="false"
	 * @generated
	 */
	Integer getCount();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(Integer value);

	/**
	 * Returns the value of the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Value</em>' attribute.
	 * @see #setPropertyValue(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceGroupByResultsPropertyValues_PropertyValue()
	 * @model unique="false"
	 * @generated
	 */
	String getPropertyValue();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues#getPropertyValue <em>Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Value</em>' attribute.
	 * @see #getPropertyValue()
	 * @generated
	 */
	void setPropertyValue(String value);

	/**
	 * Returns the value of the '<em><b>Dcae Service Query Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Link.title is the DCAE service property value. Following this link will provide a list of DCAE services that all have this property value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcae Service Query Link</em>' containment reference.
	 * @see #setDcaeServiceQueryLink(Link)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceGroupByResultsPropertyValues_DcaeServiceQueryLink()
	 * @model containment="true"
	 * @generated
	 */
	Link getDcaeServiceQueryLink();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues#getDcaeServiceQueryLink <em>Dcae Service Query Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcae Service Query Link</em>' containment reference.
	 * @see #getDcaeServiceQueryLink()
	 * @generated
	 */
	void setDcaeServiceQueryLink(Link value);

} // DCAEServiceGroupByResultsPropertyValues
