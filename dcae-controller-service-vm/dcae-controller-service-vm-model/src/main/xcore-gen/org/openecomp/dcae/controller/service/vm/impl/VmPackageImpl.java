
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
package org.openecomp.dcae.controller.service.vm.impl;

import org.openecomp.dcae.controller.core.server.ServerPackage;
import org.openecomp.dcae.controller.core.service.ServicePackage;
import org.openecomp.dcae.controller.service.vm.HttpInstallationStep;
import org.openecomp.dcae.controller.service.vm.InstallationStep;
import org.openecomp.dcae.controller.service.vm.MavenArtifactInstallationStep;
import org.openecomp.dcae.controller.service.vm.PhysicalMachine;
import org.openecomp.dcae.controller.service.vm.ShellInstallationStep;
import org.openecomp.dcae.controller.service.vm.VirtualMachine;
import org.openecomp.dcae.controller.service.vm.VirtualMachineService;
import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceConfiguration;
import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceDescriptor;
import org.openecomp.dcae.controller.service.vm.VirtualMachineServiceInstance;
import org.openecomp.dcae.controller.service.vm.VmFactory;
import org.openecomp.dcae.controller.service.vm.VmPackage;
import org.openecomp.ncomp.openstack.core.CorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmPackageImpl extends EPackageImpl implements VmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualMachineServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualMachineServiceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualMachineServiceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualMachineServiceDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass installationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellInstallationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mavenArtifactInstallationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpInstallationStepEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openecomp.dcae.controller.service.vm.VmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VmPackageImpl() {
		super(eNS_URI, VmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VmPackage init() {
		if (isInited) return (VmPackage)EPackage.Registry.INSTANCE.getEPackage(VmPackage.eNS_URI);

		// Obtain or create and register package
		VmPackageImpl theVmPackage = (VmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ServicePackage.eINSTANCE.eClass();
		ServerPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVmPackage.createPackageContents();

		// Initialize created meta-data
		theVmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VmPackage.eNS_URI, theVmPackage);
		return theVmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualMachineService() {
		return virtualMachineServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMachineService_Instances() {
		return (EReference)virtualMachineServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineService_ManagerPortNumber() {
		return (EAttribute)virtualMachineServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualMachineService__UpdateDeploymentStatus() {
		return virtualMachineServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualMachineServiceInstance() {
		return virtualMachineServiceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMachineServiceInstance_Location() {
		return (EReference)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMachineServiceInstance_VmType() {
		return (EReference)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMachineServiceInstance_Users() {
		return (EReference)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMachineServiceInstance_AdminUsers() {
		return (EReference)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceInstance_ApplicationIds() {
		return (EAttribute)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceInstance_AdminId() {
		return (EAttribute)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceInstance_NumberOfServers() {
		return (EAttribute)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceInstance_AvailabilityZone() {
		return (EAttribute)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceInstance_ManagerPortNumber() {
		return (EAttribute)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMachineServiceInstance_Servers() {
		return (EReference)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMachineServiceInstance_LeaderServer() {
		return (EReference)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMachineServiceInstance_Service() {
		return (EReference)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceInstance_IedsAdmin() {
		return (EAttribute)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceInstance_ChefUser() {
		return (EAttribute)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceInstance_ChefOrg() {
		return (EAttribute)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceInstance_ChefTopology() {
		return (EAttribute)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceInstance_OpenstackFlavor() {
		return (EAttribute)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceInstance_ServiceFqdn() {
		return (EAttribute)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceInstance_DeploymentTimeoutMinutes() {
		return (EAttribute)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualMachineServiceInstance_Steps() {
		return (EReference)virtualMachineServiceInstanceEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualMachineServiceConfiguration() {
		return virtualMachineServiceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceConfiguration_Configuration() {
		return (EAttribute)virtualMachineServiceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualMachineServiceDescriptor() {
		return virtualMachineServiceDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceDescriptor_ServicePackage() {
		return (EAttribute)virtualMachineServiceDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceDescriptor_ServiceClass() {
		return (EAttribute)virtualMachineServiceDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceDescriptor_ServiceInstanceClass() {
		return (EAttribute)virtualMachineServiceDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceDescriptor_VmType() {
		return (EAttribute)virtualMachineServiceDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceDescriptor_ManagerPortNumber() {
		return (EAttribute)virtualMachineServiceDescriptorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceDescriptor_ManagerUser() {
		return (EAttribute)virtualMachineServiceDescriptorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceDescriptor_EncryptedPassword() {
		return (EAttribute)virtualMachineServiceDescriptorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceDescriptor_Users() {
		return (EAttribute)virtualMachineServiceDescriptorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachineServiceDescriptor_AdminUsers() {
		return (EAttribute)virtualMachineServiceDescriptorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalMachine() {
		return physicalMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalMachine_ManagerPortNumber() {
		return (EAttribute)physicalMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualMachine() {
		return virtualMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachine_FunctionIndex() {
		return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachine_KvmName() {
		return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachine_Vnc() {
		return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachine_Gateway() {
		return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstallationStep() {
		return installationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstallationStep_ApplicationId() {
		return (EAttribute)installationStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShellInstallationStep() {
		return shellInstallationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShellInstallationStep_Command() {
		return (EAttribute)shellInstallationStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMavenArtifactInstallationStep() {
		return mavenArtifactInstallationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMavenArtifactInstallationStep_GroupId() {
		return (EAttribute)mavenArtifactInstallationStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMavenArtifactInstallationStep_ArtifactId() {
		return (EAttribute)mavenArtifactInstallationStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMavenArtifactInstallationStep_Version() {
		return (EAttribute)mavenArtifactInstallationStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMavenArtifactInstallationStep_Type() {
		return (EAttribute)mavenArtifactInstallationStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMavenArtifactInstallationStep_AssemblyId() {
		return (EAttribute)mavenArtifactInstallationStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpInstallationStep() {
		return httpInstallationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpInstallationStep_Url() {
		return (EAttribute)httpInstallationStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpInstallationStep_UserName() {
		return (EAttribute)httpInstallationStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpInstallationStep_Password() {
		return (EAttribute)httpInstallationStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpInstallationStep_Type() {
		return (EAttribute)httpInstallationStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpInstallationStep_ArtifactId() {
		return (EAttribute)httpInstallationStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmFactory getVmFactory() {
		return (VmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		virtualMachineServiceEClass = createEClass(VIRTUAL_MACHINE_SERVICE);
		createEReference(virtualMachineServiceEClass, VIRTUAL_MACHINE_SERVICE__INSTANCES);
		createEAttribute(virtualMachineServiceEClass, VIRTUAL_MACHINE_SERVICE__MANAGER_PORT_NUMBER);
		createEOperation(virtualMachineServiceEClass, VIRTUAL_MACHINE_SERVICE___UPDATE_DEPLOYMENT_STATUS);

		virtualMachineServiceInstanceEClass = createEClass(VIRTUAL_MACHINE_SERVICE_INSTANCE);
		createEReference(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__LOCATION);
		createEReference(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__VM_TYPE);
		createEReference(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__USERS);
		createEReference(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_USERS);
		createEAttribute(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__APPLICATION_IDS);
		createEAttribute(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__ADMIN_ID);
		createEAttribute(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__NUMBER_OF_SERVERS);
		createEAttribute(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__AVAILABILITY_ZONE);
		createEAttribute(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__MANAGER_PORT_NUMBER);
		createEReference(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVERS);
		createEReference(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__LEADER_SERVER);
		createEReference(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE);
		createEAttribute(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__IEDS_ADMIN);
		createEAttribute(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_USER);
		createEAttribute(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_ORG);
		createEAttribute(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__CHEF_TOPOLOGY);
		createEAttribute(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__OPENSTACK_FLAVOR);
		createEAttribute(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__SERVICE_FQDN);
		createEAttribute(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__DEPLOYMENT_TIMEOUT_MINUTES);
		createEReference(virtualMachineServiceInstanceEClass, VIRTUAL_MACHINE_SERVICE_INSTANCE__STEPS);

		virtualMachineServiceConfigurationEClass = createEClass(VIRTUAL_MACHINE_SERVICE_CONFIGURATION);
		createEAttribute(virtualMachineServiceConfigurationEClass, VIRTUAL_MACHINE_SERVICE_CONFIGURATION__CONFIGURATION);

		virtualMachineServiceDescriptorEClass = createEClass(VIRTUAL_MACHINE_SERVICE_DESCRIPTOR);
		createEAttribute(virtualMachineServiceDescriptorEClass, VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_PACKAGE);
		createEAttribute(virtualMachineServiceDescriptorEClass, VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_CLASS);
		createEAttribute(virtualMachineServiceDescriptorEClass, VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__SERVICE_INSTANCE_CLASS);
		createEAttribute(virtualMachineServiceDescriptorEClass, VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__VM_TYPE);
		createEAttribute(virtualMachineServiceDescriptorEClass, VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__MANAGER_PORT_NUMBER);
		createEAttribute(virtualMachineServiceDescriptorEClass, VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__MANAGER_USER);
		createEAttribute(virtualMachineServiceDescriptorEClass, VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__ENCRYPTED_PASSWORD);
		createEAttribute(virtualMachineServiceDescriptorEClass, VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__USERS);
		createEAttribute(virtualMachineServiceDescriptorEClass, VIRTUAL_MACHINE_SERVICE_DESCRIPTOR__ADMIN_USERS);

		physicalMachineEClass = createEClass(PHYSICAL_MACHINE);
		createEAttribute(physicalMachineEClass, PHYSICAL_MACHINE__MANAGER_PORT_NUMBER);

		virtualMachineEClass = createEClass(VIRTUAL_MACHINE);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__FUNCTION_INDEX);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__KVM_NAME);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__VNC);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__GATEWAY);

		installationStepEClass = createEClass(INSTALLATION_STEP);
		createEAttribute(installationStepEClass, INSTALLATION_STEP__APPLICATION_ID);

		shellInstallationStepEClass = createEClass(SHELL_INSTALLATION_STEP);
		createEAttribute(shellInstallationStepEClass, SHELL_INSTALLATION_STEP__COMMAND);

		mavenArtifactInstallationStepEClass = createEClass(MAVEN_ARTIFACT_INSTALLATION_STEP);
		createEAttribute(mavenArtifactInstallationStepEClass, MAVEN_ARTIFACT_INSTALLATION_STEP__GROUP_ID);
		createEAttribute(mavenArtifactInstallationStepEClass, MAVEN_ARTIFACT_INSTALLATION_STEP__ARTIFACT_ID);
		createEAttribute(mavenArtifactInstallationStepEClass, MAVEN_ARTIFACT_INSTALLATION_STEP__VERSION);
		createEAttribute(mavenArtifactInstallationStepEClass, MAVEN_ARTIFACT_INSTALLATION_STEP__TYPE);
		createEAttribute(mavenArtifactInstallationStepEClass, MAVEN_ARTIFACT_INSTALLATION_STEP__ASSEMBLY_ID);

		httpInstallationStepEClass = createEClass(HTTP_INSTALLATION_STEP);
		createEAttribute(httpInstallationStepEClass, HTTP_INSTALLATION_STEP__URL);
		createEAttribute(httpInstallationStepEClass, HTTP_INSTALLATION_STEP__USER_NAME);
		createEAttribute(httpInstallationStepEClass, HTTP_INSTALLATION_STEP__PASSWORD);
		createEAttribute(httpInstallationStepEClass, HTTP_INSTALLATION_STEP__TYPE);
		createEAttribute(httpInstallationStepEClass, HTTP_INSTALLATION_STEP__ARTIFACT_ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		org.openecomp.ncomp.core.CorePackage theCorePackage_1 = (org.openecomp.ncomp.core.CorePackage)EPackage.Registry.INSTANCE.getEPackage(org.openecomp.ncomp.core.CorePackage.eNS_URI);
		ServerPackage theServerPackage = (ServerPackage)EPackage.Registry.INSTANCE.getEPackage(ServerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		virtualMachineServiceEClass.getESuperTypes().add(theServicePackage.getDcaeService());
		virtualMachineServiceInstanceEClass.getESuperTypes().add(theServicePackage.getDcaeServiceInstance());
		virtualMachineServiceInstanceEClass.getESuperTypes().add(this.getVirtualMachineServiceConfiguration());
		virtualMachineServiceDescriptorEClass.getESuperTypes().add(theServicePackage.getDcaeServiceDescriptor());
		physicalMachineEClass.getESuperTypes().add(theServerPackage.getDcaeBasicServer());
		virtualMachineEClass.getESuperTypes().add(theServerPackage.getDcaeBasicServer());
		installationStepEClass.getESuperTypes().add(theCorePackage_1.getNamedEntity());
		shellInstallationStepEClass.getESuperTypes().add(this.getInstallationStep());
		mavenArtifactInstallationStepEClass.getESuperTypes().add(this.getInstallationStep());
		httpInstallationStepEClass.getESuperTypes().add(this.getInstallationStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(virtualMachineServiceEClass, VirtualMachineService.class, "VirtualMachineService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualMachineService_Instances(), this.getVirtualMachineServiceInstance(), this.getVirtualMachineServiceInstance_Service(), "instances", null, 0, -1, VirtualMachineService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineService_ManagerPortNumber(), theEcorePackage.getEInt(), "managerPortNumber", "9999", 0, 1, VirtualMachineService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVirtualMachineService__UpdateDeploymentStatus(), null, "updateDeploymentStatus", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(virtualMachineServiceInstanceEClass, VirtualMachineServiceInstance.class, "VirtualMachineServiceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualMachineServiceInstance_Location(), theServicePackage.getDcaeLocation(), null, "location", null, 0, 1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachineServiceInstance_VmType(), theCorePackage.getVirtualMachineType(), null, "vmType", null, 0, 1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachineServiceInstance_Users(), theCorePackage_1.getUser(), null, "users", null, 0, -1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachineServiceInstance_AdminUsers(), theCorePackage_1.getUser(), null, "adminUsers", null, 0, -1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceInstance_ApplicationIds(), theEcorePackage.getEString(), "applicationIds", null, 0, -1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceInstance_AdminId(), theEcorePackage.getEString(), "adminId", null, 0, 1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceInstance_NumberOfServers(), theEcorePackage.getEInt(), "numberOfServers", "1", 0, 1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceInstance_AvailabilityZone(), theEcorePackage.getEString(), "availabilityZone", null, 0, 1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceInstance_ManagerPortNumber(), theEcorePackage.getEIntegerObject(), "managerPortNumber", null, 0, 1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachineServiceInstance_Servers(), theServerPackage.getDcaeBasicServer(), null, "servers", null, 0, -1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachineServiceInstance_LeaderServer(), theServerPackage.getDcaeBasicServer(), null, "leaderServer", null, 0, 1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachineServiceInstance_Service(), this.getVirtualMachineService(), this.getVirtualMachineService_Instances(), "service", null, 0, 1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceInstance_IedsAdmin(), theEcorePackage.getEString(), "iedsAdmin", null, 0, 1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceInstance_ChefUser(), theEcorePackage.getEString(), "chefUser", null, 0, 1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceInstance_ChefOrg(), theEcorePackage.getEString(), "chefOrg", null, 0, 1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceInstance_ChefTopology(), theEcorePackage.getEString(), "chefTopology", null, 0, 1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceInstance_OpenstackFlavor(), theEcorePackage.getEString(), "openstackFlavor", null, 0, 1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceInstance_ServiceFqdn(), theEcorePackage.getEString(), "serviceFqdn", null, 0, 1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceInstance_DeploymentTimeoutMinutes(), theEcorePackage.getEInt(), "deploymentTimeoutMinutes", "90", 0, 1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachineServiceInstance_Steps(), this.getInstallationStep(), null, "steps", null, 0, -1, VirtualMachineServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualMachineServiceConfigurationEClass, VirtualMachineServiceConfiguration.class, "VirtualMachineServiceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualMachineServiceConfiguration_Configuration(), theEcorePackage.getEString(), "configuration", null, 0, 1, VirtualMachineServiceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualMachineServiceDescriptorEClass, VirtualMachineServiceDescriptor.class, "VirtualMachineServiceDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualMachineServiceDescriptor_ServicePackage(), theEcorePackage.getEString(), "servicePackage", null, 0, 1, VirtualMachineServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceDescriptor_ServiceClass(), theEcorePackage.getEString(), "serviceClass", null, 0, 1, VirtualMachineServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceDescriptor_ServiceInstanceClass(), theEcorePackage.getEString(), "serviceInstanceClass", null, 0, 1, VirtualMachineServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceDescriptor_VmType(), theEcorePackage.getEString(), "vmType", null, 0, 1, VirtualMachineServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceDescriptor_ManagerPortNumber(), theEcorePackage.getEString(), "managerPortNumber", null, 0, 1, VirtualMachineServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceDescriptor_ManagerUser(), theEcorePackage.getEString(), "managerUser", null, 0, 1, VirtualMachineServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceDescriptor_EncryptedPassword(), theEcorePackage.getEString(), "encryptedPassword", null, 0, 1, VirtualMachineServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceDescriptor_Users(), theEcorePackage.getEString(), "users", null, 0, -1, VirtualMachineServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachineServiceDescriptor_AdminUsers(), theEcorePackage.getEString(), "adminUsers", null, 0, -1, VirtualMachineServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalMachineEClass, PhysicalMachine.class, "PhysicalMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalMachine_ManagerPortNumber(), theEcorePackage.getEIntegerObject(), "managerPortNumber", null, 0, 1, PhysicalMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualMachineEClass, VirtualMachine.class, "VirtualMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualMachine_FunctionIndex(), theEcorePackage.getEInt(), "functionIndex", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachine_KvmName(), theEcorePackage.getEString(), "kvmName", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachine_Vnc(), theEcorePackage.getEString(), "vnc", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachine_Gateway(), theEcorePackage.getEString(), "gateway", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(installationStepEClass, InstallationStep.class, "InstallationStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstallationStep_ApplicationId(), theEcorePackage.getEString(), "applicationId", "dcae", 0, 1, InstallationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shellInstallationStepEClass, ShellInstallationStep.class, "ShellInstallationStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShellInstallationStep_Command(), theEcorePackage.getEString(), "command", null, 0, 1, ShellInstallationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mavenArtifactInstallationStepEClass, MavenArtifactInstallationStep.class, "MavenArtifactInstallationStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMavenArtifactInstallationStep_GroupId(), theEcorePackage.getEString(), "groupId", null, 0, 1, MavenArtifactInstallationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMavenArtifactInstallationStep_ArtifactId(), theEcorePackage.getEString(), "artifactId", null, 0, 1, MavenArtifactInstallationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMavenArtifactInstallationStep_Version(), theEcorePackage.getEString(), "version", null, 0, 1, MavenArtifactInstallationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMavenArtifactInstallationStep_Type(), theEcorePackage.getEString(), "type", null, 0, 1, MavenArtifactInstallationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMavenArtifactInstallationStep_AssemblyId(), theEcorePackage.getEString(), "assemblyId", null, 0, 1, MavenArtifactInstallationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpInstallationStepEClass, HttpInstallationStep.class, "HttpInstallationStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHttpInstallationStep_Url(), theEcorePackage.getEString(), "url", null, 0, 1, HttpInstallationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpInstallationStep_UserName(), theEcorePackage.getEString(), "userName", null, 0, 1, HttpInstallationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpInstallationStep_Password(), theEcorePackage.getEString(), "password", null, 0, 1, HttpInstallationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpInstallationStep_Type(), theEcorePackage.getEString(), "type", null, 0, 1, HttpInstallationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpInstallationStep_ArtifactId(), theEcorePackage.getEString(), "artifactId", null, 0, 1, HttpInstallationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// http://openecomp.org
		createEcompAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecomp", "http://openecomp.org"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://openecomp.org</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcompAnnotations() {
		String source = "http://openecomp.org";	
		addAnnotation
		  (getVirtualMachineService_ManagerPortNumber(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getVirtualMachineServiceInstance_VmType(), 
		   source, 
		   new String[] {
			 "type", "service"
		   });	
		addAnnotation
		  (getVirtualMachineServiceInstance_Users(), 
		   source, 
		   new String[] {
			 "type", "service"
		   });	
		addAnnotation
		  (getVirtualMachineServiceInstance_AdminUsers(), 
		   source, 
		   new String[] {
			 "type", "service"
		   });	
		addAnnotation
		  (getVirtualMachineServiceInstance_NumberOfServers(), 
		   source, 
		   new String[] {
			 "type", "service"
		   });	
		addAnnotation
		  (getVirtualMachineServiceInstance_AvailabilityZone(), 
		   source, 
		   new String[] {
			 "type", "service"
		   });	
		addAnnotation
		  (getVirtualMachineServiceInstance_ManagerPortNumber(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getVirtualMachineServiceInstance_Servers(), 
		   source, 
		   new String[] {
			 "type", "operational"
		   });	
		addAnnotation
		  (getVirtualMachineServiceInstance_Service(), 
		   source, 
		   new String[] {
			 "type", "operational"
		   });	
		addAnnotation
		  (getVirtualMachineServiceConfiguration_Configuration(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getPhysicalMachine_ManagerPortNumber(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });
	}

} //VmPackageImpl
