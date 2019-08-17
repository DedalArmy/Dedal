/**
 */
package dedal.impl;

import dedal.Assembly;
import dedal.CompInstance;
import dedal.Configuration;
import dedal.DedalPackage;
import dedal.InstConnection;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dedal.impl.AssemblyImpl#getAssmComponents <em>Assm Components</em>}</li>
 *   <li>{@link dedal.impl.AssemblyImpl#getInstantiates <em>Instantiates</em>}</li>
 *   <li>{@link dedal.impl.AssemblyImpl#getAssemblyConnections <em>Assembly Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyImpl extends ArchitectureDescriptionImpl implements Assembly {
	/**
	 * The cached value of the '{@link #getAssmComponents() <em>Assm Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssmComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<CompInstance> assmComponents;

	/**
	 * The cached value of the '{@link #getInstantiates() <em>Instantiates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiates()
	 * @generated
	 * @ordered
	 */
	protected Configuration instantiates;

	/**
	 * The cached value of the '{@link #getAssemblyConnections() <em>Assembly Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<InstConnection> assemblyConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DedalPackage.Literals.ASSEMBLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompInstance> getAssmComponents() {
		if (assmComponents == null) {
			assmComponents = new EObjectContainmentEList<CompInstance>(CompInstance.class, this, DedalPackage.ASSEMBLY__ASSM_COMPONENTS);
		}
		return assmComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getInstantiates() {
		if (instantiates != null && instantiates.eIsProxy()) {
			InternalEObject oldInstantiates = (InternalEObject)instantiates;
			instantiates = (Configuration)eResolveProxy(oldInstantiates);
			if (instantiates != oldInstantiates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DedalPackage.ASSEMBLY__INSTANTIATES, oldInstantiates, instantiates));
			}
		}
		return instantiates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetInstantiates() {
		return instantiates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiates(Configuration newInstantiates) {
		Configuration oldInstantiates = instantiates;
		instantiates = newInstantiates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.ASSEMBLY__INSTANTIATES, oldInstantiates, instantiates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstConnection> getAssemblyConnections() {
		if (assemblyConnections == null) {
			assemblyConnections = new EObjectContainmentEList<InstConnection>(InstConnection.class, this, DedalPackage.ASSEMBLY__ASSEMBLY_CONNECTIONS);
		}
		return assemblyConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DedalPackage.ASSEMBLY__ASSM_COMPONENTS:
				return ((InternalEList<?>)getAssmComponents()).basicRemove(otherEnd, msgs);
			case DedalPackage.ASSEMBLY__ASSEMBLY_CONNECTIONS:
				return ((InternalEList<?>)getAssemblyConnections()).basicRemove(otherEnd, msgs);
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
			case DedalPackage.ASSEMBLY__ASSM_COMPONENTS:
				return getAssmComponents();
			case DedalPackage.ASSEMBLY__INSTANTIATES:
				if (resolve) return getInstantiates();
				return basicGetInstantiates();
			case DedalPackage.ASSEMBLY__ASSEMBLY_CONNECTIONS:
				return getAssemblyConnections();
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
			case DedalPackage.ASSEMBLY__ASSM_COMPONENTS:
				getAssmComponents().clear();
				getAssmComponents().addAll((Collection<? extends CompInstance>)newValue);
				return;
			case DedalPackage.ASSEMBLY__INSTANTIATES:
				setInstantiates((Configuration)newValue);
				return;
			case DedalPackage.ASSEMBLY__ASSEMBLY_CONNECTIONS:
				getAssemblyConnections().clear();
				getAssemblyConnections().addAll((Collection<? extends InstConnection>)newValue);
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
			case DedalPackage.ASSEMBLY__ASSM_COMPONENTS:
				getAssmComponents().clear();
				return;
			case DedalPackage.ASSEMBLY__INSTANTIATES:
				setInstantiates((Configuration)null);
				return;
			case DedalPackage.ASSEMBLY__ASSEMBLY_CONNECTIONS:
				getAssemblyConnections().clear();
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
			case DedalPackage.ASSEMBLY__ASSM_COMPONENTS:
				return assmComponents != null && !assmComponents.isEmpty();
			case DedalPackage.ASSEMBLY__INSTANTIATES:
				return instantiates != null;
			case DedalPackage.ASSEMBLY__ASSEMBLY_CONNECTIONS:
				return assemblyConnections != null && !assemblyConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssemblyImpl
