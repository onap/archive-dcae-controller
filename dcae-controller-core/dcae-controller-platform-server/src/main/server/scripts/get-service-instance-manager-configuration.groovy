
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
def cli = new CliBuilder(usage:'dcae-controller.sh get-service-instance-configuration OPTIONS')
cli.i(longOpt:'instance', 	args:1, 'Name of Service Instance')
cli.s(longOpt:'service', 	args:1, 'Name of Service')
cli._(longOpt:'controllerEndpoint',	        args:1, 'Name of controller endpoint (optional)')

def options = cli.parse(args)

if (options == null || ! options.instance || ! options.service  ) {
		cli.usage()
		System.exit(1)
} 

server = new DcaeDcaePlatformControllerConsole("console.properties",options.controllerEndpoint ? options.controllerEndpoint : "localhost")
def o = [ instanceName : options.instance ]
println Utils.object2json(server.operation("/services/$options.service", "managerConfiguration", o)).toString(2)

