/**
 */
package mmaemilia;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AEmilia Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmaemilia.AEmiliaSpecification#getArchiTypeDecl <em>Archi Type Decl</em>}</li>
 * </ul>
 *
 * @see mmaemilia.MmaemiliaPackage#getAEmiliaSpecification()
 * @model
 * @generated
 */
public interface AEmiliaSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Archi Type Decl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archi Type Decl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archi Type Decl</em>' containment reference.
	 * @see #setArchiTypeDecl(ArchiType)
	 * @see mmaemilia.MmaemiliaPackage#getAEmiliaSpecification_ArchiTypeDecl()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArchiType getArchiTypeDecl();

	/**
	 * Sets the value of the '{@link mmaemilia.AEmiliaSpecification#getArchiTypeDecl <em>Archi Type Decl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archi Type Decl</em>' containment reference.
	 * @see #getArchiTypeDecl()
	 * @generated
	 */
	void setArchiTypeDecl(ArchiType value);

} // AEmiliaSpecification
