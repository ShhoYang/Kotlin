package method

fun main(args: Array<String>) {
    var i = { x: Int, y: Int -> x + y }
    println(i(3, 5))

    var j: (Int, Int) -> Int = { x, y -> x + y }
    println(j(4,5))
}
