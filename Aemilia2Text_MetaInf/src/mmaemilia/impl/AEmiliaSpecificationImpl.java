/**
 */
package mmaemilia.impl;

import mmaemilia.AEmiliaSpecification;
import mmaemilia.ArchiType;
import mmaemilia.MmaemiliaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AEmilia Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mmaemilia.impl.AEmiliaSpecificationImpl#getArchiTypeDecl <em>Archi Type Decl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AEmiliaSpecificationImpl extends MinimalEObjectImpl.Container implements AEmiliaSpecification {
	/**
	 * The cached value of the '{@link #getArchiTypeDecl() <em>Archi Type Decl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiTypeDecl()
	 * @generated
	 * @ordered
	 */
	protected ArchiType archiTypeDecl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AEmiliaSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmaemiliaPackage.Literals.AEMILIA_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiType getArchiTypeDecl() {
		return archiTypeDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArchiTypeDecl(ArchiType newArchiTypeDecl, NotificationChain msgs) {
		ArchiType oldArchiTypeDecl = archiTypeDecl;
		archiTypeDecl = newArchiTypeDecl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MmaemiliaPackage.AEMILIA_SPECIFICATION__ARCHI_TYPE_DECL, oldArchiTypeDecl, newArchiTypeDecl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchiTypeDecl(ArchiType newArchiTypeDecl) {
		if (newArchiTypeDecl != archiTypeDecl) {
			NotificationChain msgs = null;
			if (archiTypeDecl != null)
				msgs = ((InternalEObject)archiTypeDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MmaemiliaPackage.AEMILIA_SPECIFICATION__ARCHI_TYPE_DECL, null, msgs);
			if (newArchiTypeDecl != null)
				msgs = ((InternalEObject)newArchiTypeDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MmaemiliaPackage.AEMILIA_SPECIFICATION__ARCHI_TYPE_DECL, null, msgs);
			msgs = basicSetArchiTypeDecl(newArchiTypeDecl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmaemiliaPackage.AEMILIA_SPECIFICATION__ARCHI_TYPE_DECL, newArchiTypeDecl, newArchiTypeDecl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MmaemiliaPackage.AEMILIA_SPECIFICATION__ARCHI_TYPE_DECL:
				return basicSetArchiTypeDecl(null, msgs);
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
			case MmaemiliaPackage.AEMILIA_SPECIFICATION__ARCHI_TYPE_DECL:
				return getArchiTypeDecl();
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
			case MmaemiliaPackage.AEMILIA_SPECIFICATION__ARCHI_TYPE_DECL:
				setArchiTypeDecl((ArchiType)newValue);
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
			case MmaemiliaPackage.AEMILIA_SPECIFICATION__ARCHI_TYPE_DECL:
				setArchiTypeDecl((ArchiType)null);
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
			case MmaemiliaPackage.AEMILIA_SPECIFICATION__ARCHI_TYPE_DECL:
				return archiTypeDecl != null;
		}
		return super.eIsSet(featureID);
	}

} //AEmiliaSpecificationImpl
