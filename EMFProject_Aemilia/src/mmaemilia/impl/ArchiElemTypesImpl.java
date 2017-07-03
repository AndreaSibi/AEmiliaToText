/**
 */
package mmaemilia.impl;

import java.util.Collection;

import mmaemilia.ArchiElemTypes;
import mmaemilia.ElemType;
import mmaemilia.MmaemiliaPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archi Elem Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mmaemilia.impl.ArchiElemTypesImpl#getEtDeclaration <em>Et Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchiElemTypesImpl extends MinimalEObjectImpl.Container implements ArchiElemTypes {
	/**
	 * The cached value of the '{@link #getEtDeclaration() <em>Et Declaration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<ElemType> etDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchiElemTypesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmaemiliaPackage.Literals.ARCHI_ELEM_TYPES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElemType> getEtDeclaration() {
		if (etDeclaration == null) {
			etDeclaration = new EObjectContainmentEList<ElemType>(ElemType.class, this, MmaemiliaPackage.ARCHI_ELEM_TYPES__ET_DECLARATION);
		}
		return etDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MmaemiliaPackage.ARCHI_ELEM_TYPES__ET_DECLARATION:
				return ((InternalEList<?>)getEtDeclaration()).basicRemove(otherEnd, msgs);
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
			case MmaemiliaPackage.ARCHI_ELEM_TYPES__ET_DECLARATION:
				return getEtDeclaration();
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
			case MmaemiliaPackage.ARCHI_ELEM_TYPES__ET_DECLARATION:
				getEtDeclaration().clear();
				getEtDeclaration().addAll((Collection<? extends ElemType>)newValue);
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
			case MmaemiliaPackage.ARCHI_ELEM_TYPES__ET_DECLARATION:
				getEtDeclaration().clear();
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
			case MmaemiliaPackage.ARCHI_ELEM_TYPES__ET_DECLARATION:
				return etDeclaration != null && !etDeclaration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArchiElemTypesImpl
