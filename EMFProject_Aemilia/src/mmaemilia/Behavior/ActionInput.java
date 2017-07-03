/**
 */
package mmaemilia.Behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmaemilia.Behavior.ActionInput#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see mmaemilia.Behavior.BehaviorPackage#getActionInput()
 * @model
 * @generated
 */
public interface ActionInput extends ActionType {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' attribute list.
	 * @see mmaemilia.Behavior.BehaviorPackage#getActionInput_Var()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getVar();

} // ActionInput
