import java.util.*
fun main() {
    //use of when statement

    var alarm = 12
    val scanner = Scanner(System.`in`)
    alarm = scanner.nextInt()
//    its kind of like switch statement
    when(alarm){
        12 -> println("the time is $alarm")
//        TODO
        in 1..10 -> println("the number is in the range")
        7 -> {
            println("the time is $alarm")
//            you can use it when you have to do multiple statements
        }
        14 -> println("the time is $alarm")
        else -> println("the time is $alarm")
    }

//    when can be used as to assign values
    val name="suman"
    val text = when (name) {
        "suman" -> "my name"
        "gobinda" -> "my name as well"
        else -> "other name"
    }
    println(text)

    //another way to use when
    val ntext= when{
        true -> "suman"
        else -> "gobinda"
    }
    println(ntext)
}