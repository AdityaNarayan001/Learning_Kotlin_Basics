fun main(){

    print("Enter your Score out of 100:- ")
    val score = readLine()!!.toInt()

    if(score>=90){
        if(score > 94){
            println("A+")
        }
        else{
            println("A")
        }
    }

    else if(score in 80..89){
        if(score > 84){
            println("B+")
        }
        else{
            println("B")
        }
    }

    else if(score in 70..79){
        if(score > 74){
            println("C+")
        }
        else{
            println("C")
        }
    }

    else if(score<70){
        println("FAIL")
    }

    println("End of App")
}