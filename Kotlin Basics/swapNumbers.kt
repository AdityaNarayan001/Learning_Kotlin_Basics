fun main(){
    print("Enter first number: ")
    var num1 = readLine()!!.toInt()
    print("Enter second number: ")
    var num2  = readLine()!!.toInt()

    val temp = num1
    num1 = num2
    num2 = temp

    print("Swaped Numbers are ---> Number1: $num1, Number2: $num2")

}