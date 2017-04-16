/**
 */
package org.openecomp.dcae.controller.service.cdap.impl;

import org.eclipse.emf.ecore.EClass;

import org.openecomp.dcae.controller.service.cdap.CdapPackage;
import org.openecomp.dcae.controller.service.cdap.CdapStep;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CdapStepImpl extends NamedEntityImpl implements CdapStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdapStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdapPackage.Literals.CDAP_STEP;
	}

} //CdapStepImpl
