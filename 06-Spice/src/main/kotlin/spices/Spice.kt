package spices

fun main(args: Array<String>){
    println("Ninja Spice.")
    var curry = Curry()

}

abstract class Spice(var name: String, var spiciness: String = "mild") {
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

class Curry(spiciness: String = "mild"): Spice("Curry", spiciness), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("Grinding curry...")
    }

}

interface Grinder {
    fun grind()
}