/**
 */
package org.openecomp.dcae.controller.inventory.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openecomp.dcae.controller.inventory.*;

import org.openecomp.ncomp.core.NamedEntity;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.inventory.InventoryPackage
 * @generated
 */
public class InventoryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InventoryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InventoryPackage.eINSTANCE;
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
	protected InventorySwitch<Adapter> modelSwitch =
		new InventorySwitch<Adapter>() {
			@Override
			public Adapter caseDcaeInventory(DcaeInventory object) {
				return createDcaeInventoryAdapter();
			}
			@Override
			public Adapter caseApiResponseMessage(ApiResponseMessage object) {
				return createApiResponseMessageAdapter();
			}
			@Override
			public Adapter caseDCAEServiceComponent(DCAEServiceComponent object) {
				return createDCAEServiceComponentAdapter();
			}
			@Override
			public Adapter caseDCAEServiceComponentRequest(DCAEServiceComponentRequest object) {
				return createDCAEServiceComponentRequestAdapter();
			}
			@Override
			public Adapter caseDCAEService(DCAEService object) {
				return createDCAEServiceAdapter();
			}
			@Override
			public Adapter caseDCAEServiceGroupByResults(DCAEServiceGroupByResults object) {
				return createDCAEServiceGroupByResultsAdapter();
			}
			@Override
			public Adapter caseDCAEServiceGroupByResultsPropertyValues(DCAEServiceGroupByResultsPropertyValues object) {
				return createDCAEServiceGroupByResultsPropertyValuesAdapter();
			}
			@Override
			public Adapter caseDCAEServiceRequest(DCAEServiceRequest object) {
				return createDCAEServiceRequestAdapter();
			}
			@Override
			public Adapter caseDCAEServiceType(DCAEServiceType object) {
				return createDCAEServiceTypeAdapter();
			}
			@Override
			public Adapter caseDCAEServiceTypeRequest(DCAEServiceTypeRequest object) {
				return createDCAEServiceTypeRequestAdapter();
			}
			@Override
			public Adapter caseDcaeServiceResults(DcaeServiceResults object) {
				return createDcaeServiceResultsAdapter();
			}
			@Override
			public Adapter caseDcaeServiceTypeResults(DcaeServiceTypeResults object) {
				return createDcaeServiceTypeResultsAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseUriBuilder(UriBuilder object) {
				return createUriBuilderAdapter();
			}
			@Override
			public Adapter caseInventoryConfigurationRule(InventoryConfigurationRule object) {
				return createInventoryConfigurationRuleAdapter();
			}
			@Override
			public Adapter caseNamedEntity(NamedEntity object) {
				return createNamedEntityAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.inventory.DcaeInventory <em>Dcae Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.inventory.DcaeInventory
	 * @generated
	 */
	public Adapter createDcaeInventoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.inventory.ApiResponseMessage <em>Api Response Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.inventory.ApiResponseMessage
	 * @generated
	 */
	public Adapter createApiResponseMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponent <em>DCAE Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceComponent
	 * @generated
	 */
	public Adapter createDCAEServiceComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest <em>DCAE Service Component Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest
	 * @generated
	 */
	public Adapter createDCAEServiceComponentRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.inventory.DCAEService <em>DCAE Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.inventory.DCAEService
	 * @generated
	 */
	public Adapter createDCAEServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults <em>DCAE Service Group By Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults
	 * @generated
	 */
	public Adapter createDCAEServiceGroupByResultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues <em>DCAE Service Group By Results Property Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues
	 * @generated
	 */
	public Adapter createDCAEServiceGroupByResultsPropertyValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.inventory.DCAEServiceRequest <em>DCAE Service Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceRequest
	 * @generated
	 */
	public Adapter createDCAEServiceRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.inventory.DCAEServiceType <em>DCAE Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceType
	 * @generated
	 */
	public Adapter createDCAEServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest <em>DCAE Service Type Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest
	 * @generated
	 */
	public Adapter createDCAEServiceTypeRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.inventory.DcaeServiceResults <em>Dcae Service Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.inventory.DcaeServiceResults
	 * @generated
	 */
	public Adapter createDcaeServiceResultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults <em>Dcae Service Type Results</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults
	 * @generated
	 */
	public Adapter createDcaeServiceTypeResultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.inventory.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.inventory.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.inventory.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.inventory.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.inventory.UriBuilder <em>Uri Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.inventory.UriBuilder
	 * @generated
	 */
	public Adapter createUriBuilderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.dcae.controller.inventory.InventoryConfigurationRule <em>Configuration Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.dcae.controller.inventory.InventoryConfigurationRule
	 * @generated
	 */
	public Adapter createInventoryConfigurationRuleAdapter() {
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

} //InventoryAdapterFactory
