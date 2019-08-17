/**
 */
package dedal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dedal.Configuration#getConfigComponents <em>Config Components</em>}</li>
 *   <li>{@link dedal.Configuration#getImplements <em>Implements</em>}</li>
 *   <li>{@link dedal.Configuration#getConfigConnections <em>Config Connections</em>}</li>
 *   <li>{@link dedal.Configuration#getComptypes <em>Comptypes</em>}</li>
 * </ul>
 *
 * @see dedal.DedalPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends ArchitectureDescription {
	/**
	 * Returns the value of the '<em><b>Config Components</b></em>' containment reference list.
	 * The list contents are of type {@link dedal.CompClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Components</em>' containment reference list.
	 * @see dedal.DedalPackage#getConfiguration_ConfigComponents()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<CompClass> getConfigComponents();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference list.
	 * The list contents are of type {@link dedal.Specification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference list.
	 * @see dedal.DedalPackage#getConfiguration_Implements()
	 * @model keys="name"
	 * @generated
	 */
	EList<Specification> getImplements();

	/**
	 * Returns the value of the '<em><b>Config Connections</b></em>' containment reference list.
	 * The list contents are of type {@link dedal.ClassConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Connections</em>' containment reference list.
	 * @see dedal.DedalPackage#getConfiguration_ConfigConnections()
	 * @model containment="true" keys="refID"
	 * @generated
	 */
	EList<ClassConnection> getConfigConnections();

	/**
	 * Returns the value of the '<em><b>Comptypes</b></em>' containment reference list.
	 * The list contents are of type {@link dedal.CompType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comptypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comptypes</em>' containment reference list.
	 * @see dedal.DedalPackage#getConfiguration_Comptypes()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<CompType> getComptypes();

} // Configuration
