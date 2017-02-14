
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
package org.openecomp.dcae.controller.service.servers.docker;

import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.HighAvailabilityClient;
import org.openecomp.ncomp.sirius.manager.GenericHttpClient;

import org.apache.log4j.Logger;

import org.openecomp.logger.EcompLogger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.openecomp.dcae.controller.service.docker.impl.DockerServiceImpl;
import org.openecomp.dcae.controller.service.docker.DockerPackage;
import org.openecomp.dcae.controller.service.servers.docker.logging.DockerServiceOperationEnum;
import org.openecomp.dcae.controller.service.servers.docker.logging.DockerServiceMessageEnum;





 
@SuppressWarnings("unchecked")
public class DcaeDockerServiceClient extends DockerServiceImpl {
	public static final Logger logger = Logger.getLogger(DcaeDockerServiceClient.class);
	static final EcompLogger ecomplogger = EcompLogger.getEcompLogger();
	public AbstractClient client;

	public DcaeDockerServiceClient(String file, String name) {
		DcaeDockerService.ecoreSetup(); 
		client = new GenericHttpClient(file,name);
		client.add("/resources", this);
	}

	public DcaeDockerServiceClient(String file, String name1, String name2) {
		HighAvailabilityClient client1 = new HighAvailabilityClient(file,name1,name2);
		client = client1.all; // requests should be forwarded to all.
		client.add("/resources", this);
	}
	
	public DcaeDockerServiceClient(AbstractClient c) {
		client = c;
		client.add("/resources", this);
	}



	@Override
	public void deploy(java.lang.String instanceName, java.lang.String containerPath) {
		EClass c = DockerPackage.eINSTANCE.getDockerService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerServiceOperationEnum.REMOTE_deploy);
		
		try {
		  client.operationPath("/resources", c, "deploy", null, instanceName,containerPath);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerServiceMessageEnum.REMOTE_deploy, e.toString());
			throw new RuntimeException("remote call failed:  deploy", e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void undeploy(java.lang.String instanceName) {
		EClass c = DockerPackage.eINSTANCE.getDockerService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerServiceOperationEnum.REMOTE_undeploy);
		
		try {
		  client.operationPath("/resources", c, "undeploy", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerServiceMessageEnum.REMOTE_undeploy, e.toString());
			throw new RuntimeException("remote call failed:  undeploy", e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public org.openecomp.dcae.controller.core.service.HealthTestResponse test(java.lang.String instanceName) {
		EClass c = DockerPackage.eINSTANCE.getDockerService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerServiceOperationEnum.REMOTE_test);
		org.openecomp.dcae.controller.core.service.HealthTestResponse res;
		try {
		  res = (org.openecomp.dcae.controller.core.service.HealthTestResponse) client.operationPath("/resources", c, "test", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerServiceMessageEnum.REMOTE_test, e.toString());
			throw new RuntimeException("remote call failed:  test", e);
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	@Override
	public void suspend(java.lang.String instanceName) {
		EClass c = DockerPackage.eINSTANCE.getDockerService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerServiceOperationEnum.REMOTE_suspend);
		
		try {
		  client.operationPath("/resources", c, "suspend", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerServiceMessageEnum.REMOTE_suspend, e.toString());
			throw new RuntimeException("remote call failed:  suspend", e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void resume(java.lang.String instanceName) {
		EClass c = DockerPackage.eINSTANCE.getDockerService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerServiceOperationEnum.REMOTE_resume);
		
		try {
		  client.operationPath("/resources", c, "resume", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerServiceMessageEnum.REMOTE_resume, e.toString());
			throw new RuntimeException("remote call failed:  resume", e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void pushManagerConfiguration(java.lang.String instanceName) {
		EClass c = DockerPackage.eINSTANCE.getDockerService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerServiceOperationEnum.REMOTE_pushManagerConfiguration);
		
		try {
		  client.operationPath("/resources", c, "pushManagerConfiguration", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerServiceMessageEnum.REMOTE_pushManagerConfiguration, e.toString());
			throw new RuntimeException("remote call failed:  pushManagerConfiguration", e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void pollManagerConfiguration(java.lang.String instanceName) {
		EClass c = DockerPackage.eINSTANCE.getDockerService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerServiceOperationEnum.REMOTE_pollManagerConfiguration);
		
		try {
		  client.operationPath("/resources", c, "pollManagerConfiguration", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerServiceMessageEnum.REMOTE_pollManagerConfiguration, e.toString());
			throw new RuntimeException("remote call failed:  pollManagerConfiguration", e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public org.eclipse.emf.ecore.EObject managerConfiguration(java.lang.String instanceName) {
		EClass c = DockerPackage.eINSTANCE.getDockerService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerServiceOperationEnum.REMOTE_managerConfiguration);
		org.eclipse.emf.ecore.EObject res;
		try {
		  res = (org.eclipse.emf.ecore.EObject) client.operationPath("/resources", c, "managerConfiguration", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerServiceMessageEnum.REMOTE_managerConfiguration, e.toString());
			throw new RuntimeException("remote call failed:  managerConfiguration", e);
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	@Override
	public org.json.JSONObject managerOperation(java.lang.String instanceName, java.lang.String operation, org.json.JSONObject parameters) {
		EClass c = DockerPackage.eINSTANCE.getDockerService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerServiceOperationEnum.REMOTE_managerOperation);
		org.json.JSONObject res;
		try {
		  res = (org.json.JSONObject) client.operationPath("/resources", c, "managerOperation", null, instanceName,operation,parameters);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerServiceMessageEnum.REMOTE_managerOperation, e.toString());
			throw new RuntimeException("remote call failed:  managerOperation", e);
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	@Override
	public void updateConfigurationFromPolicy(java.lang.String instanceName) {
		EClass c = DockerPackage.eINSTANCE.getDockerService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerServiceOperationEnum.REMOTE_updateConfigurationFromPolicy);
		
		try {
		  client.operationPath("/resources", c, "updateConfigurationFromPolicy", null, instanceName);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerServiceMessageEnum.REMOTE_updateConfigurationFromPolicy, e.toString());
			throw new RuntimeException("remote call failed:  updateConfigurationFromPolicy", e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

	@Override
	public void runHealthTests() {
		EClass c = DockerPackage.eINSTANCE.getDockerService(); //foo
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(DockerServiceOperationEnum.REMOTE_runHealthTests);
		
		try {
		  client.operationPath("/resources", c, "runHealthTests", null);
		}
		catch (Exception e) {
			ecomplogger.warn(DockerServiceMessageEnum.REMOTE_runHealthTests, e.toString());
			throw new RuntimeException("remote call failed:  runHealthTests", e);
		}
		ecomplogger.recordMetricEventEnd();
		
	}

}
