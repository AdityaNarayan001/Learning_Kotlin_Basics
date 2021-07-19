var name:String? = null  // This is how we make Global Variable

fun info(){
    name = "Welcome $name"
    println("$name")
}

fun main(){
    name = "Aditya"
    println("$name")
    info()           // in between also we can call a function to jump on that and after its completion we re-continue from where we left
    println("$name")
}
