
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



// http://docs.groovy-lang.org/latest/html/gapi/groovy/util/CliBuilder.html
def cli = new CliBuilder(usage:'dcae-controller.sh reports OPTIONS')
cli.n(longOpt:'name', 	args:1, 'Report Name')
cli._(longOpt:'debug', 	args:0, 'Debug')
cli._(longOpt:'controllerEndpoint',             args:1, 'Name of controller endpoint (optional)')

def options = cli.parse(args)
server = new DcaeDcaePlatformControllerConsole("console.properties",options.controllerEndpoint ? options.controllerEndpoint : "localhost")

if (options == null || ! options.name ) {
	cli.usage()
	System.exit(1)
} 

def table = server.operation("/gui","getTable", [path:"$options.name",start:"-24hour",end:"now"])


def convert(table) {
//	println table.rows.get(0)
	def res = [header:[],rows:[]]
	table.columns.each { col ->
		res.header += col.colName
	}
	table.rows.each { row ->
		def r = []
		row.cells.each { cell -> 
			r += cell.value
		}
		res.rows += [ r ]
	}
	return res
}

println Utils.pTable(convert(table.returns),"txt",System.out)

