
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
	
// Autogenerated
// Do not edit. No need to extend this class.
package org.openecomp.dcae.controller.platform.servers.controller;

import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.HighAvailabilityClient;
import org.openecomp.ncomp.sirius.manager.GenericHttpClient;

import org.apache.log4j.Logger;

import org.openecomp.logger.EcompLogger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.openecomp.dcae.controller.platform.controller.impl.ControllerVirtualMachineServiceImpl;
import org.openecomp.dcae.controller.platform.controller.ControllerPackage;
import org.openecomp.dcae.controller.platform.servers.controller.logging.ControllerVirtualMachineServiceOperationEnum;
import org.openecomp.dcae.controller.platform.servers.controller.logging.ControllerVirtualMachineServiceMessageEnum;


import org.openecomp.dcae.controller.platform.servers.controller.DcaeDcaePlatformController; 



 
@SuppressWarnings("unchecked")
public class DcaeControllerVirtualMachineServiceClient extends ControllerVirtualMachineServiceImpl {
	public static final Logger logger = Logger.getLogger(DcaeControllerVirtualMachineServiceClient.class);
	static final EcompLogger ecomplogger = EcompLogger.getEcompLogger();
	public AbstractClient client;

	public DcaeControllerVirtualMachineServiceClient(String file, String name) {
		DcaeDcaePlatformController.ecoreSetup(); 
		client = new GenericHttpClient(file,name);
		client.add("/cont", this);
	}

	public DcaeControllerVirtualMachineServiceClient(String file, String name1, String name2) {
		HighAvailabilityClient client1 = new HighAvailabilityClient(file,name1,name2);
		client = client1.all; // requests should be forwarded to all.
		client.add("/cont", this);
	}
	
	public DcaeControllerVirtualMachineServiceClient(AbstractClient c) {
		client = c;
		client.add("/resources", this);
	}



	
	public void deploy(String path, java.lang.String instanceName, java.lang.String containerPath) {
		EClass c = ControllerPackage.eINSTANCE.getControllerVirtualMachineService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerVirtualMachineServiceOperationEnum.REMOTE_deploy);
		
		try {
		  client.operationPath(path, c, "deploy", null, instanceName,containerPath);
		}
		catch (Exception e) {
			ecomplogger.warn(ControllerVirtualMachineServiceMessageEnum.REMOTE_deploy, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@deploy: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	
	public void undeploy(String path, java.lang.String instanceName) {
		EClass c = ControllerPackage.eINSTANCE.getControllerVirtualMachineService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerVirtualMachineServiceOperationEnum.REMOTE_undeploy);
		
		try {
		  client.operationPath(path, c, "undeploy", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(ControllerVirtualMachineServiceMessageEnum.REMOTE_undeploy, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@undeploy: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	
	public org.openecomp.dcae.controller.core.service.HealthTestResponse test(String path, java.lang.String instanceName) {
		EClass c = ControllerPackage.eINSTANCE.getControllerVirtualMachineService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerVirtualMachineServiceOperationEnum.REMOTE_test);
		org.openecomp.dcae.controller.core.service.HealthTestResponse res;
		try {
		  res = (org.openecomp.dcae.controller.core.service.HealthTestResponse) client.operationPath(path, c, "test", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(ControllerVirtualMachineServiceMessageEnum.REMOTE_test, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@test: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	
	public void suspend(String path, java.lang.String instanceName) {
		EClass c = ControllerPackage.eINSTANCE.getControllerVirtualMachineService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerVirtualMachineServiceOperationEnum.REMOTE_suspend);
		
		try {
		  client.operationPath(path, c, "suspend", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(ControllerVirtualMachineServiceMessageEnum.REMOTE_suspend, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@suspend: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	
	public void resume(String path, java.lang.String instanceName) {
		EClass c = ControllerPackage.eINSTANCE.getControllerVirtualMachineService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerVirtualMachineServiceOperationEnum.REMOTE_resume);
		
		try {
		  client.operationPath(path, c, "resume", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(ControllerVirtualMachineServiceMessageEnum.REMOTE_resume, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@resume: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	
	public void pushManagerConfiguration(String path, java.lang.String instanceName) {
		EClass c = ControllerPackage.eINSTANCE.getControllerVirtualMachineService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerVirtualMachineServiceOperationEnum.REMOTE_pushManagerConfiguration);
		
		try {
		  client.operationPath(path, c, "pushManagerConfiguration", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(ControllerVirtualMachineServiceMessageEnum.REMOTE_pushManagerConfiguration, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@pushManagerConfiguration: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	
	public void pollManagerConfiguration(String path, java.lang.String instanceName) {
		EClass c = ControllerPackage.eINSTANCE.getControllerVirtualMachineService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerVirtualMachineServiceOperationEnum.REMOTE_pollManagerConfiguration);
		
		try {
		  client.operationPath(path, c, "pollManagerConfiguration", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(ControllerVirtualMachineServiceMessageEnum.REMOTE_pollManagerConfiguration, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@pollManagerConfiguration: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	
	public org.eclipse.emf.ecore.EObject managerConfiguration(String path, java.lang.String instanceName) {
		EClass c = ControllerPackage.eINSTANCE.getControllerVirtualMachineService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerVirtualMachineServiceOperationEnum.REMOTE_managerConfiguration);
		org.eclipse.emf.ecore.EObject res;
		try {
		  res = (org.eclipse.emf.ecore.EObject) client.operationPath(path, c, "managerConfiguration", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(ControllerVirtualMachineServiceMessageEnum.REMOTE_managerConfiguration, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@managerConfiguration: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	
	public org.json.JSONObject managerOperation(String path, java.lang.String instanceName, java.lang.String operation, org.json.JSONObject parameters) {
		EClass c = ControllerPackage.eINSTANCE.getControllerVirtualMachineService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerVirtualMachineServiceOperationEnum.REMOTE_managerOperation);
		org.json.JSONObject res;
		try {
		  res = (org.json.JSONObject) client.operationPath(path, c, "managerOperation", null, instanceName,operation,parameters);
		}
		catch (Exception e) {
			ecomplogger.warn(ControllerVirtualMachineServiceMessageEnum.REMOTE_managerOperation, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@managerOperation: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	
	public void updateConfigurationFromPolicy(String path, java.lang.String instanceName) {
		EClass c = ControllerPackage.eINSTANCE.getControllerVirtualMachineService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerVirtualMachineServiceOperationEnum.REMOTE_updateConfigurationFromPolicy);
		
		try {
		  client.operationPath(path, c, "updateConfigurationFromPolicy", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(ControllerVirtualMachineServiceMessageEnum.REMOTE_updateConfigurationFromPolicy, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@updateConfigurationFromPolicy: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	
	public void runHealthTests(String path) {
		EClass c = ControllerPackage.eINSTANCE.getControllerVirtualMachineService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerVirtualMachineServiceOperationEnum.REMOTE_runHealthTests);
		
		try {
		  client.operationPath(path, c, "runHealthTests", null);
		}
		catch (Exception e) {
			ecomplogger.warn(ControllerVirtualMachineServiceMessageEnum.REMOTE_runHealthTests, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@runHealthTests: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	
	public void updateDeploymentStatus(String path) {
		EClass c = ControllerPackage.eINSTANCE.getControllerVirtualMachineService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(ControllerVirtualMachineServiceOperationEnum.REMOTE_updateDeploymentStatus);
		
		try {
		  client.operationPath(path, c, "updateDeploymentStatus", null);
		}
		catch (Exception e) {
			ecomplogger.warn(ControllerVirtualMachineServiceMessageEnum.REMOTE_updateDeploymentStatus, e.toString());
			throw new RuntimeException("remote call failed: " + client.getRemote() + "@updateDeploymentStatus: " + e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

}
