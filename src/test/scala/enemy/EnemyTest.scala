package cl.uchile.dcc
package enemy

import cl.uchile.dcc.enemy.Enemy

/** Test to verify the Enemy class and its
 * characteristics
 * */

class EnemyTest extends munit.FunSuite {
  test("an enemy exists with its attributes"){
    val enemy = new Enemy("Harpy", 80.0, 80.0, 50.0, 50.0, 30.0)
    assertEquals(enemy.name, "Harpy")
    assertEquals(enemy.maxHp, 80.0)
    assertEquals(enemy.hp, 70.0)
    assertEquals(enemy.defense, 50.0)
    assertEquals(enemy.weight, 50.0)
    assertEquals(enemy.attack, 40.0)
  }

}
