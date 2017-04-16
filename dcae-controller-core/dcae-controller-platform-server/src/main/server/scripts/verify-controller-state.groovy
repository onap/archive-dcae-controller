
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
import org.openecomp.ncomp.utils.CryptoUtils
import org.yaml.snakeyaml.Yaml
import groovy.io.FileType
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openecomp.ncomp.sirius.manager.JavaHttpClient;

import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.cert.CertificateException;
import javax.crypto.SecretKey;
import javax.security.auth.callback.*;
import javax.net.ssl.*



def p(x) {
	Utils.object2json(x).toString(2)
}


// http://docs.groovy-lang.org/latest/html/gapi/groovy/util/CliBuilder.html
def cli = new CliBuilder(usage:'dcae-controller.sh verify-controller-state OPTIONS')
cli._(longOpt:'debug', args:0, 'Debug')
cli.v(longOpt:'verbose', args:0, 'Verbose output')
cli.t(longOpt:'type', args:1, 'Type of verification rsa, certs, config, all')

def options = cli.parse(args)

if (options == null || ! options.type ) {
	cli.usage()
	System.exit(1)
}


class A {
        static def verbose
	static def server = new DcaeDcaePlatformControllerConsole("console.properties","localhost")
	static def k = CryptoUtils.getKey("config/server.private")
	static def checkRsa ( o = server.list("/",1000)  , path = "") {
		//println "o=$o path=$path"
		switch (o) {
			case Map: 
				o.each { n , v -> 
 					checkRsa(v,"$path/$n") 
					if (v instanceof String && !v.startsWith("rsa:")) {
						switch ("$path/${n.toLowerCase()}") {
						case ~/\/openstack\/.*\/metadata\/X\/key/:
						case ~/\/users\/.*\/publickey/: break
						case ~/.*password.*/:
						case ~/.*pwd.*/:
						case ~/.*cred.*/:
						case ~/.*secret.*/:
						case ~/.*key/:
						   println "unencrypted password path=$path/$n ${verbose ? v : ''}"
						}
				        } 
				} 
				break
			case List: o.each { v -> checkRsa(v,"$path/X") }; break
			case String:
				// println "path=$path o=$o"
				if (o.startsWith("rsa:")) {
					try {  CryptoUtils.decryptPrivate(k,o.substring(4)) } catch (e) {
						println "bad encryption path=$path"
					}
				}
				break
		}
	}
	static def file2object(path) {
		Yaml yaml = new Yaml();
		String s = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
		return yaml.load(s);
	}
	static def recurseFiles(File dir) {
		def l = []
		dir.eachFileRecurse (FileType.FILES) { file -> l += file }
		return l.sort { it }
	}
	static def servers() {
		def servers = []
		server.listAll("/services/vm-.*/instances/.*/servers/.*/networks/.*").sort{it}.each { p ->
			def x = server.list(p)
			if ( x.dnsName == null) return
				servers += x.dnsName
		}
		return servers
	}


        static def checkPKCS12(file, pw) {
        try {
            KeyManagerFactory kmf = javax.net.ssl.KeyManagerFactory.getInstance("SunX509");
            KeyStore keystore = KeyStore.getInstance("PKCS12");
            char[] password= pw.toCharArray();
            keystore.load(new FileInputStream(file),password);
            kmf.init(keystore, password);
            Enumeration<String> aliases = keystore.aliases();
            while(aliases.hasMoreElements()){
                String alias = aliases.nextElement();
                if(keystore.getCertificate(alias).getType().equals("X.509")){
			Date expDate = ((X509Certificate) keystore.getCertificate(alias)).getNotAfter();
			Date fromDate= ((X509Certificate) keystore.getCertificate(alias)).getNotBefore();
                        if (verbose) {
                		println "================== $file ========================"
                		println "Alias: $alias"
				println("From Date: "+fromDate);
				println("To Date: "+expDate );
				keystore.getCertificate(alias).getSubjectAlternativeNames().each { println "SAN: ${it[1]}" }
			}
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
}


	static def checkCerts() {
		def passwords = file2object("config/passwords.yaml")
		// println passwords
		server.listAll("/services/vm-.*/instances/.*/servers/.*").each { p ->
			def x = server.list("$p")
			def xx = server.list("$p/networks/public")
			def name = new File(p).name
			if (passwords[name] == null) {
				println "server $name has not password defined in config/passwords.yaml"
				return
			}
			try {  CryptoUtils.decryptPrivate(k,passwords[name].substring(4)) } catch (e) {
				println "badly encrypted password for server $name"
                                return
			}
			def pw = CryptoUtils.decryptPrivate(k,passwords[name].substring(4))
                        def f = new File("config/${name}.pkcs12")
                        if (! f.exists() ) {
                        	println "no certificate file $f"
                                return
                        }
                        checkPKCS12("$f",pw)
		}
	}

	static String decryptString(String content) {
		Pattern p = Pattern.compile("(rsa:[A-Za-z0-9+/]+ *[A-Za-z0-9+/]+ *[A-Za-z0-9+/]+=*)");
		Matcher m = p.matcher(content);
		StringBuffer s = new StringBuffer();
		while (m.find()) {
			String k = m.group(1);
			m.appendReplacement(s, JavaHttpClient.decryptPassword(k));
		}
		m.appendTail(s);
		return s.toString();
	}
	static def checkConfig() {
		// verify encryption of files.
		recurseFiles(new File("config/instances")).each { File f ->
			try { decryptString(f.text) } catch (e) {
				println "bad encryption in configuration file $f"
			}
		}
	}
}

A.verbose = options.verbose

if (options.type == "all" || options.type == "rsa")
	A.checkRsa()

if (options.type == "all" || options.type == "certs")
	A.checkCerts()

if (options.type == "all" || options.type == "config")
	A.checkConfig()
