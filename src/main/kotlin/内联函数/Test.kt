package 内联函数

inline fun <E> Iterable<E>.string(transform: (E) -> String = { it.toString() }) = map { transform(it) }

fun main(args: Array<String>) {
    println(listOf("1", "2", "3").string())
    println(listOf("1", "2", "3").string({ "($it)" }))
}
