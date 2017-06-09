/**
 */
package org.openecomp.dcae.controller.inventory;

import org.openecomp.ncomp.core.NamedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.InventoryConfigurationRules#getTypeNameMatch <em>Type Name Match</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.InventoryConfigurationRules#getServiceNameMatch <em>Service Name Match</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.InventoryConfigurationRules#getInstanceNameMatch <em>Instance Name Match</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getInventoryConfigurationRules()
 * @model
 * @generated
 */
public interface InventoryConfigurationRules extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Type Name Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name Match</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name Match</em>' attribute.
	 * @see #setTypeNameMatch(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getInventoryConfigurationRules_TypeNameMatch()
	 * @model unique="false"
	 * @generated
	 */
	String getTypeNameMatch();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.InventoryConfigurationRules#getTypeNameMatch <em>Type Name Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name Match</em>' attribute.
	 * @see #getTypeNameMatch()
	 * @generated
	 */
	void setTypeNameMatch(String value);

	/**
	 * Returns the value of the '<em><b>Service Name Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name Match</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name Match</em>' attribute.
	 * @see #setServiceNameMatch(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getInventoryConfigurationRules_ServiceNameMatch()
	 * @model unique="false"
	 * @generated
	 */
	String getServiceNameMatch();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.InventoryConfigurationRules#getServiceNameMatch <em>Service Name Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name Match</em>' attribute.
	 * @see #getServiceNameMatch()
	 * @generated
	 */
	void setServiceNameMatch(String value);

	/**
	 * Returns the value of the '<em><b>Instance Name Match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Name Match</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Name Match</em>' attribute.
	 * @see #setInstanceNameMatch(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getInventoryConfigurationRules_InstanceNameMatch()
	 * @model unique="false"
	 * @generated
	 */
	String getInstanceNameMatch();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.InventoryConfigurationRules#getInstanceNameMatch <em>Instance Name Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name Match</em>' attribute.
	 * @see #getInstanceNameMatch()
	 * @generated
	 */
	void setInstanceNameMatch(String value);

} // InventoryConfigurationRules
