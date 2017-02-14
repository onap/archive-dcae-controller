
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
// Do not edit but extend this class as needed
package org.openecomp.dcae.controller.service.docker.host.servers.manager.gui;


import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import org.openecomp.ncomp.sirius.manager.console.Console;
import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.ManagementServerError;




public class DcaeGuiClientApiConsole extends Console {
	public static final Logger logger = Logger.getLogger(DcaeGuiClientApiConsole.class);
    protected DcaeGuiClientApiClient controller;
    



    public DcaeGuiClientApiConsole(String filename, String name) {
            super(filename, name);
            controller = new DcaeGuiClientApiClient(filename,name);
            client = controller.client;

    }
    
	public DcaeGuiClientApiConsole(AbstractClient c) {
        controller = new DcaeGuiClientApiClient(c);
        client = controller.client;
    }


	public org.openecomp.ncomp.gwt.siriusportal.model.GuiTree getTree() {
		org.openecomp.ncomp.gwt.siriusportal.model.GuiTree res = null;
		try {
			res =  controller.getTree();
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public org.openecomp.ncomp.gwt.siriusportal.model.GuiObject getObject(java.lang.String path) {
		org.openecomp.ncomp.gwt.siriusportal.model.GuiObject res = null;
		try {
			res =  controller.getObject(path);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie getTimeSerie(java.lang.String path, java.lang.String start, java.lang.String end, java.lang.String duration) {
		org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie res = null;
		try {
			res =  controller.getTimeSerie(path,start,end,duration);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public org.openecomp.ncomp.gwt.siriusportal.model.GuiTable getTable(java.lang.String path, java.lang.String start, java.lang.String end) {
		org.openecomp.ncomp.gwt.siriusportal.model.GuiTable res = null;
		try {
			res =  controller.getTable(path,start,end);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml getHtml(java.lang.String path, java.lang.String start, java.lang.String end) {
		org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml res = null;
		try {
			res =  controller.getHtml(path,start,end);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public org.openecomp.ncomp.sirius.manager.graph.GuiGraph getGraph(java.lang.String path, java.lang.String start, java.lang.String end) {
		org.openecomp.ncomp.sirius.manager.graph.GuiGraph res = null;
		try {
			res =  controller.getGraph(path,start,end);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

}
