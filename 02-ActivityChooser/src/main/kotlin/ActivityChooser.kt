/*
Read input from the user and suggest an activity for them to do base on their
mood, the weather, and the outdoor temperature. Makes use of user input,
when-statements, and return-when statements.
 */

val moods: Array<String> = arrayOf("happy", "sad", "angry")
val conditions: Array<String> = arrayOf("sunny", "cloudy", "rainy", "snowy")

fun main(args: Array<String>) {
    // Get the user's mood
    print("\nWhat is your mood today? ")
    var mood: String = readLine().toString()?.trim()
    mood = if (moods.contains(mood.lowercase())) mood.lowercase() else moods.first()
    // Get today's weather
    print("\nWhat is today's weather? ")
    var weather: String = readLine().toString()?.trim()
    weather = if (conditions.contains(weather.lowercase())) weather.lowercase() else conditions.first()
    // Get today's temperature
    print("\nWhat is today's weather? ")
    var temperature: Int = readLine()?.toIntOrNull() ?: 20
    // Decide what to do
    println(whatShouldIDoToday(mood, weather, temperature))

}
fun isHot(temperature: Int) = temperature > 20

fun isCold(temperature: Int) = temperature < 10


fun whatShouldIDoToday(mood: String, weather: String, temperature: Int ): String {
    when(mood) {
        "happy" ->
            return when (weather) {
                "sunny" ->
                    when {
                        isHot(temperature) -> "Go to the beach"
                        isCold(temperature) -> "Go to the gym"
                        else -> "Go to the park"
                    }
                "snowy" -> "Play in the snow"
                "rainy" ->
                    when {
                        isCold(temperature) -> "Go to the gym"
                        else -> "Read a book"
                    }
                else -> "Do nothing"
            }
        "sad" ->
            return when (weather) {
                "sunny" ->
                    when {
                        isHot(temperature) -> "Go to the beach"
                        else -> "Go to the park"
                    }
                "snowy" -> "Go to the gym"
                "rainy" ->
                    when {
                        isHot(temperature) -> "Read a book"
                        else -> "Go to the gym"
                    }
                else -> "Do nothing"
            }
        "angry" ->
            return when (weather) {
                "sunny" ->
                    when {
                        isHot(temperature) -> "Go to the beach"
                        else -> "Go to the park"
                    }
                "snowy" -> "Go to the gym"
                "rainy" ->
                    when {
                        isHot(temperature) -> "Go to the beach"
                        else -> "Go to the park"
                    }
                else -> "Do nothing"
            }
        else -> "Do nothing"
    }
    return "Do nothing"
}