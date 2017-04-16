
package org.openecomp.dcae.controller.service.servers.dockermanager.logging;

import com.att.eelf.i18n.EELFResourceManager;
import org.openecomp.logger.EcompMessageEnum;

public enum DockerManager2MessageEnum implements EcompMessageEnum {

  DOCKER_MANAGER_START_NEW_CRON,
  DOCKER_MANAGER_CRON_FAILURE;

	static {
		EELFResourceManager.loadMessageBundle("org/openecomp/dcae/controller/service/servers/dockermanager/logging/DockerManager2");
	}
}
