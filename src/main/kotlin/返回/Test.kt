package 返回

import 函数.f

class Person {
    var name: String? = null
}

fun main(args: Array<String>) {
    var person = Person()
    person.name = "123"
    var name = person.name ?: return
    //println(name)

    //foo()
    foo1()
    //foo2()
    //foo3()
    //foo4()
}

/**
 *  @标签,返回到指定循环点
 */
fun foo() {
    loop@ for (i in 1..10) {
        for (j in 10..20) {
            println("$i--$j")
            if (j == 13) {
                break@loop
            }
        }
    }
    println("foo")
}


fun foo1() {
    listOf(1, 2, 3, 4).forEach list@{
        if (it == 3) {
            return@list
        }
        println(it)
    }

    println("foo1")
}

/**
 * 隐式标签，
 * lambda的return将从包含它的函数返回
 */
fun foo2() {
    listOf(1, 2, 3, 4).forEach {
        if (it == 3) {
            return@forEach
        }
        println(it)
    }

    println("foo2")
}

/**
 * 匿名函数代替Lambda,从自身的函数返回
 */
fun foo3() {
    listOf(1, 2, 3, 4).forEach(
            fun(value: Int) {
                if (value == 3) {
                    return
                }
                println(value)
            }
    )

    println("foo3")
}

/**
 * 返回局部
 */
fun foo4() {
    run loop@{
        listOf(1, 2, 3, 4).forEach(
                fun(value: Int) {
                    if (value == 3) {
                        return@loop
                    }
                    println(value)
                }
        )
    }

    println("foo4")
}