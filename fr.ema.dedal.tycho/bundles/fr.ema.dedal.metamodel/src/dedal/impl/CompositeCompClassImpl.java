/**
 */
package dedal.impl;

import dedal.CompositeCompClass;
import dedal.Configuration;
import dedal.DedalPackage;
import dedal.Interaction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Comp Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dedal.impl.CompositeCompClassImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link dedal.impl.CompositeCompClassImpl#getDelegatedInterfaces <em>Delegated Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeCompClassImpl extends CompClassImpl implements CompositeCompClass {
	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected Configuration uses;

	/**
	 * The cached value of the '{@link #getDelegatedInterfaces() <em>Delegated Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegatedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interaction> delegatedInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeCompClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DedalPackage.Literals.COMPOSITE_COMP_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getUses() {
		if (uses != null && uses.eIsProxy()) {
			InternalEObject oldUses = (InternalEObject)uses;
			uses = (Configuration)eResolveProxy(oldUses);
			if (uses != oldUses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DedalPackage.COMPOSITE_COMP_CLASS__USES, oldUses, uses));
			}
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetUses() {
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUses(Configuration newUses) {
		Configuration oldUses = uses;
		uses = newUses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.COMPOSITE_COMP_CLASS__USES, oldUses, uses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interaction> getDelegatedInterfaces() {
		if (delegatedInterfaces == null) {
			delegatedInterfaces = new EObjectResolvingEList<Interaction>(Interaction.class, this, DedalPackage.COMPOSITE_COMP_CLASS__DELEGATED_INTERFACES);
		}
		return delegatedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DedalPackage.COMPOSITE_COMP_CLASS__USES:
				if (resolve) return getUses();
				return basicGetUses();
			case DedalPackage.COMPOSITE_COMP_CLASS__DELEGATED_INTERFACES:
				return getDelegatedInterfaces();
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
			case DedalPackage.COMPOSITE_COMP_CLASS__USES:
				setUses((Configuration)newValue);
				return;
			case DedalPackage.COMPOSITE_COMP_CLASS__DELEGATED_INTERFACES:
				getDelegatedInterfaces().clear();
				getDelegatedInterfaces().addAll((Collection<? extends Interaction>)newValue);
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
			case DedalPackage.COMPOSITE_COMP_CLASS__USES:
				setUses((Configuration)null);
				return;
			case DedalPackage.COMPOSITE_COMP_CLASS__DELEGATED_INTERFACES:
				getDelegatedInterfaces().clear();
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
			case DedalPackage.COMPOSITE_COMP_CLASS__USES:
				return uses != null;
			case DedalPackage.COMPOSITE_COMP_CLASS__DELEGATED_INTERFACES:
				return delegatedInterfaces != null && !delegatedInterfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeCompClassImpl
