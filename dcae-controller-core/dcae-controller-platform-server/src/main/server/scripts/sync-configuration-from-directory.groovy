
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

server = new DcaeDcaePlatformControllerConsole("console.properties","localhost")

// http://docs.groovy-lang.org/latest/html/gapi/groovy/util/CliBuilder.html
def cli = new CliBuilder(usage:'dcae-controller.sh deploy-descriptor OPTIONS')
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

def o = m.load(options.directory)
o = Utils.json2object(Utils.object2json(o))
o.services = null

if (o.openstack != null && o.openstack.locations != null) {
  o.openstack.locations.each { locN, loc -> 
    loc.projects.each { projectN, project -> 
       project.each { n2, v2 ->
         switch (n2) {
           case "privateNetwork" : 
           case "region" : 
		   case "publicNetwork" :
		   case "adminUser" :
		   case "apiKey" :
           case "tenantId" : break
           default: project[n2] = null
         }
      }
    }
  }
}

if (options.force) { o['$forcedUpdate'] = 1 }
if (options.debug) { println Utils.object2json(o).toString(2) }


// currently references are not handled correctly in SOMF to new objects. So doing it twice fixes that.
// first time we do not need to persist the changes on the controller
o['$nosave'] = 1
server.update("/",o)
o['$nosave'] = null
server.update("/",o)

