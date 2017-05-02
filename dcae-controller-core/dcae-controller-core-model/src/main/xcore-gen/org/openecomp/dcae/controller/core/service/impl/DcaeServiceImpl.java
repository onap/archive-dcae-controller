
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
package org.openecomp.dcae.controller.core.service.impl;

import org.openecomp.dcae.controller.core.service.DcaeService;
import org.openecomp.dcae.controller.core.service.HealthTestResponse;
import org.openecomp.dcae.controller.core.service.ServicePackage;
import org.openecomp.ncomp.core.impl.NamedEntityImpl;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dcae Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DcaeServiceImpl extends NamedEntityImpl implements DcaeService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcaeServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.DCAE_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deploy(String instanceName, String containerPath) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void undeploy(String instanceName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthTestResponse test(String instanceName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void suspend(String instanceName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resume(String instanceName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pushManagerConfiguration(String instanceName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pollManagerConfiguration(String instanceName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject managerConfiguration(String instanceName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONObject managerOperation(String instanceName, String operation, JSONObject parameters) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateConfigurationFromPolicy(String instanceName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void runHealthTests() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ServicePackage.DCAE_SERVICE___DEPLOY__STRING_STRING:
				deploy((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ServicePackage.DCAE_SERVICE___UNDEPLOY__STRING:
				undeploy((String)arguments.get(0));
				return null;
			case ServicePackage.DCAE_SERVICE___TEST__STRING:
				return test((String)arguments.get(0));
			case ServicePackage.DCAE_SERVICE___SUSPEND__STRING:
				suspend((String)arguments.get(0));
				return null;
			case ServicePackage.DCAE_SERVICE___RESUME__STRING:
				resume((String)arguments.get(0));
				return null;
			case ServicePackage.DCAE_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING:
				pushManagerConfiguration((String)arguments.get(0));
				return null;
			case ServicePackage.DCAE_SERVICE___POLL_MANAGER_CONFIGURATION__STRING:
				pollManagerConfiguration((String)arguments.get(0));
				return null;
			case ServicePackage.DCAE_SERVICE___MANAGER_CONFIGURATION__STRING:
				return managerConfiguration((String)arguments.get(0));
			case ServicePackage.DCAE_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT:
				return managerOperation((String)arguments.get(0), (String)arguments.get(1), (JSONObject)arguments.get(2));
			case ServicePackage.DCAE_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING:
				updateConfigurationFromPolicy((String)arguments.get(0));
				return null;
			case ServicePackage.DCAE_SERVICE___RUN_HEALTH_TESTS:
				runHealthTests();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DcaeServiceImpl
