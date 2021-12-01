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
        false
    }

    override fun toString(): String {
        return path.joinToString(prefix = "[", postfix = "]")
    }

}