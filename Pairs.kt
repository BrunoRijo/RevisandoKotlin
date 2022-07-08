/*
1. Create a basic book class, with a title, author, and year. Of course, 
                        you could get each of the properties separately.
2. Create a method that returns both the title and the author as a Pair.
3. Create a method that returns the title, author and year as a Triple. 
                      Use the documentation to find out how to use Triple.
4. Create a book instance.
5. Print out the information about the book in a sentence, such as: 
                                   “Here is your book X written by Y in Z.”*/
fun main() {
    var book : Book2? = Book2("Feiurinha", "Carlos Drummond de Andrade", 1994)
    println("Here is your Book ${book?.infoTitleAndAuthor()?.first} " +
            "written by ${book?.infoAll()?.first?.second} " +
            "in ${book?.infoAll()?.second} ")
}

class Book2 (var title :String, var author:String, var year: Int){
    fun infoTitleAndAuthor (): Pair<String, String> {
        return this.title to this.author
    }

    fun infoAll(): Pair<Pair<String, String>, Int> {
        return this.title to this.author to this.year
    }

}
