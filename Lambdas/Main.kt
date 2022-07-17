package Lambdas

fun main() {
    var game = Game()
    /*
    game.north
    game.south
    game.east
    game.west
    game.end
    */
    
    while (true){
        print("Enter a direction: n/s/e/w:")
        game.makeMove(readLine())
    }
}
