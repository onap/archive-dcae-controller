/**
 */
package org.openecomp.dcae.controller.inventory;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DCAE Service Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getVnfId <em>Vnf Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getVnfType <em>Vnf Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getVnfLocation <em>Vnf Location</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getDeploymentRef <em>Deployment Ref</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceRequest()
 * @model
 * @generated
 */
public interface DCAEServiceRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Id of the associated DCAE service type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Id</em>' attribute.
	 * @see #setTypeId(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceRequest_TypeId()
	 * @model unique="false"
	 * @generated
	 */
	String getTypeId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getTypeId <em>Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Id</em>' attribute.
	 * @see #getTypeId()
	 * @generated
	 */
	void setTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Vnf Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Id of the associated VNF that this service is monitoring
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vnf Id</em>' attribute.
	 * @see #setVnfId(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceRequest_VnfId()
	 * @model unique="false"
	 * @generated
	 */
	String getVnfId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getVnfId <em>Vnf Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vnf Id</em>' attribute.
	 * @see #getVnfId()
	 * @generated
	 */
	void setVnfId(String value);

	/**
	 * Returns the value of the '<em><b>Vnf Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The type of the associated VNF that this service is monitoring
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vnf Type</em>' attribute.
	 * @see #setVnfType(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceRequest_VnfType()
	 * @model unique="false"
	 * @generated
	 */
	String getVnfType();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getVnfType <em>Vnf Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vnf Type</em>' attribute.
	 * @see #getVnfType()
	 * @generated
	 */
	void setVnfType(String value);

	/**
	 * Returns the value of the '<em><b>Vnf Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Location identifier of the associated VNF that this service is monitoring
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vnf Location</em>' attribute.
	 * @see #setVnfLocation(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceRequest_VnfLocation()
	 * @model unique="false"
	 * @generated
	 */
	String getVnfLocation();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getVnfLocation <em>Vnf Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vnf Location</em>' attribute.
	 * @see #getVnfLocation()
	 * @generated
	 */
	void setVnfLocation(String value);

	/**
	 * Returns the value of the '<em><b>Deployment Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Reference to a Cloudify deployment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment Ref</em>' attribute.
	 * @see #setDeploymentRef(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceRequest_DeploymentRef()
	 * @model unique="false"
	 * @generated
	 */
	String getDeploymentRef();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest#getDeploymentRef <em>Deployment Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Ref</em>' attribute.
	 * @see #getDeploymentRef()
	 * @generated
	 */
	void setDeploymentRef(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  List of DCAE service components that this service is composed of
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceRequest_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<DCAEServiceComponentRequest> getComponents();

} // DCAEServiceRequest
