/**
 */
package org.openecomp.dcae.controller.inventory;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.openecomp.ncomp.core.NamedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DCAE Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEService#getServiceId <em>Service Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEService#getSelfLink <em>Self Link</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEService#getCreated1 <em>Created1</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEService#getModified <em>Modified</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEService#getTypeLink <em>Type Link</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEService#getVnfId <em>Vnf Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEService#getVnfLink <em>Vnf Link</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEService#getVnfType <em>Vnf Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEService#getVnfLocation <em>Vnf Location</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEService#getDeploymentRef <em>Deployment Ref</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEService#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEService()
 * @model
 * @generated
 */
public interface DCAEService extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Id</em>' attribute.
	 * @see #setServiceId(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEService_ServiceId()
	 * @model unique="false"
	 * @generated
	 */
	String getServiceId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEService#getServiceId <em>Service Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Id</em>' attribute.
	 * @see #getServiceId()
	 * @generated
	 */
	void setServiceId(String value);

	/**
	 * Returns the value of the '<em><b>Self Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Link.title is serviceId
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Self Link</em>' containment reference.
	 * @see #setSelfLink(Link)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEService_SelfLink()
	 * @model containment="true"
	 * @generated
	 */
	Link getSelfLink();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEService#getSelfLink <em>Self Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Link</em>' containment reference.
	 * @see #getSelfLink()
	 * @generated
	 */
	void setSelfLink(Link value);

	/**
	 * Returns the value of the '<em><b>Created1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created1</em>' attribute.
	 * @see #setCreated1(Date)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEService_Created1()
	 * @model unique="false"
	 * @generated
	 */
	Date getCreated1();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEService#getCreated1 <em>Created1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created1</em>' attribute.
	 * @see #getCreated1()
	 * @generated
	 */
	void setCreated1(Date value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(Date)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEService_Modified()
	 * @model unique="false"
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEService#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

	/**
	 * Returns the value of the '<em><b>Type Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Link.title is typeId
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Link</em>' containment reference.
	 * @see #setTypeLink(Link)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEService_TypeLink()
	 * @model containment="true"
	 * @generated
	 */
	Link getTypeLink();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEService#getTypeLink <em>Type Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Link</em>' containment reference.
	 * @see #getTypeLink()
	 * @generated
	 */
	void setTypeLink(Link value);

	/**
	 * Returns the value of the '<em><b>Vnf Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vnf Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vnf Id</em>' attribute.
	 * @see #setVnfId(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEService_VnfId()
	 * @model unique="false"
	 * @generated
	 */
	String getVnfId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEService#getVnfId <em>Vnf Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vnf Id</em>' attribute.
	 * @see #getVnfId()
	 * @generated
	 */
	void setVnfId(String value);

	/**
	 * Returns the value of the '<em><b>Vnf Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Link.title is vnfId
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vnf Link</em>' containment reference.
	 * @see #setVnfLink(Link)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEService_VnfLink()
	 * @model containment="true"
	 * @generated
	 */
	Link getVnfLink();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEService#getVnfLink <em>Vnf Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vnf Link</em>' containment reference.
	 * @see #getVnfLink()
	 * @generated
	 */
	void setVnfLink(Link value);

	/**
	 * Returns the value of the '<em><b>Vnf Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vnf Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vnf Type</em>' attribute.
	 * @see #setVnfType(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEService_VnfType()
	 * @model unique="false"
	 * @generated
	 */
	String getVnfType();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEService#getVnfType <em>Vnf Type</em>}' attribute.
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
	 *  Location information of the associated VNF
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vnf Location</em>' attribute.
	 * @see #setVnfLocation(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEService_VnfLocation()
	 * @model unique="false"
	 * @generated
	 */
	String getVnfLocation();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEService#getVnfLocation <em>Vnf Location</em>}' attribute.
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
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEService_DeploymentRef()
	 * @model unique="false"
	 * @generated
	 */
	String getDeploymentRef();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEService#getDeploymentRef <em>Deployment Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Ref</em>' attribute.
	 * @see #getDeploymentRef()
	 * @generated
	 */
	void setDeploymentRef(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEService_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<DCAEServiceComponent> getComponents();

} // DCAEService
