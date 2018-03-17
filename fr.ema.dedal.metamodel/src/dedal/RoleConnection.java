/**
 */
package dedal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dedal.RoleConnection#getClientCompElem <em>Client Comp Elem</em>}</li>
 *   <li>{@link dedal.RoleConnection#getServerCompElem <em>Server Comp Elem</em>}</li>
 * </ul>
 *
 * @see dedal.DedalPackage#getRoleConnection()
 * @model
 * @generated
 */
public interface RoleConnection extends Connection {
	/**
	 * Returns the value of the '<em><b>Client Comp Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Comp Elem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Comp Elem</em>' reference.
	 * @see #setClientCompElem(CompRole)
	 * @see dedal.DedalPackage#getRoleConnection_ClientCompElem()
	 * @model keys="id name" required="true"
	 * @generated
	 */
	CompRole getClientCompElem();

	/**
	 * Sets the value of the '{@link dedal.RoleConnection#getClientCompElem <em>Client Comp Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Comp Elem</em>' reference.
	 * @see #getClientCompElem()
	 * @generated
	 */
	void setClientCompElem(CompRole value);

	/**
	 * Returns the value of the '<em><b>Server Comp Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Comp Elem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Comp Elem</em>' reference.
	 * @see #setServerCompElem(CompRole)
	 * @see dedal.DedalPackage#getRoleConnection_ServerCompElem()
	 * @model keys="id name" required="true"
	 * @generated
	 */
	CompRole getServerCompElem();

	/**
	 * Sets the value of the '{@link dedal.RoleConnection#getServerCompElem <em>Server Comp Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Comp Elem</em>' reference.
	 * @see #getServerCompElem()
	 * @generated
	 */
	void setServerCompElem(CompRole value);

} // RoleConnection
