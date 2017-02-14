
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
package org.openecomp.dcae.controller.service.cdap.impl;

import org.openecomp.dcae.controller.service.cdap.*;

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
public class CdapFactoryImpl extends EFactoryImpl implements CdapFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CdapFactory init() {
		try {
			CdapFactory theCdapFactory = (CdapFactory)EPackage.Registry.INSTANCE.getEFactory(CdapPackage.eNS_URI);
			if (theCdapFactory != null) {
				return theCdapFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CdapFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapFactoryImpl() {
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
			case CdapPackage.CDAP_SERVICE: return createCdapService();
			case CdapPackage.CDAP_SERVICE_INSTANCE: return createCdapServiceInstance();
			case CdapPackage.CDAP_APPLICATION: return createCdapApplication();
			case CdapPackage.CDAP_ARTIFACT: return createCdapArtifact();
			case CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION: return createCdapServiceInstanceConfiguration();
			case CdapPackage.CDAP_INTERNAL_APPLICATION_CONFIGURATION: return createCdapInternalApplicationConfiguration();
			case CdapPackage.CDAP_SERVICE_DESCRIPTOR: return createCdapServiceDescriptor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapService createCdapService() {
		CdapServiceImpl cdapService = new CdapServiceImpl();
		return cdapService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapServiceInstance createCdapServiceInstance() {
		CdapServiceInstanceImpl cdapServiceInstance = new CdapServiceInstanceImpl();
		return cdapServiceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapApplication createCdapApplication() {
		CdapApplicationImpl cdapApplication = new CdapApplicationImpl();
		return cdapApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapArtifact createCdapArtifact() {
		CdapArtifactImpl cdapArtifact = new CdapArtifactImpl();
		return cdapArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapServiceInstanceConfiguration createCdapServiceInstanceConfiguration() {
		CdapServiceInstanceConfigurationImpl cdapServiceInstanceConfiguration = new CdapServiceInstanceConfigurationImpl();
		return cdapServiceInstanceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapInternalApplicationConfiguration createCdapInternalApplicationConfiguration() {
		CdapInternalApplicationConfigurationImpl cdapInternalApplicationConfiguration = new CdapInternalApplicationConfigurationImpl();
		return cdapInternalApplicationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapServiceDescriptor createCdapServiceDescriptor() {
		CdapServiceDescriptorImpl cdapServiceDescriptor = new CdapServiceDescriptorImpl();
		return cdapServiceDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapPackage getCdapPackage() {
		return (CdapPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CdapPackage getPackage() {
		return CdapPackage.eINSTANCE;
	}

} //CdapFactoryImpl
