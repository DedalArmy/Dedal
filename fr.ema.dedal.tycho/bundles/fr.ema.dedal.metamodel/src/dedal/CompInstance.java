/**
 */
package dedal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dedal.CompInstance#getInstantiates <em>Instantiates</em>}</li>
 *   <li>{@link dedal.CompInstance#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see dedal.DedalPackage#getCompInstance()
 * @model
 * @generated
 */
public interface CompInstance extends Component {
	/**
	 * Returns the value of the '<em><b>Instantiates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates</em>' reference.
	 * @see #setInstantiates(CompClass)
	 * @see dedal.DedalPackage#getCompInstance_Instantiates()
	 * @model keys="name id" required="true"
	 * @generated
	 */
	CompClass getInstantiates();

	/**
	 * Sets the value of the '{@link dedal.CompInstance#getInstantiates <em>Instantiates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiates</em>' reference.
	 * @see #getInstantiates()
	 * @generated
	 */
	void setInstantiates(CompClass value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(CompRole)
	 * @see dedal.DedalPackage#getCompInstance_Role()
	 * @model
	 * @generated
	 */
	CompRole getRole();

	/**
	 * Sets the value of the '{@link dedal.CompInstance#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CompRole value);

} // CompInstance
