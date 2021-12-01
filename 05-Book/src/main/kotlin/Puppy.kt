package Book

class Puppy(var name: String) {

    fun playWithBook(book: Book) { book.pages -= (0..book.pages).shuffled().first()}
}