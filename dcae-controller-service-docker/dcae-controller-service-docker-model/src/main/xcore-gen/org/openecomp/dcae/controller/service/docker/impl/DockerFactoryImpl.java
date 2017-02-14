
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
package org.openecomp.dcae.controller.service.docker.impl;

import org.openecomp.dcae.controller.service.docker.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerFactoryImpl extends EFactoryImpl implements DockerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DockerFactory init() {
		try {
			DockerFactory theDockerFactory = (DockerFactory)EPackage.Registry.INSTANCE.getEFactory(DockerPackage.eNS_URI);
			if (theDockerFactory != null) {
				return theDockerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DockerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerFactoryImpl() {
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
			case DockerPackage.DOCKER_SERVICE: return createDockerService();
			case DockerPackage.DOCKER_SERVICE_INSTANCE: return createDockerServiceInstance();
			case DockerPackage.DOCKER_CONFIGURATION: return createDockerConfiguration();
			case DockerPackage.DOCKER_SERVICE_DESCRIPTOR: return createDockerServiceDescriptor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerService createDockerService() {
		DockerServiceImpl dockerService = new DockerServiceImpl();
		return dockerService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerServiceInstance createDockerServiceInstance() {
		DockerServiceInstanceImpl dockerServiceInstance = new DockerServiceInstanceImpl();
		return dockerServiceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerConfiguration createDockerConfiguration() {
		DockerConfigurationImpl dockerConfiguration = new DockerConfigurationImpl();
		return dockerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerServiceDescriptor createDockerServiceDescriptor() {
		DockerServiceDescriptorImpl dockerServiceDescriptor = new DockerServiceDescriptorImpl();
		return dockerServiceDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerPackage getDockerPackage() {
		return (DockerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DockerPackage getPackage() {
		return DockerPackage.eINSTANCE;
	}

} //DockerFactoryImpl
