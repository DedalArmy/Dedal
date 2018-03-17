/**
 */
package dedal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dedal.DedalFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface DedalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dedal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dedal.fr/metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dedal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DedalPackage eINSTANCE = dedal.impl.DedalPackageImpl.init();

	/**
	 * The meta object id for the '{@link dedal.impl.ArchitectureDescriptionImpl <em>Architecture Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.ArchitectureDescriptionImpl
	 * @see dedal.impl.DedalPackageImpl#getArchitectureDescription()
	 * @generated
	 */
	int ARCHITECTURE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DESCRIPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Interface Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DESCRIPTION__INTERFACE_TYPES = 1;

	/**
	 * The number of structural features of the '<em>Architecture Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Architecture Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dedal.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.ComponentImpl
	 * @see dedal.impl.DedalPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Comp Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMP_INTERFACES = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dedal.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.ConnectionImpl
	 * @see dedal.impl.DedalPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Server Int Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SERVER_INT_ELEM = 0;

	/**
	 * The feature id for the '<em><b>Client Int Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CLIENT_INT_ELEM = 1;

	/**
	 * The feature id for the '<em><b>Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__REF_ID = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dedal.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.InteractionImpl
	 * @see dedal.impl.DedalPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dedal.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.InterfaceImpl
	 * @see dedal.impl.DedalPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = INTERACTION__NAME;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DIRECTION = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__TYPE = INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delegation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DELEGATION = INTERACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instantiates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INSTANTIATES = INTERACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dedal.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.PortImpl
	 * @see dedal.impl.DedalPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = INTERACTION__NAME;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__INTERFACES = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dedal.impl.CompositePortImpl <em>Composite Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.CompositePortImpl
	 * @see dedal.impl.DedalPackageImpl#getCompositePort()
	 * @generated
	 */
	int COMPOSITE_PORT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PORT__INTERFACES = PORT__INTERFACES;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PORT__PORTS = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dedal.impl.InterfaceTypeImpl <em>Interface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.InterfaceTypeImpl
	 * @see dedal.impl.DedalPackageImpl#getInterfaceType()
	 * @generated
	 */
	int INTERFACE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__SIGNATURES = 1;

	/**
	 * The number of structural features of the '<em>Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dedal.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.SignatureImpl
	 * @see dedal.impl.DedalPackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ID = 3;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dedal.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.ParameterImpl
	 * @see dedal.impl.DedalPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dedal.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.SpecificationImpl
	 * @see dedal.impl.DedalPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = ARCHITECTURE_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Interface Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__INTERFACE_TYPES = ARCHITECTURE_DESCRIPTION__INTERFACE_TYPES;

	/**
	 * The feature id for the '<em><b>Spec Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SPEC_COMPONENTS = ARCHITECTURE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spec Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SPEC_CONNECTIONS = ARCHITECTURE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = ARCHITECTURE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_OPERATION_COUNT = ARCHITECTURE_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dedal.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.ConfigurationImpl
	 * @see dedal.impl.DedalPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = ARCHITECTURE_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Interface Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INTERFACE_TYPES = ARCHITECTURE_DESCRIPTION__INTERFACE_TYPES;

	/**
	 * The feature id for the '<em><b>Config Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONFIG_COMPONENTS = ARCHITECTURE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__IMPLEMENTS = ARCHITECTURE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONFIG_CONNECTIONS = ARCHITECTURE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comptypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__COMPTYPES = ARCHITECTURE_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = ARCHITECTURE_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = ARCHITECTURE_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dedal.impl.AssemblyImpl <em>Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.AssemblyImpl
	 * @see dedal.impl.DedalPackageImpl#getAssembly()
	 * @generated
	 */
	int ASSEMBLY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__NAME = ARCHITECTURE_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Interface Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__INTERFACE_TYPES = ARCHITECTURE_DESCRIPTION__INTERFACE_TYPES;

	/**
	 * The feature id for the '<em><b>Assm Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__ASSM_COMPONENTS = ARCHITECTURE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instantiates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__INSTANTIATES = ARCHITECTURE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assembly Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY__ASSEMBLY_CONNECTIONS = ARCHITECTURE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_FEATURE_COUNT = ARCHITECTURE_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_OPERATION_COUNT = ARCHITECTURE_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dedal.impl.CompRoleImpl <em>Comp Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.CompRoleImpl
	 * @see dedal.impl.DedalPackageImpl#getCompRole()
	 * @generated
	 */
	int COMP_ROLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_ROLE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Comp Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_ROLE__COMP_INTERFACES = COMPONENT__COMP_INTERFACES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_ROLE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Min Instance Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_ROLE__MIN_INSTANCE_NBR = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Instance Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_ROLE__MAX_INSTANCE_NBR = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comp Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_ROLE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comp Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_ROLE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dedal.impl.CompClassImpl <em>Comp Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.CompClassImpl
	 * @see dedal.impl.DedalPackageImpl#getCompClass()
	 * @generated
	 */
	int COMP_CLASS = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_CLASS__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Comp Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_CLASS__COMP_INTERFACES = COMPONENT__COMP_INTERFACES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_CLASS__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_CLASS__REALIZES = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_CLASS__IMPLEMENTS = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_CLASS__ATTRIBUTES = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_CLASS__CONTENT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Comp Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_CLASS_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Comp Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_CLASS_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dedal.impl.CompInstanceImpl <em>Comp Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.CompInstanceImpl
	 * @see dedal.impl.DedalPackageImpl#getCompInstance()
	 * @generated
	 */
	int COMP_INSTANCE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INSTANCE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Comp Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INSTANCE__COMP_INTERFACES = COMPONENT__COMP_INTERFACES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INSTANCE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Instantiates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INSTANCE__INSTANTIATES = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INSTANCE__ROLE = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comp Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INSTANCE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comp Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_INSTANCE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dedal.impl.RoleConnectionImpl <em>Role Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.RoleConnectionImpl
	 * @see dedal.impl.DedalPackageImpl#getRoleConnection()
	 * @generated
	 */
	int ROLE_CONNECTION = 16;

	/**
	 * The feature id for the '<em><b>Server Int Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTION__SERVER_INT_ELEM = CONNECTION__SERVER_INT_ELEM;

	/**
	 * The feature id for the '<em><b>Client Int Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTION__CLIENT_INT_ELEM = CONNECTION__CLIENT_INT_ELEM;

	/**
	 * The feature id for the '<em><b>Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTION__REF_ID = CONNECTION__REF_ID;

	/**
	 * The feature id for the '<em><b>Client Comp Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTION__CLIENT_COMP_ELEM = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Server Comp Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTION__SERVER_COMP_ELEM = CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Role Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dedal.impl.ClassConnectionImpl <em>Class Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.ClassConnectionImpl
	 * @see dedal.impl.DedalPackageImpl#getClassConnection()
	 * @generated
	 */
	int CLASS_CONNECTION = 17;

	/**
	 * The feature id for the '<em><b>Server Int Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONNECTION__SERVER_INT_ELEM = CONNECTION__SERVER_INT_ELEM;

	/**
	 * The feature id for the '<em><b>Client Int Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONNECTION__CLIENT_INT_ELEM = CONNECTION__CLIENT_INT_ELEM;

	/**
	 * The feature id for the '<em><b>Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONNECTION__REF_ID = CONNECTION__REF_ID;

	/**
	 * The feature id for the '<em><b>Client Class Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONNECTION__CLIENT_CLASS_ELEM = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Server Class Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONNECTION__SERVER_CLASS_ELEM = CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Class Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dedal.impl.InstConnectionImpl <em>Inst Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.InstConnectionImpl
	 * @see dedal.impl.DedalPackageImpl#getInstConnection()
	 * @generated
	 */
	int INST_CONNECTION = 18;

	/**
	 * The feature id for the '<em><b>Server Int Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONNECTION__SERVER_INT_ELEM = CONNECTION__SERVER_INT_ELEM;

	/**
	 * The feature id for the '<em><b>Client Int Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONNECTION__CLIENT_INT_ELEM = CONNECTION__CLIENT_INT_ELEM;

	/**
	 * The feature id for the '<em><b>Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONNECTION__REF_ID = CONNECTION__REF_ID;

	/**
	 * The feature id for the '<em><b>Client Inst Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONNECTION__CLIENT_INST_ELEM = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Server Inst Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONNECTION__SERVER_INST_ELEM = CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inst Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inst Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INST_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dedal.impl.DedalDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.DedalDiagramImpl
	 * @see dedal.impl.DedalPackageImpl#getDedalDiagram()
	 * @generated
	 */
	int DEDAL_DIAGRAM = 19;

	/**
	 * The feature id for the '<em><b>Architecture Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDAL_DIAGRAM__ARCHITECTURE_DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDAL_DIAGRAM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDAL_DIAGRAM__REPOSITORIES = 2;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDAL_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDAL_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dedal.impl.CompositeCompClassImpl <em>Composite Comp Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.CompositeCompClassImpl
	 * @see dedal.impl.DedalPackageImpl#getCompositeCompClass()
	 * @generated
	 */
	int COMPOSITE_COMP_CLASS = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMP_CLASS__NAME = COMP_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Comp Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMP_CLASS__COMP_INTERFACES = COMP_CLASS__COMP_INTERFACES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMP_CLASS__ID = COMP_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMP_CLASS__REALIZES = COMP_CLASS__REALIZES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMP_CLASS__IMPLEMENTS = COMP_CLASS__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMP_CLASS__ATTRIBUTES = COMP_CLASS__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMP_CLASS__CONTENT = COMP_CLASS__CONTENT;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMP_CLASS__USES = COMP_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delegated Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMP_CLASS__DELEGATED_INTERFACES = COMP_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Comp Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMP_CLASS_FEATURE_COUNT = COMP_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Comp Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMP_CLASS_OPERATION_COUNT = COMP_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dedal.impl.CompTypeImpl <em>Comp Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.CompTypeImpl
	 * @see dedal.impl.DedalPackageImpl#getCompType()
	 * @generated
	 */
	int COMP_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TYPE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Comp Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TYPE__COMP_INTERFACES = COMPONENT__COMP_INTERFACES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TYPE__ID = COMPONENT__ID;

	/**
	 * The number of structural features of the '<em>Comp Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TYPE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comp Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_TYPE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dedal.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.RepositoryImpl
	 * @see dedal.impl.DedalPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Interface Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__INTERFACE_TYPES = 2;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dedal.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.impl.AttributeImpl
	 * @see dedal.impl.DedalPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dedal.DIRECTION <em>DIRECTION</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.DIRECTION
	 * @see dedal.impl.DedalPackageImpl#getDIRECTION()
	 * @generated
	 */
	int DIRECTION = 24;

	/**
	 * The meta object id for the '{@link dedal.ATTRIBUTE_TYPE <em>ATTRIBUTE TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dedal.ATTRIBUTE_TYPE
	 * @see dedal.impl.DedalPackageImpl#getATTRIBUTE_TYPE()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 25;


	/**
	 * Returns the meta object for class '{@link dedal.ArchitectureDescription <em>Architecture Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Description</em>'.
	 * @see dedal.ArchitectureDescription
	 * @generated
	 */
	EClass getArchitectureDescription();

	/**
	 * Returns the meta object for the attribute '{@link dedal.ArchitectureDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dedal.ArchitectureDescription#getName()
	 * @see #getArchitectureDescription()
	 * @generated
	 */
	EAttribute getArchitectureDescription_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dedal.ArchitectureDescription#getInterfaceTypes <em>Interface Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Types</em>'.
	 * @see dedal.ArchitectureDescription#getInterfaceTypes()
	 * @see #getArchitectureDescription()
	 * @generated
	 */
	EReference getArchitectureDescription_InterfaceTypes();

	/**
	 * Returns the meta object for class '{@link dedal.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see dedal.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link dedal.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dedal.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dedal.Component#getCompInterfaces <em>Comp Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comp Interfaces</em>'.
	 * @see dedal.Component#getCompInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_CompInterfaces();

	/**
	 * Returns the meta object for the attribute '{@link dedal.Component#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dedal.Component#getId()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Id();

	/**
	 * Returns the meta object for class '{@link dedal.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see dedal.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link dedal.Connection#getServerIntElem <em>Server Int Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server Int Elem</em>'.
	 * @see dedal.Connection#getServerIntElem()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ServerIntElem();

	/**
	 * Returns the meta object for the reference '{@link dedal.Connection#getClientIntElem <em>Client Int Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client Int Elem</em>'.
	 * @see dedal.Connection#getClientIntElem()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ClientIntElem();

	/**
	 * Returns the meta object for the attribute '{@link dedal.Connection#getRefID <em>Ref ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref ID</em>'.
	 * @see dedal.Connection#getRefID()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_RefID();

	/**
	 * Returns the meta object for class '{@link dedal.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see dedal.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link dedal.Interface#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see dedal.Interface#getDirection()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Direction();

	/**
	 * Returns the meta object for the reference '{@link dedal.Interface#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see dedal.Interface#getType()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Type();

	/**
	 * Returns the meta object for the reference '{@link dedal.Interface#getDelegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegation</em>'.
	 * @see dedal.Interface#getDelegation()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Delegation();

	/**
	 * Returns the meta object for the reference '{@link dedal.Interface#getInstantiates <em>Instantiates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiates</em>'.
	 * @see dedal.Interface#getInstantiates()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Instantiates();

	/**
	 * Returns the meta object for class '{@link dedal.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see dedal.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for the attribute '{@link dedal.Interaction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dedal.Interaction#getName()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_Name();

	/**
	 * Returns the meta object for class '{@link dedal.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see dedal.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference list '{@link dedal.Port#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see dedal.Port#getInterfaces()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Interfaces();

	/**
	 * Returns the meta object for class '{@link dedal.CompositePort <em>Composite Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Port</em>'.
	 * @see dedal.CompositePort
	 * @generated
	 */
	EClass getCompositePort();

	/**
	 * Returns the meta object for the reference list '{@link dedal.CompositePort#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see dedal.CompositePort#getPorts()
	 * @see #getCompositePort()
	 * @generated
	 */
	EReference getCompositePort_Ports();

	/**
	 * Returns the meta object for class '{@link dedal.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Type</em>'.
	 * @see dedal.InterfaceType
	 * @generated
	 */
	EClass getInterfaceType();

	/**
	 * Returns the meta object for the attribute '{@link dedal.InterfaceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dedal.InterfaceType#getName()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EAttribute getInterfaceType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dedal.InterfaceType#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signatures</em>'.
	 * @see dedal.InterfaceType#getSignatures()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_Signatures();

	/**
	 * Returns the meta object for class '{@link dedal.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see dedal.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the attribute '{@link dedal.Signature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dedal.Signature#getName()
	 * @see #getSignature()
	 * @generated
	 */
	EAttribute getSignature_Name();

	/**
	 * Returns the meta object for the attribute '{@link dedal.Signature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dedal.Signature#getType()
	 * @see #getSignature()
	 * @generated
	 */
	EAttribute getSignature_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link dedal.Signature#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see dedal.Signature#getParameters()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link dedal.Signature#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dedal.Signature#getId()
	 * @see #getSignature()
	 * @generated
	 */
	EAttribute getSignature_Id();

	/**
	 * Returns the meta object for class '{@link dedal.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see dedal.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link dedal.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dedal.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link dedal.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dedal.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link dedal.Parameter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dedal.Parameter#getId()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Id();

	/**
	 * Returns the meta object for class '{@link dedal.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see dedal.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link dedal.Specification#getSpecComponents <em>Spec Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec Components</em>'.
	 * @see dedal.Specification#getSpecComponents()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_SpecComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link dedal.Specification#getSpecConnections <em>Spec Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec Connections</em>'.
	 * @see dedal.Specification#getSpecConnections()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_SpecConnections();

	/**
	 * Returns the meta object for class '{@link dedal.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see dedal.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link dedal.Configuration#getConfigComponents <em>Config Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Components</em>'.
	 * @see dedal.Configuration#getConfigComponents()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_ConfigComponents();

	/**
	 * Returns the meta object for the reference list '{@link dedal.Configuration#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implements</em>'.
	 * @see dedal.Configuration#getImplements()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Implements();

	/**
	 * Returns the meta object for the containment reference list '{@link dedal.Configuration#getConfigConnections <em>Config Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Connections</em>'.
	 * @see dedal.Configuration#getConfigConnections()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_ConfigConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link dedal.Configuration#getComptypes <em>Comptypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comptypes</em>'.
	 * @see dedal.Configuration#getComptypes()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Comptypes();

	/**
	 * Returns the meta object for class '{@link dedal.Assembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly</em>'.
	 * @see dedal.Assembly
	 * @generated
	 */
	EClass getAssembly();

	/**
	 * Returns the meta object for the containment reference list '{@link dedal.Assembly#getAssmComponents <em>Assm Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assm Components</em>'.
	 * @see dedal.Assembly#getAssmComponents()
	 * @see #getAssembly()
	 * @generated
	 */
	EReference getAssembly_AssmComponents();

	/**
	 * Returns the meta object for the reference '{@link dedal.Assembly#getInstantiates <em>Instantiates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiates</em>'.
	 * @see dedal.Assembly#getInstantiates()
	 * @see #getAssembly()
	 * @generated
	 */
	EReference getAssembly_Instantiates();

	/**
	 * Returns the meta object for the containment reference list '{@link dedal.Assembly#getAssemblyConnections <em>Assembly Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assembly Connections</em>'.
	 * @see dedal.Assembly#getAssemblyConnections()
	 * @see #getAssembly()
	 * @generated
	 */
	EReference getAssembly_AssemblyConnections();

	/**
	 * Returns the meta object for class '{@link dedal.CompRole <em>Comp Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Role</em>'.
	 * @see dedal.CompRole
	 * @generated
	 */
	EClass getCompRole();

	/**
	 * Returns the meta object for the attribute '{@link dedal.CompRole#getMinInstanceNbr <em>Min Instance Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Instance Nbr</em>'.
	 * @see dedal.CompRole#getMinInstanceNbr()
	 * @see #getCompRole()
	 * @generated
	 */
	EAttribute getCompRole_MinInstanceNbr();

	/**
	 * Returns the meta object for the attribute '{@link dedal.CompRole#getMaxInstanceNbr <em>Max Instance Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Instance Nbr</em>'.
	 * @see dedal.CompRole#getMaxInstanceNbr()
	 * @see #getCompRole()
	 * @generated
	 */
	EAttribute getCompRole_MaxInstanceNbr();

	/**
	 * Returns the meta object for class '{@link dedal.CompClass <em>Comp Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Class</em>'.
	 * @see dedal.CompClass
	 * @generated
	 */
	EClass getCompClass();

	/**
	 * Returns the meta object for the reference list '{@link dedal.CompClass#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realizes</em>'.
	 * @see dedal.CompClass#getRealizes()
	 * @see #getCompClass()
	 * @generated
	 */
	EReference getCompClass_Realizes();

	/**
	 * Returns the meta object for the reference '{@link dedal.CompClass#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see dedal.CompClass#getImplements()
	 * @see #getCompClass()
	 * @generated
	 */
	EReference getCompClass_Implements();

	/**
	 * Returns the meta object for the containment reference list '{@link dedal.CompClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see dedal.CompClass#getAttributes()
	 * @see #getCompClass()
	 * @generated
	 */
	EReference getCompClass_Attributes();

	/**
	 * Returns the meta object for the reference '{@link dedal.CompClass#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see dedal.CompClass#getContent()
	 * @see #getCompClass()
	 * @generated
	 */
	EReference getCompClass_Content();

	/**
	 * Returns the meta object for class '{@link dedal.CompInstance <em>Comp Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Instance</em>'.
	 * @see dedal.CompInstance
	 * @generated
	 */
	EClass getCompInstance();

	/**
	 * Returns the meta object for the reference '{@link dedal.CompInstance#getInstantiates <em>Instantiates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiates</em>'.
	 * @see dedal.CompInstance#getInstantiates()
	 * @see #getCompInstance()
	 * @generated
	 */
	EReference getCompInstance_Instantiates();

	/**
	 * Returns the meta object for the reference '{@link dedal.CompInstance#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see dedal.CompInstance#getRole()
	 * @see #getCompInstance()
	 * @generated
	 */
	EReference getCompInstance_Role();

	/**
	 * Returns the meta object for class '{@link dedal.RoleConnection <em>Role Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Connection</em>'.
	 * @see dedal.RoleConnection
	 * @generated
	 */
	EClass getRoleConnection();

	/**
	 * Returns the meta object for the reference '{@link dedal.RoleConnection#getClientCompElem <em>Client Comp Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client Comp Elem</em>'.
	 * @see dedal.RoleConnection#getClientCompElem()
	 * @see #getRoleConnection()
	 * @generated
	 */
	EReference getRoleConnection_ClientCompElem();

	/**
	 * Returns the meta object for the reference '{@link dedal.RoleConnection#getServerCompElem <em>Server Comp Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server Comp Elem</em>'.
	 * @see dedal.RoleConnection#getServerCompElem()
	 * @see #getRoleConnection()
	 * @generated
	 */
	EReference getRoleConnection_ServerCompElem();

	/**
	 * Returns the meta object for class '{@link dedal.ClassConnection <em>Class Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Connection</em>'.
	 * @see dedal.ClassConnection
	 * @generated
	 */
	EClass getClassConnection();

	/**
	 * Returns the meta object for the reference '{@link dedal.ClassConnection#getClientClassElem <em>Client Class Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client Class Elem</em>'.
	 * @see dedal.ClassConnection#getClientClassElem()
	 * @see #getClassConnection()
	 * @generated
	 */
	EReference getClassConnection_ClientClassElem();

	/**
	 * Returns the meta object for the reference '{@link dedal.ClassConnection#getServerClassElem <em>Server Class Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server Class Elem</em>'.
	 * @see dedal.ClassConnection#getServerClassElem()
	 * @see #getClassConnection()
	 * @generated
	 */
	EReference getClassConnection_ServerClassElem();

	/**
	 * Returns the meta object for class '{@link dedal.InstConnection <em>Inst Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inst Connection</em>'.
	 * @see dedal.InstConnection
	 * @generated
	 */
	EClass getInstConnection();

	/**
	 * Returns the meta object for the reference '{@link dedal.InstConnection#getClientInstElem <em>Client Inst Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client Inst Elem</em>'.
	 * @see dedal.InstConnection#getClientInstElem()
	 * @see #getInstConnection()
	 * @generated
	 */
	EReference getInstConnection_ClientInstElem();

	/**
	 * Returns the meta object for the reference '{@link dedal.InstConnection#getServerInstElem <em>Server Inst Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server Inst Elem</em>'.
	 * @see dedal.InstConnection#getServerInstElem()
	 * @see #getInstConnection()
	 * @generated
	 */
	EReference getInstConnection_ServerInstElem();

	/**
	 * Returns the meta object for class '{@link dedal.DedalDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see dedal.DedalDiagram
	 * @generated
	 */
	EClass getDedalDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link dedal.DedalDiagram#getArchitectureDescriptions <em>Architecture Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Architecture Descriptions</em>'.
	 * @see dedal.DedalDiagram#getArchitectureDescriptions()
	 * @see #getDedalDiagram()
	 * @generated
	 */
	EReference getDedalDiagram_ArchitectureDescriptions();

	/**
	 * Returns the meta object for the attribute '{@link dedal.DedalDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dedal.DedalDiagram#getName()
	 * @see #getDedalDiagram()
	 * @generated
	 */
	EAttribute getDedalDiagram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dedal.DedalDiagram#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see dedal.DedalDiagram#getRepositories()
	 * @see #getDedalDiagram()
	 * @generated
	 */
	EReference getDedalDiagram_Repositories();

	/**
	 * Returns the meta object for class '{@link dedal.CompositeCompClass <em>Composite Comp Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Comp Class</em>'.
	 * @see dedal.CompositeCompClass
	 * @generated
	 */
	EClass getCompositeCompClass();

	/**
	 * Returns the meta object for the reference '{@link dedal.CompositeCompClass#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses</em>'.
	 * @see dedal.CompositeCompClass#getUses()
	 * @see #getCompositeCompClass()
	 * @generated
	 */
	EReference getCompositeCompClass_Uses();

	/**
	 * Returns the meta object for the reference list '{@link dedal.CompositeCompClass#getDelegatedInterfaces <em>Delegated Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegated Interfaces</em>'.
	 * @see dedal.CompositeCompClass#getDelegatedInterfaces()
	 * @see #getCompositeCompClass()
	 * @generated
	 */
	EReference getCompositeCompClass_DelegatedInterfaces();

	/**
	 * Returns the meta object for class '{@link dedal.CompType <em>Comp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Type</em>'.
	 * @see dedal.CompType
	 * @generated
	 */
	EClass getCompType();

	/**
	 * Returns the meta object for class '{@link dedal.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see dedal.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the attribute '{@link dedal.Repository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dedal.Repository#getName()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dedal.Repository#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see dedal.Repository#getComponents()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link dedal.Repository#getInterfaceTypes <em>Interface Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Types</em>'.
	 * @see dedal.Repository#getInterfaceTypes()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_InterfaceTypes();

	/**
	 * Returns the meta object for class '{@link dedal.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see dedal.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link dedal.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dedal.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link dedal.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dedal.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for enum '{@link dedal.DIRECTION <em>DIRECTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DIRECTION</em>'.
	 * @see dedal.DIRECTION
	 * @generated
	 */
	EEnum getDIRECTION();

	/**
	 * Returns the meta object for enum '{@link dedal.ATTRIBUTE_TYPE <em>ATTRIBUTE TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ATTRIBUTE TYPE</em>'.
	 * @see dedal.ATTRIBUTE_TYPE
	 * @generated
	 */
	EEnum getATTRIBUTE_TYPE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DedalFactory getDedalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dedal.impl.ArchitectureDescriptionImpl <em>Architecture Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.ArchitectureDescriptionImpl
		 * @see dedal.impl.DedalPackageImpl#getArchitectureDescription()
		 * @generated
		 */
		EClass ARCHITECTURE_DESCRIPTION = eINSTANCE.getArchitectureDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE_DESCRIPTION__NAME = eINSTANCE.getArchitectureDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Interface Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_DESCRIPTION__INTERFACE_TYPES = eINSTANCE.getArchitectureDescription_InterfaceTypes();

		/**
		 * The meta object literal for the '{@link dedal.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.ComponentImpl
		 * @see dedal.impl.DedalPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Comp Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMP_INTERFACES = eINSTANCE.getComponent_CompInterfaces();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ID = eINSTANCE.getComponent_Id();

		/**
		 * The meta object literal for the '{@link dedal.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.ConnectionImpl
		 * @see dedal.impl.DedalPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Server Int Elem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SERVER_INT_ELEM = eINSTANCE.getConnection_ServerIntElem();

		/**
		 * The meta object literal for the '<em><b>Client Int Elem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__CLIENT_INT_ELEM = eINSTANCE.getConnection_ClientIntElem();

		/**
		 * The meta object literal for the '<em><b>Ref ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__REF_ID = eINSTANCE.getConnection_RefID();

		/**
		 * The meta object literal for the '{@link dedal.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.InterfaceImpl
		 * @see dedal.impl.DedalPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__DIRECTION = eINSTANCE.getInterface_Direction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__TYPE = eINSTANCE.getInterface_Type();

		/**
		 * The meta object literal for the '<em><b>Delegation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__DELEGATION = eINSTANCE.getInterface_Delegation();

		/**
		 * The meta object literal for the '<em><b>Instantiates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__INSTANTIATES = eINSTANCE.getInterface_Instantiates();

		/**
		 * The meta object literal for the '{@link dedal.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.InteractionImpl
		 * @see dedal.impl.DedalPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__NAME = eINSTANCE.getInteraction_Name();

		/**
		 * The meta object literal for the '{@link dedal.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.PortImpl
		 * @see dedal.impl.DedalPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__INTERFACES = eINSTANCE.getPort_Interfaces();

		/**
		 * The meta object literal for the '{@link dedal.impl.CompositePortImpl <em>Composite Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.CompositePortImpl
		 * @see dedal.impl.DedalPackageImpl#getCompositePort()
		 * @generated
		 */
		EClass COMPOSITE_PORT = eINSTANCE.getCompositePort();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_PORT__PORTS = eINSTANCE.getCompositePort_Ports();

		/**
		 * The meta object literal for the '{@link dedal.impl.InterfaceTypeImpl <em>Interface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.InterfaceTypeImpl
		 * @see dedal.impl.DedalPackageImpl#getInterfaceType()
		 * @generated
		 */
		EClass INTERFACE_TYPE = eINSTANCE.getInterfaceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_TYPE__NAME = eINSTANCE.getInterfaceType_Name();

		/**
		 * The meta object literal for the '<em><b>Signatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_TYPE__SIGNATURES = eINSTANCE.getInterfaceType_Signatures();

		/**
		 * The meta object literal for the '{@link dedal.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.SignatureImpl
		 * @see dedal.impl.DedalPackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE__NAME = eINSTANCE.getSignature_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE__TYPE = eINSTANCE.getSignature_Type();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__PARAMETERS = eINSTANCE.getSignature_Parameters();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE__ID = eINSTANCE.getSignature_Id();

		/**
		 * The meta object literal for the '{@link dedal.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.ParameterImpl
		 * @see dedal.impl.DedalPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ID = eINSTANCE.getParameter_Id();

		/**
		 * The meta object literal for the '{@link dedal.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.SpecificationImpl
		 * @see dedal.impl.DedalPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Spec Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__SPEC_COMPONENTS = eINSTANCE.getSpecification_SpecComponents();

		/**
		 * The meta object literal for the '<em><b>Spec Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__SPEC_CONNECTIONS = eINSTANCE.getSpecification_SpecConnections();

		/**
		 * The meta object literal for the '{@link dedal.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.ConfigurationImpl
		 * @see dedal.impl.DedalPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Config Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONFIG_COMPONENTS = eINSTANCE.getConfiguration_ConfigComponents();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__IMPLEMENTS = eINSTANCE.getConfiguration_Implements();

		/**
		 * The meta object literal for the '<em><b>Config Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONFIG_CONNECTIONS = eINSTANCE.getConfiguration_ConfigConnections();

		/**
		 * The meta object literal for the '<em><b>Comptypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__COMPTYPES = eINSTANCE.getConfiguration_Comptypes();

		/**
		 * The meta object literal for the '{@link dedal.impl.AssemblyImpl <em>Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.AssemblyImpl
		 * @see dedal.impl.DedalPackageImpl#getAssembly()
		 * @generated
		 */
		EClass ASSEMBLY = eINSTANCE.getAssembly();

		/**
		 * The meta object literal for the '<em><b>Assm Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY__ASSM_COMPONENTS = eINSTANCE.getAssembly_AssmComponents();

		/**
		 * The meta object literal for the '<em><b>Instantiates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY__INSTANTIATES = eINSTANCE.getAssembly_Instantiates();

		/**
		 * The meta object literal for the '<em><b>Assembly Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSEMBLY__ASSEMBLY_CONNECTIONS = eINSTANCE.getAssembly_AssemblyConnections();

		/**
		 * The meta object literal for the '{@link dedal.impl.CompRoleImpl <em>Comp Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.CompRoleImpl
		 * @see dedal.impl.DedalPackageImpl#getCompRole()
		 * @generated
		 */
		EClass COMP_ROLE = eINSTANCE.getCompRole();

		/**
		 * The meta object literal for the '<em><b>Min Instance Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMP_ROLE__MIN_INSTANCE_NBR = eINSTANCE.getCompRole_MinInstanceNbr();

		/**
		 * The meta object literal for the '<em><b>Max Instance Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMP_ROLE__MAX_INSTANCE_NBR = eINSTANCE.getCompRole_MaxInstanceNbr();

		/**
		 * The meta object literal for the '{@link dedal.impl.CompClassImpl <em>Comp Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.CompClassImpl
		 * @see dedal.impl.DedalPackageImpl#getCompClass()
		 * @generated
		 */
		EClass COMP_CLASS = eINSTANCE.getCompClass();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_CLASS__REALIZES = eINSTANCE.getCompClass_Realizes();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_CLASS__IMPLEMENTS = eINSTANCE.getCompClass_Implements();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_CLASS__ATTRIBUTES = eINSTANCE.getCompClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_CLASS__CONTENT = eINSTANCE.getCompClass_Content();

		/**
		 * The meta object literal for the '{@link dedal.impl.CompInstanceImpl <em>Comp Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.CompInstanceImpl
		 * @see dedal.impl.DedalPackageImpl#getCompInstance()
		 * @generated
		 */
		EClass COMP_INSTANCE = eINSTANCE.getCompInstance();

		/**
		 * The meta object literal for the '<em><b>Instantiates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_INSTANCE__INSTANTIATES = eINSTANCE.getCompInstance_Instantiates();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_INSTANCE__ROLE = eINSTANCE.getCompInstance_Role();

		/**
		 * The meta object literal for the '{@link dedal.impl.RoleConnectionImpl <em>Role Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.RoleConnectionImpl
		 * @see dedal.impl.DedalPackageImpl#getRoleConnection()
		 * @generated
		 */
		EClass ROLE_CONNECTION = eINSTANCE.getRoleConnection();

		/**
		 * The meta object literal for the '<em><b>Client Comp Elem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CONNECTION__CLIENT_COMP_ELEM = eINSTANCE.getRoleConnection_ClientCompElem();

		/**
		 * The meta object literal for the '<em><b>Server Comp Elem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CONNECTION__SERVER_COMP_ELEM = eINSTANCE.getRoleConnection_ServerCompElem();

		/**
		 * The meta object literal for the '{@link dedal.impl.ClassConnectionImpl <em>Class Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.ClassConnectionImpl
		 * @see dedal.impl.DedalPackageImpl#getClassConnection()
		 * @generated
		 */
		EClass CLASS_CONNECTION = eINSTANCE.getClassConnection();

		/**
		 * The meta object literal for the '<em><b>Client Class Elem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_CONNECTION__CLIENT_CLASS_ELEM = eINSTANCE.getClassConnection_ClientClassElem();

		/**
		 * The meta object literal for the '<em><b>Server Class Elem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_CONNECTION__SERVER_CLASS_ELEM = eINSTANCE.getClassConnection_ServerClassElem();

		/**
		 * The meta object literal for the '{@link dedal.impl.InstConnectionImpl <em>Inst Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.InstConnectionImpl
		 * @see dedal.impl.DedalPackageImpl#getInstConnection()
		 * @generated
		 */
		EClass INST_CONNECTION = eINSTANCE.getInstConnection();

		/**
		 * The meta object literal for the '<em><b>Client Inst Elem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INST_CONNECTION__CLIENT_INST_ELEM = eINSTANCE.getInstConnection_ClientInstElem();

		/**
		 * The meta object literal for the '<em><b>Server Inst Elem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INST_CONNECTION__SERVER_INST_ELEM = eINSTANCE.getInstConnection_ServerInstElem();

		/**
		 * The meta object literal for the '{@link dedal.impl.DedalDiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.DedalDiagramImpl
		 * @see dedal.impl.DedalPackageImpl#getDedalDiagram()
		 * @generated
		 */
		EClass DEDAL_DIAGRAM = eINSTANCE.getDedalDiagram();

		/**
		 * The meta object literal for the '<em><b>Architecture Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEDAL_DIAGRAM__ARCHITECTURE_DESCRIPTIONS = eINSTANCE.getDedalDiagram_ArchitectureDescriptions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEDAL_DIAGRAM__NAME = eINSTANCE.getDedalDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEDAL_DIAGRAM__REPOSITORIES = eINSTANCE.getDedalDiagram_Repositories();

		/**
		 * The meta object literal for the '{@link dedal.impl.CompositeCompClassImpl <em>Composite Comp Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.CompositeCompClassImpl
		 * @see dedal.impl.DedalPackageImpl#getCompositeCompClass()
		 * @generated
		 */
		EClass COMPOSITE_COMP_CLASS = eINSTANCE.getCompositeCompClass();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_COMP_CLASS__USES = eINSTANCE.getCompositeCompClass_Uses();

		/**
		 * The meta object literal for the '<em><b>Delegated Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_COMP_CLASS__DELEGATED_INTERFACES = eINSTANCE.getCompositeCompClass_DelegatedInterfaces();

		/**
		 * The meta object literal for the '{@link dedal.impl.CompTypeImpl <em>Comp Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.CompTypeImpl
		 * @see dedal.impl.DedalPackageImpl#getCompType()
		 * @generated
		 */
		EClass COMP_TYPE = eINSTANCE.getCompType();

		/**
		 * The meta object literal for the '{@link dedal.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.RepositoryImpl
		 * @see dedal.impl.DedalPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__NAME = eINSTANCE.getRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__COMPONENTS = eINSTANCE.getRepository_Components();

		/**
		 * The meta object literal for the '<em><b>Interface Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__INTERFACE_TYPES = eINSTANCE.getRepository_InterfaceTypes();

		/**
		 * The meta object literal for the '{@link dedal.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.impl.AttributeImpl
		 * @see dedal.impl.DedalPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link dedal.DIRECTION <em>DIRECTION</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.DIRECTION
		 * @see dedal.impl.DedalPackageImpl#getDIRECTION()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDIRECTION();

		/**
		 * The meta object literal for the '{@link dedal.ATTRIBUTE_TYPE <em>ATTRIBUTE TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dedal.ATTRIBUTE_TYPE
		 * @see dedal.impl.DedalPackageImpl#getATTRIBUTE_TYPE()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getATTRIBUTE_TYPE();

	}

} //DedalPackage
