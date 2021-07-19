package com.car.maintain
//package name tell that this file belongs to this package
//Name of class should be same as file name
//**WE CAN MAKE A CLASS WITH PARAMETERS AND WITHOUT PARAMETERS
//when setting no parameter just  write class name{..} and continue
//when setting parameter write class name(...){...}
//CLASS CONSTRUCTOR CAN BE USED TO CREATE MULTIPLE PARAMETERS FOR A CLASS
//OPEN so that it can be inherited bt Truck class
open class Caroption_classConstructor(){  // we use class constructor to not take all the parameters once we do it so that we can do other works before taking any parameter
    //THIS DOES IN FUNCTION LIKE WHEN WE HAVE NEW CAR SO IT HAS NO OWNER SO THAT PLACE CAN GO BLANK.....****
    var type:String? = null
    var model:Int? = null
    var price:Double? = null
    var milesDrive:Int? = null
    var owner:String? = null
    constructor( type:String, model:Int, price:Double, milesDrive:Int, owner:String):this(){ //:this() is referring to class with()
        this.type = type    //THIS IS USED TO SHOW THAT CLASS TYPE IS SAME AS CONSTRUCTOR TYPE....showing both are same
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner = owner
    }
    constructor( type:String, model:Int, price:Double, milesDrive:Int):this(){  //:this() is referring to class with()
        this.type = type    //THIS IS USED TO SHOW THAT CLASS TYPE IS SAME AS CONSTRUCTOR TYPE....showing both are same
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
    }

    //we can also create fun in a class
    fun getCarPrice():Double{
        return price!!-(milesDrive!!.toDouble()*10) //putting !! makes null value acceptable
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
        180)

    car2.type = "Mercedes"     //We can also update like we changed Audi to Mercedes in car2 object

    println(car2.type)
    println(car2.owner)
    println(car2.getCarPrice())

}