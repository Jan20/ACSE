/**
 * generated by Xtext 2.12.0
 */
package org.xtext.watercraftHQ.water.water;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.watercraftHQ.water.water.Item#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.watercraftHQ.water.water.Item#getAttackBonus <em>Attack Bonus</em>}</li>
 *   <li>{@link org.xtext.watercraftHQ.water.water.Item#getDefenseBonus <em>Defense Bonus</em>}</li>
 *   <li>{@link org.xtext.watercraftHQ.water.water.Item#getLocation <em>Location</em>}</li>
 *   <li>{@link org.xtext.watercraftHQ.water.water.Item#getHero <em>Hero</em>}</li>
 * </ul>
 *
 * @see org.xtext.watercraftHQ.water.water.WaterPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends Type
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.watercraftHQ.water.water.WaterPackage#getItem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.watercraftHQ.water.water.Item#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attack Bonus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attack Bonus</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attack Bonus</em>' attribute.
   * @see #setAttackBonus(int)
   * @see org.xtext.watercraftHQ.water.water.WaterPackage#getItem_AttackBonus()
   * @model
   * @generated
   */
  int getAttackBonus();

  /**
   * Sets the value of the '{@link org.xtext.watercraftHQ.water.water.Item#getAttackBonus <em>Attack Bonus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attack Bonus</em>' attribute.
   * @see #getAttackBonus()
   * @generated
   */
  void setAttackBonus(int value);

  /**
   * Returns the value of the '<em><b>Defense Bonus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defense Bonus</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defense Bonus</em>' attribute.
   * @see #setDefenseBonus(int)
   * @see org.xtext.watercraftHQ.water.water.WaterPackage#getItem_DefenseBonus()
   * @model
   * @generated
   */
  int getDefenseBonus();

  /**
   * Sets the value of the '{@link org.xtext.watercraftHQ.water.water.Item#getDefenseBonus <em>Defense Bonus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Defense Bonus</em>' attribute.
   * @see #getDefenseBonus()
   * @generated
   */
  void setDefenseBonus(int value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' containment reference.
   * @see #setLocation(Position)
   * @see org.xtext.watercraftHQ.water.water.WaterPackage#getItem_Location()
   * @model containment="true"
   * @generated
   */
  Position getLocation();

  /**
   * Sets the value of the '{@link org.xtext.watercraftHQ.water.water.Item#getLocation <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' containment reference.
   * @see #getLocation()
   * @generated
   */
  void setLocation(Position value);

  /**
   * Returns the value of the '<em><b>Hero</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hero</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hero</em>' reference.
   * @see #setHero(Hero)
   * @see org.xtext.watercraftHQ.water.water.WaterPackage#getItem_Hero()
   * @model
   * @generated
   */
  Hero getHero();

  /**
   * Sets the value of the '{@link org.xtext.watercraftHQ.water.water.Item#getHero <em>Hero</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hero</em>' reference.
   * @see #getHero()
   * @generated
   */
  void setHero(Hero value);

} // Item
