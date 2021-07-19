fun main(){

    print("Enter your Score out of 100:- ")
    val score = readLine()!!.toInt()

   if(score>=90){
       println("A")
   }

    if(score in 80..89){
        println("B")
    }

    if(score in 70..79){
        println("C")
    }

    if(score<70){
        println("FAIL")
    }

    println("End of App")
}