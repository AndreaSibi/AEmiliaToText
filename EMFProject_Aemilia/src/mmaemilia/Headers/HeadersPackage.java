/**
 */
package mmaemilia.Headers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see mmaemilia.Headers.HeadersFactory
 * @model kind="package"
 * @generated
 */
public interface HeadersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Headers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://headers.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Headers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HeadersPackage eINSTANCE = mmaemilia.Headers.impl.HeadersPackageImpl.init();

	/**
	 * The meta object id for the '{@link mmaemilia.Headers.impl.AT_HeaderImpl <em>AT Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.Headers.impl.AT_HeaderImpl
	 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getAT_Header()
	 * @generated
	 */
	int AT_HEADER = 0;

	/**
	 * The feature id for the '<em><b>Init Const</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_HEADER__INIT_CONST = 0;

	/**
	 * The number of structural features of the '<em>AT Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_HEADER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>AT Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.Headers.impl.ConstInitImpl <em>Const Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.Headers.impl.ConstInitImpl
	 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getConstInit()
	 * @generated
	 */
	int CONST_INIT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_INIT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Init Const Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_INIT__INIT_CONST_DATA = 1;

	/**
	 * The feature id for the '<em><b>Init Const Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_INIT__INIT_CONST_EXPR = 2;

	/**
	 * The number of structural features of the '<em>Const Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_INIT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Const Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_INIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.Headers.impl.ET_HeaderImpl <em>ET Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.Headers.impl.ET_HeaderImpl
	 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getET_Header()
	 * @generated
	 */
	int ET_HEADER = 2;

	/**
	 * The feature id for the '<em><b>Costant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ET_HEADER__COSTANT = 0;

	/**
	 * The number of structural features of the '<em>ET Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ET_HEADER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ET Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ET_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.Headers.impl.ConstImpl <em>Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.Headers.impl.ConstImpl
	 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getConst()
	 * @generated
	 */
	int CONST = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Constant Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST__CONSTANT_DATA = 1;

	/**
	 * The number of structural features of the '<em>Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.Headers.impl.BehavHeaderImpl <em>Behav Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.Headers.impl.BehavHeaderImpl
	 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getBehavHeader()
	 * @generated
	 */
	int BEHAV_HEADER = 4;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAV_HEADER__LEFT = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAV_HEADER__RIGHT = 1;

	/**
	 * The number of structural features of the '<em>Behav Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAV_HEADER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Behav Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAV_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.Headers.impl.LeftSideImpl <em>Left Side</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.Headers.impl.LeftSideImpl
	 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getLeftSide()
	 * @generated
	 */
	int LEFT_SIDE = 5;

	/**
	 * The feature id for the '<em><b>Init Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SIDE__INIT_VAR = 0;

	/**
	 * The feature id for the '<em><b>Var Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SIDE__VAR_DEF = 1;

	/**
	 * The number of structural features of the '<em>Left Side</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SIDE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Left Side</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_SIDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.Headers.impl.RightSideImpl <em>Right Side</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.Headers.impl.RightSideImpl
	 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getRightSide()
	 * @generated
	 */
	int RIGHT_SIDE = 6;

	/**
	 * The feature id for the '<em><b>Local Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SIDE__LOCAL_DEF = 0;

	/**
	 * The number of structural features of the '<em>Right Side</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SIDE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Right Side</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_SIDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.Headers.impl.VarInitImpl <em>Var Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.Headers.impl.VarInitImpl
	 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getVarInit()
	 * @generated
	 */
	int VAR_INIT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_INIT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Init Var Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_INIT__INIT_VAR_EXPR = 1;

	/**
	 * The feature id for the '<em><b>Init Var Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_INIT__INIT_VAR_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Var Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_INIT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Var Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_INIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.Headers.impl.VarImpl <em>Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.Headers.impl.VarImpl
	 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getVar()
	 * @generated
	 */
	int VAR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Var Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__VAR_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmaemilia.Headers.impl.LocalImpl <em>Local</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmaemilia.Headers.impl.LocalImpl
	 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getLocal()
	 * @generated
	 */
	int LOCAL = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Local Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL__LOCAL_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Local</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Local</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link mmaemilia.Headers.AT_Header <em>AT Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AT Header</em>'.
	 * @see mmaemilia.Headers.AT_Header
	 * @generated
	 */
	EClass getAT_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link mmaemilia.Headers.AT_Header#getInitConst <em>Init Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Const</em>'.
	 * @see mmaemilia.Headers.AT_Header#getInitConst()
	 * @see #getAT_Header()
	 * @generated
	 */
	EReference getAT_Header_InitConst();

	/**
	 * Returns the meta object for class '{@link mmaemilia.Headers.ConstInit <em>Const Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const Init</em>'.
	 * @see mmaemilia.Headers.ConstInit
	 * @generated
	 */
	EClass getConstInit();

	/**
	 * Returns the meta object for the attribute '{@link mmaemilia.Headers.ConstInit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mmaemilia.Headers.ConstInit#getName()
	 * @see #getConstInit()
	 * @generated
	 */
	EAttribute getConstInit_Name();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.Headers.ConstInit#getInitConstData <em>Init Const Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Const Data</em>'.
	 * @see mmaemilia.Headers.ConstInit#getInitConstData()
	 * @see #getConstInit()
	 * @generated
	 */
	EReference getConstInit_InitConstData();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.Headers.ConstInit#getInitConstExpr <em>Init Const Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Const Expr</em>'.
	 * @see mmaemilia.Headers.ConstInit#getInitConstExpr()
	 * @see #getConstInit()
	 * @generated
	 */
	EReference getConstInit_InitConstExpr();

	/**
	 * Returns the meta object for class '{@link mmaemilia.Headers.ET_Header <em>ET Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ET Header</em>'.
	 * @see mmaemilia.Headers.ET_Header
	 * @generated
	 */
	EClass getET_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link mmaemilia.Headers.ET_Header#getCostant <em>Costant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Costant</em>'.
	 * @see mmaemilia.Headers.ET_Header#getCostant()
	 * @see #getET_Header()
	 * @generated
	 */
	EReference getET_Header_Costant();

	/**
	 * Returns the meta object for class '{@link mmaemilia.Headers.Const <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const</em>'.
	 * @see mmaemilia.Headers.Const
	 * @generated
	 */
	EClass getConst();

	/**
	 * Returns the meta object for the attribute '{@link mmaemilia.Headers.Const#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mmaemilia.Headers.Const#getName()
	 * @see #getConst()
	 * @generated
	 */
	EAttribute getConst_Name();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.Headers.Const#getConstantData <em>Constant Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constant Data</em>'.
	 * @see mmaemilia.Headers.Const#getConstantData()
	 * @see #getConst()
	 * @generated
	 */
	EReference getConst_ConstantData();

	/**
	 * Returns the meta object for class '{@link mmaemilia.Headers.BehavHeader <em>Behav Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behav Header</em>'.
	 * @see mmaemilia.Headers.BehavHeader
	 * @generated
	 */
	EClass getBehavHeader();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.Headers.BehavHeader#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see mmaemilia.Headers.BehavHeader#getLeft()
	 * @see #getBehavHeader()
	 * @generated
	 */
	EReference getBehavHeader_Left();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.Headers.BehavHeader#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see mmaemilia.Headers.BehavHeader#getRight()
	 * @see #getBehavHeader()
	 * @generated
	 */
	EReference getBehavHeader_Right();

	/**
	 * Returns the meta object for class '{@link mmaemilia.Headers.LeftSide <em>Left Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Side</em>'.
	 * @see mmaemilia.Headers.LeftSide
	 * @generated
	 */
	EClass getLeftSide();

	/**
	 * Returns the meta object for the containment reference list '{@link mmaemilia.Headers.LeftSide#getInitVar <em>Init Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init Var</em>'.
	 * @see mmaemilia.Headers.LeftSide#getInitVar()
	 * @see #getLeftSide()
	 * @generated
	 */
	EReference getLeftSide_InitVar();

	/**
	 * Returns the meta object for the containment reference list '{@link mmaemilia.Headers.LeftSide#getVarDef <em>Var Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var Def</em>'.
	 * @see mmaemilia.Headers.LeftSide#getVarDef()
	 * @see #getLeftSide()
	 * @generated
	 */
	EReference getLeftSide_VarDef();

	/**
	 * Returns the meta object for class '{@link mmaemilia.Headers.RightSide <em>Right Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Side</em>'.
	 * @see mmaemilia.Headers.RightSide
	 * @generated
	 */
	EClass getRightSide();

	/**
	 * Returns the meta object for the containment reference list '{@link mmaemilia.Headers.RightSide#getLocalDef <em>Local Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Def</em>'.
	 * @see mmaemilia.Headers.RightSide#getLocalDef()
	 * @see #getRightSide()
	 * @generated
	 */
	EReference getRightSide_LocalDef();

	/**
	 * Returns the meta object for class '{@link mmaemilia.Headers.VarInit <em>Var Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Init</em>'.
	 * @see mmaemilia.Headers.VarInit
	 * @generated
	 */
	EClass getVarInit();

	/**
	 * Returns the meta object for the attribute '{@link mmaemilia.Headers.VarInit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mmaemilia.Headers.VarInit#getName()
	 * @see #getVarInit()
	 * @generated
	 */
	EAttribute getVarInit_Name();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.Headers.VarInit#getInitVarExpr <em>Init Var Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Var Expr</em>'.
	 * @see mmaemilia.Headers.VarInit#getInitVarExpr()
	 * @see #getVarInit()
	 * @generated
	 */
	EReference getVarInit_InitVarExpr();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.Headers.VarInit#getInitVarType <em>Init Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Var Type</em>'.
	 * @see mmaemilia.Headers.VarInit#getInitVarType()
	 * @see #getVarInit()
	 * @generated
	 */
	EReference getVarInit_InitVarType();

	/**
	 * Returns the meta object for class '{@link mmaemilia.Headers.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var</em>'.
	 * @see mmaemilia.Headers.Var
	 * @generated
	 */
	EClass getVar();

	/**
	 * Returns the meta object for the attribute '{@link mmaemilia.Headers.Var#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mmaemilia.Headers.Var#getName()
	 * @see #getVar()
	 * @generated
	 */
	EAttribute getVar_Name();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.Headers.Var#getVarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var Type</em>'.
	 * @see mmaemilia.Headers.Var#getVarType()
	 * @see #getVar()
	 * @generated
	 */
	EReference getVar_VarType();

	/**
	 * Returns the meta object for class '{@link mmaemilia.Headers.Local <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local</em>'.
	 * @see mmaemilia.Headers.Local
	 * @generated
	 */
	EClass getLocal();

	/**
	 * Returns the meta object for the attribute '{@link mmaemilia.Headers.Local#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mmaemilia.Headers.Local#getName()
	 * @see #getLocal()
	 * @generated
	 */
	EAttribute getLocal_Name();

	/**
	 * Returns the meta object for the containment reference '{@link mmaemilia.Headers.Local#getLocalType <em>Local Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Type</em>'.
	 * @see mmaemilia.Headers.Local#getLocalType()
	 * @see #getLocal()
	 * @generated
	 */
	EReference getLocal_LocalType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HeadersFactory getHeadersFactory();

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
		 * The meta object literal for the '{@link mmaemilia.Headers.impl.AT_HeaderImpl <em>AT Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.Headers.impl.AT_HeaderImpl
		 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getAT_Header()
		 * @generated
		 */
		EClass AT_HEADER = eINSTANCE.getAT_Header();

		/**
		 * The meta object literal for the '<em><b>Init Const</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AT_HEADER__INIT_CONST = eINSTANCE.getAT_Header_InitConst();

		/**
		 * The meta object literal for the '{@link mmaemilia.Headers.impl.ConstInitImpl <em>Const Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.Headers.impl.ConstInitImpl
		 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getConstInit()
		 * @generated
		 */
		EClass CONST_INIT = eINSTANCE.getConstInit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONST_INIT__NAME = eINSTANCE.getConstInit_Name();

		/**
		 * The meta object literal for the '<em><b>Init Const Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONST_INIT__INIT_CONST_DATA = eINSTANCE.getConstInit_InitConstData();

		/**
		 * The meta object literal for the '<em><b>Init Const Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONST_INIT__INIT_CONST_EXPR = eINSTANCE.getConstInit_InitConstExpr();

		/**
		 * The meta object literal for the '{@link mmaemilia.Headers.impl.ET_HeaderImpl <em>ET Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.Headers.impl.ET_HeaderImpl
		 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getET_Header()
		 * @generated
		 */
		EClass ET_HEADER = eINSTANCE.getET_Header();

		/**
		 * The meta object literal for the '<em><b>Costant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ET_HEADER__COSTANT = eINSTANCE.getET_Header_Costant();

		/**
		 * The meta object literal for the '{@link mmaemilia.Headers.impl.ConstImpl <em>Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.Headers.impl.ConstImpl
		 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getConst()
		 * @generated
		 */
		EClass CONST = eINSTANCE.getConst();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONST__NAME = eINSTANCE.getConst_Name();

		/**
		 * The meta object literal for the '<em><b>Constant Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONST__CONSTANT_DATA = eINSTANCE.getConst_ConstantData();

		/**
		 * The meta object literal for the '{@link mmaemilia.Headers.impl.BehavHeaderImpl <em>Behav Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.Headers.impl.BehavHeaderImpl
		 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getBehavHeader()
		 * @generated
		 */
		EClass BEHAV_HEADER = eINSTANCE.getBehavHeader();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAV_HEADER__LEFT = eINSTANCE.getBehavHeader_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAV_HEADER__RIGHT = eINSTANCE.getBehavHeader_Right();

		/**
		 * The meta object literal for the '{@link mmaemilia.Headers.impl.LeftSideImpl <em>Left Side</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.Headers.impl.LeftSideImpl
		 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getLeftSide()
		 * @generated
		 */
		EClass LEFT_SIDE = eINSTANCE.getLeftSide();

		/**
		 * The meta object literal for the '<em><b>Init Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEFT_SIDE__INIT_VAR = eINSTANCE.getLeftSide_InitVar();

		/**
		 * The meta object literal for the '<em><b>Var Def</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEFT_SIDE__VAR_DEF = eINSTANCE.getLeftSide_VarDef();

		/**
		 * The meta object literal for the '{@link mmaemilia.Headers.impl.RightSideImpl <em>Right Side</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.Headers.impl.RightSideImpl
		 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getRightSide()
		 * @generated
		 */
		EClass RIGHT_SIDE = eINSTANCE.getRightSide();

		/**
		 * The meta object literal for the '<em><b>Local Def</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT_SIDE__LOCAL_DEF = eINSTANCE.getRightSide_LocalDef();

		/**
		 * The meta object literal for the '{@link mmaemilia.Headers.impl.VarInitImpl <em>Var Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.Headers.impl.VarInitImpl
		 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getVarInit()
		 * @generated
		 */
		EClass VAR_INIT = eINSTANCE.getVarInit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_INIT__NAME = eINSTANCE.getVarInit_Name();

		/**
		 * The meta object literal for the '<em><b>Init Var Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_INIT__INIT_VAR_EXPR = eINSTANCE.getVarInit_InitVarExpr();

		/**
		 * The meta object literal for the '<em><b>Init Var Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_INIT__INIT_VAR_TYPE = eINSTANCE.getVarInit_InitVarType();

		/**
		 * The meta object literal for the '{@link mmaemilia.Headers.impl.VarImpl <em>Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.Headers.impl.VarImpl
		 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getVar()
		 * @generated
		 */
		EClass VAR = eINSTANCE.getVar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR__NAME = eINSTANCE.getVar_Name();

		/**
		 * The meta object literal for the '<em><b>Var Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR__VAR_TYPE = eINSTANCE.getVar_VarType();

		/**
		 * The meta object literal for the '{@link mmaemilia.Headers.impl.LocalImpl <em>Local</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmaemilia.Headers.impl.LocalImpl
		 * @see mmaemilia.Headers.impl.HeadersPackageImpl#getLocal()
		 * @generated
		 */
		EClass LOCAL = eINSTANCE.getLocal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL__NAME = eINSTANCE.getLocal_Name();

		/**
		 * The meta object literal for the '<em><b>Local Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL__LOCAL_TYPE = eINSTANCE.getLocal_LocalType();

	}

} //HeadersPackage
