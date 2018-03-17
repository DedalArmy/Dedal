/**
 */
package dedal.tests;

import dedal.CompositeCompClass;
import dedal.DedalFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composite Comp Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeCompClassTest extends CompClassTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositeCompClassTest.class);
	}

	/**
	 * Constructs a new Composite Comp Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeCompClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Composite Comp Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompositeCompClass getFixture() {
		return (CompositeCompClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DedalFactory.eINSTANCE.createCompositeCompClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CompositeCompClassTest
