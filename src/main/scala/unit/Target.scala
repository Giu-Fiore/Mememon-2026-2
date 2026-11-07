package cl.uchile.dcc
package unit

import cl.uchile.dcc.action.Action
import cl.uchile.dcc.unit.Source


/** Trait describing a unit capable of receiving actions */

trait Target {
  /** target receives an action by a source */
  def receiveAction(action: Action, source: Source): Unit =()
  /** we define the different effects of different actions on target */
  
  /** target can receive an attack from a source */
  def receiveAttack(source: Source): Unit =()
  
  /** target can  */
}
