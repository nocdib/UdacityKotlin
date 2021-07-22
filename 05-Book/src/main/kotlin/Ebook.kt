class Ebook(override var title: String, override var author: String, var format:String = "text"): Book(title, author) {

    private var wordCount: Int = 0

    override fun readPage() { wordCount += 250 }

    override fun toString(): String {
        return "\"${title}\" is written by $author and you have read $wordCount words in the $format format."
    }
}