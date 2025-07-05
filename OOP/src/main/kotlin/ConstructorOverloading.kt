class ConstructorOverloading( var name:String,var age:Int) {
    // we can use getter and setter also
    constructor(name:String ) : this(name,0) {
        println("secondary constructor 1 is running");
    }
    constructor(age: Int) : this("unknown",age){
        println("secondary constructor 2 is running");
    }
    init {
        println("init is running")
    }

}



class User(var firstName: String, var lastName: String, var age: Int){
    //to initialise later
    lateinit var favMovie: String

}

fun main() {

//    val ob1 = ConstructorOverloading("suman", 19);
//    val ob2 = ConstructorOverloading("suman");
//    val ob3 = ConstructorOverloading(24);


//    val user1 = User("Gobinda","sahoo",23);
//    user1.favMovie = "Thriller";

}

