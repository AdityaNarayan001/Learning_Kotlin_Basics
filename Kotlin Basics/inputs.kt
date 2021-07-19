fun main(){
/* This is a multiline comment
like this
 */
//This is single line comment
    print("Enter Name: ")
    val name:String = readLine()!!.toString()
    print("Enter Age: ")
    val age:Int = readLine()!!.toInt()
    print("Enter GPA: ")
    val gpa:Double = readLine()!!.toDouble()

    println("===== User Info =====")
    println("Name: $name")
    println("Age: $age")
    println("GPA: $gpa")
}