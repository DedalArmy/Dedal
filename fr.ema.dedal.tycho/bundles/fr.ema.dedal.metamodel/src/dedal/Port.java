/**
 */
package dedal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dedal.Port#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see dedal.DedalPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends Interaction {
	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link dedal.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see dedal.DedalPackage#getPort_Interfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getInterfaces();

} // Port
