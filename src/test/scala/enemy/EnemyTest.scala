package cl.uchile.dcc
package enemy

import cl.uchile.dcc.enemy.Enemy

/** Test to verify the Enemy class and its
 * characteristics
 * */

class EnemyTest extends munit.FunSuite {
  test("an enemy exists"){
    val enemy = new Enemy("Harpy", 80, 80, 50, 50, 30)
  }

}
