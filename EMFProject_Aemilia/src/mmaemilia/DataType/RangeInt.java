/**
 */
package mmaemilia.DataType;

import mmaemilia.Headers.Const;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Int</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmaemilia.DataType.RangeInt#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link mmaemilia.DataType.RangeInt#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link mmaemilia.DataType.RangeInt#getMinVar <em>Min Var</em>}</li>
 *   <li>{@link mmaemilia.DataType.RangeInt#getMaxVar <em>Max Var</em>}</li>
 * </ul>
 *
 * @see mmaemilia.DataType.DataTypePackage#getRangeInt()
 * @model
 * @generated
 */
public interface RangeInt extends mmaemilia.DataType.Integer {
	/**
	 * Returns the value of the '<em><b>Min Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Val</em>' attribute.
	 * @see #setMinVal(int)
	 * @see mmaemilia.DataType.DataTypePackage#getRangeInt_MinVal()
	 * @model required="true"
	 * @generated
	 */
	int getMinVal();

	/**
	 * Sets the value of the '{@link mmaemilia.DataType.RangeInt#getMinVal <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Val</em>' attribute.
	 * @see #getMinVal()
	 * @generated
	 */
	void setMinVal(int value);

	/**
	 * Returns the value of the '<em><b>Max Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Val</em>' attribute.
	 * @see #setMaxVal(int)
	 * @see mmaemilia.DataType.DataTypePackage#getRangeInt_MaxVal()
	 * @model required="true"
	 * @generated
	 */
	int getMaxVal();

	/**
	 * Sets the value of the '{@link mmaemilia.DataType.RangeInt#getMaxVal <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Val</em>' attribute.
	 * @see #getMaxVal()
	 * @generated
	 */
	void setMaxVal(int value);

	/**
	 * Returns the value of the '<em><b>Min Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Var</em>' reference.
	 * @see #setMinVar(Const)
	 * @see mmaemilia.DataType.DataTypePackage#getRangeInt_MinVar()
	 * @model
	 * @generated
	 */
	Const getMinVar();

	/**
	 * Sets the value of the '{@link mmaemilia.DataType.RangeInt#getMinVar <em>Min Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Var</em>' reference.
	 * @see #getMinVar()
	 * @generated
	 */
	void setMinVar(Const value);

	/**
	 * Returns the value of the '<em><b>Max Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Var</em>' reference.
	 * @see #setMaxVar(Const)
	 * @see mmaemilia.DataType.DataTypePackage#getRangeInt_MaxVar()
	 * @model
	 * @generated
	 */
	Const getMaxVar();

	/**
	 * Sets the value of the '{@link mmaemilia.DataType.RangeInt#getMaxVar <em>Max Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Var</em>' reference.
	 * @see #getMaxVar()
	 * @generated
	 */
	void setMaxVar(Const value);

} // RangeInt
