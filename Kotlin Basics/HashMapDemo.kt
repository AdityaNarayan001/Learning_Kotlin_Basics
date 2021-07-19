//HashMap is like Array that stores data in Key and Value.....AHshMap(K, V)
// The key in HashMap should be unique.

fun main(){
    val list = ArrayList<String>()
    print("ID 1.1, Enter your Name : ")
    val inpList = readLine()!!.toString()
   list.add(inpList)

    val userList = HashMap<Double,String>()  // Here we set key as Double and value as string
    userList[1.1] = list.toString()               // This is how we store hashmap values
    userList[1.2] = "Zed"
    userList[1.3] = "Harry"

    for(key in userList.keys)
    println("User ID $key :- ${userList[key]}")   //Hashamp is not Ordered


}