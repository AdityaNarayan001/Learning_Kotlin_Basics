/*
<
>
==     equal to
>=
<=
!=    not equal to

AND GATE  (&&)
   True && True = True
   True && False = False
   False && True = False
   False && False = False

OR GATE  (||)
   True || True = True
   True || False = True
   False || True = True
   False || False = False

NOT GATE  (!)
  True = False
  False = True
 */

fun main(){
    println(2>3)
    println(2<3)
    println(2==2)
    println(2>=1)
    println(2<=3)
    println(2!=2)
    val num = 10
    println(num>=1 && num<=10)
    println(num>=1 || num<=10)
    println(!(num==10))
    println(num in 1..10) //another way for println(num>=1 $$ num<=10)...it basically is range from 1 to 10


}