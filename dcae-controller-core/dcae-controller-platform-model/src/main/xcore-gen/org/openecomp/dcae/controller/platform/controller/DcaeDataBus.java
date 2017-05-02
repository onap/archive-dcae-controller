
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
package org.openecomp.dcae.controller.platform.controller;

import org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode;
import org.openecomp.dcae.controller.core.stream.DatabusLocation;
import org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster;
import org.openecomp.dcae.controller.core.stream.DatabusStream;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dcae Data Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.DcaeDataBus#getStreams <em>Streams</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.DcaeDataBus#getLocations <em>Locations</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.DcaeDataBus#getMrClusters <em>Mr Clusters</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.platform.controller.DcaeDataBus#getDrNodes <em>Dr Nodes</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getDcaeDataBus()
 * @model
 * @generated
 */
public interface DcaeDataBus extends EObject {
	/**
	 * Returns the value of the '<em><b>Streams</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.stream.DatabusStream}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Streams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Streams</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getDcaeDataBus_Streams()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DatabusStream> getStreams();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.stream.DatabusLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getDcaeDataBus_Locations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DatabusLocation> getLocations();

	/**
	 * Returns the value of the '<em><b>Mr Clusters</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mr Clusters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mr Clusters</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getDcaeDataBus_MrClusters()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DatabusMessageRouterCluster> getMrClusters();

	/**
	 * Returns the value of the '<em><b>Dr Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dr Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dr Nodes</em>' containment reference list.
	 * @see org.openecomp.dcae.controller.platform.controller.ControllerPackage#getDcaeDataBus_DrNodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DatabusDataRouterNode> getDrNodes();

} // DcaeDataBus
