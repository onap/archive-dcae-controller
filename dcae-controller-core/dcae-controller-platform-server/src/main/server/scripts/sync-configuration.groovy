
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

// http://docs.groovy-lang.org/latest/html/gapi/groovy/util/CliBuilder.html
def cli = new CliBuilder(usage:'dcae-controller.sh sync-configuration OPTIONS')
cli.e(longOpt:'environment', args:1, 'Configuration Directory')
cli._(longOpt:'force', 	 	 args:0, 'Force update')
cli._(longOpt:'debug', 	 	 args:0, 'Debug')

def options = cli.parse(args)

if (options == null || ! options.environment ) {
	cli.usage()
	System.exit(1)
} 

def dir = "GITLINK/$options.environment/controller-gen"

def f = new File(dir)

if (!f.exists()) {
	println "Configuration directory does not exists: $dir"
	System.exit(1) 
}

Utils.runCmd("bin/dcae-controller.sh sync-install $options.environment $dir", 60000)

Utils.runCmd("bin/dcae-controller.sh start", 60000)

Utils.runCmd("bin/dcae-controller.sh sync-configuration-from-directory --directory $dir/resources", 600000)

Utils.runCmd("bin/dcae-controller.sh deploy-undeployed-descriptors", 6000000)

Utils.runCmd("bin/dcae-controller.sh sync-services-from-directory --directory $dir/services-resources", 600000)
	
