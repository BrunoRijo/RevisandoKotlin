package Lambdas

class Game {
    var path = mutableListOf<Directions>(Directions.START)
    var north = path.add(Directions.NORTH)
    var south = path.add(Directions.SOUTH)
    var east = path.add(Directions.EAST)
    var west = path.add(Directions.WEST)
    var end  = {
        path.add(Directions.END);
        println("Game Over: ");
        print(path);
        path.clear();
        false }

    fun move(where: () -> Boolean) = where.invoke()

    fun makeMove(argument : String?) {
        if (argument.equals("n")) move({ north })
        else if (argument.equals("s")) move({ south })
        else if (argument.equals("e")) move({ east })
        else if (argument.equals("w")) move({ west })
        else move(end)
    }

}
