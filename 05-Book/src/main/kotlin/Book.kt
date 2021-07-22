open class Book(open var title: String, open var author: String) {

    private var currentPage: Int = 1

    open fun readPage() { currentPage++ }

    override fun toString(): String {
        return "\"${title}\" is written by $author and you are on page $currentPage."
    }

}