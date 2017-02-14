
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
package org.openecomp.dcae.controller.platform.controller.util;

import org.openecomp.dcae.controller.core.service.DcaeService;
import org.openecomp.dcae.controller.platform.controller.*;

import org.openecomp.dcae.controller.service.vm.VirtualMachineService;
import org.openecomp.ncomp.core.NamedEntity;
import org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer;
import org.openecomp.ncomp.sirius.manager.server.SouthBoundApi;
import org.openecomp.ncomp.sirius.manager.server.SouthBoundApiWithProxy;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage
 * @generated
 */
public class ControllerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ControllerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ControllerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerSwitch<Adapter> modelSwitch =
		new ControllerSwitch<Adapter>() {
			@Override
			public Adapter caseDcaePlatformController(DcaePlatformController object) {
				return createDcaePlatformControllerAdapter();
			}
			@Override
			public Adapter caseDcaeDataBus(DcaeDataBus object) {
				return createDcaeDataBusAdapter();
			}
			@Override
			public Adapter caseControllerCluster(ControllerCluster object) {
				return createControllerClusterAdapter();
			}
			@Override
			public Adapter caseControllerClusterServer(ControllerClusterServer object) {
				return createControllerClusterServerAdapter();
			}
			@Override
			public Adapter caseControllerClusterServerData(ControllerClusterServerData object) {
				return createControllerClusterServerDataAdapter();
			}
			@Override
			public Adapter caseControllerVirtualMachineService(ControllerVirtualMachineService object) {
				return createControllerVirtualMachineServiceAdapter();
			}
			@Override
			public Adapter caseSouthBoundApi(SouthBoundApi object) {
				return createSouthBoundApiAdapter();
			}
			@Override
			public Adapter caseSouthBoundApiWithProxy(SouthBoundApiWithProxy object) {
				return createSouthBoundApiWithProxyAdapter();
			}
			@Override
			public Adapter caseAbstractManagementServer(AbstractManagementServer object) {
				return createAbstractManagementServerAdapter();
			}
			@Override
			public Adapter caseNamedEntity(NamedEntity object) {
				return createNamedEntityAdapter();
			}
			@Override
			public Adapter caseDcaeService(DcaeService object) {
				return createDcaeServiceAdapter();
			}
			@Override
			public Adapter caseVirtualMachineService(VirtualMachineService object) {
				return createVirtualMachineServiceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.platform.controller.DcaePlatformController <em>Dcae Platform Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.platform.controller.DcaePlatformController
	 * @generated
	 */
	public Adapter createDcaePlatformControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.platform.controller.DcaeDataBus <em>Dcae Data Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.platform.controller.DcaeDataBus
	 * @generated
	 */
	public Adapter createDcaeDataBusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.platform.controller.ControllerCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerCluster
	 * @generated
	 */
	public Adapter createControllerClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServer <em>Cluster Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerClusterServer
	 * @generated
	 */
	public Adapter createControllerClusterServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData <em>Cluster Server Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData
	 * @generated
	 */
	public Adapter createControllerClusterServerDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.platform.controller.ControllerVirtualMachineService <em>Virtual Machine Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerVirtualMachineService
	 * @generated
	 */
	public Adapter createControllerVirtualMachineServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.server.SouthBoundApi <em>South Bound Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.server.SouthBoundApi
	 * @generated
	 */
	public Adapter createSouthBoundApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.server.SouthBoundApiWithProxy <em>South Bound Api With Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.server.SouthBoundApiWithProxy
	 * @generated
	 */
	public Adapter createSouthBoundApiWithProxyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer <em>Abstract Management Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer
	 * @generated
	 */
	public Adapter createAbstractManagementServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.core.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.core.NamedEntity
	 * @generated
	 */
	public Adapter createNamedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.service.DcaeService <em>Dcae Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.service.DcaeService
	 * @generated
	 */
	public Adapter createDcaeServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineService <em>Virtual Machine Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineService
	 * @generated
	 */
	public Adapter createVirtualMachineServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ControllerAdapterFactory
