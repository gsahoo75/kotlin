//this is like abstract class in java


//enum class Test{
//    SUCCESS,
//    FAILED//cant have property
//}

sealed class Result(val message: String) {
    fun showMessage(){
        println("Result: $message")
    }
    class Success(message: String) : Result(message)
    class Error(message: String) : Result(message)
}
fun getData(result: Result){
    when(result){
        is Result.Error -> result.showMessage()
        is Result.Success -> result.showMessage()
    }
}

fun main(args: Array<String>)
{
    val success = Result.Success("success!!!")
    val error = Result.Error("FAILED!!");

    getData(error);
    getData(success);
}