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


 //fizzbuzz

for (number in 1..100 ){
    println(
        when{
            number % 15 == 0 -> "Fizzbuzz"
            number % 5 == 0 -> "fizz"
            number % 3 == 0-> "buzz"
            else -> "$number"
        }
    )
}

//Exercise 4
val words = listOf("dinosaur", "limousine", "magazine", "language")
for (word in words){
    if(word.startsWith("l")){
        println("$word")
    }
 }



}
 