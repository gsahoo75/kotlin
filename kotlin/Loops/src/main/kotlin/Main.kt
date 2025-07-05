fun main() {
//    for(i in 1..10){
//        println(i)
//    }
//    for(i in 1 until 10){
//        println(i)
//    }
//    for(i in 1..<10){
//        println(i)
//    }
//    for(i in 1..<10 step 2){
//        println(i)
//    }

//    to loop backward
//    for(i in 10 downTo 1){
//        println(i)
//    }


    //while loop
    var number =0
    while(number<10){
        println(number)
        number++
    }

    do{
        println(number)
        number++
    }while(number<10)


    //label
    outer@ while(number<5){
        number++;
        println(number)
        var i=0
        while(i<5){
            if(i==0)break@outer
            i++
            println("bend $i")
        }
    }
}
