fun main(){

    for(i in 1..5){
        println("hello world $i")
    }
/* step is used to make jump of given numbers and other method */
    for(i in 1..20 step 2) println("Number $i")

    /* running loop in reverse */
    for(i in 20 downTo 1) println("Number $i")

}