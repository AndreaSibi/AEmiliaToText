/**
 */
package mmaemilia.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmaemilia.DataType.Array#getLenght <em>Lenght</em>}</li>
 *   <li>{@link mmaemilia.DataType.Array#getArrayElemType <em>Array Elem Type</em>}</li>
 * </ul>
 *
 * @see mmaemilia.DataType.DataTypePackage#getArray()
 * @model
 * @generated
 */
public interface Array extends Normal {
	/**
	 * Returns the value of the '<em><b>Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lenght</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lenght</em>' attribute.
	 * @see #setLenght(int)
	 * @see mmaemilia.DataType.DataTypePackage#getArray_Lenght()
	 * @model required="true"
	 * @generated
	 */
	int getLenght();

	/**
	 * Sets the value of the '{@link mmaemilia.DataType.Array#getLenght <em>Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lenght</em>' attribute.
	 * @see #getLenght()
	 * @generated
	 */
	void setLenght(int value);

	/**
	 * Returns the value of the '<em><b>Array Elem Type</b></em>' containment reference list.
	 * The list contents are of type {@link mmaemilia.DataType.Normal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Elem Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Elem Type</em>' containment reference list.
	 * @see mmaemilia.DataType.DataTypePackage#getArray_ArrayElemType()
	 * @model containment="true"
	 * @generated
	 */
	EList<Normal> getArrayElemType();

} // Array
