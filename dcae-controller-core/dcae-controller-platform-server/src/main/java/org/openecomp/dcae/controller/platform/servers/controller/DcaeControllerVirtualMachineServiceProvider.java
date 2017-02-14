
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
	
package org.openecomp.dcae.controller.platform.servers.controller;

import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.apache.log4j.Logger;
import org.openecomp.dcae.controller.core.service.HealthTestResponse;
import org.openecomp.dcae.controller.core.service.HealthTestStatus;
import org.openecomp.dcae.controller.core.service.ServiceFactory;
import org.openecomp.dcae.controller.core.stream.DatabusStream;
import org.openecomp.dcae.controller.core.stream.DatabusStreamFeed;
import org.openecomp.dcae.controller.core.stream.DatabusStreamTopic;
import org.openecomp.dcae.controller.core.stream.DatabusStreamTopicClient;
import org.openecomp.dcae.controller.platform.controller.ControllerVirtualMachineService;
import org.openecomp.dcae.controller.platform.controller.DcaePlatformController;
import org.openecomp.dcae.controller.service.servers.vm.DcaeVirtualMachineServiceProvider;

public class DcaeControllerVirtualMachineServiceProvider extends DcaeVirtualMachineServiceProvider {
	private static final Logger logger = Logger.getLogger(DcaeControllerVirtualMachineServiceProvider.class);
	ControllerVirtualMachineService o;

	public DcaeControllerVirtualMachineServiceProvider(ISiriusServer controller, ControllerVirtualMachineService o) {
		super(controller, o);
		this.o = o;
	}

	@Override
	public HealthTestResponse test(String instance) {
		DcaePlatformController c = (DcaePlatformController) o.eContainer();
		HealthTestResponse res = ServiceFactory.eINSTANCE.createHealthTestResponse();
		if (c.getDatabus() == null) {
			res.setStatus(HealthTestStatus.RED);
			res.setMessageCode("No Databus");
			return res;
		}
		if (c.getDatabus().getLocations().size() == 0) {
			res.setStatus(HealthTestStatus.RED);
			res.setMessageCode("No Databus Locations");
			return res;
		}
		for (DatabusStream s : c.getDatabus().getStreams()) {
			if (s instanceof DatabusStreamFeed) {
				DatabusStreamFeed f = (DatabusStreamFeed) s;
				if (f.getFeedName() == null || f.getFeedName().startsWith("ERROR")) {
					res.setStatus(HealthTestStatus.RED);
					res.setMessageCode("Feed Error: " + f.getName());
					return res;
				}
			}
			if (s instanceof DatabusStreamTopic) {
				DatabusStreamTopic t = (DatabusStreamTopic) s;
				if (t.getTopicName() == null || t.getTopicName().startsWith("ERROR")) {
					res.setStatus(HealthTestStatus.RED);
					res.setMessageCode("Topic Error: " + t.getName());
					return res;
				}
				for (DatabusStreamTopicClient client : t.getClients()) {
					if (client.getTopicURL() == null) {
						res.setStatus(HealthTestStatus.RED);
						res.setMessageCode("Topic Error: null URL: " + t.getName() + "@" + client.getName());
						return res;
					}
				}
			}
		}
		res.setStatus(HealthTestStatus.GREEN);
		return res;

	}
}
