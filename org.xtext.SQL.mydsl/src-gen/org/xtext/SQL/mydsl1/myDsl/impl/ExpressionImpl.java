/**
 */
package org.xtext.SQL.mydsl1.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.SQL.mydsl1.myDsl.AND;
import org.xtext.SQL.mydsl1.myDsl.Expression;
import org.xtext.SQL.mydsl1.myDsl.MyDslPackage;
import org.xtext.SQL.mydsl1.myDsl.OR;
import org.xtext.SQL.mydsl1.myDsl.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.impl.ExpressionImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.impl.ExpressionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.impl.ExpressionImpl#getAnd <em>And</em>}</li>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.impl.ExpressionImpl#getOr <em>Or</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends ANDImpl implements Expression
{
  /**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected EList<Value> column;

  /**
   * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected EList<Value> result;

  /**
   * The cached value of the '{@link #getAnd() <em>And</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnd()
   * @generated
   * @ordered
   */
  protected EList<AND> and;

  /**
   * The cached value of the '{@link #getOr() <em>Or</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOr()
   * @generated
   * @ordered
   */
  protected EList<OR> or;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Value> getColumn()
  {
    if (column == null)
    {
      column = new EObjectContainmentEList<Value>(Value.class, this, MyDslPackage.EXPRESSION__COLUMN);
    }
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Value> getResult()
  {
    if (result == null)
    {
      result = new EObjectContainmentEList<Value>(Value.class, this, MyDslPackage.EXPRESSION__RESULT);
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AND> getAnd()
  {
    if (and == null)
    {
      and = new EObjectContainmentEList<AND>(AND.class, this, MyDslPackage.EXPRESSION__AND);
    }
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OR> getOr()
  {
    if (or == null)
    {
      or = new EObjectContainmentEList<OR>(OR.class, this, MyDslPackage.EXPRESSION__OR);
    }
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.EXPRESSION__COLUMN:
        return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
      case MyDslPackage.EXPRESSION__RESULT:
        return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
      case MyDslPackage.EXPRESSION__AND:
        return ((InternalEList<?>)getAnd()).basicRemove(otherEnd, msgs);
      case MyDslPackage.EXPRESSION__OR:
        return ((InternalEList<?>)getOr()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.EXPRESSION__COLUMN:
        return getColumn();
      case MyDslPackage.EXPRESSION__RESULT:
        return getResult();
      case MyDslPackage.EXPRESSION__AND:
        return getAnd();
      case MyDslPackage.EXPRESSION__OR:
        return getOr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.EXPRESSION__COLUMN:
        getColumn().clear();
        getColumn().addAll((Collection<? extends Value>)newValue);
        return;
      case MyDslPackage.EXPRESSION__RESULT:
        getResult().clear();
        getResult().addAll((Collection<? extends Value>)newValue);
        return;
      case MyDslPackage.EXPRESSION__AND:
        getAnd().clear();
        getAnd().addAll((Collection<? extends AND>)newValue);
        return;
      case MyDslPackage.EXPRESSION__OR:
        getOr().clear();
        getOr().addAll((Collection<? extends OR>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.EXPRESSION__COLUMN:
        getColumn().clear();
        return;
      case MyDslPackage.EXPRESSION__RESULT:
        getResult().clear();
        return;
      case MyDslPackage.EXPRESSION__AND:
        getAnd().clear();
        return;
      case MyDslPackage.EXPRESSION__OR:
        getOr().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.EXPRESSION__COLUMN:
        return column != null && !column.isEmpty();
      case MyDslPackage.EXPRESSION__RESULT:
        return result != null && !result.isEmpty();
      case MyDslPackage.EXPRESSION__AND:
        return and != null && !and.isEmpty();
      case MyDslPackage.EXPRESSION__OR:
        return or != null && !or.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExpressionImpl
