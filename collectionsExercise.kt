// Connect me on LinkedIn
// https://linkedin.com/in/brunorijo

/*
1. Create a Set of book titles called allBooks, for example, by William Shakespeare.
2. Create a Map called library that associates the set of books, allBooks, to the author.
3. Use the collections function any() on library to see if any of the books are “Hamlet’
4. Create a MutableMap called moreBooks, and add one title/author to it.
5. Use getOrPut() to see whether a title is in the map, and if the title is not in the map, add it.
*/

fun main() {
  
	var allBooks = hashSetOf("Romeu e Julieta", "Macbeth", "Sonho de uma noite de verão")    
    var library = hashMapOf("William SheaksPeare" to allBooks)
    println(library.any {it.value.contains("Hamlet")})
    
    var moreBooks = mutableMapOf("Cecilia Meireles" to "O menino azul")
    moreBooks.getOrPut("Patativa do Assaré"){"Aqui tem coisa"}
    println(moreBooks.values)
}
