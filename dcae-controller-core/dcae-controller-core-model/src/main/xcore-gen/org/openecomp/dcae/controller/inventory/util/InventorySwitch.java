/**
 */
package org.openecomp.dcae.controller.inventory.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.openecomp.dcae.controller.inventory.*;

import org.openecomp.ncomp.core.NamedEntity;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.inventory.InventoryPackage
 * @generated
 */
public class InventorySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InventoryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventorySwitch() {
		if (modelPackage == null) {
			modelPackage = InventoryPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InventoryPackage.DCAE_INVENTORY: {
				DcaeInventory dcaeInventory = (DcaeInventory)theEObject;
				T result = caseDcaeInventory(dcaeInventory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InventoryPackage.API_RESPONSE_MESSAGE: {
				ApiResponseMessage apiResponseMessage = (ApiResponseMessage)theEObject;
				T result = caseApiResponseMessage(apiResponseMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InventoryPackage.DCAE_SERVICE_COMPONENT: {
				DCAEServiceComponent dcaeServiceComponent = (DCAEServiceComponent)theEObject;
				T result = caseDCAEServiceComponent(dcaeServiceComponent);
				if (result == null) result = caseNamedEntity(dcaeServiceComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InventoryPackage.DCAE_SERVICE_COMPONENT_REQUEST: {
				DCAEServiceComponentRequest dcaeServiceComponentRequest = (DCAEServiceComponentRequest)theEObject;
				T result = caseDCAEServiceComponentRequest(dcaeServiceComponentRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InventoryPackage.DCAE_SERVICE: {
				DCAEService dcaeService = (DCAEService)theEObject;
				T result = caseDCAEService(dcaeService);
				if (result == null) result = caseNamedEntity(dcaeService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS: {
				DCAEServiceGroupByResults dcaeServiceGroupByResults = (DCAEServiceGroupByResults)theEObject;
				T result = caseDCAEServiceGroupByResults(dcaeServiceGroupByResults);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InventoryPackage.DCAE_SERVICE_GROUP_BY_RESULTS_PROPERTY_VALUES: {
				DCAEServiceGroupByResultsPropertyValues dcaeServiceGroupByResultsPropertyValues = (DCAEServiceGroupByResultsPropertyValues)theEObject;
				T result = caseDCAEServiceGroupByResultsPropertyValues(dcaeServiceGroupByResultsPropertyValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InventoryPackage.DCAE_SERVICE_REQUEST: {
				DCAEServiceRequest dcaeServiceRequest = (DCAEServiceRequest)theEObject;
				T result = caseDCAEServiceRequest(dcaeServiceRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InventoryPackage.DCAE_SERVICE_TYPE: {
				DCAEServiceType dcaeServiceType = (DCAEServiceType)theEObject;
				T result = caseDCAEServiceType(dcaeServiceType);
				if (result == null) result = caseNamedEntity(dcaeServiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InventoryPackage.DCAE_SERVICE_TYPE_REQUEST: {
				DCAEServiceTypeRequest dcaeServiceTypeRequest = (DCAEServiceTypeRequest)theEObject;
				T result = caseDCAEServiceTypeRequest(dcaeServiceTypeRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InventoryPackage.DCAE_SERVICE_RESULTS: {
				DcaeServiceResults dcaeServiceResults = (DcaeServiceResults)theEObject;
				T result = caseDcaeServiceResults(dcaeServiceResults);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InventoryPackage.DCAE_SERVICE_TYPE_RESULTS: {
				DcaeServiceTypeResults dcaeServiceTypeResults = (DcaeServiceTypeResults)theEObject;
				T result = caseDcaeServiceTypeResults(dcaeServiceTypeResults);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InventoryPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseNamedEntity(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InventoryPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseNamedEntity(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InventoryPackage.URI_BUILDER: {
				UriBuilder uriBuilder = (UriBuilder)theEObject;
				T result = caseUriBuilder(uriBuilder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Inventory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Inventory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeInventory(DcaeInventory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Api Response Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Api Response Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApiResponseMessage(ApiResponseMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCAE Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCAE Service Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCAEServiceComponent(DCAEServiceComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCAE Service Component Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCAE Service Component Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCAEServiceComponentRequest(DCAEServiceComponentRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCAE Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCAE Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCAEService(DCAEService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCAE Service Group By Results</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCAE Service Group By Results</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCAEServiceGroupByResults(DCAEServiceGroupByResults object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCAE Service Group By Results Property Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCAE Service Group By Results Property Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCAEServiceGroupByResultsPropertyValues(DCAEServiceGroupByResultsPropertyValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCAE Service Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCAE Service Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCAEServiceRequest(DCAEServiceRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCAE Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCAE Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCAEServiceType(DCAEServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCAE Service Type Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCAE Service Type Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCAEServiceTypeRequest(DCAEServiceTypeRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Service Results</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Service Results</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeServiceResults(DcaeServiceResults object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dcae Service Type Results</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dcae Service Type Results</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDcaeServiceTypeResults(DcaeServiceTypeResults object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uri Builder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uri Builder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUriBuilder(UriBuilder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //InventorySwitch
