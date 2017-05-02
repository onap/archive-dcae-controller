/**
 */
package org.openecomp.dcae.controller.inventory.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openecomp.dcae.controller.inventory.ApiResponseMessage;
import org.openecomp.dcae.controller.inventory.DCAEService;
import org.openecomp.dcae.controller.inventory.DCAEServiceComponent;
import org.openecomp.dcae.controller.inventory.DCAEServiceComponentRequest;
import org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults;
import org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResultsPropertyValues;
import org.openecomp.dcae.controller.inventory.DCAEServiceRequest;
import org.openecomp.dcae.controller.inventory.DCAEServiceType;
import org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest;
import org.openecomp.dcae.controller.inventory.DcaeInventory;
import org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults;
import org.openecomp.dcae.controller.inventory.DcaeServiceResults;
import org.openecomp.dcae.controller.inventory.InventoryFactory;
import org.openecomp.dcae.controller.inventory.InventoryPackage;
import org.openecomp.dcae.controller.inventory.Link;
import org.openecomp.dcae.controller.inventory.Parameter;
import org.openecomp.dcae.controller.inventory.UriBuilder;

import org.openecomp.ncomp.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InventoryPackageImpl extends EPackageImpl implements InventoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeInventoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiResponseMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeServiceComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeServiceComponentRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeServiceGroupByResultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeServiceGroupByResultsPropertyValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeServiceRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeServiceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeServiceTypeRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeServiceResultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dcaeServiceTypeResultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uriBuilderEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openecomp.dcae.controller.inventory.InventoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InventoryPackageImpl() {
		super(eNS_URI, InventoryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link InventoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InventoryPackage init() {
		if (isInited) return (InventoryPackage)EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI);

		// Obtain or create and register package
		InventoryPackageImpl theInventoryPackage = (InventoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InventoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InventoryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInventoryPackage.createPackageContents();

		// Initialize created meta-data
		theInventoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInventoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InventoryPackage.eNS_URI, theInventoryPackage);
		return theInventoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeInventory() {
		return dcaeInventoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeInventory_ServiceTypes() {
		return (EReference)dcaeInventoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeInventory_Services() {
		return (EReference)dcaeInventoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeInventory__GetDcaeServiceTypes__String_Boolean_Boolean_String_String_String_String_String_Integer() {
		return dcaeInventoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeInventory__DeleteDcaeServiceTypesType__String() {
		return dcaeInventoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeInventory__GetDcaeServiceTypesType__String() {
		return dcaeInventoryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeInventory__CreateDcaeServiceTypesTypeName__DCAEServiceTypeRequest() {
		return dcaeInventoryEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeInventory__GetDcaeServices__String_String_String_String_String_Boolean_String_Integer() {
		return dcaeInventoryEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeInventory__GetDcaeServicesGroupbyPropertyName__String() {
		return dcaeInventoryEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeInventory__DeleteDcaeServicesService__String() {
		return dcaeInventoryEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeInventory__GetDcaeServicesService__String() {
		return dcaeInventoryEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeInventory__CreateDcaeServicesService__String_DCAEServiceRequest() {
		return dcaeInventoryEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDcaeInventory__Poll() {
		return dcaeInventoryEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApiResponseMessage() {
		return apiResponseMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiResponseMessage_Code() {
		return (EAttribute)apiResponseMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiResponseMessage_Type() {
		return (EAttribute)apiResponseMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiResponseMessage_Message() {
		return (EAttribute)apiResponseMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDCAEServiceComponent() {
		return dcaeServiceComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceComponent_ComponentId() {
		return (EAttribute)dcaeServiceComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCAEServiceComponent_ComponentLink() {
		return (EReference)dcaeServiceComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceComponent_Created1() {
		return (EAttribute)dcaeServiceComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceComponent_Modified() {
		return (EAttribute)dcaeServiceComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceComponent_ComponentType() {
		return (EAttribute)dcaeServiceComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceComponent_ComponentSource() {
		return (EAttribute)dcaeServiceComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceComponent_Status() {
		return (EAttribute)dcaeServiceComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceComponent_Location() {
		return (EAttribute)dcaeServiceComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceComponent_Shareable() {
		return (EAttribute)dcaeServiceComponentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDCAEServiceComponentRequest() {
		return dcaeServiceComponentRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceComponentRequest_ComponentId() {
		return (EAttribute)dcaeServiceComponentRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceComponentRequest_ComponentType() {
		return (EAttribute)dcaeServiceComponentRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceComponentRequest_ComponentSource() {
		return (EAttribute)dcaeServiceComponentRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceComponentRequest_Shareable() {
		return (EAttribute)dcaeServiceComponentRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDCAEService() {
		return dcaeServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEService_ServiceId() {
		return (EAttribute)dcaeServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCAEService_SelfLink() {
		return (EReference)dcaeServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEService_Created1() {
		return (EAttribute)dcaeServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEService_Modified() {
		return (EAttribute)dcaeServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCAEService_TypeLink() {
		return (EReference)dcaeServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEService_VnfId() {
		return (EAttribute)dcaeServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCAEService_VnfLink() {
		return (EReference)dcaeServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEService_VnfType() {
		return (EAttribute)dcaeServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEService_VnfLocation() {
		return (EAttribute)dcaeServiceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEService_DeploymentRef() {
		return (EAttribute)dcaeServiceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCAEService_Components() {
		return (EReference)dcaeServiceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDCAEServiceGroupByResults() {
		return dcaeServiceGroupByResultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceGroupByResults_PropertyName() {
		return (EAttribute)dcaeServiceGroupByResultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCAEServiceGroupByResults_PropertyValues() {
		return (EReference)dcaeServiceGroupByResultsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDCAEServiceGroupByResultsPropertyValues() {
		return dcaeServiceGroupByResultsPropertyValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceGroupByResultsPropertyValues_Count() {
		return (EAttribute)dcaeServiceGroupByResultsPropertyValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceGroupByResultsPropertyValues_PropertyValue() {
		return (EAttribute)dcaeServiceGroupByResultsPropertyValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCAEServiceGroupByResultsPropertyValues_DcaeServiceQueryLink() {
		return (EReference)dcaeServiceGroupByResultsPropertyValuesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDCAEServiceRequest() {
		return dcaeServiceRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceRequest_TypeId() {
		return (EAttribute)dcaeServiceRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceRequest_VnfId() {
		return (EAttribute)dcaeServiceRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceRequest_VnfType() {
		return (EAttribute)dcaeServiceRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceRequest_VnfLocation() {
		return (EAttribute)dcaeServiceRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceRequest_DeploymentRef() {
		return (EAttribute)dcaeServiceRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCAEServiceRequest_Components() {
		return (EReference)dcaeServiceRequestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDCAEServiceType() {
		return dcaeServiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceType_Owner() {
		return (EAttribute)dcaeServiceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceType_TypeName() {
		return (EAttribute)dcaeServiceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceType_TypeVersion() {
		return (EAttribute)dcaeServiceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceType_BlueprintTemplate() {
		return (EAttribute)dcaeServiceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceType_ServiceIds() {
		return (EAttribute)dcaeServiceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceType_VnfTypes() {
		return (EAttribute)dcaeServiceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceType_ServiceLocations() {
		return (EAttribute)dcaeServiceTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceType_AsdcServiceId() {
		return (EAttribute)dcaeServiceTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceType_AsdcResourceId() {
		return (EAttribute)dcaeServiceTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceType_AsdcServiceURL() {
		return (EAttribute)dcaeServiceTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceType_TypeId() {
		return (EAttribute)dcaeServiceTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDCAEServiceType_SelfLink() {
		return (EReference)dcaeServiceTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceType_Created1() {
		return (EAttribute)dcaeServiceTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceType_Deactivated() {
		return (EAttribute)dcaeServiceTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDCAEServiceTypeRequest() {
		return dcaeServiceTypeRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceTypeRequest_Owner() {
		return (EAttribute)dcaeServiceTypeRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceTypeRequest_TypeName() {
		return (EAttribute)dcaeServiceTypeRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceTypeRequest_TypeVersion() {
		return (EAttribute)dcaeServiceTypeRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceTypeRequest_BlueprintTemplate() {
		return (EAttribute)dcaeServiceTypeRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceTypeRequest_ServiceIds() {
		return (EAttribute)dcaeServiceTypeRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceTypeRequest_VnfTypes() {
		return (EAttribute)dcaeServiceTypeRequestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceTypeRequest_ServiceLocations() {
		return (EAttribute)dcaeServiceTypeRequestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceTypeRequest_AsdcServiceId() {
		return (EAttribute)dcaeServiceTypeRequestEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceTypeRequest_AsdcResourceId() {
		return (EAttribute)dcaeServiceTypeRequestEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDCAEServiceTypeRequest_AsdcServiceURL() {
		return (EAttribute)dcaeServiceTypeRequestEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeServiceResults() {
		return dcaeServiceResultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeServiceResults_Links() {
		return (EReference)dcaeServiceResultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeServiceResults_TotalCount() {
		return (EAttribute)dcaeServiceResultsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeServiceResults_Items() {
		return (EReference)dcaeServiceResultsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDcaeServiceTypeResults() {
		return dcaeServiceTypeResultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeServiceTypeResults_Links() {
		return (EReference)dcaeServiceTypeResultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDcaeServiceTypeResults_TotalCount() {
		return (EAttribute)dcaeServiceTypeResultsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDcaeServiceTypeResults_Items() {
		return (EReference)dcaeServiceTypeResultsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Params() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Title() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Rel() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Href() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Uri() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_UriBuilder() {
		return (EReference)linkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Rels() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Type() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUriBuilder() {
		return uriBuilderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryFactory getInventoryFactory() {
		return (InventoryFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dcaeInventoryEClass = createEClass(DCAE_INVENTORY);
		createEReference(dcaeInventoryEClass, DCAE_INVENTORY__SERVICE_TYPES);
		createEReference(dcaeInventoryEClass, DCAE_INVENTORY__SERVICES);
		createEOperation(dcaeInventoryEClass, DCAE_INVENTORY___GET_DCAE_SERVICE_TYPES__STRING_BOOLEAN_BOOLEAN_STRING_STRING_STRING_STRING_STRING_INTEGER);
		createEOperation(dcaeInventoryEClass, DCAE_INVENTORY___DELETE_DCAE_SERVICE_TYPES_TYPE__STRING);
		createEOperation(dcaeInventoryEClass, DCAE_INVENTORY___GET_DCAE_SERVICE_TYPES_TYPE__STRING);
		createEOperation(dcaeInventoryEClass, DCAE_INVENTORY___CREATE_DCAE_SERVICE_TYPES_TYPE_NAME__DCAESERVICETYPEREQUEST);
		createEOperation(dcaeInventoryEClass, DCAE_INVENTORY___GET_DCAE_SERVICES__STRING_STRING_STRING_STRING_STRING_BOOLEAN_STRING_INTEGER);
		createEOperation(dcaeInventoryEClass, DCAE_INVENTORY___GET_DCAE_SERVICES_GROUPBY_PROPERTY_NAME__STRING);
		createEOperation(dcaeInventoryEClass, DCAE_INVENTORY___DELETE_DCAE_SERVICES_SERVICE__STRING);
		createEOperation(dcaeInventoryEClass, DCAE_INVENTORY___GET_DCAE_SERVICES_SERVICE__STRING);
		createEOperation(dcaeInventoryEClass, DCAE_INVENTORY___CREATE_DCAE_SERVICES_SERVICE__STRING_DCAESERVICEREQUEST);
		createEOperation(dcaeInventoryEClass, DCAE_INVENTORY___POLL);

		apiResponseMessageEClass = createEClass(API_RESPONSE_MESSAGE);
		createEAttribute(apiResponseMessageEClass, API_RESPONSE_MESSAGE__CODE);
		createEAttribute(apiResponseMessageEClass, API_RESPONSE_MESSAGE__TYPE);
		createEAttribute(apiResponseMessageEClass, API_RESPONSE_MESSAGE__MESSAGE);

		dcaeServiceComponentEClass = createEClass(DCAE_SERVICE_COMPONENT);
		createEAttribute(dcaeServiceComponentEClass, DCAE_SERVICE_COMPONENT__COMPONENT_ID);
		createEReference(dcaeServiceComponentEClass, DCAE_SERVICE_COMPONENT__COMPONENT_LINK);
		createEAttribute(dcaeServiceComponentEClass, DCAE_SERVICE_COMPONENT__CREATED1);
		createEAttribute(dcaeServiceComponentEClass, DCAE_SERVICE_COMPONENT__MODIFIED);
		createEAttribute(dcaeServiceComponentEClass, DCAE_SERVICE_COMPONENT__COMPONENT_TYPE);
		createEAttribute(dcaeServiceComponentEClass, DCAE_SERVICE_COMPONENT__COMPONENT_SOURCE);
		createEAttribute(dcaeServiceComponentEClass, DCAE_SERVICE_COMPONENT__STATUS);
		createEAttribute(dcaeServiceComponentEClass, DCAE_SERVICE_COMPONENT__LOCATION);
		createEAttribute(dcaeServiceComponentEClass, DCAE_SERVICE_COMPONENT__SHAREABLE);

		dcaeServiceComponentRequestEClass = createEClass(DCAE_SERVICE_COMPONENT_REQUEST);
		createEAttribute(dcaeServiceComponentRequestEClass, DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_ID);
		createEAttribute(dcaeServiceComponentRequestEClass, DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_TYPE);
		createEAttribute(dcaeServiceComponentRequestEClass, DCAE_SERVICE_COMPONENT_REQUEST__COMPONENT_SOURCE);
		createEAttribute(dcaeServiceComponentRequestEClass, DCAE_SERVICE_COMPONENT_REQUEST__SHAREABLE);

		dcaeServiceEClass = createEClass(DCAE_SERVICE);
		createEAttribute(dcaeServiceEClass, DCAE_SERVICE__SERVICE_ID);
		createEReference(dcaeServiceEClass, DCAE_SERVICE__SELF_LINK);
		createEAttribute(dcaeServiceEClass, DCAE_SERVICE__CREATED1);
		createEAttribute(dcaeServiceEClass, DCAE_SERVICE__MODIFIED);
		createEReference(dcaeServiceEClass, DCAE_SERVICE__TYPE_LINK);
		createEAttribute(dcaeServiceEClass, DCAE_SERVICE__VNF_ID);
		createEReference(dcaeServiceEClass, DCAE_SERVICE__VNF_LINK);
		createEAttribute(dcaeServiceEClass, DCAE_SERVICE__VNF_TYPE);
		createEAttribute(dcaeServiceEClass, DCAE_SERVICE__VNF_LOCATION);
		createEAttribute(dcaeServiceEClass, DCAE_SERVICE__DEPLOYMENT_REF);
		createEReference(dcaeServiceEClass, DCAE_SERVICE__COMPONENTS);

		dcaeServiceGroupByResultsEClass = createEClass(DCAE_SERVICE_GROUP_BY_RESULTS);
		createEAttribute(dcaeServiceGroupByResultsEClass, DCAE_SERVICE_GROUP_BY_RESULTS__PROPERTY_NAME);
		createEReference(dcaeServiceGroupByResultsEClass, DCAE_SERVICE_GROUP_BY_RESULTS__PROPERTY_VALUES);

		dcaeServiceGroupByResultsPropertyValuesEClass = createEClass(DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES);
		createEAttribute(dcaeServiceGroupByResultsPropertyValuesEClass, DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__COUNT);
		createEAttribute(dcaeServiceGroupByResultsPropertyValuesEClass, DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__PROPERTY_VALUE);
		createEReference(dcaeServiceGroupByResultsPropertyValuesEClass, DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES__DCAE_SERVICE_QUERY_LINK);

		dcaeServiceRequestEClass = createEClass(DCAE_SERVICE_REQUEST);
		createEAttribute(dcaeServiceRequestEClass, DCAE_SERVICE_REQUEST__TYPE_ID);
		createEAttribute(dcaeServiceRequestEClass, DCAE_SERVICE_REQUEST__VNF_ID);
		createEAttribute(dcaeServiceRequestEClass, DCAE_SERVICE_REQUEST__VNF_TYPE);
		createEAttribute(dcaeServiceRequestEClass, DCAE_SERVICE_REQUEST__VNF_LOCATION);
		createEAttribute(dcaeServiceRequestEClass, DCAE_SERVICE_REQUEST__DEPLOYMENT_REF);
		createEReference(dcaeServiceRequestEClass, DCAE_SERVICE_REQUEST__COMPONENTS);

		dcaeServiceTypeEClass = createEClass(DCAE_SERVICE_TYPE);
		createEAttribute(dcaeServiceTypeEClass, DCAE_SERVICE_TYPE__OWNER);
		createEAttribute(dcaeServiceTypeEClass, DCAE_SERVICE_TYPE__TYPE_NAME);
		createEAttribute(dcaeServiceTypeEClass, DCAE_SERVICE_TYPE__TYPE_VERSION);
		createEAttribute(dcaeServiceTypeEClass, DCAE_SERVICE_TYPE__BLUEPRINT_TEMPLATE);
		createEAttribute(dcaeServiceTypeEClass, DCAE_SERVICE_TYPE__SERVICE_IDS);
		createEAttribute(dcaeServiceTypeEClass, DCAE_SERVICE_TYPE__VNF_TYPES);
		createEAttribute(dcaeServiceTypeEClass, DCAE_SERVICE_TYPE__SERVICE_LOCATIONS);
		createEAttribute(dcaeServiceTypeEClass, DCAE_SERVICE_TYPE__ASDC_SERVICE_ID);
		createEAttribute(dcaeServiceTypeEClass, DCAE_SERVICE_TYPE__ASDC_RESOURCE_ID);
		createEAttribute(dcaeServiceTypeEClass, DCAE_SERVICE_TYPE__ASDC_SERVICE_URL);
		createEAttribute(dcaeServiceTypeEClass, DCAE_SERVICE_TYPE__TYPE_ID);
		createEReference(dcaeServiceTypeEClass, DCAE_SERVICE_TYPE__SELF_LINK);
		createEAttribute(dcaeServiceTypeEClass, DCAE_SERVICE_TYPE__CREATED1);
		createEAttribute(dcaeServiceTypeEClass, DCAE_SERVICE_TYPE__DEACTIVATED);

		dcaeServiceTypeRequestEClass = createEClass(DCAE_SERVICE_TYPE_REQUEST);
		createEAttribute(dcaeServiceTypeRequestEClass, DCAE_SERVICE_TYPE_REQUEST__OWNER);
		createEAttribute(dcaeServiceTypeRequestEClass, DCAE_SERVICE_TYPE_REQUEST__TYPE_NAME);
		createEAttribute(dcaeServiceTypeRequestEClass, DCAE_SERVICE_TYPE_REQUEST__TYPE_VERSION);
		createEAttribute(dcaeServiceTypeRequestEClass, DCAE_SERVICE_TYPE_REQUEST__BLUEPRINT_TEMPLATE);
		createEAttribute(dcaeServiceTypeRequestEClass, DCAE_SERVICE_TYPE_REQUEST__SERVICE_IDS);
		createEAttribute(dcaeServiceTypeRequestEClass, DCAE_SERVICE_TYPE_REQUEST__VNF_TYPES);
		createEAttribute(dcaeServiceTypeRequestEClass, DCAE_SERVICE_TYPE_REQUEST__SERVICE_LOCATIONS);
		createEAttribute(dcaeServiceTypeRequestEClass, DCAE_SERVICE_TYPE_REQUEST__ASDC_SERVICE_ID);
		createEAttribute(dcaeServiceTypeRequestEClass, DCAE_SERVICE_TYPE_REQUEST__ASDC_RESOURCE_ID);
		createEAttribute(dcaeServiceTypeRequestEClass, DCAE_SERVICE_TYPE_REQUEST__ASDC_SERVICE_URL);

		dcaeServiceResultsEClass = createEClass(DCAE_SERVICE_RESULTS);
		createEReference(dcaeServiceResultsEClass, DCAE_SERVICE_RESULTS__LINKS);
		createEAttribute(dcaeServiceResultsEClass, DCAE_SERVICE_RESULTS__TOTAL_COUNT);
		createEReference(dcaeServiceResultsEClass, DCAE_SERVICE_RESULTS__ITEMS);

		dcaeServiceTypeResultsEClass = createEClass(DCAE_SERVICE_TYPE_RESULTS);
		createEReference(dcaeServiceTypeResultsEClass, DCAE_SERVICE_TYPE_RESULTS__LINKS);
		createEAttribute(dcaeServiceTypeResultsEClass, DCAE_SERVICE_TYPE_RESULTS__TOTAL_COUNT);
		createEReference(dcaeServiceTypeResultsEClass, DCAE_SERVICE_TYPE_RESULTS__ITEMS);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__PARAMS);
		createEAttribute(linkEClass, LINK__TITLE);
		createEAttribute(linkEClass, LINK__REL);
		createEAttribute(linkEClass, LINK__HREF);
		createEAttribute(linkEClass, LINK__URI);
		createEReference(linkEClass, LINK__URI_BUILDER);
		createEAttribute(linkEClass, LINK__RELS);
		createEAttribute(linkEClass, LINK__TYPE);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__VALUE);

		uriBuilderEClass = createEClass(URI_BUILDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dcaeServiceComponentEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		dcaeServiceEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		dcaeServiceTypeEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		linkEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		parameterEClass.getESuperTypes().add(theCorePackage.getNamedEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(dcaeInventoryEClass, DcaeInventory.class, "DcaeInventory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDcaeInventory_ServiceTypes(), this.getDCAEServiceType(), null, "serviceTypes", null, 0, -1, DcaeInventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcaeInventory_Services(), this.getDCAEService(), null, "services", null, 0, -1, DcaeInventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDcaeInventory__GetDcaeServiceTypes__String_Boolean_Boolean_String_String_String_String_String_Integer(), this.getDcaeServiceTypeResults(), "getDcaeServiceTypes", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "typeName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBooleanObject(), "onlyLatest", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBooleanObject(), "onlyActive", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "vnfType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "serviceId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "serviceLocation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "asdcServiceId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "asdcResourceId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEIntegerObject(), "offset", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDcaeInventory__DeleteDcaeServiceTypesType__String(), this.getApiResponseMessage(), "deleteDcaeServiceTypesType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "typeId", 1, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDcaeInventory__GetDcaeServiceTypesType__String(), this.getDCAEServiceType(), "getDcaeServiceTypesType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "typeId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDcaeInventory__CreateDcaeServiceTypesTypeName__DCAEServiceTypeRequest(), this.getDCAEServiceType(), "createDcaeServiceTypesTypeName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDCAEServiceTypeRequest(), "body", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDcaeInventory__GetDcaeServices__String_String_String_String_String_Boolean_String_Integer(), this.getDcaeServiceResults(), "getDcaeServices", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "typeId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "vnfId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "vnfType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "vnfLocation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "componentType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBooleanObject(), "shareable", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "created", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEIntegerObject(), "offset", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDcaeInventory__GetDcaeServicesGroupbyPropertyName__String(), this.getDCAEServiceGroupByResults(), "getDcaeServicesGroupbyPropertyName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "propertyName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDcaeInventory__DeleteDcaeServicesService__String(), null, "deleteDcaeServicesService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "serviceId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDcaeInventory__GetDcaeServicesService__String(), this.getDCAEService(), "getDcaeServicesService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "serviceId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDcaeInventory__CreateDcaeServicesService__String_DCAEServiceRequest(), this.getDCAEService(), "createDcaeServicesService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "serviceId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDCAEServiceRequest(), "body", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDcaeInventory__Poll(), null, "poll", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(apiResponseMessageEClass, ApiResponseMessage.class, "ApiResponseMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApiResponseMessage_Code(), theEcorePackage.getEIntegerObject(), "code", null, 0, 1, ApiResponseMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiResponseMessage_Type(), theEcorePackage.getEString(), "type", null, 0, 1, ApiResponseMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiResponseMessage_Message(), theEcorePackage.getEString(), "message", null, 0, 1, ApiResponseMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcaeServiceComponentEClass, DCAEServiceComponent.class, "DCAEServiceComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDCAEServiceComponent_ComponentId(), theEcorePackage.getEString(), "componentId", null, 0, 1, DCAEServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCAEServiceComponent_ComponentLink(), this.getLink(), null, "componentLink", null, 0, 1, DCAEServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceComponent_Created1(), theEcorePackage.getEDate(), "created1", null, 0, 1, DCAEServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceComponent_Modified(), theEcorePackage.getEDate(), "modified", null, 0, 1, DCAEServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceComponent_ComponentType(), theEcorePackage.getEString(), "componentType", null, 0, 1, DCAEServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceComponent_ComponentSource(), theEcorePackage.getEString(), "componentSource", null, 0, 1, DCAEServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceComponent_Status(), theEcorePackage.getEString(), "status", null, 0, 1, DCAEServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceComponent_Location(), theEcorePackage.getEString(), "location", null, 0, 1, DCAEServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceComponent_Shareable(), theEcorePackage.getEIntegerObject(), "shareable", null, 0, 1, DCAEServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcaeServiceComponentRequestEClass, DCAEServiceComponentRequest.class, "DCAEServiceComponentRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDCAEServiceComponentRequest_ComponentId(), theEcorePackage.getEString(), "componentId", null, 0, 1, DCAEServiceComponentRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceComponentRequest_ComponentType(), theEcorePackage.getEString(), "componentType", null, 0, 1, DCAEServiceComponentRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceComponentRequest_ComponentSource(), theEcorePackage.getEString(), "componentSource", null, 0, 1, DCAEServiceComponentRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceComponentRequest_Shareable(), theEcorePackage.getEIntegerObject(), "shareable", null, 0, 1, DCAEServiceComponentRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcaeServiceEClass, DCAEService.class, "DCAEService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDCAEService_ServiceId(), theEcorePackage.getEString(), "serviceId", null, 0, 1, DCAEService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCAEService_SelfLink(), this.getLink(), null, "selfLink", null, 0, 1, DCAEService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEService_Created1(), theEcorePackage.getEDate(), "created1", null, 0, 1, DCAEService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEService_Modified(), theEcorePackage.getEDate(), "modified", null, 0, 1, DCAEService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCAEService_TypeLink(), this.getLink(), null, "typeLink", null, 0, 1, DCAEService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEService_VnfId(), theEcorePackage.getEString(), "vnfId", null, 0, 1, DCAEService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCAEService_VnfLink(), this.getLink(), null, "vnfLink", null, 0, 1, DCAEService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEService_VnfType(), theEcorePackage.getEString(), "vnfType", null, 0, 1, DCAEService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEService_VnfLocation(), theEcorePackage.getEString(), "vnfLocation", null, 0, 1, DCAEService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEService_DeploymentRef(), theEcorePackage.getEString(), "deploymentRef", null, 0, 1, DCAEService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCAEService_Components(), this.getDCAEServiceComponent(), null, "components", null, 0, -1, DCAEService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcaeServiceGroupByResultsEClass, DCAEServiceGroupByResults.class, "DCAEServiceGroupByResults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDCAEServiceGroupByResults_PropertyName(), theEcorePackage.getEString(), "propertyName", null, 0, 1, DCAEServiceGroupByResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCAEServiceGroupByResults_PropertyValues(), this.getDCAEServiceGroupByResultsPropertyValues(), null, "propertyValues", null, 0, -1, DCAEServiceGroupByResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcaeServiceGroupByResultsPropertyValuesEClass, DCAEServiceGroupByResultsPropertyValues.class, "DCAEServiceGroupByResultsPropertyValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDCAEServiceGroupByResultsPropertyValues_Count(), theEcorePackage.getEIntegerObject(), "count", null, 0, 1, DCAEServiceGroupByResultsPropertyValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceGroupByResultsPropertyValues_PropertyValue(), theEcorePackage.getEString(), "propertyValue", null, 0, 1, DCAEServiceGroupByResultsPropertyValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCAEServiceGroupByResultsPropertyValues_DcaeServiceQueryLink(), this.getLink(), null, "dcaeServiceQueryLink", null, 0, 1, DCAEServiceGroupByResultsPropertyValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcaeServiceRequestEClass, DCAEServiceRequest.class, "DCAEServiceRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDCAEServiceRequest_TypeId(), theEcorePackage.getEString(), "typeId", null, 0, 1, DCAEServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceRequest_VnfId(), theEcorePackage.getEString(), "vnfId", null, 0, 1, DCAEServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceRequest_VnfType(), theEcorePackage.getEString(), "vnfType", null, 0, 1, DCAEServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceRequest_VnfLocation(), theEcorePackage.getEString(), "vnfLocation", null, 0, 1, DCAEServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceRequest_DeploymentRef(), theEcorePackage.getEString(), "deploymentRef", null, 0, 1, DCAEServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCAEServiceRequest_Components(), this.getDCAEServiceComponentRequest(), null, "components", null, 0, -1, DCAEServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcaeServiceTypeEClass, DCAEServiceType.class, "DCAEServiceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDCAEServiceType_Owner(), theEcorePackage.getEString(), "owner", null, 0, 1, DCAEServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceType_TypeName(), theEcorePackage.getEString(), "typeName", null, 0, 1, DCAEServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceType_TypeVersion(), theEcorePackage.getEIntegerObject(), "typeVersion", null, 0, 1, DCAEServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceType_BlueprintTemplate(), theEcorePackage.getEString(), "blueprintTemplate", null, 0, 1, DCAEServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceType_ServiceIds(), theEcorePackage.getEString(), "serviceIds", null, 0, -1, DCAEServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceType_VnfTypes(), theEcorePackage.getEString(), "vnfTypes", null, 0, -1, DCAEServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceType_ServiceLocations(), theEcorePackage.getEString(), "serviceLocations", null, 0, -1, DCAEServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceType_AsdcServiceId(), theEcorePackage.getEString(), "asdcServiceId", null, 0, 1, DCAEServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceType_AsdcResourceId(), theEcorePackage.getEString(), "asdcResourceId", null, 0, 1, DCAEServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceType_AsdcServiceURL(), theEcorePackage.getEString(), "asdcServiceURL", null, 0, 1, DCAEServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceType_TypeId(), theEcorePackage.getEString(), "typeId", null, 0, 1, DCAEServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCAEServiceType_SelfLink(), this.getLink(), null, "selfLink", null, 0, 1, DCAEServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceType_Created1(), theEcorePackage.getEDate(), "created1", null, 0, 1, DCAEServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceType_Deactivated(), theEcorePackage.getEDate(), "deactivated", null, 0, 1, DCAEServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcaeServiceTypeRequestEClass, DCAEServiceTypeRequest.class, "DCAEServiceTypeRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDCAEServiceTypeRequest_Owner(), theEcorePackage.getEString(), "owner", null, 0, 1, DCAEServiceTypeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceTypeRequest_TypeName(), theEcorePackage.getEString(), "typeName", null, 0, 1, DCAEServiceTypeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceTypeRequest_TypeVersion(), theEcorePackage.getEIntegerObject(), "typeVersion", null, 0, 1, DCAEServiceTypeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceTypeRequest_BlueprintTemplate(), theEcorePackage.getEString(), "blueprintTemplate", null, 0, 1, DCAEServiceTypeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceTypeRequest_ServiceIds(), theEcorePackage.getEString(), "serviceIds", null, 0, -1, DCAEServiceTypeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceTypeRequest_VnfTypes(), theEcorePackage.getEString(), "vnfTypes", null, 0, -1, DCAEServiceTypeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceTypeRequest_ServiceLocations(), theEcorePackage.getEString(), "serviceLocations", null, 0, -1, DCAEServiceTypeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceTypeRequest_AsdcServiceId(), theEcorePackage.getEString(), "asdcServiceId", null, 0, 1, DCAEServiceTypeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceTypeRequest_AsdcResourceId(), theEcorePackage.getEString(), "asdcResourceId", null, 0, 1, DCAEServiceTypeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCAEServiceTypeRequest_AsdcServiceURL(), theEcorePackage.getEString(), "asdcServiceURL", null, 0, 1, DCAEServiceTypeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcaeServiceResultsEClass, DcaeServiceResults.class, "DcaeServiceResults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDcaeServiceResults_Links(), this.getLink(), null, "links", null, 0, -1, DcaeServiceResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeServiceResults_TotalCount(), theEcorePackage.getEIntegerObject(), "totalCount", null, 0, 1, DcaeServiceResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcaeServiceResults_Items(), this.getDCAEService(), null, "items", null, 0, -1, DcaeServiceResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dcaeServiceTypeResultsEClass, DcaeServiceTypeResults.class, "DcaeServiceTypeResults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDcaeServiceTypeResults_Links(), this.getLink(), null, "links", null, 0, -1, DcaeServiceTypeResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDcaeServiceTypeResults_TotalCount(), theEcorePackage.getEIntegerObject(), "totalCount", null, 0, 1, DcaeServiceTypeResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDcaeServiceTypeResults_Items(), this.getDCAEServiceType(), null, "items", null, 0, -1, DcaeServiceTypeResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Params(), this.getParameter(), null, "params", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Title(), theEcorePackage.getEString(), "title", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Rel(), theEcorePackage.getEString(), "rel", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Href(), theEcorePackage.getEString(), "href", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Uri(), theEcorePackage.getEString(), "uri", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_UriBuilder(), this.getUriBuilder(), null, "uriBuilder", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Rels(), theEcorePackage.getEString(), "rels", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Type(), theEcorePackage.getEString(), "type", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uriBuilderEClass, UriBuilder.class, "UriBuilder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //InventoryPackageImpl
