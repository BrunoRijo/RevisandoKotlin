/*
Create a program that suggests an activity based on various parameters.
1. Start in a new file with a main function.
2. From main(), create a function, whatShouldIDoToday().
3. Let the function have three parameters.
    mood: a required string parameter
    Weather: a string parameter that defaults to "sunny"
    temperature: an Integer parameter that defaults to 24 (Celsius).
4.Use a when construct to return some activities based on combinations of conditions.
For example:
mood == "happy" && weather == "Sunny" -> "go for a walk"
else -> "Stay home and read."
 */

fun main() {
    whatShoulIDoToday("sad")
    whatShoulIDoToday("sad", "Cloudy", 12)
    whatShoulIDoToday("happy")
    whatShoulIDoToday("happy",temperature = 25)
    whatShoulIDoToday("sad", temperature = 10)
}

fun whatShoulIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24){
    println( when (mood){
        "happy" -> if (weather.equals("Sunny")) "Go for a walk" else "Make a hot chocolatte"
        else -> if (temperature>=24) "Make a orange juice" else "Stay home and read"
    })
}

