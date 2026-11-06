package cl.uchile.dcc
package commoncharacters

import cl.uchile.dcc.characters.commoncharacters.Knight

class knightTest extends munit.FunSuite {
  test("a knight exists") {
    val knight = new Knight("Peter", 100, 80, 90, 90)
  }
}
