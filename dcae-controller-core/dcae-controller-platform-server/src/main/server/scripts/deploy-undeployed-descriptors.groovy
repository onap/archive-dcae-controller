
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
def cli = new CliBuilder(usage:'dcae-controller.sh deploy-undeployed-descriptors OPTIONS')

def options = cli.parse(args)

if (options == null ) {
  	println "Bad Usage:"
	cli.usage()
	System.exit(1)
} 

l1 = server.list("/descriptors").descriptors
l2 = server.list("/services").services

println "descriptors: $l1"
println "services: $l2"

(l1 - l2).each { n ->
  d = server.list("/descriptors/$n")
  switch (d['$class']) {
    case null: break
    default: 
      println "Deploying undeployed descriptor $n"
      Utils.runCmd("bin/dcae-controller.sh deploy-descriptor --name $n", 100000)
      l3 = server.list("/",0).services
      if (l3.contains(n))
      	println "Done: services: ${server.list("/services").services}"
      else
      	System.err.println "Failed to deploy $n: services: ${server.list("/services").services}"
  }
}

