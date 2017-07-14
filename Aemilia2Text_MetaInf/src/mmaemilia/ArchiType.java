/**
 */
package mmaemilia;

import mmaemilia.Headers.AT_Header;

import mmaemilia.QueueingNetwork.Workload;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archi Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mmaemilia.ArchiType#getAetDeclaration <em>Aet Declaration</em>}</li>
 *   <li>{@link mmaemilia.ArchiType#getAtDeclaration <em>At Declaration</em>}</li>
 *   <li>{@link mmaemilia.ArchiType#getAtName <em>At Name</em>}</li>
 *   <li>{@link mmaemilia.ArchiType#getHeader <em>Header</em>}</li>
 *   <li>{@link mmaemilia.ArchiType#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link mmaemilia.ArchiType#getResidenceTime <em>Residence Time</em>}</li>
 *   <li>{@link mmaemilia.ArchiType#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link mmaemilia.ArchiType#getQueueLength <em>Queue Length</em>}</li>
 *   <li>{@link mmaemilia.ArchiType#getServiceTime <em>Service Time</em>}</li>
 *   <li>{@link mmaemilia.ArchiType#getWorkloads <em>Workloads</em>}</li>
 * </ul>
 *
 * @see mmaemilia.MmaemiliaPackage#getArchiType()
 * @model
 * @generated
 */
public interface ArchiType extends EObject {
	/**
	 * Returns the value of the '<em><b>Aet Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aet Declaration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aet Declaration</em>' containment reference.
	 * @see #setAetDeclaration(ArchiElemTypes)
	 * @see mmaemilia.MmaemiliaPackage#getArchiType_AetDeclaration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArchiElemTypes getAetDeclaration();

	/**
	 * Sets the value of the '{@link mmaemilia.ArchiType#getAetDeclaration <em>Aet Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aet Declaration</em>' containment reference.
	 * @see #getAetDeclaration()
	 * @generated
	 */
	void setAetDeclaration(ArchiElemTypes value);

	/**
	 * Returns the value of the '<em><b>At Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>At Declaration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At Declaration</em>' containment reference.
	 * @see #setAtDeclaration(ArchiTopology)
	 * @see mmaemilia.MmaemiliaPackage#getArchiType_AtDeclaration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArchiTopology getAtDeclaration();

	/**
	 * Sets the value of the '{@link mmaemilia.ArchiType#getAtDeclaration <em>At Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At Declaration</em>' containment reference.
	 * @see #getAtDeclaration()
	 * @generated
	 */
	void setAtDeclaration(ArchiTopology value);

	/**
	 * Returns the value of the '<em><b>At Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>At Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At Name</em>' attribute.
	 * @see #setAtName(String)
	 * @see mmaemilia.MmaemiliaPackage#getArchiType_AtName()
	 * @model required="true"
	 * @generated
	 */
	String getAtName();

	/**
	 * Sets the value of the '{@link mmaemilia.ArchiType#getAtName <em>At Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At Name</em>' attribute.
	 * @see #getAtName()
	 * @generated
	 */
	void setAtName(String value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(AT_Header)
	 * @see mmaemilia.MmaemiliaPackage#getArchiType_Header()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AT_Header getHeader();

	/**
	 * Sets the value of the '{@link mmaemilia.ArchiType#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(AT_Header value);

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
	 * @see mmaemilia.MmaemiliaPackage#getArchiType_Throughput()
	 * @model
	 * @generated
	 */
	float getThroughput();

	/**
	 * Sets the value of the '{@link mmaemilia.ArchiType#getThroughput <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' attribute.
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(float value);

	/**
	 * Returns the value of the '<em><b>Residence Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Residence Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residence Time</em>' attribute.
	 * @see #setResidenceTime(float)
	 * @see mmaemilia.MmaemiliaPackage#getArchiType_ResidenceTime()
	 * @model
	 * @generated
	 */
	float getResidenceTime();

	/**
	 * Sets the value of the '{@link mmaemilia.ArchiType#getResidenceTime <em>Residence Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residence Time</em>' attribute.
	 * @see #getResidenceTime()
	 * @generated
	 */
	void setResidenceTime(float value);

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
	 * @see mmaemilia.MmaemiliaPackage#getArchiType_Utilization()
	 * @model
	 * @generated
	 */
	float getUtilization();

	/**
	 * Sets the value of the '{@link mmaemilia.ArchiType#getUtilization <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilization</em>' attribute.
	 * @see #getUtilization()
	 * @generated
	 */
	void setUtilization(float value);

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
	 * @see mmaemilia.MmaemiliaPackage#getArchiType_QueueLength()
	 * @model
	 * @generated
	 */
	float getQueueLength();

	/**
	 * Sets the value of the '{@link mmaemilia.ArchiType#getQueueLength <em>Queue Length</em>}' attribute.
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
	 * @see mmaemilia.MmaemiliaPackage#getArchiType_ServiceTime()
	 * @model
	 * @generated
	 */
	float getServiceTime();

	/**
	 * Sets the value of the '{@link mmaemilia.ArchiType#getServiceTime <em>Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Time</em>' attribute.
	 * @see #getServiceTime()
	 * @generated
	 */
	void setServiceTime(float value);

	/**
	 * Returns the value of the '<em><b>Workloads</b></em>' containment reference list.
	 * The list contents are of type {@link mmaemilia.QueueingNetwork.Workload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workloads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workloads</em>' containment reference list.
	 * @see mmaemilia.MmaemiliaPackage#getArchiType_Workloads()
	 * @model containment="true"
	 * @generated
	 */
	EList<Workload> getWorkloads();

} // ArchiType
