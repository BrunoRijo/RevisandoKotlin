package AMS

import java.util.*

fun main(args: Array<String>) {

    feedTheFish()
    canAddFish(10.0, listOf(3,3,3))
    canAddFish(8.0, listOf(2,2,2), hasDecorations = false)
    canAddFish(9.0, listOf(1,1,3), 3)
    canAddFish(10.0, listOf(), 7, true)
}

fun feedTheFish() {
    val day = randomDay()
    var food = fishFood(day)
    println("Today is ${day} and the fish eat ${food}")
}

fun fishFood(day: String): String {
    return when (day){
        "Monday" -> "Flakes"
        "Tuesday" -> "Bubbles"
        "Wednesday" -> "MiniFood"
        "Thursday" -> "Meat"
        "Friday" -> "Rice"
        "Saturday" -> "Beans"
        else -> "Worms"
    }
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday" , "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun canAddFish(
    tankSize: Double, //galoons
    currentFish: List<Int>,
    newFishSize: Int = 2,
    hasDecorations: Boolean = true) {

    var fishInAquarium: Int = 0
    for(i in currentFish) fishInAquarium += i
    var capaticy = if (hasDecorations) (tankSize*80)/100 else tankSize

    println(fishInAquarium + newFishSize <= capaticy)
}
