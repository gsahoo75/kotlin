fun main(args: Array<String>){
    val names:Array<String> = arrayOf("suman","gobinda","sahoo","unknown");
    println("the firist name is ${names[0]}");
    for(name in names)println(name);
    println("the size of the array is ${names.size}");
    val numbers = arrayOf(4,5,6,7,89,"suman",'a',"gobinda",'c');
    for(i in numbers){
        if(i is Int){
            println(i);
        }
    }
}