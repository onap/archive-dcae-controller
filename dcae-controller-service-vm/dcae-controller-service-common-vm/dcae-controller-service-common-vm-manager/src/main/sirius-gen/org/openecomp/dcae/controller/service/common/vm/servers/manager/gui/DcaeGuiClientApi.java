
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
package org.openecomp.dcae.controller.service.common.vm.servers.manager.gui;




import java.io.InputStream;

import org.openecomp.ncomp.sirius.manager.IRequestHandler;
import org.openecomp.ncomp.sirius.manager.ISiriusPlugin;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.function.FunctionUtils;
import org.openecomp.ncomp.component.ApiRequestStatus;

import org.apache.log4j.Logger;

import org.openecomp.logger.EcompLogger;

import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;

import java.util.Date;

import org.openecomp.dcae.controller.service.common.vm.servers.manager.gui.logging.GuiClientApiOperationEnum;
import org.openecomp.dcae.controller.service.common.vm.servers.manager.gui.logging.GuiClientApiMessageEnum;







import org.openecomp.ncomp.sirius.gui.tools.*;





import org.openecomp.ncomp.gwt.siriusportal.model.*;





import org.openecomp.ncomp.sirius.manager.Subject;





import org.openecomp.ncomp.sirius.manager.ManagementServer;





import org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer;


import org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiClientApiImpl;



public class DcaeGuiClientApi extends GuiClientApiImpl {
	public static final Logger logger = Logger.getLogger(DcaeGuiClientApi.class);
	static final EcompLogger ecomplogger = EcompLogger.getEcompLogger();
	public DcaeGuiClientApiProvider controller;
	ISiriusServer server;

	public DcaeGuiClientApi(ISiriusServer server) {
		this.server = server;
		this.controller = new DcaeGuiClientApiProvider(server,this);
	}

	public org.openecomp.ncomp.gwt.siriusportal.model.GuiTree getTree() {
		org.openecomp.ncomp.gwt.siriusportal.model.GuiTree res = null;
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "getTree", ApiRequestStatus.START, duration_);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(GuiClientApiOperationEnum.getTree);
		ecomplogger.setInstanceId(ManagementServer.object2ref(this));
		try {
			res =  controller.getTree();
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "getTree", ApiRequestStatus.ERROR, duration_);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(GuiClientApiMessageEnum.getTree, e.toString());
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "getTree", ApiRequestStatus.OKAY, duration_);
		return res;
	}

	public org.openecomp.ncomp.gwt.siriusportal.model.GuiObject getObject(java.lang.String path) {
		org.openecomp.ncomp.gwt.siriusportal.model.GuiObject res = null;
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "getObject", ApiRequestStatus.START, duration_,path);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(GuiClientApiOperationEnum.getObject);
		ecomplogger.setInstanceId(ManagementServer.object2ref(this));
		try {
			res =  controller.getObject(path);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "getObject", ApiRequestStatus.ERROR, duration_,path);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(GuiClientApiMessageEnum.getObject, e.toString());
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "getObject", ApiRequestStatus.OKAY, duration_,path);
		return res;
	}

	public org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie getTimeSerie(java.lang.String path, java.lang.String start, java.lang.String end, java.lang.String duration) {
		org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie res = null;
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "getTimeSerie", ApiRequestStatus.START, duration_,path,start,end,duration);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(GuiClientApiOperationEnum.getTimeSerie);
		ecomplogger.setInstanceId(ManagementServer.object2ref(this));
		try {
			res =  controller.getTimeSerie(path,start,end,duration);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "getTimeSerie", ApiRequestStatus.ERROR, duration_,path,start,end,duration);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(GuiClientApiMessageEnum.getTimeSerie, e.toString());
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "getTimeSerie", ApiRequestStatus.OKAY, duration_,path,start,end,duration);
		return res;
	}

	public org.openecomp.ncomp.gwt.siriusportal.model.GuiTable getTable(java.lang.String path, java.lang.String start, java.lang.String end) {
		org.openecomp.ncomp.gwt.siriusportal.model.GuiTable res = null;
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "getTable", ApiRequestStatus.START, duration_,path,start,end);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(GuiClientApiOperationEnum.getTable);
		ecomplogger.setInstanceId(ManagementServer.object2ref(this));
		try {
			res =  controller.getTable(path,start,end);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "getTable", ApiRequestStatus.ERROR, duration_,path,start,end);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(GuiClientApiMessageEnum.getTable, e.toString());
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "getTable", ApiRequestStatus.OKAY, duration_,path,start,end);
		return res;
	}

	public org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml getHtml(java.lang.String path, java.lang.String start, java.lang.String end) {
		org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml res = null;
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "getHtml", ApiRequestStatus.START, duration_,path,start,end);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(GuiClientApiOperationEnum.getHtml);
		ecomplogger.setInstanceId(ManagementServer.object2ref(this));
		try {
			res =  controller.getHtml(path,start,end);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "getHtml", ApiRequestStatus.ERROR, duration_,path,start,end);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(GuiClientApiMessageEnum.getHtml, e.toString());
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "getHtml", ApiRequestStatus.OKAY, duration_,path,start,end);
		return res;
	}

	public org.openecomp.ncomp.sirius.manager.graph.GuiGraph getGraph(java.lang.String path, java.lang.String start, java.lang.String end) {
		org.openecomp.ncomp.sirius.manager.graph.GuiGraph res = null;
		long duration_ = 0;
		if (server != null)
			server.getServer().recordApi(null, this, "getGraph", ApiRequestStatus.START, duration_,path,start,end);
		Date now_ = new Date();
		ecomplogger.recordMetricEventStart();
		ecomplogger.setOperation(GuiClientApiOperationEnum.getGraph);
		ecomplogger.setInstanceId(ManagementServer.object2ref(this));
		try {
			res =  controller.getGraph(path,start,end);
		}
		catch (Exception e) {
			duration_ = new Date().getTime()-now_.getTime();
			if (server != null)
				server.getServer().recordApi(null, this, "getGraph", ApiRequestStatus.ERROR, duration_,path,start,end);
			System.err.println("ERROR: " + e);
			ecomplogger.warn(GuiClientApiMessageEnum.getGraph, e.toString());
			throw e;
		}
		ecomplogger.recordMetricEventEnd();
		duration_ = new Date().getTime()-now_.getTime();
		if (server != null)
			server.getServer().recordApi(null, this, "getGraph", ApiRequestStatus.OKAY, duration_,path,start,end);
		return res;
	}






	public static void ecoreSetup() {
		DcaeGuiClientApiProvider.ecoreSetup();
	}
	public DcaeGuiClientApiProvider getSomfProvider() {
		return controller;
	}
}
