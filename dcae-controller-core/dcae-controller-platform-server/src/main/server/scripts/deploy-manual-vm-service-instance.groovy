
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

def p(x) { Utils.object2json(x).toString(2) }


// http://docs.groovy-lang.org/latest/html/gapi/groovy/util/CliBuilder.html
def cli = new CliBuilder(usage:'dcae-controller.sh deploy-service-instance OPTIONS')
cli.i(longOpt:'instance', 	args:1, 'Name of Service Instance')
cli.s(longOpt:'service', 	args:1, 'Name of Service')
cli._(longOpt:'publicIp', 	args:1, 'Public IP')
cli._(longOpt:'privateIp', 	args:1, 'Private IP')
cli._(longOpt:'port', 		args:1, 'Port Number')

def options = cli.parse(args)

if (options == null || ! options.service || ! options.instance ) {
	cli.usage()
	System.exit(1)
} 

def o = [
  '$class':"org.openecomp.dcae.controller.service.vm.PhysicalMachine",
]

if (options.publicIp) o.publicIp = options.publicIp
if (options.privateIp) o.privateIp = options.privateIp
if (options.port) o.managerPortNumber = options.port

def n ="manual:$options.service:$options.instance:0"

server.create("/services/$options.service/instances/$options.instance/servers/$n", o) 
