/**
 */
package mmaemilia;

import mmaemilia.Expressions.Expression;

import mmaemilia.QueueingNetwork.WorkloadClass;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archi Elem Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmaemilia.ArchiElemInstance#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link mmaemilia.ArchiElemInstance#getActualParam <em>Actual Param</em>}</li>
 *   <li>{@link mmaemilia.ArchiElemInstance#getTypeOf <em>Type Of</em>}</li>
 *   <li>{@link mmaemilia.ArchiElemInstance#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link mmaemilia.ArchiElemInstance#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link mmaemilia.ArchiElemInstance#getResponseTime <em>Response Time</em>}</li>
 *   <li>{@link mmaemilia.ArchiElemInstance#getInstanceUtilDistr <em>Instance Util Distr</em>}</li>
 *   <li>{@link mmaemilia.ArchiElemInstance#getInstanceThDistr <em>Instance Th Distr</em>}</li>
 *   <li>{@link mmaemilia.ArchiElemInstance#getInstanceResTimeDistr <em>Instance Res Time Distr</em>}</li>
 *   <li>{@link mmaemilia.ArchiElemInstance#getQueueLength <em>Queue Length</em>}</li>
 *   <li>{@link mmaemilia.ArchiElemInstance#getServiceTime <em>Service Time</em>}</li>
 *   <li>{@link mmaemilia.ArchiElemInstance#getClasses <em>Classes</em>}</li>
 *   <li>{@link mmaemilia.ArchiElemInstance#getElem <em>Elem</em>}</li>
 *   <li>{@link mmaemilia.ArchiElemInstance#getSelector <em>Selector</em>}</li>
 * </ul>
 *
 * @see mmaemilia.MmaemiliaPackage#getArchiElemInstance()
 * @model
 * @generated
 */
public interface ArchiElemInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see mmaemilia.MmaemiliaPackage#getArchiElemInstance_InstanceName()
	 * @model required="true"
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link mmaemilia.ArchiElemInstance#getInstanceName <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' attribute.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(String value);

	/**
	 * Returns the value of the '<em><b>Actual Param</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Param</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Param</em>' attribute list.
	 * @see mmaemilia.MmaemiliaPackage#getArchiElemInstance_ActualParam()
	 * @model
	 * @generated
	 */
	EList<String> getActualParam();

	/**
	 * Returns the value of the '<em><b>Type Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of</em>' reference.
	 * @see #setTypeOf(ElemType)
	 * @see mmaemilia.MmaemiliaPackage#getArchiElemInstance_TypeOf()
	 * @model required="true"
	 * @generated
	 */
	ElemType getTypeOf();

	/**
	 * Sets the value of the '{@link mmaemilia.ArchiElemInstance#getTypeOf <em>Type Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of</em>' reference.
	 * @see #getTypeOf()
	 * @generated
	 */
	void setTypeOf(ElemType value);

	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throughput</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' attribute.
	 * @see #setThroughput(float)
	 * @see mmaemilia.MmaemiliaPackage#getArchiElemInstance_Throughput()
	 * @model
	 * @generated
	 */
	float getThroughput();

	/**
	 * Sets the value of the '{@link mmaemilia.ArchiElemInstance#getThroughput <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' attribute.
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(float value);

	/**
	 * Returns the value of the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilization</em>' attribute.
	 * @see #setUtilization(float)
	 * @see mmaemilia.MmaemiliaPackage#getArchiElemInstance_Utilization()
	 * @model
	 * @generated
	 */
	float getUtilization();

	/**
	 * Sets the value of the '{@link mmaemilia.ArchiElemInstance#getUtilization <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilization</em>' attribute.
	 * @see #getUtilization()
	 * @generated
	 */
	void setUtilization(float value);

	/**
	 * Returns the value of the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Time</em>' attribute.
	 * @see #setResponseTime(float)
	 * @see mmaemilia.MmaemiliaPackage#getArchiElemInstance_ResponseTime()
	 * @model
	 * @generated
	 */
	float getResponseTime();

	/**
	 * Sets the value of the '{@link mmaemilia.ArchiElemInstance#getResponseTime <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Time</em>' attribute.
	 * @see #getResponseTime()
	 * @generated
	 */
	void setResponseTime(float value);

	/**
	 * Returns the value of the '<em><b>Instance Util Distr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Util Distr</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Util Distr</em>' attribute list.
	 * @see mmaemilia.MmaemiliaPackage#getArchiElemInstance_InstanceUtilDistr()
	 * @model
	 * @generated
	 */
	EList<String> getInstanceUtilDistr();

	/**
	 * Returns the value of the '<em><b>Instance Th Distr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Th Distr</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Th Distr</em>' attribute list.
	 * @see mmaemilia.MmaemiliaPackage#getArchiElemInstance_InstanceThDistr()
	 * @model
	 * @generated
	 */
	EList<String> getInstanceThDistr();

	/**
	 * Returns the value of the '<em><b>Instance Res Time Distr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Res Time Distr</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Res Time Distr</em>' attribute list.
	 * @see mmaemilia.MmaemiliaPackage#getArchiElemInstance_InstanceResTimeDistr()
	 * @model
	 * @generated
	 */
	EList<String> getInstanceResTimeDistr();

	/**
	 * Returns the value of the '<em><b>Queue Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Length</em>' attribute.
	 * @see #setQueueLength(float)
	 * @see mmaemilia.MmaemiliaPackage#getArchiElemInstance_QueueLength()
	 * @model
	 * @generated
	 */
	float getQueueLength();

	/**
	 * Sets the value of the '{@link mmaemilia.ArchiElemInstance#getQueueLength <em>Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Length</em>' attribute.
	 * @see #getQueueLength()
	 * @generated
	 */
	void setQueueLength(float value);

	/**
	 * Returns the value of the '<em><b>Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Time</em>' attribute.
	 * @see #setServiceTime(float)
	 * @see mmaemilia.MmaemiliaPackage#getArchiElemInstance_ServiceTime()
	 * @model
	 * @generated
	 */
	float getServiceTime();

	/**
	 * Sets the value of the '{@link mmaemilia.ArchiElemInstance#getServiceTime <em>Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Time</em>' attribute.
	 * @see #getServiceTime()
	 * @generated
	 */
	void setServiceTime(float value);

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
	 * @see mmaemilia.MmaemiliaPackage#getArchiElemInstance_Classes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WorkloadClass> getClasses();

	/**
	 * Returns the value of the '<em><b>Elem</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mmaemilia.Elem#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elem</em>' containment reference.
	 * @see #setElem(Elem)
	 * @see mmaemilia.MmaemiliaPackage#getArchiElemInstance_Elem()
	 * @see mmaemilia.Elem#getInstance
	 * @model opposite="instance" containment="true" required="true"
	 * @generated
	 */
	Elem getElem();

	/**
	 * Sets the value of the '{@link mmaemilia.ArchiElemInstance#getElem <em>Elem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elem</em>' containment reference.
	 * @see #getElem()
	 * @generated
	 */
	void setElem(Elem value);

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference.
	 * @see #setSelector(Expression)
	 * @see mmaemilia.MmaemiliaPackage#getArchiElemInstance_Selector()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSelector();

	/**
	 * Sets the value of the '{@link mmaemilia.ArchiElemInstance#getSelector <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' containment reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(Expression value);

} // ArchiElemInstance
