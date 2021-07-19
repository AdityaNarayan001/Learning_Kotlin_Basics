fun main(){
    var id:String
    val allData = HashMap<String,ArrayList<String>>()
    while (true){
        print("Enter your Name ->")
        id = readLine()!!.toString()
        val name = ArrayList<String>()
        do {
            print("Enter your Pet(type quit to exit) ->")
            val inp = readLine()!!.toString()

            if (inp != "quit") {
                name.add(inp)
                allData[id] = name
            }
        }while (inp != "quit")

        print("Want to add more entry type Y for yes  N for no ->")
        val gate = readLine()!!.toString().toUpperCase()
        if (gate == "N"){
            break
        }
        else{
            continue
        }
    }
    for (i in 1..10){
        print("Enter your ID to get info ->")
        val entry = readLine()!!.toString()
        println("ID :- $entry")
        println("Pet :- ${allData[entry]}")
    }

}