/**
 */
package org.openecomp.dcae.controller.service.cdap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Artifact Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep#getJarfile <em>Jarfile</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapLoadArtifactStep()
 * @model
 * @generated
 */
public interface CdapLoadArtifactStep extends CdapStep {

	/**
	 * Returns the value of the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Name</em>' attribute.
	 * @see #setArtifactName(String)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapLoadArtifactStep_ArtifactName()
	 * @model unique="false"
	 * @generated
	 */
	String getArtifactName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep#getArtifactName <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Name</em>' attribute.
	 * @see #getArtifactName()
	 * @generated
	 */
	void setArtifactName(String value);

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
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapLoadArtifactStep_Jarfile()
	 * @model unique="false"
	 * @generated
	 */
	String getJarfile();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep#getJarfile <em>Jarfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jarfile</em>' attribute.
	 * @see #getJarfile()
	 * @generated
	 */
	void setJarfile(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.openecomp.dcae.controller.service.cdap.CdapPackage#getCdapLoadArtifactStep_Version()
	 * @model unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);
} // CdapLoadArtifactStep
