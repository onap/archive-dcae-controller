
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

import static org.openecomp.ncomp.sirius.manager.console.Utils.*
import static org.openecomp.ncomp.utils.Base64.decode64;
import static org.openecomp.dcae.controller.operation.utils.DocUtils.*

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;

import javax.crypto.Cipher;

import org.json.JSONArray
import org.junit.After;

import groovy.text.SimpleTemplateEngine

import org.openecomp.ncomp.utils.CryptoUtils;
import org.openecomp.ncomp.webservice.utils.IpUtils

class DcaePlatformConfiguration {
	def env
	def release
	String envName
	def tenants
	def locationTypes
	def serviceName
	def instanceName
	def tenant
	def locationName
	def streams
	def networking
	def ipAssignments
	def passwords
	Map deploymentType = [:]
	Map types = [:]
	def vms // for now use old setup.
	def dockers // for now use old setup.

	public DcaePlatformConfiguration(String release, String envName, String root, String destRoot) {
		DocUtils docUtils = new DocUtils(release,envName,root,destRoot)
		this.envName = envName
		this.release = release
		vms = docUtils.vms()
		dockers = docUtils.dockers()
		env = file2object("$release-$envName/env.yaml", false) ?: [:]
		tenants = file2object("$release-$envName/tenants.yaml", false)
		ipAssignments = file2object("$release-$envName/ip-assignment.yaml", false) ?: [:]
		locationTypes = file2object("$release/location-types.yaml", false)
		streams = file2object("$release/streams.yaml", false)
		networking = file2object("$release/networking.yaml")
		passwords = file2object("$release-$envName/certificates/passwords.yaml", false) ?: [:]
		tenants.each { n, v -> 
			v.tenantName = n
			if (locationTypes[v.type].tenantNames == null)
				locationTypes[v.type].tenantNames = []
			locationTypes[v.type].tenantNames += n
		}
		locationTypes.each { n, v ->
			def deployments = []
			[
				'vm-deployments',
				'docker-deployments',
				'cdap-deployments',
				'other-deployments'
			].each { t ->
				def typeDir = t.replace("deployments","templates")
				def typeName = t.replace("deployments","type")
//				println "n=$n v=$v t=$t"
				v[t].each { n1, v1 ->
					deployments += n1
					//	println "n1=$n1 v1=$v1 $release/$typeDir/${v1[typeName]}.yaml"
					deploymentType[n1] = v1
					v1.type = file2object("$release/$typeDir/${v1[typeName]}.yaml", false)
					if (v1.type == null) {
						println "n1=$n1 v1=$v1"
						System.err.println "Unknown type: $release/$typeDir/${v1[typeName]}.yaml"
						System.exit(3)
					}
					types[v1[typeName]] = v1.type
				}
			}
			locationTypes[n].deployments = deployments
//			System.err.println "n=$n v=${locationTypes[n].deployments} $deployments"
		}
		deploymentType.each { n,v ->
			addInstances(n)
		}
	}

	def init(s,i) {
		serviceName = s
		instanceName = i
		tenant = tenants[i]
		locationName = i
	}

	def p(o) {
		object2json(o).toString(2) 
	}

	def addInstances(String n) {
		def instances = [:]
		deploymentType[n].instances = instances
		deploymentType[n].tenantNames = []
		tenants.each  { tenantName, tenant ->
			// System.err.println  "tenantName $tenantName $tenant.type ${locationTypes[tenant.type].deployments}"
			locationTypes[tenant.type].deployments.each { n1 ->
				// println  "$n $tenantName $n1"
				if (n != n1) return
				deploymentType[n].tenantNames += tenantName
				def instance = [:]
				instances[tenantName] = instance
				if (n.startsWith("vm-")) {
					// println  "$n $tenantName $n1 ${p(vms[n])}"
					instance.servers = vms[n].locations["$n1-$tenantName"].vms
					if (instance.servers == null) {
						println "No servers for: $n $tenantName $n1 ${p(vms[n])}"
						System.exit(3)
					}
					instance.servers.each { n2, v2 ->
						v2.ip = ipAssignments[n2] ?: "TBD - ip-assignment.yaml@$n2"
						v2['dns-cnames'] = []
						v2['dns-gss'] = []
						v2['dns-arecords'] = [ "${n2}.${tenant['dns-surfix']}"]
						def envDns = env.get("dns") ?: [:]
						def shortName = deploymentType[n].type['short-name']
						def shortNameGlobal = "$shortName${envDns['global-fix'] ?: ''}"
						def globalDns = envDns.get("service-suffix") ?: "TBD - env.yaml@dns.service-suffix"
						def tenantDns = tenant.get("dns-surfix") ?: "TBD - tenants.yaml@${tenantName}.dns-surfix"
						(deploymentType[n].type['dns-cnames'] ?: []).each { dns1 ->
							if (dns1=="central" && tenant.type != "opendcae-central") return
							if (dns1=="central-site" && tenant.type != "opendcae-central") return
							v2['dns-cnames'] += dnsName(n,tenant,dns1)
						}
						(deploymentType[n].type['dns-gss'] ?: []).each { dns1 ->
							if (dns1=="central" && tenant.type != "opendcae-central") return
							v2['dns-gss'] += dnsName(n,tenant,dns1)
						}
						(deploymentType[n].type['dns-arecords'] ?: []).each { dns1 ->
							if (dns1=="central" && tenant.type != "opendcae-central") return
							v2['dns-arecords'] += dnsName(n,tenant,dns1)
						}
						// dns-service: [ drsub: [ 'dns-type' : 'arecords': 'cluster-type' : 'site' ] ]
						(deploymentType[n].type['dns-service'] ?: [:]).each { n3, v3 ->
							v2["dns-${v3['dns-type']}"] += dnsName(n,tenant,v3['cluster-type'],n3)
							switch (v3['cluster-type']) {
							case "gss" : 
								v2["dns-cnames"] += dnsName(n,tenant,"global",n3)
								break
							case "gss-edge" : 
								v2["dns-cnames"] += dnsName(n,tenant,"site",n3)
//								println "$n ${p(v2)}"
//								System.exit(3)
								break
							}
						}
//						println "$n ${p(v2)}"
//						System.exit(3)
					}
					return
				}
//				println  "$n $tenantName $n1 ${p(deploymentType[n])}"
				def path =  substitute(deploymentType[n].container,[:],n,tenantName)
				def a = path.split("/")
				instance.hostService = a[2]
				instance.hostServiceInstance = a[4]
			}
		}
//		println  "$n ${p(instances)}"
//		println  "$n ${p(deploymentType[n])}"
//		System.exit(0)
	}
	def dnsName(n,tenant,dnsType, extra = null) {
		def tenant1 = tenant ?: [tenantName:"NA"]
		def ee = envName.toLowerCase()
		def envDns = env.get("dns") ?: [:] 
		if (deploymentType[n] == null) {
			throw new RuntimeException("Unknown deploymentType: $n")
		}
		def shortName = deploymentType[n].type['short-name']
		def shortNameGlobal = "$shortName${envDns['global-fix'] ?: ''}"
		def globalDns = envDns.get("service-suffix") ?: "TBD - env.yaml@dns.service-suffix"
		def gssDns = env("dns.gss-idns-suffix") 
		def tenantDns = tenant1.get("dns-surfix") ?: "TBD - tenants.yaml@${tenant1.tenantName}.dns-surfix"
		extra = (extra != null) ? "-$extra" : ""
		switch (dnsType) {
			case "gss": return "dcae-${shortNameGlobal}$extra-${ee}.${gssDns}"
			case "gss-edge": return "dcae-${shortName}$extra-$tenant.tenantName-${ee}.${gssDns}"
			case "global": 
			case "central": 
			case "central-site": 
			case "global-site": return "dcae-${shortNameGlobal}$extra-${ee}.${globalDns}"
			case "site":   return "dcae-${shortName}$extra-$tenant.tenantName-${ee}.${tenantDns}"
		} 
	}
	
	def aEnv() {
		switch (release) {
			case "1607": return ! envName.contains("FTL"); break;
			case "1610": return ! envName.equals("FTL2"); break;
			default: return true;
		}
	}

	def genVmType(n) {
		def o = types[n]['openstack-vm-type']
		def m = [:]
		m.diskSizeGB = o.diskSizeGB ?: 0
		m.volumeSizeGB = o.volumeSizeGB ?: 0
		m.memorySizeMB = o.memorySizeGB ?: 4
		m.memorySizeMB *= 1024
		m.needPublicIp = "${o.needPublicIp ?: true}"
		m.numberOfCores = o.numberOfCores ?: 2
		m.rootDiskSizeGB = o.rootDiskSizeGB ?: 80
		m.imageName = o.imageName ?: "m1.large"
		if (! aEnv()) {
			if (o['dev-diskSizeGB'] != null) m.diskSizeGB = o['dev-diskSizeGB']
			if (o['dev-volumeSizeGB'] != null) m.volumeSizeGB = o['dev-volumeSizeGB']
			if (o['dev-memorySizeMB'] != null) m.memorySizeMB = o['dev-memorySizeMB']
		}
		m.incomingSecurityRules = [
			"manager": [
				"ipProtocol": "tcp",
				"portRangeStart": "1",
				"portRangeEnd": "59996",
			]
		]
		if (n == "vm-docker-host") {
			m.incomingSecurityRules['udp'] = [
				"ipProtocol": "udp",
				"portRangeStart": "162",
				"portRangeEnd": "6162",
			]
		}
		//		println object2json(m).toString(2)
		return m
	}

	def serviceFqdn(deploymentTypeName = null, extra = null) {
		if (deploymentTypeName == null) deploymentTypeName = serviceName
		return dnsName(deploymentTypeName,tenant,"global",extra)
	}
	
	def httpProtocol(deploymentTypeName = null) {
		if (deploymentTypeName == null) deploymentTypeName = serviceName
		// TODO
		return "http"
	}

	
	def siteServiceFqdn(deploymentTypeName = null, extra = null) {
		if (deploymentTypeName == null) deploymentTypeName = serviceName
		return dnsName(deploymentTypeName,tenant,"site",extra)
	}
	
	def serversFqdn(deploymentTypeName = null, tName = instanceName) {
		def res = []
		servers(deploymentTypeName,tName).each { n -> res += "$n.${tenants[tName]['dns-surfix']}" }
		return res
	}
	
	def privateKey = null
	def vmKey = null
	def vmName = null
	def password(s) {
		def o = env.passwords ?: [:]
		boolean error = false
		s.split('\\.').each { n ->
			if (error) return
			if (o[n] == null) {
				o = "TBD: env.yaml@passwords.$s"
				error = true
			}
			else
				o = o[n]
		}
		if (privateKey != null && vmKey != null && o.startsWith("rsa:")) {
			def key = verifyKey(privateKey)
			o = CryptoUtils.decryptPrivate(key, o.substring(4));
			def k = vmKey
			if (vmKey.startsWith("rsa:")) {
				k = CryptoUtils.decryptPrivate(key, vmKey.substring(4));
			}
//			System.err.println "+++++ s=$serviceName i=$instanceName vm=$vmName s=$s k=$k o=$o"
			o = "%{vm.decrypt('${CryptoUtils.encrypt(k,o)}')}"
		}
		return o.trim()
	}
	
	public static String verifyKey(String privateKey) {
		try {
			def key = CryptoUtils.getKey(privateKey)
			if (decode64(key) == null) {
				System.err.println "ERROR: BAD private key: bad base64 encoding: $privateKey"
				System.exit(1)
			}
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			KeySpec keySpec = new PKCS8EncodedKeySpec(decode64(key));
			PrivateKey key1 = keyFactory.generatePrivate(keySpec);
			return key
		} catch (Exception e) {
			System.err.println "ERROR: BAD private key: $privateKey"
			System.exit(1)
		}

	}

	
	def streams(s) {
		def o = env.streams ?: [:]
		boolean error = false
		s.split('\\.').each { n ->
			if (error) return
			if (o[n] == null) {
				o = "TBD: env.yaml@streams.$s"
				error = true
			}
			else
				o = o[n]
		}
		return o
	}
	
	def env(s) {
		def o = env
		boolean error = false
		s.split('\\.').each { n ->
			if (error) return
			if (o[n] == null) {
				o = "TBD:env.yaml@$s"
				error = true
			}
			else
				o = o[n]
		}
		return o
	}
	
	def vmEnv(s) {
		def o = (env['vm-templates'] ?: [:])[serviceName] ?: [:]
		boolean error = false
		s.split('\\.').each { n ->
			if (error) return
			if (o[n] == null) {
				o = "TBD:env.yaml@vm-templates.${serviceName}.$s"
				error = true
			}
			else
				o = o[n]
		}
		return o
	}

	def allServersFqdn(deploymentTypeName = null) {
		if (deploymentTypeName == null) deploymentTypeName = serviceName
		def d = deploymentType[deploymentTypeName]
		def res = []
		if (d == null) return [
				"NO DeploymentType $deploymentTypeName"
			]
		if (d.instances == null) return [
				"NO instances DeploymentType $deploymentTypeName"
			]
		d.instances.each { instanceName, instance ->
			instance.servers.each { n, v ->
				res += "$n.${tenants[instanceName]['dns-surfix']}"
			}
		}
		return res
	}

	def servers(deploymentTypeName = null, tName = instanceName) {
		if (deploymentTypeName == null) deploymentTypeName = serviceName
		def d = deploymentType[deploymentTypeName]
		def res = []
		if (d == null) return [
				"NO DeploymentType $deploymentTypeName"
			]
		if (d.instances == null) return [
				"NO instances DeploymentType $deploymentTypeName"
			]
		if (d.instances[tName] == null) return [
				"NO instance DeploymentType $deploymentTypeName with name $instanceName"
			]
		d.instances[tName].servers.each { n, v ->
			res += n
		}
		return res
	}
	def allServers(deploymentTypeName = null) {
		if (deploymentTypeName == null) deploymentTypeName = serviceName
		def d = deploymentType[deploymentTypeName]
		def res = []
		if (d == null) return [
				"NO DeploymentType $deploymentTypeName"
			]
		if (d.instances == null) return [
				"NO instances DeploymentType $deploymentTypeName"
			]
		d.instances.each { n1, v1 ->
			v1.servers.each { n, v ->
				res += n
			}
		}
		return res
	}

	def eforc() {
		def res = [:]
		def list = []
		def d = [:]
		deploymentType.each { n, v ->
			d[n]=v
		}
		d['vm-all'] = [
			type : ['openstack-vm-type': networking ]
			]
		d.each { n, v ->
//			println "n=$n v=${p(v)}"
			def x = [outbound:[:],inbound:[:]]
			res[n] = x
			def out 
			if (n.startsWith('vm-')) {
				def vm = v.type['openstack-vm-type'] ?: [:]
//				println "n=$n vm=$vm"
				out = vm['application-outbound-security-rules'] ?: [:]
			} 
			else {
				out = v.type['application-outbound-security-rules'] ?: [:]
			}
//			println "n=$n out=$out"
			out.each { n1, v1 ->
//				println "n1=$n1 v1=$v1 dest=${destination2deployment(n1,v1)}"
				if (v1['only-local']) return
				x.outbound[n1] = []
				findEndpoints(n).each { from ->
					destination2deployment(n1,v1).each { n2 ->
//						println "n1=$n1 v1=$v1 endpoints=${findEndpoints(n2,v1)}"
						findEndpoints(n2,v1).each { to ->
							if (from == to) return
							if (both_local(from,to)) return
							def ip1 = findIps(n,from)
							def ip2 = findIps(n2,to,v1)
							def ports = v1.ports ?: ( v1.port ?: 'TBD')
							def protocol = v1.protocol ?: 'tcp'
//							println "out=$n1 from=$from to=$to $ip1 $ip2"
							x.outbound[n1] += [
								from: "$n@$from($ip1)",
								to: "$n2@$to($ip2) ${protocol}:$ports",
							]
							ip1.each { y1 ->
								def subnet1 = ip2subnet(y1,from)
								ip2.each { y2 ->
									def subnet2 = ip2subnet(y2,to)
									list += [[n,"in",n1,n,n2,from,to,y1,y2,subnet1,subnet2,protocol,ports]]
								}
							}
						}
					}
				}
			}
			def inn 
			if (n.startsWith('vm-')) {
				def vm = v.type['openstack-vm-type'] ?: [:]
//				println "n=$n vm=$vm"
				inn = vm['application-inbound-security-rules'] ?: [:]
			} 
			else {
				inn = v.type['application-inbound-security-rules'] ?: [:]
			}
//			println "n=$n in=$in"
			inn.each { n1, v1 ->
//				println "n1=$n1 v1=$v1"
				if (v1['only-local']) return
				x.inbound[n1] = []
				destination2deployment(n1,v1).each { n2 ->
					findEndpoints(n2,v1).each { from ->
						findEndpoints(n).each { to ->
							if (from == to) return
							if (both_local(from,to)) return
							def ip1 = findIps(n2,from,v1)
							def ip2 = findIps(n,to)
							def ports = v1.ports ?: [ ( v1.port ?: 'TBD') ]
							def protocol = v1.protocol ?: 'tcp'
	//						println "in=$n1 from=$from to=$to $ip1 $ip2"
							x.inbound[n1] += [
								from: "$n2@$from($ip1)",
								to:   "$n@$to($ip2) $protocol:$ports",
							]
							ip1.each { y1 ->
								def subnet1 = ip2subnet(y1,from)
								ip2.each { y2 ->
									def subnet2 = ip2subnet(y2,to)
									list += [[n,"out",n1,n2,n,from,to,y1,y2,subnet1,subnet2,protocol,ports]]
								}
							}
						}
					}
				}
			}
//			println p(x)
//			println p(res)
//			System.exit(3)
		}
		def res1 = [:]
		res.each  { n,v ->
			if (v.inbound.size()==0) v.inbound=null
			if (v.outbound.size()==0) v.outbound=null
			if (v.inbound == null && v.outbound ==null) return
			res1[n] = v
		}
		def m2 = [:]
		list.each { l ->
			def siteA = l[5]
			def siteB = l[6]
			def sA = l[9]
			def sB = l[10]
			def protocol = l[11]
			def ports = l[12]
			def k = "$siteA:$siteB:$sA:$sB:$protocol"
			if (m2[k] == null) {
				m2[k] = [
					siteA:siteA,
					siteB:siteB,
					subnetA:sA,
					subnetB:sB,
					protocol:protocol,
					ports : []
				]
			}
			ports.each { port ->
				if ( ! m2[k].ports.contains(port))
					m2[k].ports.add(port)
			}
		}
		def list2 = []
		m2.each { n, v ->
			list2 += [ [ v.siteA, v.siteB, v.subnetA, v.subnetB, v.protocol, v.ports.join(":") ]]
		}
		return [m:res1,list:list,m2:m2,list2:list2]
	}
	def site2subnet = [:]
	def ip2subnet(ip,site) {
		if (tenants[site]== null) return ip
		if (! IpUtils.isIpv4(ip) ) return ip
		def subnets = tenants[site].subnets ?: []
		def res = null
		subnets.each { subnet ->
			if (res != null) return
			String[] a = subnet.split("/")
			def ip2 = a[0]
			def len = a[1]
			if (! IpUtils.isIpv4(ip2) || ! len.isInteger()) {
				println "Bad subnet: $subnet at $site"
				System.exit(2)
			}
			if (IpUtils.containedIn(IpUtils.toInetAddress(ip),IpUtils.toInetAddress(ip2),len.toInteger())) res = subnet
		}
		if (res != null) return res
		if (site2subnet[site] == null) site2subnet[site] = [] as Set
		site2subnet[site] += "${IpUtils.mask(IpUtils.toInetAddress(ip),29)}/29".substring(1)
		return "$ip not in any $site subnets"
	}
	def both_local(from,to) {
		if (tenants[from] == null || tenants[from].type != "opendcae-local-ntc") return false
		if (tenants[to] == null || tenants[to].type != "opendcae-local-ntc") return false
		return true
	}
	
	def dns() {
		def cnames = [:]
		def arecords = [:]
		def gss = [:]
		def currentCnames = (env['dns'] ?: [:])['current-cnames'] ?: [:]
		def currentGss = (env['dns'] ?: [:])['current-gss'] ?: [:]
		def res = ['dns-arecords':arecords, 'dns-cnames':cnames, 'dns-gss':gss]
		deploymentType.each { n, v ->
			if (!n.startsWith('vm-')) return
			v.instances.each { n1, v1 ->
				v1.servers.each { n2, v2 ->
					(v2['dns-cnames'] ?: []).each { d -> 
						if (cnames[d] == null) cnames[d] = [value :"", values:[],status:dnsLookup(d)]
						cnames[d].values += v2['dns-name'] ?: "$n2 missing DNS"
						cnames[d].value = currentCnames[d] ?: cnames[d].values[0]
					}
					(v2['dns-gss'] ?: []).each { d -> 
						if (gss[d] == null) gss[d] = [value :"", values:[],status:dnsLookup(d,false)]
						gss[d].values += v2['dns-name'] ?: "$n2 missing DNS"
						gss[d].value = currentGss[d] ?: gss[d].values[0]
					}
					(v2['dns-arecords'] ?: []).each { d -> 
						if (arecords[d] == null) arecords[d] = [values:[],status:dnsLookup(d)]
						def dns = v2['dns-name'] ?: "$n2 missing DNS"
						def ip = ipAssignments[n2] ?: "TBD - ip-assignment.yaml@$n2"
						arecords[d].values += "$dns $ip"
					}
				}
			}
		}
		deploymentType.each { n, v ->
			if (!n.startsWith('vm-')) return
			(v.type['dns-gss'] ?: []).each { gssType ->
//				println "n=$n gssType=$gssType"
				switch (gssType) {
				case "gss": 
					def d = dnsName(n,null,'global')
				 	cnames[d] = [value:dnsName(n,null,'gss'),status:dnsLookup(d,false)]
					break;
				case "gss-edge":
					v.instances.each { n1, v1 ->
//						println "n=$n gssType=$gssType n1=$n1 v1=$v1"
						def v2 = tenants[n1]
						def d = dnsName(n,v2,'site')
						cnames[d] = [value:dnsName(n,v2,'gss-edge'),status:dnsLookup(d,false)]
					}
					break;
				}
			}
			(v.type['dns-cnames'] ?: []).each { cnameType ->
//				println "n=$n cnameType=$cnameType"
				switch (cnameType) {
				case "central-site": 
					def d = dnsName(n,null,'global')
					cnames[d] = [values:[],status:dnsLookup(d,false)]
					v.instances.each { n1, v1 ->
						def v2 = tenants[n1]
						if (v2.type != "opendcae-central") return
						def d1 = dnsName(n,v2,'site')
						if (cnames[d].value == null) cnames[d].value = d1
						cnames[d].values += d1
					}
//					println "n=$n cnameType=$cnameType ${p(cnames[d])}"
//					System.exit(3)
					break;
				}
			}
			(deploymentType[n].type['dns-service'] ?: [:]).each { n3, v3 ->
				switch (v3['cluster-type']) {
				case "gss" :
					def d = dnsName(n,null,'global',n3)
				 	cnames[d] = [value:dnsName(n,null,'gss',n3),status:dnsLookup(d)]
					break
				case "gss-edge" :
					v.instances.each { n1, v1 ->
						def v2 = tenants[n1]
						def d = dnsName(n,v2,'site',n3)
						cnames[d] = [value:dnsName(n,v2,'gss-edge',n3),status:dnsLookup(d)]
					}
//					println "n=$n n3=$n3 ${p(cnames)}"
//					System.exit(3)
					break
				}
			}
		}
		return res
	}
	
	def dnsLookup(n,boolean showDetails = true) {
		def x = "nslookup $n".execute().text
		List res = []
		if (x.contains("server can't find")) return "Not registered"
		def first = true
		x.split('\n').each { line ->
			if (line.startsWith("Address:")) {
				if (first) {
					first = false
					return
				}
				def ip = line.substring(9)
				res += "${ip2hostname(ip)} $ip"
			}
		}
		return showDetails ? res.sort() : "Registered"
	}	
	def ip2hostname(ip) {
		def res = null
		deploymentType.each { n, v ->
			if (!n.startsWith('vm-')) return
			v.instances.each { n1, v1 ->
				v1.servers.each { n2, v2 ->
					if (ip == v2.ip) res = n2
				}
			}
		}
		return res ?: "Unknown server"
	}
	def ssl() {
		def res = [:]
		deploymentType.each { n, v ->
			if (!n.startsWith('vm-')) return
			v.instances.each { n1, v1 ->
				v1.servers.each { n2, v2 ->
					res[n2] =  [ names: v2['dns-arecords']]
					res[n2].names +=  v2['dns-cnames']
					res[n2].names +=  v2['dns-gss']
					File f = new File("$root/$release-$envName/certificates/${n2}.pkcs12")
					if (!f.exists()) 
						res[n2].status =  "No certificate"
					else
						res[n2].status = passwords[n2] ? "Certificate Exists" : "No Password"
				}
			}
		}
		return res
	}

	def destination2deployment(n,extra) {
		if (extra['destination-entity-type']) {
			def res = []
			deploymentType.each { n1, v -> 
				if (n1.startsWith(extra['destination-entity-type'])) res += n1
			}
			return res
		}
		return [ extra['destination-entity'] ?: n ]
	}
	
	def findEndpoints(n, extra = [:]) {
		if (n == "vm-all") {
			return tenants.collect { n1, t -> n1 } 
		}
		n = extra['destination-entity'] ?: n
		if (deploymentType[n])
			return deploymentType[n].tenantNames
		// external entity
		return  [ n ]
	}
	def findIps(String n, String t, extra = [:]) {
		n = extra['destination-entity'] ?: n
		if (n == "vm-all") {
			def res = []
			deploymentType.each { n1, v1 ->
				if (! n1.startsWith("vm-")) return
				res += findIps(n1,t,extra)
			}
			return res
		}
		if (deploymentType[n] == null) {
			// external entity
			def v = ((env.networking ?: [:])['external-entities'] ?: [:])[n]
			if (v == null)  return ["TBD - env.yaml@networking.external-entities.$n" ]
			if (v.ips != null) return v.ips
			return v.collect {n1,v1 -> v1.ip}
		}
		def v = deploymentType[n].instances[t]
//		println "n=$n v=${p(deploymentType[n].instances[t])}"
		if (n.startsWith("vm-")) {
//			println "n=$n v=${p(v.servers)}"
			if (v==null) return []
			return v.servers.collect { n1,v1 -> v1.ip }
		}
//		println "n=$n v=${p(deploymentType.collect {n1,v1 -> n1})}"
//		println p(dockers)
		return findIps(v.hostService,v.hostServiceInstance)
	}
	def streams2bus() {
		def res = [:]
		def otherFeeds = [:]
		streams.streams.each { n, v ->
//			println "n=$n v=${object2json(v).toString(2)}"
			def streamNames = []
			def location = [:]
			def auth = [:]
			switch (v['databus-type']) {
				case "topic":
					streamNames += "topic:$n"
					auth["topic:$n"] = "aaf"
					break
				case "topic-public":
					streamNames += "topic:$n"
					auth["topic:$n"] = "none"
					break
				case "ecomp":
					streamNames += "ecomp:$n"
					break
				case "local":
					tenants.each { n1, v1 ->  streamNames += "local:$n:$n1" }
					break
				case "local-ecomp":
					streamNames += "ecomp:$n"
					tenants.each { n1, v1 ->  
						streamNames += "local:$n:$n1" 
						otherFeeds["local:$n:$n1"] = [ "ecomp:$n" ]
					}
					break
				default: println "Unknown databus type: ${v['databus-type']}"
			}
			streamNames.each { streamName ->
				switch (v['stream-type']) {
					case "data-router":
					    def stream = [
							'$class' : "org.openecomp.dcae.controller.core.stream.DatabusStreamFeed",
							publishers : [:], 
							subscribers : [:],
							feedDescription : v['description'],
							asprClassification : v['aspr-classification'],
						]
						if (v['databus-type'] == "local-ecomp") {
							stream.publishers['forward'] = [:]
						}
						res[streamName] = stream
						v.publishers.each { n1, v1 ->
							switch (v1['publisher-type'])	{
							default:
								if (streamName.startsWith("local")) {
									def loc = streamName.split(':')[2]
									def n2 = "$n1:$loc"
									stream.publishers[n2] = [ 
										localStreamId : v1['local-name'],
										dcaeLocationName: loc
									]
								}
								if (streamName.startsWith("ecomp")) {
									locationTypes['opendcae-central'].tenantNames.each { n3 ->
//										System.err.println "n1=$n1 n3=$n3 ${deploymentType[n1].instances[n3]}"
										if (deploymentType[n1].instances[n3] == null || deploymentType[n1].instances[n3].size() == 0) return
										def n2 = "$n1:$n3"
//										System.err.println "n2=$n2"
										stream.publishers[n2] = [ localStreamId : v1['local-name'] ]
									}
								}
							}
						}
						v.subscribers.each { n1, v1 ->
							switch (v1['subscriber-type'])	{
								case "external":
									if (streamName.startsWith("ecomp")) {
										def n2 = "external:$n1"
										stream.subscribers[n2] = [:]
										stream.subscribers[n2].deliveryURL = substitute(v1['subscriber-url'],[:],null,null)
										stream.subscribers[n2].username = substitute(v1['subscriber-user'],[:],null,null)
										stream.subscribers[n2].userpwd = substitute(v1['subscriber-password'],[:],null,null)
									}
									break
								default:
									if (streamName.startsWith("local")) {
										def loc = streamName.split(':')[2]
										def n2 = "$n1:${loc}"
										stream.subscribers[n2] = [ 
											dcaeLocationName : loc,
											localStreamId : v1['local-name'],
											deliveryURL : substitute(v1['subscriber-url'],[:],n2,loc)
										]
									}
							}
						}
						if (otherFeeds[streamName]) {
							// Add additional subscriber for forwarding to that feed
							otherFeeds[streamName].each { n3 ->
								def n2 = "forward:$n3"
								stream.subscribers[n2] = [
									otherFeedName : n3
								]
							}
						}
						break
					case "message-router":
						def stream = [
							'$class' : "org.openecomp.dcae.controller.core.stream.DatabusStreamTopic",
							clients : [:],
							topicDescription : v['description'],
							asprClassification : v['aspr-classification'],
							authenticationMethod : auth[streamName],
						]
						res[streamName] = stream
						tenants.each { loc, w1 ->
							v.publishers.each { n1, v1 ->
								def n2 = "$n1:${loc}"
								stream.clients[n2] = [ 
									localStreamId : v1['local-name'],
									clientRole : v1['role'],
									username : v1['user'] ? substitute(v1['user'],[:],n1,loc) : null,
									userpwd : v1['password'] ? substitute(v1['password'],[:],n1,loc) : null,
									action : ["pub","view"],
									dcaeLocationName: loc,
								]
							}
							v.subscribers.each { n1, v1 ->
								def n2 = "$n1:${loc}"
								stream.clients[n2] = [ 
									localStreamId : v1['local-name'],
									clientRole : v1['role'],
									username : v1['user'] ? substitute(v1['user'],[:],n1,loc) : null,
									userpwd : v1['password'] ? substitute(v1['password'],[:],n1,loc) : null,
									action : ["sub","view"],
									dcaeLocationName: loc,
								]
							}
						}
						break
				}
			}
		}
//		println "res=${object2json(res).toString(2)}"
		return res
	}
	def substitute(o, env1, s, i) {
		SimpleTemplateEngine engine = new SimpleTemplateEngine()
		String res = o
		env1.dcae = this
		env1.passwords = env.passwords
		init(s, i)
		switch  (o) {
			case List:
			  def l = []
			  o.each { e ->
				  l +=  substitute(e, env1, s, i)
			  }
			  return l
			case Map:
			  def m = [:]
			  o.each { n,v ->
				  m[n] =  substitute(v, env1, s, i)
			  }
			  return m
		}
		try {
			res = engine.createTemplate("$o").make(env1) 
			if (res.startsWith("_LIST_:") && res.endsWith(":_LIST_")) {
				res = res.replace("_LIST_:","").replace(":_LIST_","")
				JSONArray a = new JSONArray(res)
				return json2object(a)
			}
		} catch (e) {
			System.out.println "$o"
			System.err.println "ERROR $e"
			System.exit(2)
		}
		return res
	}
	
	def orchOld(format = null) {
		def res = [
			central : [
				postgresURL: "jdbc:postgresql://${serviceFqdn('vm-postgres-sql')}:5432/XXX",
				postgresUser: "YYYYY",
				postgresPassword: "\${env.passwords.postgres.XXX.YYYYY}",
				dmaapDcaeLocation: "????",
				dmaapMRHosts: allServersFqdn("vm-databus-mr-node")
			],
			locations:[:]
		]
		tenants.each { n, tenant ->
			res[n] = [
				locationType: tenant.type,
				dmaapDcaeLocation : n,
				dmaapMrService : dnsName("vm-databus-mr-node",tenant,"site"),
				aaiLocationName: tenant['aai-location-name'] ?: "TBD tenant.yaml#${n}.aai-location-name",
				clli: tenant['clli'] ?: "TBD tenant.yaml#${n}.clli",
			    docker_host_service : " ??? PLACEHOLDER_FOR_DOCKER_HOST_SERVICE_INSTANCE_THIS_EDGE",
			    docker_registry : "??? PLACEHOLDER_FOR_DOCKER_REGISTRY_HOST_PORT_THIS_EDGE",
			]
		}
		
		/*
		"locations" : {
			"central" : {
			  "postgresURL? : PLACEHOLDER_FOR_POSTGRES_URL,
			  ?postgresUser? : PLACEHOLDER_FOR_POSTGRES_USER,
			 ?postgresPassword?: PLACEHOLDER_FOR_POSTGRESS_PASSWORD,
			 ?dmaapDcaeLocation?: PLACEHOLDER_FOR_DMAAP_DCAE_LOCATION_CENTRAL,
			  ?dmaapMRHosts? : PLACEHOLDER_FOR_DMAAP_MR_HOSTS_CENTRAL
			},
			"PLACEHOLDER_FOR_CLLI_CODE_FOR_EDGE_LOCATION_1" : {
			  "cdap_cluster_service" : PLACEHOLDER_FOR_CDAP_CLUSTER_SERVICE_INSTANCE_THIS_EDGE,
			 ?docker_host_service? : PLACEHOLDER_FOR_DOCKER_HOST_SERVICE_INSTANCE_THIS_EDGE,
			  ?docker_registry? : PLACEHOLDER_FOR_DOCKER_REGISTRY_HOST_PORT_THIS_EDGE,
			  "dmaapDcaeLocation" : PLACEHOLDER_FOR_DMAAP_DCAE_LOCATION_THIS_EDGE,
			  ?dmaapMRHosts? : [ PLACEHOLDER_FOR_LIST_OF_MR_HOSTS_THIS_EDGE
			},
			"PLACEHOLDER_FOR_CLLI_CODE_FOR_EDGE_LOCATION_2" : {
			  Similar to above
			}
			/* Repeat for all edge locations in the environment
			 * Could use a looping construct if your template language has one
			  */
		switch (format) {
			case "base64" : return "'" + object2json(res).toString(2).bytes.encodeBase64(true) + "'"
			default: return res
		}
	}
	
	def orch(format = null) {
		def postgres = release == "1607" ? 'vm-postgres-sql' : 'vm-postgresql-central'
		def res = [
			central : [
				postgresHost: "${serviceFqdn(postgres)}",
				postgresDTIPassword: "${password('postgres.dti.viewer')}"
			]
		]
		tenants.each { n, tenant ->
			res[tenant['aai-location-name'] ?: "TBD - tenants.yaml@${n}.aai-location-name"] = [
				aaiLocationName:tenant['aai-location-name'],
				locationType: tenant.type,
				dcaeLocationName : n,
				dmaapMrService : dnsName("vm-databus-mr-node",tenant,"site"),
				dockerHost1: serversFqdn("vm-docker-host-1", n)[0],
				dockerHost2: serversFqdn("vm-docker-host-2", n)[0],
				dockerHost3: serversFqdn("vm-docker-host-3", n)[0],
			]
		}

		switch (format) {
			case "base64" : return "'${object2json(res).toString(2).bytes.encodeBase64(true)}'".replace('\n','\n\n')
			case "json" : return object2json(res).toString(2)
			default: return res
		}
	}


	def controllerCluster() {
		def res = [servers:[:]]
		def ee = (env['vm-templates'] ?: [:])['vm-controller'] ?: [:]
		def roles = ee['server-roles'] ?: [:]
		deploymentType['vm-controller'].instances.each { n, v ->
			v.servers.each { n1, v1 ->
				
				println "$n1 ${roles[n1] ?: 'UNKNOWN'}"
				res.servers[n1] = [
					role : roles[n1] ?: 'UNKNOWN',
					data : [
						state :[:]
					]
				]
			}
		}
		return res
	}
	def chefTopo() {
		def topo = "$release-$envName"
		def chef = [
			id: topo,
			name: topo,
			chef_environment: "_default",
			tags: [],
			strategy: "via_cookbook",
			strategy_data: [ cookbook: topo, filename: "topology"],
			nodes : []
		]
		deploymentType.each { n, v ->
			if (! n.startsWith("vm-")) return
			println "$n"
			v.instances.each { n1, v1 ->
				v1.servers.each { n2, v2 ->
//					println "$n $n1 $n2 $v2"
					chef.nodes += [ 
						name : v2['dns-name'], 
						tags : [],
						chef_environment: "_default",
						run_list: [ "recipe[$release]","recipe[dcae-nagios]" ],
						normal: [ tags: [] ] 
					]
				}
			}
		}
		return chef
	}
	
	def flavor(n,t) {
		def tt = tenants[t]
		if (tt == null) return "NONE $n $t"
		def v = deploymentType[n]
		if (!aEnv()) 
			return v['vm-type'].replace('vm-','dcae-')
		def vmType = v.type['openstack-vm-type'] ?: [:]
		def e = (env['vm-templates'] ?: [:])[v['vm-type']] ?:[:]
		def d = e['openstack-flavor-name'] ?  e['openstack-flavor-name'] : vmType['openstack-flavor-name']
		switch (d) {
			case String: return d
			case Map: return d[tt['type']]
		}
	}
	
	def showFlavors() {
		def res = [:]
		deploymentType.each { n, v ->
			if (!n.startsWith('vm')) return
			res[n] = [:]
			v.instances.each { n1, v1 -> 
				res[n][n1] = flavor(n,n1)
			}
		}
		return res
	}
	def list(x) {
		return "_LIST_:${object2json(x)}:_LIST_"
	}
	
	static main(args) {

	}
}
