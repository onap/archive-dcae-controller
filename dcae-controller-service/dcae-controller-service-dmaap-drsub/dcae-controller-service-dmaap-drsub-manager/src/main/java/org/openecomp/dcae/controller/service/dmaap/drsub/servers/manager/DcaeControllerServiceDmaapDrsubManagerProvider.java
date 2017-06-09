
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
	

/*
Copyright (c) 2015-16 AT&T Intellectual Property. All rights reserved.
THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF AT&T
The copyright notice above does not evidence any
actual or intended publication of such source code.
 */

package org.openecomp.dcae.controller.service.dmaap.drsub.servers.manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.utils.SecurityUtils;
import org.openecomp.dcae.controller.service.servers.vmmanager.DcaeVirtualMachineManagerProvider;
import org.openecomp.dcae.controller.service.dmaap.drsub.manager.ControllerServiceDmaapDrsubManager;

/**
 * Service Manager for DMaaP Data Router Subscriber. 
 * 
 */
public class DcaeControllerServiceDmaapDrsubManagerProvider extends DcaeVirtualMachineManagerProvider {
	public static final Logger logger = Logger.getLogger(DcaeControllerServiceDmaapDrsubManagerProvider.class);
	ControllerServiceDmaapDrsubManager o;

	private static final String APP_HOME_ENV = System.getenv("APP_DRSUB_HOME");
	private static final String APP_HOME = "/opt/app/dcae-analytics-dmaap-drsub";
	private static final String CTL_SCRIPT = "dmaapAfSub.sh";	// Subscriber control script 
	private static final String HDFS_SCRIPT = "create_hdfs_dirs.sh";	// HDFS directories creation script
	private static final int JSON_INDENT_FACTOR = 0;
	
	public DcaeControllerServiceDmaapDrsubManagerProvider(ISiriusServer controller, ControllerServiceDmaapDrsubManager o) {
		super(controller, o);
		this.o = o;
	}

    @Override
    public void configurationChanged() {
       // important to call the super methods for handling DMaaP setup.
       setDmaapConfigurationFile(o.getDmaapConfFile());
       super.configurationChanged();
    
       // we expect all configuration to be available at once
       // there is no support for individual parameter changes
       JSONObject json = new JSONObject();
       json.put("hdfs.uri", o.getHdfsUri());
       json.put("hdfs.uri_descr", o.getHdfsUriDescr());
       json.put("hdfs.persist.loc", o.getHdfsPersistLoc());
       json.put("hdfs.persist.loc_descr", o.getHdfsPersistLocDescr());
       json.put("dmaap.conf.file", o.getDmaapConfFile());
       json.put("dmaap.conf.file_descr", o.getDmaapConfFileDescr());
       json.put("dmaap.streamid", o.getDmaapStreamid());
       json.put("dmaap.streamid_descr", o.getDmaapStreamidDescr());
       
       String jsonStr = json.toString(JSON_INDENT_FACTOR);
       logger.info("JSON: " + jsonStr);

       String confFile = APP_HOME_ENV == null || APP_HOME_ENV == "" ?
    		   APP_HOME + "/conf/conf.json" :
    		   APP_HOME_ENV + "/conf/conf.json";
       confFile = SecurityUtils.safeFileName(confFile);
       logger.info("confFile: " + p(confFile));
       
       // save backup copy of configuration file
       try {
	       Path confFilePath = Paths.get(confFile);
	       if (Files.exists(confFilePath)) {
	    	   Files.move(confFilePath, Paths.get(confFile + ".bak"), StandardCopyOption.REPLACE_EXISTING);
	       }
       } catch (IOException e) {
    	   logger.warn("Couldn't rename " + confFile + " to " + confFile + ".bak");
    	   e.printStackTrace();
       }
       
       // write new configuration
       Writer w = null;
       try {
    	   w = new BufferedWriter(new FileWriter(confFile));
    	   w.write(jsonStr);
       } catch (IOException e) {
    	   logger.error("Error writing " + confFile);
    	   e.printStackTrace();
       } finally {
    	   if (w != null) {
    		   try {
    			   w.close();
    		   } catch (IOException ee) {
    		   	   ee.printStackTrace();
    		   }
    	   }
       }

       // call script to create HDFS directories based on updated configuration
       createHdfsDirs();
       
       // restart controlled process for config changes to take effect
       resume();
    }
    
    private String p(Object v) {
		return SecurityUtils.logForcingProtection(v);
	}

	@Override
    public void suspend() {
    	super.suspend();
    	
		List<String> command = new ArrayList<String>();
		logger.info("stopping");
		command.add(CTL_SCRIPT);
		command.add("stop");
		runScript(command);
	}

    @Override
    public void resume() {
    	super.resume();

    	List<String> command = new ArrayList<String>();
		logger.info("(re)starting");
		command.add(CTL_SCRIPT);
		command.add("restart");
		runScript(command);	
	}

	private void createHdfsDirs() {
    	List<String> command = new ArrayList<String>();
		logger.info("creating HDFS directories");
		command.add(HDFS_SCRIPT);
		runScript(command);
	}
	
    private void runScript(List<String> command) {
		String appBin = SecurityUtils.safeFileName(APP_HOME_ENV);
			    
		if (appBin == null || appBin.equals("")) {
		    appBin=APP_HOME;
		}
		appBin += "/bin";
		if (command.size() == 2) {
			File cmdFile = new File(appBin+"/"+command.get(0));
			if (cmdFile.exists()) {
			    try {
			    	ProcessBuilder builder = new ProcessBuilder(appBin+"/"+command.get(0),command.get(1));
			    	logger.info("command: ["+p(appBin)+"/"+command.get(0)+" "+command.get(1)+"]");
			    	System.out.println("command: ["+p(appBin)+"/"+command.get(0)+" "+command.get(1)+"]");
			        Process process = builder.start();
			        InputStream inStream = process.getInputStream();
			        process.waitFor();
			        System.out.println(convertStreamToStr(inStream));
			    } catch (InterruptedException|IOException e) {
			            e.printStackTrace();
			    }
			} else {
		    	logger.error("\""+p(appBin)+"/"+command.get(0)+"\" does not exist.");
		    }
		}
    }
	
	public static String convertStreamToStr(InputStream is) throws IOException {

		if (is != null) {
		   Writer writer = new StringWriter();

		   char[] buffer = new char[1024];
		   try {
		       Reader reader = new BufferedReader(new InputStreamReader(is,"UTF-8"));
		       int n;
		       while ((n = reader.read(buffer)) != -1) {
		            writer.write(buffer, 0, n);
		       }
		   } finally {
		       is.close();
		   }
		   return writer.toString();
		} else {
		   return "";
		}
	}	
	
}
