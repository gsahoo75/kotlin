open class Vehicle(val name : String, val color: String){
    open fun move(){
        println("$name is moving")
    }
    fun stop(){
        println("$name stopped")
    }
}



//parameters mentioned
class Cars(name: String, color : String,val engines: Int, val doors: Int) : Vehicle(name,color)



class Plane(name:String, color: String,val engines: Int, val doors: Int):Vehicle(name,color){
    override fun move() {
//        super.move();
        println("$name is flying")
    }
}


fun main(args: Array<String>){
    val car = Cars("BMW","red",2,4)
    val plane = Plane("Boeing","white",4,4)

    car.move();
    plane.move();
    car.stop();
    plane.stop()
}