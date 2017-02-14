
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
/**
 */
package org.openecomp.dcae.controller.core.service;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dcae Policy Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyName <em>Policy Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyDescription <em>Policy Description</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyConfigName <em>Policy Config Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyTemplateVersion <em>Policy Template Version</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyVersion <em>Policy Version</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyPriority <em>Policy Priority</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyScope <em>Policy Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaePolicyEntity()
 * @model abstract="true"
 * @generated
 */
public interface DcaePolicyEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Policy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Name</em>' attribute.
	 * @see #setPolicyName(String)
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaePolicyEntity_PolicyName()
	 * @model unique="false"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs::${path}.policyName'"
	 * @generated
	 */
	String getPolicyName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyName <em>Policy Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Name</em>' attribute.
	 * @see #getPolicyName()
	 * @generated
	 */
	void setPolicyName(String value);

	/**
	 * Returns the value of the '<em><b>Policy Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Description</em>' attribute.
	 * @see #setPolicyDescription(String)
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaePolicyEntity_PolicyDescription()
	 * @model unique="false"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs::${path}.policyDescription'"
	 * @generated
	 */
	String getPolicyDescription();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyDescription <em>Policy Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Description</em>' attribute.
	 * @see #getPolicyDescription()
	 * @generated
	 */
	void setPolicyDescription(String value);

	/**
	 * Returns the value of the '<em><b>Policy Config Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Config Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Config Name</em>' attribute.
	 * @see #setPolicyConfigName(String)
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaePolicyEntity_PolicyConfigName()
	 * @model unique="false"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs::${path}.policyConfigName'"
	 * @generated
	 */
	String getPolicyConfigName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyConfigName <em>Policy Config Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Config Name</em>' attribute.
	 * @see #getPolicyConfigName()
	 * @generated
	 */
	void setPolicyConfigName(String value);

	/**
	 * Returns the value of the '<em><b>Policy Template Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Template Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Template Version</em>' attribute.
	 * @see #setPolicyTemplateVersion(String)
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaePolicyEntity_PolicyTemplateVersion()
	 * @model unique="false"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs::${path}.policyTemplateVersion'"
	 * @generated
	 */
	String getPolicyTemplateVersion();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyTemplateVersion <em>Policy Template Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Template Version</em>' attribute.
	 * @see #getPolicyTemplateVersion()
	 * @generated
	 */
	void setPolicyTemplateVersion(String value);

	/**
	 * Returns the value of the '<em><b>Policy Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Version</em>' attribute.
	 * @see #setPolicyVersion(String)
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaePolicyEntity_PolicyVersion()
	 * @model unique="false"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs::${path}.policyVersion'"
	 * @generated
	 */
	String getPolicyVersion();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyVersion <em>Policy Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Version</em>' attribute.
	 * @see #getPolicyVersion()
	 * @generated
	 */
	void setPolicyVersion(String value);

	/**
	 * Returns the value of the '<em><b>Policy Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Priority</em>' attribute.
	 * @see #setPolicyPriority(String)
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaePolicyEntity_PolicyPriority()
	 * @model unique="false"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs::${path}.policyPriority'"
	 * @generated
	 */
	String getPolicyPriority();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyPriority <em>Policy Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Priority</em>' attribute.
	 * @see #getPolicyPriority()
	 * @generated
	 */
	void setPolicyPriority(String value);

	/**
	 * Returns the value of the '<em><b>Policy Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Scope</em>' attribute.
	 * @see #setPolicyScope(String)
	 * @see org.openecomp.dcae.controller.core.service.ServicePackage#getDcaePolicyEntity_PolicyScope()
	 * @model unique="false"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs::${path}.policyScope'"
	 * @generated
	 */
	String getPolicyScope();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.core.service.DcaePolicyEntity#getPolicyScope <em>Policy Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Scope</em>' attribute.
	 * @see #getPolicyScope()
	 * @generated
	 */
	void setPolicyScope(String value);

} // DcaePolicyEntity
