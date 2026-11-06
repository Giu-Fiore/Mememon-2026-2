package cl.uchile.dcc
package turnscheduler

import cl.uchile.dcc.unit.GameUnit
import scala.collection.mutable.{ArrayBuffer, Map=>MutableMap}
import cl.uchile.dcc.characters.{Character, MagicCharacter}
import cl.uchile.dcc.enemy.Enemy

/**
 * Coordinates combat and action bar of the units in combat
 */
class TurnScheduler {
  val units: ArrayBuffer[GameUnit] = ArrayBuffer()
  val actionBar: MutableMap[GameUnit, Double] = MutableMap()

  /** adds a new combat unit to the scheduler with its action bar  */
  def addUnit(unit: GameUnit): Unit ={
    if(!units.contains(unit)){
      units += unit
      actionBar(unit)=0.0
    }
  }
}
