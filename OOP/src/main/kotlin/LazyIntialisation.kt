//when object creation is expensive

class Use(var fn:String,var ln:String){
    init{
        println("User: $fn was created")
    }

    override fun toString(): String {
        return "[firstname = $fn, lastname = $ln]";
    }
}


fun main(args: Array<String>){
    val user1 = Use("Gobinda","sahoo")
    val user2 by lazy {
        Use("Suman","sahoo");
    }
    println(user1);
    println(user2);//user2 is not created until the user2 is not used
}