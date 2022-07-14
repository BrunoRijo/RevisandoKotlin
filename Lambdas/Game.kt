package Lambdas

class Game {
    var path = mutableListOf<Directions>(Directions.START)
    var north = path.add(Directions.NORTH)
    var south = path.add(Directions.SOUTH)
    var east = path.add(Directions.EAST)
    var west = path.add(Directions.WEST)
    var end  = end()

    fun end(){
        path.add(Directions.END)
        println("Game Over: ")
        print(path)
        path.clear()
        false
    }

}
