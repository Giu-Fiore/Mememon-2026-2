# Entrega Final 2
Para la resolución de esta entrega se tomaron en consideración los feedback entregados en la Entrega Final 1.

## Sobre decisiones de diseño
*Traits:* Definí traits para clases que utilizarían los mismos atributos, entre las cuales están:
-  GameUnit: para las unidades de juego utilizables por un jugador
-  Character: para los personajes generales del juego.
-  MagicCharacter: que extiende Character, pero agregando el atributo de portador de mana.
-  Action: para las distintas acciones posibles dentro del juego.
-  Spells: que extiende Action, agregando el costo de puntos de mana.
-  Item: para los distintos objetos utilizables en acciones y guardados en inventario
-  Weapon: extiende de Item para las distintas armas usables por personajes.
-  MagicWeapon: extiende Weapon, agregando puntos de ataque mágico.
-  Potion: extiende de Item para las distintas pociones consumibles dentro del juego
A partir de estos, creé las distintas clases utilizables dentro del juego.

*Clases particulares:* en este caso, dejé Enemy, TurnScheduler, Panel, Player y GameController como clases normales, ya que tendrán sus implementaciones específicas.
