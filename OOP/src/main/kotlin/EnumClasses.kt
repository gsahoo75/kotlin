//when you want to create fixed set of values or constants
enum class Direction(var mag:Int){
    //These are also instance or objects of Direction
    NORTH(0),
    SOUTH(0),
    EAST(0),
    WEST(0)
}


fun main(args: Array<String>){
//    println(Direction.WEST)
//    println(Direction.EAST)
//    println(Direction.NORTH)
//    println(Direction.SOUTH)

    for(dir in Direction.values()){
        println(dir);
    }
}