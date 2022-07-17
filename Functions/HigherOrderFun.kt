/*
Create an extension on List using a higher order function that returns all
the numbers in the list that are divisible by 3. Start by creating an extension
function on List that takes an lambda on Int and applies it to each item in the
list. When the lambda returns zero, include the item in the output.
* */

fun main() {
    var list = listOf<Int>(1,2,3,4,5,6,7,8,9)
    println(list.divBy3WithLambda { it.rem(3)})
    println(list.divBy3())
}

fun List<Int>.divBy3WithLambda(block: (Int) -> Int) : List<Int>{
    var auxList = mutableListOf<Int>()
    for (item in this) if (block(item).equals(0)) auxList.add(item)
    return auxList
}

// Another solution is
fun List<Int>.divBy3() : List<Int> = this.filter { it.rem(3).equals(0) }
