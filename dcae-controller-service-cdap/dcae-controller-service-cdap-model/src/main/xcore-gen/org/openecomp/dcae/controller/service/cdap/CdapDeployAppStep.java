/**
 */
package org.openecomp.dcae.controller.service.cdap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deploy App Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapDeployAppStep#getJarfile <em>Jarfile</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapDeployAppStep()
 * @model
 * @generated
 */
public interface CdapDeployAppStep extends CdapStep {
	/**
	 * Returns the value of the '<em><b>Jarfile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jarfile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jarfile</em>' attribute.
	 * @see #setJarfile(String)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapDeployAppStep_Jarfile()
	 * @model unique="false"
	 * @generated
	 */
	String getJarfile();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapDeployAppStep#getJarfile <em>Jarfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jarfile</em>' attribute.
	 * @see #getJarfile()
	 * @generated
	 */
	void setJarfile(String value);

} // CdapDeployAppStep
