
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
import org.openecomp.ncomp.sirius.manager.JavaHttpClient;


server = new DcaeDcaePlatformControllerConsole("console.properties","localhost")

def p(x) { Utils.object2json(x).toString(2) }


// http://docs.groovy-lang.org/latest/html/gapi/groovy/util/CliBuilder.html
def cli = new CliBuilder(usage:'dcae-controller.sh setup-openstack-bash-shell OPTIONS')
cli.l(longOpt:'location', 	args:1, 'Openstack Location')
cli.p(longOpt:'project', 	args:1, 'Openstack Project')

def options = cli.parse(args)

if (options == null || ! options.location || ! options.project ) {
	cli.usage()
	System.exit(1)
}

def x = server.list("/openstack/locations/$options.location", 1000)
def p = x.projects[options.project]

if (p == null) {
  println "no project $options.project exists at location $options.location"
  System.exit(1)
}

def prop = org.openecomp.ncomp.utils.PropertyUtil.getPropertiesFromClasspath("openstack.properties")

def pw = prop.getProperty("${options.location}.password.$p.adminUser")
if (pw == null) {
  println "Unable to find property ${options.location}.password.$p.adminUser in openstack.properties"
  System.exit(1)
}

def f = new File(".openstack.${options.location}.${options.project}")
if (f.exists()) f.delete()

f <<  "export OS_AUTH_URL=$x.keystoneUrl\n"
f <<  "export OS_TENANT_ID=$p.tenantId\n"
f <<  "export OS_TENANT_NAME=$options.location\n"
f <<  "export OS_PROJECT_NAME=$options.location\n"
f <<  "export OS_USERNAME=$p.adminUser\n"
f <<  "export OS_PASSWORD=${JavaHttpClient.decryptPassword(pw)}\n"
if (p.region != null) f <<  "export OS_REGION_NAME=$p.region\n"

println "Wrote . $f"

