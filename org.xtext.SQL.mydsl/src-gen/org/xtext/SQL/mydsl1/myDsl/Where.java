/**
 */
package org.xtext.SQL.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.Where#getExprs <em>Exprs</em>}</li>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.Where#getAnd <em>And</em>}</li>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.Where#getOr <em>Or</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.SQL.mydsl1.myDsl.MyDslPackage#getWhere()
 * @model
 * @generated
 */
public interface Where extends EObject
{
  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.SQL.mydsl1.myDsl.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference list.
   * @see org.xtext.SQL.mydsl1.myDsl.MyDslPackage#getWhere_Exprs()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExprs();

  /**
   * Returns the value of the '<em><b>And</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.SQL.mydsl1.myDsl.AND}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>And</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>And</em>' containment reference list.
   * @see org.xtext.SQL.mydsl1.myDsl.MyDslPackage#getWhere_And()
   * @model containment="true"
   * @generated
   */
  EList<AND> getAnd();

  /**
   * Returns the value of the '<em><b>Or</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.SQL.mydsl1.myDsl.OR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Or</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Or</em>' containment reference list.
   * @see org.xtext.SQL.mydsl1.myDsl.MyDslPackage#getWhere_Or()
   * @model containment="true"
   * @generated
   */
  EList<OR> getOr();

} // Where
