import java.util.*

/*
Create a function that takes an argument representing the time in 24-hour format
(values between and including 0 -> 23). Check if the time is before midday (<12), 
then print "Good morning, Kotlin"; otherwise, print "Good night, Kotlin".
*/

fun main(args: Array<String>){
    println(" - What day is today?")
    println(LookingAtTheTime())
}

fun LookingAtTheTime(): String{
    return if(Calendar.HOUR_OF_DAY.toInt()<12) "Good morning, Kotlin" else "Good night, Kotlin"
}
