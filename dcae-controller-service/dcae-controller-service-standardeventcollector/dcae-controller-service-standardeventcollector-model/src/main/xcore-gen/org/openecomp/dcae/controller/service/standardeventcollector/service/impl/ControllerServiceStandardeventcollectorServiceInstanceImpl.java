
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
package org.openecomp.dcae.controller.service.standardeventcollector.service.impl;

import org.openecomp.dcae.controller.service.docker.impl.DockerServiceInstanceImpl;

import org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration;
import org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceInstance;
import org.openecomp.dcae.controller.service.standardeventcollector.service.ServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Service Standardeventcollector Service Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceInstanceImpl#getCport <em>Cport</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceInstanceImpl#getCsecport <em>Csecport</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceInstanceImpl#getKeystoreloc <em>Keystoreloc</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceInstanceImpl#getKeystorepwd <em>Keystorepwd</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceInstanceImpl#getMaxinputqueue <em>Maxinputqueue</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceInstanceImpl#getAuthid <em>Authid</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceInstanceImpl#getAuthflag <em>Authflag</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceInstanceImpl#getAuthpwd <em>Authpwd</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceInstanceImpl#getAuthfile <em>Authfile</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceInstanceImpl#getCheckschemaflag <em>Checkschemaflag</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceInstanceImpl#getSchemafile <em>Schemafile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerServiceStandardeventcollectorServiceInstanceImpl extends DockerServiceInstanceImpl implements ControllerServiceStandardeventcollectorServiceInstance {
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
	protected ControllerServiceStandardeventcollectorServiceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CPORT, oldCport, cport));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CSECPORT, oldCsecport, csecport));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__KEYSTORELOC, oldKeystoreloc, keystoreloc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__KEYSTOREPWD, oldKeystorepwd, keystorepwd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__MAXINPUTQUEUE, oldMaxinputqueue, maxinputqueue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHID, oldAuthid, authid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHFLAG, oldAuthflag, authflag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHPWD, oldAuthpwd, authpwd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHFILE, oldAuthfile, authfile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CHECKSCHEMAFLAG, oldCheckschemaflag, checkschemaflag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__SCHEMAFILE, oldSchemafile, schemafile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CPORT:
				return getCport();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CSECPORT:
				return getCsecport();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__KEYSTORELOC:
				return getKeystoreloc();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__KEYSTOREPWD:
				return getKeystorepwd();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__MAXINPUTQUEUE:
				return getMaxinputqueue();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHID:
				return getAuthid();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHFLAG:
				return getAuthflag();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHPWD:
				return getAuthpwd();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHFILE:
				return getAuthfile();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CHECKSCHEMAFLAG:
				return getCheckschemaflag();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__SCHEMAFILE:
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
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CPORT:
				setCport((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CSECPORT:
				setCsecport((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__KEYSTORELOC:
				setKeystoreloc((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__KEYSTOREPWD:
				setKeystorepwd((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__MAXINPUTQUEUE:
				setMaxinputqueue((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHID:
				setAuthid((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHFLAG:
				setAuthflag((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHPWD:
				setAuthpwd((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHFILE:
				setAuthfile((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CHECKSCHEMAFLAG:
				setCheckschemaflag((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__SCHEMAFILE:
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
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CPORT:
				setCport(CPORT_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CSECPORT:
				setCsecport(CSECPORT_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__KEYSTORELOC:
				setKeystoreloc(KEYSTORELOC_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__KEYSTOREPWD:
				setKeystorepwd(KEYSTOREPWD_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__MAXINPUTQUEUE:
				setMaxinputqueue(MAXINPUTQUEUE_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHID:
				setAuthid(AUTHID_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHFLAG:
				setAuthflag(AUTHFLAG_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHPWD:
				setAuthpwd(AUTHPWD_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHFILE:
				setAuthfile(AUTHFILE_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CHECKSCHEMAFLAG:
				setCheckschemaflag(CHECKSCHEMAFLAG_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__SCHEMAFILE:
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
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CPORT:
				return CPORT_EDEFAULT == null ? cport != null : !CPORT_EDEFAULT.equals(cport);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CSECPORT:
				return CSECPORT_EDEFAULT == null ? csecport != null : !CSECPORT_EDEFAULT.equals(csecport);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__KEYSTORELOC:
				return KEYSTORELOC_EDEFAULT == null ? keystoreloc != null : !KEYSTORELOC_EDEFAULT.equals(keystoreloc);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__KEYSTOREPWD:
				return KEYSTOREPWD_EDEFAULT == null ? keystorepwd != null : !KEYSTOREPWD_EDEFAULT.equals(keystorepwd);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__MAXINPUTQUEUE:
				return MAXINPUTQUEUE_EDEFAULT == null ? maxinputqueue != null : !MAXINPUTQUEUE_EDEFAULT.equals(maxinputqueue);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHID:
				return AUTHID_EDEFAULT == null ? authid != null : !AUTHID_EDEFAULT.equals(authid);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHFLAG:
				return AUTHFLAG_EDEFAULT == null ? authflag != null : !AUTHFLAG_EDEFAULT.equals(authflag);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHPWD:
				return AUTHPWD_EDEFAULT == null ? authpwd != null : !AUTHPWD_EDEFAULT.equals(authpwd);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHFILE:
				return AUTHFILE_EDEFAULT == null ? authfile != null : !AUTHFILE_EDEFAULT.equals(authfile);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CHECKSCHEMAFLAG:
				return CHECKSCHEMAFLAG_EDEFAULT == null ? checkschemaflag != null : !CHECKSCHEMAFLAG_EDEFAULT.equals(checkschemaflag);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__SCHEMAFILE:
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
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CPORT: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CPORT;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CSECPORT: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CSECPORT;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__KEYSTORELOC: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTORELOC;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__KEYSTOREPWD: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREPWD;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__MAXINPUTQUEUE: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__MAXINPUTQUEUE;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHID: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHID;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHFLAG: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHFLAG;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHPWD: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHPWD;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHFILE: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHFILE;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CHECKSCHEMAFLAG: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CHECKSCHEMAFLAG;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__SCHEMAFILE: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__SCHEMAFILE;
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
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CPORT: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CPORT;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CSECPORT: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CSECPORT;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTORELOC: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__KEYSTORELOC;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREPWD: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__KEYSTOREPWD;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__MAXINPUTQUEUE: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__MAXINPUTQUEUE;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHID: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHID;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHFLAG: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHFLAG;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHPWD: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHPWD;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHFILE: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__AUTHFILE;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CHECKSCHEMAFLAG: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__CHECKSCHEMAFLAG;
				case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__SCHEMAFILE: return ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_INSTANCE__SCHEMAFILE;
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

} //ControllerServiceStandardeventcollectorServiceInstanceImpl
