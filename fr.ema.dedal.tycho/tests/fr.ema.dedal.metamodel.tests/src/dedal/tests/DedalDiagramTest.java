/**
 */
package dedal.tests;

import dedal.DedalDiagram;
import dedal.DedalFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DedalDiagramTest extends TestCase {

	/**
	 * The fixture for this Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DedalDiagram fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DedalDiagramTest.class);
	}

	/**
	 * Constructs a new Diagram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DedalDiagramTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DedalDiagram fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DedalDiagram getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DedalFactory.eINSTANCE.createDedalDiagram());
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

} //DedalDiagramTest
