
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
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.webservice.utils.JsonUtils

server = new DcaeDcaePlatformControllerConsole("console.properties","localhost")

// http://docs.groovy-lang.org/latest/html/gapi/groovy/util/CliBuilder.html
def cli = new CliBuilder(usage:'dcae-controller.sh sync-services-from-directory OPTIONS')
cli.d(longOpt:'directory', 	args:1, 'Configuration Directory')
cli._(longOpt:'force', 	 	args:0, 'Force update')
cli._(longOpt:'debug', 	 	args:0, 'Debug')

def options = cli.parse(args)

if (options == null || ! options.directory ) {
	cli.usage()
	System.exit(1)
} 

m = new ManagementServer()
m.eFactory = org.openecomp.dcae.controller.platform.controller.ControllerFactory.eINSTANCE
m.eClassName = "DcaePlatformController"
org.openecomp.dcae.controller.platform.controller.ControllerPackage.eINSTANCE
org.openecomp.dcae.controller.service.vm.VmPackage.eINSTANCE
m.addFactory(org.openecomp.dcae.controller.service.vm.VmFactory.eINSTANCE)
m.addRuntimeFactories(null)

try {
	def o = m.load(options.directory)
	o = Utils.json2object(Utils.object2json(o))
	if (options.debug) { println Utils.object2json(o).toString(2) }
}
catch (e) {
	println "load error: $e"
}

def rootFile = new File("$options.directory/services")


def services = server.list("/services").services

rootFile.listFiles().each { File f ->
//	println "$f"
  String sname = f.name
  if (sname.endsWith(".json")) return
  println "service $sname" 
  if (! services.contains(sname)) {
    println "No such service: $sname"
    return
  }
  def instances = server.list("/services/$sname/instances").instances
  def dir = new File("$options.directory/services/$sname/instances")
  dir.listFiles().each { File f1 ->
	def iname = f1.name.replace(".json", "")
	JSONObject instance = JsonUtils.file2json("$options.directory/services/$sname/instances/${iname}.json")
//	println "json ${instance.toString(2)}"
	instance.put('$nosave',1);
//	instance.put('$useNull',1);
	try {
		if (instances.contains(iname)) {
	      server.update("/services/$sname/instances/$iname",instance)
	      println "updating instance $sname@$iname" 
	    } else {
	      server.create("/services/$sname/instances/$iname",instance)
	      println "creating instance $sname@$iname" 
	    }
	}
	catch (e) {
		println "error instance $sname@$iname: $e"
	}
  }
}

server.update("/",[:])


