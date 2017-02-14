
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





import java.io.InputStream;

import org.openecomp.ncomp.sirius.manager.IRequestHandler;
import org.openecomp.ncomp.sirius.manager.ISiriusPlugin;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.function.FunctionUtils;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;



import java.util.Date;


import org.openecomp.ncomp.sirius.manager.server.LoggerInfo;


import org.openecomp.ncomp.sirius.manager.server.ServerFactory;


import org.openecomp.ncomp.sirius.manager.BasicManagementServerProvider;


import org.openecomp.dcae.controller.platform.controller.impl.DcaePlatformControllerImpl;
import org.openecomp.dcae.controller.platform.controller.DcaePlatformController;


public class DcaeDcaePlatformControllerProviderTemplate extends BasicManagementServerProvider {
	private static final Logger logger = Logger.getLogger(DcaeDcaePlatformControllerProviderTemplate.class);
	DcaePlatformController o;

	public DcaeDcaePlatformControllerProviderTemplate(ISiriusServer controller, DcaePlatformController o) {
		super(controller, o);
		this.o = o;
	}

	public void deployDescriptor(java.lang.String name) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void refreshDataBus(java.lang.String nameMatch) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}


public Object handleJson(String userName, String action, String resourcePath, JSONObject json, JSONObject context) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Object handleBinary(String userName, String action, String resourcePath, InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}






	
}
