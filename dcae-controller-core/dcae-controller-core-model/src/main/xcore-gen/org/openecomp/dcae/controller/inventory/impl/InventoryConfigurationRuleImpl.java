/**
 */
package org.openecomp.dcae.controller.inventory.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openecomp.dcae.controller.inventory.InventoryConfigurationRule;
import org.openecomp.dcae.controller.inventory.InventoryPackage;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.InventoryConfigurationRuleImpl#getTypeNameMatch <em>Type Name Match</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.InventoryConfigurationRuleImpl#getServiceNameMatch <em>Service Name Match</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.InventoryConfigurationRuleImpl#getInstanceNameMatch <em>Instance Name Match</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.inventory.impl.InventoryConfigurationRuleImpl#getBpNodeNameMatch <em>Bp Node Name Match</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryConfigurationRuleImpl extends NamedEntityImpl implements InventoryConfigurationRule {
	/**
	 * The default value of the '{@link #getTypeNameMatch() <em>Type Name Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeNameMatch()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_MATCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeNameMatch() <em>Type Name Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeNameMatch()
	 * @generated
	 * @ordered
	 */
	protected String typeNameMatch = TYPE_NAME_MATCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceNameMatch() <em>Service Name Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNameMatch()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_MATCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceNameMatch() <em>Service Name Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceNameMatch()
	 * @generated
	 * @ordered
	 */
	protected String serviceNameMatch = SERVICE_NAME_MATCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceNameMatch() <em>Instance Name Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceNameMatch()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_NAME_MATCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceNameMatch() <em>Instance Name Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceNameMatch()
	 * @generated
	 * @ordered
	 */
	protected String instanceNameMatch = INSTANCE_NAME_MATCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBpNodeNameMatch() <em>Bp Node Name Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpNodeNameMatch()
	 * @generated
	 * @ordered
	 */
	protected static final String BP_NODE_NAME_MATCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBpNodeNameMatch() <em>Bp Node Name Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpNodeNameMatch()
	 * @generated
	 * @ordered
	 */
	protected String bpNodeNameMatch = BP_NODE_NAME_MATCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryConfigurationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.INVENTORY_CONFIGURATION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeNameMatch() {
		return typeNameMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeNameMatch(String newTypeNameMatch) {
		String oldTypeNameMatch = typeNameMatch;
		typeNameMatch = newTypeNameMatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_CONFIGURATION_RULE__TYPE_NAME_MATCH, oldTypeNameMatch, typeNameMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceNameMatch() {
		return serviceNameMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceNameMatch(String newServiceNameMatch) {
		String oldServiceNameMatch = serviceNameMatch;
		serviceNameMatch = newServiceNameMatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_CONFIGURATION_RULE__SERVICE_NAME_MATCH, oldServiceNameMatch, serviceNameMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceNameMatch() {
		return instanceNameMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceNameMatch(String newInstanceNameMatch) {
		String oldInstanceNameMatch = instanceNameMatch;
		instanceNameMatch = newInstanceNameMatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_CONFIGURATION_RULE__INSTANCE_NAME_MATCH, oldInstanceNameMatch, instanceNameMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBpNodeNameMatch() {
		return bpNodeNameMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpNodeNameMatch(String newBpNodeNameMatch) {
		String oldBpNodeNameMatch = bpNodeNameMatch;
		bpNodeNameMatch = newBpNodeNameMatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_CONFIGURATION_RULE__BP_NODE_NAME_MATCH, oldBpNodeNameMatch, bpNodeNameMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.INVENTORY_CONFIGURATION_RULE__TYPE_NAME_MATCH:
				return getTypeNameMatch();
			case InventoryPackage.INVENTORY_CONFIGURATION_RULE__SERVICE_NAME_MATCH:
				return getServiceNameMatch();
			case InventoryPackage.INVENTORY_CONFIGURATION_RULE__INSTANCE_NAME_MATCH:
				return getInstanceNameMatch();
			case InventoryPackage.INVENTORY_CONFIGURATION_RULE__BP_NODE_NAME_MATCH:
				return getBpNodeNameMatch();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InventoryPackage.INVENTORY_CONFIGURATION_RULE__TYPE_NAME_MATCH:
				setTypeNameMatch((String)newValue);
				return;
			case InventoryPackage.INVENTORY_CONFIGURATION_RULE__SERVICE_NAME_MATCH:
				setServiceNameMatch((String)newValue);
				return;
			case InventoryPackage.INVENTORY_CONFIGURATION_RULE__INSTANCE_NAME_MATCH:
				setInstanceNameMatch((String)newValue);
				return;
			case InventoryPackage.INVENTORY_CONFIGURATION_RULE__BP_NODE_NAME_MATCH:
				setBpNodeNameMatch((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InventoryPackage.INVENTORY_CONFIGURATION_RULE__TYPE_NAME_MATCH:
				setTypeNameMatch(TYPE_NAME_MATCH_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_CONFIGURATION_RULE__SERVICE_NAME_MATCH:
				setServiceNameMatch(SERVICE_NAME_MATCH_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_CONFIGURATION_RULE__INSTANCE_NAME_MATCH:
				setInstanceNameMatch(INSTANCE_NAME_MATCH_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_CONFIGURATION_RULE__BP_NODE_NAME_MATCH:
				setBpNodeNameMatch(BP_NODE_NAME_MATCH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InventoryPackage.INVENTORY_CONFIGURATION_RULE__TYPE_NAME_MATCH:
				return TYPE_NAME_MATCH_EDEFAULT == null ? typeNameMatch != null : !TYPE_NAME_MATCH_EDEFAULT.equals(typeNameMatch);
			case InventoryPackage.INVENTORY_CONFIGURATION_RULE__SERVICE_NAME_MATCH:
				return SERVICE_NAME_MATCH_EDEFAULT == null ? serviceNameMatch != null : !SERVICE_NAME_MATCH_EDEFAULT.equals(serviceNameMatch);
			case InventoryPackage.INVENTORY_CONFIGURATION_RULE__INSTANCE_NAME_MATCH:
				return INSTANCE_NAME_MATCH_EDEFAULT == null ? instanceNameMatch != null : !INSTANCE_NAME_MATCH_EDEFAULT.equals(instanceNameMatch);
			case InventoryPackage.INVENTORY_CONFIGURATION_RULE__BP_NODE_NAME_MATCH:
				return BP_NODE_NAME_MATCH_EDEFAULT == null ? bpNodeNameMatch != null : !BP_NODE_NAME_MATCH_EDEFAULT.equals(bpNodeNameMatch);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (typeNameMatch: ");
		result.append(typeNameMatch);
		result.append(", serviceNameMatch: ");
		result.append(serviceNameMatch);
		result.append(", instanceNameMatch: ");
		result.append(instanceNameMatch);
		result.append(", bpNodeNameMatch: ");
		result.append(bpNodeNameMatch);
		result.append(')');
		return result.toString();
	}

} //InventoryConfigurationRuleImpl
