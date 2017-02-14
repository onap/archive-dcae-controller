
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
	
import org.openecomp.dcae.controller.service.cdap.cluster.servers.manager.DcaeCdapClusterManagerConsole
import org.openecomp.ncomp.sirius.manager.console.Utils

manager = new DcaeCdapClusterManagerConsole("cdap-service-test.properties","localhost")

def p(x) { Utils.object2json(x).toString(2) }

def m = manager

// Begin Standard Configuration
try {
  m.create("/cluster", [baseUrl:"http://localhost:10000/v3"])
} catch (Exception e) {
  println e.getMessage()
}

def ns = "ca55"
def appId = "WebAnalytics"
def flowId = "WebAnalyticsFlow"

// Files are on the target machine at /opt/dcae-artifact-cache
def jarfile = "/opt/app-data-cache/WebAnalytics-3.3.0.jar"
def ver = "3.3.0"

m.createNamespace(ns)
m.deployApp(ns, jarfile) // may be rename it to deployApp?

// we need a createApp command -- artifact + config
// m.loadArtifact(ns, "", jarfile) // for now, always use the null or blank space for the name
// there is a m.createApp() missing

m.startFlow(ns, appId, flowId, null)

//we have sendEvent but not loadEvents!

//m.stopFlow(ns, appId, flowId)

//m.deleteApp(ns, appId)

// there is a m.deleteArtifact() missing

// one code issue is tab-indentation? Should we convert to spaces, or keep as tabs?

// we need some additional items!
