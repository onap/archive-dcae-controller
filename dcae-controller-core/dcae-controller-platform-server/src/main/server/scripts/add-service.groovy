
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
def cli = new CliBuilder(usage:'dcae-controller.sh add-service OPTIONS')
cli.s(longOpt:'service', 	args:1, 'Name of Service')
cli.c(longOpt:'config', 	args:1, 'JSON configuration (optional)')
cli.f(longOpt:'configFile', 	args:1, 'JSON configuration File (optional)')
cli.C(longOpt:'className', 	args:1, 'Service Class')

def options = cli.parse(args)

if (options == null || ! options.service || ! options.className  ) {
		cli.usage()
		System.exit(1)
} 

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


o['$class'] = options.className

server.create("/services/$options.service", o)

