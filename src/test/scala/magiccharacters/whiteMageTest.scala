package cl.uchile.dcc
package magiccharacters

import cl.uchile.dcc.characters.magiccharacters.WhiteMage

class whiteMageTest extends munit.FunSuite {
  test("a White Mage exists"){
    val whiteMage = new WhiteMage("Ian", 100, 100, 80, 70, 100, 90)
  }
}

