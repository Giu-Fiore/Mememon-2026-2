package cl.uchile.dcc
package commoncharacters

import characters.commoncharacters.{Archer, Knight, Thief}

class CommonCharactersTest extends munit.FunSuite {
  test("Common characters are described"){
    val archer = new Archer("Susan", 100, 100, 50, 80)
    val knight = new Knight("Peter", 100, 80, 90, 90)
    val thief = new Thief("Robin", 100, 30, 100, 80)
  }
}
