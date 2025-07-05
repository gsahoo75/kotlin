fun main() {
    // all variables by default are non nullable
//    val text: String = null //cant do this

    // if i want a null type
    val text:String? = "null" //now text is nullable
//    println(text)
//    println(text.length)//this is error
    if(text!=null){
        println(text.length)
    }
    // or we can also do the following
    println(text?.length) //an equivalent way to check if not null
    println(text!!.length)//if its null then throw the error else just print the length

    //elvis operator
    val text2=text?:"it is null"
    //if its null assign the default value
    println(text2)
}

