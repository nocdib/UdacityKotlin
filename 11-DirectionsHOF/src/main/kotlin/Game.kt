import Directions.*

<<<<<<< HEAD
class Game(private var width: Int = 4, private var height: Int = 4) {

    var gameMap = Location(width, height)
    val moveStrings = mapOf<String, Directions>( "n" to NORTH, "s" to SOUTH, "e" to EAST, "w" to WEST)

    var path = mutableListOf<Directions>(Directions.START)

    val north = { path.add(moveStrings["n"]!!) }

    val south = { path.add(moveStrings["s"]!!) }

    val east = { path.add(moveStrings["e"]!!) }

    val west = { path.add(moveStrings["w"]!!) }
=======
class Game {
    var path = mutableListOf<Directions>(Directions.START)

    val north = { path.add(Directions.NORTH) }

    val south = { path.add(Directions.SOUTH) }

    val east = { path.add(Directions.EAST) }

    val west = { path.add(Directions.WEST) }
>>>>>>> 9c677d935100b973d3e09eac3d6cf91bdc3b04b1

    val end = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        path.add(Directions.START)
        false
    }

<<<<<<< HEAD
=======
    var location = Location(, height: Int)

>>>>>>> 9c677d935100b973d3e09eac3d6cf91bdc3b04b1
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