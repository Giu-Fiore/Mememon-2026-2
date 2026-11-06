package cl.uchile.dcc
package commoncharacters

import cl.uchile.dcc.characters.commoncharacters.Thief

class thiefTest extends munit.FunSuite {
  test("a thief exists"){
    val thief = new Thief("Robin", 100, 30, 100, 80)
  }

}
