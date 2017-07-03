/**
 */
package mmaemilia.Expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ident Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmaemilia.Expressions.IdentExpr#getName <em>Name</em>}</li>
 *   <li>{@link mmaemilia.Expressions.IdentExpr#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see mmaemilia.Expressions.ExpressionsPackage#getIdentExpr()
 * @model
 * @generated
 */
public interface IdentExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mmaemilia.Expressions.ExpressionsPackage#getIdentExpr_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mmaemilia.Expressions.IdentExpr#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mmaemilia.Expressions.IdentifierType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mmaemilia.Expressions.IdentifierType
	 * @see #setType(IdentifierType)
	 * @see mmaemilia.Expressions.ExpressionsPackage#getIdentExpr_Type()
	 * @model required="true"
	 * @generated
	 */
	IdentifierType getType();

	/**
	 * Sets the value of the '{@link mmaemilia.Expressions.IdentExpr#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mmaemilia.Expressions.IdentifierType
	 * @see #getType()
	 * @generated
	 */
	void setType(IdentifierType value);

} // IdentExpr
