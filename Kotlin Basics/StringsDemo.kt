
fun main(){

    val message = "Welcome to New York."
    val name = " Aditya"
    val allmsg = "$name, $message"
    println(allmsg)
    println(allmsg[0])  // here we are selecting the index 0 of allmsg to print
    println(allmsg.toUpperCase())
    println(allmsg.toLowerCase())
    println(name.trim())  //this removes empty space at beginning of name variable...see the output
    println(name)

    val tokens = message.split(" ") //here we put space in " " quotes to break at every single space found
    for (token in tokens){
        if(!token.contains("to") && !token.contains("is")){
        println("token: $token")
        }
    }

}