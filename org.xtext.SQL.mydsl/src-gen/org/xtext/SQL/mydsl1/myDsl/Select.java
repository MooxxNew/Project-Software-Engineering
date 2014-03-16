/**
 */
package org.xtext.SQL.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.Select#getSelect_value <em>Select value</em>}</li>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.Select#getFroms_value <em>Froms value</em>}</li>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.Select#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.SQL.mydsl1.myDsl.MyDslPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends EObject
{
  /**
   * Returns the value of the '<em><b>Select value</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.SQL.mydsl1.myDsl.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select value</em>' containment reference list.
   * @see org.xtext.SQL.mydsl1.myDsl.MyDslPackage#getSelect_Select_value()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getSelect_value();

  /**
   * Returns the value of the '<em><b>Froms value</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.SQL.mydsl1.myDsl.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Froms value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Froms value</em>' containment reference list.
   * @see org.xtext.SQL.mydsl1.myDsl.MyDslPackage#getSelect_Froms_value()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getFroms_value();

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.SQL.mydsl1.myDsl.Option}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see org.xtext.SQL.mydsl1.myDsl.MyDslPackage#getSelect_Options()
   * @model containment="true"
   * @generated
   */
  EList<Option> getOptions();

} // Select
