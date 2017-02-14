
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
	
import org.openecomp.ncomp.utils.CryptoUtils
import java.security.SecureRandom;
import java.math.BigInteger;
import org.json.JSONObject;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import static org.openecomp.ncomp.sirius.manager.console.Utils.*;

class X {
static def object2yaml(Object object) {
  DumperOptions options = new DumperOptions();
  options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
  options.setSplitLines(true);
  options.setWidth(100000);
  Yaml y = new Yaml(options);
  JSONObject json = (JSONObject) object2json(object);
  def data = y.load(json.toString());
  return y.dump(data);
}
}


// http://docs.groovy-lang.org/latest/html/gapi/groovy/util/CliBuilder.html
def cli = new CliBuilder(usage:'dcae-controller.sh encrypt-file OPTIONS')
cli.k(longOpt:'key', 	args:1, 'Public Key File')
cli.f(longOpt:'file', 	args:1, 'File')

def options = cli.parse(args)

if (options == null || ! options.key || ! options.file ) {
		cli.usage()
		System.exit(1)
}

def password = new BigInteger(130, new SecureRandom()).toString(32);

println password

str = CryptoUtils.encrypt(password,new File(options.file).text).replace("\r","");

str1 = CryptoUtils.encryptPublic(CryptoUtils.getKey(options.key),password).replace("\r","");

println X.object2yaml(['encrypted-file': [ content:str, 'encrypted-password' : str1 ]])
