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
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapDeployAppStep#getJarFile <em>Jar File</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapDeployAppStep()
 * @model
 * @generated
 */
public interface CdapDeployAppStep extends CdapStep {
	/**
	 * Returns the value of the '<em><b>Jar File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jar File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jar File</em>' attribute.
	 * @see #setJarFile(String)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapDeployAppStep_JarFile()
	 * @model unique="false"
	 * @generated
	 */
	String getJarFile();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapDeployAppStep#getJarFile <em>Jar File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jar File</em>' attribute.
	 * @see #getJarFile()
	 * @generated
	 */
	void setJarFile(String value);

} // CdapDeployAppStep
