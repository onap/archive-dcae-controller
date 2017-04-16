/**
 */
package org.openecomp.dcae.controller.service.cdap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Flow Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapStopFlowStep#getAppId <em>App Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapStopFlowStep#getFlowId <em>Flow Id</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapStopFlowStep()
 * @model
 * @generated
 */
public interface CdapStopFlowStep extends CdapStep {
	/**
	 * Returns the value of the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Id</em>' attribute.
	 * @see #setAppId(String)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapStopFlowStep_AppId()
	 * @model unique="false"
	 * @generated
	 */
	String getAppId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapStopFlowStep#getAppId <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Id</em>' attribute.
	 * @see #getAppId()
	 * @generated
	 */
	void setAppId(String value);

	/**
	 * Returns the value of the '<em><b>Flow Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Id</em>' attribute.
	 * @see #setFlowId(String)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapStopFlowStep_FlowId()
	 * @model unique="false"
	 * @generated
	 */
	String getFlowId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapStopFlowStep#getFlowId <em>Flow Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Id</em>' attribute.
	 * @see #getFlowId()
	 * @generated
	 */
	void setFlowId(String value);

} // CdapStopFlowStep
