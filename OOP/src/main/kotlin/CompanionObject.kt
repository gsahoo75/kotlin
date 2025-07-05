//companion object is used to call the function without creating the object of the class
//its like static class in java
class Calculator {
    companion object{
        fun sum(a : Int, b : Int)=a+b;
    }
}

fun main(args: Array<String>){
//    val calc = Calculator();
    val res = Calculator.sum(5,10);
    println(res);
}



