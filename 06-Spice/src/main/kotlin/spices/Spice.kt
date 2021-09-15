package spices

fun main(args: Array<String>){
    val curry = Curry("Yellow Curry", "neutral")
    println(curry)
    // Exercise 4-12
    val kormaContainer = SpiceContainer(Curry("Korma", "mild"))
    val biryaniContainer = SpiceContainer(Curry("Biryani", "medium"))
    val bhunaContainer = SpiceContainer(Curry("Bhuna", "hot"))
    val madrasContainer = SpiceContainer(Curry("Madras", "extremely hot"))
    val curryContainers = listOf<SpiceContainer>(kormaContainer, biryaniContainer, bhunaContainer, madrasContainer)
    for(container in curryContainers) {
        println("${container.label} container")
    }
}

sealed class Spice(val name: String, private val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    private val heat: Int
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
        println("Created the spice $name.")
    }

    override fun toString() = "$name is level $heat hot with $spiciness spiciness."
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
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

// Quiz 4-12
data class SpiceContainer(val spice: Spice){
    val label:String = spice.name
}

// Quiz 4-14
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}


