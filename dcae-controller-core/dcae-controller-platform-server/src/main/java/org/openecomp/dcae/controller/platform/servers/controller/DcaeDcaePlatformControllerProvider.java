
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.json.JSONArray;
import org.json.JSONObject;

import org.openecomp.dcae.controller.core.server.DcaeBasicServer;
import org.openecomp.dcae.controller.core.service.DcaeLocation;
import org.openecomp.dcae.controller.core.service.DcaePolicyEntity;
import org.openecomp.dcae.controller.core.service.DcaeService;
import org.openecomp.dcae.controller.core.service.DcaeServiceInstance;
import org.openecomp.dcae.controller.core.stream.DatabusDataRouterNode;
import org.openecomp.dcae.controller.core.stream.DatabusEntity;
import org.openecomp.dcae.controller.core.stream.DatabusLocation;
import org.openecomp.dcae.controller.core.stream.DatabusMessageRouterCluster;
import org.openecomp.dcae.controller.core.stream.DatabusStream;
import org.openecomp.dcae.controller.core.stream.DatabusStreamFeed;
import org.openecomp.dcae.controller.core.stream.DatabusStreamFeedPublisher;
import org.openecomp.dcae.controller.core.stream.DatabusStreamFeedSubscriber;
import org.openecomp.dcae.controller.core.stream.DatabusStreamTopic;
import org.openecomp.dcae.controller.core.stream.DatabusStreamTopicAction;
import org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient;
import org.openecomp.dcae.controller.core.stream.DcaeStream;
import org.openecomp.dcae.controller.core.stream.DmaapStream;
import org.openecomp.dcae.controller.core.stream.StreamAuthentication;
import org.openecomp.dcae.controller.core.stream.StreamFactory;
import org.openecomp.dcae.controller.inventory.DcaeInventory;
import org.openecomp.dcae.controller.platform.controller.ControllerPackage;
import org.openecomp.dcae.controller.platform.controller.DcaeDataBus;
import org.openecomp.dcae.controller.platform.controller.DcaePlatformController;
import org.openecomp.dcae.controller.platform.controller.ServerRole;
import org.openecomp.dcae.controller.platform.servers.controller.inventory.DcaeInventoryFactory;
import org.openecomp.dcae.controller.platform.servers.controller.logging.DcaeControllerMessageEnum;
import org.openecomp.dcae.controller.platform.servers.controller.logging.DcaeControllerOperationEnum;
import org.openecomp.dcae.controller.service.cdap.CdapService;
import org.openecomp.dcae.controller.service.cdap.CdapServiceInstance;
import org.openecomp.dcae.controller.service.docker.DockerService;
import org.openecomp.dcae.controller.service.docker.DockerServiceInstance;
import org.openecomp.dcae.controller.service.vm.VirtualMachineService;
import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance;
import org.openecomp.logger.StatusCodeEnum;
import org.openecomp.ncomp.core.DeploymentStatus;
import org.openecomp.ncomp.core.NamedEntity;
import org.openecomp.ncomp.sirius.manager.BasicManagementServerProvider;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ISwaggerHandler;
import org.openecomp.ncomp.sirius.manager.JavaHttpClient;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.ManagementServerUtils;
import org.openecomp.ncomp.sirius.manager.Subject;
import org.openecomp.ncomp.sirius.manager.logging.NcompLogger;
import org.openecomp.ncomp.sirius.manager.SwaggerUtils;
import org.openecomp.ncomp.utils.CryptoUtils;
import org.openecomp.ncomp.utils.PropertyUtil;
import org.openecomp.ncomp.webservice.utils.DateUtils;
import org.openecomp.ncomp.webservice.utils.JsonUtils;

public class DcaeDcaePlatformControllerProvider extends BasicManagementServerProvider {
	private static final Logger logger = Logger.getLogger(DcaeDcaePlatformControllerProvider.class);
	static final NcompLogger ecomplogger = NcompLogger.getNcompLogger();
	DcaePlatformController o;

	public DcaeDcaePlatformControllerProvider(ISiriusServer controller, DcaePlatformController o) {
		super(controller, o);
		this.o = o;
	}

	public static void ecoreSetup() {
		// TODO Auto-generated method stub

	}

	public void start() {
		if (o.getCluster() == null) {
			DcaeControllerFactory f3 = new DcaeControllerFactory(controller);
			o.setCluster(f3.createControllerCluster());
		}
		Thread t = new Thread("health checks") {
			@Override
			public void run() {
				while (true) {
					try {
						if (!controller.getServer().isSlave) {
							ecomplogger.setOperation(DcaeControllerOperationEnum.HEALTHCHECK);
							ecomplogger.newRequestId();
							ecomplogger.setInstanceId(controller, o);
							ecomplogger.recordAuditEventStart();
							for (DcaeService s : o.getServices()) {
								try {
									s.runHealthTests();
								} catch (Exception e) {
									ecomplogger.warn(DcaeControllerMessageEnum.HEALTHCHECK_SERVICE_FAILED, s.getName());
									ManagementServerUtils.printStackTrace(e);
								}
							}
							ecomplogger.recordAuditEventEnd();
						}
						Thread.sleep(60000); // sleep 60 seconds
					} catch (Exception e) {
						ManagementServerUtils.printStackTrace(e);
						logger.fatal("health checks: " + e);
						try {
							Thread.sleep(30000);
						} catch (InterruptedException e1) {
						}
					}
				}
			}
		};
		t.start();

		Thread t2 = new Thread("policy polling") {
			@Override
			public void run() {
				long frequency = 300000; // 5 minute default
				try {
					Properties props = PropertyUtil.getPropertiesFromClasspath("controller.properties");
					if (props.containsKey("policy.pollingFrequency")) {
						frequency = Long.parseLong(props.getProperty("policy.pollingFrequency"));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				while (true) {
					try {
						switch (o.getCluster().getRole()) {
						case MASTER:
						case UNKNOWN:
						case STANDALONE:
							ecomplogger.setOperation(DcaeControllerOperationEnum.POLICY_POLLING);
							ecomplogger.newRequestId();
							ecomplogger.setInstanceId(controller, o);
							ecomplogger.recordAuditEventStart();
							System.out.println("PPPPPPPPPPP polling start");
							for (DcaeService s : o.getServices()) {
								for (DcaeServiceInstance i : instances(s)) {
									System.out.println("PPPPPPPPPPP updateObjectUsingPolicy list: " + s.getName() + "/"
											+ i.getName());
									if (i.getStatus() != DeploymentStatus.DEPLOYED)
										continue;
									EList<DcaePolicyEntity> l = findPolicyEnabledObjects(i);
									System.out.println("PPPPPPPPPPP updateObjectUsingPolicy list: " + l);
									for (DcaePolicyEntity o2 : l) {
										try {
											System.out.println("PPPPPPPPPPP updateObjectUsingPolicy: " + o2);
											updateObjectUsingPolicy(o2, s, i);
										} catch (Exception e) {
											ecomplogger.warn(DcaeControllerMessageEnum.POLICY_POLLING_FAILED,
													ManagementServer.object2ref(o2), e.toString());
											ManagementServerUtils.printStackTrace(e);
										}
									}
								}
							}
							ecomplogger.recordAuditEventEnd();
							break;
						case SLAVE:
							break;
						}
						System.out.println("PPPPPPPPPPP frequency: " + frequency);
						Thread.sleep(frequency); // sleep 5 seconds
					} catch (Exception e) {
						ManagementServerUtils.printStackTrace(e);
						logger.fatal("policy polling: " + e);
						System.out.println("PPPPPPPPPPP error: " + e);
						try {
							Thread.sleep(30000);
						} catch (InterruptedException e1) {
						}
					}
				}
			}

		};
		t2.start();

		Thread t3 = new Thread("databus polling") {
			@Override
			public void run() {
				while (true) {
					try {
						switch (o.getCluster().getRole()) {
						case MASTER:
						case UNKNOWN:
						case STANDALONE:
							ecomplogger.setOperation(DcaeControllerOperationEnum.DATABUS_POLLING);
							ecomplogger.newRequestId();
							ecomplogger.setInstanceId(controller, o);
							ecomplogger.recordAuditEventStart();
							try {
								updateDatabusInformation();
								ecomplogger.recordAuditEventEnd();
							} catch (Exception e) {
								ecomplogger.warn(DcaeControllerMessageEnum.DATABUS_POLLING_FAILED, e.toString());
								ManagementServerUtils.printStackTrace(e);
								ecomplogger.recordAuditEventEnd(StatusCodeEnum.ERROR);
							}
							break;
						case SLAVE:
							break;
						}
						Thread.sleep(1 * 60000); // sleep 1 minutes
					} catch (Exception e) {
						ManagementServerUtils.printStackTrace(e);
						logger.fatal("health checks: " + e);
						try {
							Thread.sleep(30000);
						} catch (InterruptedException e1) {
						}
					}
				}
			}

		};
		t3.start();

		Thread t4 = new Thread("inventory polling") {
			@Override
			public void run() {
				while (true) {
					try {
						switch (o.getCluster().getRole()) {
						case MASTER:
						case UNKNOWN:
						case STANDALONE:
							ecomplogger.setOperation(DcaeControllerOperationEnum.INVENTORY_POLLING);
							ecomplogger.newRequestId();
							ecomplogger.setInstanceId(controller, o);
							ecomplogger.recordAuditEventStart();
							try {
								DcaeInventory inv = o.getInventory();
								if (inv == null) {
									inv = new DcaeInventoryFactory(controller).createDcaeInventory();
									o.setInventory(inv);
								}
								inv.poll();
								inv.updateConfiguration();
								ecomplogger.recordAuditEventEnd();
							} catch (Exception e) {
								ecomplogger.warn(DcaeControllerMessageEnum.INVENTORY_POLLING_FAILED, e.toString());
								ManagementServerUtils.printStackTrace(e);
								ecomplogger.recordAuditEventEnd(StatusCodeEnum.ERROR);
							}
							break;
						case SLAVE:
							break;
						}
						Thread.sleep(1 * 60000); // sleep 1 minutes
					} catch (Exception e) {
						ManagementServerUtils.printStackTrace(e);
						logger.fatal("health checks: " + e);
						try {
							Thread.sleep(30000);
						} catch (InterruptedException e1) {
						}
					}
				}
			}

		};
		t4.start();

	}

	protected void updateDatabusInformation() {
		if (o.getDatabus() == null)
			return;
		databusPoll(o.getDatabus());
		databusUpdateController(o.getDatabus());
		for (DatabusStream stream : o.getDatabus().getStreams()) {
			try {
				if (stream instanceof DatabusStreamFeed) {
					DatabusStreamFeed feed = (DatabusStreamFeed) stream;
					if (feed.getFeedName() == null) {
						databusAddFeed(feed, o.getDatabus());
					}
				}
				if (stream instanceof DatabusStreamTopic) {
					DatabusStreamTopic topic = (DatabusStreamTopic) stream;
					if (topic.getTopicName() == null) {
						databusAddTopic(topic);
					}
				}
			} catch (Exception e) {
				System.err.println("DATABUS ERROR:" + stream.getName() + " " + e);
				e.printStackTrace();
			}
		}
		HashMap<DcaeServiceInstance, List<DmaapStream>> inputs = new HashMap<DcaeServiceInstance, List<DmaapStream>>();
		HashMap<DcaeServiceInstance, List<DmaapStream>> outputs = new HashMap<DcaeServiceInstance, List<DmaapStream>>();
		for (DatabusStream stream : o.getDatabus().getStreams()) {
			if (stream instanceof DatabusStreamFeed) {
				DatabusStreamFeed feed = (DatabusStreamFeed) stream;
				for (DatabusStreamFeedPublisher p : feed.getPublishers()) {
					addStream(outputs, "file", "publish", p.getName(), p.getLocalStreamId(), p.getUsername(),
							p.getUserpwd(), feed.getPublishURL(), "password");
				}
				for (DatabusStreamFeedSubscriber s : feed.getSubscribers()) {
					addStream(inputs, "file", "subscribe", s.getName(), s.getLocalStreamId(), s.getUsername(),
							s.getUserpwd(), s.getDeliveryURL(), "password");
				}
			}
			if (stream instanceof DatabusStreamTopic) {
				DatabusStreamTopic topic = (DatabusStreamTopic) stream;
				for (DatabusStreamTopicClient p : topic.getClients()) {
					if (p.getAction().contains(DatabusStreamTopicAction.PUB))
						addStream(outputs, "message", "publish", p.getName(), p.getLocalStreamId(), p.getUsername(),
								p.getUserpwd(), p.getTopicURL(), topic.getAuthenticationMethod().toString());
					else
						addStream(inputs, "message", "subscribe", p.getName(), p.getLocalStreamId(), p.getUsername(),
								p.getUserpwd(), p.getTopicURL(), topic.getAuthenticationMethod().toString());
				}
			}
		}
		for (DcaeService s : o.getServices()) {
			for (DcaeServiceInstance i : instances(s)) {
				if (inputs.get(i) == null && outputs.get(i) == null)
					continue;
				String before = streamsHash(i);
				List<DcaeStream> in = new ArrayList<DcaeStream>();
				in.addAll(i.getInputStreams());
				List<DcaeStream> out = new ArrayList<DcaeStream>();
				out.addAll(i.getOutputStreams());
				i.getInputStreams().clear();
				if (inputs.get(i) != null)
					i.getInputStreams().addAll(inputs.get(i));
				i.getOutputStreams().clear();
				if (outputs.get(i) != null)
					i.getOutputStreams().addAll(outputs.get(i));
				String after = streamsHash(i);
				boolean okay = false;
				if (i.getStatus() == DeploymentStatus.DEPLOYED && !before.equals(after)) {
					try {
						s.pushManagerConfiguration(i.getName());
						okay = true;
					} catch (Exception e) {
						logger.warn("Unable to push configuration: " + ManagementServer.object2ref(i));
						e.printStackTrace();
					}
				} else {
					okay = true;
				}
				if (!okay && !before.equals(after)) {
					// need to restore previous state so next attempt will be
					// made.
					i.getInputStreams().clear();
					i.getInputStreams().addAll(in);
					i.getOutputStreams().clear();
					i.getOutputStreams().addAll(out);
				}
			}
		}
	}

	private String streamsHash(DcaeServiceInstance i) {
		StringBuffer buf = new StringBuffer();
		for (DcaeStream s : i.getInputStreams()) {
			buf.append(streamHash(s)).append("::");
		}
		for (DcaeStream s : i.getOutputStreams()) {
			buf.append(streamHash(s)).append("::");
		}
		return buf.toString();
	}

	private Object streamHash(DcaeStream s) {
		StringBuffer buf = new StringBuffer();
		if (s instanceof DmaapStream) {
			DmaapStream ss = (DmaapStream) s;
			buf.append(ss.getDmaapUrl()).append(":");
			buf.append(ss.getDmaapPassword()).append(":");
			buf.append(ss.getDmaapUserName()).append(":");
			buf.append(ss.getDmaapDataType()).append(":");
		}
		return buf.toString();
	}

	private void databusUpdateController(DcaeDataBus databus) {
		JavaHttpClient client = new JavaHttpClient("controller.properties", "databus");
		String drService = client.props.getProperty("databus.mr.service", "/services/vm-databus-dr-node");
		String mrService = client.props.getProperty("databus.mr.service", "/services/vm-databus-mr-node");
		Date time = new Date();
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		JSONObject json2 = new JSONObject();
		json2.put("dmaapName", client.props.get("databus.dmaapName"));
		json2.put("drProvUrl", client.props.get("databus.drProvUrl"));
		json2.put("version", "1");
		json2.put("topicNsRoot", client.props.getProperty("databus.topicNsRoot", "org.openecomp.dcae.dmaap"));
		json2.put("bridgeAdminTopic", "DCAE_MM_AGENT");
		try {
			client.httpJsonTransaction("/webapi/dmaap", "PUT", headers, json2);
			System.err.println("DATABUS: dmaap: " + json2);
		} catch (Exception e) {
			System.err.println("DATABUS: dmaap: FAILED");
		}
		for (DcaeLocation l : o.getLocations()) {
			if (findNamed(databus.getLocations(), l.getName()) != null)
				continue;
			// Need to update Databus Controller.
			JSONObject json = new JSONObject();
			json.put("dcaeLocationName", l.getName());
			json.put("dcaeLayer", l.getLocationType());
			client.httpJsonTransaction("/webapi/dcaeLocations", "POST", headers, json);
		}
		Subject s = controller.getServer().find(drService);
		if (s == null || s.o == null) {
			logger.warn("No vm-databus-dr-node service: " + drService);
		} else {
			VirtualMachineService drNodeService = (VirtualMachineService) s.o;
			for (VirtualMachineServiceInstance i : drNodeService.getInstances()) {
				for (DcaeBasicServer server : i.getServers()) {
					boolean found = findNamed(databus.getDrNodes(), server.getName()) != null;
					if (!found && i.getStatus() == DeploymentStatus.DEPLOYED) {
						// Need to update Databus Controller.
						JSONObject json = new JSONObject();
						json.put("hostName", server.getName());
						json.put("dcaeLocationName", i.getName());
						json.put("fqdn", server.getNetworks().get(0).getDnsName());
						client.httpJsonTransaction("/webapi/dr_nodes", "POST", headers, json);
						System.err.println("DATABUS: add dr node: " + server.getName() + " " + time);
					}
					if (found && i.getStatus() != DeploymentStatus.DEPLOYED) {
						client.httpJsonTransaction("/webapi/dr_nodes/" + server.getNetworks().get(0).getDnsName(),
								"DELETE", headers, null);
						System.err.println("DATABUS: delete dr node: " + server.getName() + " " + time);
					}
				}
			}
		}
		s = controller.getServer().find(mrService);
		if (s == null || s.o == null) {
			logger.error("No vm-databus-mr-node service: " + mrService);
		} else {
			VirtualMachineService mrNodeService = (VirtualMachineService) s.o;
			for (VirtualMachineServiceInstance i : mrNodeService.getInstances()) {
				boolean found = findNamed(databus.getMrClusters(), i.getName()) != null;
				if (!found && i.getStatus() == DeploymentStatus.DEPLOYED) {
					// Need to update Databus Controller.
					JSONObject json = new JSONObject();
					json.put("dcaeLocationName", i.getName());
					JSONArray a = new JSONArray();
					json.put("hosts", a);
					for (DcaeBasicServer server : i.getServers()) {
						a.put(server.getNetworks().get(0).getDnsName());
					}
					json.put("fqdn", i.getServiceFqdn());
					client.httpJsonTransaction("/webapi/mr_clusters", "POST", headers, json);
					System.err.println("DATABUS: add mr cluster: " + i.getName() + " " + time);
				}
				if (found && i.getStatus() != DeploymentStatus.DEPLOYED) {
					// TODO
					client.httpJsonTransaction("/webapi/mr_clusters/" + i.getName(), "DELETE", headers, null);
					System.err.println("DATABUS: delete mr cluster: " + i.getName() + " " + time);
				}
			}
		}
		databusCheckConsistency(databus);
	}

	private void databusCheckConsistency(DcaeDataBus databus) {
		for (DatabusStream s : databus.getStreams()) {
			if (s instanceof DatabusStreamFeed) {
				DatabusStreamFeed feed = (DatabusStreamFeed) s;
				for (DatabusStreamFeedSubscriber sub : feed.getSubscribers()) {
					if (!sub.getName().startsWith("forward:"))
						continue;
					String forwardStreamName = sub.getName().replace("forward:", "");
					DatabusStream s2 = findNamed(databus.getStreams(), forwardStreamName);
					if (!(s2 instanceof DatabusStreamFeed))
						continue;
					DatabusStreamFeed feed2 = (DatabusStreamFeed) s2;
					if (feed2.getPublishURL() == null)
						continue;
					if (!feed2.getPublishURL().equals(sub.getDeliveryURL())) {
						System.err.println("FEED: forward URL wrong: " + feed.getName() + " " + sub.getDeliveryURL()
								+ " != " + feed2.getPublishURL());
						o.refreshDataBus(feed.getName());
					}
				}
			}
		}
	}

	protected <T extends NamedEntity> T findNamed(EList<? extends T> l, String name) {
		for (T t : l) {
			if (t.getName() != null && t.getName().equals(name))
				return t;
		}
		return null;
	}

	private void addStream(HashMap<DcaeServiceInstance, List<DmaapStream>> m, String type, String action, String name,
			String id, String username, String userpwd, String url, String authMethod) {
		// name is service:locationName
		String a[] = name.split(":");
		if (a.length != 2)
			return;
		String path = "/services/" + a[0];
		Subject s = controller.getServer().find(path);
		if (s == null || s.o == null) {
			return;
		}
		DcaeService s1 = (DcaeService) s.o;
		for (DcaeServiceInstance i : instances(s1)) {
			if (!a[1].equals(location(i)))
				continue;
			DmaapStream d = StreamFactory.eINSTANCE.createDmaapStream();
			d.setName(id);
			d.setDmaapAuthMethod(authMethod);
			d.setDmaapAction(action);
			d.setDmaapDataType(type);
			d.setDmaapUrl(url);
			d.setDmaapUserName(username);
			d.setDmaapPassword(userpwd);
			// System.err.println("UPDATE: " + d);
			List<DmaapStream> l = m.get(i);
			if (l == null) {
				l = new ArrayList<DmaapStream>();
				m.put(i, l);
			}
			l.add(d);
		}
	}

	static int numberOfErrors = 0;
	static int tooMany = 40;

	// XX remove static

	private void databusAddFeed(DatabusStreamFeed feed, DcaeDataBus bus) {
		if (feed.getFeedName() != null && !feed.getFeedName().equals(""))
			return;
		if (numberOfErrors > tooMany) {
			logger.warn("Too many added");
			feed.setFeedName("FAILED TOO MANY");
			return;
		}
		try {
			JavaHttpClient client = new JavaHttpClient("controller.properties", "databus");
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("Content-Type", "application/json");
			JSONObject json = ManagementServer.ecore2json(feed, 100, feed.eClass(), true);
			System.err.println("FEED0: " + feed.getName() + " " + json.toString(2));
			if (feed.getPublishers().size() == 0) {
				// Add a generic publisher
				DatabusStreamFeedPublisher p = StreamFactory.eINSTANCE.createDatabusStreamFeedPublisher();
				p.setName("auto-add");
				feed.getPublishers().add(p);
			}
			if (feed.getSubscribers().size() == 0)
				return;
			for (DatabusStreamFeedSubscriber s : feed.getSubscribers()) {
				if (s.getOtherFeedName() == null) {
					continue;
				}
				DatabusStreamFeed feed2 = findFeed(bus, s.getOtherFeedName());
				if (feed2 == null)
					return;
				System.err.println("FEED X1: " + s.getOtherFeedName() + " " + feed2.getName());
				System.err.println("FEED X2: " + feed2.getPublishURL() + " " + feed2.getPublishers().size());
				if (feed2.getPublishURL() == null || feed2.getPublishers().size() == 0)
					return;
				s.setDeliveryURL(feed2.getPublishURL());
				DatabusStreamFeedPublisher p = feed2.getPublishers().get(0);
				s.setUsername(p.getUsername());
				s.setUserpwd(p.getUserpwd());
				System.err.println("FEED X2: " + s.getDeliveryURL() + " " + s.getUserpwd());
			}
			json = ManagementServer.ecore2json(feed, 100, feed.eClass(), true);
			String feedName = feed.getName() + ":" + new Date().getTime();
			json.put("feedVersion", "1.0");
			json.put("feedName", feedName);
			json.put("owner", "controller");
			JSONArray a = new JSONArray();
			JSONObject pub = json.getJSONObject("publishers");
			for (Iterator<String> i = pub.keys(); i.hasNext();) {
				String k = i.next();
				JSONObject json1 = pub.getJSONObject(k);
				String user = "dcae";
				if (json1.has("dcaeLocationName") && ! json1.getString("dcaeLocationName").equals("notSpecified") )
					user = json1.getString("dcaeLocationName");
				json1.put("username", user);
				if (json1.has("userpwd"))
					json1.put("userpwd", JavaHttpClient.decryptPassword(json1.getString("userpwd")));
				else
					json1.put("userpwd", password());
				if (json1.has("localStreamId"))
					json1.remove("localStreamId");
				if (json1.has("feedId"))
					json1.remove("feedId");
				if (json1.has("pubId"))
					json1.remove("pubId");
				if (json1.has("status"))
					json1.remove("status");
				a.put(json1);
			}
			json.put("pubs", a);
			json.remove("publishers");
			JSONArray a1 = new JSONArray();
			JSONObject sub = json.getJSONObject("subscribers");
			for (Iterator<String> i = sub.keys(); i.hasNext();) {
				String k = i.next();
				JSONObject json1 = sub.getJSONObject(k);
				if (!k.startsWith("external") && !k.startsWith("forward")) {
					String user = "dcae";
					if (json1.has("dcaeLocationName"))
						user = json1.getString("dcaeLocationName");
					json1.put("username", user);
					json1.put("userpwd", password());
				} else {
					if (json1.has("userpwd"))
						json1.put("userpwd", JavaHttpClient.decryptPassword(json1.getString("userpwd")));
				}
				if (json1.has("localStreamId"))
					json1.remove("localStreamId");
				if (json1.has("otherFeedName"))
					json1.remove("otherFeedName");
				if (json1.has("suspended"))
					json1.remove("suspended");
				if (json1.has("use100"))
					json1.remove("use100");
				if (json1.has("feedId"))
					json1.remove("feedId");
				if (json1.has("logURL"))
					json1.remove("logURL");
				if (json1.has("owner"))
					json1.remove("owner");
				if (json1.has("subId"))
					json1.remove("subId");
				a1.put(json1);
			}
			json.put("subs", a1);
			json.remove("subscribers");
			System.err.println("FEED1: " + json.toString(2));
			JSONObject res = client.httpJsonTransaction("/webapi/feeds", "POST", headers, json);
			if (res == null) {
				numberOfErrors++;
				feed.setFeedName("FAILED");
				logger.warn("unable to create feed: " + feed.getName() + " " + json.toString(2));
				return;
			}
			System.err.println("FEED2: " + res.toString(2));
			JSONArray aa1 = res.getJSONArray("pubs");
			JSONObject pub1 = new JSONObject();
			for (int i = 0; i < aa1.length() && i < feed.getPublishers().size(); i++) {
				pub1.put(feed.getPublishers().get(i).getName(), aa1.getJSONObject(i));
			}
			res.put("publishers", pub1);
			res.remove("pubs");
			JSONArray aa2 = res.getJSONArray("subs");
			JSONObject sub1 = new JSONObject();
			for (int i = 0; i < aa2.length(); i++) {
				if (aa2.get(i) instanceof JSONObject)
					sub1.put(feed.getSubscribers().get(i).getName(), aa2.getJSONObject(i));
				else {
					JSONObject j2 = new JSONObject();
					j2.put("username", "NULL");
					sub1.put(feed.getSubscribers().get(i).getName(), j2);
				}
			}
			res.put("subscribers", sub1);
			res.remove("subs");
			System.err.println("FEED3: " + res.toString(2));
			// XX use second
			// ManagementServer s = server;
			ManagementServer s = controller.getServer();
			DatabusStreamFeed feed1 = (DatabusStreamFeed) s.json2ecore(feed.eClass(), res);
			System.err.println("FEED4: " + ManagementServer.ecore2json(feed1, 100, feed.eClass(), true).toString(2));
			encryptPasswords(feed1);
			ManagementServer.merge(feed, feed1, res, true, null);
			if (feed.getFeedName() == null) {
				feed.setFeedName("FAILED with no name");
			}
			System.err.println("FEED5: " + ManagementServer.ecore2json(feed, 100, feed.eClass(), true).toString(2));
		} catch (Exception e) {
			numberOfErrors++;
			feed.setFeedName("ERROR: " + e.toString());
			e.printStackTrace();
		}
	}

	private void encryptPasswords(DatabusStreamFeed feed) {
		for (DatabusStreamFeedPublisher p : feed.getPublishers()) {
			if (p.getUserpwd() == null || p.getUserpwd().startsWith("rsa:"))
				continue;
			p.setUserpwd(encryptPassword(p.getUserpwd()));
		}
		for (DatabusStreamFeedSubscriber s : feed.getSubscribers()) {
			if (s.getUserpwd() == null || s.getUserpwd().startsWith("rsa:"))
				continue;
			s.setUserpwd(encryptPassword(s.getUserpwd()));
		}
	}

	private String encryptPassword(String v) {
		if (publicKey == null)
			publicKey = CryptoUtils.getKey("config/server.public");
		return "rsa:" + CryptoUtils.encryptPublic(publicKey, v);
	}

	private static DatabusStreamFeed findFeed(DcaeDataBus bus, String otherFeedName) {
		for (DatabusStream s : bus.getStreams()) {
			if (s instanceof DatabusStreamFeed) {
				DatabusStreamFeed f = (DatabusStreamFeed) s;
				if (f.getName().equals(otherFeedName))
					return f;
			}
		}
		return null;
	}

	// XX remove static
	private void databusAddTopic(DatabusStreamTopic topic) {
		if (topic.getTopicName() != null)
			return;
		if (topic.getClients().size() == 0)
			return;
		String topicName = topic.getName().replace("topic:", "");
		if (topic.getAuthenticationMethod() == StreamAuthentication.NONE) {
			for (DatabusStreamTopicClient c : topic.getClients()) {
				DatabusMessageRouterCluster m = findNamed(o.getDatabus().getMrClusters(), c.getDcaeLocationName());
				if (m == null)
					return;
				c.setFqtn("unauthenticated." + topicName);
				String protocol = m.getTopicProtocol() + "://";
				// TODO fix OPENECOMP hack
				// c.setTopicURL(protocol + m.getServiceFqdn() + ":" +
				// m.getTopicPort() + "/" + c.getFqtn());
				c.setTopicURL("http://" + m.getServiceFqdn() + ":" + "3904" + "/" + c.getFqtn());
			}
			topic.setTopicName(topicName);
			return;
		}
		if (numberOfErrors > tooMany) {
			logger.warn("Too many added");
			topic.setTopicName("FAILED TOO MANY");
			return;
		}
		for (DatabusStreamTopicClient p : topic.getClients())
			p.setTopicURL(null);
		try {
			JavaHttpClient client = new JavaHttpClient("controller.properties", "databus");
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("Content-Type", "application/json");
			JSONObject json = ManagementServer.ecore2json(topic, 100, topic.eClass(), true);
			if (topic.getFqtn() != null) {
				try {
					client.httpJsonTransaction("/webapi/topics/" + topic.getFqtn(), "DELETE", headers, null);
				} catch (Exception e) {
					System.err.println("TOPIC0: delete existing topic: " + topicName + " " + e);
				}
				System.err.println("TOPIC0: delete existing topic: " + topicName);
			} else
				System.err.println("TOPIC0: new topic: " + topicName);
			json.put("topicName", topicName);
			json.put("owner", "controller");
			json.put("txenabled", false);
			JSONArray a = new JSONArray();
			JSONObject clients = json.getJSONObject("clients");
			for (Iterator<String> i = clients.keys(); i.hasNext();) {
				String k = i.next();
				JSONObject json1 = clients.getJSONObject(k);
				if (json1.has("localStreamId"))
					json1.remove("localStreamId");
				if (json1.has("username"))
					json1.remove("username");
				if (json1.has("userpwd"))
					json1.remove("userpwd");
				if (json1.has("fqtn"))
					json1.remove("fqtn");
				if (json1.has("mrClientId"))
					json1.remove("mrClientId");
				a.put(json1);
			}
			json.put("clients", a);
			System.err.println("TOPIC1: " + json.toString(2));
			JSONObject res;
			try {
				res = client.httpJsonTransaction("/webapi/topics", "POST", headers, json);
			} catch (Exception e) {
				if (e.getMessage().contains("topic already exists")) {
					String s = e.getMessage();
					int i = s.indexOf("topic already exists");
					s = s.substring(i + "topic already exists: ".length()).replace("\"}", "");
					topic.setFqtn(s);
					System.err.println("TOPIC2: topic already exists without FQTN");
					return;
				}
				throw e;
			}
			if (res == null) {
				numberOfErrors++;
				logger.warn("unable to create topic: " + topic.getName() + " " + json.toString(2));
				return;
			}
			System.err.println("TOPIC2: " + res.toString(2));
			JSONArray aa1 = res.getJSONArray("clients");
			JSONObject clients1 = new JSONObject();
			for (int i = 0; i < aa1.length() && i < topic.getClients().size(); i++) {
				clients1.put(topic.getClients().get(i).getName(), aa1.getJSONObject(i));
			}
			res.put("clients", clients1);
			System.err.println("TOPIC3: " + res.toString(2));
			// XX use second
			// ManagementServer s = server;
			ManagementServer s = controller.getServer();
			DatabusStreamTopic topic1 = (DatabusStreamTopic) s.json2ecore(topic.eClass(), res);
			System.err.println("TOPIC4: " + ManagementServer.ecore2json(topic1, 100, topic.eClass(), true).toString(2));
			ManagementServer.merge(topic, topic1, res, true, null);
			if (topic.getTopicName() == null) {
				topic.setTopicName("FAILED with no name");
			}
			System.err.println("TOPIC5: " + ManagementServer.ecore2json(topic, 100, topic.eClass(), true).toString(2));
		} catch (Exception e) {
			numberOfErrors++;
			topic.setTopicName("ERROR: " + e.toString());
		}
	}

	private static String password() {
		return new BigInteger(130, new SecureRandom()).toString(32);
	}

	static ManagementServer server;

	public static void main(String[] args) throws IOException {
		server = new ManagementServer();
		JSONObject json = JsonUtils.file2json("CONFIG/controller-gen/resources/databus.json");
		DcaeDataBus d = (DcaeDataBus) server.json2ecore(ControllerPackage.eINSTANCE.getDcaeDataBus(), json);
		databusPoll(d);
		for (DatabusStream stream : d.getStreams()) {
			if (stream instanceof DatabusStreamFeed) {
				DatabusStreamFeed feed = (DatabusStreamFeed) stream;
				if (feed.getFeedName() == null) {
					// XX comment out
					// databusAddFeed(feed,d);
				}
			}
			if (stream instanceof DatabusStreamTopic) {
				DatabusStreamTopic feed = (DatabusStreamTopic) stream;
				if (feed.getTopicName() == null) {
					// XX comment out
					// databusAddTopic(feed);
				}
			}
		}
		System.out.println("FEED5: " + ManagementServer.ecore2json(d, 100, null, true).toString(2));
		// updateDatabusInformation();
	}

	private static void databusPoll(DcaeDataBus d) {
		JavaHttpClient client = new JavaHttpClient("controller.properties", "databus");
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		// locations
		JSONObject res1 = client.httpJsonTransaction("/webapi/dcaeLocations", "GET", headers, null);
		// System.err.println("DATABUS0: locations" + res1.toString(2));
		databusJson2locations(res1, d);
		// mr_clusters
		JSONObject res2 = client.httpJsonTransaction("/webapi/mr_clusters", "GET", headers, null);
		// System.err.println("DATABUS0: mr_clusters" + res2.toString(2));
		databusJson2mrClusters(res2, d);
		// dr_nodes
		JSONObject res3 = client.httpJsonTransaction("/webapi/dr_nodes", "GET", headers, null);
		// System.err.println("DATABUS0: dr_nodes" + res3.toString(2));
		databusJson2drNodes(res3, d);

	}

	private static void databusJson2drNodes(JSONObject json, DcaeDataBus d) {
		JSONArray a = json.getJSONArray("$list");
		List<DatabusDataRouterNode> l = new ArrayList<DatabusDataRouterNode>();
		for (int i = 0; i < a.length(); i++) {
			JSONObject locJson = a.getJSONObject(i);
			DatabusDataRouterNode drNode = StreamFactory.eINSTANCE.createDatabusDataRouterNode();
			drNode.setName(locJson.getString("hostName"));
			drNode.setVersion(getString(locJson, "version"));
			drNode.setHostFqdn(getString(locJson, "fqdn"));
			drNode.setDcaeLocationName(getString(locJson, "dcaeLocationName"));
			databusUpdateEntity(drNode, locJson);
			l.add(drNode);
		}
		d.getDrNodes().clear();
		d.getDrNodes().addAll(l);
	}

	private static void databusJson2mrClusters(JSONObject json, DcaeDataBus d) {
		JSONArray a = json.getJSONArray("$list");
		List<DatabusMessageRouterCluster> l = new ArrayList<DatabusMessageRouterCluster>();
		for (int i = 0; i < a.length(); i++) {
			JSONObject locJson = a.getJSONObject(i);
			DatabusMessageRouterCluster c = StreamFactory.eINSTANCE.createDatabusMessageRouterCluster();
			c.setName(locJson.getString("dcaeLocationName"));
			c.setServiceFqdn(getString(locJson, "fqdn"));
			c.setDcaeLocationName(locJson.getString("dcaeLocationName"));
			JSONArray aa = locJson.getJSONArray("hosts");
			for (int j = 0; j < aa.length(); j++) {
				c.getHostFqdn().add(aa.getString(j));
			}
			c.setTopicPort(getString(locJson, "topicPort"));
			c.setTopicProtocol(getString(locJson, "topicProtocol"));
			databusUpdateEntity(c, locJson);
			l.add(c);
		}
		d.getMrClusters().clear();
		d.getMrClusters().addAll(l);
	}

	private static String getString(JSONObject json, String key) {
		return json.has(key) ? json.getString(key) : null;
	}

	private static void databusJson2locations(JSONObject json, DcaeDataBus d) {
		JSONArray a = json.getJSONArray("$list");
		List<DatabusLocation> l = new ArrayList<DatabusLocation>();
		for (int i = 0; i < a.length(); i++) {
			JSONObject locJson = a.getJSONObject(i);
			DatabusLocation loc = StreamFactory.eINSTANCE.createDatabusLocation();
			loc.setName(locJson.getString("dcaeLocationName"));
			loc.setDcaeLayer(getString(locJson, "dcaeLayer"));
			databusUpdateEntity(loc, locJson);
			l.add(loc);
		}
		d.getLocations().clear();
		d.getLocations().addAll(l);
	}

	private static void databusUpdateEntity(DatabusEntity e, JSONObject json) {
		e.setStatus(getString(json, "status"));
		e.setLastModified(json.has("lastMod") ? DateUtils.dateFromString(json.getString("lastMod")) : null);
		e.setType(getString(json, "type"));
	}

	private void updateObjectUsingPolicy(DcaePolicyEntity o2, DcaeService s, DcaeServiceInstance i) {
		if (location(i) == null)
			return;
		System.out.println("PPPPPPPPPPP START: ");
		JavaHttpClient client = new JavaHttpClient("controller.properties", "policy");
		if (client.getBaseAddress() == null) {
			logger.warn("No Policy Endpoint configured");
			return;
		}
		EAnnotation anno = o2.eClass().getEAnnotation("http://openecomp.org/policy");
		String matchingType = "policy-name";
		if (anno != null && anno.getDetails().get("matchingType") != null)
			matchingType = anno.getDetails().get("matchingType");
		HashMap<String, String> headers = new HashMap<String, String>();
		JSONObject json = new JSONObject();
		headers.put("ClientAuth", client.props.getProperty("policy.clientAuth"));
		headers.put("Environment", client.props.getProperty("policy.environment"));
		JSONObject json2 = new JSONObject();
		// json.put("configAttributes", json2);
		String uuid = ManagementServer.object2ref(o2).toLowerCase();
		String pName = o2.getPolicyName();
		String matchPolicyName = pName;
		System.out.println("PPPPPPPPPPP 0: match type=" + matchingType);
		JSONArray a = null;
		switch (matchingType) {
		case "policy-name":
			json.put("policyName", matchPolicyName);
			JSONObject res = client.httpJsonTransaction("/getConfig", "POST", headers, json);
			a = res.getJSONArray("$list");
			break;
		case "uuid-path":
			// ONAP R1
			for (Object k : client.props.keySet()) {
				String key = (String) k;
				if (key.startsWith("policy.substitution.")) {
					uuid = uuid.replace(key.substring(20), client.props.getProperty(key));
				}
			}
			json2.put("uuid", uuid);
			json.put("policyName", ".*");
			JSONObject res1 = client.httpJsonTransaction("/PyPDPServer/getConfig", "POST", headers, json);
			System.out.println("PPPPPPPPPPP 0: uuid=" + uuid);
			JSONArray a1 = res1.getJSONArray("$list");
			a = new JSONArray();
			for (int j = 0; j < a1.length(); j++) {
				JSONObject c1 = a1.getJSONObject(j);
				JSONObject newConfig;
				try {
					newConfig = new JSONObject(c1.getString("config"));
				} catch (Exception e) {
					System.out.println("PPPPPPPPPPP 1.1: " + c1.toString(2));
					continue;
				}
				if (!uuid.equalsIgnoreCase(newConfig.getString("uuid")))
					continue;
				a.put(c1);
			}
			default: 
				throw new RuntimeException("Unknown Policy match type: " + matchingType);
		}
		switch (a.length()) {
		case 0:
			System.out.println("PPPPPPPPPPP 0 no policies: " + matchPolicyName + " " + uuid);
			return;
		case 1:
			break;
		default:
			System.out.println("PPPPPPPPPPP 0 too many policies: " + matchPolicyName + " " + uuid + " " + a.length());
			return;
		}
		JSONObject c1 = a.getJSONObject(0);
		JSONObject newConfig;
		try {
			newConfig = new JSONObject(c1.getString("config"));
		} catch (Exception e) {
			System.out.println("PPPPPPPPPPP 1: " + c1.toString(2));
			return;
		}
		System.out.println("PPPPPPPPPPP 2: " + newConfig.toString(2) + " uuid:" + newConfig.get("uuid"));
		// if (!uuid.equals(newConfig.getString("uuid").toLowerCase()))
		// continue;
		JSONObject content = new JSONObject(newConfig.getString("content"));
		System.out.println("PPPPPPPPPPP 3: " + content.toString(2));
		content.put("policyDescription", newConfig.getString("description"));
		content.put("policyConfigName", newConfig.getString("configName"));
		content.put("policyTemplateVersion", newConfig.getString("templateVersion"));
		content.put("policyVersion", newConfig.getString("version"));
		content.put("policyPriority", newConfig.getString("priority"));
		content.put("policyScope", newConfig.getString("policyScope"));
		System.out.println("PPPPPPPPPPP 4: " + content.toString(2));
		ManagementServer server = controller.getServer();
		EObject oo = server.json2ecore(o2.eClass(), content);
		// System.out.println("PPPPPPPPPPP 4_1: " +
		// ManagementServer.ecore2json(oo, 1000, null, true).toString(2));
		JSONObject before = cleanJson(o2);
		ManagementServer.merge(o2, oo, content, true, null);
		o2.setPolicyName(pName);
		JSONObject after = cleanJson(o2);
		ManagementServer.ecore2json(o2, 1000, null, true);
		if (!before.toString(2).equals(after.toString(2))) {
			System.out.println("PPPPPPPPPPP configuration change 5: " + ManagementServer.object2ref(i) + " using: "
					+ c1.getString("policyName"));
			System.out.println("PPPPPPPPPPP before: " + before.toString(2));
			System.out.println("PPPPPPPPPPP after: " + after.toString(2));
			s.pushManagerConfiguration(i.getName());
		}
	}

	public static JSONObject cleanJson(EObject o2) {
		JSONObject json = ManagementServer.ecore2json(o2, 1000, null, true);
		removeLastChanged(json);
		return json;
	}

	private static void removeLastChanged(Object o) {
		if (o instanceof JSONObject) {
			JSONObject json = (JSONObject) o;
			json.remove("lastChanged");
			for (Iterator<String> i = json.keys(); i.hasNext();) {
				String key = i.next();
				removeLastChanged(json.get(key));
			}
		}
		if (o instanceof JSONArray) {
			JSONArray a = (JSONArray) o;
			for (int i = 0; i < a.length(); i++) {
				removeLastChanged(a.get(i));
			}
		}
	}

	private String location(DcaeServiceInstance i) {
		if (i instanceof VirtualMachineServiceInstance) {
			VirtualMachineServiceInstance i1 = (VirtualMachineServiceInstance) i;
			if (i1.getLocation() == null)
				return null;
			return i1.getLocation().getName();
		}
		if (i instanceof CdapServiceInstance) {
			CdapServiceInstance i1 = (CdapServiceInstance) i;
			if (i1.getClusterService() == null)
				return null;
			return location(i1.getClusterService());
		}
		if (i instanceof DockerServiceInstance) {
			DockerServiceInstance i1 = (DockerServiceInstance) i;
			if (i1.getHostService() == null)
				return null;
			return location(i1.getHostService());
		}
		throw new RuntimeException("unknown service instance: " + i);
	}

	public static EList<? extends DcaeServiceInstance> instances(DcaeService s) {
		if (s instanceof VirtualMachineService) {
			VirtualMachineService s1 = (VirtualMachineService) s;
			return s1.getInstances();
		}
		if (s instanceof CdapService) {
			CdapService s1 = (CdapService) s;
			return s1.getInstances();
		}
		if (s instanceof DockerService) {
			DockerService s1 = (DockerService) s;
			return s1.getInstances();
		}
		throw new RuntimeException("unknown service: " + s);
	}

	private EList<DcaePolicyEntity> findPolicyEnabledObjects(EObject o2) {
		EList<DcaePolicyEntity> res = new BasicEList<DcaePolicyEntity>();
		findPolicyEnabledObjects(o2, res);
		return res;
	}

	private void findPolicyEnabledObjects(EObject o2, EList<DcaePolicyEntity> res) {
		if (o2 == null)
			return;
		if (o2 instanceof DcaePolicyEntity) {
			res.add((DcaePolicyEntity) o2);
		}
		for (EReference ref : o2.eClass().getEAllContainments()) {
			if (ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) o2.eGet(ref);
				for (EObject o3 : l) {
					findPolicyEnabledObjects(o3, res);
				}
			} else
				findPolicyEnabledObjects((EObject) o2.eGet(ref), res);
		}
	}

	public void deployDescriptor(String name) {
		runCmd("bin/dcae-controller.sh deploy-descriptor --name " + name);
	}

	private void runCmd(String cmd) {
		Runtime run = Runtime.getRuntime();
		Process pr;
		try {
			logger.info("running: " + cmd);
			pr = run.exec(cmd);
			int status = pr.waitFor();
			logger.info("done: " + cmd);
			BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String line = "";
			while ((line = buf.readLine()) != null) {
				logger.info("output: " + line);
			}
			buf = new BufferedReader(new InputStreamReader(pr.getErrorStream()));
			while ((line = buf.readLine()) != null) {
				System.err.println(line);
				logger.warn("error: " + line);
			}
			if (status != 0) {
				throw new RuntimeException("command failed: " + cmd);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Object handleJson(String userName, String action, String resourcePath, JSONObject json, JSONObject context,
			String clientVersion) {
		// System.err.println("XXXXXX handleJson: " + action + " " +
		// resourcePath + " " + context);
		switch ((String) context.get("path")) {
		case "/test/":
		case "/test":
			if (o.getCluster().getRole() == ServerRole.MASTER) {
				return new JSONObject("{ status: 'OKAY'}");
			}
			throw new RuntimeException("Not Master Controller");
		case "/swagger":
			return controller.getServer().getSwaggerJson();
		}
		System.err.println("XXXXXXX: request not handled: path=" + resourcePath + " action=" + action + " json="
				+ ((json != null) ? json.toString(2) : "NULL") + " context="
				+ ((context != null) ? context.toString(2) : "NULL"));
		return null;

	}

	public Object handleBinary(String userName, String action, String resourcePath, InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

	public void refreshDataBus(String nameMatch) {
		System.err.println(
				"BBBBBBBBB: numberOfErrors=" + numberOfErrors + " tooMany=" + tooMany + " nameMatch=" + nameMatch);
		numberOfErrors = 0;
		for (DatabusStream s : o.getDatabus().getStreams()) {
			if (nameMatch != null && !s.getName().matches(nameMatch))
				continue;
			if (s instanceof DatabusStreamFeed) {
				DatabusStreamFeed f = (DatabusStreamFeed) s;
				if (f.getFeedName() == null)
					continue;
				System.err.println(
						"BBBBBBBBB: feed change to null " + ManagementServer.object2ref(s) + " " + f.getFeedName());
				f.setFeedName(null);
				for (DatabusStreamFeedPublisher c : f.getPublishers()) {
					c.setFeedId(null);
					c.setPubId(null);
					c.setStatus(null);
				}
				for (DatabusStreamFeedSubscriber c : f.getSubscribers()) {
					c.setFeedId(null);
					c.setSubId(null);
					c.setOwner(null);
					c.setLogURL(null);
				}
			}
			if (s instanceof DatabusStreamTopic) {
				DatabusStreamTopic t = (DatabusStreamTopic) s;
				if (t.getTopicName() == null)
					continue;
				System.err.println(
						"BBBBBBBBB: topic change to null " + ManagementServer.object2ref(s) + " " + t.getTopicName());
				t.setTopicName(null);
				for (DatabusStreamTopicClient c : t.getClients()) {
					c.setTopicURL(null);
					c.setMrClientId(null);
					c.setFqtn(null);
				}
			}
		}
	}

	@SuppressWarnings("unused")
	private String privateKey = CryptoUtils.getKey("config/server.private");
	private String publicKey = null;

	public void updateSwagger(String path, SwaggerUtils swagger) {
		swagger.addTag(path, "DCAE Controller API");
		swagger.addTag(path + "/configuration", "Server Basic Configuration");
		swagger.addTag(path + "/cluster", "Cluster Configuration");
		if (o.getOpenstack() instanceof ISwaggerHandler) {
			ISwaggerHandler handler = (ISwaggerHandler) o.getOpenstack();
			handler.updateSwagger(path + "/openstack", swagger);
		}
		swagger.addTag(path + "/locations", "DCAE Locations Configuration");
		swagger.addTag(path + "/databus", "DataBus Configuration");
		swagger.addTag(path + "/services", "DCAE Services");
		for (DcaeService s : o.getServices()) {
			String path1 = path + "/services/" + s.getName();
			swagger.addTag(path1, "");
			if (instances(s).size() > 0) {
				// Use instance as a API guide to handle inheritance.
				// swagger.autoAddApi(path1 + "/instances/{instanceName}",
				// instances(s).get(0));
			}
			// swagger.autoAddApi(path1, s);
		}
		DcaeService s = o.getServices().get(o.getServices().size() - 1);
		swagger.autoAddApi(path + "/services/" + s.getName() + "/instances/{instanceName}", instances(s).get(0));
		// Add missing automatically

		swagger.autoAdd(path, o.eClass(), 1, new ArrayList<String>());
	}
}
