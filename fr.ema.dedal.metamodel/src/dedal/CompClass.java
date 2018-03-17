/**
 */
package dedal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dedal.CompClass#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link dedal.CompClass#getImplements <em>Implements</em>}</li>
 *   <li>{@link dedal.CompClass#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link dedal.CompClass#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see dedal.DedalPackage#getCompClass()
 * @model
 * @generated
 */
public interface CompClass extends Component {
	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' reference list.
	 * The list contents are of type {@link dedal.CompRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes</em>' reference list.
	 * @see dedal.DedalPackage#getCompClass_Realizes()
	 * @model keys="name id" ordered="false"
	 * @generated
	 */
	EList<CompRole> getRealizes();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(CompType)
	 * @see dedal.DedalPackage#getCompClass_Implements()
	 * @model keys="name id" required="true"
	 * @generated
	 */
	CompType getImplements();

	/**
	 * Sets the value of the '{@link dedal.CompClass#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(CompType value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link dedal.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see dedal.DedalPackage#getCompClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(CompInstance)
	 * @see dedal.DedalPackage#getCompClass_Content()
	 * @model
	 * @generated
	 */
	CompInstance getContent();

	/**
	 * Sets the value of the '{@link dedal.CompClass#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(CompInstance value);

} // CompClass
