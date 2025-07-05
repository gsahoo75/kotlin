import javax.xml.crypto.Data

//singleton pattern is when if you want to have only one instance of the object at any instance of time
class Database private constructor(){
    companion object{
        private var instance: Database? = null;

        fun getInstance():Database?{
            if(instance ==null){
                instance = Database();
            }
            return instance;
        }
    }

}
//using Object keyword
object DB{
    init{
        println("Database created")
    }
}
fun main(args: Array<String>)
{
    val instance1 = Database.getInstance();
    println(instance1);
    val instance2 = Database.getInstance();
    println(instance2);

    println(DB);
    println(DB);
    println(DB);
    println(DB);
    println(DB);
    println(DB);
    println(DB);
}