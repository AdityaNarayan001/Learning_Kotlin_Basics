fun main(){
//some line of code is commented
    println("First method to store value in variable")
    val str = "hello , Aditya to Kotlin"
    println(str)
    val words:String
    words = "Hi this is other method to store value by specifying Data Types"
    println(words)
    println()
    //println("Now we will see concatanation")
    println()
    var name = "Aditya"
    val age = 20
    val GPA = 5
    name = "Aditya Narayan"
    println("====== User Info ======")
    println("Name: $name")
    println("Age: $age")
    println("GPA: $GPA")
    println()
    //println("IF WE USE val THEN IT IS READ ONLY AND IT CANNOT BE UPDATED")
    //println("IF WE USE var THEN WE CAN UPDATE OR CHANGE THE VARIABLE VALUE")
    println()
    //println("In the below example the method is to make a variable null and then specifying value")
    var department:String?
    department = null
    department = "CSE"
    println("Department ${department!!}")
}