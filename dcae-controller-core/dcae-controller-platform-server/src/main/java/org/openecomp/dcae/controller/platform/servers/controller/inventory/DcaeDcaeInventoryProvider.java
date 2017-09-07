
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

package org.openecomp.dcae.controller.platform.servers.controller.inventory;

import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.JavaHttpClient;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.console.Utils;
import org.yaml.snakeyaml.Yaml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.mvel2.optimizers.impl.refl.nodes.ArrayLength;
import org.openecomp.ncomp.core.DeploymentStatus;
import org.openecomp.ncomp.sirius.manager.BasicAdaptorProvider;
import org.openecomp.dcae.controller.core.service.DcaeService;
import org.openecomp.dcae.controller.core.service.DcaeServiceInstance;
import org.openecomp.dcae.controller.inventory.ApiResponseMessage;
import org.openecomp.dcae.controller.inventory.DCAEService;
import org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults;
import org.openecomp.dcae.controller.inventory.DCAEServiceRequest;
import org.openecomp.dcae.controller.inventory.DCAEServiceType;
import org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest;
import org.openecomp.dcae.controller.inventory.DcaeInventory;
import org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults;
import org.openecomp.dcae.controller.inventory.InventoryConfigurationRule;
import org.openecomp.dcae.controller.inventory.InventoryPackage;
import org.openecomp.dcae.controller.inventory.Link;
import org.openecomp.dcae.controller.platform.controller.DcaePlatformController;
import org.openecomp.dcae.controller.service.cdap.CdapService;
import org.openecomp.dcae.controller.service.cdap.CdapServiceInstance;
import org.openecomp.dcae.controller.service.docker.DockerService;
import org.openecomp.dcae.controller.service.vm.VirtualMachineService;
import org.openecomp.dcae.controller.inventory.DcaeServiceResults;

import static org.openecomp.dcae.controller.platform.servers.controller.DcaeDcaePlatformControllerProvider.*;

public class DcaeDcaeInventoryProvider extends BasicAdaptorProvider {
	private static final Logger logger = Logger.getLogger(DcaeDcaeInventoryProvider.class);
	DcaeInventory o;
	DcaeInventoryFactory f;

	public DcaeDcaeInventoryProvider(ISiriusServer controller, DcaeInventory o) {
		super(controller, o);
		f = new DcaeInventoryFactory(controller);
		this.o = o;
	}

	public DcaeServiceTypeResults getDcaeServiceTypes(String typeName, Boolean onlyLatest, Boolean onlyActive,
			String vnfType, String serviceId, String serviceLocation, String asdcServiceId, String asdcResourceId,
			Integer offset) {
		DcaeServiceTypeResults res = f.createDcaeServiceTypeResults();
		JavaHttpClient client = new JavaHttpClient("controller.properties", "inventory");
		HashMap<String, String> headers = new HashMap<String, String>();
		HashMap<String, String> query = new HashMap<String, String>();
		// TODO handle parameters, but for now only use is complete dump
		addQuery(query,"offset", offset);
		JSONObject json = client.httpJsonTransaction("/dcae-service-types" + queryUrl(query), "GET", headers, null);
//		System.out.println(json.toString(2));
		JSONArray items = json.getJSONArray("items");
		for (int i = 0; i < items.length(); i++) {
			JSONObject item = items.getJSONObject(i);
			item.put("name", item.getString("typeId"));
			fixCreated(item);
		}
		nullClean(json);
		EClass c = InventoryPackage.eINSTANCE.getDcaeServiceTypeResults();
		res = (DcaeServiceTypeResults) controller.getServer().json2ecore(c, json);
		System.out.println(ManagementServer.ecore2json(res, 1000, null, true).toString(2));
		return res;
	}

	public ApiResponseMessage deleteDcaeServiceTypesType(String typeId) {
		ApiResponseMessage res = null;
		// TODO IMPLEMENT
		throw new UnsupportedOperationException();
	}

	public DCAEServiceType getDcaeServiceTypesType(String typeId) {
		DCAEServiceType res = null;
		// TODO IMPLEMENT
		throw new UnsupportedOperationException();
	}

	public DCAEServiceType createDcaeServiceTypesTypeName(DCAEServiceTypeRequest body) {
		DCAEServiceType res = null;
		// TODO IMPLEMENT
		throw new UnsupportedOperationException();
	}

	public DcaeServiceResults getDcaeServices(String typeId, String vnfId, String vnfType, String vnfLocation,
			String componentType, Boolean shareable, String created, Integer offset) {
		DcaeServiceResults res = f.createDcaeServiceResults();
		JavaHttpClient client = new JavaHttpClient("controller.properties", "inventory");
		HashMap<String, String> headers = new HashMap<String, String>();
		HashMap<String, String> query = new HashMap<String, String>();
		// TODO handle parameters, but for now only use is complete dump
		addQuery(query,"offset", offset);
		JSONObject json = client.httpJsonTransaction("/dcae-services" + queryUrl(query), "GET", headers, null);
//		System.out.println(json.toString(2));
		JSONArray items = json.getJSONArray("items");
		for (int i = 0; i < items.length(); i++) {
			JSONObject item = items.getJSONObject(i);
			item.put("name", item.getString("serviceId"));
			fixCreated(item);
			JSONArray components = item.getJSONArray("components");
			for (int j = 0; j < components.length(); j++) {
				JSONObject component = components.getJSONObject(j);
				fixCreated(component);
				component.put("name", component.getString("componentId"));
			}
		}
		nullClean(json);
		EClass c = InventoryPackage.eINSTANCE.getDcaeServiceResults();
		res = (DcaeServiceResults) controller.getServer().json2ecore(c, json);
		System.out.println(ManagementServer.ecore2json(res, 1000, null, true).toString(2));
		return res;
	}

	private String queryUrl(HashMap<String, String> query) {
		if (query.size() == 0) return "";
		StringBuffer b = new StringBuffer();
		boolean first = true;
		for (String k : query.keySet()) {
			b.append(first ? "?" : "&");
			first = false;
			b.append(k).append("=").append(query.get(k));
		}
		return b.toString();
	}

	private void addQuery(HashMap<String, String> query, String k, Object v) {
		if (v != null) query.put(k, v.toString());
	}

	private void nullClean(Object json) {
		if (json instanceof JSONObject) {
			JSONObject o = (JSONObject) json;
			List<String> delete = new ArrayList<String>();
			for (Iterator<String> iterator = o.keys(); iterator.hasNext();) {
				String key = (String) iterator.next();
				Object o1 = o.get(key);
				if (o1 == null) {
					delete.add(key);
					continue;
				}
				nullClean(o1);
			}
			for (String key : delete) {
				o.remove(key);
			}
		}
		if (json instanceof JSONArray) {
			JSONArray a = (JSONArray) json;
			for (int i = 0; i < a.length(); i++) {
				Object o1 = a.get(i);
				nullClean(o1);
			}
		}
	}

	private void fixCreated(JSONObject j) {
		if (j.has("created")) {
			j.put("created1",j.get("created"));
			j.remove("created");
		}
	}

	public DCAEServiceGroupByResults getDcaeServicesGroupbyPropertyName(String propertyName) {
		DCAEServiceGroupByResults res = null;
		// TODO IMPLEMENT
		throw new UnsupportedOperationException();
	}

	public void deleteDcaeServicesService(String serviceId) {

		// TODO IMPLEMENT
		throw new UnsupportedOperationException();
	}

	public DCAEService getDcaeServicesService(String serviceId) {
		DCAEService res = null;
		// TODO IMPLEMENT
		throw new UnsupportedOperationException();
	}

	public DCAEService createDcaeServicesService(String serviceId, DCAEServiceRequest body) {
		DCAEService res = null;
		// TODO IMPLEMENT
		throw new UnsupportedOperationException();
	}

	public void poll() {
		o.getServices().clear();
		int offset = 0;
		while (offset != -1) {
			DcaeServiceResults s = o.getDcaeServices(null, null, null, null, null, null, null, offset);
			o.getServices().addAll(s.getItems());
			offset = offset(s.getLinks());
		}
		o.getServiceTypes().clear();
		offset = 0;
		while (offset != -1) {
			DcaeServiceTypeResults s = o.getDcaeServiceTypes(null, null, null, null, null, null, null, null, null);
			o.getServiceTypes().addAll(s.getItems());
			offset = offset(s.getLinks());
		}
//		System.out.println(ManagementServer.ecore2json(o, 1000, null, true).toString(2));
	}

	private int offset(EList<Link> links) {
		for (Link l : links) {
			if ("nextLink".equals(l.getName())) {
				return Integer.parseInt(l.getHref().split("=")[1]);
			}
		}
		return -1;
	}
	
	
	public void updateConfiguration() {
		System.out.println("BBBBBBB: updateConfiguration");
		DcaePlatformController root = (DcaePlatformController) controller.getServer().getObject();
		for (DcaeService s : root.getServices()) {
			for (DcaeServiceInstance i : instances(s)) {
				if (! ( i instanceof CdapServiceInstance)) continue;
				CdapServiceInstance i1 = (CdapServiceInstance) i;
				for (InventoryConfigurationRule r : o.getRules()) {
					try {
						if (r.getServiceNameMatch() != null && ! r.getServiceNameMatch().equals(s.getName())) continue;
						if (r.getInstanceNameMatch() != null && ! r.getInstanceNameMatch().equals(i.getName())) continue;
						JSONObject json = findBluePrint(r);
						System.out.println("BBBBBBB: updateConfiguration " + s.getName() + " " + i.getName() + " " + r + " " + (json ==null ? "NULL" : json.toString(2)));
						if (json == null) {
							System.out.println("BBBBBBB: NULL");
							continue;
						}
						EObject oo = controller.getServer().json2ecore(i1.getConfiguration().eClass(), json);
						JSONObject before = cleanJson(i1.getConfiguration());
						ManagementServer.merge(i1.getConfiguration(), oo, json, true, null);
						JSONObject after = cleanJson(i1.getConfiguration());
						System.out.println("BBBBBBB before: " + before.toString(2));
						System.out.println("BBBBBBB after: " + after.toString(2));
						System.out.println("BBBBBBB equal: " + !before.toString(2).equals(after.toString(2)));
						if (!before.toString(2).equals(after.toString(2))) {
							System.out.println("BBBBBBB before: " + before.toString(2));
							System.out.println("BBBBBBB after: " + after.toString(2));
							if (i.getStatus() == DeploymentStatus.DEPLOYED)
								s.pushManagerConfiguration(i.getName());
						}
					}
					catch (Exception e) {
						e.printStackTrace(System.out);
						System.out.println("BBBBBBB: error "+ s.getName() + " " + i.getName() + " " + e);
					}
				}
			}
		}
	}

	private JSONObject findBluePrint(InventoryConfigurationRule r) {
		DCAEServiceType t = null;
		int version = -1;
		for (DCAEServiceType t1 : o.getServiceTypes()) {
			System.out.println("BBBBBBB: type match: " + t1.getTypeName() + " " + r.getTypeNameMatch());
			if (t1.getTypeName() == null) continue;
			if ( ! t1.getTypeName().equals(r.getTypeNameMatch())) continue;
			System.out.println("BBBBBBB: type version: " + t1.getTypeVersion() + " " + version);
			if (t1.getTypeVersion() != null && version  > t1.getTypeVersion()) continue;
			System.out.println("BBBBBBB: type match found: " + t1.getTypeName());
			t = t1;
		}
		if (t == null) {
			System.out.println("BBBBBBB: no type for: " + r.getServiceNameMatch());
			return null;
		}
		JSONObject bp;
		try {
			System.out.println("BBBBBBB: bp 1=" );
			Yaml y = new Yaml();
			System.out.println("BBBBBBB: bp 2=");
			bp = (JSONObject) Utils.object2json(y.load(t.getBlueprintTemplate()));
			System.out.println("BBBBBBB: bp 3=");
			System.out.println("BBBBBBB: bp=" + bp.toString(2));
			JSONObject topology_template = getJSONObject(bp,"topology_template");
			JSONObject node_templates = getJSONObject(topology_template,"node_templates");
			JSONObject node = null;
			for (Iterator<String> i = node_templates.keys(); i.hasNext();) {
				String type = (String) i.next();
				System.out.println("BBBBBBB: node: " + type);
				if (type.matches(r.getBpNodeNameMatch())) node = getJSONObject(node_templates,type); 
			}
			if (node == null) {
				System.out.println("BBBBBBB: no node for: " + r.getBpNodeNameMatch());
				return null;
			}
			JSONObject p = getJSONObject(node,"properties");
			JSONObject app_preferences = getJSONObject(p ,"app_preferences");
			System.out.println("BBBBBBB: app_preferences=" + app_preferences.toString(2));
			JSONObject json = new JSONObject();
			for (Iterator<String> i = app_preferences.keys(); i.hasNext();) {
				String path = (String) i.next();
				String a[] = path.split("\\.");
				try {
					updateJson(json,a,0, app_preferences.get(path));
				}
				catch (Exception e) {};
			}
			System.out.println("BBBBBBB: fixed value: " + json.toString(2));
			return json;
		}
		catch (Exception e) {
			e.printStackTrace(System.out);
			System.out.println("BBBBBBB: bp error=" + e);
			return null;
		}
	}

	private void updateJson(JSONObject json, String[] a, int i, Object v) {
		if (i == a.length - 1) {
			json.put(a[i], v);
		}
		else {
			if (! json.has(a[i])) 
				json.put(a[i], new JSONObject());
			updateJson(json.getJSONObject(a[i]), a, i+1, v);
		}
	}

	private JSONObject getJSONObject(JSONObject json, String key) {
		if (json.has(key)) return json.getJSONObject(key);
		System.out.println("BBBBBBB: json does not have key =" + json.toString(2) + " " + key);
		throw new RuntimeException("Unable to find: " + key);
	}

	
}
