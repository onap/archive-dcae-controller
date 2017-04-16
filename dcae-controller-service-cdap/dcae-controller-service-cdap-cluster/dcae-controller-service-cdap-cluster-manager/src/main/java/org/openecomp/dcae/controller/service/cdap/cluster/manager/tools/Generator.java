
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
	
package org.openecomp.dcae.controller.service.cdap.cluster.manager.tools;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.openecomp.dcae.controller.service.cdap.cluster.manager.ManagerFactory;
import org.openecomp.dcae.controller.service.cdap.cluster.service.ServiceFactory;
import org.openecomp.dcae.controller.service.vm.VmFactory;
import org.openecomp.dcae.controller.service.vmmanager.VmmanagerFactory;
import org.openecomp.utils.YamlToJava;
import org.openecomp.ncomp.gwt.siriusportal.model.ModelFactory;
import org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel;
import org.openecomp.ncomp.sirius.manager.controllermodel.ControllermodelFactory;
import org.openecomp.ncomp.sirius.manager.generator.ControllerGenerator;
import org.openecomp.ncomp.sirius.manager.server.ServerPackage;

public class Generator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ServerPackage f = ServerPackage.eINSTANCE;
		genManager();
		genService();
	}

	public static void genManager() {
		EObject o = ManagerFactory.eINSTANCE.createCdapClusterManager();
		EPackage p = o.eClass().getEPackage();
		String dir = p.getNsURI().replaceAll(p.getNsPrefix()+'$',"") + "servers." + p.getNsPrefix();
		dir = "src/main/sirius-gen/" + dir.replace('.', '/');
		ControllerModel m = ControllermodelFactory.eINSTANCE.createControllerModel();
		m.setTemplateDirectory("../../../../ncomp.sirius.manager/ncomp-sirius-manager-generator/src/main/templates");
		m.setPrefix("Dcae");
		m.setPluginName(p.getNsURI());
		m.setName("ControllerServiceCdapClusterManager");
		m.setTitle("ControllerServiceCdapClusterManager");
		ControllerGenerator g = new ControllerGenerator(o, m);
		g.setVersion("ONAP-R2");
		g.setEnableIRequestHandler(false);
		g.setEnableISiriusPlugin(false);
		g.addFactory("org.openecomp.ncomp.servers.cdap.CdapCdapFactory");
		g.addFactory(ServiceFactory.eINSTANCE);
		EObject gui = ModelFactory.eINSTANCE.createGuiClientApi();
		g.addObject("gui", gui, m);
		g.setProvider(VmmanagerFactory.eINSTANCE.createVirtualMachineManager(), "Dcae");
		g.generate(dir);
		g.generateScripts("src/main/server-gen/bin", "controller-service-cdap-cluster-manager");
		String pName = p.getNsURI().replaceAll(p.getNsPrefix()+'$',"") + "servers." + p.getNsPrefix() +".logging";
//		YamlToJava.convert("src/main/resources/DockerAdaptor.yaml", dir + "/logging", pName);
		YamlToJava.convert("src/main/sirius-gen/CdapClusterManager.yaml", dir + "/logging", pName);
		String pName1 = p.getNsURI().replaceAll(p.getNsPrefix()+'$',"") + "servers." + p.getNsPrefix() +".gui.logging";
		YamlToJava.convert("src/main/sirius-gen/GuiClientApi.yaml", dir + "/gui/logging", pName1);
	}

	public static void genService() {
		EObject o = ServiceFactory.eINSTANCE.createCdapClusterService();
		EPackage p = o.eClass().getEPackage();
		String dir = p.getNsURI().replaceAll(p.getNsPrefix()+"$", "") + "servers." + p.getNsPrefix();
		dir = "src/main/sirius-gen/" + dir.replace('.', '/');
		ControllerModel m = ControllermodelFactory.eINSTANCE.createControllerModel();
		m.setTemplateDirectory("../../../../ncomp.sirius.manager/ncomp-sirius-manager-generator/src/main/templates");
		m.setPrefix("Dcae");
		m.setPluginName(p.getNsURI());
		m.setName("ControllerServiceCdapClusterService");
		m.setTitle("ControllerServiceCdapClusterService");
		ControllerGenerator g = new ControllerGenerator(o, m);
		g.setVersion("ONAP-R2");
		g.setEnableIRequestHandler(false);
		g.setEnableISiriusPlugin(true);
		g.setProvider(VmFactory.eINSTANCE.createVirtualMachineService(), "Dcae");
		g.generate(dir);
		String pName = p.getNsURI().replaceAll(p.getNsPrefix()+'$',"") + "servers." + p.getNsPrefix() +".logging";
//		YamlToJava.convert("src/main/resources/DcaeServiceCdapHost.yaml", dir + "/logging", pName);
		YamlToJava.convert("src/main/sirius-gen/CdapClusterService.yaml", dir + "/logging", pName);
	}

}
