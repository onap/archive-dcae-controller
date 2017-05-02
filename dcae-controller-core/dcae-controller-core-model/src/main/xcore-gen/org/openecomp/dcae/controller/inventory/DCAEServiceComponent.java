/**
 */
package org.openecomp.dcae.controller.inventory;

import java.util.Date;
import org.openecomp.ncomp.core.NamedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DCAE Service Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getComponentLink <em>Component Link</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getCreated1 <em>Created1</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getModified <em>Modified</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getComponentSource <em>Component Source</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getLocation <em>Location</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getShareable <em>Shareable</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceComponent()
 * @model
 * @generated
 */
public interface DCAEServiceComponent extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The id format is unique to the source
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Id</em>' attribute.
	 * @see #setComponentId(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceComponent_ComponentId()
	 * @model unique="false"
	 * @generated
	 */
	String getComponentId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getComponentId <em>Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id</em>' attribute.
	 * @see #getComponentId()
	 * @generated
	 */
	void setComponentId(String value);

	/**
	 * Returns the value of the '<em><b>Component Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Link to the underlying resource of this component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Link</em>' containment reference.
	 * @see #setComponentLink(Link)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceComponent_ComponentLink()
	 * @model containment="true"
	 * @generated
	 */
	Link getComponentLink();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getComponentLink <em>Component Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Link</em>' containment reference.
	 * @see #getComponentLink()
	 * @generated
	 */
	void setComponentLink(Link value);

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
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceComponent_Created1()
	 * @model unique="false"
	 * @generated
	 */
	Date getCreated1();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getCreated1 <em>Created1</em>}' attribute.
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
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceComponent_Modified()
	 * @model unique="false"
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

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
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceComponent_ComponentType()
	 * @model unique="false"
	 * @generated
	 */
	String getComponentType();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getComponentType <em>Component Type</em>}' attribute.
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
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceComponent_ComponentSource()
	 * @model unique="false"
	 * @generated
	 */
	String getComponentSource();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getComponentSource <em>Component Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Source</em>' attribute.
	 * @see #getComponentSource()
	 * @generated
	 */
	void setComponentSource(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceComponent_Status()
	 * @model unique="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Location information of the component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceComponent_Location()
	 * @model unique="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Shareable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Used to determine if this component can be shared amongst different DCAE services
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shareable</em>' attribute.
	 * @see #setShareable(Integer)
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#getDCAEServiceComponent_Shareable()
	 * @model unique="false"
	 * @generated
	 */
	Integer getShareable();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent#getShareable <em>Shareable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shareable</em>' attribute.
	 * @see #getShareable()
	 * @generated
	 */
	void setShareable(Integer value);

} // DCAEServiceComponent
