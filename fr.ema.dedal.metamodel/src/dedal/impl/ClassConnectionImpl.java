/**
 */
package dedal.impl;

import dedal.ClassConnection;
import dedal.CompClass;
import dedal.DedalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dedal.impl.ClassConnectionImpl#getClientClassElem <em>Client Class Elem</em>}</li>
 *   <li>{@link dedal.impl.ClassConnectionImpl#getServerClassElem <em>Server Class Elem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassConnectionImpl extends ConnectionImpl implements ClassConnection {
	/**
	 * The cached value of the '{@link #getClientClassElem() <em>Client Class Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientClassElem()
	 * @generated
	 * @ordered
	 */
	protected CompClass clientClassElem;

	/**
	 * The cached value of the '{@link #getServerClassElem() <em>Server Class Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerClassElem()
	 * @generated
	 * @ordered
	 */
	protected CompClass serverClassElem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DedalPackage.Literals.CLASS_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompClass getClientClassElem() {
		if (clientClassElem != null && clientClassElem.eIsProxy()) {
			InternalEObject oldClientClassElem = (InternalEObject)clientClassElem;
			clientClassElem = (CompClass)eResolveProxy(oldClientClassElem);
			if (clientClassElem != oldClientClassElem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DedalPackage.CLASS_CONNECTION__CLIENT_CLASS_ELEM, oldClientClassElem, clientClassElem));
			}
		}
		return clientClassElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompClass basicGetClientClassElem() {
		return clientClassElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientClassElem(CompClass newClientClassElem) {
		CompClass oldClientClassElem = clientClassElem;
		clientClassElem = newClientClassElem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.CLASS_CONNECTION__CLIENT_CLASS_ELEM, oldClientClassElem, clientClassElem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompClass getServerClassElem() {
		if (serverClassElem != null && serverClassElem.eIsProxy()) {
			InternalEObject oldServerClassElem = (InternalEObject)serverClassElem;
			serverClassElem = (CompClass)eResolveProxy(oldServerClassElem);
			if (serverClassElem != oldServerClassElem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DedalPackage.CLASS_CONNECTION__SERVER_CLASS_ELEM, oldServerClassElem, serverClassElem));
			}
		}
		return serverClassElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompClass basicGetServerClassElem() {
		return serverClassElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerClassElem(CompClass newServerClassElem) {
		CompClass oldServerClassElem = serverClassElem;
		serverClassElem = newServerClassElem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.CLASS_CONNECTION__SERVER_CLASS_ELEM, oldServerClassElem, serverClassElem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DedalPackage.CLASS_CONNECTION__CLIENT_CLASS_ELEM:
				if (resolve) return getClientClassElem();
				return basicGetClientClassElem();
			case DedalPackage.CLASS_CONNECTION__SERVER_CLASS_ELEM:
				if (resolve) return getServerClassElem();
				return basicGetServerClassElem();
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
			case DedalPackage.CLASS_CONNECTION__CLIENT_CLASS_ELEM:
				setClientClassElem((CompClass)newValue);
				return;
			case DedalPackage.CLASS_CONNECTION__SERVER_CLASS_ELEM:
				setServerClassElem((CompClass)newValue);
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
			case DedalPackage.CLASS_CONNECTION__CLIENT_CLASS_ELEM:
				setClientClassElem((CompClass)null);
				return;
			case DedalPackage.CLASS_CONNECTION__SERVER_CLASS_ELEM:
				setServerClassElem((CompClass)null);
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
			case DedalPackage.CLASS_CONNECTION__CLIENT_CLASS_ELEM:
				return clientClassElem != null;
			case DedalPackage.CLASS_CONNECTION__SERVER_CLASS_ELEM:
				return serverClassElem != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassConnectionImpl
