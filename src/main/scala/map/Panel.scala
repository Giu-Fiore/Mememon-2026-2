package cl.uchile.dcc
package map

import cl.uchile.dcc.unit.GameUnit

/**
 * Defines the map of the game
 * @param x x-coordinate of the map
 * @param y y-coordinate of the map
 *  
 */
class Panel(val x: Int, val y: Int) {
  /** list of units in the panel */
  var units: List[GameUnit] = List()
  /** list of nearby panels */
  var nearPanels: List[Panel] = List()
  /** we define a function to add a panel adjacent to the current one */
  def addNeighbor(panel: Panel): Unit = {
    nearPanels = nearPanels :+ panel

  }
}

