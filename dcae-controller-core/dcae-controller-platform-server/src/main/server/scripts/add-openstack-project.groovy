
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
def cli = new CliBuilder(usage:'dcae-controller.sh add-openstack-project OPTIONS')
cli.o(longOpt:'location', 	args:1, 'Name of Openstack location')
cli.n(longOpt:'project', 	args:1, 'Name of project')
cli.t(longOpt:'tenantId', 	args:1, 'Tenant Id')
cli.u(longOpt:'user', 		args:1, 'User Id for this Tenant')

def options = cli.parse(args)

if (options == null || ! options.project || ! options.tenantId || ! options.user || ! options.location ) {
		cli.usage()
		System.exit(0)
} 

server.create("/openstack/locations/$options.location/projects/$options.project", [tenantId:options.tenantId, adminUser:options.user])
server.update("/openstack/locations/$options.location/projects/$options.project", [:])

