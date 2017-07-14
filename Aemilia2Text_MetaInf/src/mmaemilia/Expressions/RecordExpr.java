/**
 */
package mmaemilia.Expressions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmaemilia.Expressions.RecordExpr#getOperation <em>Operation</em>}</li>
 *   <li>{@link mmaemilia.Expressions.RecordExpr#getRecord_operands <em>Record operands</em>}</li>
 * </ul>
 *
 * @see mmaemilia.Expressions.ExpressionsPackage#getRecordExpr()
 * @model
 * @generated
 */
public interface RecordExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link mmaemilia.Expressions.RecordOpName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see mmaemilia.Expressions.RecordOpName
	 * @see #setOperation(RecordOpName)
	 * @see mmaemilia.Expressions.ExpressionsPackage#getRecordExpr_Operation()
	 * @model required="true"
	 * @generated
	 */
	RecordOpName getOperation();

	/**
	 * Sets the value of the '{@link mmaemilia.Expressions.RecordExpr#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see mmaemilia.Expressions.RecordOpName
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(RecordOpName value);

	/**
	 * Returns the value of the '<em><b>Record operands</b></em>' containment reference list.
	 * The list contents are of type {@link mmaemilia.Expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record operands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record operands</em>' containment reference list.
	 * @see mmaemilia.Expressions.ExpressionsPackage#getRecordExpr_Record_operands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getRecord_operands();

} // RecordExpr
