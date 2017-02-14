
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
package org.openecomp.dcae.controller.service.dmaap.drsub.service.impl;

import org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration;
import org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage;
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Service Dmaap Drsub Service Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceConfigurationImpl#getCdapUrl <em>Cdap Url</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceConfigurationImpl#getNumberOfCdapRecords <em>Number Of Cdap Records</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceConfigurationImpl#getNumberOfCdapErrors <em>Number Of Cdap Errors</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceConfigurationImpl#getHdfsUri <em>Hdfs Uri</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceConfigurationImpl#getHdfsUriDescr <em>Hdfs Uri Descr</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceConfigurationImpl#getHdfsPersistLoc <em>Hdfs Persist Loc</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceConfigurationImpl#getHdfsPersistLocDescr <em>Hdfs Persist Loc Descr</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceConfigurationImpl#getDmaapConfFile <em>Dmaap Conf File</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceConfigurationImpl#getDmaapConfFileDescr <em>Dmaap Conf File Descr</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceConfigurationImpl#getDmaapStreamid <em>Dmaap Streamid</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.impl.ControllerServiceDmaapDrsubServiceConfigurationImpl#getDmaapStreamidDescr <em>Dmaap Streamid Descr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerServiceDmaapDrsubServiceConfigurationImpl extends MinimalEObjectImpl.Container implements ControllerServiceDmaapDrsubServiceConfiguration {
	/**
	 * The default value of the '{@link #getCdapUrl() <em>Cdap Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdapUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String CDAP_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCdapUrl() <em>Cdap Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdapUrl()
	 * @generated
	 * @ordered
	 */
	protected String cdapUrl = CDAP_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfCdapRecords() <em>Number Of Cdap Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCdapRecords()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute NUMBER_OF_CDAP_RECORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfCdapRecords() <em>Number Of Cdap Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCdapRecords()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute numberOfCdapRecords = NUMBER_OF_CDAP_RECORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfCdapErrors() <em>Number Of Cdap Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCdapErrors()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute NUMBER_OF_CDAP_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfCdapErrors() <em>Number Of Cdap Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCdapErrors()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute numberOfCdapErrors = NUMBER_OF_CDAP_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdfsUri() <em>Hdfs Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdfsUri()
	 * @generated
	 * @ordered
	 */
	protected static final String HDFS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdfsUri() <em>Hdfs Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdfsUri()
	 * @generated
	 * @ordered
	 */
	protected String hdfsUri = HDFS_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdfsUriDescr() <em>Hdfs Uri Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdfsUriDescr()
	 * @generated
	 * @ordered
	 */
	protected static final String HDFS_URI_DESCR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdfsUriDescr() <em>Hdfs Uri Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdfsUriDescr()
	 * @generated
	 * @ordered
	 */
	protected String hdfsUriDescr = HDFS_URI_DESCR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdfsPersistLoc() <em>Hdfs Persist Loc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdfsPersistLoc()
	 * @generated
	 * @ordered
	 */
	protected static final String HDFS_PERSIST_LOC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdfsPersistLoc() <em>Hdfs Persist Loc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdfsPersistLoc()
	 * @generated
	 * @ordered
	 */
	protected String hdfsPersistLoc = HDFS_PERSIST_LOC_EDEFAULT;

	/**
	 * The default value of the '{@link #getHdfsPersistLocDescr() <em>Hdfs Persist Loc Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdfsPersistLocDescr()
	 * @generated
	 * @ordered
	 */
	protected static final String HDFS_PERSIST_LOC_DESCR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHdfsPersistLocDescr() <em>Hdfs Persist Loc Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHdfsPersistLocDescr()
	 * @generated
	 * @ordered
	 */
	protected String hdfsPersistLocDescr = HDFS_PERSIST_LOC_DESCR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDmaapConfFile() <em>Dmaap Conf File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapConfFile()
	 * @generated
	 * @ordered
	 */
	protected static final String DMAAP_CONF_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDmaapConfFile() <em>Dmaap Conf File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapConfFile()
	 * @generated
	 * @ordered
	 */
	protected String dmaapConfFile = DMAAP_CONF_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDmaapConfFileDescr() <em>Dmaap Conf File Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapConfFileDescr()
	 * @generated
	 * @ordered
	 */
	protected static final String DMAAP_CONF_FILE_DESCR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDmaapConfFileDescr() <em>Dmaap Conf File Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapConfFileDescr()
	 * @generated
	 * @ordered
	 */
	protected String dmaapConfFileDescr = DMAAP_CONF_FILE_DESCR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDmaapStreamid() <em>Dmaap Streamid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapStreamid()
	 * @generated
	 * @ordered
	 */
	protected static final String DMAAP_STREAMID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDmaapStreamid() <em>Dmaap Streamid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapStreamid()
	 * @generated
	 * @ordered
	 */
	protected String dmaapStreamid = DMAAP_STREAMID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDmaapStreamidDescr() <em>Dmaap Streamid Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapStreamidDescr()
	 * @generated
	 * @ordered
	 */
	protected static final String DMAAP_STREAMID_DESCR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDmaapStreamidDescr() <em>Dmaap Streamid Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmaapStreamidDescr()
	 * @generated
	 * @ordered
	 */
	protected String dmaapStreamidDescr = DMAAP_STREAMID_DESCR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerServiceDmaapDrsubServiceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCdapUrl() {
		return cdapUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCdapUrl(String newCdapUrl) {
		String oldCdapUrl = cdapUrl;
		cdapUrl = newCdapUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__CDAP_URL, oldCdapUrl, cdapUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getNumberOfCdapRecords() {
		return numberOfCdapRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfCdapRecords(IncreasingULongMetricAttribute newNumberOfCdapRecords) {
		IncreasingULongMetricAttribute oldNumberOfCdapRecords = numberOfCdapRecords;
		numberOfCdapRecords = newNumberOfCdapRecords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__NUMBER_OF_CDAP_RECORDS, oldNumberOfCdapRecords, numberOfCdapRecords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getNumberOfCdapErrors() {
		return numberOfCdapErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfCdapErrors(IncreasingULongMetricAttribute newNumberOfCdapErrors) {
		IncreasingULongMetricAttribute oldNumberOfCdapErrors = numberOfCdapErrors;
		numberOfCdapErrors = newNumberOfCdapErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__NUMBER_OF_CDAP_ERRORS, oldNumberOfCdapErrors, numberOfCdapErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHdfsUri() {
		return hdfsUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHdfsUri(String newHdfsUri) {
		String oldHdfsUri = hdfsUri;
		hdfsUri = newHdfsUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_URI, oldHdfsUri, hdfsUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHdfsUriDescr() {
		return hdfsUriDescr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHdfsUriDescr(String newHdfsUriDescr) {
		String oldHdfsUriDescr = hdfsUriDescr;
		hdfsUriDescr = newHdfsUriDescr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_URI_DESCR, oldHdfsUriDescr, hdfsUriDescr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHdfsPersistLoc() {
		return hdfsPersistLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHdfsPersistLoc(String newHdfsPersistLoc) {
		String oldHdfsPersistLoc = hdfsPersistLoc;
		hdfsPersistLoc = newHdfsPersistLoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_PERSIST_LOC, oldHdfsPersistLoc, hdfsPersistLoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHdfsPersistLocDescr() {
		return hdfsPersistLocDescr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHdfsPersistLocDescr(String newHdfsPersistLocDescr) {
		String oldHdfsPersistLocDescr = hdfsPersistLocDescr;
		hdfsPersistLocDescr = newHdfsPersistLocDescr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_PERSIST_LOC_DESCR, oldHdfsPersistLocDescr, hdfsPersistLocDescr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDmaapConfFile() {
		return dmaapConfFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmaapConfFile(String newDmaapConfFile) {
		String oldDmaapConfFile = dmaapConfFile;
		dmaapConfFile = newDmaapConfFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_CONF_FILE, oldDmaapConfFile, dmaapConfFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDmaapConfFileDescr() {
		return dmaapConfFileDescr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmaapConfFileDescr(String newDmaapConfFileDescr) {
		String oldDmaapConfFileDescr = dmaapConfFileDescr;
		dmaapConfFileDescr = newDmaapConfFileDescr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_CONF_FILE_DESCR, oldDmaapConfFileDescr, dmaapConfFileDescr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDmaapStreamid() {
		return dmaapStreamid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmaapStreamid(String newDmaapStreamid) {
		String oldDmaapStreamid = dmaapStreamid;
		dmaapStreamid = newDmaapStreamid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_STREAMID, oldDmaapStreamid, dmaapStreamid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDmaapStreamidDescr() {
		return dmaapStreamidDescr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmaapStreamidDescr(String newDmaapStreamidDescr) {
		String oldDmaapStreamidDescr = dmaapStreamidDescr;
		dmaapStreamidDescr = newDmaapStreamidDescr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_STREAMID_DESCR, oldDmaapStreamidDescr, dmaapStreamidDescr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__CDAP_URL:
				return getCdapUrl();
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__NUMBER_OF_CDAP_RECORDS:
				return getNumberOfCdapRecords();
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__NUMBER_OF_CDAP_ERRORS:
				return getNumberOfCdapErrors();
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_URI:
				return getHdfsUri();
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_URI_DESCR:
				return getHdfsUriDescr();
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_PERSIST_LOC:
				return getHdfsPersistLoc();
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_PERSIST_LOC_DESCR:
				return getHdfsPersistLocDescr();
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_CONF_FILE:
				return getDmaapConfFile();
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_CONF_FILE_DESCR:
				return getDmaapConfFileDescr();
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_STREAMID:
				return getDmaapStreamid();
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_STREAMID_DESCR:
				return getDmaapStreamidDescr();
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
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__CDAP_URL:
				setCdapUrl((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__NUMBER_OF_CDAP_RECORDS:
				setNumberOfCdapRecords((IncreasingULongMetricAttribute)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__NUMBER_OF_CDAP_ERRORS:
				setNumberOfCdapErrors((IncreasingULongMetricAttribute)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_URI:
				setHdfsUri((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_URI_DESCR:
				setHdfsUriDescr((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_PERSIST_LOC:
				setHdfsPersistLoc((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_PERSIST_LOC_DESCR:
				setHdfsPersistLocDescr((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_CONF_FILE:
				setDmaapConfFile((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_CONF_FILE_DESCR:
				setDmaapConfFileDescr((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_STREAMID:
				setDmaapStreamid((String)newValue);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_STREAMID_DESCR:
				setDmaapStreamidDescr((String)newValue);
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
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__CDAP_URL:
				setCdapUrl(CDAP_URL_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__NUMBER_OF_CDAP_RECORDS:
				setNumberOfCdapRecords(NUMBER_OF_CDAP_RECORDS_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__NUMBER_OF_CDAP_ERRORS:
				setNumberOfCdapErrors(NUMBER_OF_CDAP_ERRORS_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_URI:
				setHdfsUri(HDFS_URI_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_URI_DESCR:
				setHdfsUriDescr(HDFS_URI_DESCR_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_PERSIST_LOC:
				setHdfsPersistLoc(HDFS_PERSIST_LOC_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_PERSIST_LOC_DESCR:
				setHdfsPersistLocDescr(HDFS_PERSIST_LOC_DESCR_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_CONF_FILE:
				setDmaapConfFile(DMAAP_CONF_FILE_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_CONF_FILE_DESCR:
				setDmaapConfFileDescr(DMAAP_CONF_FILE_DESCR_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_STREAMID:
				setDmaapStreamid(DMAAP_STREAMID_EDEFAULT);
				return;
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_STREAMID_DESCR:
				setDmaapStreamidDescr(DMAAP_STREAMID_DESCR_EDEFAULT);
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
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__CDAP_URL:
				return CDAP_URL_EDEFAULT == null ? cdapUrl != null : !CDAP_URL_EDEFAULT.equals(cdapUrl);
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__NUMBER_OF_CDAP_RECORDS:
				return NUMBER_OF_CDAP_RECORDS_EDEFAULT == null ? numberOfCdapRecords != null : !NUMBER_OF_CDAP_RECORDS_EDEFAULT.equals(numberOfCdapRecords);
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__NUMBER_OF_CDAP_ERRORS:
				return NUMBER_OF_CDAP_ERRORS_EDEFAULT == null ? numberOfCdapErrors != null : !NUMBER_OF_CDAP_ERRORS_EDEFAULT.equals(numberOfCdapErrors);
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_URI:
				return HDFS_URI_EDEFAULT == null ? hdfsUri != null : !HDFS_URI_EDEFAULT.equals(hdfsUri);
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_URI_DESCR:
				return HDFS_URI_DESCR_EDEFAULT == null ? hdfsUriDescr != null : !HDFS_URI_DESCR_EDEFAULT.equals(hdfsUriDescr);
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_PERSIST_LOC:
				return HDFS_PERSIST_LOC_EDEFAULT == null ? hdfsPersistLoc != null : !HDFS_PERSIST_LOC_EDEFAULT.equals(hdfsPersistLoc);
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__HDFS_PERSIST_LOC_DESCR:
				return HDFS_PERSIST_LOC_DESCR_EDEFAULT == null ? hdfsPersistLocDescr != null : !HDFS_PERSIST_LOC_DESCR_EDEFAULT.equals(hdfsPersistLocDescr);
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_CONF_FILE:
				return DMAAP_CONF_FILE_EDEFAULT == null ? dmaapConfFile != null : !DMAAP_CONF_FILE_EDEFAULT.equals(dmaapConfFile);
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_CONF_FILE_DESCR:
				return DMAAP_CONF_FILE_DESCR_EDEFAULT == null ? dmaapConfFileDescr != null : !DMAAP_CONF_FILE_DESCR_EDEFAULT.equals(dmaapConfFileDescr);
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_STREAMID:
				return DMAAP_STREAMID_EDEFAULT == null ? dmaapStreamid != null : !DMAAP_STREAMID_EDEFAULT.equals(dmaapStreamid);
			case ServicePackage.CONTROLLER_SERVICE_DMAAP_DRSUB_SERVICE_CONFIGURATION__DMAAP_STREAMID_DESCR:
				return DMAAP_STREAMID_DESCR_EDEFAULT == null ? dmaapStreamidDescr != null : !DMAAP_STREAMID_DESCR_EDEFAULT.equals(dmaapStreamidDescr);
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
		result.append(" (cdapUrl: ");
		result.append(cdapUrl);
		result.append(", numberOfCdapRecords: ");
		result.append(numberOfCdapRecords);
		result.append(", numberOfCdapErrors: ");
		result.append(numberOfCdapErrors);
		result.append(", hdfsUri: ");
		result.append(hdfsUri);
		result.append(", hdfsUriDescr: ");
		result.append(hdfsUriDescr);
		result.append(", hdfsPersistLoc: ");
		result.append(hdfsPersistLoc);
		result.append(", hdfsPersistLocDescr: ");
		result.append(hdfsPersistLocDescr);
		result.append(", dmaapConfFile: ");
		result.append(dmaapConfFile);
		result.append(", dmaapConfFileDescr: ");
		result.append(dmaapConfFileDescr);
		result.append(", dmaapStreamid: ");
		result.append(dmaapStreamid);
		result.append(", dmaapStreamidDescr: ");
		result.append(dmaapStreamidDescr);
		result.append(')');
		return result.toString();
	}

} //ControllerServiceDmaapDrsubServiceConfigurationImpl
