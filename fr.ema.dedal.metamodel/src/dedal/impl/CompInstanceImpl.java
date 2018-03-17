/**
 */
package dedal.impl;

import dedal.CompClass;
import dedal.CompInstance;
import dedal.CompRole;
import dedal.DedalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comp Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dedal.impl.CompInstanceImpl#getInstantiates <em>Instantiates</em>}</li>
 *   <li>{@link dedal.impl.CompInstanceImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompInstanceImpl extends ComponentImpl implements CompInstance {
	/**
	 * The cached value of the '{@link #getInstantiates() <em>Instantiates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiates()
	 * @generated
	 * @ordered
	 */
	protected CompClass instantiates;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected CompRole role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DedalPackage.Literals.COMP_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompClass getInstantiates() {
		if (instantiates != null && instantiates.eIsProxy()) {
			InternalEObject oldInstantiates = (InternalEObject)instantiates;
			instantiates = (CompClass)eResolveProxy(oldInstantiates);
			if (instantiates != oldInstantiates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DedalPackage.COMP_INSTANCE__INSTANTIATES, oldInstantiates, instantiates));
			}
		}
		return instantiates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompClass basicGetInstantiates() {
		return instantiates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiates(CompClass newInstantiates) {
		CompClass oldInstantiates = instantiates;
		instantiates = newInstantiates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.COMP_INSTANCE__INSTANTIATES, oldInstantiates, instantiates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompRole getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (CompRole)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DedalPackage.COMP_INSTANCE__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompRole basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(CompRole newRole) {
		CompRole oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.COMP_INSTANCE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DedalPackage.COMP_INSTANCE__INSTANTIATES:
				if (resolve) return getInstantiates();
				return basicGetInstantiates();
			case DedalPackage.COMP_INSTANCE__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DedalPackage.COMP_INSTANCE__INSTANTIATES:
				setInstantiates((CompClass)newValue);
				return;
			case DedalPackage.COMP_INSTANCE__ROLE:
				setRole((CompRole)newValue);
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
			case DedalPackage.COMP_INSTANCE__INSTANTIATES:
				setInstantiates((CompClass)null);
				return;
			case DedalPackage.COMP_INSTANCE__ROLE:
				setRole((CompRole)null);
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
			case DedalPackage.COMP_INSTANCE__INSTANTIATES:
				return instantiates != null;
			case DedalPackage.COMP_INSTANCE__ROLE:
				return role != null;
		}
		return super.eIsSet(featureID);
	}

} //CompInstanceImpl
