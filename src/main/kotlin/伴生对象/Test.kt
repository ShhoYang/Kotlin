package 伴生对象

fun main(args: Array<String>) {
    val data = Data.Companion.create()
    println(data.s)
}