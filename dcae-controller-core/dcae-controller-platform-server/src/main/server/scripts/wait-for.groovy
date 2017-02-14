
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


import groovy.text.SimpleTemplateEngine
import groovy.io.FileType
import static org.openecomp.ncomp.sirius.manager.console.Utils.*;

import org.openecomp.dcae.controller.platform.servers.controller.DcaeDcaePlatformControllerConsole

server = new DcaeDcaePlatformControllerConsole("console.properties","localhost")

def cli = new CliBuilder(usage:'dcae-controller.sh wait-for OPTIONS')
cli.p(longOpt:'path', 	    args:1, 'Resource Path')
cli.e(longOpt:'exists',     args:0, 'Object Exists')
cli.a(longOpt:'attribute',  args:1, 'Attribute')
cli.m(longOpt:'match', 	    args:1, 'Match')
cli.n(longOpt:'isNull',     args:0, 'Is Null')
cli.N(longOpt:'isNotNull',  args:0, 'Is not Null')
cli.f(longOpt:'frequency',  args:1, 'Polling Frequency (seconds)')
cli.t(longOpt:'timeout',    args:1, 'Timeout (seconds)')
cli._(longOpt:'debug', 	    args:0, 'Debug')
cli.v(longOpt:'verbose',    args:0, 'Verbose')

def options = cli.parse(args)

if (args.length == 0 ) {
	cli.usage()
	System.exit(1)
} 


def timeout = options.timeout ? Long.parseLong(options.timeout) * 1000 : 300000 // default 5 min
def frequency = options.frequency ? Long.parseLong(options.frequency) * 1000 : 30000 // default 30 seconds
def path = options.path ? options.path : "/" // default 30 seconds

Date start = new Date()

def status = "UNKNOWN"
while (new Date().time < start.time + timeout) {
	def o = null
	try { o = server.list(path,0) } catch (e) {
		if (options.debug) println "LISTING error: $e"
        }
	if (options.debug) {
		if (o) 
			println "object is ${object2json(o).toString(2)}"
		else
			println "object is NULL"
	}
	if ( ! options.exists &&  o == null) {
		println "Error: caller expect the object to exists but it does not: $path"
		System.exit(2)
	}
	if (options.exists &&  o == null) {
		// need to keep waiting
		status = "Object does not exists: $path"
	}
	else {
		if ( ! options.attribute ) System.exit(0)
		def a = options.attribute
		def v = o[a]
		if (options.isNull) {
			if (v == null) System.exit(0) else status = "Attribute not null: $path@$a"
		} 
		if (options.isNotNull) {
			if (v != null) System.exit(0) else status = "Attribute null: $path@$a"
		}
		if (options.match) {
			if ("$v" == options.match) System.exit(0) else status = "Attribute match: $path@$a '$v' != '$options.match'"
		}
	}
        if (options.verbose)
        	println "Waiting: $status : waited ${new Date().time-start.time} milliseconds"
	Thread.sleep(frequency)
}

println "Error: Timeout: $status : waited ${new Date().time-start.time} milliseconds"
System.exit(2)


