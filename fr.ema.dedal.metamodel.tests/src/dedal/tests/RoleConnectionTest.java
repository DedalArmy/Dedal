/**
 */
package dedal.tests;

import dedal.DedalFactory;
import dedal.RoleConnection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleConnectionTest extends ConnectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoleConnectionTest.class);
	}

	/**
	 * Constructs a new Role Connection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Role Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RoleConnection getFixture() {
		return (RoleConnection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DedalFactory.eINSTANCE.createRoleConnection());
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

} //RoleConnectionTest
