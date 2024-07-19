//Lists
fun main() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)


    //set
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED


   //map
   val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2

    
    println("The total number of items are ${greenNumbers.count()+redNumbers.count()}")
    println("Support for $requested: $isSupported")
    println("$n is spelt as '${number2word[n]}'")
 
}

