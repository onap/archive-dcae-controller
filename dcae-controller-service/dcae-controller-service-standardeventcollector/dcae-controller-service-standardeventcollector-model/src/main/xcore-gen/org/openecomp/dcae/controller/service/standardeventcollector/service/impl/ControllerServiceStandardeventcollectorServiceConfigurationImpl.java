
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

import org.openecomp.dcae.controller.service.standardeventcollector.service.ControllerServiceStandardeventcollectorServiceConfiguration;
import org.openecomp.dcae.controller.service.standardeventcollector.service.ServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Service Standardeventcollector Service Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceConfigurationImpl#getCport <em>Cport</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceConfigurationImpl#getCsecport <em>Csecport</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceConfigurationImpl#getKeystoreloc <em>Keystoreloc</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceConfigurationImpl#getKeystorealias <em>Keystorealias</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceConfigurationImpl#getKeystorepwdloc <em>Keystorepwdloc</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceConfigurationImpl#getMaxinputqueue <em>Maxinputqueue</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceConfigurationImpl#getAuthflag <em>Authflag</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceConfigurationImpl#getAuthlist <em>Authlist</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceConfigurationImpl#getCheckschemaflag <em>Checkschemaflag</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceConfigurationImpl#getSchemafile <em>Schemafile</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.standardeventcollector.service.impl.ControllerServiceStandardeventcollectorServiceConfigurationImpl#getStreamid <em>Streamid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerServiceStandardeventcollectorServiceConfigurationImpl extends MinimalEObjectImpl.Container implements ControllerServiceStandardeventcollectorServiceConfiguration {
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
	 * The default value of the '{@link #getKeystorealias() <em>Keystorealias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeystorealias()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYSTOREALIAS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getKeystorealias() <em>Keystorealias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeystorealias()
	 * @generated
	 * @ordered
	 */
	protected String keystorealias = KEYSTOREALIAS_EDEFAULT;
	/**
	 * The default value of the '{@link #getKeystorepwdloc() <em>Keystorepwdloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeystorepwdloc()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYSTOREPWDLOC_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getKeystorepwdloc() <em>Keystorepwdloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeystorepwdloc()
	 * @generated
	 * @ordered
	 */
	protected String keystorepwdloc = KEYSTOREPWDLOC_EDEFAULT;
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
	 * The default value of the '{@link #getAuthlist() <em>Authlist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthlist()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHLIST_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAuthlist() <em>Authlist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthlist()
	 * @generated
	 * @ordered
	 */
	protected String authlist = AUTHLIST_EDEFAULT;
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
	 * The default value of the '{@link #getStreamid() <em>Streamid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamid()
	 * @generated
	 * @ordered
	 */
	protected static final String STREAMID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStreamid() <em>Streamid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamid()
	 * @generated
	 * @ordered
	 */
	protected String streamid = STREAMID_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerServiceStandardeventcollectorServiceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CPORT, oldCport, cport));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CSECPORT, oldCsecport, csecport));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTORELOC, oldKeystoreloc, keystoreloc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeystorealias() {
		return keystorealias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeystorealias(String newKeystorealias) {
		String oldKeystorealias = keystorealias;
		keystorealias = newKeystorealias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREALIAS, oldKeystorealias, keystorealias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeystorepwdloc() {
		return keystorepwdloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeystorepwdloc(String newKeystorepwdloc) {
		String oldKeystorepwdloc = keystorepwdloc;
		keystorepwdloc = newKeystorepwdloc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREPWDLOC, oldKeystorepwdloc, keystorepwdloc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__MAXINPUTQUEUE, oldMaxinputqueue, maxinputqueue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHFLAG, oldAuthflag, authflag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CHECKSCHEMAFLAG, oldCheckschemaflag, checkschemaflag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__SCHEMAFILE, oldSchemafile, schemafile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthlist() {
		return authlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthlist(String newAuthlist) {
		String oldAuthlist = authlist;
		authlist = newAuthlist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHLIST, oldAuthlist, authlist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreamid() {
		return streamid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreamid(String newStreamid) {
		String oldStreamid = streamid;
		streamid = newStreamid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__STREAMID, oldStreamid, streamid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CPORT:
				return getCport();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CSECPORT:
				return getCsecport();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTORELOC:
				return getKeystoreloc();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREALIAS:
				return getKeystorealias();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREPWDLOC:
				return getKeystorepwdloc();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__MAXINPUTQUEUE:
				return getMaxinputqueue();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHFLAG:
				return getAuthflag();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHLIST:
				return getAuthlist();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CHECKSCHEMAFLAG:
				return getCheckschemaflag();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__SCHEMAFILE:
				return getSchemafile();
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__STREAMID:
				return getStreamid();
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
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CPORT:
				setCport((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CSECPORT:
				setCsecport((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTORELOC:
				setKeystoreloc((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREALIAS:
				setKeystorealias((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREPWDLOC:
				setKeystorepwdloc((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__MAXINPUTQUEUE:
				setMaxinputqueue((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHFLAG:
				setAuthflag((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHLIST:
				setAuthlist((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CHECKSCHEMAFLAG:
				setCheckschemaflag((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__SCHEMAFILE:
				setSchemafile((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__STREAMID:
				setStreamid((String)newValue);
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
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CPORT:
				setCport(CPORT_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CSECPORT:
				setCsecport(CSECPORT_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTORELOC:
				setKeystoreloc(KEYSTORELOC_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREALIAS:
				setKeystorealias(KEYSTOREALIAS_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREPWDLOC:
				setKeystorepwdloc(KEYSTOREPWDLOC_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__MAXINPUTQUEUE:
				setMaxinputqueue(MAXINPUTQUEUE_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHFLAG:
				setAuthflag(AUTHFLAG_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHLIST:
				setAuthlist(AUTHLIST_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CHECKSCHEMAFLAG:
				setCheckschemaflag(CHECKSCHEMAFLAG_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__SCHEMAFILE:
				setSchemafile(SCHEMAFILE_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__STREAMID:
				setStreamid(STREAMID_EDEFAULT);
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
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CPORT:
				return CPORT_EDEFAULT == null ? cport != null : !CPORT_EDEFAULT.equals(cport);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CSECPORT:
				return CSECPORT_EDEFAULT == null ? csecport != null : !CSECPORT_EDEFAULT.equals(csecport);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTORELOC:
				return KEYSTORELOC_EDEFAULT == null ? keystoreloc != null : !KEYSTORELOC_EDEFAULT.equals(keystoreloc);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREALIAS:
				return KEYSTOREALIAS_EDEFAULT == null ? keystorealias != null : !KEYSTOREALIAS_EDEFAULT.equals(keystorealias);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__KEYSTOREPWDLOC:
				return KEYSTOREPWDLOC_EDEFAULT == null ? keystorepwdloc != null : !KEYSTOREPWDLOC_EDEFAULT.equals(keystorepwdloc);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__MAXINPUTQUEUE:
				return MAXINPUTQUEUE_EDEFAULT == null ? maxinputqueue != null : !MAXINPUTQUEUE_EDEFAULT.equals(maxinputqueue);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHFLAG:
				return AUTHFLAG_EDEFAULT == null ? authflag != null : !AUTHFLAG_EDEFAULT.equals(authflag);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__AUTHLIST:
				return AUTHLIST_EDEFAULT == null ? authlist != null : !AUTHLIST_EDEFAULT.equals(authlist);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__CHECKSCHEMAFLAG:
				return CHECKSCHEMAFLAG_EDEFAULT == null ? checkschemaflag != null : !CHECKSCHEMAFLAG_EDEFAULT.equals(checkschemaflag);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__SCHEMAFILE:
				return SCHEMAFILE_EDEFAULT == null ? schemafile != null : !SCHEMAFILE_EDEFAULT.equals(schemafile);
			case ServicePackage.CONTROLLER_SERVICE_STANDARDEVENTCOLLECTOR_SERVICE_CONFIGURATION__STREAMID:
				return STREAMID_EDEFAULT == null ? streamid != null : !STREAMID_EDEFAULT.equals(streamid);
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
		result.append(" (cport: ");
		result.append(cport);
		result.append(", csecport: ");
		result.append(csecport);
		result.append(", keystoreloc: ");
		result.append(keystoreloc);
		result.append(", keystorealias: ");
		result.append(keystorealias);
		result.append(", keystorepwdloc: ");
		result.append(keystorepwdloc);
		result.append(", maxinputqueue: ");
		result.append(maxinputqueue);
		result.append(", authflag: ");
		result.append(authflag);
		result.append(", authlist: ");
		result.append(authlist);
		result.append(", checkschemaflag: ");
		result.append(checkschemaflag);
		result.append(", schemafile: ");
		result.append(schemafile);
		result.append(", streamid: ");
		result.append(streamid);
		result.append(')');
		return result.toString();
	}

} //ControllerServiceStandardeventcollectorServiceConfigurationImpl
