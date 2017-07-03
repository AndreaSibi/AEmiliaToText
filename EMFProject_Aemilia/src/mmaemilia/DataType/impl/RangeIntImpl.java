/**
 */
package mmaemilia.DataType.impl;

import java.lang.Integer;

import mmaemilia.DataType.DataTypePackage;
import mmaemilia.DataType.RangeInt;

import mmaemilia.Headers.Const;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Int</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mmaemilia.DataType.impl.RangeIntImpl#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link mmaemilia.DataType.impl.RangeIntImpl#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link mmaemilia.DataType.impl.RangeIntImpl#getMinVar <em>Min Var</em>}</li>
 *   <li>{@link mmaemilia.DataType.impl.RangeIntImpl#getMaxVar <em>Max Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeIntImpl extends IntegerImpl implements RangeInt {
	/**
	 * The default value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVal()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_VAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVal()
	 * @generated
	 * @ordered
	 */
	protected int minVal = MIN_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVal()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_VAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVal()
	 * @generated
	 * @ordered
	 */
	protected int maxVal = MAX_VAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMinVar() <em>Min Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVar()
	 * @generated
	 * @ordered
	 */
	protected Const minVar;

	/**
	 * The cached value of the '{@link #getMaxVar() <em>Max Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVar()
	 * @generated
	 * @ordered
	 */
	protected Const maxVar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeIntImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypePackage.Literals.RANGE_INT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinVal() {
		return minVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVal(int newMinVal) {
		int oldMinVal = minVal;
		minVal = newMinVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypePackage.RANGE_INT__MIN_VAL, oldMinVal, minVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxVal() {
		return maxVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVal(int newMaxVal) {
		int oldMaxVal = maxVal;
		maxVal = newMaxVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypePackage.RANGE_INT__MAX_VAL, oldMaxVal, maxVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Const getMinVar() {
		if (minVar != null && minVar.eIsProxy()) {
			InternalEObject oldMinVar = (InternalEObject)minVar;
			minVar = (Const)eResolveProxy(oldMinVar);
			if (minVar != oldMinVar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypePackage.RANGE_INT__MIN_VAR, oldMinVar, minVar));
			}
		}
		return minVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Const basicGetMinVar() {
		return minVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVar(Const newMinVar) {
		Const oldMinVar = minVar;
		minVar = newMinVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypePackage.RANGE_INT__MIN_VAR, oldMinVar, minVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Const getMaxVar() {
		if (maxVar != null && maxVar.eIsProxy()) {
			InternalEObject oldMaxVar = (InternalEObject)maxVar;
			maxVar = (Const)eResolveProxy(oldMaxVar);
			if (maxVar != oldMaxVar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypePackage.RANGE_INT__MAX_VAR, oldMaxVar, maxVar));
			}
		}
		return maxVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Const basicGetMaxVar() {
		return maxVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVar(Const newMaxVar) {
		Const oldMaxVar = maxVar;
		maxVar = newMaxVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypePackage.RANGE_INT__MAX_VAR, oldMaxVar, maxVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypePackage.RANGE_INT__MIN_VAL:
				return getMinVal();
			case DataTypePackage.RANGE_INT__MAX_VAL:
				return getMaxVal();
			case DataTypePackage.RANGE_INT__MIN_VAR:
				if (resolve) return getMinVar();
				return basicGetMinVar();
			case DataTypePackage.RANGE_INT__MAX_VAR:
				if (resolve) return getMaxVar();
				return basicGetMaxVar();
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
			case DataTypePackage.RANGE_INT__MIN_VAL:
				setMinVal((Integer)newValue);
				return;
			case DataTypePackage.RANGE_INT__MAX_VAL:
				setMaxVal((Integer)newValue);
				return;
			case DataTypePackage.RANGE_INT__MIN_VAR:
				setMinVar((Const)newValue);
				return;
			case DataTypePackage.RANGE_INT__MAX_VAR:
				setMaxVar((Const)newValue);
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
			case DataTypePackage.RANGE_INT__MIN_VAL:
				setMinVal(MIN_VAL_EDEFAULT);
				return;
			case DataTypePackage.RANGE_INT__MAX_VAL:
				setMaxVal(MAX_VAL_EDEFAULT);
				return;
			case DataTypePackage.RANGE_INT__MIN_VAR:
				setMinVar((Const)null);
				return;
			case DataTypePackage.RANGE_INT__MAX_VAR:
				setMaxVar((Const)null);
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
			case DataTypePackage.RANGE_INT__MIN_VAL:
				return minVal != MIN_VAL_EDEFAULT;
			case DataTypePackage.RANGE_INT__MAX_VAL:
				return maxVal != MAX_VAL_EDEFAULT;
			case DataTypePackage.RANGE_INT__MIN_VAR:
				return minVar != null;
			case DataTypePackage.RANGE_INT__MAX_VAR:
				return maxVar != null;
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
		result.append(" (minVal: ");
		result.append(minVal);
		result.append(", maxVal: ");
		result.append(maxVal);
		result.append(')');
		return result.toString();
	}

} //RangeIntImpl
