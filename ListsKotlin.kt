// Connect to me on my LinkedIn profile 
// https://www.linkedin.com/in/brunorijo

fun main() {
   
    /* Create an integer array of numbers called numbers, from 11 to 15.
		Create an empty mutable list for Strings.
		Write a for loop that loops over the array and adds the string 
        representation of each number to the list.*/
    
    val numbers = intArrayOf(11,12,13,14,15)
    var numbersNames = mutableListOf<String>()
    
    for(element in numbers) numbersNames.add(element.toString())    
    println(numbersNames)
    
    /* How can you use a for loop to create (a list of) the numbers between 0 and 100 that are divisible by 7? */
    var listNumbers = mutableListOf<Int>()
    for (n in 0..100) if (n%7 == 0) listNumbers.add(n)
    println(listNumbers)
  
    
}
