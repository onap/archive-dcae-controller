
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
package org.openecomp.dcae.controller.service.cdap;

import org.openecomp.dcae.controller.core.service.ServicePackage;
import org.openecomp.ncomp.core.CorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openecomp.dcae.controller.service.cdap.CdapFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-controller-service-cdap-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.controller.service'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore ecomp='http://openecomp.org' cdap='http://openecomp.org/cdap'"
 * @generated
 */
public interface CdapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cdap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.dcae.controller.service.cdap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cdap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CdapPackage eINSTANCE = org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapServiceImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapService()
	 * @generated
	 */
	int CDAP_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE__NAME = ServicePackage.DCAE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE__LAST_POLLED = ServicePackage.DCAE_SERVICE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE__LAST_CHANGED = ServicePackage.DCAE_SERVICE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE__CREATED = ServicePackage.DCAE_SERVICE__CREATED;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE__INSTANCES = ServicePackage.DCAE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_FEATURE_COUNT = ServicePackage.DCAE_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Deploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE___DEPLOY__STRING_STRING = ServicePackage.DCAE_SERVICE___DEPLOY__STRING_STRING;

	/**
	 * The operation id for the '<em>Undeploy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE___UNDEPLOY__STRING = ServicePackage.DCAE_SERVICE___UNDEPLOY__STRING;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE___TEST__STRING = ServicePackage.DCAE_SERVICE___TEST__STRING;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE___SUSPEND__STRING = ServicePackage.DCAE_SERVICE___SUSPEND__STRING;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE___RESUME__STRING = ServicePackage.DCAE_SERVICE___RESUME__STRING;

	/**
	 * The operation id for the '<em>Push Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING = ServicePackage.DCAE_SERVICE___PUSH_MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Poll Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE___POLL_MANAGER_CONFIGURATION__STRING = ServicePackage.DCAE_SERVICE___POLL_MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Manager Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE___MANAGER_CONFIGURATION__STRING = ServicePackage.DCAE_SERVICE___MANAGER_CONFIGURATION__STRING;

	/**
	 * The operation id for the '<em>Manager Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT = ServicePackage.DCAE_SERVICE___MANAGER_OPERATION__STRING_STRING_JSONOBJECT;

	/**
	 * The operation id for the '<em>Update Configuration From Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING = ServicePackage.DCAE_SERVICE___UPDATE_CONFIGURATION_FROM_POLICY__STRING;

	/**
	 * The operation id for the '<em>Run Health Tests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE___RUN_HEALTH_TESTS = ServicePackage.DCAE_SERVICE___RUN_HEALTH_TESTS;

	/**
	 * The operation id for the '<em>Update Instance Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE___UPDATE_INSTANCE_CONFIGURATION__STRING = ServicePackage.DCAE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_OPERATION_COUNT = ServicePackage.DCAE_SERVICE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl <em>Service Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapServiceInstance()
	 * @generated
	 */
	int CDAP_SERVICE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__NAME = ServicePackage.DCAE_SERVICE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__LAST_POLLED = ServicePackage.DCAE_SERVICE_INSTANCE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__LAST_CHANGED = ServicePackage.DCAE_SERVICE_INSTANCE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__CREATED = ServicePackage.DCAE_SERVICE_INSTANCE__CREATED;

	/**
	 * The feature id for the '<em><b>Service Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__SERVICE_CONTAINER = ServicePackage.DCAE_SERVICE_INSTANCE__SERVICE_CONTAINER;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__STATUS = ServicePackage.DCAE_SERVICE_INSTANCE__STATUS;

	/**
	 * The feature id for the '<em><b>Input Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__INPUT_STREAMS = ServicePackage.DCAE_SERVICE_INSTANCE__INPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Output Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__OUTPUT_STREAMS = ServicePackage.DCAE_SERVICE_INSTANCE__OUTPUT_STREAMS;

	/**
	 * The feature id for the '<em><b>Last Health Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__LAST_HEALTH_TEST = ServicePackage.DCAE_SERVICE_INSTANCE__LAST_HEALTH_TEST;

	/**
	 * The feature id for the '<em><b>Health Test Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__HEALTH_TEST_STATUS = ServicePackage.DCAE_SERVICE_INSTANCE__HEALTH_TEST_STATUS;

	/**
	 * The feature id for the '<em><b>Health Test Message Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE = ServicePackage.DCAE_SERVICE_INSTANCE__HEALTH_TEST_MESSAGE_CODE;

	/**
	 * The feature id for the '<em><b>Cdap Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__CDAP_NAME = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__NAMESPACE = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>App Jar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__APP_JAR = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>App Config File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__APP_CONFIG_FILE = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__ARTIFACTS = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Apps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__APPS = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>App Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__APP_NAMES = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Worker Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__WORKER_NAMES = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Flow Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__FLOW_NAMES = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Service Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__SERVICE_NAMES = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__CONFIGURATION = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Cdap Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__CDAP_CONFIGURATION = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Cluster Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__CLUSTER_SERVICE = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Cdap Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__CDAP_NAMESPACE = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__SERVICE = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE_FEATURE_COUNT = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE_OPERATION_COUNT = ServicePackage.DCAE_SERVICE_INSTANCE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapApplicationImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapApplication()
	 * @generated
	 */
	int CDAP_APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Jar File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION__JAR_FILE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION__ARTIFACT_NAME = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION__VERSION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>App Config File Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION__APP_CONFIG_FILE_CONTENT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapArtifactImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapArtifact()
	 * @generated
	 */
	int CDAP_ARTIFACT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ARTIFACT__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ARTIFACT__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ARTIFACT__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ARTIFACT__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Jar File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ARTIFACT__JAR_FILE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ARTIFACT__VERSION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ARTIFACT_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ARTIFACT_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceConfigurationImpl <em>Service Instance Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceConfigurationImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapServiceInstanceConfiguration()
	 * @generated
	 */
	int CDAP_SERVICE_INSTANCE_CONFIGURATION = 4;

	/**
	 * The number of structural features of the '<em>Service Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Instance Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE_CONFIGURATION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapInternalApplicationConfigurationImpl <em>Internal Application Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapInternalApplicationConfigurationImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapInternalApplicationConfiguration()
	 * @generated
	 */
	int CDAP_INTERNAL_APPLICATION_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_INTERNAL_APPLICATION_CONFIGURATION__CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_INTERNAL_APPLICATION_CONFIGURATION__PREFERENCES = 1;

	/**
	 * The feature id for the '<em><b>Apps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_INTERNAL_APPLICATION_CONFIGURATION__APPS = 2;

	/**
	 * The feature id for the '<em><b>Workers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_INTERNAL_APPLICATION_CONFIGURATION__WORKERS = 3;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_INTERNAL_APPLICATION_CONFIGURATION__FLOWS = 4;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_INTERNAL_APPLICATION_CONFIGURATION__SERVICES = 5;

	/**
	 * The number of structural features of the '<em>Internal Application Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_INTERNAL_APPLICATION_CONFIGURATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Internal Application Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_INTERNAL_APPLICATION_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceDescriptorImpl <em>Service Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapServiceDescriptorImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapServiceDescriptor()
	 * @generated
	 */
	int CDAP_SERVICE_DESCRIPTOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_DESCRIPTOR__NAME = ServicePackage.DCAE_SERVICE_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_DESCRIPTOR__LAST_POLLED = ServicePackage.DCAE_SERVICE_DESCRIPTOR__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_DESCRIPTOR__LAST_CHANGED = ServicePackage.DCAE_SERVICE_DESCRIPTOR__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_DESCRIPTOR__CREATED = ServicePackage.DCAE_SERVICE_DESCRIPTOR__CREATED;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_DESCRIPTOR__GROUP_ID = ServicePackage.DCAE_SERVICE_DESCRIPTOR__GROUP_ID;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_DESCRIPTOR__ARTIFACT = ServicePackage.DCAE_SERVICE_DESCRIPTOR__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_DESCRIPTOR__VERSION = ServicePackage.DCAE_SERVICE_DESCRIPTOR__VERSION;

	/**
	 * The feature id for the '<em><b>Service Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_DESCRIPTOR__SERVICE_PACKAGE = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_DESCRIPTOR__SERVICE_CLASS = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jar File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_DESCRIPTOR__JAR_FILE = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_DESCRIPTOR_FEATURE_COUNT = ServicePackage.DCAE_SERVICE_DESCRIPTOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Service Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_DESCRIPTOR_OPERATION_COUNT = ServicePackage.DCAE_SERVICE_DESCRIPTOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapService
	 * @generated
	 */
	EClass getCdapService();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.cdap.CdapService#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapService#getInstances()
	 * @see #getCdapService()
	 * @generated
	 */
	EReference getCdapService_Instances();

	/**
	 * Returns the meta object for the '{@link org.openecomp.dcae.controller.service.cdap.CdapService#updateInstanceConfiguration(java.lang.String) <em>Update Instance Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Instance Configuration</em>' operation.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapService#updateInstanceConfiguration(java.lang.String)
	 * @generated
	 */
	EOperation getCdapService__UpdateInstanceConfiguration__String();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance <em>Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Instance</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance
	 * @generated
	 */
	EClass getCdapServiceInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getCdapName <em>Cdap Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cdap Name</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getCdapName()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EAttribute getCdapServiceInstance_CdapName();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getCdapNamespace <em>Cdap Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cdap Namespace</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getCdapNamespace()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EReference getCdapServiceInstance_CdapNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getNamespace()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EAttribute getCdapServiceInstance_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getAppJar <em>App Jar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Jar</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getAppJar()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EAttribute getCdapServiceInstance_AppJar();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getAppConfigFile <em>App Config File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Config File</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getAppConfigFile()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EAttribute getCdapServiceInstance_AppConfigFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getArtifacts()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EReference getCdapServiceInstance_Artifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getApps <em>Apps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apps</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getApps()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EReference getCdapServiceInstance_Apps();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getAppNames <em>App Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>App Names</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getAppNames()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EAttribute getCdapServiceInstance_AppNames();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getWorkerNames <em>Worker Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Worker Names</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getWorkerNames()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EAttribute getCdapServiceInstance_WorkerNames();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getFlowNames <em>Flow Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Flow Names</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getFlowNames()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EAttribute getCdapServiceInstance_FlowNames();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getServiceNames <em>Service Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Service Names</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getServiceNames()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EAttribute getCdapServiceInstance_ServiceNames();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getConfiguration()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EReference getCdapServiceInstance_Configuration();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getCdapConfiguration <em>Cdap Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cdap Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getCdapConfiguration()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EReference getCdapServiceInstance_CdapConfiguration();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getClusterService <em>Cluster Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cluster Service</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getClusterService()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EReference getCdapServiceInstance_ClusterService();

	/**
	 * Returns the meta object for the container reference '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getService()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EReference getCdapServiceInstance_Service();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapApplication
	 * @generated
	 */
	EClass getCdapApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapApplication#getJarFile <em>Jar File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jar File</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapApplication#getJarFile()
	 * @see #getCdapApplication()
	 * @generated
	 */
	EAttribute getCdapApplication_JarFile();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapApplication#getArtifactName <em>Artifact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Name</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapApplication#getArtifactName()
	 * @see #getCdapApplication()
	 * @generated
	 */
	EAttribute getCdapApplication_ArtifactName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapApplication#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapApplication#getVersion()
	 * @see #getCdapApplication()
	 * @generated
	 */
	EAttribute getCdapApplication_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapApplication#getAppConfigFileContent <em>App Config File Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Config File Content</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapApplication#getAppConfigFileContent()
	 * @see #getCdapApplication()
	 * @generated
	 */
	EAttribute getCdapApplication_AppConfigFileContent();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapArtifact
	 * @generated
	 */
	EClass getCdapArtifact();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapArtifact#getJarFile <em>Jar File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jar File</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapArtifact#getJarFile()
	 * @see #getCdapArtifact()
	 * @generated
	 */
	EAttribute getCdapArtifact_JarFile();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapArtifact#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapArtifact#getVersion()
	 * @see #getCdapArtifact()
	 * @generated
	 */
	EAttribute getCdapArtifact_Version();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstanceConfiguration <em>Service Instance Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Instance Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstanceConfiguration
	 * @generated
	 */
	EClass getCdapServiceInstanceConfiguration();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration <em>Internal Application Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Application Configuration</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration
	 * @generated
	 */
	EClass getCdapInternalApplicationConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration#getConfig()
	 * @see #getCdapInternalApplicationConfiguration()
	 * @generated
	 */
	EReference getCdapInternalApplicationConfiguration_Config();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration#getPreferences <em>Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preferences</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration#getPreferences()
	 * @see #getCdapInternalApplicationConfiguration()
	 * @generated
	 */
	EReference getCdapInternalApplicationConfiguration_Preferences();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration#getApps <em>Apps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apps</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration#getApps()
	 * @see #getCdapInternalApplicationConfiguration()
	 * @generated
	 */
	EReference getCdapInternalApplicationConfiguration_Apps();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration#getWorkers <em>Workers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workers</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration#getWorkers()
	 * @see #getCdapInternalApplicationConfiguration()
	 * @generated
	 */
	EReference getCdapInternalApplicationConfiguration_Workers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flows</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration#getFlows()
	 * @see #getCdapInternalApplicationConfiguration()
	 * @generated
	 */
	EReference getCdapInternalApplicationConfiguration_Flows();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapInternalApplicationConfiguration#getServices()
	 * @see #getCdapInternalApplicationConfiguration()
	 * @generated
	 */
	EReference getCdapInternalApplicationConfiguration_Services();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor <em>Service Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Descriptor</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor
	 * @generated
	 */
	EClass getCdapServiceDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor#getServicePackage <em>Service Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Package</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor#getServicePackage()
	 * @see #getCdapServiceDescriptor()
	 * @generated
	 */
	EAttribute getCdapServiceDescriptor_ServicePackage();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor#getServiceClass <em>Service Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Class</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor#getServiceClass()
	 * @see #getCdapServiceDescriptor()
	 * @generated
	 */
	EAttribute getCdapServiceDescriptor_ServiceClass();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor#getServiceInstanceClass <em>Service Instance Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Instance Class</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor#getServiceInstanceClass()
	 * @see #getCdapServiceDescriptor()
	 * @generated
	 */
	EAttribute getCdapServiceDescriptor_ServiceInstanceClass();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor#getJarFile <em>Jar File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jar File</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceDescriptor#getJarFile()
	 * @see #getCdapServiceDescriptor()
	 * @generated
	 */
	EAttribute getCdapServiceDescriptor_JarFile();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CdapFactory getCdapFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapServiceImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapService()
		 * @generated
		 */
		EClass CDAP_SERVICE = eINSTANCE.getCdapService();
		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_SERVICE__INSTANCES = eINSTANCE.getCdapService_Instances();
		/**
		 * The meta object literal for the '<em><b>Update Instance Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_SERVICE___UPDATE_INSTANCE_CONFIGURATION__STRING = eINSTANCE.getCdapService__UpdateInstanceConfiguration__String();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl <em>Service Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapServiceInstance()
		 * @generated
		 */
		EClass CDAP_SERVICE_INSTANCE = eINSTANCE.getCdapServiceInstance();
		/**
		 * The meta object literal for the '<em><b>Cdap Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_SERVICE_INSTANCE__CDAP_NAME = eINSTANCE.getCdapServiceInstance_CdapName();
		/**
		 * The meta object literal for the '<em><b>Cdap Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_SERVICE_INSTANCE__CDAP_NAMESPACE = eINSTANCE.getCdapServiceInstance_CdapNamespace();
		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_SERVICE_INSTANCE__NAMESPACE = eINSTANCE.getCdapServiceInstance_Namespace();
		/**
		 * The meta object literal for the '<em><b>App Jar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_SERVICE_INSTANCE__APP_JAR = eINSTANCE.getCdapServiceInstance_AppJar();
		/**
		 * The meta object literal for the '<em><b>App Config File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_SERVICE_INSTANCE__APP_CONFIG_FILE = eINSTANCE.getCdapServiceInstance_AppConfigFile();
		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_SERVICE_INSTANCE__ARTIFACTS = eINSTANCE.getCdapServiceInstance_Artifacts();
		/**
		 * The meta object literal for the '<em><b>Apps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_SERVICE_INSTANCE__APPS = eINSTANCE.getCdapServiceInstance_Apps();
		/**
		 * The meta object literal for the '<em><b>App Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_SERVICE_INSTANCE__APP_NAMES = eINSTANCE.getCdapServiceInstance_AppNames();
		/**
		 * The meta object literal for the '<em><b>Worker Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_SERVICE_INSTANCE__WORKER_NAMES = eINSTANCE.getCdapServiceInstance_WorkerNames();
		/**
		 * The meta object literal for the '<em><b>Flow Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_SERVICE_INSTANCE__FLOW_NAMES = eINSTANCE.getCdapServiceInstance_FlowNames();
		/**
		 * The meta object literal for the '<em><b>Service Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_SERVICE_INSTANCE__SERVICE_NAMES = eINSTANCE.getCdapServiceInstance_ServiceNames();
		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_SERVICE_INSTANCE__CONFIGURATION = eINSTANCE.getCdapServiceInstance_Configuration();
		/**
		 * The meta object literal for the '<em><b>Cdap Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_SERVICE_INSTANCE__CDAP_CONFIGURATION = eINSTANCE.getCdapServiceInstance_CdapConfiguration();
		/**
		 * The meta object literal for the '<em><b>Cluster Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_SERVICE_INSTANCE__CLUSTER_SERVICE = eINSTANCE.getCdapServiceInstance_ClusterService();
		/**
		 * The meta object literal for the '<em><b>Service</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_SERVICE_INSTANCE__SERVICE = eINSTANCE.getCdapServiceInstance_Service();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapApplicationImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapApplication()
		 * @generated
		 */
		EClass CDAP_APPLICATION = eINSTANCE.getCdapApplication();
		/**
		 * The meta object literal for the '<em><b>Jar File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_APPLICATION__JAR_FILE = eINSTANCE.getCdapApplication_JarFile();
		/**
		 * The meta object literal for the '<em><b>Artifact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_APPLICATION__ARTIFACT_NAME = eINSTANCE.getCdapApplication_ArtifactName();
		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_APPLICATION__VERSION = eINSTANCE.getCdapApplication_Version();
		/**
		 * The meta object literal for the '<em><b>App Config File Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_APPLICATION__APP_CONFIG_FILE_CONTENT = eINSTANCE.getCdapApplication_AppConfigFileContent();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapArtifactImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapArtifact()
		 * @generated
		 */
		EClass CDAP_ARTIFACT = eINSTANCE.getCdapArtifact();
		/**
		 * The meta object literal for the '<em><b>Jar File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_ARTIFACT__JAR_FILE = eINSTANCE.getCdapArtifact_JarFile();
		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_ARTIFACT__VERSION = eINSTANCE.getCdapArtifact_Version();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceConfigurationImpl <em>Service Instance Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceConfigurationImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapServiceInstanceConfiguration()
		 * @generated
		 */
		EClass CDAP_SERVICE_INSTANCE_CONFIGURATION = eINSTANCE.getCdapServiceInstanceConfiguration();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapInternalApplicationConfigurationImpl <em>Internal Application Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapInternalApplicationConfigurationImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapInternalApplicationConfiguration()
		 * @generated
		 */
		EClass CDAP_INTERNAL_APPLICATION_CONFIGURATION = eINSTANCE.getCdapInternalApplicationConfiguration();
		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_INTERNAL_APPLICATION_CONFIGURATION__CONFIG = eINSTANCE.getCdapInternalApplicationConfiguration_Config();
		/**
		 * The meta object literal for the '<em><b>Preferences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_INTERNAL_APPLICATION_CONFIGURATION__PREFERENCES = eINSTANCE.getCdapInternalApplicationConfiguration_Preferences();
		/**
		 * The meta object literal for the '<em><b>Apps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_INTERNAL_APPLICATION_CONFIGURATION__APPS = eINSTANCE.getCdapInternalApplicationConfiguration_Apps();
		/**
		 * The meta object literal for the '<em><b>Workers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_INTERNAL_APPLICATION_CONFIGURATION__WORKERS = eINSTANCE.getCdapInternalApplicationConfiguration_Workers();
		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_INTERNAL_APPLICATION_CONFIGURATION__FLOWS = eINSTANCE.getCdapInternalApplicationConfiguration_Flows();
		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_INTERNAL_APPLICATION_CONFIGURATION__SERVICES = eINSTANCE.getCdapInternalApplicationConfiguration_Services();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapServiceDescriptorImpl <em>Service Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapServiceDescriptorImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapServiceDescriptor()
		 * @generated
		 */
		EClass CDAP_SERVICE_DESCRIPTOR = eINSTANCE.getCdapServiceDescriptor();
		/**
		 * The meta object literal for the '<em><b>Service Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_SERVICE_DESCRIPTOR__SERVICE_PACKAGE = eINSTANCE.getCdapServiceDescriptor_ServicePackage();
		/**
		 * The meta object literal for the '<em><b>Service Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_SERVICE_DESCRIPTOR__SERVICE_CLASS = eINSTANCE.getCdapServiceDescriptor_ServiceClass();
		/**
		 * The meta object literal for the '<em><b>Service Instance Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS = eINSTANCE.getCdapServiceDescriptor_ServiceInstanceClass();
		/**
		 * The meta object literal for the '<em><b>Jar File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_SERVICE_DESCRIPTOR__JAR_FILE = eINSTANCE.getCdapServiceDescriptor_JarFile();

	}

} //CdapPackage
