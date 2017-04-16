/**
 */
package org.openecomp.dcae.controller.service.cdap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resume Schedule Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapResumeScheduleStep#getAppId <em>App Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapResumeScheduleStep#getScheduleId <em>Schedule Id</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapResumeScheduleStep()
 * @model
 * @generated
 */
public interface CdapResumeScheduleStep extends CdapStep {
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
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapResumeScheduleStep_AppId()
	 * @model unique="false"
	 * @generated
	 */
	String getAppId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapResumeScheduleStep#getAppId <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Id</em>' attribute.
	 * @see #getAppId()
	 * @generated
	 */
	void setAppId(String value);

	/**
	 * Returns the value of the '<em><b>Schedule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Id</em>' attribute.
	 * @see #setScheduleId(String)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapResumeScheduleStep_ScheduleId()
	 * @model unique="false"
	 * @generated
	 */
	String getScheduleId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapResumeScheduleStep#getScheduleId <em>Schedule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Id</em>' attribute.
	 * @see #getScheduleId()
	 * @generated
	 */
	void setScheduleId(String value);

} // CdapResumeScheduleStep
