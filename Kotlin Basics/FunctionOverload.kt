/*
Function overloading is having more than one function with SAME NAME but different number of PARAMETERS.
 */
fun add(num1:Int, num2:Int):Int{
    return num1 + num2
}

fun add(num1:Int, num2:Int, num3:Int):Int{
    return num1 + num2 + num3
}

fun add(num1:Int, num2:Int, num3:Int, num4:Int):Int{
    return num1 + num2 + num3 + num4
}

fun main(){
    println("Ans:- " + add(2, 3))
    println("Ans:- " + add(3,5,7,9))
    println("Ans:- " + add(5,7,1))
}