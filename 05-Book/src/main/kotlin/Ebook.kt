package Book

class Ebook(override var title: String, override var author: String, var format:String = "text", var page: Int = 0): Book(title, author, page) {

    private var wordCount: Int = 0

    override fun readPage() { wordCount += 250 }

    override fun toString(): String {
        return "\"${title}\" was written by $author and you have read $wordCount words in the $format format."
    }
}