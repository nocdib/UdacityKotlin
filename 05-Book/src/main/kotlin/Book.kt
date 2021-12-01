package Book

open class Book(open var title: String, open var author: String, open var pages: Int) {

    private var currentPage: Int = 1

    open fun readPage() { currentPage++ }

    override fun toString(): String {
        return "\"${title}\" was written by $author and you are on page $currentPage of $pages."
    }

}

fun Book.weight() = pages * 1.5

fun Book.tornPages(tornPages: Int) = if (tornPages > pages) pages = 0 else pages -= tornPages

