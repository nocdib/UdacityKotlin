fun main(args: Array<String>){
    /*
    Create a lambda function that takes and integer argument and simulates the roll of a dice.
    Save the lambda to a variable and invoke it.
     */

    val rollDice = { sides: Int -> when(sides) { 0 -> 0 else -> (1..sides).random() } }
    println(rollDice(3))
    println(rollDice(5))
    println("--------------")
    // Same lambda but in function type notation
    val rollDice2: (Int) -> Int = { sides: Int -> when(sides) { 0 -> 0 else -> (1..sides).random() } }
    println(rollDice2(3))
    println(rollDice2(5))
    println("--------------")
    // Use gameplay()
    gamePlay(3, rollDice)
    gamePlay(5, rollDice2)
}

fun gamePlay(sides: Int, func: (Int) -> Int) {
    println(func(sides))
}