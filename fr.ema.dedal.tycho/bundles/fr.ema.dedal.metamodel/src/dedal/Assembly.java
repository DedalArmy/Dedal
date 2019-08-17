/**
 */
package dedal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dedal.Assembly#getAssmComponents <em>Assm Components</em>}</li>
 *   <li>{@link dedal.Assembly#getInstantiates <em>Instantiates</em>}</li>
 *   <li>{@link dedal.Assembly#getAssemblyConnections <em>Assembly Connections</em>}</li>
 * </ul>
 *
 * @see dedal.DedalPackage#getAssembly()
 * @model
 * @generated
 */
public interface Assembly extends ArchitectureDescription {
	/**
	 * Returns the value of the '<em><b>Assm Components</b></em>' containment reference list.
	 * The list contents are of type {@link dedal.CompInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assm Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assm Components</em>' containment reference list.
	 * @see dedal.DedalPackage#getAssembly_AssmComponents()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<CompInstance> getAssmComponents();

	/**
	 * Returns the value of the '<em><b>Instantiates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates</em>' reference.
	 * @see #setInstantiates(Configuration)
	 * @see dedal.DedalPackage#getAssembly_Instantiates()
	 * @model keys="name" required="true"
	 * @generated
	 */
	Configuration getInstantiates();

	/**
	 * Sets the value of the '{@link dedal.Assembly#getInstantiates <em>Instantiates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiates</em>' reference.
	 * @see #getInstantiates()
	 * @generated
	 */
	void setInstantiates(Configuration value);

	/**
	 * Returns the value of the '<em><b>Assembly Connections</b></em>' containment reference list.
	 * The list contents are of type {@link dedal.InstConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Connections</em>' containment reference list.
	 * @see dedal.DedalPackage#getAssembly_AssemblyConnections()
	 * @model containment="true" keys="refID"
	 * @generated
	 */
	EList<InstConnection> getAssemblyConnections();

} // Assembly
