
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
	
package org.openecomp.dcae.controller.service.common.vm.servers.manager;

import java.io.File;
import java.io.OutputStreamWriter;

import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.ManagementServerUtils;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import java.util.Date;

import org.openecomp.ncomp.utils.ShellCmd;
import org.openecomp.ncomp.webservice.utils.FileUtils;
import org.openecomp.dcae.controller.core.service.HealthTestResponse;
import org.openecomp.dcae.controller.core.service.HealthTestStatus;
import org.openecomp.dcae.controller.core.service.ServiceFactory;
import org.openecomp.dcae.controller.service.servers.vmmanager.DcaeVirtualMachineManagerProvider;
import org.openecomp.dcae.controller.service.common.vm.manager.CommonVmManager;

public class DcaeCommonVmManagerProvider extends DcaeVirtualMachineManagerProvider {
	private static final Logger logger = Logger.getLogger(DcaeCommonVmManagerProvider.class);
	CommonVmManager o;

	public DcaeCommonVmManagerProvider(ISiriusServer controller, CommonVmManager o) {
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
			String filename = "/tmp/" + now.getTime() + "json";
			OutputStreamWriter w = FileUtils.filename2writer(filename);
			w.append(json.toString(2));
			w.close();
			File f = new File(filename);
			f.setReadable(true);
			run(o.getScript() + " configurationChanged " + filename, o.getConfigureTimeout());
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
