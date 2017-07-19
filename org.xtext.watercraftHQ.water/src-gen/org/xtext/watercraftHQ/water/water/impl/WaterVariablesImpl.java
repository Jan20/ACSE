/**
 * generated by Xtext 2.12.0
 */
package org.xtext.watercraftHQ.water.water.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.watercraftHQ.water.water.WaterPackage;
import org.xtext.watercraftHQ.water.water.WaterVariable;
import org.xtext.watercraftHQ.water.water.WaterVariables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variables</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.watercraftHQ.water.water.impl.WaterVariablesImpl#getWaterVariables <em>Water Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WaterVariablesImpl extends MinimalEObjectImpl.Container implements WaterVariables
{
  /**
   * The cached value of the '{@link #getWaterVariables() <em>Water Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWaterVariables()
   * @generated
   * @ordered
   */
  protected EList<WaterVariable> waterVariables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WaterVariablesImpl()
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
    return WaterPackage.Literals.WATER_VARIABLES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WaterVariable> getWaterVariables()
  {
    if (waterVariables == null)
    {
      waterVariables = new EObjectContainmentEList<WaterVariable>(WaterVariable.class, this, WaterPackage.WATER_VARIABLES__WATER_VARIABLES);
    }
    return waterVariables;
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
      case WaterPackage.WATER_VARIABLES__WATER_VARIABLES:
        return ((InternalEList<?>)getWaterVariables()).basicRemove(otherEnd, msgs);
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
      case WaterPackage.WATER_VARIABLES__WATER_VARIABLES:
        return getWaterVariables();
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
      case WaterPackage.WATER_VARIABLES__WATER_VARIABLES:
        getWaterVariables().clear();
        getWaterVariables().addAll((Collection<? extends WaterVariable>)newValue);
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
      case WaterPackage.WATER_VARIABLES__WATER_VARIABLES:
        getWaterVariables().clear();
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
      case WaterPackage.WATER_VARIABLES__WATER_VARIABLES:
        return waterVariables != null && !waterVariables.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WaterVariablesImpl