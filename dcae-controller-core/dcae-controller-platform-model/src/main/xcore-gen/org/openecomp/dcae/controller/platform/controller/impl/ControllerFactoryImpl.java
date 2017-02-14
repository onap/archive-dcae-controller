
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
package org.openecomp.dcae.controller.platform.controller.impl;

import org.openecomp.dcae.controller.platform.controller.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControllerFactoryImpl extends EFactoryImpl implements ControllerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ControllerFactory init() {
		try {
			ControllerFactory theControllerFactory = (ControllerFactory)EPackage.Registry.INSTANCE.getEFactory(ControllerPackage.eNS_URI);
			if (theControllerFactory != null) {
				return theControllerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ControllerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ControllerPackage.DCAE_PLATFORM_CONTROLLER: return createDcaePlatformController();
			case ControllerPackage.DCAE_DATA_BUS: return createDcaeDataBus();
			case ControllerPackage.CONTROLLER_CLUSTER: return createControllerCluster();
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER: return createControllerClusterServer();
			case ControllerPackage.CONTROLLER_CLUSTER_SERVER_DATA: return createControllerClusterServerData();
			case ControllerPackage.CONTROLLER_VIRTUAL_MACHINE_SERVICE: return createControllerVirtualMachineService();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ControllerPackage.SERVER_ROLE:
				return createServerRoleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ControllerPackage.SERVER_ROLE:
				return convertServerRoleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaePlatformController createDcaePlatformController() {
		DcaePlatformControllerImpl dcaePlatformController = new DcaePlatformControllerImpl();
		return dcaePlatformController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeDataBus createDcaeDataBus() {
		DcaeDataBusImpl dcaeDataBus = new DcaeDataBusImpl();
		return dcaeDataBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerCluster createControllerCluster() {
		ControllerClusterImpl controllerCluster = new ControllerClusterImpl();
		return controllerCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerClusterServer createControllerClusterServer() {
		ControllerClusterServerImpl controllerClusterServer = new ControllerClusterServerImpl();
		return controllerClusterServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerClusterServerData createControllerClusterServerData() {
		ControllerClusterServerDataImpl controllerClusterServerData = new ControllerClusterServerDataImpl();
		return controllerClusterServerData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerVirtualMachineService createControllerVirtualMachineService() {
		ControllerVirtualMachineServiceImpl controllerVirtualMachineService = new ControllerVirtualMachineServiceImpl();
		return controllerVirtualMachineService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerRole createServerRoleFromString(EDataType eDataType, String initialValue) {
		ServerRole result = ServerRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServerRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerPackage getControllerPackage() {
		return (ControllerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ControllerPackage getPackage() {
		return ControllerPackage.eINSTANCE;
	}

} //ControllerFactoryImpl
