fun main() {
   
    /* Create a nullable integer variable called nullTest, and set it to null. 
      Use a null-check that increases the value by one if it's not null, 
      otherwise returns 0, and prints the result.*/
    
    var nullTest : Int? = null
    
    nullTest = 0 ?: 1
    println(nullTest)
}
