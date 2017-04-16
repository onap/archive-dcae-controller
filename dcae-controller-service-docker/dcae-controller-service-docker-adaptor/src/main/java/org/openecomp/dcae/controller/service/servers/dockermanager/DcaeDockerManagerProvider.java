
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
	
package org.openecomp.dcae.controller.service.servers.dockermanager;

import java.io.OutputStreamWriter;
import java.util.Date;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.json.JSONArray;
import org.json.JSONObject;

import org.openecomp.dcae.controller.core.service.HealthTestResponse;
import org.openecomp.dcae.controller.core.service.HealthTestStatus;
import org.openecomp.dcae.controller.core.service.ServiceFactory;
import org.openecomp.dcae.controller.core.stream.DcaeStream;
import org.openecomp.dcae.controller.service.dockermanager.DockerManager;
import org.openecomp.dcae.controller.service.servers.dockermanager.logging.DockerManager2MessageEnum;
import org.openecomp.dcae.controller.service.servers.dockermanager.logging.DockerManager2OperationEnum;
import org.openecomp.logger.EcompMessageEnum;
import org.openecomp.logger.StatusCodeEnum;
import org.openecomp.ncomp.sirius.manager.BasicAdaptorProvider;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.ManagementServerUtils;
import org.openecomp.ncomp.sirius.manager.logging.NcompLogger;
import org.openecomp.ncomp.utils.ShellCmd;
import org.openecomp.ncomp.webservice.utils.FileUtils;

public class DcaeDockerManagerProvider extends BasicAdaptorProvider {
	private static final Logger logger = Logger.getLogger(DcaeDockerManagerProvider.class);
	private static final NcompLogger ecomplogger = NcompLogger.getNcompLogger();
	DockerManager o;
	private boolean suspended;

	public DcaeDockerManagerProvider(ISiriusServer controller, DockerManager o) {
		super(controller, o);
		this.o = o;
	}

	public HealthTestResponse test() {
		HealthTestResponse res = ServiceFactory.eINSTANCE.createHealthTestResponse();
		res.setStatus(HealthTestStatus.GREEN);
		return res;
	}

	public void suspend() {
		suspended = true;
	}

	public void resume() {
		suspended = false;
	}

	public java.lang.String publicKey() {
		throw new UnsupportedOperationException();
	}

	// US618656
	public void configurationChanged() {
		updateDMaapConfig();
	}

	// US618665
	private void updateDMaapConfig() {
		JSONArray a = new JSONArray();
		for (DcaeStream s : o.getInputStreams()) {
			JSONObject json = ManagementServer.ecore2json(s, 100, null, true);
			json.put("dmaapStreamId", s.getName());
			a.put(json);
		}
		for (DcaeStream s : o.getOutputStreams()) {
			JSONObject json = ManagementServer.ecore2json(s, 100, null, true);
			json.put("dmaapStreamId", s.getName());
			a.put(json);
		}
		write2file(a, "/tmp/dmaap.conf2");
		write2file(a, "/etc/dcae/dmaap.conf");

	}

	private void write2file(JSONArray a, String fileName) {
		try {
			OutputStreamWriter w = FileUtils.filename2writer(fileName);
			w.write(a.toString(2));
			w.close();
		} catch (Exception e) {
			logger.warn("Unable to write file: " + fileName);
			ManagementServerUtils.printStackTrace(e);
		}
	}

	public void updateStreams(EList<DcaeStream> inputStreams, EList<DcaeStream> outputStreams) {
		o.getInputStreams().clear();
		o.getInputStreams().addAll(inputStreams);
		o.getOutputStreams().clear();
		o.getOutputStreams().addAll(outputStreams);
	}

	public void scheduleCronjob(final String cmd, final long frequency) {
		ecomplogger.setOperation(DockerManager2OperationEnum.DOCKER_MANAGER_START_NEW_CRON);
		ecomplogger.newRequestId();
		ecomplogger.setInstanceId(controller, o);
		ecomplogger.recordAuditEventStart();
		EcompMessageEnum msg1 = DockerManager2MessageEnum.DOCKER_MANAGER_START_NEW_CRON;
		;
		ecomplogger.recordAuditEventEnd(StatusCodeEnum.COMPLETE, msg1, cmd, Long.toString(frequency));

		Thread t = new Thread("crontab: " + cmd) {
			@Override
			public void run() {
				while (true) {
					try {
						Date now = new Date();
						long wait = frequency - (now.getTime() % frequency);
						Thread.sleep(wait);
						if (suspended)
							continue;
						try {
							ecomplogger.setOperation(DockerManager2OperationEnum.DOCKER_MANAGER_START_CRON_RUN);
							ecomplogger.newRequestId();
							ecomplogger.setInstanceId(controller, o);
							ecomplogger.recordAuditEventStart();
							ShellCmd c = new ShellCmd(cmd);
							c.result(frequency);
							ecomplogger.recordAuditEventEnd();
						} catch (Exception e) {
							e.printStackTrace();
							EcompMessageEnum msg = DockerManager2MessageEnum.DOCKER_MANAGER_CRON_FAILURE;
							ecomplogger.recordAuditEventEnd(StatusCodeEnum.ERROR, msg, cmd, e.toString());
						}
					} catch (Exception e) {
						ManagementServerUtils.printStackTrace(e);
						logger.fatal("crontab: " + cmd + " " + e);
						try {
							Thread.sleep(30000);
						} catch (InterruptedException e1) {
						}
					}
				}
			};
		};
		t.start();
	}

}
