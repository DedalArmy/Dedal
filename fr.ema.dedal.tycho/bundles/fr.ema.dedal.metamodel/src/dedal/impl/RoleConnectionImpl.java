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
import dedal.RoleConnection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dedal.impl.RoleConnectionImpl#getClientCompElem <em>Client Comp Elem</em>}</li>
 *   <li>{@link dedal.impl.RoleConnectionImpl#getServerCompElem <em>Server Comp Elem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleConnectionImpl extends ConnectionImpl implements RoleConnection {
	/**
	 * The cached value of the '{@link #getClientCompElem() <em>Client Comp Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientCompElem()
	 * @generated
	 * @ordered
	 */
	protected CompRole clientCompElem;

	/**
	 * The cached value of the '{@link #getServerCompElem() <em>Server Comp Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerCompElem()
	 * @generated
	 * @ordered
	 */
	protected CompRole serverCompElem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DedalPackage.Literals.ROLE_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompRole getClientCompElem() {
		if (clientCompElem != null && clientCompElem.eIsProxy()) {
			InternalEObject oldClientCompElem = (InternalEObject)clientCompElem;
			clientCompElem = (CompRole)eResolveProxy(oldClientCompElem);
			if (clientCompElem != oldClientCompElem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DedalPackage.ROLE_CONNECTION__CLIENT_COMP_ELEM, oldClientCompElem, clientCompElem));
			}
		}
		return clientCompElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompRole basicGetClientCompElem() {
		return clientCompElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientCompElem(CompRole newClientCompElem) {
		CompRole oldClientCompElem = clientCompElem;
		clientCompElem = newClientCompElem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.ROLE_CONNECTION__CLIENT_COMP_ELEM, oldClientCompElem, clientCompElem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompRole getServerCompElem() {
		if (serverCompElem != null && serverCompElem.eIsProxy()) {
			InternalEObject oldServerCompElem = (InternalEObject)serverCompElem;
			serverCompElem = (CompRole)eResolveProxy(oldServerCompElem);
			if (serverCompElem != oldServerCompElem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DedalPackage.ROLE_CONNECTION__SERVER_COMP_ELEM, oldServerCompElem, serverCompElem));
			}
		}
		return serverCompElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompRole basicGetServerCompElem() {
		return serverCompElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerCompElem(CompRole newServerCompElem) {
		CompRole oldServerCompElem = serverCompElem;
		serverCompElem = newServerCompElem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.ROLE_CONNECTION__SERVER_COMP_ELEM, oldServerCompElem, serverCompElem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DedalPackage.ROLE_CONNECTION__CLIENT_COMP_ELEM:
				if (resolve) return getClientCompElem();
				return basicGetClientCompElem();
			case DedalPackage.ROLE_CONNECTION__SERVER_COMP_ELEM:
				if (resolve) return getServerCompElem();
				return basicGetServerCompElem();
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
			case DedalPackage.ROLE_CONNECTION__CLIENT_COMP_ELEM:
				setClientCompElem((CompRole)newValue);
				return;
			case DedalPackage.ROLE_CONNECTION__SERVER_COMP_ELEM:
				setServerCompElem((CompRole)newValue);
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
			case DedalPackage.ROLE_CONNECTION__CLIENT_COMP_ELEM:
				setClientCompElem((CompRole)null);
				return;
			case DedalPackage.ROLE_CONNECTION__SERVER_COMP_ELEM:
				setServerCompElem((CompRole)null);
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
			case DedalPackage.ROLE_CONNECTION__CLIENT_COMP_ELEM:
				return clientCompElem != null;
			case DedalPackage.ROLE_CONNECTION__SERVER_COMP_ELEM:
				return serverCompElem != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleConnectionImpl
