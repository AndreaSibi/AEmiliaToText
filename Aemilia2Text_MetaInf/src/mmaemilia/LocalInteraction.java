/**
 */
package mmaemilia;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmaemilia.LocalInteraction#getIntName <em>Int Name</em>}</li>
 *   <li>{@link mmaemilia.LocalInteraction#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see mmaemilia.MmaemiliaPackage#getLocalInteraction()
 * @model
 * @generated
 */
public interface LocalInteraction extends Interaction {
	/**
	 * Returns the value of the '<em><b>Int Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Name</em>' attribute.
	 * @see #setIntName(String)
	 * @see mmaemilia.MmaemiliaPackage#getLocalInteraction_IntName()
	 * @model required="true"
	 * @generated
	 */
	String getIntName();

	/**
	 * Sets the value of the '{@link mmaemilia.LocalInteraction#getIntName <em>Int Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Name</em>' attribute.
	 * @see #getIntName()
	 * @generated
	 */
	void setIntName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mmaemilia.InteractionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mmaemilia.InteractionType
	 * @see #setType(InteractionType)
	 * @see mmaemilia.MmaemiliaPackage#getLocalInteraction_Type()
	 * @model required="true"
	 * @generated
	 */
	InteractionType getType();

	/**
	 * Sets the value of the '{@link mmaemilia.LocalInteraction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mmaemilia.InteractionType
	 * @see #getType()
	 * @generated
	 */
	void setType(InteractionType value);

} // LocalInteraction
