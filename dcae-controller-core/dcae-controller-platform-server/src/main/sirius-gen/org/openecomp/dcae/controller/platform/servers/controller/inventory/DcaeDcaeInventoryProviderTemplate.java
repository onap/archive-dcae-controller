
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
	

package org.openecomp.dcae.controller.platform.servers.controller.inventory;





import java.io.InputStream;

import org.openecomp.ncomp.sirius.manager.IRequestHandler;
import org.openecomp.ncomp.sirius.manager.ISiriusPlugin;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.function.FunctionUtils;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;



import org.openecomp.ncomp.sirius.manager.BasicAdaptorProvider;


import org.openecomp.dcae.controller.inventory.impl.DcaeInventoryImpl;
import org.openecomp.dcae.controller.inventory.DcaeInventory;


public class DcaeDcaeInventoryProviderTemplate extends BasicAdaptorProvider {
	private static final Logger logger = Logger.getLogger(DcaeDcaeInventoryProviderTemplate.class);
	DcaeInventory o;

	public DcaeDcaeInventoryProviderTemplate(ISiriusServer controller, DcaeInventory o) {
		super(controller, o);
		this.o = o;
	}

	public org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults getDcaeServiceTypes(java.lang.String typeName, java.lang.Boolean onlyLatest, java.lang.Boolean onlyActive, java.lang.String vnfType, java.lang.String serviceId, java.lang.String serviceLocation, java.lang.String asdcServiceId, java.lang.String asdcResourceId, java.lang.Integer offset) {
		org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public org.openecomp.dcae.controller.inventory.ApiResponseMessage deleteDcaeServiceTypesType(java.lang.String typeId) {
		org.openecomp.dcae.controller.inventory.ApiResponseMessage res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public org.openecomp.dcae.controller.inventory.DCAEServiceType getDcaeServiceTypesType(java.lang.String typeId) {
		org.openecomp.dcae.controller.inventory.DCAEServiceType res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public org.openecomp.dcae.controller.inventory.DCAEServiceType createDcaeServiceTypesTypeName(org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest body) {
		org.openecomp.dcae.controller.inventory.DCAEServiceType res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public org.openecomp.dcae.controller.inventory.DcaeServiceResults getDcaeServices(java.lang.String typeId, java.lang.String vnfId, java.lang.String vnfType, java.lang.String vnfLocation, java.lang.String componentType, java.lang.Boolean shareable, java.lang.String created, java.lang.Integer offset) {
		org.openecomp.dcae.controller.inventory.DcaeServiceResults res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults getDcaeServicesGroupbyPropertyName(java.lang.String propertyName) {
		org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void deleteDcaeServicesService(java.lang.String serviceId) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public org.openecomp.dcae.controller.inventory.DCAEService getDcaeServicesService(java.lang.String serviceId) {
		org.openecomp.dcae.controller.inventory.DCAEService res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public org.openecomp.dcae.controller.inventory.DCAEService createDcaeServicesService(java.lang.String serviceId, org.openecomp.dcae.controller.inventory.DCAEServiceRequest body) {
		org.openecomp.dcae.controller.inventory.DCAEService res = null;
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void poll() {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void updateConfiguration() {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}





	
}
