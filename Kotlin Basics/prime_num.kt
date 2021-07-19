// verify if the number is prime or not

//  WORK ON END FUNCTION

fun main(){

    print("Press RUN to start engine to verify prime number:- ")
    val startInp = readLine()!!

    while(startInp.toUpperCase() == "RUN"){

        println("Type SHUT to quit the programme.")
        print("Enter a number to verify if it is prime or not ?")
        val inpName =  readLine()!!

        if(inpName.toUpperCase() == "SHUT") {
            break
        } else if(inpName.toInt() == 1) {
            println("It is a Prime Number")
        } else if(inpName.toInt() == 2) {
            println("It is a Prime Number")
        } else if(inpName.toInt() == 3) {
            println("It is a Prime Number")
        } else if(inpName.toInt() == 5) {
            println("It is a Prime Number")
        } else if(inpName.toInt() == 7) {
            println("It is a Prime Number")
        } else if(inpName.toInt() % 2 == 0) {
            println("It is not a Prime Number")
        } else if(inpName.toInt() % 3 == 0) {
            println("It is not a Prime Number")
        } else if(inpName.toInt() % 5 == 0) {
            println("It is not a Prime Number")
        } else if(inpName.toInt() % 7 == 0) {
            println("It is not a Prime Number")
        } else {
            println("It is Prime Number")
        }

    }
    println("Thank you :) ")


}