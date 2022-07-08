
/*
1. Create a class, Book, with a title and an author.
2. Add a method, readPage(), that increases the value of a private variable, currentPage, by 1.
3. Create a subclass of Book; name it eBook.
4. eBook also takes in a format, which defaults to "text".
5. In eBooks, counting words makes more sense than pages. Override the readPage() method to
increase the word count by 250, the average number of words per page from typewriter days.*/

open class Book ( var tittle : String = "", var author: String = "") {
    private var currentPage = 0
    open fun readPage(currentPage:Int) = (+1)
}

class eBook(var format:String="text"): Book() {
    override fun readPage(currentPage: Int) = currentPage.plus(250)
}
