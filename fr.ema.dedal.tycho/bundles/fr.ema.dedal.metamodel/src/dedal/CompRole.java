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
 * A representation of the model object '<em><b>Comp Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dedal.CompRole#getMinInstanceNbr <em>Min Instance Nbr</em>}</li>
 *   <li>{@link dedal.CompRole#getMaxInstanceNbr <em>Max Instance Nbr</em>}</li>
 * </ul>
 *
 * @see dedal.DedalPackage#getCompRole()
 * @model
 * @generated
 */
public interface CompRole extends Component {
	/**
	 * Returns the value of the '<em><b>Min Instance Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Instance Nbr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Instance Nbr</em>' attribute.
	 * @see #setMinInstanceNbr(int)
	 * @see dedal.DedalPackage#getCompRole_MinInstanceNbr()
	 * @model
	 * @generated
	 */
	int getMinInstanceNbr();

	/**
	 * Sets the value of the '{@link dedal.CompRole#getMinInstanceNbr <em>Min Instance Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Instance Nbr</em>' attribute.
	 * @see #getMinInstanceNbr()
	 * @generated
	 */
	void setMinInstanceNbr(int value);

	/**
	 * Returns the value of the '<em><b>Max Instance Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Instance Nbr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Instance Nbr</em>' attribute.
	 * @see #setMaxInstanceNbr(int)
	 * @see dedal.DedalPackage#getCompRole_MaxInstanceNbr()
	 * @model
	 * @generated
	 */
	int getMaxInstanceNbr();

	/**
	 * Sets the value of the '{@link dedal.CompRole#getMaxInstanceNbr <em>Max Instance Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Instance Nbr</em>' attribute.
	 * @see #getMaxInstanceNbr()
	 * @generated
	 */
	void setMaxInstanceNbr(int value);

} // CompRole
