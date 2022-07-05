import java.util.*
/*
Create a function that prints a message with the day week, and call this funcion from main()
You may to use when statement to print a string depending on the day

2022-July-04
Linkedin: https://linkedin.com/in/brunorijo
*/

fun main(args: Array<String>){
    println(" - What day is today?")
    dayOfWeek(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
}

fun dayOfWeek(day: Int) {
    when (day){
        1 -> println("Sunday/Domingo")
        2 -> println("Monday/Segunda-feira")
        3 -> println("Tuesday/Terça-feira")
        4 -> println("Wednesday/Quarta-feira")
        5 -> println("Thursday/Quinta-feira")
        6 -> println("Friday/Sexta-feira")
        else -> println("Saturday/Sábado")
    }
}

