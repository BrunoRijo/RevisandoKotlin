

fun main() {
   
    /* Create a String variable rainbowColor, set its color value, then change it.
     * Create a variable blackColor whose value cannot be changed once assigned. Try changing it anyway.*/
    
   var rainbowColor = "Red"
   val blackColor = "Black"
    
   rainbowColor = "Orange"
   rainbowColor = "Yellow"
   rainbowColor = "Green"
   rainbowColor = "Light Blue"
   rainbowColor = "Blue"
   rainbowColor = "Violet"
   println(rainbowColor) 
    
   /*It's impossible to change a variable seted as val  */
   //blackColor = "White"
   println(blackColor) 
    
   /* Try to set rainbowColor to null. Declare two variables, greenColor and blueColor. 
    * Use two different ways of setting them to null.*/
    
    // rainbowColor = null
    var greenColor: String? = null
    var blueColor: String? = "Blue"
    blueColor = null    
    
}
