
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
 * <!-- begin-model-doc -->
 * -
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 * <!-- end-model-doc -->
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
	 * The feature id for the '<em><b>Deploy Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__DEPLOY_STEPS = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Undeploy Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__UNDEPLOY_STEPS = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pre Configuration Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__PRE_CONFIGURATION_STEPS = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Post Configuration Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__POST_CONFIGURATION_STEPS = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>App Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__APP_NAMES = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Worker Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__WORKER_NAMES = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Flow Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__FLOW_NAMES = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Service Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__SERVICE_NAMES = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__CONFIGURATION = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Cdap Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__CDAP_CONFIGURATION = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Cluster Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__CLUSTER_SERVICE = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Cdap Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__CDAP_NAMESPACE = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE__SERVICE = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SERVICE_INSTANCE_FEATURE_COUNT = ServicePackage.DCAE_SERVICE_INSTANCE_FEATURE_COUNT + 19;

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
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapStepImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapStep()
	 * @generated
	 */
	int CDAP_STEP = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STEP__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STEP__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STEP__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STEP__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STEP_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STEP_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapLoadArtifactStepImpl <em>Load Artifact Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapLoadArtifactStepImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapLoadArtifactStep()
	 * @generated
	 */
	int CDAP_LOAD_ARTIFACT_STEP = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_STEP__NAME = CDAP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_STEP__LAST_POLLED = CDAP_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_STEP__LAST_CHANGED = CDAP_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_STEP__CREATED = CDAP_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_STEP__ARTIFACT_NAME = CDAP_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jar File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_STEP__JAR_FILE = CDAP_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_STEP__VERSION = CDAP_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Load Artifact Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_STEP_FEATURE_COUNT = CDAP_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Load Artifact Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_STEP_OPERATION_COUNT = CDAP_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapLoadArtifactWithConfigStepImpl <em>Load Artifact With Config Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapLoadArtifactWithConfigStepImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapLoadArtifactWithConfigStep()
	 * @generated
	 */
	int CDAP_LOAD_ARTIFACT_WITH_CONFIG_STEP = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_WITH_CONFIG_STEP__NAME = CDAP_LOAD_ARTIFACT_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_WITH_CONFIG_STEP__LAST_POLLED = CDAP_LOAD_ARTIFACT_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_WITH_CONFIG_STEP__LAST_CHANGED = CDAP_LOAD_ARTIFACT_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_WITH_CONFIG_STEP__CREATED = CDAP_LOAD_ARTIFACT_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_WITH_CONFIG_STEP__ARTIFACT_NAME = CDAP_LOAD_ARTIFACT_STEP__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Jar File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_WITH_CONFIG_STEP__JAR_FILE = CDAP_LOAD_ARTIFACT_STEP__JAR_FILE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_WITH_CONFIG_STEP__VERSION = CDAP_LOAD_ARTIFACT_STEP__VERSION;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_WITH_CONFIG_STEP__CONFIG = CDAP_LOAD_ARTIFACT_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load Artifact With Config Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_WITH_CONFIG_STEP_FEATURE_COUNT = CDAP_LOAD_ARTIFACT_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Load Artifact With Config Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_LOAD_ARTIFACT_WITH_CONFIG_STEP_OPERATION_COUNT = CDAP_LOAD_ARTIFACT_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapCreateAppStepImpl <em>Create App Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapCreateAppStepImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapCreateAppStep()
	 * @generated
	 */
	int CDAP_CREATE_APP_STEP = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_STEP__NAME = CDAP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_STEP__LAST_POLLED = CDAP_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_STEP__LAST_CHANGED = CDAP_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_STEP__CREATED = CDAP_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_STEP__APP_ID = CDAP_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_STEP__ARTIFACT_NAME = CDAP_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_STEP__VERSION = CDAP_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_STEP__SCOPE = CDAP_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Create App Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_STEP_FEATURE_COUNT = CDAP_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Create App Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_STEP_OPERATION_COUNT = CDAP_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapCreateAppWithConfigStepImpl <em>Create App With Config Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapCreateAppWithConfigStepImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapCreateAppWithConfigStep()
	 * @generated
	 */
	int CDAP_CREATE_APP_WITH_CONFIG_STEP = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_WITH_CONFIG_STEP__NAME = CDAP_CREATE_APP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_WITH_CONFIG_STEP__LAST_POLLED = CDAP_CREATE_APP_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_WITH_CONFIG_STEP__LAST_CHANGED = CDAP_CREATE_APP_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_WITH_CONFIG_STEP__CREATED = CDAP_CREATE_APP_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_WITH_CONFIG_STEP__APP_ID = CDAP_CREATE_APP_STEP__APP_ID;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_WITH_CONFIG_STEP__ARTIFACT_NAME = CDAP_CREATE_APP_STEP__ARTIFACT_NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_WITH_CONFIG_STEP__VERSION = CDAP_CREATE_APP_STEP__VERSION;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_WITH_CONFIG_STEP__SCOPE = CDAP_CREATE_APP_STEP__SCOPE;

	/**
	 * The feature id for the '<em><b>App Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_WITH_CONFIG_STEP__APP_CONFIG = CDAP_CREATE_APP_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create App With Config Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_WITH_CONFIG_STEP_FEATURE_COUNT = CDAP_CREATE_APP_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Create App With Config Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CREATE_APP_WITH_CONFIG_STEP_OPERATION_COUNT = CDAP_CREATE_APP_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapDeployAppStepImpl <em>Deploy App Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapDeployAppStepImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapDeployAppStep()
	 * @generated
	 */
	int CDAP_DEPLOY_APP_STEP = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DEPLOY_APP_STEP__NAME = CDAP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DEPLOY_APP_STEP__LAST_POLLED = CDAP_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DEPLOY_APP_STEP__LAST_CHANGED = CDAP_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DEPLOY_APP_STEP__CREATED = CDAP_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>Jar File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DEPLOY_APP_STEP__JAR_FILE = CDAP_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deploy App Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DEPLOY_APP_STEP_FEATURE_COUNT = CDAP_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Deploy App Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DEPLOY_APP_STEP_OPERATION_COUNT = CDAP_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStopFlowStepImpl <em>Stop Flow Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapStopFlowStepImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapStopFlowStep()
	 * @generated
	 */
	int CDAP_STOP_FLOW_STEP = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_FLOW_STEP__NAME = CDAP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_FLOW_STEP__LAST_POLLED = CDAP_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_FLOW_STEP__LAST_CHANGED = CDAP_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_FLOW_STEP__CREATED = CDAP_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_FLOW_STEP__APP_ID = CDAP_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_FLOW_STEP__FLOW_ID = CDAP_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stop Flow Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_FLOW_STEP_FEATURE_COUNT = CDAP_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stop Flow Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_FLOW_STEP_OPERATION_COUNT = CDAP_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStopWorkerStepImpl <em>Stop Worker Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapStopWorkerStepImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapStopWorkerStep()
	 * @generated
	 */
	int CDAP_STOP_WORKER_STEP = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_WORKER_STEP__NAME = CDAP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_WORKER_STEP__LAST_POLLED = CDAP_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_WORKER_STEP__LAST_CHANGED = CDAP_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_WORKER_STEP__CREATED = CDAP_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_WORKER_STEP__APP_ID = CDAP_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Worker Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_WORKER_STEP__WORKER_ID = CDAP_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stop Worker Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_WORKER_STEP_FEATURE_COUNT = CDAP_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stop Worker Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_WORKER_STEP_OPERATION_COUNT = CDAP_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStopServiceStepImpl <em>Stop Service Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapStopServiceStepImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapStopServiceStep()
	 * @generated
	 */
	int CDAP_STOP_SERVICE_STEP = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_SERVICE_STEP__NAME = CDAP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_SERVICE_STEP__LAST_POLLED = CDAP_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_SERVICE_STEP__LAST_CHANGED = CDAP_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_SERVICE_STEP__CREATED = CDAP_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_SERVICE_STEP__APP_ID = CDAP_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_SERVICE_STEP__SERVICE_ID = CDAP_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stop Service Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_SERVICE_STEP_FEATURE_COUNT = CDAP_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stop Service Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_SERVICE_STEP_OPERATION_COUNT = CDAP_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStopAppStepImpl <em>Stop App Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapStopAppStepImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapStopAppStep()
	 * @generated
	 */
	int CDAP_STOP_APP_STEP = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_APP_STEP__NAME = CDAP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_APP_STEP__LAST_POLLED = CDAP_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_APP_STEP__LAST_CHANGED = CDAP_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_APP_STEP__CREATED = CDAP_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_APP_STEP__APP_ID = CDAP_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Program Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_APP_STEP__PROGRAM_TYPES = CDAP_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stop App Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_APP_STEP_FEATURE_COUNT = CDAP_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stop App Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_STOP_APP_STEP_OPERATION_COUNT = CDAP_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStartFlowStepImpl <em>Start Flow Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapStartFlowStepImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapStartFlowStep()
	 * @generated
	 */
	int CDAP_START_FLOW_STEP = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_FLOW_STEP__NAME = CDAP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_FLOW_STEP__LAST_POLLED = CDAP_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_FLOW_STEP__LAST_CHANGED = CDAP_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_FLOW_STEP__CREATED = CDAP_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_FLOW_STEP__APP_ID = CDAP_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_FLOW_STEP__FLOW_ID = CDAP_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extra Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_FLOW_STEP__EXTRA_ARGS = CDAP_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Start Flow Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_FLOW_STEP_FEATURE_COUNT = CDAP_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Start Flow Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_FLOW_STEP_OPERATION_COUNT = CDAP_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStartWorkerStepImpl <em>Start Worker Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapStartWorkerStepImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapStartWorkerStep()
	 * @generated
	 */
	int CDAP_START_WORKER_STEP = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_WORKER_STEP__NAME = CDAP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_WORKER_STEP__LAST_POLLED = CDAP_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_WORKER_STEP__LAST_CHANGED = CDAP_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_WORKER_STEP__CREATED = CDAP_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_WORKER_STEP__APP_ID = CDAP_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Worker Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_WORKER_STEP__WORKER_ID = CDAP_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extra Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_WORKER_STEP__EXTRA_ARGS = CDAP_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Start Worker Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_WORKER_STEP_FEATURE_COUNT = CDAP_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Start Worker Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_WORKER_STEP_OPERATION_COUNT = CDAP_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStartServiceStepImpl <em>Start Service Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapStartServiceStepImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapStartServiceStep()
	 * @generated
	 */
	int CDAP_START_SERVICE_STEP = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_SERVICE_STEP__NAME = CDAP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_SERVICE_STEP__LAST_POLLED = CDAP_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_SERVICE_STEP__LAST_CHANGED = CDAP_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_SERVICE_STEP__CREATED = CDAP_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_SERVICE_STEP__APP_ID = CDAP_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_SERVICE_STEP__SERVICE_ID = CDAP_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extra Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_SERVICE_STEP__EXTRA_ARGS = CDAP_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Start Service Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_SERVICE_STEP_FEATURE_COUNT = CDAP_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Start Service Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_SERVICE_STEP_OPERATION_COUNT = CDAP_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStartAppStepImpl <em>Start App Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapStartAppStepImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapStartAppStep()
	 * @generated
	 */
	int CDAP_START_APP_STEP = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_APP_STEP__NAME = CDAP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_APP_STEP__LAST_POLLED = CDAP_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_APP_STEP__LAST_CHANGED = CDAP_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_APP_STEP__CREATED = CDAP_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_APP_STEP__APP_ID = CDAP_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start App Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_APP_STEP_FEATURE_COUNT = CDAP_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Start App Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_START_APP_STEP_OPERATION_COUNT = CDAP_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapDeleteAppStepImpl <em>Delete App Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapDeleteAppStepImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapDeleteAppStep()
	 * @generated
	 */
	int CDAP_DELETE_APP_STEP = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DELETE_APP_STEP__NAME = CDAP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DELETE_APP_STEP__LAST_POLLED = CDAP_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DELETE_APP_STEP__LAST_CHANGED = CDAP_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DELETE_APP_STEP__CREATED = CDAP_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DELETE_APP_STEP__APP_ID = CDAP_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete App Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DELETE_APP_STEP_FEATURE_COUNT = CDAP_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delete App Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DELETE_APP_STEP_OPERATION_COUNT = CDAP_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapDeleteArtifactImpl <em>Delete Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapDeleteArtifactImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapDeleteArtifact()
	 * @generated
	 */
	int CDAP_DELETE_ARTIFACT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DELETE_ARTIFACT__NAME = CDAP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DELETE_ARTIFACT__LAST_POLLED = CDAP_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DELETE_ARTIFACT__LAST_CHANGED = CDAP_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DELETE_ARTIFACT__CREATED = CDAP_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DELETE_ARTIFACT__ARTIFACT_NAME = CDAP_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DELETE_ARTIFACT__VERSION = CDAP_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delete Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DELETE_ARTIFACT_FEATURE_COUNT = CDAP_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Delete Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DELETE_ARTIFACT_OPERATION_COUNT = CDAP_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapSuspendScheduleStepImpl <em>Suspend Schedule Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapSuspendScheduleStepImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapSuspendScheduleStep()
	 * @generated
	 */
	int CDAP_SUSPEND_SCHEDULE_STEP = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SUSPEND_SCHEDULE_STEP__NAME = CDAP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SUSPEND_SCHEDULE_STEP__LAST_POLLED = CDAP_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SUSPEND_SCHEDULE_STEP__LAST_CHANGED = CDAP_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SUSPEND_SCHEDULE_STEP__CREATED = CDAP_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SUSPEND_SCHEDULE_STEP__APP_ID = CDAP_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schedule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SUSPEND_SCHEDULE_STEP__SCHEDULE_ID = CDAP_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Suspend Schedule Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SUSPEND_SCHEDULE_STEP_FEATURE_COUNT = CDAP_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Suspend Schedule Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_SUSPEND_SCHEDULE_STEP_OPERATION_COUNT = CDAP_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapResumeScheduleStepImpl <em>Resume Schedule Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapResumeScheduleStepImpl
	 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapResumeScheduleStep()
	 * @generated
	 */
	int CDAP_RESUME_SCHEDULE_STEP = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_RESUME_SCHEDULE_STEP__NAME = CDAP_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_RESUME_SCHEDULE_STEP__LAST_POLLED = CDAP_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_RESUME_SCHEDULE_STEP__LAST_CHANGED = CDAP_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_RESUME_SCHEDULE_STEP__CREATED = CDAP_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_RESUME_SCHEDULE_STEP__APP_ID = CDAP_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schedule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_RESUME_SCHEDULE_STEP__SCHEDULE_ID = CDAP_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resume Schedule Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_RESUME_SCHEDULE_STEP_FEATURE_COUNT = CDAP_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Resume Schedule Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_RESUME_SCHEDULE_STEP_OPERATION_COUNT = CDAP_STEP_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getDeploySteps <em>Deploy Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deploy Steps</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getDeploySteps()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EReference getCdapServiceInstance_DeploySteps();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getUndeploySteps <em>Undeploy Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Undeploy Steps</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getUndeploySteps()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EReference getCdapServiceInstance_UndeploySteps();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getPreConfigurationSteps <em>Pre Configuration Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Configuration Steps</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getPreConfigurationSteps()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EReference getCdapServiceInstance_PreConfigurationSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getPostConfigurationSteps <em>Post Configuration Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Configuration Steps</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapServiceInstance#getPostConfigurationSteps()
	 * @see #getCdapServiceInstance()
	 * @generated
	 */
	EReference getCdapServiceInstance_PostConfigurationSteps();

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
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStep
	 * @generated
	 */
	EClass getCdapStep();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep <em>Load Artifact Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Artifact Step</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep
	 * @generated
	 */
	EClass getCdapLoadArtifactStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep#getArtifactName <em>Artifact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Name</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep#getArtifactName()
	 * @see #getCdapLoadArtifactStep()
	 * @generated
	 */
	EAttribute getCdapLoadArtifactStep_ArtifactName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep#getJarFile <em>Jar File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jar File</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep#getJarFile()
	 * @see #getCdapLoadArtifactStep()
	 * @generated
	 */
	EAttribute getCdapLoadArtifactStep_JarFile();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactStep#getVersion()
	 * @see #getCdapLoadArtifactStep()
	 * @generated
	 */
	EAttribute getCdapLoadArtifactStep_Version();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactWithConfigStep <em>Load Artifact With Config Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Artifact With Config Step</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactWithConfigStep
	 * @generated
	 */
	EClass getCdapLoadArtifactWithConfigStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactWithConfigStep#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapLoadArtifactWithConfigStep#getConfig()
	 * @see #getCdapLoadArtifactWithConfigStep()
	 * @generated
	 */
	EAttribute getCdapLoadArtifactWithConfigStep_Config();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapCreateAppStep <em>Create App Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create App Step</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapCreateAppStep
	 * @generated
	 */
	EClass getCdapCreateAppStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapCreateAppStep#getAppId <em>App Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapCreateAppStep#getAppId()
	 * @see #getCdapCreateAppStep()
	 * @generated
	 */
	EAttribute getCdapCreateAppStep_AppId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapCreateAppStep#getArtifactName <em>Artifact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Name</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapCreateAppStep#getArtifactName()
	 * @see #getCdapCreateAppStep()
	 * @generated
	 */
	EAttribute getCdapCreateAppStep_ArtifactName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapCreateAppStep#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapCreateAppStep#getVersion()
	 * @see #getCdapCreateAppStep()
	 * @generated
	 */
	EAttribute getCdapCreateAppStep_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapCreateAppStep#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapCreateAppStep#getScope()
	 * @see #getCdapCreateAppStep()
	 * @generated
	 */
	EAttribute getCdapCreateAppStep_Scope();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapCreateAppWithConfigStep <em>Create App With Config Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create App With Config Step</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapCreateAppWithConfigStep
	 * @generated
	 */
	EClass getCdapCreateAppWithConfigStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapCreateAppWithConfigStep#getAppConfig <em>App Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Config</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapCreateAppWithConfigStep#getAppConfig()
	 * @see #getCdapCreateAppWithConfigStep()
	 * @generated
	 */
	EAttribute getCdapCreateAppWithConfigStep_AppConfig();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapDeployAppStep <em>Deploy App Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deploy App Step</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapDeployAppStep
	 * @generated
	 */
	EClass getCdapDeployAppStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapDeployAppStep#getJarFile <em>Jar File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jar File</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapDeployAppStep#getJarFile()
	 * @see #getCdapDeployAppStep()
	 * @generated
	 */
	EAttribute getCdapDeployAppStep_JarFile();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapStopFlowStep <em>Stop Flow Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Flow Step</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStopFlowStep
	 * @generated
	 */
	EClass getCdapStopFlowStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapStopFlowStep#getAppId <em>App Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStopFlowStep#getAppId()
	 * @see #getCdapStopFlowStep()
	 * @generated
	 */
	EAttribute getCdapStopFlowStep_AppId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapStopFlowStep#getFlowId <em>Flow Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStopFlowStep#getFlowId()
	 * @see #getCdapStopFlowStep()
	 * @generated
	 */
	EAttribute getCdapStopFlowStep_FlowId();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapStopWorkerStep <em>Stop Worker Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Worker Step</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStopWorkerStep
	 * @generated
	 */
	EClass getCdapStopWorkerStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapStopWorkerStep#getAppId <em>App Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStopWorkerStep#getAppId()
	 * @see #getCdapStopWorkerStep()
	 * @generated
	 */
	EAttribute getCdapStopWorkerStep_AppId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapStopWorkerStep#getWorkerId <em>Worker Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worker Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStopWorkerStep#getWorkerId()
	 * @see #getCdapStopWorkerStep()
	 * @generated
	 */
	EAttribute getCdapStopWorkerStep_WorkerId();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapStopServiceStep <em>Stop Service Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Service Step</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStopServiceStep
	 * @generated
	 */
	EClass getCdapStopServiceStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapStopServiceStep#getAppId <em>App Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStopServiceStep#getAppId()
	 * @see #getCdapStopServiceStep()
	 * @generated
	 */
	EAttribute getCdapStopServiceStep_AppId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapStopServiceStep#getServiceId <em>Service Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStopServiceStep#getServiceId()
	 * @see #getCdapStopServiceStep()
	 * @generated
	 */
	EAttribute getCdapStopServiceStep_ServiceId();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapStopAppStep <em>Stop App Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop App Step</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStopAppStep
	 * @generated
	 */
	EClass getCdapStopAppStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapStopAppStep#getAppId <em>App Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStopAppStep#getAppId()
	 * @see #getCdapStopAppStep()
	 * @generated
	 */
	EAttribute getCdapStopAppStep_AppId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapStopAppStep#getProgramTypes <em>Program Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Types</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStopAppStep#getProgramTypes()
	 * @see #getCdapStopAppStep()
	 * @generated
	 */
	EAttribute getCdapStopAppStep_ProgramTypes();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapStartFlowStep <em>Start Flow Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Flow Step</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStartFlowStep
	 * @generated
	 */
	EClass getCdapStartFlowStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapStartFlowStep#getAppId <em>App Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStartFlowStep#getAppId()
	 * @see #getCdapStartFlowStep()
	 * @generated
	 */
	EAttribute getCdapStartFlowStep_AppId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapStartFlowStep#getFlowId <em>Flow Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStartFlowStep#getFlowId()
	 * @see #getCdapStartFlowStep()
	 * @generated
	 */
	EAttribute getCdapStartFlowStep_FlowId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapStartFlowStep#getExtraArgs <em>Extra Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Args</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStartFlowStep#getExtraArgs()
	 * @see #getCdapStartFlowStep()
	 * @generated
	 */
	EAttribute getCdapStartFlowStep_ExtraArgs();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapStartWorkerStep <em>Start Worker Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Worker Step</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStartWorkerStep
	 * @generated
	 */
	EClass getCdapStartWorkerStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapStartWorkerStep#getAppId <em>App Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStartWorkerStep#getAppId()
	 * @see #getCdapStartWorkerStep()
	 * @generated
	 */
	EAttribute getCdapStartWorkerStep_AppId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapStartWorkerStep#getWorkerId <em>Worker Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worker Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStartWorkerStep#getWorkerId()
	 * @see #getCdapStartWorkerStep()
	 * @generated
	 */
	EAttribute getCdapStartWorkerStep_WorkerId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapStartWorkerStep#getExtraArgs <em>Extra Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Args</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStartWorkerStep#getExtraArgs()
	 * @see #getCdapStartWorkerStep()
	 * @generated
	 */
	EAttribute getCdapStartWorkerStep_ExtraArgs();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapStartServiceStep <em>Start Service Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Service Step</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStartServiceStep
	 * @generated
	 */
	EClass getCdapStartServiceStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapStartServiceStep#getAppId <em>App Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStartServiceStep#getAppId()
	 * @see #getCdapStartServiceStep()
	 * @generated
	 */
	EAttribute getCdapStartServiceStep_AppId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapStartServiceStep#getServiceId <em>Service Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStartServiceStep#getServiceId()
	 * @see #getCdapStartServiceStep()
	 * @generated
	 */
	EAttribute getCdapStartServiceStep_ServiceId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapStartServiceStep#getExtraArgs <em>Extra Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Args</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStartServiceStep#getExtraArgs()
	 * @see #getCdapStartServiceStep()
	 * @generated
	 */
	EAttribute getCdapStartServiceStep_ExtraArgs();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapStartAppStep <em>Start App Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start App Step</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStartAppStep
	 * @generated
	 */
	EClass getCdapStartAppStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapStartAppStep#getAppId <em>App Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapStartAppStep#getAppId()
	 * @see #getCdapStartAppStep()
	 * @generated
	 */
	EAttribute getCdapStartAppStep_AppId();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapDeleteAppStep <em>Delete App Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete App Step</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapDeleteAppStep
	 * @generated
	 */
	EClass getCdapDeleteAppStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapDeleteAppStep#getAppId <em>App Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapDeleteAppStep#getAppId()
	 * @see #getCdapDeleteAppStep()
	 * @generated
	 */
	EAttribute getCdapDeleteAppStep_AppId();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapDeleteArtifact <em>Delete Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Artifact</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapDeleteArtifact
	 * @generated
	 */
	EClass getCdapDeleteArtifact();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapDeleteArtifact#getArtifactName <em>Artifact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Name</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapDeleteArtifact#getArtifactName()
	 * @see #getCdapDeleteArtifact()
	 * @generated
	 */
	EAttribute getCdapDeleteArtifact_ArtifactName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapDeleteArtifact#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapDeleteArtifact#getVersion()
	 * @see #getCdapDeleteArtifact()
	 * @generated
	 */
	EAttribute getCdapDeleteArtifact_Version();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapSuspendScheduleStep <em>Suspend Schedule Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspend Schedule Step</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapSuspendScheduleStep
	 * @generated
	 */
	EClass getCdapSuspendScheduleStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapSuspendScheduleStep#getAppId <em>App Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapSuspendScheduleStep#getAppId()
	 * @see #getCdapSuspendScheduleStep()
	 * @generated
	 */
	EAttribute getCdapSuspendScheduleStep_AppId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapSuspendScheduleStep#getScheduleId <em>Schedule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapSuspendScheduleStep#getScheduleId()
	 * @see #getCdapSuspendScheduleStep()
	 * @generated
	 */
	EAttribute getCdapSuspendScheduleStep_ScheduleId();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.controller.service.cdap.CdapResumeScheduleStep <em>Resume Schedule Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resume Schedule Step</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapResumeScheduleStep
	 * @generated
	 */
	EClass getCdapResumeScheduleStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapResumeScheduleStep#getAppId <em>App Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapResumeScheduleStep#getAppId()
	 * @see #getCdapResumeScheduleStep()
	 * @generated
	 */
	EAttribute getCdapResumeScheduleStep_AppId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.controller.service.cdap.CdapResumeScheduleStep#getScheduleId <em>Schedule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Id</em>'.
	 * @see org.openecomp.dcae.controller.service.cdap.CdapResumeScheduleStep#getScheduleId()
	 * @see #getCdapResumeScheduleStep()
	 * @generated
	 */
	EAttribute getCdapResumeScheduleStep_ScheduleId();

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
		 * The meta object literal for the '<em><b>Deploy Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_SERVICE_INSTANCE__DEPLOY_STEPS = eINSTANCE.getCdapServiceInstance_DeploySteps();
		/**
		 * The meta object literal for the '<em><b>Undeploy Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_SERVICE_INSTANCE__UNDEPLOY_STEPS = eINSTANCE.getCdapServiceInstance_UndeploySteps();
		/**
		 * The meta object literal for the '<em><b>Pre Configuration Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_SERVICE_INSTANCE__PRE_CONFIGURATION_STEPS = eINSTANCE.getCdapServiceInstance_PreConfigurationSteps();
		/**
		 * The meta object literal for the '<em><b>Post Configuration Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_SERVICE_INSTANCE__POST_CONFIGURATION_STEPS = eINSTANCE.getCdapServiceInstance_PostConfigurationSteps();
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
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapStepImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapStep()
		 * @generated
		 */
		EClass CDAP_STEP = eINSTANCE.getCdapStep();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapLoadArtifactStepImpl <em>Load Artifact Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapLoadArtifactStepImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapLoadArtifactStep()
		 * @generated
		 */
		EClass CDAP_LOAD_ARTIFACT_STEP = eINSTANCE.getCdapLoadArtifactStep();
		/**
		 * The meta object literal for the '<em><b>Artifact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_LOAD_ARTIFACT_STEP__ARTIFACT_NAME = eINSTANCE.getCdapLoadArtifactStep_ArtifactName();
		/**
		 * The meta object literal for the '<em><b>Jar File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_LOAD_ARTIFACT_STEP__JAR_FILE = eINSTANCE.getCdapLoadArtifactStep_JarFile();
		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_LOAD_ARTIFACT_STEP__VERSION = eINSTANCE.getCdapLoadArtifactStep_Version();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapLoadArtifactWithConfigStepImpl <em>Load Artifact With Config Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapLoadArtifactWithConfigStepImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapLoadArtifactWithConfigStep()
		 * @generated
		 */
		EClass CDAP_LOAD_ARTIFACT_WITH_CONFIG_STEP = eINSTANCE.getCdapLoadArtifactWithConfigStep();
		/**
		 * The meta object literal for the '<em><b>Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_LOAD_ARTIFACT_WITH_CONFIG_STEP__CONFIG = eINSTANCE.getCdapLoadArtifactWithConfigStep_Config();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapCreateAppStepImpl <em>Create App Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapCreateAppStepImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapCreateAppStep()
		 * @generated
		 */
		EClass CDAP_CREATE_APP_STEP = eINSTANCE.getCdapCreateAppStep();
		/**
		 * The meta object literal for the '<em><b>App Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_CREATE_APP_STEP__APP_ID = eINSTANCE.getCdapCreateAppStep_AppId();
		/**
		 * The meta object literal for the '<em><b>Artifact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_CREATE_APP_STEP__ARTIFACT_NAME = eINSTANCE.getCdapCreateAppStep_ArtifactName();
		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_CREATE_APP_STEP__VERSION = eINSTANCE.getCdapCreateAppStep_Version();
		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_CREATE_APP_STEP__SCOPE = eINSTANCE.getCdapCreateAppStep_Scope();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapCreateAppWithConfigStepImpl <em>Create App With Config Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapCreateAppWithConfigStepImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapCreateAppWithConfigStep()
		 * @generated
		 */
		EClass CDAP_CREATE_APP_WITH_CONFIG_STEP = eINSTANCE.getCdapCreateAppWithConfigStep();
		/**
		 * The meta object literal for the '<em><b>App Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_CREATE_APP_WITH_CONFIG_STEP__APP_CONFIG = eINSTANCE.getCdapCreateAppWithConfigStep_AppConfig();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapDeployAppStepImpl <em>Deploy App Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapDeployAppStepImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapDeployAppStep()
		 * @generated
		 */
		EClass CDAP_DEPLOY_APP_STEP = eINSTANCE.getCdapDeployAppStep();
		/**
		 * The meta object literal for the '<em><b>Jar File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_DEPLOY_APP_STEP__JAR_FILE = eINSTANCE.getCdapDeployAppStep_JarFile();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStopFlowStepImpl <em>Stop Flow Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapStopFlowStepImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapStopFlowStep()
		 * @generated
		 */
		EClass CDAP_STOP_FLOW_STEP = eINSTANCE.getCdapStopFlowStep();
		/**
		 * The meta object literal for the '<em><b>App Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_STOP_FLOW_STEP__APP_ID = eINSTANCE.getCdapStopFlowStep_AppId();
		/**
		 * The meta object literal for the '<em><b>Flow Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_STOP_FLOW_STEP__FLOW_ID = eINSTANCE.getCdapStopFlowStep_FlowId();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStopWorkerStepImpl <em>Stop Worker Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapStopWorkerStepImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapStopWorkerStep()
		 * @generated
		 */
		EClass CDAP_STOP_WORKER_STEP = eINSTANCE.getCdapStopWorkerStep();
		/**
		 * The meta object literal for the '<em><b>App Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_STOP_WORKER_STEP__APP_ID = eINSTANCE.getCdapStopWorkerStep_AppId();
		/**
		 * The meta object literal for the '<em><b>Worker Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_STOP_WORKER_STEP__WORKER_ID = eINSTANCE.getCdapStopWorkerStep_WorkerId();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStopServiceStepImpl <em>Stop Service Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapStopServiceStepImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapStopServiceStep()
		 * @generated
		 */
		EClass CDAP_STOP_SERVICE_STEP = eINSTANCE.getCdapStopServiceStep();
		/**
		 * The meta object literal for the '<em><b>App Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_STOP_SERVICE_STEP__APP_ID = eINSTANCE.getCdapStopServiceStep_AppId();
		/**
		 * The meta object literal for the '<em><b>Service Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_STOP_SERVICE_STEP__SERVICE_ID = eINSTANCE.getCdapStopServiceStep_ServiceId();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStopAppStepImpl <em>Stop App Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapStopAppStepImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapStopAppStep()
		 * @generated
		 */
		EClass CDAP_STOP_APP_STEP = eINSTANCE.getCdapStopAppStep();
		/**
		 * The meta object literal for the '<em><b>App Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_STOP_APP_STEP__APP_ID = eINSTANCE.getCdapStopAppStep_AppId();
		/**
		 * The meta object literal for the '<em><b>Program Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_STOP_APP_STEP__PROGRAM_TYPES = eINSTANCE.getCdapStopAppStep_ProgramTypes();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStartFlowStepImpl <em>Start Flow Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapStartFlowStepImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapStartFlowStep()
		 * @generated
		 */
		EClass CDAP_START_FLOW_STEP = eINSTANCE.getCdapStartFlowStep();
		/**
		 * The meta object literal for the '<em><b>App Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_START_FLOW_STEP__APP_ID = eINSTANCE.getCdapStartFlowStep_AppId();
		/**
		 * The meta object literal for the '<em><b>Flow Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_START_FLOW_STEP__FLOW_ID = eINSTANCE.getCdapStartFlowStep_FlowId();
		/**
		 * The meta object literal for the '<em><b>Extra Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_START_FLOW_STEP__EXTRA_ARGS = eINSTANCE.getCdapStartFlowStep_ExtraArgs();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStartWorkerStepImpl <em>Start Worker Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapStartWorkerStepImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapStartWorkerStep()
		 * @generated
		 */
		EClass CDAP_START_WORKER_STEP = eINSTANCE.getCdapStartWorkerStep();
		/**
		 * The meta object literal for the '<em><b>App Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_START_WORKER_STEP__APP_ID = eINSTANCE.getCdapStartWorkerStep_AppId();
		/**
		 * The meta object literal for the '<em><b>Worker Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_START_WORKER_STEP__WORKER_ID = eINSTANCE.getCdapStartWorkerStep_WorkerId();
		/**
		 * The meta object literal for the '<em><b>Extra Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_START_WORKER_STEP__EXTRA_ARGS = eINSTANCE.getCdapStartWorkerStep_ExtraArgs();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStartServiceStepImpl <em>Start Service Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapStartServiceStepImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapStartServiceStep()
		 * @generated
		 */
		EClass CDAP_START_SERVICE_STEP = eINSTANCE.getCdapStartServiceStep();
		/**
		 * The meta object literal for the '<em><b>App Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_START_SERVICE_STEP__APP_ID = eINSTANCE.getCdapStartServiceStep_AppId();
		/**
		 * The meta object literal for the '<em><b>Service Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_START_SERVICE_STEP__SERVICE_ID = eINSTANCE.getCdapStartServiceStep_ServiceId();
		/**
		 * The meta object literal for the '<em><b>Extra Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_START_SERVICE_STEP__EXTRA_ARGS = eINSTANCE.getCdapStartServiceStep_ExtraArgs();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapStartAppStepImpl <em>Start App Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapStartAppStepImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapStartAppStep()
		 * @generated
		 */
		EClass CDAP_START_APP_STEP = eINSTANCE.getCdapStartAppStep();
		/**
		 * The meta object literal for the '<em><b>App Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_START_APP_STEP__APP_ID = eINSTANCE.getCdapStartAppStep_AppId();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapDeleteAppStepImpl <em>Delete App Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapDeleteAppStepImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapDeleteAppStep()
		 * @generated
		 */
		EClass CDAP_DELETE_APP_STEP = eINSTANCE.getCdapDeleteAppStep();
		/**
		 * The meta object literal for the '<em><b>App Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_DELETE_APP_STEP__APP_ID = eINSTANCE.getCdapDeleteAppStep_AppId();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapDeleteArtifactImpl <em>Delete Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapDeleteArtifactImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapDeleteArtifact()
		 * @generated
		 */
		EClass CDAP_DELETE_ARTIFACT = eINSTANCE.getCdapDeleteArtifact();
		/**
		 * The meta object literal for the '<em><b>Artifact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_DELETE_ARTIFACT__ARTIFACT_NAME = eINSTANCE.getCdapDeleteArtifact_ArtifactName();
		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_DELETE_ARTIFACT__VERSION = eINSTANCE.getCdapDeleteArtifact_Version();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapSuspendScheduleStepImpl <em>Suspend Schedule Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapSuspendScheduleStepImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapSuspendScheduleStep()
		 * @generated
		 */
		EClass CDAP_SUSPEND_SCHEDULE_STEP = eINSTANCE.getCdapSuspendScheduleStep();
		/**
		 * The meta object literal for the '<em><b>App Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_SUSPEND_SCHEDULE_STEP__APP_ID = eINSTANCE.getCdapSuspendScheduleStep_AppId();
		/**
		 * The meta object literal for the '<em><b>Schedule Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_SUSPEND_SCHEDULE_STEP__SCHEDULE_ID = eINSTANCE.getCdapSuspendScheduleStep_ScheduleId();
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.controller.service.cdap.impl.CdapResumeScheduleStepImpl <em>Resume Schedule Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapResumeScheduleStepImpl
		 * @see org.openecomp.dcae.controller.service.cdap.impl.CdapPackageImpl#getCdapResumeScheduleStep()
		 * @generated
		 */
		EClass CDAP_RESUME_SCHEDULE_STEP = eINSTANCE.getCdapResumeScheduleStep();
		/**
		 * The meta object literal for the '<em><b>App Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_RESUME_SCHEDULE_STEP__APP_ID = eINSTANCE.getCdapResumeScheduleStep_AppId();
		/**
		 * The meta object literal for the '<em><b>Schedule Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_RESUME_SCHEDULE_STEP__SCHEDULE_ID = eINSTANCE.getCdapResumeScheduleStep_ScheduleId();

	}

} //CdapPackage
