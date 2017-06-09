/**
 */
package org.openecomp.dcae.controller.service.cdap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop App Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapStopAppStep#getAppId <em>App Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapStopAppStep#getProgramTypes <em>Program Types</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapStopAppStep()
 * @model
 * @generated
 */
public interface CdapStopAppStep extends CdapStep {
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
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapStopAppStep_AppId()
	 * @model unique="false"
	 * @generated
	 */
	String getAppId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapStopAppStep#getAppId <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Id</em>' attribute.
	 * @see #getAppId()
	 * @generated
	 */
	void setAppId(String value);

	/**
	 * Returns the value of the '<em><b>Program Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Types</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Types</em>' attribute.
	 * @see #setProgramTypes(String)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapStopAppStep_ProgramTypes()
	 * @model unique="false"
	 * @generated
	 */
	String getProgramTypes();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapStopAppStep#getProgramTypes <em>Program Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Types</em>' attribute.
	 * @see #getProgramTypes()
	 * @generated
	 */
	void setProgramTypes(String value);

} // CdapStopAppStep
