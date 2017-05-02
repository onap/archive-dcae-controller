/**
 */
package org.openecomp.dcae.controller.inventory;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.inventory.InventoryPackage
 * @generated
 */
public interface InventoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InventoryFactory eINSTANCE = org.openecomp.dcae.controller.inventory.impl.InventoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dcae Inventory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dcae Inventory</em>'.
	 * @generated
	 */
	DcaeInventory createDcaeInventory();

	/**
	 * Returns a new object of class '<em>Api Response Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Api Response Message</em>'.
	 * @generated
	 */
	ApiResponseMessage createApiResponseMessage();

	/**
	 * Returns a new object of class '<em>DCAE Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DCAE Service Component</em>'.
	 * @generated
	 */
	DCAEServiceComponent createDCAEServiceComponent();

	/**
	 * Returns a new object of class '<em>DCAE Service Component Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DCAE Service Component Request</em>'.
	 * @generated
	 */
	DCAEServiceComponentRequest createDCAEServiceComponentRequest();

	/**
	 * Returns a new object of class '<em>DCAE Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DCAE Service</em>'.
	 * @generated
	 */
	DCAEService createDCAEService();

	/**
	 * Returns a new object of class '<em>DCAE Service Group By Results</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DCAE Service Group By Results</em>'.
	 * @generated
	 */
	DCAEServiceGroupByResults createDCAEServiceGroupByResults();

	/**
	 * Returns a new object of class '<em>DCAE Service Group By Results Property Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DCAE Service Group By Results Property Values</em>'.
	 * @generated
	 */
	DCAEServiceGroupByResultsPropertyValues createDCAEServiceGroupByResultsPropertyValues();

	/**
	 * Returns a new object of class '<em>DCAE Service Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DCAE Service Request</em>'.
	 * @generated
	 */
	DCAEServiceRequest createDCAEServiceRequest();

	/**
	 * Returns a new object of class '<em>DCAE Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DCAE Service Type</em>'.
	 * @generated
	 */
	DCAEServiceType createDCAEServiceType();

	/**
	 * Returns a new object of class '<em>DCAE Service Type Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DCAE Service Type Request</em>'.
	 * @generated
	 */
	DCAEServiceTypeRequest createDCAEServiceTypeRequest();

	/**
	 * Returns a new object of class '<em>Dcae Service Results</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dcae Service Results</em>'.
	 * @generated
	 */
	DcaeServiceResults createDcaeServiceResults();

	/**
	 * Returns a new object of class '<em>Dcae Service Type Results</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dcae Service Type Results</em>'.
	 * @generated
	 */
	DcaeServiceTypeResults createDcaeServiceTypeResults();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Uri Builder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uri Builder</em>'.
	 * @generated
	 */
	UriBuilder createUriBuilder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InventoryPackage getInventoryPackage();

} //InventoryFactory
