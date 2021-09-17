const val maxBooksBorrowed = 5

class Book(var title: String, var author: String, var year: Int) {

    companion object {
        const val BASE_URL = "http://library.com/"
    }

    // Return title-author pair
    fun titleAuthor() : Pair<String, String> = title to author

    // Return title-author-year triple
    fun titleAuthorYear() : Triple<String, String, Int> = Triple(title, author, year)

    fun canBarrow(booksBorrowed: Int) = booksBorrowed < maxBooksBorrowed

    fun printUrl(){
        println("${BASE_URL}${ title.replace(" ", "_").lowercase() }.html")
    }

    init {
        println("Created book: $title")
    }
}

fun main(args: Array<String>) {

    val mobyDick = Book("Moby Dick", "Herman Melville", 1851)
    mobyDick.printUrl()

    // Print the Book triple
    println("Here is your book ${mobyDick.titleAuthorYear().first} written by " +
            "${mobyDick.titleAuthorYear().second} in ${mobyDick.titleAuthorYear().third}")

    // create a set of book titles and map an author to it
    val allBooks = setOf("MacBeth", "The Tempest", "Romeo and Juliet")
    val library = mapOf("William Shakespeare" to allBooks)
    // Does the author contain "Shakespeare"?
    println(library.any { it.key.contains("Shakespeare") })
    // Does the set of books contain "Hamlet"?
    println(library.any { it.value.contains("Hamlet") })

    // create a mutable map of authors to books
    val moreBooks = mutableMapOf("William Shakespeare" to "Hamlet")
    // Get Shakespeare's book or add it
    println(moreBooks.getOrPut("William Shakespeare") { "King Lear" })
    // Get Vonnegut's book or add it
    println(moreBooks.getOrPut("Kurt Vonnegut") { "The Sirens of Titan" })
    println("moreBooks = $moreBooks")
}