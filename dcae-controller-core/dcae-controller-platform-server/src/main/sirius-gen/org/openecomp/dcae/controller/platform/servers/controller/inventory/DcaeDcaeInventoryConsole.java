
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
	
// Autogenerated
// Do not edit but extend this class as needed
package org.openecomp.dcae.controller.platform.servers.controller.inventory;


import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import org.openecomp.ncomp.sirius.manager.console.Console;
import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.ManagementServerError;




public class DcaeDcaeInventoryConsole extends Console {
	public static final Logger logger = Logger.getLogger(DcaeDcaeInventoryConsole.class);
    protected DcaeDcaeInventoryClient controller;
    



    public DcaeDcaeInventoryConsole(String filename, String name) {
            super(filename, name);
            controller = new DcaeDcaeInventoryClient(filename,name);
            client = controller.client;

    }
    
	public DcaeDcaeInventoryConsole(AbstractClient c) {
        controller = new DcaeDcaeInventoryClient(c);
        client = controller.client;
    }


	public org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults getDcaeServiceTypes(java.lang.String typeName, java.lang.Boolean onlyLatest, java.lang.Boolean onlyActive, java.lang.String vnfType, java.lang.String serviceId, java.lang.String serviceLocation, java.lang.String asdcServiceId, java.lang.String asdcResourceId, java.lang.Integer offset) {
		org.openecomp.dcae.controller.inventory.DcaeServiceTypeResults res = null;
		try {
			res =  controller.getDcaeServiceTypes(typeName,onlyLatest,onlyActive,vnfType,serviceId,serviceLocation,asdcServiceId,asdcResourceId,offset);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public org.openecomp.dcae.controller.inventory.ApiResponseMessage deleteDcaeServiceTypesType(java.lang.String typeId) {
		org.openecomp.dcae.controller.inventory.ApiResponseMessage res = null;
		try {
			res =  controller.deleteDcaeServiceTypesType(typeId);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public org.openecomp.dcae.controller.inventory.DCAEServiceType getDcaeServiceTypesType(java.lang.String typeId) {
		org.openecomp.dcae.controller.inventory.DCAEServiceType res = null;
		try {
			res =  controller.getDcaeServiceTypesType(typeId);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public org.openecomp.dcae.controller.inventory.DCAEServiceType createDcaeServiceTypesTypeName(org.openecomp.dcae.controller.inventory.DCAEServiceTypeRequest body) {
		org.openecomp.dcae.controller.inventory.DCAEServiceType res = null;
		try {
			res =  controller.createDcaeServiceTypesTypeName(body);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public org.openecomp.dcae.controller.inventory.DcaeServiceResults getDcaeServices(java.lang.String typeId, java.lang.String vnfId, java.lang.String vnfType, java.lang.String vnfLocation, java.lang.String componentType, java.lang.Boolean shareable, java.lang.String created, java.lang.Integer offset) {
		org.openecomp.dcae.controller.inventory.DcaeServiceResults res = null;
		try {
			res =  controller.getDcaeServices(typeId,vnfId,vnfType,vnfLocation,componentType,shareable,created,offset);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults getDcaeServicesGroupbyPropertyName(java.lang.String propertyName) {
		org.openecomp.dcae.controller.inventory.DCAEServiceGroupByResults res = null;
		try {
			res =  controller.getDcaeServicesGroupbyPropertyName(propertyName);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public void deleteDcaeServicesService(java.lang.String serviceId) {
		
		try {
			 controller.deleteDcaeServicesService(serviceId);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public org.openecomp.dcae.controller.inventory.DCAEService getDcaeServicesService(java.lang.String serviceId) {
		org.openecomp.dcae.controller.inventory.DCAEService res = null;
		try {
			res =  controller.getDcaeServicesService(serviceId);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public org.openecomp.dcae.controller.inventory.DCAEService createDcaeServicesService(java.lang.String serviceId, org.openecomp.dcae.controller.inventory.DCAEServiceRequest body) {
		org.openecomp.dcae.controller.inventory.DCAEService res = null;
		try {
			res =  controller.createDcaeServicesService(serviceId,body);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		return res;
	}

	public void poll() {
		
		try {
			 controller.poll();
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void updateConfiguration() {
		
		try {
			 controller.updateConfiguration();
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

}
