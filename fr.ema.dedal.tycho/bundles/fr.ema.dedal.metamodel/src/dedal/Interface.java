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
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dedal.Interface#getDirection <em>Direction</em>}</li>
 *   <li>{@link dedal.Interface#getType <em>Type</em>}</li>
 *   <li>{@link dedal.Interface#getDelegation <em>Delegation</em>}</li>
 *   <li>{@link dedal.Interface#getInstantiates <em>Instantiates</em>}</li>
 * </ul>
 *
 * @see dedal.DedalPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Interaction {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link dedal.DIRECTION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see dedal.DIRECTION
	 * @see #setDirection(DIRECTION)
	 * @see dedal.DedalPackage#getInterface_Direction()
	 * @model required="true"
	 * @generated
	 */
	DIRECTION getDirection();

	/**
	 * Sets the value of the '{@link dedal.Interface#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see dedal.DIRECTION
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DIRECTION value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(InterfaceType)
	 * @see dedal.DedalPackage#getInterface_Type()
	 * @model keys="name" required="true"
	 * @generated
	 */
	InterfaceType getType();

	/**
	 * Sets the value of the '{@link dedal.Interface#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(InterfaceType value);

	/**
	 * Returns the value of the '<em><b>Delegation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation</em>' reference.
	 * @see #setDelegation(Interface)
	 * @see dedal.DedalPackage#getInterface_Delegation()
	 * @model
	 * @generated
	 */
	Interface getDelegation();

	/**
	 * Sets the value of the '{@link dedal.Interface#getDelegation <em>Delegation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegation</em>' reference.
	 * @see #getDelegation()
	 * @generated
	 */
	void setDelegation(Interface value);

	/**
	 * Returns the value of the '<em><b>Instantiates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates</em>' reference.
	 * @see #setInstantiates(Interface)
	 * @see dedal.DedalPackage#getInterface_Instantiates()
	 * @model keys="id"
	 * @generated
	 */
	Interface getInstantiates();

	/**
	 * Sets the value of the '{@link dedal.Interface#getInstantiates <em>Instantiates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiates</em>' reference.
	 * @see #getInstantiates()
	 * @generated
	 */
	void setInstantiates(Interface value);

} // Interface
