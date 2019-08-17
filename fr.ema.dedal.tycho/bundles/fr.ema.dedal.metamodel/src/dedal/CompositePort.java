/**
 */
package dedal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dedal.CompositePort#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see dedal.DedalPackage#getCompositePort()
 * @model
 * @generated
 */
public interface CompositePort extends Port {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link dedal.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see dedal.DedalPackage#getCompositePort_Ports()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Port> getPorts();

} // CompositePort
