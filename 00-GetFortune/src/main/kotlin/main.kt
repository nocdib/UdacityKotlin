import com.fasterxml.jackson.databind.JsonNode
import okhttp3.OkHttpClient
import okhttp3.Request
import okio.IOException
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

fun main(args: Array<String>) {
   var exit: Boolean = false
   // Keep returning fortunes until the user enters 'q' to quit
   while(!exit) {
      println("\n${getFortuneCookie()}")
      print("\nAny key for another fortune or 'q' to exit: ")
      // Get keyboard input
      var userInput:String = readLine()!!
      exit = userInput.equals("q", ignoreCase = true)
   }
}

fun getFortuneCookie(): String {
   val client = OkHttpClient()
   val mapper = jacksonObjectMapper()
   // Send GET request to the fortune API
   val request = Request.Builder()
      .url("http://yerkee.com/api/fortune")
      .build()
   // Parse a successful response for the fortune field and print it with its whitespace formatting
   client.newCall(request).execute().use { response ->
      if (!response.isSuccessful) throw IOException("Unexpected code $response")
      val fortune: JsonNode = mapper.readTree(response.body!!.string())
      return fortune["fortune"].asText()
   }
}