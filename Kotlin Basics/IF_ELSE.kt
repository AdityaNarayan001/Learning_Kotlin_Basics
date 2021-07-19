// 1.If
// 2.If..else
// 3.If..else if ...else

fun main(){
    print("Enter your age:- ")
    val age = readLine()!!.toInt()

    if(age>18){
        println("You are allowed to apply for Job")
    }
    else if(age<18){
        println("You are not eligible to apply for Job")
    }
    else{
        println("We didnt get you")
    }
}