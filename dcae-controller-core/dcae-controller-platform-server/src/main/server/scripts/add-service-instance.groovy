
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
	


import org.openecomp.dcae.controller.platform.servers.controller.DcaeDcaePlatformControllerConsole
import org.openecomp.ncomp.sirius.manager.console.Utils
import org.json.JSONObject


def p(x) { Utils.object2json(x).toString(2) }


// http://docs.groovy-lang.org/latest/html/gapi/groovy/util/CliBuilder.html
def cli = new CliBuilder(usage:'dcae-controller.sh add-service-instance OPTIONS')
cli.i(longOpt:'instance', 	args:1, 'Name of Service Instance')
cli.s(longOpt:'service', 	args:1, 'Name of Service (optional but then descriptor)')
cli.c(longOpt:'config', 	args:1, 'JSON configuration (optional)')
cli.f(longOpt:'configFile', 	args:1, 'JSON configuration File (optional)')
cli.C(longOpt:'className',	args:1, 'Service Class (optional)')
cli.d(longOpt:'descriptor',	args:1, 'Descriptor (optional)')
cli._(longOpt:'debug',	        args:0, 'Debug')
cli._(longOpt:'controllerEndpoint',	        args:1, 'Name of controller endpoint (optional)')

def options = cli.parse(args)

if (options == null || ! options.instance || ( ! options.service && ! options.descriptor )  ) {
		cli.usage()
		System.exit(1)
} 

server = new DcaeDcaePlatformControllerConsole("console.properties",options.controllerEndpoint ? options.controllerEndpoint : "localhost")
def service = options.descriptor ? options.descriptor : options.service


if (options.config && options.configFile) {
	println "only one of --config and --configFile can be specified."
	System.exit(1)
}

def o = [:]

if (options.config) {
	o = Utils.json2object(new JSONObject(options.config))
}

if (options.configFile) {
	File f = new File(options.configFile)
	if (!f.exists()) {
		println "Configuration File does not exists: $f.absolutePath"
		System.exit(1)
	}
	o = Utils.json2object(new JSONObject(f.text))
}


if (options.className) o['$class'] = options.className

if (options.descriptor) {
  def d = server.list("/descriptors/$options.descriptor",100)
  o['$class'] = "${d.servicePackage}.${d.serviceInstanceClass}"
  if (d.vmType != null) o.vmType = [ '$ref' : "/openstack/vmTypes/$d.vmType" ]
  if (d.managerPortNumber != null) o.managerPortNumber = d.managerPortNumber
}

if (options.debug) {
  println o
}

server.create("/services/$service/instances/$options.instance", o)
// needed to persist. 
server.update("/",[:])

