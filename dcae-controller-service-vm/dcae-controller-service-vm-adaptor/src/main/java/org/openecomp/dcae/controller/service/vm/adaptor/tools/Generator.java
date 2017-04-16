
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
	
package org.openecomp.dcae.controller.service.vm.adaptor.tools;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.openecomp.ncomp.gwt.siriusportal.model.ModelFactory;
import org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel;
import org.openecomp.ncomp.sirius.manager.controllermodel.ControllermodelFactory;
import org.openecomp.ncomp.sirius.manager.generator.ControllerGenerator;
import org.openecomp.ncomp.sirius.manager.server.ServerPackage;
import org.openecomp.dcae.controller.service.vm.VmFactory;
import org.openecomp.dcae.controller.service.vmmanager.VmmanagerFactory;
import org.openecomp.utils.YamlToJava;


public class Generator {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ServerPackage f = ServerPackage.eINSTANCE;
		genManager();
		genService();
	}

	private static void genManager() {
		EObject o = VmmanagerFactory.eINSTANCE.createVirtualMachineManager();
		EPackage p = o.eClass().getEPackage();
		String dir = p.getNsURI().replaceAll(p.getNsPrefix()+'$',"") + "servers." + p.getNsPrefix();
		dir = "src/main/sirius-gen/" + dir.replace('.', '/');
		ControllerModel m = ControllermodelFactory.eINSTANCE.createControllerModel();
		m.setTemplateDirectory("../../../ncomp.sirius.manager/ncomp-sirius-manager-generator/src/main/templates");
		m.setPrefix("Dcae");
		m.setPluginName(p.getNsURI());
		m.setName("ControllerServiceVmManager");
		m.setTitle("ControllerServiceVmManager");
		ControllerGenerator g = new ControllerGenerator(o, m);
		g.setVersion("ONAP-R2");
		g.setEnableIRequestHandler(false);
		g.setEnableISiriusPlugin(false);
		//  TODO Unclear why this fails.
//		g.addFactory(VmFactory.eINSTANCE);
		g.generate(dir);
		String pName = p.getNsURI().replaceAll(p.getNsPrefix()+'$',"") + "servers." + p.getNsPrefix() +".logging";
		YamlToJava.convert("src/main/sirius-gen/VirtualMachineManager.yaml", dir + "/logging", pName);
	}

	public static void genService() {
		@SuppressWarnings("unused")
		ServerPackage f = ServerPackage.eINSTANCE;
		EObject o = VmFactory.eINSTANCE.createVirtualMachineService();
		EPackage p = o.eClass().getEPackage();
		String dir = p.getNsURI().replace(p.getNsPrefix(),"") + "servers." + p.getNsPrefix();
		dir= "src/main/sirius-gen/" + dir.replace('.', '/');
		ControllerModel m = ControllermodelFactory.eINSTANCE.createControllerModel();
		m.setTemplateDirectory("../../../ncomp.sirius.manager/ncomp-sirius-manager-generator/src/main/templates");
		m.setPrefix("Dcae");
		m.setPluginName(p.getNsURI());
		m.setName("ControllerServiceVm");
		m.setTitle("ControllerServiceVm");
		ControllerGenerator g = new ControllerGenerator(o,m); 
		g.setVersion("ONAP-R2");
		g.setEnableIRequestHandler(false);
		g.setEnableISiriusPlugin(true);
		g.generate(dir);
		g.generateScripts("src/main/server-gen/bin","controller-service-vm-adaptor"); 
		String pName = p.getNsURI().replaceAll(p.getNsPrefix()+'$',"") + "servers." + p.getNsPrefix() +".logging";
		YamlToJava.convert("src/main/resources/DcaeServiceVirtualMachineAdaptor.yaml", dir + "/logging", pName);
		YamlToJava.convert("src/main/sirius-gen/VirtualMachineService.yaml", dir + "/logging", pName);
	}


}
