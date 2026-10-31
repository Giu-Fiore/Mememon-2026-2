package cl.uchile.dcc
package unit
/**
 * Here I will define the common characteristics
 * that the different units of the game share
 * such as common characters, magic characters and enemies
 *
 */

trait GameUnit {
  /** name of the unit */
  val name: String
  /** max health of the unit*/
  val maxHp: Double
  /** the heavier, the longer they take to act*/
  val weight: Double
  /**current health of the unit*/
  var hp: Double
  /**defense points of the unit*/
  var defense: Double
}
