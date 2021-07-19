fun main(){
    println("Simple Calculator")
    print("Enter First number: ")
    val num1 = readLine()!!.toDouble()
    print("Enter Second number: ")
    val num2 = readLine()!!.toDouble()

    val sum = num1 + num2
    println("Sum: $sum")

    val sub = num1 - num2
    println("Sub: $sub")

    val mul = num1 * num2
    println("Mul: $mul")

    val div = num1 / num2
    println("Div: $div")

}