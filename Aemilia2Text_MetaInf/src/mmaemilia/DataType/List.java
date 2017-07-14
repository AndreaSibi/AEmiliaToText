/**
 */
package mmaemilia.DataType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmaemilia.DataType.List#getListElemType <em>List Elem Type</em>}</li>
 * </ul>
 *
 * @see mmaemilia.DataType.DataTypePackage#getList()
 * @model
 * @generated
 */
public interface List extends Normal {
	/**
	 * Returns the value of the '<em><b>List Elem Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Elem Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Elem Type</em>' containment reference.
	 * @see #setListElemType(Normal)
	 * @see mmaemilia.DataType.DataTypePackage#getList_ListElemType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Normal getListElemType();

	/**
	 * Sets the value of the '{@link mmaemilia.DataType.List#getListElemType <em>List Elem Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Elem Type</em>' containment reference.
	 * @see #getListElemType()
	 * @generated
	 */
	void setListElemType(Normal value);

} // List
