/**
 * generated by Xtext 2.12.0
 */
package org.xtext.watercraftHQ.water.water;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.watercraftHQ.water.water.Field#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.xtext.watercraftHQ.water.water.Field#getHeros <em>Heros</em>}</li>
 *   <li>{@link org.xtext.watercraftHQ.water.water.Field#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.xtext.watercraftHQ.water.water.WaterPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject
{
  /**
   * Returns the value of the '<em><b>Rectangle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rectangle</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rectangle</em>' containment reference.
   * @see #setRectangle(Rectangle)
   * @see org.xtext.watercraftHQ.water.water.WaterPackage#getField_Rectangle()
   * @model containment="true"
   * @generated
   */
  Rectangle getRectangle();

  /**
   * Sets the value of the '{@link org.xtext.watercraftHQ.water.water.Field#getRectangle <em>Rectangle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rectangle</em>' containment reference.
   * @see #getRectangle()
   * @generated
   */
  void setRectangle(Rectangle value);

  /**
   * Returns the value of the '<em><b>Heros</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.watercraftHQ.water.water.Hero}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Heros</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Heros</em>' containment reference list.
   * @see org.xtext.watercraftHQ.water.water.WaterPackage#getField_Heros()
   * @model containment="true"
   * @generated
   */
  EList<Hero> getHeros();

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.watercraftHQ.water.water.Item}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see org.xtext.watercraftHQ.water.water.WaterPackage#getField_Items()
   * @model containment="true"
   * @generated
   */
  EList<Item> getItems();

} // Field