import java.util.*

/* we use arrayList when we focus on speed and not on storage and we use Linked list when we are focused on storage not on speed.
Because ArrayList creates double space than required but linked list creates only required storage
 */


// in array list we don't need to define the size of the array.
//ArrayList is dynamic it duplicates its values and its size doubles automatically
fun main(){

    /* println("Pets App")
    print("How many pets you have :- ")
    val numPets = readLine()!!.toInt()


    val pet = LinkedList<String>()
    for(i in 0 until numPets){
        print("Your Pet -> ")
        pet.add(readLine()!!.toString())
    }
    /* println("Your pets are :-")      //other method to do the same that code line 21 to 24 is doing
    for(i in 0..pet.size){
        println("Pet $i :- ${pet[i]}")
    } */

    println("Your pets are :-")
    for(i in pet){
        println("Pet :- $i")
    } */


    // WRITING THE ABOVE CODE USING DO WHILE LOOP

    println("Pet App using Do While LOOP")

    val petList = LinkedList<String>()
    do {
        print("Enter Pet Name :- quit to exit -> ")
        val NameOfPet = readLine()!!.toString()
        if (NameOfPet != "quit")
            petList.add(NameOfPet)
    }while (NameOfPet != "quit")

    for (i in petList){
        println("Pet :- $i")

    }
    if (petList.contains("dog")){
        println("We also loves DOGS :)")
    }



}