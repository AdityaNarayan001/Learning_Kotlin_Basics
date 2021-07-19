/*
mutable :- You can update , add more
im-mutable :- You cannot update , cannot add more
 */

/*
HashMap is old Java Style
hashmapOf is kotlin style
but both are equally same
 */

fun main(){
    // 1 - List

    //im-mutable list
    var listImmutable = listOf("Jena","Laya")
    //listImmutable[0] = "Henry"
    for (names in listImmutable){
        println(names)
    }

    //Mutable list
    var listMutable = mutableListOf("Jena","Laya","")
    listMutable[2] = "Henry"
    for (names in listMutable){
        println(names)
    }

    // 2 - HashMap
    /*
    HashMap stores multiple values for  a key.
    Map stores single value for a key.
    more less they are similar
    */

    val userNamesImm = mapOf(1 to "Henry", 2 to "Jena")
    for (id in 1..2){
        println("Users[$id]:- ${userNamesImm[id]}")
    }

    var userNamesMutable = mutableMapOf(1 to "Laya", 2 to "Ben")
    for (idm in 1..2){
        println("Users[$idm] :- ${userNamesMutable[idm]}")
    }


}