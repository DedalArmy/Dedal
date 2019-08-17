/**
 */
package dedal.impl;

import dedal.DIRECTION;
import dedal.DedalPackage;
import dedal.Interface;
import dedal.InterfaceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dedal.impl.InterfaceImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link dedal.impl.InterfaceImpl#getType <em>Type</em>}</li>
 *   <li>{@link dedal.impl.InterfaceImpl#getDelegation <em>Delegation</em>}</li>
 *   <li>{@link dedal.impl.InterfaceImpl#getInstantiates <em>Instantiates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends InteractionImpl implements Interface {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final DIRECTION DIRECTION_EDEFAULT = DIRECTION.PROVIDED;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected DIRECTION direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected InterfaceType type;

	/**
	 * The cached value of the '{@link #getDelegation() <em>Delegation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegation()
	 * @generated
	 * @ordered
	 */
	protected Interface delegation;

	/**
	 * The cached value of the '{@link #getInstantiates() <em>Instantiates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiates()
	 * @generated
	 * @ordered
	 */
	protected Interface instantiates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DedalPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DIRECTION getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(DIRECTION newDirection) {
		DIRECTION oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.INTERFACE__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (InterfaceType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DedalPackage.INTERFACE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(InterfaceType newType) {
		InterfaceType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.INTERFACE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getDelegation() {
		if (delegation != null && delegation.eIsProxy()) {
			InternalEObject oldDelegation = (InternalEObject)delegation;
			delegation = (Interface)eResolveProxy(oldDelegation);
			if (delegation != oldDelegation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DedalPackage.INTERFACE__DELEGATION, oldDelegation, delegation));
			}
		}
		return delegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetDelegation() {
		return delegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegation(Interface newDelegation) {
		Interface oldDelegation = delegation;
		delegation = newDelegation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.INTERFACE__DELEGATION, oldDelegation, delegation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInstantiates() {
		if (instantiates != null && instantiates.eIsProxy()) {
			InternalEObject oldInstantiates = (InternalEObject)instantiates;
			instantiates = (Interface)eResolveProxy(oldInstantiates);
			if (instantiates != oldInstantiates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DedalPackage.INTERFACE__INSTANTIATES, oldInstantiates, instantiates));
			}
		}
		return instantiates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetInstantiates() {
		return instantiates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiates(Interface newInstantiates) {
		Interface oldInstantiates = instantiates;
		instantiates = newInstantiates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.INTERFACE__INSTANTIATES, oldInstantiates, instantiates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DedalPackage.INTERFACE__DIRECTION:
				return getDirection();
			case DedalPackage.INTERFACE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case DedalPackage.INTERFACE__DELEGATION:
				if (resolve) return getDelegation();
				return basicGetDelegation();
			case DedalPackage.INTERFACE__INSTANTIATES:
				if (resolve) return getInstantiates();
				return basicGetInstantiates();
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
			case DedalPackage.INTERFACE__DIRECTION:
				setDirection((DIRECTION)newValue);
				return;
			case DedalPackage.INTERFACE__TYPE:
				setType((InterfaceType)newValue);
				return;
			case DedalPackage.INTERFACE__DELEGATION:
				setDelegation((Interface)newValue);
				return;
			case DedalPackage.INTERFACE__INSTANTIATES:
				setInstantiates((Interface)newValue);
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
			case DedalPackage.INTERFACE__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case DedalPackage.INTERFACE__TYPE:
				setType((InterfaceType)null);
				return;
			case DedalPackage.INTERFACE__DELEGATION:
				setDelegation((Interface)null);
				return;
			case DedalPackage.INTERFACE__INSTANTIATES:
				setInstantiates((Interface)null);
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
			case DedalPackage.INTERFACE__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case DedalPackage.INTERFACE__TYPE:
				return type != null;
			case DedalPackage.INTERFACE__DELEGATION:
				return delegation != null;
			case DedalPackage.INTERFACE__INSTANTIATES:
				return instantiates != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl
