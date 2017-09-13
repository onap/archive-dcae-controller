
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

package org.openecomp.dcae.controller.operation.utils;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openecomp.ncomp.utils.maps.CounterMap;
import org.openecomp.ncomp.webservice.utils.JsonUtils;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.openecomp.ncomp.sirius.manager.console.Utils.*;

public class DocUtils {
    protected String env;
    protected static String root = "/home/vagrant/git/org.openecomp.dcae.controller.operation";
    protected String release;

//	public DocUtils(String release, String env) {
//		super();
//		this.release = release;
//		this.env = env;
//	}

    public DocUtils(String release, String env, String root1, String root2) {
        super();
        this.release = release;
        this.env = env;
        if (root1 != null) {
            root = root1;
        }
    }


    @SuppressWarnings("rawtypes")
    public Map tenants() {
        String fileName = release + "-" + env + "/tenants.yaml";
        Map o = (Map) file2object(fileName);
        return o;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public Map vms() {
        LinkedHashMap<String, LinkedHashMap<String, Object>> s = new LinkedHashMap<String, LinkedHashMap<String, Object>>();
        LinkedHashMap<String, LinkedHashMap<String, Object>> ss = new LinkedHashMap<String, LinkedHashMap<String, Object>>();
        CounterMap<String> index = new CounterMap<String>();
        Map<String, Object> locationTypes = locationTypes();
        Map<String, Object> vmTypes = (Map<String, Object>) types("vm");
        Map<String, Object> tenants = tenants();
        for (String t : locationTypes.keySet()) {
            for (String tenantKey : tenants.keySet()) {
                Map<String, Object> tenant = (Map<String, Object>) tenants.get(tenantKey);
                if (!t.equals(tenant.get("type"))) {
                    continue;
                }
                Map<String, Object> locationType = (Map<String, Object>) locationTypes.get(t);
                Map<String, Object> vmDeployments = (Map<String, Object>) locationType.get("vm-deployments");
                for (String vmDeploymentKey : vmDeployments.keySet()) {
                    Map<String, Object> vmDeployment = (Map<String, Object>) vmDeployments.get(vmDeploymentKey);
                    Map<String, Object> vmType = (Map<String, Object>) vmTypes.get(vmDeployment.get("vm-type"));
                    if (s.get(vmDeploymentKey) == null) {
                        LinkedHashMap<String, Object> s1 = new LinkedHashMap<String, Object>();
                        s.put(vmDeploymentKey, s1);
                        s1.put("vm-type", vmDeployment.get("vm-type"));
                        s1.put("release", vmDeployment.get("release"));
                        s1.put("milestone", vmDeployment.get("milestone"));
                        boolean useController = (Boolean) get(vmType, "lifecycle-management", "use-dcae-manager", new Boolean(false));
                        s1.put("use-controller", useController);
                        LinkedHashMap<String, Object> s2 = new LinkedHashMap<String, Object>();
                        s1.put("locations", s2);
                        ss.put(vmDeploymentKey, s2);
                    }
//					System.err.println (" XXx:" + t + " " + vmDeploymentKey + " " + vmTypes.keySet()+ " " + vmDeployment.get("vm-type"));
//					if (vmType.containsKey("error")) continue;
                    if (vmType == null) {
                        continue;
                    }
                    Integer numVms = (Integer) vmType.get("number-vms-per-location");
                    if (numVms == null) {
                        numVms = 2;
                    }
//					System.err.println (" XXx:" + t + " " + vmDeploymentKey + " " + vmType.keySet()+ " " + tenant.keySet());
                    LinkedHashMap<String, Object> s1 = new LinkedHashMap<String, Object>();

                    s1.put("dcae-service", vmDeploymentKey);
                    s1.put("dcae-service-instance", tenantKey);
                    s1.put("dcae-container", "/locations/" + tenantKey);
                    LinkedHashMap<String, Object> s2 = new LinkedHashMap<String, Object>();
                    s1.put("vms", s2);
                    String shortName = short_name(vmDeployment.get("vm-type"));
                    String indexKey = tenant.get("name-short") + ":" + shortName;
                    numVms = (Integer) vmType.get("number-vms-per-location");
                    if (numVms == null) {
                        numVms = 2;
                    }
                    for (int i = 0; i < numVms; i++) {
                        String name = vmname(tenant, vmType, index.get(indexKey));
//						System.err.println ("new VM: " + name + " " + index.get(indexKey));
                        index.increment(indexKey);
                        LinkedHashMap<String, Object> s3 = new LinkedHashMap<String, Object>();
                        s3.put("dns-name", name + "." + tenant.get("dns-surfix"));
                        s2.put(name, s3);
                    }
                    ss.get(vmDeploymentKey).put(vmDeploymentKey + "-" + tenantKey, s1);
                }
            }
        }
        return s;
    }

    private String short_name(Object object) {
        String fileName = release + "/vm-templates/" + object + ".yaml";
        Map o = (Map) file2object(fileName);
        return (String) o.get("short-name");
    }

    Map<String, Object> locationTypes() {
        String fileName = release + "/location-types.yaml";
        @SuppressWarnings("unchecked")
        Map<String, Object> locationTypes = (Map) file2object(fileName);
        return locationTypes;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public Map dockers() {
        LinkedHashMap<String, Object> s = new LinkedHashMap<String, Object>();
        Map<String, Object> locationTypes = locationTypes();
        Map<String, Object> dockerTypes = (Map<String, Object>) types("docker");
        Map<String, Object> tenants = tenants();
        for (String t : locationTypes.keySet()) {
            for (String tenantKey : tenants.keySet()) {
                Map<String, Object> tenant = (Map<String, Object>) tenants.get(tenantKey);
                if (!t.equals(tenant.get("type"))) {
                    continue;
                }
                Map<String, Object> locationType = (Map<String, Object>) locationTypes.get(t);
                Map<String, Object> dockerDeployments = (Map<String, Object>) locationType.get("docker-deployments");
                if (dockerDeployments == null) {
                    continue;
                }
                for (String dockerDeploymentKey : dockerDeployments.keySet()) {
                    Map<String, Object> dockerDeployment = (Map<String, Object>) dockerDeployments.get(dockerDeploymentKey);
//					if (dockerType.containsKey("error")) continue;
//					System.err.println (" XXx:" + t + " " + vmDeploymentKey + " " + vmType.keySet()+ " " + container.keySet());
                    LinkedHashMap<String, Object> s1 = new LinkedHashMap<String, Object>();
                    s1.put("docker-type", dockerDeployment.get("docker-type"));
                    s1.put("release", dockerDeployment.get("release"));
                    s1.put("milestone", dockerDeployment.get("milestone"));
                    s1.put("use-controller", true);
                    s1.put("dcae-service", dockerDeploymentKey);
                    s1.put("dcae-service-instance", tenantKey);
                    String container = (String) dockerDeployment.get("container");
//					container = container.replace("${location-name}", tenantKey);
                    s1.put("dcae-container", container);
                    s1.put("location-type", t);
                    s.put(dockerDeploymentKey, s1);
                }
            }
        }
        return s;
    }

    private Map<String, Object> containers() {
        // TODO Auto-generated method stub
        return null;
    }

    private Object get(Map<String, Object> m, String k1, String k2, Object def) {
        Object o = m.get(k1);
        if (o instanceof Map<?, ?>) {
            @SuppressWarnings("unchecked")
            Map<String, Object> m1 = (Map<String, Object>) o;
            return get(m1, k2, def);
        }
        return def;
    }

    private Object get(Map<String, Object> m, String k1, Object def) {
        Object o = m.get(k1);
        return o == null ? def : o;
    }

    static LinkedHashMap<String, String> env2char = new LinkedHashMap<String, String>();

    static {
        env2char.put("DEV", "zldc");
        env2char.put("FTL", "zldc");
        env2char.put("FTL2", "zldc");
        env2char.put("IST", "zltc");
        env2char.put("ISTFTL", "zltc");
        env2char.put("ETE", "zlsc");
        env2char.put("PROD", "zlpc");
    }


    private String vmname(Map<String, Object> tenant, Map<String, Object> vmType, int i) {
        String env1 = (String) tenant.get("environment-type");
        if (env1 == null) {
            env1 = env;
        }
        String s = env2char.get(env1);
        if (s == null) {
            s = env2char.get("DEV");
        }
        return s + tenant.get("name-short") + vmType.get("short-name") + String.format("%02d", i);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public Map types(String dType) {
        LinkedHashMap<String, Object> s = new LinkedHashMap<String, Object>();
        Map<String, Object> locationTypes = locationTypes();
        for (String locationType : locationTypes.keySet()) {
            Map<String, Object> o1 = (Map<String, Object>) locationTypes.get(locationType);
            Map<String, Object> o2 = (Map<String, Object>) o1.get(dType + "-deployments");
            if (o2 == null) {
                continue;
            }
            for (String type : o2.keySet()) {
                Map<String, Object> o3 = (Map<String, Object>) o2.get(type);
                if (o3.containsKey(dType + "-type")) {
                    type = (String) o3.get(dType + "-type");
                }
                if (s.containsKey(type)) {
                    continue;
                }
                String path = release + "/" + dType + "-templates/" + type + ".yaml";
                s.put(type, file2object(path));
            }
        }
        return s;
    }

    protected static Object file2object(String path) {
        return file2object(path, true);
    }

    protected static Object file2object(String path, boolean required) {
//		System.err.println (root + "/" + path);
        try {
            if (path.endsWith(".json")) {
//				System.err.println (root + "/" + path);
                return json2object(JsonUtils.file2json(root + "/" + path));
            } else {
                Yaml yaml = new Yaml();
                String s = new String(Files.readAllBytes(Paths.get(root + "/" + path)), StandardCharsets.UTF_8);
                Object o = yaml.load(s);
                if (o != null) {
                    return o;
                }
            }
        } catch (org.yaml.snakeyaml.parser.ParserException e) {
            System.err.println("YAML exception: " + path + " " + e);
            System.exit(2);
        } catch (Exception e) {
            System.err.println("exception: " + path + " " + e.getClass());
            if (required) {
                System.err.println("exception: " + path + " " + e);
            } else {
//				System.err.println("exception: " + path + " " + e);
                return null;
            }
        }
        HashMap<String, String> m = new HashMap<String, String>();
        m.put("error", "No information about: " + path);
        return m;
    }

    private static String object2yaml(Object object, List<String> l) {
        DumperOptions options = new DumperOptions();
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        options.setSplitLines(true);
        options.setWidth(100000);
        Yaml y = new Yaml(options);
        Object o = object2json(object);
        if (o instanceof JSONArray) {
            JSONObject j = new JSONObject();
            j.put("ARRAY", object);
            o = j;
        }
        JSONObject json = (JSONObject) o;
        if (l != null) {
            for (String s : l) {
                if (json.has(s)) {
                    json.remove(s);
                }
            }
        }
        // the replace is due to JSONObject changes "</" to "<\/"
        Object data = y.load(json.toString().replace("<\\/", "</"));
        return y.dump(data);
    }

    public static void main(String[] args) {
        DocUtils d = new DocUtils("1607", "ISTFLT", null, null);
//		System.err.println(object2yaml(d.tenants().get("local-willows"),null));
//		System.err.println(object2yaml(d.types("vm"),null));
//		System.err.println(object2yaml(d.types("docker"),null));
//		System.err.println(object2yaml(d.types("cdap"),null));
//		System.err.println(object2yaml(d.vms(),null));
        System.err.println(object2yaml(d.dockers(), null));
    }

}
