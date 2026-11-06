package cl.uchile.dcc
package action


/** This trait will be common for all the actions that a player can
 * do in the game, such as move around the map, attack, use a potion,
 * equip a weapon and cast spells*/

trait Action {
  /** name of the action */
  val name: String
}



