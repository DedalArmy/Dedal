/**
 */
package dedal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dedal.Connection#getServerIntElem <em>Server Int Elem</em>}</li>
 *   <li>{@link dedal.Connection#getClientIntElem <em>Client Int Elem</em>}</li>
 *   <li>{@link dedal.Connection#getRefID <em>Ref ID</em>}</li>
 * </ul>
 *
 * @see dedal.DedalPackage#getConnection()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/ecore constraints='isValid'"
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Server Int Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Int Elem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Int Elem</em>' reference.
	 * @see #setServerIntElem(Interaction)
	 * @see dedal.DedalPackage#getConnection_ServerIntElem()
	 * @model
	 * @generated
	 */
	Interaction getServerIntElem();

	/**
	 * Sets the value of the '{@link dedal.Connection#getServerIntElem <em>Server Int Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Int Elem</em>' reference.
	 * @see #getServerIntElem()
	 * @generated
	 */
	void setServerIntElem(Interaction value);

	/**
	 * Returns the value of the '<em><b>Client Int Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Int Elem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Int Elem</em>' reference.
	 * @see #setClientIntElem(Interaction)
	 * @see dedal.DedalPackage#getConnection_ClientIntElem()
	 * @model
	 * @generated
	 */
	Interaction getClientIntElem();

	/**
	 * Sets the value of the '{@link dedal.Connection#getClientIntElem <em>Client Int Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Int Elem</em>' reference.
	 * @see #getClientIntElem()
	 * @generated
	 */
	void setClientIntElem(Interaction value);

	/**
	 * Returns the value of the '<em><b>Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref ID</em>' attribute.
	 * @see #setRefID(String)
	 * @see dedal.DedalPackage#getConnection_RefID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getRefID();

	/**
	 * Sets the value of the '{@link dedal.Connection#getRefID <em>Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref ID</em>' attribute.
	 * @see #getRefID()
	 * @generated
	 */
	void setRefID(String value);

} // Connection
