
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
package org.openecomp.dcae.controller.service.dmaap.drsub.service.util;

import org.openecomp.dcae.controller.core.service.DcaeService;
import org.openecomp.dcae.controller.core.service.DcaeServiceInstance;

import org.openecomp.dcae.controller.service.dmaap.drsub.service.*;

import org.openecomp.dcae.controller.service.vm.VirtualMachineService;
import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceConfiguration;
import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance;

import org.openecomp.ncomp.core.NamedEntity;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage
 * @generated
 */
public class ServiceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ServicePackage.eINSTANCE;
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
	protected ServiceSwitch<Adapter> modelSwitch =
		new ServiceSwitch<Adapter>() {
			@Override
			public Adapter caseControllerServiceDmaapDrsubService(ControllerServiceDmaapDrsubService object) {
				return createControllerServiceDmaapDrsubServiceAdapter();
			}
			@Override
			public Adapter caseControllerServiceDmaapDrsubServiceInstance(ControllerServiceDmaapDrsubServiceInstance object) {
				return createControllerServiceDmaapDrsubServiceInstanceAdapter();
			}
			@Override
			public Adapter caseControllerServiceDmaapDrsubServiceConfiguration(ControllerServiceDmaapDrsubServiceConfiguration object) {
				return createControllerServiceDmaapDrsubServiceConfigurationAdapter();
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
			public Adapter caseDcaeServiceInstance(DcaeServiceInstance object) {
				return createDcaeServiceInstanceAdapter();
			}
			@Override
			public Adapter caseVirtualMachineServiceConfiguration(VirtualMachineServiceConfiguration object) {
				return createVirtualMachineServiceConfigurationAdapter();
			}
			@Override
			public Adapter caseVirtualMachineServiceInstance(VirtualMachineServiceInstance object) {
				return createVirtualMachineServiceInstanceAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubService <em>Controller Service Dmaap Drsub Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubService
	 * @generated
	 */
	public Adapter createControllerServiceDmaapDrsubServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceInstance <em>Controller Service Dmaap Drsub Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceInstance
	 * @generated
	 */
	public Adapter createControllerServiceDmaapDrsubServiceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration <em>Controller Service Dmaap Drsub Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration
	 * @generated
	 */
	public Adapter createControllerServiceDmaapDrsubServiceConfigurationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.core.service.DcaeServiceInstance <em>Dcae Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.core.service.DcaeServiceInstance
	 * @generated
	 */
	public Adapter createDcaeServiceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceConfiguration <em>Virtual Machine Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceConfiguration
	 * @generated
	 */
	public Adapter createVirtualMachineServiceConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance <em>Virtual Machine Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance
	 * @generated
	 */
	public Adapter createVirtualMachineServiceInstanceAdapter() {
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

} //ServiceAdapterFactory
