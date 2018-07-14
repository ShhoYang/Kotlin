package 函数

import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte1.other

/**
 * 可以自动推断出函数类型（Int）-> Int
 */
val f = { x: Int -> x * x }

fun main(args: Array<String>) {
    // 函数类型的值调用函数方式1
    println(f(5))

    println()

    // 函数类型的值调用函数方式2
    println(f.invoke(6))

    println()

    var intPlus: (Int, Int) -> Int = Int::plus
    var stringPlus: String.(String) -> String = String::plus
    var stringLength: String.() -> Int = String::length

    println(intPlus(2, 3))
    println(intPlus.invoke(4, 5))

    println("hello ".stringPlus("world"))
    // 如果函数值具有接收者类型,可将该类型的实例作为第一个参数传入
    println(stringPlus("hello ", "world"))

    println(stringLength("hello world"))
    println("hello world".stringLength())


    var strings = listOf("kotlin", "scale", "python", "java")
    strings.filter { it.contains("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }

    var sum:Int.(Int)->Int={ other -> plus(other)}

    println(2.sum(3))
}