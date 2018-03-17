/**
 */
package dedal.tests;

import dedal.CompRole;
import dedal.DedalFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Comp Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompRoleTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompRoleTest.class);
	}

	/**
	 * Constructs a new Comp Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Comp Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompRole getFixture() {
		return (CompRole)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DedalFactory.eINSTANCE.createCompRole());
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

} //CompRoleTest
