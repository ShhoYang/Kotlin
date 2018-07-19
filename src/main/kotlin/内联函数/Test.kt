package 内联函数

import javax.swing.tree.TreeNode

inline fun <E> Iterable<E>.string(transform: (E) -> String = { it.toString() }) = map { transform(it) }

inline fun foo(crossinline f: () -> Unit) {
    val r = object : Runnable {
        // 在内联函数的局部对象和嵌套函数中调用lambda表达式,
        // 要用crossinline,并且lambda不能控制流程
        override fun run() = f()

    }
}

fun hasZeros(nums: List<Int>): Boolean {
    nums.forEach {
        if (it == 0) {
            return true
        }
    }

    return false
}

inline fun <reified T> membersOf() = T::class.members

fun main(args: Array<String>) {
    println(listOf("1", "2", "3").toString())
    println(listOf("1", "2", "3").string())
    println(listOf("1", "2", "3").string({ "($it)" }))

    println()
    foo {
        for (i in 1..10) {
            if (i == 5) {
                // 如果foo()为内联函数可以使用裸return,否者要使用标签
                //return
            }

            println(i)
        }
    }

    var nums = listOf(2, 3, 4, 0)
    println(hasZeros(nums))

    println(membersOf<StringBuilder>())
}


