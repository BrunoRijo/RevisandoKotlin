fun main() {
   
    /* Create a when statement with three comparisons:
		If the length of the fishName is 0, print an error message.
		If the length is in the range of 3...12, print "Good fish name".
		If it's anything else, print "OK fish name*/
     
    val fishName = "Trout"
    when(fishName.length){
        0 -> "Error!"
        in 3..12 -> "Good fish name"
        else -> "Ok fish name"
    }
    
}
