/**
 */
package dedal.impl;

import dedal.ArchitectureDescription;
import dedal.DedalDiagram;
import dedal.DedalPackage;
import dedal.Repository;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dedal.impl.DedalDiagramImpl#getArchitectureDescriptions <em>Architecture Descriptions</em>}</li>
 *   <li>{@link dedal.impl.DedalDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link dedal.impl.DedalDiagramImpl#getRepositories <em>Repositories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DedalDiagramImpl extends MinimalEObjectImpl.Container implements DedalDiagram {
	/**
	 * The cached value of the '{@link #getArchitectureDescriptions() <em>Architecture Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitectureDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitectureDescription> architectureDescriptions;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repositories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DedalDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DedalPackage.Literals.DEDAL_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitectureDescription> getArchitectureDescriptions() {
		if (architectureDescriptions == null) {
			architectureDescriptions = new EObjectContainmentEList<ArchitectureDescription>(ArchitectureDescription.class, this, DedalPackage.DEDAL_DIAGRAM__ARCHITECTURE_DESCRIPTIONS);
		}
		return architectureDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DedalPackage.DEDAL_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Repository> getRepositories() {
		if (repositories == null) {
			repositories = new EObjectContainmentEList<Repository>(Repository.class, this, DedalPackage.DEDAL_DIAGRAM__REPOSITORIES);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DedalPackage.DEDAL_DIAGRAM__ARCHITECTURE_DESCRIPTIONS:
				return ((InternalEList<?>)getArchitectureDescriptions()).basicRemove(otherEnd, msgs);
			case DedalPackage.DEDAL_DIAGRAM__REPOSITORIES:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
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
			case DedalPackage.DEDAL_DIAGRAM__ARCHITECTURE_DESCRIPTIONS:
				return getArchitectureDescriptions();
			case DedalPackage.DEDAL_DIAGRAM__NAME:
				return getName();
			case DedalPackage.DEDAL_DIAGRAM__REPOSITORIES:
				return getRepositories();
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
			case DedalPackage.DEDAL_DIAGRAM__ARCHITECTURE_DESCRIPTIONS:
				getArchitectureDescriptions().clear();
				getArchitectureDescriptions().addAll((Collection<? extends ArchitectureDescription>)newValue);
				return;
			case DedalPackage.DEDAL_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case DedalPackage.DEDAL_DIAGRAM__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends Repository>)newValue);
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
			case DedalPackage.DEDAL_DIAGRAM__ARCHITECTURE_DESCRIPTIONS:
				getArchitectureDescriptions().clear();
				return;
			case DedalPackage.DEDAL_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DedalPackage.DEDAL_DIAGRAM__REPOSITORIES:
				getRepositories().clear();
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
			case DedalPackage.DEDAL_DIAGRAM__ARCHITECTURE_DESCRIPTIONS:
				return architectureDescriptions != null && !architectureDescriptions.isEmpty();
			case DedalPackage.DEDAL_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DedalPackage.DEDAL_DIAGRAM__REPOSITORIES:
				return repositories != null && !repositories.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DedalDiagramImpl
