/**
 */
package org.openecomp.dcae.controller.service.cdap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Artifact With Config Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactWithConfigStep#getConfig <em>Config</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapLoadArtifactWithConfigStep()
 * @model
 * @generated
 */
public interface CdapLoadArtifactWithConfigStep extends CdapLoadArtifactStep {
	/**
	 * Returns the value of the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' attribute.
	 * @see #setConfig(String)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapLoadArtifactWithConfigStep_Config()
	 * @model unique="false"
	 * @generated
	 */
	String getConfig();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactWithConfigStep#getConfig <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' attribute.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(String value);

} // CdapLoadArtifactWithConfigStep
