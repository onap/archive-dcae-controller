
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
	

package org.openecomp.dcae.controller.service.common.docker.servers.manager;

import java.io.OutputStreamWriter;
import java.util.Date;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import org.openecomp.dcae.controller.core.service.HealthTestResponse;
import org.openecomp.dcae.controller.core.service.HealthTestStatus;
import org.openecomp.dcae.controller.core.service.ServiceFactory;
import org.openecomp.dcae.controller.service.common.docker.manager.CommonDockerManager;
import org.openecomp.dcae.controller.service.servers.dockermanager.DcaeDockerManagerProvider;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.ManagementServerUtils;
import org.openecomp.ncomp.utils.ShellCmd;
import org.openecomp.ncomp.webservice.utils.FileUtils;

public class DcaeCommonDockerManagerProvider extends DcaeDockerManagerProvider {
	private static final Logger logger = Logger.getLogger(DcaeCommonDockerManagerProvider.class);
	CommonDockerManager o;

	public DcaeCommonDockerManagerProvider(ISiriusServer controller, CommonDockerManager o) {
		super(controller, o);
		this.o = o;
	}
	
	@Override
	public void configurationChanged() {
		super.configurationChanged();
        try {
        	Date now = new Date();
    		controller.getServer();
			JSONObject json = ManagementServer.ecore2json(o, 1000, null, true);
    		String filename = "/tmp/"+ now.getTime() + "json";
    		OutputStreamWriter w = FileUtils.filename2writer(filename);
    		w.append(json.toString(2));
    		w.close();
    		run(o.getScript() + " configurationChanged " + filename,60000);
        } catch (Exception e) {
            ManagementServerUtils.printStackTrace(e);
            logger.fatal("configurationChanged" + e);
            throw new RuntimeException(e);
        }
	}
	@Override
	public HealthTestResponse test() {
		String s = run(o.getScript() + " test", o.getTestTimeout());
		String a[] = s.split(":");
		int index = s.indexOf(":");
		String msg = index < 0 ? null : s.substring(index);
		HealthTestResponse res = ServiceFactory.eINSTANCE.createHealthTestResponse();
		if ("GREEN".equalsIgnoreCase(a[0])) {
			res.setStatus(HealthTestStatus.GREEN);
			res.setMessageCode(msg);
		} else if ("YELLOW".equalsIgnoreCase(a[0])) {
			res.setStatus(HealthTestStatus.YELLOW);
			res.setMessageCode(msg);
		} else if ("RED".equalsIgnoreCase(a[0])) {
			res.setStatus(HealthTestStatus.RED);
			res.setMessageCode(msg);
		} else {
			res.setStatus(HealthTestStatus.RED);
			res.setMessageCode("Bad return string: " + s);
		}
		return res;
	}
	
	@Override
	public void suspend() {
		run(o.getScript() + " suspend", o.getSuspendTimeout());
	}
	
	@Override
	public void resume() {
		run(o.getScript() + " resume", o.getResumeTimeout());
	}

	private String run(String cmd, long wait) {
		try {
			ShellCmd worker = new ShellCmd(cmd);
			return worker.result(wait);
		} catch (Exception e) {
			ManagementServerUtils.printStackTrace(e);
			logger.warn("Unable to run cmd: " + cmd + " " + e);
			throw new RuntimeException("Unable to run cmd: " + cmd + " " + e,e);
		}
	}
}
