package spiceRack

fun main(args: Array<String>) {
    // Create list of spices
    val spices = listOf<Spice>(
        Spice("Bell Pepper", "neutral"),
        Spice("Pimento", "neutral"),
        Spice("Jalepeno", "mild"),
        Spice("Ancho", "mild"),
        Spice("Cayenne", "medium"),
        Spice("Tobasco", "medium"),
        Spice("New Mexico Scorpion", "hot"),
        Spice("Ghost Pepper", "hot"),
        Spice("Carolina Reaper", "extremely hot"),
        Spice("Trinidad Scorpion", "extremely hot"),
        makeSalt()
    )

    // Filter all spices that are less than hot then print them
    val notHot = spices.filter{ it.heat <= 7 }
    notHot.forEach { println("* ${it.name} *") }

}

// Make salt a spice
fun makeSalt() = Spice("Salt", "neutral")