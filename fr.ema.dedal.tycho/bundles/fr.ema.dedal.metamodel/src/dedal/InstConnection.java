/*******************************************************************************
 * Copyright (C) 2019 IMT Mines Alès
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
/**
 */
package dedal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inst Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dedal.InstConnection#getClientInstElem <em>Client Inst Elem</em>}</li>
 *   <li>{@link dedal.InstConnection#getServerInstElem <em>Server Inst Elem</em>}</li>
 * </ul>
 *
 * @see dedal.DedalPackage#getInstConnection()
 * @model
 * @generated
 */
public interface InstConnection extends Connection {
	/**
	 * Returns the value of the '<em><b>Client Inst Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Inst Elem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Inst Elem</em>' reference.
	 * @see #setClientInstElem(CompInstance)
	 * @see dedal.DedalPackage#getInstConnection_ClientInstElem()
	 * @model keys="id name" required="true"
	 * @generated
	 */
	CompInstance getClientInstElem();

	/**
	 * Sets the value of the '{@link dedal.InstConnection#getClientInstElem <em>Client Inst Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Inst Elem</em>' reference.
	 * @see #getClientInstElem()
	 * @generated
	 */
	void setClientInstElem(CompInstance value);

	/**
	 * Returns the value of the '<em><b>Server Inst Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Inst Elem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Inst Elem</em>' reference.
	 * @see #setServerInstElem(CompInstance)
	 * @see dedal.DedalPackage#getInstConnection_ServerInstElem()
	 * @model keys="id name" required="true"
	 * @generated
	 */
	CompInstance getServerInstElem();

	/**
	 * Sets the value of the '{@link dedal.InstConnection#getServerInstElem <em>Server Inst Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Inst Elem</em>' reference.
	 * @see #getServerInstElem()
	 * @generated
	 */
	void setServerInstElem(CompInstance value);

} // InstConnection
