
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
	
/**
 */
package org.openecomp.dcae.controller.service.docker.impl;

import org.openecomp.dcae.controller.core.service.impl.DcaeServiceInstanceImpl;
import org.openecomp.dcae.controller.service.docker.DockerConfiguration;
import org.openecomp.dcae.controller.service.docker.DockerPackage;
import org.openecomp.dcae.controller.service.docker.DockerServiceInstance;
import org.openecomp.dcae.controller.service.docker.host.service.DockerHostServiceInstance;
import org.openecomp.ncomp.docker.ContainerPortBindings;
import org.openecomp.ncomp.docker.DockerHost;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.impl.DockerServiceInstanceImpl#getDockerHost <em>Docker Host</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.impl.DockerServiceInstanceImpl#getHostService <em>Host Service</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.impl.DockerServiceInstanceImpl#getDockerName <em>Docker Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.impl.DockerServiceInstanceImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.impl.DockerServiceInstanceImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.impl.DockerServiceInstanceImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.impl.DockerServiceInstanceImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.impl.DockerServiceInstanceImpl#getEnvs <em>Envs</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.impl.DockerServiceInstanceImpl#getPortBindings <em>Port Bindings</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.docker.impl.DockerServiceInstanceImpl#getManagerPortNumber <em>Manager Port Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerServiceInstanceImpl extends DcaeServiceInstanceImpl implements DockerServiceInstance {
	/**
	 * The cached value of the '{@link #getDockerHost() <em>Docker Host</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerHost()
	 * @generated
	 * @ordered
	 */
	protected DockerHost dockerHost;

	/**
	 * The cached value of the '{@link #getHostService() <em>Host Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostService()
	 * @generated
	 * @ordered
	 */
	protected DockerHostServiceInstance hostService;

	/**
	 * The default value of the '{@link #getDockerName() <em>Docker Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCKER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDockerName() <em>Docker Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerName()
	 * @generated
	 * @ordered
	 */
	protected String dockerName = DOCKER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected DockerConfiguration configuration;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> volumes;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<String> links;

	/**
	 * The cached value of the '{@link #getEnvs() <em>Envs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> envs;

	/**
	 * The cached value of the '{@link #getPortBindings() <em>Port Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerPortBindings> portBindings;

	/**
	 * The default value of the '{@link #getManagerPortNumber() <em>Manager Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerPortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int MANAGER_PORT_NUMBER_EDEFAULT = 9999;

	/**
	 * The cached value of the '{@link #getManagerPortNumber() <em>Manager Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerPortNumber()
	 * @generated
	 * @ordered
	 */
	protected int managerPortNumber = MANAGER_PORT_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerServiceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.DOCKER_SERVICE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerHost getDockerHost() {
		return dockerHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDockerHost(DockerHost newDockerHost, NotificationChain msgs) {
		DockerHost oldDockerHost = dockerHost;
		dockerHost = newDockerHost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_SERVICE_INSTANCE__DOCKER_HOST, oldDockerHost, newDockerHost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDockerHost(DockerHost newDockerHost) {
		if (newDockerHost != dockerHost) {
			NotificationChain msgs = null;
			if (dockerHost != null)
				msgs = ((InternalEObject)dockerHost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DockerPackage.DOCKER_SERVICE_INSTANCE__DOCKER_HOST, null, msgs);
			if (newDockerHost != null)
				msgs = ((InternalEObject)newDockerHost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DockerPackage.DOCKER_SERVICE_INSTANCE__DOCKER_HOST, null, msgs);
			msgs = basicSetDockerHost(newDockerHost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_SERVICE_INSTANCE__DOCKER_HOST, newDockerHost, newDockerHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerHostServiceInstance getHostService() {
		if (hostService != null && hostService.eIsProxy()) {
			InternalEObject oldHostService = (InternalEObject)hostService;
			hostService = (DockerHostServiceInstance)eResolveProxy(oldHostService);
			if (hostService != oldHostService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DockerPackage.DOCKER_SERVICE_INSTANCE__HOST_SERVICE, oldHostService, hostService));
			}
		}
		return hostService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerHostServiceInstance basicGetHostService() {
		return hostService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostService(DockerHostServiceInstance newHostService) {
		DockerHostServiceInstance oldHostService = hostService;
		hostService = newHostService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_SERVICE_INSTANCE__HOST_SERVICE, oldHostService, hostService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDockerName() {
		return dockerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDockerName(String newDockerName) {
		String oldDockerName = dockerName;
		dockerName = newDockerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_SERVICE_INSTANCE__DOCKER_NAME, oldDockerName, dockerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_SERVICE_INSTANCE__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerConfiguration getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(DockerConfiguration newConfiguration, NotificationChain msgs) {
		DockerConfiguration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_SERVICE_INSTANCE__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(DockerConfiguration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DockerPackage.DOCKER_SERVICE_INSTANCE__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DockerPackage.DOCKER_SERVICE_INSTANCE__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_SERVICE_INSTANCE__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVolumes() {
		if (volumes == null) {
			volumes = new EDataTypeEList<String>(String.class, this, DockerPackage.DOCKER_SERVICE_INSTANCE__VOLUMES);
		}
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLinks() {
		if (links == null) {
			links = new EDataTypeEList<String>(String.class, this, DockerPackage.DOCKER_SERVICE_INSTANCE__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEnvs() {
		if (envs == null) {
			envs = new EDataTypeEList<String>(String.class, this, DockerPackage.DOCKER_SERVICE_INSTANCE__ENVS);
		}
		return envs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerPortBindings> getPortBindings() {
		if (portBindings == null) {
			portBindings = new EObjectContainmentEList<ContainerPortBindings>(ContainerPortBindings.class, this, DockerPackage.DOCKER_SERVICE_INSTANCE__PORT_BINDINGS);
		}
		return portBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getManagerPortNumber() {
		return managerPortNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagerPortNumber(int newManagerPortNumber) {
		int oldManagerPortNumber = managerPortNumber;
		managerPortNumber = newManagerPortNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_SERVICE_INSTANCE__MANAGER_PORT_NUMBER, oldManagerPortNumber, managerPortNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DockerPackage.DOCKER_SERVICE_INSTANCE__DOCKER_HOST:
				return basicSetDockerHost(null, msgs);
			case DockerPackage.DOCKER_SERVICE_INSTANCE__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
			case DockerPackage.DOCKER_SERVICE_INSTANCE__PORT_BINDINGS:
				return ((InternalEList<?>)getPortBindings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.DOCKER_SERVICE_INSTANCE__DOCKER_HOST:
				return getDockerHost();
			case DockerPackage.DOCKER_SERVICE_INSTANCE__HOST_SERVICE:
				if (resolve) return getHostService();
				return basicGetHostService();
			case DockerPackage.DOCKER_SERVICE_INSTANCE__DOCKER_NAME:
				return getDockerName();
			case DockerPackage.DOCKER_SERVICE_INSTANCE__IMAGE:
				return getImage();
			case DockerPackage.DOCKER_SERVICE_INSTANCE__CONFIGURATION:
				return getConfiguration();
			case DockerPackage.DOCKER_SERVICE_INSTANCE__VOLUMES:
				return getVolumes();
			case DockerPackage.DOCKER_SERVICE_INSTANCE__LINKS:
				return getLinks();
			case DockerPackage.DOCKER_SERVICE_INSTANCE__ENVS:
				return getEnvs();
			case DockerPackage.DOCKER_SERVICE_INSTANCE__PORT_BINDINGS:
				return getPortBindings();
			case DockerPackage.DOCKER_SERVICE_INSTANCE__MANAGER_PORT_NUMBER:
				return getManagerPortNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DockerPackage.DOCKER_SERVICE_INSTANCE__DOCKER_HOST:
				setDockerHost((DockerHost)newValue);
				return;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__HOST_SERVICE:
				setHostService((DockerHostServiceInstance)newValue);
				return;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__DOCKER_NAME:
				setDockerName((String)newValue);
				return;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__IMAGE:
				setImage((String)newValue);
				return;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__CONFIGURATION:
				setConfiguration((DockerConfiguration)newValue);
				return;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__VOLUMES:
				getVolumes().clear();
				getVolumes().addAll((Collection<? extends String>)newValue);
				return;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends String>)newValue);
				return;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__ENVS:
				getEnvs().clear();
				getEnvs().addAll((Collection<? extends String>)newValue);
				return;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__PORT_BINDINGS:
				getPortBindings().clear();
				getPortBindings().addAll((Collection<? extends ContainerPortBindings>)newValue);
				return;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__MANAGER_PORT_NUMBER:
				setManagerPortNumber((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DockerPackage.DOCKER_SERVICE_INSTANCE__DOCKER_HOST:
				setDockerHost((DockerHost)null);
				return;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__HOST_SERVICE:
				setHostService((DockerHostServiceInstance)null);
				return;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__DOCKER_NAME:
				setDockerName(DOCKER_NAME_EDEFAULT);
				return;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__CONFIGURATION:
				setConfiguration((DockerConfiguration)null);
				return;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__VOLUMES:
				getVolumes().clear();
				return;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__LINKS:
				getLinks().clear();
				return;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__ENVS:
				getEnvs().clear();
				return;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__PORT_BINDINGS:
				getPortBindings().clear();
				return;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__MANAGER_PORT_NUMBER:
				setManagerPortNumber(MANAGER_PORT_NUMBER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DockerPackage.DOCKER_SERVICE_INSTANCE__DOCKER_HOST:
				return dockerHost != null;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__HOST_SERVICE:
				return hostService != null;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__DOCKER_NAME:
				return DOCKER_NAME_EDEFAULT == null ? dockerName != null : !DOCKER_NAME_EDEFAULT.equals(dockerName);
			case DockerPackage.DOCKER_SERVICE_INSTANCE__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case DockerPackage.DOCKER_SERVICE_INSTANCE__CONFIGURATION:
				return configuration != null;
			case DockerPackage.DOCKER_SERVICE_INSTANCE__VOLUMES:
				return volumes != null && !volumes.isEmpty();
			case DockerPackage.DOCKER_SERVICE_INSTANCE__LINKS:
				return links != null && !links.isEmpty();
			case DockerPackage.DOCKER_SERVICE_INSTANCE__ENVS:
				return envs != null && !envs.isEmpty();
			case DockerPackage.DOCKER_SERVICE_INSTANCE__PORT_BINDINGS:
				return portBindings != null && !portBindings.isEmpty();
			case DockerPackage.DOCKER_SERVICE_INSTANCE__MANAGER_PORT_NUMBER:
				return managerPortNumber != MANAGER_PORT_NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dockerName: ");
		result.append(dockerName);
		result.append(", image: ");
		result.append(image);
		result.append(", volumes: ");
		result.append(volumes);
		result.append(", links: ");
		result.append(links);
		result.append(", envs: ");
		result.append(envs);
		result.append(", managerPortNumber: ");
		result.append(managerPortNumber);
		result.append(')');
		return result.toString();
	}

} //DockerServiceInstanceImpl
