
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
	

package org.openecomp.dcae.controller.platform.servers.controller.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum DcaePlatformControllerOperationEnum implements EcompOperationEnum {

  logs,
  metrics,
  properties,
  uploadInfo,
  getValues,
  getValuesAll,
  getMessages,
  getRequestLogger,
  evaluate,
  update,
  deployDescriptor,
  refreshDataBus,
  REMOTE_logs,
  REMOTE_metrics,
  REMOTE_properties,
  REMOTE_uploadInfo,
  REMOTE_getValues,
  REMOTE_getValuesAll,
  REMOTE_getMessages,
  REMOTE_getRequestLogger,
  REMOTE_evaluate,
  REMOTE_update,
  REMOTE_deployDescriptor,
  REMOTE_refreshDataBus;
}
