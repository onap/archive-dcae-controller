
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
package org.openecomp.dcae.controller.service.common.docker.servers.service;

import static org.openecomp.ncomp.utils.PropertyUtil.getPropertiesFromClasspath;

import java.io.IOException;
import java.util.Properties;
import java.util.TimeZone;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EFactory;

import org.openecomp.entity.EcompComponent;
import org.openecomp.entity.EcompSubComponent;
import org.openecomp.entity.EcompSubComponentInstance;
import org.openecomp.ncomp.sirius.manager.Jetty8Server;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;

import org.openecomp.dcae.controller.service.common.docker.service.CommonDockerService;






public class DcaeCommonDockerServiceServer implements ISiriusServer {
    public static final Logger logger = Logger.getLogger(DcaeCommonDockerServiceServer.class);
    String serverPath;
    ManagementServer server;
    DcaeCommonDockerService controller;
    String directory = "data";
//      LocationControllerApi api ;
    Jetty8Server webServer;
    DcaeServiceFactory f = new DcaeServiceFactory(this);
	


    public DcaeCommonDockerServiceServer(String filename) throws IOException {
		logger.warn("controller restarting");
		DcaeCommonDockerService.ecoreSetup(); 
		props = getPropertiesFromClasspath(filename);
        serverPath = (String) props.get("server.dir");
        server = new ManagementServer(f, "CommonDockerService", serverPath, filename);
        server.addFactory(f);

		server.addFactory(org.openecomp.dcae.controller.service.common.docker.service.ServiceFactory.eINSTANCE);
  

        server.addRuntimeFactories(this);
        server.start();
    }
    public void runWebserver() throws IOException {
        controller = (DcaeCommonDockerService) server.find("/").o;
        webServer = new Jetty8Server("service.properties");
        webServer.add("/resources",server);





        logger.info("Joining webserver");
        webServer.join();
    }
    static Properties props = null;
    public static void main(String []args) throws IOException {
            // ALWAYS USE GMT.
            TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
            
            DcaeCommonDockerServiceServer s = new DcaeCommonDockerServiceServer("service.properties");
            s.runWebserver();
    }
	public CommonDockerService getController() {
		return controller;
	}
	public ManagementServer getServer() {
		return server;
	}
}
