import Directions.*

class Game(private var width: Int = 4, private var height: Int = 4) {
    // In-game map
    var gameMap = Location(width, height)
    // list of possible moves
    val moveStrings = mapOf<String, Directions>( "n" to NORTH, "s" to SOUTH, "e" to EAST, "w" to WEST)
    // List of the moves made
    var path = mutableListOf<Directions>(Directions.START)

    // Valid moves
    val north = { path.add(moveStrings["n"]!!) }
    val south = { path.add(moveStrings["s"]!!) }
    val east = { path.add(moveStrings["e"]!!) }
    val west = { path.add(moveStrings["w"]!!) }

    // End game actions
    val end = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        path.add(Directions.START)
        false
    }

    // Print the game's state as the path taken
    override fun toString(): String {
        return path.joinToString(prefix = "[", postfix = "]")
    }


    // Perform validation logic on the proposed move
    fun makeMove(moveString: String?) {

        moveStrings[moveString]?.let {
            // is the move valid and within bounds?
            if (gameMap.isMoveValid(it)) {
                // make the move
                when (moveString?.trim()?.uppercase()) {
                    "N" -> move(north)
                    "S" -> move(south)
                    "E" -> move(east)
                    "W" -> move(west)
                }
                // update the map
                gameMap.updateLocation(it)
            } else {
                // Is the move valid but out of bounds
                println("That move is outside of the map ${gameMap.getLocation()}.")
            }
        }
        // If the move is not valid then end the game
        if (moveStrings[moveString] == null) {
            move(end)
        }
    }

    // Perform the actual move
    private fun move(where: () -> Boolean ) {
        where()
    }

}