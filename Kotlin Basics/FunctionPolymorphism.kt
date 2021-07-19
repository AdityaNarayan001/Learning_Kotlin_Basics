// Polymorphisam is a function with same name same number of arguments but different data type of arguments.
 fun showInfo(cardID:Int){
     println("CardID -> $cardID")
 }
fun showInfo(Name:String){
    println("Name -> $Name")
}
//above both function have same name same number of arguments but of different data type
fun main(){
    showInfo("Aditya")  //it auto detects the function with the data type entered
    showInfo(867534)
}