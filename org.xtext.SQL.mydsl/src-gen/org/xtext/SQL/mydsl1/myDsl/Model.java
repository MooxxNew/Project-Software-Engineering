/**
 */
package org.xtext.SQL.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.Model#getSelects <em>Selects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.SQL.mydsl1.myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Selects</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.SQL.mydsl1.myDsl.Select}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selects</em>' containment reference list.
   * @see org.xtext.SQL.mydsl1.myDsl.MyDslPackage#getModel_Selects()
   * @model containment="true"
   * @generated
   */
  EList<Select> getSelects();

} // Model
