/**
 */
package org.xtext.SQL.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.Variable#getValues <em>Values</em>}</li>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.Variable#getValues1 <em>Values1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.SQL.mydsl1.myDsl.MyDslPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.SQL.mydsl1.myDsl.Value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.xtext.SQL.mydsl1.myDsl.MyDslPackage#getVariable_Values()
   * @model containment="true"
   * @generated
   */
  EList<Value> getValues();

  /**
   * Returns the value of the '<em><b>Values1</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.SQL.mydsl1.myDsl.Value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values1</em>' containment reference list.
   * @see org.xtext.SQL.mydsl1.myDsl.MyDslPackage#getVariable_Values1()
   * @model containment="true"
   * @generated
   */
  EList<Value> getValues1();

} // Variable
