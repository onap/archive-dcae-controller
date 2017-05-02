/**
 */
package org.openecomp.dcae.controller.inventory;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Api Response Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.ApiResponseMessage#getCode <em>Code</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.ApiResponseMessage#getType <em>Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.ApiResponseMessage#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getApiResponseMessage()
 * @model
 * @generated
 */
public interface ApiResponseMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(Integer)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getApiResponseMessage_Code()
	 * @model unique="false"
	 * @generated
	 */
	Integer getCode();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.ApiResponseMessage#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Integer value);

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
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getApiResponseMessage_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.ApiResponseMessage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getApiResponseMessage_Message()
	 * @model unique="false"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.ApiResponseMessage#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // ApiResponseMessage
