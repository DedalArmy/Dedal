/*******************************************************************************
 * Copyright (C) 2019 IMT Mines Alès
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
/**
 */
package dedal.impl;

import dedal.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DedalFactoryImpl extends EFactoryImpl implements DedalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DedalFactory init() {
		try {
			DedalFactory theDedalFactory = (DedalFactory)EPackage.Registry.INSTANCE.getEFactory(DedalPackage.eNS_URI);
			if (theDedalFactory != null) {
				return theDedalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DedalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DedalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DedalPackage.INTERFACE: return createInterface();
			case DedalPackage.PORT: return createPort();
			case DedalPackage.COMPOSITE_PORT: return createCompositePort();
			case DedalPackage.INTERFACE_TYPE: return createInterfaceType();
			case DedalPackage.SIGNATURE: return createSignature();
			case DedalPackage.PARAMETER: return createParameter();
			case DedalPackage.SPECIFICATION: return createSpecification();
			case DedalPackage.CONFIGURATION: return createConfiguration();
			case DedalPackage.ASSEMBLY: return createAssembly();
			case DedalPackage.COMP_ROLE: return createCompRole();
			case DedalPackage.COMP_CLASS: return createCompClass();
			case DedalPackage.COMP_INSTANCE: return createCompInstance();
			case DedalPackage.ROLE_CONNECTION: return createRoleConnection();
			case DedalPackage.CLASS_CONNECTION: return createClassConnection();
			case DedalPackage.INST_CONNECTION: return createInstConnection();
			case DedalPackage.DEDAL_DIAGRAM: return createDedalDiagram();
			case DedalPackage.COMPOSITE_COMP_CLASS: return createCompositeCompClass();
			case DedalPackage.COMP_TYPE: return createCompType();
			case DedalPackage.REPOSITORY: return createRepository();
			case DedalPackage.ATTRIBUTE: return createAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DedalPackage.DIRECTION:
				return createDIRECTIONFromString(eDataType, initialValue);
			case DedalPackage.ATTRIBUTE_TYPE:
				return createATTRIBUTE_TYPEFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DedalPackage.DIRECTION:
				return convertDIRECTIONToString(eDataType, instanceValue);
			case DedalPackage.ATTRIBUTE_TYPE:
				return convertATTRIBUTE_TYPEToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositePort createCompositePort() {
		CompositePortImpl compositePort = new CompositePortImpl();
		return compositePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceType createInterfaceType() {
		InterfaceTypeImpl interfaceType = new InterfaceTypeImpl();
		return interfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assembly createAssembly() {
		AssemblyImpl assembly = new AssemblyImpl();
		return assembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompRole createCompRole() {
		CompRoleImpl compRole = new CompRoleImpl();
		return compRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompClass createCompClass() {
		CompClassImpl compClass = new CompClassImpl();
		return compClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompInstance createCompInstance() {
		CompInstanceImpl compInstance = new CompInstanceImpl();
		return compInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnection createRoleConnection() {
		RoleConnectionImpl roleConnection = new RoleConnectionImpl();
		return roleConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassConnection createClassConnection() {
		ClassConnectionImpl classConnection = new ClassConnectionImpl();
		return classConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstConnection createInstConnection() {
		InstConnectionImpl instConnection = new InstConnectionImpl();
		return instConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DedalDiagram createDedalDiagram() {
		DedalDiagramImpl dedalDiagram = new DedalDiagramImpl();
		return dedalDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeCompClass createCompositeCompClass() {
		CompositeCompClassImpl compositeCompClass = new CompositeCompClassImpl();
		return compositeCompClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompType createCompType() {
		CompTypeImpl compType = new CompTypeImpl();
		return compType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DIRECTION createDIRECTIONFromString(EDataType eDataType, String initialValue) {
		DIRECTION result = DIRECTION.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDIRECTIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTE_TYPE createATTRIBUTE_TYPEFromString(EDataType eDataType, String initialValue) {
		ATTRIBUTE_TYPE result = ATTRIBUTE_TYPE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertATTRIBUTE_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DedalPackage getDedalPackage() {
		return (DedalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DedalPackage getPackage() {
		return DedalPackage.eINSTANCE;
	}

} //DedalFactoryImpl
