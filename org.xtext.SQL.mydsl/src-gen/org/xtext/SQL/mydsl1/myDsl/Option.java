/**
 */
package org.xtext.SQL.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.Option#getWhere <em>Where</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.SQL.mydsl1.myDsl.MyDslPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends EObject
{
  /**
   * Returns the value of the '<em><b>Where</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.SQL.mydsl1.myDsl.Where}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where</em>' containment reference list.
   * @see org.xtext.SQL.mydsl1.myDsl.MyDslPackage#getOption_Where()
   * @model containment="true"
   * @generated
   */
  EList<Where> getWhere();

} // Option
