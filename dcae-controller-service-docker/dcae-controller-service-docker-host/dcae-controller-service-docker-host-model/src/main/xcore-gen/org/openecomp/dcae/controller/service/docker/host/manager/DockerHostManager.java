
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
package org.openecomp.dcae.controller.service.docker.host.manager;

import org.openecomp.dcae.controller.core.service.HealthTestResponse;
import org.openecomp.dcae.controller.core.stream.DcaeStream;
import org.openecomp.dcae.controller.service.docker.host.service.DockerConfiguration;

import org.openecomp.dcae.controller.service.vmmanager.VirtualMachineManager;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker Host Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openecomp.dcae.controller.service.docker.host.manager.ManagerPackage#getDockerHostManager()
 * @model
 * @generated
 */
public interface DockerHostManager extends VirtualMachineManager, DockerConfiguration {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameUnique="false" oUnique="false" inputStreamsUnique="false" inputStreamsMany="true" outputStreamsUnique="false" outputStreamsMany="true"
	 * @generated
	 */
	void updateContainerConfiguration(String name, EObject o, EList<DcaeStream> inputStreams, EList<DcaeStream> outputStreams);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameUnique="false"
	 * @generated
	 */
	void suspendContainer(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameUnique="false"
	 * @generated
	 */
	void resumeContainer(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 * @generated
	 */
	HealthTestResponse testContainer(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serviceUnique="false" instanceUnique="false"
	 * @generated
	 */
	void setupConfiguration(String service, String instance);
} // DockerHostManager
