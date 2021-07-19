

fun main(){

    println("CONTINUE EXAMPLE")
    for(numbers:Int in 1..10){
        if(numbers==5){
            continue    //continue tells to leave the ahead process and moves compiler to iterate the current loop
        }

        println(numbers)
    }

    println("BREAK EXAMPLE")
    for(numbers:Int in 1..10){
        if(numbers==5){
            break    //break moves you out of the loop
        }

        println(numbers)
    }
    println("END")
//break can be used to break inner as well as external loop
//below is internal loop break
    for(numbers:Int in 1..3){
        println("nums -> $numbers")
        for(i in 1..5){
            println("i is -> $i")
            if(i==3){
                break
            }
        }
    }
//below is external loop break.......**imp**............and *********NEW**************
    loop@ for(numbers:Int in 1..3){
        println("nums -> $numbers")
        for(i in 1..5){
            println("i is -> $i")
            if(i==3){
                break@loop
            }
        }
    }
    println("out of external loop")
//learn RETURN also
}