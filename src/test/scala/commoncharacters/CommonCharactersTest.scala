package cl.uchile.dcc
package commoncharacters


import scala.collection.mutable.ArrayBuffer
import cl.uchile.dcc.characters.commoncharacters.{Archer, Knight, Thief}
import cl.uchile.dcc.weapons.Weapon

class CommonCharactersTest extends munit.FunSuite {
  val archer = new Archer("Susan", 100.0, 100.0, 80.0, 50.0)
  val knight = new Knight("Peter", 100.0, 80.0, 90.0, 90.0)
  val thief = new Thief("Robin", 100.0, 70.0, 80.0, 80.0)
  test("Common characters are described with their initial attributes"){
    assertEquals(archer.name, "Susan")
    assertEquals(knight.maxHp, 100.0)
    assertEquals(thief.defense, 80.0)
    assertEquals(archer.weight, 50.0)
    assertEquals(knight.hp, 80.0)
  }

  test("A common character can have an inventory and it's empty by default"){
    assert(archer.inventory.isEmpty)
    assert(knight.inventory.isEmpty)
    assert(thief.inventory.isEmpty)
  }

  test("A common character can have a slot for a weapon, which is empty by default to start"){
    assert(archer.weapon.isEmpty)
    assert(knight.weapon.isEmpty)
    assert(thief.weapon.isEmpty)
  }

  test("A common character can have less Hp points compared to their max"){
    val archer = new Archer("Susan", 100.0, 100.0, 80.0, 50.0)
    archer.hp = 80.0
    assertEquals(archer.hp, 80.0)
    assert(archer.maxHp > archer.hp)
  }
}
