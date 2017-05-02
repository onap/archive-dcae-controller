
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONArray;
import org.json.JSONObject;
import org.mvel2.optimizers.impl.refl.nodes.ArrayLength;
import org.openecomp.ncomp.sirius.manager.BasicAdaptorProvider;

import org.openecomp.dcae.controller.inventory.ApiResponseMessage;
import org.openecomp.dcae.controller.inventory.DCAEService;
import org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults;
import org.openecomp.dcae.controller.inventory.DCAEServiceRequest;
import org.openecomp.dcae.controller.inventory.DCAEServiceType;
import org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest;
import org.openecomp.dcae.controller.inventory.DcaeInventory;
import org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults;
import org.openecomp.dcae.controller.inventory.InventoryPackage;
import org.openecomp.dcae.controller.inventory.Link;
import org.openecomp.dcae.controller.inventory.DcaeServiceResults;

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
		System.err.println(json.toString(2));
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
		System.err.println(json.toString(2));
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
				if (o1.equals(null)) {
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
		System.out.println(ManagementServer.ecore2json(o, 1000, null, true).toString(2));
	}

	private int offset(EList<Link> links) {
		for (Link l : links) {
			if ("nextLink".equals(l.getName())) {
				return Integer.parseInt(l.getHref().split("=")[1]);
			}
		}
		return -1;
	}
}
