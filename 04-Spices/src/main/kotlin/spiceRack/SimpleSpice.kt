package spiceRack

class SimpleSpice {
    val name: String = "Curry"
    val spiciness: String = "mild"
    val heat: Int
        get() = when(spiciness) {
                "neutral" -> 2
                "mild" -> 5
                "medium" -> 7
                "hot" -> 9
                "extremely hot" -> 10
                else -> 0
        }




}