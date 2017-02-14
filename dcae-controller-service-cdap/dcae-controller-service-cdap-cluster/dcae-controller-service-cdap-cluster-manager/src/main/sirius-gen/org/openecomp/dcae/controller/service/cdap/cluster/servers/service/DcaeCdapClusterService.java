
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
package org.openecomp.dcae.controller.service.cdap.cluster.servers.service;



import java.io.InputStream;

import org.openecomp.ncomp.sirius.manager.IRequestHandler;
import org.openecomp.ncomp.sirius.manager.ISiriusPlugin;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.function.FunctionUtils;
import org.openecomp.ncomp.component.ApiRequestStatus;

import org.apache.log4j.Logger;

import org.openecomp.logger.EcompLogger;

import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;

import java.util.Date;

import org.openecomp.dcae.controller.service.cdap.cluster.servers.service.logging.CdapClusterServiceOperationEnum;




import org.openecomp.dcae.controller.service.cdap.cluster.service.impl.CdapClusterServiceImpl;



public class DcaeCdapClusterService extends CdapClusterServiceImpl implements ISiriusPlugin {
	public static final Logger logger = Logger.getLogger(DcaeCdapClusterService.class);
	static final EcompLogger ecomplogger = EcompLogger.getEcompLogger();
	public DcaeCdapClusterServiceProvider controller;
	ISiriusServer server;

	public DcaeCdapClusterService(ISiriusServer server) {
		this.server = server;
		this.controller = new DcaeCdapClusterServiceProvider(server,this);
	}

	public void deploy(java.lang.String instanceName, java.lang.String containerPath) {
		
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "deploy", ApiRequestStatus.START, duration_,instanceName,containerPath);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(CdapClusterServiceOperationEnum.deploy);
		try {
			 controller.deploy(instanceName,containerPath);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "deploy", ApiRequestStatus.ERROR, duration_,instanceName,containerPath);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "deploy", ApiRequestStatus.OKAY, duration_,instanceName,containerPath);
		
	}

	public void undeploy(java.lang.String instanceName) {
		
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "undeploy", ApiRequestStatus.START, duration_,instanceName);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(CdapClusterServiceOperationEnum.undeploy);
		try {
			 controller.undeploy(instanceName);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "undeploy", ApiRequestStatus.ERROR, duration_,instanceName);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "undeploy", ApiRequestStatus.OKAY, duration_,instanceName);
		
	}

	public org.openecomp.dcae.controller.core.service.HealthTestResponse test(java.lang.String instanceName) {
		org.openecomp.dcae.controller.core.service.HealthTestResponse res = null;
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "test", ApiRequestStatus.START, duration_,instanceName);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(CdapClusterServiceOperationEnum.test);
		try {
			res =  controller.test(instanceName);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "test", ApiRequestStatus.ERROR, duration_,instanceName);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "test", ApiRequestStatus.OKAY, duration_,instanceName);
		return res;
	}

	public void suspend(java.lang.String instanceName) {
		
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "suspend", ApiRequestStatus.START, duration_,instanceName);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(CdapClusterServiceOperationEnum.suspend);
		try {
			 controller.suspend(instanceName);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "suspend", ApiRequestStatus.ERROR, duration_,instanceName);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "suspend", ApiRequestStatus.OKAY, duration_,instanceName);
		
	}

	public void resume(java.lang.String instanceName) {
		
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "resume", ApiRequestStatus.START, duration_,instanceName);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(CdapClusterServiceOperationEnum.resume);
		try {
			 controller.resume(instanceName);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "resume", ApiRequestStatus.ERROR, duration_,instanceName);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "resume", ApiRequestStatus.OKAY, duration_,instanceName);
		
	}

	public void pushManagerConfiguration(java.lang.String instanceName) {
		
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "pushManagerConfiguration", ApiRequestStatus.START, duration_,instanceName);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(CdapClusterServiceOperationEnum.pushManagerConfiguration);
		try {
			 controller.pushManagerConfiguration(instanceName);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "pushManagerConfiguration", ApiRequestStatus.ERROR, duration_,instanceName);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "pushManagerConfiguration", ApiRequestStatus.OKAY, duration_,instanceName);
		
	}

	public void pollManagerConfiguration(java.lang.String instanceName) {
		
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "pollManagerConfiguration", ApiRequestStatus.START, duration_,instanceName);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(CdapClusterServiceOperationEnum.pollManagerConfiguration);
		try {
			 controller.pollManagerConfiguration(instanceName);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "pollManagerConfiguration", ApiRequestStatus.ERROR, duration_,instanceName);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "pollManagerConfiguration", ApiRequestStatus.OKAY, duration_,instanceName);
		
	}

	public org.eclipse.emf.ecore.EObject managerConfiguration(java.lang.String instanceName) {
		org.eclipse.emf.ecore.EObject res = null;
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "managerConfiguration", ApiRequestStatus.START, duration_,instanceName);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(CdapClusterServiceOperationEnum.managerConfiguration);
		try {
			res =  controller.managerConfiguration(instanceName);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "managerConfiguration", ApiRequestStatus.ERROR, duration_,instanceName);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "managerConfiguration", ApiRequestStatus.OKAY, duration_,instanceName);
		return res;
	}

	public org.json.JSONObject managerOperation(java.lang.String instanceName, java.lang.String operation, org.json.JSONObject parameters) {
		org.json.JSONObject res = null;
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "managerOperation", ApiRequestStatus.START, duration_,instanceName,operation,parameters);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(CdapClusterServiceOperationEnum.managerOperation);
		try {
			res =  controller.managerOperation(instanceName,operation,parameters);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "managerOperation", ApiRequestStatus.ERROR, duration_,instanceName,operation,parameters);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "managerOperation", ApiRequestStatus.OKAY, duration_,instanceName,operation,parameters);
		return res;
	}

	public void updateConfigurationFromPolicy(java.lang.String instanceName) {
		
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "updateConfigurationFromPolicy", ApiRequestStatus.START, duration_,instanceName);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(CdapClusterServiceOperationEnum.updateConfigurationFromPolicy);
		try {
			 controller.updateConfigurationFromPolicy(instanceName);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "updateConfigurationFromPolicy", ApiRequestStatus.ERROR, duration_,instanceName);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "updateConfigurationFromPolicy", ApiRequestStatus.OKAY, duration_,instanceName);
		
	}

	public void runHealthTests() {
		
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "runHealthTests", ApiRequestStatus.START, duration_);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(CdapClusterServiceOperationEnum.runHealthTests);
		try {
			 controller.runHealthTests();
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "runHealthTests", ApiRequestStatus.ERROR, duration_);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "runHealthTests", ApiRequestStatus.OKAY, duration_);
		
	}

	public void updateDeploymentStatus() {
		
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "updateDeploymentStatus", ApiRequestStatus.START, duration_);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(CdapClusterServiceOperationEnum.updateDeploymentStatus);
		try {
			 controller.updateDeploymentStatus();
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "updateDeploymentStatus", ApiRequestStatus.ERROR, duration_);
			System.err.println("ERROR: " + e);
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "updateDeploymentStatus", ApiRequestStatus.OKAY, duration_);
		
	}






	@Override
	public void start() {
		controller.start();
	}

	public static void ecoreSetup() {
		DcaeCdapClusterServiceProvider.ecoreSetup();
	}
	public DcaeCdapClusterServiceProvider getSomfProvider() {
		return controller;
	}
}
