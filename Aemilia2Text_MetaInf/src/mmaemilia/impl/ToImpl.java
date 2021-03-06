/**
 */
package mmaemilia.impl;

import mmaemilia.ArchiElemInstance;
import mmaemilia.InputInteraction;
import mmaemilia.MmaemiliaPackage;
import mmaemilia.To;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mmaemilia.impl.ToImpl#getToInstance <em>To Instance</em>}</li>
 *   <li>{@link mmaemilia.impl.ToImpl#getIsInput <em>Is Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToImpl extends MinimalEObjectImpl.Container implements To {
	/**
	 * The cached value of the '{@link #getToInstance() <em>To Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToInstance()
	 * @generated
	 * @ordered
	 */
	protected ArchiElemInstance toInstance;

	/**
	 * The cached value of the '{@link #getIsInput() <em>Is Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInput()
	 * @generated
	 * @ordered
	 */
	protected InputInteraction isInput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmaemiliaPackage.Literals.TO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiElemInstance getToInstance() {
		if (toInstance != null && toInstance.eIsProxy()) {
			InternalEObject oldToInstance = (InternalEObject)toInstance;
			toInstance = (ArchiElemInstance)eResolveProxy(oldToInstance);
			if (toInstance != oldToInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MmaemiliaPackage.TO__TO_INSTANCE, oldToInstance, toInstance));
			}
		}
		return toInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiElemInstance basicGetToInstance() {
		return toInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToInstance(ArchiElemInstance newToInstance) {
		ArchiElemInstance oldToInstance = toInstance;
		toInstance = newToInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmaemiliaPackage.TO__TO_INSTANCE, oldToInstance, toInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputInteraction getIsInput() {
		if (isInput != null && isInput.eIsProxy()) {
			InternalEObject oldIsInput = (InternalEObject)isInput;
			isInput = (InputInteraction)eResolveProxy(oldIsInput);
			if (isInput != oldIsInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MmaemiliaPackage.TO__IS_INPUT, oldIsInput, isInput));
			}
		}
		return isInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputInteraction basicGetIsInput() {
		return isInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInput(InputInteraction newIsInput) {
		InputInteraction oldIsInput = isInput;
		isInput = newIsInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmaemiliaPackage.TO__IS_INPUT, oldIsInput, isInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MmaemiliaPackage.TO__TO_INSTANCE:
				if (resolve) return getToInstance();
				return basicGetToInstance();
			case MmaemiliaPackage.TO__IS_INPUT:
				if (resolve) return getIsInput();
				return basicGetIsInput();
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
			case MmaemiliaPackage.TO__TO_INSTANCE:
				setToInstance((ArchiElemInstance)newValue);
				return;
			case MmaemiliaPackage.TO__IS_INPUT:
				setIsInput((InputInteraction)newValue);
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
			case MmaemiliaPackage.TO__TO_INSTANCE:
				setToInstance((ArchiElemInstance)null);
				return;
			case MmaemiliaPackage.TO__IS_INPUT:
				setIsInput((InputInteraction)null);
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
			case MmaemiliaPackage.TO__TO_INSTANCE:
				return toInstance != null;
			case MmaemiliaPackage.TO__IS_INPUT:
				return isInput != null;
		}
		return super.eIsSet(featureID);
	}

} //ToImpl
