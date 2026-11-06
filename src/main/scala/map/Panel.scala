package cl.uchile.dcc
package map

import scala.collection.mutable.ArrayBuffer
import cl.uchile.dcc.unit.GameUnit

/**
 * Defines the map of the game
 * @param x x-coordinate of the map
 * @param y y-coordinate of the map
 *  
 */
class Panel(val x: Int, val y: Int) {
  /** list of units in the panel */
  var units: ArrayBuffer[GameUnit] = ArrayBuffer()
  /** add units to a panel */
  def addUnit(unit: GameUnit): Unit = {
    if (!units.contains(unit)) {
      units += unit
      unit.setPanel(this)
    }
  }
  /** list of nearby panels */
  var nearPanels: ArrayBuffer[Panel] = ArrayBuffer()
  /** we define a function to add a panel adjacent to the current one */
  def addNeighbor(panel: Panel): Unit = {
    nearPanels = nearPanels :+ panel
  }
}

