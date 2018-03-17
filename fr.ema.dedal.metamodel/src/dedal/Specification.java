/**
 */
package dedal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dedal.Specification#getSpecComponents <em>Spec Components</em>}</li>
 *   <li>{@link dedal.Specification#getSpecConnections <em>Spec Connections</em>}</li>
 * </ul>
 *
 * @see dedal.DedalPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends ArchitectureDescription {
	/**
	 * Returns the value of the '<em><b>Spec Components</b></em>' containment reference list.
	 * The list contents are of type {@link dedal.CompRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Components</em>' containment reference list.
	 * @see dedal.DedalPackage#getSpecification_SpecComponents()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<CompRole> getSpecComponents();

	/**
	 * Returns the value of the '<em><b>Spec Connections</b></em>' containment reference list.
	 * The list contents are of type {@link dedal.RoleConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Connections</em>' containment reference list.
	 * @see dedal.DedalPackage#getSpecification_SpecConnections()
	 * @model containment="true" keys="refID"
	 * @generated
	 */
	EList<RoleConnection> getSpecConnections();

} // Specification
