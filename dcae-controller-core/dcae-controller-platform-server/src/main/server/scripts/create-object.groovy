
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
def cli = new CliBuilder(usage:'dcae-controller.sh create-object OPTIONS')
cli.p(longOpt:'path', args:1, argName:'path', 'Resource Path')
cli.f(longOpt:'file', args:1, argName:'configFile', 'JSON configuration File (optional)')
cli.C(longOpt:'className', args:1, argName:'className', 'Class Name')

def options = cli.parse(args)

if (options == null || ! options.path || ! options.file ) {
		cli.usage()
		System.exit(1)
} 

File f = new File(options.file)
if (!f.exists()) {
	println "Configuration File does not exists: $f.absolutePath"
	System.exit(1)
}
o = Utils.json2object(new JSONObject(f.text))


if ( options.className ) o['$class'] = options.className

server.create(options.path, o)

