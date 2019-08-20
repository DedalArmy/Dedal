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
 * A representation of the model object '<em><b>Class Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dedal.ClassConnection#getClientClassElem <em>Client Class Elem</em>}</li>
 *   <li>{@link dedal.ClassConnection#getServerClassElem <em>Server Class Elem</em>}</li>
 * </ul>
 *
 * @see dedal.DedalPackage#getClassConnection()
 * @model
 * @generated
 */
public interface ClassConnection extends Connection {
	/**
	 * Returns the value of the '<em><b>Client Class Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Class Elem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Class Elem</em>' reference.
	 * @see #setClientClassElem(CompClass)
	 * @see dedal.DedalPackage#getClassConnection_ClientClassElem()
	 * @model keys="id name" required="true"
	 * @generated
	 */
	CompClass getClientClassElem();

	/**
	 * Sets the value of the '{@link dedal.ClassConnection#getClientClassElem <em>Client Class Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Class Elem</em>' reference.
	 * @see #getClientClassElem()
	 * @generated
	 */
	void setClientClassElem(CompClass value);

	/**
	 * Returns the value of the '<em><b>Server Class Elem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Class Elem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Class Elem</em>' reference.
	 * @see #setServerClassElem(CompClass)
	 * @see dedal.DedalPackage#getClassConnection_ServerClassElem()
	 * @model keys="id name" required="true"
	 * @generated
	 */
	CompClass getServerClassElem();

	/**
	 * Sets the value of the '{@link dedal.ClassConnection#getServerClassElem <em>Server Class Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Class Elem</em>' reference.
	 * @see #getServerClassElem()
	 * @generated
	 */
	void setServerClassElem(CompClass value);

} // ClassConnection
