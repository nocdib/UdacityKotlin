fun main(args: Array<String>) {

    /*

    The directions game using higher order functions

    - Start a new game with a specified map size or with default map size of 4x4.
    - Read the user's input to make a move on the map. If the input is not a valid move then end the game.
    - If the input is valid move then verify that it is within map bounds. If it is then make the move. If it isn't then stay in place and warn the user.
    - Quit the game using CTRL-C

     */

    val game = Game()

    while (true) {
        print("Enter a direction: n/s/e/w: ")
        game.makeMove(readLine())
    }

}