import kotlin.random.Random

/*
1. Create a lambda and assign it to rollDice, which returns a dice roll (number between 1 and 12).
2. Extend the lambda to take an argument indicating the number of sides of the dice used for the roll.
3. If you haven't done so, fix the lambda to return 0 if the number of sides passed in is 0.
4. Create a new variable, rollDice2, for this same lambda using the function type notation.
5.Create a function gamePlay() that takes a roll of the dice as an argument and prints it out.
6. Pass your rollDice2 function as an argument to gamePlay() to generate a dice roll every time 
gamePlay() is called.
*/

fun main() {

    val rollDice = { Random.nextInt(0,12)}
    val rollDice2 : (Int) -> Int = { jogadas -> Random.nextInt(0,jogadas)}
    gamePlay(rollDice2)
}

fun gamePlay(operation : (Int)-> Int){
    println("Number of sides: ")
    var sides : Int? =  readLine()?.toIntOrNull()
    println(operation(sides!!))
}

