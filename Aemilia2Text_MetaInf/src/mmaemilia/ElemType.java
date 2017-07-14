/**
 */
package mmaemilia;

import mmaemilia.Behavior.Behavior;

import mmaemilia.Headers.ET_Header;

import mmaemilia.QueueingNetwork.WorkloadClass;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elem Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmaemilia.ElemType#getIiDecl <em>Ii Decl</em>}</li>
 *   <li>{@link mmaemilia.ElemType#getOiDecl <em>Oi Decl</em>}</li>
 *   <li>{@link mmaemilia.ElemType#getEtName <em>Et Name</em>}</li>
 *   <li>{@link mmaemilia.ElemType#getElemHeader <em>Elem Header</em>}</li>
 *   <li>{@link mmaemilia.ElemType#getBehaviorDecl <em>Behavior Decl</em>}</li>
 *   <li>{@link mmaemilia.ElemType#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see mmaemilia.MmaemiliaPackage#getElemType()
 * @model
 * @generated
 */
public interface ElemType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ii Decl</b></em>' containment reference list.
	 * The list contents are of type {@link mmaemilia.InputInteraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ii Decl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ii Decl</em>' containment reference list.
	 * @see mmaemilia.MmaemiliaPackage#getElemType_IiDecl()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputInteraction> getIiDecl();

	/**
	 * Returns the value of the '<em><b>Oi Decl</b></em>' containment reference list.
	 * The list contents are of type {@link mmaemilia.OutputInteraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oi Decl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oi Decl</em>' containment reference list.
	 * @see mmaemilia.MmaemiliaPackage#getElemType_OiDecl()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputInteraction> getOiDecl();

	/**
	 * Returns the value of the '<em><b>Et Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Et Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Et Name</em>' attribute.
	 * @see #setEtName(String)
	 * @see mmaemilia.MmaemiliaPackage#getElemType_EtName()
	 * @model required="true"
	 * @generated
	 */
	String getEtName();

	/**
	 * Sets the value of the '{@link mmaemilia.ElemType#getEtName <em>Et Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Et Name</em>' attribute.
	 * @see #getEtName()
	 * @generated
	 */
	void setEtName(String value);

	/**
	 * Returns the value of the '<em><b>Elem Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elem Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elem Header</em>' containment reference.
	 * @see #setElemHeader(ET_Header)
	 * @see mmaemilia.MmaemiliaPackage#getElemType_ElemHeader()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ET_Header getElemHeader();

	/**
	 * Sets the value of the '{@link mmaemilia.ElemType#getElemHeader <em>Elem Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elem Header</em>' containment reference.
	 * @see #getElemHeader()
	 * @generated
	 */
	void setElemHeader(ET_Header value);

	/**
	 * Returns the value of the '<em><b>Behavior Decl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Decl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Decl</em>' containment reference.
	 * @see #setBehaviorDecl(Behavior)
	 * @see mmaemilia.MmaemiliaPackage#getElemType_BehaviorDecl()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Behavior getBehaviorDecl();

	/**
	 * Sets the value of the '{@link mmaemilia.ElemType#getBehaviorDecl <em>Behavior Decl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior Decl</em>' containment reference.
	 * @see #getBehaviorDecl()
	 * @generated
	 */
	void setBehaviorDecl(Behavior value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link mmaemilia.QueueingNetwork.WorkloadClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see mmaemilia.MmaemiliaPackage#getElemType_Classes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WorkloadClass> getClasses();

} // ElemType
