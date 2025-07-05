fun main() {
//    arrays
    val names: Array<String> = arrayOf("John","suman","gobinda")
//    val names=arrayOf("John","suman","gobinda")
    println(names[2])
    for(name in  names){
        println(name)
    }
    println("the size of the array is {${names.size}}")
    
}