/*
Any user created fun should be above main() fun so that it is read by the system
main() is the function that ignites automatically
Other user created functions run when they are called
 */
//Using Return in Functions

fun multiNum(a:Int,b:Int):Int{ // here we have used to return and its data type is also specified
    return a*b
}

//Other methods
fun addNumb(x:Int=0,y:Int=0){ //the =0 means that if no value of x and y is passed then the value will be taken as 0 for x and y
    val sum = x+y
    println("Sum = $sum")
}

//in a function we take any data type like array , list etc as argument
fun display(vararg name:String){ //********* VARARG IS VARIABLE ARGUMENT ***********
    for (user in name){
        println(user)
    }
}

//one more example of VARARG
fun displayNum(vararg number:Int){
    var sum = 0
    for (numbers in number){
        sum += numbers
    }
    println(sum)
}

fun main(){
    //val arraylist = arrayOf("jena","dora","lily")
    //display(*arraylist)
    //other way of doing above commented stuff
    display(name = arrayOf("jena","dora","lily"))

    displayNum(1,2,3,4,90)//we have used vararg so we can use as many value as we want

    addNumb(6,4) //here we used print in the function above so it just did our job

    addNumb(30) //it is not showing error because y is automatically taken as 0

    addNumb(y=10,x=5)//here we specify x and y so now the order of parameter does not matter

    val returnval = multiNum(2,10) //This is how we use return
    println("Multi = $returnval")       // We need to save the returned value in some variable and then print that.
}
