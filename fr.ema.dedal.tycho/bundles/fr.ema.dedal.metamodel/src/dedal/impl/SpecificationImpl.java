/**
 */
package dedal.impl;

import dedal.CompRole;
import dedal.DedalPackage;
import dedal.RoleConnection;
import dedal.Specification;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dedal.impl.SpecificationImpl#getSpecComponents <em>Spec Components</em>}</li>
 *   <li>{@link dedal.impl.SpecificationImpl#getSpecConnections <em>Spec Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationImpl extends ArchitectureDescriptionImpl implements Specification {
	/**
	 * The cached value of the '{@link #getSpecComponents() <em>Spec Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<CompRole> specComponents;

	/**
	 * The cached value of the '{@link #getSpecConnections() <em>Spec Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleConnection> specConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DedalPackage.Literals.SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompRole> getSpecComponents() {
		if (specComponents == null) {
			specComponents = new EObjectContainmentEList<CompRole>(CompRole.class, this, DedalPackage.SPECIFICATION__SPEC_COMPONENTS);
		}
		return specComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleConnection> getSpecConnections() {
		if (specConnections == null) {
			specConnections = new EObjectContainmentEList<RoleConnection>(RoleConnection.class, this, DedalPackage.SPECIFICATION__SPEC_CONNECTIONS);
		}
		return specConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DedalPackage.SPECIFICATION__SPEC_COMPONENTS:
				return ((InternalEList<?>)getSpecComponents()).basicRemove(otherEnd, msgs);
			case DedalPackage.SPECIFICATION__SPEC_CONNECTIONS:
				return ((InternalEList<?>)getSpecConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DedalPackage.SPECIFICATION__SPEC_COMPONENTS:
				return getSpecComponents();
			case DedalPackage.SPECIFICATION__SPEC_CONNECTIONS:
				return getSpecConnections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DedalPackage.SPECIFICATION__SPEC_COMPONENTS:
				getSpecComponents().clear();
				getSpecComponents().addAll((Collection<? extends CompRole>)newValue);
				return;
			case DedalPackage.SPECIFICATION__SPEC_CONNECTIONS:
				getSpecConnections().clear();
				getSpecConnections().addAll((Collection<? extends RoleConnection>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DedalPackage.SPECIFICATION__SPEC_COMPONENTS:
				getSpecComponents().clear();
				return;
			case DedalPackage.SPECIFICATION__SPEC_CONNECTIONS:
				getSpecConnections().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DedalPackage.SPECIFICATION__SPEC_COMPONENTS:
				return specComponents != null && !specComponents.isEmpty();
			case DedalPackage.SPECIFICATION__SPEC_CONNECTIONS:
				return specConnections != null && !specConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificationImpl
