
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
	

package org.openecomp.dcae.controller.service.standardeventcollector.servers.manager;





import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.openecomp.ncomp.sirius.manager.IRequestHandler;
import org.openecomp.ncomp.sirius.manager.ISiriusPlugin;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.function.FunctionUtils;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;
import org.json.JSONArray;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;




import org.openecomp.dcae.controller.service.servers.dockermanager.DcaeDockerManagerProvider;
import org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ControllerServiceStandardeventcollectorManagerImpl;
import org.openecomp.dcae.controller.service.standardeventcollector.manager.ControllerServiceStandardeventcollectorManager;


public class DcaeControllerServiceStandardeventcollectorManagerProvider extends DcaeDockerManagerProvider {
	private static final Logger logger = Logger.getLogger(DcaeControllerServiceStandardeventcollectorManagerProvider.class);
	ControllerServiceStandardeventcollectorManager o;

	//private static final String HP_CH_CONFIG = "/etc/dcae/channel.json";
	private static final String DMAAP_CONFIG = "/etc/dcae/dmaap.conf";

	//To be updated to docker localtion and remove _COPY reference
	//private static final String HP_MAIN_CONFIG = "/home/dcae/SEC/SE-Collector-1.0.0-SNAPSHOT/etc/HPProcessingConfig.json";
	//private static final String HP_MAIN_CONFIG_COPY = "/home/dcae/SEC/SE-Collector-1.0.0-SNAPSHOT/etc/HPProcessingConfig.json.copy";

	private static final String HP_MAIN_CONFIG = "/opt/app/SEC/etc/HPProcessingConfig.json";
	private static final String HP_MAIN_CONFIG_COPY = "/opt/app/SEC/etc/HPProcessingConfig.json";


	public DcaeControllerServiceStandardeventcollectorManagerProvider(ISiriusServer controller, ControllerServiceStandardeventcollectorManager o) {
		super(controller, o);
		this.o = o;
	}


    private void executeCommand(String cmd) {
    // TODO Auto-generated method stub
		Runtime run = Runtime.getRuntime();
		Process pr;
		try {
		pr = run.exec(cmd);
		pr.waitFor();
		BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		String line = "";
			while ((line = buf.readLine()) != null) {
			System.out.println("line is " +line);
			System.out.println("updated the config successfully");
			}
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }


      @Override
      public void configurationChanged() {
		  // important to call the super methods for handling DMaaP setup.
		  super.configurationChanged();

		  try {
		  //Added to avoid timing issues and ensure dmaap.conf is updated
		  // by the call to super.configurationChanges before checking contents into it.
			Thread.sleep(3000);
		  } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println ("Sleep time expired");
		  }
		  JSONArray charray = retrieveDmaapSetting();
	      	  System.out.println("Modified HPchannel config:" + charray);
		  logger.info("Modified HPchannel config: " + charray);

		  JSONObject channelconfig = new JSONObject();
		  channelconfig.put("channels", charray);
		  updateJsonToHPConfig (HP_MAIN_CONFIG, HP_MAIN_CONFIG,charray);
		  
		  //For debug purpose
		  //writeJsonToFile(HP_CH_CONFIG, channelconfig);
		  //updateJsonToHPConfig (HP_MAIN_CONFIG, HP_MAIN_CONFIG_COPY,charray);
		  

		  //Collector port
		  String cport = o.getCport();
		  if (cport !=null) {
					String cmd="";
			cmd = "bin/Cec_controller_update.sh " + "collector.service.port" +" "+ cport;
			executeCommand(cmd);
		  }

		  //Collector csecport
		  String csecport = o.getCsecport();
		  if (csecport !=null) {
					String cmd="";
						cmd = "bin/Cec_controller_update.sh " + "collector.service.secure.port" +" "+ csecport;
			executeCommand(cmd);
		  }

		  //Collector keystoreloc
		  String keystoreloc = o.getKeystoreloc();
		  if (cport !=null) {
					String cmd="";
						cmd = "bin/Cec_controller_update.sh " + "collector.keystore.file.location" +" "+ keystoreloc;
			executeCommand(cmd);
		  }

		  //Collector keystorepwd
		  String keystorepwd = o.getKeystorepwd();
		  if (cport !=null) {
					String cmd="";
						cmd = "bin/Cec_controller_update.sh " + "collector.keystore.password" +" "+ keystorepwd;
			executeCommand(cmd);
		  }

		  //Collector maxinputqueue
		  String maxinputqueue = o.getCport();
		  if (cport !=null) {
					String cmd="";
			cmd = "bin/Cec_controller_update.sh " + "collector.inputQueue.maxPending" +" "+ maxinputqueue;
			executeCommand(cmd);
		  }
		
		  //authid
		  String authid = o.getAuthid();
		  if (authid != null && !authid.equals("")) {
				  String cmd="";
				 cmd = "bin/Cec_controller_update.sh " + "header.authid" +" "+ authid;
		         executeCommand(cmd);
			} else {
				System.out.println("Auth ID is null");
		   }

			//authpwd
			String authpwd = o.getAuthpwd();
			if (authpwd != null && !authpwd.equals("")) {
				  String cmd="";
				  cmd = "bin/Cec_controller_update.sh " + "header.authpwd" +" "+ authpwd;
		          executeCommand(cmd);

			} else {
				System.out.println("Auth Password is null");
			}

			// Auth file
			String authfile = o.getAuthfile();
			if (authfile != null && !authfile.equals("")) {
				  String cmd="";
				  cmd = "bin/Cec_controller_update.sh " + "header.authstore" +" "+ authfile;
		          executeCommand(cmd);

			} else {
				System.out.println("authfile is null");
			}
			
			// Auth Flag
			String authflag = o.getAuthflag();
			if (authflag != null && !authflag.equals("")) {
				  String cmd="";
				  cmd = "bin/Cec_controller_update.sh " + "header.authflag" +" "+ authflag;
		          executeCommand(cmd);

			} else {
				System.out.println("authflag is null");
			}

			//checkschemaflag
			String checkschemaflag = o.getCheckschemaflag();
			if (checkschemaflag != null && !checkschemaflag.equals("")) {
				  String cmd="";
				  cmd = "bin/Cec_controller_update.sh " + "collector.schema.checkflag" +" "+ checkschemaflag;
		          executeCommand(cmd);

			} else {
				System.out.println("Schemaflag is null");
			}

			// schemafile
			String schemafile = o.getSchemafile();
			if (schemafile != null && !schemafile.equals("")) {
				  String cmd="";
				  cmd = "bin/Cec_controller_update.sh " + "collector.schema.file" +" "+ schemafile;
		          executeCommand(cmd);

			} else {
				System.out.println("Schemafile is null");
			}			
			
			resume();
      }
		  

private  JSONArray retrieveDmaapSetting() {
	String fileName = DMAAP_CONFIG;

	File f = new File(fileName);

	if (!f.exists() || !f.canRead() || f.isDirectory()) {
		System.out.println("faile to open file: [" + fileName + "]");
		return null;
	}

	String jsonData = readFile(fileName);
	JSONArray charray = new JSONArray();
	try {
		JSONObject jobj = verifyJSON(jsonData);
		JSONArray jarray = jobj.getJSONArray("dmaaps");

		for (int i = 0; i < jarray.length(); i++) {
			JSONObject tmpobj = jarray.getJSONObject(i);
			System.out.println("tempobj:" + tmpobj);
			JSONObject hpC = buildHpChannel(tmpobj);
			charray.put(hpC);
		}
	} catch (Exception e) {
		logger.warn("Failed_To_Get_DMaaP_Configuation: " + e);
	}

	return charray;

}

private  String readFile(String fileName) {
	String result = "";
	BufferedReader br = null;
	try {
		br = new BufferedReader(new FileReader(fileName));
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();
		while (line != null) {
			sb.append(line);
			line = br.readLine();
		}
		result = "{ \"dmaaps\":" + sb.toString() + "}";
	} catch (Exception e) {
		System.out.println("Failed to read file: [" + fileName + "]");
		logger.warn("Failed_To_Get_DMaaP_Configuation from file [" + fileName + "]" + e);
		e.printStackTrace();
	} finally {
		if (null != br) {
			try {
				br.close();
			} catch (Exception e) {
				logger.warn("readFile().BufferedReader cannot be closed");
			}
		}
	}
	return result;
}

private  JSONObject verifyJSON(String data) {
	JSONObject temp;
	try {
		temp = new JSONObject(data);
	} catch (Exception e) {
		temp = null;
		e.printStackTrace();
	}
	return temp;
}

private  JSONObject buildHpChannel(JSONObject tmpObj) {
	JSONObject hpC = new JSONObject();

	String hpName;
	String mrType = null; // UEB: in|out DMaaP: subscribe|publish
	String mrClass = "HpCambriaOutputStream";// getDmaapClass();
	String mrUrl = null;
	String sType = "HTTPS";
	String mrTopic = "";
	String hpGroup = "";
	String hpInstance = "0";
	String basicAuthUsername = null; // UEB apiKey, DMaaP: dmaapUserName
	String basicAuthPassword = null; // DMaaP: dmaapPassword
	String dmaapDataType = "message";

	mrUrl = tmpObj.getString("dmaapUrl");
	String[] urlParts = dmaapUrlSplit(mrUrl);

	mrType = tmpObj.getString("dmaapAction");
	if (mrType.equals("publish")) {
		mrType = "out";
	} else {
		mrType = "in";
		mrClass = "HpCambriaInputStream";// getDmaapClass();
	}

	//basicAuthUsername = tmpObj.getString("dmaapUserName");
	//basicAuthPassword = tmpObj.getString("dmaapPassword");
	String dataTypeTmp = tmpObj.getString("dmaapDataType");
	if (!dmaapDataType.equals(dataTypeTmp)) {
		System.out.println("Invalid DataType (non message) recieved" + dataTypeTmp );
		logger.warn("Invalid DataType (non message) recieved" + dataTypeTmp);
	}
	if (null != urlParts) {
		mrUrl = urlParts[2];
		
		if (urlParts[3].equals("events"))
		{
			mrTopic = urlParts[4];
		}
		else
		{
			mrTopic = urlParts[3];
		}
		if (mrType.equals("subscribe") || mrType.equals("in")) {
			if (urlParts.length > 4) {
				hpGroup = urlParts[5];
			}
			if (urlParts.length > 4) {
				hpInstance = urlParts[6];
			}
		}
	}

	hpName = tmpObj.getString("dmaapStreamId");

	String[] hostport = mrUrl.split(":");
	hpC.put("name", hpName);
	hpC.put("type", mrType);
	hpC.put("class", mrClass);
	//hpC.put("cambria.url", mrUrl);
	hpC.put("cambria.hosts", hostport[0]);
	hpC.put("cambria.topic", mrTopic);
	//hpC.put("cambria.connectionType", sType);
	//hpC.put("basicAuthUsername", basicAuthUsername);
	//hpC.put("basicAuthPassword", basicAuthPassword);
	if (mrType.equals("out")) {
		hpC.put("stripHpId", "true");
	} else {
		hpC.put("cambria.group", hpGroup);
		hpC.put("cambria.instance", hpInstance);
	}

	return hpC;
}

private static void writeJsonToFile(String fileName, JSONObject obj) {
	FileWriter file = null;
	try {

		file = new FileWriter(fileName);
		file.write(obj.toString(4));
	} catch (Exception e) {
		System.out.println(" FileWriter Error: " + e);
	} finally {
		if (file != null)
			try {
				file.close();
			} catch (Exception fe) {
			}
	}
}

private  String[] dmaapUrlSplit(String dmUrl) {
	String[] multUrls = dmUrl.split(",");

	StringBuffer newUrls = new StringBuffer();
	String urlParts[] = null;
	for (int i = 0; i < multUrls.length; i++) {
		urlParts = multUrls[i].split("/");
		if (i == 0) {
			newUrls = newUrls.append(urlParts[2]);
		} else {
			newUrls = newUrls.append(",").append(urlParts[2]);
		}
	}
	return urlParts;
}


private void updateJsonToHPConfig(String sourceName,String targetfile, JSONArray obj) {
	String jsonData = readFile(sourceName);
	JSONObject jobj = verifyJSON(jsonData);
	//JSONArray jarray = jobj.getJSONArray("dmaaps");
	JSONObject job = jobj.getJSONObject("dmaaps");

	
	
	job.remove("channels");
	job.put("channels", obj);
	writeJsonToFile(targetfile, job);
	
}

	
	
		

	@Override  
	public void start() {
		  String cmd="";
		  cmd = "bin/Cec_controller_update.sh " + "ADMIN" +" "+ "start";
          executeCommand(cmd);

		// TODO IMPLEMENT
		// throw new UnsupportedOperationException();
	}
	
	@Override
	public void suspend() {
		  String cmd="";
		  cmd = "bin/Cec_controller_update.sh " + "ADMIN" +" "+ "stop";
		  executeCommand(cmd);
	}

	@Override
	public void resume() {
		
		String cmd="";
		cmd = "bin/Cec_controller_update.sh " + "ADMIN" +" "+ "stop";
		executeCommand(cmd);
		  
		cmd="";
    	cmd = "bin/Cec_controller_update.sh " + "ADMIN" +" "+ "start";
        executeCommand(cmd);

        // TODO IMPLEMENT
		// throw new UnsupportedOperationException();
	}



	
}
