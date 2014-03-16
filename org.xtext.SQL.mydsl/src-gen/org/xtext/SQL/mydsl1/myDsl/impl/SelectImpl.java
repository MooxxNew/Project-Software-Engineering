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

import org.xtext.SQL.mydsl1.myDsl.MyDslPackage;
import org.xtext.SQL.mydsl1.myDsl.Option;
import org.xtext.SQL.mydsl1.myDsl.Select;
import org.xtext.SQL.mydsl1.myDsl.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.impl.SelectImpl#getSelect_value <em>Select value</em>}</li>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.impl.SelectImpl#getFroms_value <em>Froms value</em>}</li>
 *   <li>{@link org.xtext.SQL.mydsl1.myDsl.impl.SelectImpl#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectImpl extends MinimalEObjectImpl.Container implements Select
{
  /**
   * The cached value of the '{@link #getSelect_value() <em>Select value</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelect_value()
   * @generated
   * @ordered
   */
  protected EList<Variable> select_value;

  /**
   * The cached value of the '{@link #getFroms_value() <em>Froms value</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFroms_value()
   * @generated
   * @ordered
   */
  protected EList<Variable> froms_value;

  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected EList<Option> options;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectImpl()
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
    return MyDslPackage.Literals.SELECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getSelect_value()
  {
    if (select_value == null)
    {
      select_value = new EObjectContainmentEList<Variable>(Variable.class, this, MyDslPackage.SELECT__SELECT_VALUE);
    }
    return select_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getFroms_value()
  {
    if (froms_value == null)
    {
      froms_value = new EObjectContainmentEList<Variable>(Variable.class, this, MyDslPackage.SELECT__FROMS_VALUE);
    }
    return froms_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Option> getOptions()
  {
    if (options == null)
    {
      options = new EObjectContainmentEList<Option>(Option.class, this, MyDslPackage.SELECT__OPTIONS);
    }
    return options;
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
      case MyDslPackage.SELECT__SELECT_VALUE:
        return ((InternalEList<?>)getSelect_value()).basicRemove(otherEnd, msgs);
      case MyDslPackage.SELECT__FROMS_VALUE:
        return ((InternalEList<?>)getFroms_value()).basicRemove(otherEnd, msgs);
      case MyDslPackage.SELECT__OPTIONS:
        return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.SELECT__SELECT_VALUE:
        return getSelect_value();
      case MyDslPackage.SELECT__FROMS_VALUE:
        return getFroms_value();
      case MyDslPackage.SELECT__OPTIONS:
        return getOptions();
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
      case MyDslPackage.SELECT__SELECT_VALUE:
        getSelect_value().clear();
        getSelect_value().addAll((Collection<? extends Variable>)newValue);
        return;
      case MyDslPackage.SELECT__FROMS_VALUE:
        getFroms_value().clear();
        getFroms_value().addAll((Collection<? extends Variable>)newValue);
        return;
      case MyDslPackage.SELECT__OPTIONS:
        getOptions().clear();
        getOptions().addAll((Collection<? extends Option>)newValue);
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
      case MyDslPackage.SELECT__SELECT_VALUE:
        getSelect_value().clear();
        return;
      case MyDslPackage.SELECT__FROMS_VALUE:
        getFroms_value().clear();
        return;
      case MyDslPackage.SELECT__OPTIONS:
        getOptions().clear();
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
      case MyDslPackage.SELECT__SELECT_VALUE:
        return select_value != null && !select_value.isEmpty();
      case MyDslPackage.SELECT__FROMS_VALUE:
        return froms_value != null && !froms_value.isEmpty();
      case MyDslPackage.SELECT__OPTIONS:
        return options != null && !options.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SelectImpl
