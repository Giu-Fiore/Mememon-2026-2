package cl.uchile.dcc
package action

/**
 * Here I define the trait of Spells since each of them has 
 * a cost of mana points
 */
trait Spells extends Action {
  var manaCost: Double

}
