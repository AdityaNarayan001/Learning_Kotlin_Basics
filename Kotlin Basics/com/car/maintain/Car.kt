package com.car.maintain
//package name tell that this file belongs to this package
//Name of class should be same as file name
//**WE CAN MAKE A CLASS WITH PARAMETERS AND WITHOUT PARAMETERS
//when setting no parameter just  write class name{..} and continue
//when setting parameter write class name(...){...}
class Car(var type:String,
          val model:Int,
          val price:Double,
          val milesDrive:Int,
          val owner:String){

    init {                //when the class Car will be called init{} will be automatically fired up
        println("Object class is created")

    }
    //we can also create fun in a class
    fun getCarPrice():Double{
        return price-(milesDrive.toDouble()*10)
    }
}

fun main(){
    val car1 = Caroption_classConstructor(          //we can create as many objects we want.....(1)
        "BMW",
        2019,
        10000.00,
        150,
        "Aditya")        //here we are storing everything of class Car in var car

    println(car1.type)    //now we an call and print any of these info
    println(car1.owner)
    println(car1.getCarPrice()) //here we are calling a fun in class that is stored in a object car1

    val car2 = Caroption_classConstructor(            //we can create as many objects we want.....(2)
        "AUDI",
        2017,
        10056.00,
        180,
        "Zed")

    car2.type = "Mercedes"     //We can also update like we changed Audi to Mercedes in car2 object

    println(car2.type)
    println(car2.owner)
    println(car2.getCarPrice())

    // WE CAN ALSO USE LISTS TO STORE DATA

    val listOfCars = arrayListOf<Caroption_classConstructor>()   //list of data
    listOfCars.add(Caroption_classConstructor("Kia",2011,645.0,45,"Sam"))
    listOfCars.add(Caroption_classConstructor("TATA",2020,15000.0,0,"james"))

    for (cars in listOfCars){    //iterating cars as object
        println("--------------------------------")
        println(cars.type)
        println(cars.owner)
        println(cars.getCarPrice())
    }
}