
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
	
package org.openecomp.dcae.controller.platform.server.tools;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel;
import org.openecomp.ncomp.sirius.manager.controllermodel.ControllermodelFactory;
import org.openecomp.ncomp.sirius.manager.generator.ControllerGenerator;
import org.openecomp.ncomp.gwt.siriusportal.model.*;
import org.openecomp.dcae.controller.platform.controller.ControllerFactory;
import org.openecomp.dcae.controller.service.vm.VmFactory;
import org.openecomp.utils.YamlToJava;


public class Generator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EObject o = ControllerFactory.eINSTANCE.createDcaePlatformController();
		EPackage p = o.eClass().getEPackage();
		String dir = p.getNsURI().replaceAll(p.getNsPrefix()+'$',"") + "servers." + p.getNsPrefix();
		dir= "src/main/sirius-gen/" + dir.replace('.', '/');
		ControllerModel m = ControllermodelFactory.eINSTANCE.createControllerModel();
		m.setTemplateDirectory("../../dcae-org.openecomp.ncomp.sirius.manager/ncomp-sirius-manager-generator/src/main/templates");
		m.setPrefix("Dcae");
		m.setPluginName(p.getNsURI());
		m.setName("ControllerPlatformServer");
		m.setTitle("ControllerPlatformServer");
		ControllerGenerator g = new ControllerGenerator(o,m); 
		g.setEnableIRequestHandler(true);
		g.setEnableISiriusPlugin(true);
		g.setEnableISwaggerHandler(true);
		EObject cluster = ControllerFactory.eINSTANCE.createControllerCluster();
		g.addApi("cluster", cluster, m, false, true);
		EObject cont = ControllerFactory.eINSTANCE.createControllerVirtualMachineService();
		g.addApi("cont", cont, m, false, true);
		EObject gui = ModelFactory.eINSTANCE.createGuiClientApi();
		g.addObject("gui",gui,m);
		g.addAlias("/test");
		g.addAlias("/swagger");
		g.addFactory("org.openecomp.ncomp.servers.openstack.OsOpenstackFactory");
		g.addFactory("org.openecomp.ncomp.servers.openstack.loc.OsLocationFactory");
		g.generate(dir);
		g.generateScripts("src/main/server-gen/bin","controller-platform-server"); 
		// create ECOMP Logging messages
		String pName = p.getNsURI().replaceAll(p.getNsPrefix()+'$',"") + "servers." + p.getNsPrefix() +".logging";
		YamlToJava.convert("src/main/resources/DcaeController.yaml", dir + "/logging", pName);
		YamlToJava.convert("src/main/sirius-gen/DcaePlatformController.yaml", dir + "/logging", pName);
		YamlToJava.convert("src/main/sirius-gen/ControllerCluster.yaml", dir + "/logging", pName);
		YamlToJava.convert("src/main/sirius-gen/ControllerVirtualMachineService.yaml", dir + "/logging", pName);
		String pName1 = p.getNsURI().replaceAll(p.getNsPrefix()+'$',"") + "servers." + p.getNsPrefix() +".gui.logging";
		YamlToJava.convert("src/main/sirius-gen/GuiClientApi.yaml", dir + "/gui/logging", pName1);
	}


}
