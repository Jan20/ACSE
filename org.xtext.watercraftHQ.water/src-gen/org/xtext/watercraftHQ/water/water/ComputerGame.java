/**
 * generated by Xtext 2.12.0
 */
package org.xtext.watercraftHQ.water.water;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computer Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.watercraftHQ.water.water.ComputerGame#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.xtext.watercraftHQ.water.water.WaterPackage#getComputerGame()
 * @model
 * @generated
 */
public interface ComputerGame extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.watercraftHQ.water.water.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.watercraftHQ.water.water.WaterPackage#getComputerGame_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Type> getElements();

} // ComputerGame