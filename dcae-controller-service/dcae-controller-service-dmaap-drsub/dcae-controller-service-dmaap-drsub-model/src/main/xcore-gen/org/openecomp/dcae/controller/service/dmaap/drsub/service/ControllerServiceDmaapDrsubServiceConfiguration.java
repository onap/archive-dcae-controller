
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
package org.openecomp.dcae.controller.service.dmaap.drsub.service;

import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Service Dmaap Drsub Service Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getCdapUrl <em>Cdap Url</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getNumberOfCdapRecords <em>Number Of Cdap Records</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getNumberOfCdapErrors <em>Number Of Cdap Errors</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getHdfsUri <em>Hdfs Uri</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getHdfsUriDescr <em>Hdfs Uri Descr</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getHdfsPersistLoc <em>Hdfs Persist Loc</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getHdfsPersistLocDescr <em>Hdfs Persist Loc Descr</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getDmaapConfFile <em>Dmaap Conf File</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getDmaapConfFileDescr <em>Dmaap Conf File Descr</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getDmaapStreamid <em>Dmaap Streamid</em>}</li>
 *   <li>{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getDmaapStreamidDescr <em>Dmaap Streamid Descr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getControllerServiceDmaapDrsubServiceConfiguration()
 * @model
 * @generated
 */
public interface ControllerServiceDmaapDrsubServiceConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Cdap Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cdap Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cdap Url</em>' attribute.
	 * @see #setCdapUrl(String)
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getControllerServiceDmaapDrsubServiceConfiguration_CdapUrl()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getCdapUrl();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getCdapUrl <em>Cdap Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cdap Url</em>' attribute.
	 * @see #getCdapUrl()
	 * @generated
	 */
	void setCdapUrl(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Cdap Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Cdap Records</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Cdap Records</em>' attribute.
	 * @see #setNumberOfCdapRecords(IncreasingULongMetricAttribute)
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getControllerServiceDmaapDrsubServiceConfiguration_NumberOfCdapRecords()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 *        annotation="http://openecomp.org type='operational'"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumberOfCdapRecords();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getNumberOfCdapRecords <em>Number Of Cdap Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Cdap Records</em>' attribute.
	 * @see #getNumberOfCdapRecords()
	 * @generated
	 */
	void setNumberOfCdapRecords(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Number Of Cdap Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Cdap Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Cdap Errors</em>' attribute.
	 * @see #setNumberOfCdapErrors(IncreasingULongMetricAttribute)
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getControllerServiceDmaapDrsubServiceConfiguration_NumberOfCdapErrors()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute"
	 *        annotation="http://openecomp.org type='operational'"
	 * @generated
	 */
	IncreasingULongMetricAttribute getNumberOfCdapErrors();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getNumberOfCdapErrors <em>Number Of Cdap Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Cdap Errors</em>' attribute.
	 * @see #getNumberOfCdapErrors()
	 * @generated
	 */
	void setNumberOfCdapErrors(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Hdfs Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdfs Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdfs Uri</em>' attribute.
	 * @see #setHdfsUri(String)
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getControllerServiceDmaapDrsubServiceConfiguration_HdfsUri()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getHdfsUri();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getHdfsUri <em>Hdfs Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdfs Uri</em>' attribute.
	 * @see #getHdfsUri()
	 * @generated
	 */
	void setHdfsUri(String value);

	/**
	 * Returns the value of the '<em><b>Hdfs Uri Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdfs Uri Descr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdfs Uri Descr</em>' attribute.
	 * @see #setHdfsUriDescr(String)
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getControllerServiceDmaapDrsubServiceConfiguration_HdfsUriDescr()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getHdfsUriDescr();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getHdfsUriDescr <em>Hdfs Uri Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdfs Uri Descr</em>' attribute.
	 * @see #getHdfsUriDescr()
	 * @generated
	 */
	void setHdfsUriDescr(String value);

	/**
	 * Returns the value of the '<em><b>Hdfs Persist Loc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdfs Persist Loc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdfs Persist Loc</em>' attribute.
	 * @see #setHdfsPersistLoc(String)
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getControllerServiceDmaapDrsubServiceConfiguration_HdfsPersistLoc()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getHdfsPersistLoc();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getHdfsPersistLoc <em>Hdfs Persist Loc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdfs Persist Loc</em>' attribute.
	 * @see #getHdfsPersistLoc()
	 * @generated
	 */
	void setHdfsPersistLoc(String value);

	/**
	 * Returns the value of the '<em><b>Hdfs Persist Loc Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdfs Persist Loc Descr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdfs Persist Loc Descr</em>' attribute.
	 * @see #setHdfsPersistLocDescr(String)
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getControllerServiceDmaapDrsubServiceConfiguration_HdfsPersistLocDescr()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getHdfsPersistLocDescr();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getHdfsPersistLocDescr <em>Hdfs Persist Loc Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdfs Persist Loc Descr</em>' attribute.
	 * @see #getHdfsPersistLocDescr()
	 * @generated
	 */
	void setHdfsPersistLocDescr(String value);

	/**
	 * Returns the value of the '<em><b>Dmaap Conf File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmaap Conf File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmaap Conf File</em>' attribute.
	 * @see #setDmaapConfFile(String)
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getControllerServiceDmaapDrsubServiceConfiguration_DmaapConfFile()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getDmaapConfFile();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getDmaapConfFile <em>Dmaap Conf File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmaap Conf File</em>' attribute.
	 * @see #getDmaapConfFile()
	 * @generated
	 */
	void setDmaapConfFile(String value);

	/**
	 * Returns the value of the '<em><b>Dmaap Conf File Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmaap Conf File Descr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmaap Conf File Descr</em>' attribute.
	 * @see #setDmaapConfFileDescr(String)
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getControllerServiceDmaapDrsubServiceConfiguration_DmaapConfFileDescr()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getDmaapConfFileDescr();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getDmaapConfFileDescr <em>Dmaap Conf File Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmaap Conf File Descr</em>' attribute.
	 * @see #getDmaapConfFileDescr()
	 * @generated
	 */
	void setDmaapConfFileDescr(String value);

	/**
	 * Returns the value of the '<em><b>Dmaap Streamid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmaap Streamid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmaap Streamid</em>' attribute.
	 * @see #setDmaapStreamid(String)
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getControllerServiceDmaapDrsubServiceConfiguration_DmaapStreamid()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getDmaapStreamid();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getDmaapStreamid <em>Dmaap Streamid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmaap Streamid</em>' attribute.
	 * @see #getDmaapStreamid()
	 * @generated
	 */
	void setDmaapStreamid(String value);

	/**
	 * Returns the value of the '<em><b>Dmaap Streamid Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmaap Streamid Descr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmaap Streamid Descr</em>' attribute.
	 * @see #setDmaapStreamidDescr(String)
	 * @see org.openecomp.dcae.controller.service.dmaap.drsub.service.ServicePackage#getControllerServiceDmaapDrsubServiceConfiguration_DmaapStreamidDescr()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	String getDmaapStreamidDescr();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.controller.service.dmaap.drsub.service.ControllerServiceDmaapDrsubServiceConfiguration#getDmaapStreamidDescr <em>Dmaap Streamid Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmaap Streamid Descr</em>' attribute.
	 * @see #getDmaapStreamidDescr()
	 * @generated
	 */
	void setDmaapStreamidDescr(String value);

} // ControllerServiceDmaapDrsubServiceConfiguration
