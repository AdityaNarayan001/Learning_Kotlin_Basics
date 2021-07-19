fun main(){

    for(i in 1..5){
        print("Enter you name User $i :- ")
        val name = readLine()!!.toString()
        print("Enter your Age :- ")
        val age = readLine()!!.toInt()
        print("Your Pet:- ")
        var pet_info:String = ""

        for(pets in 1..3){
            pet_info = pet_info + readLine()!!.toString() + ","

        }
        println("====User Info====")
        println("Name :- $name")
        println("Age :- $age")
        println("Pet :- $pet_info")
        println("--------------------")
    }

}