/**
 */
package mmaemilia.DataType;

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
 * @see mmaemilia.DataType.DataTypeFactory
 * @model kind="package"
 * @generated
 */
public interface DataTypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataType";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://datatype.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DataType";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataTypePackage eINSTANCE = mmaemilia.DataType.impl.DataTypePackageImpl.init();

	/**
	 * The meta object id for the '{@link mmaemilia.DataType.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.DataType.impl.DataTypeImpl
	 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.DataType.impl.NormalImpl <em>Normal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.DataType.impl.NormalImpl
	 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getNormal()
	 * @generated
	 */
	int NORMAL = 1;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__VAR = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Normal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Normal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmaemilia.DataType.impl.SpecialImpl <em>Special</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.DataType.impl.SpecialImpl
	 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getSpecial()
	 * @generated
	 */
	int SPECIAL = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Special</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Special</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmaemilia.DataType.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.DataType.impl.IntegerImpl
	 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 3;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__VAR = NORMAL__VAR;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = NORMAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = NORMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmaemilia.DataType.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.DataType.impl.RecordImpl
	 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 4;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__VAR = NORMAL__VAR;

	/**
	 * The feature id for the '<em><b>Field decl seq</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__FIELD_DECL_SEQ = NORMAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = NORMAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_OPERATION_COUNT = NORMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmaemilia.DataType.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.DataType.impl.ArrayImpl
	 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 5;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__VAR = NORMAL__VAR;

	/**
	 * The feature id for the '<em><b>Array Elem Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__ARRAY_ELEM_TYPE = NORMAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__LENGTH = NORMAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = NORMAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = NORMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmaemilia.DataType.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.DataType.impl.ListImpl
	 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getList()
	 * @generated
	 */
	int LIST = 6;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VAR = NORMAL__VAR;

	/**
	 * The feature id for the '<em><b>List Elem Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LIST_ELEM_TYPE = NORMAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = NORMAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = NORMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmaemilia.DataType.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.DataType.impl.BooleanImpl
	 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 7;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__VAR = NORMAL__VAR;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = NORMAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = NORMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmaemilia.DataType.impl.RealImpl <em>Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.DataType.impl.RealImpl
	 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getReal()
	 * @generated
	 */
	int REAL = 8;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__VAR = NORMAL__VAR;

	/**
	 * The number of structural features of the '<em>Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_COUNT = NORMAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_OPERATION_COUNT = NORMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmaemilia.DataType.impl.RangeIntImpl <em>Range Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.DataType.impl.RangeIntImpl
	 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getRangeInt()
	 * @generated
	 */
	int RANGE_INT = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_INT__VAR = INTEGER__VAR;

	/**
	 * The feature id for the '<em><b>Max Val</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_INT__MAX_VAL = INTEGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Val</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_INT__MIN_VAL = INTEGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_INT__MIN_VAR = INTEGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_INT__MAX_VAR = INTEGER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Range Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_INT_FEATURE_COUNT = INTEGER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Range Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_INT_OPERATION_COUNT = INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmaemilia.DataType.SpecialType <em>Special Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.DataType.SpecialType
	 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getSpecialType()
	 * @generated
	 */
	int SPECIAL_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link mmaemilia.DataType.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see mmaemilia.DataType.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link mmaemilia.DataType.Normal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal</em>'.
	 * @see mmaemilia.DataType.Normal
	 * @generated
	 */
	EClass getNormal();

	/**
	 * Returns the meta object for the reference '{@link mmaemilia.DataType.Normal#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var</em>'.
	 * @see mmaemilia.DataType.Normal#getVar()
	 * @see #getNormal()
	 * @generated
	 */
	EReference getNormal_Var();

	/**
	 * Returns the meta object for class '{@link mmaemilia.DataType.Special <em>Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special</em>'.
	 * @see mmaemilia.DataType.Special
	 * @generated
	 */
	EClass getSpecial();

	/**
	 * Returns the meta object for the attribute '{@link mmaemilia.DataType.Special#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mmaemilia.DataType.Special#getType()
	 * @see #getSpecial()
	 * @generated
	 */
	EAttribute getSpecial_Type();

	/**
	 * Returns the meta object for class '{@link mmaemilia.DataType.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see mmaemilia.DataType.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for class '{@link mmaemilia.DataType.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see mmaemilia.DataType.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for the containment reference list '{@link mmaemilia.DataType.Record#getField_decl_seq <em>Field decl seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field decl seq</em>'.
	 * @see mmaemilia.DataType.Record#getField_decl_seq()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Field_decl_seq();

	/**
	 * Returns the meta object for class '{@link mmaemilia.DataType.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see mmaemilia.DataType.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.DataType.Array#getArrayElemType <em>Array Elem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array Elem Type</em>'.
	 * @see mmaemilia.DataType.Array#getArrayElemType()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_ArrayElemType();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.DataType.Array#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length</em>'.
	 * @see mmaemilia.DataType.Array#getLength()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Length();

	/**
	 * Returns the meta object for class '{@link mmaemilia.DataType.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see mmaemilia.DataType.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.DataType.List#getListElemType <em>List Elem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Elem Type</em>'.
	 * @see mmaemilia.DataType.List#getListElemType()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_ListElemType();

	/**
	 * Returns the meta object for class '{@link mmaemilia.DataType.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see mmaemilia.DataType.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link mmaemilia.DataType.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real</em>'.
	 * @see mmaemilia.DataType.Real
	 * @generated
	 */
	EClass getReal();

	/**
	 * Returns the meta object for class '{@link mmaemilia.DataType.RangeInt <em>Range Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Int</em>'.
	 * @see mmaemilia.DataType.RangeInt
	 * @generated
	 */
	EClass getRangeInt();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.DataType.RangeInt#getMaxVal <em>Max Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Val</em>'.
	 * @see mmaemilia.DataType.RangeInt#getMaxVal()
	 * @see #getRangeInt()
	 * @generated
	 */
	EReference getRangeInt_MaxVal();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.DataType.RangeInt#getMinVal <em>Min Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Val</em>'.
	 * @see mmaemilia.DataType.RangeInt#getMinVal()
	 * @see #getRangeInt()
	 * @generated
	 */
	EReference getRangeInt_MinVal();

	/**
	 * Returns the meta object for the reference '{@link mmaemilia.DataType.RangeInt#getMinVar <em>Min Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min Var</em>'.
	 * @see mmaemilia.DataType.RangeInt#getMinVar()
	 * @see #getRangeInt()
	 * @generated
	 */
	EReference getRangeInt_MinVar();

	/**
	 * Returns the meta object for the reference '{@link mmaemilia.DataType.RangeInt#getMaxVar <em>Max Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Var</em>'.
	 * @see mmaemilia.DataType.RangeInt#getMaxVar()
	 * @see #getRangeInt()
	 * @generated
	 */
	EReference getRangeInt_MaxVar();

	/**
	 * Returns the meta object for enum '{@link mmaemilia.DataType.SpecialType <em>Special Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Special Type</em>'.
	 * @see mmaemilia.DataType.SpecialType
	 * @generated
	 */
	EEnum getSpecialType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataTypeFactory getDataTypeFactory();

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
		 * The meta object literal for the '{@link mmaemilia.DataType.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.DataType.impl.DataTypeImpl
		 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link mmaemilia.DataType.impl.NormalImpl <em>Normal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.DataType.impl.NormalImpl
		 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getNormal()
		 * @generated
		 */
		EClass NORMAL = eINSTANCE.getNormal();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL__VAR = eINSTANCE.getNormal_Var();

		/**
		 * The meta object literal for the '{@link mmaemilia.DataType.impl.SpecialImpl <em>Special</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.DataType.impl.SpecialImpl
		 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getSpecial()
		 * @generated
		 */
		EClass SPECIAL = eINSTANCE.getSpecial();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL__TYPE = eINSTANCE.getSpecial_Type();

		/**
		 * The meta object literal for the '{@link mmaemilia.DataType.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.DataType.impl.IntegerImpl
		 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '{@link mmaemilia.DataType.impl.RecordImpl <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.DataType.impl.RecordImpl
		 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getRecord()
		 * @generated
		 */
		EClass RECORD = eINSTANCE.getRecord();

		/**
		 * The meta object literal for the '<em><b>Field decl seq</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__FIELD_DECL_SEQ = eINSTANCE.getRecord_Field_decl_seq();

		/**
		 * The meta object literal for the '{@link mmaemilia.DataType.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.DataType.impl.ArrayImpl
		 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Array Elem Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__ARRAY_ELEM_TYPE = eINSTANCE.getArray_ArrayElemType();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__LENGTH = eINSTANCE.getArray_Length();

		/**
		 * The meta object literal for the '{@link mmaemilia.DataType.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.DataType.impl.ListImpl
		 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>List Elem Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__LIST_ELEM_TYPE = eINSTANCE.getList_ListElemType();

		/**
		 * The meta object literal for the '{@link mmaemilia.DataType.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.DataType.impl.BooleanImpl
		 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link mmaemilia.DataType.impl.RealImpl <em>Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.DataType.impl.RealImpl
		 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getReal()
		 * @generated
		 */
		EClass REAL = eINSTANCE.getReal();

		/**
		 * The meta object literal for the '{@link mmaemilia.DataType.impl.RangeIntImpl <em>Range Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.DataType.impl.RangeIntImpl
		 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getRangeInt()
		 * @generated
		 */
		EClass RANGE_INT = eINSTANCE.getRangeInt();

		/**
		 * The meta object literal for the '<em><b>Max Val</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_INT__MAX_VAL = eINSTANCE.getRangeInt_MaxVal();

		/**
		 * The meta object literal for the '<em><b>Min Val</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_INT__MIN_VAL = eINSTANCE.getRangeInt_MinVal();

		/**
		 * The meta object literal for the '<em><b>Min Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_INT__MIN_VAR = eINSTANCE.getRangeInt_MinVar();

		/**
		 * The meta object literal for the '<em><b>Max Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_INT__MAX_VAR = eINSTANCE.getRangeInt_MaxVar();

		/**
		 * The meta object literal for the '{@link mmaemilia.DataType.SpecialType <em>Special Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.DataType.SpecialType
		 * @see mmaemilia.DataType.impl.DataTypePackageImpl#getSpecialType()
		 * @generated
		 */
		EEnum SPECIAL_TYPE = eINSTANCE.getSpecialType();

	}

} //DataTypePackage
