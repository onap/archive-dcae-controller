
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

server = new DcaeDcaePlatformControllerConsole("console.properties","localhost")

def p(x) { Utils.object2json(x).toString(2) }

 
// http://docs.groovy-lang.org/latest/html/gapi/groovy/util/CliBuilder.html
def cli = new CliBuilder(usage:'dcae-controller.sh add-openstack-location OPTIONS')
cli.n(longOpt:'location', 	args:1, 'Name of location')
cli.k(longOpt:'keystoneURL', 	args:1, 'Keystone URL')
cli.b(longOpt:'bypassIp', 	args:1, 'Bypass Ip')
cli.v(longOpt:'version', 	args:1, 'Openstack version')

def options = cli.parse(args)

if (options == null || ! options.location || ! options.keystoneURL || ! options.bypassIp ) {
		cli.usage()
		System.exit(0)
} 

server.create("/openstack/locations/$options.location", [keystoneUrl:options.keystoneURL, bypassIp:options.bypassIp, version : options.version])
