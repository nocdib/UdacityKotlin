package Book

// This exercise tests inheritance

fun main(args: Array<String>) {
    val mobyDick = Book("Moby Dick", "Herman Melville", 378)
    val mobyDickEbook = Ebook("Moby Dick", "Herman Melville")
    val puppy = Puppy("Spot")

    println(mobyDick)
    println(mobyDickEbook)

    println("${mobyDick.title} weighs ${mobyDick.weight()} grams.")
    puppy.playWithBook(mobyDick)
    println("After ${puppy.name} the puppy played with ${mobyDick.title} it weighs ${mobyDick.weight()} grams and has ${mobyDick.pages} pages.")




}