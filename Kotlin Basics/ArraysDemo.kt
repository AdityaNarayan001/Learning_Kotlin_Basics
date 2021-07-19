

fun main(){

    println("Pets App")
    print("How many pets you have :- ")
    val num_pets = readLine()!!.toInt()


    val pet:Array<String> = Array(num_pets){""} //we can als manually set array size like 3 or 4 at the place of Array(size = 3)
    for(i in 0..num_pets-1){
        print("Your Pet -> ")
        pet[i] = readLine()!!.toString()
    }
    println("Your pets are :-")
    for(i in 0..num_pets-1){
        println("Pet $i :- ${pet[i]}")
    }


}