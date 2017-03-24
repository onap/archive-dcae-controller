
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
	
import org.yaml.snakeyaml.Yaml;

import org.openecomp.ncomp.utils.CryptoUtils;
import org.openecomp.ncomp.utils.StringUtil;

import groovy.text.SimpleTemplateEngine
import groovy.io.FileType

import org.openecomp.ncomp.webservice.utils.FileUtils
import static org.openecomp.ncomp.sirius.manager.console.Utils.*;


def cli = new CliBuilder(usage:'dcae-controller.sh rackspace-substitute OPTIONS')
cli.a(longOpt:'from', 	args:1, 'Source Directory')
cli.b(longOpt:'to', 	args:1, 'Destination Directory')
cli.f(longOpt:'file', 	args:1, 'Substitution YAML File')

def options = cli.parse(args)

def fromDir = new File(options.from)
def toDir = new File(options.to)

if (toDir.exists())
	FileUtils.deleteDirectory(toDir)
	
def f = new File(options.file)
Yaml yaml = new Yaml();
def m = yaml.load(f.text)

if (m['POLICY-IP'] == null) m['POLICY-IP'] = "10.0.6.1"

def i = m["DCAE-VERSION"].lastIndexOf(".")

if (m['DCAE-VERSION'].contains("SNAPSHOT")) {
	m['DOCKER-VERSION'] = "${m["DCAE-VERSION"].substring(0,i)}-SNAPSHOT-latest"
}
else {
	m['DOCKER-VERSION'] = "${m["DCAE-VERSION"].substring(0,i)}-STAGING-latest"
}

println "m['DOCKER-VERSION'] = ${m['DOCKER-VERSION']}"

fromDir.eachFileRecurse (FileType.FILES) { file ->
	def ofile = new File(file.toString().replace(options.from, options.to))
	switch (file.name) {
	  default:
	   ofile.parentFile.mkdirs()
	   ofile.text =  StringUtil.expandUsingJson(file.text, object2json(m), "@")
	}
}
