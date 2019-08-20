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
package dedal.impl;

import dedal.CompRole;
import dedal.DedalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comp Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dedal.impl.CompRoleImpl#getMinInstanceNbr <em>Min Instance Nbr</em>}</li>
 *   <li>{@link dedal.impl.CompRoleImpl#getMaxInstanceNbr <em>Max Instance Nbr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompRoleImpl extends ComponentImpl implements CompRole {
	/**
	 * The default value of the '{@link #getMinInstanceNbr() <em>Min Instance Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInstanceNbr()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_INSTANCE_NBR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinInstanceNbr() <em>Min Instance Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInstanceNbr()
	 * @generated
	 * @ordered
	 */
	protected int minInstanceNbr = MIN_INSTANCE_NBR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxInstanceNbr() <em>Max Instance Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstanceNbr()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_INSTANCE_NBR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxInstanceNbr() <em>Max Instance Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstanceNbr()
	 * @generated
	 * @ordered
	 */
	protected int maxInstanceNbr = MAX_INSTANCE_NBR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DedalPackage.Literals.COMP_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinInstanceNbr() {
		return minInstanceNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInstanceNbr(int newMinInstanceNbr) {
		int oldMinInstanceNbr = minInstanceNbr;
		minInstanceNbr = newMinInstanceNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.COMP_ROLE__MIN_INSTANCE_NBR, oldMinInstanceNbr, minInstanceNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxInstanceNbr() {
		return maxInstanceNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInstanceNbr(int newMaxInstanceNbr) {
		int oldMaxInstanceNbr = maxInstanceNbr;
		maxInstanceNbr = newMaxInstanceNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.COMP_ROLE__MAX_INSTANCE_NBR, oldMaxInstanceNbr, maxInstanceNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DedalPackage.COMP_ROLE__MIN_INSTANCE_NBR:
				return getMinInstanceNbr();
			case DedalPackage.COMP_ROLE__MAX_INSTANCE_NBR:
				return getMaxInstanceNbr();
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
			case DedalPackage.COMP_ROLE__MIN_INSTANCE_NBR:
				setMinInstanceNbr((Integer)newValue);
				return;
			case DedalPackage.COMP_ROLE__MAX_INSTANCE_NBR:
				setMaxInstanceNbr((Integer)newValue);
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
			case DedalPackage.COMP_ROLE__MIN_INSTANCE_NBR:
				setMinInstanceNbr(MIN_INSTANCE_NBR_EDEFAULT);
				return;
			case DedalPackage.COMP_ROLE__MAX_INSTANCE_NBR:
				setMaxInstanceNbr(MAX_INSTANCE_NBR_EDEFAULT);
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
			case DedalPackage.COMP_ROLE__MIN_INSTANCE_NBR:
				return minInstanceNbr != MIN_INSTANCE_NBR_EDEFAULT;
			case DedalPackage.COMP_ROLE__MAX_INSTANCE_NBR:
				return maxInstanceNbr != MAX_INSTANCE_NBR_EDEFAULT;
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
		result.append(" (minInstanceNbr: ");
		result.append(minInstanceNbr);
		result.append(", maxInstanceNbr: ");
		result.append(maxInstanceNbr);
		result.append(')');
		return result.toString();
	}

} //CompRoleImpl
