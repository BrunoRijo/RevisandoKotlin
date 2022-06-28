   //If you start with 2 fish, and they breed twice, 
   //producing 71 offspring the first time, and 233 offspring the second time, 
   //and then 13 fish are swallowed by a hungry moray eel, 
   //how many fish do you have left? 
   //How many aquariums do you need if you can put 30 fish per aquarium?

fun main() {
 	var fishes:Int = 0
    
    fishes = fishes.plus(71)
    println("First breed "+ fishes +" in total")
    fishes = fishes.plus(233)
    println("First breed "+ fishes +" in total")    
    fishes = fishes.minus(13)
    println("Moray attack, "+ fishes +" remains")
    
    println("You will need "+ (aquariumCapaticy(fishes)+1) + " aquariums!")   
}

fun aquariumCapaticy(fishes:Int) = fishes/30


