/**
 */
package org.openecomp.dcae.controller.inventory;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DCAE Service Component Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest#getComponentSource <em>Component Source</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest#getShareable <em>Shareable</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceComponentRequest()
 * @model
 * @generated
 */
public interface DCAEServiceComponentRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The id format is unique to the source
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Id</em>' attribute.
	 * @see #setComponentId(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceComponentRequest_ComponentId()
	 * @model unique="false"
	 * @generated
	 */
	String getComponentId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest#getComponentId <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id</em>' attribute.
	 * @see #getComponentId()
	 * @generated
	 */
	void setComponentId(String value);

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' attribute.
	 * @see #setComponentType(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceComponentRequest_ComponentType()
	 * @model unique="false"
	 * @generated
	 */
	String getComponentType();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest#getComponentType <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' attribute.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(String value);

	/**
	 * Returns the value of the '<em><b>Component Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Specifies the name of the underying source service that is responsible for this components
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Source</em>' attribute.
	 * @see #setComponentSource(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceComponentRequest_ComponentSource()
	 * @model unique="false"
	 * @generated
	 */
	String getComponentSource();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest#getComponentSource <em>Component Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Source</em>' attribute.
	 * @see #getComponentSource()
	 * @generated
	 */
	void setComponentSource(String value);

	/**
	 * Returns the value of the '<em><b>Shareable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Used to determine if this component can be shared amongst different DCAE services
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shareable</em>' attribute.
	 * @see #setShareable(Integer)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceComponentRequest_Shareable()
	 * @model unique="false"
	 * @generated
	 */
	Integer getShareable();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest#getShareable <em>Shareable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shareable</em>' attribute.
	 * @see #getShareable()
	 * @generated
	 */
	void setShareable(Integer value);

} // DCAEServiceComponentRequest
