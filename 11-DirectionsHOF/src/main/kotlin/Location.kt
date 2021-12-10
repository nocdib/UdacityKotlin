class Location(private var width: Int = 4, private var height: Int = 4) {

    init {
        width = if (width < 1) 4 else width
        height = if (height < 1) 4 else height
        println("\nThe map's dimensions are $width by $height.")
    }

    private var x = 0
    private var y = 0

    fun updateLocation(move: Directions): Boolean {
        if(isMoveValid(move)) {
            when (move) {
                Directions.NORTH -> y++
                Directions.SOUTH -> y--
                Directions.EAST -> x++
                Directions.WEST -> x--
            }
            return true
        }
        return false
    }

    fun isMoveValid(move: Directions) : Boolean {
        return when (move) {
            Directions.NORTH, Directions.SOUTH -> y in 0 until height
            Directions.EAST, Directions.WEST -> x in 0 until width
            else -> false
        }
    }

}