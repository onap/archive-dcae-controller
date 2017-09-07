
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
	
package org.openecomp.dcae.controller.platform.servers.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

import org.openecomp.ncomp.sirius.manager.GenericHttpClient;
import org.openecomp.ncomp.sirius.manager.ISiriusPlugin;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.ManagementServerUtils;
import org.openecomp.ncomp.sirius.manager.Subject;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import org.openecomp.ncomp.sirius.manager.BasicAdaptorProvider;
import org.openecomp.ncomp.sirius.manager.logging.NcompLogger;
import org.openecomp.ncomp.sirius.manager.metrics.MetricManager;
import org.openecomp.ncomp.utils.SecurityUtils;
import org.openecomp.ncomp.webservice.utils.DateUtils;
import org.openecomp.dcae.controller.core.server.DcaeBasicServer;
import org.openecomp.dcae.controller.platform.controller.ControllerCluster;
import org.openecomp.dcae.controller.platform.controller.ControllerClusterServer;
import org.openecomp.dcae.controller.platform.controller.ControllerClusterServerData;
import org.openecomp.dcae.controller.platform.controller.ServerRole;
import org.openecomp.dcae.controller.platform.servers.controller.logging.DcaeControllerMessageEnum;
import org.openecomp.dcae.controller.platform.servers.controller.logging.DcaeControllerOperationEnum;
import org.openecomp.dcae.controller.service.vm.VirtualMachineService;
import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance;

public class DcaeControllerClusterProvider extends BasicAdaptorProvider implements ISiriusPlugin {
	private static final Logger logger = Logger.getLogger(DcaeControllerClusterProvider.class);
	static final NcompLogger ecomplogger = NcompLogger.getNcompLogger();
	ControllerCluster o;

	public DcaeControllerClusterProvider(ISiriusServer controller, ControllerCluster o) {
		super(controller, o);
		this.o = o;
	}

	public void pushData(String serverName, String dataName) {
		ControllerClusterServer s = findServer(serverName);
		ControllerClusterServerData d = findData(s, dataName);
		DcaeControllerClusterConsole console = console(s);
		Date now = new Date();
		MetricManager metrics = controller.getServer().metrics;
		metrics.setDateMetric(d, "lastPush", new Date());
		metrics.addIncreasingULongMetric(d, "numberDataPushes", 1L, false);
		try {
			console.receiveData("/resources/cluster", o.getMyServerName(), dataName, now, getContent(dataName));
		} catch (Exception e) {
			e.printStackTrace();
			metrics.addIncreasingULongMetric(d, "numberDataPushErrors", 1L, false);
		}
	}

	private ControllerClusterServer findServer(String serverName) {
		for (ControllerClusterServer s : o.getServers()) {
			if (s.getName().equals(serverName))
				return s;
		}
		throw new RuntimeException("Unknown server: " + serverName);
	}

	private ControllerClusterServerData findData(ControllerClusterServer s, String name) {
		for (ControllerClusterServerData d : s.getData()) {
			if (d.getName().equals(name))
				return d;
		}
		throw new RuntimeException("Unknown date: " + name);
	}

	private String getContent(String dataName) {
		if (dataName.equals("state")) {
			JSONObject json = ManagementServer.ecore2json(o.eContainer(), 10000, null, true);
			if (json.has("cluster"))
				json.remove("cluster");
			if (json.has("configuration"))
				json.remove("configuration");
			if (json.has("component"))
				json.remove("component");
			// json = new JSONObject();
			return json.toString();
		}
		throw new RuntimeException("Unknown server: " + dataName);
	}

	private DcaeControllerClusterConsole console(ControllerClusterServer s) {
		DcaeControllerClusterClient c = new DcaeControllerClusterClient("console.properties", "localhost");
		GenericHttpClient client = (GenericHttpClient) c.client;
		if (client.getBaseAddress() == null) {
			throw new RuntimeException("unable to determine baseaddress in controller.properties for: cluster");
		}
		String b = client.getBaseAddress();
		b = b.replaceFirst("localhost", s.getServer().getNetworks().get(0).getDnsName());
		client.setBaseAddress(b);
		logger.info("using baseAdress: " + client.getBaseAddress());
		return new DcaeControllerClusterConsole(client);
	}

	public void receiveData(String serverName, String dataName, Date time, String content) {
		if (o.getRole() != ServerRole.SLAVE) {
			logger.info("Ignoring data replication since not slave");
			return;
		}
		ControllerClusterServer s = findServer(serverName);
		ControllerClusterServerData d = findData(s, dataName);
		MetricManager metrics = controller.getServer().metrics;
		metrics.setDateMetric(d, "lastDataReceived", new Date());
		metrics.addIncreasingULongMetric(d, "numberDataReceived", 1L, false);

		try {
			if (dataName.equals("state")) {
				JSONObject json = new JSONObject(content);
				json.put("$updateEnumWithDefault", 1);
				json.put("$forcedUpdate", 1);
				Subject s1 = new Subject(controller.getServer().getObject());
				controller.getServer().update("controller", s1, json, true);
			}
		} catch (Exception e) {
			e.printStackTrace();
			metrics.addIncreasingULongMetric(d, "numberDataReceivedErrors", 1L, false);
		}
	}

	@Override
	public void start() {
		try {
			String hostname = SecurityUtils.getHostName();
			if (hostname.indexOf(".") > 0)
				hostname = hostname.substring(0, hostname.indexOf("."));
			o.setMyServerName(hostname);
			Subject subject = controller.getServer().find("/services/vm-controller");
			VirtualMachineService service = (subject != null) ? (VirtualMachineService) subject.o : null;
			if (service == null) {
				logger.warn("No controller service");
				return;
			}
			for (ControllerClusterServer s : o.getServers()) {
				for (VirtualMachineServiceInstance instance : service.getInstances()) {
					for (DcaeBasicServer server : instance.getServers()) {
						if (server.getName().equals(s.getName())) {
							s.setServer(server);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread t = new Thread("cluster replication") {
			@Override
			public void run() {
				while (true) {
					try {
						for (ControllerClusterServer s : o.getServers()) {
							if (s.getName().equals(o.getMyServerName()))
								o.setRole(s.getRole());
						}
						controller.getServer().isSlave = o.getRole() == ServerRole.SLAVE;
						if (o.getRole() == ServerRole.MASTER) {
							ecomplogger.setOperation(DcaeControllerOperationEnum.CLUSTER_DATA_REPLICATION);
							ecomplogger.newRequestId();
							ecomplogger.setInstanceId(controller, o);
							ecomplogger.recordAuditEventStart();
							for (ControllerClusterServer s : o.getServers()) {
								if (s.getRole() != ServerRole.SLAVE)
									continue;
								if (s.getName().equals(o.getMyServerName()))
									continue;
								for (ControllerClusterServerData d : s.getData()) {
									try {
										Date last = d.getLastPush() == null ? null : d.getLastPush().last;
										long i = DateUtils.stringToDuration(d.getPushInterval());
										long now = new Date().getTime();
										if (last != null && last.getTime() + i > now)
											continue;
										o.pushData(s.getName(), d.getName());
									} catch (Exception e) {
										ecomplogger.warn(DcaeControllerMessageEnum.CLUSTER_DATA_REPLICATION_FAILED,
												s.getName());
										ManagementServerUtils.printStackTrace(e);
									}
								}
							}
							ecomplogger.recordAuditEventEnd();
						}
						Thread.sleep(60000); // sleep 60 seconds
					} catch (Exception e) {
						ManagementServerUtils.printStackTrace(e);
						logger.fatal("cluster replication: " + e);
						try {
							Thread.sleep(30000);
						} catch (InterruptedException e1) {
						}
					}
				}
			}

		};
		t.start();
	}

}
