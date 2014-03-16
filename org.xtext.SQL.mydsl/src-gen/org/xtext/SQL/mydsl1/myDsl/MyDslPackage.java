/**
 */
package org.xtext.SQL.mydsl1.myDsl;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.SQL.mydsl1.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/SQL/mydsl1/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.SQL.mydsl1.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.SQL.mydsl1.myDsl.impl.ModelImpl
   * @see org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Selects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SELECTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.SQL.mydsl1.myDsl.impl.SelectImpl <em>Select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.SQL.mydsl1.myDsl.impl.SelectImpl
   * @see org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl#getSelect()
   * @generated
   */
  int SELECT = 1;

  /**
   * The feature id for the '<em><b>Select value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__SELECT_VALUE = 0;

  /**
   * The feature id for the '<em><b>Froms value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__FROMS_VALUE = 1;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__OPTIONS = 2;

  /**
   * The number of structural features of the '<em>Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.SQL.mydsl1.myDsl.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.SQL.mydsl1.myDsl.impl.VariableImpl
   * @see org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 2;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VALUES = 0;

  /**
   * The feature id for the '<em><b>Values1</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VALUES1 = 1;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.SQL.mydsl1.myDsl.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.SQL.mydsl1.myDsl.impl.ValueImpl
   * @see org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl#getValue()
   * @generated
   */
  int VALUE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__NAME = 0;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.SQL.mydsl1.myDsl.impl.OptionImpl <em>Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.SQL.mydsl1.myDsl.impl.OptionImpl
   * @see org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl#getOption()
   * @generated
   */
  int OPTION = 4;

  /**
   * The feature id for the '<em><b>Where</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__WHERE = 0;

  /**
   * The number of structural features of the '<em>Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.SQL.mydsl1.myDsl.impl.WhereImpl <em>Where</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.SQL.mydsl1.myDsl.impl.WhereImpl
   * @see org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl#getWhere()
   * @generated
   */
  int WHERE = 5;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE__EXPRS = 0;

  /**
   * The feature id for the '<em><b>And</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE__AND = 1;

  /**
   * The feature id for the '<em><b>Or</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE__OR = 2;

  /**
   * The number of structural features of the '<em>Where</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.SQL.mydsl1.myDsl.impl.ANDImpl <em>AND</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.SQL.mydsl1.myDsl.impl.ANDImpl
   * @see org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl#getAND()
   * @generated
   */
  int AND = 7;

  /**
   * The number of structural features of the '<em>AND</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.SQL.mydsl1.myDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.SQL.mydsl1.myDsl.impl.ExpressionImpl
   * @see org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 6;

  /**
   * The feature id for the '<em><b>Column</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__COLUMN = AND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RESULT = AND_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>And</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__AND = AND_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Or</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OR = AND_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = AND_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.SQL.mydsl1.myDsl.impl.ORImpl <em>OR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.SQL.mydsl1.myDsl.impl.ORImpl
   * @see org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl#getOR()
   * @generated
   */
  int OR = 8;

  /**
   * The number of structural features of the '<em>OR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = 0;


  /**
   * Returns the meta object for class '{@link org.xtext.SQL.mydsl1.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.SQL.mydsl1.myDsl.Model#getSelects <em>Selects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Selects</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Model#getSelects()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Selects();

  /**
   * Returns the meta object for class '{@link org.xtext.SQL.mydsl1.myDsl.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Select
   * @generated
   */
  EClass getSelect();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.SQL.mydsl1.myDsl.Select#getSelect_value <em>Select value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Select value</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Select#getSelect_value()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_Select_value();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.SQL.mydsl1.myDsl.Select#getFroms_value <em>Froms value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Froms value</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Select#getFroms_value()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_Froms_value();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.SQL.mydsl1.myDsl.Select#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Select#getOptions()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_Options();

  /**
   * Returns the meta object for class '{@link org.xtext.SQL.mydsl1.myDsl.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.SQL.mydsl1.myDsl.Variable#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Variable#getValues()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Values();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.SQL.mydsl1.myDsl.Variable#getValues1 <em>Values1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values1</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Variable#getValues1()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Values1();

  /**
   * Returns the meta object for class '{@link org.xtext.SQL.mydsl1.myDsl.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.SQL.mydsl1.myDsl.Value#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Value#getName()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.SQL.mydsl1.myDsl.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Option
   * @generated
   */
  EClass getOption();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.SQL.mydsl1.myDsl.Option#getWhere <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Where</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Option#getWhere()
   * @see #getOption()
   * @generated
   */
  EReference getOption_Where();

  /**
   * Returns the meta object for class '{@link org.xtext.SQL.mydsl1.myDsl.Where <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Where</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Where
   * @generated
   */
  EClass getWhere();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.SQL.mydsl1.myDsl.Where#getExprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exprs</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Where#getExprs()
   * @see #getWhere()
   * @generated
   */
  EReference getWhere_Exprs();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.SQL.mydsl1.myDsl.Where#getAnd <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>And</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Where#getAnd()
   * @see #getWhere()
   * @generated
   */
  EReference getWhere_And();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.SQL.mydsl1.myDsl.Where#getOr <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Or</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Where#getOr()
   * @see #getWhere()
   * @generated
   */
  EReference getWhere_Or();

  /**
   * Returns the meta object for class '{@link org.xtext.SQL.mydsl1.myDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.SQL.mydsl1.myDsl.Expression#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Column</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Expression#getColumn()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Column();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.SQL.mydsl1.myDsl.Expression#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Result</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Expression#getResult()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Result();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.SQL.mydsl1.myDsl.Expression#getAnd <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>And</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Expression#getAnd()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_And();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.SQL.mydsl1.myDsl.Expression#getOr <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Or</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.Expression#getOr()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Or();

  /**
   * Returns the meta object for class '{@link org.xtext.SQL.mydsl1.myDsl.AND <em>AND</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AND</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.AND
   * @generated
   */
  EClass getAND();

  /**
   * Returns the meta object for class '{@link org.xtext.SQL.mydsl1.myDsl.OR <em>OR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OR</em>'.
   * @see org.xtext.SQL.mydsl1.myDsl.OR
   * @generated
   */
  EClass getOR();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.SQL.mydsl1.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.SQL.mydsl1.myDsl.impl.ModelImpl
     * @see org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Selects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SELECTS = eINSTANCE.getModel_Selects();

    /**
     * The meta object literal for the '{@link org.xtext.SQL.mydsl1.myDsl.impl.SelectImpl <em>Select</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.SQL.mydsl1.myDsl.impl.SelectImpl
     * @see org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl#getSelect()
     * @generated
     */
    EClass SELECT = eINSTANCE.getSelect();

    /**
     * The meta object literal for the '<em><b>Select value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__SELECT_VALUE = eINSTANCE.getSelect_Select_value();

    /**
     * The meta object literal for the '<em><b>Froms value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__FROMS_VALUE = eINSTANCE.getSelect_Froms_value();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__OPTIONS = eINSTANCE.getSelect_Options();

    /**
     * The meta object literal for the '{@link org.xtext.SQL.mydsl1.myDsl.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.SQL.mydsl1.myDsl.impl.VariableImpl
     * @see org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__VALUES = eINSTANCE.getVariable_Values();

    /**
     * The meta object literal for the '<em><b>Values1</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__VALUES1 = eINSTANCE.getVariable_Values1();

    /**
     * The meta object literal for the '{@link org.xtext.SQL.mydsl1.myDsl.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.SQL.mydsl1.myDsl.impl.ValueImpl
     * @see org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__NAME = eINSTANCE.getValue_Name();

    /**
     * The meta object literal for the '{@link org.xtext.SQL.mydsl1.myDsl.impl.OptionImpl <em>Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.SQL.mydsl1.myDsl.impl.OptionImpl
     * @see org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl#getOption()
     * @generated
     */
    EClass OPTION = eINSTANCE.getOption();

    /**
     * The meta object literal for the '<em><b>Where</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTION__WHERE = eINSTANCE.getOption_Where();

    /**
     * The meta object literal for the '{@link org.xtext.SQL.mydsl1.myDsl.impl.WhereImpl <em>Where</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.SQL.mydsl1.myDsl.impl.WhereImpl
     * @see org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl#getWhere()
     * @generated
     */
    EClass WHERE = eINSTANCE.getWhere();

    /**
     * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE__EXPRS = eINSTANCE.getWhere_Exprs();

    /**
     * The meta object literal for the '<em><b>And</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE__AND = eINSTANCE.getWhere_And();

    /**
     * The meta object literal for the '<em><b>Or</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE__OR = eINSTANCE.getWhere_Or();

    /**
     * The meta object literal for the '{@link org.xtext.SQL.mydsl1.myDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.SQL.mydsl1.myDsl.impl.ExpressionImpl
     * @see org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Column</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__COLUMN = eINSTANCE.getExpression_Column();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RESULT = eINSTANCE.getExpression_Result();

    /**
     * The meta object literal for the '<em><b>And</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__AND = eINSTANCE.getExpression_And();

    /**
     * The meta object literal for the '<em><b>Or</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__OR = eINSTANCE.getExpression_Or();

    /**
     * The meta object literal for the '{@link org.xtext.SQL.mydsl1.myDsl.impl.ANDImpl <em>AND</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.SQL.mydsl1.myDsl.impl.ANDImpl
     * @see org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl#getAND()
     * @generated
     */
    EClass AND = eINSTANCE.getAND();

    /**
     * The meta object literal for the '{@link org.xtext.SQL.mydsl1.myDsl.impl.ORImpl <em>OR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.SQL.mydsl1.myDsl.impl.ORImpl
     * @see org.xtext.SQL.mydsl1.myDsl.impl.MyDslPackageImpl#getOR()
     * @generated
     */
    EClass OR = eINSTANCE.getOR();

  }

} //MyDslPackage
