/**
 */
package mmaemilia;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mmaemilia.MmaemiliaFactory
 * @model kind="package"
 * @generated
 */
public interface MmaemiliaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mmaemilia";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mmaemilia.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mmaemilia";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MmaemiliaPackage eINSTANCE = mmaemilia.impl.MmaemiliaPackageImpl.init();

	/**
	 * The meta object id for the '{@link mmaemilia.impl.AEmiliaSpecificationImpl <em>AEmilia Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.impl.AEmiliaSpecificationImpl
	 * @see mmaemilia.impl.MmaemiliaPackageImpl#getAEmiliaSpecification()
	 * @generated
	 */
	int AEMILIA_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Archi Type Decl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_SPECIFICATION__ARCHI_TYPE_DECL = 0;

	/**
	 * The number of structural features of the '<em>AEmilia Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>AEmilia Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.impl.ArchiTypeImpl <em>Archi Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.impl.ArchiTypeImpl
	 * @see mmaemilia.impl.MmaemiliaPackageImpl#getArchiType()
	 * @generated
	 */
	int ARCHI_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Aet Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_TYPE__AET_DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>At Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_TYPE__AT_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>At Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_TYPE__AT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_TYPE__HEADER = 3;

	/**
	 * The number of structural features of the '<em>Archi Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Archi Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.impl.ArchiElemTypesImpl <em>Archi Elem Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.impl.ArchiElemTypesImpl
	 * @see mmaemilia.impl.MmaemiliaPackageImpl#getArchiElemTypes()
	 * @generated
	 */
	int ARCHI_ELEM_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Et Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_ELEM_TYPES__ET_DECLARATION = 0;

	/**
	 * The number of structural features of the '<em>Archi Elem Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_ELEM_TYPES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Archi Elem Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_ELEM_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.impl.ArchiTopologyImpl <em>Archi Topology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.impl.ArchiTopologyImpl
	 * @see mmaemilia.impl.MmaemiliaPackageImpl#getArchiTopology()
	 * @generated
	 */
	int ARCHI_TOPOLOGY = 3;

	/**
	 * The feature id for the '<em><b>Aei Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_TOPOLOGY__AEI_DECL = 0;

	/**
	 * The feature id for the '<em><b>Att Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_TOPOLOGY__ATT_DECL = 1;

	/**
	 * The feature id for the '<em><b>Ai Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_TOPOLOGY__AI_DECL = 2;

	/**
	 * The number of structural features of the '<em>Archi Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_TOPOLOGY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Archi Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_TOPOLOGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.impl.InteractionImpl
	 * @see mmaemilia.impl.MmaemiliaPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 4;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__THROUGHPUT = 0;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__UTILIZATION = 1;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__RESPONSE_TIME = 2;

	/**
	 * The feature id for the '<em><b>Throughtput Distr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__THROUGHTPUT_DISTR = 3;

	/**
	 * The feature id for the '<em><b>Resp Time Distr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__RESP_TIME_DISTR = 4;

	/**
	 * The feature id for the '<em><b>Util Distr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__UTIL_DISTR = 5;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.impl.LocalInteractionImpl <em>Local Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.impl.LocalInteractionImpl
	 * @see mmaemilia.impl.MmaemiliaPackageImpl#getLocalInteraction()
	 * @generated
	 */
	int LOCAL_INTERACTION = 5;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERACTION__THROUGHPUT = INTERACTION__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERACTION__UTILIZATION = INTERACTION__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERACTION__RESPONSE_TIME = INTERACTION__RESPONSE_TIME;

	/**
	 * The feature id for the '<em><b>Throughtput Distr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERACTION__THROUGHTPUT_DISTR = INTERACTION__THROUGHTPUT_DISTR;

	/**
	 * The feature id for the '<em><b>Resp Time Distr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERACTION__RESP_TIME_DISTR = INTERACTION__RESP_TIME_DISTR;

	/**
	 * The feature id for the '<em><b>Util Distr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERACTION__UTIL_DISTR = INTERACTION__UTIL_DISTR;

	/**
	 * The feature id for the '<em><b>Int Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERACTION__INT_NAME = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERACTION__TYPE = INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Local Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERACTION_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Local Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERACTION_OPERATION_COUNT = INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmaemilia.impl.ArchitecturalInteractionImpl <em>Architectural Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.impl.ArchitecturalInteractionImpl
	 * @see mmaemilia.impl.MmaemiliaPackageImpl#getArchitecturalInteraction()
	 * @generated
	 */
	int ARCHITECTURAL_INTERACTION = 6;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_INTERACTION__THROUGHPUT = INTERACTION__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_INTERACTION__UTILIZATION = INTERACTION__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_INTERACTION__RESPONSE_TIME = INTERACTION__RESPONSE_TIME;

	/**
	 * The feature id for the '<em><b>Throughtput Distr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_INTERACTION__THROUGHTPUT_DISTR = INTERACTION__THROUGHTPUT_DISTR;

	/**
	 * The feature id for the '<em><b>Resp Time Distr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_INTERACTION__RESP_TIME_DISTR = INTERACTION__RESP_TIME_DISTR;

	/**
	 * The feature id for the '<em><b>Util Distr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_INTERACTION__UTIL_DISTR = INTERACTION__UTIL_DISTR;

	/**
	 * The feature id for the '<em><b>Is A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_INTERACTION__IS_A = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_INTERACTION__NAME = INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_INTERACTION__FROM_INSTANCE = INTERACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Architectural Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_INTERACTION_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Architectural Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_INTERACTION_OPERATION_COUNT = INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmaemilia.impl.InputInteractionImpl <em>Input Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.impl.InputInteractionImpl
	 * @see mmaemilia.impl.MmaemiliaPackageImpl#getInputInteraction()
	 * @generated
	 */
	int INPUT_INTERACTION = 7;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INTERACTION__THROUGHPUT = LOCAL_INTERACTION__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INTERACTION__UTILIZATION = LOCAL_INTERACTION__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INTERACTION__RESPONSE_TIME = LOCAL_INTERACTION__RESPONSE_TIME;

	/**
	 * The feature id for the '<em><b>Throughtput Distr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INTERACTION__THROUGHTPUT_DISTR = LOCAL_INTERACTION__THROUGHTPUT_DISTR;

	/**
	 * The feature id for the '<em><b>Resp Time Distr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INTERACTION__RESP_TIME_DISTR = LOCAL_INTERACTION__RESP_TIME_DISTR;

	/**
	 * The feature id for the '<em><b>Util Distr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INTERACTION__UTIL_DISTR = LOCAL_INTERACTION__UTIL_DISTR;

	/**
	 * The feature id for the '<em><b>Int Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INTERACTION__INT_NAME = LOCAL_INTERACTION__INT_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INTERACTION__TYPE = LOCAL_INTERACTION__TYPE;

	/**
	 * The number of structural features of the '<em>Input Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INTERACTION_FEATURE_COUNT = LOCAL_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INTERACTION_OPERATION_COUNT = LOCAL_INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmaemilia.impl.OutputInteractionImpl <em>Output Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.impl.OutputInteractionImpl
	 * @see mmaemilia.impl.MmaemiliaPackageImpl#getOutputInteraction()
	 * @generated
	 */
	int OUTPUT_INTERACTION = 8;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTERACTION__THROUGHPUT = LOCAL_INTERACTION__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTERACTION__UTILIZATION = LOCAL_INTERACTION__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTERACTION__RESPONSE_TIME = LOCAL_INTERACTION__RESPONSE_TIME;

	/**
	 * The feature id for the '<em><b>Throughtput Distr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTERACTION__THROUGHTPUT_DISTR = LOCAL_INTERACTION__THROUGHTPUT_DISTR;

	/**
	 * The feature id for the '<em><b>Resp Time Distr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTERACTION__RESP_TIME_DISTR = LOCAL_INTERACTION__RESP_TIME_DISTR;

	/**
	 * The feature id for the '<em><b>Util Distr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTERACTION__UTIL_DISTR = LOCAL_INTERACTION__UTIL_DISTR;

	/**
	 * The feature id for the '<em><b>Int Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTERACTION__INT_NAME = LOCAL_INTERACTION__INT_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTERACTION__TYPE = LOCAL_INTERACTION__TYPE;

	/**
	 * The number of structural features of the '<em>Output Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTERACTION_FEATURE_COUNT = LOCAL_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_INTERACTION_OPERATION_COUNT = LOCAL_INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmaemilia.impl.ArchiElemInstanceImpl <em>Archi Elem Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.impl.ArchiElemInstanceImpl
	 * @see mmaemilia.impl.MmaemiliaPackageImpl#getArchiElemInstance()
	 * @generated
	 */
	int ARCHI_ELEM_INSTANCE = 9;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_ELEM_INSTANCE__INSTANCE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Actual Param</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_ELEM_INSTANCE__ACTUAL_PARAM = 1;

	/**
	 * The feature id for the '<em><b>Type Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_ELEM_INSTANCE__TYPE_OF = 2;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_ELEM_INSTANCE__THROUGHPUT = 3;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_ELEM_INSTANCE__UTILIZATION = 4;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_ELEM_INSTANCE__RESPONSE_TIME = 5;

	/**
	 * The feature id for the '<em><b>Instance Util Distr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_ELEM_INSTANCE__INSTANCE_UTIL_DISTR = 6;

	/**
	 * The feature id for the '<em><b>Instance Th Distr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_ELEM_INSTANCE__INSTANCE_TH_DISTR = 7;

	/**
	 * The feature id for the '<em><b>Instance Res Time Distr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_ELEM_INSTANCE__INSTANCE_RES_TIME_DISTR = 8;

	/**
	 * The number of structural features of the '<em>Archi Elem Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_ELEM_INSTANCE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Archi Elem Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHI_ELEM_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.impl.AttachmentImpl
	 * @see mmaemilia.impl.MmaemiliaPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 10;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__END = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__START = 1;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.impl.ElemTypeImpl <em>Elem Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.impl.ElemTypeImpl
	 * @see mmaemilia.impl.MmaemiliaPackageImpl#getElemType()
	 * @generated
	 */
	int ELEM_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Ii Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_TYPE__II_DECL = 0;

	/**
	 * The feature id for the '<em><b>Oi Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_TYPE__OI_DECL = 1;

	/**
	 * The feature id for the '<em><b>Et Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_TYPE__ET_NAME = 2;

	/**
	 * The feature id for the '<em><b>Elem Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_TYPE__ELEM_HEADER = 3;

	/**
	 * The feature id for the '<em><b>Behavior Decl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_TYPE__BEHAVIOR_DECL = 4;

	/**
	 * The number of structural features of the '<em>Elem Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Elem Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.impl.ToImpl <em>To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.impl.ToImpl
	 * @see mmaemilia.impl.MmaemiliaPackageImpl#getTo()
	 * @generated
	 */
	int TO = 12;

	/**
	 * The feature id for the '<em><b>To Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__TO_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Is Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__IS_INPUT = 1;

	/**
	 * The number of structural features of the '<em>To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.impl.FromImpl <em>From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.impl.FromImpl
	 * @see mmaemilia.impl.MmaemiliaPackageImpl#getFrom()
	 * @generated
	 */
	int FROM = 13;

	/**
	 * The feature id for the '<em><b>From Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__FROM_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Is Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__IS_OUTPUT = 1;

	/**
	 * The number of structural features of the '<em>From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.InteractionType <em>Interaction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.InteractionType
	 * @see mmaemilia.impl.MmaemiliaPackageImpl#getInteractionType()
	 * @generated
	 */
	int INTERACTION_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link mmaemilia.AEmiliaSpecification <em>AEmilia Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AEmilia Specification</em>'.
	 * @see mmaemilia.AEmiliaSpecification
	 * @generated
	 */
	EClass getAEmiliaSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.AEmiliaSpecification#getArchiTypeDecl <em>Archi Type Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archi Type Decl</em>'.
	 * @see mmaemilia.AEmiliaSpecification#getArchiTypeDecl()
	 * @see #getAEmiliaSpecification()
	 * @generated
	 */
	EReference getAEmiliaSpecification_ArchiTypeDecl();

	/**
	 * Returns the meta object for class '{@link mmaemilia.ArchiType <em>Archi Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archi Type</em>'.
	 * @see mmaemilia.ArchiType
	 * @generated
	 */
	EClass getArchiType();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.ArchiType#getAetDeclaration <em>Aet Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aet Declaration</em>'.
	 * @see mmaemilia.ArchiType#getAetDeclaration()
	 * @see #getArchiType()
	 * @generated
	 */
	EReference getArchiType_AetDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.ArchiType#getAtDeclaration <em>At Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>At Declaration</em>'.
	 * @see mmaemilia.ArchiType#getAtDeclaration()
	 * @see #getArchiType()
	 * @generated
	 */
	EReference getArchiType_AtDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link mmaemilia.ArchiType#getAtName <em>At Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>At Name</em>'.
	 * @see mmaemilia.ArchiType#getAtName()
	 * @see #getArchiType()
	 * @generated
	 */
	EAttribute getArchiType_AtName();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.ArchiType#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see mmaemilia.ArchiType#getHeader()
	 * @see #getArchiType()
	 * @generated
	 */
	EReference getArchiType_Header();

	/**
	 * Returns the meta object for class '{@link mmaemilia.ArchiElemTypes <em>Archi Elem Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archi Elem Types</em>'.
	 * @see mmaemilia.ArchiElemTypes
	 * @generated
	 */
	EClass getArchiElemTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link mmaemilia.ArchiElemTypes#getEtDeclaration <em>Et Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Et Declaration</em>'.
	 * @see mmaemilia.ArchiElemTypes#getEtDeclaration()
	 * @see #getArchiElemTypes()
	 * @generated
	 */
	EReference getArchiElemTypes_EtDeclaration();

	/**
	 * Returns the meta object for class '{@link mmaemilia.ArchiTopology <em>Archi Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archi Topology</em>'.
	 * @see mmaemilia.ArchiTopology
	 * @generated
	 */
	EClass getArchiTopology();

	/**
	 * Returns the meta object for the containment reference list '{@link mmaemilia.ArchiTopology#getAeiDecl <em>Aei Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aei Decl</em>'.
	 * @see mmaemilia.ArchiTopology#getAeiDecl()
	 * @see #getArchiTopology()
	 * @generated
	 */
	EReference getArchiTopology_AeiDecl();

	/**
	 * Returns the meta object for the containment reference list '{@link mmaemilia.ArchiTopology#getAttDecl <em>Att Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Att Decl</em>'.
	 * @see mmaemilia.ArchiTopology#getAttDecl()
	 * @see #getArchiTopology()
	 * @generated
	 */
	EReference getArchiTopology_AttDecl();

	/**
	 * Returns the meta object for the containment reference list '{@link mmaemilia.ArchiTopology#getAiDecl <em>Ai Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ai Decl</em>'.
	 * @see mmaemilia.ArchiTopology#getAiDecl()
	 * @see #getArchiTopology()
	 * @generated
	 */
	EReference getArchiTopology_AiDecl();

	/**
	 * Returns the meta object for class '{@link mmaemilia.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see mmaemilia.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for the attribute '{@link mmaemilia.Interaction#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see mmaemilia.Interaction#getThroughput()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link mmaemilia.Interaction#getUtilization <em>Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilization</em>'.
	 * @see mmaemilia.Interaction#getUtilization()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_Utilization();

	/**
	 * Returns the meta object for the attribute '{@link mmaemilia.Interaction#getResponseTime <em>Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Time</em>'.
	 * @see mmaemilia.Interaction#getResponseTime()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_ResponseTime();

	/**
	 * Returns the meta object for the attribute list '{@link mmaemilia.Interaction#getThroughtputDistr <em>Throughtput Distr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Throughtput Distr</em>'.
	 * @see mmaemilia.Interaction#getThroughtputDistr()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_ThroughtputDistr();

	/**
	 * Returns the meta object for the attribute list '{@link mmaemilia.Interaction#getRespTimeDistr <em>Resp Time Distr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resp Time Distr</em>'.
	 * @see mmaemilia.Interaction#getRespTimeDistr()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_RespTimeDistr();

	/**
	 * Returns the meta object for the attribute list '{@link mmaemilia.Interaction#getUtilDistr <em>Util Distr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Util Distr</em>'.
	 * @see mmaemilia.Interaction#getUtilDistr()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_UtilDistr();

	/**
	 * Returns the meta object for class '{@link mmaemilia.LocalInteraction <em>Local Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Interaction</em>'.
	 * @see mmaemilia.LocalInteraction
	 * @generated
	 */
	EClass getLocalInteraction();

	/**
	 * Returns the meta object for the attribute '{@link mmaemilia.LocalInteraction#getIntName <em>Int Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Name</em>'.
	 * @see mmaemilia.LocalInteraction#getIntName()
	 * @see #getLocalInteraction()
	 * @generated
	 */
	EAttribute getLocalInteraction_IntName();

	/**
	 * Returns the meta object for the attribute '{@link mmaemilia.LocalInteraction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mmaemilia.LocalInteraction#getType()
	 * @see #getLocalInteraction()
	 * @generated
	 */
	EAttribute getLocalInteraction_Type();

	/**
	 * Returns the meta object for class '{@link mmaemilia.ArchitecturalInteraction <em>Architectural Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architectural Interaction</em>'.
	 * @see mmaemilia.ArchitecturalInteraction
	 * @generated
	 */
	EClass getArchitecturalInteraction();

	/**
	 * Returns the meta object for the reference '{@link mmaemilia.ArchitecturalInteraction#getIs_A <em>Is A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is A</em>'.
	 * @see mmaemilia.ArchitecturalInteraction#getIs_A()
	 * @see #getArchitecturalInteraction()
	 * @generated
	 */
	EReference getArchitecturalInteraction_Is_A();

	/**
	 * Returns the meta object for the attribute '{@link mmaemilia.ArchitecturalInteraction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mmaemilia.ArchitecturalInteraction#getName()
	 * @see #getArchitecturalInteraction()
	 * @generated
	 */
	EAttribute getArchitecturalInteraction_Name();

	/**
	 * Returns the meta object for the reference '{@link mmaemilia.ArchitecturalInteraction#getFromInstance <em>From Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Instance</em>'.
	 * @see mmaemilia.ArchitecturalInteraction#getFromInstance()
	 * @see #getArchitecturalInteraction()
	 * @generated
	 */
	EReference getArchitecturalInteraction_FromInstance();

	/**
	 * Returns the meta object for class '{@link mmaemilia.InputInteraction <em>Input Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Interaction</em>'.
	 * @see mmaemilia.InputInteraction
	 * @generated
	 */
	EClass getInputInteraction();

	/**
	 * Returns the meta object for class '{@link mmaemilia.OutputInteraction <em>Output Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Interaction</em>'.
	 * @see mmaemilia.OutputInteraction
	 * @generated
	 */
	EClass getOutputInteraction();

	/**
	 * Returns the meta object for class '{@link mmaemilia.ArchiElemInstance <em>Archi Elem Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archi Elem Instance</em>'.
	 * @see mmaemilia.ArchiElemInstance
	 * @generated
	 */
	EClass getArchiElemInstance();

	/**
	 * Returns the meta object for the attribute '{@link mmaemilia.ArchiElemInstance#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see mmaemilia.ArchiElemInstance#getInstanceName()
	 * @see #getArchiElemInstance()
	 * @generated
	 */
	EAttribute getArchiElemInstance_InstanceName();

	/**
	 * Returns the meta object for the attribute list '{@link mmaemilia.ArchiElemInstance#getActualParam <em>Actual Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Actual Param</em>'.
	 * @see mmaemilia.ArchiElemInstance#getActualParam()
	 * @see #getArchiElemInstance()
	 * @generated
	 */
	EAttribute getArchiElemInstance_ActualParam();

	/**
	 * Returns the meta object for the reference '{@link mmaemilia.ArchiElemInstance#getTypeOf <em>Type Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Of</em>'.
	 * @see mmaemilia.ArchiElemInstance#getTypeOf()
	 * @see #getArchiElemInstance()
	 * @generated
	 */
	EReference getArchiElemInstance_TypeOf();

	/**
	 * Returns the meta object for the attribute '{@link mmaemilia.ArchiElemInstance#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see mmaemilia.ArchiElemInstance#getThroughput()
	 * @see #getArchiElemInstance()
	 * @generated
	 */
	EAttribute getArchiElemInstance_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link mmaemilia.ArchiElemInstance#getUtilization <em>Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilization</em>'.
	 * @see mmaemilia.ArchiElemInstance#getUtilization()
	 * @see #getArchiElemInstance()
	 * @generated
	 */
	EAttribute getArchiElemInstance_Utilization();

	/**
	 * Returns the meta object for the attribute '{@link mmaemilia.ArchiElemInstance#getResponseTime <em>Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Time</em>'.
	 * @see mmaemilia.ArchiElemInstance#getResponseTime()
	 * @see #getArchiElemInstance()
	 * @generated
	 */
	EAttribute getArchiElemInstance_ResponseTime();

	/**
	 * Returns the meta object for the attribute list '{@link mmaemilia.ArchiElemInstance#getInstanceUtilDistr <em>Instance Util Distr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Instance Util Distr</em>'.
	 * @see mmaemilia.ArchiElemInstance#getInstanceUtilDistr()
	 * @see #getArchiElemInstance()
	 * @generated
	 */
	EAttribute getArchiElemInstance_InstanceUtilDistr();

	/**
	 * Returns the meta object for the attribute list '{@link mmaemilia.ArchiElemInstance#getInstanceThDistr <em>Instance Th Distr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Instance Th Distr</em>'.
	 * @see mmaemilia.ArchiElemInstance#getInstanceThDistr()
	 * @see #getArchiElemInstance()
	 * @generated
	 */
	EAttribute getArchiElemInstance_InstanceThDistr();

	/**
	 * Returns the meta object for the attribute list '{@link mmaemilia.ArchiElemInstance#getInstanceResTimeDistr <em>Instance Res Time Distr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Instance Res Time Distr</em>'.
	 * @see mmaemilia.ArchiElemInstance#getInstanceResTimeDistr()
	 * @see #getArchiElemInstance()
	 * @generated
	 */
	EAttribute getArchiElemInstance_InstanceResTimeDistr();

	/**
	 * Returns the meta object for class '{@link mmaemilia.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see mmaemilia.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.Attachment#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see mmaemilia.Attachment#getEnd()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_End();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.Attachment#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see mmaemilia.Attachment#getStart()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Start();

	/**
	 * Returns the meta object for class '{@link mmaemilia.ElemType <em>Elem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elem Type</em>'.
	 * @see mmaemilia.ElemType
	 * @generated
	 */
	EClass getElemType();

	/**
	 * Returns the meta object for the containment reference list '{@link mmaemilia.ElemType#getIiDecl <em>Ii Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ii Decl</em>'.
	 * @see mmaemilia.ElemType#getIiDecl()
	 * @see #getElemType()
	 * @generated
	 */
	EReference getElemType_IiDecl();

	/**
	 * Returns the meta object for the containment reference list '{@link mmaemilia.ElemType#getOiDecl <em>Oi Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Oi Decl</em>'.
	 * @see mmaemilia.ElemType#getOiDecl()
	 * @see #getElemType()
	 * @generated
	 */
	EReference getElemType_OiDecl();

	/**
	 * Returns the meta object for the attribute '{@link mmaemilia.ElemType#getEtName <em>Et Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Et Name</em>'.
	 * @see mmaemilia.ElemType#getEtName()
	 * @see #getElemType()
	 * @generated
	 */
	EAttribute getElemType_EtName();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.ElemType#getElemHeader <em>Elem Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elem Header</em>'.
	 * @see mmaemilia.ElemType#getElemHeader()
	 * @see #getElemType()
	 * @generated
	 */
	EReference getElemType_ElemHeader();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.ElemType#getBehaviorDecl <em>Behavior Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behavior Decl</em>'.
	 * @see mmaemilia.ElemType#getBehaviorDecl()
	 * @see #getElemType()
	 * @generated
	 */
	EReference getElemType_BehaviorDecl();

	/**
	 * Returns the meta object for class '{@link mmaemilia.To <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To</em>'.
	 * @see mmaemilia.To
	 * @generated
	 */
	EClass getTo();

	/**
	 * Returns the meta object for the reference '{@link mmaemilia.To#getToInstance <em>To Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Instance</em>'.
	 * @see mmaemilia.To#getToInstance()
	 * @see #getTo()
	 * @generated
	 */
	EReference getTo_ToInstance();

	/**
	 * Returns the meta object for the reference '{@link mmaemilia.To#getIsInput <em>Is Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Input</em>'.
	 * @see mmaemilia.To#getIsInput()
	 * @see #getTo()
	 * @generated
	 */
	EReference getTo_IsInput();

	/**
	 * Returns the meta object for class '{@link mmaemilia.From <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From</em>'.
	 * @see mmaemilia.From
	 * @generated
	 */
	EClass getFrom();

	/**
	 * Returns the meta object for the reference '{@link mmaemilia.From#getFromInstance <em>From Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Instance</em>'.
	 * @see mmaemilia.From#getFromInstance()
	 * @see #getFrom()
	 * @generated
	 */
	EReference getFrom_FromInstance();

	/**
	 * Returns the meta object for the reference '{@link mmaemilia.From#getIsOutput <em>Is Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Output</em>'.
	 * @see mmaemilia.From#getIsOutput()
	 * @see #getFrom()
	 * @generated
	 */
	EReference getFrom_IsOutput();

	/**
	 * Returns the meta object for enum '{@link mmaemilia.InteractionType <em>Interaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interaction Type</em>'.
	 * @see mmaemilia.InteractionType
	 * @generated
	 */
	EEnum getInteractionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MmaemiliaFactory getMmaemiliaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mmaemilia.impl.AEmiliaSpecificationImpl <em>AEmilia Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.impl.AEmiliaSpecificationImpl
		 * @see mmaemilia.impl.MmaemiliaPackageImpl#getAEmiliaSpecification()
		 * @generated
		 */
		EClass AEMILIA_SPECIFICATION = eINSTANCE.getAEmiliaSpecification();

		/**
		 * The meta object literal for the '<em><b>Archi Type Decl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_SPECIFICATION__ARCHI_TYPE_DECL = eINSTANCE.getAEmiliaSpecification_ArchiTypeDecl();

		/**
		 * The meta object literal for the '{@link mmaemilia.impl.ArchiTypeImpl <em>Archi Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.impl.ArchiTypeImpl
		 * @see mmaemilia.impl.MmaemiliaPackageImpl#getArchiType()
		 * @generated
		 */
		EClass ARCHI_TYPE = eINSTANCE.getArchiType();

		/**
		 * The meta object literal for the '<em><b>Aet Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHI_TYPE__AET_DECLARATION = eINSTANCE.getArchiType_AetDeclaration();

		/**
		 * The meta object literal for the '<em><b>At Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHI_TYPE__AT_DECLARATION = eINSTANCE.getArchiType_AtDeclaration();

		/**
		 * The meta object literal for the '<em><b>At Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHI_TYPE__AT_NAME = eINSTANCE.getArchiType_AtName();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHI_TYPE__HEADER = eINSTANCE.getArchiType_Header();

		/**
		 * The meta object literal for the '{@link mmaemilia.impl.ArchiElemTypesImpl <em>Archi Elem Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.impl.ArchiElemTypesImpl
		 * @see mmaemilia.impl.MmaemiliaPackageImpl#getArchiElemTypes()
		 * @generated
		 */
		EClass ARCHI_ELEM_TYPES = eINSTANCE.getArchiElemTypes();

		/**
		 * The meta object literal for the '<em><b>Et Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHI_ELEM_TYPES__ET_DECLARATION = eINSTANCE.getArchiElemTypes_EtDeclaration();

		/**
		 * The meta object literal for the '{@link mmaemilia.impl.ArchiTopologyImpl <em>Archi Topology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.impl.ArchiTopologyImpl
		 * @see mmaemilia.impl.MmaemiliaPackageImpl#getArchiTopology()
		 * @generated
		 */
		EClass ARCHI_TOPOLOGY = eINSTANCE.getArchiTopology();

		/**
		 * The meta object literal for the '<em><b>Aei Decl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHI_TOPOLOGY__AEI_DECL = eINSTANCE.getArchiTopology_AeiDecl();

		/**
		 * The meta object literal for the '<em><b>Att Decl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHI_TOPOLOGY__ATT_DECL = eINSTANCE.getArchiTopology_AttDecl();

		/**
		 * The meta object literal for the '<em><b>Ai Decl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHI_TOPOLOGY__AI_DECL = eINSTANCE.getArchiTopology_AiDecl();

		/**
		 * The meta object literal for the '{@link mmaemilia.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.impl.InteractionImpl
		 * @see mmaemilia.impl.MmaemiliaPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__THROUGHPUT = eINSTANCE.getInteraction_Throughput();

		/**
		 * The meta object literal for the '<em><b>Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__UTILIZATION = eINSTANCE.getInteraction_Utilization();

		/**
		 * The meta object literal for the '<em><b>Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__RESPONSE_TIME = eINSTANCE.getInteraction_ResponseTime();

		/**
		 * The meta object literal for the '<em><b>Throughtput Distr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__THROUGHTPUT_DISTR = eINSTANCE.getInteraction_ThroughtputDistr();

		/**
		 * The meta object literal for the '<em><b>Resp Time Distr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__RESP_TIME_DISTR = eINSTANCE.getInteraction_RespTimeDistr();

		/**
		 * The meta object literal for the '<em><b>Util Distr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__UTIL_DISTR = eINSTANCE.getInteraction_UtilDistr();

		/**
		 * The meta object literal for the '{@link mmaemilia.impl.LocalInteractionImpl <em>Local Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.impl.LocalInteractionImpl
		 * @see mmaemilia.impl.MmaemiliaPackageImpl#getLocalInteraction()
		 * @generated
		 */
		EClass LOCAL_INTERACTION = eINSTANCE.getLocalInteraction();

		/**
		 * The meta object literal for the '<em><b>Int Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_INTERACTION__INT_NAME = eINSTANCE.getLocalInteraction_IntName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_INTERACTION__TYPE = eINSTANCE.getLocalInteraction_Type();

		/**
		 * The meta object literal for the '{@link mmaemilia.impl.ArchitecturalInteractionImpl <em>Architectural Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.impl.ArchitecturalInteractionImpl
		 * @see mmaemilia.impl.MmaemiliaPackageImpl#getArchitecturalInteraction()
		 * @generated
		 */
		EClass ARCHITECTURAL_INTERACTION = eINSTANCE.getArchitecturalInteraction();

		/**
		 * The meta object literal for the '<em><b>Is A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_INTERACTION__IS_A = eINSTANCE.getArchitecturalInteraction_Is_A();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURAL_INTERACTION__NAME = eINSTANCE.getArchitecturalInteraction_Name();

		/**
		 * The meta object literal for the '<em><b>From Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_INTERACTION__FROM_INSTANCE = eINSTANCE.getArchitecturalInteraction_FromInstance();

		/**
		 * The meta object literal for the '{@link mmaemilia.impl.InputInteractionImpl <em>Input Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.impl.InputInteractionImpl
		 * @see mmaemilia.impl.MmaemiliaPackageImpl#getInputInteraction()
		 * @generated
		 */
		EClass INPUT_INTERACTION = eINSTANCE.getInputInteraction();

		/**
		 * The meta object literal for the '{@link mmaemilia.impl.OutputInteractionImpl <em>Output Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.impl.OutputInteractionImpl
		 * @see mmaemilia.impl.MmaemiliaPackageImpl#getOutputInteraction()
		 * @generated
		 */
		EClass OUTPUT_INTERACTION = eINSTANCE.getOutputInteraction();

		/**
		 * The meta object literal for the '{@link mmaemilia.impl.ArchiElemInstanceImpl <em>Archi Elem Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.impl.ArchiElemInstanceImpl
		 * @see mmaemilia.impl.MmaemiliaPackageImpl#getArchiElemInstance()
		 * @generated
		 */
		EClass ARCHI_ELEM_INSTANCE = eINSTANCE.getArchiElemInstance();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHI_ELEM_INSTANCE__INSTANCE_NAME = eINSTANCE.getArchiElemInstance_InstanceName();

		/**
		 * The meta object literal for the '<em><b>Actual Param</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHI_ELEM_INSTANCE__ACTUAL_PARAM = eINSTANCE.getArchiElemInstance_ActualParam();

		/**
		 * The meta object literal for the '<em><b>Type Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHI_ELEM_INSTANCE__TYPE_OF = eINSTANCE.getArchiElemInstance_TypeOf();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHI_ELEM_INSTANCE__THROUGHPUT = eINSTANCE.getArchiElemInstance_Throughput();

		/**
		 * The meta object literal for the '<em><b>Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHI_ELEM_INSTANCE__UTILIZATION = eINSTANCE.getArchiElemInstance_Utilization();

		/**
		 * The meta object literal for the '<em><b>Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHI_ELEM_INSTANCE__RESPONSE_TIME = eINSTANCE.getArchiElemInstance_ResponseTime();

		/**
		 * The meta object literal for the '<em><b>Instance Util Distr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHI_ELEM_INSTANCE__INSTANCE_UTIL_DISTR = eINSTANCE.getArchiElemInstance_InstanceUtilDistr();

		/**
		 * The meta object literal for the '<em><b>Instance Th Distr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHI_ELEM_INSTANCE__INSTANCE_TH_DISTR = eINSTANCE.getArchiElemInstance_InstanceThDistr();

		/**
		 * The meta object literal for the '<em><b>Instance Res Time Distr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHI_ELEM_INSTANCE__INSTANCE_RES_TIME_DISTR = eINSTANCE.getArchiElemInstance_InstanceResTimeDistr();

		/**
		 * The meta object literal for the '{@link mmaemilia.impl.AttachmentImpl <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.impl.AttachmentImpl
		 * @see mmaemilia.impl.MmaemiliaPackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__END = eINSTANCE.getAttachment_End();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__START = eINSTANCE.getAttachment_Start();

		/**
		 * The meta object literal for the '{@link mmaemilia.impl.ElemTypeImpl <em>Elem Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.impl.ElemTypeImpl
		 * @see mmaemilia.impl.MmaemiliaPackageImpl#getElemType()
		 * @generated
		 */
		EClass ELEM_TYPE = eINSTANCE.getElemType();

		/**
		 * The meta object literal for the '<em><b>Ii Decl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEM_TYPE__II_DECL = eINSTANCE.getElemType_IiDecl();

		/**
		 * The meta object literal for the '<em><b>Oi Decl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEM_TYPE__OI_DECL = eINSTANCE.getElemType_OiDecl();

		/**
		 * The meta object literal for the '<em><b>Et Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEM_TYPE__ET_NAME = eINSTANCE.getElemType_EtName();

		/**
		 * The meta object literal for the '<em><b>Elem Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEM_TYPE__ELEM_HEADER = eINSTANCE.getElemType_ElemHeader();

		/**
		 * The meta object literal for the '<em><b>Behavior Decl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEM_TYPE__BEHAVIOR_DECL = eINSTANCE.getElemType_BehaviorDecl();

		/**
		 * The meta object literal for the '{@link mmaemilia.impl.ToImpl <em>To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.impl.ToImpl
		 * @see mmaemilia.impl.MmaemiliaPackageImpl#getTo()
		 * @generated
		 */
		EClass TO = eINSTANCE.getTo();

		/**
		 * The meta object literal for the '<em><b>To Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO__TO_INSTANCE = eINSTANCE.getTo_ToInstance();

		/**
		 * The meta object literal for the '<em><b>Is Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO__IS_INPUT = eINSTANCE.getTo_IsInput();

		/**
		 * The meta object literal for the '{@link mmaemilia.impl.FromImpl <em>From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.impl.FromImpl
		 * @see mmaemilia.impl.MmaemiliaPackageImpl#getFrom()
		 * @generated
		 */
		EClass FROM = eINSTANCE.getFrom();

		/**
		 * The meta object literal for the '<em><b>From Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM__FROM_INSTANCE = eINSTANCE.getFrom_FromInstance();

		/**
		 * The meta object literal for the '<em><b>Is Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM__IS_OUTPUT = eINSTANCE.getFrom_IsOutput();

		/**
		 * The meta object literal for the '{@link mmaemilia.InteractionType <em>Interaction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.InteractionType
		 * @see mmaemilia.impl.MmaemiliaPackageImpl#getInteractionType()
		 * @generated
		 */
		EEnum INTERACTION_TYPE = eINSTANCE.getInteractionType();

	}

} //MmaemiliaPackage
