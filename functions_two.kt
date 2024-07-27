import kotlin.math.PI

fun circleArea(radius: Int, PI: Double = 3.14) = PI * radius * radius

fun main() {
    println(circleArea(2))
    lambs()

    repeatN(5){
        println("Hello")
    }
}


//Lambda
fun lambs(){
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val generatorUrls: (String) -> String = { actions -> "$prefix/$id/$actions"}
    val urls = actions.map(generatorUrls)
    println(urls)
}

fun repeatN(n: Int, action:() -> Unit){
    for(i in 1..n){
        action()
    }
}

