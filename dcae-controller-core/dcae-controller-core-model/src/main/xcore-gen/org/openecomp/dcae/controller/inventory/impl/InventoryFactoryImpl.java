/**
 */
package org.openecomp.dcae.controller.inventory.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openecomp.dcae.controller.inventory.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InventoryFactoryImpl extends EFactoryImpl implements InventoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InventoryFactory init() {
		try {
			InventoryFactory theInventoryFactory = (InventoryFactory)EPackage.Registry.INSTANCE.getEFactory(InventoryPackage.eNS_URI);
			if (theInventoryFactory != null) {
				return theInventoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InventoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryFactoryImpl() {
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
			case InventoryPackage.DCAE_INVENTORY: return createDcaeInventory();
			case InventoryPackage.API_RESPONSE_MESSAGE: return createApiResponseMessage();
			case InventoryPackage.DCAE_SERVICE_COMPONENT: return createDCAEServiceComponent();
			case InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST: return createDCAEServiceComponentRequest();
			case InventoryPackage.DCAE_SERVICE: return createDCAEService();
			case InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS: return createDCAEServiceGroupByResults();
			case InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES: return createDCAEServiceGroupByResultsPropertyValues();
			case InventoryPackage.DCAE_SERVICE_REQUEST: return createDCAEServiceRequest();
			case InventoryPackage.DCAE_SERVICE_TYPE: return createDCAEServiceType();
			case InventoryPackage.DCAE_SERVICE_TYPE_REQUEST: return createDCAEServiceTypeRequest();
			case InventoryPackage.DCAE_SERVICE_RESULTS: return createDcaeServiceResults();
			case InventoryPackage.DCAE_SERVICE_TYPE_RESULTS: return createDcaeServiceTypeResults();
			case InventoryPackage.LINK: return createLink();
			case InventoryPackage.PARAMETER: return createParameter();
			case InventoryPackage.URI_BUILDER: return createUriBuilder();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeInventory createDcaeInventory() {
		DcaeInventoryImpl dcaeInventory = new DcaeInventoryImpl();
		return dcaeInventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiResponseMessage createApiResponseMessage() {
		ApiResponseMessageImpl apiResponseMessage = new ApiResponseMessageImpl();
		return apiResponseMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCAEServiceComponent createDCAEServiceComponent() {
		DCAEServiceComponentImpl dcaeServiceComponent = new DCAEServiceComponentImpl();
		return dcaeServiceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCAEServiceComponentRequest createDCAEServiceComponentRequest() {
		DCAEServiceComponentRequestImpl dcaeServiceComponentRequest = new DCAEServiceComponentRequestImpl();
		return dcaeServiceComponentRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCAEService createDCAEService() {
		DCAEServiceImpl dcaeService = new DCAEServiceImpl();
		return dcaeService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCAEServiceGroupByResults createDCAEServiceGroupByResults() {
		DCAEServiceGroupByResultsImpl dcaeServiceGroupByResults = new DCAEServiceGroupByResultsImpl();
		return dcaeServiceGroupByResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCAEServiceGroupByResultsPropertyValues createDCAEServiceGroupByResultsPropertyValues() {
		DCAEServiceGroupByResultsPropertyValuesImpl dcaeServiceGroupByResultsPropertyValues = new DCAEServiceGroupByResultsPropertyValuesImpl();
		return dcaeServiceGroupByResultsPropertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCAEServiceRequest createDCAEServiceRequest() {
		DCAEServiceRequestImpl dcaeServiceRequest = new DCAEServiceRequestImpl();
		return dcaeServiceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCAEServiceType createDCAEServiceType() {
		DCAEServiceTypeImpl dcaeServiceType = new DCAEServiceTypeImpl();
		return dcaeServiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCAEServiceTypeRequest createDCAEServiceTypeRequest() {
		DCAEServiceTypeRequestImpl dcaeServiceTypeRequest = new DCAEServiceTypeRequestImpl();
		return dcaeServiceTypeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeServiceResults createDcaeServiceResults() {
		DcaeServiceResultsImpl dcaeServiceResults = new DcaeServiceResultsImpl();
		return dcaeServiceResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcaeServiceTypeResults createDcaeServiceTypeResults() {
		DcaeServiceTypeResultsImpl dcaeServiceTypeResults = new DcaeServiceTypeResultsImpl();
		return dcaeServiceTypeResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UriBuilder createUriBuilder() {
		UriBuilderImpl uriBuilder = new UriBuilderImpl();
		return uriBuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryPackage getInventoryPackage() {
		return (InventoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InventoryPackage getPackage() {
		return InventoryPackage.eINSTANCE;
	}

} //InventoryFactoryImpl
