class Car(name: String, model: String, color: String, doors:Int) {
    var name=name;
    var model=model;
    var color=color;
    var doors=doors;

    fun move(){
        println("the $name is moving")
    }

    fun stop(){
        println("the $name stopped");
    }

    override fun toString(): String {
        var string="[name=$name, model = $model, color=$color, doors= $doors]";
        return string;
    }


}

fun main(){
    val car1=Car("Tesla","S plaid","red",4);
    car1.move();
    println(car1);
}