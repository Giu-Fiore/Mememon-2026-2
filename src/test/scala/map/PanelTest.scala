package cl.uchile.dcc
package map

import cl.uchile.dcc.map.Panel

class PanelTest extends munit.FunSuite {

  test("a panel registers its adjacent panels") {
    val panel = new Panel(1, 1)
    val neighbor = new Panel(2, 1)
    panel.addNeighbor(neighbor)
    assertEquals(panel.nearPanels, List(neighbor))

  }
}
