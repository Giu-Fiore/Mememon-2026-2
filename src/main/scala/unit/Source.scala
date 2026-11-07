package cl.uchile.dcc
package unit

import cl.uchile.dcc.action.Action
import cl.uchile.dcc.unit.Target

/** Trait describing an unit capable of initializing and executing actions */
trait Source {
  /** source is able to execute diverse actions*/
  def doAction(action:Action, target: Target): Unit
}
