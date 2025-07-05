fun main() {
    println("Hello World!")
    wish("Suman")
    val hasInternetConnection=true
    if(hasInternetConnection){
        getData("hi")
    }else{
        showMessage()
    }
    println(getMax(8,5))
}
fun wish(name:String, age:Int=25){
    //name="Gobinda"//cant be changed since they are val
    println("Hello $name, your age is $age")
}

fun getData(data: String){
    println("your data is: $data")
}

fun showMessage(){
    println("there is no internet connection")
}

fun getMax(a:Int , b:Int): Int {
    return if(a>b)a else b
}
//the above can be written in same way
//fun getMax(a:Int, b:Int): Int = if(a>b) a else b


        // function overloading
fun getMax(a:Double, b:Double): Double{
    return if(a>b) a else b
}

        //function
fun sendMessage(name: String, msg:String="nil"){
    println("name = $name and message = $msg")
}

        //var args function
fun sum(vararg numbers: Int):Int{
    var sumOfNumbers=0
    for(element in numbers){
        sumOfNumbers+= element
    }
    numbers.forEach { num->
        println(num) 
    }
    return sumOfNumbers;
}