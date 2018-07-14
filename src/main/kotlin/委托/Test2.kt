package 委托

import jdk.management.resource.ResourceId
import kotlin.properties.Delegates

/**
 * 属性委托
 */


/**
 * val
 * LazyThreadSafetyMode.NONE 不是线程安全的
 * LazyThreadSafetyMode.PUBLICATION 可以多线程同时执行
 * 默认线程安全,对每个线程可见
 */
val lazyValue: String by lazy(LazyThreadSafetyMode.NONE) {
    println("hello")
    "world"
}

var name: String by Delegates.observable("no name") { property, oldValue, newValue ->
    println("$oldValue -> $newValue")
}

var age: Int by Delegates.vetoable(25) { property, oldValue, newValue ->
    newValue > oldValue
}

/**
 * 把属性储存在映射
 */
class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)

    println()

    name = "first"
    name = "second"

    println()

    println(age)
    age = 26
    println(age)
    age = 24
    //时光不能倒流
    println(age)

    println()

    val user = User(mapOf(
            "name" to "yangshihso",
            "age" to 25))

    println("name = ${user.name}, age = ${user.age}")
}