
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
	
package org.openecomp.dcae.controller.operation.utils  

import groovy.json.JsonOutput;
import groovy.text.SimpleTemplateEngine 

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.codehaus.groovy.ast.stmt.CatchStatement;
import groovy.io.FileType
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject
import org.json.JSONArray
import org.json.JSONObject;

import org.openecomp.dcae.controller.core.service.DcaeLocation;
import org.openecomp.dcae.controller.core.service.ServiceFactory;
import org.openecomp.dcae.controller.platform.controller.ControllerFactory;
import org.openecomp.dcae.controller.platform.controller.DcaePlatformController;
import org.openecomp.ncomp.openstack.OpenstackFactory;
import org.openecomp.ncomp.openstack.location.LocationFactory;
import org.openecomp.ncomp.openstack.location.LocationPackage;
import org.openecomp.ncomp.openstack.location.OpenStackLocation
import org.openecomp.ncomp.openstack.location.OpenStackProject;
import org.openecomp.ncomp.openstack.util.OpenstackAdapterFactory;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.utils.StringUtil;
import org.openecomp.ncomp.webservice.utils.FileUtils;
import org.openecomp.ncomp.sirius.manager.console.Utils

import static org.openecomp.ncomp.sirius.manager.console.Utils.*

class GenControllerConfiguration extends DocUtils {  
	
	String destinationRoot
	ManagementServer server
	DcaePlatformController o
	DcaePlatformConfiguration platformConfig
	String destRoot
	String release
	String env
	
	
	public GenControllerConfiguration(String release, String env, String root1, String root2) {
		super(release,env,root1,root2);
		this.release = release
		this.env = env
		destinationRoot = (root2 ?: root) + "/" + release + "-" + env + "/controller-gen"
		destRoot = root2 ?: root
		File d = new File(destinationRoot)
		server = new ManagementServer()
		o = ControllerFactory.eINSTANCE.createDcaePlatformController()
		platformConfig = new DcaePlatformConfiguration(release,env,root1,root2)
		server.setObject(o)
		["controller-gen","chef-repo-gen","cloudify-gen","general-gen"].each { dd ->
			d = new File("${root2 ?: root}/$release-$env/$dd")
			if (d.exists())
				FileUtils.deleteDirectory(d)		
		}
		println "destinationRoot=$destinationRoot"
	}
	
	void copyFile(File source, File destination, boolean doSub = false) {
		destination.getParentFile().mkdirs()
		if (doSub && source.bytes == source.text.bytes) {
			// TEXT file
			destination << substitute(source.text,[:],"???","???")
		}
		else
			destination.bytes = source.bytes
	}

	void copyDirectory(File sourceDir, File destDir, boolean doSub = false) throws IOException {
		if (!destDir.exists()) {
			destDir.mkdirs();
		}
		for (File f : sourceDir.listFiles()) {
			File dest = new File(destDir, f.getName());
			if (f.isDirectory()) {
				copyDirectory(f, dest, doSub);
				continue;
			}
			if (f.isFile()) {
				copyFile(f, dest, doSub);
			}
		}
	}
	void copyFileFromDirectory(File sourceDir, File destDir) throws IOException {
		if (!destDir.exists()) {
			destDir.mkdirs();
		}
		for (File f : sourceDir.listFiles()) {
			File dest = new File(destDir, f.getName());
			if (f.isDirectory()) {
				copyDirectory(f, dest);
				continue;
			}
			if (f.isFile()) {
				copyFile(f, dest);
			}
		}
	}

	def void createChefConfiguration() {
		save2("/topologies/${release}-${env}", platformConfig.chefTopo(), "chef")
		if (release == "1607") return
		platformConfig.deploymentType.each { n, v ->
			if (v.type == null || ! n.startsWith("vm-")) return
			def ooo = v.type['vm-setup']
			def oo = [
				'nagios-configuration' : ooo['nagios-configuration'],
				'splunk-configuration' : ooo['splunk-configuration'],
				'configuration-files':[:]
			]
			def xx = oo['configuration-files']
			v.instances.each { i, instance ->
				def n2 = v['vm-type']
				[ 
					[dirname : "$root/$release/vm-config/$n2", nameType : "a"], 
					[dirname : "$root/$release/vm-config-chef/$n2", nameType : "a"], 
					[dirname : "$root/$release/other-config/$n2", nameType : "b"],
					[dirname : "$root/$release/monitoring-config", nameType: "c"]
				].each { v3 ->
					def dir = new File(v3.dirname)
					if (dir.exists()) {
						recurseFiles(dir).each { File file ->
						  def nn
						  switch (v3.nameType) {
						  case "a": nn = "$n2-$file.name"; break;
						  case "b": nn = "$file.name"; break;
						  case "c": nn = "monitoring-agent-$file.name"; break;
						  }
						  if (nn.endsWith(".base64")) {
							  nn = nn.replace(".base64","")
							  xx[nn] = [ destination: "/var/config/DCAE/chef/$nn", encoding:"base64", content: file.text]
						  }
						  else
						  	xx[nn] = [ destination: "/var/config/DCAE/chef/$nn", content: file.text]
						}
					}
				}
				def o  = []
				String str
				str = object2json(oo)
				str = DocUtils.object2yaml(oo,[])
//				println str
//				str = str.replace("\\n", "\\\\n").replace("\\\\", "\\")
//				println str
//				def ENV = ((envMapGlobal['vm-templates'] ?: [:])[n2]) ?: [:]
//				println "ENV $n2 $ENV"
//				str = substitute(str,ENV,n,i)
//				f.getParentFile().mkdirs()
//				println str
//				f << str
//				System.exit(0)
				instance.servers.each { n3, v3 ->
					def ENV = ((envMapGlobal['vm-templates'] ?: [:])[n2]) ?: [:]
//					println "ENV $n2 $ENV"
					platformConfig.vmKey = certificatePassword(n3)
					platformConfig.vmName = n3
//					println "n3=$n3 v3=$v3 vmKey=$platformConfig.vmKey"
//					System.exit(0)
					def str1 = substitute(str,ENV,n,i)
					saveYaml("files/${n3}",str1,"chef")
					platformConfig.vmKey = null
				}
			}
		}
	}
	
	def recurseFiles(File dir) {
		def l = []
		dir.eachFileRecurse (FileType.FILES) { file -> l += file }
		return l.sort { it }
	}
	
	def void createConfiguration() {
		def envMap = file2object("$release-$env/env.yaml", false)
		save("/configuration", new JSONObject())
		File dir = new File(root + "/" + release + "/controller-template")
		File dir2 = new File(destinationRoot + "/resources")
		File dir3 = new File(destinationRoot + "/resources/descriptors")
		copyDirectory(dir, dir2);
		(platformConfig.env['users'] ?: [:]).each { n, v ->
			save("/users/$n",v)
		}
		["vm","docker","cdap","other"].each  { t -> 
			File dir4 = new File("$root/$release/${t}-descriptors")
			dir4.listFiles().each { f -> 
				copyFile(f, new File(dir3,f.name)); 
			}
		}
		File config1 = new File(root + "/" + release + "/vm-config/vm-controller")
		File config2 = new File(destinationRoot + "/config")
		copyDirectory(config1, config2, true);
		File config11 = new File(root + "/" + release + "-" + env + "/config")
		File config21 = new File(destinationRoot + "/config")
		copyDirectory(config11, config21);
		File cert1 = new File(root + "/" + release + "-" + env + "/certificates")
		File cert2 = new File(destinationRoot + "/config")
		copyDirectory(cert1, cert2);
		// TODO remove this old stuff
//		println platformConfig.types.collect { String n, v -> n }
		platformConfig.types.each { String n, v ->
			if (!n.startsWith("vm")) return
			if (!platformConfig.types[n]['openstack-vm-type']) {
				System.err.println "No vm type for $n"
				return 
			}
			def n1 = n.replace("vm-", "dcae-")
			save("/openstack/vmTypes/$n1",substitute(platformConfig.genVmType(n),[:],n,null))
		}
		def chef = file2object("$release-$env/chef.yaml", false)
		def maven = file2object("$release-$env/maven.yaml", false)
		def ssl = file2object("$release-$env/ssl.yaml", false)
		platformConfig.deploymentType.each { n, v ->
			if (v.type == null || ! n.startsWith("vm-")) return
			if (v.type['vm-setup'] == null) v.type['vm-setup'] = ['configuration-files' :[:]]
			def oo = v.type['vm-setup']
			if (oo['configuration-files'] == null) oo['configuration-files'] = [:]
			def xx = oo['configuration-files']
			v.instances.each { i, instance ->
				File f = new File("$destinationRoot/config/instances/$n/${i}.yaml")
//				println platformConfig.p(oo)
				if (v.type['openstack-vm-type'] && v.type['openstack-vm-type']['disk-partitions']) {
					xx.mount_config = [
						destination: "/tmp/dcae-mount.conf",
						content: DocUtils.object2yaml(v.type['openstack-vm-type']['disk-partitions'],[])
					]
				}
				if (chef) {
					chef['pem-files'].each { n1, v1 ->
						xx["chef-$n1"] = v1
					}
				}
				if (maven && maven.settings) {
					xx["maven-settings"] = maven.settings
				}
				if (ssl && ssl.certificates) {
					ssl.certificates.each { n4, v4 ->
						xx[n4] = v4
					}
				}
				def aa = file2object("$release-$env/vm-instances/${n}.yaml", false) ?: [:]
				def aaa = aa['configuration-files'] ?: [:]
				aaa.each { n4, v4 ->
					xx[n4] = v4
				}
				def n2 = v['vm-type']
				def vmConfigDir = new File("$root/$release/vm-config/$n2")
				if (vmConfigDir.exists()) {
					recurseFiles(vmConfigDir).each { file ->
					  def nn = "$n2-$file.name"
					  if (nn.endsWith(".base64")) {
						  nn = nn.replace(".base64","")
						  xx[nn] = [ destination: "/tmp/$nn", encoding:"base64", content: file.text]
					  }
					  else
					  	xx[nn] = [ destination: "/tmp/$nn", content: file.text]
					}
				}
				def vmConfigDir2 = new File("$root/$release-$env/vm-config/$n2")
				System.err.println "XXXXX: $vmConfigDir2"
				if (vmConfigDir2.exists()) {
					System.err.println "XXXXX: $vmConfigDir2"
					recurseFiles(vmConfigDir2).each { file ->
					  System.err.println "XXXXX: $file"
					  def nn = "$n2-$file.name"
					  if (nn.endsWith(".base64")) {
						  nn = nn.replace(".base64","")
						  xx[nn] = [ destination: "/tmp/$nn", encoding:"base64", content: file.text]
					  }
					  else
					  	xx[nn] = [ destination: "/tmp/$nn", content: file.text]
					}
				}
				def otherConfigDir = new File("$root/$release/other-config/$n2")
				if (otherConfigDir.exists()) {
					recurseFiles(otherConfigDir).each { file ->
					  def nn = "$file.name"
					  xx[nn] = [
							destination: "/tmp/$nn",
							content: file.text
						]
					}
				}
				recurseFiles(new File("$root/$release/monitoring-config")).each { file ->
				  def nn = "monitoring-agent-$file.name"
				  xx[nn] = [
						destination: "/tmp/$nn",
						content: file.text
					]
				}
				def o  = []
				String str
				str = object2json(oo)
				str = DocUtils.object2yaml(oo,[])
//				println str
				str = str.replace("\\n", "\\\\n").replace("\\\\", "\\")
//				println str
				def ENV = ((envMapGlobal['vm-templates'] ?: [:])[n2]) ?: [:]
//				println "ENV $n2 $ENV"
				str = substitute(str,ENV,n,i)
				f.getParentFile().mkdirs()
//				println str
				f << str
//				System.exit(0)
				if (release == "1607") {
					instance.servers.each { n3, v3 ->
						saveYaml("files/${n3}",str,"chef")
					}
				}
			}
		}
		save("/databus",[streams : platformConfig.streams2bus()]) 
		save("/cluster",platformConfig.controllerCluster())
		// version
		def version = file2object("$release/version.yaml", false)
		System.err.println "version=$version"
		if (version != null) {
			save("/configuration/version",version)
		}
	}

	void createLocations() {
		Map tenants = tenants();
		o.openstack = OpenstackFactory.eINSTANCE.createOpenStackController()
		save("/openstack", new JSONObject())
		tenants.each { n, tenant -> 
			DcaeLocation loc = ServiceFactory.eINSTANCE.createDcaeLocation()
			o.getLocations().add(loc)
			loc.name = n
			loc.locationType = tenant.type
			if (tenant.openstack != null) {
				OpenStackLocation l = genEcore(LocationPackage.eINSTANCE.openStackLocation, tenant.openstack)
				l.name = n
				o.openstack.locations += l
				OpenStackProject p = genEcore(LocationPackage.eINSTANCE.openStackProject, tenant.openstack.tenant)
				l.projects += p
				loc.openstackProject = p
				l.allowCreateFlavor = (! platformConfig.aEnv() )
				save("/openstack/locations/$n",l)	
			}	
			save("/locations/$n",loc)
		}
	}
	
	def throw1(s) {
		throw new RuntimeException(s)
	}
	
	void createServiceInstances() {
		def envMap = file2object("$release-$env/env.yaml", false) ?: ['vm-templates':[:]]
		vms().each { n1, vmDeployment -> 
//			System.err.println "$n1 $vmDeployment"
			def t = vmDeployment['vm-type']
			vmDeployment.locations.each { n , vm ->
//				System.err.println "$n $vm" 
				def m = [:]
				def s = vm['dcae-service']
				def i = vm['dcae-service-instance']
				def descriptor = file2object("$release/vm-descriptors/${s}.json", false)
				if (descriptor == null) {
					System.err.println "No descriptor for $s"
					return
				}
				def template = file2object("$release/vm-service-instance-templates/${n}.yaml", false)
				def vmTemplate = file2object("$release/vm-templates/${t}.yaml")
//				System.err.println "$n descript=$descriptor"
//				System.err.println "$n template=$template"
				m['$class'] = "${descriptor.servicePackage}.${descriptor.serviceInstanceClass}"
				m.vmType = [ '$ref' : "/openstack/vmTypes/${t.replace('vm-','dcae-')}" ]
				m.location = [ '$ref' : vm['dcae-container'] ]
				m.numberOfServers = vmTemplate['number-vms-per-location']
				m.iedsAdmin = (envMap['ieds'] ?: [:])['admin-user'] ?: "TBD - env.yaml@ieds.admin-user"
				m.chefUser = (envMap['chef'] ?: [:])['user'] ?: "TBD - env.yaml@chef.user"
				m.chefOrg = (envMap['chef'] ?: [:])['org'] ?: "TBD - env.yaml@chef.group"
				m.chefTopology = "$release-$env"
				m.openstackFlavor = substitute(platformConfig.flavor(s,i),[:],s,i)
				if ((vmTemplate['dns-arecords'] ?: []).contains('site')) {
					platformConfig.init(s,i)
					m.serviceFqdn = platformConfig.siteServiceFqdn()
				}
				["users","adminUsers"].each { xx ->
					def xx1 = envMap['vm-templates'] ?: [:]
					if (xx1 == null) { throw1 "No vm-templates in $release-$env/env.yaml" }
					def xx2 = xx1[t]
					if (xx2 == null) { xx2 = xx1['default'] ?: [users:[],adminUsers:[]] }
					if (xx2 == null) { throw1 "No vm-template for $t in $release-$env/env.yaml" }
					def xx3 = xx.replace("U", "-u")
//					System.err.println "$xx1 $t" 
					m[xx] = []
					xx2[xx3].each  { u ->
						m[xx] += [ '$ref' : "/users/$u" ]
					}
				}
				m.servers = [:]
				vm.vms.each { n2, vm2 ->
					m.servers[n2] = [ 
						certificatePassword: certificatePassword(n2),
						networks : [ public : [
							dnsName:vm2['dns-name'],
							ip:ipAssignment(n2),
						]]
					]
				}
//				System.err.println "$n m=$m"
				m.applicationIds = vmTemplate['application-ids'] ?: ["dcae"]
				m.adminId = vmTemplate['admin-id'] ?: "attcloud"
				def iConf = vmTemplate['controller-instance-configuration'] ?: [:]
				iConf.each { nn, v -> m[nn] = substitute(v,envMap['vm-templates'][t],s,i) }
				// manager port
				def x = vmTemplate['lifecycle-management'] ?: ['use-dcae-manager': false]
				if (! x['use-dcae-manager']) {
					m.managerPortNumber = -1
				}
				else {
					m.managerPortNumber = x['manager-port'] ?: 9999
				}
				def installSteps = vmTemplate['installation-steps'] ?: []
				m.steps = [:]
				def stepIndex = 0
				def pp = "org.openecomp.dcae.controller.service.vm"
				installSteps.each  { step ->
					def stepName = "step-${stepIndex++}"
					switch (step.step) {
						case "shell":
							m.steps[stepName] = [
								'$class' : "${pp}.ShellInstallationStep",
								command : substitute(step.command,[:],s,i)
							]
							break
						case "maven-artifact":
							m.steps[stepName] = [
								'$class' : "${pp}.MavenArtifactInstallationStep",
								groupId : step['group-id'],
								artifactId : step['artifact-id'],
								version : substitute(step['version'],[:],s,i),
								type : step['type'],
								assemblyId : step['assembly-id'],
								applicationId : step['application-id'],
							]
							break
						case "http":
							m.steps[stepName] = [
								'$class' : "${pp}.HttpInstallationStep",
								url : substitute(step['url'],[:],s,i),
								userName : substitute(step['user-name'],[:],s,i),
								password : substitute(step['password'],[:],s,i),
								type : step['type'],
								artifactId : step['artifact-id'],
								applicationId : step['application-id'],
							]
							break
						default: 
							System.err.println "Unknown step: $s $i: $step.step"
					}
				}
				save("/services/$s/instances/$i",m,true)
				def m1 = [:]
				def sConf = vmTemplate['controller-configuration'] ?: [:]
				sConf.each { nn, v -> m1[nn] = v }
				m1['$class'] = "${descriptor.servicePackage}.${descriptor.serviceClass}"
				save("/services/$s",m1,true)
	//			System.exit(0)
			}
		}
	} 
	void createDockerServiceInstances() {
		def envMap = file2object("$release-$env/env.yaml", false)
		dockers().each { s, dockerDeployment ->
			def t = dockerDeployment['docker-type']
			Map tenants = tenants();
			def dockerTemplate = file2object("$release/docker-templates/${t}.yaml")
			def dockerInstances = file2object("$release-$env/docker-instances/${s}.yaml",false)
			def descriptor = file2object("$release/docker-descriptors/${s}.json", false)
			if (descriptor == null) {
				System.err.println "no docker descriptor for $s"
				return
			}
//			println dockerDeployment
//			println dockerTemplate
//			println dockerInstances
			tenants.each { i, tenant ->
				if (tenant.type != dockerDeployment['location-type']) return 
				def m = [:]
				m.hostService = ['$ref' : substitute(dockerDeployment['dcae-container'],[:],s,i) ]
				def iConf = dockerTemplate['controller-instance-configuration'] ?: [:]
				iConf.each { nn, v -> m[nn] = substitute(v,(envMap['docker-templates'] ?: [:])[t],s,i) }
				if (dockerInstances != null && dockerInstances.instances != null) {
					def iConf2 = dockerInstances.instances[i] ?: [:]
					iConf2.each { nn, v -> m[nn] = v }
				}
				def x = dockerTemplate['lifecycle-management'] ?: ['use-dcae-manager': true]
				if (! x['use-dcae-manager']) { 
					m.managerPortNumber = -1
				}
				else {
					m.managerPortNumber = x['manager-port'] ?: 9999
				}
				save("/services/$s/instances/$i",m,true)	
//				createCloudifyBlueprint("docker",s,i,m)
//				println m
//				System.exit(3)
			}				
			def m1 = [:]
			def sConf = dockerTemplate['controller-configuration'] ?: [:]
			sConf.each { nn, v -> m1[nn] = v }
			m1['$class'] = "${descriptor.servicePackage}.${descriptor.serviceClass}"
			save("/services/$s",m1,true)
		}
	}
	
	def p(o) {
		object2json(o).toString(2)
	}
	
	void createGeneralServiceInstances(t) {
		def envMap = file2object("$release-$env/env.yaml", false)
		platformConfig.deploymentType.each { s, v ->
			if (! s.startsWith(t)) return
			def instances = file2object("$release-$env/$t-instances/${s}.yaml",false) ?: [:]
			def descriptor = file2object("$release/$t-descriptors/${s}.json", false)
			if (descriptor == null) {
				System.err.println "no $t descriptor for $s"
				return
			}
			v.instances.each { i, v2 ->
				def m = [:]
				m.clusterService = ['$ref' : "/services/$v2.hostService/instances/$v2.hostServiceInstance" ]
				def iConf = v.type['controller-instance-configuration'] ?: [:]
				iConf.each { nn, vv -> m[nn] = substitute(vv,[:],s,i) }
				def iConf2 = instances[i] ?: [:]
				iConf2.each { nn, vv -> m[nn] = vv }
				save("/services/$s/instances/$i",m,true)
//				createCloudifyBlueprint("docker",s,i,m)
//				println p(m)
//				println p(v)
//				System.exit(3)
			}
//			def m1 = [:]
//			def sConf = dockerTemplate['controller-configuration'] ?: [:]
//			sConf.each { nn, vv -> m1[nn] = vv }
//			m1['$class'] = "${descriptor.servicePackage}.${descriptor.serviceClass}"
//			save("/services/$s",m1,true)
		}
	}
	
	def createCloudifyBlueprint(t,s,i,m) {
		def blue = file2object("$release/cloudify-templates/${t}.yaml", false)
		def str = object2json(m).toString(2)
//		println blue
		blue.node_templates.docker.properties = [
			deployment_JSON : str,
			service_name : s,
		]
		saveYaml("/blueprints/$s-$i",blue,"cloudify")
	}
	
	def createEforc() {
		def x = platformConfig.eforc()
		saveYaml("/eforc",x.m,"general")
		saveYaml("/dns",platformConfig.dns(),"general")
		saveYaml("/ssl",platformConfig.ssl(),"general")
		saveTable("/eforc-table",x.list,"general")
		saveTable("/eforc-subnet-table",x.list2,"general")
		saveYaml("/flavors",platformConfig.showFlavors(),"general")
	}

	def envMapGlobal = file2object("$release-$env/env.yaml", false) ?: [:]
	def substitute(o, env, s, i) {
		SimpleTemplateEngine engine = new SimpleTemplateEngine()
		String res = o
		env = env ?: [:]
		env.dcae = platformConfig
		env.passwords = envMapGlobal.passwords ?: [:]
		env.ENV = env
//		env['class'] = '$class'
		platformConfig.init(s, i)
		switch  (o) {
			case List: 
			  def l = []
			  o.each { e -> 
				  l +=  substitute(e, env, s, i)
			  }
			  return l
			case Map: 
			  def m = [:]
			  o.each { n,v -> 
				  m[n] =  substitute(v, env, s, i)
			  }
			  return m
		}
		try {
			res = engine.createTemplate("$o").make(env) 
			if (res.startsWith("_LIST_:") && res.endsWith(":_LIST_")) {
				res = res.replace("_LIST_:","").replace(":_LIST_","")
				JSONArray a = new JSONArray(res)
				return json2object(a)
			}
		} catch (e) {
			System.out.println "$o"
			System.out.println "$env"
			System.err.println "ERROR $e"
			System.err.println "ERROR ${e.printStackTrace()}"
			System.exit(2)
		}
		return res
	}
	
	String ipAssignment(n) {
		def m = file2object("$release-$env/ip-assignment.yaml")
		return m[n]
	}
	String certificatePassword(n) {
		def m = file2object("$release-$env/certificates/passwords.yaml")
		return m[n]
	}
	
	def genEcore(EClass eclass,m) {
		if (m == null) return null
		JSONObject json = object2json(yamlNames2ecore(m))
//		System.err.println json.toString(2)
		return server.json2ecore(eclass, json)

	}
	
	String yamlNames2ecore2(String n) {
		String r = ""
		boolean first = true
		n.split("-").each { n1 ->
			if (first) {
				first = false
				r+=n1
			} else {
				r += StringUtil.capitalize(n1)
			}
		}
//		System.err.println "$n $r"
		return r
	}
	def yamlNames2ecore(o) {
		switch (o) {
			case List:
				def l = []
				o.each { l = yamlNames2ecore(it) }
				return l
			case Map:
				def m1 = [:] 
				o.each { k,v -> m1[yamlNames2ecore2(k)] = yamlNames2ecore(v) }
				return m1
			case boolean:
			case long:
			case int:
			case double:
			case Boolean:
			case Long:
			case Integer:
			case String: return o; break
			case GString: return o.toString(); break
			case null: break;
			default: println "Unable to convert: $o ${o.getClass().name}"
		}

	}
	
	void save(String path, o, isService = false ) {
		File f = new File(destinationRoot + "/${isService ? 'services-' : ''}resources/${path}.json")
		f.getParentFile().mkdirs()
		if (f.exists()) f.delete()
		switch (o) {
		case EObject: f << ManagementServer.ecore2json(o, 1000, null, false).toString(2); break
		case JSONObject : f << o.toString(2); break
		case Map : f << object2json(o).toString(2); break
		default: System.err.println "Unable to save object: path=$path $o"
		}
//		println "Wrote $f"
	}
	
	void save2(String path, o, String type ) {
		File f
		switch (type) {
		case "chef": f = new File("$destRoot/$release-$env/chef-repo-gen/${path}.json")
		}
		f.getParentFile().mkdirs()
		if (f.exists()) f.delete()
		switch (o) {
		case EObject: f << ManagementServer.ecore2json(o, 1000, null, false).toString(2); break
		case JSONObject : f << o.toString(2); break
		case Map : f << object2json(o).toString(2); break
		default: System.err.println "Unable to save2 object: path=$path $o"
		}
	}
	
	void saveYaml(String path, o, String type ) {
		File f
		switch (type) {
		case "cloudify": f = new File("$destRoot/$release-$env/cloudify-gen/${path}.yaml"); break
		case "general": f = new File("$destRoot/$release-$env/general-gen/${path}.yaml"); break
		case "chef": f = new File("$destRoot/$release-$env/chef-repo-gen/${path}.yaml"); break
		}
		f.getParentFile().mkdirs()
		if (f.exists()) f.delete()
		switch (o) {
		case String : f << o; break
		case Map : f << object2yaml(o, []); break
		default: System.err.println "Unable to save yaml object: path=$path $o"
		}
	}
	void saveTable(String path, l, String type ) {
		File f
		switch (type) {
		case "cloudify": f = new File("$destRoot/$release-$env/cloudify-gen/${path}.csv");break
		case "general": f = new File("$destRoot/$release-$env/general-gen/${path}.csv");break
		case "chef": f = new File("$destRoot/$release-$env/chef-repo-gen/${path}.csv");break
		}
		f.getParentFile().mkdirs()
		if (f.exists()) f.delete()
		l.each { row -> f << "${row.join(",")}\n" }
	}
	
	static main(args) {
//		println object2yaml(file2object("1607/dcae_admin_db_pgaas.json"), [])
		String root = args.length > 1 ? args[1] : null
		String destRoot =  args.length > 2 ? args[2] : null
		String rel = args.length > 3 ? args[3] : "1607"
		GenControllerConfiguration d = new GenControllerConfiguration(rel, args[0], root, destRoot);
		d.platformConfig.privateKey = args.length > 4 ? args[4] : null
		d.createGeneralServiceInstances('cdap');
		d.createGeneralServiceInstances('other');
		d.createDockerServiceInstances();
		d.createConfiguration();
		d.createLocations();
		d.createServiceInstances();
		d.createChefConfiguration();
		d.createEforc()
		System.exit(0); 
	}

}
