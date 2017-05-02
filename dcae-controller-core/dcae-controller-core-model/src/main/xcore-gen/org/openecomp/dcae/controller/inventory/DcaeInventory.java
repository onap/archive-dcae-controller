/**
 */
package org.openecomp.dcae.controller.inventory;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dcae Inventory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DcaeInventory#getServiceTypes <em>Service Types</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DcaeInventory#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDcaeInventory()
 * @model
 * @generated
 */
public interface DcaeInventory extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.inventory.DCAEServiceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Types</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDcaeInventory_ServiceTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DCAEServiceType> getServiceTypes();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.inventory.DCAEService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDcaeInventory_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<DCAEService> getServices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" typeNameUnique="false" onlyLatestUnique="false" onlyActiveUnique="false" vnfTypeUnique="false" serviceIdUnique="false" serviceLocationUnique="false" asdcServiceIdUnique="false" asdcResourceIdUnique="false" offsetUnique="false"
	 * @generated
	 */
	DcaeServiceTypeResults getDcaeServiceTypes(String typeName, Boolean onlyLatest, Boolean onlyActive, String vnfType, String serviceId, String serviceLocation, String asdcServiceId, String asdcResourceId, Integer offset);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" typeIdUnique="false" typeIdRequired="true"
	 * @generated
	 */
	ApiResponseMessage deleteDcaeServiceTypesType(String typeId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" typeIdUnique="false"
	 * @generated
	 */
	DCAEServiceType getDcaeServiceTypesType(String typeId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" bodyUnique="false"
	 * @generated
	 */
	DCAEServiceType createDcaeServiceTypesTypeName(DCAEServiceTypeRequest body);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" typeIdUnique="false" vnfIdUnique="false" vnfTypeUnique="false" vnfLocationUnique="false" componentTypeUnique="false" shareableUnique="false" createdUnique="false" offsetUnique="false"
	 * @generated
	 */
	DcaeServiceResults getDcaeServices(String typeId, String vnfId, String vnfType, String vnfLocation, String componentType, Boolean shareable, String created, Integer offset);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" propertyNameUnique="false"
	 * @generated
	 */
	DCAEServiceGroupByResults getDcaeServicesGroupbyPropertyName(String propertyName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serviceIdUnique="false"
	 * @generated
	 */
	void deleteDcaeServicesService(String serviceId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" serviceIdUnique="false"
	 * @generated
	 */
	DCAEService getDcaeServicesService(String serviceId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" serviceIdUnique="false" bodyUnique="false"
	 * @generated
	 */
	DCAEService createDcaeServicesService(String serviceId, DCAEServiceRequest body);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void poll();

} // DcaeInventory
