/*
--> For this exercise I'll reuse the code writed by me on the Pairs and the Collections Exercise

1. Create a top-level constant for the maximum number of books a person could borrow.
2. Inside the Book class, create a method canBorrow() that returns true or false depending
    on whether a user has already borrowed the max number of books.
3. Create a Constants object that provides constants to the book. For this example,
    provide the BASE_URL for all books in the library catalog. Inside Book, add a method
     printUrl that creates and prints a URL composed of BASE_URL, the book title, and “.html”.
4. The base URL is really of interest to the Book class. As such, it makes sense to limit its
    scope to the Book class. Use a companion object to define the constant in Book.
*/

fun main() {
    var book : Book4? = Book4("Feiurinha", "Carlos Drummond de Andrade", 1994)
    println("Here is your Book ${book?.infoTitleAndAuthor()?.first} " +
            "written by ${book?.infoAll()?.first?.second} " +
            "in ${book?.infoAll()?.second} ")

    var allBooks = hashSetOf("Romeu e Julieta", "Macbeth", "Sonho de uma noite de verão")
    var library = hashMapOf("William SheaksPeare" to allBooks)
    println(library.any {it.value.contains("Hamlet")})

    var moreBooks = mutableMapOf("Cecilia Meireles" to "O menino azul")
    moreBooks.getOrPut("Patativa do Assaré"){"Aqui tem coisa"}
    println(moreBooks.values)

    println("Bruno borrowed 2 books, can he stil to borrow?")
    println(book?.canBorrow("Bruno" to 2))

    book?.printUrl();
}

class Book4 (var title :String, var author:String, var year: Int){

    companion object{
        const val MAXNUMBER = 3
        const val BOOK1 = "Romeu e Julieta"
        const val BOOK2 = "Macbeth"
        const val BOOK3 = "Sonho de uma noite de verão"
    }

    fun infoTitleAndAuthor (): Pair<String, String> {
        return this.title to this.author
    }

    fun infoAll(): Pair<Pair<String, String>, Int> {
        return this.title to this.author to this.year
    }

    fun canBorrow(user: Pair<String, Int>) : Boolean {
        return (user.second < MAXNUMBER) ?: false
    }

    fun printUrl(){
        println(BOOK1.plus(".html"))
    }

}
