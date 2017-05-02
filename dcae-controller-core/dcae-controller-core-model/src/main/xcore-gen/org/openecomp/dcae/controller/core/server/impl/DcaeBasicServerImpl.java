
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
package org.openecomp.dcae.controller.core.server.impl;

import org.openecomp.dcae.controller.core.server.DcaeBasicServer;
import org.openecomp.dcae.controller.core.server.DcaeBasicServerNetwork;
import org.openecomp.dcae.controller.core.server.ServerPackage;
import org.openecomp.dcae.controller.core.service.HealthTestStatus;
import org.openecomp.ncomp.core.CorePackage;
import org.openecomp.ncomp.core.HasOperationalState;
import org.openecomp.ncomp.core.OperationalState;
import org.openecomp.ncomp.core.impl.NamedEntityImpl;
import org.openecomp.ncomp.core.logs.LogMessageCategory;
import org.openecomp.ncomp.core.logs.LogMessageContainer;
import org.openecomp.ncomp.core.logs.LogMessageContainerConfiguration;
import org.openecomp.ncomp.core.logs.LogMessageStats;
import org.openecomp.ncomp.core.logs.LogsPackage;
import org.openecomp.ncomp.core.types.metrics.DateMetricAttribute;
import org.openecomp.ncomp.openstack.compute.Server;
import org.openecomp.ncomp.openstack.core.VirtualMachineType;
import org.openecomp.ncomp.openstack.location.Hypervisor;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer;
import org.openecomp.ncomp.sirius.manager.properties.Module;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dcae Basic Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl#getOperationalState <em>Operational State</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl#getLogMessageConfiguration <em>Log Message Configuration</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl#getLogMessageCategories <em>Log Message Categories</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl#getLogMessageStats <em>Log Message Stats</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl#getPrivateIp <em>Private Ip</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl#getPublicIp <em>Public Ip</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl#getCollectd <em>Collectd</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl#isUsingMonitoringAgent <em>Using Monitoring Agent</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl#getServer <em>Server</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl#getHypervisor <em>Hypervisor</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl#getVmType <em>Vm Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl#getCertificatePassword <em>Certificate Password</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl#getLastHealthTest <em>Last Health Test</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl#getHealthTestStatus <em>Health Test Status</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.core.server.impl.DcaeBasicServerImpl#getHealthTestMessageCode <em>Health Test Message Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DcaeBasicServerImpl extends NamedEntityImpl implements DcaeBasicServer {
	/**
	 * The default value of the '{@link #getOperationalState() <em>Operational State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalState()
	 * @generated
	 * @ordered
	 */
	protected static final OperationalState OPERATIONAL_STATE_EDEFAULT = OperationalState.OPERATIONAL;

	/**
	 * The cached value of the '{@link #getOperationalState() <em>Operational State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalState()
	 * @generated
	 * @ordered
	 */
	protected OperationalState operationalState = OPERATIONAL_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogMessageConfiguration() <em>Log Message Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogMessageConfiguration()
	 * @generated
	 * @ordered
	 */
	protected LogMessageContainerConfiguration logMessageConfiguration;

	/**
	 * The cached value of the '{@link #getLogMessageCategories() <em>Log Message Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogMessageCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<LogMessageCategory> logMessageCategories;

	/**
	 * The cached value of the '{@link #getLogMessageStats() <em>Log Message Stats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogMessageStats()
	 * @generated
	 * @ordered
	 */
	protected EList<LogMessageStats> logMessageStats;

	/**
	 * The default value of the '{@link #getPrivateIp() <em>Private Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateIp()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateIp() <em>Private Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateIp()
	 * @generated
	 * @ordered
	 */
	protected String privateIp = PRIVATE_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicIp() <em>Public Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicIp()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicIp() <em>Public Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicIp()
	 * @generated
	 * @ordered
	 */
	protected String publicIp = PUBLIC_IP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCollectd() <em>Collectd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectd()
	 * @generated
	 * @ordered
	 */
	protected CollectdServer collectd;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> modules;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<DcaeBasicServerNetwork> networks;

	/**
	 * The default value of the '{@link #getLastUpdate() <em>Last Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final DateMetricAttribute LAST_UPDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastUpdate() <em>Last Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdate()
	 * @generated
	 * @ordered
	 */
	protected DateMetricAttribute lastUpdate = LAST_UPDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUsingMonitoringAgent() <em>Using Monitoring Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsingMonitoringAgent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USING_MONITORING_AGENT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUsingMonitoringAgent() <em>Using Monitoring Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsingMonitoringAgent()
	 * @generated
	 * @ordered
	 */
	protected boolean usingMonitoringAgent = USING_MONITORING_AGENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected Server server;

	/**
	 * The cached value of the '{@link #getHypervisor() <em>Hypervisor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypervisor()
	 * @generated
	 * @ordered
	 */
	protected Hypervisor hypervisor;

	/**
	 * The cached value of the '{@link #getVmType() <em>Vm Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmType()
	 * @generated
	 * @ordered
	 */
	protected VirtualMachineType vmType;

	/**
	 * The default value of the '{@link #getCertificatePassword() <em>Certificate Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificatePassword()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICATE_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificatePassword() <em>Certificate Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificatePassword()
	 * @generated
	 * @ordered
	 */
	protected String certificatePassword = CERTIFICATE_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastHealthTest() <em>Last Health Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastHealthTest()
	 * @generated
	 * @ordered
	 */
	protected static final DateMetricAttribute LAST_HEALTH_TEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastHealthTest() <em>Last Health Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastHealthTest()
	 * @generated
	 * @ordered
	 */
	protected DateMetricAttribute lastHealthTest = LAST_HEALTH_TEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getHealthTestStatus() <em>Health Test Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthTestStatus()
	 * @generated
	 * @ordered
	 */
	protected static final HealthTestStatus HEALTH_TEST_STATUS_EDEFAULT = HealthTestStatus.GREEN;

	/**
	 * The cached value of the '{@link #getHealthTestStatus() <em>Health Test Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthTestStatus()
	 * @generated
	 * @ordered
	 */
	protected HealthTestStatus healthTestStatus = HEALTH_TEST_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHealthTestMessageCode() <em>Health Test Message Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthTestMessageCode()
	 * @generated
	 * @ordered
	 */
	protected static final String HEALTH_TEST_MESSAGE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHealthTestMessageCode() <em>Health Test Message Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthTestMessageCode()
	 * @generated
	 * @ordered
	 */
	protected String healthTestMessageCode = HEALTH_TEST_MESSAGE_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcaeBasicServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServerPackage.Literals.DCAE_BASIC_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalState getOperationalState() {
		return operationalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationalState(OperationalState newOperationalState) {
		OperationalState oldOperationalState = operationalState;
		operationalState = newOperationalState == null ? OPERATIONAL_STATE_EDEFAULT : newOperationalState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.DCAE_BASIC_SERVER__OPERATIONAL_STATE, oldOperationalState, operationalState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogMessageContainerConfiguration getLogMessageConfiguration() {
		return logMessageConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogMessageConfiguration(LogMessageContainerConfiguration newLogMessageConfiguration, NotificationChain msgs) {
		LogMessageContainerConfiguration oldLogMessageConfiguration = logMessageConfiguration;
		logMessageConfiguration = newLogMessageConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CONFIGURATION, oldLogMessageConfiguration, newLogMessageConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogMessageConfiguration(LogMessageContainerConfiguration newLogMessageConfiguration) {
		if (newLogMessageConfiguration != logMessageConfiguration) {
			NotificationChain msgs = null;
			if (logMessageConfiguration != null)
				msgs = ((InternalEObject)logMessageConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CONFIGURATION, null, msgs);
			if (newLogMessageConfiguration != null)
				msgs = ((InternalEObject)newLogMessageConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CONFIGURATION, null, msgs);
			msgs = basicSetLogMessageConfiguration(newLogMessageConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CONFIGURATION, newLogMessageConfiguration, newLogMessageConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogMessageCategory> getLogMessageCategories() {
		if (logMessageCategories == null) {
			logMessageCategories = new EObjectContainmentEList<LogMessageCategory>(LogMessageCategory.class, this, ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CATEGORIES);
		}
		return logMessageCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogMessageStats> getLogMessageStats() {
		if (logMessageStats == null) {
			logMessageStats = new EObjectContainmentEList<LogMessageStats>(LogMessageStats.class, this, ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_STATS);
		}
		return logMessageStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateIp() {
		return privateIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateIp(String newPrivateIp) {
		String oldPrivateIp = privateIp;
		privateIp = newPrivateIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.DCAE_BASIC_SERVER__PRIVATE_IP, oldPrivateIp, privateIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicIp() {
		return publicIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicIp(String newPublicIp) {
		String oldPublicIp = publicIp;
		publicIp = newPublicIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.DCAE_BASIC_SERVER__PUBLIC_IP, oldPublicIp, publicIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdServer getCollectd() {
		return collectd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectd(CollectdServer newCollectd, NotificationChain msgs) {
		CollectdServer oldCollectd = collectd;
		collectd = newCollectd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServerPackage.DCAE_BASIC_SERVER__COLLECTD, oldCollectd, newCollectd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectd(CollectdServer newCollectd) {
		if (newCollectd != collectd) {
			NotificationChain msgs = null;
			if (collectd != null)
				msgs = ((InternalEObject)collectd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServerPackage.DCAE_BASIC_SERVER__COLLECTD, null, msgs);
			if (newCollectd != null)
				msgs = ((InternalEObject)newCollectd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServerPackage.DCAE_BASIC_SERVER__COLLECTD, null, msgs);
			msgs = basicSetCollectd(newCollectd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.DCAE_BASIC_SERVER__COLLECTD, newCollectd, newCollectd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentEList<Module>(Module.class, this, ServerPackage.DCAE_BASIC_SERVER__MODULES);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DcaeBasicServerNetwork> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<DcaeBasicServerNetwork>(DcaeBasicServerNetwork.class, this, ServerPackage.DCAE_BASIC_SERVER__NETWORKS);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateMetricAttribute getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastUpdate(DateMetricAttribute newLastUpdate) {
		DateMetricAttribute oldLastUpdate = lastUpdate;
		lastUpdate = newLastUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.DCAE_BASIC_SERVER__LAST_UPDATE, oldLastUpdate, lastUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUsingMonitoringAgent() {
		return usingMonitoringAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsingMonitoringAgent(boolean newUsingMonitoringAgent) {
		boolean oldUsingMonitoringAgent = usingMonitoringAgent;
		usingMonitoringAgent = newUsingMonitoringAgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.DCAE_BASIC_SERVER__USING_MONITORING_AGENT, oldUsingMonitoringAgent, usingMonitoringAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getServer() {
		if (server != null && server.eIsProxy()) {
			InternalEObject oldServer = (InternalEObject)server;
			server = (Server)eResolveProxy(oldServer);
			if (server != oldServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerPackage.DCAE_BASIC_SERVER__SERVER, oldServer, server));
			}
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(Server newServer) {
		Server oldServer = server;
		server = newServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.DCAE_BASIC_SERVER__SERVER, oldServer, server));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypervisor getHypervisor() {
		if (hypervisor != null && hypervisor.eIsProxy()) {
			InternalEObject oldHypervisor = (InternalEObject)hypervisor;
			hypervisor = (Hypervisor)eResolveProxy(oldHypervisor);
			if (hypervisor != oldHypervisor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerPackage.DCAE_BASIC_SERVER__HYPERVISOR, oldHypervisor, hypervisor));
			}
		}
		return hypervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypervisor basicGetHypervisor() {
		return hypervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHypervisor(Hypervisor newHypervisor) {
		Hypervisor oldHypervisor = hypervisor;
		hypervisor = newHypervisor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.DCAE_BASIC_SERVER__HYPERVISOR, oldHypervisor, hypervisor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachineType getVmType() {
		if (vmType != null && vmType.eIsProxy()) {
			InternalEObject oldVmType = (InternalEObject)vmType;
			vmType = (VirtualMachineType)eResolveProxy(oldVmType);
			if (vmType != oldVmType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerPackage.DCAE_BASIC_SERVER__VM_TYPE, oldVmType, vmType));
			}
		}
		return vmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachineType basicGetVmType() {
		return vmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmType(VirtualMachineType newVmType) {
		VirtualMachineType oldVmType = vmType;
		vmType = newVmType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.DCAE_BASIC_SERVER__VM_TYPE, oldVmType, vmType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCertificatePassword() {
		return certificatePassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificatePassword(String newCertificatePassword) {
		String oldCertificatePassword = certificatePassword;
		certificatePassword = newCertificatePassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.DCAE_BASIC_SERVER__CERTIFICATE_PASSWORD, oldCertificatePassword, certificatePassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateMetricAttribute getLastHealthTest() {
		return lastHealthTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastHealthTest(DateMetricAttribute newLastHealthTest) {
		DateMetricAttribute oldLastHealthTest = lastHealthTest;
		lastHealthTest = newLastHealthTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.DCAE_BASIC_SERVER__LAST_HEALTH_TEST, oldLastHealthTest, lastHealthTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthTestStatus getHealthTestStatus() {
		return healthTestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthTestStatus(HealthTestStatus newHealthTestStatus) {
		HealthTestStatus oldHealthTestStatus = healthTestStatus;
		healthTestStatus = newHealthTestStatus == null ? HEALTH_TEST_STATUS_EDEFAULT : newHealthTestStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.DCAE_BASIC_SERVER__HEALTH_TEST_STATUS, oldHealthTestStatus, healthTestStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHealthTestMessageCode() {
		return healthTestMessageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthTestMessageCode(String newHealthTestMessageCode) {
		String oldHealthTestMessageCode = healthTestMessageCode;
		healthTestMessageCode = newHealthTestMessageCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.DCAE_BASIC_SERVER__HEALTH_TEST_MESSAGE_CODE, oldHealthTestMessageCode, healthTestMessageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CONFIGURATION:
				return basicSetLogMessageConfiguration(null, msgs);
			case ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CATEGORIES:
				return ((InternalEList<?>)getLogMessageCategories()).basicRemove(otherEnd, msgs);
			case ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_STATS:
				return ((InternalEList<?>)getLogMessageStats()).basicRemove(otherEnd, msgs);
			case ServerPackage.DCAE_BASIC_SERVER__COLLECTD:
				return basicSetCollectd(null, msgs);
			case ServerPackage.DCAE_BASIC_SERVER__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
			case ServerPackage.DCAE_BASIC_SERVER__NETWORKS:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
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
			case ServerPackage.DCAE_BASIC_SERVER__OPERATIONAL_STATE:
				return getOperationalState();
			case ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CONFIGURATION:
				return getLogMessageConfiguration();
			case ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CATEGORIES:
				return getLogMessageCategories();
			case ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_STATS:
				return getLogMessageStats();
			case ServerPackage.DCAE_BASIC_SERVER__PRIVATE_IP:
				return getPrivateIp();
			case ServerPackage.DCAE_BASIC_SERVER__PUBLIC_IP:
				return getPublicIp();
			case ServerPackage.DCAE_BASIC_SERVER__COLLECTD:
				return getCollectd();
			case ServerPackage.DCAE_BASIC_SERVER__MODULES:
				return getModules();
			case ServerPackage.DCAE_BASIC_SERVER__NETWORKS:
				return getNetworks();
			case ServerPackage.DCAE_BASIC_SERVER__LAST_UPDATE:
				return getLastUpdate();
			case ServerPackage.DCAE_BASIC_SERVER__USING_MONITORING_AGENT:
				return isUsingMonitoringAgent();
			case ServerPackage.DCAE_BASIC_SERVER__SERVER:
				if (resolve) return getServer();
				return basicGetServer();
			case ServerPackage.DCAE_BASIC_SERVER__HYPERVISOR:
				if (resolve) return getHypervisor();
				return basicGetHypervisor();
			case ServerPackage.DCAE_BASIC_SERVER__VM_TYPE:
				if (resolve) return getVmType();
				return basicGetVmType();
			case ServerPackage.DCAE_BASIC_SERVER__CERTIFICATE_PASSWORD:
				return getCertificatePassword();
			case ServerPackage.DCAE_BASIC_SERVER__LAST_HEALTH_TEST:
				return getLastHealthTest();
			case ServerPackage.DCAE_BASIC_SERVER__HEALTH_TEST_STATUS:
				return getHealthTestStatus();
			case ServerPackage.DCAE_BASIC_SERVER__HEALTH_TEST_MESSAGE_CODE:
				return getHealthTestMessageCode();
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
			case ServerPackage.DCAE_BASIC_SERVER__OPERATIONAL_STATE:
				setOperationalState((OperationalState)newValue);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CONFIGURATION:
				setLogMessageConfiguration((LogMessageContainerConfiguration)newValue);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CATEGORIES:
				getLogMessageCategories().clear();
				getLogMessageCategories().addAll((Collection<? extends LogMessageCategory>)newValue);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_STATS:
				getLogMessageStats().clear();
				getLogMessageStats().addAll((Collection<? extends LogMessageStats>)newValue);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__PRIVATE_IP:
				setPrivateIp((String)newValue);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__PUBLIC_IP:
				setPublicIp((String)newValue);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__COLLECTD:
				setCollectd((CollectdServer)newValue);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends Module>)newValue);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends DcaeBasicServerNetwork>)newValue);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__LAST_UPDATE:
				setLastUpdate((DateMetricAttribute)newValue);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__USING_MONITORING_AGENT:
				setUsingMonitoringAgent((Boolean)newValue);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__SERVER:
				setServer((Server)newValue);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__HYPERVISOR:
				setHypervisor((Hypervisor)newValue);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__VM_TYPE:
				setVmType((VirtualMachineType)newValue);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__CERTIFICATE_PASSWORD:
				setCertificatePassword((String)newValue);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__LAST_HEALTH_TEST:
				setLastHealthTest((DateMetricAttribute)newValue);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__HEALTH_TEST_STATUS:
				setHealthTestStatus((HealthTestStatus)newValue);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__HEALTH_TEST_MESSAGE_CODE:
				setHealthTestMessageCode((String)newValue);
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
			case ServerPackage.DCAE_BASIC_SERVER__OPERATIONAL_STATE:
				setOperationalState(OPERATIONAL_STATE_EDEFAULT);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CONFIGURATION:
				setLogMessageConfiguration((LogMessageContainerConfiguration)null);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CATEGORIES:
				getLogMessageCategories().clear();
				return;
			case ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_STATS:
				getLogMessageStats().clear();
				return;
			case ServerPackage.DCAE_BASIC_SERVER__PRIVATE_IP:
				setPrivateIp(PRIVATE_IP_EDEFAULT);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__PUBLIC_IP:
				setPublicIp(PUBLIC_IP_EDEFAULT);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__COLLECTD:
				setCollectd((CollectdServer)null);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__MODULES:
				getModules().clear();
				return;
			case ServerPackage.DCAE_BASIC_SERVER__NETWORKS:
				getNetworks().clear();
				return;
			case ServerPackage.DCAE_BASIC_SERVER__LAST_UPDATE:
				setLastUpdate(LAST_UPDATE_EDEFAULT);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__USING_MONITORING_AGENT:
				setUsingMonitoringAgent(USING_MONITORING_AGENT_EDEFAULT);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__SERVER:
				setServer((Server)null);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__HYPERVISOR:
				setHypervisor((Hypervisor)null);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__VM_TYPE:
				setVmType((VirtualMachineType)null);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__CERTIFICATE_PASSWORD:
				setCertificatePassword(CERTIFICATE_PASSWORD_EDEFAULT);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__LAST_HEALTH_TEST:
				setLastHealthTest(LAST_HEALTH_TEST_EDEFAULT);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__HEALTH_TEST_STATUS:
				setHealthTestStatus(HEALTH_TEST_STATUS_EDEFAULT);
				return;
			case ServerPackage.DCAE_BASIC_SERVER__HEALTH_TEST_MESSAGE_CODE:
				setHealthTestMessageCode(HEALTH_TEST_MESSAGE_CODE_EDEFAULT);
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
			case ServerPackage.DCAE_BASIC_SERVER__OPERATIONAL_STATE:
				return operationalState != OPERATIONAL_STATE_EDEFAULT;
			case ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CONFIGURATION:
				return logMessageConfiguration != null;
			case ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CATEGORIES:
				return logMessageCategories != null && !logMessageCategories.isEmpty();
			case ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_STATS:
				return logMessageStats != null && !logMessageStats.isEmpty();
			case ServerPackage.DCAE_BASIC_SERVER__PRIVATE_IP:
				return PRIVATE_IP_EDEFAULT == null ? privateIp != null : !PRIVATE_IP_EDEFAULT.equals(privateIp);
			case ServerPackage.DCAE_BASIC_SERVER__PUBLIC_IP:
				return PUBLIC_IP_EDEFAULT == null ? publicIp != null : !PUBLIC_IP_EDEFAULT.equals(publicIp);
			case ServerPackage.DCAE_BASIC_SERVER__COLLECTD:
				return collectd != null;
			case ServerPackage.DCAE_BASIC_SERVER__MODULES:
				return modules != null && !modules.isEmpty();
			case ServerPackage.DCAE_BASIC_SERVER__NETWORKS:
				return networks != null && !networks.isEmpty();
			case ServerPackage.DCAE_BASIC_SERVER__LAST_UPDATE:
				return LAST_UPDATE_EDEFAULT == null ? lastUpdate != null : !LAST_UPDATE_EDEFAULT.equals(lastUpdate);
			case ServerPackage.DCAE_BASIC_SERVER__USING_MONITORING_AGENT:
				return usingMonitoringAgent != USING_MONITORING_AGENT_EDEFAULT;
			case ServerPackage.DCAE_BASIC_SERVER__SERVER:
				return server != null;
			case ServerPackage.DCAE_BASIC_SERVER__HYPERVISOR:
				return hypervisor != null;
			case ServerPackage.DCAE_BASIC_SERVER__VM_TYPE:
				return vmType != null;
			case ServerPackage.DCAE_BASIC_SERVER__CERTIFICATE_PASSWORD:
				return CERTIFICATE_PASSWORD_EDEFAULT == null ? certificatePassword != null : !CERTIFICATE_PASSWORD_EDEFAULT.equals(certificatePassword);
			case ServerPackage.DCAE_BASIC_SERVER__LAST_HEALTH_TEST:
				return LAST_HEALTH_TEST_EDEFAULT == null ? lastHealthTest != null : !LAST_HEALTH_TEST_EDEFAULT.equals(lastHealthTest);
			case ServerPackage.DCAE_BASIC_SERVER__HEALTH_TEST_STATUS:
				return healthTestStatus != HEALTH_TEST_STATUS_EDEFAULT;
			case ServerPackage.DCAE_BASIC_SERVER__HEALTH_TEST_MESSAGE_CODE:
				return HEALTH_TEST_MESSAGE_CODE_EDEFAULT == null ? healthTestMessageCode != null : !HEALTH_TEST_MESSAGE_CODE_EDEFAULT.equals(healthTestMessageCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == HasOperationalState.class) {
			switch (derivedFeatureID) {
				case ServerPackage.DCAE_BASIC_SERVER__OPERATIONAL_STATE: return CorePackage.HAS_OPERATIONAL_STATE__OPERATIONAL_STATE;
				default: return -1;
			}
		}
		if (baseClass == LogMessageContainer.class) {
			switch (derivedFeatureID) {
				case ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CONFIGURATION: return LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CONFIGURATION;
				case ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CATEGORIES: return LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CATEGORIES;
				case ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_STATS: return LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_STATS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == HasOperationalState.class) {
			switch (baseFeatureID) {
				case CorePackage.HAS_OPERATIONAL_STATE__OPERATIONAL_STATE: return ServerPackage.DCAE_BASIC_SERVER__OPERATIONAL_STATE;
				default: return -1;
			}
		}
		if (baseClass == LogMessageContainer.class) {
			switch (baseFeatureID) {
				case LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CONFIGURATION: return ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CONFIGURATION;
				case LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_CATEGORIES: return ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_CATEGORIES;
				case LogsPackage.LOG_MESSAGE_CONTAINER__LOG_MESSAGE_STATS: return ServerPackage.DCAE_BASIC_SERVER__LOG_MESSAGE_STATS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (operationalState: ");
		result.append(operationalState);
		result.append(", privateIp: ");
		result.append(privateIp);
		result.append(", publicIp: ");
		result.append(publicIp);
		result.append(", lastUpdate: ");
		result.append(lastUpdate);
		result.append(", usingMonitoringAgent: ");
		result.append(usingMonitoringAgent);
		result.append(", certificatePassword: ");
		result.append(certificatePassword);
		result.append(", lastHealthTest: ");
		result.append(lastHealthTest);
		result.append(", healthTestStatus: ");
		result.append(healthTestStatus);
		result.append(", healthTestMessageCode: ");
		result.append(healthTestMessageCode);
		result.append(')');
		return result.toString();
	}

} //DcaeBasicServerImpl
