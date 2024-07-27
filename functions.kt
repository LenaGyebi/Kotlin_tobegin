import kotlin.math.PI

fun circleArea(radius: Int, PI: Double = 3.14): Double {
    return(PI * radius * radius)
}
fun main() {
    println(circleArea(2))
}