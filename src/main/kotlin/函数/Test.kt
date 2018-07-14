package 函数


/**
 * 实现函数类型接口
 */
class IntTransformer : (Int) -> Int {
    override fun invoke(p1: Int): Int {
        return p1
    }
}

/**
 * 顶层函数,不用像Java一样声明在类里面
 */
fun foo(bar: Int = 0, baz: Int = 1, qux: () -> Unit) {
    println("bar = $bar, baz= $baz")
    qux()
}

/**
 * 可变数量参数
 */
fun foo(vararg strings: String): String {
    return strings.joinToString { it }
}

fun main(args: Array<String>) {
    var i = { x: Int, y: Int -> x + y }
    println(i(3, 5))

    var j: (Int, Int) -> Int = { x, y -> x + y }
    println(j(4, 5))

    println()

    // lambda表达式可以从括号外传入
    foo(2) {
        println("hello")
    }

    // 命名参数，当有大量参数时提高可读性
    foo(bar = 3, baz = 4, qux = {
        println("world")
    })

    println()

    println(foo("1", "2", "3"))
}
