package 函数

/**
 * 高阶函数
 */
fun <T, R> Collection<T>.flod(init: R, combine: (sum: R, nextData: T) -> R): R {
    var i: R = init
    for (t in this) {
        i = combine(i, t)
    }

    return i
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5)

    // lambda表达式参数类型是可选的
    var result = list.fold(1, { x, y -> x * y })
    println(result)

    val  result2 = list.flod(2,Int::times)
    println(result2)

}