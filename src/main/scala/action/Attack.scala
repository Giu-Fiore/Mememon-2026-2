package cl.uchile.dcc
package action

import scala.collection.mutable.ArrayBuffer
import cl.uchile.dcc.weapons.{Weapon, MagicWeapon}
import cl.uchile.dcc.weapons.common.{Bow,Sword,Dagger }
import cl.uchile.dcc.weapons.magical.{Staff,Wand}
import cl.uchile.dcc.characters.{Character, MagicCharacter}
import cl.uchile.dcc.enemy.Enemy


/**
 * Action of attacking another unit
 * @param name name of the action
 */
class Attack extends Action {
  /** the name of this action will always be attack */
  val name: String = "Attack"
  /** a source can perform an attack on a target */

}
