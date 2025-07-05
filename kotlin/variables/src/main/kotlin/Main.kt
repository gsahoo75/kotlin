import kotlin.math.max

fun main() {

//    println("Hello World!")
    var userName: String = "Suman" //var can be reassigned
    val name:String = "gobi"
//    name="suman"//val can not be reassigned

    println("hello $userName")
    var age: Int = 23
    println("age is $age")

    //Byte Short Int Long
    val maxIntegerValue: Int = Int.MAX_VALUE
    val minIntegerValue: Int = Int.MIN_VALUE
    val n1: Int = 5
    val n2: Int = 0
    val res=if(n1<0 || n2<0) "this is text 1" else 5
    println(res)
}