/**
 */
package dedal.util;

import dedal.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dedal.DedalPackage
 * @generated
 */
public class DedalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DedalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DedalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DedalPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DedalSwitch<Adapter> modelSwitch =
		new DedalSwitch<Adapter>() {
			@Override
			public Adapter caseArchitectureDescription(ArchitectureDescription object) {
				return createArchitectureDescriptionAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseInteraction(Interaction object) {
				return createInteractionAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseCompositePort(CompositePort object) {
				return createCompositePortAdapter();
			}
			@Override
			public Adapter caseInterfaceType(InterfaceType object) {
				return createInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseSignature(Signature object) {
				return createSignatureAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseSpecification(Specification object) {
				return createSpecificationAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseAssembly(Assembly object) {
				return createAssemblyAdapter();
			}
			@Override
			public Adapter caseCompRole(CompRole object) {
				return createCompRoleAdapter();
			}
			@Override
			public Adapter caseCompClass(CompClass object) {
				return createCompClassAdapter();
			}
			@Override
			public Adapter caseCompInstance(CompInstance object) {
				return createCompInstanceAdapter();
			}
			@Override
			public Adapter caseRoleConnection(RoleConnection object) {
				return createRoleConnectionAdapter();
			}
			@Override
			public Adapter caseClassConnection(ClassConnection object) {
				return createClassConnectionAdapter();
			}
			@Override
			public Adapter caseInstConnection(InstConnection object) {
				return createInstConnectionAdapter();
			}
			@Override
			public Adapter caseDedalDiagram(DedalDiagram object) {
				return createDedalDiagramAdapter();
			}
			@Override
			public Adapter caseCompositeCompClass(CompositeCompClass object) {
				return createCompositeCompClassAdapter();
			}
			@Override
			public Adapter caseCompType(CompType object) {
				return createCompTypeAdapter();
			}
			@Override
			public Adapter caseRepository(Repository object) {
				return createRepositoryAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dedal.ArchitectureDescription <em>Architecture Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.ArchitectureDescription
	 * @generated
	 */
	public Adapter createArchitectureDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.Interaction
	 * @generated
	 */
	public Adapter createInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.CompositePort <em>Composite Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.CompositePort
	 * @generated
	 */
	public Adapter createCompositePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.InterfaceType
	 * @generated
	 */
	public Adapter createInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.Signature
	 * @generated
	 */
	public Adapter createSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.Specification
	 * @generated
	 */
	public Adapter createSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.Assembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.Assembly
	 * @generated
	 */
	public Adapter createAssemblyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.CompRole <em>Comp Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.CompRole
	 * @generated
	 */
	public Adapter createCompRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.CompClass <em>Comp Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.CompClass
	 * @generated
	 */
	public Adapter createCompClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.CompInstance <em>Comp Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.CompInstance
	 * @generated
	 */
	public Adapter createCompInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.RoleConnection <em>Role Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.RoleConnection
	 * @generated
	 */
	public Adapter createRoleConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.ClassConnection <em>Class Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.ClassConnection
	 * @generated
	 */
	public Adapter createClassConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.InstConnection <em>Inst Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.InstConnection
	 * @generated
	 */
	public Adapter createInstConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.DedalDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.DedalDiagram
	 * @generated
	 */
	public Adapter createDedalDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.CompositeCompClass <em>Composite Comp Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.CompositeCompClass
	 * @generated
	 */
	public Adapter createCompositeCompClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.CompType <em>Comp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.CompType
	 * @generated
	 */
	public Adapter createCompTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dedal.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dedal.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DedalAdapterFactory
