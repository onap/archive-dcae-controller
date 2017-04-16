/**
 */
package org.openecomp.dcae.controller.service.cdap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create App With Config Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapCreateAppWithConfigStep#getAppConfig <em>App Config</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapCreateAppWithConfigStep()
 * @model
 * @generated
 */
public interface CdapCreateAppWithConfigStep extends CdapCreateAppStep {
	/**
	 * Returns the value of the '<em><b>App Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Config</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Config</em>' attribute.
	 * @see #setAppConfig(String)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapCreateAppWithConfigStep_AppConfig()
	 * @model unique="false"
	 * @generated
	 */
	String getAppConfig();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapCreateAppWithConfigStep#getAppConfig <em>App Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Config</em>' attribute.
	 * @see #getAppConfig()
	 * @generated
	 */
	void setAppConfig(String value);

} // CdapCreateAppWithConfigStep
