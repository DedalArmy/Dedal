/**
 */
package dedal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Comp Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dedal.CompositeCompClass#getUses <em>Uses</em>}</li>
 *   <li>{@link dedal.CompositeCompClass#getDelegatedInterfaces <em>Delegated Interfaces</em>}</li>
 * </ul>
 *
 * @see dedal.DedalPackage#getCompositeCompClass()
 * @model
 * @generated
 */
public interface CompositeCompClass extends CompClass {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference.
	 * @see #setUses(Configuration)
	 * @see dedal.DedalPackage#getCompositeCompClass_Uses()
	 * @model keys="name" required="true"
	 * @generated
	 */
	Configuration getUses();

	/**
	 * Sets the value of the '{@link dedal.CompositeCompClass#getUses <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' reference.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(Configuration value);

	/**
	 * Returns the value of the '<em><b>Delegated Interfaces</b></em>' reference list.
	 * The list contents are of type {@link dedal.Interaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegated Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegated Interfaces</em>' reference list.
	 * @see dedal.DedalPackage#getCompositeCompClass_DelegatedInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interaction> getDelegatedInterfaces();

} // CompositeCompClass
