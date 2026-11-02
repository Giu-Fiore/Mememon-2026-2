package cl.uchile.dcc
package player

import cl.uchile.dcc.unit.GameUnit

/**
 * defines the player of the game, who can control a list of units
 * @param units units controlled by the player, such as characters and enemies
 * */
class Player(val units: List[GameUnit]) {
  /** a player would be defeated if all of his character units have 0 hp or less
   * depending on how much damaged they've received*/
  def isDefeated: Boolean = units.forall(unit => unit.hp <= 0)
}
