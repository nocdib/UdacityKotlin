package spices

fun main(args: Array<String>){
    println("Ninja Spice.")
    var curry = Curry("yellow curry", "5")

}

abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    internal val heat: Int
        get() = when(spiciness) {
            "neutral" -> 2
            "mild" -> 5
            "medium" -> 7
            "hot" -> 9
            "extremely hot" -> 10
            else -> 0
        }
    // Print out each spice object after it is created
    init {
        println("$name is level $heat $spiciness")
    }

    abstract fun prepareSpice()

}
class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {
    override fun grind() {
    }

    override fun prepareSpice() {
        grind()
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "Yellow"
}
