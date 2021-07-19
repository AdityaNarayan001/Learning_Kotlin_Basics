import java.util.*

fun main(){

    println("This programme finds your Age")
    print("Enter your Birth Year:- ")
    val birth_year = readLine()!!.toInt()
    val device_year:Int = Calendar.getInstance().get(Calendar.YEAR) //this we will learn further about import etc
    val age:Int
    age = device_year - birth_year
    println("You are : $age years old")


}
