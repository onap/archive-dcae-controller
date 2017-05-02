/**
 */
package org.openecomp.dcae.controller.inventory;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DCAE Service Type Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getTypeVersion <em>Type Version</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getBlueprintTemplate <em>Blueprint Template</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getServiceIds <em>Service Ids</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getVnfTypes <em>Vnf Types</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getServiceLocations <em>Service Locations</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getAsdcServiceId <em>Asdc Service Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getAsdcResourceId <em>Asdc Resource Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getAsdcServiceURL <em>Asdc Service URL</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceTypeRequest()
 * @model
 * @generated
 */
public interface DCAEServiceTypeRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceTypeRequest_Owner()
	 * @model unique="false"
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Descriptive name for this DCAE service type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceTypeRequest_TypeName()
	 * @model unique="false"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Type Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Version number for this DCAE service type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Version</em>' attribute.
	 * @see #setTypeVersion(Integer)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceTypeRequest_TypeVersion()
	 * @model unique="false"
	 * @generated
	 */
	Integer getTypeVersion();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getTypeVersion <em>Type Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Version</em>' attribute.
	 * @see #getTypeVersion()
	 * @generated
	 */
	void setTypeVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Blueprint Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  String representation of a Cloudify blueprint with unbound variables
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blueprint Template</em>' attribute.
	 * @see #setBlueprintTemplate(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceTypeRequest_BlueprintTemplate()
	 * @model unique="false"
	 * @generated
	 */
	String getBlueprintTemplate();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getBlueprintTemplate <em>Blueprint Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blueprint Template</em>' attribute.
	 * @see #getBlueprintTemplate()
	 * @generated
	 */
	void setBlueprintTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Service Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  List of service ids that are used to associate with DCAE service type. DCAE service types with this propery as null or empty means them apply for every service id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Ids</em>' attribute list.
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceTypeRequest_ServiceIds()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getServiceIds();

	/**
	 * Returns the value of the '<em><b>Vnf Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vnf Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vnf Types</em>' attribute list.
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceTypeRequest_VnfTypes()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getVnfTypes();

	/**
	 * Returns the value of the '<em><b>Service Locations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  List of service locations that are used to associate with DCAE service type. DCAE service types with this propery as null or empty means them apply for every service location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Locations</em>' attribute list.
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceTypeRequest_ServiceLocations()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getServiceLocations();

	/**
	 * Returns the value of the '<em><b>Asdc Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Id of service this DCAE service type is associated with. Value source is from ASDC's notification event's field `serviceInvariantUUID`.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asdc Service Id</em>' attribute.
	 * @see #setAsdcServiceId(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceTypeRequest_AsdcServiceId()
	 * @model unique="false"
	 * @generated
	 */
	String getAsdcServiceId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getAsdcServiceId <em>Asdc Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asdc Service Id</em>' attribute.
	 * @see #getAsdcServiceId()
	 * @generated
	 */
	void setAsdcServiceId(String value);

	/**
	 * Returns the value of the '<em><b>Asdc Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Id of vf/vnf instance this DCAE service type is associated with. Value source is from ASDC's notification event's field `resourceInvariantUUID`.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asdc Resource Id</em>' attribute.
	 * @see #setAsdcResourceId(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceTypeRequest_AsdcResourceId()
	 * @model unique="false"
	 * @generated
	 */
	String getAsdcResourceId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getAsdcResourceId <em>Asdc Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asdc Resource Id</em>' attribute.
	 * @see #getAsdcResourceId()
	 * @generated
	 */
	void setAsdcResourceId(String value);

	/**
	 * Returns the value of the '<em><b>Asdc Service URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  URL to the ASDC service model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asdc Service URL</em>' attribute.
	 * @see #setAsdcServiceURL(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceTypeRequest_AsdcServiceURL()
	 * @model unique="false"
	 * @generated
	 */
	String getAsdcServiceURL();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest#getAsdcServiceURL <em>Asdc Service URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asdc Service URL</em>' attribute.
	 * @see #getAsdcServiceURL()
	 * @generated
	 */
	void setAsdcServiceURL(String value);

} // DCAEServiceTypeRequest
