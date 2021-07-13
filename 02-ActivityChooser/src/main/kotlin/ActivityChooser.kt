
fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad", "rainy"))
    println(whatShouldIDoToday("happy", "snowy"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    when(mood.lowercase()) {
        "happy" ->
            return when(weather.lowercase()) {
                "sunny" -> "Go to the beach"
                "snowy" -> "Go play in the snow"
                "rainy" -> "Read a book"
                else -> "Stay home"
            }
        "sad" ->
            return when(weather.lowercase()) {
                "sunny" -> "Go to the beach"
                "snowy" -> "Watch TV"
                "rainy" -> "Go to the gym"
                else -> "Stay home"
            }
        else -> "Stay home"

    }
    return ""
}