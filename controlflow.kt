 //when
 fun main(){
    val button = "I"

 println(
     when (button){
         "A" -> println("Yes")
         "B" -> println("No")
         "X" -> println("Menu")
         "Y" -> println("Nothing")
         else -> println("There is no such button")
     }
 )


 //while 
 var pizzaSlices = 0
 while(pizzaSlices < 8){
    println("There's only $pizzaSlices slice/s of pizza :(")
    pizzaSlices++
 }
 println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
 }

 //While
 