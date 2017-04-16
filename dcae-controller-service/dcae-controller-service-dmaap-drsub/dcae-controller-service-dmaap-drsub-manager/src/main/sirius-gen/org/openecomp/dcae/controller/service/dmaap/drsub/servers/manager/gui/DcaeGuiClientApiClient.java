
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
package org.openecomp.dcae.controller.service.dmaap.drsub.servers.manager.gui;

import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.HighAvailabilityClient;
import org.openecomp.ncomp.sirius.manager.GenericHttpClient;

import org.apache.log4j.Logger;

import org.openecomp.logger.EcompLogger;
import org.openecomp.logger.StatusCodeEnum;
import org.openecomp.logger.EcompException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiClientApiImpl;
import org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage;
import org.openecomp.dcae.controller.service.dmaap.drsub.servers.manager.gui.logging.GuiClientApiOperationEnum;
import org.openecomp.dcae.controller.service.dmaap.drsub.servers.manager.gui.logging.GuiClientApiMessageEnum;


import org.openecomp.dcae.controller.service.dmaap.drsub.servers.manager.DcaeControllerServiceDmaapDrsubManager; 



 
@SuppressWarnings("unchecked")
public class DcaeGuiClientApiClient extends GuiClientApiImpl {
	public static final Logger logger = Logger.getLogger(DcaeGuiClientApiClient.class);
	static final EcompLogger ecomplogger = EcompLogger.getEcompLogger();
	public AbstractClient client;

	public DcaeGuiClientApiClient(String file, String name) {
		DcaeControllerServiceDmaapDrsubManager.ecoreSetup(); 
		client = new GenericHttpClient(file,name);
		client.add("/gui", this);
		client.setVersion("ONAP-R2");
	}

	public DcaeGuiClientApiClient(String file, String name1, String name2) {
		HighAvailabilityClient client1 = new HighAvailabilityClient(file,name1,name2);
		client = client1.all; // requests should be forwarded to all.
		client.add("/gui", this);
		client.setVersion("ONAP-R2");
	}
	
	public DcaeGuiClientApiClient(AbstractClient c) {
		client = c;
		client.add("/resources", this);
		client.setVersion("ONAP-R2");
	}



	@Override
	public org.openecomp.ncomp.gwt.siriusportal.model.GuiTree getTree() {
		EClass c = ModelPackage.eINSTANCE.getGuiClientApi(); 
		ecomplogger.recordMetricEventStart(GuiClientApiOperationEnum.GuiClientApi_getTree,client.getRemote());
		org.openecomp.ncomp.gwt.siriusportal.model.GuiTree res;
		try {
		  res = (org.openecomp.ncomp.gwt.siriusportal.model.GuiTree) client.operationPath("/gui", c, "getTree", null);
		}
		catch (Exception e) {
			ecomplogger.warn(GuiClientApiMessageEnum.REMOTE_CALL_FAILED_getTree, e.toString());
			EcompException e1 = EcompException.create(GuiClientApiMessageEnum.REMOTE_CALL_FAILED_getTree,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR,GuiClientApiMessageEnum.REMOTE_CALL_FAILED_getTree,e.getMessage());
			throw e1;
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	@Override
	public org.openecomp.ncomp.gwt.siriusportal.model.GuiObject getObject(java.lang.String path) {
		EClass c = ModelPackage.eINSTANCE.getGuiClientApi(); 
		ecomplogger.recordMetricEventStart(GuiClientApiOperationEnum.GuiClientApi_getObject,client.getRemote());
		org.openecomp.ncomp.gwt.siriusportal.model.GuiObject res;
		try {
		  res = (org.openecomp.ncomp.gwt.siriusportal.model.GuiObject) client.operationPath("/gui", c, "getObject", null, path);
		}
		catch (Exception e) {
			ecomplogger.warn(GuiClientApiMessageEnum.REMOTE_CALL_FAILED_getObject, e.toString());
			EcompException e1 = EcompException.create(GuiClientApiMessageEnum.REMOTE_CALL_FAILED_getObject,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR,GuiClientApiMessageEnum.REMOTE_CALL_FAILED_getObject,e.getMessage());
			throw e1;
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	@Override
	public org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie getTimeSerie(java.lang.String path, java.lang.String start, java.lang.String end, java.lang.String duration) {
		EClass c = ModelPackage.eINSTANCE.getGuiClientApi(); 
		ecomplogger.recordMetricEventStart(GuiClientApiOperationEnum.GuiClientApi_getTimeSerie,client.getRemote());
		org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie res;
		try {
		  res = (org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie) client.operationPath("/gui", c, "getTimeSerie", null, path,start,end,duration);
		}
		catch (Exception e) {
			ecomplogger.warn(GuiClientApiMessageEnum.REMOTE_CALL_FAILED_getTimeSerie, e.toString());
			EcompException e1 = EcompException.create(GuiClientApiMessageEnum.REMOTE_CALL_FAILED_getTimeSerie,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR,GuiClientApiMessageEnum.REMOTE_CALL_FAILED_getTimeSerie,e.getMessage());
			throw e1;
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	@Override
	public org.openecomp.ncomp.gwt.siriusportal.model.GuiTable getTable(java.lang.String path, java.lang.String start, java.lang.String end) {
		EClass c = ModelPackage.eINSTANCE.getGuiClientApi(); 
		ecomplogger.recordMetricEventStart(GuiClientApiOperationEnum.GuiClientApi_getTable,client.getRemote());
		org.openecomp.ncomp.gwt.siriusportal.model.GuiTable res;
		try {
		  res = (org.openecomp.ncomp.gwt.siriusportal.model.GuiTable) client.operationPath("/gui", c, "getTable", null, path,start,end);
		}
		catch (Exception e) {
			ecomplogger.warn(GuiClientApiMessageEnum.REMOTE_CALL_FAILED_getTable, e.toString());
			EcompException e1 = EcompException.create(GuiClientApiMessageEnum.REMOTE_CALL_FAILED_getTable,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR,GuiClientApiMessageEnum.REMOTE_CALL_FAILED_getTable,e.getMessage());
			throw e1;
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	@Override
	public org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml getHtml(java.lang.String path, java.lang.String start, java.lang.String end) {
		EClass c = ModelPackage.eINSTANCE.getGuiClientApi(); 
		ecomplogger.recordMetricEventStart(GuiClientApiOperationEnum.GuiClientApi_getHtml,client.getRemote());
		org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml res;
		try {
		  res = (org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml) client.operationPath("/gui", c, "getHtml", null, path,start,end);
		}
		catch (Exception e) {
			ecomplogger.warn(GuiClientApiMessageEnum.REMOTE_CALL_FAILED_getHtml, e.toString());
			EcompException e1 = EcompException.create(GuiClientApiMessageEnum.REMOTE_CALL_FAILED_getHtml,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR,GuiClientApiMessageEnum.REMOTE_CALL_FAILED_getHtml,e.getMessage());
			throw e1;
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

	@Override
	public org.openecomp.ncomp.sirius.manager.graph.GuiGraph getGraph(java.lang.String path, java.lang.String start, java.lang.String end) {
		EClass c = ModelPackage.eINSTANCE.getGuiClientApi(); 
		ecomplogger.recordMetricEventStart(GuiClientApiOperationEnum.GuiClientApi_getGraph,client.getRemote());
		org.openecomp.ncomp.sirius.manager.graph.GuiGraph res;
		try {
		  res = (org.openecomp.ncomp.sirius.manager.graph.GuiGraph) client.operationPath("/gui", c, "getGraph", null, path,start,end);
		}
		catch (Exception e) {
			ecomplogger.warn(GuiClientApiMessageEnum.REMOTE_CALL_FAILED_getGraph, e.toString());
			EcompException e1 = EcompException.create(GuiClientApiMessageEnum.REMOTE_CALL_FAILED_getGraph,e,e.getMessage());
			ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR,GuiClientApiMessageEnum.REMOTE_CALL_FAILED_getGraph,e.getMessage());
			throw e1;
		}
		ecomplogger.recordMetricEventEnd();
		return res;
	}

}
