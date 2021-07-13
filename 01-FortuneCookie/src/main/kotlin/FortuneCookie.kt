import kotlin.random.Random

/*
Lesson 3 Quiz 9. Return a fortune based on the day of the month of the user's birthday.
It runs for 10 iterations or until the 32nd fortune in the list is returned.
*/

fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("Your fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getBirthday() : Int {
    print("\nEnter your birthday (1-31): ")
    return readLine()?.toIntOrNull() ?: 32
}

fun getFortune(birthday: Int): String {
    var fortuneList: List<String> = listOf(
        "(1) A beautiful, smart, and loving person will be coming into your life.",
        "(2) A dubious friend may be an enemy in camouflage.",
        "(3) A faithful friend is a strong defense.",
        "(4) A feather in the hand is better than a bird in the air. (2)",
        "(5) A fresh start will put you on your way.",
        "(6) A friend asks only for your time not your money.",
        "(7) A friend is a present you give yourself.",
        "(8) A gambler not only will lose what he has, but also will lose what he doesn’t have.",
        "(9) A golden egg of opportunity falls into your lap this month.",
        "(10) A good friendship is often more important than a passionate romance.",
        "(11) A good time to finish up old tasks. (2)",
        "(12) A hunch is creativity trying to tell you something.",
        "(13) A lifetime friend shall soon be made.",
        "(14) A lifetime of happiness lies ahead of you.",
        "(15) A light heart carries you through all the hard times.",
        "(16) A new perspective will come with the new year. (2)",
        "(17) A person is never to (sic) old to learn. (2)",
        "(18) A person of words and not deeds is like a garden full of weeds.",
        "(19) A pleasant surprise is waiting for you.",
        "(20) A short pencil is usually better than a long memory any day.",
        "(21) A small donation is call for. It’s the right thing to do.",
        "(22) A smile is your personal welcome mat.",
        "(23) A smooth long journey! Great expectations.",
        "(24) A soft voice may be awfully persuasive.",
        "(25) A truly rich life contains love and art in abundance.",
        "(26) Accept something that you cannot change, and you will feel better.",
        "(27) Adventure can be real happiness.",
        "(28) Advice is like kissing. It costs nothing and is a pleasant thing to do. (2)",
        "(29) Advice, when most needed, is least heeded.",
        "(30) All the effort you are making will ultimately pay off.",
        "(31) All the troubles you have will pass away very quickly.",
        "(XX) Take it easy."
    )

    /*
    If the birthday is during the first week then return an random fortune from 1 to 7.
    If it is on the 28th or the 31st then return a random fortune from 28 to 31.
    If it falls on any other day then return a random fortune from 8 to 27.
    */
    return when(birthday) {
        in 1..7 -> fortuneList.get(Random.nextInt(0,6))
        28,31 -> fortuneList.get(Random.nextInt(27,30))
        in 8..31 -> fortuneList.get(Random.nextInt(7,26))
        else -> fortuneList.get(31)
    }
}
