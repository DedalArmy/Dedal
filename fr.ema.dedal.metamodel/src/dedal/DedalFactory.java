/**
 */
package dedal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dedal.DedalPackage
 * @generated
 */
public interface DedalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DedalFactory eINSTANCE = dedal.impl.DedalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	Interface createInterface();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Composite Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Port</em>'.
	 * @generated
	 */
	CompositePort createCompositePort();

	/**
	 * Returns a new object of class '<em>Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Type</em>'.
	 * @generated
	 */
	InterfaceType createInterfaceType();

	/**
	 * Returns a new object of class '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature</em>'.
	 * @generated
	 */
	Signature createSignature();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification</em>'.
	 * @generated
	 */
	Specification createSpecification();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly</em>'.
	 * @generated
	 */
	Assembly createAssembly();

	/**
	 * Returns a new object of class '<em>Comp Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Role</em>'.
	 * @generated
	 */
	CompRole createCompRole();

	/**
	 * Returns a new object of class '<em>Comp Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Class</em>'.
	 * @generated
	 */
	CompClass createCompClass();

	/**
	 * Returns a new object of class '<em>Comp Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Instance</em>'.
	 * @generated
	 */
	CompInstance createCompInstance();

	/**
	 * Returns a new object of class '<em>Role Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Connection</em>'.
	 * @generated
	 */
	RoleConnection createRoleConnection();

	/**
	 * Returns a new object of class '<em>Class Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Connection</em>'.
	 * @generated
	 */
	ClassConnection createClassConnection();

	/**
	 * Returns a new object of class '<em>Inst Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inst Connection</em>'.
	 * @generated
	 */
	InstConnection createInstConnection();

	/**
	 * Returns a new object of class '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram</em>'.
	 * @generated
	 */
	DedalDiagram createDedalDiagram();

	/**
	 * Returns a new object of class '<em>Composite Comp Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Comp Class</em>'.
	 * @generated
	 */
	CompositeCompClass createCompositeCompClass();

	/**
	 * Returns a new object of class '<em>Comp Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Type</em>'.
	 * @generated
	 */
	CompType createCompType();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	Repository createRepository();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DedalPackage getDedalPackage();

} //DedalFactory
