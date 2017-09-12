
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
// Do not edit. No need to extend this class.
package org.openecomp.dcae.controller.platform.servers.controller;

import org.apache.log4j.Logger;
import org.openecomp.dcae.controller.platform.controller.impl.ControllerClusterImpl;
import org.openecomp.dcae.controller.platform.servers.controller.logging.ControllerClusterMessageEnum;
import org.openecomp.dcae.controller.platform.servers.controller.logging.ControllerClusterOperationEnum;
import org.openecomp.logger.EcompException;
import org.openecomp.logger.StatusCodeEnum;
import org.openecomp.ncomp.component.ApiRequestStatus;
import org.openecomp.ncomp.sirius.manager.ISiriusPlugin;
import org.openecomp.ncomp.sirius.manager.ISiriusProvider;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.logging.NcompLogger;

import java.util.Date;

public class DcaeControllerCluster extends ControllerClusterImpl implements ISiriusProvider, ISiriusPlugin {
    public static final Logger logger = Logger.getLogger(DcaeControllerCluster.class);
    static final NcompLogger ecomplogger = NcompLogger.getNcompLogger();
    public DcaeControllerClusterProvider controller;
    ISiriusServer server;

    public DcaeControllerCluster(ISiriusServer server) {
        this.server = server;
        this.controller = new DcaeControllerClusterProvider(server, this);
    }

    public void pushData(java.lang.String serverName, java.lang.String dataName) {

        long duration_ = 0;
        if (server != null) {
            server.getServer().recordApi(null, this, "pushData", ApiRequestStatus.START, duration_, serverName, dataName);
        }
        Date now_ = new Date();
        ecomplogger.recordAuditEventStartIfNeeded(ControllerClusterOperationEnum.ControllerCluster_pushData, server, this);
        ecomplogger.recordMetricEventStart(ControllerClusterOperationEnum.ControllerCluster_pushData, "self:" + ManagementServer.object2ref(this));
        try {
            controller.pushData(serverName, dataName);
        } catch (Exception e) {
            duration_ = new Date().getTime() - now_.getTime();
            if (server != null) {
                server.getServer().recordApi(null, this, "pushData", ApiRequestStatus.ERROR, duration_, serverName, dataName);
            }
            System.err.println("ERROR: " + e);
            ecomplogger.warn(ControllerClusterMessageEnum.REQUEST_FAILED_pushData, e.toString());
            EcompException e1 = EcompException.create(ControllerClusterMessageEnum.REQUEST_FAILED_pushData, e, e.getMessage());
            ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, ControllerClusterMessageEnum.REQUEST_FAILED_pushData, e.getMessage());
            throw e1;
        }
        ecomplogger.recordMetricEventEnd();
        duration_ = new Date().getTime() - now_.getTime();
        if (server != null) {
            server.getServer().recordApi(null, this, "pushData", ApiRequestStatus.OKAY, duration_, serverName, dataName);
        }

    }

    public void receiveData(java.lang.String serverName, java.lang.String dataName, java.util.Date time, java.lang.String content) {

        long duration_ = 0;
        if (server != null) {
            server.getServer().recordApi(null, this, "receiveData", ApiRequestStatus.START, duration_, serverName, dataName, time, content);
        }
        Date now_ = new Date();
        ecomplogger.recordAuditEventStartIfNeeded(ControllerClusterOperationEnum.ControllerCluster_receiveData, server, this);
        ecomplogger.recordMetricEventStart(ControllerClusterOperationEnum.ControllerCluster_receiveData, "self:" + ManagementServer.object2ref(this));
        try {
            controller.receiveData(serverName, dataName, time, content);
        } catch (Exception e) {
            duration_ = new Date().getTime() - now_.getTime();
            if (server != null) {
                server.getServer().recordApi(null, this, "receiveData", ApiRequestStatus.ERROR, duration_, serverName, dataName, time, content);
            }
            System.err.println("ERROR: " + e);
            ecomplogger.warn(ControllerClusterMessageEnum.REQUEST_FAILED_receiveData, e.toString());
            EcompException e1 = EcompException.create(ControllerClusterMessageEnum.REQUEST_FAILED_receiveData, e, e.getMessage());
            ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, ControllerClusterMessageEnum.REQUEST_FAILED_receiveData, e.getMessage());
            throw e1;
        }
        ecomplogger.recordMetricEventEnd();
        duration_ = new Date().getTime() - now_.getTime();
        if (server != null) {
            server.getServer().recordApi(null, this, "receiveData", ApiRequestStatus.OKAY, duration_, serverName, dataName, time, content);
        }

    }

    @Override
    public void start() {
        controller.start();
    }

    public static void ecoreSetup() {
        DcaeControllerClusterProvider.ecoreSetup();
    }

    @Override
    public DcaeControllerClusterProvider getSiriusProvider() {
        return controller;
    }
}
