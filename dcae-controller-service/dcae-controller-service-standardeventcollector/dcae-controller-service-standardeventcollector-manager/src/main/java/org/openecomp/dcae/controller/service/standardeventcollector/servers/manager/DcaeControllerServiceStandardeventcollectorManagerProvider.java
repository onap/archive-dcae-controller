
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
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.utils.ShellCmd;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.json.JSONArray;








import java.util.concurrent.TimeoutException;

import org.openecomp.dcae.controller.service.servers.dockermanager.DcaeDockerManagerProvider;
import org.openecomp.dcae.controller.service.standardeventcollector.manager.ControllerServiceStandardeventcollectorManager;
import org.openecomp.dcae.controller.core.service.HealthTestResponse;
import org.openecomp.dcae.controller.core.service.HealthTestStatus;
import org.openecomp.dcae.controller.core.service.impl.ServiceFactoryImpl;


public class DcaeControllerServiceStandardeventcollectorManagerProvider extends DcaeDockerManagerProvider {
        private static final Logger logger = Logger.getLogger(DcaeControllerServiceStandardeventcollectorManagerProvider.class);
        ControllerServiceStandardeventcollectorManager o;


        private static final String DMAAP_CONFIG = "/etc/dcae/dmaap.conf";
        private static final String HP_MAIN_CONFIG = "/opt/app/VESCollector/etc/DmaapConfig.json";


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


        /** **/
        @Override
        public HealthTestResponse test() {
                super.start();
                HealthTestResponse resp = new ServiceFactoryImpl().createHealthTestResponse();
                String cmdOutput = "";
                try {
                        ShellCmd c = new ShellCmd("/opt/app/VESCollector/bin/VESrestfulCollector_Status.sh");
                        String s = c.result(60000);
                        int i = s.indexOf("\n");
                        System.out.println("DEBUG:HealthTestResponse i:" + i + " String S:" + s);
                        cmdOutput = i > 0 ? s.substring(0,i + 1) : s;
                } catch (IOException | InterruptedException | TimeoutException e) {
                        System.out.println("HealthCheck test execution FAILED");
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }

                System.out.println("test() VESCollecter check " + cmdOutput);
                if (cmdOutput.startsWith("VESCollecter_Is_Running ")) {
                        resp.setStatus(HealthTestStatus.GREEN);
                        resp.setMessageCode("OK");
                        logger.error("HealthTest: VESCollecter_Is_Running");
                        System.out.println("INFO: HealthTest: VESCollecter_Is_Running");
                } else if (cmdOutput.startsWith("VESCollecter_Is_HavingError")) {
                        resp.setStatus(HealthTestStatus.YELLOW);
                        resp.setMessageCode("ERROR: VESCollecter_Is_HavingError");
                        logger.error("HealthTest: VESCollecter_Is_HavingError");
                        System.out.println("ERROR: HealthTest: VESCollecter_Is_HavingError");
                } else {
                        resp.setStatus(HealthTestStatus.RED);
                        resp.setMessageCode("ERROR: VESCollecter_Is_Not_Running");
                        logger.error("HealthTest: VESCollecter_Is_Not_Running");
                        System.out.println("ERROR: HealthTest: VESCollecter_Is_Not_Running");
                }

                return resp;
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
                        cmd = "bin/VES_controller_update.sh " + "collector.service.port" +" "+ cport;
                        executeCommand(cmd);
                  }

                  //Collector csecport
                  String csecport = o.getCsecport();
                  if (csecport !=null) {
                                        String cmd="";
                                        cmd = "bin/VES_controller_update.sh " + "collector.service.secure.port" +" "+ csecport;
                                        executeCommand(cmd);
                  }

                  //Collector keystoreloc
                  String keystoreloc = o.getKeystoreloc();
                  if (keystoreloc !=null) {
                                        String cmd="";
                                        cmd = "bin/VES_controller_update.sh " + "collector.keystore.file.location" +" "+ keystoreloc;
                                        executeCommand(cmd);
                  }

                  //Collector keystorepwdfile
                  String keystorepwdfile = o.getKeystorepwdloc();
                  if (keystorepwdfile !=null) {
                                        String cmd="";
                                        cmd = "bin/VES_controller_update.sh " + "collector.keystore.passwordfile" +" "+ keystorepwdfile;
                                        executeCommand(cmd);
                  }

                  //Collector keystorealias
                  String keystorealias = o.getKeystorealias();
                  if (keystorealias !=null) {
                                        String cmd="";
                                        cmd = "bin/VES_controller_update.sh " + "collector.keystore.alias" +" "+ keystorealias;
                                        executeCommand(cmd);
                  }
                  //Collector maxinputqueue
                  String maxinputqueue = o.getCport();
                  if (maxinputqueue !=null) {
                                        String cmd="";
                                        cmd = "bin/VES_controller_update.sh " + "collector.inputQueue.maxPending" +" "+ maxinputqueue;
                                        executeCommand(cmd);
                  }

                        //checkschemaflag
                        String checkschemaflag = o.getCheckschemaflag();
                        if (checkschemaflag != null && !checkschemaflag.equals("")) {
                                  String cmd="";
                                  cmd = "bin/VES_controller_update.sh " + "collector.schema.checkflag" +" "+ checkschemaflag;
                          executeCommand(cmd);

                        } else {
                                System.out.println("Schemaflag is null");
                        }

                        //authflag
                        String authflag = o.getAuthflag();
                        if (authflag != null && !authflag.equals("")) {
                                  String cmd="";
                                  cmd = "bin/VES_controller_update.sh " + "header.authflag" +" "+ authflag;
                          executeCommand(cmd);

                        } else {
                                System.out.println("authlist is null");
                        }

                        //authlist - replaces authid/pwd
                        String authlist = o.getAuthlist();
                        if (authlist != null && !authlist.equals("")) {
                                  String cmd="";
                                  cmd = "bin/VES_controller_update.sh " + "header.authlist" +" "+ authlist;
                          executeCommand(cmd);

                        } else {
                                System.out.println("authlist is null");
                        }

                        //StreamID
                        String streamid = o.getStreamid();
                        if (streamid != null && !streamid.equals("")) {
                                  String cmd="";
                                  cmd = "bin/VES_controller_update.sh " + "collector.dmaap.streamid" +" "+ streamid;
                          executeCommand(cmd);
                        } else {
                                System.out.println("streamid is null");
                        }

                        // schemafile
                        String schemafile = o.getSchemafile();
                        if (schemafile != null && !schemafile.equals("")) {
                                  String cmd="";
                                  cmd = "bin/VES_controller_update.sh " + "collector.schema.file" +" "+ schemafile;
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

        hpName = tmpObj.getString("dmaapStreamId");
        hpC.put("name", hpName);
        hpC.put("type", mrType);
        hpC.put("class", mrClass);

        if (tmpObj.has("dmaapUserName") && tmpObj.has("dmaapPassword") )
        {
                basicAuthPassword = tmpObj.getString("dmaapPassword");
                basicAuthUsername = tmpObj.getString("dmaapUserName");
                 if (basicAuthUsername != null && !basicAuthUsername.equals(""))
                {
                        if (basicAuthPassword != null && !basicAuthPassword.equals(""))
                        {
                                        hpC.put("basicAuthUsername", basicAuthUsername);
                                hpC.put("basicAuthPassword", basicAuthPassword);
                                hpC.put("cambria.connectionType", sType);
                        }
                }

        }

        String dataTypeTmp = tmpObj.getString("dmaapDataType");
        if (!dmaapDataType.equals(dataTypeTmp)) {
                System.out.println("Invalid DataType (non message) recieved" + dataTypeTmp );
                logger.warn("Invalid DataType (non message) recieved" + dataTypeTmp);
        }
        if (null != urlParts) {
                mrUrl = urlParts[2];

                //DCAE internal dmaap topic convention
                if (urlParts[3].equals("events"))
                {
                        mrTopic = urlParts[4];
                        hpC.put("cambria.url", mrUrl);

                }
                else {
                //ONAP dmaap topic convention
                        mrTopic = urlParts[3];
                        String[] hostport = mrUrl.split(":");
                        hpC.put("cambria.hosts", hostport[0]);
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

        hpC.put("cambria.topic", mrTopic);

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

/***
 *      Dmaap url structure
 *  pub - https://<dmaaphostname>:<port>/events/<namespace>.dmaap.<dmaapcluster>.<topic>,
 *  sub - https://<dmaaphostname>:<port>/events/<namespace>.dmaap.<dmaapcluster>.<topic>/G1/u1";
 *
 *  Onap url structure
 *  pub - http://<dmaaphostname>:<port>/<unauthenticated>.<topic>,
 */

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
        JSONObject job = jobj.getJSONObject("dmaaps");



        job.remove("channels");
        job.put("channels", obj);
        writeJsonToFile(targetfile, job);

}





        @Override
        public void start() {
                  String cmd="";
                  cmd = "bin/VES_controller_update.sh " + "ADMIN" +" "+ "start";
          executeCommand(cmd);

                // TODO IMPLEMENT
                // throw new UnsupportedOperationException();
        }

        @Override
        public void suspend() {
                  String cmd="";
                  cmd = "bin/VES_controller_update.sh " + "ADMIN" +" "+ "stop";
                  executeCommand(cmd);
        }

        @Override
        public void resume() {

                String cmd="";
                cmd = "bin/VES_controller_update.sh " + "ADMIN" +" "+ "stop";
                executeCommand(cmd);

                cmd="";
        cmd = "bin/VES_controller_update.sh " + "ADMIN" +" "+ "start";
        executeCommand(cmd);

        // TODO IMPLEMENT
                // throw new UnsupportedOperationException();
        }




}
