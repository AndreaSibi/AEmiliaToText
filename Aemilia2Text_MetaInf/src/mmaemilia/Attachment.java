/**
 */
package mmaemilia;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmaemilia.Attachment#getEnd <em>End</em>}</li>
 *   <li>{@link mmaemilia.Attachment#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @see mmaemilia.MmaemiliaPackage#getAttachment()
 * @model
 * @generated
 */
public interface Attachment extends EObject {
	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(To)
	 * @see mmaemilia.MmaemiliaPackage#getAttachment_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	To getEnd();

	/**
	 * Sets the value of the '{@link mmaemilia.Attachment#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(To value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(From)
	 * @see mmaemilia.MmaemiliaPackage#getAttachment_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	From getStart();

	/**
	 * Sets the value of the '{@link mmaemilia.Attachment#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(From value);

} // Attachment
