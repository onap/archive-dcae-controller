
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

import org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode;
import org.openecomp.dcae.controller.core.stream.DatabusLocation;
import org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster;
import org.openecomp.dcae.controller.core.stream.DatabusStream;
import org.openecomp.dcae.controller.platform.controller.ControllerPackage;
import org.openecomp.dcae.controller.platform.controller.DcaeDataBus;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dcae Data Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.DcaeDataBusImpl#getStreams <em>Streams</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.DcaeDataBusImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.DcaeDataBusImpl#getMrClusters <em>Mr Clusters</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.impl.DcaeDataBusImpl#getDrNodes <em>Dr Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DcaeDataBusImpl extends MinimalEObjectImpl.Container implements DcaeDataBus {
	/**
	 * The cached value of the '{@link #getStreams() <em>Streams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreams()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabusStream> streams;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabusLocation> locations;
	/**
	 * The cached value of the '{@link #getMrClusters() <em>Mr Clusters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMrClusters()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabusMessageRouterCluster> mrClusters;
	/**
	 * The cached value of the '{@link #getDrNodes() <em>Dr Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabusDataRouterNode> drNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcaeDataBusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControllerPackage.Literals.DCAE_DATA_BUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabusStream> getStreams() {
		if (streams == null) {
			streams = new EObjectContainmentEList<DatabusStream>(DatabusStream.class, this, ControllerPackage.DCAE_DATA_BUS__STREAMS);
		}
		return streams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabusLocation> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<DatabusLocation>(DatabusLocation.class, this, ControllerPackage.DCAE_DATA_BUS__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabusMessageRouterCluster> getMrClusters() {
		if (mrClusters == null) {
			mrClusters = new EObjectContainmentEList<DatabusMessageRouterCluster>(DatabusMessageRouterCluster.class, this, ControllerPackage.DCAE_DATA_BUS__MR_CLUSTERS);
		}
		return mrClusters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabusDataRouterNode> getDrNodes() {
		if (drNodes == null) {
			drNodes = new EObjectContainmentEList<DatabusDataRouterNode>(DatabusDataRouterNode.class, this, ControllerPackage.DCAE_DATA_BUS__DR_NODES);
		}
		return drNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControllerPackage.DCAE_DATA_BUS__STREAMS:
				return ((InternalEList<?>)getStreams()).basicRemove(otherEnd, msgs);
			case ControllerPackage.DCAE_DATA_BUS__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case ControllerPackage.DCAE_DATA_BUS__MR_CLUSTERS:
				return ((InternalEList<?>)getMrClusters()).basicRemove(otherEnd, msgs);
			case ControllerPackage.DCAE_DATA_BUS__DR_NODES:
				return ((InternalEList<?>)getDrNodes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControllerPackage.DCAE_DATA_BUS__STREAMS:
				return getStreams();
			case ControllerPackage.DCAE_DATA_BUS__LOCATIONS:
				return getLocations();
			case ControllerPackage.DCAE_DATA_BUS__MR_CLUSTERS:
				return getMrClusters();
			case ControllerPackage.DCAE_DATA_BUS__DR_NODES:
				return getDrNodes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ControllerPackage.DCAE_DATA_BUS__STREAMS:
				getStreams().clear();
				getStreams().addAll((Collection<? extends DatabusStream>)newValue);
				return;
			case ControllerPackage.DCAE_DATA_BUS__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends DatabusLocation>)newValue);
				return;
			case ControllerPackage.DCAE_DATA_BUS__MR_CLUSTERS:
				getMrClusters().clear();
				getMrClusters().addAll((Collection<? extends DatabusMessageRouterCluster>)newValue);
				return;
			case ControllerPackage.DCAE_DATA_BUS__DR_NODES:
				getDrNodes().clear();
				getDrNodes().addAll((Collection<? extends DatabusDataRouterNode>)newValue);
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
			case ControllerPackage.DCAE_DATA_BUS__STREAMS:
				getStreams().clear();
				return;
			case ControllerPackage.DCAE_DATA_BUS__LOCATIONS:
				getLocations().clear();
				return;
			case ControllerPackage.DCAE_DATA_BUS__MR_CLUSTERS:
				getMrClusters().clear();
				return;
			case ControllerPackage.DCAE_DATA_BUS__DR_NODES:
				getDrNodes().clear();
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
			case ControllerPackage.DCAE_DATA_BUS__STREAMS:
				return streams != null && !streams.isEmpty();
			case ControllerPackage.DCAE_DATA_BUS__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case ControllerPackage.DCAE_DATA_BUS__MR_CLUSTERS:
				return mrClusters != null && !mrClusters.isEmpty();
			case ControllerPackage.DCAE_DATA_BUS__DR_NODES:
				return drNodes != null && !drNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DcaeDataBusImpl
