import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

fun main(){
    var id:Int

    var allData = HashMap<Int,ArrayList<String>>()
    while (true){
        print("Enter your ID ->")
        id = readLine()!!.toInt()
        print("Enter your Name ->")
        val inp = readLine()!!.toString()
        var name = ArrayList<String>()
        name.add(inp)
        allData[id] = name
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
        val entry = readLine()!!.toInt()
        println("ID :- $entry")
        println("Name :- ${allData[entry]}")
    }

}