class Location(private var width: Int, private var height: Int) {

    // location coordinates
    private var x = 0
    private var y = 0

    // Set the map dimensions to 4x4 if the supplied dimensions are any less
    init {
        width = if (width < 1) 4 else width
        height = if (height < 1) 4 else height
        println("\nThe map's dimensions are $width by $height.")
        println("The current location is ($x,$y).\n")
    }

    // If the move is valid then update the location on the map
    fun updateLocation(move: Directions): Boolean {
        if(isMoveValid(move)) {
            when (move) {
                Directions.NORTH -> y++
                Directions.SOUTH -> y--
                Directions.EAST -> x++
                Directions.WEST -> x--
                Directions.END -> true
            }
            println("($x,$y)")
            return true
        }
        return false
    }

    // Verify that the anticipated move is within bounds given the current position
    fun isMoveValid(move: Directions) : Boolean {
        return when (move) {
            Directions.NORTH -> y+1 in 0..height
            Directions.SOUTH -> y-1 in 0..height
            Directions.EAST -> x+1 in 0..height
            Directions.WEST -> x-1 in 0..height
            Directions.END -> true
            else -> false
        }
    }

    // Return the coordinates of the current location
    fun getLocation(): String = "($x,$y)"

}