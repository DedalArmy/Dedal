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

import dedal.ClassConnection;
import dedal.CompClass;
import dedal.CompType;
import dedal.Configuration;
import dedal.DedalPackage;
import dedal.Specification;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dedal.impl.ConfigurationImpl#getConfigComponents <em>Config Components</em>}</li>
 *   <li>{@link dedal.impl.ConfigurationImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link dedal.impl.ConfigurationImpl#getConfigConnections <em>Config Connections</em>}</li>
 *   <li>{@link dedal.impl.ConfigurationImpl#getComptypes <em>Comptypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends ArchitectureDescriptionImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getConfigComponents() <em>Config Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<CompClass> configComponents;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<Specification> implements_;

	/**
	 * The cached value of the '{@link #getConfigConnections() <em>Config Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassConnection> configConnections;

	/**
	 * The cached value of the '{@link #getComptypes() <em>Comptypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComptypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CompType> comptypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DedalPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompClass> getConfigComponents() {
		if (configComponents == null) {
			configComponents = new EObjectContainmentEList<CompClass>(CompClass.class, this, DedalPackage.CONFIGURATION__CONFIG_COMPONENTS);
		}
		return configComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specification> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectResolvingEList<Specification>(Specification.class, this, DedalPackage.CONFIGURATION__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassConnection> getConfigConnections() {
		if (configConnections == null) {
			configConnections = new EObjectContainmentEList<ClassConnection>(ClassConnection.class, this, DedalPackage.CONFIGURATION__CONFIG_CONNECTIONS);
		}
		return configConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompType> getComptypes() {
		if (comptypes == null) {
			comptypes = new EObjectContainmentEList<CompType>(CompType.class, this, DedalPackage.CONFIGURATION__COMPTYPES);
		}
		return comptypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DedalPackage.CONFIGURATION__CONFIG_COMPONENTS:
				return ((InternalEList<?>)getConfigComponents()).basicRemove(otherEnd, msgs);
			case DedalPackage.CONFIGURATION__CONFIG_CONNECTIONS:
				return ((InternalEList<?>)getConfigConnections()).basicRemove(otherEnd, msgs);
			case DedalPackage.CONFIGURATION__COMPTYPES:
				return ((InternalEList<?>)getComptypes()).basicRemove(otherEnd, msgs);
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
			case DedalPackage.CONFIGURATION__CONFIG_COMPONENTS:
				return getConfigComponents();
			case DedalPackage.CONFIGURATION__IMPLEMENTS:
				return getImplements();
			case DedalPackage.CONFIGURATION__CONFIG_CONNECTIONS:
				return getConfigConnections();
			case DedalPackage.CONFIGURATION__COMPTYPES:
				return getComptypes();
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
			case DedalPackage.CONFIGURATION__CONFIG_COMPONENTS:
				getConfigComponents().clear();
				getConfigComponents().addAll((Collection<? extends CompClass>)newValue);
				return;
			case DedalPackage.CONFIGURATION__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends Specification>)newValue);
				return;
			case DedalPackage.CONFIGURATION__CONFIG_CONNECTIONS:
				getConfigConnections().clear();
				getConfigConnections().addAll((Collection<? extends ClassConnection>)newValue);
				return;
			case DedalPackage.CONFIGURATION__COMPTYPES:
				getComptypes().clear();
				getComptypes().addAll((Collection<? extends CompType>)newValue);
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
			case DedalPackage.CONFIGURATION__CONFIG_COMPONENTS:
				getConfigComponents().clear();
				return;
			case DedalPackage.CONFIGURATION__IMPLEMENTS:
				getImplements().clear();
				return;
			case DedalPackage.CONFIGURATION__CONFIG_CONNECTIONS:
				getConfigConnections().clear();
				return;
			case DedalPackage.CONFIGURATION__COMPTYPES:
				getComptypes().clear();
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
			case DedalPackage.CONFIGURATION__CONFIG_COMPONENTS:
				return configComponents != null && !configComponents.isEmpty();
			case DedalPackage.CONFIGURATION__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
			case DedalPackage.CONFIGURATION__CONFIG_CONNECTIONS:
				return configConnections != null && !configConnections.isEmpty();
			case DedalPackage.CONFIGURATION__COMPTYPES:
				return comptypes != null && !comptypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
