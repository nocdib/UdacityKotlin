import Directions.*

class Game {
    var path = mutableListOf<Directions>(Directions.START)

    val north = { path.add(Directions.NORTH) }

    val south = { path.add(Directions.SOUTH) }

    val east = { path.add(Directions.EAST) }

    val west = { path.add(Directions.WEST) }

    val end = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        path.add(Directions.START)
        false
    }

    var location = Location(, height: Int)

    override fun toString(): String {
        return path.joinToString(prefix = "[", postfix = "]")
    }

    fun makeMove(moveString: String?) {
        when (moveString?.trim()?.uppercase()) {
            "N" -> move(north)
            "S" -> move(south)
            "E" -> move(east)
            "W" -> move(west)
            else -> move(end)
        }
    }

    fun move(where: () -> Boolean ) {
        where()
    }

}