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

import dedal.CompInstance;
import dedal.DedalPackage;
import dedal.InstConnection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inst Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dedal.impl.InstConnectionImpl#getClientInstElem <em>Client Inst Elem</em>}</li>
 *   <li>{@link dedal.impl.InstConnectionImpl#getServerInstElem <em>Server Inst Elem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstConnectionImpl extends ConnectionImpl implements InstConnection {
	/**
	 * The cached value of the '{@link #getClientInstElem() <em>Client Inst Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientInstElem()
	 * @generated
	 * @ordered
	 */
	protected CompInstance clientInstElem;

	/**
	 * The cached value of the '{@link #getServerInstElem() <em>Server Inst Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerInstElem()
	 * @generated
	 * @ordered
	 */
	protected CompInstance serverInstElem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DedalPackage.Literals.INST_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompInstance getClientInstElem() {
		if (clientInstElem != null && clientInstElem.eIsProxy()) {
			InternalEObject oldClientInstElem = (InternalEObject)clientInstElem;
			clientInstElem = (CompInstance)eResolveProxy(oldClientInstElem);
			if (clientInstElem != oldClientInstElem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DedalPackage.INST_CONNECTION__CLIENT_INST_ELEM, oldClientInstElem, clientInstElem));
			}
		}
		return clientInstElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompInstance basicGetClientInstElem() {
		return clientInstElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientInstElem(CompInstance newClientInstElem) {
		CompInstance oldClientInstElem = clientInstElem;
		clientInstElem = newClientInstElem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.INST_CONNECTION__CLIENT_INST_ELEM, oldClientInstElem, clientInstElem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompInstance getServerInstElem() {
		if (serverInstElem != null && serverInstElem.eIsProxy()) {
			InternalEObject oldServerInstElem = (InternalEObject)serverInstElem;
			serverInstElem = (CompInstance)eResolveProxy(oldServerInstElem);
			if (serverInstElem != oldServerInstElem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DedalPackage.INST_CONNECTION__SERVER_INST_ELEM, oldServerInstElem, serverInstElem));
			}
		}
		return serverInstElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompInstance basicGetServerInstElem() {
		return serverInstElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerInstElem(CompInstance newServerInstElem) {
		CompInstance oldServerInstElem = serverInstElem;
		serverInstElem = newServerInstElem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.INST_CONNECTION__SERVER_INST_ELEM, oldServerInstElem, serverInstElem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DedalPackage.INST_CONNECTION__CLIENT_INST_ELEM:
				if (resolve) return getClientInstElem();
				return basicGetClientInstElem();
			case DedalPackage.INST_CONNECTION__SERVER_INST_ELEM:
				if (resolve) return getServerInstElem();
				return basicGetServerInstElem();
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
			case DedalPackage.INST_CONNECTION__CLIENT_INST_ELEM:
				setClientInstElem((CompInstance)newValue);
				return;
			case DedalPackage.INST_CONNECTION__SERVER_INST_ELEM:
				setServerInstElem((CompInstance)newValue);
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
			case DedalPackage.INST_CONNECTION__CLIENT_INST_ELEM:
				setClientInstElem((CompInstance)null);
				return;
			case DedalPackage.INST_CONNECTION__SERVER_INST_ELEM:
				setServerInstElem((CompInstance)null);
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
			case DedalPackage.INST_CONNECTION__CLIENT_INST_ELEM:
				return clientInstElem != null;
			case DedalPackage.INST_CONNECTION__SERVER_INST_ELEM:
				return serverInstElem != null;
		}
		return super.eIsSet(featureID);
	}

} //InstConnectionImpl
