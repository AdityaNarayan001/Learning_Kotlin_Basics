fun  main(){
    println("========For Loop========")
    for(i in 1..10 step 2) println("Counter $i")
//in while first code is checked then code is run
    println("========While Loop========")

    var i = 1
    while(i<=10){
        println("Counter $i")
        i += 2
    }
//in do while code is run first then it is checked
    println("========Do While Loop========")
    i = 1
    do{
        println("Counter $i")
        i +=2
    }while (i<=10)

}