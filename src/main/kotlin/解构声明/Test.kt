package 解构声明

/**
 * 数据类自动声明componentN()函数
 */
data class Person(var name: String = "",var alias: String = "",var address: String = "")

fun main(args: Array<String>) {
    var person = Person("yangshihao", "rige", "luoyang")
    val (name, address) = person
    println(name)

    // 按顺序的
    println(address)
}