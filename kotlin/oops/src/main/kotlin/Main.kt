fun main() {
    var car1 = Car()
    car1.name="Tesla"
    car1.model="S plaid"
    car1.doors=4
    car1.color = "red"

    println("Name = ${car1.name}, model= ${car1.model}")
    car1.move()

    var a1= Animal("goat","black")
    val user = User("suman","sahoo",22)
    val strudent = Student("suman")
}
// a simple class
class Car{
    var name=""
    var model=""
    var color=""
    var doors=0

    fun move() {
        println("the car is moving")
    }
}

// using a constructor
//class Animal(name: String, color: String){
//    var name=name
//    var color = color
//}
   //can also be done as below
class Animal(var name: String,color:String){
    var color = color.trim()
}

//use of an initializer block
