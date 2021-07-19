// A different and interesting stuff

fun main(){
    print("Order your food:- ")
    val foodID = readLine()!!.toInt()

    when(foodID){
        1 ->{
            println("You get Burger")
        }
        2 ->{
            println("You get Fries")
        }
        else ->{
            println("You did'nt order anything")
        }
    }
}