fun main(){
    val isMarried = true
    val GPA = 3.8
//some easy methods for using if else
    val isQualified = if(isMarried && GPA >= 3.8) 1 else 0

    println(isQualified)

    //using when()

    val isGood = when(GPA){
        4.0 -> true
        else -> false
    }
    println(isGood)
}