package 操作符重载

data class Point(var x: Int, var y: Int)

operator fun Point.unaryMinus() = Point(++x, ++y)

fun main(args: Array<String>) {
    val point = Point(10, 20)

    val (x, y) = -point

    println("x = $x, y = $y")
}
