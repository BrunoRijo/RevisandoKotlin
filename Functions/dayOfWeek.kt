import java.util.*
/*
Create a function that prints a message with the day week, and call this funcion from main()
You may to use when statement to print a string depending on the day

2022-July-04
Linkedin: https://linkedin.com/in/brunorijo
*/

fun main(args: Array<String>){
    println(" - What day is today?")
    println("- Today is ${dayOfWeek()}")
}

fun dayOfWeek() : String {
    return when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
        1 -> "Sunday/Domingo"
        2 -> "Monday/Segunda-feira"
        3 -> "Tuesday/Terça-feira"
        4 -> "Wednesday/Quarta-feira"
        5 -> "Thursday/Quinta-feira"
        6 -> "Friday/Sexta-feira"
        else -> "Saturday/Sábado"
    }
}

