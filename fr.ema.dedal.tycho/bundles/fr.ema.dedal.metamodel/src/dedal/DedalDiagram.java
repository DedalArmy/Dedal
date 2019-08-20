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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dedal.DedalDiagram#getArchitectureDescriptions <em>Architecture Descriptions</em>}</li>
 *   <li>{@link dedal.DedalDiagram#getName <em>Name</em>}</li>
 *   <li>{@link dedal.DedalDiagram#getRepositories <em>Repositories</em>}</li>
 * </ul>
 *
 * @see dedal.DedalPackage#getDedalDiagram()
 * @model
 * @generated
 */
public interface DedalDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Architecture Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link dedal.ArchitectureDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture Descriptions</em>' containment reference list.
	 * @see dedal.DedalPackage#getDedalDiagram_ArchitectureDescriptions()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<ArchitectureDescription> getArchitectureDescriptions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dedal.DedalPackage#getDedalDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dedal.DedalDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link dedal.Repository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see dedal.DedalPackage#getDedalDiagram_Repositories()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Repository> getRepositories();

} // DedalDiagram
