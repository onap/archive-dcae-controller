
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

server = new DcaeDcaePlatformControllerConsole("console.properties","localhost")

// http://docs.groovy-lang.org/latest/html/gapi/groovy/util/CliBuilder.html
def cli = new CliBuilder(usage:'dcae-controller.sh deploy-descriptor OPTIONS')
cli.n(longOpt:'name', 	args:1, 'Descriptor Name')
cli._(longOpt:'debug', 	args:0, 'Debug')

def options = cli.parse(args)

if (options == null || ! options.name ) {
	cli.usage()
	System.exit(1)
} 

def d = server.list("/descriptors/$options.name",100)

if (options.debug) {
	println Utils.p(d)
}

/*
if (d.artifact != null) {
Utils.runCmd("bin/dcae-controller.sh add-service-artifact org.openecomp.dcae.controller $d.artifact-model 0.1.0-SNAPSHOT",5000)

switch (d.artifact) {
case "dcae-controller-service-cdap":
  Utils.runCmd("bin/dcae-controller.sh add-service-artifact org.openecomp.dcae.controller $d.artifact-adaptor 0.1.0-SNAPSHOT", 5000) ; break
default:
  Utils.runCmd("bin/dcae-controller.sh add-service-artifact org.openecomp.dcae.controller $d.artifact-manager 0.1.0-SNAPSHOT", 5000)
}

switch (d['$class']) {
  case "org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor": 
    if (d.encryptedPassword == null || ! d.encryptedPassword.startsWith("rsa:") ) {
      System.err.println "Bad Password: $d.encryptedPassword" 
      System.exit(2)
    }
    def p = d.encryptedPassword.replace(" ","%")
    Utils.runCmd("bin/dcae-controller.sh add-manager ${d.servicePackage}.${d.serviceInstanceClass} $d.managerUser $p",5000)
}


Utils.runCmd("bin/dcae-controller.sh stop", 20000) 
Utils.runCmd("bin/dcae-controller.sh start", 30000) 

Utils.runCmd("sleep 25",60000) 
}
*/ 

def o = [:]
o['$class'] = "${d.servicePackage}.${d.serviceClass}"
if (d.managerPortNumber != null) o.managerPortNumber = d.managerPortNumber

// creating service
server.create("/services/$options.name", o)
