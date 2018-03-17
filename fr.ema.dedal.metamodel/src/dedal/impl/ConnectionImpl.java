/**
 */
package dedal.impl;

import dedal.Connection;
import dedal.DedalPackage;
import dedal.Interaction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dedal.impl.ConnectionImpl#getServerIntElem <em>Server Int Elem</em>}</li>
 *   <li>{@link dedal.impl.ConnectionImpl#getClientIntElem <em>Client Int Elem</em>}</li>
 *   <li>{@link dedal.impl.ConnectionImpl#getRefID <em>Ref ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The cached value of the '{@link #getServerIntElem() <em>Server Int Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerIntElem()
	 * @generated
	 * @ordered
	 */
	protected Interaction serverIntElem;

	/**
	 * The cached value of the '{@link #getClientIntElem() <em>Client Int Elem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientIntElem()
	 * @generated
	 * @ordered
	 */
	protected Interaction clientIntElem;

	/**
	 * The default value of the '{@link #getRefID() <em>Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefID()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefID() <em>Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefID()
	 * @generated
	 * @ordered
	 */
	protected String refID = REF_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
		refID=EcoreUtil.generateUUID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DedalPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getServerIntElem() {
		if (serverIntElem != null && serverIntElem.eIsProxy()) {
			InternalEObject oldServerIntElem = (InternalEObject)serverIntElem;
			serverIntElem = (Interaction)eResolveProxy(oldServerIntElem);
			if (serverIntElem != oldServerIntElem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DedalPackage.CONNECTION__SERVER_INT_ELEM, oldServerIntElem, serverIntElem));
			}
		}
		return serverIntElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction basicGetServerIntElem() {
		return serverIntElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerIntElem(Interaction newServerIntElem) {
		Interaction oldServerIntElem = serverIntElem;
		serverIntElem = newServerIntElem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.CONNECTION__SERVER_INT_ELEM, oldServerIntElem, serverIntElem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getClientIntElem() {
		if (clientIntElem != null && clientIntElem.eIsProxy()) {
			InternalEObject oldClientIntElem = (InternalEObject)clientIntElem;
			clientIntElem = (Interaction)eResolveProxy(oldClientIntElem);
			if (clientIntElem != oldClientIntElem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DedalPackage.CONNECTION__CLIENT_INT_ELEM, oldClientIntElem, clientIntElem));
			}
		}
		return clientIntElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction basicGetClientIntElem() {
		return clientIntElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientIntElem(Interaction newClientIntElem) {
		Interaction oldClientIntElem = clientIntElem;
		clientIntElem = newClientIntElem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.CONNECTION__CLIENT_INT_ELEM, oldClientIntElem, clientIntElem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefID() {
		return refID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefID(String newRefID) {
		String oldRefID = refID;
		refID = newRefID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.CONNECTION__REF_ID, oldRefID, refID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DedalPackage.CONNECTION__SERVER_INT_ELEM:
				if (resolve) return getServerIntElem();
				return basicGetServerIntElem();
			case DedalPackage.CONNECTION__CLIENT_INT_ELEM:
				if (resolve) return getClientIntElem();
				return basicGetClientIntElem();
			case DedalPackage.CONNECTION__REF_ID:
				return getRefID();
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
			case DedalPackage.CONNECTION__SERVER_INT_ELEM:
				setServerIntElem((Interaction)newValue);
				return;
			case DedalPackage.CONNECTION__CLIENT_INT_ELEM:
				setClientIntElem((Interaction)newValue);
				return;
			case DedalPackage.CONNECTION__REF_ID:
				setRefID((String)newValue);
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
			case DedalPackage.CONNECTION__SERVER_INT_ELEM:
				setServerIntElem((Interaction)null);
				return;
			case DedalPackage.CONNECTION__CLIENT_INT_ELEM:
				setClientIntElem((Interaction)null);
				return;
			case DedalPackage.CONNECTION__REF_ID:
				setRefID(REF_ID_EDEFAULT);
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
			case DedalPackage.CONNECTION__SERVER_INT_ELEM:
				return serverIntElem != null;
			case DedalPackage.CONNECTION__CLIENT_INT_ELEM:
				return clientIntElem != null;
			case DedalPackage.CONNECTION__REF_ID:
				return REF_ID_EDEFAULT == null ? refID != null : !REF_ID_EDEFAULT.equals(refID);
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
		result.append(" (refID: ");
		result.append(refID);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
