
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
package org.openecomp.dcae.controller.service.standardeventcollector.manager.impl;

import org.openecomp.dcae.controller.service.dockermanager.impl.DockerManagerImpl;

import org.openecomp.dcae.controller.service.standardeventcollector.manager.ControllerServiceStandardeventcollectorManager;
import org.openecomp.dcae.controller.service.standardeventcollector.manager.ManagerPackage;

import org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration;
import org.openecomp.dcae.controller.service.standardeventcollector.service.ServicePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Service Standardeventcollector Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ControllerServiceStandardeventcollectorManagerImpl#getCport <em>Cport</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ControllerServiceStandardeventcollectorManagerImpl#getCsecport <em>Csecport</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ControllerServiceStandardeventcollectorManagerImpl#getKeystoreloc <em>Keystoreloc</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ControllerServiceStandardeventcollectorManagerImpl#getKeystorepwd <em>Keystorepwd</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ControllerServiceStandardeventcollectorManagerImpl#getMaxinputqueue <em>Maxinputqueue</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ControllerServiceStandardeventcollectorManagerImpl#getAuthid <em>Authid</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ControllerServiceStandardeventcollectorManagerImpl#getAuthflag <em>Authflag</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ControllerServiceStandardeventcollectorManagerImpl#getAuthpwd <em>Authpwd</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ControllerServiceStandardeventcollectorManagerImpl#getAuthfile <em>Authfile</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ControllerServiceStandardeventcollectorManagerImpl#getCheckschemaflag <em>Checkschemaflag</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.manager.impl.ControllerServiceStandardeventcollectorManagerImpl#getSchemafile <em>Schemafile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerServiceStandardeventcollectorManagerImpl extends DockerManagerImpl implements ControllerServiceStandardeventcollectorManager {
	/**
	 * The default value of the '{@link #getCport() <em>Cport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCport()
	 * @generated
	 * @ordered
	 */
	protected static final String CPORT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCport() <em>Cport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCport()
	 * @generated
	 * @ordered
	 */
	protected String cport = CPORT_EDEFAULT;
	/**
	 * The default value of the '{@link #getCsecport() <em>Csecport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsecport()
	 * @generated
	 * @ordered
	 */
	protected static final String CSECPORT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCsecport() <em>Csecport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsecport()
	 * @generated
	 * @ordered
	 */
	protected String csecport = CSECPORT_EDEFAULT;
	/**
	 * The default value of the '{@link #getKeystoreloc() <em>Keystoreloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeystoreloc()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYSTORELOC_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getKeystoreloc() <em>Keystoreloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeystoreloc()
	 * @generated
	 * @ordered
	 */
	protected String keystoreloc = KEYSTORELOC_EDEFAULT;
	/**
	 * The default value of the '{@link #getKeystorepwd() <em>Keystorepwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeystorepwd()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYSTOREPWD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getKeystorepwd() <em>Keystorepwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeystorepwd()
	 * @generated
	 * @ordered
	 */
	protected String keystorepwd = KEYSTOREPWD_EDEFAULT;
	/**
	 * The default value of the '{@link #getMaxinputqueue() <em>Maxinputqueue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxinputqueue()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXINPUTQUEUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMaxinputqueue() <em>Maxinputqueue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxinputqueue()
	 * @generated
	 * @ordered
	 */
	protected String maxinputqueue = MAXINPUTQUEUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getAuthid() <em>Authid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthid()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAuthid() <em>Authid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthid()
	 * @generated
	 * @ordered
	 */
	protected String authid = AUTHID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAuthflag() <em>Authflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthflag()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHFLAG_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAuthflag() <em>Authflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthflag()
	 * @generated
	 * @ordered
	 */
	protected String authflag = AUTHFLAG_EDEFAULT;
	/**
	 * The default value of the '{@link #getAuthpwd() <em>Authpwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthpwd()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHPWD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAuthpwd() <em>Authpwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthpwd()
	 * @generated
	 * @ordered
	 */
	protected String authpwd = AUTHPWD_EDEFAULT;
	/**
	 * The default value of the '{@link #getAuthfile() <em>Authfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthfile()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHFILE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAuthfile() <em>Authfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthfile()
	 * @generated
	 * @ordered
	 */
	protected String authfile = AUTHFILE_EDEFAULT;
	/**
	 * The default value of the '{@link #getCheckschemaflag() <em>Checkschemaflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckschemaflag()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECKSCHEMAFLAG_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCheckschemaflag() <em>Checkschemaflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckschemaflag()
	 * @generated
	 * @ordered
	 */
	protected String checkschemaflag = CHECKSCHEMAFLAG_EDEFAULT;
	/**
	 * The default value of the '{@link #getSchemafile() <em>Schemafile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemafile()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMAFILE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSchemafile() <em>Schemafile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemafile()
	 * @generated
	 * @ordered
	 */
	protected String schemafile = SCHEMAFILE_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerServiceStandardeventcollectorManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManagerPackage.Literals.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCport() {
		return cport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCport(String newCport) {
		String oldCport = cport;
		cport = newCport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CPORT, oldCport, cport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCsecport() {
		return csecport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsecport(String newCsecport) {
		String oldCsecport = csecport;
		csecport = newCsecport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CSECPORT, oldCsecport, csecport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeystoreloc() {
		return keystoreloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeystoreloc(String newKeystoreloc) {
		String oldKeystoreloc = keystoreloc;
		keystoreloc = newKeystoreloc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__KEYSTORELOC, oldKeystoreloc, keystoreloc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeystorepwd() {
		return keystorepwd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeystorepwd(String newKeystorepwd) {
		String oldKeystorepwd = keystorepwd;
		keystorepwd = newKeystorepwd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__KEYSTOREPWD, oldKeystorepwd, keystorepwd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxinputqueue() {
		return maxinputqueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxinputqueue(String newMaxinputqueue) {
		String oldMaxinputqueue = maxinputqueue;
		maxinputqueue = newMaxinputqueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__MAXINPUTQUEUE, oldMaxinputqueue, maxinputqueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthid() {
		return authid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthid(String newAuthid) {
		String oldAuthid = authid;
		authid = newAuthid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHID, oldAuthid, authid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthflag() {
		return authflag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthflag(String newAuthflag) {
		String oldAuthflag = authflag;
		authflag = newAuthflag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHFLAG, oldAuthflag, authflag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthpwd() {
		return authpwd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthpwd(String newAuthpwd) {
		String oldAuthpwd = authpwd;
		authpwd = newAuthpwd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHPWD, oldAuthpwd, authpwd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthfile() {
		return authfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthfile(String newAuthfile) {
		String oldAuthfile = authfile;
		authfile = newAuthfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHFILE, oldAuthfile, authfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckschemaflag() {
		return checkschemaflag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckschemaflag(String newCheckschemaflag) {
		String oldCheckschemaflag = checkschemaflag;
		checkschemaflag = newCheckschemaflag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CHECKSCHEMAFLAG, oldCheckschemaflag, checkschemaflag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemafile() {
		return schemafile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemafile(String newSchemafile) {
		String oldSchemafile = schemafile;
		schemafile = newSchemafile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__SCHEMAFILE, oldSchemafile, schemafile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CPORT:
				return getCport();
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CSECPORT:
				return getCsecport();
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__KEYSTORELOC:
				return getKeystoreloc();
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__KEYSTOREPWD:
				return getKeystorepwd();
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__MAXINPUTQUEUE:
				return getMaxinputqueue();
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHID:
				return getAuthid();
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHFLAG:
				return getAuthflag();
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHPWD:
				return getAuthpwd();
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHFILE:
				return getAuthfile();
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CHECKSCHEMAFLAG:
				return getCheckschemaflag();
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__SCHEMAFILE:
				return getSchemafile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CPORT:
				setCport((String)newValue);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CSECPORT:
				setCsecport((String)newValue);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__KEYSTORELOC:
				setKeystoreloc((String)newValue);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__KEYSTOREPWD:
				setKeystorepwd((String)newValue);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__MAXINPUTQUEUE:
				setMaxinputqueue((String)newValue);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHID:
				setAuthid((String)newValue);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHFLAG:
				setAuthflag((String)newValue);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHPWD:
				setAuthpwd((String)newValue);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHFILE:
				setAuthfile((String)newValue);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CHECKSCHEMAFLAG:
				setCheckschemaflag((String)newValue);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__SCHEMAFILE:
				setSchemafile((String)newValue);
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
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CPORT:
				setCport(CPORT_EDEFAULT);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CSECPORT:
				setCsecport(CSECPORT_EDEFAULT);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__KEYSTORELOC:
				setKeystoreloc(KEYSTORELOC_EDEFAULT);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__KEYSTOREPWD:
				setKeystorepwd(KEYSTOREPWD_EDEFAULT);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__MAXINPUTQUEUE:
				setMaxinputqueue(MAXINPUTQUEUE_EDEFAULT);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHID:
				setAuthid(AUTHID_EDEFAULT);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHFLAG:
				setAuthflag(AUTHFLAG_EDEFAULT);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHPWD:
				setAuthpwd(AUTHPWD_EDEFAULT);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHFILE:
				setAuthfile(AUTHFILE_EDEFAULT);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CHECKSCHEMAFLAG:
				setCheckschemaflag(CHECKSCHEMAFLAG_EDEFAULT);
				return;
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__SCHEMAFILE:
				setSchemafile(SCHEMAFILE_EDEFAULT);
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
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CPORT:
				return CPORT_EDEFAULT == null ? cport != null : !CPORT_EDEFAULT.equals(cport);
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CSECPORT:
				return CSECPORT_EDEFAULT == null ? csecport != null : !CSECPORT_EDEFAULT.equals(csecport);
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__KEYSTORELOC:
				return KEYSTORELOC_EDEFAULT == null ? keystoreloc != null : !KEYSTORELOC_EDEFAULT.equals(keystoreloc);
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__KEYSTOREPWD:
				return KEYSTOREPWD_EDEFAULT == null ? keystorepwd != null : !KEYSTOREPWD_EDEFAULT.equals(keystorepwd);
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__MAXINPUTQUEUE:
				return MAXINPUTQUEUE_EDEFAULT == null ? maxinputqueue != null : !MAXINPUTQUEUE_EDEFAULT.equals(maxinputqueue);
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHID:
				return AUTHID_EDEFAULT == null ? authid != null : !AUTHID_EDEFAULT.equals(authid);
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHFLAG:
				return AUTHFLAG_EDEFAULT == null ? authflag != null : !AUTHFLAG_EDEFAULT.equals(authflag);
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHPWD:
				return AUTHPWD_EDEFAULT == null ? authpwd != null : !AUTHPWD_EDEFAULT.equals(authpwd);
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHFILE:
				return AUTHFILE_EDEFAULT == null ? authfile != null : !AUTHFILE_EDEFAULT.equals(authfile);
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CHECKSCHEMAFLAG:
				return CHECKSCHEMAFLAG_EDEFAULT == null ? checkschemaflag != null : !CHECKSCHEMAFLAG_EDEFAULT.equals(checkschemaflag);
			case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__SCHEMAFILE:
				return SCHEMAFILE_EDEFAULT == null ? schemafile != null : !SCHEMAFILE_EDEFAULT.equals(schemafile);
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
		if (baseClass == ControllerServiceStandardeventcollectorServiceConfiguration.class) {
			switch (derivedFeatureID) {
				case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CPORT: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CPORT;
				case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CSECPORT: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CSECPORT;
				case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__KEYSTORELOC: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTORELOC;
				case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__KEYSTOREPWD: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREPWD;
				case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__MAXINPUTQUEUE: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__MAXINPUTQUEUE;
				case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHID: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHID;
				case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHFLAG: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHFLAG;
				case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHPWD: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHPWD;
				case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHFILE: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHFILE;
				case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CHECKSCHEMAFLAG: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CHECKSCHEMAFLAG;
				case ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__SCHEMAFILE: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__SCHEMAFILE;
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
		if (baseClass == ControllerServiceStandardeventcollectorServiceConfiguration.class) {
			switch (baseFeatureID) {
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CPORT: return ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CPORT;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CSECPORT: return ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CSECPORT;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTORELOC: return ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__KEYSTORELOC;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREPWD: return ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__KEYSTOREPWD;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__MAXINPUTQUEUE: return ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__MAXINPUTQUEUE;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHID: return ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHID;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHFLAG: return ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHFLAG;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHPWD: return ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHPWD;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHFILE: return ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__AUTHFILE;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CHECKSCHEMAFLAG: return ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__CHECKSCHEMAFLAG;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__SCHEMAFILE: return ManagerPackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_MANAGER__SCHEMAFILE;
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
		result.append(" (cport: ");
		result.append(cport);
		result.append(", csecport: ");
		result.append(csecport);
		result.append(", keystoreloc: ");
		result.append(keystoreloc);
		result.append(", keystorepwd: ");
		result.append(keystorepwd);
		result.append(", maxinputqueue: ");
		result.append(maxinputqueue);
		result.append(", authid: ");
		result.append(authid);
		result.append(", authflag: ");
		result.append(authflag);
		result.append(", authpwd: ");
		result.append(authpwd);
		result.append(", authfile: ");
		result.append(authfile);
		result.append(", checkschemaflag: ");
		result.append(checkschemaflag);
		result.append(", schemafile: ");
		result.append(schemafile);
		result.append(')');
		return result.toString();
	}

} //ControllerServiceStandardeventcollectorManagerImpl
