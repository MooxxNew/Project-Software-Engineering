/**
 */
package org.xtext.SQL.mydsl1.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.SQL.mydsl1.myDsl.AND;
import org.xtext.SQL.mydsl1.myDsl.Expression;
import org.xtext.SQL.mydsl1.myDsl.MyDslPackage;
import org.xtext.SQL.mydsl1.myDsl.OR;
import org.xtext.SQL.mydsl1.myDsl.Where;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Where</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.impl.WhereImpl#getExprs <em>Exprs</em>}</li>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.impl.WhereImpl#getAnd <em>And</em>}</li>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.impl.WhereImpl#getOr <em>Or</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhereImpl extends MinimalEObjectImpl.Container implements Where
{
  /**
   * The cached value of the '{@link #getExprs() <em>Exprs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprs()
   * @generated
   * @ordered
   */
  protected EList<Expression> exprs;

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
  protected WhereImpl()
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
    return MyDslPackage.Literals.WHERE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExprs()
  {
    if (exprs == null)
    {
      exprs = new EObjectContainmentEList<Expression>(Expression.class, this, MyDslPackage.WHERE__EXPRS);
    }
    return exprs;
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
      and = new EObjectContainmentEList<AND>(AND.class, this, MyDslPackage.WHERE__AND);
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
      or = new EObjectContainmentEList<OR>(OR.class, this, MyDslPackage.WHERE__OR);
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
      case MyDslPackage.WHERE__EXPRS:
        return ((InternalEList<?>)getExprs()).basicRemove(otherEnd, msgs);
      case MyDslPackage.WHERE__AND:
        return ((InternalEList<?>)getAnd()).basicRemove(otherEnd, msgs);
      case MyDslPackage.WHERE__OR:
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
      case MyDslPackage.WHERE__EXPRS:
        return getExprs();
      case MyDslPackage.WHERE__AND:
        return getAnd();
      case MyDslPackage.WHERE__OR:
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
      case MyDslPackage.WHERE__EXPRS:
        getExprs().clear();
        getExprs().addAll((Collection<? extends Expression>)newValue);
        return;
      case MyDslPackage.WHERE__AND:
        getAnd().clear();
        getAnd().addAll((Collection<? extends AND>)newValue);
        return;
      case MyDslPackage.WHERE__OR:
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
      case MyDslPackage.WHERE__EXPRS:
        getExprs().clear();
        return;
      case MyDslPackage.WHERE__AND:
        getAnd().clear();
        return;
      case MyDslPackage.WHERE__OR:
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
      case MyDslPackage.WHERE__EXPRS:
        return exprs != null && !exprs.isEmpty();
      case MyDslPackage.WHERE__AND:
        return and != null && !and.isEmpty();
      case MyDslPackage.WHERE__OR:
        return or != null && !or.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WhereImpl
