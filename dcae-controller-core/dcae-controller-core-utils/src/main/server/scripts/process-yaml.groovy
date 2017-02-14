
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
import groovy.text.SimpleTemplateEngine

def cli = new CliBuilder(usage:'process-yaml.sh reports OPTIONS')
cli.f(longOpt:'file', 	args:1, 'Yaml File')
cli.d(longOpt:'dir', 	args:1, 'Destination Directory')

def options = cli.parse(args) 

def f = new File(options.file)
def dir = options.dir

Yaml yaml = new Yaml();

def c = yaml.load(f.text)
println "Reading $f"

def files = c['configuration-files'] ?: [:]

class VmSubstitute {
	def pw = new File("/opt/app/dcae-certificate/.password").text.trim()
	def decrypt(String s) {
//		println "pw='$pw' s='$s'"
		return CryptoUtils.decrypt(pw,s)
	}
}


SimpleTemplateEngine engine = new SimpleTemplateEngine()
def vm = new VmSubstitute()
def env = [ vm : vm, certPassword : vm.pw  ]

files.each { k, m-> 
	if (m['encrypted-password']) return
	def content = m.content
	File f1 = new File(m.destination)
	File f2 = new File("$dir/$f1.name")
	if (f2.exists()) f2.delete()
	f2.parentFile.mkdirs()
	println "Updating $f2"
	switch (m['encoding']) {
	case "base64": 
		f2 << content.decodeBase64(); 
		return
	}
	content = content.toString().replaceAll('\\$','DOLLAR_XXbXaX').replaceAll('%\\{','\\${')
	f2 << "${engine.createTemplate(content).make(env)}".replaceAll('DOLLAR_XXbXaX','\\$')
}




